package com.alexander.mutantmore.blockentities;

import com.alexander.mutantmore.blocks.SnowstormGeneratorBlock;
import com.alexander.mutantmore.config.mutant_frozen_zombie.MutantFrozenZombieRewardsCommonConfig;
import com.alexander.mutantmore.init.BlockEntityTypeInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.interfaces.ISnowstormSource;
import com.alexander.mutantmore.util.HeatUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SnowstormGeneratorBlockEntity extends BlockEntity implements ISnowstormSource {
   private final RandomSource random = RandomSource.create();
   public int tickCount;

   public SnowstormGeneratorBlockEntity(BlockPos pos, BlockState state) {
      super(BlockEntityTypeInit.SNOWSTORM_GENERATOR, pos, state);
   }

   public boolean shouldHaveSnowstorm() {
      return this.getBlockState().getValue(SnowstormGeneratorBlock.POWERED);
   }

   @Override
   public double snowstormRange() {
      return this.shouldHaveSnowstorm() ? MutantFrozenZombieRewardsCommonConfig.generator_snowstorm_range.get() : 0.0;
   }

   @Override
   public double snowstormRangeY() {
      return this.shouldHaveSnowstorm() ? MutantFrozenZombieRewardsCommonConfig.generator_snowstorm_range_y.get() : 0.0;
   }

   @Override
   public boolean canFreeze(LivingEntity target) {
      return canBeFrozen(target, TagInit.Items.RESISTS_SNOWSTORM_GENERATOR_SNOWSTORMS);
   }

   /** Shared with the Freezing Fan: true when the target can be frozen (not immune by tag, not creative/spectator, not wearing resistant gear). */
   public static boolean canBeFrozen(LivingEntity target, net.minecraft.tags.TagKey<net.minecraft.world.item.Item> resistantGear) {
      if (target.is(TagInit.EntityTypes.UNAFFECTED_BY_SNOWSTORMS) || target.is(TagInit.EntityTypes.UNAFFECTED_BY_SNOWSTORM_GENERATOR_SNOWSTORMS) || target.isSpectator()) {
         return false;
      }

      if (target instanceof Player player && player.isCreative()) {
         return false;
      }

      for (EquipmentSlot slot : new EquipmentSlot[]{EquipmentSlot.FEET, EquipmentSlot.LEGS, EquipmentSlot.CHEST, EquipmentSlot.HEAD}) {
         if (target.getItemBySlot(slot).is(resistantGear)) {
            return false;
         }
      }

      return true;
   }

   public static void tick(Level level, BlockPos pos, BlockState state, SnowstormGeneratorBlockEntity generator) {
      generator.tickCount++;
      if (!level.isClientSide() && generator.shouldHaveSnowstorm() && MutantFrozenZombieRewardsCommonConfig.generator_snowstorm_griefing.get()) {
         for (int i = 0; i < MutantFrozenZombieRewardsCommonConfig.generator_snowstorm_griefing_amount.get(); i++) {
            BlockPos target = pos.offset(
               (int)(-generator.snowstormRange()) + generator.random.nextInt(Mth.floor(generator.snowstormRange() * 2.0)),
               (int)(-generator.snowstormRangeY()) + generator.random.nextInt(Mth.floor(generator.snowstormRangeY() * 2.0)),
               (int)(-generator.snowstormRange()) + generator.random.nextInt(Mth.floor(generator.snowstormRange() * 2.0))
            );
            BlockState there = level.getBlockState(target);
            if (there.isAir() && canSnowSurvive(level, target)) {
               level.setBlockAndUpdate(target, Blocks.SNOW.defaultBlockState());
            } else if (there.is(Blocks.SNOW) && there.getValue(SnowLayerBlock.LAYERS) < 8) {
               level.setBlockAndUpdate(target, there.setValue(SnowLayerBlock.LAYERS, there.getValue(SnowLayerBlock.LAYERS) + 1));
            }
         }
      }

      HeatUtils.performSnowstorm(
         generator, pos, level, MutantFrozenZombieRewardsCommonConfig.generator_freeze_speed.get(), MutantFrozenZombieRewardsCommonConfig.generator_max_freeze_amount.get(), true
      );
   }

   private static boolean canSnowSurvive(Level level, BlockPos pos) {
      BlockState below = level.getBlockState(pos.below());
      if (below.is(BlockTags.CANNOT_SUPPORT_SNOW_LAYER)) {
         return false;
      }

      return below.is(BlockTags.SUPPORT_OVERRIDE_SNOW_LAYER)
         || Block.isFaceFull(below.getCollisionShape(level, pos.below()), Direction.UP)
         || below.is(Blocks.SNOW) && below.getValue(SnowLayerBlock.LAYERS) == 8;
   }
}
