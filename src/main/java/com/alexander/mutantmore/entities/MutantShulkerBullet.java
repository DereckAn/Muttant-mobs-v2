package com.alexander.mutantmore.entities;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.mutant_shulker.MutantShulkerRewardsCommonConfig;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.google.common.base.MoreObjects;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion.BlockInteraction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;

public class MutantShulkerBullet extends Projectile {
   private static final EntityDataAccessor<Integer> HITS_LEFT = SynchedEntityData.defineId(MutantShulkerBullet.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Integer> TARGETED_ENTITY_ID = SynchedEntityData.defineId(MutantShulkerBullet.class, EntityDataSerializers.INT);
   public int immuneTicks = 0;
   public float damage = 0.0F;
   public boolean griefing = true;
   public boolean griefingDropsBlocks = false;
   public float explosionSize = 1.0F;
   public int levitationLength = 0;
   public int levitationLevel = 0;
   public boolean ignoresInvulTime = true;
   public Vec3 targetMovement = null;
   public int moveDelay = 0;

   public MutantShulkerBullet(EntityType<? extends MutantShulkerBullet> type, Level level) {
      super(type, level);
      this.noPhysics = true;
      this.setRemainingHits(3);
   }

   protected boolean canHitEntity(Entity target) {
      return this.getOwner() instanceof MutantShulkerTurret
            && !(target instanceof Enemy)
            && !target.is(TagInit.EntityTypes.MUTANT_SHULKER_TURRET_TARGETS)
            && this.getTeam() == null
            && target.getTeam() == null
            && !MutantShulkerRewardsCommonConfig.turret_friendly_fire.get()
            && !MutantMoreGroupedOptionsCommonConfig.friendly_fire_on.get()
         ? false
         : this.canHit(target) && super.canHitEntity(target);
   }

   public void tick() {
      super.tick();
      if (this.level().isClientSide() && !this.loopSoundStarted) {
         this.loopSoundStarted = true;
         MiscUtils.loopingSoundHook.accept(this, SoundEventInit.MUTANT_SHULKER_PROJECTILE_LOOP);
      }

      if (this.level().isClientSide()) {
         ShakeCameraEvent.shake(this.level(), 3, 0.0075F, this.blockPosition(), 5);
      }

      if (this.immuneTicks > 0) {
         this.immuneTicks--;
      }

      if (!this.level().isClientSide()) {
         HitResult hitresult = ProjectileUtil.getHitResultOnMoveVector(this, this::canHitEntity);
         if (hitresult.getType() != Type.MISS) {
            this.onHit(hitresult);
         }
      }

      this.applyEffectsFromBlocks();
      if (this.getOwner() != null && this.tickCount > 20 && this.immuneTicks <= 0 && this.distanceTo(this.getOwner()) <= this.getOwner().getBbWidth() * 2.0F) {
         double x = this.getOwner().getX() - this.getX();
         double z = this.getOwner().getZ() - this.getZ();
         double distance = this.distanceTo(this.getOwner());
         this.setDeltaMovement(this.getDeltaMovement().add(new Vec3(x / distance, 0.0, z / distance).scale(-0.3)));
      }

      if (this.getTarget() != null) {
         if (this.moveDelay > 0 && this.distanceTo(this.getTarget()) >= 7.5) {
            this.moveDelay--;
         }

         if (!this.level().getBlockState(this.blockPosition().below()).isAir()
            && !this.level().getBlockState(this.blockPosition().below()).getCollisionShape(this.level(), this.blockPosition().below()).isEmpty()) {
            this.setDeltaMovement(this.getDeltaMovement().add(0.0, 0.1, 0.0));
         }

         this.xOld = this.getX();
         this.yOld = this.getY();
         this.zOld = this.getZ();
         if (this.moveDelay <= 0) {
            this.moveDelay = 20;
            double x = this.getTarget().getX() - this.getX();
            double y = this.getTarget().getY(0.5) - this.getY();
            double z = this.getTarget().getZ() - this.getZ();
            double speedMultiplier = 1.25;
            double distance = this.distanceTo(this.getTarget());
            this.targetMovement = new Vec3(x / distance * speedMultiplier, y / distance * speedMultiplier, z / distance * speedMultiplier);
         }

         double lerpSpeed = 0.1F;
         if (this.targetMovement != null) {
            this.setDeltaMovement(
               Mth.lerp(lerpSpeed, this.getDeltaMovement().x, this.targetMovement.x),
               Mth.lerp(lerpSpeed, this.getDeltaMovement().y, this.targetMovement.y),
               Mth.lerp(lerpSpeed, this.getDeltaMovement().z, this.targetMovement.z)
            );
         }

         this.move(MoverType.SELF, this.getDeltaMovement());
      } else if (!this.isNoGravity()) {
         this.setDeltaMovement(this.getDeltaMovement().add(0.0, -0.05, 0.0));
         this.move(MoverType.SELF, this.getDeltaMovement());
      }

      if (this.level().isClientSide() && this.immuneTicks <= 0) {
         Vec3 vec31 = this.getDeltaMovement();
         this.level()
            .addParticle(
               ParticleTypeInit.MUTANT_SHULKER_BULLET,
               this.getX() - vec31.x,
               this.getY() - vec31.y + 0.425,
               this.getZ() - vec31.z,
               0.0,
               0.0,
               0.0
            );
      }
   }

   private boolean loopSoundStarted;

   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      builder.define(HITS_LEFT, 0);
      builder.define(TARGETED_ENTITY_ID, 0);
   }

   public int getRemainingHits() {
      return (Integer)this.entityData.get(HITS_LEFT);
   }

   public void setRemainingHits(int attached) {
      this.entityData.set(HITS_LEFT, attached);
   }

   public Entity getTarget() {
      Entity target = this.level().getEntity(this.getTargetID());
      return this.entityData.get(TARGETED_ENTITY_ID) == 0 || target == null || !target.isAlive() || target instanceof Player && target.isSpectator()
         ? null
         : target;
   }

   public int getTargetID() {
      return (Integer)this.entityData.get(TARGETED_ENTITY_ID);
   }

   public void setTargetByID(int attached) {
      this.entityData.set(TARGETED_ENTITY_ID, attached);
   }

   protected void addAdditionalSaveData(ValueOutput tag) {
      super.addAdditionalSaveData(tag);
      tag.putInt("RemainingHits", this.getRemainingHits());
      tag.putInt("TargetID", this.getTargetID());
      tag.putFloat("Damage", this.damage);
      tag.putBoolean("Griefing", this.griefing);
      tag.putBoolean("GriefingDropsBlocks", this.griefingDropsBlocks);
      tag.putFloat("ExplosionSize", this.explosionSize);
      tag.putInt("LevitationLength", this.levitationLength);
      tag.putInt("LevitationLevel", this.levitationLevel);
      tag.putBoolean("IgnoresInvulTime", this.ignoresInvulTime);
   }

   protected void readAdditionalSaveData(ValueInput tag) {
      super.readAdditionalSaveData(tag);
      if (tag.contains("RemainingHits")) {
         this.setRemainingHits(tag.getIntOr("RemainingHits", 0));
      }

      if (tag.contains("TargetID")) {
         this.setTargetByID(tag.getIntOr("TargetID", 0));
      }

      if (tag.contains("Damage")) {
         this.damage = tag.getFloatOr("Damage", 0);
      }

      if (tag.contains("Griefing")) {
         this.griefing = tag.getBooleanOr("Griefing", false);
      }

      if (tag.contains("GriefingDropsBlocks")) {
         this.griefingDropsBlocks = tag.getBooleanOr("GriefingDropsBlocks", false);
      }

      if (tag.contains("ExplosionSize")) {
         this.explosionSize = tag.getFloatOr("ExplosionSize", 0);
      }

      if (tag.contains("LevitationLength")) {
         this.levitationLength = tag.getIntOr("LevitationLength", 0);
      }

      if (tag.contains("LevitationLevel")) {
         this.levitationLevel = tag.getIntOr("LevitationLevel", 0);
      }

      if (tag.contains("IgnoresInvulTime")) {
         this.ignoresInvulTime = tag.getBooleanOr("IgnoresInvulTime", false);
      }
   }

   public boolean shouldBlockExplode(Explosion p_19987_, BlockGetter p_19988_, BlockPos p_19989_, BlockState p_19990_, float p_19991_) {
      return p_19990_.getBlock().getExplosionResistance() <= 9.0F && !p_19990_.is(TagInit.Blocks.UNBREAKABLE);
   }

   protected void onHitEntity(EntityHitResult p_37345_) {
      super.onHitEntity(p_37345_);
      Entity damagingMob = (Entity)(this.getOwner() != null ? this.getOwner() : this);
      Entity entity = p_37345_.getEntity();
      if (!(entity instanceof MutantShulkerBullet) && !(entity instanceof MutantShulker)) {
         Entity entity1 = this.getOwner();
         LivingEntity livingentity = entity1 instanceof LivingEntity ? (LivingEntity)entity1 : null;
         if (this.canHarm(entity)) {
            if (this.ignoresInvulTime) {
               entity.setInvulnerableTime(0);
            }

            boolean flag = MiscUtils.hurt(entity, MMDamageTypes.mutantShulkerBulletAttack(this.damageSources(), this, livingentity), this.damage);
            MiscUtils.customExplosion(
               this.level(),
               damagingMob,
               this.damageSources().explosion(this, this.getOwner() != null && this.getOwner() instanceof LivingEntity ? this.getOwner() : null),
               null,
               this.getX(),
               this.getY(),
               this.getZ(),
               Mth.clamp(this.explosionSize, 1.0F, Float.MAX_VALUE),
               false,
               this.explosionBlockInteraction(),
               SoundEventInit.MUTANT_SHULKER_PROJECTILE_IMPACT,
               this.getSoundSource(),
               ParticleTypeInit.MUTANT_SHULKER_BULLET,
               ParticleTypeInit.MUTANT_SHULKER_BULLET,
               this.damage,
               true,
               false
            );
            if (flag) {
               EnchantmentHelper.doPostAttackEffects((ServerLevel)this.level(), entity, MMDamageTypes.mutantShulkerBulletAttack(this.damageSources(), this, livingentity));
               if (entity instanceof LivingEntity) {
                  ((LivingEntity)entity)
                     .addEffect(
                        new MobEffectInstance(MobEffects.LEVITATION, this.levitationLength, this.levitationLevel),
                        (Entity)MoreObjects.firstNonNull(entity1, this)
                     );
               }
            }
         }
      } else if (entity instanceof MutantShulkerBullet) {
         entity.setDeltaMovement(entity.getDeltaMovement().add(this.getDeltaMovement().scale(0.75)));
      }
   }

   boolean canHarm(Entity target) {
      if (MiscUtils.canHarmBasedOnTeamAndTag(
         TagInit.EntityTypes.MUTANT_SHULKER_MUTANT_SHULKER_BULLET_CANT_HURT, this, target, this.getOwner(), entity -> entity instanceof MutantShulker
      )) {
         return true;
      } else if (MiscUtils.canHarmBasedOnTeamAndTag(
         TagInit.EntityTypes.PLAYER_MUTANT_SHULKER_BULLET_CANT_HURT, this, target, this.getOwner(), entity -> entity instanceof Player
      )) {
         return true;
      } else {
         return MiscUtils.canHarmBasedOnTeamAndTag(
               TagInit.EntityTypes.MUTANT_SHULKER_TURRET_MUTANT_SHULKER_BULLET_CANT_HURT,
               this,
               target,
               this.getOwner(),
               entity -> entity instanceof MutantShulkerTurret
            )
            ? true
            : MiscUtils.canHarmBasedOnTeamAndTag(
               null,
               this,
               target,
               this.getOwner(),
               entity -> !(entity instanceof MutantShulker) && !(entity instanceof Player) && !(entity instanceof MutantShulkerTurret)
            );
      }
   }

   boolean canHit(Entity target) {
      if (MiscUtils.canHarmBasedOnTeamAndTag(
         TagInit.EntityTypes.MUTANT_SHULKER_MUTANT_SHULKER_BULLET_CANT_HIT, this, target, this.getOwner(), entity -> entity instanceof MutantShulker
      )) {
         return true;
      } else if (MiscUtils.canHarmBasedOnTeamAndTag(
         TagInit.EntityTypes.PLAYER_MUTANT_SHULKER_BULLET_CANT_HIT, this, target, this.getOwner(), entity -> entity instanceof Player
      )) {
         return true;
      } else {
         return MiscUtils.canHarmBasedOnTeamAndTag(
               TagInit.EntityTypes.MUTANT_SHULKER_TURRET_MUTANT_SHULKER_BULLET_CANT_HIT,
               this,
               target,
               this.getOwner(),
               entity -> entity instanceof MutantShulkerTurret
            )
            ? true
            : MiscUtils.canHarmBasedOnTeamAndTag(
               null,
               this,
               target,
               this.getOwner(),
               entity -> !(entity instanceof MutantShulker) && !(entity instanceof Player) && !(entity instanceof MutantShulkerTurret)
            );
      }
   }

   protected void onHitBlock(BlockHitResult p_37343_) {
      super.onHitBlock(p_37343_);
      Entity damagingMob = (Entity)(this.getOwner() != null ? this.getOwner() : this);
      if (!this.level().isClientSide() && !this.level().getBlockState(p_37343_.getBlockPos()).is(TagInit.Blocks.MUTANT_SHULKER_BULLET_FLIES_THROUGH)) {
         MiscUtils.customExplosion(
            this.level(),
            damagingMob,
            this.damageSources().explosion(this, this.getOwner() != null && this.getOwner() instanceof LivingEntity ? this.getOwner() : null),
            null,
            this.getX(),
            this.getY(),
            this.getZ(),
            Mth.clamp(this.explosionSize, 1.0F, Float.MAX_VALUE),
            false,
            this.explosionBlockInteraction(),
            SoundEventInit.MUTANT_SHULKER_PROJECTILE_IMPACT,
            this.getSoundSource(),
            ParticleTypeInit.MUTANT_SHULKER_BULLET,
            ParticleTypeInit.MUTANT_SHULKER_BULLET,
            this.damage,
            true,
            false
         );
      }
   }

   protected void onHit(HitResult p_37347_) {
      super.onHit(p_37347_);
      Entity damagingMob = (Entity)(this.getOwner() != null ? this.getOwner() : this);
      if (!this.level().isClientSide()) {
         if (p_37347_.getType() == Type.ENTITY && ((EntityHitResult)p_37347_).getEntity() instanceof MutantShulker) {
            ((MutantShulker)((EntityHitResult)p_37347_).getEntity()).stunnedTicks = ((MutantShulker)((EntityHitResult)p_37347_).getEntity()).stunLength;
            this.level().broadcastEntityEvent((MutantShulker)((EntityHitResult)p_37347_).getEntity(), (byte)9);
            MiscUtils.customExplosion(
               this.level(),
               damagingMob,
               this.damageSources().explosion(this, this.getOwner() != null && this.getOwner() instanceof LivingEntity ? this.getOwner() : null),
               null,
               this.getX(),
               this.getY(),
               this.getZ(),
               Mth.clamp(this.explosionSize, 1.0F, Float.MAX_VALUE),
               false,
               this.explosionBlockInteraction(),
               SoundEventInit.MUTANT_SHULKER_PROJECTILE_IMPACT,
               this.getSoundSource(),
               ParticleTypeInit.MUTANT_SHULKER_BULLET,
               ParticleTypeInit.MUTANT_SHULKER_BULLET,
               this.damage,
               true,
               false
            );
            this.discard();
         }

         if ((p_37347_.getType() != Type.ENTITY || !(((EntityHitResult)p_37347_).getEntity() instanceof MutantShulkerBullet))
            && (
               p_37347_.getType() != Type.BLOCK
                  || !this.level().getBlockState(((BlockHitResult)p_37347_).getBlockPos()).is(TagInit.Blocks.MUTANT_SHULKER_BULLET_FLIES_THROUGH)
            )) {
            this.discard();
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

   public boolean isPickable() {
      return true;
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource p_37338_, float p_37339_) {
      if (this.immuneTicks <= 0) {
         if (p_37338_.getDirectEntity() != null) {
            this.shootFromRotation(p_37338_.getDirectEntity(), p_37338_.getDirectEntity().getXRot(), p_37338_.getDirectEntity().getYRot(), 0.0F, 0.5F, 1.0F);
            this.targetMovement = null;
            this.moveDelay = 60;
         }

         this.setRemainingHits(this.getRemainingHits() - 1);
         this.immuneTicks = 60;
         if (!this.level().isClientSide()) {
            this.playSound(SoundEvents.SHULKER_BULLET_HURT, 1.0F, 1.0F);
            if (this.getRemainingHits() <= 0) {
               for (int i = 0; i < 3; i++) {
                  if (this.random.nextBoolean()) {
                     ((ServerLevel)this.level())
                        .sendParticles(ParticleTypes.END_ROD, this.getRandomX(1.25), this.getRandomY(), this.getRandomZ(1.25), 15, 0.2, 0.2, 0.2, 0.0);
                  } else {
                     ((ServerLevel)this.level())
                        .sendParticles(ParticleTypes.CRIT, this.getRandomX(1.25), this.getRandomY(), this.getRandomZ(1.25), 15, 0.2, 0.2, 0.2, 0.0);
                  }
               }

               this.discard();
            } else {
               for (int i = 0; i < 3; i++) {
                  ((ServerLevel)this.level())
                     .sendParticles(ParticleTypes.CRIT, this.getRandomX(1.25), this.getRandomY(), this.getRandomZ(1.25), 15, 0.2, 0.2, 0.2, 0.0);
               }
            }
         }
      }

      return true;
   }

   public float getPickRadius() {
      return 2.0F;
   }

   public boolean isIgnoringBlockTriggers() {
      return true;
   }

   public boolean canTarget(LivingEntity target) {
      return true;
   }

}
