package com.alexander.mutantmore.entities;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import com.alexander.mutantmore.network.SyncAdvancedAnimationPayload;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers.AbstractAdvancedAnimation;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers.AdvancedAnimatable;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers.AdvancedAnimationTracker;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers.EntityAdvancedAnimation;
import com.alexander.mutantmore.ai.goals.AllDirectionsTargetGoal;
import com.alexander.mutantmore.ai.goals.ApproachTargetGoal;
import com.alexander.mutantmore.ai.goals.GroundPullAntiCheeseGoal;
import com.alexander.mutantmore.ai.goals.LookAtTargetGoal;
import com.alexander.mutantmore.ai.goals.mutant_wither_skeleton.MutantWitherSkeletonBlockGoal;
import com.alexander.mutantmore.ai.goals.mutant_wither_skeleton.MutantWitherSkeletonLungeGoal;
import com.alexander.mutantmore.ai.goals.mutant_wither_skeleton.MutantWitherSkeletonMeleeAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_wither_skeleton.MutantWitherSkeletonRibCrushAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_wither_skeleton.MutantWitherSkeletonWitherBreathAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_wither_skeleton.MutantWitherSkeletonWitherSlashGoal;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.mutant_wither_skeleton.MutantWitherSkeletonClientConfig;
import com.alexander.mutantmore.config.mutant_wither_skeleton.MutantWitherSkeletonCommonConfig;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.ItemInit;
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
import java.util.UUID;
import java.util.function.Predicate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
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
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class MutantWitherSkeleton extends AbstractMutant implements AdvancedAnimatable {
   private static final Identifier SPEED_MODIFIER_CROUCHING_ID = Identifier.fromNamespaceAndPath("mutantmore", "mutant_wither_skeleton_crouching");
   private AttributeModifier SPEED_MODIFIER_CROUCHING;
   public static EntityDimensions crouchingDimensions = EntityDimensions.scalable(1.25F, 2.4F);
   public static EntityDimensions lungingDimensions = EntityDimensions.scalable(1.25F, 1.25F);
   public final AdvancedAnimationTracker animationTracker;
   public Vec3 oldPos = Vec3.ZERO;
   public int repeatedHits;
   public float lungingXRot;

   public MutantWitherSkeleton(EntityType<? extends MutantWitherSkeleton> p_i50189_1_, Level p_i50189_2_) {
      super(p_i50189_1_, p_i50189_2_);
      this.animationTracker = this.createAnimationTracker();
      this.xpReward = (Integer)MutantWitherSkeletonCommonConfig.exp_reward.get();
      this.setPathfindingMalus(PathType.WATER, -1.0F);
      this.setPathfindingMalus(PathType.LAVA, 0.0F);
      this.setPathfindingMalus(PathType.FIRE_IN_NEIGHBOR, 0.0F);
      this.setPathfindingMalus(PathType.FIRE, 0.0F);
      this.SPEED_MODIFIER_CROUCHING = new AttributeModifier(
         SPEED_MODIFIER_CROUCHING_ID, -MutantWitherSkeletonCommonConfig.crouching_movement_speed_decrease.get(), AttributeModifier.Operation.ADD_VALUE
      );
   }

   protected void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(0, new MutantWitherSkeleton.RemainStationaryGoal());
      this.goalSelector.addGoal(1, new GroundPullAntiCheeseGoal(this));
      if ((Boolean)MutantWitherSkeletonCommonConfig.uses_block.get()) {
         this.goalSelector.addGoal(2, new MutantWitherSkeletonBlockGoal(this));
      }

      if ((Boolean)MutantWitherSkeletonCommonConfig.uses_lunge.get()) {
         this.goalSelector.addGoal(3, new MutantWitherSkeletonLungeGoal(this));
      }

      if ((Boolean)MutantWitherSkeletonCommonConfig.uses_wither_slash.get()) {
         this.goalSelector.addGoal(4, new MutantWitherSkeletonWitherSlashGoal(this));
      }

      if ((Boolean)MutantWitherSkeletonCommonConfig.uses_rib_crush.get()) {
         this.goalSelector.addGoal(5, new MutantWitherSkeletonRibCrushAttackGoal(this));
      }

      if ((Boolean)MutantWitherSkeletonCommonConfig.uses_melee_attack.get()) {
         this.goalSelector.addGoal(6, new MutantWitherSkeletonMeleeAttackGoal(this));
      }

      if ((Boolean)MutantWitherSkeletonCommonConfig.uses_wither_breath.get()) {
         this.goalSelector.addGoal(7, new MutantWitherSkeletonWitherBreathAttackGoal(this));
      }

      this.goalSelector
         .addGoal(
            8,
            new ApproachTargetGoal(
               this,
               (Double)MutantWitherSkeletonCommonConfig.following_target_distance.get(),
               (Double)MutantWitherSkeletonCommonConfig.following_movement_speed_multiplier.get(),
               true
            )
         );
      this.goalSelector.addGoal(9, new WaterAvoidingRandomStrollGoal(this, 1.0));
      this.goalSelector.addGoal(10, new LookAtTargetGoal(this));
      this.goalSelector.addGoal(11, new LookAtPlayerGoal(this, Player.class, 20.0F));
      this.goalSelector.addGoal(12, new LookAtPlayerGoal(this, Mob.class, 10.0F));
      this.goalSelector.addGoal(13, new RandomLookAroundGoal(this));
      this.targetSelector.addGoal(0, new HurtByTargetGoal(this, new Class[0]).setUnseenMemoryTicks(6000));
      if ((Boolean)MutantWitherSkeletonCommonConfig.attacks_players.get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mutants_attack_players_off.get()) {
         this.targetSelector.addGoal(1, new AllDirectionsTargetGoal(this, Player.class, true).setUnseenMemoryTicks(6000));
      }

      this.targetSelector
         .addGoal(
            2,
            new NearestAttackableTargetGoal<LivingEntity>(
               this, LivingEntity.class, 20, false, false, (entity, level) -> entity.is(TagInit.EntityTypes.MUTANT_WITHER_SKELETON_TARGETS)
            ) {
               protected AABB getTargetSearchArea(double p_26069_) {
                  return this.mob
                     .getBoundingBox()
                     .inflate(
                        (Double)MutantWitherSkeletonCommonConfig.follow_non_player_distance.get(),
                        (Double)MutantWitherSkeletonCommonConfig.follow_non_player_distance.get(),
                        (Double)MutantWitherSkeletonCommonConfig.follow_non_player_distance.get()
                     );
               }
            }
         );
      if ((Boolean)MutantWitherSkeletonCommonConfig.attacks_baby_turtles.get()) {
         this.targetSelector
            .addGoal(
               3,
               new AllDirectionsTargetGoal<Turtle>(this, Turtle.class, 10, true, false, Turtle.BABY_ON_LAND_SELECTOR) {
                  @Override
                  protected AABB getTargetSearchArea(double p_26069_) {
                     return this.mob
                        .getBoundingBox()
                        .inflate(
                           (Double)MutantWitherSkeletonCommonConfig.follow_non_player_distance.get(),
                           (Double)MutantWitherSkeletonCommonConfig.follow_non_player_distance.get(),
                           (Double)MutantWitherSkeletonCommonConfig.follow_non_player_distance.get()
                        );
                  }
               }
            );
      }
   }

   @Override
   public AbstractMutant.NodeEvaluatorDimensions getNodeEvaluatorDimensions() {
      return new AbstractMutant.NodeEvaluatorDimensions(
         Mth.floor(this.getBbWidth() + 1.0F), Mth.floor(crouchingDimensions.height()), Mth.floor(this.getBbWidth() + 1.0F)
      );
   }

   public boolean canAttack(LivingEntity target) {
      return this.canTarget(target) && super.canAttack(target);
   }

   boolean canTarget(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_WITHER_SKELETON_CANT_TARGET, this, target, this, null);
   }

   public boolean canHarm(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_WITHER_SKELETON_CANT_HURT, this, target, this, null);
   }

   public boolean shouldBeStationary() {
      return this.getAnimation("intro").isPlaying();
   }

   public static Builder createConfiguredAttributes() {
      return Mob.createMobAttributes()
         .add(Attributes.MAX_HEALTH, (Double)MutantWitherSkeletonCommonConfig.max_health.get())
         .add(Attributes.ARMOR, (Double)MutantWitherSkeletonCommonConfig.armour.get())
         .add(Attributes.ARMOR_TOUGHNESS, (Double)MutantWitherSkeletonCommonConfig.armour_toughness.get())
         .add(Attributes.KNOCKBACK_RESISTANCE, (Double)MutantWitherSkeletonCommonConfig.knockback_resistance.get())
         .add(Attributes.FOLLOW_RANGE, (Double)MutantWitherSkeletonCommonConfig.follow_player_distance.get())
         .add(Attributes.MOVEMENT_SPEED, (Double)MutantWitherSkeletonCommonConfig.movement_speed.get())
         .add(Attributes.ATTACK_DAMAGE, (Double)MutantWitherSkeletonCommonConfig.melee_attack_damage.get())
         .add(Attributes.ATTACK_KNOCKBACK, (Double)MutantWitherSkeletonCommonConfig.melee_attack_knockback.get());
   }

   protected SoundEvent getAmbientSound() {
      return SoundEventInit.MUTANT_WITHER_SKELETON_IDLE;
   }

   protected SoundEvent getHurtSound(DamageSource p_33034_) {
      return SoundEventInit.MUTANT_WITHER_SKELETON_HURT;
   }

   protected SoundEvent getDeathSound() {
      return null;
   }

   public float getVoicePitch() {
      return this.isDeadOrDying() ? 1.0F : super.getVoicePitch();
   }

   protected float getSoundVolume() {
      return this.isDeadOrDying() ? 3.0F : 1.5F;
   }

   protected void playStepSound(BlockPos p_20135_, BlockState p_20136_) {
      this.playSound(
         this.isInLava() ? SoundEventInit.MUTANT_WITHER_SKELETON_STEP_LAVA : SoundEventInit.MUTANT_WITHER_SKELETON_STEP,
         0.75F,
         1.0F
      );
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource p_21016_, float p_21017_) {
      boolean flag = !this.getAnimation("block").isPlaying() && super.hurtServer(level, p_21016_, p_21017_);
      if (flag) {
         this.getAnimation("hurt").start(0.25F, 0);
      }

      return flag;
   }

   // Players who start tracking mid-fight get every animation's current state (the original only synced on change)
   @Override
   public void startSeenByPlayer(ServerPlayer player) {
      super.startSeenByPlayer(player);
      this.animationTracker.animations.values().forEach(animation -> ServerPlayNetworking.send(player, SyncAdvancedAnimationPayload.of(this.getId(), animation)));
   }

   // After enough landed hits it raises its swords and blocks (was MutantWitherSkeletonBlockEvent on LivingDamageEvent)
   @Override
   protected void actuallyHurt(ServerLevel level, DamageSource source, float amount) {
      super.actuallyHurt(level, source, amount);
      if (MutantWitherSkeletonCommonConfig.uses_block.get()
         && amount > 0.0F
         && !this.shouldBeStationary()
         && !this.getAnimation("block").isPlaying()
         && !this.getAnimation("lunging").isPlaying()
         && !this.getAnimation("lunge_land").isPlaying()
         && !this.getAnimation("stunned").isPlaying()) {
         this.repeatedHits++;
         if (this.repeatedHits >= MutantWitherSkeletonCommonConfig.block_hit_requirement.get()) {
            this.repeatedHits = 0;
            this.stopAndLockAllAnimations(4, List.of("block", "offset_legs", "crouching_pose"));
            this.getAnimation("block").start(1.63F, 4, this::unlockAllAnimations);
         }
      }
   }

   public void leechHealth(float amount, Vec3 enemyPos) {
      MiscUtils.witherLeech(this, amount, enemyPos);
   }

   public boolean canStandOnFluid(FluidState p_204067_) {
      return (Boolean)MutantWitherSkeletonCommonConfig.walks_on_lava.get() && p_204067_.is(FluidTags.LAVA);
   }

   public void die(DamageSource source) {
      super.die(source);
      if (!this.level().isClientSide()) {
         if (!source.is(DamageTypes.GENERIC_KILL) && !source.is(DamageTypes.FELL_OUT_OF_WORLD)) {
            this.playSound(SoundEventInit.MUTANT_WITHER_SKELETON_DEATH, this.getSoundVolume(), 1.0F);
            this.stopAndLockAllAnimations(2, List.of("death", "offset_legs"));
            this.getAnimation("death")
               .start(
                  0.25F,
                  2,
                  () -> {
                     if ((Boolean)MutantWitherSkeletonCommonConfig.explode_into_parts.get()
                        && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mutants_explode_into_parts_off.get()) {
                        this.level().broadcastEntityEvent(this, (byte)4);
                        ShakeCameraEvent.shake(this.level(), 20, 0.035F, this.blockPosition(), 25);
                        this.createBodyPart(0, 0.0F, 2.0F, 0.0F);
                        this.createBodyPart(2, 0.0F, 3.5F, 1.0F);
                        this.createBodyPart(1, 0.25F, 2.5F, 0.0F);
                        this.createBodyPart(1, -0.25F, 2.5F, 0.0F);
                        this.createBodyPart(1, 0.25F, 2.75F, 0.0F);
                        this.createBodyPart(1, -0.25F, 2.75F, 0.0F);
                        this.createBodyPart(1, 0.25F, 3.0F, 0.0F);
                        this.createBodyPart(1, -0.25F, 3.0F, 0.0F);
                        this.createBodyPart(3, 0.5F, 0.5F, 0.0F);
                        this.createBodyPart(3, -0.5F, 0.5F, 0.0F);
                        this.createBodyPart(3, 0.5F, 1.5F, 0.0F);
                        this.createBodyPart(3, -0.5F, 1.5F, 0.0F);
                        this.createBodyPart(3, 0.75F, 2.0F, 0.0F);
                        this.createBodyPart(3, -0.75F, 2.0F, 0.0F);
                        this.createBodyPart(3, 0.75F, 3.0F, 0.0F);
                        this.createBodyPart(3, -0.75F, 3.0F, 0.0F);
                        this.createBodyPart(4, 0.5F, 3.25F, 0.5F);
                        this.createBodyPart(4, -0.5F, 3.25F, 0.5F);
                     } else {
                        LootTable loottable = this.level()
                           .getServer()
                           .reloadableRegistries()
                           .getLootTable(ResourceKey.create(Registries.LOOT_TABLE, Identifier.fromNamespaceAndPath("mutantmore", "entities/mutant_wither_skeleton_parts")));
                        net.minecraft.world.level.storage.loot.LootParams.Builder builder = new net.minecraft.world.level.storage.loot.LootParams.Builder(
                              (ServerLevel)this.level()
                           )
                           .withParameter(LootContextParams.THIS_ENTITY, this)
                           .withParameter(LootContextParams.ORIGIN, this.position())
                           .withOptionalParameter(LootContextParams.DAMAGE_SOURCE, this.getLastDamageSource());
                        LootParams ctx = builder.create(LootContextParamSets.ENTITY);
                        loottable.getRandomItems(ctx).forEach(stack -> this.spawnAtLocation((ServerLevel)this.level(), stack));
                     }

                     this.dropAllTickDeathLoot(source);
                     this.remove(RemovalReason.KILLED);
                  }
               );
         } else {
            this.playSound(SoundEvents.HOSTILE_DEATH, this.getSoundVolume(), this.getVoicePitch());
            this.remove(RemovalReason.KILLED);
         }
      }
   }

   public void handleEntityEvent(byte p_21375_) {
      if (p_21375_ == 4) {
         for (int i = 0; i < 200; i++) {
            double d0 = this.random.nextGaussian() * 0.5;
            double d1 = this.random.nextGaussian() * 0.05;
            double d2 = this.random.nextGaussian() * 0.5;
            this.level().addParticle(ParticleTypes.SMOKE, this.getRandomX(1.0), this.getRandomY(), this.getRandomZ(1.0), d0, d1, d2);
         }
      } else if (p_21375_ == 11) {
         Vec3 particlePos = PositionUtils.getOffsetPos(this, 0.0, this.getBbHeight() * 0.6, this.getBbWidth(), 0.0F, this.yBodyRot);

         for (int i = 0; i < 10; i++) {
            Vec3 particleMotion = PositionUtils.getOffsetMotion(
               this, this.random.nextGaussian() * 0.2, this.random.nextGaussian() * 0.2, 0.75 + this.random.nextGaussian() * 0.25, 0.0F, this.yBodyRot
            );
            this.level()
               .addParticle(
                  ParticleTypeInit.WITHER_GAS,
                  particlePos.x,
                  particlePos.y,
                  particlePos.z,
                  particleMotion.x,
                  particleMotion.y,
                  particleMotion.z
               );
         }

         for (int i = 0; i < 20; i++) {
            Vec3 particleMotion = PositionUtils.getOffsetMotion(
               this, this.random.nextGaussian() * 0.2, this.random.nextGaussian() * 0.2, 0.75 + this.random.nextGaussian() * 0.25, 0.0F, this.yBodyRot
            );
            this.level()
               .addParticle(
                  ParticleTypes.SMOKE,
                  particlePos.x,
                  particlePos.y,
                  particlePos.z,
                  particleMotion.x,
                  particleMotion.y,
                  particleMotion.z
               );
         }
      } else {
         super.handleEntityEvent(p_21375_);
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

   public void createBodyPart(int partNumber, float xOffset, float yOffset, float zOffset) {
      if (!this.level().isClientSide()) {
         MutantWitherSkeletonBodyPart part = new MutantWitherSkeletonBodyPart(this.level(), partNumber);
         part.glows = (Boolean)MutantWitherSkeletonCommonConfig.parts_glow.get() || (Boolean)MutantMoreGroupedOptionsCommonConfig.mutant_parts_glow_on.get();
         part.damage = ((Double)MutantWitherSkeletonCommonConfig.part_collision_damage.get()).floatValue();
         part.witherLength = (Integer)MutantWitherSkeletonCommonConfig.part_collision_wither_mobs_length.get();
         part.witherLevel = (Integer)MutantWitherSkeletonCommonConfig.part_collision_wither_mobs_level.get();
         part.despawnTime = (Integer)MutantWitherSkeletonCommonConfig.part_persist_length.get();
         part.snapTo(PositionUtils.getOffsetPos(this, xOffset, yOffset, zOffset, 0.0F, this.yBodyRot));
         part.push(this.random.nextGaussian() * 0.5, this.random.nextGaussian() * 0.5, this.random.nextGaussian() * 0.5);
         this.level().addFreshEntity(part);
      }
   }

   @Override
   protected EntityDimensions getDefaultDimensions(Pose p_19975_) {
      EntityDimensions dimensions = this.animationTracker != null && this.getAnimation("lunging").isPlaying()
         ? lungingDimensions
         : (p_19975_ == Pose.CROUCHING ? crouchingDimensions : super.getDefaultDimensions(p_19975_));
      // was getStandingEyeHeight: 3.75 standing, just under the top while crouching
      return this.animationTracker != null && this.getAnimation("lunging").isPlaying() ? dimensions : dimensions.withEyeHeight(p_19975_ == Pose.CROUCHING ? dimensions.height() - 0.1F : 3.75F);
   }

   public void refreshDimensions() {
      double d0 = this.getX();
      double d1 = this.getY();
      double d2 = this.getZ();
      super.refreshDimensions();
      this.setPos(d0, d1, d2);
   }

   @Override
   public void baseTick() {
      super.baseTick();
      this.refreshDimensions();
      this.getAnimationTracker().tick();
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

      if (this.isInLava()) {
         CollisionContext collisioncontext = CollisionContext.of(this);
         if (collisioncontext.isAbove(Block.box(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), this.blockPosition(), true)
            && !this.level().getFluidState(this.blockPosition().above()).is(FluidTags.LAVA)) {
            this.setOnGround(true);
         } else {
            this.setDeltaMovement(this.getDeltaMovement().scale(0.5).add(0.0, 0.05, 0.0));
         }
      }

      boolean markedCrouching = false;

      for (int i = -2; i < 3; i++) {
         for (int j = -2; j < 3; j++) {
            if (!markedCrouching
               && this.level().getBlockState(this.blockPosition().above(4).north(i).east(j)).isAir()
               && this.level().getBlockState(this.blockPosition().above(3).north(i).east(j)).isAir()) {
               markedCrouching = false;
            } else {
               markedCrouching = true;
            }
         }
      }

      if (!markedCrouching && !this.isInWall()) {
         this.setPose(Pose.STANDING);
      } else {
         this.setPose(Pose.CROUCHING);
      }

      AttributeInstance modifiableattributeinstance = this.getAttribute(Attributes.MOVEMENT_SPEED);
      if (this.getPose() != Pose.CROUCHING && !this.isInLava()) {
         modifiableattributeinstance.removeModifier(SPEED_MODIFIER_CROUCHING_ID);
      } else if (!modifiableattributeinstance.hasModifier(SPEED_MODIFIER_CROUCHING_ID)) {
         modifiableattributeinstance.addTransientModifier(this.SPEED_MODIFIER_CROUCHING);
      }

      double xDiff = this.getX() - this.oldPos.x;
      double yDiff = 0.0;
      double zDiff = this.getZ() - this.oldPos.z;
      float distanceTravelled = (float)Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
      if (distanceTravelled > 0.0F) {
         this.getAnimation("walk").startLooping(4);
         this.getAnimation("idle").stop(4);
      } else {
         this.getAnimation("walk").stop(4);
         this.getAnimation("idle").startLooping(4);
      }

      if (this.getPose() == Pose.CROUCHING) {
         this.getAnimation("crouching_pose").startLooping(20);
      } else {
         this.getAnimation("crouching_pose").stop(20);
      }

      if (!this.getAnimation("offset_legs").isPlaying()) {
         this.getAnimation("offset_legs").startLooping(0);
      }

      this.oldPos = this.position();
   }

   // Undead is the minecraft:undead entity tag now (data/minecraft/tags/entity_type/undead.json)

   @Override
   public boolean doHurtTarget(ServerLevel level, Entity target) {
      return this.doHurtTarget(level, target, EquipmentSlot.MAINHAND);
   }

   /** Vanilla Mob.doHurtTarget with the weapon taken from either hand, plus the wither leech and wither effect. */
   public boolean doHurtTarget(ServerLevel level, Entity target, EquipmentSlot slot) {
      ItemStack weapon = this.getItemBySlot(slot);
      DamageSource source = weapon.getDamageSource(this);
      float damage = EnchantmentHelper.modifyDamage(level, weapon, target, source, (float)this.getAttributeValue(Attributes.ATTACK_DAMAGE));
      damage += weapon.getItem().getAttackDamageBonus(target, damage, source);
      Vec3 oldMovement = target.getDeltaMovement();
      boolean flag = target.hurtServer(level, source, damage);
      if (flag) {
         this.causeExtraKnockback(target, this.getKnockback(target, source), oldMovement, source, damage, true);
         EnchantmentHelper.doPostAttackEffects(level, target, source);
         this.setLastHurtMob(target);
         this.leechHealth(MutantWitherSkeletonCommonConfig.melee_attack_leech_amount.get().floatValue(), target.position().add(0.0, target.getBbHeight() / 2.0F, 0.0));
         if (target instanceof LivingEntity living) {
            living.addEffect(
               new MobEffectInstance(MobEffects.WITHER, MutantWitherSkeletonCommonConfig.melee_attack_wither_length.get(), MutantWitherSkeletonCommonConfig.melee_attack_wither_level.get()),
               this
            );
         }
      }

      return flag;
   }

   public boolean canBeAffected(MobEffectInstance p_34192_) {
      return !p_34192_.is(MobEffects.WITHER) && super.canBeAffected(p_34192_);
   }

   public AdvancedAnimationTracker createAnimationTracker() {
      AdvancedAnimationTracker newTracker = new AdvancedAnimationTracker();
      newTracker.addAnimation("attack_left", new EntityAdvancedAnimation(this, true));
      newTracker.addAnimation("attack_right", new EntityAdvancedAnimation(this, true));
      newTracker.addAnimation("block", new EntityAdvancedAnimation(this, true));
      newTracker.addAnimation("rib_crush", new EntityAdvancedAnimation(this, true));
      newTracker.addAnimation("wither_breath", new EntityAdvancedAnimation(this, true));
      newTracker.addAnimation("wither_slash", new EntityAdvancedAnimation(this, true));
      newTracker.addAnimation("crouching_pose", new EntityAdvancedAnimation(this, false));
      newTracker.addAnimation("death", new EntityAdvancedAnimation(this, true));
      newTracker.addAnimation("idle", new EntityAdvancedAnimation(this, false));
      newTracker.addAnimation("hurt", new EntityAdvancedAnimation(this, true));
      newTracker.addAnimation("intro", new EntityAdvancedAnimation(this, true));
      newTracker.addAnimation("offset_legs", new EntityAdvancedAnimation(this, false));
      newTracker.addAnimation("walk", new EntityAdvancedAnimation(this, false));
      newTracker.addAnimation("lunge", new EntityAdvancedAnimation(this, true));
      newTracker.addAnimation("lunge_land", new EntityAdvancedAnimation(this, true));
      newTracker.addAnimation("lunging", new EntityAdvancedAnimation(this, false));
      newTracker.addAnimation("stunned", new EntityAdvancedAnimation(this, true));
      return newTracker;
   }

   @Override
   public AdvancedAnimationTracker getAnimationTracker() {
      return this.animationTracker;
   }

   public EntityAdvancedAnimation getAnimation(String name) {
      return (EntityAdvancedAnimation)this.getAnimationTracker().getAnimation(name);
   }

   public void stopAndLockIdleAnimations(int transitionTicks, boolean includeCrouchingPose) {
      this.getAnimation("idle").stop(transitionTicks);
      this.getAnimation("idle").lock();
      this.getAnimation("walk").stop(transitionTicks);
      this.getAnimation("walk").lock();
      if (includeCrouchingPose) {
         this.getAnimation("crouching_pose").stop(transitionTicks);
         this.getAnimation("crouching_pose").lock();
      }
   }

   public void unlockIdleAnimations() {
      this.getAnimation("idle").unlock();
      this.getAnimation("walk").unlock();
      this.getAnimation("crouching_pose").unlock();
   }

   public void stopAndLockAllAnimations(int transitionTicks, List<String> excludedAnimations) {
      this.getAnimationTracker().animations.forEach((name, anim) -> {
         if (excludedAnimations != null && !excludedAnimations.contains(name) && anim instanceof AbstractAdvancedAnimation animation) {
            animation.stop(transitionTicks);
            animation.lock();
         }
      });
   }

   public void unlockAllAnimations() {
      this.getAnimationTracker().animations.forEach((name, anim) -> {
         if (anim instanceof AbstractAdvancedAnimation animation) {
            animation.unlock();
         }
      });
   }

   @Override
   public void onMutated() {
      this.setPose(Pose.CROUCHING);
      this.stopAndLockIdleAnimations(0, true);
      this.getAnimation("intro").start(1.5F, 0, () -> {
         this.getAnimation("intro").setTransitionTicks(4);
         this.unlockIdleAnimations();
      });
      if (this.level() instanceof ServerLevel serverLevel) {
         this.populateDefaultEquipmentSlots(this.random, serverLevel.getCurrentDifficultyAt(this.blockPosition()));
         this.populateDefaultEquipmentEnchantments(serverLevel, this.random, serverLevel.getCurrentDifficultyAt(this.blockPosition()));
      }
   }

   protected void populateDefaultEquipmentSlots(RandomSource p_219135_, DifficultyInstance p_219136_) {
      this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(ItemInit.WITHERED_SCIMITAR));
      this.setDropChance(EquipmentSlot.MAINHAND, 0.0F);
      this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(ItemInit.WITHERED_SCIMITAR));
      this.setDropChance(EquipmentSlot.OFFHAND, 0.0F);
   }

   public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_21434_, DifficultyInstance p_21435_, EntitySpawnReason p_21436_, SpawnGroupData p_21437_) {
      if (this.level() instanceof ServerLevel serverLevel) {
         this.populateDefaultEquipmentSlots(this.random, serverLevel.getCurrentDifficultyAt(this.blockPosition()));
         this.populateDefaultEquipmentEnchantments(serverLevel, this.random, serverLevel.getCurrentDifficultyAt(this.blockPosition()));
      }
      MiscUtils.spawnWithPumpkinOnHalloween(this, p_21434_.getRandom());
      return super.finalizeSpawn(p_21434_, p_21435_, p_21436_, p_21437_);
   }

   @Override
   public List<SoundEvent> getBattleMusicSounds() {
      return List.of(SoundEventInit.ADRENALINE_RUSH);
   }

   @Override
   public TagKey<Block> walksThroughTag() {
      return TagInit.Blocks.MUTANT_WITHER_SKELETON_WALKS_THROUGH;
   }

   @Override
   public ConfigValue<Boolean> walkGriefingConfig() {
      return MutantWitherSkeletonCommonConfig.walk_griefing;
   }

   @Override
   public ConfigValue<Boolean> walkGriefingDropsBlocksConfig() {
      return MutantWitherSkeletonCommonConfig.walk_griefing;
   }

   @Override
   public ConfigValue<Boolean> hurtGriefingConfig() {
      return MutantWitherSkeletonCommonConfig.hurt_griefing;
   }

   @Override
   public ConfigValue<Boolean> hurtGriefingDropsBlocksConfig() {
      return MutantWitherSkeletonCommonConfig.hurt_griefing_drops_blocks;
   }

   @Override
   public ConfigValue<Boolean> showHealthBarConfig() {
      return MutantWitherSkeletonClientConfig.show_health_bar;
   }

   @Override
   public ConfigValue<Boolean> despawnsConfig() {
      return MutantWitherSkeletonCommonConfig.despawns;
   }

   @Override
   public ConfigValue<Boolean> playBattleMusicConfig() {
      return MutantWitherSkeletonClientConfig.play_battle_music;
   }

   class RemainStationaryGoal extends Goal {
      public RemainStationaryGoal() {
         this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK, Flag.TARGET, Flag.JUMP));
      }

      public boolean canUse() {
         return MutantWitherSkeleton.this.shouldBeStationary();
      }
   }
}
