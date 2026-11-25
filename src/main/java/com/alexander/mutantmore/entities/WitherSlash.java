package com.alexander.mutantmore.entities;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class WitherSlash extends ThrowableProjectile {
   private static final EntityDataAccessor<Float> SIZE = SynchedEntityData.defineId(WitherSlash.class, EntityDataSerializers.FLOAT);
   private static final EntityDataAccessor<Float> FIXED_YAW = SynchedEntityData.defineId(WitherSlash.class, EntityDataSerializers.FLOAT);
   public int textureChange = 0;
   public float damage = 0.0F;
   public float leechAmount = 0.0F;
   public int witherLength = 0;
   public int witherLevel = 0;
   public boolean ignoresInvulTime = true;
   public List<Entity> alreadyHit = Lists.newArrayList();

   public WitherSlash(EntityType<? extends WitherSlash> p_37391_, Level p_37392_) {
      super(p_37391_, p_37392_);
   }

   public WitherSlash(Level p_37399_, LivingEntity p_37400_, float yRot) {
      super(EntityTypeInit.WITHER_SLASH, p_37400_.getX(), p_37400_.getEyeY() - 0.1F, p_37400_.getZ(), p_37399_);
      this.setOwner(p_37400_);
      this.setFixedYaw(yRot);
   }

   @Override
   protected double getDefaultGravity() {
      return 0.0;
   }

   protected boolean canHitEntity(Entity target) {
      return this.canHit(target) && super.canHitEntity(target);
   }

   private boolean loopSoundStarted;

   @Override
   public EntityDimensions getDimensions(Pose p_19975_) {
      return super.getDimensions(p_19975_).scale(this.getSize());
   }

   public boolean isOnFire() {
      return false;
   }

   public boolean isPickable() {
      return false;
   }

   @Override
   public boolean hurtServer(net.minecraft.server.level.ServerLevel level, DamageSource p_37616_, float p_37617_) {
      return false;
   }

   protected boolean shouldBurn() {
      return false;
   }

   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      builder.define(SIZE, 1.0F);
      builder.define(FIXED_YAW, 0.0F);
   }

   public float getSize() {
      return (Float)this.entityData.get(SIZE);
   }

   public void setSize(float value) {
      this.entityData.set(SIZE, value);
   }

   public float getFixedYaw() {
      return (Float)this.entityData.get(FIXED_YAW);
   }

   public void setFixedYaw(float yaw) {
      if (!this.level().isClientSide()) {
         this.entityData.set(FIXED_YAW, yaw);
      }
   }

   public void tick() {
      if (this.level().isClientSide() && !this.loopSoundStarted) {
         this.loopSoundStarted = true;
         MiscUtils.loopingSoundHook.accept(this, SoundEventInit.MUTANT_WITHER_SKELETON_FIRE_SLASH_LOOP);
      }

      Vec3 deltaMovementO = this.getDeltaMovement();
      super.tick();
      this.refreshDimensions();
      this.setDeltaMovement(deltaMovementO);

      for (Entity entity : this.level().getEntities(this, this.getBoundingBox())) {
         if (!this.level().isClientSide() && this.canHitEntity(entity)) {
            Entity target = entity;
            Entity owner = this.getOwner();
            if (!this.alreadyHit.contains(target) && this.canHarm(target)) {
               if (this.ignoresInvulTime) {
                  target.setInvulnerableTime(0);
               }

               DamageSource source = MMDamageTypes.witherSlashAttack(this.damageSources(), this, owner);
               boolean flag = MiscUtils.hurt(target, source, this.damage);
               if (target instanceof LivingEntity livingTarget) {
                  if (flag) {
                     if (owner instanceof LivingEntity livingOwner) {
                        MiscUtils.witherLeech(
                           livingOwner, this.leechAmount, new Vec3(livingTarget.getX(), livingTarget.getY(0.75), livingTarget.getZ())
                        );
                     }

                     livingTarget.addEffect(new MobEffectInstance(MobEffects.WITHER, this.witherLength, this.witherLevel), owner);
                  }

                  flag = true;
               } else {
                  flag = false;
               }

               if (owner instanceof LivingEntity livingOwner) {
                  this.alreadyHit.add(target);
                  EnchantmentHelper.doPostAttackEffects((net.minecraft.server.level.ServerLevel)this.level(), target, source);
               }
            }
         }
      }

      if (this.level().isClientSide()) {
         ShakeCameraEvent.shake(this.level(), 3, 0.0075F, this.blockPosition(), 5);
      }

      this.level().addAlwaysVisibleParticle(
         net.minecraft.core.particles.ColorParticleOption.create(ParticleTypes.ENTITY_EFFECT, 0xFF000000 | 5254710), this.getRandomX(1.0), this.getRandomY(), this.getRandomZ(1.0), 0.0, 0.0, 0.0
      );
      if (this.tickCount % 5 == 0) {
         this.textureChange++;
      }
   }

   protected void onHitEntity(EntityHitResult p_37386_) {
   }

   protected void onHitBlock(BlockHitResult p_37384_) {
      super.onHitBlock(p_37384_);
      if (!this.level().isClientSide()) {
         this.discard();
      }
   }

   boolean canHarm(Entity target) {
      if (MiscUtils.canHarmBasedOnTeamAndTag(
         TagInit.EntityTypes.MUTANT_WITHER_SKELETON_WITHER_SLASH_CANT_HURT, this, target, this.getOwner(), entity -> entity instanceof MutantWitherSkeleton
      )) {
         return true;
      } else {
         return MiscUtils.canHarmBasedOnTeamAndTag(
               TagInit.EntityTypes.PLAYER_WITHER_SLASH_CANT_HURT, this, target, this.getOwner(), entity -> entity instanceof Player
            )
            ? true
            : MiscUtils.canHarmBasedOnTeamAndTag(
               null, this, target, this.getOwner(), entity -> !(entity instanceof MutantWitherSkeleton) && !(entity instanceof Player)
            );
      }
   }

   boolean canHit(Entity target) {
      if (MiscUtils.canHarmBasedOnTeamAndTag(
         TagInit.EntityTypes.MUTANT_WITHER_SKELETON_WITHER_SLASH_CANT_HIT, this, target, this.getOwner(), entity -> entity instanceof MutantWitherSkeleton
      )) {
         return true;
      } else {
         return MiscUtils.canHarmBasedOnTeamAndTag(
               TagInit.EntityTypes.PLAYER_WITHER_SLASH_CANT_HIT, this, target, this.getOwner(), entity -> entity instanceof Player
            )
            ? true
            : MiscUtils.canHarmBasedOnTeamAndTag(
               null, this, target, this.getOwner(), entity -> !(entity instanceof MutantWitherSkeleton) && !(entity instanceof Player)
            );
      }
   }

   protected void onHit(HitResult p_37388_) {
      super.onHit(p_37388_);
   }

   protected void readAdditionalSaveData(ValueInput tag) {
      super.readAdditionalSaveData(tag);
      if (tag.contains("Damage")) {
         this.damage = tag.getFloatOr("Damage", 0);
      }

      if (tag.contains("Size")) {
         this.setSize(tag.getFloatOr("Size", 0));
      }

      if (tag.contains("LeechAmount")) {
         this.leechAmount = tag.getFloatOr("LeechAmount", 0);
      }

      if (tag.contains("WitherLength")) {
         this.witherLength = tag.getIntOr("WitherLength", 0);
      }

      if (tag.contains("WitherLevel")) {
         this.witherLevel = tag.getIntOr("WitherLevel", 0);
      }

      if (tag.contains("IgnoresInvulTime")) {
         this.ignoresInvulTime = tag.getBooleanOr("IgnoresInvulTime", false);
      }
   }

   protected void addAdditionalSaveData(ValueOutput tag) {
      super.addAdditionalSaveData(tag);
      tag.putFloat("Damage", this.damage);
      tag.putFloat("Size", this.getSize());
      tag.putFloat("LeechAmount", this.leechAmount);
      tag.putInt("WitherLength", this.witherLength);
      tag.putInt("WitherLevel", this.witherLevel);
      tag.putBoolean("IgnoresInvulTime", this.ignoresInvulTime);
   }

   public boolean isAttackable() {
      return false;
   }

}
