package com.alexander.mutantmore.items;

import com.alexander.mutantmore.config.mutant_jungle_zombie.MutantJungleZombieRewardsCommonConfig;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.function.Consumer;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

/** Grab a mob (use on it), drag it in front of you, strangle it with attack while grabbing. Client visuals live in client/JungleZombieArmClient. */
public class MutantJungleZombieArmItem extends Item {
   public static final int GRAB_ANIMATION_LENGTH = 8;
   public static final int RELEASE_ANIMATION_LENGTH = 8;

   public MutantJungleZombieArmItem(Properties properties) {
      super(properties);
   }

   @Override
   @SuppressWarnings("deprecation")
   public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.desc.abilities").withStyle(ChatFormatting.GRAY));
      for (String line : Component.translatable("mutantmore.mutant_jungle_zombie_arm.desc", Component.keybind("key.use"), Component.keybind("key.attack")).getString().split("\n")) {
         tooltip.accept(Component.literal(line).withStyle(ChatFormatting.BLUE));
      }
   }

   @Override
   public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity target, InteractionHand hand) {
      if (!target.isDeadOrDying() && !player.getCooldowns().isOnCooldown(stack)) {
         JungleZombieArmState.of(player).grabbedEntity = target;
         player.startUsingItem(hand);
         stack.hurtAndBreak((Integer)MutantJungleZombieRewardsCommonConfig.arm_grab_durability_consumption.get(), player, hand);
         return InteractionResult.SUCCESS;
      }

      return super.interactLivingEntity(stack, player, target, hand);
   }

   @Override
   public void onUseTick(Level level, LivingEntity user, ItemStack stack, int ticksRemaining) {
      super.onUseTick(level, user, stack, ticksRemaining);
      if (ticksRemaining >= this.getUseDuration(stack, user) - 1) {
         return;
      }

      JungleZombieArmState state = JungleZombieArmState.of(user);
      state.notUsingFor = 1;
      if (!(level instanceof ServerLevel serverLevel)) {
         return;
      }

      Entity entity = state.grabbedEntity;
      if (entity == null || entity.isRemoved() || !entity.isAlive()) {
         user.stopUsingItem();
         return;
      }

      if (ticksRemaining > 2) {
         // ponytail: original quirk kept, Speed XI for 2 ticks keeps you mobile while dragging
         user.addEffect(new MobEffectInstance(MobEffects.SPEED, 2, 10, false, false, false));
      }

      if (state.strangleTicks > 0) {
         entity.hurtServer(serverLevel, MMDamageTypes.strangleAttack(user.damageSources(), user), ((Double)MutantJungleZombieRewardsCommonConfig.arm_strangle_damage.get()).floatValue());
      }

      Vec3 holdPos = PositionUtils.getOffsetPos(user, 0.0, 1.25, user.getAttributeValue(Attributes.ENTITY_INTERACTION_RANGE) / 2.0, user.getXRot(), user.yHeadRot);
      entity.setDeltaMovement(new Vec3(holdPos.x - entity.getX(), holdPos.y - entity.getY(), holdPos.z - entity.getZ()).scale(1.25));
      entity.resetFallDistance();
   }

   @Override
   public void inventoryTick(ItemStack stack, ServerLevel level, Entity owner, @Nullable EquipmentSlot slot) {
      super.inventoryTick(stack, level, owner, slot);
      JungleZombieArmState state = JungleZombieArmState.of(owner);
      if (state.notUsingFor > 0 && --state.notUsingFor <= 0 && owner instanceof Player player) {
         player.getCooldowns().addCooldown(stack, (Integer)MutantJungleZombieRewardsCommonConfig.arm_grab_cooldown.get());
      }

      state.strangleTicks--;
   }

   @Override
   public ItemUseAnimation getUseAnimation(ItemStack stack) {
      return ItemUseAnimation.NONE;
   }

   @Override
   public int getUseDuration(ItemStack stack, LivingEntity user) {
      return (Integer)MutantJungleZombieRewardsCommonConfig.arm_max_grab_duration.get();
   }
}
