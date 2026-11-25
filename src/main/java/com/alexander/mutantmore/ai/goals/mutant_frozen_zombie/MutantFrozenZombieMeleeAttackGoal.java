package com.alexander.mutantmore.ai.goals.mutant_frozen_zombie;

import com.alexander.mutantmore.config.mutant_frozen_zombie.MutantFrozenZombieCommonConfig;
import com.alexander.mutantmore.entities.MutantFrozenZombie;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.EffectInit;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.commands.arguments.EntityAnchorArgument.Anchor;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class MutantFrozenZombieMeleeAttackGoal extends Goal {
   public MutantFrozenZombie mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;

   public MutantFrozenZombieMeleeAttackGoal(MutantFrozenZombie mob) {
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
         && this.mob.distanceTo(this.target) <= (Double)MutantFrozenZombieCommonConfig.max_melee_attack_distance.get()
         && this.animationsUseable()
         && this.mob.hasLineOfSight(this.target);
   }

   public boolean canContinueToUse() {
      return this.target != null && !this.target.isRemoved() && !this.target.isDeadOrDying() && !this.animationsUseable();
   }

   public void start() {
      this.mob.attackAnimationTick = 32;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)8);
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null) {
         this.mob.lookAt(Anchor.EYES, this.target.position());
      }

      if (this.mob.attackAnimationTick == 17) {
         Vec3 meleeAttackBoundingBoxOffset = PositionUtils.getOffsetPos(this.mob, 0.0, 0.0, 3.25, 0.0F, this.mob.yBodyRot);
         AABB meleeAttackBoundingBox = this.mob
            .getBoundingBox()
            .deflate(0.0, 1.0, 0.0)
            .move(0.0, -1.0, 0.0)
            .inflate(1.0, 0.0, 1.0)
            .move(
               meleeAttackBoundingBoxOffset.x - this.mob.getX(),
               meleeAttackBoundingBoxOffset.y - this.mob.getY(),
               meleeAttackBoundingBoxOffset.z - this.mob.getZ()
            );
         ShakeCameraEvent.shake(this.mob.level(), 13, 0.15F, this.mob.blockPosition(), 10);

         for (LivingEntity entity : getServerLevel(this.mob).getNearbyEntities(LivingEntity.class, TargetingConditions.forCombat(), this.mob, meleeAttackBoundingBox)) {
            if (entity != this.mob && entity != this.target && this.mob.canHarm(entity)) {
               if ((Boolean)MutantFrozenZombieCommonConfig.ignores_invulnerability_time.get()) {
                  entity.setInvulnerableTime(0);
               }

               boolean flag = entity.hurtServer(getServerLevel(this.mob),
                  this.mob.damageSources().mobAttack(this.mob), ((Double)MutantFrozenZombieCommonConfig.melee_attack_damage.get()).floatValue()
               );
               Vec3 knockback = PositionUtils.getOffsetMotion(entity, 0.0, 0.0, 5.0, 0.0F, this.mob.yBodyRot);
               if (entity.hasEffect(EffectInit.FREEZING)) {
                  entity.addEffect(
                     new MobEffectInstance(
                        EffectInit.FREEZING,
                        entity.getEffect(EffectInit.FREEZING).getDuration()
                           + (Integer)MutantFrozenZombieCommonConfig.melee_attack_freezing_length.get(),
                        (Integer)MutantFrozenZombieCommonConfig.melee_attack_freezing_level.get()
                     )
                  );
               } else {
                  entity.addEffect(
                     new MobEffectInstance(
                        EffectInit.FREEZING,
                        (Integer)MutantFrozenZombieCommonConfig.melee_attack_freezing_length.get(),
                        (Integer)MutantFrozenZombieCommonConfig.melee_attack_freezing_level.get()
                     )
                  );
               }

               entity.needsSync = true;
               entity.push(knockback.x, knockback.y, knockback.z);
            }
         }

         if (this.target != null && this.mob.distanceTo(this.target) <= (Double)MutantFrozenZombieCommonConfig.max_melee_attack_distance.get() + 1.0) {
            if ((Boolean)MutantFrozenZombieCommonConfig.ignores_invulnerability_time.get()) {
               this.target.setInvulnerableTime(0);
            }

            boolean flag = this.target
               .hurtServer(getServerLevel(this.mob), this.mob.damageSources().mobAttack(this.mob), ((Double)MutantFrozenZombieCommonConfig.melee_attack_damage.get()).floatValue());
            Vec3 knockback = PositionUtils.getOffsetMotion(this.target, 0.0, 0.0, 5.0, 0.0F, this.mob.yBodyRot);
            if (this.target.hasEffect(EffectInit.FREEZING)) {
               this.target
                  .addEffect(
                     new MobEffectInstance(
                        EffectInit.FREEZING,
                        this.target.getEffect(EffectInit.FREEZING).getDuration()
                           + (Integer)MutantFrozenZombieCommonConfig.melee_attack_freezing_length.get(),
                        (Integer)MutantFrozenZombieCommonConfig.melee_attack_freezing_level.get()
                     )
                  );
            } else {
               this.target
                  .addEffect(
                     new MobEffectInstance(
                        EffectInit.FREEZING,
                        (Integer)MutantFrozenZombieCommonConfig.melee_attack_freezing_length.get(),
                        (Integer)MutantFrozenZombieCommonConfig.melee_attack_freezing_level.get()
                     )
                  );
            }

            this.target.needsSync = true;
            this.target.push(knockback.x, knockback.y, knockback.z);
         }
      }
   }

   public void stop() {
      super.stop();
      this.nextUseTime = this.mob.tickCount + (Integer)MutantFrozenZombieCommonConfig.melee_attack_cooldown.get();
   }

   public boolean animationsUseable() {
      return this.mob.attackAnimationTick <= 0;
   }
}
