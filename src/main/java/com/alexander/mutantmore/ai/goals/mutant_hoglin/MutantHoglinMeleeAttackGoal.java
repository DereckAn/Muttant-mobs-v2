package com.alexander.mutantmore.ai.goals.mutant_hoglin;

import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinCommonConfig;
import com.alexander.mutantmore.entities.MutantHoglin;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;

public class MutantHoglinMeleeAttackGoal extends Goal {
   public MutantHoglin mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;

   public MutantHoglinMeleeAttackGoal(MutantHoglin mob) {
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
         && this.mob.notCurrentlyPlayingKeyframeAnimation()
         && this.mob.tickCount >= this.nextUseTime
         && !this.target.isRemoved()
         && !this.target.isDeadOrDying()
         && this.mob.distanceTo(this.target) <= (Double)MutantHoglinCommonConfig.max_basic_attack_distance.get()
         && this.animationsUseable()
         && this.mob.hasLineOfSight(this.target);
   }

   public boolean canContinueToUse() {
      return this.target != null && !this.target.isRemoved() && !this.target.isDeadOrDying() && !this.animationsUseable();
   }

   public void start() {
      this.mob.attackAnimationTick = 22;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)6);
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null) {
         this.mob.getLookControl().setLookAt(this.target);
      }

      if (this.target != null
         && this.mob.distanceTo(this.target) <= (Double)MutantHoglinCommonConfig.max_basic_attack_damage_distance.get()
         && this.mob.attackAnimationTick == 13) {
         if ((Boolean)MutantHoglinCommonConfig.ignores_invulnerability_time.get()) {
            this.target.setInvulnerableTime(0);
         }

         this.mob.doHurtTarget(getServerLevel(this.mob), this.target);
      }
   }

   public void stop() {
      super.stop();
      this.nextUseTime = this.mob.tickCount + (Integer)MutantHoglinCommonConfig.basic_attack_cooldown.get();
   }

   public boolean animationsUseable() {
      return this.mob.attackAnimationTick <= 0;
   }
}
