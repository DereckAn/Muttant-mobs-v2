package com.alexander.mutantmore.entities;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.UUIDUtil;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.mutant_shulker.MutantShulkerRewardsCommonConfig;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.interfaces.IHasCustomExplosion;
import com.alexander.mutantmore.util.MiscUtils;
import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction.Axis;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.ai.control.BodyRotationControl;
import net.minecraft.world.entity.ai.control.Control;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.animal.golem.AbstractGolem;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class MutantShulkerTurret extends AbstractGolem implements IHasCustomExplosion {
   private static final EntityDataAccessor<Integer> TOP_HEAD_TARGET = SynchedEntityData.defineId(MutantShulkerTurret.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Integer> MID_HEAD_TARGET = SynchedEntityData.defineId(MutantShulkerTurret.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Boolean> SHOULD_DEPLOY = SynchedEntityData.defineId(MutantShulkerTurret.class, EntityDataSerializers.BOOLEAN);
   protected static final EntityDataAccessor<Byte> COLOR_ID = SynchedEntityData.defineId(MutantShulkerTurret.class, EntityDataSerializers.BYTE);
   public final AnimationState deployAnimation = new AnimationState();
   public final AnimationState bottomShootAnimation = new AnimationState();
   public final AnimationState middleShootAnimation = new AnimationState();
   public final AnimationState topShootAnimation = new AnimationState();
   public int deployAnimationTick;
   public int deployAnimationLength = 65;
   public int topSegmentShootAnimationTick;
   public int midSegmentShootAnimationTick;
   public int bottomSegmentShootAnimationTick;
   public int shootAnimationLength = 22;
   public int shootAnimationActionPoint = 5;
   public float topHeadXRot;
   public float topHeadYRot;
   public float midHeadXRot;
   public float midHeadYRot;
   public int topHeadLoseTargetTime;
   public int midHeadLoseTargetTime;
   public int topHeadShootCooldown;
   public int midHeadShootCooldown;
   public int shulkerBulletShootCooldownLength = 60;
   public float topHeadRandomLookY;
   public float midHeadRandomLookY;
   private final TargetingConditions.Selector TARGETING_PREDICATE = (target, level) -> (
         target instanceof Enemy || target.is(TagInit.EntityTypes.MUTANT_SHULKER_TURRET_TARGETS)
      )
      && target.attackable()
      && this.canAttack(target);
   private final TargetingConditions TARGETING_CONDITIONS = TargetingConditions.forCombat()
      .range((Double)MutantShulkerRewardsCommonConfig.turret_follow_range.get())
      .selector(this.TARGETING_PREDICATE);

   public MutantShulkerTurret(EntityType<? extends MutantShulkerTurret> p_i50189_1_, Level p_i50189_2_) {
      super(p_i50189_1_, p_i50189_2_);
      this.shulkerBulletShootCooldownLength = (Integer)MutantShulkerRewardsCommonConfig.turret_shoot_cooldown.get();
   }

   protected void registerGoals() {
      this.goalSelector.addGoal(1, new MutantShulkerTurret.ShootAttackGoal(this));
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
               (entity, level) -> entity instanceof Enemy || entity.is(TagInit.EntityTypes.MUTANT_SHULKER_TURRET_TARGETS)
            )
         );
   }

   public boolean canAttack(LivingEntity target) {
      return target.hasEffect(MobEffects.LEVITATION) && MutantShulkerRewardsCommonConfig.turret_ignores_levitating_mobs.get()
         ? false
         : this.canTarget(target) && super.canAttack(target);
   }

   @Override
   public boolean canHarmWithExplosion(Entity target) {
      return !(target instanceof Enemy)
            && !target.is(TagInit.EntityTypes.MUTANT_SHULKER_TURRET_TARGETS)
            && this.getTeam() == null
            && target.getTeam() == null
            && !MutantShulkerRewardsCommonConfig.turret_friendly_fire.get()
            && !MutantMoreGroupedOptionsCommonConfig.friendly_fire_on.get()
         ? false
         : this.explosionCanHarm(target);
   }

   boolean explosionCanHarm(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_SHULKER_TURRET_MUTANT_SHULKER_BULLET_CANT_HURT, this, target, this, null);
   }

   boolean canTarget(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_SHULKER_TURRET_CANT_TARGET, this, target, this, null);
   }

   public static Builder createConfiguredAttributes() {
      return Mob.createMobAttributes()
         .add(Attributes.MAX_HEALTH, (Double)MutantShulkerRewardsCommonConfig.turret_max_health.get())
         .add(Attributes.ARMOR, (Double)MutantShulkerRewardsCommonConfig.turret_armour.get())
         .add(Attributes.ARMOR_TOUGHNESS, (Double)MutantShulkerRewardsCommonConfig.turret_armour_toughness.get())
         .add(Attributes.KNOCKBACK_RESISTANCE, (Double)MutantShulkerRewardsCommonConfig.turret_knockback_resistance.get())
         .add(Attributes.FOLLOW_RANGE, (Double)MutantShulkerRewardsCommonConfig.turret_follow_range.get());
   }

   protected BodyRotationControl createBodyControl() {
      return new MutantShulkerTurret.MutantShulkerTurretBodyRotationControl(this);
   }

   public boolean shouldBodyMoveWithHead() {
      return false;
   }

   public int getMaxHeadYRot() {
      return Integer.MAX_VALUE;
   }

   public int getMaxHeadXRot() {
      return Integer.MAX_VALUE;
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource p_28848_, float p_28849_) {
      MutantShulkerTurret.Crackiness crackiness = this.getCrackiness();
      boolean flag = super.hurtServer(level, p_28848_, p_28849_);
      if (flag && this.getCrackiness() != crackiness) {
         this.playSound(SoundEventInit.MUTANT_SHULKER_TURRET_CRACK, 1.0F, 1.0F);
      }

      return flag;
   }

   public MutantShulkerTurret.Crackiness getCrackiness() {
      return MutantShulkerTurret.Crackiness.byFraction(this.getHealth() / this.getMaxHealth());
   }

   protected InteractionResult mobInteract(Player p_28861_, InteractionHand p_28862_) {
      ItemStack itemstack = p_28861_.getItemInHand(p_28862_);
      if (itemstack.is(TagInit.Items.REPAIRS_MUTANT_SHULKER_TURRET) && this.getHealth() < this.getMaxHealth()) {
         this.heal(this.getMaxHealth() * (((Integer)MutantShulkerRewardsCommonConfig.turret_repair_heal_percent.get()).floatValue() / 100.0F));
         float f1 = 1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F;
         this.playSound(SoundEventInit.MUTANT_SHULKER_TURRET_REPAIR, 1.0F, f1);
         if (!p_28861_.getAbilities().instabuild) {
            itemstack.shrink(1);
         }

         return InteractionResult.SUCCESS;
      } else if (itemstack.has(DataComponents.DYE) && itemstack.get(DataComponents.DYE) != this.getColor()) {
         this.setColor(itemstack.get(DataComponents.DYE));
         if (!p_28861_.getAbilities().instabuild) {
            itemstack.shrink(1);
         }

         return InteractionResult.SUCCESS;
      } else if (itemstack.getItem() == Items.WATER_BUCKET && this.getColor() != null) {
         this.setColor(null);
         if (p_28861_ != null && !p_28861_.isCreative()) {
            p_28861_.setItemInHand(p_28862_, Items.BUCKET.getDefaultInstance());
         }

         return InteractionResult.SUCCESS;
      } else {
         return super.mobInteract(p_28861_, p_28862_);
      }
   }

   public void setDeltaMovement(Vec3 vec) {
      super.setDeltaMovement(
         new Vec3(
            MutantShulkerRewardsCommonConfig.turret_locked_horizontal_movement.get() ? 0.0 : vec.x,
            vec.y,
            MutantShulkerRewardsCommonConfig.turret_locked_horizontal_movement.get() ? 0.0 : vec.z
         )
      );
   }

   protected SoundEvent getAmbientSound() {
      return this.deployAnimationTick > 0 ? null : SoundEventInit.MUTANT_SHULKER_TURRET_IDLE;
   }

   protected SoundEvent getHurtSound(DamageSource p_27517_) {
      return SoundEventInit.MUTANT_SHULKER_TURRET_HURT;
   }

   protected SoundEvent getDeathSound() {
      return SoundEventInit.MUTANT_SHULKER_TURRET_DEATH;
   }

   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);
      builder.define(SHOULD_DEPLOY, true);
      builder.define(MID_HEAD_TARGET, 0);
      builder.define(TOP_HEAD_TARGET, 0);
      builder.define(COLOR_ID, (byte)16);
   }

   protected void addAdditionalSaveData(ValueOutput p_29495_) {
      super.addAdditionalSaveData(p_29495_);
      p_29495_.putByte("Color", (Byte)this.entityData.get(COLOR_ID));
      p_29495_.putBoolean("ShouldDeploy", this.shouldDeploy());
   }

   protected void readAdditionalSaveData(ValueInput p_29478_) {
      super.readAdditionalSaveData(p_29478_);
      this.entityData.set(COLOR_ID, p_29478_.getByteOr("Color", (byte)16));

      this.setShouldDeploy(p_29478_.getBooleanOr("ShouldDeploy", false));
   }

   private void setColor(DyeColor p_149778_) {
      if (p_149778_ == null) {
         this.entityData.set(COLOR_ID, (byte)16);
      } else {
         this.entityData.set(COLOR_ID, (byte)p_149778_.getId());
      }
   }

   @Nullable
   public DyeColor getColor() {
      byte b0 = (Byte)this.entityData.get(COLOR_ID);
      return b0 != 16 && b0 <= 15 ? DyeColor.byId(b0) : null;
   }

   public boolean shouldDeploy() {
      return (Boolean)this.entityData.get(SHOULD_DEPLOY);
   }

   public void setShouldDeploy(boolean setTo) {
      this.entityData.set(SHOULD_DEPLOY, setTo);
   }

   public int getMidHeadTargetID() {
      return (Integer)this.entityData.get(MID_HEAD_TARGET);
   }

   public void setMidHeadTargetID(int setTo) {
      this.entityData.set(MID_HEAD_TARGET, setTo);
   }

   public int getTopHeadTargetID() {
      return (Integer)this.entityData.get(TOP_HEAD_TARGET);
   }

   public void setTopHeadTargetID(int setTo) {
      this.entityData.set(TOP_HEAD_TARGET, setTo);
   }

   public Entity getTopHeadTarget() {
      return this.getTopHeadTargetID() == 0 ? null : this.level().getEntity(this.getTopHeadTargetID());
   }

   public Entity getMidHeadTarget() {
      return this.getMidHeadTargetID() == 0 ? null : this.level().getEntity(this.getMidHeadTargetID());
   }

   public boolean isPushable() {
      return false;
   }

   @Override
   public boolean canBeCollidedWith(@org.jspecify.annotations.Nullable Entity other) {
      return !this.isDeadOrDying() && !this.isRemoved();
   }

   @Override
   public boolean causeFallDamage(double p_149589_, float p_149590_, DamageSource p_149591_) {
      return false;
   }

   public boolean addEffect(MobEffectInstance p_182397_, @Nullable Entity p_182398_) {
      return false;
   }

   public void push(double p_20286_, double p_20287_, double p_20288_) {
   }

   protected float getStandingEyeHeight(Pose p_21131_, EntityDimensions p_21132_) {
      return 0.9F;
   }

   public float getMidHeadEyeHeight() {
      return 2.5F;
   }

   public float getTopHeadEyeHeight() {
      return 3.75F;
   }

   public void tick() {
      super.tick();
      if (this.level().isClientSide()) {
         this.updateAnimations();
      }
   }

   public void baseTick() {
      super.baseTick();
      this.tickDownAnimTimers();
      if (!this.level().isClientSide() && this.getTarget() != null && this.getTarget().hasEffect(MobEffects.LEVITATION)) {
         this.setTarget(null);
         this.level().broadcastEntityEvent(this, (byte)8);
      }

      if (this.topHeadShootCooldown > 0) {
         this.topHeadShootCooldown--;
      }

      if (this.midHeadShootCooldown > 0) {
         this.midHeadShootCooldown--;
      }

      if (this.shouldDeploy()) {
         this.deployAnimationTick = this.deployAnimationLength;
         this.setShouldDeploy(false);
         this.playSound(SoundEventInit.MUTANT_SHULKER_TURRET_DEPLOY);
      }
   }

   public void aiStep() {
      super.aiStep();
      if (this.getRandom().nextFloat() < 0.02F) {
         this.topHeadYRot = this.random.nextFloat() * 360.0F;
      }

      if (this.getRandom().nextFloat() < 0.02F) {
         this.midHeadYRot = this.random.nextFloat() * 360.0F;
      }

      if (this.deployAnimationTick <= 0) {
         if (this.getTopHeadTarget() == null) {
            this.topHeadXRot = this.rotlerp(this.topHeadXRot, 0.0F, 10.0F);
            this.topHeadYRot = this.rotlerp(this.topHeadYRot, this.yBodyRot, 10.0F);
            if (!this.level().isClientSide()) {
               List<Mob> viableTargets = ((ServerLevel)this.level()).getNearbyEntities(
                     Mob.class,
                     this.TARGETING_CONDITIONS,
                     this,
                     this.getBoundingBox().inflate(this.getAttributeValue(Attributes.FOLLOW_RANGE), 6.0, this.getAttributeValue(Attributes.FOLLOW_RANGE))
                  );
               if (!viableTargets.isEmpty() && this.random.nextInt(20) == 0) {
                  this.topHeadLoseTargetTime = 60;
                  this.setTopHeadTargetID(viableTargets.get(this.random.nextInt(viableTargets.size())).getId());
               }
            }
         } else {
            double d9 = this.getX();
            double d1 = this.getY() + this.getTopHeadEyeHeight();
            double d3 = this.getZ();
            double d4 = this.getTopHeadTarget().getX() - d9;
            double d5 = this.getTopHeadTarget().getEyeY() - d1;
            double d6 = this.getTopHeadTarget().getZ() - d3;
            double d7 = Math.sqrt(d4 * d4 + d6 * d6);
            float f = (float)(Mth.atan2(d6, d4) * 180.0F / (float)Math.PI) - 90.0F;
            float f1 = (float)(-(Mth.atan2(d5, d7) * 180.0F / (float)Math.PI));
            this.topHeadXRot = this.rotlerp(this.topHeadXRot, f1, 40.0F);
            this.topHeadYRot = this.rotlerp(this.topHeadYRot, f, 10.0F);
            if (!this.level().isClientSide()) {
               if (this.topHeadShootCooldown <= 0) {
                  this.topHeadShootCooldown = this.shulkerBulletShootCooldownLength;
                  this.topSegmentShootAnimationTick = this.shootAnimationLength;
                  this.level().broadcastEntityEvent(this, (byte)4);
               }

               if (this.topSegmentShootAnimationTick == this.shootAnimationActionPoint) {
                  CustomShulkerBullet shulkerBullet = new CustomShulkerBullet(this.level(), this, this.getTopHeadTarget(), Axis.Y);
                  shulkerBullet.damage = ((Double)MutantShulkerRewardsCommonConfig.turret_shulker_bullet_damage.get()).floatValue();
                  shulkerBullet.levitationLength = (Integer)MutantShulkerRewardsCommonConfig.turret_shulker_bullet_levitation_length.get();
                  shulkerBullet.levitationLevel = (Integer)MutantShulkerRewardsCommonConfig.turret_shulker_bullet_levitation_level.get();
                  shulkerBullet.snapTo(this.getX(), this.getY() + this.getTopHeadEyeHeight(), this.getZ());
                  this.level().addFreshEntity(shulkerBullet);
                  this.playSound(SoundEvents.SHULKER_SHOOT, 1.0F, (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F);
               }

               if (!this.hasLineOfSight(this.getTopHeadTarget()) || this.distanceTo(this.getTopHeadTarget()) > 20.0F) {
                  this.topHeadLoseTargetTime--;
               }

               if (this.topHeadLoseTargetTime <= 0
                  || this.getTopHeadTarget() instanceof LivingEntity && ((LivingEntity)this.getTopHeadTarget()).isDeadOrDying()
                  || this.getTopHeadTarget().isRemoved()
                  || this.getTopHeadTarget() instanceof LivingEntity && !this.canAttack((LivingEntity)this.getTopHeadTarget())) {
                  this.setTopHeadTargetID(0);
               }
            }
         }

         if (this.getMidHeadTarget() == null) {
            this.midHeadXRot = this.rotlerp(this.midHeadXRot, 0.0F, 10.0F);
            this.midHeadYRot = this.rotlerp(this.midHeadYRot, this.yBodyRot, 10.0F);
            if (!this.level().isClientSide()) {
               List<Mob> viableTargets = ((ServerLevel)this.level()).getNearbyEntities(
                     Mob.class,
                     this.TARGETING_CONDITIONS,
                     this,
                     this.getBoundingBox().inflate(this.getAttributeValue(Attributes.FOLLOW_RANGE), 6.0, this.getAttributeValue(Attributes.FOLLOW_RANGE))
                  );
               if (!viableTargets.isEmpty() && this.random.nextInt(20) == 0) {
                  this.midHeadLoseTargetTime = 60;
                  this.setMidHeadTargetID(viableTargets.get(this.random.nextInt(viableTargets.size())).getId());
               }
            }
         } else {
            double d9 = this.getX();
            double d1 = this.getY() + this.getMidHeadEyeHeight();
            double d3 = this.getZ();
            double d4 = this.getMidHeadTarget().getX() - d9;
            double d5 = this.getMidHeadTarget().getEyeY() - d1;
            double d6 = this.getMidHeadTarget().getZ() - d3;
            double d7 = Math.sqrt(d4 * d4 + d6 * d6);
            float f = (float)(Mth.atan2(d6, d4) * 180.0F / (float)Math.PI) - 90.0F;
            float f1 = (float)(-(Mth.atan2(d5, d7) * 180.0F / (float)Math.PI));
            this.midHeadXRot = this.rotlerp(this.midHeadXRot, f1, 40.0F);
            this.midHeadYRot = this.rotlerp(this.midHeadYRot, f, 10.0F);
            if (!this.level().isClientSide()) {
               if (this.midHeadShootCooldown <= 0) {
                  this.midHeadShootCooldown = this.shulkerBulletShootCooldownLength;
                  this.midSegmentShootAnimationTick = this.shootAnimationLength;
                  this.level().broadcastEntityEvent(this, (byte)5);
               }

               if (this.midSegmentShootAnimationTick == this.shootAnimationActionPoint) {
                  CustomShulkerBullet shulkerBullet = new CustomShulkerBullet(this.level(), this, this.getMidHeadTarget(), Axis.Y);
                  shulkerBullet.damage = ((Double)MutantShulkerRewardsCommonConfig.turret_shulker_bullet_damage.get()).floatValue();
                  shulkerBullet.levitationLength = (Integer)MutantShulkerRewardsCommonConfig.turret_shulker_bullet_levitation_length.get();
                  shulkerBullet.levitationLevel = (Integer)MutantShulkerRewardsCommonConfig.turret_shulker_bullet_levitation_level.get();
                  shulkerBullet.snapTo(this.getX(), this.getY() + this.getMidHeadEyeHeight(), this.getZ());
                  this.level().addFreshEntity(shulkerBullet);
                  this.playSound(SoundEvents.SHULKER_SHOOT, 1.0F, (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F);
               }

               if (!this.hasLineOfSight(this.getMidHeadTarget()) || this.distanceTo(this.getMidHeadTarget()) > 20.0F) {
                  this.midHeadLoseTargetTime--;
               }

               if (this.midHeadLoseTargetTime <= 0
                  || this.getMidHeadTarget() instanceof LivingEntity && ((LivingEntity)this.getMidHeadTarget()).isDeadOrDying()
                  || this.getMidHeadTarget().isRemoved()
                  || this.getMidHeadTarget() instanceof LivingEntity && !this.canAttack((LivingEntity)this.getMidHeadTarget())) {
                  this.setMidHeadTargetID(0);
               }
            }
         }
      }
   }

   private float rotlerp(float p_31443_, float p_31444_, float p_31445_) {
      float f = Mth.wrapDegrees(p_31444_ - p_31443_);
      if (f > p_31445_) {
         f = p_31445_;
      }

      if (f < -p_31445_) {
         f = -p_31445_;
      }

      return p_31443_ + f;
   }

   public void shootMutantShulkerProjectile(float angle, BlockPos shootToPos, boolean aimForTarget) {
      MutantShulkerBullet projectile = new MutantShulkerBullet(
         EntityTypeInit.MUTANT_SHULKER_BULLET, this.level()
      );
      projectile.damage = ((Double)MutantShulkerRewardsCommonConfig.turret_mutant_shulker_bullet_damage.get()).floatValue();
      projectile.griefing = (Boolean)MutantShulkerRewardsCommonConfig.turret_mutant_shulker_bullet_griefing.get();
      projectile.griefingDropsBlocks = (Boolean)MutantShulkerRewardsCommonConfig.turret_mutant_shulker_bullet_griefing_drops_blocks.get()
         || (Boolean)MutantMoreGroupedOptionsCommonConfig.griefing_drops_blocks_on.get();
      projectile.explosionSize = ((Double)MutantShulkerRewardsCommonConfig.turret_mutant_shulker_bullet_explosion_size.get()).floatValue();
      projectile.levitationLength = (Integer)MutantShulkerRewardsCommonConfig.turret_mutant_shulker_bullet_levitation_length.get();
      projectile.levitationLevel = (Integer)MutantShulkerRewardsCommonConfig.turret_mutant_shulker_bullet_levitation_level.get();
      if (aimForTarget && this.getTarget() != null) {
         projectile.setPos(this.getX(), this.getEyeY(), this.getZ());
         projectile.setTargetByID(this.getTarget().getId());
         projectile.setOwner(this);
         this.shootMutantShulkerProjectile(this.getTarget().blockPosition(), projectile, angle);
         this.level().addFreshEntity(projectile);
      } else {
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
      p_32323_.playSound(SoundEventInit.MUTANT_SHULKER_SHOOT, 1.0F, 1.0F / (p_32323_.getRandom().nextFloat() * 0.4F + 0.8F));
   }

   public Vector3f getProjectileShotVector(LivingEntity p_32333_, Vec3 p_32334_, float p_32335_) {
      Vec3 vec3 = p_32334_.normalize();
      Vec3 vec31 = vec3.cross(new Vec3(0.0, 0.0, 0.0));
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
         this.topSegmentShootAnimationTick = this.shootAnimationLength;
      } else if (p_28844_ == 5) {
         this.midSegmentShootAnimationTick = this.shootAnimationLength;
      } else if (p_28844_ == 6) {
         this.bottomSegmentShootAnimationTick = this.shootAnimationLength;
      } else if (p_28844_ == 7) {
         this.deployAnimationTick = this.deployAnimationLength;
      } else if (p_28844_ == 8) {
         this.setTarget(null);
      } else {
         super.handleEntityEvent(p_28844_);
      }
   }

   private void updateAnimations() {
      this.deployAnimation.animateWhen(this.deployAnimationTick > 0, this.tickCount);
      this.bottomShootAnimation.animateWhen(this.bottomSegmentShootAnimationTick > 0, this.tickCount);
      this.middleShootAnimation.animateWhen(this.midSegmentShootAnimationTick > 0, this.tickCount);
      this.topShootAnimation.animateWhen(this.topSegmentShootAnimationTick > 0, this.tickCount);
   }

   public void tickDownAnimTimers() {
      if (this.topSegmentShootAnimationTick > 0) {
         this.topSegmentShootAnimationTick--;
      }

      if (this.midSegmentShootAnimationTick > 0) {
         this.midSegmentShootAnimationTick--;
      }

      if (this.bottomSegmentShootAnimationTick > 0) {
         this.bottomSegmentShootAnimationTick--;
      }

      if (this.deployAnimationTick > 0) {
         this.deployAnimationTick--;
      }
   }

   public enum Crackiness {
      NONE(1.0F),
      LOW(0.75F),
      MEDIUM(0.5F),
      HIGH(0.25F);

      private static final List<MutantShulkerTurret.Crackiness> BY_DAMAGE = Stream.of(values())
         .sorted(Comparator.comparingDouble(p_28904_ -> p_28904_.fraction))
         .collect(ImmutableList.toImmutableList());
      private final float fraction;

      Crackiness(float p_28900_) {
         this.fraction = p_28900_;
      }

      public static MutantShulkerTurret.Crackiness byFraction(float p_28902_) {
         for (MutantShulkerTurret.Crackiness irongolem$crackiness : BY_DAMAGE) {
            if (p_28902_ < irongolem$crackiness.fraction) {
               return irongolem$crackiness;
            }
         }

         return NONE;
      }
   }

   public class MutantShulkerTurretBodyRotationControl extends BodyRotationControl implements Control {
      private final Mob mob;
      private int headStableTime;
      private float lastStableYHeadRot;

      public MutantShulkerTurretBodyRotationControl(Mob p_24879_) {
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

   class ShootAttackGoal extends Goal {
      public MutantShulkerTurret mob;
      @Nullable
      public LivingEntity target;
      public int nextUseTime;

      public ShootAttackGoal(MutantShulkerTurret mob) {
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
         return this.mob.deployAnimationTick <= 0
            && this.target != null
            && !this.target.isRemoved()
            && !this.target.isDeadOrDying()
            && this.mob.tickCount >= this.nextUseTime
            && this.animationsUseable();
      }

      public boolean canContinueToUse() {
         return this.target != null && !this.target.isRemoved() && !this.target.isDeadOrDying() && !this.animationsUseable();
      }

      public void start() {
         this.nextUseTime = this.mob.tickCount + this.mob.shulkerBulletShootCooldownLength;
         this.mob.bottomSegmentShootAnimationTick = this.mob.shootAnimationLength;
         this.mob.level().broadcastEntityEvent(this.mob, (byte)6);
      }

      public void tick() {
         this.target = this.mob.getTarget();
         if (this.target != null) {
            this.mob.getLookControl().setLookAt(this.target);
         }

         if (this.target != null && this.mob.bottomSegmentShootAnimationTick == this.mob.shootAnimationActionPoint) {
            MutantShulkerTurret.this.shootMutantShulkerProjectile(0.0F, null, true);
         }
      }

      public boolean animationsUseable() {
         return this.mob.bottomSegmentShootAnimationTick <= 0;
      }
   }
}
