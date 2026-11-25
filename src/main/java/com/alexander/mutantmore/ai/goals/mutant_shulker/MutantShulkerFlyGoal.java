package com.alexander.mutantmore.ai.goals.mutant_shulker;

import com.alexander.mutantmore.config.mutant_shulker.MutantShulkerCommonConfig;
import com.alexander.mutantmore.entities.MutantShulker;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.phys.Vec3;

public class MutantShulkerFlyGoal extends Goal {
   public MutantShulker mob;
   @Nullable
   public LivingEntity target;
   public int moveDelay = 0;
   public Vec3 movement = Vec3.ZERO;
   public int flyingFor = 0;
   public int nextUseTime;

   public MutantShulkerFlyGoal(MutantShulker mob) {
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
         && this.mob.getHealth() <= this.mob.getMaxHealth() * (((Integer)MutantShulkerCommonConfig.fly_health_threshold.get()).floatValue() / 100.0F)
         && this.mob.tickCount >= this.nextUseTime
         && this.animationsUseable()
         && !this.mob.flying
         && !this.mob.isInBox();
   }

   public boolean canContinueToUse() {
      return this.target != null && !this.target.isRemoved() && !this.target.isDeadOrDying() && (!this.animationsUseable() || this.mob.flying);
   }

   public void start() {
      this.mob.playSound(SoundEventInit.MUTANT_SHULKER_PREPARE_FLIGHT, 2.0F, 1.0F);
      this.mob.prepareFlyAnimationTick = this.mob.prepareFlyAnimationLength;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)7);
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null) {
         if (this.mob.prepareFlyAnimationTick == this.mob.prepareFlyActionPoint) {
            this.mob.setDeltaMovement(this.mob.getDeltaMovement().add(0.0, 1.0, 0.0));
         } else if (this.mob.prepareFlyAnimationTick == 1) {
            this.mob.flying = true;
            this.mob.level().broadcastEntityEvent(this.mob, (byte)5);
         } else if (this.mob.flying) {
            this.flyingFor++;
            this.moveDelay++;
            if (this.flyingFor >= (Integer)MutantShulkerCommonConfig.stop_flying_time.get()) {
               this.flyingFor = 0;
               this.mob.flying = false;
               this.mob.level().broadcastEntityEvent(this.mob, (byte)6);
               if ((Boolean)MutantShulkerCommonConfig.enters_shell_after_flying.get() && this.mob.tickCount >= this.mob.nextEnterShellTime) {
                  this.mob.setInBox(true);
               }

               this.stop();
            }

            ((ServerLevel)this.mob.level())
               .sendParticles(
                  ParticleTypeInit.MUTANT_SHULKER_BULLET,
                  this.mob.getX(),
                  this.mob.getY(),
                  this.mob.getZ(),
                  1,
                  0.2,
                  0.2,
                  0.2,
                  0.0
               );
            if (!this.mob.level().getBlockState(this.mob.blockPosition().below()).isAir()) {
               this.mob.setDeltaMovement(this.mob.getDeltaMovement().add(0.0, 0.1, 0.0));
            }

            if (this.moveDelay >= 15) {
               double x = this.target.getX() - this.mob.getX();
               double y = this.target.getY() + this.target.getBbHeight() / 2.0F - this.mob.getY();
               double z = this.target.getZ() - this.mob.getZ();
               double d = Math.sqrt(x * x + y * y + z * z);
               if (this.moveDelay == 15) {
                  this.movement = new Vec3(
                     x / d * (Double)MutantShulkerCommonConfig.flying_movement_speed.get(),
                     y / d * (Double)MutantShulkerCommonConfig.flying_movement_speed.get(),
                     z / d * (Double)MutantShulkerCommonConfig.flying_movement_speed.get()
                  );
               }

               this.mob.setDeltaMovement(0.0, 0.0, 0.0);
               this.mob.setDeltaMovement(this.mob.getDeltaMovement().add(this.movement));
               if (this.moveDelay >= 55) {
                  this.moveDelay = 0;
                  this.movement = Vec3.ZERO;
               }
            }
         }
      }
   }

   public void stop() {
      super.stop();
      this.flyingFor = 0;
      this.mob.flying = false;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)6);
      if ((Boolean)MutantShulkerCommonConfig.enters_shell_after_flying.get() && this.mob.tickCount >= this.mob.nextEnterShellTime) {
         this.mob.setInBox(true);
      }

      this.nextUseTime = this.mob.tickCount + (Integer)MutantShulkerCommonConfig.fly_cooldown.get();
   }

   public boolean animationsUseable() {
      return this.mob.prepareFlyAnimationTick <= 0;
   }
}
