package com.alexander.mutantmore.entities;

import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.ai.goals.AllDirectionsTargetGoal;
import com.alexander.mutantmore.ai.goals.ApproachTargetGoal;
import com.alexander.mutantmore.ai.goals.GroundPullAntiCheeseGoal;
import com.alexander.mutantmore.ai.goals.LookAtTargetGoal;
import com.alexander.mutantmore.ai.goals.mutant_frozen_zombie.MutantFrozenZombieIcicleSlamGoal;
import com.alexander.mutantmore.ai.goals.mutant_frozen_zombie.MutantFrozenZombieIcicleThrowAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_frozen_zombie.MutantFrozenZombieJumpGoal;
import com.alexander.mutantmore.ai.goals.mutant_frozen_zombie.MutantFrozenZombieMeleeAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_frozen_zombie.MutantFrozenZombieRoarGoal;
import com.alexander.mutantmore.ai.goals.mutant_frozen_zombie.MutantFrozenZombieSnowThrowAttackGoal;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.mutant_frozen_zombie.MutantFrozenZombieClientConfig;
import com.alexander.mutantmore.config.mutant_frozen_zombie.MutantFrozenZombieCommonConfig;
import com.alexander.mutantmore.init.EffectInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.interfaces.ISnowstormSource;
import com.alexander.mutantmore.util.HeatUtils;
import com.alexander.mutantmore.util.MiscUtils;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.SpawnGroupData;
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
import net.minecraft.world.entity.animal.turtle.Turtle;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class MutantFrozenZombie extends AbstractMutant implements ISnowstormSource {
   private static final EntityDataAccessor<Integer> REMAINING_LIVES = SynchedEntityData.defineId(MutantFrozenZombie.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Integer> LIVES_LOST = SynchedEntityData.defineId(MutantFrozenZombie.class, EntityDataSerializers.INT);
   public AnimationState noveltyAnimationState = new AnimationState();
   public int noveltyAnimationTick;
   public final int noveltyAnimationLength = 60;
   public AnimationState attackAnimationState = new AnimationState();
   public int attackAnimationTick;
   public final int attackAnimationLength = 32;
   public final int attackAnimationActionPoint = 17;
   public AnimationState throwAnimationState = new AnimationState();
   public int throwAnimationTick;
   public final int throwAnimationLength = 42;
   public final int throwAnimationActionPoint = 19;
   public AnimationState roarAnimationState = new AnimationState();
   public int roarAnimationTick;
   public final int roarAnimationLength = 120;
   public final int roarAnimationActionPoint = 100;
   public AnimationState downAnimationState = new AnimationState();
   public int downAnimationTick;
   public final int downAnimationLength = 100;
   public AnimationState introAnimationState = new AnimationState();
   public int introAnimationTick;
   public final int introAnimationLength = 45;
   public AnimationState iciclesAnimationState = new AnimationState();
   public int iciclesAnimationTick;
   public final int iciclesAnimationLength = 70;
   public final int iciclesAnimationActionPoint = 36;
   public AnimationState snowThrowAnimationState = new AnimationState();
   public int snowThrowAnimationTick;
   public final int snowThrowAnimationLength = 62;
   public final int snowThrowAnimationActionPoint = 20;
   public AnimationState jumpAnimationState = new AnimationState();
   public int jumpAnimationTick;
   public final int jumpAnimationLength = 7;
   public final int jumpAnimationActionPoint = 2;
   public AnimationState slamAnimationState = new AnimationState();
   public int slamAnimationTick;
   public final int slamAnimationLength = 12;
   public final int slamAnimationActionPoint = 10;
   public boolean jumping;
   public int jumpingFor;
   public boolean wantsToJump;
   public DamageSource deathDamageSource;
   public List<Entity> resurrectedMobs = Lists.newArrayList();
   public LivingEntity targetBeforeDeath;
   public int snowstormTime = 0;
   public DamageSource killedBy = this.damageSources().cramming();

   public MutantFrozenZombie(EntityType<? extends MutantFrozenZombie> p_i50189_1_, Level p_i50189_2_) {
      super(p_i50189_1_, p_i50189_2_);
      this.xpReward = (Integer)MutantFrozenZombieCommonConfig.exp_reward.get();
      this.setPathfindingMalus(PathType.WATER, 0.0F);
   }

   protected void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(0, new MutantFrozenZombie.RemainStationaryGoal());
      this.goalSelector.addGoal(1, new GroundPullAntiCheeseGoal(this));
      if ((Boolean)MutantFrozenZombieCommonConfig.uses_ice_smash.get()) {
         this.goalSelector.addGoal(2, new MutantFrozenZombieJumpGoal(this));
      }

      if ((Boolean)MutantFrozenZombieCommonConfig.uses_melee_attack.get()) {
         this.goalSelector.addGoal(3, new MutantFrozenZombieMeleeAttackGoal(this));
      }

      if ((Boolean)MutantFrozenZombieCommonConfig.uses_roar.get()) {
         this.goalSelector.addGoal(4, new MutantFrozenZombieRoarGoal(this));
      }

      if ((Boolean)MutantFrozenZombieCommonConfig.uses_snow_throw.get()) {
         this.goalSelector.addGoal(5, new MutantFrozenZombieSnowThrowAttackGoal(this));
      }

      if ((Boolean)MutantFrozenZombieCommonConfig.uses_icicle_slam.get()) {
         this.goalSelector.addGoal(6, new MutantFrozenZombieIcicleSlamGoal(this));
      }

      if ((Boolean)MutantFrozenZombieCommonConfig.uses_icicle_throw.get()) {
         this.goalSelector.addGoal(7, new MutantFrozenZombieIcicleThrowAttackGoal(this));
      }

      this.goalSelector
         .addGoal(
            8,
            new ApproachTargetGoal(
               this,
               (Double)MutantFrozenZombieCommonConfig.follow_target_wanted_distance.get(),
               (Double)MutantFrozenZombieCommonConfig.following_movement_speed_multiplier.get(),
               true
            ) {
               @Override
               public boolean canUse() {
                  return MutantFrozenZombie.this.snowstormTime <= 0 && super.canUse();
               }
            }
         );
      this.goalSelector
         .addGoal(8, new ApproachTargetGoal(this, 0.0, (Double)MutantFrozenZombieCommonConfig.following_movement_speed_multiplier_snowstorm.get(), true) {
            @Override
            public boolean canUse() {
               return MutantFrozenZombie.this.snowstormTime > 0 && super.canUse();
            }
         });
      this.goalSelector.addGoal(9, new LookAtTargetGoal(this));
      this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, Player.class, 20.0F));
      this.goalSelector.addGoal(10, new WaterAvoidingRandomStrollGoal(this, 1.0));
      this.goalSelector.addGoal(11, new LookAtPlayerGoal(this, Mob.class, 10.0F));
      this.goalSelector.addGoal(12, new RandomLookAroundGoal(this));
      this.targetSelector.addGoal(0, new HurtByTargetGoal(this, new Class[0]).setUnseenMemoryTicks(6000));
      if ((Boolean)MutantFrozenZombieCommonConfig.attacks_players.get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mutants_attack_players_off.get()) {
         this.targetSelector.addGoal(1, new AllDirectionsTargetGoal(this, Player.class, true).setUnseenMemoryTicks(6000));
      }

      this.targetSelector
         .addGoal(
            2,
            new NearestAttackableTargetGoal<LivingEntity>(
               this, LivingEntity.class, 20, false, false, (entity, level) -> entity.is(TagInit.EntityTypes.MUTANT_FROZEN_ZOMBIE_TARGETS)
            ) {
               protected AABB getTargetSearchArea(double p_26069_) {
                  return this.mob
                     .getBoundingBox()
                     .inflate(
                        (Double)MutantFrozenZombieCommonConfig.follow_non_player_distance.get(),
                        (Double)MutantFrozenZombieCommonConfig.follow_non_player_distance.get(),
                        (Double)MutantFrozenZombieCommonConfig.follow_non_player_distance.get()
                     );
               }
            }
         );
      if ((Boolean)MutantFrozenZombieCommonConfig.attacks_baby_turtles.get()) {
         this.targetSelector
            .addGoal(
               3,
               new AllDirectionsTargetGoal<Turtle>(this, Turtle.class, 10, true, false, Turtle.BABY_ON_LAND_SELECTOR) {
                  @Override
                  protected AABB getTargetSearchArea(double p_26069_) {
                     return this.mob
                        .getBoundingBox()
                        .inflate(
                           (Double)MutantFrozenZombieCommonConfig.follow_non_player_distance.get(),
                           (Double)MutantFrozenZombieCommonConfig.follow_non_player_distance.get(),
                           (Double)MutantFrozenZombieCommonConfig.follow_non_player_distance.get()
                        );
                  }
               }
            );
      }
   }

   public boolean shouldBeStationary() {
      return this.downAnimationTick > 0 || this.introAnimationTick > 0;
   }

   public boolean canAttack(LivingEntity target) {
      return this.canTarget(target) && super.canAttack(target);
   }

   boolean canTarget(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_FROZEN_ZOMBIE_CANT_TARGET, this, target, this, null);
   }

   public boolean canHarm(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_FROZEN_ZOMBIE_CANT_HURT, this, target, this, null);
   }

   public static Builder createConfiguredAttributes() {
      return Mob.createMobAttributes()
         .add(Attributes.MAX_HEALTH, (Double)MutantFrozenZombieCommonConfig.max_health.get())
         .add(Attributes.ARMOR, (Double)MutantFrozenZombieCommonConfig.armour.get())
         .add(Attributes.ARMOR_TOUGHNESS, (Double)MutantFrozenZombieCommonConfig.armour_toughness.get())
         .add(Attributes.KNOCKBACK_RESISTANCE, (Double)MutantFrozenZombieCommonConfig.knockback_resistance.get())
         .add(Attributes.FOLLOW_RANGE, (Double)MutantFrozenZombieCommonConfig.follow_player_distance.get())
         .add(Attributes.MOVEMENT_SPEED, (Double)MutantFrozenZombieCommonConfig.movement_speed.get());
   }

   public void die(DamageSource p_21014_) {
      this.targetBeforeDeath = this.getTarget();
      this.deathDamageSource = p_21014_;
      if (this.getRemainingLives() <= 0 || p_21014_.is(DamageTypes.GENERIC_KILL) || p_21014_.is(DamageTypes.FELL_OUT_OF_WORLD)) {
         super.die(p_21014_);
      }

      this.downAnimationTick = 100;
      this.level().broadcastEntityEvent(this, (byte)7);
      this.killedBy = p_21014_;
   }

   protected void tickDeath() {
      this.deathTime++;
      if (this.getLastDamageSource() == null || !this.getLastDamageSource().is(DamageTypes.GENERIC_KILL) && !this.getLastDamageSource().is(DamageTypes.FELL_OUT_OF_WORLD)) {
         if (this.deathDamageSource != null
            && (
               this.getRemainingLives() <= 0
                  || this.deathDamageSource.is(DamageTypes.GENERIC_KILL)
                  || this.deathDamageSource.is(DamageTypes.FELL_OUT_OF_WORLD)
            )) {
            if (this.deathTime == 35 && !this.level().isClientSide()) {
               this.level().broadcastEntityEvent(this, (byte)60);
               if (this.killedBy != null) {
                  this.dropAllTickDeathLoot(this.killedBy);
               }

               this.remove(RemovalReason.KILLED);
            }
         } else if (this.deathTime >= 100) {
            this.setRemainingLives(this.getRemainingLives() - 1);
            this.setLivesLost(this.getLivesLost() + 1);
            this.setHealth(this.isOnFire() ? this.getMaxHealth() / 2.0F : this.getMaxHealth());
            this.deathTime = 0;
            if (this.targetBeforeDeath != null) {
               this.setTarget(this.targetBeforeDeath);
            }
         }
      } else if (this.deathTime == 20 && !this.level().isClientSide()) {
         this.level().broadcastEntityEvent(this, (byte)60);
         this.remove(RemovalReason.KILLED);
      }
   }

   public boolean isInvulnerable() {
      return this.downAnimationTick > 0 ? true : super.isInvulnerable();
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

   public boolean canFreeze() {
      return false;
   }

   @Override
   public List<Block> cantBreakWithHurtGriefing() {
      return Arrays.asList(Blocks.SNOW);
   }

   public boolean isInvulnerableTo(ServerLevel level, DamageSource p_20122_) {
      return p_20122_.getEntity() != null
            && "dungeons_mobs:frozen_zombie".equals(BuiltInRegistries.ENTITY_TYPE.getKey(p_20122_.getEntity().getType()).toString())
            && p_20122_.getEntity().getTeam() == this.getTeam()
         ? true
         : super.isInvulnerableTo(level, p_20122_);
   }

   public boolean canCollideWith(Entity p_20303_) {
      return p_20303_ instanceof IcicleSpike ? false : super.canCollideWith(p_20303_);
   }

   @Override
   public void aiStep() {
      super.aiStep();
      if (!this.level().isClientSide()
         && this.shouldHaveSnowstorm()
         && (Boolean)MutantFrozenZombieCommonConfig.snowstorm_griefing.get()
         && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get()) {
         for (int i = 0; i < 10; i++) {
            BlockPos pos = this.blockPosition()
                  .offset(
                     (int)(-this.snowstormRange()) + this.random.nextInt(Mth.floor(this.snowstormRange() * 2.0)),
                     (int)(-this.snowstormRangeY()) + this.random.nextInt(Mth.floor(this.snowstormRangeY() * 2.0)),
                     (int)(-this.snowstormRange()) + this.random.nextInt(Mth.floor(this.snowstormRange() * 2.0))
                  );
            if (this.level().getBlockState(pos).isAir() && this.canSnowSurvive(Blocks.SNOW.defaultBlockState(), this.level(), pos)) {
               this.level().setBlockAndUpdate(pos, Blocks.SNOW.defaultBlockState());
            } else if (this.level().getBlockState(pos).getBlock() == Blocks.SNOW && (Integer)this.level().getBlockState(pos).getValue(SnowLayerBlock.LAYERS) < 8) {
               this.level()
                  .setBlockAndUpdate(
                     pos,
                     (BlockState)Blocks.SNOW
                        .defaultBlockState()
                        .setValue(SnowLayerBlock.LAYERS, Mth.clamp((Integer)this.level().getBlockState(pos).getValue(SnowLayerBlock.LAYERS) + 1, 0, 8))
                  );
            }
         }
      }

      if (this.roarAnimationTick == 100) {
         this.snowstormTime = (Integer)MutantFrozenZombieCommonConfig.roar_snowstorm_duration.get();
      }
   }

   public boolean canSnowSurvive(BlockState p_56602_, LevelReader p_56603_, BlockPos p_56604_) {
      BlockState blockstate = p_56603_.getBlockState(p_56604_.below());
      if (blockstate.is(BlockTags.CANNOT_SUPPORT_SNOW_LAYER)) {
         return false;
      } else {
         return blockstate.is(BlockTags.SUPPORT_OVERRIDE_SNOW_LAYER)
            ? true
            : Block.isFaceFull(blockstate.getCollisionShape(p_56603_, p_56604_.below()), Direction.UP)
               || blockstate.is(Blocks.SNOW) && (Integer)blockstate.getValue(SnowLayerBlock.LAYERS) == 8;
      }
   }

   @Override
   public double snowstormRange() {
      return this.shouldHaveSnowstorm() ? (Double)MutantFrozenZombieCommonConfig.roar_snowstorm_range.get() : 0.0;
   }

   @Override
   public double snowstormRangeY() {
      return this.shouldHaveSnowstorm() ? (Double)MutantFrozenZombieCommonConfig.roar_snowstorm_range_y.get() : 0.0;
   }

   public boolean shouldHaveSnowstorm() {
      return this.deathTime <= 0 && this.snowstormTime > 0;
   }

   @Override
   public boolean canFreeze(LivingEntity heatTarget) {
      if (heatTarget.is(TagInit.EntityTypes.UNAFFECTED_BY_SNOWSTORMS)) {
         return false;
      } else if (heatTarget.is(TagInit.EntityTypes.UNAFFECTED_BY_MUTANT_FROZEN_ZOMBIE_SNOWSTORMS)) {
         return false;
      } else if (this.getTeam() == null
         || heatTarget.getTeam() == null
         || this.getTeam() != heatTarget.getTeam() && !this.getTeam().isAlliedTo(heatTarget.getTeam())) {
         return heatTarget.isSpectator() ? false : !(heatTarget instanceof Player) || !((Player)heatTarget).isCreative();
      } else {
         return false;
      }
   }

   public boolean notCurrentlyPlayingKeyframeAnimation() {
      return this.noveltyAnimationTick <= 0
         && this.attackAnimationTick <= 0
         && this.downAnimationTick <= 0
         && this.iciclesAnimationTick <= 0
         && this.introAnimationTick <= 0
         && this.roarAnimationTick <= 0
         && this.snowThrowAnimationTick <= 0
         && this.throwAnimationTick <= 0
         && this.jumpAnimationTick <= 0
         && this.slamAnimationTick <= 0;
   }

   @Override
   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);
      builder.define(REMAINING_LIVES, (Integer)MutantFrozenZombieCommonConfig.get_up_times.get());
      builder.define(LIVES_LOST, 0);
   }

   @Override
   protected void readAdditionalSaveData(ValueInput p_21450_) {
      super.readAdditionalSaveData(p_21450_);
      this.setRemainingLives(p_21450_.getIntOr("RemainingLives", 0));
      this.setLivesLost(p_21450_.getIntOr("LivesLost", 0));
   }

   protected void addAdditionalSaveData(ValueOutput p_21484_) {
      super.addAdditionalSaveData(p_21484_);
      p_21484_.putInt("RemainingLives", this.getRemainingLives());
      p_21484_.putInt("LivesLost", this.getLivesLost());
   }

   public int getRemainingLives() {
      return (Integer)this.entityData.get(REMAINING_LIVES);
   }

   public void setRemainingLives(int value) {
      this.entityData.set(REMAINING_LIVES, value);
   }

   public int getLivesLost() {
      return (Integer)this.entityData.get(LIVES_LOST);
   }

   public void setLivesLost(int value) {
      this.entityData.set(LIVES_LOST, value);
   }

   // Undead is the minecraft:undead entity tag now (data/minecraft/tags/entity_type/undead.json)

   public boolean canBeAffected(MobEffectInstance p_21197_) {
      return p_21197_.getEffect() == EffectInit.FREEZING ? false : super.canBeAffected(p_21197_);
   }

   /** Frost Walker I under its feet (FrostWalkerEnchantment.onEntityMoved is gone in 26.x; frost walker is a data enchantment effect now). */
   private void frostWalk() {
      if (!(this.level() instanceof ServerLevel level) || !this.onGround()) {
         return;
      }

      BlockState ice = Blocks.FROSTED_ICE.defaultBlockState();
      int radius = 3;
      BlockPos base = this.blockPosition();
      for (BlockPos pos : BlockPos.betweenClosed(base.offset(-radius, -1, -radius), base.offset(radius, -1, radius))) {
         if (pos.closerToCenterThan(this.position(), radius) && level.getBlockState(pos.above()).isAir()) {
            BlockState state = level.getBlockState(pos);
            if (state.is(Blocks.WATER) && state.getFluidState().isSource() && ice.canSurvive(level, pos) && level.isUnobstructed(ice, pos, CollisionContext.empty())) {
               level.setBlockAndUpdate(pos, ice);
               level.scheduleTick(pos, Blocks.FROSTED_ICE, Mth.nextInt(this.random, 60, 120));
            }
         }
      }
   }

   @Override
   public void baseTick() {
      super.baseTick();
      this.tickDownAnimTimers();
      this.frostWalk();
      if (this.snowstormTime > 0) {
         this.snowstormTime--;
      }

      HeatUtils.performSnowstorm(
         this,
         this.blockPosition(),
         this.level(),
         (Integer)MutantFrozenZombieCommonConfig.roar_snowstorm_freeze_speed.get(),
         (Integer)MutantFrozenZombieCommonConfig.roar_snowstorm_max_freeze_amount.get(),
         false
      );
      Vec3 velocity = this.getDeltaMovement();
      float groundSpeed = Mth.sqrt((float)(velocity.x * velocity.x + velocity.z * velocity.z));
      if (!this.level().isClientSide()
         && groundSpeed <= 0.01F
         && this.noveltyAnimationTick <= 0
         && this.random.nextInt(400) == 0
         && this.notCurrentlyPlayingKeyframeAnimation()
         && (this.getTarget() == null || this.getTarget().isDeadOrDying() || this.getTarget().isRemoved())) {
         this.noveltyAnimationTick = 60;
         this.level().broadcastEntityEvent(this, (byte)4);
      }

      if (!this.level().isClientSide() && this.noveltyAnimationTick > 0 && groundSpeed > 0.01F) {
         this.noveltyAnimationTick = 0;
         this.level().broadcastEntityEvent(this, (byte)5);
      }

      if (this.jumping) {
         this.jumpingFor++;
      } else {
         this.jumpingFor = 0;
      }

      if (this.onGround() && this.jumping && this.jumpingFor >= 20) {
         this.jumping = false;
      }
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

      if (this.downAnimationTick > 0) {
         this.downAnimationTick--;
      }

      if (this.level().isClientSide() && this.downAnimationTick <= 0) {
         this.downAnimationState.stop();
      }

      if (this.iciclesAnimationTick > 0) {
         this.iciclesAnimationTick--;
      }

      if (this.level().isClientSide() && this.iciclesAnimationTick <= 0) {
         this.iciclesAnimationState.stop();
      }

      if (this.snowThrowAnimationTick > 0) {
         this.snowThrowAnimationTick--;
      }

      if (this.level().isClientSide() && this.snowThrowAnimationTick <= 0) {
         this.snowThrowAnimationState.stop();
      }

      if (this.roarAnimationTick > 0) {
         this.roarAnimationTick--;
      }

      if (this.level().isClientSide() && this.roarAnimationTick <= 0) {
         this.roarAnimationState.stop();
      }

      if (this.throwAnimationTick > 0) {
         this.throwAnimationTick--;
      }

      if (this.level().isClientSide() && this.throwAnimationTick <= 0) {
         this.throwAnimationState.stop();
      }

      if (this.introAnimationTick > 0) {
         this.introAnimationTick--;
      }

      if (this.level().isClientSide() && this.introAnimationTick <= 0) {
         this.introAnimationState.stop();
      }

      if (this.jumpAnimationTick > 0) {
         this.jumpAnimationTick--;
      }

      if (this.level().isClientSide() && this.jumpAnimationTick <= 0) {
         this.jumpAnimationState.stop();
      }

      if (this.slamAnimationTick > 0) {
         this.slamAnimationTick--;
      }

      if (this.level().isClientSide() && this.slamAnimationTick <= 0) {
         this.slamAnimationState.stop();
      }
   }

   public void handleEntityEvent(byte p_21375_) {
      if (p_21375_ == 4) {
         this.noveltyAnimationTick = 60;
         this.noveltyAnimationState.start(this.tickCount);
      } else if (p_21375_ == 5) {
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 6) {
         this.throwAnimationTick = 42;
         this.throwAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 7) {
         this.downAnimationTick = 100;
         this.downAnimationState.start(this.tickCount);
      } else if (p_21375_ == 8) {
         this.attackAnimationTick = 32;
         this.attackAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 9) {
         this.iciclesAnimationTick = 70;
         this.iciclesAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 10) {
         this.roarAnimationTick = 120;
         this.roarAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 11) {
         this.snowThrowAnimationTick = 62;
         this.snowThrowAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 14) {
         this.introAnimationTick = 45;
         this.introAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 15) {
         this.jumpAnimationTick = 7;
         this.jumpAnimationState.start(this.tickCount);
         this.jumping = true;
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 16) {
         this.slamAnimationTick = 12;
         this.slamAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.jumping = false;
         this.noveltyAnimationState.stop();
      } else {
         super.handleEntityEvent(p_21375_);
      }
   }

   public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_21434_, DifficultyInstance p_21435_, EntitySpawnReason p_21436_, SpawnGroupData p_21437_) {
      this.setRemainingLives((Integer)MutantFrozenZombieCommonConfig.get_up_times.get());
      MiscUtils.spawnWithPumpkinOnHalloween(this, p_21434_.getRandom());
      return super.finalizeSpawn(p_21434_, p_21435_, p_21436_, p_21437_);
   }

   @Override
   public void onMutated() {
      this.introAnimationTick = 45;
      this.noveltyAnimationTick = 0;
      this.level().broadcastEntityEvent(this, (byte)14);
      if (this.getItemInHand(InteractionHand.MAIN_HAND).getItem() == Items.SNOWBALL) {
         this.setItemInHand(InteractionHand.MAIN_HAND, ItemStack.EMPTY);
      }

      if (this.getItemInHand(InteractionHand.OFF_HAND).getItem() == Items.SNOWBALL) {
         this.setItemInHand(InteractionHand.OFF_HAND, ItemStack.EMPTY);
      }
   }

   @Override
   public List<SoundEvent> getBattleMusicSounds() {
      return List.of(SoundEventInit.FORCES_UNKNOWN);
   }

   @Override
   public AbstractMutant.NodeEvaluatorDimensions getNodeEvaluatorDimensions() {
      return null;
   }

   @Override
   public TagKey<Block> walksThroughTag() {
      return TagInit.Blocks.MUTANT_FROZEN_ZOMBIE_WALKS_THROUGH;
   }

   @Override
   public ConfigValue<Boolean> walkGriefingConfig() {
      return MutantFrozenZombieCommonConfig.walk_griefing;
   }

   @Override
   public ConfigValue<Boolean> walkGriefingDropsBlocksConfig() {
      return MutantFrozenZombieCommonConfig.walk_griefing_drops_blocks;
   }

   @Override
   public ConfigValue<Boolean> hurtGriefingConfig() {
      return MutantFrozenZombieCommonConfig.hurt_griefing;
   }

   @Override
   public ConfigValue<Boolean> hurtGriefingDropsBlocksConfig() {
      return MutantFrozenZombieCommonConfig.hurt_griefing_drops_blocks;
   }

   @Override
   public ConfigValue<Boolean> showHealthBarConfig() {
      return MutantFrozenZombieClientConfig.show_health_bar;
   }

   @Override
   public ConfigValue<Boolean> despawnsConfig() {
      return MutantFrozenZombieCommonConfig.despawns;
   }

   @Override
   public ConfigValue<Boolean> playBattleMusicConfig() {
      return MutantFrozenZombieClientConfig.play_battle_music;
   }

   class RemainStationaryGoal extends Goal {
      public RemainStationaryGoal() {
         this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK, Flag.TARGET, Flag.JUMP));
      }

      public boolean canUse() {
         return MutantFrozenZombie.this.shouldBeStationary();
      }
   }
}
