package com.alexander.mutantmore.ai.goals.mutant_wither_skeleton;

import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.config.mutant_wither_skeleton.MutantWitherSkeletonCommonConfig;
import com.alexander.mutantmore.entities.AreaDamage;
import com.alexander.mutantmore.entities.MutantWitherSkeleton;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.EffectInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.commands.arguments.EntityAnchorArgument.Anchor;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class MutantWitherSkeletonWitherBreathAttackGoal extends Goal {
   public MutantWitherSkeleton mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;
   public boolean madeAreaDamage;

   public MutantWitherSkeletonWitherBreathAttackGoal(MutantWitherSkeleton mob) {
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
      return this.mob.tickCount >= this.nextUseTime
         && MiscUtils.isEntityValid(this.target)
         && MiscUtils.isEntityAttackable(this.mob, this.target, (Double)MutantWitherSkeletonCommonConfig.max_wither_breath_distance.get())
         && this.mob
            .getBoundingBox()
            .intersects(this.target.getBoundingBox().move(this.mob.getX() - this.target.getX(), 0.0, this.mob.getZ() - this.target.getZ()));
   }

   public boolean canContinueToUse() {
      return this.mob.getAnimation("wither_breath").isPlaying();
   }

   public void start() {
      this.mob.stopAndLockIdleAnimations(4, false);
      this.mob.getAnimation("wither_breath").start(5.0F, 4, () -> this.mob.unlockIdleAnimations());
      this.mob.playSound(SoundEventInit.MUTANT_WITHER_SKELETON_DOUBLEATTACK);
      this.madeAreaDamage = false;
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.mob.getAnimation("wither_breath").isProgressAt(1.0F)) {
         this.mob.playSound(SoundEventInit.MUTANT_WITHER_SKELETON_ROAR, 3.0F, 1.0F);
         ShakeCameraEvent.shake(this.mob.level(), 100, 0.1F, this.mob.blockPosition(), 30);
      }

      if (MiscUtils.isEntityValid(this.target)) {
         this.mob.lookAt(Anchor.EYES, this.target.getEyePosition());
      }

      if (this.mob.getAnimation("wither_breath").progress() > 1.0F && !this.madeAreaDamage) {
         this.mob.level().broadcastEntityEvent(this.mob, (byte)11);
         float width = 16.0F;
         Vec3 offsetPos = PositionUtils.getOffsetPos(this.mob, 0.0, 0.0, width / 2.0F + this.mob.getBbWidth(), 0.0F, this.mob.yBodyRot);
         AABB bb = new AABB(offsetPos.add(width / 2.0F, 1.0, width / 2.0F), offsetPos.subtract(width / 2.0F, 1.0, width / 2.0F))
            .move(0.0, this.mob.getBbHeight() / 2.0F, 0.0);
         float damageDistance = (this.mob.getAnimation("wither_breath").progress() - 1.0F) * ((width / 2.0F + this.mob.getBbWidth()) * 0.7F);

         for (LivingEntity entity : this.mob.level().getEntitiesOfClass(LivingEntity.class, bb)) {
            if (entity != this.mob
               && !(entity instanceof Player player && (player.isCreative() || player.isSpectator()))
               && MiscUtils.isEntityValid(entity)
               && this.mob.canHarm(entity)
               && this.mob.hasLineOfSight(entity)
               && this.mob.distanceTo(entity) <= damageDistance) {
               entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, (Integer)MutantWitherSkeletonCommonConfig.wither_breath_blindness_length.get()));
               entity.addEffect(
                  new MobEffectInstance(
                     MobEffects.WITHER,
                     (Integer)MutantWitherSkeletonCommonConfig.wither_breath_wither_length.get(),
                     (Integer)MutantWitherSkeletonCommonConfig.wither_breath_wither_level.get()
                  )
               );
               entity.addEffect(
                  new MobEffectInstance(
                     MobEffects.SLOWNESS,
                     (Integer)MutantWitherSkeletonCommonConfig.wither_breath_slowness_length.get(),
                     (Integer)MutantWitherSkeletonCommonConfig.wither_breath_slowness_level.get()
                  )
               );
               entity.addEffect(
                  new MobEffectInstance(
                     EffectInit.JUMPING_FATIGUE, (Integer)MutantWitherSkeletonCommonConfig.wither_breath_slowness_length.get()
                  )
               );
               entity.needsSync = true;
               double d0 = entity.getX() - this.mob.getX();
               double d1 = entity.getZ() - this.mob.getZ();
               double d2 = Math.max(d0 * d0 + d1 * d1, 0.001);
               entity.push(d0 / d2 * 1.0, 0.0, d1 / d2 * 1.0);
            }
         }

         if (this.mob.getAnimation("wither_breath").progress() >= 3.75) {
            AreaDamage areaDamage = AreaDamage.spawnAreaDamage(
               this.mob.level(),
               offsetPos,
               this.mob,
               0.0F,
               null,
               width,
               width,
               0.0F,
               3.0F,
               200,
               0,
               false,
               false,
               0.0,
               0.0,
               false,
               false,
               0,
               false,
               TagInit.EntityTypes.MUTANT_WITHER_SKELETON_CANT_HURT,
               4
            );
            areaDamage.setSentFrom(BlockPos.containing(this.mob.position().add(0.0, this.mob.getBbHeight() * 0.6, 0.0)));
            ((ServerLevel)this.mob.level()).addFreshEntity(areaDamage);
            this.madeAreaDamage = true;
         }
      }
   }

   public void stop() {
      super.stop();
      this.nextUseTime = this.mob.tickCount
         + MiscUtils.randomIntBetween(
            (Integer)MutantWitherSkeletonCommonConfig.min_wither_breath_cooldown.get(),
            (Integer)MutantWitherSkeletonCommonConfig.max_wither_breath_cooldown.get()
         );
   }
}
