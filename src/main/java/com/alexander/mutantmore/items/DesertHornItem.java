package com.alexander.mutantmore.items;

import com.alexander.mutantmore.blocks.QuicksandBlock;
import com.alexander.mutantmore.config.mutant_husk.MutantHuskRewardsCommonConfig;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.particles.AdvancedParticleOption;
import com.alexander.mutantmore.util.MiscUtils;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

/** Blow it: a roar that hurts and throws back nearby mobs, then quicksand forms in a ring around you while you keep blowing. */
public class DesertHornItem extends Item {
   public DesertHornItem(Properties properties) {
      super(properties);
   }

   @Override
   @SuppressWarnings("deprecation")
   public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.desc.abilities").withStyle(ChatFormatting.GRAY));
      tooltip.accept(Component.translatable("mutantmore.desert_horn.desc", Component.keybind("key.use")).withStyle(ChatFormatting.BLUE));
   }

   @Override
   public InteractionResult use(Level level, Player player, InteractionHand hand) {
      player.startUsingItem(hand);
      ShakeCameraEvent.shake(level, 33, 0.02F, player.blockPosition(), 15);
      if (level instanceof ServerLevel serverLevel) {
         this.roar(serverLevel, player);
      }

      AdvancedParticleOption sand = new AdvancedParticleOption(
         ParticleTypeInit.SAND, List.of((float)MiscUtils.sandColourForSandType(MiscUtils.sandStringForPos(level, player.getOnPos())))
      );
      for (int i = 0; i < 200; i++) {
         level.addParticle(
            sand, player.getX(), player.getY(), player.getZ(), player.getRandom().nextGaussian(), player.getRandom().nextFloat() * 0.5, player.getRandom().nextGaussian()
         );
      }

      ItemStack stack = player.getItemInHand(hand);
      player.getCooldowns().addCooldown(stack, MutantHuskRewardsCommonConfig.horn_use_cooldown.get());
      stack.hurtAndBreak(1, player, hand);
      return InteractionResult.CONSUME;
   }

   private void roar(ServerLevel level, Player user) {
      double range = MutantHuskRewardsCommonConfig.horn_damage_range.get();
      float damage = ((Number)MutantHuskRewardsCommonConfig.horn_damage.get()).floatValue();
      for (LivingEntity entity : level.getEntitiesOfClass(LivingEntity.class, user.getBoundingBox().inflate(range, range / 2.0, range), LivingEntity::isAlive)) {
         if (entity == user) {
            continue;
         }

         if (MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.DESERT_HORN_CANT_HURT, user, entity, user, null)) {
            entity.setInvulnerableTime(0);
            entity.hurtServer(level, user.damageSources().mobAttack(user), damage);
         }

         double dx = entity.getX() - user.getX();
         double dz = entity.getZ() - user.getZ();
         double d = Math.max(dx * dx + dz * dz, 0.001);
         entity.push(dx / d * 4.0, 0.2, dz / d * 4.0);
      }
   }

   @Override
   public void onUseTick(Level level, LivingEntity user, ItemStack stack, int ticksRemaining) {
      super.onUseTick(level, user, stack, ticksRemaining);
      if (level.isClientSide() || !MutantHuskRewardsCommonConfig.horn_griefing.get()) {
         return;
      }

      double range = MutantHuskRewardsCommonConfig.horn_quicksand_range.get();
      Block quicksand = MiscUtils.quicksandBlockForSandType(MiscUtils.sandStringForPos(level, user.getOnPos()));
      for (BlockPos pos : BlockPos.betweenClosed(user.getBoundingBox().inflate(range, range / 2.0, range))) {
         if (MiscUtils.distanceToBlockPos(user, pos) >= range / 2.0
            && level.getBlockState(pos).isAir()
            && QuicksandBlock.survivable(quicksand.defaultBlockState(), level, pos)
            && user.getRandom().nextInt(50) == 0) {
            level.setBlockAndUpdate(pos, quicksand.defaultBlockState());
         }
      }
   }

   @Override
   public int getUseDuration(ItemStack stack, LivingEntity user) {
      return 40;
   }

   @Override
   public ItemUseAnimation getUseAnimation(ItemStack stack) {
      return ItemUseAnimation.TOOT_HORN;
   }
}
