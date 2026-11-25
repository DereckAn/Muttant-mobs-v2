package com.alexander.mutantmore.ai.goals.mutant_wither_skeleton;

import net.minecraft.server.level.ServerLevel;
import com.alexander.mutantmore.config.mutant_wither_skeleton.MutantWitherSkeletonCommonConfig;
import com.alexander.mutantmore.entities.MutantWitherSkeleton;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.EffectInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.commands.arguments.EntityAnchorArgument.Anchor;
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

public class MutantWitherSkeletonBlockGoal extends Goal {
   public MutantWitherSkeleton mob;
   @Nullable
   public LivingEntity target;

   public MutantWitherSkeletonBlockGoal(MutantWitherSkeleton mob) {
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
      return this.mob.getAnimation("block").isPlaying();
   }

   public boolean canContinueToUse() {
      return this.mob.getAnimation("block").isPlaying();
   }

   public void start() {
      super.start();
      this.mob.playSound(SoundEventInit.MUTANT_WITHER_SKELETON_LAND_HIT);
      ShakeCameraEvent.shake(this.mob.level(), 20, 0.05F, this.mob.blockPosition(), 5);
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (MiscUtils.isEntityValid(this.target)) {
         this.mob.lookAt(Anchor.EYES, this.target.getEyePosition());
      }

      if (this.mob.getAnimation("block").isProgressAt(1.0F)) {
         this.mob.playSound(SoundEventInit.MUTANT_WITHER_SKELETON_DOUBLESWORD);
         ShakeCameraEvent.shake(this.mob.level(), 10, 0.15F, this.mob.blockPosition(), 20);
         float width = this.mob.getBbWidth() * 1.25F;
         Vec3 bbOffset = PositionUtils.getOffsetPos(this.mob, 0.0, 0.0, width * 2.0F, 0.0F, this.mob.yBodyRot);
         AABB bb = new AABB(bbOffset.add(width, width, width), bbOffset.subtract(width, width, width)).move(0.0, this.mob.getBbHeight() / 2.0F, 0.0);

         for (LivingEntity entity : this.mob.level().getEntitiesOfClass(LivingEntity.class, bb)) {
            Vec3 knockback = PositionUtils.getOffsetMotion(entity, 0.0, 0.5, entity instanceof Player ? 10.0 : 4.0, 0.0F, this.mob.yBodyRot);
            entity.needsSync = true;
            entity.snapTo(entity.position().add(0.0, 0.1, 0.0));
            entity.setDeltaMovement(entity.getDeltaMovement().add(knockback.x, knockback.y, knockback.z));
            entity.hurtServer(getServerLevel(this.mob), this.mob.damageSources().mobAttack(this.mob), ((Double)MutantWitherSkeletonCommonConfig.block_damage.get()).floatValue());
            entity.addEffect(
               new MobEffectInstance(
                  MobEffects.SLOWNESS,
                  (Integer)MutantWitherSkeletonCommonConfig.block_slowness_length.get(),
                  (Integer)MutantWitherSkeletonCommonConfig.block_slowness_level.get()
               )
            );
            entity.addEffect(
               new MobEffectInstance(EffectInit.JUMPING_FATIGUE, (Integer)MutantWitherSkeletonCommonConfig.block_slowness_length.get(), 0)
            );
         }
      }
   }
}
