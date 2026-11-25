package com.alexander.mutantmore.entities;

import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.util.PositionUtils;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.scores.Scoreboard;
import org.jspecify.annotations.Nullable;

/** A grave in the ground: after startDelay it plays a dig-out animation and then spawns the stored mob (a husk or zombie) on the owner's side. */
public class ZombieResurrection extends Entity {
   private static final EntityDataAccessor<String> ENTITY_TYPE = SynchedEntityData.defineId(ZombieResurrection.class, EntityDataSerializers.STRING);
   public static final int RESURRECT_ANIMATION_LENGTH = 92;
   public int startDelay;
   public final AnimationState resurrectAnimationState = new AnimationState();
   public int resurrectAnimationTick;
   public LivingEntity owner;

   public ZombieResurrection(EntityType<?> type, Level level) {
      super(type, level);
   }

   public ZombieResurrection(Level level, int startDelay, LivingEntity owner) {
      this(EntityTypeInit.ZOMBIE_RESURRECTION, level);
      this.startDelay = startDelay;
      this.owner = owner;
   }

   @Override
   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      builder.define(ENTITY_TYPE, "");
   }

   @Override
   protected void readAdditionalSaveData(ValueInput input) {
      this.entityData.set(ENTITY_TYPE, input.getStringOr("EntityType", ""));
      this.startDelay = input.getIntOr("StartDelay", 0);
   }

   @Override
   protected void addAdditionalSaveData(ValueOutput output) {
      output.putString("EntityType", this.entityData.get(ENTITY_TYPE));
      output.putInt("StartDelay", this.startDelay);
   }

   public void setEntityType(EntityType<?> type) {
      this.entityData.set(ENTITY_TYPE, EntityType.getKey(type).toString());
   }

   public @Nullable EntityType<?> getEntityType() {
      String id = this.entityData.get(ENTITY_TYPE);
      return id.isEmpty() ? null : BuiltInRegistries.ENTITY_TYPE.getOptional(Identifier.parse(id)).orElse(null);
   }

   @Override
   public void handleEntityEvent(byte id) {
      if (id == 4) {
         this.resurrectAnimationTick = RESURRECT_ANIMATION_LENGTH;
         this.resurrectAnimationState.start(this.tickCount);
      } else {
         super.handleEntityEvent(id);
      }
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource source, float amount) {
      return false;
   }

   @Override
   public void tick() {
      super.tick();
      if (this.resurrectAnimationTick > 0 && this.random.nextInt(4) == 0) {
         BlockState below = this.level().getBlockState(BlockPos.containing(this.getX(), this.getY() - 0.2F, this.getZ()));
         if (!below.isAir()) {
            this.level().addParticle(new BlockParticleOption(ParticleTypes.BLOCK, below), this.getRandomX(1.0), this.getY() + 0.1, this.getRandomZ(1.0), 0.0, 0.0, 0.0);
         }
      }

      if (!(this.level() instanceof ServerLevel level)) {
         if (this.resurrectAnimationTick > 0) {
            this.resurrectAnimationTick--;
         }

         return;
      }

      if (this.tickCount >= this.startDelay && this.resurrectAnimationTick <= 0) {
         this.resurrectAnimationTick = RESURRECT_ANIMATION_LENGTH;
         level.broadcastEntityEvent(this, (byte)4);
         this.playSound(SoundEventInit.ZOMBIE_RESURRECTION);
      }

      if (this.resurrectAnimationTick > 0) {
         this.resurrectAnimationTick--;
      }

      if (this.resurrectAnimationTick == 1) {
         EntityType<?> type = this.getEntityType();
         Entity entity = type == null ? null : type.create(level, EntitySpawnReason.MOB_SUMMONED);
         if (entity != null) {
            entity.snapTo(this.position());
            if (this.owner != null && this.owner.getTeam() != null) {
               Scoreboard scoreboard = level.getScoreboard();
               scoreboard.addPlayerToTeam(entity.getScoreboardName(), scoreboard.getPlayerTeam(this.owner.getTeam().getName()));
            }

            if (this.owner instanceof MutantHusk husk) {
               husk.resurrectedMobs.add(entity);
            }

            if (this.owner instanceof Mob ownerMob && ownerMob.getTarget() != null && entity instanceof Mob mob) {
               mob.setTarget(ownerMob.getTarget());
            }

            entity.lookAt(EntityAnchorArgument.Anchor.EYES, PositionUtils.getOffsetPos(this, 0.0, this.getEyeHeight(), 2.0, 0.0F, this.getYRot() + 180.0F));
            if (entity instanceof Mob mob) {
               mob.finalizeSpawn(level, level.getCurrentDifficultyAt(this.blockPosition()), EntitySpawnReason.MOB_SUMMONED, null);
               mob.setBaby(false);
               mob.playAmbientSound();
            }

            level.addFreshEntityWithPassengers(entity);
         }

         this.discard();
      }
   }
}
