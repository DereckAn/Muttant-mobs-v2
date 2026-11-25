package com.alexander.mutantmore.entities;

import net.minecraft.world.entity.player.Player;
import com.alexander.mutantmore.init.EffectInit;
import com.alexander.mutantmore.config.mutant_wither_skeleton.MutantWitherSkeletonCommonConfig;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.mutant_jungle_zombie.MutantJungleZombieRewardsCommonConfig;
import com.alexander.mutantmore.blocks.QuicksandBlock;
import com.alexander.mutantmore.config.mutant_husk.MutantHuskCommonConfig;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.particles.AdvancedParticleOption;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.world.level.block.Block;
import com.alexander.mutantmore.init.TagInit;
import net.minecraft.world.entity.monster.Enemy;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.phys.Vec3;

/**
 * Invisible growing hitbox that damages what it touches. Types: 0 plain, 1 ground (block particles + break sound), 2 sand geyser, 3 poison cloud.
 * ponytail: type 4 (Mutant Wither Skeleton breath) comes back with that mutant.
 */
public class AreaDamage extends Entity {
   private static final EntityDataAccessor<Float> SIZE = SynchedEntityData.defineId(AreaDamage.class, EntityDataSerializers.FLOAT);
   private static final EntityDataAccessor<Float> SIZE_TO_REACH = SynchedEntityData.defineId(AreaDamage.class, EntityDataSerializers.FLOAT);
   private static final EntityDataAccessor<Float> GROW_SPEED = SynchedEntityData.defineId(AreaDamage.class, EntityDataSerializers.FLOAT);
   private static final EntityDataAccessor<Float> Y_SIZE = SynchedEntityData.defineId(AreaDamage.class, EntityDataSerializers.FLOAT);
   private static final EntityDataAccessor<Float> Y_KNOCKBACK = SynchedEntityData.defineId(AreaDamage.class, EntityDataSerializers.FLOAT);
   private static final EntityDataAccessor<Integer> TYPE = SynchedEntityData.defineId(AreaDamage.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Integer> ACTIVE_TYPE = SynchedEntityData.defineId(AreaDamage.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Integer> EXTRA_TIME = SynchedEntityData.defineId(AreaDamage.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Integer> START_DELAY = SynchedEntityData.defineId(AreaDamage.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Boolean> DIRECTIONAL_MOTION = SynchedEntityData.defineId(AreaDamage.class, EntityDataSerializers.BOOLEAN);
   private static final EntityDataAccessor<String> SAND_TYPE = SynchedEntityData.defineId(AreaDamage.class, EntityDataSerializers.STRING);
   private static final EntityDataAccessor<BlockPos> SENT_FROM = SynchedEntityData.defineId(AreaDamage.class, EntityDataSerializers.BLOCK_POS);
   public float damage;
   public DamageSource damageSource = this.damageSources().generic();
   public LivingEntity owner;
   public boolean constantDamage;
   public List<Entity> damagedEntities = Lists.newArrayList();
   public List<Entity> blockedByEntities = Lists.newArrayList();
   public boolean friendlyFire;
   public double knockbackAmount;
   public boolean disableShields;
   public int disableShieldTime;
   public int extraTimeTick;
   public boolean ignoresInvulTime;
   public TagKey<EntityType<?>> cantHurtTag;
   public List<AreaDamage> connectedAreaDamages = Lists.newArrayList();

   public AreaDamage(EntityType<? extends AreaDamage> type, Level level) {
      super(type, level);
   }

   @Override
   public EntityDimensions getDimensions(Pose pose) {
      return EntityDimensions.scalable(this.getSize(), this.getYSize());
   }

   @Override
   public void refreshDimensions() {
      double x = this.getX();
      double y = this.getY();
      double z = this.getZ();
      super.refreshDimensions();
      this.setPos(x, y, z);
   }

   private boolean hitByConnected(Entity entity) {
      for (AreaDamage other : this.connectedAreaDamages) {
         if (!other.constantDamage && other.damagedEntities.contains(entity)) {
            return true;
         }
      }

      return false;
   }

   public boolean canEntityBeDamaged(Entity entity) {
      if (entity == null) {
         return false;
      }

      if ((this.getAreaDamageType() == 3 || this.getActiveType() == 3)
         && entity instanceof LivingEntity living
         && !living.canBeAffected(new MobEffectInstance(MobEffects.POISON))) {
         return false;
      }

      if (this.owner instanceof SentryVine
         && !(entity instanceof Enemy)
         && !entity.is(TagInit.EntityTypes.SENTRY_VINE_TARGETS)
         && this.getTeam() == null
         && entity.getTeam() == null
         && !(Boolean)MutantJungleZombieRewardsCommonConfig.vine_friendly_fire.get()
         && !(Boolean)MutantMoreGroupedOptionsCommonConfig.friendly_fire_on.get()) {
         return false;
      }

      if (!this.constantDamage && this.damagedEntities.contains(entity)) {
         return false;
      }

      if (this.cantHurtTag != null) {
         return !this.hitByConnected(entity) && entity != this.owner && this.canHarm(entity);
      }

      if (this.owner != null && (entity == this.owner || this.owner.isAlliedTo(entity) && !this.friendlyFire)) {
         return false;
      }

      return !this.hitByConnected(entity);
   }

   boolean canHarm(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(this.cantHurtTag, this, target, this.owner, null)
         || MiscUtils.canHarmBasedOnTeamAndTag(this.cantHurtTag, this, target, this, null);
   }

   @Override
   public void handleEntityEvent(byte id) {
      if (id == 1) {
         BlockPos pos = BlockPos.containing(this.getX(), this.getY() - 0.2F, this.getZ());
         BlockState blockstate = this.level().getBlockState(pos);
         if (!blockstate.isAir()) {
            for (int i = 0; i < 50; i++) {
               this.level()
                  .addParticle(new BlockParticleOption(ParticleTypes.BLOCK, blockstate), this.getRandomX(0.5), this.getY() + 0.1, this.getRandomZ(0.5), 0.0, 0.0, 0.0);
            }
         }

         for (int i = 0; i < 20; i++) {
            Vec3 motion = PositionUtils.getOffsetMotion(this, 0.0, 0.0, 0.25, 0.0F, this.getYRot());
            this.level()
               .addParticle(
                  this.sandParticle(ParticleTypeInit.SAND),
                  this.getRandomX(0.75),
                  this.getY(),
                  this.getRandomZ(0.75),
                  motion.x + this.random.nextGaussian() * 0.01,
                  this.random.nextFloat() * 0.05,
                  motion.z + this.random.nextGaussian() * 0.01
               );
         }
      } else {
         super.handleEntityEvent(id);
      }
   }

   public static AreaDamage spawnAreaDamage(
      Level level,
      Vec3 pos,
      LivingEntity owner,
      float damage,
      DamageSource damageSource,
      float size,
      float sizeToReach,
      float growSpeed,
      float ySize,
      int extraTime,
      int startDelay,
      boolean constantDamage,
      boolean friendlyFire,
      double knockbackAmount,
      double knockbackAmountY,
      boolean directionalMotion,
      boolean disableShields,
      int disableShieldTime,
      boolean ignoresInvulTime,
      TagKey<EntityType<?>> cantHurtTag,
      int type
   ) {
      AreaDamage areaDamage = EntityTypeInit.AREA_DAMAGE.create(level, EntitySpawnReason.MOB_SUMMONED);
      areaDamage.snapTo(pos.x, pos.y, pos.z);
      areaDamage.owner = owner;
      areaDamage.damage = damage;
      areaDamage.damageSource = damageSource;
      areaDamage.setSize(size);
      areaDamage.setSizeToReach(sizeToReach);
      areaDamage.setGrowSpeed(growSpeed);
      areaDamage.setYSize(ySize);
      areaDamage.setStartDelay(startDelay);
      areaDamage.constantDamage = constantDamage;
      areaDamage.friendlyFire = friendlyFire;
      areaDamage.knockbackAmount = knockbackAmount;
      areaDamage.setYKnockback((float)knockbackAmountY);
      areaDamage.disableShields = disableShields;
      areaDamage.disableShieldTime = disableShieldTime;
      areaDamage.setShouldDirectionalMotion(directionalMotion);
      areaDamage.cantHurtTag = cantHurtTag;
      areaDamage.ignoresInvulTime = ignoresInvulTime;
      areaDamage.setAreaDamageType(type);
      areaDamage.setExtraTime(extraTime);
      if (owner != null) {
         areaDamage.setYRot(owner instanceof Mob ? owner.yBodyRot : owner.yHeadRot);
      }

      return areaDamage;
   }

   @Override
   public void baseTick() {
      super.baseTick();
      this.refreshDimensions();
      if (this.tickCount <= this.getStartDelay()) {
         return;
      }

      if (this.getActiveType() == 2) {
         this.tickSandGeyser();
      }

      if (this.getActiveType() == 3) {
         for (int i = 0; i < this.getSize() * 3.0F; i++) {
            this.level()
               .addAlwaysVisibleParticle(
                  ParticleTypeInit.POISON_CLOUD,
                  this.getRandomX(0.5),
                  this.getRandomY(),
                  this.getRandomZ(0.5),
                  this.random.nextGaussian() * 0.05,
                  this.random.nextGaussian() * 0.05,
                  this.random.nextGaussian() * 0.05
               );
         }
      }

      // Type 4: Mutant Wither Skeleton's wither breath, a gas cloud that only reaches what the mouth can see
      Vec3 sentFrom = Vec3.atLowerCornerOf(this.getSentFrom());
      if (this.getActiveType() == 4 && this.tickCount < this.getStartDelay() + this.getExtraTime() - 60) {
         for (int i = 0; i < 10; i++) {
            Vec3 pos = new Vec3(this.getRandomX(0.5), this.getRandomY() + 0.02, this.getRandomZ(0.5));
            if (PositionUtils.distanceBetweenVecs(this.position(), pos) <= this.getSize() / 2.0F && PositionUtils.hasLineOfSight(this.level(), sentFrom, pos)) {
               this.level().addAlwaysVisibleParticle(ParticleTypeInit.WITHER_GAS, pos.x, pos.y, pos.z, 0.0, 0.0, 0.0);
            }
         }
      }

      if (this.level() instanceof ServerLevel serverLevel) {
         for (Entity entity : this.level().getEntities(this, this.getBoundingBox(), Entity::isAlive)) {
            if (this.getActiveType() == 4
               && !(entity instanceof Player player && (player.isCreative() || player.isSpectator()))
               && this.canEntityBeDamaged(entity)
               && this.distanceTo(entity) <= this.getSize() / 2.0F
               && PositionUtils.hasLineOfSight(this.level(), sentFrom, entity.getEyePosition())
               && entity instanceof LivingEntity living) {
               living.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, MutantWitherSkeletonCommonConfig.wither_breath_blindness_length.get()));
               living.addEffect(
                  new MobEffectInstance(MobEffects.WITHER, MutantWitherSkeletonCommonConfig.wither_breath_wither_length.get(), MutantWitherSkeletonCommonConfig.wither_breath_wither_level.get())
               );
               living.addEffect(
                  new MobEffectInstance(MobEffects.SLOWNESS, MutantWitherSkeletonCommonConfig.wither_breath_slowness_length.get(), MutantWitherSkeletonCommonConfig.wither_breath_slowness_level.get())
               );
               living.addEffect(new MobEffectInstance(EffectInit.JUMPING_FATIGUE, MutantWitherSkeletonCommonConfig.wither_breath_slowness_length.get()));
            }

            if (this.damage > 0.0F && this.damageSource != null && entity instanceof LivingEntity living && this.canEntityBeDamaged(entity)) {
               if (this.ignoresInvulTime) {
                  living.setInvulnerableTime(0);
               }

               // Poison clouds never kill on their own
               float amount = this.getActiveType() == 3 ? Mth.clamp(this.damage, 0.0F, living.getHealth() - 1.0F) : this.damage;
               boolean hurt = living.hurtServer(serverLevel, this.damageSource, amount);
               if (this.knockbackAmount > 0.0 || this.getYKnockback() > 0.0F) {
                  living.needsSync = true;
                  if (this.shouldDirectionalMotion()) {
                     Vec3 motion = PositionUtils.getOffsetMotion(this, 0.0, 0.0, this.knockbackAmount, 0.0F, this.getYRot());
                     living.push(motion.x, this.getYKnockback(), motion.z);
                  } else if (this.distanceTo(living) >= 0.5) {
                     double dx = living.getX() - this.getX();
                     double dz = living.getZ() - this.getZ();
                     double d = Math.max(dx * dx + dz * dz, 0.001);
                     living.push(dx / d * this.knockbackAmount, this.getYKnockback(), dz / d * this.knockbackAmount);
                  }
               }

               if (this.disableShields) {
                  MiscUtils.disableShield(living, this.disableShieldTime);
               }

               if (!hurt) {
                  this.blockedByEntities.add(living);
               }

               this.damagedEntities.add(living);
            }
         }
      }

      if (this.getAreaDamageType() > 0) {
         if (this.getAreaDamageType() == 1 || this.getAreaDamageType() == 2) {
            this.playSound(this.level().getBlockState(this.blockPosition().below()).getSoundType().getBreakSound(), 1.0F, MiscUtils.randomSoundPitch());
            this.level().broadcastEntityEvent(this, (byte)1);
         }

         if (this.getAreaDamageType() == 2) {
            this.playSound(SoundEventInit.MUTANT_HUSK_GEYSER, 2.0F, MiscUtils.randomSoundPitch());
         }

         this.setActiveType(this.getAreaDamageType());
         this.setAreaDamageType(0);
      }

      if (this.getSize() < this.getSizeToReach()) {
         this.setSize(this.getSize() + this.getGrowSpeed());
      }

      if (this.getSize() >= this.getSizeToReach()) {
         this.extraTimeTick++;
      }

      if (!this.level().isClientSide()
         && (this.getExtraTime() > 0 && this.extraTimeTick >= this.getExtraTime() || this.getExtraTime() <= 0 && this.getSize() >= this.getSizeToReach())) {
         this.discard();
      }
   }

   private AdvancedParticleOption sandParticle(ParticleType<AdvancedParticleOption> type) {
      return new AdvancedParticleOption(type, List.of((float)MiscUtils.sandColourForSandType(this.getSandType())));
   }

   private void tickSandGeyser() {
      for (int i = 0; i < 8; i++) {
         this.level()
            .addParticle(
               this.sandParticle(ParticleTypeInit.SAND),
               this.getRandomX(1.0),
               this.getY(),
               this.getRandomZ(1.0),
               this.random.nextGaussian() * 0.01,
               this.getYKnockback() * 1.5 + this.random.nextGaussian() * 0.5,
               this.random.nextGaussian() * 0.01
            );
      }

      this.level()
         .addParticle(
            this.sandParticle(ParticleTypeInit.SAND_GEYSER),
            this.getX() + this.random.nextGaussian() * 0.1,
            this.getY(),
            this.getZ() + this.random.nextGaussian() * 0.1,
            0.0,
            this.getYKnockback() * 1.5,
            0.0
         );
      // A Mutant Husk's geyser leaves quicksand around it
      if (!this.level().isClientSide()
         && this.owner instanceof MutantHusk
         && (Boolean)MutantHuskCommonConfig.geyser_attack_griefing.get()
         && !(Boolean)MutantMoreGroupedOptionsCommonConfig.quicksand_griefing_off.get()) {
         Block quicksand = MiscUtils.quicksandBlockForSandType(this.getSandType());
         for (BlockPos pos : BlockPos.betweenClosed(this.getBoundingBox().inflate(2.0))) {
            if (this.level().getBlockState(pos).isAir() && QuicksandBlock.survivable(quicksand.defaultBlockState(), this.level(), pos) && this.random.nextInt(40) == 0) {
               this.level().setBlockAndUpdate(pos, quicksand.defaultBlockState());
            }
         }
      }
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource source, float amount) {
      return false;
   }

   @Override
   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      builder.define(SIZE, 0.0F);
      builder.define(SIZE_TO_REACH, 0.0F);
      builder.define(Y_SIZE, 0.0F);
      builder.define(GROW_SPEED, 0.0F);
      builder.define(Y_KNOCKBACK, 0.0F);
      builder.define(TYPE, 0);
      builder.define(ACTIVE_TYPE, 0);
      builder.define(EXTRA_TIME, 0);
      builder.define(START_DELAY, 0);
      builder.define(DIRECTIONAL_MOTION, false);
      builder.define(SAND_TYPE, "");
      builder.define(SENT_FROM, BlockPos.ZERO);
   }

   public float getSize() {
      return this.entityData.get(SIZE);
   }

   public void setSize(float value) {
      this.entityData.set(SIZE, value);
   }

   public boolean shouldDirectionalMotion() {
      return this.entityData.get(DIRECTIONAL_MOTION);
   }

   public void setShouldDirectionalMotion(boolean value) {
      this.entityData.set(DIRECTIONAL_MOTION, value);
   }

   public String getSandType() {
      return this.entityData.get(SAND_TYPE);
   }

   public BlockPos getSentFrom() {
      return this.entityData.get(SENT_FROM);
   }

   public void setSentFrom(BlockPos pos) {
      this.entityData.set(SENT_FROM, pos);
   }

   public void setSandType(String value) {
      this.entityData.set(SAND_TYPE, value);
   }

   public float getSizeToReach() {
      return this.entityData.get(SIZE_TO_REACH);
   }

   public void setSizeToReach(float value) {
      this.entityData.set(SIZE_TO_REACH, value);
   }

   public float getYSize() {
      return this.entityData.get(Y_SIZE);
   }

   public void setYSize(float value) {
      this.entityData.set(Y_SIZE, value);
   }

   public float getGrowSpeed() {
      return this.entityData.get(GROW_SPEED);
   }

   public void setGrowSpeed(float value) {
      this.entityData.set(GROW_SPEED, value);
   }

   public float getYKnockback() {
      return this.entityData.get(Y_KNOCKBACK);
   }

   public void setYKnockback(float value) {
      this.entityData.set(Y_KNOCKBACK, value);
   }

   public int getAreaDamageType() {
      return this.entityData.get(TYPE);
   }

   public void setAreaDamageType(int value) {
      this.entityData.set(TYPE, value);
   }

   public int getActiveType() {
      return this.entityData.get(ACTIVE_TYPE);
   }

   public void setActiveType(int value) {
      this.entityData.set(ACTIVE_TYPE, value);
   }

   public int getExtraTime() {
      return this.entityData.get(EXTRA_TIME);
   }

   public void setExtraTime(int value) {
      this.entityData.set(EXTRA_TIME, value);
   }

   public int getStartDelay() {
      return this.entityData.get(START_DELAY);
   }

   public void setStartDelay(int value) {
      this.entityData.set(START_DELAY, value);
   }

   @Override
   protected void readAdditionalSaveData(ValueInput input) {
      this.setSize(input.getFloatOr("Size", 0.0F));
      this.setSizeToReach(input.getFloatOr("SizeToReach", 0.0F));
      this.setYSize(input.getFloatOr("YSize", 0.0F));
      this.setGrowSpeed(input.getFloatOr("GrowSpeed", 0.0F));
      this.setAreaDamageType(input.getIntOr("AreaDamageType", 0));
      this.setActiveType(input.getIntOr("ActiveType", 0));
      this.setExtraTime(input.getIntOr("ExtraTime", 0));
      this.damage = input.getFloatOr("Damage", 0.0F);
      this.setStartDelay(input.getIntOr("StartDelay", 0));
      this.ignoresInvulTime = input.getBooleanOr("IgnoresInvulTime", false);
      this.constantDamage = input.getBooleanOr("ConstantDamage", false);
      this.knockbackAmount = input.getDoubleOr("KnockbackAmount", 0.0);
      this.setYKnockback(input.getFloatOr("KnockbackAmountY", 0.0F));
      this.disableShieldTime = input.getIntOr("DisableShieldTime", 0);
      this.disableShields = input.getBooleanOr("DisableShields", false);
   }

   @Override
   protected void addAdditionalSaveData(ValueOutput output) {
      output.putFloat("Size", this.getSize());
      output.putFloat("SizeToReach", this.getSizeToReach());
      output.putFloat("YSize", this.getYSize());
      output.putFloat("GrowSpeed", this.getGrowSpeed());
      output.putInt("AreaDamageType", this.getAreaDamageType());
      output.putInt("ActiveType", this.getActiveType());
      output.putFloat("Damage", this.damage);
      output.putInt("StartDelay", this.getStartDelay());
      output.putBoolean("IgnoresInvulTime", this.ignoresInvulTime);
      output.putBoolean("ConstantDamage", this.constantDamage);
      output.putDouble("KnockbackAmount", this.knockbackAmount);
      output.putFloat("KnockbackAmountY", this.getYKnockback());
      output.putInt("DisableShieldTime", this.disableShieldTime);
      output.putBoolean("DisableShields", this.disableShields);
      output.putInt("ExtraTime", this.getExtraTime());
   }
}
