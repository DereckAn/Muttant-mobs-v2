package com.alexander.mutantmore.entities;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.jspecify.annotations.Nullable;

/** Up to four Mutant Blaze shields orbiting an entity; each one absorbs one hit (see MutantMore's damage hook). */
public class MutantBlazeShields extends Entity {
   private static final EntityDataAccessor<Integer> REMAINING_SHIELDS = SynchedEntityData.defineId(MutantBlazeShields.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Integer> ATTACHED_ENTITY_ID = SynchedEntityData.defineId(MutantBlazeShields.class, EntityDataSerializers.INT);

   public MutantBlazeShields(EntityType<? extends MutantBlazeShields> type, Level level) {
      super(type, level);
   }

   @Override
   public boolean shouldRender(double x, double y, double z) {
      return true;
   }

   @Override
   public void baseTick() {
      super.baseTick();
      Entity attached = this.getAttachedEntity();
      if (!this.level().isClientSide()) {
         if (this.getRemainingShields() <= 0) {
            this.discard();
            return;
         }

         // Owner gone: jump to whoever is standing in the shields, else vanish
         if (attached == null || attached.isRemoved() || attached instanceof LivingEntity living && living.isDeadOrDying()) {
            var inside = this.level().getEntities(this, this.getBoundingBox());
            if (inside.isEmpty()) {
               this.discard();
               return;
            }

            attached = inside.get(this.random.nextInt(inside.size()));
            this.setAttachedEntityID(attached.getId());
         }

         if (attached.isSpectator()) {
            this.discard();
            return;
         }
      }

      if (attached != null) {
         this.setPos(attached.getX(), attached.getY(), attached.getZ());
      }
   }

   /** Called when the attached entity is about to take damage; true = a shield broke and absorbed it. */
   public static boolean absorb(LivingEntity target, DamageSource source, float amount) {
      if (amount <= 0.0F || source.is(net.minecraft.tags.DamageTypeTags.BYPASSES_INVULNERABILITY) || source.is(net.minecraft.tags.DamageTypeTags.IS_FALL)
         || source.is(net.minecraft.tags.DamageTypeTags.BYPASSES_ARMOR)) {
         return false;
      }

      for (MutantBlazeShields shields : target.level().getEntitiesOfClass(MutantBlazeShields.class, target.getBoundingBox().inflate(5.0))) {
         if (shields.getAttachedEntity() == target && shields.getRemainingShields() > 0) {
            shields.playSound(com.alexander.mutantmore.init.SoundEventInit.MUTANT_BLAZE_SHIELDBREAK);
            shields.setRemainingShields(shields.getRemainingShields() - 1);
            return true;
         }
      }

      return false;
   }

   public @Nullable Entity getAttachedEntity() {
      return this.getAttachedEntityID() == 0 ? null : this.level().getEntity(this.getAttachedEntityID());
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource source, float amount) {
      return false;
   }

   @Override
   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      builder.define(REMAINING_SHIELDS, 0);
      builder.define(ATTACHED_ENTITY_ID, 0);
   }

   @Override
   protected void readAdditionalSaveData(ValueInput input) {
      this.setRemainingShields(input.getIntOr("RemainingShields", 0));
   }

   @Override
   protected void addAdditionalSaveData(ValueOutput output) {
      output.putInt("RemainingShields", this.getRemainingShields());
   }

   public int getRemainingShields() {
      return Mth.clamp(this.entityData.get(REMAINING_SHIELDS), 0, 4);
   }

   public void setRemainingShields(int value) {
      this.entityData.set(REMAINING_SHIELDS, value);
   }

   public int getAttachedEntityID() {
      return this.entityData.get(ATTACHED_ENTITY_ID);
   }

   public void setAttachedEntityID(int value) {
      this.entityData.set(ATTACHED_ENTITY_ID, value);
   }
}
