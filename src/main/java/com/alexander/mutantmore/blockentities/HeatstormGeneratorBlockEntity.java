package com.alexander.mutantmore.blockentities;

import com.alexander.mutantmore.blocks.HeatstormGeneratorBlock;
import com.alexander.mutantmore.config.mutant_blaze.MutantBlazeRewardsCommonConfig;
import com.alexander.mutantmore.heat.Heat;
import com.alexander.mutantmore.init.BlockEntityTypeInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.interfaces.IHeatSource;
import java.util.function.Consumer;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class HeatstormGeneratorBlockEntity extends BlockEntity implements IHeatSource {
   /** Client sets this to start the humming loop (it fades with the power state and stops when the block is gone). */
   public static Consumer<HeatstormGeneratorBlockEntity> loopSoundHook = generator -> {};
   private final RandomSource random = RandomSource.create();
   private boolean loopSoundStarted;
   public int tickCount;

   public HeatstormGeneratorBlockEntity(BlockPos pos, BlockState state) {
      super(BlockEntityTypeInit.HEATSTORM_GENERATOR, pos, state);
   }

   public boolean shouldHeat() {
      return this.getBlockState().getValue(HeatstormGeneratorBlock.POWERED);
   }

   @Override
   public double heatRange() {
      return this.shouldHeat() ? MutantBlazeRewardsCommonConfig.generator_heat_range.get() : 0.0;
   }

   @Override
   public double heatRangeY() {
      return this.shouldHeat() ? MutantBlazeRewardsCommonConfig.generator_heat_range_y.get() : 0.0;
   }

   @Override
   public double heatSpeed() {
      return MutantBlazeRewardsCommonConfig.generator_heat_speed.get();
   }

   @Override
   public boolean canHeat(LivingEntity target) {
      if (target.is(TagInit.EntityTypes.CANT_BE_HEATED) || target.is(TagInit.EntityTypes.HEATSTORM_GENERATOR_CANT_HEAT) || target.isSpectator()) {
         return false;
      }

      if (target.fireImmune() && !MutantBlazeRewardsCommonConfig.generator_heats_fire_immune_mobs.get()) {
         return false;
      }

      return !(target instanceof Player player) || !player.isCreative();
   }

   public static void tick(Level level, BlockPos pos, BlockState state, HeatstormGeneratorBlockEntity generator) {
      generator.tickCount++;
      if (level.isClientSide() && !generator.loopSoundStarted) {
         generator.loopSoundStarted = true;
         loopSoundHook.accept(generator);
      }

      if (!level.isClientSide()
         && MutantBlazeRewardsCommonConfig.generator_heat_griefing.get()
         && generator.shouldHeat()
         && generator.random.nextInt(MutantBlazeRewardsCommonConfig.generator_heat_griefing_chance.get()) == 0) {
         BlockPos target = pos.offset(
            (int)(-generator.heatRange()) + generator.random.nextInt(Mth.floor(generator.heatRange() * 2.0)),
            (int)(-generator.heatRangeY()) + generator.random.nextInt(Mth.floor(generator.heatRangeY() * 2.0)),
            (int)(-generator.heatRange()) + generator.random.nextInt(Mth.floor(generator.heatRange() * 2.0))
         );
         if (level.getBlockState(target).isAir()) {
            level.setBlockAndUpdate(target, BaseFireBlock.getState(level, target));
         }
      }

      Heat.performHeating(generator, pos, level, generator.heatSpeed());
   }
}
