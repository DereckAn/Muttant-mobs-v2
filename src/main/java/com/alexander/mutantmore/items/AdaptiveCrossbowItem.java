package com.alexander.mutantmore.items;

import com.alexander.mutantmore.init.DataComponentInit;
import java.util.function.Consumer;
import net.minecraft.ChatFormatting;
import net.minecraft.advancements.triggers.CriteriaTriggers;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

/**
 * Crossbow that loads from an ammo charge (e.g. the Icicle Ammo Charge) instead of arrows: hold to load one shot from the charge, use again to fire.
 * ponytail: rebuilt on plain Item (CrossbowItem is arrow-based now); mobs can't use it, same as before in practice.
 */
public class AdaptiveCrossbowItem extends Item {
   public AdaptiveCrossbowItem(Item.Properties properties) {
      super(properties);
   }

   @Override
   public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.adaptive_crossbow.desc").withStyle(ChatFormatting.BLUE));
   }

   public static @Nullable AbstractAmmoChargeItem getLoadedAmmo(ItemStack crossbow) {
      Identifier id = crossbow.get(DataComponentInit.LOADED_AMMO);
      return id != null && BuiltInRegistries.ITEM.getValue(id) instanceof AbstractAmmoChargeItem ammo ? ammo : null;
   }

   /** Offhand first, then main hand, then the inventory: an ammo charge with at least one shot. */
   private static ItemStack findAmmo(Player player) {
      for (InteractionHand hand : InteractionHand.values()) {
         ItemStack stack = player.getItemInHand(hand);
         if (stack.getItem() instanceof AbstractAmmoChargeItem && AbstractAmmoChargeItem.getAmmo(stack) > 0) {
            return stack;
         }
      }

      for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
         ItemStack stack = player.getInventory().getItem(i);
         if (stack.getItem() instanceof AbstractAmmoChargeItem && AbstractAmmoChargeItem.getAmmo(stack) > 0) {
            return stack;
         }
      }

      return ItemStack.EMPTY;
   }

   @Override
   public InteractionResult use(Level level, Player player, InteractionHand hand) {
      ItemStack crossbow = player.getItemInHand(hand);
      AbstractAmmoChargeItem loaded = getLoadedAmmo(crossbow);
      if (loaded != null) {
         if (level instanceof ServerLevel serverLevel) {
            shoot(serverLevel, player, hand, crossbow, loaded);
         }

         crossbow.remove(DataComponentInit.LOADED_AMMO);
         return InteractionResult.CONSUME;
      }

      if (!findAmmo(player).isEmpty()) {
         player.startUsingItem(hand);
         return InteractionResult.CONSUME;
      }

      return InteractionResult.FAIL;
   }

   private static int chargeDuration(ItemStack crossbow, LivingEntity user, AbstractAmmoChargeItem ammo) {
      return Math.max(1, net.minecraft.util.Mth.floor(EnchantmentHelper.modifyCrossbowChargingTime(crossbow, user, ammo.getLoadDuration() / 20.0F) * 20.0F));
   }

   private static @Nullable AbstractAmmoChargeItem ammoFor(LivingEntity user) {
      return user instanceof Player player && findAmmo(player).getItem() instanceof AbstractAmmoChargeItem ammo ? ammo : null;
   }

   @Override
   public int getUseDuration(ItemStack stack, LivingEntity user) {
      AbstractAmmoChargeItem ammo = ammoFor(user);
      return ammo == null ? 0 : chargeDuration(stack, user, ammo) + 3;
   }

   @Override
   public ItemUseAnimation getUseAnimation(ItemStack stack) {
      return ItemUseAnimation.CROSSBOW;
   }

   @Override
   public void onUseTick(Level level, LivingEntity user, ItemStack stack, int ticksRemaining) {
      AbstractAmmoChargeItem ammo = ammoFor(user);
      if (level.isClientSide() || ammo == null) {
         return;
      }

      int duration = chargeDuration(stack, user, ammo);
      int used = this.getUseDuration(stack, user) - ticksRemaining;
      if (used == (int)(duration * 0.2F)) {
         level.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.CROSSBOW_LOADING_START.value(), SoundSource.PLAYERS, 0.5F, 1.0F);
      } else if (used == (int)(duration * 0.5F)) {
         level.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.CROSSBOW_LOADING_MIDDLE.value(), SoundSource.PLAYERS, 0.5F, 1.0F);
      }
   }

   @Override
   public boolean releaseUsing(ItemStack crossbow, Level level, LivingEntity user, int remainingTime) {
      if (!(user instanceof Player player) || crossbow.has(DataComponentInit.LOADED_AMMO)) {
         return false;
      }

      ItemStack ammoStack = findAmmo(player);
      if (!(ammoStack.getItem() instanceof AbstractAmmoChargeItem ammo) || this.getUseDuration(crossbow, user) - remainingTime < chargeDuration(crossbow, user, ammo)) {
         return false;
      }

      if (!level.isClientSide()) {
         AbstractAmmoChargeItem.setAmmo(ammoStack, AbstractAmmoChargeItem.getAmmo(ammoStack) - 1);
         crossbow.set(DataComponentInit.LOADED_AMMO, BuiltInRegistries.ITEM.getKey(ammo));
         ammo.playLoadSound(level, user.position(), SoundSource.PLAYERS);
      }

      return true;
   }

   private static void shoot(ServerLevel level, LivingEntity user, InteractionHand hand, ItemStack crossbow, AbstractAmmoChargeItem ammo) {
      int count = EnchantmentHelper.processProjectileCount(level, crossbow, user, 1);
      float[] angles = count > 1 ? new float[]{0.0F, -10.0F, 10.0F} : new float[]{0.0F};
      for (float angle : angles) {
         Projectile projectile = ammo.getProjectile(level, user);
         Vec3 up = user.getUpVector(1.0F);
         Vector3f direction = new Quaternionf().setAngleAxis(angle * (float)(Math.PI / 180.0), up.x, up.y, up.z).transform(user.getViewVector(1.0F).toVector3f());
         projectile.shoot(direction.x(), direction.y(), direction.z(), ammo.getShootPower(), 1.0F);
         projectile.snapTo(projectile.getX(), projectile.getY() - 0.5, projectile.getZ());
         level.addFreshEntity(projectile);
         crossbow.hurtAndBreak(ammo.getDurabilityConsumption(), user, hand);
         ammo.playShootSound(level, user.position(), SoundSource.PLAYERS);
      }

      if (user instanceof ServerPlayer player) {
         CriteriaTriggers.SHOT_CROSSBOW.trigger(player, crossbow);
         player.awardStat(Stats.ITEM_USED.get(crossbow.getItem()));
      }
   }
}
