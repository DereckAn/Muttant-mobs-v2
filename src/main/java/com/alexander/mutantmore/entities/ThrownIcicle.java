package com.alexander.mutantmore.entities;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.EffectInit;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;

public class ThrownIcicle extends ThrowableProjectile {
   public float damage = 0.0F;
   public int freezingLength = 0;
   public int freezingLevel = 0;
   public int disableShieldLength = 0;
   public boolean ignoresInvulTime = true;
   public List<Entity> alreadyHit = Lists.newArrayList();

   public ThrownIcicle(EntityType<? extends ThrownIcicle> p_37391_, Level p_37392_) {
      super(p_37391_, p_37392_);
   }

   public ThrownIcicle(Level p_37399_, LivingEntity p_37400_) {
      super(EntityTypeInit.THROWN_ICICLE, p_37400_.getX(), p_37400_.getEyeY() - 0.1F, p_37400_.getZ(), p_37399_);
      this.setOwner(p_37400_);
   }

   protected void onHitEntity(EntityHitResult p_37386_) {
      super.onHitEntity(p_37386_);
      if (!this.level().isClientSide()) {
         Entity entity = p_37386_.getEntity();
         Entity entity1 = this.getOwner();
         if (!this.alreadyHit.contains(entity) && this.canHarm(entity)) {
            if (this.ignoresInvulTime) {
               entity.setInvulnerableTime(0);
            }

            boolean flag = MiscUtils.hurt(entity, MMDamageTypes.icicleAttack(this.damageSources(), this, entity1), this.damage);
            if (entity instanceof LivingEntity) {
               if (flag) {
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

               MiscUtils.disableShield((LivingEntity)p_37386_.getEntity(), this.disableShieldLength);
            }

            if (entity1 instanceof LivingEntity) {
               this.alreadyHit.add(entity);
               EnchantmentHelper.doPostAttackEffects((ServerLevel)this.level(), entity, MMDamageTypes.icicleAttack(this.damageSources(), this, entity1));
            }
         }
      }
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
      }
   }

   public void handleEntityEvent(byte p_19882_) {
      if (p_19882_ == 4) {
         for (int i = 0; i < 20; i++) {
            this.level()
               .addParticle(
                  new BlockParticleOption(ParticleTypes.BLOCK, Blocks.POWDER_SNOW.defaultBlockState()),
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

   boolean canHarm(Entity target) {
      if (MiscUtils.canHarmBasedOnTeamAndTag(
         TagInit.EntityTypes.MUTANT_FROZEN_ZOMBIE_THROWN_ICICLE_CANT_HURT, this, target, this.getOwner(), entity -> entity instanceof MutantFrozenZombie
      )) {
         return true;
      } else {
         return MiscUtils.canHarmBasedOnTeamAndTag(
               TagInit.EntityTypes.PLAYER_THROWN_ICICLE_CANT_HURT, this, target, this.getOwner(), entity -> entity instanceof Player
            )
            ? true
            : MiscUtils.canHarmBasedOnTeamAndTag(
               null, this, target, this.getOwner(), entity -> !(entity instanceof MutantFrozenZombie) && !(entity instanceof Player)
            );
      }
   }

   boolean canHit(Entity target) {
      if (MiscUtils.canHarmBasedOnTeamAndTag(
         TagInit.EntityTypes.MUTANT_FROZEN_ZOMBIE_THROWN_ICICLE_CANT_HIT, this, target, this.getOwner(), entity -> entity instanceof MutantFrozenZombie
      )) {
         return true;
      } else {
         return MiscUtils.canHarmBasedOnTeamAndTag(
               TagInit.EntityTypes.PLAYER_THROWN_ICICLE_CANT_HIT, this, target, this.getOwner(), entity -> entity instanceof Player
            )
            ? true
            : MiscUtils.canHarmBasedOnTeamAndTag(
               null, this, target, this.getOwner(), entity -> !(entity instanceof MutantFrozenZombie) && !(entity instanceof Player)
            );
      }
   }

   protected boolean canHitEntity(Entity target) {
      return this.canHit(target) && super.canHitEntity(target);
   }

   protected void defineSynchedData(SynchedEntityData.Builder builder) {
   }

   protected void addAdditionalSaveData(ValueOutput tag) {
      super.addAdditionalSaveData(tag);
      tag.putFloat("Damage", this.damage);
      tag.putInt("FreezingLevel", this.freezingLevel);
      tag.putInt("FreezingLength", this.freezingLength);
      tag.putInt("DisableShieldTime", this.disableShieldLength);
      tag.putBoolean("IgnoresInvulTime", this.ignoresInvulTime);
   }

   protected void readAdditionalSaveData(ValueInput tag) {
      super.readAdditionalSaveData(tag);
      if (tag.contains("Damage")) {
         this.damage = tag.getFloatOr("Damage", 0);
      }

      if (tag.contains("FreezingLevel")) {
         this.freezingLevel = tag.getIntOr("FreezingLevel", 0);
      }

      if (tag.contains("FreezingLength")) {
         this.freezingLength = tag.getIntOr("FreezingLength", 0);
      }

      if (tag.contains("DisableShieldTime")) {
         this.disableShieldLength = tag.getIntOr("DisableShieldTime", 0);
      }

      if (tag.contains("IgnoresInvulTime")) {
         this.ignoresInvulTime = tag.getBooleanOr("IgnoresInvulTime", false);
      }
   }

}
