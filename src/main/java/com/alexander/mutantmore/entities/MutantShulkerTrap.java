package com.alexander.mutantmore.entities;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.UUIDUtil;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.config.mutant_shulker.MutantShulkerRewardsCommonConfig;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.EffectInit;
import com.alexander.mutantmore.init.ItemInit;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.google.common.base.MoreObjects;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import net.minecraft.core.Direction.Axis;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.players.OldUsersConverter;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;

public class MutantShulkerTrap extends Mob {
   private final TargetingConditions mutantShulkerTargeting = TargetingConditions.forNonCombat().range(64.0).ignoreLineOfSight().ignoreInvisibilityTesting();
   private static final EntityDataAccessor<Boolean> SPAWNED_BY_MUTANT_SHULKER = SynchedEntityData.defineId(
      MutantShulkerTrap.class, EntityDataSerializers.BOOLEAN
   );
   protected static final EntityDataAccessor<Byte> COLOR_ID = SynchedEntityData.defineId(MutantShulkerTrap.class, EntityDataSerializers.BYTE);
   public final AnimationState idleAnimation = new AnimationState();
   public final AnimationState activateAnimation = new AnimationState();
   public final AnimationState vanishAnimation = new AnimationState();
   public int activateAnimationTick;
   public int activateAnimationLength = 20;
   public int activateActionPoint = 16;
   public int vanishAnimationTick;
   public int vanishAnimationLength = 30;
   public int lifeTime;
   public int snapCooldownTick;
   public int snapCooldownLength = 40;
   @Nullable
   private UUID ownerUUID;
   private final Predicate<Entity> SNAPPABLE = target -> this.canSnap(target)
      && target instanceof LivingEntity
      && target.isAlive()
      && !target.isInvulnerable()
      && !target.isSpectator()
      && (!(target instanceof Player) || !((Player)target).isCreative());
   private final Predicate<Entity> HURTABLE = target -> this.canHarm(target)
      && target instanceof LivingEntity
      && target.isAlive()
      && !target.isInvulnerable()
      && !target.isSpectator()
      && (!(target instanceof Player) || !((Player)target).isCreative());

   public MutantShulkerTrap(EntityType<? extends MutantShulkerTrap> p_i50189_1_, Level p_i50189_2_) {
      super(p_i50189_1_, p_i50189_2_);
      this.xpReward = 1;
   }

   public static Builder createConfiguredAttributes() {
      return Mob.createMobAttributes()
         .add(Attributes.MAX_HEALTH, (Double)MutantShulkerRewardsCommonConfig.trap_max_health.get())
         .add(Attributes.ARMOR, (Double)MutantShulkerRewardsCommonConfig.trap_armour.get())
         .add(Attributes.ARMOR_TOUGHNESS, (Double)MutantShulkerRewardsCommonConfig.trap_armour_toughness.get())
         .add(Attributes.KNOCKBACK_RESISTANCE, (Double)MutantShulkerRewardsCommonConfig.trap_knockback_resistance.get());
   }

   protected SoundEvent getAmbientSound() {
      return this.isSpawnedByMutantShulker() ? SoundEventInit.MUTANT_SHULKER_TRAP_IDLE : null;
   }

   public int getAmbientSoundInterval() {
      return 200;
   }

   protected SoundEvent getHurtSound(DamageSource p_33034_) {
      return SoundEventInit.MUTANT_SHULKER_TRAP_HURT;
   }

   protected SoundEvent getDeathSound() {
      return SoundEventInit.MUTANT_SHULKER_TRAP_DEATH;
   }

   protected float getSoundVolume() {
      return 0.5F;
   }

   boolean canSnap(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_SHULKER_TRAP_WONT_SNAP, this, target, this, null);
   }

   boolean canHarm(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.MUTANT_SHULKER_TRAP_CANT_HURT, this, target, this, null);
   }

   public void setTarget(LivingEntity p_21544_) {
      if (!this.isSpawnedByMutantShulker() || p_21544_ != null) {
         super.setTarget(p_21544_);
      }
   }

   public boolean isPickable() {
      return true;
   }

   public void push(double p_20286_, double p_20287_, double p_20288_) {
   }

   public void push(Entity p_21294_) {
   }

   protected void pushEntities() {
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
      if (!this.onGround() && this.isSpawnedByMutantShulker() && !this.level().isClientSide()) {
         ShakeCameraEvent.shake(this.level(), 3, 0.005F, this.blockPosition(), 3);
      }

      List<Entity> snappables = this.level().getEntities(this, this.getBoundingBox(), this.SNAPPABLE);
      if (!snappables.isEmpty() && !this.level().isClientSide() && this.tickCount >= 20 && this.activateAnimationTick <= 0 && this.snapCooldownTick <= 0) {
         this.snapCooldownTick = this.snapCooldownLength;
         this.playSound(SoundEventInit.MUTANT_SHULKER_TRAP_TRAP);
         this.activateAnimationTick = this.activateAnimationLength;
         this.level().broadcastEntityEvent(this, (byte)4);
      }

      for (Entity entity : this.level().getEntities(this, this.getBoundingBox(), this.HURTABLE)) {
         if (this.activateAnimationTick == this.activateActionPoint) {
            ShakeCameraEvent.shake(this.level(), 6, 0.075F, this.blockPosition(), 5);
            if (this.isSpawnedByMutantShulker()) {
               entity.hurt(
                  MMDamageTypes.mutantShulkerTrapAttack(this.damageSources(), this),
                  ((Double)MutantShulkerRewardsCommonConfig.trap_mutant_shulker_damage.get()).floatValue()
               );
            } else {
               entity.hurt(
                  MMDamageTypes.mutantShulkerTrapAttack(this.damageSources(), this),
                  ((Double)MutantShulkerRewardsCommonConfig.trap_player_damage.get()).floatValue()
               );
            }

            if (entity instanceof LivingEntity) {
               ((LivingEntity)entity)
                  .addEffect(
                     new MobEffectInstance(
                        MobEffects.SLOWNESS,
                        (Integer)MutantShulkerRewardsCommonConfig.trap_slowness_length.get(),
                        (Integer)MutantShulkerRewardsCommonConfig.trap_slowness_level.get()
                     )
                  );
               ((LivingEntity)entity)
                  .addEffect(
                     new MobEffectInstance(EffectInit.JUMPING_FATIGUE, (Integer)MutantShulkerRewardsCommonConfig.trap_slowness_length.get(), 0)
                  );
            }
         }
      }

      if (this.isSpawnedByMutantShulker()) {
         this.lifeTime++;
      }

      if (this.snapCooldownTick > 0) {
         this.snapCooldownTick--;
      }

      if (!this.level().isClientSide()
         && (Boolean)MutantShulkerRewardsCommonConfig.trap_turns_to_bullet.get()
         && this.lifeTime == (Integer)MutantShulkerRewardsCommonConfig.trap_turn_to_bullet_time.get()) {
         this.playSound(SoundEventInit.MUTANT_SHULKER_TRAP_VANISH);
         this.vanishAnimationTick = this.vanishAnimationLength;
         this.level().broadcastEntityEvent(this, (byte)11);
      }

      if (!this.level().isClientSide() && this.vanishAnimationTick == 1) {
         this.discard();
         if (this.getTarget() != null) {
            Entity nearestMutantShulker = ((ServerLevel)this.level()).getNearestEntity(
                  MutantShulker.class, this.mutantShulkerTargeting, this, this.getX(), this.getY(), this.getZ(), this.getBoundingBox().inflate(64.0)
               );
            CustomShulkerBullet bullet = new CustomShulkerBullet(
               this.level(), (LivingEntity)MoreObjects.firstNonNull(nearestMutantShulker, this), this.getTarget(), Axis.Y
            );
            bullet.damage = ((Double)MutantShulkerRewardsCommonConfig.trap_shulker_bullet_damage.get()).floatValue();
            bullet.levitationLength = (Integer)MutantShulkerRewardsCommonConfig.trap_shulker_bullet_levitation_length.get();
            bullet.levitationLevel = (Integer)MutantShulkerRewardsCommonConfig.trap_shulker_bullet_levitation_level.get();
            bullet.snapTo(this.getX(), this.getY() + 0.25, this.getZ());
            this.level().addFreshEntity(bullet);
         }
      }

      if (!this.level().isClientSide()
         && this.activateAnimationTick == 1
         && (
            this.isSpawnedByMutantShulker() && !(Boolean)MutantShulkerRewardsCommonConfig.trap_mutant_shulker_multiuse.get()
               || !this.isSpawnedByMutantShulker() && !(Boolean)MutantShulkerRewardsCommonConfig.trap_player_multiuse.get()
         )) {
         this.discard();
      }
   }

   protected InteractionResult mobInteract(Player player, InteractionHand hand) {
      ItemStack itemstack = player.getItemInHand(hand);
      if (!this.level().isClientSide() && this.isOwnedBy(player) && !this.isSpawnedByMutantShulker() && player.getItemInHand(hand).isEmpty() && player.isCrouching()) {
         this.spawnAtLocation((ServerLevel)this.level(), ItemInit.MUTANT_SHULKER_TRAP);
         this.discard();
         return InteractionResult.SUCCESS;
      }

      if (this.isOwnedBy(player)
         && !this.isSpawnedByMutantShulker()
         && itemstack.has(DataComponents.DYE)
         && itemstack.get(DataComponents.DYE) != this.getColor()) {
         this.setColor(itemstack.get(DataComponents.DYE));
         if (!player.getAbilities().instabuild) {
            itemstack.shrink(1);
         }

         return InteractionResult.SUCCESS;
      } else if (this.isOwnedBy(player) && !this.isSpawnedByMutantShulker() && itemstack.getItem() == Items.WATER_BUCKET && this.getColor() != null) {
         this.setColor(null);
         if (player != null && !player.isCreative()) {
            player.setItemInHand(hand, Items.BUCKET.getDefaultInstance());
         }

         return InteractionResult.SUCCESS;
      } else {
         return super.mobInteract(player, hand);
      }
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource p_32820_, float p_32821_) {
      if (this.onGround() && this.activateAnimationTick <= 0 && this.vanishAnimationTick <= 0) {
         if (!p_32820_.is(DamageTypeTags.WITCH_RESISTANT_TO) && p_32820_.getDirectEntity() instanceof LivingEntity) {
            LivingEntity livingentity = (LivingEntity)p_32820_.getDirectEntity();
            if (!p_32820_.is(DamageTypeTags.IS_EXPLOSION)) {
               MiscUtils.hurt(livingentity, this.damageSources().thorns(this), ((Double)MutantShulkerRewardsCommonConfig.trap_thorns_damage.get()).floatValue());
            }
         }

         return super.hurtServer(level, p_32820_, p_32821_);
      } else {
         return false;
      }
   }

   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);
      builder.define(SPAWNED_BY_MUTANT_SHULKER, false);
      builder.define(COLOR_ID, (byte)16);
   }

   protected void addAdditionalSaveData(ValueOutput p_29495_) {
      super.addAdditionalSaveData(p_29495_);
      if (this.getOwnerUUID() != null) {
         p_29495_.store("Owner", UUIDUtil.CODEC, this.getOwnerUUID());
      }

      p_29495_.putBoolean("SpawnedByMutantShulker", this.isSpawnedByMutantShulker());
      p_29495_.putByte("Color", (Byte)this.entityData.get(COLOR_ID));
   }

   protected void readAdditionalSaveData(ValueInput p_29478_) {
      super.readAdditionalSaveData(p_29478_);
      p_29478_.read("Owner", UUIDUtil.CODEC).ifPresent(this::setOwnerUUID);

      this.entityData.set(COLOR_ID, p_29478_.getByteOr("Color", (byte)16));

      this.setSpawnedByMutantShulker(p_29478_.getBooleanOr("SpawnedByMutantShulker", false));
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

   @Nullable
   public UUID getOwnerUUID() {
      return this.ownerUUID;
   }

   public void setOwnerUUID(@Nullable UUID p_21817_) {
      this.ownerUUID = p_21817_;
   }

   @Nullable
   public LivingEntity getOwner() {
      try {
         UUID uuid = this.getOwnerUUID();
         return uuid == null ? null : this.level().getPlayerByUUID(uuid);
      } catch (IllegalArgumentException illegalargumentexception) {
         return null;
      }
   }

   public boolean isOwnedBy(LivingEntity p_21831_) {
      return p_21831_ == this.getOwner();
   }

   public boolean isSpawnedByMutantShulker() {
      return (Boolean)this.getEntityData().get(SPAWNED_BY_MUTANT_SHULKER);
   }

   public void setSpawnedByMutantShulker(boolean spawnedByMutantShulker) {
      this.getEntityData().set(SPAWNED_BY_MUTANT_SHULKER, spawnedByMutantShulker);
   }

   public boolean canBeAffected(MobEffectInstance p_34192_) {
      return false;
   }

   @Override
   public boolean causeFallDamage(double p_148711_, float p_148712_, DamageSource p_148713_) {
      return false;
   }

   public void handleEntityEvent(byte p_36869_) {
      if (p_36869_ == 4) {
         this.activateAnimationTick = this.activateAnimationLength;
      } else if (p_36869_ == 11) {
         this.vanishAnimationTick = this.vanishAnimationLength;
      } else {
         super.handleEntityEvent(p_36869_);
      }
   }

   private void updateAnimations() {
      this.idleAnimation.animateWhen(this.onGround() || !this.isSpawnedByMutantShulker(), this.tickCount);
      this.activateAnimation.animateWhen(this.activateAnimationTick > 0, this.tickCount);
      this.vanishAnimation.animateWhen(this.vanishAnimationTick > 0, this.tickCount);
   }

   public void tickDownAnimTimers() {
      if (this.activateAnimationTick > 0) {
         this.activateAnimationTick--;
      }

      if (this.vanishAnimationTick > 0) {
         this.vanishAnimationTick--;
      }
   }

   public void checkDespawn() {
      if (!this.isSpawnedByMutantShulker()) {
         this.noActionTime = 0;
      } else {
         super.checkDespawn();
      }
   }
}
