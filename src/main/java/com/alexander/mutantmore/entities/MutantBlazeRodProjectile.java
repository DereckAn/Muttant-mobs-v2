package com.alexander.mutantmore.entities;

import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.ItemInit;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import net.minecraft.core.BlockPos;
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
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.scores.Scoreboard;

public class MutantBlazeRodProjectile extends ThrowableProjectile {
   private static final EntityDataAccessor<Boolean> BROKEN_BLOCK = SynchedEntityData.defineId(MutantBlazeRodProjectile.class, EntityDataSerializers.BOOLEAN);
   private static final EntityDataAccessor<Boolean> RODLING = SynchedEntityData.defineId(MutantBlazeRodProjectile.class, EntityDataSerializers.BOOLEAN);
   private static final EntityDataAccessor<Boolean> SHIELDS = SynchedEntityData.defineId(MutantBlazeRodProjectile.class, EntityDataSerializers.BOOLEAN);
   private static final EntityDataAccessor<Boolean> ARMOUR = SynchedEntityData.defineId(MutantBlazeRodProjectile.class, EntityDataSerializers.BOOLEAN);
   private static final EntityDataAccessor<Boolean> COLLECTABLE = SynchedEntityData.defineId(MutantBlazeRodProjectile.class, EntityDataSerializers.BOOLEAN);
   public int despawnTimer;
   public boolean summonedRodling = false;
   public boolean landed = false;
   public float damage = 0.0F;
   public int fireLength = 0;
   public boolean ignoresInvulTime = true;
   public int despawnTime = 1200;
   public boolean glows = false;
   public boolean griefing = true;
   public boolean griefingDropsBlocks = false;
   public boolean fireGriefing = false;

   public MutantBlazeRodProjectile(EntityType<? extends MutantBlazeRodProjectile> p_37391_, Level p_37392_) {
      super(p_37391_, p_37392_);
   }

   public MutantBlazeRodProjectile(Level p_37399_, LivingEntity p_37400_) {
      super(EntityTypeInit.MUTANT_BLAZE_ROD_PROJECTILE, p_37400_.getX(), p_37400_.getEyeY() - 0.1F, p_37400_.getZ(), p_37399_);
      this.setOwner(p_37400_);
   }

   public MutantBlazeRodProjectile(Level p_37394_, double p_37395_, double p_37396_, double p_37397_) {
      super(EntityTypeInit.MUTANT_BLAZE_ROD_PROJECTILE, p_37395_, p_37396_, p_37397_, p_37394_);
   }

   public boolean isCurrentlyGlowing() {
      return this.isCollectable() && (this.glows || (Boolean)MutantMoreGroupedOptionsCommonConfig.mutant_parts_glow_on.get());
   }

   public InteractionResult interact(Player p_19978_, InteractionHand p_19979_, Vec3 location) {
      if (this.isCollectable()) {
         if (this.isRodling()) {
            this.becomeRodling(p_19978_);
            return InteractionResult.SUCCESS;
         }

         if (!this.level().isClientSide()) {
            this.spawnAtLocation((ServerLevel)this.level(), Items.BLAZE_POWDER);
            this.discard();
         }

         return InteractionResult.SUCCESS;
      } else {
         return super.interact(p_19978_, p_19979_, location);
      }
   }

   public boolean isPushable() {
      return true;
   }

   public boolean isPickable() {
      return !this.isRemoved();
   }

   public void tick() {
      super.tick();
      if (this.isInLava() && this.isCollectable()) {
         this.setDeltaMovement(0.0, 0.05, 0.0);
      }

      HitResult hitresult = ProjectileUtil.getHitResultOnMoveVector(this, this::canHitEntity);
      if (!this.noPhysics) {
         this.onHit(hitresult);
         this.needsSync = true;
      }

      if (this.isCollectable()) {
         if (!this.level().isClientSide() && ++this.despawnTimer >= 6000) {
            this.discard();
         }
      } else if (!this.level().isClientSide() && ++this.despawnTimer >= 1200) {
         this.discard();
      }
   }

   // rods pass through each other (onHit ignored rod hits, but 26.x would freeze the rod on them)
   protected boolean canHitEntity(Entity target) {
      return !(target instanceof MutantBlazeRodProjectile) && this.canHit(target) && super.canHitEntity(target);
   }

   protected void onHitEntity(EntityHitResult p_37404_) {
      super.onHitEntity(p_37404_);
      Entity entity = p_37404_.getEntity();
      if (this.canHarm(entity) && !this.landed) {
         if (entity instanceof LivingEntity && ((LivingEntity)entity).isBlocking()) {
            MiscUtils.hurt(entity, MMDamageTypes.mutantBlazeRodProjectile(this.damageSources(), this, this.getOwner()), this.damage);
            this.setDeltaMovement(this.getDeltaMovement().multiply(-0.25, 0.5, -0.25));
         } else {
            if (this.ignoresInvulTime) {
               entity.setInvulnerableTime(0);
            }

            MiscUtils.hurt(entity, MMDamageTypes.mutantBlazeRodProjectile(this.damageSources(), this, this.getOwner()), this.damage);
            entity.igniteForSeconds(this.fireLength);
            if (this.isRodling()) {
               this.setDeltaMovement(this.getDeltaMovement().multiply(-0.25, 0.5, -0.25));
            } else if (!this.level().isClientSide() && !this.isCollectable()) {
               this.discard();
            }
         }
      }
   }

   boolean canHarm(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(
            TagInit.EntityTypes.MUTANT_BLAZE_ROD_PROJECTILE_CANT_HURT, this, target, this.getOwner(), entity -> entity instanceof MutantBlaze
         )
         ? true
         : MiscUtils.canHarmBasedOnTeamAndTag(null, this, target, this.getOwner(), entity -> !(entity instanceof MutantBlaze));
   }

   boolean canHit(Entity target) {
      return MiscUtils.canHarmBasedOnTeamAndTag(
            TagInit.EntityTypes.MUTANT_BLAZE_ROD_PROJECTILE_CANT_HIT, this, target, this.getOwner(), entity -> entity instanceof MutantBlaze
         )
         ? true
         : MiscUtils.canHarmBasedOnTeamAndTag(null, this, target, this.getOwner(), entity -> !(entity instanceof MutantBlaze));
   }

   protected void onHitBlock(BlockHitResult p_37258_) {
      super.onHitBlock(p_37258_);
      BlockPos blockpos = p_37258_.getBlockPos();
      if (!this.hasBrokenBlock()) {
         this.setHasBrokenBlock(true);
         this.setDeltaMovement(this.getDeltaMovement().multiply(-0.25, 0.5, -0.25));
         if (!this.level().isClientSide() && this.griefing && !this.isCollectable() && !this.level().getBlockState(blockpos).is(TagInit.Blocks.UNBREAKABLE)) {
            this.level().destroyBlock(blockpos, this.griefingDropsBlocks);
         }
      } else if (!this.isRodling() || this.isCollectable()) {
         this.level().getBlockState(blockpos).entityInside(this.level(), blockpos, this, InsideBlockEffectApplier.NOOP, true);
         this.landed = true;
         this.setDeltaMovement(0.0, 0.0, 0.0);
         if (this.level().getBlockState(this.blockPosition()).isAir() && this.fireGriefing && !this.level().isClientSide() && !this.isCollectable()) {
            this.level().setBlockAndUpdate(this.blockPosition(), BaseFireBlock.getState(this.level(), blockpos));
         }
      } else if (!this.summonedRodling) {
         this.becomeRodling(null);
      }

      if (!this.level().isClientSide() && !this.isCollectable() && !this.isRodling()) {
         this.discard();
      }
   }

   public void becomeRodling(Player possibleNewOwner) {
      if (!this.level().isClientSide()) {
         this.summonedRodling = true;
         ServerLevel serverlevel = (ServerLevel)this.level();
         Rodling rodling = (Rodling)EntityTypeInit.RODLING.create(this.level(), EntitySpawnReason.MOB_SUMMONED);
         rodling.snapTo(this.position());
         rodling.finalizeSpawn(serverlevel, serverlevel.getCurrentDifficultyAt(this.blockPosition()), EntitySpawnReason.MOB_SUMMONED, null);
         if (this.hasArmour()) {
            rodling.inventory.setItem(0, new ItemStack(ItemInit.RODLING_HELMET));
         }

         if (this.hasShields()) {
            rodling.inventory.setItem(1, new ItemStack(ItemInit.RODLING_SHIELDS));
         }

         if (this.getOwner() != null && this.getOwner() instanceof Mob && ((Mob)this.getOwner()).getTarget() != null) {
            rodling.setTarget(((Mob)this.getOwner()).getTarget());
         }

         if (this.getOwner() != null && this.getOwner().getTeam() != null && possibleNewOwner == null) {
            Scoreboard scoreboard = this.level().getScoreboard();
            scoreboard.addPlayerToTeam(rodling.getScoreboardName(), scoreboard.getPlayerTeam(this.getOwner().getTeam().getName()));
         }

         if (possibleNewOwner != null) {
            rodling.tame(possibleNewOwner);
            rodling.getNavigation().stop();
            rodling.setTarget((LivingEntity)null);
            rodling.setFollowType(Rodling.FollowType.SIT);

            for (int i = 0; i < 3; i++) {
               serverlevel.sendParticles(ParticleTypes.HEART, rodling.getRandomX(1.0), rodling.getRandomY(), rodling.getRandomZ(1.0), 1, 0.0, 0.0, 0.0, 0.0);
            }

            rodling.level().broadcastEntityEvent(rodling, (byte)7);
         }

         rodling.playAmbientSound();
         serverlevel.addFreshEntityWithPassengers(rodling);
         this.discard();
      }

      if (possibleNewOwner != null) {
         for (int i = 0; i < 7; i++) {
            double d0 = this.random.nextGaussian() * 0.02;
            double d1 = this.random.nextGaussian() * 0.02;
            double d2 = this.random.nextGaussian() * 0.02;
            this.level().addParticle(ParticleTypes.HEART, this.getRandomX(1.0), this.getRandomY() + 0.5, this.getRandomZ(1.0), d0, d1, d2);
         }
      }
   }

   protected void onHit(HitResult p_37406_) {
      if ((!(p_37406_ instanceof EntityHitResult) || !(false) || this.tickCount > 10)
         && (!(p_37406_ instanceof EntityHitResult) || !(((EntityHitResult)p_37406_).getEntity() instanceof MutantBlazeRodProjectile))) {
         if (!this.landed && !this.hasBrokenBlock()) {
            this.playSound(SoundEventInit.MUTANT_BLAZE_ROD_IMPACT, 1.0F, MiscUtils.randomSoundPitch());
         }

         super.onHit(p_37406_);
      }
   }

   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      builder.define(BROKEN_BLOCK, false);
      builder.define(RODLING, false);
      builder.define(SHIELDS, false);
      builder.define(ARMOUR, false);
      builder.define(COLLECTABLE, false);
   }

   protected void addAdditionalSaveData(ValueOutput tag) {
      super.addAdditionalSaveData(tag);
      tag.putBoolean("HasBrokenBlock", this.hasBrokenBlock());
      tag.putBoolean("IsRodling", this.isRodling());
      tag.putBoolean("HasShields", this.hasShields());
      tag.putBoolean("HasArmour", this.hasArmour());
      tag.putBoolean("Collectable", this.isCollectable());
      tag.putFloat("Damage", this.damage);
      tag.putInt("FireLength", this.fireLength);
      tag.putBoolean("IgnoresInvulTime", this.ignoresInvulTime);
      tag.putInt("DespawnTime", this.despawnTime);
      tag.putBoolean("Glows", this.glows);
      tag.putBoolean("Griefing", this.griefing);
      tag.putBoolean("GriefingDropsBlocks", this.griefingDropsBlocks);
      tag.putBoolean("FireGriefing", this.fireGriefing);
   }

   protected void readAdditionalSaveData(ValueInput tag) {
      super.readAdditionalSaveData(tag);
      if (tag.contains("HasBrokenBlock")) {
         this.setHasBrokenBlock(tag.getBooleanOr("HasBrokenBlock", false));
      }

      if (tag.contains("IsRodling")) {
         this.setIsRodling(tag.getBooleanOr("IsRodling", false));
      }

      if (tag.contains("HasShields")) {
         this.setHasShields(tag.getBooleanOr("HasShields", false));
      }

      if (tag.contains("HasArmour")) {
         this.setHasArmour(tag.getBooleanOr("HasArmour", false));
      }

      if (tag.contains("Collectable")) {
         this.setCollectable(tag.getBooleanOr("Collectable", false));
      }

      if (tag.contains("Damage")) {
         this.damage = tag.getFloatOr("Damage", 0);
      }

      if (tag.contains("FireLength")) {
         this.fireLength = tag.getIntOr("FireLength", 0);
      }

      if (tag.contains("IgnoresInvulTime")) {
         this.ignoresInvulTime = tag.getBooleanOr("IgnoresInvulTime", false);
      }

      if (tag.contains("DespawnTime")) {
         this.despawnTime = tag.getIntOr("DespawnTime", 0);
      }

      if (tag.contains("Glows")) {
         this.glows = tag.getBooleanOr("Glows", false);
      }

      if (tag.contains("Griefing")) {
         this.griefing = tag.getBooleanOr("Griefing", false);
      }

      if (tag.contains("GriefingDropsBlocks")) {
         this.griefingDropsBlocks = tag.getBooleanOr("GriefingDropsBlocks", false);
      }

      if (tag.contains("FireGriefing")) {
         this.fireGriefing = tag.getBooleanOr("FireGriefing", false);
      }
   }

   public boolean hasBrokenBlock() {
      return (Boolean)this.entityData.get(BROKEN_BLOCK);
   }

   public void setHasBrokenBlock(boolean setTo) {
      this.entityData.set(BROKEN_BLOCK, setTo);
   }

   public boolean isRodling() {
      return (Boolean)this.entityData.get(RODLING);
   }

   public void setIsRodling(boolean setTo) {
      this.entityData.set(RODLING, setTo);
   }

   public boolean hasShields() {
      return (Boolean)this.entityData.get(SHIELDS);
   }

   public void setHasShields(boolean setTo) {
      this.entityData.set(SHIELDS, setTo);
   }

   public boolean hasArmour() {
      return (Boolean)this.entityData.get(ARMOUR);
   }

   public void setHasArmour(boolean setTo) {
      this.entityData.set(ARMOUR, setTo);
   }

   public boolean isCollectable() {
      return (Boolean)this.entityData.get(COLLECTABLE);
   }

   public void setCollectable(boolean setTo) {
      this.entityData.set(COLLECTABLE, setTo);
   }

}
