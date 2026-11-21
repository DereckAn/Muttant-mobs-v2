package com.alexander.mutantmore.entities;

import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.ai.goals.AllDirectionsTargetGoal;
import com.alexander.mutantmore.ai.goals.ApproachTargetGoal;
import com.alexander.mutantmore.ai.goals.GroundPullAntiCheeseGoal;
import com.alexander.mutantmore.ai.goals.LookAtTargetGoal;
import com.alexander.mutantmore.ai.goals.mutant_hoglin.MutantHoglinChargeAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_hoglin.MutantHoglinKickAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_hoglin.MutantHoglinMeleeAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_hoglin.MutantHoglinStompAttackGoal;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinClientConfig;
import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinCommonConfig;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.hoglin.HoglinBase;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class MutantHoglin extends AbstractMutant {
   public AnimationState noveltyAnimationState = new AnimationState();
   public int noveltyAnimationTick;
   public final int noveltyAnimationLength = 30;
   public AnimationState attackAnimationState = new AnimationState();
   public int attackAnimationTick;
   public final int attackAnimationLength = 22;
   public final int attackAnimationActionPoint = 13;
   public AnimationState stompAnimationState = new AnimationState();
   public int stompAnimationTick;
   public final int stompAnimationLength = 50;
   public final int stompAnimationActionPoint1 = 39;
   public final int stompAnimationActionPoint2 = 24;
   public final int stompAnimationActionPoint3 = 13;
   public AnimationState kickAnimationState = new AnimationState();
   public int kickAnimationTick;
   public final int kickAnimationLength = 45;
   public final int kickAnimationActionPoint = 24;
   public AnimationState prepareChargeAnimationState = new AnimationState();
   public int prepareChargeAnimationTick;
   public final int prepareChargeAnimationLength = 26;
   public AnimationState introAnimationState = new AnimationState();
   public int introAnimationTick;
   public final int introAnimationLength = 28;
   public AnimationState deathAnimationState = new AnimationState();
   public AnimationState danceAnimationState = new AnimationState();
   public final int deathAnimationActionPoint = 65;
   public boolean charging;
   public boolean dancing;
   public float enragedAmount;
   public int enrageDuration;
   public boolean wantsToCharge;
   public DamageSource killedBy = this.damageSources().cramming();

   public MutantHoglin(EntityType<? extends MutantHoglin> p_i50189_1_, Level p_i50189_2_) {
      super(p_i50189_1_, p_i50189_2_);
      this.xpReward = (Integer)MutantHoglinCommonConfig.exp_reward.get();
   }

   protected void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(0, new MutantHoglin.RemainStationaryGoal());
      this.goalSelector.addGoal(1, new GroundPullAntiCheeseGoal(this));
      if ((Boolean)MutantHoglinCommonConfig.uses_charge.get()) {
         this.goalSelector.addGoal(2, new MutantHoglinChargeAttackGoal(this));
      }

      if ((Boolean)MutantHoglinCommonConfig.uses_stomp_attack.get()) {
         this.goalSelector.addGoal(3, new MutantHoglinStompAttackGoal(this));
      }

      if ((Boolean)MutantHoglinCommonConfig.uses_basic_attack.get()) {
         this.goalSelector.addGoal(4, new MutantHoglinMeleeAttackGoal(this));
      }

      if ((Boolean)MutantHoglinCommonConfig.uses_kick_attack.get()) {
         this.goalSelector.addGoal(5, new MutantHoglinKickAttackGoal(this));
      }

      this.goalSelector
         .addGoal(
            6,
            new ApproachTargetGoal(
               this,
               (Double)MutantHoglinCommonConfig.follow_target_wanted_distance.get(),
               (Double)MutantHoglinCommonConfig.following_movement_speed_multiplier.get(),
               true
            )
         );
      this.goalSelector.addGoal(7, new LookAtTargetGoal(this));
      this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 20.0F));
      this.goalSelector.addGoal(8, new WaterAvoidingRandomStrollGoal(this, 1.0));
      this.goalSelector.addGoal(9, new LookAtPlayerGoal(this, Mob.class, 10.0F));
      this.goalSelector.addGoal(10, new RandomLookAroundGoal(this));
      this.targetSelector.addGoal(0, new HurtByTargetGoal(this, new Class[0]).setUnseenMemoryTicks(6000));
      if ((Boolean)MutantHoglinCommonConfig.attacks_players.get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mutants_attack_players_off.get()) {
         this.targetSelector.addGoal(1, new AllDirectionsTargetGoal(this, Player.class, true).setUnseenMemoryTicks(6000));
      }

      this.targetSelector
         .addGoal(
            2,
            new NearestAttackableTargetGoal<LivingEntity>(
               this, LivingEntity.class, 20, false, false, (entity, level) -> entity.is(TagInit.EntityTypes.MUTANT_HOGLIN_TARGETS)
            ) {
               protected AABB getTargetSearchArea(double p_26069_) {
                  return this.mob
                     .getBoundingBox()
                     .inflate(
                        (Double)MutantHoglinCommonConfig.follow_non_player_distance.get(),
                        (Double)MutantHoglinCommonConfig.follow_non_player_distance.get(),
                        (Double)MutantHoglinCommonConfig.follow_non_player_distance.get()
                     );
               }
            }
         );
   }

   public boolean shouldBeStationary() {
      return this.introAnimationTick > 0;
   }

   public boolean canAttack(LivingEntity target) {
      return this.canTarget(target) && super.canAttack(target);
   }

   boolean canTarget(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_HOGLIN_CANT_TARGET, this, target, this, null);
   }

   public boolean canHarm(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_HOGLIN_CANT_HURT, this, target, this, null);
   }

   public static Builder createConfiguredAttributes() {
      return Mob.createMobAttributes()
         .add(Attributes.MAX_HEALTH, (Double)MutantHoglinCommonConfig.max_health.get())
         .add(Attributes.ARMOR, (Double)MutantHoglinCommonConfig.armour.get())
         .add(Attributes.ARMOR_TOUGHNESS, (Double)MutantHoglinCommonConfig.armour_toughness.get())
         .add(Attributes.KNOCKBACK_RESISTANCE, (Double)MutantHoglinCommonConfig.knockback_resistance.get())
         .add(Attributes.FOLLOW_RANGE, (Double)MutantHoglinCommonConfig.follow_player_distance.get())
         .add(Attributes.MOVEMENT_SPEED, (Double)MutantHoglinCommonConfig.movement_speed.get())
         .add(Attributes.ATTACK_DAMAGE, (Double)MutantHoglinCommonConfig.basic_attack_damage.get())
         .add(Attributes.ATTACK_KNOCKBACK, (Double)MutantHoglinCommonConfig.attack_knockback.get())
         .add(Attributes.STEP_HEIGHT, 1.6);
   }

   protected SoundEvent getAmbientSound() {
      return SoundEventInit.MUTANT_HOGLIN_IDLE;
   }

   protected SoundEvent getHurtSound(DamageSource p_33034_) {
      return SoundEventInit.MUTANT_HOGLIN_HURT;
   }

   protected void playStepSound(BlockPos p_20135_, BlockState p_20136_) {
      this.playSound(SoundEventInit.MUTANT_HOGLIN_STEP, 0.75F, 1.0F);
   }

   protected float getSoundVolume() {
      return 1.5F;
   }

   public float getEnragedAmount() {
      return Mth.clamp(this.enragedAmount, 0.0F, 1.0F);
   }

   @Override
   public boolean doHurtTarget(ServerLevel level, Entity p_34207_) {
      return !(p_34207_ instanceof LivingEntity) ? false : HoglinBase.hurtAndThrowTarget(level, this, (LivingEntity)p_34207_);
   }

   public boolean notCurrentlyPlayingKeyframeAnimation() {
      return this.noveltyAnimationTick <= 0
         && this.introAnimationTick <= 0
         && this.kickAnimationTick <= 0
         && this.attackAnimationTick <= 0
         && this.prepareChargeAnimationTick <= 0
         && this.stompAnimationTick <= 0;
   }

   @Override
   public void aiStep() {
      super.aiStep();
      if (this.charging) {
         for (Entity entity : this.level().getEntities(this, this.getBoundingBox())) {
            if (this.canHarm(entity)) {
               double d0 = entity.getX() - this.getX();
               double d1 = entity.getZ() - this.getZ();
               double d2 = Math.max(d0 * d0 + d1 * d1, 0.001);
               entity.push(d0 / d2 * 4.0, 0.2, d1 / d2 * 4.0);
               if (this.level() instanceof ServerLevel serverLevel) entity.hurtServer(serverLevel,
                  MMDamageTypes.cantAvoidMobAttack(this.damageSources(), this),
                  ((Double)MutantHoglinCommonConfig.charge_attack_damage.get()).floatValue() * this.enragedDamageMultiplier()
               );
               if (entity instanceof LivingEntity) {
                  MiscUtils.disableShield((LivingEntity)entity, (Integer)MutantHoglinCommonConfig.charge_disable_shield_length.get());
               }
            }
         }

         if (!this.level().isClientSide()
            && this.tickCount % 2 == 0
            && this.horizontalCollision
            && (Boolean)MutantHoglinCommonConfig.charge_griefing.get()
            && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get()) {
            boolean flag = false;
            AABB aabb = this.getBoundingBox().inflate(0.2, 0.0, 0.2);

            for (BlockPos blockpos : BlockPos.betweenClosed(
               Mth.floor(aabb.minX),
               Mth.floor(aabb.minY),
               Mth.floor(aabb.minZ),
               Mth.floor(aabb.maxX),
               Mth.floor(aabb.maxY),
               Mth.floor(aabb.maxZ)
            )) {
               BlockState blockstate = this.level().getBlockState(blockpos);
               if (!blockstate.is(TagInit.Blocks.UNBREAKABLE)) {
                  flag = this.level()
                        .destroyBlock(
                           blockpos,
                           (Boolean)MutantHoglinCommonConfig.charge_griefing_drops_blocks.get()
                              || (Boolean)MutantMoreGroupedOptionsCommonConfig.griefing_drops_blocks_on.get(),
                           this
                        )
                     || flag;
               }
            }

            if (!flag && this.onGround()) {
               this.jumpFromGround();
            }
         }
      }
   }

   public float enragedSpeedMultiplier() {
      return 1.0F + this.enragedAmount * ((Number)MutantHoglinCommonConfig.enraged_speed_multiplier.get()).floatValue();
   }

   public float enragedDamageMultiplier() {
      return 1.0F + this.enragedAmount * ((Number)MutantHoglinCommonConfig.enraged_damage_multiplier.get()).floatValue();
   }

   public float enragedKnockbackMultiplier() {
      return 1.0F + this.enragedAmount * ((Number)MutantHoglinCommonConfig.enraged_knockback_multiplier.get()).floatValue();
   }

   @Override
   public void baseTick() {
      super.baseTick();
      this.tickDownAnimTimers();
      this.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((Double)MutantHoglinCommonConfig.movement_speed.get() * this.enragedSpeedMultiplier());
      this.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue((Double)MutantHoglinCommonConfig.basic_attack_damage.get() * this.enragedDamageMultiplier());
      this.getAttribute(Attributes.ATTACK_KNOCKBACK).setBaseValue((Double)MutantHoglinCommonConfig.attack_knockback.get() * this.enragedKnockbackMultiplier());
      if (this.enrageDuration > 0) {
         this.enrageDuration--;
      }

      if (this.enrageDuration <= 0 && this.getEnragedAmount() > 0.0F) {
         float amount = this.enragedAmount = this.getEnragedAmount() - ((Number)MutantHoglinCommonConfig.enrage_lower_speed.get()).floatValue();
         if (amount <= 0.0F) {
            this.enragedAmount = 0.0F;
         } else {
            this.enragedAmount = amount;
         }
      }

      Vec3 velocity = this.getDeltaMovement();
      float groundSpeed = Mth.sqrt((float)(velocity.x * velocity.x + velocity.z * velocity.z));
      if (!this.level().isClientSide()
         && groundSpeed <= 0.01F
         && this.noveltyAnimationTick <= 0
         && this.random.nextInt(400) == 0
         && this.notCurrentlyPlayingKeyframeAnimation()
         && (this.getTarget() == null || this.getTarget().isDeadOrDying() || this.getTarget().isRemoved())) {
         this.noveltyAnimationTick = 30;
         this.level().broadcastEntityEvent(this, (byte)4);
      }

      if (!this.level().isClientSide() && this.noveltyAnimationTick > 0 && groundSpeed > 0.01F) {
         this.noveltyAnimationTick = 0;
         this.level().broadcastEntityEvent(this, (byte)5);
      }

      if (this.level().isClientSide() && this.charging) {
         ShakeCameraEvent.shake(this.level(), 6, 0.015F, this.blockPosition(), 10);
      }
   }

   public void enrage() {
      if (!this.level().isClientSide()) {
         this.level().broadcastEntityEvent(this, (byte)16);
      }

      this.enragedAmount = Mth.clamp(this.getEnragedAmount() + ((Number)MutantHoglinCommonConfig.enrage_amount.get()).floatValue(), 0.0F, 1.0F);
      this.enrageDuration = Mth.clamp(
         this.enrageDuration + (Integer)MutantHoglinCommonConfig.enrage_duration.get(), 0, (Integer)MutantHoglinCommonConfig.max_enrage_duration.get()
      );
   }

   public void tickDownAnimTimers() {
      if (this.noveltyAnimationTick > 0) {
         this.noveltyAnimationTick--;
      }

      if (this.level().isClientSide() && this.noveltyAnimationTick <= 0) {
         this.noveltyAnimationState.stop();
      }

      if (this.attackAnimationTick > 0) {
         this.attackAnimationTick--;
      }

      if (this.level().isClientSide() && this.attackAnimationTick <= 0) {
         this.attackAnimationState.stop();
      }

      if (this.kickAnimationTick > 0) {
         this.kickAnimationTick--;
      }

      if (this.level().isClientSide() && this.kickAnimationTick <= 0) {
         this.kickAnimationState.stop();
      }

      if (this.prepareChargeAnimationTick > 0) {
         this.prepareChargeAnimationTick--;
      }

      if (this.level().isClientSide() && this.prepareChargeAnimationTick <= 0) {
         this.prepareChargeAnimationState.stop();
      }

      if (this.stompAnimationTick > 0) {
         this.stompAnimationTick--;
      }

      if (this.level().isClientSide() && this.stompAnimationTick <= 0) {
         this.stompAnimationState.stop();
      }

      if (this.introAnimationTick > 0) {
         this.introAnimationTick--;
      }

      if (this.level().isClientSide() && this.introAnimationTick <= 0) {
         this.introAnimationState.stop();
      }
   }

   public void handleEntityEvent(byte p_21375_) {
      if (p_21375_ == 4) {
         this.noveltyAnimationTick = 30;
         this.noveltyAnimationState.start(this.tickCount);
      } else if (p_21375_ == 5) {
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 6) {
         this.attackAnimationTick = 22;
         this.attackAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 7) {
         this.deathAnimationState.start(this.tickCount);
      } else if (p_21375_ == 8) {
         this.danceAnimationState.start(this.tickCount);
         this.dancing = true;
      } else if (p_21375_ == 9) {
         this.kickAnimationTick = 45;
         this.kickAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 10) {
         this.prepareChargeAnimationTick = 26;
         this.prepareChargeAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 11) {
         this.stompAnimationTick = 50;
         this.stompAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 12) {
         this.charging = true;
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 13) {
         this.charging = false;
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 14) {
         this.introAnimationTick = 28;
         this.introAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 15) {
         AABB griefingBoundingBox = this.getBoundingBox()
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
            BlockState blockstate = this.level().getBlockState(blockpos);
            if (!blockstate.isAir() && this.level().getBlockState(blockpos.above()).isAir() && this.random.nextBoolean()) {
               this.level()
                  .addParticle(
                     new BlockParticleOption(ParticleTypes.BLOCK, blockstate),
                     blockpos.getX() + this.random.nextGaussian() * 0.5,
                     blockpos.above().getY() + 0.1,
                     blockpos.getZ() + this.random.nextGaussian() * 0.5,
                     this.random.nextGaussian(),
                     0.0,
                     this.random.nextGaussian()
                  );
            }
         }
      } else if (p_21375_ == 16) {
         this.enrage();
      } else {
         super.handleEntityEvent(p_21375_);
      }
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource p_21016_, float p_21017_) {
      boolean flag = super.hurtServer(level, p_21016_, p_21017_);
      if (flag) {
         this.enrage();
         if (p_21016_.getEntity() != null && p_21016_.getEntity() instanceof ServerPlayer && this.getEnragedAmount() >= 1.0F) {
            MiscUtils.awardMutantMoreAdvancement((ServerPlayer)p_21016_.getEntity(), "mutantmore/enrage_mutant_hoglin", "enraged");
         }
      }

      return flag;
   }

   @Override
   public boolean isInvulnerableTo(ServerLevel level, DamageSource p_20122_) {
      return p_20122_.is(DamageTypes.FALLING_BLOCK) ? true : super.isInvulnerableTo(level, p_20122_);
   }

   public void die(DamageSource p_21014_) {
      super.die(p_21014_);
      if (this.random.nextInt(100) == 0) {
         this.level().broadcastEntityEvent(this, (byte)8);
         this.dancing = true;
      } else {
         this.level().broadcastEntityEvent(this, (byte)7);
      }

      this.killedBy = p_21014_;
   }

   protected void tickDeath() {
      this.deathTime++;
      if (this.getLastDamageSource() == null || !this.getLastDamageSource().is(DamageTypes.GENERIC_KILL) && !this.getLastDamageSource().is(DamageTypes.FELL_OUT_OF_WORLD)) {
         if (!this.level().isClientSide()) {
            if (this.dancing) {
               if (this.deathTime == 140) {
                  this.level().broadcastEntityEvent(this, (byte)60);
                  if (this.killedBy != null) {
                     this.dropAllTickDeathLoot(this.killedBy);
                  }

                  this.remove(RemovalReason.KILLED);
               }
            } else if (this.deathTime == 100) {
               this.level().broadcastEntityEvent(this, (byte)60);
               if (this.killedBy != null) {
                  this.dropAllTickDeathLoot(this.killedBy);
               }

               this.remove(RemovalReason.KILLED);
            }
         }

         if (this.deathTime == 65) {
            if (!this.level().isClientSide()) {
               Vec3 particlePos = PositionUtils.getOffsetPos(this, 0.0, 0.0, 2.25, 0.0F, this.yBodyRot);
               ((ServerLevel)this.level())
                  .sendParticles(
                     ParticleTypeInit.SHOCKWAVE,
                     particlePos.x,
                     particlePos.y,
                     particlePos.z,
                     1,
                     0.0,
                     0.0,
                     0.0,
                     0.0
                  );

               for (Entity entity : this.level()
                  .getEntitiesOfClass(
                     LivingEntity.class,
                     this.getBoundingBox()
                        .inflate(
                           (Double)MutantHoglinCommonConfig.death_range.get(),
                           (Double)MutantHoglinCommonConfig.death_range.get(),
                           (Double)MutantHoglinCommonConfig.death_range.get()
                        ),
                     MiscUtils.ALIVE
                  )) {
                  if (entity != this && (entity.onGround() || entity.isPassenger() && entity.getRootVehicle().onGround())) {
                     if (this.canHarm(entity)) {
                        if ((Boolean)MutantHoglinCommonConfig.ignores_invulnerability_time.get()) {
                           entity.setInvulnerableTime(0);
                        }

                        entity.hurtServer((ServerLevel)this.level(),
                           MMDamageTypes.earthquakeAttack(this.damageSources(), this), ((Double)MutantHoglinCommonConfig.death_damage.get()).floatValue()
                        );
                     }

                     entity.push(this.getRandom().nextGaussian() * 0.75, 1.0, this.getRandom().nextGaussian() * 0.75);
                  }
               }

               if ((Boolean)MutantHoglinCommonConfig.death_griefing.get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get()) {
                  AABB griefingBoundingBox = this.getBoundingBox()
                     .inflate(
                        (Double)MutantHoglinCommonConfig.death_range.get(),
                        (Double)MutantHoglinCommonConfig.death_range.get() * 3.0,
                        (Double)MutantHoglinCommonConfig.death_range.get()
                     );

                  for (BlockPos blockpos : BlockPos.betweenClosed(
                     Mth.floor(griefingBoundingBox.minX),
                     Mth.floor(griefingBoundingBox.minY),
                     Mth.floor(griefingBoundingBox.minZ),
                     Mth.floor(griefingBoundingBox.maxX),
                     Mth.floor(griefingBoundingBox.maxY),
                     Mth.floor(griefingBoundingBox.maxZ)
                  )) {
                     BlockState blockstate = this.level().getBlockState(blockpos);
                     if (!blockstate.is(TagInit.Blocks.UNBREAKABLE)
                        && !blockstate.isAir()
                        && this.level().getBlockState(blockpos.below()).isAir()
                        && this.getRandom().nextInt(10) == 0) {
                        FallingBlockEntity fallingBlock = FallingBlockEntity.fall(this.level(), blockpos, blockstate);
                        fallingBlock.setHurtsEntities(
                           ((Double)MutantHoglinCommonConfig.death_falling_block_damage.get()).floatValue(),
                           ((Double)MutantHoglinCommonConfig.death_falling_block_damage.get()).intValue()
                        );
                     }
                  }
               }
            } else {
               ShakeCameraEvent.shake(this.level(), 6, 0.15F, this.blockPosition(), ((Double)MutantHoglinCommonConfig.death_range.get()).intValue());
               AABB griefingBoundingBox = this.getBoundingBox()
                  .inflate(
                     (Double)MutantHoglinCommonConfig.death_range.get(),
                     (Double)MutantHoglinCommonConfig.death_range.get() * 3.0,
                     (Double)MutantHoglinCommonConfig.death_range.get()
                  );

               for (BlockPos blockpos : BlockPos.betweenClosed(
                  Mth.floor(griefingBoundingBox.minX),
                  Mth.floor(griefingBoundingBox.minY),
                  Mth.floor(griefingBoundingBox.minZ),
                  Mth.floor(griefingBoundingBox.maxX),
                  Mth.floor(griefingBoundingBox.maxY),
                  Mth.floor(griefingBoundingBox.maxZ)
               )) {
                  BlockState blockstate = this.level().getBlockState(blockpos);
                  if (!blockstate.isAir() && this.level().getBlockState(blockpos.above()).isAir() && this.random.nextBoolean()) {
                     this.level()
                        .addParticle(
                           new BlockParticleOption(ParticleTypes.BLOCK, blockstate),
                           blockpos.getX() + this.random.nextGaussian() * 0.5,
                           blockpos.above().getY() + 0.1,
                           blockpos.getZ() + this.random.nextGaussian() * 0.5,
                           this.random.nextGaussian(),
                           0.0,
                           this.random.nextGaussian()
                        );
                  }
               }
            }
         }
      } else if (this.deathTime == 20 && !this.level().isClientSide()) {
         this.level().broadcastEntityEvent(this, (byte)60);
         this.remove(RemovalReason.KILLED);
      }
   }

   // Loot drops when the death animation finishes (dropAllTickDeathLoot), not on the death tick.
   @Override
   protected void dropAllDeathLoot(ServerLevel level, DamageSource source) {
   }

   public void dropAllTickDeathLoot(DamageSource source) {
      if (this.level() instanceof ServerLevel level) {
         super.dropAllDeathLoot(level, source);
      }
   }

   @Override
   public ItemEntity spawnAtLocation(ServerLevel level, ItemStack stack, Vec3 offset) {
      ItemEntity itementity = super.spawnAtLocation(level, stack, offset);
      if (itementity != null) {
         itementity.setExtendedLifetime();
      }

      return itementity;
   }

   @Override
   public void onMutated() {
      this.introAnimationTick = 28;
      this.noveltyAnimationTick = 0;
      this.level().broadcastEntityEvent(this, (byte)14);
   }

   @Override
   public List<SoundEvent> getBattleMusicSounds() {
      return List.of(SoundEventInit.ADRENALINE_RUSH);
   }

   @Override
   public AbstractMutant.NodeEvaluatorDimensions getNodeEvaluatorDimensions() {
      return null;
   }

   @Override
   public TagKey<Block> walksThroughTag() {
      return TagInit.Blocks.MUTANT_HOGLIN_WALKS_THROUGH;
   }

   @Override
   public ConfigValue<Boolean> walkGriefingConfig() {
      return MutantHoglinCommonConfig.walk_griefing;
   }

   @Override
   public ConfigValue<Boolean> walkGriefingDropsBlocksConfig() {
      return MutantHoglinCommonConfig.walk_griefing_drops_blocks;
   }

   @Override
   public ConfigValue<Boolean> hurtGriefingConfig() {
      return MutantHoglinCommonConfig.hurt_griefing;
   }

   @Override
   public ConfigValue<Boolean> hurtGriefingDropsBlocksConfig() {
      return MutantHoglinCommonConfig.hurt_griefing_drops_blocks;
   }

   @Override
   public ConfigValue<Boolean> showHealthBarConfig() {
      return MutantHoglinClientConfig.show_health_bar;
   }

   @Override
   public ConfigValue<Boolean> despawnsConfig() {
      return MutantHoglinCommonConfig.despawns;
   }

   @Override
   public ConfigValue<Boolean> playBattleMusicConfig() {
      return MutantHoglinClientConfig.play_battle_music;
   }

   class RemainStationaryGoal extends Goal {
      public RemainStationaryGoal() {
         this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK, Flag.TARGET, Flag.JUMP));
      }

      public boolean canUse() {
         return MutantHoglin.this.shouldBeStationary();
      }
   }
}
