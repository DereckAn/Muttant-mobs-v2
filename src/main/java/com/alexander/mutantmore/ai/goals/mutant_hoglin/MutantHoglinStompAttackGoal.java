package com.alexander.mutantmore.ai.goals.mutant_hoglin;

import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinCommonConfig;
import com.alexander.mutantmore.entities.MutantHoglin;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class MutantHoglinStompAttackGoal extends Goal {
   public MutantHoglin mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;

   public MutantHoglinStompAttackGoal(MutantHoglin mob) {
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
         && this.animationsUseable();
   }

   public boolean canContinueToUse() {
      return !this.animationsUseable();
   }

   public void start() {
      this.mob.stompAnimationTick = 50;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)11);
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null) {
         this.mob.getLookControl().setLookAt(this.target);
      }

      if (this.mob.stompAnimationTick == 39 || this.mob.stompAnimationTick == 24 || this.mob.stompAnimationTick == 13) {
         Vec3 particlePos = PositionUtils.getOffsetPos(this.mob, 1.375, 0.0, 1.1, 0.0F, this.mob.yBodyRot);
         ((ServerLevel)this.mob.level())
            .sendParticles(
               ParticleTypeInit.SHOCKWAVE, particlePos.x, particlePos.y, particlePos.z, 1, 0.0, 0.0, 0.0, 0.0
            );
         this.mob.level().broadcastEntityEvent(this.mob, (byte)15);
         ShakeCameraEvent.shake(this.mob.level(), 6, 0.15F, this.mob.blockPosition(), ((Double)MutantHoglinCommonConfig.stomp_attack_range.get()).intValue());

         for (Entity entity : this.mob
            .level()
            .getEntitiesOfClass(
               LivingEntity.class,
               this.mob
                  .getBoundingBox()
                  .inflate(
                     (Double)MutantHoglinCommonConfig.stomp_attack_range.get(),
                     (Double)MutantHoglinCommonConfig.stomp_attack_range.get(),
                     (Double)MutantHoglinCommonConfig.stomp_attack_range.get()
                  ),
               MiscUtils.ALIVE
            )) {
            if (entity != this.mob && (entity.onGround() || entity.isPassenger() && entity.getRootVehicle().onGround())) {
               if (this.mob.canHarm(entity)) {
                  if ((Boolean)MutantHoglinCommonConfig.ignores_invulnerability_time.get()) {
                     entity.setInvulnerableTime(0);
                  }

                  entity.hurt(
                     MMDamageTypes.earthquakeAttack(this.mob.damageSources(), this.mob),
                     ((Double)MutantHoglinCommonConfig.stomp_attack_damage.get()).floatValue() * this.mob.enragedDamageMultiplier()
                  );
               }

               entity.push(this.mob.getRandom().nextGaussian() * 0.5, 0.5 * this.mob.enragedKnockbackMultiplier(), this.mob.getRandom().nextGaussian() * 0.5);
            }
         }

         if ((Boolean)MutantHoglinCommonConfig.stomp_griefing.get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get()) {
            AABB griefingBoundingBox = this.mob
               .getBoundingBox()
               .inflate(
                  (Double)MutantHoglinCommonConfig.stomp_attack_range.get(),
                  (Double)MutantHoglinCommonConfig.stomp_attack_range.get() * 3.0,
                  (Double)MutantHoglinCommonConfig.stomp_attack_range.get()
               );

            for (BlockPos blockpos : BlockPos.betweenClosed(
               Mth.floor(griefingBoundingBox.minX),
               Mth.floor(griefingBoundingBox.minY),
               Mth.floor(griefingBoundingBox.minZ),
               Mth.floor(griefingBoundingBox.maxX),
               Mth.floor(griefingBoundingBox.maxY),
               Mth.floor(griefingBoundingBox.maxZ)
            )) {
               BlockState blockstate = this.mob.level().getBlockState(blockpos);
               if (blockstate.is(TagInit.Blocks.MUTANT_HOGLIN_STOMP_BREAKS)) {
                  this.mob
                     .level()
                     .destroyBlock(
                        blockpos,
                        (Boolean)MutantHoglinCommonConfig.stomp_griefing_drops_blocks.get()
                           || (Boolean)MutantMoreGroupedOptionsCommonConfig.griefing_drops_blocks_on.get()
                     );
               }

               if (!blockstate.is(TagInit.Blocks.UNBREAKABLE)
                  && !blockstate.isAir()
                  && this.mob.level().getBlockState(blockpos.below()).isAir()
                  && this.mob.getRandom().nextInt(100) == 0) {
                  FallingBlockEntity fallingBlock = FallingBlockEntity.fall(this.mob.level(), blockpos, blockstate);
                  fallingBlock.setHurtsEntities(
                     ((Double)MutantHoglinCommonConfig.stomp_attack_falling_block_damage.get()).floatValue(),
                     ((Double)MutantHoglinCommonConfig.stomp_attack_falling_block_damage.get()).intValue()
                  );
               }
            }
         }
      }
   }

   public void stop() {
      super.stop();
      int randomAddedCooldown = MutantHoglinCommonConfig.max_stomp_cooldown.get() - MutantHoglinCommonConfig.min_stomp_cooldown.get() <= 0
         ? 0
         : this.mob
            .getRandom()
            .nextInt((Integer)MutantHoglinCommonConfig.max_stomp_cooldown.get() - (Integer)MutantHoglinCommonConfig.min_stomp_cooldown.get());
      int cooldown = (Integer)MutantHoglinCommonConfig.min_stomp_cooldown.get() + randomAddedCooldown;
      this.nextUseTime = this.mob.tickCount + cooldown;
   }

   public boolean animationsUseable() {
      return this.mob.stompAnimationTick <= 0;
   }
}
