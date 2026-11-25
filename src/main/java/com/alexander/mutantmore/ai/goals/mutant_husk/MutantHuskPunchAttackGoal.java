package com.alexander.mutantmore.ai.goals.mutant_husk;

import com.alexander.mutantmore.blocks.QuicksandBlock;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.mutant_husk.MutantHuskCommonConfig;
import com.alexander.mutantmore.entities.AreaDamage;
import com.alexander.mutantmore.entities.MutantHusk;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.particles.AdvancedParticleOption;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import org.jspecify.annotations.Nullable;
import net.minecraft.commands.arguments.EntityAnchorArgument.Anchor;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class MutantHuskPunchAttackGoal extends Goal {
   public MutantHusk mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;
   public List<AreaDamage> areaDamages = Lists.newArrayList();

   public MutantHuskPunchAttackGoal(MutantHusk mob) {
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
         && this.mob.distanceTo(this.target) <= (Double)MutantHuskCommonConfig.max_punch_attack_distance.get()
         && this.animationsUseable()
         && this.mob.hasLineOfSight(this.target);
   }

   public boolean canContinueToUse() {
      return !this.animationsUseable();
   }

   public void start() {
      this.areaDamages.clear();
      this.mob.trapAnimationTick = 55;
      this.mob.noveltyAnimationTick = 0;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)9);
      this.mob.playSound(SoundEventInit.MUTANT_HUSK_PUNCH, 2.0F, 1.0F);
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null) {
         this.mob.lookAt(Anchor.EYES, this.target.position());
      }

      if (this.mob.trapAnimationTick == 33) {
         Vec3 slamAttackBoundingBoxOffset = PositionUtils.getOffsetPos(this.mob, 0.0, 0.0, 2.5, 0.0F, this.mob.yBodyRot);
         String sandType = MiscUtils.sandStringForPos(this.mob.level(), BlockPos.containing(slamAttackBoundingBoxOffset).below());
         AABB slamAttackBoundingBox = this.mob
            .getBoundingBox()
            .deflate(0.0, 2.0, 0.0)
            .move(0.0, -1.0, 0.0)
            .inflate(0.5, 1.0, 0.5)
            .move(
               slamAttackBoundingBoxOffset.x - this.mob.getX(),
               slamAttackBoundingBoxOffset.y - this.mob.getY(),
               slamAttackBoundingBoxOffset.z - this.mob.getZ()
            );
         if ((Boolean)MutantHuskCommonConfig.punch_attack_griefing.get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.quicksand_griefing_off.get()) {
            for (BlockPos blockpos : BlockPos.betweenClosed(
               Mth.floor(slamAttackBoundingBox.minX),
               Mth.floor(slamAttackBoundingBox.minY),
               Mth.floor(slamAttackBoundingBox.minZ),
               Mth.floor(slamAttackBoundingBox.maxX),
               Mth.floor(slamAttackBoundingBox.maxY),
               Mth.floor(slamAttackBoundingBox.maxZ)
            )) {
               BlockState blockstate = this.mob.level().getBlockState(blockpos);
               if (blockstate.isAir() && QuicksandBlock.survivable(MiscUtils.quicksandBlockForSandType(sandType).defaultBlockState(), this.mob.level(), blockpos)) {
                  this.mob.level().setBlockAndUpdate(blockpos, MiscUtils.quicksandBlockForSandType(sandType).defaultBlockState());
               }
            }
         }

         ((ServerLevel)this.mob.level())
            .sendParticles(
               new AdvancedParticleOption(ParticleTypeInit.SAND, List.of((float)MiscUtils.sandColourForSandType(sandType))),
               slamAttackBoundingBoxOffset.x,
               slamAttackBoundingBoxOffset.y,
               slamAttackBoundingBoxOffset.z,
               30,
               1.0,
               0.0,
               1.0,
               0.0
            );
         ShakeCameraEvent.shake(this.mob.level(), 13, 0.15F, this.mob.blockPosition(), 15);

         for (LivingEntity entity : getServerLevel(this.mob).getNearbyEntities(LivingEntity.class, TargetingConditions.forCombat(), this.mob, slamAttackBoundingBox)) {
            if (entity != this.mob && this.mob.canHarm(entity)) {
               if ((Boolean)MutantHuskCommonConfig.ignores_invulnerability_time.get()) {
                  entity.setInvulnerableTime(0);
               }

               boolean flag = entity.hurtServer(getServerLevel(this.mob), this.mob.damageSources().mobAttack(this.mob), ((Double)MutantHuskCommonConfig.punch_attack_damage.get()).floatValue());
               if (flag) {
                  entity.addEffect(
                     new MobEffectInstance(
                        MobEffects.HUNGER,
                        (Integer)MutantHuskCommonConfig.punch_attack_hunger_length.get(),
                        (Integer)MutantHuskCommonConfig.punch_attack_hunger_level.get()
                     ),
                     this.mob
                  );
               }

               MiscUtils.disableShield(this.target, (Integer)MutantHuskCommonConfig.punch_attack_disable_shield_length.get());
            }
         }
      }
   }

   public void stop() {
      super.stop();
      this.nextUseTime = this.mob.tickCount + (Integer)MutantHuskCommonConfig.punch_attack_cooldown.get();
   }

   public boolean animationsUseable() {
      return this.mob.trapAnimationTick <= 0;
   }
}
