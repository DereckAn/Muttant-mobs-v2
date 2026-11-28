package com.alexander.mutantmore.blockentities;

import com.alexander.mutantmore.blocks.FreezingFanBlock;
import com.alexander.mutantmore.config.mutant_frozen_zombie.MutantFrozenZombieRewardsCommonConfig;
import com.alexander.mutantmore.entities.IceCube;
import com.alexander.mutantmore.init.BlockEntityTypeInit;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.TagInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class FreezingFanBlockEntity extends BlockEntity {
   private final RandomSource random = RandomSource.create();

   public FreezingFanBlockEntity(BlockPos pos, BlockState state) {
      super(BlockEntityTypeInit.FREEZING_FAN, pos, state);
   }

   /** Along the facing axis: from the face out to 14 blocks; across it: one block either side. */
   private static double edge(int step, double centre, double across, int reach) {
      return step == 0 ? centre + across : centre + step * reach;
   }

   public static void tick(Level level, BlockPos pos, BlockState state, FreezingFanBlockEntity fan) {
      if (!state.getValue(FreezingFanBlock.POWERED)) {
         return;
      }

      Direction facing = state.getValue(FreezingFanBlock.FACING);
      double cx = pos.getX() + 0.5;
      double cy = pos.getY() + 0.5;
      double cz = pos.getZ() + 0.5;
      if (level.isClientSide()) {
         for (int i = 0; i < 3; i++) {
            level.addParticle(
               ParticleTypeInit.MOTION_SNOWSTORM,
               edge(facing.getStepX(), cx, fan.random.nextGaussian() * 0.75, 1),
               edge(facing.getStepY(), cy, fan.random.nextGaussian() * 0.75, 1),
               edge(facing.getStepZ(), cz, fan.random.nextGaussian() * 0.75, 1),
               facing.getStepX(),
               facing.getStepY(),
               facing.getStepZ()
            );
         }

         return;
      }

      AABB area = new AABB(
         new Vec3(edge(facing.getStepX(), cx, -1.0, 1), edge(facing.getStepY(), cy, -1.0, 1), edge(facing.getStepZ(), cz, -1.0, 1)),
         new Vec3(edge(facing.getStepX(), cx, 1.0, 14), edge(facing.getStepY(), cy, 1.0, 14), edge(facing.getStepZ(), cz, 1.0, 14))
      );
      for (Entity entity : level.getEntities((Entity)null, area)) {
         if (entity instanceof LivingEntity living && !living.isDeadOrDying() && SnowstormGeneratorBlockEntity.canBeFrozen(living, TagInit.Items.RESISTS_FREEZING_FAN_SNOWSTORMS)) {
            living.setIsInPowderSnow(true);
            living.setTicksFrozen(
               Mth.clamp(living.getTicksFrozen() + 2 + MutantFrozenZombieRewardsCommonConfig.fan_freeze_speed.get(), 0, MutantFrozenZombieRewardsCommonConfig.fan_max_freeze_amount.get())
            );
            if (living.isFullyFrozen()
               && level.getEntitiesOfClass(IceCube.class, living.getBoundingBox()).isEmpty()
               && living.getMaxHealth() <= MutantFrozenZombieRewardsCommonConfig.fan_ice_cube_max_health.get()) {
               IceCube cube = EntityTypeInit.ICE_CUBE.create(level, EntitySpawnReason.MOB_SUMMONED);
               if (cube != null) {
                  cube.snapTo(living.position());
                  cube.setTarget(living);
                  level.addFreshEntity(cube);
               }
            }
         }
      }
   }
}
