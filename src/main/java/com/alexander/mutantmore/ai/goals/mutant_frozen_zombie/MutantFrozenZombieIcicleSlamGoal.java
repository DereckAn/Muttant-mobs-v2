package com.alexander.mutantmore.ai.goals.mutant_frozen_zombie;

import com.alexander.mutantmore.config.mutant_frozen_zombie.MutantFrozenZombieCommonConfig;
import com.alexander.mutantmore.entities.IcicleSpike;
import com.alexander.mutantmore.entities.MutantFrozenZombie;
import com.alexander.mutantmore.util.PositionUtils;
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import org.jspecify.annotations.Nullable;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.phys.Vec3;

public class MutantFrozenZombieIcicleSlamGoal extends Goal {
   public MutantFrozenZombie mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;
   public float degreesProgress;
   public float degreesProgress2;

   public MutantFrozenZombieIcicleSlamGoal(MutantFrozenZombie mob) {
      this.setFlags(EnumSet.of(Flag.MOVE, Flag.JUMP, Flag.LOOK));
      this.mob = mob;
      this.target = mob.getTarget();
   }

   public boolean isInterruptable() {
      return this.mob.shouldBeStationary();
   }

   public boolean requiresUpdateEveryTick() {
      return true;
   }

   public boolean canUse() {
      this.target = this.mob.getTarget();
      return this.target != null
         && this.mob.tickCount >= this.nextUseTime
         && this.mob.snowstormTime <= 0
         && this.mob.distanceTo(this.target) <= (Double)MutantFrozenZombieCommonConfig.max_icicle_slam_distance.get()
         && !this.target.isRemoved()
         && !this.target.isDeadOrDying()
         && this.animationsUseable()
         && this.mob.hasLineOfSight(this.target);
   }

   public boolean canContinueToUse() {
      return this.target != null && !this.target.isRemoved() && !this.target.isDeadOrDying() && !this.animationsUseable();
   }

   public void start() {
      this.mob.iciclesAnimationTick = 70;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)9);
      this.degreesProgress = 0.0F;
      this.degreesProgress2 = 0.0F;
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null) {
         this.mob.getLookControl().setLookAt(this.target);
      }

      if (this.mob.iciclesAnimationTick == 36) {
         float startAngle = this.mob.yBodyRot;
         List<IcicleSpike> icicleSpikes = Lists.newArrayList();
         List<IcicleSpike> icicleSpikes2 = Lists.newArrayList();

         for (float f = startAngle; f < startAngle + 360.0F; f++) {
            this.degreesProgress++;
            if ((int)this.degreesProgress % 18 == 0) {
               for (int i = 0; i < MutantFrozenZombieCommonConfig.icicle_slam_icicle_row_length.get(); i++) {
                  Vec3 iciclePos = PositionUtils.getOffsetPos(this.mob, 0.0, 0.0, 3.0 + i * 1.8, 0.0F, f);
                  IcicleSpike icicle = new IcicleSpike(this.mob.level(), 10 + i / 2, this.mob);
                  icicle.snapTo(iciclePos);
                  icicle.damage = ((Double)MutantFrozenZombieCommonConfig.icicle_slam_icicle_damage.get()).floatValue();
                  icicle.freezingLength = (Integer)MutantFrozenZombieCommonConfig.icicle_slam_freezing_length.get();
                  icicle.freezingLevel = (Integer)MutantFrozenZombieCommonConfig.icicle_slam_freezing_level.get();
                  icicle.ignoresInvulTime = (Boolean)MutantFrozenZombieCommonConfig.ignores_invulnerability_time.get();
                  PositionUtils.moveToCorrectHeight(icicle, true);
                  ((ServerLevel)this.mob.level()).addFreshEntityWithPassengers(icicle);
                  icicleSpikes.add(icicle);
               }
            }
         }

         for (float f = startAngle; f < startAngle + 360.0F; f++) {
            this.degreesProgress2++;
            if ((int)this.degreesProgress2 % 18 == 9) {
               for (int i = 0; i < MutantFrozenZombieCommonConfig.icicle_slam_icicle_row_length.get(); i++) {
                  Vec3 iciclePos = PositionUtils.getOffsetPos(this.mob, 0.0, 0.0, 3.0 + i * 1.4, 0.0F, f);
                  IcicleSpike icicle = new IcicleSpike(this.mob.level(), 80 + i / 2, this.mob);
                  icicle.snapTo(iciclePos);
                  icicle.damage = ((Double)MutantFrozenZombieCommonConfig.icicle_slam_icicle_damage.get()).floatValue();
                  icicle.freezingLength = (Integer)MutantFrozenZombieCommonConfig.icicle_slam_freezing_length.get();
                  icicle.freezingLevel = (Integer)MutantFrozenZombieCommonConfig.icicle_slam_freezing_level.get();
                  icicle.ignoresInvulTime = (Boolean)MutantFrozenZombieCommonConfig.ignores_invulnerability_time.get();
                  PositionUtils.moveToCorrectHeight(icicle, true);
                  ((ServerLevel)this.mob.level()).addFreshEntityWithPassengers(icicle);
                  icicleSpikes2.add(icicle);
               }
            }
         }

         for (IcicleSpike spike : icicleSpikes) {
            spike.connectedSpikes.addAll(icicleSpikes);
         }

         for (IcicleSpike spike : icicleSpikes2) {
            spike.connectedSpikes.addAll(icicleSpikes2);
         }
      }
   }

   public void stop() {
      super.stop();
      int randomAddedCooldown = MutantFrozenZombieCommonConfig.max_icicle_slam_cooldown.get() - MutantFrozenZombieCommonConfig.min_icicle_slam_cooldown.get()
            <= 0
         ? 0
         : this.mob
            .getRandom()
            .nextInt(
               (Integer)MutantFrozenZombieCommonConfig.max_icicle_slam_cooldown.get() - (Integer)MutantFrozenZombieCommonConfig.min_icicle_slam_cooldown.get()
            );
      int cooldown = (Integer)MutantFrozenZombieCommonConfig.min_icicle_slam_cooldown.get() + randomAddedCooldown;
      this.nextUseTime = this.mob.tickCount + cooldown;
   }

   public boolean animationsUseable() {
      return this.mob.iciclesAnimationTick <= 0;
   }
}
