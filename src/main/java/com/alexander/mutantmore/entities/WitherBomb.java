package com.alexander.mutantmore.entities;

import com.alexander.mutantmore.config.mutant_wither_skeleton.MutantWitherSkeletonRewardsCommonConfig;
import com.alexander.mutantmore.init.EffectInit;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.ItemInit;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

/** Thrown or placed bone bomb: lands, unfolds, and when something gets close (or it was thrown) opens and pours withering smoke. */
public class WitherBomb extends ThrowableProjectile {
   private static final EntityDataAccessor<Boolean> DEPLOYED = SynchedEntityData.defineId(WitherBomb.class, EntityDataSerializers.BOOLEAN);
   private static final EntityDataAccessor<Boolean> THROWN = SynchedEntityData.defineId(WitherBomb.class, EntityDataSerializers.BOOLEAN);
   public final AnimationState deployAnimation = new AnimationState();
   public final AnimationState activateAnimation = new AnimationState();
   public int deployAnimationTick;
   public int deployAnimationLength = 12;
   public int activateAnimationTick;
   public int activateAnimationLength = 67;

   public WitherBomb(EntityType<? extends WitherBomb> type, Level level) {
      super(type, level);
      this.blocksBuilding = true;
   }

   public WitherBomb(Level level, LivingEntity owner) {
      this(level, owner.getX(), owner.getEyeY() - 0.1F, owner.getZ());
      this.setOwner(owner);
   }

   public WitherBomb(Level level, double x, double y, double z) {
      this(EntityTypeInit.WITHER_BOMB, level);
      this.setPos(x, y, z);
   }

   @Override
   public InteractionResult interact(Player player, InteractionHand hand, Vec3 location) {
      // Its owner can pick it back up by crouch-clicking with an empty hand
      if (this.level() instanceof ServerLevel level && this.ownedBy(player) && player.getItemInHand(hand).isEmpty() && player.isCrouching()) {
         this.spawnAtLocation(level, new ItemStack(ItemInit.WITHER_BOMB));
         this.discard();
         return InteractionResult.SUCCESS;
      }

      return super.interact(player, hand, location);
   }

   @Override
   public boolean isPickable() {
      return true;
   }

   private boolean canTrigger(LivingEntity entity) {
      return EntitySelector.NO_CREATIVE_OR_SPECTATOR.test(entity)
         && !entity.isInvulnerable()
         && !entity.isDeadOrDying()
         && this.level().getWorldBorder().isWithinBounds(entity.getBoundingBox())
         && !this.ownedBy(entity)
         && this.hasLineOfSight(entity)
         && !entity.is(TagInit.EntityTypes.WITHER_BOMB_ISNT_TRIGGERED_BY);
   }

   @Override
   public void tick() {
      super.tick();
      this.tickDownAnimTimers();
      this.updateAnimations();
      if (this.level() instanceof ServerLevel level) {
         double detection = MutantWitherSkeletonRewardsCommonConfig.bomb_detection_range.get();
         boolean targetNearby = !level.getEntitiesOfClass(
               LivingEntity.class, this.getBoundingBox().inflate(detection), e -> e.distanceTo(this) <= detection && this.canTrigger(e)
            )
            .isEmpty();
         if (this.isDeployed() && (targetNearby || this.isThrown()) && this.activateAnimationTick <= 0) {
            this.activateAnimationTick = this.activateAnimationLength;
            level.broadcastEntityEvent(this, (byte)1);
            this.playSound(SoundEventInit.WITHER_BOMB_OPEN, 1.5F, 1.0F);
         }

         if (this.activateAnimationTick > 1 && this.activateAnimationTick <= this.activateAnimationLength - 12) {
            level.sendParticles(ParticleTypeInit.WITHER_BOMB, this.getX(), this.getY() + 0.25, this.getZ(), 8, 0.0, 0.0, 0.0, 0.0);
            if (this.activateAnimationTick <= this.activateAnimationLength - 30) {
               for (LivingEntity target : level.getEntitiesOfClass(
                  LivingEntity.class, this.getBoundingBox().inflate(MutantWitherSkeletonRewardsCommonConfig.bomb_damage_range.get()), LivingEntity::isAlive
               )) {
                  if (target.is(TagInit.EntityTypes.WITHER_BOMB_CANT_HURT) || target instanceof Player player && (player.isCreative() || player.isSpectator())) {
                     continue;
                  }

                  if (target.tickCount % MutantWitherSkeletonRewardsCommonConfig.bomb_damage_interval.get() == 0) {
                     target.setInvulnerableTime(0);
                     target.hurtServer(level, this.damageSources().wither(), MutantWitherSkeletonRewardsCommonConfig.bomb_damage.get().floatValue());
                  }

                  int slowness = MutantWitherSkeletonRewardsCommonConfig.bomb_slowness_length.get();
                  target.addEffect(
                     new MobEffectInstance(MobEffects.WITHER, MutantWitherSkeletonRewardsCommonConfig.bomb_wither_length.get(), MutantWitherSkeletonRewardsCommonConfig.bomb_wither_level.get())
                  );
                  target.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, slowness, MutantWitherSkeletonRewardsCommonConfig.bomb_slowness_level.get()));
                  target.addEffect(new MobEffectInstance(EffectInit.JUMPING_FATIGUE, slowness, 0));
                  target.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, MutantWitherSkeletonRewardsCommonConfig.bomb_blindness_length.get()));
               }
            }
         } else if (this.activateAnimationTick == 1) {
            this.discard();
         }
      }

      Vec3 movement = this.getDeltaMovement();
      this.move(MoverType.SELF, movement);
      this.setDeltaMovement(movement);
      HitResult hit = ProjectileUtil.getHitResultOnMoveVector(this, this::canHitEntity);
      if (!this.noPhysics) {
         this.onHit(hit);
         this.needsSync = true;
      }

      if (!this.level().isClientSide()) {
         if (this.deployAnimationTick == this.deployAnimationLength - 1) {
            this.setDeployed(true);
         }

         if (!this.isDeployed() && this.onGround() && this.deployAnimationTick <= 0) {
            this.deployAnimationTick = this.deployAnimationLength;
            this.level().broadcastEntityEvent(this, (byte)0);
            this.playSound(SoundEventInit.WITHER_BOMB_DEPLOY);
         }
      }
   }

   private boolean hasLineOfSight(Entity entity) {
      Vec3 from = new Vec3(this.getX(), this.getEyeY(), this.getZ());
      Vec3 to = new Vec3(entity.getX(), entity.getEyeY(), entity.getZ());
      return entity.level() == this.level()
         && to.distanceTo(from) <= 128.0
         && this.level().clip(new ClipContext(from, to, ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, this)).getType() == HitResult.Type.MISS;
   }

   @Override
   protected void updateRotation() {
   }

   @Override
   protected Entity.MovementEmission getMovementEmission() {
      return Entity.MovementEmission.NONE;
   }

   @Override
   protected void onHitBlock(BlockHitResult result) {
      this.setDeltaMovement(0.0, 0.0, 0.0);
      super.onHitBlock(result);
   }

   private void tickDownAnimTimers() {
      if (this.deployAnimationTick > 0) {
         this.deployAnimationTick--;
      }

      if (this.activateAnimationTick > 0) {
         this.activateAnimationTick--;
      }
   }

   private void updateAnimations() {
      this.deployAnimation.animateWhen(this.deployAnimationTick > 0 && this.activateAnimationTick < 1, this.tickCount);
      this.activateAnimation.animateWhen(this.activateAnimationTick > 0 && this.deployAnimationTick < 1, this.tickCount);
   }

   @Override
   public void handleEntityEvent(byte id) {
      if (id == 0) {
         this.deployAnimationTick = this.deployAnimationLength;
      } else if (id == 1) {
         this.activateAnimationTick = this.activateAnimationLength;
      } else {
         super.handleEntityEvent(id);
      }
   }

   @Override
   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      builder.define(DEPLOYED, false);
      builder.define(THROWN, false);
   }

   public boolean isDeployed() {
      return this.entityData.get(DEPLOYED);
   }

   public void setDeployed(boolean value) {
      this.entityData.set(DEPLOYED, value);
   }

   public boolean isThrown() {
      return this.entityData.get(THROWN);
   }

   public void setThrown(boolean value) {
      this.entityData.set(THROWN, value);
   }
}
