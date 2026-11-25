package com.alexander.mutantmore.entities;

import com.alexander.mutantmore.ai.goals.AllDirectionsTargetGoal;
import com.alexander.mutantmore.ai.goals.ApproachTargetGoal;
import com.alexander.mutantmore.ai.goals.GroundPullAntiCheeseGoal;
import com.alexander.mutantmore.ai.goals.LookAtTargetGoal;
import com.alexander.mutantmore.ai.goals.mutant_jungle_zombie.MutantJungleZombieChokeAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_jungle_zombie.MutantJungleZombieJumpGoal;
import com.alexander.mutantmore.ai.goals.mutant_jungle_zombie.MutantJungleZombiePunchAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_jungle_zombie.MutantJungleZombieSlamAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_jungle_zombie.MutantJungleZombieVineAttackGoal;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.mutant_jungle_zombie.MutantJungleZombieClientConfig;
import com.alexander.mutantmore.config.mutant_jungle_zombie.MutantJungleZombieCommonConfig;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.MoverType;
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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.scores.Scoreboard;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class MutantJungleZombie extends AbstractMutant {
   private static final EntityDataAccessor<Integer> REMAINING_LIVES = SynchedEntityData.defineId(MutantJungleZombie.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Integer> LIVES_LOST = SynchedEntityData.defineId(MutantJungleZombie.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Float> GRAB_ARM_X_ROT = SynchedEntityData.defineId(MutantJungleZombie.class, EntityDataSerializers.FLOAT);
   public AnimationState noveltyAnimationState = new AnimationState();
   public int noveltyAnimationTick;
   public final int noveltyAnimationLength = 90;
   public AnimationState downAnimationState = new AnimationState();
   public int downAnimationTick;
   public final int downAnimationLength = 160;
   public AnimationState introAnimationState = new AnimationState();
   public int introAnimationTick;
   public final int introAnimationLength = 40;
   public AnimationState punchAnimationState = new AnimationState();
   public int punchAnimationTick;
   public final int punchAnimationLength = 25;
   public final int punchAnimationActionPointStart = 14;
   public final int punchAnimationActionPointStop = 9;
   public AnimationState tryChokeAnimationState = new AnimationState();
   public int tryChokeAnimationTick;
   public final int tryChokeAnimationLength = 35;
   public final int tryChokeAnimationActionPointStart = 18;
   public final int tryChokeAnimationActionPointStop = 9;
   public AnimationState chokeAnimationState = new AnimationState();
   public int chokeAnimationTick;
   public final int chokeAnimationLength = 80;
   public final int chokeAnimationActionPoint = 15;
   public AnimationState lowAttackAnimationState = new AnimationState();
   public int lowAttackAnimationTick;
   public final int lowAttackAnimationLength = 30;
   public final int lowAttackAnimationActionPoint = 17;
   public AnimationState highAttackAnimationState = new AnimationState();
   public int highAttackAnimationTick;
   public final int highAttackAnimationLength = 30;
   public final int highAttackAnimationActionPoint = 14;
   public AnimationState jumpAnimationState = new AnimationState();
   public int jumpAnimationTick;
   public final int jumpAnimationLength = 20;
   public final int jumpAnimationActionPoint = 12;
   public AnimationState trySlamAnimationState = new AnimationState();
   public int trySlamAnimationTick;
   public final int trySlamAnimationLength = 30;
   public final int trySlamAnimationActionPointStart = 11;
   public final int trySlamAnimationActionPointStop = 9;
   public AnimationState slamAnimationState = new AnimationState();
   public int slamAnimationTick;
   public final int slamAnimationLength = 80;
   public AnimationState stopRestingAnimationState = new AnimationState();
   public int stopRestingAnimationTick;
   public final int stopRestingAnimationLength = 25;
   public int restTick;
   public final int restLength = 60;
   public int failedAttacks;
   public DamageSource deathDamageSource;
   public LivingEntity targetBeforeDeath;
   public DamageSource killedBy = this.damageSources().cramming();
   public boolean jumping;
   public int jumpingFor;

   public MutantJungleZombie(EntityType<? extends MutantJungleZombie> p_i50189_1_, Level p_i50189_2_) {
      super(p_i50189_1_, p_i50189_2_);
      this.xpReward = (Integer)MutantJungleZombieCommonConfig.exp_reward.get();
   }

   protected void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(0, new MutantJungleZombie.RemainStationaryGoal());
      this.goalSelector.addGoal(1, new GroundPullAntiCheeseGoal(this));
      if ((Boolean)MutantJungleZombieCommonConfig.uses_strangle_attack.get()) {
         this.goalSelector.addGoal(2, new MutantJungleZombieChokeAttackGoal(this));
      }

      if ((Boolean)MutantJungleZombieCommonConfig.uses_slam_attack.get()) {
         this.goalSelector.addGoal(3, new MutantJungleZombieSlamAttackGoal(this));
      }

      if ((Boolean)MutantJungleZombieCommonConfig.uses_punch_attack.get()) {
         this.goalSelector.addGoal(4, new MutantJungleZombiePunchAttackGoal(this));
      }

      if ((Boolean)MutantJungleZombieCommonConfig.uses_jump.get()) {
         this.goalSelector.addGoal(5, new MutantJungleZombieJumpGoal(this));
      }

      if ((Boolean)MutantJungleZombieCommonConfig.uses_vine_attack.get()) {
         this.goalSelector.addGoal(6, new MutantJungleZombieVineAttackGoal(this));
      }

      this.goalSelector
         .addGoal(
            7,
            new ApproachTargetGoal(
               this,
               (Double)MutantJungleZombieCommonConfig.follow_target_wanted_distance.get(),
               (Double)MutantJungleZombieCommonConfig.following_movement_speed_multiplier.get(),
               true
            )
         );
      this.goalSelector.addGoal(8, new LookAtTargetGoal(this));
      this.goalSelector.addGoal(9, new LookAtPlayerGoal(this, Player.class, 20.0F));
      this.goalSelector.addGoal(9, new WaterAvoidingRandomStrollGoal(this, 1.0));
      this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, Mob.class, 10.0F));
      this.goalSelector.addGoal(11, new RandomLookAroundGoal(this));
      this.targetSelector.addGoal(0, new HurtByTargetGoal(this, new Class[0]).setUnseenMemoryTicks(6000));
      if ((Boolean)MutantJungleZombieCommonConfig.attacks_players.get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mutants_attack_players_off.get()) {
         this.targetSelector.addGoal(1, new AllDirectionsTargetGoal(this, Player.class, true).setUnseenMemoryTicks(6000));
      }

      this.targetSelector
         .addGoal(
            2,
            new NearestAttackableTargetGoal<LivingEntity>(
               this, LivingEntity.class, 20, false, false, (entity, level) -> entity.is(TagInit.EntityTypes.MUTANT_JUNGLE_ZOMBIE_TARGETS)
            ) {
               protected AABB getTargetSearchArea(double p_26069_) {
                  return this.mob
                     .getBoundingBox()
                     .inflate(
                        (Double)MutantJungleZombieCommonConfig.follow_non_player_distance.get(),
                        (Double)MutantJungleZombieCommonConfig.follow_non_player_distance.get(),
                        (Double)MutantJungleZombieCommonConfig.follow_non_player_distance.get()
                     );
               }
            }
         );
      if ((Boolean)MutantJungleZombieCommonConfig.attacks_baby_turtles.get()) {
         this.targetSelector
            .addGoal(
               3,
               new AllDirectionsTargetGoal<Turtle>(this, Turtle.class, 10, true, false, Turtle.BABY_ON_LAND_SELECTOR) {
                  @Override
                  protected AABB getTargetSearchArea(double p_26069_) {
                     return this.mob
                        .getBoundingBox()
                        .inflate(
                           (Double)MutantJungleZombieCommonConfig.follow_non_player_distance.get(),
                           (Double)MutantJungleZombieCommonConfig.follow_non_player_distance.get(),
                           (Double)MutantJungleZombieCommonConfig.follow_non_player_distance.get()
                        );
                  }
               }
            );
      }
   }

   public boolean shouldBeStationary() {
      return this.downAnimationTick > 0 || this.introAnimationTick > 0 || this.restTick > 0 || this.stopRestingAnimationTick > 0;
   }

   public boolean canAttack(LivingEntity target) {
      return this.canTarget(target) && super.canAttack(target);
   }

   boolean canTarget(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_JUNGLE_ZOMBIE_CANT_TARGET, this, target, this, null);
   }

   public boolean canHarm(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_JUNGLE_ZOMBIE_CANT_HURT, this, target, this, null);
   }

   public static Builder createConfiguredAttributes() {
      return Mob.createMobAttributes()
         .add(Attributes.MAX_HEALTH, (Double)MutantJungleZombieCommonConfig.max_health.get())
         .add(Attributes.ARMOR, (Double)MutantJungleZombieCommonConfig.armour.get())
         .add(Attributes.ARMOR_TOUGHNESS, (Double)MutantJungleZombieCommonConfig.armour_toughness.get())
         .add(Attributes.KNOCKBACK_RESISTANCE, (Double)MutantJungleZombieCommonConfig.knockback_resistance.get())
         .add(Attributes.FOLLOW_RANGE, (Double)MutantJungleZombieCommonConfig.follow_player_distance.get())
         .add(Attributes.MOVEMENT_SPEED, (Double)MutantJungleZombieCommonConfig.movement_speed.get())
         .add(Attributes.ATTACK_DAMAGE, (Double)MutantJungleZombieCommonConfig.punch_attack_damage.get());
   }

   public void die(DamageSource p_21014_) {
      this.targetBeforeDeath = this.getTarget();
      this.deathDamageSource = p_21014_;
      if (this.getRemainingLives() <= 0 || p_21014_.is(DamageTypes.GENERIC_KILL) || p_21014_.is(DamageTypes.FELL_OUT_OF_WORLD)) {
         super.die(p_21014_);
      }

      this.failedAttacks = 0;
      this.downAnimationTick = 160;
      this.level().broadcastEntityEvent(this, (byte)7);
      if (!p_21014_.is(DamageTypes.GENERIC_KILL) && !p_21014_.is(DamageTypes.FELL_OUT_OF_WORLD) && !this.level().isClientSide()) {
         AreaDamage areaDamage = AreaDamage.spawnAreaDamage(
            this.level(),
            this.position(),
            this,
            ((Double)MutantJungleZombieCommonConfig.death_poison_cloud_damage.get()).floatValue(),
            MMDamageTypes.poisonCloud(this.damageSources()),
            0.0F,
            30.0F,
            0.3F,
            5.0F,
            80,
            10,
            true,
            false,
            0.0,
            0.0,
            false,
            false,
            0,
            false,
            TagInit.EntityTypes.MUTANT_JUNGLE_ZOMBIE_CANT_HURT,
            3
         );
         if (this.getTeam() != null) {
            Scoreboard scoreboard = this.level().getScoreboard();
            scoreboard.addPlayerToTeam(areaDamage.getScoreboardName(), scoreboard.getPlayerTeam(this.getTeam().getName()));
         }

         ((ServerLevel)this.level()).addFreshEntityWithPassengers(areaDamage);
      }

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
         } else if (this.deathTime >= 160) {
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

   protected SoundEvent getAmbientSound() {
      return SoundEventInit.MUTANT_JUNGLE_ZOMBIE_IDLE;
   }

   protected SoundEvent getHurtSound(DamageSource p_33034_) {
      return SoundEventInit.MUTANT_JUNGLE_ZOMBIE_HURT;
   }

   protected void playStepSound(BlockPos p_20135_, BlockState p_20136_) {
      this.playSound(SoundEventInit.MUTANT_JUNGLE_ZOMBIE_STEP, 0.75F, 1.0F);
   }

   protected float getSoundVolume() {
      return 1.5F;
   }

   @Override
   public void aiStep() {
      super.aiStep();
      if (this.horizontalCollision && (Boolean)this.walkGriefingConfig().get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get()) {
         boolean flag = false;
         AABB aabb = this.getBoundingBox().inflate(1.2);

         for (BlockPos blockpos : BlockPos.betweenClosed(
            Mth.floor(aabb.minX),
            Mth.floor(aabb.minY),
            Mth.floor(aabb.minZ),
            Mth.floor(aabb.maxX),
            Mth.floor(aabb.maxY),
            Mth.floor(aabb.maxZ)
         )) {
            BlockState blockstate = this.level().getBlockState(blockpos);
            Block block = blockstate.getBlock();
            if (blockstate.is(this.walksThroughTag())) {
               flag = this.level()
                     .destroyBlock(
                        blockpos,
                        (Boolean)this.walkGriefingDropsBlocksConfig().get() || (Boolean)MutantMoreGroupedOptionsCommonConfig.griefing_drops_blocks_on.get(),
                        this
                     )
                  || flag;
            }
         }
      }

      if (this.jumping && (Boolean)MutantJungleZombieCommonConfig.jump_griefing.get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get()) {
         boolean flag = false;
         AABB aabb = this.getBoundingBox().inflate(2.0);

         for (BlockPos blockpos : BlockPos.betweenClosed(
            Mth.floor(aabb.minX),
            Mth.floor(aabb.minY),
            Mth.floor(aabb.minZ),
            Mth.floor(aabb.maxX),
            Mth.floor(aabb.maxY),
            Mth.floor(aabb.maxZ)
         )) {
            BlockState blockstate = this.level().getBlockState(blockpos);
            Block block = blockstate.getBlock();
            if (blockstate.is(this.walksThroughTag())) {
               flag = this.level()
                     .destroyBlock(
                        blockpos,
                        (Boolean)MutantJungleZombieCommonConfig.jump_griefing_drops_blocks.get()
                           || (Boolean)MutantMoreGroupedOptionsCommonConfig.griefing_drops_blocks_on.get(),
                        this
                     )
                  || flag;
            }
         }
      }

      if (this.jumping && (Boolean)MutantJungleZombieCommonConfig.jump_griefing.get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get()) {
         boolean flag = false;
         AABB aabb = this.getBoundingBox().inflate(1.0).move(0.0, 1.0, 0.0);

         for (BlockPos blockpos : BlockPos.betweenClosed(
            Mth.floor(aabb.minX),
            Mth.floor(aabb.minY),
            Mth.floor(aabb.minZ),
            Mth.floor(aabb.maxX),
            Mth.floor(aabb.maxY),
            Mth.floor(aabb.maxZ)
         )) {
            BlockState blockstate = this.level().getBlockState(blockpos);
            Block block = blockstate.getBlock();
            if (!blockstate.is(TagInit.Blocks.UNBREAKABLE)) {
               boolean destroyed = this.level()
                  .destroyBlock(
                     blockpos,
                     (Boolean)MutantJungleZombieCommonConfig.jump_griefing_drops_blocks.get()
                        || (Boolean)MutantMoreGroupedOptionsCommonConfig.griefing_drops_blocks_on.get(),
                     this
                  );
               flag = block.defaultDestroyTime() > 0.0F && destroyed || flag;
            }
         }

         if (flag) {
            this.jumping = false;
            this.jumpingFor = 0;
            this.setDeltaMovement(0.0, 0.0, 0.0);
         }
      }
   }

   private void stunEffect() {
      for (int i = 0; i < (3 + this.getLivesLost()) * 3; i++) {
         if (this.random.nextInt(10) == 0) {
            this.level()
               .addParticle(ParticleTypes.SPLASH, this.getRandomX(0.75), this.getEyeY() - 1.0 + this.random.nextGaussian(), this.getRandomZ(0.75), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public boolean isInvulnerableTo(ServerLevel level, DamageSource source) {
      // Dungeons Mobs' jungle zombies on the same team can't hurt it (no-op when that mod isn't installed)
      Entity attacker = source.getEntity();
      return attacker != null
            && "dungeons_mobs:jungle_zombie".equals(BuiltInRegistries.ENTITY_TYPE.getKey(attacker.getType()).toString())
            && attacker.getTeam() == this.getTeam()
         || super.isInvulnerableTo(level, source);
   }

   public boolean notCurrentlyPlayingKeyframeAnimation() {
      return this.noveltyAnimationTick <= 0
         && this.downAnimationTick <= 0
         && this.introAnimationTick <= 0
         && this.punchAnimationTick <= 0
         && this.tryChokeAnimationTick <= 0
         && this.chokeAnimationTick <= 0
         && this.lowAttackAnimationTick <= 0
         && this.highAttackAnimationTick <= 0
         && this.jumpAnimationTick <= 0
         && this.trySlamAnimationTick <= 0
         && this.slamAnimationTick <= 0;
   }

   @Override
   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);
      builder.define(REMAINING_LIVES, (Integer)MutantJungleZombieCommonConfig.get_up_times.get());
      builder.define(LIVES_LOST, 0);
      builder.define(GRAB_ARM_X_ROT, 0.0F);
   }

   @Override
   protected void readAdditionalSaveData(ValueInput input) {
      super.readAdditionalSaveData(input);
      this.setRemainingLives(input.getIntOr("RemainingLives", 0));
      this.setLivesLost(input.getIntOr("LivesLost", 0));
   }

   @Override
   protected void addAdditionalSaveData(ValueOutput output) {
      super.addAdditionalSaveData(output);
      output.putInt("RemainingLives", this.getRemainingLives());
      output.putInt("LivesLost", this.getLivesLost());
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

   public float getGrabArmXRot() {
      return (Float)this.entityData.get(GRAB_ARM_X_ROT);
   }

   public void setGrabArmXRot(float value) {
      this.entityData.set(GRAB_ARM_X_ROT, value);
   }

   // Undead is the minecraft:undead entity tag now (data/minecraft/tags/entity_type/undead.json)

   @Override
   public boolean canBeAffected(MobEffectInstance effect) {
      return !effect.is(MobEffects.POISON) && super.canBeAffected(effect);
   }

   @Override
   public void baseTick() {
      super.baseTick();
      this.tickDownAnimTimers();
      if (this.getDeltaMovement().horizontalDistanceSqr() > 2.5000003E-7F && this.random.nextInt(5) == 0) {
         int i = Mth.floor(this.getX());
         int j = Mth.floor(this.getY() - 0.2F);
         int k = Mth.floor(this.getZ());
         BlockPos pos = new BlockPos(i, j, k);
         BlockState blockstate = this.level().getBlockState(pos);
         if (!blockstate.isAir()) {
            this.level()
               .addParticle(
                  new BlockParticleOption(ParticleTypes.BLOCK, blockstate),
                  this.getX() + (this.random.nextFloat() - 0.5) * this.getBbWidth(),
                  this.getY() + 0.1,
                  this.getZ() + (this.random.nextFloat() - 0.5) * this.getBbWidth(),
                  4.0 * (this.random.nextFloat() - 0.5),
                  0.5,
                  (this.random.nextFloat() - 0.5) * 4.0
               );
         }
      }

      if (this.jumping && this.getTarget() != null && this.getDeltaMovement().horizontalDistance() <= 0.1) {
         this.xOld = this.getX();
         this.yOld = this.getY();
         this.zOld = this.getZ();
         this.setDeltaMovement(0.0, this.getDeltaMovement().y(), 0.0);
         double x = this.getTarget().getX() - this.getX();
         double y = this.getTarget().getY() - this.getY();
         double z = this.getTarget().getZ() - this.getZ();
         double d = Math.sqrt(x * x + y * y + z * z);
         this.setDeltaMovement(this.getDeltaMovement().add(new Vec3(x / d * 0.2F, 0.0, z / d * 0.2F).scale(2.0)));
         this.move(MoverType.SELF, this.getDeltaMovement());
      }

      Vec3 velocity = this.getDeltaMovement();
      float groundSpeed = Mth.sqrt((float)(velocity.x * velocity.x + velocity.z * velocity.z));
      if (!this.level().isClientSide()
         && groundSpeed <= 0.01F
         && this.noveltyAnimationTick <= 0
         && this.random.nextInt(400) == 0
         && this.notCurrentlyPlayingKeyframeAnimation()
         && (this.getTarget() == null || this.getTarget().isDeadOrDying() || this.getTarget().isRemoved())) {
         this.noveltyAnimationTick = 90;
         this.level().broadcastEntityEvent(this, (byte)4);
      }

      if (!this.level().isClientSide() && this.noveltyAnimationTick > 0 && groundSpeed > 0.01F) {
         this.noveltyAnimationTick = 0;
         this.level().broadcastEntityEvent(this, (byte)5);
      }

      if (!this.level().isClientSide()) {
         if (this.jumping) {
            this.jumpingFor++;
         }

         if (this.jumpingFor >= 10 && this.onGround()) {
            this.jumping = false;
            this.jumpingFor = 0;
            AreaDamage areaDamage = AreaDamage.spawnAreaDamage(
               this.level(),
               this.position(),
               this,
               ((Double)MutantJungleZombieCommonConfig.jump_poison_cloud_damage.get()).floatValue(),
               MMDamageTypes.poisonCloud(this.damageSources()),
               0.0F,
               5.0F,
               0.2F,
               1.5F,
               80,
               0,
               true,
               false,
               0.0,
               0.0,
               false,
               false,
               0,
               false,
               TagInit.EntityTypes.MUTANT_JUNGLE_ZOMBIE_CANT_HURT,
               3
            );
            if (this.getTeam() != null) {
               Scoreboard scoreboard = this.level().getScoreboard();
               scoreboard.addPlayerToTeam(areaDamage.getScoreboardName(), scoreboard.getPlayerTeam(this.getTeam().getName()));
            }

            ((ServerLevel)this.level()).addFreshEntityWithPassengers(areaDamage);
         }
      }

      if (!this.level().isClientSide() && this.failedAttacks > 0) {
         for (int i = 0; i < this.failedAttacks * 3; i++) {
            if (this.random.nextInt(10) == 0) {
               ((ServerLevel)this.level())
                  .sendParticles(
                     ParticleTypes.SPLASH,
                     this.getRandomX(0.75),
                     this.getEyeY() - 1.0 + this.random.nextGaussian(),
                     this.getRandomZ(0.75),
                     1,
                     0.0,
                     0.0,
                     0.0,
                     0.0
                  );
            }
         }

         if (this.failedAttacks >= 3 + this.getLivesLost()) {
            this.failedAttacks = 0;
            this.noveltyAnimationTick = 0;
            this.restTick = 60;
            this.level().broadcastEntityEvent(this, (byte)13);
         }
      }

      if (this.restTick == 1) {
         this.stopRestingAnimationTick = 25;
         this.stopRestingAnimationState.start(this.tickCount);
      }
   }

   public void tickDownAnimTimers() {
      if (this.noveltyAnimationTick > 0) {
         this.noveltyAnimationTick--;
      }

      if (this.level().isClientSide() && this.noveltyAnimationTick <= 0) {
         this.noveltyAnimationState.stop();
      }

      if (this.downAnimationTick > 0) {
         this.downAnimationTick--;
      }

      if (this.level().isClientSide() && this.downAnimationTick <= 0) {
         this.downAnimationState.stop();
      }

      if (this.introAnimationTick > 0) {
         this.introAnimationTick--;
      }

      if (this.level().isClientSide() && this.introAnimationTick <= 0) {
         this.introAnimationState.stop();
      }

      if (this.punchAnimationTick > 0) {
         this.punchAnimationTick--;
      }

      if (this.level().isClientSide() && this.punchAnimationTick <= 0) {
         this.punchAnimationState.stop();
      }

      if (this.tryChokeAnimationTick > 0) {
         this.tryChokeAnimationTick--;
      }

      if (this.level().isClientSide() && this.tryChokeAnimationTick <= 0) {
         this.tryChokeAnimationState.stop();
      }

      if (this.chokeAnimationTick > 0) {
         this.chokeAnimationTick--;
      }

      if (this.level().isClientSide() && this.chokeAnimationTick <= 0) {
         this.chokeAnimationState.stop();
      }

      if (this.lowAttackAnimationTick > 0) {
         this.lowAttackAnimationTick--;
      }

      if (this.level().isClientSide() && this.lowAttackAnimationTick <= 0) {
         this.lowAttackAnimationState.stop();
      }

      if (this.highAttackAnimationTick > 0) {
         this.highAttackAnimationTick--;
      }

      if (this.level().isClientSide() && this.highAttackAnimationTick <= 0) {
         this.highAttackAnimationState.stop();
      }

      if (this.jumpAnimationTick > 0) {
         this.jumpAnimationTick--;
      }

      if (this.level().isClientSide() && this.jumpAnimationTick <= 0) {
         this.jumpAnimationState.stop();
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

      if (this.stopRestingAnimationTick > 0) {
         this.stopRestingAnimationTick--;
      }

      if (this.level().isClientSide() && this.stopRestingAnimationTick <= 0) {
         this.stopRestingAnimationState.stop();
      }

      if (this.restTick > 0) {
         this.stunEffect();
         this.restTick--;
      }
   }

   public void handleEntityEvent(byte p_21375_) {
      if (p_21375_ == 4) {
         this.noveltyAnimationTick = 90;
         this.noveltyAnimationState.start(this.tickCount);
      } else if (p_21375_ == 5) {
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 6) {
         this.punchAnimationTick = 25;
         this.punchAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 7) {
         this.downAnimationTick = 160;
         this.downAnimationState.start(this.tickCount);
      } else if (p_21375_ == 8) {
         this.tryChokeAnimationTick = 35;
         this.tryChokeAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 9) {
         this.chokeAnimationTick = 80;
         this.chokeAnimationState.start(this.tickCount);
         this.tryChokeAnimationTick = 0;
         this.tryChokeAnimationState.stop();
      } else if (p_21375_ == 10) {
         this.lowAttackAnimationTick = 30;
         this.lowAttackAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 11) {
         this.highAttackAnimationTick = 30;
         this.highAttackAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 12) {
         this.jumpAnimationTick = 20;
         this.jumpAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 13) {
         this.restTick = 60;
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 14) {
         this.introAnimationTick = 40;
         this.introAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 15) {
         this.trySlamAnimationTick = 30;
         this.trySlamAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 16) {
         this.slamAnimationTick = 80;
         this.slamAnimationState.start(this.tickCount);
         this.trySlamAnimationTick = 0;
         this.trySlamAnimationState.stop();
      } else {
         super.handleEntityEvent(p_21375_);
      }
   }

   @Override
   public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_21434_, DifficultyInstance p_21435_, EntitySpawnReason p_21436_, SpawnGroupData p_21437_) {
      this.setRemainingLives((Integer)MutantJungleZombieCommonConfig.get_up_times.get());
      MiscUtils.spawnWithPumpkinOnHalloween(this, p_21434_.getRandom());
      return super.finalizeSpawn(p_21434_, p_21435_, p_21436_, p_21437_);
   }

   @Override
   public void onMutated() {
      this.introAnimationTick = 40;
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
      return TagInit.Blocks.MUTANT_JUNGLE_ZOMBIE_WALKS_THROUGH;
   }

   @Override
   public ConfigValue<Boolean> walkGriefingConfig() {
      return MutantJungleZombieCommonConfig.walk_griefing;
   }

   @Override
   public ConfigValue<Boolean> walkGriefingDropsBlocksConfig() {
      return MutantJungleZombieCommonConfig.walk_griefing_drops_blocks;
   }

   @Override
   public ConfigValue<Boolean> hurtGriefingConfig() {
      return MutantJungleZombieCommonConfig.hurt_griefing;
   }

   @Override
   public ConfigValue<Boolean> hurtGriefingDropsBlocksConfig() {
      return MutantJungleZombieCommonConfig.hurt_griefing_drops_blocks;
   }

   @Override
   public ConfigValue<Boolean> showHealthBarConfig() {
      return MutantJungleZombieClientConfig.show_health_bar;
   }

   @Override
   public ConfigValue<Boolean> despawnsConfig() {
      return MutantJungleZombieCommonConfig.despawns;
   }

   @Override
   public ConfigValue<Boolean> playBattleMusicConfig() {
      return MutantJungleZombieClientConfig.play_battle_music;
   }

   class RemainStationaryGoal extends Goal {
      public RemainStationaryGoal() {
         this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK, Flag.TARGET, Flag.JUMP));
      }

      public boolean canUse() {
         return MutantJungleZombie.this.shouldBeStationary();
      }
   }
}
