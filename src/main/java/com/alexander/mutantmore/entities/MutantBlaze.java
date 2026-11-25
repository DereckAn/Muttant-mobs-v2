package com.alexander.mutantmore.entities;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.ai.goals.AllDirectionsTargetGoal;
import com.alexander.mutantmore.ai.goals.ApproachTargetGoal;
import com.alexander.mutantmore.ai.goals.AvoidTargetGoal;
import com.alexander.mutantmore.ai.goals.GroundPullAntiCheeseGoal;
import com.alexander.mutantmore.ai.goals.LookAtTargetGoal;
import com.alexander.mutantmore.ai.goals.mutant_blaze.MutantBlazeFlyStrafeMovementGoal;
import com.alexander.mutantmore.ai.goals.mutant_blaze.MutantBlazeLeaveCorridorsGoal;
import com.alexander.mutantmore.ai.goals.mutant_blaze.MutantBlazeRodShotAttackGoal;
import com.alexander.mutantmore.ai.goals.mutant_blaze.MutantBlazeShootAttackGoal;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.mutant_blaze.MutantBlazeClientConfig;
import com.alexander.mutantmore.config.mutant_blaze.MutantBlazeCommonConfig;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.interfaces.IHasCustomExplosion;
import com.alexander.mutantmore.interfaces.IHeatSource;
import com.alexander.mutantmore.particles.AdvancedParticleOption;
import com.alexander.mutantmore.pathfinding.ImprovedMoveControl;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
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
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.PathNavigationRegion;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.block.AirBlock;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.pathfinder.Node;
import net.minecraft.world.level.pathfinder.PathFinder;
import net.minecraft.world.level.pathfinder.WalkNodeEvaluator;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import org.joml.Vector3d;

public class MutantBlaze extends AbstractMutant implements IHeatSource, IHasCustomExplosion {
   private static final List<EntityDataAccessor<Boolean>> SHIELDS_BROKEN = Lists.newArrayList(
      new EntityDataAccessor[]{
         SynchedEntityData.defineId(MutantBlaze.class, EntityDataSerializers.BOOLEAN),
         SynchedEntityData.defineId(MutantBlaze.class, EntityDataSerializers.BOOLEAN),
         SynchedEntityData.defineId(MutantBlaze.class, EntityDataSerializers.BOOLEAN),
         SynchedEntityData.defineId(MutantBlaze.class, EntityDataSerializers.BOOLEAN),
         SynchedEntityData.defineId(MutantBlaze.class, EntityDataSerializers.BOOLEAN),
         SynchedEntityData.defineId(MutantBlaze.class, EntityDataSerializers.BOOLEAN),
         SynchedEntityData.defineId(MutantBlaze.class, EntityDataSerializers.BOOLEAN)
      }
   );
   private static final EntityDataAccessor<Boolean> FLYING = SynchedEntityData.defineId(MutantBlaze.class, EntityDataSerializers.BOOLEAN);
   public final AnimationState introAnimation = new AnimationState();
   public final AnimationState noveltyAnimation = new AnimationState();
   public final AnimationState shootAnimation = new AnimationState();
   public final AnimationState rodShotAnimation = new AnimationState();
   public final AnimationState stunnedAnimation = new AnimationState();
   public final AnimationState deathAnimation = new AnimationState();
   public int introAnimationTick;
   public int introAnimationLength = 25;
   public int noveltyAnimationTick;
   public int noveltyAnimationLength = 80;
   public int shootAnimationTick;
   public int shootAnimationLength = 70;
   public int shootAnimationActionPoint = 30;
   public int rodShotAnimationTick;
   public int rodShotAnimationLength = 105;
   public int rodShotAnimationActionStartPoint = 34;
   public int rodShotAnimationActionEndPoint = 21;
   public int[] shieldRegenerateTicks = new int[]{0, 0, 0, 0, 0, 0, 0};
   public int shieldRegenerateTime = (Integer)MutantBlazeCommonConfig.shield_regenerate_speed.get();
   public int stunnedTicks;
   public int stunnedLength = 203;
   public int stunnedAnimationActionPoint = 20;
   public DamageSource killedBy = this.damageSources().cramming();
   public static EntityDimensions crouchingDimensions = EntityDimensions.scalable(1.9F, 2.4F);
   public MutantBlazeShieldPart[] subEntities = new MutantBlazeShieldPart[7];
   private static final Predicate<Entity> SHOCKWAVABLE = Entity::isAlive;

   public MutantBlaze(EntityType<? extends MutantBlaze> p_i50189_1_, Level p_i50189_2_) {
      super(p_i50189_1_, p_i50189_2_);
      this.moveControl = new ImprovedMoveControl(this, 90.0F, 3);
      this.xpReward = (Integer)MutantBlazeCommonConfig.exp_reward.get();
      this.setPathfindingMalus(PathType.WATER, -1.0F);
      this.setPathfindingMalus(PathType.LAVA, 0.0F);
      this.setPathfindingMalus(PathType.FIRE_IN_NEIGHBOR, 0.0F);
      this.setPathfindingMalus(PathType.FIRE, 0.0F);

      for (int i = 0; i < 7; i++) {
         MutantBlazeShieldPart shield = new MutantBlazeShieldPart(this, i);
         this.subEntities[i] = shield;
      }
   }

   protected void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(0, new MutantBlaze.RemainStationaryGoal());
      this.goalSelector.addGoal(1, new GroundPullAntiCheeseGoal(this));
      if ((Boolean)MutantBlazeCommonConfig.uses_fly.get()) {
         this.goalSelector.addGoal(2, new MutantBlazeFlyStrafeMovementGoal(this));
      }

      if ((Boolean)MutantBlazeCommonConfig.avoids_target.get()) {
         this.goalSelector
            .addGoal(
               3,
               new AvoidTargetGoal(
                  this,
                  (Double)MutantBlazeCommonConfig.avoid_target_max_range.get(),
                  (Double)MutantBlazeCommonConfig.stop_avoiding_target_min_distance.get(),
                  (Double)MutantBlazeCommonConfig.avoid_target_movement_speed_multiplier.get(),
                  false
               ) {
                  @Override
                  public boolean canUse() {
                     return super.canUse() && !MutantBlaze.this.isFlying();
                  }

                  @Override
                  public boolean canContinueToUse() {
                     return super.canContinueToUse() && !MutantBlaze.this.isFlying();
                  }
               }
            );
      }

      if ((Boolean)MutantBlazeCommonConfig.avoids_corridors.get()) {
         this.goalSelector.addGoal(4, new MutantBlazeLeaveCorridorsGoal(this, (Double)MutantBlazeCommonConfig.avoid_corridor_movement_speed_multiplier.get()));
      }

      if ((Boolean)MutantBlazeCommonConfig.uses_fireball_attack.get()) {
         this.goalSelector.addGoal(5, new MutantBlazeShootAttackGoal(this));
      }

      if ((Boolean)MutantBlazeCommonConfig.uses_rod_shot.get()) {
         this.goalSelector.addGoal(6, new MutantBlazeRodShotAttackGoal(this));
      }

      this.goalSelector
         .addGoal(
            7,
            new ApproachTargetGoal(
               this,
               (Double)MutantBlazeCommonConfig.following_target_distance.get(),
               (Double)MutantBlazeCommonConfig.following_movement_speed_multiplier.get(),
               true
            )
         );
      this.goalSelector.addGoal(8, new LookAtTargetGoal(this));
      this.goalSelector.addGoal(9, new WaterAvoidingRandomStrollGoal(this, 1.0));
      this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, Player.class, 20.0F));
      this.goalSelector.addGoal(11, new LookAtPlayerGoal(this, Mob.class, 10.0F));
      this.goalSelector.addGoal(12, new RandomLookAroundGoal(this));
      this.targetSelector.addGoal(0, new HurtByTargetGoal(this, new Class[0]).setUnseenMemoryTicks(6000));
      if ((Boolean)MutantBlazeCommonConfig.attacks_players.get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mutants_attack_players_off.get()) {
         this.targetSelector.addGoal(1, new AllDirectionsTargetGoal(this, Player.class, true).setUnseenMemoryTicks(6000));
      }

      this.targetSelector
         .addGoal(
            2,
            new NearestAttackableTargetGoal<LivingEntity>(
               this, LivingEntity.class, 20, false, false, (entity, level) -> entity.is(TagInit.EntityTypes.MUTANT_BLAZE_TARGETS)
            ) {
               protected AABB getTargetSearchArea(double p_26069_) {
                  return this.mob
                     .getBoundingBox()
                     .inflate(
                        (Double)MutantBlazeCommonConfig.follow_non_player_distance.get(),
                        (Double)MutantBlazeCommonConfig.follow_non_player_distance.get(),
                        (Double)MutantBlazeCommonConfig.follow_non_player_distance.get()
                     );
               }
            }
         );
   }

   public boolean canAttack(LivingEntity target) {
      return this.canTarget(target) && super.canAttack(target);
   }

   boolean canTarget(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_BLAZE_CANT_TARGET, this, target, this, null);
   }

   @Override
   protected PathNavigation createNavigation(Level p_33348_) {
      return new MutantBlaze.MutantBlazeNavigation(this, p_33348_);
   }

   @Override
   public AbstractMutant.NodeEvaluatorDimensions getNodeEvaluatorDimensions() {
      int width = Mth.floor(this.getBbWidth() + 1.0F);
      return new AbstractMutant.NodeEvaluatorDimensions(width, Mth.floor(crouchingDimensions.height()), width);
   }

   public boolean shouldBeStationary() {
      return this.deathTime > 0 || this.introAnimationTick > 0 || this.stunnedTicks > 0;
   }

   public static Builder createConfiguredAttributes() {
      return Mob.createMobAttributes()
         .add(Attributes.MAX_HEALTH, (Double)MutantBlazeCommonConfig.max_health.get())
         .add(Attributes.ARMOR, (Double)MutantBlazeCommonConfig.armour.get())
         .add(Attributes.ARMOR_TOUGHNESS, (Double)MutantBlazeCommonConfig.armour_toughness.get())
         .add(Attributes.KNOCKBACK_RESISTANCE, (Double)MutantBlazeCommonConfig.knockback_resistance.get())
         .add(Attributes.FOLLOW_RANGE, (Double)MutantBlazeCommonConfig.follow_player_distance.get())
         .add(Attributes.MOVEMENT_SPEED, (Double)MutantBlazeCommonConfig.movement_speed.get());
   }

   @Override
   public List<SoundEvent> getBattleMusicSounds() {
      return List.of(SoundEventInit.AEGIS);
   }

   @Override
   public void onMutated() {
      this.setPose(Pose.CROUCHING);
      this.introAnimationTick = this.introAnimationLength;
      this.level().broadcastEntityEvent(this, (byte)11);
   }

   @Override
   protected void updateAnimations() {
      this.introAnimation.animateWhen(this.introAnimationTick > 0 && this.isAlive(), this.tickCount);
      this.noveltyAnimation.animateWhen(this.noveltyAnimationTick > 0 && this.isAlive(), this.tickCount);
      this.shootAnimation.animateWhen(this.shootAnimationTick > 0 && this.isAlive(), this.tickCount);
      this.rodShotAnimation.animateWhen(this.rodShotAnimationTick > 0 && this.isAlive(), this.tickCount);
      this.stunnedAnimation.animateWhen(this.stunnedTicks > 0 && this.isAlive(), this.tickCount);
      this.deathAnimation.animateWhen(this.isDeadOrDying(), this.tickCount);
   }

   public void tickDownAnimTimers() {
      if (this.noveltyAnimationTick > 0) {
         this.noveltyAnimationTick--;
      }

      if (this.introAnimationTick > 0) {
         this.introAnimationTick--;
      }

      if (this.shootAnimationTick > 0) {
         this.shootAnimationTick--;
      }

      if (this.rodShotAnimationTick > 0) {
         this.rodShotAnimationTick--;
      }
   }

   protected SoundEvent getAmbientSound() {
      return SoundEventInit.MUTANT_BLAZE_IDLE;
   }

   protected SoundEvent getHurtSound(DamageSource p_33034_) {
      return SoundEventInit.MUTANT_BLAZE_HURT;
   }

   protected SoundEvent getDeathSound() {
      return null;
   }

   public float getVoicePitch() {
      return this.isDeadOrDying() ? 1.0F : super.getVoicePitch();
   }

   protected float getSoundVolume() {
      return this.isDeadOrDying() ? 3.0F : 2.0F;
   }

   protected void playStepSound(BlockPos p_20135_, BlockState p_20136_) {
   }

   private boolean loopSoundStarted;

   @Override
   public void tick() {
      super.tick();
      if (this.level().isClientSide() && !this.loopSoundStarted) {
         this.loopSoundStarted = true;
         MiscUtils.loopingSoundHook.accept(this, SoundEventInit.MUTANT_BLAZE_LOOP);
      }
   }

   public void shootMutantBlazeFireball(double xMotion, double yMotion, double zMotion, boolean fromDeath) {
      MutantBlazeFireball fireball = new MutantBlazeFireball(this.level(), this, xMotion, yMotion, zMotion);
      fireball.damage = ((Double)MutantBlazeCommonConfig.fireball_damage.get()).floatValue();
      fireball.explosionDamage = ((Double)MutantBlazeCommonConfig.fireball_explosion_damage.get()).floatValue();
      fireball.explosionRadius = ((Double)MutantBlazeCommonConfig.fireball_explosion_radius.get()).floatValue();
      fireball.fireLength = (Integer)MutantBlazeCommonConfig.fireball_fire_length.get();
      fireball.ignoresInvulTime = (Boolean)MutantBlazeCommonConfig.ignores_invulnerability_time.get();
      fireball.griefing = (Boolean)MutantBlazeCommonConfig.fireball_griefing.get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get();
      fireball.griefingDropsBlocks = (Boolean)MutantBlazeCommonConfig.fireball_griefing_drops_blocks.get()
         || (Boolean)MutantMoreGroupedOptionsCommonConfig.griefing_drops_blocks_on.get();
      fireball.explosionFire = (Boolean)MutantBlazeCommonConfig.fireball_explosion_fire.get()
         && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get();
      fireball.setPos(fireball.getX(), this.getY(0.5), fireball.getZ());
      if (fromDeath) {
         fireball.spawnedByDyingMutantBlaze = true;
      } else {
         this.playSound(SoundEventInit.MUTANT_BLAZE_SHOOT, 2.0F, this.getVoicePitch());
      }

      this.level().addFreshEntity(fireball);
   }

   @Override
   public boolean canHarmWithExplosion(Entity target) {
      return this.explosionCanHarm(target);
   }

   boolean explosionCanHarm(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_BLAZE_FIREBALL_CANT_HURT, this, target, this, null);
   }

   public void die(DamageSource source) {
      super.die(source);
      if (!source.is(DamageTypes.GENERIC_KILL) && !source.is(DamageTypes.FELL_OUT_OF_WORLD)) {
         this.playSound(SoundEventInit.MUTANT_BLAZE_PRE_DEATH, this.getSoundVolume(), 1.0F);
      } else {
         this.playSound(SoundEvents.HOSTILE_DEATH, this.getSoundVolume(), this.getVoicePitch());
      }

      this.killedBy = source;
   }

   protected void tickDeath() {
      this.deathTime++;
      if (this.getLastDamageSource() == null || !this.getLastDamageSource().is(DamageTypes.GENERIC_KILL) && !this.getLastDamageSource().is(DamageTypes.FELL_OUT_OF_WORLD)) {
         if (this.deathTime >= 20 && this.deathTime < 180) {
            this.setDeltaMovement(0.0, 0.05, 0.0);
         } else if (this.deathTime >= 180) {
            this.setDeltaMovement(0.0, 0.0, 0.0);
         }

         if (this.deathTime == 180) {
            this.level()
               .addParticle(
                  new AdvancedParticleOption(ParticleTypeInit.MUTANT_BLAZE_CHARGE_SHOT, List.of((float)this.getId(), 0.0F, 2.5F, -1.0F)),
                  this.getX(),
                  this.getY(),
                  this.getZ(),
                  0.0,
                  0.0,
                  0.0
               );
            this.playSound(SoundEventInit.MUTANT_BLAZE_FLARE, 3.0F, this.getVoicePitch());
         }

         if (this.deathTime == 200) {
            ShakeCameraEvent.shake(this.level(), 33, 0.025F, this.blockPosition(), 25);
            this.playSound(SoundEventInit.MUTANT_BLAZE_DEATH, 3.0F, 1.0F);

            for (int i = 0; i < 1000; i++) {
               this.level()
                  .addParticle(
                     ParticleTypes.LARGE_SMOKE,
                     this.getX(),
                     this.getY(0.5),
                     this.getZ(),
                     -1.0 + this.random.nextDouble() * 2.0,
                     -0.5 + this.random.nextDouble() * 1.0,
                     -1.0 + this.random.nextDouble() * 2.0
                  );
            }

            for (int i = 0; i < 500; i++) {
               this.level()
                  .addParticle(
                     ParticleTypes.CAMPFIRE_COSY_SMOKE,
                     this.getX(),
                     this.getY(0.5),
                     this.getZ(),
                     -1.0 + this.random.nextDouble() * 2.0,
                     -0.5 + this.random.nextDouble() * 1.0,
                     -1.0 + this.random.nextDouble() * 2.0
                  );
            }

            for (int i = 0; i < 250; i++) {
               this.level()
                  .addParticle(
                     ParticleTypes.FLAME,
                     this.getX(),
                     this.getY(0.5),
                     this.getZ(),
                     -1.0 + this.random.nextDouble() * 2.0,
                     -0.5 + this.random.nextDouble() * 1.0,
                     -1.0 + this.random.nextDouble() * 2.0
                  );
            }

            if (!this.level().isClientSide()) {
               List<MutantBlazeRodProjectile> rods = Lists.newArrayList();
               List<MutantBlazeRodProjectile> nonRodlingRods = Lists.newArrayList();
               if ((Boolean)MutantBlazeCommonConfig.explode_into_parts.get()
                  && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mutants_explode_into_parts_off.get()) {
                  for (int i = 0; i < MutantBlazeCommonConfig.part_amount.get(); i++) {
                     MutantBlazeRodProjectile rod = new MutantBlazeRodProjectile(this.level(), this);
                     rods.add(rod);
                     nonRodlingRods.add(rod);
                  }

                  for (int i = 0; i < MutantBlazeCommonConfig.rodling_part_amount.get(); i++) {
                     MutantBlazeRodProjectile rod = nonRodlingRods.get(this.random.nextInt(nonRodlingRods.size()));
                     rod.setIsRodling(true);
                     nonRodlingRods.remove(rod);
                  }

                  for (MutantBlazeRodProjectile rod : rods) {
                     rod.damage = ((Double)MutantBlazeCommonConfig.part_collision_damage.get()).floatValue();
                     rod.fireLength = (Integer)MutantBlazeCommonConfig.part_fire_length.get();
                     rod.glows = (Boolean)MutantBlazeCommonConfig.parts_glow.get();
                     rod.despawnTime = (Integer)MutantBlazeCommonConfig.part_persist_length.get();
                     rod.ignoresInvulTime = (Boolean)MutantBlazeCommonConfig.ignores_invulnerability_time.get();
                     rod.setCollectable(true);
                     rod.snapTo(this.getX(), this.getY(0.6), this.getZ());
                     rod.shoot(0.0, 0.0, 0.0, 3.0F, 20.0F);
                     this.level().addFreshEntity(rod);
                  }
               } else {
                  for (int i = 0; i < MutantBlazeCommonConfig.rodling_part_amount.get(); i++) {
                     MutantBlazeRodProjectile rod = new MutantBlazeRodProjectile(this.level(), this);
                     rod.setCollectable(true);
                     rod.snapTo(this.getX(), this.getY(0.6), this.getZ());
                     this.level().addFreshEntity(rod);
                  }

                  if (this.killedBy != null) {
                     for (int i = 0; i < MutantBlazeCommonConfig.part_amount.get() - MutantBlazeCommonConfig.rodling_part_amount.get(); i++) {
                        LootTable loottable = this.level()
                           .getServer()
                           .reloadableRegistries()
                           .getLootTable(ResourceKey.create(Registries.LOOT_TABLE, Identifier.fromNamespaceAndPath("mutantmore", "entities/mutant_blaze_part")));
                        net.minecraft.world.level.storage.loot.LootParams.Builder builder = new net.minecraft.world.level.storage.loot.LootParams.Builder(
                              (ServerLevel)this.level()
                           )
                           .withParameter(LootContextParams.THIS_ENTITY, this)
                           .withParameter(LootContextParams.ORIGIN, this.position())
                           .withOptionalParameter(LootContextParams.DAMAGE_SOURCE, this.getLastDamageSource());
                        LootParams ctx = builder.create(LootContextParamSets.ENTITY);
                        loottable.getRandomItems(ctx).forEach(stack -> this.spawnAtLocation((ServerLevel)this.level(), stack));
                     }
                  }
               }

               for (int i = 0; i < 3; i++) {
                  Vec3 motion = PositionUtils.getOffsetMotion(null, 0.5, -1.25, 0.0, 0.0F, 120 * i);
                  this.shootMutantBlazeFireball(motion.x, motion.y, motion.z, true);
               }

               for (int i = 0; i < 10; i++) {
                  Vec3 motion = PositionUtils.getOffsetMotion(null, 1.0, -0.75, 0.0, 0.0F, 36 * i);
                  this.shootMutantBlazeFireball(motion.x, motion.y, motion.z, true);
               }

               for (int i = 0; i < 10; i++) {
                  Vec3 motion = PositionUtils.getOffsetMotion(null, 1.0, 0.0, 0.0, 0.0F, 36 * i);
                  this.shootMutantBlazeFireball(motion.x, motion.y, motion.z, true);
               }

               for (int i = 0; i < 10; i++) {
                  Vec3 motion = PositionUtils.getOffsetMotion(null, 1.0, 0.75, 0.0, 0.0F, 36 * i);
                  this.shootMutantBlazeFireball(motion.x, motion.y, motion.z, true);
               }

               for (int i = 0; i < 3; i++) {
                  Vec3 motion = PositionUtils.getOffsetMotion(null, 0.5, 1.25, 0.0, 0.0F, 120 * i);
                  this.shootMutantBlazeFireball(motion.x, motion.y, motion.z, true);
               }
            }
         }

         if (this.deathTime == 215) {
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

   @Override
   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);

      for (EntityDataAccessor<Boolean> SHIELD_BROKEN : SHIELDS_BROKEN) {
         builder.define(SHIELD_BROKEN, false);
      }

      builder.define(FLYING, false);
   }

   public boolean isFlying() {
      return (Boolean)this.entityData.get(FLYING);
   }

   public void setFlying(boolean setTo) {
      this.entityData.set(FLYING, setTo);
   }

   @Override
   protected void readAdditionalSaveData(ValueInput p_70037_1_) {
      super.readAdditionalSaveData(p_70037_1_);

      for (MutantBlazeShieldPart part : this.subEntities) {
         this.setShieldBroken(part.partNumber, p_70037_1_.getBooleanOr("Shield" + part.partNumber + "Broken", false));
      }
   }

   protected void addAdditionalSaveData(ValueOutput p_213281_1_) {
      super.addAdditionalSaveData(p_213281_1_);

      for (MutantBlazeShieldPart part : this.subEntities) {
         p_213281_1_.putBoolean("Shield" + part.partNumber + "Broken", this.isShieldBroken(part.partNumber));
      }
   }

   public boolean isShieldBroken(int shieldIndex) {
      return (Boolean)this.entityData.get(SHIELDS_BROKEN.get(shieldIndex));
   }

   public void setShieldBroken(int shieldIndex, boolean broken) {
      if (broken) {
         this.playSound(SoundEventInit.MUTANT_BLAZE_SHIELDBREAK);
         this.shieldRegenerateTicks[shieldIndex] = this.shieldRegenerateTime;
      }

      this.entityData.set(SHIELDS_BROKEN.get(shieldIndex), broken);
   }

   public boolean isSensitiveToWater() {
      return true;
   }

   protected void updateParts() {
      for (MutantBlazeShieldPart part : this.subEntities) {
         if (!this.level().isClientSide() && !this.shieldsInactive()) {
            if (this.shieldRegenerateTicks[part.partNumber] > 0) {
               this.shieldRegenerateTicks[part.partNumber]--;
            }

            if (this.shieldRegenerateTicks[part.partNumber] == 20) {
               this.playSound(SoundEventInit.MUTANT_BLAZE_RESHIELD);
            }

            if (this.shieldRegenerateTicks[part.partNumber] == 0 && this.isShieldBroken(part.partNumber)) {
               if (this.stunnedTicks <= 0) {
                  for (int i = 0; i < 3; i++) {
                     ((ServerLevel)this.level())
                        .sendParticles(
                           ParticleTypeInit.MUTANT_BLAZE_HEAL,
                           part.getRandomX(0.75),
                           part.getRandomY(),
                           part.getRandomZ(0.75),
                           1,
                           0.0,
                           0.0,
                           0.0,
                           0.0
                        );
                  }
               }

               this.setShieldBroken(part.partNumber, false);
            }
         }

         this.positionShield(part);
      }
   }

   protected void movePart(MutantBlazeShieldPart part, double dX, double dY, double dZ) {
      part.setPos(this.getX() + dX, this.getY() + dY, this.getZ() + dZ);
   }

   /**
    * The intact shield a hit passed through on its way to the Blaze, if any: the line from where the hit came from
    * (projectile position, else the attacker's eyes) to the Blaze's centre.
    */
   public MutantBlazeShieldPart shieldInTheWay(DamageSource source) {
      Entity from = source.getDirectEntity() != null ? source.getDirectEntity() : source.getEntity();
      if (from == null || this.shieldsInactive()) {
         return null;
      }

      Vec3 start = from instanceof LivingEntity living ? living.getEyePosition() : from.position().subtract(from.getDeltaMovement());
      Vec3 end = this.getBoundingBox().getCenter();
      MutantBlazeShieldPart nearest = null;
      double best = Double.MAX_VALUE;
      for (MutantBlazeShieldPart part : this.subEntities) {
         if (part.isActive() && part.isHitBy(start, end)) {
            double distance = part.getBoundingBox().getCenter().distanceToSqr(start);
            if (distance < best) {
               best = distance;
               nearest = part;
            }
         }
      }

      return nearest;
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource source, float amount) {
      MutantBlazeShieldPart shield = this.shieldInTheWay(source);
      if (shield != null && !shield.hurt(level, source)) {
         return false;
      }

      return super.hurtServer(level, source, amount);
   }

   protected void positionShield(MutantBlazeShieldPart shield) {
      double upperShieldLayerY = this.isCrouching() ? 0.75 : 2.0;
      double lowerShieldLayerY = 0.25;
      float shieldRotateSpeed = -0.2182F;
      if (shield.partNumber == 0) {
         this.movePart(
            shield,
            Mth.cos(this.tickCount * shieldRotateSpeed + MiscUtils.degToRad(45.0F + this.yBodyRot)) * 1.5F,
            upperShieldLayerY,
            Mth.sin(this.tickCount * shieldRotateSpeed + MiscUtils.degToRad(45.0F + this.yBodyRot)) * 1.5F
         );
      } else if (shield.partNumber == 1) {
         this.movePart(
            shield,
            Mth.cos(this.tickCount * shieldRotateSpeed + MiscUtils.degToRad(135.0F + this.yBodyRot)) * 1.5F,
            upperShieldLayerY,
            Mth.sin(this.tickCount * shieldRotateSpeed + MiscUtils.degToRad(135.0F + this.yBodyRot)) * 1.5F
         );
      } else if (shield.partNumber == 2) {
         this.movePart(
            shield,
            Mth.cos(this.tickCount * shieldRotateSpeed + MiscUtils.degToRad(225.0F + this.yBodyRot)) * 1.5F,
            upperShieldLayerY,
            Mth.sin(this.tickCount * shieldRotateSpeed + MiscUtils.degToRad(225.0F + this.yBodyRot)) * 1.5F
         );
      } else if (shield.partNumber == 3) {
         this.movePart(
            shield,
            Mth.cos(this.tickCount * shieldRotateSpeed + MiscUtils.degToRad(315.0F + this.yBodyRot)) * 1.5F,
            upperShieldLayerY,
            Mth.sin(this.tickCount * shieldRotateSpeed + MiscUtils.degToRad(315.0F + this.yBodyRot)) * 1.5F
         );
      } else if (shield.partNumber == 4) {
         this.movePart(
            shield,
            Mth.cos(this.tickCount * -shieldRotateSpeed + MiscUtils.degToRad(-30.0F + this.yBodyRot)) * 1.21875,
            lowerShieldLayerY,
            Mth.sin(this.tickCount * -shieldRotateSpeed + MiscUtils.degToRad(-30.0F + this.yBodyRot)) * 1.21875
         );
      } else if (shield.partNumber == 5) {
         this.movePart(
            shield,
            Mth.cos(this.tickCount * -shieldRotateSpeed + MiscUtils.degToRad(90.0F + this.yBodyRot)) * 1.21875,
            lowerShieldLayerY,
            Mth.sin(this.tickCount * -shieldRotateSpeed + MiscUtils.degToRad(90.0F + this.yBodyRot)) * 1.21875
         );
      } else if (shield.partNumber == 6) {
         this.movePart(
            shield,
            Mth.cos(this.tickCount * -shieldRotateSpeed + MiscUtils.degToRad(210.0F + this.yBodyRot)) * 1.21875,
            lowerShieldLayerY,
            Mth.sin(this.tickCount * -shieldRotateSpeed + MiscUtils.degToRad(210.0F + this.yBodyRot)) * 1.21875
         );
      }
   }


   public boolean shieldsInactive() {
      return this.stunnedTicks > 0 || this.deathTime > 0;
   }

   @Override
   public void aiStep() {
      this.updateParts();
      if (!this.onGround() && this.getDeltaMovement().y < 0.0) {
         this.setDeltaMovement(this.getDeltaMovement().multiply(1.0, 0.6, 1.0));
      }

      if (this.level().isClientSide()) {
         if (this.random.nextInt(24) == 0 && !this.isSilent()) {
            this.level()
               .playLocalSound(
                  this.getX() + 0.5,
                  this.getY() + 0.5,
                  this.getZ() + 0.5,
                  SoundEvents.BLAZE_BURN,
                  this.getSoundSource(),
                  1.0F + this.random.nextFloat(),
                  this.random.nextFloat() * 0.7F + 0.3F,
                  false
               );
         }

         for (int i = 0; i < 2; i++) {
            this.level().addParticle(ParticleTypes.LARGE_SMOKE, this.getRandomX(0.5), this.getRandomY(), this.getRandomZ(0.5), 0.0, 0.0, 0.0);
         }
      }

      super.aiStep();
   }

   public static boolean canBurnBlock(BlockGetter level, Block block, BlockState blockstate, BlockPos blockpos) {
      return !(block instanceof AirBlock) && block.getExplosionResistance() <= 6.0F;
   }

   @Override
   protected EntityDimensions getDefaultDimensions(Pose p_19975_) {
      return p_19975_ == Pose.CROUCHING ? crouchingDimensions : super.getDefaultDimensions(p_19975_);
   }

   public void refreshDimensions() {
      double d0 = this.getX();
      double d1 = this.getY();
      double d2 = this.getZ();
      super.refreshDimensions();
      this.setPos(d0, d1, d2);
   }

   public boolean shouldCrouchAt(BlockPos pos) {
      boolean markedCrouching = false;

      for (int i = -2; i < 3; i++) {
         for (int j = -2; j < 3; j++) {
            if (!markedCrouching
               && this.level().getBlockState(pos.above(4).north(i).east(j)).isAir()
               && this.level().getBlockState(pos.above(3).north(i).east(j)).isAir()) {
               markedCrouching = false;
            } else {
               markedCrouching = true;
            }
         }
      }

      return markedCrouching;
   }

   private void shockwave() {
      if (this.isAlive()) {
         for (Entity entity : this.level()
            .getEntitiesOfClass(LivingEntity.class, this.getBoundingBox().inflate((Double)MutantBlazeCommonConfig.stun_shockwave_range.get()), SHOCKWAVABLE)) {
            if (this.canHurt(entity)) {
               if ((Boolean)MutantBlazeCommonConfig.ignores_invulnerability_time.get()) {
                  entity.setInvulnerableTime(0);
               }

               MiscUtils.hurt(entity, this.damageSources().mobAttack(this), ((Double)MutantBlazeCommonConfig.stun_shockwave_damage.get()).floatValue());
               entity.igniteForSeconds((Integer)MutantBlazeCommonConfig.stun_shockwave_fire_length.get());
               if (entity instanceof LivingEntity) {
                  MiscUtils.disableShield((LivingEntity)entity, (Integer)MutantBlazeCommonConfig.stun_shockwave_disable_shield_length.get());
               }
            }

            this.strongKnockback(entity);
         }
      }
   }

   boolean canHurt(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_BLAZE_CANT_HURT, this, target, this, null);
   }

   private void strongKnockback(Entity p_213688_1_) {
      double d0 = p_213688_1_.getX() - this.getX();
      double d1 = p_213688_1_.getZ() - this.getZ();
      double d2 = Math.max(d0 * d0 + d1 * d1, 0.001);
      p_213688_1_.push(d0 / d2 * 4.0, 0.2, d1 / d2 * 4.0);
   }

   @Override
   public void baseTick() {
      super.baseTick();
      this.refreshDimensions();
      this.tickDownAnimTimers();
      if (this.stunnedTicks > 0) {
         this.stunnedTicks--;
      }

      if (this.getTarget() != null && this.stunnedTicks <= this.stunnedLength - 240) {
         this.getLookControl().setLookAt(this.getTarget());
      }

      if (this.stunnedTicks == 181) {
         this.playSound(SoundEventInit.MUTANT_BLAZE_STUN_SHIELDS_BREAK, 1.5F, this.getVoicePitch());
      }

      if (this.stunnedTicks == 56) {
         this.playSound(SoundEventInit.MUTANT_BLAZE_STUN_END, 2.25F, this.getVoicePitch());
      }

      if (this.stunnedTicks == this.stunnedAnimationActionPoint) {
         this.shockwave();
      }

      if (this.stunnedTicks == this.stunnedLength - 20 || this.deathTime == 1) {
         for (MutantBlazeShieldPart shield : this.subEntities) {
            for (int i = 0; i < 20; i++) {
               this.level()
                  .addParticle(
                     ParticleTypeInit.BROKEN_MUTANT_BLAZE_SHIELD,
                     shield.getRandomX(0.75),
                     shield.getRandomY(),
                     shield.getRandomZ(0.75),
                     0.0,
                     0.0,
                     0.0
                  );
            }
         }
      }

      if (this.stunnedTicks == this.stunnedLength - 135) {
         for (int i = 0; i < this.shieldRegenerateTicks.length; i++) {
            this.shieldRegenerateTicks[i] = 20;
         }
      }

      if (!this.level().isClientSide()
         && this.shouldHeat()
         && (Boolean)MutantBlazeCommonConfig.heat_griefing.get()
         && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get()
         && this.random.nextInt((Integer)MutantBlazeCommonConfig.heat_griefing_chance.get()) == 0) {
         BlockPos pos = this.blockPosition()
               .offset(
                  (int)(-this.heatRange()) + this.random.nextInt(Mth.floor(this.heatRange() * 2.0)),
                  (int)(-this.heatRangeY()) + this.random.nextInt(Mth.floor(this.heatRangeY() * 2.0)),
                  (int)(-this.heatRange()) + this.random.nextInt(Mth.floor(this.heatRange() * 2.0))
               );
         if (this.level().getBlockState(pos).isAir()) {
            this.level().setBlockAndUpdate(pos, BaseFireBlock.getState(this.level(), pos));
         }
      }

      if (!this.shouldCrouchAt(this.blockPosition()) && !this.isInWall()) {
         this.setPose(Pose.STANDING);
      } else {
         this.setPose(Pose.CROUCHING);
      }

      if (this.isInLiquid()) {
         CollisionContext collisioncontext = CollisionContext.of(this);
         if (collisioncontext.isAbove(Block.box(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), this.blockPosition(), true) && this.level().getFluidState(this.blockPosition().above()).isEmpty()) {
            this.setOnGround(true);
         } else {
            this.setDeltaMovement(this.getDeltaMovement().scale(0.5).add(0.0, 0.05, 0.0));
         }
      }

      Vec3 velocity = this.getDeltaMovement();
      float groundSpeed = Mth.sqrt((float)(velocity.x * velocity.x + velocity.z * velocity.z));
      if (!this.level().isClientSide()
         && groundSpeed <= 0.1F
         && this.noveltyAnimationTick <= 0
         && this.random.nextInt(400) == 0
         && (this.getTarget() == null || this.getTarget().isDeadOrDying() || this.getTarget().isRemoved())) {
         this.noveltyAnimationTick = this.noveltyAnimationLength;
         this.level().broadcastEntityEvent(this, (byte)5);
      }
   }

   @Override
   public double heatRange() {
      return this.shouldHeat() ? (Double)MutantBlazeCommonConfig.heat_range.get() : 0.0;
   }

   @Override
   public double heatRangeY() {
      return this.shouldHeat() ? (Double)MutantBlazeCommonConfig.heat_range_y.get() : 0.0;
   }

   @Override
   public double heatSpeed() {
      return (Double)MutantBlazeCommonConfig.heat_speed.get();
   }

   public boolean shouldHeat() {
      return this.deathTime <= 0 && this.stunnedTicks <= this.stunnedAnimationActionPoint + 30;
   }

   @Override
   public boolean canHeat(LivingEntity heatTarget) {
      if (heatTarget.is(TagInit.EntityTypes.CANT_BE_HEATED)) {
         return false;
      } else if (heatTarget.is(TagInit.EntityTypes.MUTANT_BLAZE_CANT_HEAT)) {
         return false;
      } else if (heatTarget.fireImmune() && !(Boolean)MutantBlazeCommonConfig.heats_fire_immune_mobs.get()) {
         return false;
      } else if (this.getTeam() == null
         || heatTarget.getTeam() == null
         || this.getTeam() != heatTarget.getTeam() && !this.getTeam().isAlliedTo(heatTarget.getTeam())) {
         return heatTarget.isSpectator() ? false : !(heatTarget instanceof Player) || !((Player)heatTarget).isCreative();
      } else {
         return false;
      }
   }

   public void handleEntityEvent(byte p_28844_) {
      if (p_28844_ == 11) {
         this.introAnimationTick = this.introAnimationLength;
      } else if (p_28844_ == 5) {
         this.noveltyAnimationTick = this.noveltyAnimationLength;
      } else if (p_28844_ == 4) {
         this.shootAnimationTick = this.shootAnimationLength;
      } else if (p_28844_ == 12) {
         this.stunnedTicks = this.stunnedLength;
      } else if (p_28844_ == 13) {
         this.rodShotAnimationTick = this.rodShotAnimationLength;
      } else {
         super.handleEntityEvent(p_28844_);
      }
   }

   public boolean canStandOnFluid(FluidState p_204067_) {
      return p_204067_ != null && !p_204067_.isEmpty();
   }

   public boolean hasLineOfSight(Entity p_147185_) {
      if (p_147185_.level() != this.level()) {
         return false;
      }

      Vec3 vec3 = new Vec3(this.getX(), this.getEyeY(), this.getZ());
      Vec3 vec31 = new Vec3(p_147185_.getX(), p_147185_.getY() + 1.0, p_147185_.getZ());
      return vec31.distanceTo(vec3) > 128.0
         ? false
         : this.level().clip(new ClipContext(vec3, vec31, net.minecraft.world.level.ClipContext.Block.COLLIDER, Fluid.NONE, this)).getType() == Type.MISS;
   }


   @Override
   public TagKey<Block> walksThroughTag() {
      return TagInit.Blocks.MUTANT_BLAZE_WALKS_THROUGH;
   }

   @Override
   public ConfigValue<Boolean> walkGriefingConfig() {
      return MutantBlazeCommonConfig.walk_griefing;
   }

   @Override
   public ConfigValue<Boolean> walkGriefingDropsBlocksConfig() {
      return MutantBlazeCommonConfig.walk_griefing;
   }

   @Override
   public ConfigValue<Boolean> hurtGriefingConfig() {
      return MutantBlazeCommonConfig.hurt_griefing;
   }

   @Override
   public ConfigValue<Boolean> hurtGriefingDropsBlocksConfig() {
      return MutantBlazeCommonConfig.hurt_griefing_drops_blocks;
   }

   @Override
   public ConfigValue<Boolean> showHealthBarConfig() {
      return MutantBlazeClientConfig.show_health_bar;
   }

   @Override
   public ConfigValue<Boolean> despawnsConfig() {
      return MutantBlazeCommonConfig.despawns;
   }

   @Override
   public ConfigValue<Boolean> playBattleMusicConfig() {
      return MutantBlazeClientConfig.play_battle_music;
   }

   static class MutantBlazeNavigation extends AbstractMutant.MutantNavigation {
      public MutantBlazeNavigation(Mob mob, Level level) {
         super(mob, level);
      }

      protected void trimPath() {
         super.trimPath();
         if (this.mob.isCrouching()
            || !((MutantBlaze)this.mob)
               .shouldCrouchAt(BlockPos.containing(this.mob.getX(), this.mob.getY() + 0.5, this.mob.getZ()))) {
            for (int i = 0; i < this.path.getNodeCount(); i++) {
               Node node = this.path.getNode(i);
               if (!this.mob.isCrouching() && ((MutantBlaze)this.mob).shouldCrouchAt(new BlockPos(node.x, node.y, node.z))) {
                  this.path.truncateNodes(i);
                  return;
               }
            }
         }
      }
   }

   class RemainStationaryGoal extends Goal {
      public RemainStationaryGoal() {
         this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK, Flag.TARGET, Flag.JUMP));
      }

      public boolean canUse() {
         return MutantBlaze.this.shouldBeStationary();
      }
   }
}
