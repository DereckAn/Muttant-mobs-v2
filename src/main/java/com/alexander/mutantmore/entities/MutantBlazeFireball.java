package com.alexander.mutantmore.entities;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.config.mutant_blaze.MutantBlazeCommonConfig;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.hurtingprojectile.Fireball;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion.BlockInteraction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class MutantBlazeFireball extends Fireball {
   public boolean spawnedByDyingMutantBlaze;
   public float damage = 0.0F;
   public float explosionDamage = 0.0F;
   public float explosionRadius = 1.0F;
   public int fireLength = 0;
   public boolean ignoresInvulTime = true;
   public boolean griefing = true;
   public boolean griefingDropsBlocks = false;
   public boolean explosionFire = true;

   public MutantBlazeFireball(EntityType<? extends MutantBlazeFireball> p_37199_, Level p_37200_) {
      super(p_37199_, p_37200_);
   }

   public MutantBlazeFireball(Level p_181151_, LivingEntity p_181152_, double p_181153_, double p_181154_, double p_181155_) {
      super(EntityTypeInit.MUTANT_BLAZE_FIREBALL, p_181152_, new Vec3(p_181153_, p_181154_, p_181155_), p_181151_);
   }

   // The original had read and write swapped (nothing was saved); fixed
   protected void addAdditionalSaveData(ValueOutput tag) {
      super.addAdditionalSaveData(tag);
      tag.putFloat("Damage", this.damage);
      tag.putFloat("ExplosionDamage", this.explosionDamage);
      tag.putFloat("ExplosionRadius", this.explosionRadius);
      tag.putInt("FireLength", this.fireLength);
      tag.putBoolean("IgnoresInvulTime", this.ignoresInvulTime);
      tag.putBoolean("Griefing", this.griefing);
      tag.putBoolean("GriefingDropsBlocks", this.griefingDropsBlocks);
      tag.putBoolean("ExplosionFire", this.explosionFire);
   }

   protected void readAdditionalSaveData(ValueInput tag) {
      super.readAdditionalSaveData(tag);
      this.damage = tag.getFloatOr("Damage", 0);
      this.explosionDamage = tag.getFloatOr("ExplosionDamage", 0);
      this.explosionRadius = tag.getFloatOr("ExplosionRadius", 0);
      this.fireLength = tag.getIntOr("FireLength", 0);
      this.ignoresInvulTime = tag.getBooleanOr("IgnoresInvulTime", true);
      this.griefing = tag.getBooleanOr("Griefing", true);
      this.griefingDropsBlocks = tag.getBooleanOr("GriefingDropsBlocks", false);
      this.explosionFire = tag.getBooleanOr("ExplosionFire", true);
   }

   // 26.x moves a projectile onto whatever it "hits" before onHit runs, so hits onHit ignores must be filtered here
   // (the death burst ignored its own rods/fireballs, which left them frozen mid-air, shaking the screen forever)
   protected boolean canHitEntity(Entity target) {
      if (this.spawnedByDyingMutantBlaze && (target instanceof MutantBlazeRodProjectile || target instanceof MutantBlazeFireball)) {
         return false;
      }

      return this.canHit(target) && super.canHitEntity(target);
   }

   public void baseTick() {
      super.baseTick();
      if (this.level().isClientSide()) {
         ShakeCameraEvent.shake(this.level(), 4, 0.0075F, this.blockPosition(), 7);
      }

      for (int i = 0; i < 2; i++) {
         double d0 = this.random.nextGaussian() * 0.02;
         double d1 = this.random.nextGaussian() * 0.02;
         double d2 = this.random.nextGaussian() * 0.02;
         this.level().addAlwaysVisibleParticle(ParticleTypeInit.FIRE_TRAIL, this.getRandomX(1.0), this.getRandomY(), this.getRandomZ(1.0), d0, d1, d2);
      }
   }

   private boolean loopSoundStarted;

   @Override
   public void tick() {
      super.tick();
      if (this.level().isClientSide() && !this.loopSoundStarted) {
         this.loopSoundStarted = true;
         MiscUtils.loopingSoundHook.accept(this, SoundEventInit.MUTANT_WITHER_SKELETON_FIRE_SLASH_LOOP);
      }
   }

   protected void onHit(HitResult p_37218_) {
      if (!this.level().isClientSide()
         && (!(p_37218_ instanceof EntityHitResult) || !(false) || this.tickCount > 10)
         && (
            !this.spawnedByDyingMutantBlaze
               || !(p_37218_ instanceof EntityHitResult)
               || !(((EntityHitResult)p_37218_).getEntity() instanceof MutantBlazeRodProjectile)
                  && !(((EntityHitResult)p_37218_).getEntity() instanceof MutantBlazeFireball)
         )) {
         if (p_37218_ instanceof EntityHitResult && false && this.tickCount > 10) {
            MiscUtils.customExplosion(
               this.level(),
               (Entity)(this.getOwner() != null ? this.getOwner() : this),
               this.damageSources().explosion(this, this.getOwner() != null && this.getOwner() instanceof LivingEntity ? this.getOwner() : null),
               null,
               this.getX(),
               this.getY(),
               this.getZ(),
               1.5F,
               false,
               BlockInteraction.KEEP,
               SoundEvents.GENERIC_EXPLODE.value(),
               this.getSoundSource(),
               ParticleTypes.EXPLOSION,
               ParticleTypeInit.FIRE_TRAIL,
               1.0F,
               true,
               false
            );
            this.discard();
         } else if (p_37218_ instanceof EntityHitResult
            && ((EntityHitResult)p_37218_).getEntity() instanceof MutantBlaze
            && this.tickCount > 10
            && (Boolean)MutantBlazeCommonConfig.stunnable.get()) {
            ((EntityHitResult)p_37218_).getEntity().playSound(SoundEventInit.MUTANT_BLAZE_STUN_START, 2.0F, MiscUtils.randomSoundPitch());
            ((MutantBlaze)((EntityHitResult)p_37218_).getEntity()).stunnedTicks = ((MutantBlaze)((EntityHitResult)p_37218_).getEntity()).stunnedLength;
            this.level().broadcastEntityEvent(((EntityHitResult)p_37218_).getEntity(), (byte)12);
            MiscUtils.customExplosion(
               this.level(),
               (Entity)(this.getOwner() != null ? this.getOwner() : this),
               this.damageSources().explosion(this, this.getOwner() != null && this.getOwner() instanceof LivingEntity ? this.getOwner() : null),
               null,
               this.getX(),
               this.getY(),
               this.getZ(),
               1.5F,
               false,
               BlockInteraction.KEEP,
               SoundEvents.GENERIC_EXPLODE.value(),
               this.getSoundSource(),
               ParticleTypes.EXPLOSION,
               ParticleTypeInit.FIRE_TRAIL,
               1.0F,
               true,
               false
            );
            this.discard();
         } else {
            super.onHit(p_37218_);
            MiscUtils.customExplosion(
               this.level(),
               (Entity)(this.getOwner() != null ? this.getOwner() : this),
               this.damageSources().explosion(this, this.getOwner() != null && this.getOwner() instanceof LivingEntity ? this.getOwner() : null),
               null,
               this.getX(),
               this.getY(),
               this.getZ(),
               Mth.clamp(this.explosionRadius, 1.0F, Float.MAX_VALUE),
               this.explosionFire,
               this.explosionBlockInteraction(),
               SoundEvents.GENERIC_EXPLODE.value(),
               this.getSoundSource(),
               ParticleTypes.EXPLOSION,
               ParticleTypeInit.FIRE_TRAIL,
               this.explosionDamage,
               true,
               false
            );
            this.discard();
         }
      }
   }

   public boolean shouldBlockExplode(Explosion p_19987_, BlockGetter p_19988_, BlockPos p_19989_, BlockState p_19990_, float p_19991_) {
      return p_19990_.getBlock().getExplosionResistance() <= 7.0F && !p_19990_.is(TagInit.Blocks.UNBREAKABLE);
   }

   protected void onHitEntity(EntityHitResult p_37216_) {
      {
         super.onHitEntity(p_37216_);
         if (!this.level().isClientSide()) {
            Entity entity = p_37216_.getEntity();
            Entity entity1 = this.getOwner();
            if (this.canHarm(entity)) {
               if (this.ignoresInvulTime) {
                  entity.setInvulnerableTime(0);
               }

               MiscUtils.hurt(entity, MMDamageTypes.fireResBypassingFireball(this.damageSources(), this, entity1), this.damage);
               entity.igniteForSeconds(this.fireLength);
               EnchantmentHelper.doPostAttackEffects((ServerLevel)this.level(), entity, MMDamageTypes.fireResBypassingFireball(this.damageSources(), this, entity1));
            }
         }
      }
   }

   public BlockInteraction explosionBlockInteraction() {
      if (this.griefing) {
         return this.griefingDropsBlocks ? BlockInteraction.DESTROY_WITH_DECAY : BlockInteraction.DESTROY;
      } else {
         return BlockInteraction.KEEP;
      }
   }

   boolean canHarm(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(
            TagInit.EntityTypes.MUTANT_BLAZE_FIREBALL_CANT_HURT, this, target, this.getOwner(), entity -> entity instanceof MutantBlaze
         )
         ? true
         : MiscUtils.canHarmBasedOnTeamAndTag(null, this, target, this.getOwner(), entity -> !(entity instanceof MutantBlaze));
   }

   boolean canHit(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(
            TagInit.EntityTypes.MUTANT_BLAZE_FIREBALL_CANT_HIT, this, target, this.getOwner(), entity -> entity instanceof MutantBlaze
         )
         ? true
         : MiscUtils.canHarmBasedOnTeamAndTag(null, this, target, this.getOwner(), entity -> !(entity instanceof MutantBlaze));
   }

}
