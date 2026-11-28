package com.alexander.mutantmore.entities;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.UUIDUtil;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.init.EffectInit;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class IcicleSpike extends Entity {
   public int startDelay;
   public AnimationState spikeAnimationState = new AnimationState();
   public int spikeAnimationLength = 60;
   public int spikeAnimationTick = 0;
   public float damage = 0.0F;
   public int freezingLength = 0;
   public int freezingLevel = 0;
   public boolean ignoresInvulTime = true;
   public float xRotation;
   public float yRotation;
   public LivingEntity owner;
   public List<Entity> alreadyHurtEntities = Lists.newArrayList();
   public List<IcicleSpike> connectedSpikes = Lists.newArrayList();

   public IcicleSpike(EntityType<?> type, Level level) {
      super(type, level);
   }

   public IcicleSpike(Level level, int startDelay, LivingEntity owner) {
      super(EntityTypeInit.ICICLE_SPIKE, level);
      this.startDelay = startDelay;
      this.owner = owner;
      this.setXRot((float)this.random.nextGaussian() * 10.0F);
      this.setYRot(this.random.nextFloat() * 360.0F);
   }

   protected void defineSynchedData(SynchedEntityData.Builder builder) {
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource source, float amount) {
      return false;
   }

   protected void readAdditionalSaveData(ValueInput tag) {
      if (tag.contains("StartDelay")) {
         this.startDelay = tag.getIntOr("StartDelay", 0);
      }

      if (tag.contains("Damage")) {
         this.damage = tag.getFloatOr("Damage", 0);
      }

      if (tag.contains("FreezingLevel")) {
         this.freezingLevel = tag.getIntOr("FreezingLevel", 0);
      }

      if (tag.contains("FreezingLength")) {
         this.freezingLength = tag.getIntOr("FreezingLength", 0);
      }

      if (tag.contains("IgnoresInvulTime")) {
         this.ignoresInvulTime = tag.getBooleanOr("IgnoresInvulTime", false);
      }

      if (this.level() instanceof ServerLevel level) {
         tag.read("OwnerID", UUIDUtil.CODEC).ifPresent(id -> this.owner = level.getEntity(id) instanceof LivingEntity living ? living : null);
      }
   }

   protected void addAdditionalSaveData(ValueOutput tag) {
      tag.putInt("StartDelay", this.startDelay);
      tag.putFloat("Damage", this.damage);
      tag.putInt("FreezingLevel", this.freezingLevel);
      tag.putInt("FreezingLength", this.freezingLength);
      tag.putBoolean("IgnoresInvulTime", this.ignoresInvulTime);
      if (this.owner != null) {
         tag.store("OwnerID", UUIDUtil.CODEC, this.owner.getUUID());
      }
   }

   public void handleEntityEvent(byte p_19882_) {
      if (p_19882_ == 4) {
         this.spikeAnimationTick = this.spikeAnimationLength;
         this.spikeAnimationState.start(this.tickCount);
      } else {
         super.handleEntityEvent(p_19882_);
      }
   }

   public void tick() {
      super.tick();
      if (!this.spikeAnimationState.isStarted()) {
         BlockPos blockpos = this.blockPosition().below();
         BlockState blockstate = this.level().getBlockState(blockpos);
         if (!blockstate.isAir() && this.random.nextBoolean()) {
            this.level()
               .addParticle(
                  new BlockParticleOption(ParticleTypes.BLOCK, blockstate),
                  blockpos.getX() + this.random.nextGaussian() * 0.1,
                  blockpos.above().getY() + 0.1,
                  blockpos.getZ() + this.random.nextGaussian() * 0.1,
                  this.random.nextGaussian(),
                  0.0,
                  this.random.nextGaussian()
               );
         }
      }

      if (!this.level().isClientSide()) {
         if (this.tickCount >= this.startDelay && this.spikeAnimationTick <= 0) {
            this.spikeAnimationTick = this.spikeAnimationLength;
            this.level().broadcastEntityEvent(this, (byte)4);
         }

         if (this.tickCount == this.startDelay + 2) {
            for (Entity entity : this.level().getEntities(this, this.getBoundingBox())) {
               if (entity != this.owner && this.canHarm(entity) && !this.alreadyHurtEntities.contains(entity)) {
                  if (this.ignoresInvulTime) {
                     entity.setInvulnerableTime(0);
                  }

                  entity.needsSync = true;
                  entity.push(0.0, 0.25, 0.0);
                  boolean flag = MiscUtils.hurt(entity, MMDamageTypes.icicleAttack(this.damageSources(), this, this.owner), this.damage);
                  if (flag && entity instanceof LivingEntity) {
                     if (((LivingEntity)entity).hasEffect(EffectInit.FREEZING)) {
                        ((LivingEntity)entity)
                           .addEffect(
                              new MobEffectInstance(
                                 EffectInit.FREEZING,
                                 ((LivingEntity)entity).getEffect(EffectInit.FREEZING).getDuration() + this.freezingLength,
                                 this.freezingLevel
                              )
                           );
                     } else {
                        ((LivingEntity)entity).addEffect(new MobEffectInstance(EffectInit.FREEZING, this.freezingLength, this.freezingLevel));
                     }
                  }

                  for (IcicleSpike spike : this.connectedSpikes) {
                     spike.alreadyHurtEntities.add(entity);
                  }
               }
            }
         }

         if (this.spikeAnimationTick > 0) {
            this.spikeAnimationTick--;
         }

         if (this.spikeAnimationTick == 1) {
            this.discard();
         }
      }
   }

   @Override
   public boolean canBeCollidedWith(@org.jspecify.annotations.Nullable Entity other) {
      return !this.isRemoved() && this.spikeAnimationTick > 10;
   }

   boolean canHarm(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(
            TagInit.EntityTypes.MUTANT_FROZEN_ZOMBIE_CANT_HURT, this, target, this.owner, entity -> entity instanceof MutantFrozenZombie
         )
         ? true
         : MiscUtils.canHarmBasedOnTeamAndTag(null, this, target, this.owner, entity -> !(entity instanceof MutantFrozenZombie));
   }

}
