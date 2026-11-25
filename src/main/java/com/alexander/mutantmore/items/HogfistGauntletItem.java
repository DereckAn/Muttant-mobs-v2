package com.alexander.mutantmore.items;

import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinRewardsCommonConfig;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import java.util.function.Consumer;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.SwingAnimation;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

/** Gauntlet; use on a block to stomp: damages and bounces grounded mobs around you. */
public class HogfistGauntletItem extends Item {
   public HogfistGauntletItem(Properties properties) {
      super(properties);
   }

   @Override
   @SuppressWarnings("deprecation")
   public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.desc.abilities").withStyle(ChatFormatting.GRAY));
      tooltip.accept(Component.translatable("mutantmore.hogfist_gauntlet.desc", Component.keybind("key.use")).withStyle(ChatFormatting.BLUE));
   }

   @Override
   public boolean mineBlock(ItemStack stack, Level level, BlockState state, BlockPos pos, LivingEntity owner) {
      if (state.getDestroySpeed(level, pos) != 0.0F) {
         stack.hurtAndBreak(1, owner, EquipmentSlot.MAINHAND);
      }

      return true;
   }

   @Override
   public InteractionResult useOn(UseOnContext context) {
      Player player = context.getPlayer();
      if (player == null) {
         return InteractionResult.PASS;
      }

      Level level = context.getLevel();
      InteractionHand hand = context.getHand();
      level.addParticle(ParticleTypeInit.SHOCKWAVE, context.getClickLocation().x, context.getClickLocation().y, context.getClickLocation().z, 0.0, 0.0, 0.0);
      player.swing(hand, SwingAnimation.DEFAULT, true);
      ItemStack stack = player.getItemInHand(hand);
      RageItems.cooldownAndSpendRage(player, stack, MutantHoglinRewardsCommonConfig.gauntlet_stomp_cooldown.get());
      stack.hurtAndBreak(MutantHoglinRewardsCommonConfig.gauntlet_stomp_durability_consumption.get(), player, hand);
      double range = MutantHoglinRewardsCommonConfig.gauntlet_stomp_range.get();
      ShakeCameraEvent.shake(level, 13, 0.15F, player.blockPosition(), (int)range);
      AABB area = player.getBoundingBox().inflate(range);
      if (level instanceof ServerLevel serverLevel) {
         float damage = ((Number)MutantHoglinRewardsCommonConfig.gauntlet_stomp_damage.get()).floatValue();
         for (LivingEntity entity : level.getEntitiesOfClass(LivingEntity.class, area, LivingEntity::isAlive)) {
            if (entity != player && entity.onGround()) {
               if (MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.HOGFIST_GAUNTLET_STOMPING_PLAYER_CANT_HURT, player, entity, player, null)) {
                  entity.hurtServer(serverLevel, MMDamageTypes.earthquakeAttack(player.damageSources(), player), damage);
               }

               entity.push(player.getRandom().nextGaussian() * 0.25, 0.3, player.getRandom().nextGaussian() * 0.25);
            }
         }
      } else {
         for (BlockPos pos : BlockPos.betweenClosed(area)) {
            BlockState state = level.getBlockState(pos);
            if (!state.isAir() && level.getBlockState(pos.above()).isAir() && player.getRandom().nextBoolean()) {
               level.addParticle(
                  new BlockParticleOption(ParticleTypes.BLOCK, state),
                  pos.getX() + player.getRandom().nextGaussian() * 0.5,
                  pos.above().getY() + 0.1,
                  pos.getZ() + player.getRandom().nextGaussian() * 0.5,
                  player.getRandom().nextGaussian(),
                  0.0,
                  player.getRandom().nextGaussian()
               );
            }
         }
      }

      return InteractionResult.SUCCESS;
   }
}
