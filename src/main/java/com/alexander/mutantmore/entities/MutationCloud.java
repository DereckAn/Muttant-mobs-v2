package com.alexander.mutantmore.entities;

import com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers.AdvancedAnimatable;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers.AdvancedAnimationTracker;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers.EntityAdvancedAnimation;
import com.alexander.mutantmore.config.MutationCommonConfig;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.ItemInit;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.interfaces.IMutatable;
import com.alexander.mutantmore.mutations.MutationType;
import com.alexander.mutantmore.mutations.MutationTypes;
import com.alexander.mutantmore.network.SyncAdvancedAnimationPayload;
import com.alexander.mutantmore.particles.AdvancedParticleOption;
import com.alexander.mutantmore.util.MiscUtils;
import java.util.List;
import java.util.UUID;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.core.UUIDUtil;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.ConversionParams;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.TagValueInput;
import net.minecraft.world.level.storage.TagValueOutput;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

/**
 * Cloud left by a Formula Y / Compound Z: drifts to the nearest mob, wraps it and, after the mutate animation, turns it into its mutant
 * (or hurts it on failure). Colour tells the outcome: pink = success, purple = failed roll, red = no mutation, blue = wrong conditions.
 */
public class MutationCloud extends Entity implements AdvancedAnimatable {
   private static final EntityDataAccessor<Integer> POTION_TYPE = SynchedEntityData.defineId(MutationCloud.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Integer> SUCCESS_TYPE = SynchedEntityData.defineId(MutationCloud.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Integer> TARGET_ENTITY_ID = SynchedEntityData.defineId(MutationCloud.class, EntityDataSerializers.INT);
   /** Client sets this to start the looping mutation hum. */
   public static java.util.function.Consumer<MutationCloud> loopSoundHook = cloud -> {};
   public final AdvancedAnimationTracker animationTracker = new AdvancedAnimationTracker();
   public int lifeTime;
   public boolean attached;
   private boolean loopSoundStarted;
   private @Nullable UUID ownerUUID;

   public MutationCloud(EntityType<?> type, Level level) {
      super(type, level);
      this.noPhysics = true;
      this.animationTracker.addAnimation("mutate", new EntityAdvancedAnimation(this, false));
   }

   public MutationCloud(Level level, @Nullable Entity owner, PotionType type) {
      this(EntityTypeInit.MUTATION_CLOUD, level);
      this.lifeTime = type.lifeTime;
      this.ownerUUID = owner != null ? owner.getUUID() : null;
      this.setPotionType(type);
   }

   @Override
   public AdvancedAnimationTracker getAnimationTracker() {
      return this.animationTracker;
   }

   public EntityAdvancedAnimation mutateAnimation() {
      return (EntityAdvancedAnimation)this.animationTracker.getAnimation("mutate");
   }

   @Override
   public void startSeenByPlayer(ServerPlayer player) {
      super.startSeenByPlayer(player);
      ServerPlayNetworking.send(player, SyncAdvancedAnimationPayload.of(this.getId(), this.mutateAnimation()));
   }

   @Override
   public EntityDimensions getDimensions(Pose pose) {
      Mob target = this.getTarget();
      return target != null ? target.getDimensions(target.getPose()) : super.getDimensions(pose);
   }

   public float getMutationProgress() {
      EntityAdvancedAnimation mutate = this.mutateAnimation();
      return mutate.progress() > 0.0F ? mutate.progress() / mutate.getLength() : 0.01F;
   }

   public Colour mutationColour() {
      float progress = this.getSuccessType() == SuccessType.SUCCEED ? this.getMutationProgress() : this.getMutationProgress() * 2.0F;
      return Colour.DEFAULT.lerpTo(this.getSuccessType().colour, progress).scale(this.getPotionType().colourIntensity);
   }

   private static boolean classic() {
      return MutationCommonConfig.classic_mutations.get();
   }

   @Override
   public void tick() {
      super.tick();
      this.animationTracker.tick();
      if (this.level().isClientSide()) {
         this.clientTick();
      }

      double x0 = this.getX();
      double y0 = this.getY();
      double z0 = this.getZ();
      this.refreshDimensions();
      this.setPos(x0, y0, z0);
      if (this.level() instanceof ServerLevel level) {
         this.serverTick(level);
      }

      this.move(MoverType.SELF, this.getDeltaMovement());
   }

   private void clientTick() {
      if (!this.loopSoundStarted) {
         this.loopSoundStarted = true;
         loopSoundHook.accept(this);
      }

      float progress = this.getMutationProgress();
      if (!classic()) {
         if (progress > 0.01F) {
            Colour colour = this.mutationColour();
            for (int i = 0; i < progress * 20.0F; i++) {
               this.level().addAlwaysVisibleParticle(
                  new AdvancedParticleOption(ParticleTypeInit.MUTATION, List.of(colour.r, colour.g, colour.b)),
                  this.getRandomX(1.0), this.getRandomY(), this.getRandomZ(1.0), 0.0, 0.75, 0.0
               );
            }
         }

         // swirl particles orbit the cloud (they follow the entity id)
         for (int i = 0; i < Math.max(1, progress > 0.01F ? progress * 1000.0F : 1); i++) {
            this.level().addAlwaysVisibleParticle(
               new AdvancedParticleOption(ParticleTypeInit.MUTATION_SWIRL, List.of((float)this.getId(), 0.0F, this.getBbHeight() / 4.0F, 0.0F)),
               this.getX(), this.getY(), this.getZ(), 0.0, 0.0, 0.0
            );
         }
      } else {
         this.level().addAlwaysVisibleParticle(
            new AdvancedParticleOption(ParticleTypeInit.MUTATION, List.of(1.0F, 0.5686275F, 0.9882353F)),
            this.getRandomX(1.0), this.getRandomY(), this.getRandomZ(1.0), 0.0, 0.25 + this.random.nextFloat() * progress, 0.0
         );
      }

      ShakeCameraEvent.shake(this.level(), 3, this.getPotionType().screenShakeIntensity, this.blockPosition(), 35);
   }

   private void serverTick(ServerLevel level) {
      Mob target = this.getTarget();
      if (target == null) {
         this.attached = false;
         if (this.lifeTime-- <= 0) {
            this.discard();
            return;
         }
      }

      // Two clouds on one mob: this one looks for someone else
      for (MutationCloud other : this.nearbyClouds()) {
         if (other != this && other.attached && other.getTarget() == target) {
            this.setTarget(this.findNearestTargetableMob());
         }
      }

      target = this.getTarget();
      if (target == null) {
         this.setTarget(this.findNearestTargetableMob());
         return;
      }

      if (!this.attached) {
         Vec3 to = target.position().subtract(this.position());
         double distance = Math.max(this.distanceTo(target), 1.0F);
         this.setDeltaMovement(to.scale(1.0 / distance).scale(this.getPotionType().speed()));
         if (this.getBoundingBox().intersects(target.getBoundingBox())) {
            this.startMutating(target);
         }

         return;
      }

      this.setPos(target.position());
      this.setDeltaMovement(Vec3.ZERO);
      if (target.isDeadOrDying() || target.isRemoved()) {
         this.discard();
         return;
      }

      if (this.random.nextInt(5) == 0) {
         target.hurtServer(level, this.damageSources().magic(), 0.0F);
      }

      target.setPos(target.position().add(this.random.nextGaussian() * 0.02, 0.0, this.random.nextGaussian() * 0.02));
      EntityAdvancedAnimation mutate = this.mutateAnimation();
      float finishTime = this.getSuccessType() != SuccessType.SUCCEED && !classic() ? mutate.getLength() / 2.0F : mutate.getLength();
      if (mutate.progress() >= finishTime) {
         if (classic() || this.getSuccessType() == SuccessType.SUCCEED) {
            MiscUtils.customExplosion(
               level, null, this.damageSources().explosion(null, null), null, target.getX(), target.getEyeY(), target.getZ(), 5.0F, false,
               Explosion.BlockInteraction.KEEP, SoundEvents.GENERIC_EXPLODE.value(), target.getSoundSource(), ParticleTypes.EXPLOSION_EMITTER,
               ParticleTypes.EXPLOSION, 0.0F, false, false
            );
         }

         if (this.getSuccessType() == SuccessType.SUCCEED) {
            MutationType type = MutationTypes.forMob(target);
            if (type != null) {
               this.convertMobToMutant(level, target, type);
            }
            if (this.ownerUUID != null && level.getPlayerByUUID(this.ownerUUID) instanceof ServerPlayer player) {
               MiscUtils.awardMutantMoreAdvancement(player, "mutantmore/mutate_mob", "mutated");
            }
         } else {
            target.hurtServer(level, this.damageSources().magic(), this.getPotionType().failDamage);
         }

         this.discard();
      }
   }

   private void startMutating(Mob mob) {
      this.attached = true;
      if (MutationTypes.forMob(mob) != null) {
         this.setSuccessType(MiscUtils.randomPercent(this.getPotionType().mutationChance()) ? SuccessType.SUCCEED : SuccessType.FAIL);
      } else {
         this.setSuccessType(MutationTypes.hasMutation(mob) ? SuccessType.WRONG_CONDITIONS : SuccessType.INCOMPATIBLE);
      }

      if (!classic()) {
         this.playSound(this.getSuccessType() == SuccessType.SUCCEED ? SoundEventInit.SUCCESSFUL_MUTATION : SoundEventInit.FAILED_MUTATION, 3.0F, 1.0F);
      }

      int min = MutationCommonConfig.classic_mutation_min_time.get();
      int max = MutationCommonConfig.classic_mutation_max_time.get();
      float classicSeconds = (min + this.random.nextInt(Math.max(1, max - min))) / 20.0F;
      this.mutateAnimation().start(classic() ? classicSeconds : 16.0F, 0);
   }

   /** Turns the mob into the mutation's result (also used for natural spawns). */
   public static @Nullable Mob convert(ServerLevel level, Mob original, MutationType type, EntitySpawnReason reason) {
      // EntityType.getBaseClass() is always Entity in 26.x, so check a real instance
      Entity probe = type.resultEntityType().create(level, EntitySpawnReason.CONVERSION);
      if (!(probe instanceof Mob)) {
         return null;
      }

      probe.discard();

      @SuppressWarnings("unchecked")
      EntityType<Mob> resultType = (EntityType<Mob>)type.resultEntityType();
      Mob mutant = original.convertTo(resultType, ConversionParams.single(original, true, true), reason, m -> {});
      if (mutant == null) {
         return null;
      }

      mutant.finalizeSpawn(level, level.getCurrentDifficultyAt(mutant.blockPosition()), reason, null);
      if (!type.mutatedMobTags().isEmpty()) {
         // merge the extra NBT into the mutant's own save data
         try (ProblemReporter.ScopedCollector reporter = new ProblemReporter.ScopedCollector(mutant.problemPath(), com.alexander.mutantmore.MutantMore.LOGGER)) {
            TagValueOutput out = TagValueOutput.createWithContext(reporter, level.registryAccess());
            mutant.saveWithoutId(out);
            ValueInput in = TagValueInput.create(reporter, level.registryAccess(), out.buildResult().merge(type.mutatedMobTags()));
            mutant.load(in);
         }
      }

      return mutant;
   }

   private void convertMobToMutant(ServerLevel level, Mob original, MutationType type) {
      Mob mutant = convert(level, original, type, EntitySpawnReason.CONVERSION);
      if (mutant == null) {
         return;
      }

      if (mutant instanceof IMutatable mutatable) {
         mutatable.onMutated();
      }

      boolean griefing = level.getGameRules().get(net.minecraft.world.level.gamerules.GameRules.MOB_GRIEFING);
      if (griefing ? type.breakBlocksWhenMutated() : type.breakBlocksWhenMutatedIfGriefingDisabled()) {
         AABB box = mutant.getBoundingBox().inflate(0.2);
         for (BlockPos pos : BlockPos.betweenClosed(
            Mth.floor(box.minX), Mth.floor(box.minY + 1.0), Mth.floor(box.minZ), Mth.floor(box.maxX), Mth.floor(box.maxY), Mth.floor(box.maxZ)
         )) {
            if (!level.getBlockState(pos).is(TagInit.Blocks.UNBREAKABLE)) {
               level.destroyBlock(pos, true, mutant);
            }
         }
      }

      mutant.playSound(type.mutatedSoundEvent(), 2.5F, 1.0F);
      ShakeCameraEvent.shake(level, type.screenShake().duration(), type.screenShake().amount(), this.blockPosition(), type.screenShake().range());
      Player nearby = level.getNearestPlayer(mutant, 35.0);
      if (nearby != null) {
         mutant.lookAt(EntityAnchorArgument.Anchor.EYES, nearby.getEyePosition());
      }
   }

   private @Nullable Mob findNearestTargetableMob() {
      double range = MutationCommonConfig.mutation_cloud_search_range.get();
      double rangeY = MutationCommonConfig.mutation_cloud_search_range_y.get();
      List<MutationCloud> clouds = this.nearbyClouds();
      Mob best = null;
      double bestDistance = Double.MAX_VALUE;
      for (Mob mob : this.level().getEntitiesOfClass(Mob.class, this.getBoundingBox().inflate(range, rangeY, range), this::canTarget)) {
         boolean taken = clouds.stream().anyMatch(c -> c != this && c.attached && c.getTarget() == mob);
         double distance = this.distanceToSqr(mob);
         if (!taken && distance < bestDistance) {
            best = mob;
            bestDistance = distance;
         }
      }

      return best;
   }

   private List<MutationCloud> nearbyClouds() {
      return this.level().getEntitiesOfClass(MutationCloud.class, this.getBoundingBox().inflate(12.0));
   }

   private boolean canTarget(Mob mob) {
      return EntitySelector.NO_CREATIVE_OR_SPECTATOR.test(mob)
         && !mob.isInvulnerable()
         && !mob.isDeadOrDying()
         && this.level().getWorldBorder().isWithinBounds(mob.getBoundingBox())
         && !mob.is(TagInit.EntityTypes.MUTATION_CLOUD_CANT_AIM_FOR);
   }

   /** The cloud currently mutating this entity, if any. */
   public static @Nullable MutationCloud forMob(Entity entity) {
      for (MutationCloud cloud : entity.level().getEntitiesOfClass(MutationCloud.class, entity.getBoundingBox())) {
         if (cloud.getTarget() == entity) {
            return cloud;
         }
      }

      return null;
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource source, float amount) {
      return false;
   }

   @Override
   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      builder.define(TARGET_ENTITY_ID, 0);
      builder.define(SUCCESS_TYPE, 0);
      builder.define(POTION_TYPE, 0);
   }

   @Override
   protected void addAdditionalSaveData(ValueOutput output) {
      output.storeNullable("Owner", UUIDUtil.CODEC, this.ownerUUID);
      output.putInt("PotionType", this.getPotionType().ordinal());
      output.putInt("SuccessType", this.getSuccessType().ordinal());
      output.putBoolean("Attached", this.attached);
      output.putInt("LifeTime", this.lifeTime);
   }

   @Override
   protected void readAdditionalSaveData(ValueInput input) {
      this.ownerUUID = input.read("Owner", UUIDUtil.CODEC).orElse(null);
      this.setPotionType(PotionType.values()[Math.floorMod(input.getIntOr("PotionType", 0), PotionType.values().length)]);
      this.setSuccessType(SuccessType.values()[Math.floorMod(input.getIntOr("SuccessType", 0), SuccessType.values().length)]);
      this.attached = input.getBooleanOr("Attached", false);
      this.lifeTime = input.getIntOr("LifeTime", this.getPotionType().lifeTime);
   }

   public @Nullable Mob getTarget() {
      return this.level().getEntity(this.entityData.get(TARGET_ENTITY_ID)) instanceof Mob mob ? mob : null;
   }

   private void setTarget(@Nullable Mob mob) {
      this.entityData.set(TARGET_ENTITY_ID, mob != null ? mob.getId() : 0);
   }

   public SuccessType getSuccessType() {
      return SuccessType.values()[Math.floorMod(this.entityData.get(SUCCESS_TYPE), SuccessType.values().length)];
   }

   private void setSuccessType(SuccessType type) {
      this.entityData.set(SUCCESS_TYPE, type.ordinal());
   }

   public PotionType getPotionType() {
      return PotionType.values()[Math.floorMod(this.entityData.get(POTION_TYPE), PotionType.values().length)];
   }

   private void setPotionType(PotionType type) {
      this.entityData.set(POTION_TYPE, type.ordinal());
   }

   @Override
   public boolean isIgnoringBlockTriggers() {
      return true;
   }

   public record Colour(float r, float g, float b) {
      public static final Colour DEFAULT = new Colour(1.0F, 0.5686275F, 0.9882353F);

      Colour scale(float amount) {
         return new Colour(this.r * amount, this.g * amount, this.b * amount);
      }

      Colour lerpTo(Colour other, float amount) {
         return new Colour(Mth.lerp(amount, this.r, other.r), Mth.lerp(amount, this.g, other.g), Mth.lerp(amount, this.b, other.b));
      }
   }

   public enum PotionType {
      FORMULA_Y(100, 20.0F, 0.01F, 0.5F),
      COMPOUND_Z(300, 50.0F, 0.05F, 1.0F);

      public final int lifeTime;
      public final float failDamage;
      public final float screenShakeIntensity;
      public final float colourIntensity;

      PotionType(int lifeTime, float failDamage, float screenShakeIntensity, float colourIntensity) {
         this.lifeTime = lifeTime;
         this.failDamage = failDamage;
         this.screenShakeIntensity = screenShakeIntensity;
         this.colourIntensity = colourIntensity;
      }

      public int mutationChance() {
         return this == FORMULA_Y ? MutationCommonConfig.formula_y_mutate_chance.get() : MutationCommonConfig.compound_z_mutate_chance.get();
      }

      public double speed() {
         return this == FORMULA_Y ? MutationCommonConfig.formula_y_cloud_movement_speed.get() : MutationCommonConfig.compound_z_cloud_movement_speed.get();
      }

      public static @Nullable PotionType byItem(Item item) {
         return item == ItemInit.FORMULA_Y ? FORMULA_Y : item == ItemInit.COMPOUND_Z ? COMPOUND_Z : null;
      }
   }

   public enum SuccessType {
      SUCCEED(Colour.DEFAULT),
      FAIL(new Colour(0.36078432F, 0.15294118F, 0.4627451F)),
      INCOMPATIBLE(new Colour(1.0F, 0.25490198F, 0.25490198F)),
      WRONG_CONDITIONS(new Colour(0.28235295F, 0.31764707F, 0.8117647F));

      public final Colour colour;

      SuccessType(Colour colour) {
         this.colour = colour;
      }
   }
}
