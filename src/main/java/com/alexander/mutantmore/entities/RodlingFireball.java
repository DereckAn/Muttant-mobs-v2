package com.alexander.mutantmore.entities;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.phys.Vec3;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.mutant_blaze.RodlingCommonConfig;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.projectile.hurtingprojectile.Fireball;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class RodlingFireball extends Fireball {
   public float damage = 0.0F;
   public boolean griefing = true;
   public int fireLength = 0;
   public boolean ignoresInvulTime = true;

   public RodlingFireball(EntityType<? extends RodlingFireball> p_37364_, Level p_37365_) {
      super(p_37364_, p_37365_);
   }

   public RodlingFireball(Level p_37375_, LivingEntity p_37376_, double p_37377_, double p_37378_, double p_37379_) {
      super(EntityTypeInit.RODLING_FIREBALL, p_37376_, new Vec3(p_37377_, p_37378_, p_37379_), p_37375_);
   }

   public RodlingFireball(Level p_37367_, double p_37368_, double p_37369_, double p_37370_, double p_37371_, double p_37372_, double p_37373_) {
      super(EntityTypeInit.RODLING_FIREBALL, p_37368_, p_37369_, p_37370_, new Vec3(p_37371_, p_37372_, p_37373_), p_37367_);
   }

   protected void addAdditionalSaveData(ValueOutput tag) {
      super.addAdditionalSaveData(tag);
      tag.putFloat("Damage", this.damage);
      tag.putBoolean("Griefing", this.griefing);
      tag.putInt("FireLength", this.fireLength);
      tag.putBoolean("IgnoresInvulTime", this.ignoresInvulTime);
   }

   protected void readAdditionalSaveData(ValueInput tag) {
      super.readAdditionalSaveData(tag);
      if (tag.contains("Damage")) {
         this.damage = tag.getFloatOr("Damage", 0);
      }

      if (tag.contains("Griefing")) {
         this.griefing = tag.getBooleanOr("Griefing", false);
      }

      if (tag.contains("FireLength")) {
         this.fireLength = tag.getIntOr("FireLength", 0);
      }

      if (tag.contains("IgnoresInvulTime")) {
         this.ignoresInvulTime = tag.getBooleanOr("IgnoresInvulTime", false);
      }
   }

   protected boolean canHitEntity(Entity target) {
      if (this.allyOfMyOwner(target)) {
         return !RodlingCommonConfig.tamed_friendly_fire.get() && !MutantMoreGroupedOptionsCommonConfig.friendly_fire_on.get() ? false : super.canHitEntity(target);
      } else {
         return this.canHit(target) && super.canHitEntity(target);
      }
   }

   protected void onHitEntity(EntityHitResult p_37386_) {
      super.onHitEntity(p_37386_);
      if (!this.level().isClientSide()) {
         Entity entity = p_37386_.getEntity();
         Entity entity1 = this.getOwner();
         if (this.canHarm(entity)) {
            int i = entity.getRemainingFireTicks();
            entity.igniteForSeconds(this.fireLength);
            if (this.ignoresInvulTime) {
               entity.setInvulnerableTime(0);
            }

            if (!MiscUtils.hurt(entity, MMDamageTypes.fireResBypassingFireball(this.damageSources(), this, entity1), this.damage)) {
               entity.setRemainingFireTicks(i);
            } else if (entity1 instanceof LivingEntity) {
               EnchantmentHelper.doPostAttackEffects((ServerLevel)this.level(), entity, this.damageSources().fireball(this, entity1));
            }
         }
      }
   }

   boolean canHarm(Entity target) {
      if (MiscUtils.canHarmBasedOnTeamAndTag(
         TagInit.EntityTypes.HOSTILE_RODLING_FIREBALL_CANT_HURT,
         this,
         target,
         this.getOwner(),
         entity -> entity instanceof Rodling && !((Rodling)entity).isTame()
      )) {
         return true;
      } else {
         return MiscUtils.canHarmBasedOnTeamAndTag(
               TagInit.EntityTypes.TAMED_RODLING_FIREBALL_CANT_HURT,
               this,
               target,
               this.getOwner(),
               entity -> entity instanceof Rodling && ((Rodling)entity).isTame()
            )
            ? true
            : MiscUtils.canHarmBasedOnTeamAndTag(null, this, target, this.getOwner(), entity -> !(entity instanceof Rodling));
      }
   }

   boolean canHit(Entity target) {
      if (MiscUtils.canHarmBasedOnTeamAndTag(
         TagInit.EntityTypes.HOSTILE_RODLING_FIREBALL_CANT_HIT,
         this,
         target,
         this.getOwner(),
         entity -> entity instanceof Rodling && !((Rodling)entity).isTame()
      )) {
         return true;
      } else {
         return MiscUtils.canHarmBasedOnTeamAndTag(
               TagInit.EntityTypes.TAMED_RODLING_FIREBALL_CANT_HIT,
               this,
               target,
               this.getOwner(),
               entity -> entity instanceof Rodling && ((Rodling)entity).isTame()
            )
            ? true
            : MiscUtils.canHarmBasedOnTeamAndTag(null, this, target, this.getOwner(), entity -> !(entity instanceof Rodling));
      }
   }

   boolean allyOfMyOwner(Entity entity) {
      return this.getOwner() instanceof TamableAnimal tamable
         && tamable.getOwner() != null
         && entity instanceof LivingEntity targetEntity
         && (tamable.isOwnedBy(targetEntity) || targetEntity instanceof TamableAnimal tamableTarget && tamableTarget.isOwnedBy(tamable.getOwner()));
   }

   protected void onHitBlock(BlockHitResult p_37384_) {
      super.onHitBlock(p_37384_);
      if (!this.level().isClientSide()) {
         BlockPos blockpos = p_37384_.getBlockPos().relative(p_37384_.getDirection());
         if (this.level().isEmptyBlock(blockpos) && this.griefing) {
            this.level().setBlockAndUpdate(blockpos, BaseFireBlock.getState(this.level(), blockpos));
         }
      }
   }

   protected void onHit(HitResult p_37388_) {
      super.onHit(p_37388_);
      if (!this.level().isClientSide()) {
         this.discard();
      }
   }

   public boolean isPickable() {
      return false;
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource p_37381_, float p_37382_) {
      return false;
   }

}
