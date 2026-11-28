package com.alexander.mutantmore.entities;

import net.minecraft.core.particles.ColorParticleOption;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.ai.goals.AllDirectionsTargetGoal;
import com.alexander.mutantmore.ai.goals.ApproachTargetGoal;
import com.alexander.mutantmore.ai.goals.GroundPullAntiCheeseGoal;
import com.alexander.mutantmore.ai.goals.LookAtTargetGoal;
import com.alexander.mutantmore.ai.goals.mutant_shulker.MutantShulkerAnvilCrushAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_shulker.MutantShulkerBiteAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_shulker.MutantShulkerFlyGoal;
import com.alexander.mutantmore.ai.goals.mutant_shulker.MutantShulkerScatterTrapsAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_shulker.MutantShulkerScatterTrapsAttackInShellGoal;
import com.alexander.mutantmore.ai.goals.mutant_shulker.MutantShulkerShootAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_shulker.MutantShulkerShootAttackGoalInShell;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.mutant_shulker.MutantShulkerClientConfig;
import com.alexander.mutantmore.config.mutant_shulker.MutantShulkerCommonConfig;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.interfaces.IHasCustomExplosion;
import com.alexander.mutantmore.util.MiscUtils;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
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
import net.minecraft.world.entity.ai.control.BodyRotationControl;
import net.minecraft.world.entity.ai.control.Control;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ShulkerBullet;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion.BlockInteraction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.gameevent.GameEvent.Context;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class MutantShulker extends AbstractMutant implements IHasCustomExplosion {
   private static final EntityDataAccessor<Boolean> IN_BOX = SynchedEntityData.defineId(MutantShulker.class, EntityDataSerializers.BOOLEAN);
   private static final EntityDataAccessor<Boolean> ANVIL_ATTACKING = SynchedEntityData.defineId(MutantShulker.class, EntityDataSerializers.BOOLEAN);
   private static final EntityDataAccessor<Boolean> SPAWNED_IN_STRUCTURE = SynchedEntityData.defineId(MutantShulker.class, EntityDataSerializers.BOOLEAN);
   protected static final EntityDataAccessor<Byte> COLOR_ID = SynchedEntityData.defineId(MutantShulker.class, EntityDataSerializers.BYTE);
   public final AnimationState idleAnimation = new AnimationState();
   public final AnimationState idleRareAnimation = new AnimationState();
   public final AnimationState spinningAnimation = new AnimationState();
   public final AnimationState shulkerWalkAnimation = new AnimationState();
   public final AnimationState shootAnimation = new AnimationState();
   public final AnimationState biteAnimation = new AnimationState();
   public final AnimationState enterSpinAnimation = new AnimationState();
   public final AnimationState deathAnimation = new AnimationState();
   public final AnimationState idleInShellAnimation = new AnimationState();
   public final AnimationState idleRareInShellAnimation = new AnimationState();
   public final AnimationState shootInShellAnimation = new AnimationState();
   public final AnimationState anvilCrushAnimation = new AnimationState();
   public final AnimationState summonTrapsAnimation = new AnimationState();
   public final AnimationState summonTrapsInShellAnimation = new AnimationState();
   private final AnimationState[] animations = new AnimationState[]{
      this.idleAnimation,
      this.idleRareAnimation,
      this.spinningAnimation,
      this.shulkerWalkAnimation,
      this.shootAnimation,
      this.biteAnimation,
      this.enterSpinAnimation,
      this.deathAnimation,
      this.idleInShellAnimation,
      this.idleRareInShellAnimation,
      this.shootInShellAnimation,
      this.anvilCrushAnimation,
      this.summonTrapsAnimation,
      this.summonTrapsInShellAnimation
   };
   public float currentSpeed;
   public float currentSpeedChangeSpeed = 0.01F;
   public int specialAnimationTick;
   public final int specialAnimationLength = 45;
   public int introAnimationTick;
   public final int introAnimationLength = 45;
   public int shootAnimationTick;
   public int shootAnimationLength = 45;
   public int shootAnimationActionPoint1 = 25;
   public int shootAnimationActionPoint2 = 15;
   public int shootAnimationActionPoint3 = 10;
   public int biteAnimationTick;
   public int biteAnimationLength = 55;
   public int biteAnimationActionPoint = 38;
   public int prepareFlyAnimationTick;
   public int prepareFlyAnimationLength = 21;
   public int prepareFlyActionPoint = 8;
   public boolean flying = false;
   public int summonTrapsAnimationTick;
   public int summonTrapsAnimationLength = 50;
   public int specialAnimationTickInShell;
   public int specialAnimationLengthInShell = 50;
   public int shootAnimationTickInShell;
   public int shootAnimationLengthInShell = 47;
   public int shootAnimationActionPointInShell = 20;
   public int summonTrapsAnimationTickInShell;
   public int summonTrapsAnimationLengthInShell = 50;
   public int anvilCrushAnimationTick;
   public int anvilCrushAnimationLength = 43;
   public int anvilCrushAnimationActionPoint = 28;
   public float healthHealedInShell = 0.0F;
   public int anvilCrushSoundCooldown = 0;
   public int nextEnterShellTime;
   public DamageSource killedBy = this.damageSources().cramming();
   public List<LivingEntity> alreadyCrushed = Lists.newArrayList();
   public static EntityDimensions inBoxDimensions = EntityDimensions.scalable(1.9F, 1.9F).withEyeHeight(1.0F);
   public int stunnedTicks;
   public int stunLength = 120;

   public MutantShulker(EntityType<? extends MutantShulker> p_i50189_1_, Level p_i50189_2_) {
      super(p_i50189_1_, p_i50189_2_);
      this.xpReward = (Integer)MutantShulkerCommonConfig.exp_reward.get();
   }

   protected void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(0, new FloatGoal(this));
      this.goalSelector.addGoal(0, new MutantShulker.RemainStationaryGoal());
      this.goalSelector.addGoal(1, new GroundPullAntiCheeseGoal(this));
      if ((Boolean)MutantShulkerCommonConfig.enters_shell.get()) {
         this.goalSelector.addGoal(1, new MutantShulker.EnterShellGoal());
      }

      if ((Boolean)MutantShulkerCommonConfig.leaves_shell.get()) {
         this.goalSelector.addGoal(1, new MutantShulker.LeaveShellGoal());
      }

      if ((Boolean)MutantShulkerCommonConfig.uses_fly.get()) {
         this.goalSelector.addGoal(2, new MutantShulkerFlyGoal(this));
      }

      if ((Boolean)MutantShulkerCommonConfig.uses_anvil_crush.get()) {
         this.goalSelector.addGoal(2, new MutantShulkerAnvilCrushAttackGoal(this));
      }

      if ((Boolean)MutantShulkerCommonConfig.uses_scatter_traps.get()) {
         this.goalSelector.addGoal(3, new MutantShulkerScatterTrapsAttackGoal(this));
      }

      if ((Boolean)MutantShulkerCommonConfig.uses_scatter_traps_in_shell.get()) {
         this.goalSelector.addGoal(3, new MutantShulkerScatterTrapsAttackInShellGoal(this));
      }

      if ((Boolean)MutantShulkerCommonConfig.uses_bite.get()) {
         this.goalSelector.addGoal(4, new MutantShulkerBiteAttackGoal(this));
      }

      if ((Boolean)MutantShulkerCommonConfig.uses_shoot.get()) {
         this.goalSelector.addGoal(5, new MutantShulkerShootAttackGoal(this));
      }

      if ((Boolean)MutantShulkerCommonConfig.uses_shoot_in_shell.get()) {
         this.goalSelector.addGoal(5, new MutantShulkerShootAttackGoalInShell(this));
      }

      this.goalSelector.addGoal(7, new LookAtTargetGoal(this));
      this.goalSelector
         .addGoal(
            6,
            new ApproachTargetGoal(
               this,
               (Double)MutantShulkerCommonConfig.follow_target_wanted_distance.get(),
               (Double)MutantShulkerCommonConfig.following_movement_speed_multiplier.get(),
               true
            ) {
               @Override
               public boolean canUse() {
                  return super.canUse() && !MutantShulker.this.isInBox();
               }

               @Override
               public boolean canContinueToUse() {
                  return super.canContinueToUse() && !MutantShulker.this.isInBox();
               }
            }
         );
      this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 10.0F));
      this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Mob.class, 7.5F));
      this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
      this.goalSelector.addGoal(8, new WaterAvoidingRandomStrollGoal(this, 1.0) {
         public boolean canUse() {
            return super.canUse() && !MutantShulker.this.isInBox();
         }

         public boolean canContinueToUse() {
            return super.canContinueToUse() && !MutantShulker.this.isInBox();
         }
      });
      this.targetSelector.addGoal(0, new HurtByTargetGoal(this, new Class[0]).setUnseenMemoryTicks(6000));
      if ((Boolean)MutantShulkerCommonConfig.attacks_players.get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mutants_attack_players_off.get()) {
         this.targetSelector.addGoal(1, new AllDirectionsTargetGoal(this, Player.class, true).setUnseenMemoryTicks(6000));
      }

      this.targetSelector
         .addGoal(
            2,
            new NearestAttackableTargetGoal<LivingEntity>(
               this, LivingEntity.class, 20, false, false, (entity, level) -> entity.is(TagInit.EntityTypes.MUTANT_SHULKER_TARGETS)
            ) {
               protected AABB getTargetSearchArea(double p_26069_) {
                  return this.mob
                     .getBoundingBox()
                     .inflate(
                        (Double)MutantShulkerCommonConfig.follow_non_player_distance.get(),
                        (Double)MutantShulkerCommonConfig.follow_non_player_distance.get(),
                        (Double)MutantShulkerCommonConfig.follow_non_player_distance.get()
                     );
               }
            }
         );
   }

   @Override
   public boolean canHarmWithExplosion(Entity target) {
      return this.canHarm(target);
   }

   boolean canHarm(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_SHULKER_CANT_HURT, this, target, this, null);
   }

   protected BodyRotationControl createBodyControl() {
      return new MutantShulker.MutantShulkerBodyRotationControl(this);
   }

   @Override
   public AbstractMutant.NodeEvaluatorDimensions getNodeEvaluatorDimensions() {
      return null;
   }

   public boolean shouldBodyMoveWithHead() {
      return this.biteAnimationTick > 0 || this.introAnimationTick > 0;
   }

   public int getMaxHeadYRot() {
      return Integer.MAX_VALUE;
   }

   public int getMaxHeadXRot() {
      return Integer.MAX_VALUE;
   }

   public boolean shouldBeStationary() {
      return this.introAnimationTick > 0 || this.stunnedTicks > 0;
   }

   public static Builder createConfiguredAttributes() {
      return Mob.createMobAttributes()
         .add(Attributes.MAX_HEALTH, (Double)MutantShulkerCommonConfig.max_health.get())
         .add(Attributes.ARMOR, (Double)MutantShulkerCommonConfig.armour.get())
         .add(Attributes.ARMOR_TOUGHNESS, (Double)MutantShulkerCommonConfig.armour_toughness.get())
         .add(Attributes.KNOCKBACK_RESISTANCE, (Double)MutantShulkerCommonConfig.knockback_resistance.get())
         .add(Attributes.FOLLOW_RANGE, (Double)MutantShulkerCommonConfig.follow_player_distance.get())
         .add(Attributes.MOVEMENT_SPEED, (Double)MutantShulkerCommonConfig.movement_speed.get());
   }

   public boolean canAttack(LivingEntity target) {
      return this.canTarget(target) && super.canAttack(target);
   }

   boolean canTarget(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_SHULKER_CANT_TARGET, this, target, this, null);
   }

   protected SoundEvent getAmbientSound() {
      return this.isInBox() ? null : SoundEventInit.MUTANT_SHULKER_IDLE;
   }

   protected SoundEvent getHurtSound(DamageSource p_33034_) {
      return SoundEventInit.MUTANT_SHULKER_HURT;
   }

   protected SoundEvent getDeathSound() {
      return null;
   }

   public float getVoicePitch() {
      return this.isDeadOrDying() ? 1.0F : super.getVoicePitch();
   }

   protected float getSoundVolume() {
      return this.isDeadOrDying() ? 3.0F : super.getSoundVolume();
   }

   protected void playStepSound(BlockPos p_20135_, BlockState p_20136_) {
      if (!this.flying) {
         this.playSound(SoundEventInit.MUTANT_SHULKER_STEP, 0.5F, 1.0F);
      }
   }

   @Override
   protected EntityDimensions getDefaultDimensions(Pose p_19975_) {
      return this.isInBox() ? inBoxDimensions : super.getDefaultDimensions(p_19975_);
   }

   public void refreshDimensions() {
      double d0 = this.getX();
      double d1 = this.getY();
      double d2 = this.getZ();
      super.refreshDimensions();
      this.setPos(d0, d1, d2);
   }

   public void die(DamageSource source) {
      super.die(source);
      if (source == null || !source.is(DamageTypes.GENERIC_KILL) && !source.is(DamageTypes.FELL_OUT_OF_WORLD)) {
         this.playSound(SoundEventInit.MUTANT_SHULKER_DEATH, this.getSoundVolume(), 1.0F);
      } else {
         this.playSound(SoundEvents.HOSTILE_DEATH, this.getSoundVolume(), this.getVoicePitch());
      }

      this.killedBy = source;
   }

   protected void tickDeath() {
      this.deathTime++;
      if (this.getLastDamageSource() == null || !this.getLastDamageSource().is(DamageTypes.GENERIC_KILL) && !this.getLastDamageSource().is(DamageTypes.FELL_OUT_OF_WORLD)) {
         this.setDeltaMovement(0.0, this.getDeltaMovement().y, 0.0);
         if (!this.level().isClientSide() && this.deathTime > 20 && this.deathTime < 90 && this.deathTime % 2 == 0) {
            for (int i = 0; i < 2; i++) {
               this.shootMutantShulkerProjectile(
                  this.random.nextInt(360),
                  BlockPos.containing(
                     this.getX() - 50.0 + this.random.nextInt(100),
                     this.getY() + 2.0 + this.random.nextInt(20),
                     this.getZ() - 50.0 + this.random.nextInt(100)
                  ),
                  false
               );
            }
         }

         if (this.deathTime == 113) {
            ShakeCameraEvent.shake(this.level(), 26, 0.03F, this.blockPosition(), 25);
            if (!this.level().isClientSide()) {
               MiscUtils.customExplosion(
                  this.level(),
                  this,
                  this.damageSources().explosion(this, this),
                  null,
                  this.getX(),
                  this.getY(),
                  this.getZ(),
                  15.0F,
                  false,
                  this.deathExplosionBlockInteraction(),
                  null,
                  this.getSoundSource(),
                  ParticleTypes.EXPLOSION,
                  ParticleTypes.EXPLOSION_EMITTER,
                  ((Double)MutantShulkerCommonConfig.death_explosion_damage.get()).floatValue(),
                  true,
                  true
               );
            }
         }

         if (this.deathTime == 123) {
            if (!this.level().isClientSide()) {
               if (this.killedBy != null) {
                  this.dropAllTickDeathLoot(this.killedBy);
               }

               this.remove(RemovalReason.KILLED);
            }

            for (int i = 0; i < 20; i++) {
               double d0 = this.random.nextGaussian() * 0.02;
               double d1 = this.random.nextGaussian() * 0.02;
               double d2 = this.random.nextGaussian() * 0.02;
               this.level().addParticle(ParticleTypes.POOF, this.getRandomX(1.0), this.getRandomY(), this.getRandomZ(1.0), d0, d1, d2);
            }
         }
      } else if (this.deathTime == 20 && !this.level().isClientSide()) {
         this.level().broadcastEntityEvent(this, (byte)60);
         this.remove(RemovalReason.KILLED);
      }
   }

   public BlockInteraction deathExplosionBlockInteraction() {
      if (!(Boolean)MutantShulkerCommonConfig.death_griefing.get() || (Boolean)MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get()) {
         return BlockInteraction.KEEP;
      } else {
         return !MutantShulkerCommonConfig.death_griefing_drops_blocks.get() && !MutantMoreGroupedOptionsCommonConfig.griefing_drops_blocks_on.get()
            ? BlockInteraction.DESTROY
            : BlockInteraction.DESTROY_WITH_DECAY;
      }
   }

   // Loot drops when the final death animation finishes (dropAllTickDeathLoot), not on the death tick.
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

   public boolean inBoxButOpen() {
      return this.isInBox()
         && (
            this.summonTrapsAnimationTickInShell > 0
               || this.specialAnimationTickInShell > 0
               || this.shootAnimationTickInShell > 0
               || this.anvilCrushAnimationTick > 0
         );
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource p_21016_, float p_21017_) {
      if (p_21016_.getDirectEntity() instanceof MutantShulkerBullet) {
         this.stunnedTicks = 60;
      }

      if (p_21016_.getDirectEntity() instanceof ShulkerBullet) {
         return false;
      }

      if (this.isInBox() && !this.inBoxButOpen() && !p_21016_.is(DamageTypes.GENERIC_KILL) && !p_21016_.is(DamageTypes.FELL_OUT_OF_WORLD)) {
         this.playSound(SoundEvents.SHULKER_HURT_CLOSED, 1.0F, 0.5F);
         return false;
      }

      if (!this.level().isClientSide()
         && (Boolean)MutantShulkerCommonConfig.teleports_when_hit.get()
         && this.random.nextInt((Integer)MutantShulkerCommonConfig.teleport_when_hit_chance.get()) == 0
         && !p_21016_.is(DamageTypes.GENERIC_KILL)
         && !p_21016_.is(DamageTypes.FELL_OUT_OF_WORLD)) {
         if (!this.level().isClientSide() && this.getTarget() != null) {
            this.teleport();
         } else if (!this.level().isClientSide() && this.getTarget() == null) {
            this.teleport();
         }

         return false;
      } else {
         if (this.flying && (Boolean)MutantShulkerCommonConfig.getting_hit_cancels_flying.get() && this.tickCount >= this.nextEnterShellTime) {
            this.flying = false;
            this.setInBox(true);
            this.level().broadcastEntityEvent(this, (byte)6);
         }

         return super.hurtServer(level, p_21016_, p_21017_);
      }
   }

   @Override
   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);
      builder.define(IN_BOX, false);
      builder.define(SPAWNED_IN_STRUCTURE, false);
      builder.define(ANVIL_ATTACKING, false);
      builder.define(COLOR_ID, (byte)16);
   }

   protected void addAdditionalSaveData(ValueOutput p_29495_) {
      super.addAdditionalSaveData(p_29495_);
      p_29495_.putBoolean("InBox", this.isInBox());
      p_29495_.putBoolean("SpawnedInStructure", this.isSpawnedInStructure());
      p_29495_.putByte("Color", (Byte)this.entityData.get(COLOR_ID));
   }

   @Override
   protected void readAdditionalSaveData(ValueInput p_29478_) {
      super.readAdditionalSaveData(p_29478_);
      this.entityData.set(COLOR_ID, p_29478_.getByteOr("Color", (byte)16));

      this.setInBox(p_29478_.getBooleanOr("InBox", false));
      this.setSpawnedInStructure(p_29478_.getBooleanOr("SpawnedInStructure", false));
   }

   private void setColor(DyeColor p_149778_) {
      this.entityData.set(COLOR_ID, (byte)p_149778_.getId());
   }

   @Nullable
   public DyeColor getColor() {
      byte b0 = (Byte)this.entityData.get(COLOR_ID);
      return b0 != 16 && b0 <= 15 ? DyeColor.byId(b0) : null;
   }

   public boolean isInBox() {
      return (Boolean)this.getEntityData().get(IN_BOX);
   }

   public void setInBox(boolean inBox) {
      if (inBox) {
         this.healthHealedInShell = 0.0F;
      }

      this.getEntityData().set(IN_BOX, inBox);
   }

   public boolean isSpawnedInStructure() {
      return (Boolean)this.getEntityData().get(SPAWNED_IN_STRUCTURE);
   }

   public void setSpawnedInStructure(boolean inBox) {
      this.getEntityData().set(SPAWNED_IN_STRUCTURE, inBox);
   }

   public boolean isAnvilAttacking() {
      return (Boolean)this.getEntityData().get(ANVIL_ATTACKING);
   }

   public void setAnvilAttacking(boolean inBox) {
      this.getEntityData().set(ANVIL_ATTACKING, inBox);
   }

   @Override
   public void aiStep() {
      super.aiStep();

      for (Entity entity : this.level().getEntities(this, this.getBoundingBox())) {
         if (this.canHarm(entity)) {
            if (this.flying) {
               double d0 = entity.getX() - this.getX();
               double d1 = entity.getZ() - this.getZ();
               double d2 = Math.max(d0 * d0 + d1 * d1, 0.001);
               entity.push(d0 / d2 * 4.0, 0.2, d1 / d2 * 4.0);
               MiscUtils.hurt(entity, MMDamageTypes.cantAvoidMobAttack(this.damageSources(), this), ((Double)MutantShulkerCommonConfig.fly_damage.get()).floatValue());
            }

            if (this.isAnvilAttacking() && !this.alreadyCrushed.contains(entity)) {
               if (entity instanceof LivingEntity) {
                  this.alreadyCrushed.add((LivingEntity)entity);
                  if ((Boolean)MutantShulkerCommonConfig.ignores_invulnerability_time.get()) {
                     ((LivingEntity)entity).setInvulnerableTime(0);
                  }
               }

               ShakeCameraEvent.shake(this.level(), 10, 0.015F, this.blockPosition(), 5);
               if (this.anvilCrushSoundCooldown <= 0) {
                  this.playSound(SoundEventInit.MUTANT_SHULKER_ANVIL_CRUSH, 1.0F, 1.0F);
                  this.anvilCrushSoundCooldown = 40;
               }

               entity.hurt(
                  MMDamageTypes.mutantShulkerAnvilCrushAttack(this.damageSources(), this),
                  ((Double)MutantShulkerCommonConfig.anvil_crush_damage.get()).floatValue()
               );
            }
         }
      }

      if (!this.level().isClientSide()
         && this.tickCount % 10 == 0
         && this.flying
         && (Boolean)MutantShulkerCommonConfig.flight_griefing.get()
         && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get()) {
         int j1 = Mth.floor(this.getY());
         int i2 = Mth.floor(this.getX());
         int j2 = Mth.floor(this.getZ());
         boolean flag = false;

         for (int j = -2; j <= 2; j++) {
            for (int k2 = -2; k2 <= 2; k2++) {
               for (int k = 0; k <= 3; k++) {
                  int l2 = i2 + j;
                  int l = j1 + k;
                  int i1 = j2 + k2;
                  BlockPos blockpos = new BlockPos(l2, l, i1);
                  BlockState blockstate = this.level().getBlockState(blockpos);
                  if (!blockstate.is(TagInit.Blocks.UNBREAKABLE)) {
                     flag = this.level()
                           .destroyBlock(
                              blockpos,
                              (Boolean)MutantShulkerCommonConfig.flight_griefing_drops_blocks.get()
                                 || (Boolean)MutantMoreGroupedOptionsCommonConfig.griefing_drops_blocks_on.get(),
                              this
                           )
                        || flag;
                  }
               }
            }
         }

         if (flag) {
            this.level().levelEvent((Player)null, 1022, this.blockPosition(), 0);
         }
      }

      if (!this.level().isClientSide()
         && (Boolean)MutantShulkerCommonConfig.teleports_to_avoid_falling_into_the_void.get()
         && this.getTarget() != null
         && this.isFallingToDoom()
         && !this.isAnvilAttacking()) {
         this.teleportTowards(this.getTarget());
      }

      if (this.isInWater() && (Boolean)MutantShulkerCommonConfig.teleports_in_water.get()) {
         this.teleport();
      }

      if (!this.level().isClientSide()
         && this.getTarget() != null
         && this.distanceTo(this.getTarget()) > 5.0F
         && this.random.nextInt((Integer)MutantShulkerCommonConfig.basic_teleport_chance.get()) == 0
         && !this.isDeadOrDying()
         && !this.isAnvilAttacking()) {
         if ((!this.flying || !(Boolean)MutantShulkerCommonConfig.teleports_while_flying.get())
            && (!this.isInBox() || !(Boolean)MutantShulkerCommonConfig.teleports_while_in_shell.get())) {
            if ((Boolean)MutantShulkerCommonConfig.teleports_to_follow_target.get()) {
               this.teleportTowards(this.getTarget());
            }
         } else {
            this.teleport(
               this.getTarget().getX() - 15.0 + this.random.nextInt(30), this.getY(), this.getTarget().getZ() - 15.0 + this.random.nextInt(30)
            );
         }
      }
   }

   boolean isFallingToDoom() {
      boolean blockBeneath = false;

      for (int i = 0; i < 64; i++) {
         if (!this.level().getBlockState(new BlockPos(this.blockPosition().getX(), this.blockPosition().getY() - i, this.blockPosition().getZ())).isAir()) {
            blockBeneath = true;
         }
      }

      return !this.level().isClientSide() && !blockBeneath;
   }

   @Override
   public void baseTick() {
      super.baseTick();
      if (!this.level().isClientSide() && this.verticalCollisionBelow && this.isAnvilAttacking()) {
         ShakeCameraEvent.shake(this.level(), 6, 0.01F, this.blockPosition(), 10);
         this.playSound(SoundEventInit.MUTANT_SHULKER_ANVIL_CRUSH, 1.0F, 1.0F);
         this.alreadyCrushed.clear();
         this.setAnvilAttacking(false);
      }

      this.refreshDimensions();
      if (!this.level().isClientSide() && this.isSpawnedInStructure()) {
         this.setSpawnedInStructure(false);
      }

      if (!this.level().isClientSide() && (this.isInBox() || this.isDeadOrDying())) {
         this.getNavigation().stop();
      }

      if (!this.level().isClientSide()
         && this.isInBox()
         && this.tickCount % (Integer)MutantShulkerCommonConfig.shell_heal_interval.get() == 0
         && this.getHealth() < this.getMaxHealth()) {
         ((ServerLevel)this.level())
            .sendParticles(
               ParticleTypeInit.MUTANT_SHULKER_HEAL, this.getRandomX(1.25), this.getRandomY(), this.getRandomZ(1.25), 1, 0.1, 0.1, 0.1, 0.0
            );
         this.heal(((Double)MutantShulkerCommonConfig.shell_heal_amount.get()).floatValue());
         this.healthHealedInShell = this.healthHealedInShell + ((Double)MutantShulkerCommonConfig.shell_heal_amount.get()).floatValue();
      }

      Vec3 velocity = this.getDeltaMovement();
      float groundSpeed = Mth.sqrt((float)(velocity.x * velocity.x + velocity.z * velocity.z));
      if (!this.level().isClientSide()
         && groundSpeed <= 0.1F
         && this.specialAnimationTick <= 0
         && this.random.nextInt(400) == 0
         && (this.getTarget() == null || this.getTarget().isDeadOrDying() || this.getTarget().isRemoved())) {
         if (this.isInBox()) {
            this.playSound(SoundEventInit.MUTANT_SHULKER_OPEN, 1.0F, 1.0F);
            this.specialAnimationTickInShell = this.specialAnimationLengthInShell;
            this.level().broadcastEntityEvent(this, (byte)36);
         } else {
            this.playSound(SoundEventInit.MUTANT_SHULKER_ROAR, 1.0F, 1.0F);
            this.specialAnimationTick = 45;
            this.level().broadcastEntityEvent(this, (byte)4);
         }
      }

      if (this.specialAnimationTickInShell == 20 && groundSpeed <= 0.1F && (this.getTarget() == null || this.getTarget().isDeadOrDying() || this.getTarget().isRemoved())) {
         this.playSound(SoundEventInit.MUTANT_SHULKER_CLOSE, 1.0F, 1.0F);
      }

      if (this.flying) {
         this.setNoGravity(true);
      } else {
         this.setNoGravity(false);
      }

      if (this.anvilCrushSoundCooldown > 0) {
         this.anvilCrushSoundCooldown--;
      }

      this.tickDownAnimTimers();
   }

   public void shootMutantShulkerProjectile(float angle, BlockPos shootToPos, boolean aimForTarget) {
      if (aimForTarget && this.getTarget() != null) {
         MutantShulkerBullet projectile = new MutantShulkerBullet(
            EntityTypeInit.MUTANT_SHULKER_BULLET, this.level()
         );
         projectile.damage = ((Double)MutantShulkerCommonConfig.mutant_shulker_bullet_damage.get()).floatValue();
         projectile.griefing = (Boolean)MutantShulkerCommonConfig.mutant_shulker_bullet_griefing.get()
            && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get();
         projectile.griefingDropsBlocks = (Boolean)MutantShulkerCommonConfig.mutant_shulker_bullet_griefing_drops_blocks.get()
            || (Boolean)MutantMoreGroupedOptionsCommonConfig.griefing_drops_blocks_on.get();
         projectile.explosionSize = ((Double)MutantShulkerCommonConfig.mutant_shulker_bullet_explosion_size.get()).floatValue();
         projectile.levitationLength = (Integer)MutantShulkerCommonConfig.mutant_shulker_bullet_levitation_length.get();
         projectile.levitationLevel = (Integer)MutantShulkerCommonConfig.mutant_shulker_bullet_levitation_level.get();
         projectile.ignoresInvulTime = (Boolean)MutantShulkerCommonConfig.ignores_invulnerability_time.get();
         projectile.setRemainingHits((Integer)MutantShulkerCommonConfig.mutant_shulker_bullet_hits.get());
         projectile.moveDelay = 60;
         projectile.setPos(this.getX(), this.getEyeY(), this.getZ());
         projectile.setTargetByID(this.getTarget().getId());
         projectile.setOwner(this);
         this.shootMutantShulkerProjectile(this.getTarget().blockPosition(), projectile, angle);
         this.level().addFreshEntity(projectile);
      } else {
         MutantShulkerBullet projectile = new MutantShulkerBullet(
            EntityTypeInit.MUTANT_SHULKER_BULLET, this.level()
         );
         projectile.damage = ((Double)MutantShulkerCommonConfig.mutant_shulker_bullet_damage.get()).floatValue();
         projectile.griefing = (Boolean)MutantShulkerCommonConfig.mutant_shulker_bullet_griefing.get()
            && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get();
         projectile.griefingDropsBlocks = (Boolean)MutantShulkerCommonConfig.mutant_shulker_bullet_griefing_drops_blocks.get()
            || (Boolean)MutantMoreGroupedOptionsCommonConfig.griefing_drops_blocks_on.get();
         projectile.explosionSize = ((Double)MutantShulkerCommonConfig.mutant_shulker_bullet_explosion_size.get()).floatValue();
         projectile.levitationLength = (Integer)MutantShulkerCommonConfig.mutant_shulker_bullet_levitation_length.get();
         projectile.levitationLevel = (Integer)MutantShulkerCommonConfig.mutant_shulker_bullet_levitation_level.get();
         projectile.ignoresInvulTime = (Boolean)MutantShulkerCommonConfig.ignores_invulnerability_time.get();
         projectile.setRemainingHits((Integer)MutantShulkerCommonConfig.mutant_shulker_bullet_hits.get());
         projectile.moveDelay = 60;
         projectile.setPos(this.getX(), this.getEyeY(), this.getZ());
         projectile.setOwner(this);
         this.shootMutantShulkerProjectile(shootToPos, projectile, angle);
         this.level().addFreshEntity(projectile);
      }
   }

   public void shootMutantShulkerProjectile(BlockPos p_33275_, Projectile p_33277_, float p_33278_) {
      this.shootMutantShulkerProjectile(this, p_33275_, p_33277_, p_33278_, 1.0F);
   }

   public void shootMutantShulkerProjectile(LivingEntity p_32323_, BlockPos p_32324_, Projectile p_32325_, float p_32326_, float p_32327_) {
      double d0 = p_32324_.getX() - p_32323_.getX();
      double d1 = p_32324_.getZ() - p_32323_.getZ();
      double d2 = Math.sqrt(d0 * d0 + d1 * d1);
      double d3 = p_32324_.getY() - p_32325_.getY() + d2 * 0.2F;
      Vector3f vector3f = this.getProjectileShotVector(p_32323_, new Vec3(d0, d3, d1), p_32326_);
      p_32325_.shoot(vector3f.x(), vector3f.y(), vector3f.z(), p_32327_, 14 - p_32323_.level().getDifficulty().getId() * 4);
      p_32323_.playSound(SoundEventInit.MUTANT_SHULKER_SHOOT, 2.0F, 1.0F / (p_32323_.getRandom().nextFloat() * 0.4F + 0.8F));
   }

   public Vector3f getProjectileShotVector(LivingEntity p_32333_, Vec3 p_32334_, float p_32335_) {
      Vec3 vec3 = p_32334_.normalize();
      Vec3 vec31 = vec3.cross(new Vec3(0.0, 1.0, 0.0));
      if (vec31.lengthSqr() <= 1.0E-7) {
         vec31 = vec3.cross(p_32333_.getUpVector(1.0F));
      }

      Quaternionf quaternion = new Quaternionf().setAngleAxis((float) (Math.PI / 4), vec31.x, vec31.y, vec31.z);
      Vector3f vector3f = vec3.toVector3f();
      vector3f.rotate(quaternion);
      Quaternionf quaternion1 = new Quaternionf().setAngleAxis((float)Math.toRadians(p_32335_), vector3f.x, vector3f.y, vector3f.z);
      return vec3.toVector3f().rotate(quaternion1);
   }

   public void handleEntityEvent(byte p_28844_) {
      if (p_28844_ == 4) {
         this.specialAnimationTick = 45;
      } else if (p_28844_ == 11) {
         this.introAnimationTick = 45;
      } else if (p_28844_ == 33) {
         this.shootAnimationTick = this.shootAnimationLength;
      } else if (p_28844_ == 44) {
         this.biteAnimationTick = this.biteAnimationLength;
      } else if (p_28844_ == 5) {
         this.flying = true;
      } else if (p_28844_ == 6) {
         this.flying = false;
      } else if (p_28844_ == 7) {
         this.prepareFlyAnimationTick = this.prepareFlyAnimationLength;
      } else if (p_28844_ == 8) {
         this.summonTrapsAnimationTick = this.summonTrapsAnimationLength;
      } else if (p_28844_ == 9) {
         this.stunnedTicks = this.stunLength;
      } else if (p_28844_ == 36) {
         this.specialAnimationTickInShell = this.specialAnimationLengthInShell;
      } else if (p_28844_ == 12) {
         this.shootAnimationTickInShell = this.shootAnimationLengthInShell;
      } else if (p_28844_ == 10) {
         this.summonTrapsAnimationTickInShell = this.summonTrapsAnimationLengthInShell;
      } else if (p_28844_ == 37) {
         this.anvilCrushAnimationTick = this.anvilCrushAnimationLength;
      } else {
         super.handleEntityEvent(p_28844_);
      }
   }

   public boolean canBeAffected(MobEffectInstance p_34192_) {
      return !p_34192_.is(MobEffects.LEVITATION) && super.canBeAffected(p_34192_);
   }

   @Override
   public boolean canBeCollidedWith(@org.jspecify.annotations.Nullable Entity other) {
      return this.isAlive() && this.isInBox();
   }

   @Override
   protected void updateAnimations() {
      boolean somethingAnimating = false;
      this.deathAnimation.animateWhen(this.isDeadOrDying(), this.tickCount);
      somethingAnimating = this.deathAnimation.isStarted();
      this.idleRareAnimation.animateWhen(this.introAnimationTick > 0 && !somethingAnimating, this.tickCount);
      somethingAnimating = somethingAnimating || this.idleRareAnimation.isStarted();
      this.spinningAnimation.animateWhen(this.flying && !somethingAnimating, this.tickCount);
      somethingAnimating = somethingAnimating || this.spinningAnimation.isStarted();
      this.anvilCrushAnimation.animateWhen(this.isInBox() && this.anvilCrushAnimationTick > 0 && !somethingAnimating, this.tickCount);
      somethingAnimating = somethingAnimating || this.anvilCrushAnimation.isStarted();
      this.summonTrapsInShellAnimation.animateWhen(this.isInBox() && this.summonTrapsAnimationTickInShell > 0 && !somethingAnimating, this.tickCount);
      somethingAnimating = somethingAnimating || this.summonTrapsInShellAnimation.isStarted();
      this.shootInShellAnimation.animateWhen(this.isInBox() && this.shootAnimationTickInShell > 0 && !somethingAnimating, this.tickCount);
      somethingAnimating = somethingAnimating || this.shootInShellAnimation.isStarted();
      this.idleRareInShellAnimation.animateWhen(this.isInBox() && this.specialAnimationTickInShell > 0 && !somethingAnimating, this.tickCount);
      somethingAnimating = somethingAnimating || this.idleRareInShellAnimation.isStarted();
      this.idleInShellAnimation.animateWhen(this.isInBox() && !somethingAnimating, this.tickCount);
      somethingAnimating = somethingAnimating || this.idleInShellAnimation.isStarted();
      this.enterSpinAnimation.animateWhen(!this.isInBox() && this.prepareFlyAnimationTick > 0 && !somethingAnimating, this.tickCount);
      somethingAnimating = somethingAnimating || this.enterSpinAnimation.isStarted();
      this.summonTrapsAnimation.animateWhen(!this.isInBox() && this.summonTrapsAnimationTick > 0 && !somethingAnimating, this.tickCount);
      somethingAnimating = somethingAnimating || this.summonTrapsAnimation.isStarted();
      this.biteAnimation.animateWhen(!this.isInBox() && this.biteAnimationTick > 0 && !somethingAnimating, this.tickCount);
      somethingAnimating = somethingAnimating || this.biteAnimation.isStarted();
      this.shootAnimation.animateWhen(!this.isInBox() && this.shootAnimationTick > 0 && !somethingAnimating, this.tickCount);
      somethingAnimating = somethingAnimating || this.shootAnimation.isStarted();
      boolean isMoving = this.walkAnimation.speed() <= -0.075F || this.walkAnimation.speed() >= 0.075F;
      this.shulkerWalkAnimation.animateWhen(!this.isInBox() && isMoving && !somethingAnimating, this.tickCount);
      somethingAnimating = somethingAnimating || this.shulkerWalkAnimation.isStarted();
      this.idleRareAnimation.animateWhen(!this.isInBox() && this.specialAnimationTick > 0 && !somethingAnimating, this.tickCount);
      somethingAnimating = somethingAnimating || this.idleRareAnimation.isStarted();
      this.idleAnimation.animateWhen(!this.isInBox() && !somethingAnimating, this.tickCount);
   }

   private boolean nothingElseAnimating(AnimationState exclude) {
      for (AnimationState state : this.animations) {
         if (state != exclude && state.isStarted()) {
            return false;
         }
      }

      return true;
   }

   public void tickDownAnimTimers() {
      if (this.specialAnimationTick > 0) {
         this.specialAnimationTick--;
      }

      if (this.introAnimationTick > 0) {
         this.introAnimationTick--;
      }

      if (this.shootAnimationTick > 0) {
         this.shootAnimationTick--;
      }

      if (this.biteAnimationTick > 0) {
         this.biteAnimationTick--;
      }

      if (this.prepareFlyAnimationTick > 0) {
         this.prepareFlyAnimationTick--;
      }

      if (this.summonTrapsAnimationTick > 0) {
         this.summonTrapsAnimationTick--;
      }

      if (this.specialAnimationTickInShell > 0) {
         this.specialAnimationTickInShell--;
      }

      if (this.shootAnimationTickInShell > 0) {
         this.shootAnimationTickInShell--;
      }

      if (this.summonTrapsAnimationTickInShell > 0) {
         this.summonTrapsAnimationTickInShell--;
      }

      if (this.anvilCrushAnimationTick > 0) {
         this.anvilCrushAnimationTick--;
      }

      if (this.stunnedTicks > 0) {
         this.stunEffect();
         this.stunnedTicks--;
      }
   }

   private void stunEffect() {
      if (this.random.nextInt(6) == 0) {
         double d0 = this.getX() - this.getBbWidth() * Math.sin(this.yBodyRot * (float) (Math.PI / 180.0)) + (this.random.nextDouble() * 0.6 - 0.3);
         double d1 = this.getY() + this.getBbHeight() - 0.3;
         double d2 = this.getZ() + this.getBbWidth() * Math.cos(this.yBodyRot * (float) (Math.PI / 180.0)) + (this.random.nextDouble() * 0.6 - 0.3);
         this.level().addParticle(ColorParticleOption.create(ParticleTypes.ENTITY_EFFECT, 0.49803922F, 0.5137255F, 0.57254905F), d0, d1, d2, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void onMutated() {
      this.introAnimationTick = 45;
      this.level().broadcastEntityEvent(this, (byte)11);
   }

   protected boolean teleport() {
      if (!this.level().isClientSide() && this.isAlive()) {
         double d0 = this.getX() - 15.0 + this.random.nextInt(30);
         double d1 = this.getY() - 10.0 + this.random.nextInt(20);
         double d2 = this.getZ() - 15.0 + this.random.nextInt(30);
         return this.teleport(d0, d1, d2);
      } else {
         return false;
      }
   }

   boolean teleportTowards(Entity p_32501_) {
      Vec3 vec3 = new Vec3(this.getX() - p_32501_.getX(), this.getY(0.5) - p_32501_.getEyeY(), this.getZ() - p_32501_.getZ());
      vec3 = vec3.normalize();
      double d0 = 16.0;
      double d1 = this.getX() + (this.random.nextDouble() - 0.5) * 8.0 - vec3.x * 16.0;
      double d2 = this.getY() + (this.random.nextInt(16) - 8) - vec3.y * 16.0;
      double d3 = this.getZ() + (this.random.nextDouble() - 0.5) * 8.0 - vec3.z * 16.0;
      return this.teleport(d1, d2, d3);
   }

   private boolean teleport(double p_32544_, double p_32545_, double p_32546_) {
      MutableBlockPos blockpos$mutableblockpos = new MutableBlockPos(p_32544_, p_32545_, p_32546_);

      while (blockpos$mutableblockpos.getY() > this.level().getMinY() && !this.level().getBlockState(blockpos$mutableblockpos).isSolid()) {
         blockpos$mutableblockpos.move(Direction.DOWN);
      }

      BlockState blockstate = this.level().getBlockState(blockpos$mutableblockpos);
      boolean flag = blockstate.isSolid();
      boolean flag1 = blockstate.getFluidState().is(FluidTags.WATER);
      if (flag && !flag1) {
         Vec3 vec3 = this.position();
         boolean flag2 = this.randomTeleport(p_32544_, p_32545_, p_32546_, false, state -> false);
         if (flag2) {
            this.level().gameEvent(GameEvent.TELEPORT, vec3, Context.of(this));
            if (!this.isSilent()) {
               this.level()
                  .playSound(
                     (Player)null,
                     this.xo,
                     this.yo,
                     this.zo,
                     SoundEventInit.MUTANT_SHULKER_TELEPORT,
                     this.getSoundSource(),
                     1.0F,
                     1.0F
                  );
               this.playSound(SoundEventInit.MUTANT_SHULKER_TELEPORT, 1.0F, 1.0F);
            }
         }

         return flag2;
      } else {
         return false;
      }
   }

   @Override
   public List<SoundEvent> getBattleMusicSounds() {
      return List.of(SoundEventInit.FORCES_UNKNOWN);
   }

   @Override
   public TagKey<Block> walksThroughTag() {
      return TagInit.Blocks.MUTANT_SHULKER_WALKS_THROUGH;
   }

   @Override
   public ConfigValue<Boolean> walkGriefingConfig() {
      return MutantShulkerCommonConfig.walk_griefing;
   }

   @Override
   public ConfigValue<Boolean> walkGriefingDropsBlocksConfig() {
      return MutantShulkerCommonConfig.walk_griefing;
   }

   @Override
   public ConfigValue<Boolean> hurtGriefingConfig() {
      return MutantShulkerCommonConfig.hurt_griefing;
   }

   @Override
   public ConfigValue<Boolean> hurtGriefingDropsBlocksConfig() {
      return MutantShulkerCommonConfig.hurt_griefing_drops_blocks;
   }

   @Override
   public ConfigValue<Boolean> showHealthBarConfig() {
      return MutantShulkerClientConfig.show_health_bar;
   }

   @Override
   public ConfigValue<Boolean> despawnsConfig() {
      return MutantShulkerCommonConfig.despawns;
   }

   @Override
   public ConfigValue<Boolean> playBattleMusicConfig() {
      return MutantShulkerClientConfig.play_battle_music;
   }

   class EnterShellGoal extends Goal {
      public EnterShellGoal() {
         this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK, Flag.TARGET, Flag.JUMP));
      }

      public boolean canUse() {
         return MutantShulker.this.tickCount >= MutantShulker.this.nextEnterShellTime
            && (
               !MutantShulker.this.level().isClientSide()
                     && (Boolean)MutantShulkerCommonConfig.no_target_enter_shell.get()
                     && MutantShulker.this.getTarget() == null
                     && MutantShulker.this.getHealth() < MutantShulker.this.getMaxHealth()
                     && !MutantShulker.this.isInBox()
                     && MutantShulker.this.random.nextInt((Integer)MutantShulkerCommonConfig.no_target_enter_shell_chance.get()) == 0
                  || !MutantShulker.this.level().isClientSide()
                     && MutantShulker.this.getTarget() != null
                     && MutantShulker.this.getHealth()
                        < MutantShulker.this.getMaxHealth() * (((Integer)MutantShulkerCommonConfig.enter_shell_health_threshold.get()).floatValue() / 100.0F)
                     && !MutantShulker.this.isInBox()
                     && MutantShulker.this.random.nextInt((Integer)MutantShulkerCommonConfig.targeting_enter_shell_chance.get()) == 0
            );
      }

      public void start() {
         super.start();
         MutantShulker.this.playSound(SoundEventInit.MUTANT_SHULKER_CLOSE);
         MutantShulker.this.setInBox(true);
      }
   }

   class LeaveShellGoal extends Goal {
      public LeaveShellGoal() {
         this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK, Flag.TARGET, Flag.JUMP));
      }

      public boolean canUse() {
         return !MutantShulker.this.level().isClientSide()
               && MutantShulker.this.getTarget() == null
               && MutantShulker.this.getHealth() >= MutantShulker.this.getMaxHealth()
               && MutantShulker.this.isInBox()
               && MutantShulker.this.random.nextInt(25) == 0
            || !MutantShulker.this.level().isClientSide()
               && MutantShulker.this.getTarget() != null
               && MutantShulker.this.isInBox()
               && (
                  MutantShulker.this.healthHealedInShell >= (Double)MutantShulkerCommonConfig.leave_shell_health_healed.get()
                     || MutantShulker.this.getHealth() >= MutantShulker.this.getMaxHealth()
               );
      }

      public void start() {
         super.start();
         MutantShulker.this.nextEnterShellTime = MutantShulker.this.tickCount + (Integer)MutantShulkerCommonConfig.enter_shell_cooldown.get();
         MutantShulker.this.playSound(SoundEventInit.MUTANT_SHULKER_OPEN);
         MutantShulker.this.setInBox(false);
      }
   }

   public class MutantShulkerBodyRotationControl extends BodyRotationControl implements Control {
      private final Mob mob;
      private int headStableTime;
      private float lastStableYHeadRot;

      public MutantShulkerBodyRotationControl(Mob p_24879_) {
         super(p_24879_);
         this.mob = p_24879_;
      }

      public void clientTick() {
         if (this.isMoving()) {
            this.mob.yBodyRot = this.mob.getYRot();
            this.rotateHeadIfNecessary();
            this.lastStableYHeadRot = this.mob.yHeadRot;
            this.headStableTime = 0;
         } else if (this.notCarryingMobPassengers()) {
            if (Math.abs(this.mob.yHeadRot - this.lastStableYHeadRot) > 15.0F) {
               this.headStableTime = 0;
               this.lastStableYHeadRot = this.mob.yHeadRot;
               this.rotateBodyIfNecessary();
            } else {
               this.headStableTime++;
               if (this.headStableTime > 10) {
                  this.rotateHeadTowardsFront();
               }
            }
         }
      }

      private void rotateBodyIfNecessary() {
         if (this.mob instanceof MutantShulker && ((MutantShulker)this.mob).shouldBodyMoveWithHead()) {
            this.mob.yBodyRot = Mth.rotateIfNecessary(this.mob.yBodyRot, this.mob.yHeadRot, 75.0F);
         }
      }

      private void rotateHeadIfNecessary() {
         if (this.mob instanceof MutantShulker && ((MutantShulker)this.mob).shouldBodyMoveWithHead()) {
            this.mob.yHeadRot = Mth.rotateIfNecessary(this.mob.yHeadRot, this.mob.yBodyRot, 75.0F);
         }
      }

      private void rotateHeadTowardsFront() {
         if (this.mob instanceof MutantShulker && ((MutantShulker)this.mob).shouldBodyMoveWithHead()) {
            int i = this.headStableTime - 10;
            float f = Mth.clamp(i / 10.0F, 0.0F, 1.0F);
            float f1 = 75.0F * (1.0F - f);
            this.mob.yBodyRot = Mth.rotateIfNecessary(this.mob.yBodyRot, this.mob.yHeadRot, f1);
         }
      }

      private boolean notCarryingMobPassengers() {
         return !(this.mob.getFirstPassenger() instanceof Mob);
      }

      private boolean isMoving() {
         double d0 = this.mob.getX() - this.mob.xo;
         double d1 = this.mob.getZ() - this.mob.zo;
         return d0 * d0 + d1 * d1 > 2.5000003E-7F;
      }
   }

   class RemainStationaryGoal extends Goal {
      public RemainStationaryGoal() {
         this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK, Flag.TARGET, Flag.JUMP));
      }

      public void tick() {
         super.tick();
         MutantShulker.this.getNavigation().stop();
      }

      public boolean canUse() {
         return MutantShulker.this.shouldBeStationary();
      }
   }
}
