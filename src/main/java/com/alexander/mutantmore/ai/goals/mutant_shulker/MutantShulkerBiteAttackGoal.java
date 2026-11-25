package com.alexander.mutantmore.ai.goals.mutant_shulker;

import com.alexander.mutantmore.config.mutant_shulker.MutantShulkerCommonConfig;
import com.alexander.mutantmore.entities.MutantShulker;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.util.MiscUtils;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;

public class MutantShulkerBiteAttackGoal extends Goal {
   public MutantShulker mob;
   @Nullable
   public LivingEntity target;

   public MutantShulkerBiteAttackGoal(MutantShulker mob) {
      this.setFlags(EnumSet.of(Flag.MOVE, Flag.JUMP));
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
         && !this.target.isRemoved()
         && !this.target.isDeadOrDying()
         && this.mob.distanceTo(this.target) <= (Double)MutantShulkerCommonConfig.max_bite_distance.get()
         && this.animationsUseable()
         && this.mob.hasLineOfSight(this.target)
         && !this.mob.isInBox();
   }

   public boolean canContinueToUse() {
      return this.target != null && !this.target.isRemoved() && !this.target.isDeadOrDying() && !this.animationsUseable();
   }

   public void start() {
      this.mob.playSound(SoundEventInit.MUTANT_SHULKER_BITE, 1.0F, 1.0F);
      this.mob.biteAnimationTick = this.mob.biteAnimationLength;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)44);
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null
         && this.mob.distanceTo(this.target) <= (Double)MutantShulkerCommonConfig.max_bite_damage_distance.get()
         && this.mob.biteAnimationTick == this.mob.biteAnimationActionPoint) {
         if ((Boolean)MutantShulkerCommonConfig.ignores_invulnerability_time.get()) {
            this.target.setInvulnerableTime(0);
         }

         this.target
            .hurt(MMDamageTypes.mutantShulkerBiteAttack(this.mob.damageSources(), this.mob), ((Double)MutantShulkerCommonConfig.bite_damage.get()).floatValue());
         MiscUtils.disableShield(this.target, (Integer)MutantShulkerCommonConfig.bite_disable_shield_length.get());
         double d0 = this.target.getX() - this.mob.getX();
         double d1 = this.target.getZ() - this.mob.getZ();
         double d2 = Math.max(d0 * d0 + d1 * d1, 0.001);
         this.target.push(d0 / d2 * 2.5, 0.2, d1 / d2 * 2.5); // was knockback(strength, x, z) with these args; push matches the intent
         ShakeCameraEvent.shake(this.mob.level(), 20, 0.15F, this.mob.blockPosition(), 10);
      }
   }

   public boolean animationsUseable() {
      return this.mob.biteAnimationTick <= 0;
   }
}
