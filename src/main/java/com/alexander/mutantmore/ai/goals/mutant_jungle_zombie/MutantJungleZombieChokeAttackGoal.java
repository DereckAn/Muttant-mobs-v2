package com.alexander.mutantmore.ai.goals.mutant_jungle_zombie;

import com.alexander.mutantmore.config.mutant_jungle_zombie.MutantJungleZombieCommonConfig;
import com.alexander.mutantmore.entities.MutantJungleZombie;
import com.alexander.mutantmore.init.ItemInit;
import com.alexander.mutantmore.items.JungleZombieArmState;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.MMDamageTypes;
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

public class MutantJungleZombieChokeAttackGoal extends Goal {
   public MutantJungleZombie mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;
   public boolean hitTarget;

   public MutantJungleZombieChokeAttackGoal(MutantJungleZombie mob) {
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
         && this.mob.distanceTo(this.target) <= (Double)MutantJungleZombieCommonConfig.max_strangle_attack_distance.get()
         && this.animationsUseable()
         && this.mob.hasLineOfSight(this.target);
   }

   public boolean canContinueToUse() {
      return !this.mob.shouldBeStationary()
         && this.target != null
         && !this.target.isRemoved()
         && !this.target.isDeadOrDying()
         && (this.mob.tryChokeAnimationTick > 0 || this.mob.chokeAnimationTick > 0);
   }

   public void start() {
      this.mob.tryChokeAnimationTick = 35;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)8);
      this.hitTarget = false;
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null && this.mob.tryChokeAnimationTick >= 24) {
         this.mob.lookAt(Anchor.EYES, this.target.position());
         Vec3 armPos = PositionUtils.getOffsetPos(this.mob, 0.0, this.mob.getEyeHeight(), 0.0, 0.0F, this.mob.yBodyRot);
         double d4 = this.target.getX() - armPos.x;
         double d5 = this.target.getEyeY() - armPos.y;
         double d6 = this.target.getZ() - armPos.z;
         double d7 = Math.sqrt(d4 * d4 + d6 * d6);
         float f1 = (float)(-(Mth.atan2(d5, d7) * 180.0F / (float)Math.PI));
         this.mob.setGrabArmXRot(f1);
      }

      if (this.target != null && this.mob.tryChokeAnimationTick <= 18 && this.mob.tryChokeAnimationTick >= 9) {
         int distance = ((Double)MutantJungleZombieCommonConfig.max_strangle_attack_grab_distance.get()).intValue();

         for (int i = 0; i < distance; i++) {
            Vec3 boundingBoxPos = PositionUtils.getOffsetPos(this.mob, 0.0, this.mob.getEyeHeight(), i, this.mob.getGrabArmXRot(), this.mob.yBodyRot);
            AABB boundingBox = new AABB(boundingBoxPos.add(-0.5, -1.5, -0.5), boundingBoxPos.add(0.5, 0.5, 0.5));
            if (boundingBox.intersects(this.target.getBoundingBox())) {
               this.hitTarget = true;
               this.mob.tryChokeAnimationTick = 0;
               this.mob.chokeAnimationTick = 80;
               this.mob.level().broadcastEntityEvent(this.mob, (byte)9);
            }
         }
      }

      if (this.target != null && this.mob.chokeAnimationTick > 0) {
         if (this.target.isPassenger()) {
            this.target.stopRiding();
         }

         if (this.mob.chokeAnimationTick > 15) {
            this.target.needsSync = true;
            Vec3 targetPos = PositionUtils.getOffsetPos(this.mob, -1.5, this.mob.getEyeHeight(), 1.75, 0.0F, this.mob.yBodyRot);
            this.target.setPos(targetPos);
            this.target.setDeltaMovement(0.0, 0.0, 0.0);
            if (this.target instanceof ServerPlayer && this.mob.tickCount % 3 == 0) {
               ShakeCameraEvent.shake(this.mob.level(), 10, 0.05F, this.target.blockPosition(), 3);
               ((ServerPlayer)this.target).teleportTo(targetPos.x, targetPos.y, targetPos.z);
            }

            this.target.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 20, 255, false, false, false));
            if (this.target.isBlocking() && this.mob.tickCount % 10 == 0 || !this.target.isBlocking()) {
               this.target
                  .hurt(
                     MMDamageTypes.strangleAttack(this.mob.damageSources(), this.mob),
                     this.target.isBlocking() ? 10.0F : ((Double)MutantJungleZombieCommonConfig.strangle_attack_damage.get()).floatValue()
                  );
            }

            if (this.target instanceof ServerPlayer player
               && player.isUsingItem()
               && player.getUseItem().is(ItemInit.MUTANT_JUNGLE_ZOMBIE_ARM)
               && JungleZombieArmState.of(player).grabbedEntity == this.mob) {
               MiscUtils.awardMutantMoreAdvancement(player, "mutantmore/mutant_jungle_zombie_arm_fly", "flew");
            }
         } else if (this.mob.chokeAnimationTick == 15) {
            Vec3 targetMotion = PositionUtils.getOffsetMotion(this.mob, this.mob.getRandom().nextGaussian() * 0.5, 0.5, 2.0, 0.0F, this.mob.yBodyRot);
            this.target.needsSync = true;
            this.target.push(targetMotion.x, targetMotion.y, targetMotion.z);
            this.target
               .addEffect(
                  new MobEffectInstance(
                     MobEffects.POISON,
                     (Integer)MutantJungleZombieCommonConfig.strangle_attack_poison_length.get(),
                     (Integer)MutantJungleZombieCommonConfig.strangle_attack_poison_level.get()
                  )
               );
         }
      }
   }

   public void stop() {
      super.stop();
      int randomAddedCooldown = MutantJungleZombieCommonConfig.max_strangle_attack_cooldown.get()
               - MutantJungleZombieCommonConfig.min_strangle_attack_cooldown.get()
            <= 0
         ? 0
         : this.mob
            .getRandom()
            .nextInt(
               (Integer)MutantJungleZombieCommonConfig.max_strangle_attack_cooldown.get()
                  - (Integer)MutantJungleZombieCommonConfig.min_strangle_attack_cooldown.get()
            );
      int cooldown = (Integer)MutantJungleZombieCommonConfig.min_strangle_attack_cooldown.get() + randomAddedCooldown;
      this.nextUseTime = this.mob.tickCount + cooldown;
      if (!this.hitTarget) {
         this.mob.failedAttacks++;
      } else {
         this.mob.failedAttacks = 0;
      }
   }

   public boolean animationsUseable() {
      return this.mob.tryChokeAnimationTick <= 0;
   }
}
