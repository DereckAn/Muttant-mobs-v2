package com.alexander.mutantmore.entities;

import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.blocks.QuicksandBlock;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.particles.AdvancedParticleOption;
import java.util.function.Consumer;
import com.alexander.mutantmore.util.MiscUtils;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class SandBoulder extends ThrowableProjectile {
   private static final EntityDataAccessor<String> SAND_TYPE = SynchedEntityData.defineId(SandBoulder.class, EntityDataSerializers.STRING);
   public float damage = 0.0F;
   public int lifeSpan = 100;
   public boolean griefing = true;
   public boolean ignoresInvulTime = true;
   public List<Entity> alreadyHit = Lists.newArrayList();

   public SandBoulder(EntityType<? extends SandBoulder> p_37391_, Level p_37392_) {
      super(p_37391_, p_37392_);
   }

   public SandBoulder(Level level, LivingEntity owner) {
      super(EntityTypeInit.SAND_BOULDER, owner.getX(), owner.getEyeY() - 0.1F, owner.getZ(), level);
      this.setOwner(owner);
   }

   public SandBoulder(Level p_37394_, double p_37395_, double p_37396_, double p_37397_) {
      super(EntityTypeInit.SAND_BOULDER, p_37395_, p_37396_, p_37397_, p_37394_);
   }

   protected void onHitEntity(EntityHitResult p_37404_) {
      super.onHitEntity(p_37404_);
   }

   protected void onHit(HitResult p_37406_) {
      super.onHit(p_37406_);
   }

   /** Client sets this to start the rolling loop sound (was Forge onAddedToWorld + HandleLoopingSoundInstances). */
   public static Consumer<SandBoulder> rollingSoundHook = boulder -> {};
   private boolean rollingSoundStarted;

   public void tick() {
      super.tick();
      if (this.level().isClientSide() && !this.rollingSoundStarted) {
         this.rollingSoundStarted = true;
         rollingSoundHook.accept(this);
      }

      if (!this.isInWater()) {
         this.setDeltaMovement(this.getDeltaMovement().scale(1.01));
      }

      if (this.level().isClientSide()) {
         ShakeCameraEvent.shake(this.level(), 3, 0.0075F, this.blockPosition(), 5);
      }

      this.level()
         .addParticle(
            new AdvancedParticleOption(ParticleTypeInit.SAND, List.of((float)MiscUtils.sandColourForSandType(this.getSandType()))),
            this.getRandomX(1.0),
            this.getY(),
            this.getRandomZ(1.0),
            0.0,
            0.0,
            0.0
         );
      if (!this.level().isClientSide()) {
         AABB aabb = this.getBoundingBox().inflate(0.2);
         if (this.tickCount >= this.lifeSpan) {
            this.discard();
            ((ServerLevel)this.level())
               .sendParticles(
                  new AdvancedParticleOption(ParticleTypeInit.SAND, List.of((float)MiscUtils.sandColourForSandType(this.getSandType()))),
                  this.getX(),
                  this.getY(0.5),
                  this.getZ(),
                  40,
                  this.getBbWidth() / 2.0F,
                  this.getBbHeight(),
                  this.getBbWidth() / 2.0F,
                  0.0
               );
         }

         if (Block.isFaceFull(this.level().getBlockState(this.blockPosition()).getCollisionShape(this.level(), this.blockPosition().below()), Direction.UP)) {
            if (this.getDeltaMovement().y < 0.0) {
               if (this.getDeltaMovement().y < -0.2) {
                  ShakeCameraEvent.shake(this.level(), 10, 0.15F, this.blockPosition(), 10);
                  this.playSound(SoundEventInit.MUTANT_HUSK_THUD, 2.0F, MiscUtils.randomSoundPitch());
               }

               this.setDeltaMovement(this.getDeltaMovement().x, -this.getDeltaMovement().y * 0.5, this.getDeltaMovement().z);
            } else {
               this.setDeltaMovement(this.getDeltaMovement().x, 0.05, this.getDeltaMovement().z);
            }
         }

         if (Block.isFaceFull(this.level().getBlockState(this.blockPosition().above()).getCollisionShape(this.level(), this.blockPosition()), Direction.UP)) {
            if (Block.isFaceFull(this.level().getBlockState(this.blockPosition().above().above()).getCollisionShape(this.level(), this.blockPosition().above()), Direction.UP)) {
               this.discard();
               ((ServerLevel)this.level())
                  .sendParticles(
                     new AdvancedParticleOption(ParticleTypeInit.SAND, List.of((float)MiscUtils.sandColourForSandType(this.getSandType()))),
                     this.getX(),
                     this.getY(0.5),
                     this.getZ(),
                     40,
                     this.getBbWidth() / 2.0F,
                     this.getBbHeight(),
                     this.getBbWidth() / 2.0F,
                     0.0
                  );
            } else {
               this.snapTo(this.position().add(0.0, 1.0, 0.0));
            }
         }

         for (Entity entity : this.level().getEntities(this, this.getBoundingBox())) {
            if (!this.alreadyHit.contains(entity) && this.canHit(entity) && (this.getOwner() == null || this.getOwner() != entity)) {
               this.alreadyHit.add(entity);
               entity.setDeltaMovement(entity.getDeltaMovement().add(this.getDeltaMovement()));
               if (this.canHarm(entity)) {
                  if (this.ignoresInvulTime) {
                     entity.setInvulnerableTime(0);
                  }

                  MiscUtils.hurt(entity, MMDamageTypes.sandBoulderAttack(this.damageSources(), this, this.getOwner()), this.damage);
               }
            }
         }

         if (this.griefing) {
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
                  && QuicksandBlock.survivable(MiscUtils.quicksandBlockForSandType(this.getSandType()).defaultBlockState(), this.level(), blockpos)
                  && this.random.nextBoolean()) {
                  this.level().setBlockAndUpdate(blockpos, MiscUtils.quicksandBlockForSandType(this.getSandType()).defaultBlockState());
               }
            }
         }
      }
   }

   boolean canHarm(Entity target) {
      if (MiscUtils.canHarmBasedOnTeamAndTag(
         TagInit.EntityTypes.MUTANT_HUSK_SAND_BOULDER_CANT_HURT, this, target, this.getOwner(), entity -> entity instanceof MutantHusk
      )) {
         return true;
      } else {
         return MiscUtils.canHarmBasedOnTeamAndTag(
               TagInit.EntityTypes.PLAYER_SAND_BOULDER_CANT_HURT, this, target, this.getOwner(), entity -> entity instanceof Player
            )
            ? true
            : MiscUtils.canHarmBasedOnTeamAndTag(null, this, target, this.getOwner(), entity -> !(entity instanceof MutantHusk));
      }
   }

   boolean canHit(Entity target) {
      if (MiscUtils.canHarmBasedOnTeamAndTag(
         TagInit.EntityTypes.MUTANT_HUSK_SAND_BOULDER_CANT_HIT, this, target, this.getOwner(), entity -> entity instanceof MutantHusk
      )) {
         return true;
      } else {
         return MiscUtils.canHarmBasedOnTeamAndTag(
               TagInit.EntityTypes.PLAYER_SAND_BOULDER_CANT_HIT, this, target, this.getOwner(), entity -> entity instanceof Player
            )
            ? true
            : MiscUtils.canHarmBasedOnTeamAndTag(null, this, target, this.getOwner(), entity -> !(entity instanceof MutantHusk));
      }
   }

   protected boolean canHitEntity(Entity target) {
      return this.canHit(target) && super.canHitEntity(target);
   }

   protected void addAdditionalSaveData(ValueOutput tag) {
      super.addAdditionalSaveData(tag);
      tag.putFloat("Damage", this.damage);
      tag.putInt("LifeSpan", this.lifeSpan);
      tag.putBoolean("Griefing", this.griefing);
      tag.putBoolean("IgnoresInvulTime", this.ignoresInvulTime);
      tag.putString("SandType", this.getSandType());
   }

   protected void readAdditionalSaveData(ValueInput tag) {
      super.readAdditionalSaveData(tag);
      if (tag.contains("Damage")) {
         this.damage = tag.getFloatOr("Damage", 0);
      }

      if (tag.contains("LifeSpan")) {
         this.lifeSpan = tag.getIntOr("LifeSpan", 0);
      }

      if (tag.contains("Griefing")) {
         this.griefing = tag.getBooleanOr("Griefing", false);
      }

      if (tag.contains("IgnoresInvulTime")) {
         this.ignoresInvulTime = tag.getBooleanOr("IgnoresInvulTime", false);
      }

      if (tag.contains("SandType")) {
         this.setSandType(tag.getStringOr("SandType", ""));
      }
   }

   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      builder.define(SAND_TYPE, "");
   }

   public String getSandType() {
      return (String)this.entityData.get(SAND_TYPE);
   }

   public void setSandType(String value) {
      this.entityData.set(SAND_TYPE, value);
   }

}
