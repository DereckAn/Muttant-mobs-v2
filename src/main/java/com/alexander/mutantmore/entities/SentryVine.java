package com.alexander.mutantmore.entities;

import com.alexander.mutantmore.ai.goals.LookAtTargetGoal;
import com.alexander.mutantmore.config.mutant_jungle_zombie.MutantJungleZombieCommonConfig;
import com.alexander.mutantmore.config.mutant_jungle_zombie.MutantJungleZombieRewardsCommonConfig;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.commands.arguments.EntityAnchorArgument.Anchor;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.golem.AbstractGolem;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class SentryVine extends AbstractGolem {
   private static final EntityDataAccessor<Boolean> SHOULD_DEPLOY = SynchedEntityData.defineId(SentryVine.class, EntityDataSerializers.BOOLEAN);
   public AnimationState deployAnimationState = new AnimationState();
   public int deployAnimationTick;
   public final int deployAnimationLength = 20;
   public AnimationState attackAnimationState = new AnimationState();
   public int attackAnimationTick;
   public final int attackAnimationLength = 40;
   public final int attackAnimationActionPoint = 27;
   public AnimationState trySlamAnimationState = new AnimationState();
   public int trySlamAnimationTick;
   public final int trySlamAnimationLength = 41;
   public final int trySlamAnimationActionPointStart = 24;
   public final int trySlamAnimationActionPointStop = 17;
   public AnimationState slamAnimationState = new AnimationState();
   public int slamAnimationTick;
   public final int slamAnimationLength = 36;

   public SentryVine(EntityType<? extends SentryVine> p_i50189_1_, Level p_i50189_2_) {
      super(p_i50189_1_, p_i50189_2_);
   }

   protected void registerGoals() {
      this.goalSelector.addGoal(1, new SentryVine.SentryVineSlamAttackGoal(this));
      this.goalSelector.addGoal(2, new SentryVine.SentryVineVineAttackGoal(this));
      this.goalSelector.addGoal(7, new LookAtTargetGoal(this));
      this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
      this.targetSelector.addGoal(2, new HurtByTargetGoal(this, new Class[0]));
      this.targetSelector
         .addGoal(
            3,
            new NearestAttackableTargetGoal<>(
               this,
               LivingEntity.class,
               20,
               false,
               false,
               (entity, level) -> entity instanceof Enemy || entity.is(TagInit.EntityTypes.SENTRY_VINE_TARGETS)
            )
         );
   }

   public boolean canAttack(LivingEntity target) {
      return this.canTarget(target) && super.canAttack(target);
   }

   boolean canTarget(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.SENTRY_VINE_CANT_TARGET, this, target, this, null);
   }

   public boolean canHarm(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.SENTRY_VINE_CANT_HURT, this, target, this, null);
   }

   public static Builder createConfiguredAttributes() {
      return Mob.createMobAttributes()
         .add(Attributes.MAX_HEALTH, (Double)MutantJungleZombieRewardsCommonConfig.vine_max_health.get())
         .add(Attributes.ARMOR, (Double)MutantJungleZombieRewardsCommonConfig.vine_armour.get())
         .add(Attributes.ARMOR_TOUGHNESS, (Double)MutantJungleZombieRewardsCommonConfig.vine_armour_toughness.get())
         .add(Attributes.KNOCKBACK_RESISTANCE, (Double)MutantJungleZombieRewardsCommonConfig.vine_knockback_resistance.get())
         .add(Attributes.FOLLOW_RANGE, (Double)MutantJungleZombieRewardsCommonConfig.vine_follow_range.get());
   }

   @Override
   public boolean canBeAffected(MobEffectInstance effect) {
      return !effect.is(MobEffects.POISON) && super.canBeAffected(effect);
   }

   protected InteractionResult mobInteract(Player p_28861_, InteractionHand p_28862_) {
      ItemStack itemstack = p_28861_.getItemInHand(p_28862_);
      if (itemstack.is(TagInit.Items.HEALS_SENTRY_VINE) && this.getHealth() < this.getMaxHealth()) {
         this.heal(this.getMaxHealth() * (((Integer)MutantJungleZombieRewardsCommonConfig.vine_repair_heal_percent.get()).floatValue() / 100.0F));
         if (!p_28861_.getAbilities().instabuild) {
            itemstack.shrink(1);
         }

         for (int i = 0; i < 10; i++) {
            this.level()
               .addAlwaysVisibleParticle(
                  ParticleTypes.HAPPY_VILLAGER,
                  this.getRandomX(1.0),
                  this.getRandomY(),
                  this.getRandomZ(1.0),
                  this.random.nextGaussian() * 0.1,
                  this.random.nextGaussian() * 0.1,
                  this.random.nextGaussian() * 0.1
               );
         }

         p_28861_.level().playSound(null, p_28861_, SoundEvents.BONE_MEAL_USE, SoundSource.PLAYERS, 1.0F, MiscUtils.randomSoundPitch());
         return InteractionResult.SUCCESS;
      } else {
         return super.mobInteract(p_28861_, p_28862_);
      }
   }

   public void setDeltaMovement(Vec3 vec) {
      super.setDeltaMovement(
         new Vec3(
            MutantJungleZombieRewardsCommonConfig.vine_locked_horizontal_movement.get() ? 0.0 : vec.x,
            vec.y,
            MutantJungleZombieRewardsCommonConfig.vine_locked_horizontal_movement.get() ? 0.0 : vec.z
         )
      );
   }

   @Override
   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);
      builder.define(SHOULD_DEPLOY, true);
   }

   @Override
   protected void addAdditionalSaveData(ValueOutput output) {
      super.addAdditionalSaveData(output);
      output.putBoolean("ShouldDeploy", this.shouldDeploy());
   }

   @Override
   protected void readAdditionalSaveData(ValueInput input) {
      super.readAdditionalSaveData(input);
      this.setShouldDeploy(input.getBooleanOr("ShouldDeploy", false));
   }

   public boolean shouldDeploy() {
      return (Boolean)this.entityData.get(SHOULD_DEPLOY);
   }

   public void setShouldDeploy(boolean setTo) {
      this.entityData.set(SHOULD_DEPLOY, setTo);
   }

   public boolean isPushable() {
      return false;
   }

   public boolean causeFallDamage(double p_149589_, float p_149590_, DamageSource p_149591_) {
      return false;
   }

   public void push(double p_20286_, double p_20287_, double p_20288_) {
   }

   public void baseTick() {
      super.baseTick();
      this.tickDownAnimTimers();
      if (this.shouldDeploy()) {
         this.deployAnimationTick = 20;
         this.level().broadcastEntityEvent(this, (byte)7);
         this.setShouldDeploy(false);
      }
   }

   public void handleEntityEvent(byte p_28844_) {
      if (p_28844_ == 7) {
         this.deployAnimationTick = 20;
         this.deployAnimationState.start(this.tickCount);
      } else if (p_28844_ == 8) {
         this.attackAnimationTick = 40;
         this.attackAnimationState.start(this.tickCount);
      } else if (p_28844_ == 15) {
         this.trySlamAnimationTick = 41;
         this.trySlamAnimationState.start(this.tickCount);
      } else if (p_28844_ == 16) {
         this.slamAnimationTick = 36;
         this.slamAnimationState.start(this.tickCount);
         this.trySlamAnimationTick = 0;
         this.trySlamAnimationState.stop();
      } else {
         super.handleEntityEvent(p_28844_);
      }
   }

   public void tickDownAnimTimers() {
      if (this.deployAnimationTick > 0) {
         this.deployAnimationTick--;
      }

      if (this.level().isClientSide() && this.deployAnimationTick <= 0) {
         this.deployAnimationState.stop();
      }

      if (this.attackAnimationTick > 0) {
         this.attackAnimationTick--;
      }

      if (this.level().isClientSide() && this.attackAnimationTick <= 0) {
         this.attackAnimationState.stop();
      }

      if (this.trySlamAnimationTick > 0) {
         this.trySlamAnimationTick--;
      }

      if (this.level().isClientSide() && this.trySlamAnimationTick <= 0) {
         this.trySlamAnimationState.stop();
      }

      if (this.slamAnimationTick > 0) {
         this.slamAnimationTick--;
      }

      if (this.level().isClientSide() && this.slamAnimationTick <= 0) {
         this.slamAnimationState.stop();
      }
   }

   class SentryVineSlamAttackGoal extends Goal {
      public SentryVine mob;
      @Nullable
      public LivingEntity target;
      public int nextUseTime;

      public SentryVineSlamAttackGoal(SentryVine mob) {
         this.setFlags(EnumSet.of(Flag.MOVE, Flag.JUMP, Flag.LOOK));
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
         return !this.mob.jumping
            && this.target != null
            && this.mob.tickCount >= this.nextUseTime
            && !this.target.isRemoved()
            && !this.target.isDeadOrDying()
            && this.mob.distanceTo(this.target) <= 15.0F
            && this.animationsUseable()
            && this.mob.hasLineOfSight(this.target);
      }

      public boolean canContinueToUse() {
         return this.target != null
            && !this.target.isRemoved()
            && !this.target.isDeadOrDying()
            && (this.mob.trySlamAnimationTick > 0 || this.mob.slamAnimationTick > 0);
      }

      public void start() {
         this.mob.trySlamAnimationTick = 41;
         this.mob.level().broadcastEntityEvent(this.mob, (byte)15);
      }

      public void tick() {
         this.target = this.mob.getTarget();
         this.mob.getNavigation().stop();
         if (this.target != null && this.mob.trySlamAnimationTick > 0) {
            this.mob.lookAt(Anchor.EYES, this.target.position());
         }

         if (this.target != null && this.mob.trySlamAnimationTick <= 24 && this.mob.trySlamAnimationTick >= 17) {
            int distance = 16;

            for (int i = 0; i < distance; i++) {
               Vec3 boundingBoxPos = PositionUtils.getOffsetPos(this.mob, 0.0, this.mob.getEyeHeight(), i, 0.0F, this.mob.yBodyRot);
               AABB boundingBox = new AABB(boundingBoxPos.add(-0.5, -1.5, -0.5), boundingBoxPos.add(0.5, 0.5, 0.5));
               if (boundingBox.intersects(this.target.getBoundingBox())) {
                  this.mob.trySlamAnimationTick = 0;
                  this.mob.slamAnimationTick = 36;
                  this.mob.level().broadcastEntityEvent(this.mob, (byte)16);
                  this.target.needsSync = true;
                  Vec3 targetPos = PositionUtils.getOffsetPos(this.mob, 0.0, 0.5, 9.0, 0.0F, this.mob.yBodyRot);
                  this.target.setPos(targetPos);
                  this.target.setDeltaMovement(0.0, 0.0, 0.0);
                  if (this.target instanceof ServerPlayer) {
                     ((ServerPlayer)this.target).teleportTo(targetPos.x, targetPos.y, targetPos.z);
                  }

                  Vec3 motion = PositionUtils.getOffsetMotion(this.mob, 0.0, 3.0, -3.0, 0.0F, this.mob.yBodyRot);
                  this.target.needsSync = true;
                  this.target.setDeltaMovement(motion);
               }
            }
         }

         if (this.target != null && this.mob.slamAnimationTick > 0) {
            if (this.target.isPassenger()) {
               this.target.stopRiding();
            }

            if (this.mob.slamAnimationTick == 36 - 4 || this.mob.slamAnimationTick == 36 - 10 || this.mob.slamAnimationTick == 36 - 16) {
               if ((Boolean)MutantJungleZombieRewardsCommonConfig.vine_ignores_invulnerability_time.get()) {
                  this.target.setInvulnerableTime(0);
               }

               this.target
                  .hurtServer(getServerLevel(this.mob), this.mob.damageSources().mobAttack(this.mob), ((Double)MutantJungleZombieRewardsCommonConfig.vine_slam_damage.get()).floatValue());
            }

            if (this.mob.slamAnimationTick == 36 - 2) {
               Vec3 motion = PositionUtils.getOffsetMotion(this.mob, 0.0, -2.0, -3.5, 0.0F, this.mob.yBodyRot);
               this.target.needsSync = true;
               this.target.setDeltaMovement(motion);
            }

            if (this.mob.slamAnimationTick == 36 - 6) {
               Vec3 motion = PositionUtils.getOffsetMotion(this.mob, 0.75, 1.5, 3.0, 0.0F, this.mob.yBodyRot);
               this.target.needsSync = true;
               this.target.setDeltaMovement(motion);
            }

            if (this.mob.slamAnimationTick == 36 - 9) {
               Vec3 motion = PositionUtils.getOffsetMotion(this.mob, 0.75, -2.0, 3.0, 0.0F, this.mob.yBodyRot);
               this.target.needsSync = true;
               this.target.setDeltaMovement(motion);
            }

            if (this.mob.slamAnimationTick == 36 - 11) {
               Vec3 motion = PositionUtils.getOffsetMotion(this.mob, -0.75, 1.5, -2.0, 0.0F, this.mob.yBodyRot);
               this.target.needsSync = true;
               this.target.setDeltaMovement(motion);
            }

            if (this.mob.slamAnimationTick == 36 - 15) {
               Vec3 motion = PositionUtils.getOffsetMotion(this.mob, -0.75, -2.0, -2.0, 0.0F, this.mob.yBodyRot);
               this.target.needsSync = true;
               this.target.setDeltaMovement(motion);
            }
         }
      }

      public void stop() {
         super.stop();
         this.nextUseTime = this.mob.tickCount + (Integer)MutantJungleZombieRewardsCommonConfig.vine_slam_cooldown.get();
      }

      public boolean animationsUseable() {
         return this.mob.trySlamAnimationTick <= 0;
      }
   }

   class SentryVineVineAttackGoal extends Goal {
      public SentryVine mob;
      @Nullable
      public LivingEntity target;
      public int nextUseTime;
      public AreaDamage areaDamage;

      public SentryVineVineAttackGoal(SentryVine mob) {
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
         return !this.mob.jumping
            && this.target != null
            && this.mob.tickCount >= this.nextUseTime
            && this.mob.trySlamAnimationTick <= 0
            && this.mob.slamAnimationTick <= 0
            && !this.target.isRemoved()
            && !this.target.isDeadOrDying()
            && this.mob.distanceTo(this.target) <= 10.0F
            && this.animationsUseable()
            && this.mob.hasLineOfSight(this.target);
      }

      public boolean canContinueToUse() {
         return !this.animationsUseable();
      }

      public void start() {
         this.areaDamage = null;
         this.mob.attackAnimationTick = 40;
         this.mob.level().broadcastEntityEvent(this.mob, (byte)8);
      }

      public void tick() {
         this.target = this.mob.getTarget();
         this.mob.getNavigation().stop();
         if (this.target != null) {
            this.mob.lookAt(Anchor.EYES, this.target.position());
         }

         if (this.target != null && SentryVine.this.attackAnimationTick == 27) {
            Vec3 areaDamagePos = PositionUtils.getOffsetPos(this.mob, 0.0, 0.0, 5.0, 0.0F, this.mob.yBodyRot);
            AreaDamage areaDamage = AreaDamage.spawnAreaDamage(
               this.mob.level(),
               areaDamagePos,
               this.mob,
               ((Double)MutantJungleZombieRewardsCommonConfig.vine_attack_damage.get()).floatValue(),
               this.mob.damageSources().mobAttack(this.mob),
               11.0F,
               11.0F,
               0.0F,
               0.5F,
               5,
               0,
               false,
               false,
               1.5,
               0.05,
               true,
               false,
               0,
               (Boolean)MutantJungleZombieRewardsCommonConfig.vine_ignores_invulnerability_time.get(),
               TagInit.EntityTypes.SENTRY_VINE_CANT_HURT,
               0
            );
            this.areaDamage = areaDamage;
            ((ServerLevel)this.mob.level()).addFreshEntityWithPassengers(areaDamage);
         }

         if (this.areaDamage != null && this.areaDamage.damagedEntities.contains(this.target) && !this.areaDamage.blockedByEntities.contains(this.target)) {
            for (Entity entity : this.areaDamage.damagedEntities) {
               if (entity instanceof LivingEntity && !this.areaDamage.blockedByEntities.contains(entity)) {
                  ((LivingEntity)entity)
                     .addEffect(
                        new MobEffectInstance(
                           MobEffects.POISON,
                           (Integer)MutantJungleZombieCommonConfig.vine_attack_poison_length.get(),
                           (Integer)MutantJungleZombieCommonConfig.vine_attack_poison_level.get()
                        )
                     );
               }
            }
         }
      }

      public void stop() {
         super.stop();
         this.nextUseTime = this.mob.tickCount + (Integer)MutantJungleZombieRewardsCommonConfig.vine_attack_cooldown.get();
      }

      public boolean animationsUseable() {
         return this.mob.attackAnimationTick <= 0;
      }
   }
}
