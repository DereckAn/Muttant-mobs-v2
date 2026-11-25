package com.alexander.mutantmore.items;

import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinRewardsCommonConfig;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

/** Lance; hold use to charge forward (on foot or on a mount) ramming everything in the way. */
public class HoglanceItem extends Item {
   // Direction locked at the start of a charge (was "ChargeRot" NBT on the stack); one map serves client and server players
   private static final Map<Entity, Float> CHARGE_ROT = java.util.Collections.synchronizedMap(new WeakHashMap<>());

   public HoglanceItem(Properties properties) {
      super(properties);
   }

   @Override
   @SuppressWarnings("deprecation")
   public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.desc.abilities").withStyle(ChatFormatting.GRAY));
      tooltip.accept(Component.translatable("mutantmore.hoglance.desc", Component.keybind("key.use")).withStyle(ChatFormatting.BLUE));
   }

   @Override
   public boolean mineBlock(ItemStack stack, Level level, BlockState state, BlockPos pos, LivingEntity owner) {
      if (state.getDestroySpeed(level, pos) != 0.0F) {
         stack.hurtAndBreak(2, owner, EquipmentSlot.MAINHAND);
      }

      return true;
   }

   @Override
   public InteractionResult use(Level level, Player player, InteractionHand hand) {
      ItemStack stack = player.getItemInHand(hand);
      player.startUsingItem(hand);
      CHARGE_ROT.put(player, player.getYHeadRot());
      RageItems.cooldownAndSpendRage(player, stack, MutantHoglinRewardsCommonConfig.lance_charge_cooldown.get());
      stack.hurtAndBreak(MutantHoglinRewardsCommonConfig.lance_charge_durability_consumption.get(), player, hand);
      return InteractionResult.CONSUME;
   }

   @Override
   public void onUseTick(Level level, LivingEntity user, ItemStack stack, int ticksRemaining) {
      super.onUseTick(level, user, stack, ticksRemaining);
      Entity charging = user.isPassenger() && user.getRootVehicle() != null ? user.getRootVehicle() : user;
      Vec3 particlePos = PositionUtils.getOffsetPos(user, 0.0, user.getEyeHeight() - 0.1, 2.0, 0.0F, user.getYHeadRot());
      user.setInvulnerableTime(15);
      level.addParticle(ParticleTypeInit.DASH, particlePos.x, particlePos.y, particlePos.z, 0.0, 0.0, 0.0);
      double speed = charging instanceof LivingEntity living ? living.getAttributeValue(Attributes.MOVEMENT_SPEED) * 7.5 : 0.75;
      charging.setDeltaMovement(PositionUtils.getOffsetMotion(charging, 0.0, 0.0, speed, 0.0F, CHARGE_ROT.getOrDefault(user, user.getYHeadRot())));
      if (level instanceof ServerLevel serverLevel) {
         float damage = ((Number)MutantHoglinRewardsCommonConfig.lance_charge_damage.get()).floatValue() * (charging != user ? 2.0F : 1.0F);
         for (Entity entity : level.getEntities(charging, charging.getBoundingBox())) {
            if (entity != user) {
               entity.needsSync = true;
               entity.setDeltaMovement(entity.getDeltaMovement().add(charging.getDeltaMovement().scale(1.25)));
               if (MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.HOGLANCE_CHARGING_PLAYER_CANT_HURT, user, entity, user, null)) {
                  entity.hurtServer(serverLevel, MMDamageTypes.cantAvoidMobAttack(user.damageSources(), user), damage);
               }
            }
         }
      }
   }

   @Override
   public boolean canDestroyBlock(ItemStack stack, BlockState state, Level level, BlockPos pos, LivingEntity user) {
      return !(user instanceof Player player) || !player.isCreative();
   }

   @Override
   public ItemUseAnimation getUseAnimation(ItemStack stack) {
      return ItemUseAnimation.TOOT_HORN;
   }

   @Override
   public int getUseDuration(ItemStack stack, LivingEntity user) {
      return 15;
   }
}
