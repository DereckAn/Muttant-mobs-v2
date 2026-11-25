package com.alexander.mutantmore.ai.goals.mutant_wither_skeleton;

import com.alexander.mutantmore.config.mutant_wither_skeleton.MutantWitherSkeletonCommonConfig;
import com.alexander.mutantmore.entities.MutantWitherSkeleton;
import com.alexander.mutantmore.entities.WitherSlash;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.commands.arguments.EntityAnchorArgument.Anchor;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.phys.Vec3;

public class MutantWitherSkeletonWitherSlashGoal extends Goal {
   public MutantWitherSkeleton mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;

   public MutantWitherSkeletonWitherSlashGoal(MutantWitherSkeleton mob) {
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
         && MiscUtils.isEntityAttackable(
            this.mob,
            this.target,
            (Double)MutantWitherSkeletonCommonConfig.min_wither_slash_distance.get(),
            (Double)MutantWitherSkeletonCommonConfig.max_wither_slash_distance.get()
         );
   }

   public boolean canContinueToUse() {
      return this.mob.getAnimation("wither_slash").isPlaying();
   }

   public void start() {
      this.mob.stopAndLockIdleAnimations(4, false);
      this.mob.getAnimation("wither_slash").start(3.5F, 4, () -> this.mob.unlockIdleAnimations());
      this.mob.playSound(SoundEventInit.MUTANT_WITHER_SKELETON_DOUBLEATTACK);
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (MiscUtils.isEntityValid(this.target)) {
         this.mob.lookAt(Anchor.EYES, this.target.getEyePosition());
      }

      if (this.mob.getAnimation("wither_slash").isProgressAt(0.63F)
         || this.mob.getAnimation("wither_slash").isProgressAt(1.19F)
         || this.mob.getAnimation("wither_slash").isProgressAt(1.67F)
         || this.mob.getAnimation("wither_slash").isProgressAt(2.42F)) {
         this.mob.playSound(SoundEventInit.MUTANT_WITHER_SKELETON_SWOOSH, 3.0F, 1.0F);
         if (MiscUtils.isEntityValid(this.target)) {
            Vec3 projectilePos = PositionUtils.getOffsetPos(
               this.mob,
               this.mob.getRandom().nextGaussian() * 0.5,
               this.mob.getBbHeight() / 2.0F + this.mob.getRandom().nextGaussian() * 0.5,
               2.0,
               0.0F,
               this.mob.yBodyRot
            );
            double x = this.target.getX() - projectilePos.x;
            double y = (this.mob.getAnimation("wither_slash").isProgressAt(2.42F) ? this.target.getY() + 1.9 : this.target.getY(0.5))
               - projectilePos.y;
            double z = this.target.getZ() - projectilePos.z;
            WitherSlash witherSlash = new WitherSlash(this.mob.level(), this.mob, this.mob.yHeadRot);
            witherSlash.snapTo(projectilePos);
            float speed = 2.0F;
            if (this.mob.getAnimation("wither_slash").isProgressAt(2.42F)) {
               witherSlash.setSize(3.0F);
               witherSlash.shoot(x, y, z, speed * 0.75F, 0.0F);
               witherSlash.damage = ((Double)MutantWitherSkeletonCommonConfig.big_wither_slash_damage.get()).floatValue();
               witherSlash.leechAmount = ((Double)MutantWitherSkeletonCommonConfig.big_wither_slash_leech_amount.get()).floatValue();
               witherSlash.witherLength = (Integer)MutantWitherSkeletonCommonConfig.big_wither_slash_wither_length.get();
               witherSlash.witherLevel = (Integer)MutantWitherSkeletonCommonConfig.big_wither_slash_wither_level.get();
            } else {
               witherSlash.shoot(x, y, z, speed, 0.0F);
               witherSlash.damage = ((Double)MutantWitherSkeletonCommonConfig.wither_slash_damage.get()).floatValue();
               witherSlash.leechAmount = ((Double)MutantWitherSkeletonCommonConfig.wither_slash_leech_amount.get()).floatValue();
               witherSlash.witherLength = (Integer)MutantWitherSkeletonCommonConfig.wither_slash_wither_length.get();
               witherSlash.witherLevel = (Integer)MutantWitherSkeletonCommonConfig.wither_slash_wither_level.get();
            }

            witherSlash.ignoresInvulTime = (Boolean)MutantWitherSkeletonCommonConfig.ignores_invulnerability_time.get();
            this.mob.playSound(SoundEventInit.MUTANT_WITHER_SKELETON_FIRE_SLASH, 3.0F, 1.0F / witherSlash.getSize());
            this.mob.level().addFreshEntity(witherSlash);
         }
      }
   }

   public void stop() {
      super.stop();
      this.nextUseTime = this.mob.tickCount
         + MiscUtils.randomIntBetween(
            (Integer)MutantWitherSkeletonCommonConfig.min_wither_slash_cooldown.get(),
            (Integer)MutantWitherSkeletonCommonConfig.max_wither_slash_cooldown.get()
         );
   }
}
