package com.alexander.mutantmore.entities;

import com.alexander.mutantmore.config.MutantMoreGroupedOptionsClientConfig;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.interfaces.IMutatable;
import com.alexander.mutantmore.util.MiscUtils;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.BossEvent.BossBarColor;
import net.minecraft.world.BossEvent.BossBarOverlay;
import net.minecraft.world.Difficulty;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.PathNavigationRegion;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathFinder;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.pathfinder.PathfindingContext;
import net.minecraft.world.level.pathfinder.WalkNodeEvaluator;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import org.jspecify.annotations.Nullable;

public abstract class AbstractMutant extends Monster implements IMutatable {
   /** Set by the client entrypoint; starts/keeps this mutant's battle music. No-op on a dedicated server. */
   public static Consumer<AbstractMutant> battleMusicHook = mutant -> {};

   // ponytail: plain vanilla boss bar; the original's custom "mutant" bar textures need a BossHealthOverlay mixin (later pass)
   public ServerBossEvent bossEvent = new ServerBossEvent(Mth.createInsecureUUID(this.random), this.getDisplayName(), BossBarColor.WHITE, BossBarOverlay.PROGRESS);
   private int destroyBlocksTick;
   private static final EntityDataAccessor<Integer> TARGETED_ENTITY_ID = SynchedEntityData.defineId(AbstractMutant.class, EntityDataSerializers.INT);

   protected AbstractMutant(EntityType<? extends Monster> type, Level level) {
      super(type, level);
   }

   @Override
   protected PathNavigation createNavigation(Level level) {
      return new MutantNavigation(this, level);
   }

   public abstract @Nullable NodeEvaluatorDimensions getNodeEvaluatorDimensions();

   public abstract TagKey<Block> walksThroughTag();

   public abstract ConfigValue<Boolean> walkGriefingConfig();

   public abstract ConfigValue<Boolean> walkGriefingDropsBlocksConfig();

   public abstract ConfigValue<Boolean> hurtGriefingConfig();

   public abstract ConfigValue<Boolean> hurtGriefingDropsBlocksConfig();

   public abstract ConfigValue<Boolean> showHealthBarConfig();

   public abstract ConfigValue<Boolean> despawnsConfig();

   public abstract ConfigValue<Boolean> playBattleMusicConfig();

   /** The battle music tracks (played together); was getBattleMusic() returning client sound instances. */
   public abstract List<SoundEvent> getBattleMusicSounds();

   @Override
   protected void readAdditionalSaveData(ValueInput input) {
      super.readAdditionalSaveData(input);
      if (this.hasCustomName()) {
         this.bossEvent.setName(this.getDisplayName());
      }
   }

   @Override
   public void setCustomName(@Nullable Component name) {
      super.setCustomName(name);
      this.bossEvent.setName(this.getDisplayName());
   }

   @Override
   protected void customServerAiStep(ServerLevel level) {
      if (this.destroyBlocksTick > 0 && this.hurtGriefingConfig().get() && !MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get()) {
         this.destroyBlocksTick--;
         if (this.destroyBlocksTick == 0) {
            AABB aabb = this.getBoundingBox().inflate(1.0, 0.0, 1.0).move(0.0, 0.1, 0.0);
            for (BlockPos blockpos : BlockPos.betweenClosed(
               Mth.floor(aabb.minX), Mth.floor(aabb.minY), Mth.floor(aabb.minZ), Mth.floor(aabb.maxX), Mth.floor(aabb.maxY), Mth.floor(aabb.maxZ)
            )) {
               BlockState blockstate = level.getBlockState(blockpos);
               Block block = blockstate.getBlock();
               if (!blockstate.is(TagInit.Blocks.UNBREAKABLE) && (this.cantBreakWithHurtGriefing() == null || !this.cantBreakWithHurtGriefing().contains(block))) {
                  level.destroyBlock(
                     blockpos, this.hurtGriefingDropsBlocksConfig().get() || MutantMoreGroupedOptionsCommonConfig.griefing_drops_blocks_on.get(), this
                  );
               }
            }
         }
      }

      super.customServerAiStep(level);
   }

   public @Nullable List<Block> cantBreakWithHurtGriefing() {
      return null;
   }

   @Override
   public void stopSeenByPlayer(ServerPlayer player) {
      super.stopSeenByPlayer(player);
      this.bossEvent.removePlayer(player);
   }

   @Override
   public void aiStep() {
      super.aiStep();
      if (!this.level().isClientSide()
         && this.horizontalCollision
         && this.walkGriefingConfig().get()
         && !MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get()) {
         AABB aabb = this.getBoundingBox().inflate(0.2);
         for (BlockPos blockpos : BlockPos.betweenClosed(
            Mth.floor(aabb.minX), Mth.floor(aabb.minY), Mth.floor(aabb.minZ), Mth.floor(aabb.maxX), Mth.floor(aabb.maxY), Mth.floor(aabb.maxZ)
         )) {
            if (this.level().getBlockState(blockpos).is(this.walksThroughTag())) {
               this.level().destroyBlock(
                  blockpos, this.walkGriefingDropsBlocksConfig().get() || MutantMoreGroupedOptionsCommonConfig.griefing_drops_blocks_on.get(), this
               );
            }
         }
      }
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource source, float amount) {
      if (!this.isInvulnerableTo(level, source) && this.destroyBlocksTick <= 0) {
         this.destroyBlocksTick = 20;
      }

      return super.hurtServer(level, source, amount);
   }

   @Override
   public void tick() {
      super.tick();
      if (this.level().isClientSide()) {
         this.updateAnimations();
      }
   }

   protected void updateAnimations() {
   }

   @Override
   public void baseTick() {
      super.baseTick();
      this.bossEvent.setProgress(this.getHealth() / this.getMaxHealth());
      if (this.level().isClientSide()) {
         if (this.playBattleMusicConfig().get() && !MutantMoreGroupedOptionsClientConfig.play_battle_music_off.get()) {
            battleMusicHook.accept(this);
         }
         return;
      }

      this.setTargetedEntityID(this.getTarget() != null && !this.getTarget().isRemoved() ? this.getTarget().getId() : 0);

      // ponytail: reads a CLIENT config on the server side like the original; fine in singleplayer, a dedicated server would need it moved to common
      if (this.showHealthBarConfig().get() || MutantMoreGroupedOptionsClientConfig.show_health_bars_on.get()) {
         if (this.getTarget() != null && !this.isRemoved()) {
            if (this.getTarget() instanceof ServerPlayer player) {
               this.bossEvent.addPlayer(player);
            }

            for (ServerPlayer player : this.level().getEntitiesOfClass(ServerPlayer.class, this.getBoundingBox().inflate(20.0), MiscUtils.ALIVE)) {
               this.bossEvent.addPlayer(player);
            }
         } else {
            for (ServerPlayer player : this.level().getEntitiesOfClass(ServerPlayer.class, this.getBoundingBox().inflate(75.0), MiscUtils.ALIVE)) {
               this.bossEvent.removePlayer(player);
            }
         }
      }
   }

   @Override
   public boolean causeFallDamage(double fallDistance, float damageModifier, DamageSource damageSource) {
      return false;
   }

   @Override
   public void checkDespawn() {
      // The original read the Mutant Wither Skeleton's despawn option here for every mutant; use each mutant's own option.
      if (!this.despawnsConfig().get() && !MutantMoreGroupedOptionsCommonConfig.mutant_despawning_on.get()) {
         if (this.level().getDifficulty() == Difficulty.PEACEFUL && !this.getType().isAllowedInPeaceful()) {
            this.discard();
         } else {
            this.noActionTime = 0;
         }
      } else {
         super.checkDespawn();
      }
   }

   public boolean shouldPauseBattleMusic() {
      return false;
   }

   @Override
   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);
      builder.define(TARGETED_ENTITY_ID, 0);
   }

   public int getTargetedEntityID() {
      return this.entityData.get(TARGETED_ENTITY_ID);
   }

   public void setTargetedEntityID(int setTo) {
      this.entityData.set(TARGETED_ENTITY_ID, setTo);
   }

   static class MutantNavigation extends GroundPathNavigation {
      public MutantNavigation(Mob mob, Level level) {
         super(mob, level);
      }

      @Override
      protected PathFinder createPathFinder(int maxVisitedNodes) {
         this.nodeEvaluator = new MutantNodeEvaluator();
         return new PathFinder(this.nodeEvaluator, maxVisitedNodes);
      }

      @Override
      public boolean canCutCorner(PathType pathType) {
         return true;
      }
   }

   static class MutantNodeEvaluator extends WalkNodeEvaluator {
      public AbstractMutant mutant;

      @Override
      public void prepare(PathNavigationRegion level, Mob mob) {
         super.prepare(level, mob);
         this.mutant = (AbstractMutant)mob;
         NodeEvaluatorDimensions dims = this.mutant.getNodeEvaluatorDimensions();
         if (dims != null) {
            this.entityWidth = dims.entityWidth;
            this.entityHeight = dims.entityHeight;
            this.entityDepth = dims.entityDepth;
         }
      }

      @Override
      public PathType getPathType(PathfindingContext context, int x, int y, int z) {
         return context.getBlockState(new BlockPos(x, y, z)).is(this.mutant.walksThroughTag())
               && this.mutant.walkGriefingConfig().get()
               && !MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get()
            ? PathType.OPEN
            : super.getPathType(context, x, y, z);
      }
   }

   public static class NodeEvaluatorDimensions {
      public int entityWidth;
      public int entityHeight;
      public int entityDepth;

      public NodeEvaluatorDimensions(int entityWidth, int entityHeight, int entityDepth) {
         this.entityWidth = entityWidth;
         this.entityHeight = entityHeight;
         this.entityDepth = entityDepth;
      }
   }
}
