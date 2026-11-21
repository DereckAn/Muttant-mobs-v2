package com.alexander.mutantmore.ai.goals.mutant_hoglin;

import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinCommonConfig;
import com.alexander.mutantmore.entities.MutantHoglin;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.EffectInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.commands.arguments.EntityAnchorArgument.Anchor;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class MutantHoglinKickAttackGoal extends Goal {
   public MutantHoglin mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;

   public MutantHoglinKickAttackGoal(MutantHoglin mob) {
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
         && this.mob.distanceTo(this.target) <= (Double)MutantHoglinCommonConfig.max_kick_attack_distance.get()
         && this.animationsUseable()
         && this.mob.hasLineOfSight(this.target);
   }

   public boolean canContinueToUse() {
      return this.target != null && !this.target.isRemoved() && !this.target.isDeadOrDying() && !this.animationsUseable();
   }

   public void start() {
      this.mob.kickAnimationTick = 45;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)9);
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null) {
         this.mob.lookAt(Anchor.EYES, this.target.position());
      }

      if (this.mob.kickAnimationTick == 24) {
         Vec3 kickAttackBoundingBoxOffset = PositionUtils.getOffsetPos(this.mob, 0.0, 0.0, 3.25, 0.0F, this.mob.yBodyRot);
         AABB kickAttackBoundingBox = this.mob
            .getBoundingBox()
            .deflate(0.0, 1.0, 0.0)
            .move(0.0, -1.0, 0.0)
            .inflate(1.0, 0.0, 1.0)
            .move(
               kickAttackBoundingBoxOffset.x - this.mob.getX(),
               kickAttackBoundingBoxOffset.y - this.mob.getY(),
               kickAttackBoundingBoxOffset.z - this.mob.getZ()
            );
         ShakeCameraEvent.shake(this.mob.level(), 13, 0.15F, this.mob.blockPosition(), 10);

         for (LivingEntity entity : getServerLevel(this.mob).getNearbyEntities(LivingEntity.class, TargetingConditions.forCombat(), this.mob, kickAttackBoundingBox)) {
            if (entity != this.mob && this.mob.canHarm(entity)) {
               if ((Boolean)MutantHoglinCommonConfig.ignores_invulnerability_time.get()) {
                  entity.setInvulnerableTime(0);
               }

               boolean flag = entity.hurtServer(getServerLevel(this.mob),
                  this.mob.damageSources().mobAttack(this.mob),
                  ((Double)MutantHoglinCommonConfig.kick_attack_damage.get()).floatValue() * this.mob.enragedDamageMultiplier()
               );
               Vec3 knockback = PositionUtils.getOffsetMotion(entity, 0.0, 0.0, 3.0F * this.mob.enragedKnockbackMultiplier(), 0.0F, this.mob.yBodyRot);
               entity.needsSync = true;
               entity.push(knockback.x, knockback.y, knockback.z);
               if (flag && entity == this.target) {
                  this.mob.wantsToCharge = true;
               }

               if (flag) {
                  entity.addEffect(
                     new MobEffectInstance(
                        MobEffects.SLOWNESS,
                        (Integer)MutantHoglinCommonConfig.kick_slowness_length.get(),
                        (Integer)MutantHoglinCommonConfig.kick_slowness_level.get()
                     )
                  );
                  entity.addEffect(
                     new MobEffectInstance(EffectInit.JUMPING_FATIGUE, (Integer)MutantHoglinCommonConfig.kick_slowness_length.get(), 0)
                  );
               }

               MiscUtils.disableShield(this.target, (Integer)MutantHoglinCommonConfig.kick_disable_shield_length.get());
            }
         }
      }
   }

   public void stop() {
      super.stop();
      this.nextUseTime = this.mob.tickCount + (Integer)MutantHoglinCommonConfig.kick_cooldown.get();
   }

   public boolean animationsUseable() {
      return this.mob.kickAnimationTick <= 0;
   }
}
