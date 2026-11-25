package com.alexander.mutantmore.ai.goals.mutant_wither_skeleton;

import com.alexander.mutantmore.config.mutant_wither_skeleton.MutantWitherSkeletonCommonConfig;
import com.alexander.mutantmore.entities.MutantWitherSkeleton;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.util.MiscUtils;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.commands.arguments.EntityAnchorArgument.Anchor;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;

public class MutantWitherSkeletonRibCrushAttackGoal extends Goal {
   public MutantWitherSkeleton mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;

   public MutantWitherSkeletonRibCrushAttackGoal(MutantWitherSkeleton mob) {
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
         && MiscUtils.isEntityAttackable(this.mob, this.target, (Double)MutantWitherSkeletonCommonConfig.max_rib_crush_distance.get());
   }

   public boolean canContinueToUse() {
      return this.mob.getAnimation("rib_crush").isPlaying();
   }

   public void start() {
      this.mob.stopAndLockIdleAnimations(4, false);
      this.mob.getAnimation("rib_crush").start(1.75F, 4, () -> this.mob.unlockIdleAnimations());
      this.mob.playSound(SoundEventInit.MUTANT_WITHER_SKELETON_DOUBLEATTACK);
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.mob.getAnimation("rib_crush").isProgressAt(0.88F)) {
         this.mob.playSound(SoundEventInit.MUTANT_WITHER_SKELETON_RIBCRUSH);
         ShakeCameraEvent.shake(this.mob.level(), 10, 0.25F, this.mob.blockPosition(), 10);
      }

      if (MiscUtils.isEntityValid(this.target)) {
         this.mob.lookAt(Anchor.EYES, this.target.getEyePosition());
         if (MiscUtils.isEntityAttackable(this.mob, this.target, (Double)MutantWitherSkeletonCommonConfig.max_rib_crush_damage_distance.get())
            && this.mob.getAnimation("rib_crush").isProgressAt(0.88F)) {
            if ((Boolean)MutantWitherSkeletonCommonConfig.ignores_invulnerability_time.get()) {
               this.target.setInvulnerableTime(0);
            }

            boolean flag = this.target
               .hurtServer(
                  getServerLevel(this.mob),
                  MMDamageTypes.ribCrushAttack(this.mob.damageSources(), this.mob), ((Double)MutantWitherSkeletonCommonConfig.rib_crush_damage.get()).floatValue()
               );
            if (flag) {
               this.target.needsSync = true;
               this.target.push(this.mob.getRandom().nextGaussian(), 0.2 + this.mob.getRandom().nextFloat() * 0.5, this.mob.getRandom().nextGaussian());
               this.target
                  .addEffect(
                     new MobEffectInstance(
                        MobEffects.WITHER,
                        (Integer)MutantWitherSkeletonCommonConfig.rib_crush_wither_length.get(),
                        (Integer)MutantWitherSkeletonCommonConfig.rib_crush_wither_level.get()
                     ),
                     this.mob
                  );
               this.mob
                  .leechHealth(
                     ((Double)MutantWitherSkeletonCommonConfig.rib_crush_leech_amount.get()).floatValue(),
                     this.target.position().add(0.0, this.target.getBbHeight() / 2.0F, 0.0)
                  );
            }

            MiscUtils.disableShield(this.target, (Integer)MutantWitherSkeletonCommonConfig.rib_crush_disable_shield_length.get());
         }
      }
   }

   public void stop() {
      super.stop();
      this.nextUseTime = this.mob.tickCount
         + MiscUtils.randomIntBetween(
            (Integer)MutantWitherSkeletonCommonConfig.min_rib_crush_cooldown.get(), (Integer)MutantWitherSkeletonCommonConfig.max_rib_crush_cooldown.get()
         );
   }
}
