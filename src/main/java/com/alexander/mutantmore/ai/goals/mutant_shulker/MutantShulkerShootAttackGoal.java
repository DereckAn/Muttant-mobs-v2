package com.alexander.mutantmore.ai.goals.mutant_shulker;

import com.alexander.mutantmore.config.mutant_shulker.MutantShulkerCommonConfig;
import com.alexander.mutantmore.entities.MutantShulker;
import com.alexander.mutantmore.entities.MutantShulkerBullet;
import com.alexander.mutantmore.init.SoundEventInit;
import java.util.EnumSet;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;

public class MutantShulkerShootAttackGoal extends Goal {
   private static final Predicate<Entity> MUTANT_SHULKER_BULLET = p_33346_ -> p_33346_ instanceof MutantShulkerBullet;
   public MutantShulker mob;
   @Nullable
   public LivingEntity target;

   public MutantShulkerShootAttackGoal(MutantShulker mob) {
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
      int nearbyBullets = this.mob.level().getEntities(this.mob, this.mob.getBoundingBox().inflate(100.0), MUTANT_SHULKER_BULLET).size();
      return this.target != null
         && !this.target.isRemoved()
         && !this.target.isDeadOrDying()
         && nearbyBullets <= (Integer)MutantShulkerCommonConfig.shoot_max_nearby_mutant_shulker_bullets.get()
         && this.mob.getRandom().nextInt((Integer)MutantShulkerCommonConfig.shoot_chance.get()) == 0
         && this.animationsUseable()
         && !this.mob.isInBox();
   }

   public boolean canContinueToUse() {
      return this.target != null && !this.target.isRemoved() && !this.target.isDeadOrDying() && !this.animationsUseable();
   }

   public void start() {
      this.mob.playSound(SoundEventInit.MUTANT_SHULKER_IDLE);
      this.mob.shootAnimationTick = this.mob.shootAnimationLength;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)33);
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null) {
         this.mob.getLookControl().setLookAt(this.target);
      }

      if (this.target != null && this.mob.shootAnimationTick == this.mob.shootAnimationActionPoint1) {
         this.mob.shootMutantShulkerProjectile(0.0F, null, true);
      }

      if (this.target != null && this.mob.shootAnimationTick == this.mob.shootAnimationActionPoint2) {
         this.mob.shootMutantShulkerProjectile(-10.0F, null, true);
      }

      if (this.target != null && this.mob.shootAnimationTick == this.mob.shootAnimationActionPoint3) {
         this.mob.shootMutantShulkerProjectile(10.0F, null, true);
      }
   }

   public boolean animationsUseable() {
      return this.mob.shootAnimationTick <= 0;
   }
}
