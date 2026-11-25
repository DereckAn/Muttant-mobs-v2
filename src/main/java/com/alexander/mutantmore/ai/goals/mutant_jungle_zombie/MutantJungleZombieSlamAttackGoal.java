package com.alexander.mutantmore.ai.goals.mutant_jungle_zombie;

import com.alexander.mutantmore.config.mutant_jungle_zombie.MutantJungleZombieCommonConfig;
import com.alexander.mutantmore.entities.MutantJungleZombie;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.commands.arguments.EntityAnchorArgument.Anchor;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class MutantJungleZombieSlamAttackGoal extends Goal {
   public MutantJungleZombie mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;
   public boolean hitTarget;

   public MutantJungleZombieSlamAttackGoal(MutantJungleZombie mob) {
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
         && this.mob.distanceTo(this.target) <= (Double)MutantJungleZombieCommonConfig.max_slam_attack_distance.get()
         && this.animationsUseable()
         && this.mob.hasLineOfSight(this.target);
   }

   public boolean canContinueToUse() {
      return !this.mob.shouldBeStationary()
         && this.target != null
         && !this.target.isRemoved()
         && !this.target.isDeadOrDying()
         && (this.mob.trySlamAnimationTick > 0 || this.mob.slamAnimationTick > 0);
   }

   public void start() {
      this.mob.trySlamAnimationTick = 30;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)15);
      this.hitTarget = false;
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null && this.mob.trySlamAnimationTick >= 24) {
         this.mob.lookAt(Anchor.EYES, this.target.position());
         Vec3 armPos = PositionUtils.getOffsetPos(this.mob, 0.0, this.mob.getEyeHeight(), 0.0, 0.0F, this.mob.yBodyRot);
         double d4 = this.target.getX() - armPos.x;
         double d5 = this.target.getEyeY() - armPos.y;
         double d6 = this.target.getZ() - armPos.z;
         double d7 = Math.sqrt(d4 * d4 + d6 * d6);
         float f1 = (float)(-(Mth.atan2(d5, d7) * 180.0F / (float)Math.PI));
         this.mob.setGrabArmXRot(f1);
      }

      if (this.target != null && this.mob.trySlamAnimationTick <= 11 && this.mob.trySlamAnimationTick >= 9) {
         int distance = ((Double)MutantJungleZombieCommonConfig.max_slam_attack_grab_distance.get()).intValue();

         for (int i = 0; i < distance; i++) {
            Vec3 boundingBoxPos = PositionUtils.getOffsetPos(this.mob, 0.0, this.mob.getEyeHeight(), i, this.mob.getGrabArmXRot(), this.mob.yBodyRot);
            AABB boundingBox = new AABB(boundingBoxPos.add(-0.5, -1.5, -0.5), boundingBoxPos.add(0.5, 0.5, 0.5));
            if (boundingBox.intersects(this.target.getBoundingBox())) {
               this.hitTarget = true;
               this.mob.trySlamAnimationTick = 0;
               this.mob.slamAnimationTick = 80;
               this.mob.level().broadcastEntityEvent(this.mob, (byte)16);
               this.target.needsSync = true;
               Vec3 targetPos = PositionUtils.getOffsetPos(this.mob, -1.0, 0.5, 2.0, 0.0F, this.mob.yBodyRot);
               this.target.setPos(targetPos);
               this.target.setDeltaMovement(0.0, 0.0, 0.0);
               if (this.target instanceof ServerPlayer) {
                  ((ServerPlayer)this.target).teleportTo(targetPos.x, targetPos.y, targetPos.z);
               }
            }
         }
      }

      if (this.target != null && this.mob.slamAnimationTick > 0) {
         if (this.target.isPassenger()) {
            this.target.stopRiding();
         }

         if (this.mob.slamAnimationTick == 80 - 12
            || this.mob.slamAnimationTick == 80 - 23
            || this.mob.slamAnimationTick == 80 - 34
            || this.mob.slamAnimationTick == 80 - 44) {
            if ((Boolean)MutantJungleZombieCommonConfig.ignores_invulnerability_time.get()) {
               this.target.setInvulnerableTime(0);
            }

            this.target.hurt(this.mob.damageSources().flyIntoWall(), ((Double)MutantJungleZombieCommonConfig.slam_attack_damage.get()).floatValue());
         }

         if (this.mob.slamAnimationTick == 80 - 56
            && this.mob.distanceTo(this.target) <= (Double)MutantJungleZombieCommonConfig.max_punch_attack_distance.get() + 2.0) {
            if ((Boolean)MutantJungleZombieCommonConfig.ignores_invulnerability_time.get()) {
               this.target.setInvulnerableTime(0);
            }

            boolean flag = this.mob.doHurtTarget(getServerLevel(this.mob), this.target);
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
         }

         if (this.mob.slamAnimationTick == 80 - 2) {
            Vec3 targetPos = PositionUtils.getOffsetPos(this.mob, -1.0, 0.5, 2.0, 0.0F, this.mob.yBodyRot);
            this.target.setPos(targetPos);
            this.target.setDeltaMovement(0.0, 0.0, 0.0);
            if (this.target instanceof ServerPlayer) {
               ((ServerPlayer)this.target).teleportTo(targetPos.x, targetPos.y, targetPos.z);
            }

            Vec3 motion = PositionUtils.getOffsetMotion(this.mob, 0.0, 1.0, -0.25, 0.0F, this.mob.yBodyRot);
            this.target.needsSync = true;
            this.target.setDeltaMovement(motion);
         }

         if (this.mob.slamAnimationTick == 80 - 9) {
            Vec3 motion = PositionUtils.getOffsetMotion(this.mob, -0.5, -2.0, 0.5, 0.0F, this.mob.yBodyRot);
            this.target.needsSync = true;
            this.target.setDeltaMovement(motion);
         }

         if (this.mob.slamAnimationTick == 80 - 12) {
            Vec3 motion = PositionUtils.getOffsetMotion(this.mob, 0.25, 1.0, -0.5, 0.0F, this.mob.yBodyRot);
            this.target.needsSync = true;
            this.target.setDeltaMovement(motion);
         }

         if (this.mob.slamAnimationTick == 80 - 19) {
            Vec3 motion = PositionUtils.getOffsetMotion(this.mob, 0.25, -2.0, 0.75, 0.0F, this.mob.yBodyRot);
            this.target.needsSync = true;
            this.target.setDeltaMovement(motion);
         }

         if (this.mob.slamAnimationTick == 80 - 23) {
            Vec3 motion = PositionUtils.getOffsetMotion(this.mob, -0.25, 1.1, -0.75, 0.0F, this.mob.yBodyRot);
            this.target.needsSync = true;
            this.target.setDeltaMovement(motion);
         }

         if (this.mob.slamAnimationTick == 80 - 30) {
            Vec3 motion = PositionUtils.getOffsetMotion(this.mob, 0.0, -2.0, 0.75, 0.0F, this.mob.yBodyRot);
            this.target.needsSync = true;
            this.target.setDeltaMovement(motion);
         }

         if (this.mob.slamAnimationTick == 80 - 34) {
            Vec3 motion = PositionUtils.getOffsetMotion(this.mob, 0.0, 1.2, -1.25, 0.0F, this.mob.yBodyRot);
            this.target.needsSync = true;
            this.target.setDeltaMovement(motion);
         }

         if (this.mob.slamAnimationTick == 80 - 41) {
            Vec3 motion = PositionUtils.getOffsetMotion(this.mob, 0.5, -2.0, 1.25, 0.0F, this.mob.yBodyRot);
            this.target.needsSync = true;
            this.target.setDeltaMovement(motion);
         }
      }
   }

   public void stop() {
      super.stop();
      int randomAddedCooldown = MutantJungleZombieCommonConfig.max_slam_attack_cooldown.get() - MutantJungleZombieCommonConfig.min_slam_attack_cooldown.get()
            <= 0
         ? 0
         : this.mob
            .getRandom()
            .nextInt(
               (Integer)MutantJungleZombieCommonConfig.max_slam_attack_cooldown.get() - (Integer)MutantJungleZombieCommonConfig.min_slam_attack_cooldown.get()
            );
      int cooldown = (Integer)MutantJungleZombieCommonConfig.min_slam_attack_cooldown.get() + randomAddedCooldown;
      this.nextUseTime = this.mob.tickCount + cooldown;
      if (!this.hitTarget) {
         this.mob.failedAttacks++;
      } else {
         this.mob.failedAttacks = 0;
      }
   }

   public boolean animationsUseable() {
      return this.mob.trySlamAnimationTick <= 0;
   }
}
