package com.alexander.mutantmore.entities;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class GiantSnowball extends ThrowableProjectile {
   public GiantSnowball(EntityType<? extends GiantSnowball> p_37391_, Level p_37392_) {
      super(p_37391_, p_37392_);
   }

   public GiantSnowball(Level p_37399_, LivingEntity p_37400_) {
      super(EntityTypeInit.GIANT_SNOWBALL, p_37400_.getX(), p_37400_.getEyeY() - 0.1F, p_37400_.getZ(), p_37399_);
      this.setOwner(p_37400_);
   }

   public GiantSnowball(Level p_37394_, double p_37395_, double p_37396_, double p_37397_) {
      super(EntityTypeInit.GIANT_SNOWBALL, p_37395_, p_37396_, p_37397_, p_37394_);
   }

   protected void onHitBlock(BlockHitResult p_37258_) {
      super.onHitBlock(p_37258_);
      if (!this.level().isClientSide()) {
         this.level().broadcastEntityEvent(this, (byte)4);
         this.discard();
      }
   }

   public void tick() {
      super.tick();
      if (this.level().isClientSide()) {
         ShakeCameraEvent.shake(this.level(), 3, 0.0075F, this.blockPosition(), 5);
      } else {
         for (Entity entity : ((ServerLevel)this.level()).getNearbyEntities(LivingEntity.class, TargetingConditions.forCombat(), null, this.getBoundingBox().inflate(2.0))) {
            if (entity != this.getOwner() && this.canHitEntity(entity)) {
               IceCube iceCube = (IceCube)EntityTypeInit.ICE_CUBE.create(this.level(), EntitySpawnReason.MOB_SUMMONED);
               iceCube.snapTo(entity.position());
               iceCube.setTarget(entity);
               this.level().addFreshEntity(iceCube);
               this.level().broadcastEntityEvent(this, (byte)4);
               this.discard();
               if (this.getOwner() != null
                  && this.getOwner() instanceof MutantFrozenZombie
                  && ((MutantFrozenZombie)this.getOwner()).getTarget() != null
                  && entity == ((MutantFrozenZombie)this.getOwner()).getTarget()) {
                  ((MutantFrozenZombie)this.getOwner()).wantsToJump = true;
               }
            }
         }
      }
   }

   public void handleEntityEvent(byte p_19882_) {
      if (p_19882_ == 4) {
         for (int i = 0; i < 80; i++) {
            this.level().addParticle(ParticleTypes.ITEM_SNOWBALL, this.getRandomX(1.0), this.getRandomY(), this.getRandomZ(1.0), 0.0, 0.0, 0.0);
         }
      } else {
         super.handleEntityEvent(p_19882_);
      }
   }

   boolean canHit(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(
            TagInit.EntityTypes.MUTANT_FROZEN_ZOMBIE_GIANT_SNOWBALL_CANT_HIT, this, target, this.getOwner(), entity -> entity instanceof MutantFrozenZombie
         )
         ? true
         : MiscUtils.canHarmBasedOnTeamAndTag(null, this, target, this.getOwner(), entity -> !(entity instanceof MutantFrozenZombie));
   }

   protected boolean canHitEntity(Entity target) {
      return this.canHit(target) && super.canHitEntity(target);
   }

   protected void defineSynchedData(SynchedEntityData.Builder builder) {
   }

   protected void addAdditionalSaveData(ValueOutput tag) {
      super.addAdditionalSaveData(tag);
   }

   protected void readAdditionalSaveData(ValueInput tag) {
      super.readAdditionalSaveData(tag);
   }

}
