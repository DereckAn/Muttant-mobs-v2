package com.alexander.mutantmore.entities;

import net.minecraft.server.level.ServerLevel;
import com.alexander.mutantmore.init.EffectInit;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FrostedIceBlock;
import net.minecraft.world.level.block.state.BlockState;

public class IceCube extends Entity {
   private static final EntityDataAccessor<Integer> TARGET_ENTITY_ID = SynchedEntityData.defineId(IceCube.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Integer> CRACK_STAGE = SynchedEntityData.defineId(IceCube.class, EntityDataSerializers.INT);
   public int invulTime;

   public IceCube(EntityType<?> p_19870_, Level p_19871_) {
      super(p_19870_, p_19871_);
      this.blocksBuilding = true;
   }

   public EntityDimensions getDimensions(Pose p_19975_) {
      return this.getTarget() != null ? EntityDimensions.scalable(this.getTarget().getBbWidth(), this.getTarget().getBbHeight()) : super.getDimensions(p_19975_);
   }

   public void refreshDimensions() {
      double d0 = this.getX();
      double d1 = this.getY();
      double d2 = this.getZ();
      super.refreshDimensions();
      this.setPos(d0, d1, d2);
   }

   public void tick() {
      super.tick();
      this.refreshDimensions();
      if (this.invulTime > 0) {
         this.invulTime--;
      }

      if (this.getTarget() != null) {
         this.getTarget().setPos(this.position());
         this.getTarget().setDeltaMovement(0.0, 0.0, 0.0);
         this.getTarget().setIsInPowderSnow(true);
         this.getTarget().setTicksFrozen(200);
         if (!this.level().isClientSide() && !(this.getTarget() instanceof Player) && this.tickCount % 30 == 0) {
            this.crack();
         }
      } else if (!this.level().isClientSide()) {
         for (Entity entity : this.level().getEntities(this, this.getBoundingBox())) {
            if (entity != null) {
               this.setTarget(entity);
               break;
            }
         }
      }

      if (!this.level().isClientSide() && (this.getTarget() == null || this.getTarget() != null && (this.getTarget().isRemoved() || !this.getTarget().isAlive()))) {
         this.level().broadcastEntityEvent(this, (byte)11);
         this.discard();
      }
   }

   @Override
   public boolean canBeCollidedWith(@org.jspecify.annotations.Nullable Entity other) {
      return !this.isRemoved();
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource source, float amount) {
      if (this.invulTime <= 0) {
         this.crack();
         this.invulTime = 3;
      }

      return false;
   }

   public void crack() {
      if (this.getCrackStage() >= 3) {
         this.level().broadcastEntityEvent(this, (byte)11);
         this.discard();
         if (this.getTarget() != null) {
            if (this.getTarget() instanceof LivingEntity && ((LivingEntity)this.getTarget()).hasEffect(EffectInit.FREEZING)) {
               ((LivingEntity)this.getTarget()).removeEffect(EffectInit.FREEZING);
            }

            this.getTarget().setIsInPowderSnow(false);
            this.getTarget().setTicksFrozen(0);
         }
      } else {
         this.level().broadcastEntityEvent(this, (byte)4);
         this.setCrackStage(this.getCrackStage() + 1);
      }
   }

   public void handleEntityEvent(byte p_19882_) {
      if (p_19882_ == 4) {
         for (int i = 0; i < 12; i++) {
            this.level()
               .addParticle(
                  new BlockParticleOption(ParticleTypes.BLOCK, Blocks.PACKED_ICE.defaultBlockState()),
                  this.getRandomX(1.0),
                  this.getRandomY(),
                  this.getRandomZ(1.0),
                  0.0,
                  0.0,
                  0.0
               );
         }
      } else if (p_19882_ == 11) {
         for (int i = 0; i < 60; i++) {
            this.level()
               .addParticle(
                  new BlockParticleOption(ParticleTypes.BLOCK, Blocks.PACKED_ICE.defaultBlockState()),
                  this.getRandomX(1.0),
                  this.getRandomY(),
                  this.getRandomZ(1.0),
                  0.0,
                  0.0,
                  0.0
               );
         }
      } else {
         super.handleEntityEvent(p_19882_);
      }
   }

   public BlockState getBlockState() {
      if (this.getCrackStage() >= 3) {
         return (BlockState)Blocks.FROSTED_ICE.defaultBlockState().setValue(FrostedIceBlock.AGE, 3);
      } else if (this.getCrackStage() >= 2) {
         return (BlockState)Blocks.FROSTED_ICE.defaultBlockState().setValue(FrostedIceBlock.AGE, 2);
      } else {
         return this.getCrackStage() >= 1 ? (BlockState)Blocks.FROSTED_ICE.defaultBlockState().setValue(FrostedIceBlock.AGE, 1) : Blocks.FROSTED_ICE.defaultBlockState();
      }
   }

   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      builder.define(TARGET_ENTITY_ID, 0);
      builder.define(CRACK_STAGE, 0);
   }

   protected void readAdditionalSaveData(ValueInput p_20052_) {
   }

   protected void addAdditionalSaveData(ValueOutput p_20139_) {
   }

   public Entity getTarget() {
      return this.level().getEntity((Integer)this.entityData.get(TARGET_ENTITY_ID));
   }

   public void setTarget(Entity entity) {
      if (entity != null) {
         this.entityData.set(TARGET_ENTITY_ID, entity.getId());
      } else {
         this.entityData.set(TARGET_ENTITY_ID, 0);
      }
   }

   public int getCrackStage() {
      return Mth.clamp((Integer)this.entityData.get(CRACK_STAGE), 0, 3);
   }

   public void setCrackStage(int value) {
      this.entityData.set(CRACK_STAGE, value);
   }


   public boolean isPickable() {
      return true;
   }
}
