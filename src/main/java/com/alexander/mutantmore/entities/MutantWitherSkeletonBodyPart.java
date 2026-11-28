package com.alexander.mutantmore.entities;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import com.alexander.mutantmore.util.MiscUtils;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.ItemInit;
import com.alexander.mutantmore.init.TagInit;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class MutantWitherSkeletonBodyPart extends Entity {
   private static final EntityDataAccessor<Integer> PART = SynchedEntityData.defineId(MutantWitherSkeletonBodyPart.class, EntityDataSerializers.INT);
   public boolean yawPositive;
   public boolean pitchPositive;
   public int lifeTime;
   public boolean glows = false;
   public float damage = 0.0F;
   public int witherLength = 0;
   public int witherLevel = 0;
   public int despawnTime = 6000;
   public int lavaTime;

   public MutantWitherSkeletonBodyPart(EntityType<? extends MutantWitherSkeletonBodyPart> p_i50189_1_, Level p_i50189_2_) {
      super(p_i50189_1_, p_i50189_2_);
      this.xRotO = this.random.nextFloat() * 360.0F;
      this.yRotO = this.random.nextFloat() * 360.0F;
      this.yawPositive = this.random.nextBoolean();
      this.pitchPositive = this.random.nextBoolean();
   }

   protected MutantWitherSkeletonBodyPart(Level world, int part) {
      this(EntityTypeInit.MUTANT_WITHER_SKELETON_BODY_PART, world);
      this.setPart(part);
   }

   public boolean isCurrentlyGlowing() {
      return this.glows;
   }

   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      builder.define(PART, 0);
   }

   public int getPart() {
      return (Integer)this.entityData.get(PART);
   }

   private void setPart(int part) {
      this.entityData.set(PART, part);
   }

   @Override
   public ItemStack getPickResult() {
      return new ItemStack(this.getItemByPart());
   }

   public boolean isPushable() {
      return true;
   }

   public boolean isPickable() {
      return !this.isRemoved();
   }

   public void tick() {
      super.tick();
      if (this.isInLava()) {
         this.setDeltaMovement(this.getDeltaMovement().scale(0.1));
      }

      if (!this.isNoGravity()) {
         this.setDeltaMovement(this.getDeltaMovement().subtract(0.0, 0.045, 0.0));
      }

      this.move(MoverType.SELF, this.getDeltaMovement());
      this.setDeltaMovement(this.getDeltaMovement().scale(0.96));
      if (this.onGround()) {
         this.setDeltaMovement(this.getDeltaMovement().scale(0.7));
      }

      if (!this.onGround() && this.stuckSpeedMultiplier == Vec3.ZERO) {
         this.setXRot(this.xRotO = this.xRotO + 10.0F * (this.yawPositive ? 1 : -1));
         this.setYRot(this.yRotO = this.yRotO + 15.0F * (this.pitchPositive ? 1 : -1));
         if (!this.level().isClientSide()) {
            for (Entity entity : this.level().getEntities(this, this.getBoundingBox(), this::canHarm)) {
               entity.setRemainingFireTicks(this.getRemainingFireTicks() / 20);
               MiscUtils.hurt(entity, this.damageSources().thrown(this, this), this.damage);
               if (entity instanceof LivingEntity) {
                  ((LivingEntity)entity).addEffect(new MobEffectInstance(MobEffects.WITHER, this.witherLength, this.witherLevel));
               }
            }
         }
      }

      if (this.isInLava()) {
         this.lavaTime = 5;
      }

      if (this.lavaTime > 0) {
         this.lavaTime--;
      }

      if (!this.onGround() && this.lavaTime <= 0 && !this.level().isClientSide()) {
         ShakeCameraEvent.shake(this.level(), 3, 0.0075F, this.blockPosition(), 5);
      }

      this.lifeTime++;
      if (!this.level().isClientSide() && this.lifeTime >= this.despawnTime) {
         this.discard();
      }
   }

   // right-click picks the bone up (26.x added the click location parameter)
   @Override
   public InteractionResult interact(Player player, InteractionHand hand, Vec3 location) {
      if (this.isAlive()) {
         if (this.level() instanceof ServerLevel level) {
            ItemEntity item = this.spawnAtLocation(level, new ItemStack(this.getItemByPart()));
            if (item != null) {
               item.setNoPickUpDelay();
            }

            this.discard();
         }

         player.swing(hand, net.minecraft.world.item.component.SwingAnimation.DEFAULT, true);
         return InteractionResult.SUCCESS;
      } else {
         return InteractionResult.FAIL;
      }
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource p_70097_1_, float p_70097_2_) {
      return false;
   }

   private boolean canHarm(Entity entity) {
      return !entity.is(TagInit.EntityTypes.MUTANT_WITHER_SKELETON_CANT_HURT);
   }

   public Item getItemByPart() {
      int part = this.getPart();
      if (part == 0) {
         return ItemInit.MUTANT_WITHER_SKELETON_PELVIS;
      } else if (part == 1) {
         return ItemInit.MUTANT_WITHER_SKELETON_RIB;
      } else if (part == 2) {
         return ItemInit.MUTANT_WITHER_SKELETON_SKULL;
      } else if (part == 3) {
         return ItemInit.MUTANT_WITHER_SKELETON_LIMB;
      } else {
         return part == 4 ? ItemInit.MUTANT_WITHER_SKELETON_SHOULDER_PAD : ItemInit.MUTANT_WITHER_SKELETON_PELVIS;
      }
   }

   protected void addAdditionalSaveData(ValueOutput tag) {
      tag.putInt("Part", this.getPart());
      tag.putBoolean("Glows", this.glows);
      tag.putFloat("Damage", this.damage);
      tag.putInt("WitherLength", this.witherLength);
      tag.putInt("WitherLevel", this.witherLevel);
      tag.putInt("DespawnTime", this.despawnTime);
   }

   protected void readAdditionalSaveData(ValueInput tag) {
      this.setPart(tag.getIntOr("Part", 0));
      this.glows = tag.getBooleanOr("Glows", false);
      this.damage = tag.getFloatOr("Damage", 0);
      this.witherLength = tag.getIntOr("WitherLength", 0);
      this.witherLevel = tag.getIntOr("WitherLevel", 0);
      this.despawnTime = tag.getIntOr("DespawnTime", 0);
   }

}
