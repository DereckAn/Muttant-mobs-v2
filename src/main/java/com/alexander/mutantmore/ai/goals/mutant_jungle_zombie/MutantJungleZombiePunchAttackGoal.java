package com.alexander.mutantmore.ai.goals.mutant_jungle_zombie;

import com.alexander.mutantmore.config.mutant_jungle_zombie.MutantJungleZombieCommonConfig;
import com.alexander.mutantmore.entities.MutantJungleZombie;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.commands.arguments.EntityAnchorArgument.Anchor;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.phys.Vec3;

public class MutantJungleZombiePunchAttackGoal extends Goal {
   public MutantJungleZombie mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;
   public boolean canPunchAgain;
   public int punchTimes;
   public boolean hasHitMob;

   public MutantJungleZombiePunchAttackGoal(MutantJungleZombie mob) {
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
      return !this.mob.jumping
         && this.target != null
         && this.mob.notCurrentlyPlayingKeyframeAnimation()
         && this.mob.tickCount >= this.nextUseTime
         && !this.target.isRemoved()
         && !this.target.isDeadOrDying()
         && this.mob.distanceTo(this.target) <= (Double)MutantJungleZombieCommonConfig.max_punch_attack_distance.get()
         && this.animationsUseable()
         && this.mob.hasLineOfSight(this.target);
   }

   public boolean canContinueToUse() {
      return !this.mob.shouldBeStationary() && this.target != null && !this.target.isRemoved() && !this.target.isDeadOrDying() && !this.animationsUseable();
   }

   public void start() {
      this.mob.punchAnimationTick = 25;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)6);
      this.canPunchAgain = false;
      this.punchTimes = 0;
      this.hasHitMob = false;
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null) {
         this.mob.lookAt(Anchor.EYES, this.target.position());
      }

      if (this.mob.punchAnimationTick == 14) {
         this.punchTimes++;
         ShakeCameraEvent.shake(this.mob.level(), 13, 0.15F, this.mob.blockPosition(), 10);
      }

      if (this.mob.punchAnimationTick <= 14 && this.mob.punchAnimationTick >= 9) {
         this.mob.setDeltaMovement(PositionUtils.getOffsetMotion(this.mob, 0.0, 0.0, 0.5, 0.0F, this.mob.yBodyRot));
         if (this.target != null && this.mob.distanceTo(this.target) <= (Double)MutantJungleZombieCommonConfig.max_punch_attack_distance.get() && !this.hasHitMob
            )
          {
            boolean flag = this.mob.doHurtTarget(getServerLevel(this.mob), this.target);
            this.canPunchAgain = true;
            if (flag) {
               this.target
                  .addEffect(
                     new MobEffectInstance(
                        MobEffects.POISON,
                        (Integer)MutantJungleZombieCommonConfig.punch_attack_poison_length.get(),
                        (Integer)MutantJungleZombieCommonConfig.punch_attack_poison_level.get()
                     )
                  );
            }

            MiscUtils.disableShield(this.target, (Integer)MutantJungleZombieCommonConfig.punch_attack_disable_shield_length.get());
            Vec3 knockback = PositionUtils.getOffsetMotion(this.target, 0.0, 0.0, 0.4, 0.0F, this.mob.yBodyRot);
            this.target.needsSync = true;
            this.target.push(knockback.x, knockback.y, knockback.z);
            this.hasHitMob = true;
         }
      }

      if (this.mob.punchAnimationTick == 1 && this.canPunchAgain && this.punchTimes < 5) {
         this.mob.punchAnimationTick = 25;
         this.mob.level().broadcastEntityEvent(this.mob, (byte)6);
         this.canPunchAgain = false;
         this.hasHitMob = false;
      }
   }

   public void stop() {
      super.stop();
      this.nextUseTime = this.mob.tickCount + (Integer)MutantJungleZombieCommonConfig.punch_attack_cooldown.get();
   }

   public boolean animationsUseable() {
      return this.mob.punchAnimationTick <= 0;
   }
}
