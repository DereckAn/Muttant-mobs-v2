package com.alexander.mutantmore.ai.goals.mutant_husk;

import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.config.mutant_husk.MutantHuskCommonConfig;
import com.alexander.mutantmore.entities.AreaDamage;
import com.alexander.mutantmore.entities.MutantHusk;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import org.jspecify.annotations.Nullable;
import net.minecraft.commands.arguments.EntityAnchorArgument.Anchor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.phys.Vec3;

public class MutantHuskGeyserAttackGoal extends Goal {
   public MutantHusk mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;
   public boolean targetAirborne;
   public int targetAirborneFor;
   public boolean jumped;
   public boolean slammed;
   public boolean readyToStop;
   public List<AreaDamage> areaDamages = Lists.newArrayList();

   public MutantHuskGeyserAttackGoal(MutantHusk mob) {
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
         && !this.target.isRemoved()
         && !this.target.isDeadOrDying()
         && this.mob.distanceTo(this.target) <= (Double)MutantHuskCommonConfig.max_geyser_attack_distance.get()
         && this.animationsUseable()
         && this.mob.hasLineOfSight(this.target);
   }

   public boolean canContinueToUse() {
      if (this.mob.geyserDeathCheck) {
         this.mob.geyserDeathCheck = false;
         return false;
      } else {
         return this.target != null && !this.target.isRemoved() && !this.target.isDeadOrDying() && !this.readyToStop;
      }
   }

   public void start() {
      this.areaDamages.clear();
      this.mob.geyserAnimationTick = 70;
      this.mob.noveltyAnimationTick = 0;
      this.targetAirborneFor = 0;
      this.targetAirborne = false;
      this.jumped = false;
      this.slammed = false;
      this.readyToStop = false;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)11);
      this.mob.playSound(SoundEventInit.MUTANT_HUSK_GEYSER_WARN, 2.5F, 1.0F);
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null) {
         this.mob.lookAt(Anchor.EYES, this.target.position());
      }

      if (this.target != null) {
         if (this.mob.geyserAnimationTick == 70 - 32) {
            this.mob.playSound(SoundEventInit.MUTANT_HUSK_GEYSER_VOCAL, 2.5F, 1.0F);
         }

         if (this.mob.geyserAnimationTick == 37) {
            ShakeCameraEvent.shake(this.mob.level(), 20, 0.15F, this.mob.blockPosition(), 25);

            for (int i = 0; i < MutantHuskCommonConfig.geyser_attack_shockwave_length.get(); i++) {
               Vec3 areaDamagePos = PositionUtils.getOffsetPos(this.mob, 0.0, 0.0, 2.0 + i * 2.5, 0.0F, this.mob.yBodyRot);
               AreaDamage areaDamage = AreaDamage.spawnAreaDamage(
                  this.mob.level(),
                  areaDamagePos,
                  this.mob,
                  ((Double)MutantHuskCommonConfig.geyser_attack_damage.get()).floatValue(),
                  MMDamageTypes.geyserAttack(this.mob.damageSources(), this.mob),
                  2.5F,
                  2.5F,
                  0.0F,
                  12.0F,
                  25,
                  i * 1,
                  false,
                  false,
                  0.0,
                  2.0,
                  true,
                  false,
                  0,
                  (Boolean)MutantHuskCommonConfig.ignores_invulnerability_time.get(),
                  TagInit.EntityTypes.MUTANT_HUSK_CANT_HURT,
                  2
               );
               this.areaDamages.add(areaDamage);
               PositionUtils.moveToCorrectHeight(areaDamage, true);
               areaDamage.setSandType(MiscUtils.sandStringForPos(this.mob.level(), areaDamage.getOnPos()));
               ((ServerLevel)this.mob.level()).addFreshEntityWithPassengers(areaDamage);
            }

            for (AreaDamage areaDamage : this.areaDamages) {
               areaDamage.connectedAreaDamages = Lists.newArrayList(this.areaDamages.iterator());
               areaDamage.connectedAreaDamages.remove(areaDamage);
            }
         }

         if (this.mob.jumpAnimationTick <= 0 && this.mob.slamAnimationTick <= 0 && !this.mob.jumping && !this.jumped) {
            for (AreaDamage areaDamage : this.areaDamages) {
               if (areaDamage.damagedEntities.contains(this.target)) {
                  this.targetAirborne = true;
                  break;
               }
            }

            if (this.targetAirborne) {
               this.targetAirborneFor++;
            }

            if (this.targetAirborneFor >= 10 && !this.target.onGround()) {
               this.mob.jumpAnimationTick = 7;
               this.mob.noveltyAnimationTick = 0;
               this.mob.geyserAnimationTick = 0;
               this.mob.level().broadcastEntityEvent(this.mob, (byte)12);
               this.mob.jumping = true;
               this.jumped = true;
            }
         }

         if (this.mob.jumpAnimationTick == 2) {
            double d0 = this.target.getX() - this.mob.getX();
            double d1 = this.target.getY() - this.mob.getY();
            double d2 = this.target.getZ() - this.mob.getZ();
            this.mob.setDeltaMovement(d0 * 0.175, d1 * 0.1, d2 * 0.175);
         }

         if (this.mob.jumping && this.mob.slamAnimationTick <= 0 && this.mob.distanceTo(this.target) <= 3.0F && !this.slammed) {
            this.mob.slamAnimationTick = 12;
            this.mob.noveltyAnimationTick = 0;
            this.mob.level().broadcastEntityEvent(this.mob, (byte)13);
            this.mob.jumping = false;
            this.slammed = true;
            this.mob.playSound(SoundEventInit.MUTANT_HUSK_GRUNT, 2.0F, 1.0F);
         }

         if (this.mob.slamAnimationTick == 10) {
            double d0 = this.target.getX() - this.mob.getX();
            double d2 = this.target.getZ() - this.mob.getZ();
            if ((Boolean)MutantHuskCommonConfig.ignores_invulnerability_time.get()) {
               this.target.setInvulnerableTime(0);
            }

            boolean flag = this.target
               .hurtServer(getServerLevel(this.mob), this.mob.damageSources().mobAttack(this.mob), ((Double)MutantHuskCommonConfig.geyser_attack_slam_damage.get()).floatValue());
            this.target.needsSync = true;
            MiscUtils.disableShield(this.target, (Integer)MutantHuskCommonConfig.geyser_attack_slam_disable_shield_length.get());
            if (flag) {
               this.target
                  .addEffect(
                     new MobEffectInstance(
                        MobEffects.HUNGER,
                        (Integer)MutantHuskCommonConfig.geyser_attack_slam_hunger_length.get(),
                        (Integer)MutantHuskCommonConfig.geyser_attack_slam_hunger_level.get()
                     ),
                     this.mob
                  );
            }

            this.target.push(d0 * 0.15, -1.2, d2 * 0.15);
            if ((Boolean)MutantHuskCommonConfig.ignores_invulnerability_time.get()) {
               this.target.setInvulnerableTime(0);
            }
         }

         if (this.slammed && this.mob.onGround()) {
            this.readyToStop = true;
         }

         if (this.jumped && this.mob.isOnFire() && // original read Entity.wasOnFire here (likely meant onGround); kept as-is
             this.mob.jumpingFor > 10) {
            this.readyToStop = true;
         }
      }

      if (this.mob.geyserAnimationTick <= 0 && !this.jumped && !this.slammed) {
         boolean noAreaDamages = false;
         if (this.areaDamages.isEmpty()) {
            this.readyToStop = true;
         } else {
            for (AreaDamage areaDamage : this.areaDamages) {
               if (areaDamage == null || areaDamage.isRemoved()) {
                  noAreaDamages = true;
               }
            }
         }

         if (noAreaDamages) {
            this.readyToStop = true;
         }
      }
   }

   public void stop() {
      super.stop();
      int randomAddedCooldown = MutantHuskCommonConfig.max_geyser_attack_cooldown.get() - MutantHuskCommonConfig.min_geyser_attack_cooldown.get() <= 0
         ? 0
         : this.mob
            .getRandom()
            .nextInt((Integer)MutantHuskCommonConfig.max_geyser_attack_cooldown.get() - (Integer)MutantHuskCommonConfig.min_geyser_attack_cooldown.get());
      int cooldown = (Integer)MutantHuskCommonConfig.min_geyser_attack_cooldown.get() + randomAddedCooldown;
      this.nextUseTime = this.mob.tickCount + cooldown;
   }

   public boolean animationsUseable() {
      return this.mob.geyserAnimationTick <= 0;
   }
}
