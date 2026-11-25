package com.alexander.mutantmore.entities;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.ai.goals.AllDirectionsTargetGoal;
import com.alexander.mutantmore.ai.goals.ApproachTargetGoal;
import com.alexander.mutantmore.ai.goals.GroundPullAntiCheeseGoal;
import com.alexander.mutantmore.ai.goals.LookAtTargetGoal;
import com.alexander.mutantmore.ai.goals.mutant_husk.MutantHuskGeyserAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_husk.MutantHuskMeleeAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_husk.MutantHuskPunchAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_husk.MutantHuskRoarGoal;
import com.alexander.mutantmore.ai.goals.mutant_husk.MutantHuskThrowSandAttackGoal;
import com.alexander.mutantmore.blocks.QuicksandBlock;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.mutant_husk.MutantHuskClientConfig;
import com.alexander.mutantmore.config.mutant_husk.MutantHuskCommonConfig;
import com.alexander.mutantmore.init.BlockInit;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.particles.AdvancedParticleOption;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class MutantHusk extends AbstractMutant {
   private static final EntityDataAccessor<Integer> REMAINING_LIVES = SynchedEntityData.defineId(MutantHusk.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<String> SAND_TYPE = SynchedEntityData.defineId(MutantHusk.class, EntityDataSerializers.STRING);
   public AnimationState noveltyAnimationState = new AnimationState();
   public int noveltyAnimationTick;
   public final int noveltyAnimationLength = 75;
   public AnimationState throwSandAnimationState = new AnimationState();
   public int throwSandAnimationTick;
   public final int throwSandAnimationLength = 47;
   public final int throwSandAnimationActionPoint = 21;
   public AnimationState attackAnimationState = new AnimationState();
   public int attackAnimationTick;
   public final int attackAnimationLength = 26;
   public final int attackAnimationActionPoint = 11;
   public AnimationState trapAnimationState = new AnimationState();
   public int trapAnimationTick;
   public final int trapAnimationLength = 55;
   public final int trapAnimationActionPoint = 33;
   public AnimationState roarAnimationState = new AnimationState();
   public int roarAnimationTick;
   public final int roarAnimationLength = 120;
   public final int roarAnimationActionPoint = 103;
   public AnimationState introAnimationState = new AnimationState();
   public int introAnimationTick;
   public final int introAnimationLength = 50;
   public AnimationState geyserAnimationState = new AnimationState();
   public int geyserAnimationTick;
   public final int geyserAnimationLength = 70;
   public final int geyserAnimationActionPoint = 37;
   public AnimationState jumpAnimationState = new AnimationState();
   public int jumpAnimationTick;
   public final int jumpAnimationLength = 7;
   public final int jumpAnimationActionPoint = 2;
   public AnimationState slamAnimationState = new AnimationState();
   public int slamAnimationTick;
   public final int slamAnimationLength = 12;
   public final int slamAnimationActionPoint = 10;
   public AnimationState downAnimationState = new AnimationState();
   public int downAnimationTick;
   public final int downAnimationLength = 100;
   public AnimationState walkAnimationState = new AnimationState();
   public AnimationState idleAnimationState = new AnimationState();
   public AnimationState jumpingAnimationState = new AnimationState();
   public boolean jumping;
   public int jumpingFor;
   public DamageSource deathDamageSource;
   public List<Entity> resurrectedMobs = Lists.newArrayList();
   public LivingEntity targetBeforeDeath;
   public boolean geyserDeathCheck = false;
   private static final Predicate<Entity> ALIVE = target -> target.isAlive();
   public DamageSource killedBy = this.damageSources().cramming();

   public MutantHusk(EntityType<? extends MutantHusk> p_i50189_1_, Level p_i50189_2_) {
      super(p_i50189_1_, p_i50189_2_);
      this.xpReward = (Integer)MutantHuskCommonConfig.exp_reward.get();
   }

   protected void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(0, new MutantHusk.RemainStationaryGoal());
      this.goalSelector.addGoal(1, new GroundPullAntiCheeseGoal(this));
      if ((Boolean)MutantHuskCommonConfig.uses_punch_attack.get()) {
         this.goalSelector.addGoal(2, new MutantHuskPunchAttackGoal(this));
      }

      if ((Boolean)MutantHuskCommonConfig.uses_roar.get()) {
         this.goalSelector.addGoal(3, new MutantHuskRoarGoal(this));
      }

      if ((Boolean)MutantHuskCommonConfig.uses_geyser_attack.get()) {
         this.goalSelector.addGoal(4, new MutantHuskGeyserAttackGoal(this));
      }

      if ((Boolean)MutantHuskCommonConfig.uses_basic_attack.get()) {
         this.goalSelector.addGoal(5, new MutantHuskMeleeAttackGoal(this));
      }

      if ((Boolean)MutantHuskCommonConfig.uses_sand_throw.get()) {
         this.goalSelector.addGoal(6, new MutantHuskThrowSandAttackGoal(this));
      }

      this.goalSelector
         .addGoal(
            7,
            new ApproachTargetGoal(
               this,
               (Double)MutantHuskCommonConfig.follow_target_wanted_distance.get(),
               (Double)MutantHuskCommonConfig.following_movement_speed_multiplier.get(),
               true
            )
         );
      this.goalSelector.addGoal(8, new LookAtTargetGoal(this));
      this.goalSelector.addGoal(9, new LookAtPlayerGoal(this, Player.class, 20.0F));
      this.goalSelector.addGoal(9, new WaterAvoidingRandomStrollGoal(this, 1.0));
      this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, Mob.class, 10.0F));
      this.goalSelector.addGoal(11, new RandomLookAroundGoal(this));
      this.targetSelector.addGoal(0, new HurtByTargetGoal(this, new Class[0]).setUnseenMemoryTicks(6000));
      if ((Boolean)MutantHuskCommonConfig.attacks_players.get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mutants_attack_players_off.get()) {
         this.targetSelector.addGoal(1, new AllDirectionsTargetGoal(this, Player.class, true).setUnseenMemoryTicks(6000));
      }

      this.targetSelector
         .addGoal(
            2,
            new NearestAttackableTargetGoal<LivingEntity>(
               this, LivingEntity.class, 20, false, false, (entity, level) -> entity.is(TagInit.EntityTypes.MUTANT_HUSK_TARGETS)
            ) {
               protected AABB getTargetSearchArea(double p_26069_) {
                  return this.mob
                     .getBoundingBox()
                     .inflate(
                        (Double)MutantHuskCommonConfig.follow_non_player_distance.get(),
                        (Double)MutantHuskCommonConfig.follow_non_player_distance.get(),
                        (Double)MutantHuskCommonConfig.follow_non_player_distance.get()
                     );
               }
            }
         );
      if ((Boolean)MutantHuskCommonConfig.attacks_baby_turtles.get()) {
         this.targetSelector
            .addGoal(
               3,
               new AllDirectionsTargetGoal<Turtle>(this, Turtle.class, 10, true, false, Turtle.BABY_ON_LAND_SELECTOR) {
                  @Override
                  protected AABB getTargetSearchArea(double p_26069_) {
                     return this.mob
                        .getBoundingBox()
                        .inflate(
                           (Double)MutantHuskCommonConfig.follow_non_player_distance.get(),
                           (Double)MutantHuskCommonConfig.follow_non_player_distance.get(),
                           (Double)MutantHuskCommonConfig.follow_non_player_distance.get()
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
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_HUSK_CANT_TARGET, this, target, this, null);
   }

   public boolean canHarm(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_HUSK_CANT_HURT, this, target, this, null);
   }

   public static Builder createConfiguredAttributes() {
      return Mob.createMobAttributes()
         .add(Attributes.MAX_HEALTH, (Double)MutantHuskCommonConfig.max_health.get())
         .add(Attributes.ARMOR, (Double)MutantHuskCommonConfig.armour.get())
         .add(Attributes.ARMOR_TOUGHNESS, (Double)MutantHuskCommonConfig.armour_toughness.get())
         .add(Attributes.KNOCKBACK_RESISTANCE, (Double)MutantHuskCommonConfig.knockback_resistance.get())
         .add(Attributes.FOLLOW_RANGE, (Double)MutantHuskCommonConfig.follow_player_distance.get())
         .add(Attributes.MOVEMENT_SPEED, (Double)MutantHuskCommonConfig.movement_speed.get());
   }

   public void die(DamageSource p_21014_) {
      this.targetBeforeDeath = this.getTarget();
      this.deathDamageSource = p_21014_;
      if (this.getRemainingLives() <= 0 || p_21014_.is(DamageTypes.GENERIC_KILL) || p_21014_.is(DamageTypes.FELL_OUT_OF_WORLD)) {
         super.die(p_21014_);
      }

      this.downAnimationTick = 100;
      this.geyserDeathCheck = true;
      this.level().broadcastEntityEvent(this, (byte)7);
      this.playSound(SoundEventInit.MUTANT_HUSK_DOWN, 2.0F, MiscUtils.randomSoundPitch());
      this.killedBy = p_21014_;
   }

   protected void tickDeath() {
      this.deathTime++;
      if (this.getLastDamageSource() == null || !this.getLastDamageSource().is(DamageTypes.GENERIC_KILL) && !this.getLastDamageSource().is(DamageTypes.FELL_OUT_OF_WORLD)) {
         if (this.downAnimationTick == 100 - 7) {
            this.playSound(SoundEventInit.MUTANT_HUSK_THUD, 2.0F, MiscUtils.randomSoundPitch());
         }

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

               this.playSound(SoundEventInit.MUTANT_HUSK_DEATH, 2.5F, MiscUtils.randomSoundPitch());
               this.remove(RemovalReason.KILLED);
            }
         } else {
            if (this.deathTime >= 100) {
               this.setRemainingLives(this.getRemainingLives() - 1);
               this.setHealth(this.getMaxHealth());
               this.deathTime = 0;
               if (this.targetBeforeDeath != null) {
                  this.setTarget(this.targetBeforeDeath);
               }
            }

            if (this.downAnimationTick == 100 - 40) {
               this.playSound(SoundEventInit.MUTANT_HUSK_REVIVE, 1.5F, MiscUtils.randomSoundPitch());
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
      return SoundEventInit.MUTANT_HUSK_IDLE;
   }

   protected SoundEvent getHurtSound(DamageSource p_33034_) {
      return SoundEventInit.MUTANT_HUSK_HURT;
   }

   protected void playStepSound(BlockPos p_20135_, BlockState p_20136_) {
      this.playSound(SoundEventInit.MUTANT_HUSK_STEP, 0.75F, 1.0F);
   }

   protected float getSoundVolume() {
      return 1.5F;
   }

   @Override
   public void aiStep() {
      super.aiStep();
      if (this.isAlive()) {
         String sandType = MiscUtils.sandStringForPos(this.level(), this.getOnPos());
         if (this.roarAnimationTick == 103) {
            this.roar();

            for (int i = 0; i < 500; i++) {
               Vec3 motion = PositionUtils.getOffsetMotion(this, 0.0, 0.0, 1.25 + this.random.nextGaussian() * 0.25, 0.0F, this.random.nextFloat() * 360.0F);
               this.level()
                  .addParticle(
                     new AdvancedParticleOption(ParticleTypeInit.SAND, List.of((float)MiscUtils.sandColourForSandType(sandType))),
                     this.getX(),
                     this.getRandomY(),
                     this.getZ(),
                     motion.x,
                     motion.y,
                     motion.z
                  );
            }
         }

         if (!this.level().isClientSide() && this.roarAnimationTick <= 103 && this.roarAnimationTick > 120 - 72) {
            AABB aabb = this.getBoundingBox()
               .inflate(
                  (Double)MutantHuskCommonConfig.roar_quicksand_range.get(),
                  (Double)MutantHuskCommonConfig.roar_quicksand_range.get() / 2.0,
                  (Double)MutantHuskCommonConfig.roar_quicksand_range.get()
               );
            if ((Boolean)MutantHuskCommonConfig.roar_attack_griefing.get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.quicksand_griefing_off.get()) {
               for (BlockPos blockpos : BlockPos.betweenClosed(
                  Mth.floor(aabb.minX),
                  Mth.floor(aabb.minY),
                  Mth.floor(aabb.minZ),
                  Mth.floor(aabb.maxX),
                  Mth.floor(aabb.maxY),
                  Mth.floor(aabb.maxZ)
               )) {
                  BlockState blockstate = this.level().getBlockState(blockpos);
                  if (blockstate.isAir()
                     && QuicksandBlock.survivable(MiscUtils.quicksandBlockForSandType(sandType).defaultBlockState(), this.level(), blockpos)
                     && this.random.nextInt(200) == 0) {
                     this.level().setBlockAndUpdate(blockpos, MiscUtils.quicksandBlockForSandType(sandType).defaultBlockState());
                  }
               }
            }
         }
      }
   }

   private void roar() {
      if (this.isAlive()) {
         for (Entity entity : this.level()
            .getEntitiesOfClass(
               LivingEntity.class,
               this.getBoundingBox()
                  .inflate(
                     (Double)MutantHuskCommonConfig.roar_damage_range.get(),
                     (Double)MutantHuskCommonConfig.roar_damage_range.get() / 2.0,
                     (Double)MutantHuskCommonConfig.roar_damage_range.get()
                  ),
               ALIVE
            )) {
            if (entity != this) {
               if (this.canHarm(entity)) {
                  if ((Boolean)MutantHuskCommonConfig.ignores_invulnerability_time.get()) {
                     entity.setInvulnerableTime(0);
                  }

                  MiscUtils.hurt(entity, this.damageSources().mobAttack(this), ((Double)MutantHuskCommonConfig.roar_damage.get()).floatValue());
               }

               this.strongKnockback(entity);
            }
         }
      }
   }

   private void strongKnockback(Entity p_213688_1_) {
      double d0 = p_213688_1_.getX() - this.getX();
      double d1 = p_213688_1_.getZ() - this.getZ();
      double d2 = Math.max(d0 * d0 + d1 * d1, 0.001);
      p_213688_1_.push(d0 / d2 * 5.0, 0.2, d1 / d2 * 5.0);
   }

   @Override
   public List<Block> cantBreakWithHurtGriefing() {
      return Arrays.asList(BlockInit.QUICKSAND);
   }

   public boolean notCurrentlyPlayingKeyframeAnimation() {
      return this.noveltyAnimationTick <= 0
         && this.throwSandAnimationTick <= 0
         && this.downAnimationTick <= 0
         && this.attackAnimationTick <= 0
         && this.trapAnimationTick <= 0
         && this.roarAnimationTick <= 0
         && this.geyserAnimationTick <= 0
         && this.jumpAnimationTick <= 0
         && this.slamAnimationTick <= 0
         && this.introAnimationTick <= 0;
   }

   @Override
   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);
      builder.define(REMAINING_LIVES, (Integer)MutantHuskCommonConfig.get_up_times.get());
      builder.define(SAND_TYPE, "");
   }

   @Override
   protected void readAdditionalSaveData(ValueInput p_21450_) {
      super.readAdditionalSaveData(p_21450_);
      this.setRemainingLives(p_21450_.getIntOr("RemainingLives", 0));
   }

   protected void addAdditionalSaveData(ValueOutput p_21484_) {
      super.addAdditionalSaveData(p_21484_);
      p_21484_.putInt("RemainingLives", this.getRemainingLives());
   }

   public int getRemainingLives() {
      return (Integer)this.entityData.get(REMAINING_LIVES);
   }

   public void setRemainingLives(int value) {
      this.entityData.set(REMAINING_LIVES, value);
   }

   public String getSandType() {
      return (String)this.entityData.get(SAND_TYPE);
   }

   public void setSandType(String value) {
      this.entityData.set(SAND_TYPE, value);
   }

   // Undead is the minecraft:undead entity tag now (data/minecraft/tags/entity_type/undead.json)

   @Override
   public void baseTick() {
      super.baseTick();
      this.idleAnimationState.startIfStopped(this.tickCount);
      this.walkAnimationState.startIfStopped(this.tickCount);
      this.jumpingAnimationState.startIfStopped(this.tickCount);
      this.tickDownAnimTimers();
      Vec3 velocity = this.getDeltaMovement();
      float groundSpeed = Mth.sqrt((float)(velocity.x * velocity.x + velocity.z * velocity.z));
      if (!this.level().isClientSide()
         && groundSpeed <= 0.01F
         && this.noveltyAnimationTick <= 0
         && this.random.nextInt(400) == 0
         && this.notCurrentlyPlayingKeyframeAnimation()
         && (this.getTarget() == null || this.getTarget().isDeadOrDying() || this.getTarget().isRemoved())) {
         this.noveltyAnimationTick = 75;
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

      if (this.throwSandAnimationTick > 0) {
         this.throwSandAnimationTick--;
      }

      if (this.level().isClientSide() && this.throwSandAnimationTick <= 0) {
         this.throwSandAnimationState.stop();
      }

      if (this.downAnimationTick > 0) {
         this.downAnimationTick--;
      }

      if (this.level().isClientSide() && this.downAnimationTick <= 0) {
         this.downAnimationState.stop();
      }

      if (this.attackAnimationTick > 0) {
         this.attackAnimationTick--;
      }

      if (this.level().isClientSide() && this.attackAnimationTick <= 0) {
         this.attackAnimationState.stop();
      }

      if (this.trapAnimationTick > 0) {
         this.trapAnimationTick--;
      }

      if (this.level().isClientSide() && this.trapAnimationTick <= 0) {
         this.trapAnimationState.stop();
      }

      if (this.roarAnimationTick > 0) {
         this.roarAnimationTick--;
      }

      if (this.level().isClientSide() && this.roarAnimationTick <= 0) {
         this.roarAnimationState.stop();
      }

      if (this.geyserAnimationTick > 0) {
         this.geyserAnimationTick--;
      }

      if (this.level().isClientSide() && this.geyserAnimationTick <= 0) {
         this.geyserAnimationState.stop();
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

      if (this.introAnimationTick > 0) {
         this.introAnimationTick--;
      }

      if (this.level().isClientSide() && this.introAnimationTick <= 0) {
         this.introAnimationState.stop();
      }
   }

   public void handleEntityEvent(byte p_21375_) {
      if (p_21375_ == 4) {
         this.noveltyAnimationTick = 75;
         this.noveltyAnimationState.start(this.tickCount);
      } else if (p_21375_ == 5) {
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 6) {
         this.throwSandAnimationTick = 47;
         this.throwSandAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 7) {
         this.downAnimationTick = 100;
         this.downAnimationState.start(this.tickCount);
      } else if (p_21375_ == 8) {
         this.attackAnimationTick = 26;
         this.attackAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 9) {
         this.trapAnimationTick = 55;
         this.trapAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 10) {
         this.roarAnimationTick = 120;
         this.roarAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 11) {
         this.geyserAnimationTick = 70;
         this.geyserAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 12) {
         this.jumpAnimationTick = 7;
         this.jumpAnimationState.start(this.tickCount);
         this.jumping = true;
         this.noveltyAnimationTick = 0;
         this.geyserAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 13) {
         this.slamAnimationTick = 12;
         this.slamAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.jumping = false;
         this.noveltyAnimationState.stop();
      } else if (p_21375_ == 14) {
         this.introAnimationTick = 50;
         this.introAnimationState.start(this.tickCount);
         this.noveltyAnimationTick = 0;
         this.noveltyAnimationState.stop();
      } else {
         super.handleEntityEvent(p_21375_);
      }
   }

   public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_21434_, DifficultyInstance p_21435_, EntitySpawnReason p_21436_, SpawnGroupData p_21437_) {
      this.setRemainingLives((Integer)MutantHuskCommonConfig.get_up_times.get());
      MiscUtils.spawnWithPumpkinOnHalloween(this, p_21434_.getRandom());
      return super.finalizeSpawn(p_21434_, p_21435_, p_21436_, p_21437_);
   }

   @Override
   public void onMutated() {
      this.introAnimationTick = 50;
      this.noveltyAnimationTick = 0;
      this.level().broadcastEntityEvent(this, (byte)14);
   }

   @Override
   public List<SoundEvent> getBattleMusicSounds() {
      return List.of(SoundEventInit.AEGIS);
   }

   @Override
   public AbstractMutant.NodeEvaluatorDimensions getNodeEvaluatorDimensions() {
      return null;
   }

   @Override
   public TagKey<Block> walksThroughTag() {
      return TagInit.Blocks.MUTANT_HUSK_WALKS_THROUGH;
   }

   @Override
   public ConfigValue<Boolean> walkGriefingConfig() {
      return MutantHuskCommonConfig.walk_griefing;
   }

   @Override
   public ConfigValue<Boolean> walkGriefingDropsBlocksConfig() {
      return MutantHuskCommonConfig.walk_griefing_drops_blocks;
   }

   @Override
   public ConfigValue<Boolean> hurtGriefingConfig() {
      return MutantHuskCommonConfig.hurt_griefing;
   }

   @Override
   public ConfigValue<Boolean> hurtGriefingDropsBlocksConfig() {
      return MutantHuskCommonConfig.hurt_griefing_drops_blocks;
   }

   @Override
   public ConfigValue<Boolean> showHealthBarConfig() {
      return MutantHuskClientConfig.show_health_bar;
   }

   @Override
   public ConfigValue<Boolean> despawnsConfig() {
      return MutantHuskCommonConfig.despawns;
   }

   @Override
   public ConfigValue<Boolean> playBattleMusicConfig() {
      return MutantHuskClientConfig.play_battle_music;
   }

   class RemainStationaryGoal extends Goal {
      public RemainStationaryGoal() {
         this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK, Flag.TARGET, Flag.JUMP));
      }

      public boolean canUse() {
         return MutantHusk.this.shouldBeStationary();
      }
   }
}
