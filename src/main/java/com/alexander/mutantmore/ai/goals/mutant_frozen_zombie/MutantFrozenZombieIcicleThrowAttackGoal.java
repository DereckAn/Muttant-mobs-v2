package com.alexander.mutantmore.ai.goals.mutant_frozen_zombie;

import com.alexander.mutantmore.config.mutant_frozen_zombie.MutantFrozenZombieCommonConfig;
import com.alexander.mutantmore.entities.MutantFrozenZombie;
import com.alexander.mutantmore.entities.ThrownIcicle;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.commands.arguments.EntityAnchorArgument.Anchor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.phys.Vec3;

public class MutantFrozenZombieIcicleThrowAttackGoal extends Goal {
   public MutantFrozenZombie mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;
   public double lastTargetX = 0.0;
   public double lastTargetZ = 0.0;

   public MutantFrozenZombieIcicleThrowAttackGoal(MutantFrozenZombie mob) {
      this.setFlags(EnumSet.of(Flag.MOVE, Flag.JUMP));
      this.mob = mob;
      this.target = mob.getTarget();
   }

   public boolean isInterruptable() {
      return false;
   }

   public boolean requiresUpdateEveryTick() {
      return true;
   }

   public boolean canUse() {
      this.target = this.mob.getTarget();
      return this.target != null
         && this.mob.tickCount >= this.nextUseTime
         && this.mob.snowstormTime <= 0
         && !this.target.isRemoved()
         && !this.target.isDeadOrDying()
         && this.mob.distanceTo(this.target) >= (Double)MutantFrozenZombieCommonConfig.min_icicle_throw_distance.get()
         && this.mob.distanceTo(this.target) <= (Double)MutantFrozenZombieCommonConfig.max_icicle_throw_distance.get()
         && this.animationsUseable()
         && this.mob.hasLineOfSight(this.target);
   }

   public boolean canContinueToUse() {
      return !this.animationsUseable();
   }

   public void start() {
      this.mob.throwAnimationTick = 42;
      this.mob.noveltyAnimationTick = 0;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)6);
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null) {
         this.mob.lookAt(Anchor.EYES, this.target.position());
      }

      if (this.target != null && this.mob.throwAnimationTick == 19) {
         for (int i = 0; i < 1 + this.mob.getLivesLost() * MutantFrozenZombieCommonConfig.lost_life_thrown_icicle_bonus.get(); i++) {
            ThrownIcicle icicle = new ThrownIcicle(this.mob.level(), this.mob);
            Vec3 iciclePos = PositionUtils.getOffsetPos(this.mob, 1.25, 5.0, 0.0, 0.0F, this.mob.yBodyRot);
            double predictionMultiplier = this.mob.distanceTo(this.target) * 0.65;
            double d0 = this.target.getY(0.1);
            double d1 = this.target.getX() + (this.target.getX() - this.lastTargetX) * predictionMultiplier - iciclePos.x;
            double d2 = d0 - iciclePos.y;
            double d3 = this.target.getZ() + (this.target.getZ() - this.lastTargetZ) * predictionMultiplier - iciclePos.z;
            double d4 = Math.sqrt(d1 * d1 + d3 * d3) * 0.2F;
            icicle.shoot(
               d1, d2 + d4, d3, 1.6F, 2.0F * (this.mob.getLivesLost() * (Integer)MutantFrozenZombieCommonConfig.lost_life_thrown_icicle_bonus.get() * 2)
            );
            icicle.snapTo(iciclePos);
            icicle.damage = ((Double)MutantFrozenZombieCommonConfig.thrown_icicle_damage.get()).floatValue();
            icicle.freezingLength = (Integer)MutantFrozenZombieCommonConfig.thrown_icicle_freezing_length.get();
            icicle.freezingLevel = (Integer)MutantFrozenZombieCommonConfig.thrown_icicle_freezing_level.get();
            icicle.disableShieldLength = (Integer)MutantFrozenZombieCommonConfig.thrown_icicle_disable_shield_length.get();
            icicle.ignoresInvulTime = (Boolean)MutantFrozenZombieCommonConfig.ignores_invulnerability_time.get();
            this.mob.level().addFreshEntity(icicle);
         }
      }

      if (this.target != null) {
         this.lastTargetX = this.target.getX();
         this.lastTargetZ = this.target.getZ();
      }
   }

   public void stop() {
      super.stop();
      this.nextUseTime = this.mob.tickCount + (Integer)MutantFrozenZombieCommonConfig.icicle_throw_cooldown.get();
   }

   public boolean animationsUseable() {
      return this.mob.throwAnimationTick <= 0;
   }
}
