package com.alexander.mutantmore.entities;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.ai.goals.ApproachTargetGoal;
import com.alexander.mutantmore.ai.goals.LookAtTargetGoal;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.mutant_blaze.RodlingCommonConfig;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.particles.AdvancedParticleOption;
import com.alexander.mutantmore.util.MiscUtils;
import java.util.EnumSet;
import java.util.List;
import org.jspecify.annotations.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.util.Mth;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.phys.Vec3;

/**
 * Rod dropped by a dying Mutant Blaze that comes alive; tame it and it fights for you.
 * Its 4-slot inventory (helmet, shields, food, dye) is kept, but the Rodling Checker screen that edited it isn't ported yet.
 */
public class Rodling extends TamableAnimal {
   private static final EntityDataAccessor<Integer> FOLLOW_TYPE = SynchedEntityData.defineId(Rodling.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Integer> ATTACK_TYPE = SynchedEntityData.defineId(Rodling.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Integer> SHIELDS = SynchedEntityData.defineId(Rodling.class, EntityDataSerializers.INT);
   private static final EntityDataAccessor<Boolean> SOUL = SynchedEntityData.defineId(Rodling.class, EntityDataSerializers.BOOLEAN);
   private static final EntityDataAccessor<Float> AMOUNT_TO_HEAL = SynchedEntityData.defineId(Rodling.class, EntityDataSerializers.FLOAT);
   private static final EntityDataAccessor<Byte> FLAGS = SynchedEntityData.defineId(Rodling.class, EntityDataSerializers.BYTE);
   protected static final EntityDataAccessor<Byte> COLOR_ID = SynchedEntityData.defineId(Rodling.class, EntityDataSerializers.BYTE);
   public int regenerateShieldTick;
   public int regenerateShieldTime = 150;
   public final AnimationState noveltyAnimation = new AnimationState();
   public final AnimationState shootAnimation = new AnimationState();
   public int shootAnimationTick;
   public int shootAnimationLength = 22;
   public int shootAnimationActionPoint = 7;
   public int noveltyAnimationTick;
   public int noveltyAnimationLength = 30;
   public SimpleContainer inventory;

   public Rodling(EntityType<? extends Rodling> p_i50189_1_, Level p_i50189_2_) {
      super(p_i50189_1_, p_i50189_2_);
      this.setTame(false, false);
      this.setPathfindingMalus(PathType.WATER, -1.0F);
      this.setPathfindingMalus(PathType.LAVA, 8.0F);
      this.setPathfindingMalus(PathType.FIRE_IN_NEIGHBOR, 0.0F);
      this.setPathfindingMalus(PathType.FIRE, 0.0F);
      this.setPathfindingMalus(PathType.POWDER_SNOW, -1.0F);
      this.setPathfindingMalus(PathType.POWDER_SNOW, -1.0F);
      this.moveControl = new FlyingMoveControl(this, 20, true);
      this.createInventory();
   }

   protected void registerGoals() {
      if (this.isTame()) {
         this.registerTamedGoals();
      } else {
         this.registerHostileGoals();
      }
   }

   protected void reassessTameGoals() {
      if (this.isTame()) {
         this.registerTamedGoals();
      } else {
         this.registerHostileGoals();
      }
   }

   protected void registerHostileGoals() {
      this.goalSelector.removeAllGoals(g -> true);
      this.targetSelector.removeAllGoals(g -> true);
      this.goalSelector.addGoal(0, new Rodling.RemainStationaryGoal());
      this.goalSelector.addGoal(5, new Rodling.ShootAttackGoal(this));
      this.goalSelector
         .addGoal(
            6,
            new ApproachTargetGoal(
               this,
               (Double)RodlingCommonConfig.hostile_following_target_distance.get(),
               (Double)RodlingCommonConfig.hostile_following_movement_speed_multiplier.get(),
               true
            )
         );
      this.goalSelector.addGoal(7, new LookAtTargetGoal(this));
      this.goalSelector.addGoal(9, new WaterAvoidingRandomStrollGoal(this, 1.0));
      this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, Player.class, 20.0F));
      this.goalSelector.addGoal(11, new LookAtPlayerGoal(this, Mob.class, 10.0F));
      this.goalSelector.addGoal(12, new RandomLookAroundGoal(this));
      this.targetSelector.addGoal(1, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]).setUnseenMemoryTicks(6000));
      if ((Boolean)RodlingCommonConfig.hostile_attacks_players.get() && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mutants_attack_players_off.get()) {
         this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, true).setUnseenMemoryTicks(6000));
      }

      this.targetSelector
         .addGoal(
            3,
            new NearestAttackableTargetGoal(
               this, LivingEntity.class, 20, false, false, (entity, level) -> entity.is(TagInit.EntityTypes.HOSTILE_RODLING_TARGETS)
            )
         );
   }

   protected void registerTamedGoals() {
      this.goalSelector.removeAllGoals(g -> true);
      this.targetSelector.removeAllGoals(g -> true);
      this.goalSelector.addGoal(0, new Rodling.RemainStationaryGoal());
      this.goalSelector
         .addGoal(
            4,
            new FollowOwnerGoal(
               this,
               (Double)RodlingCommonConfig.tamed_follow_owner_movement_speed_multiplier.get(),
               ((Double)RodlingCommonConfig.tamed_follow_owner_start_min_distance.get()).floatValue(),
               ((Double)RodlingCommonConfig.tamed_follow_owner_stop_max_distance.get()).floatValue()
            ) {
               public boolean canUse() {
                  return Rodling.this.getFollowType() == Rodling.FollowType.FOLLOW && super.canUse();
               }

               public boolean canContinueToUse() {
                  return Rodling.this.getFollowType() == Rodling.FollowType.FOLLOW && super.canContinueToUse();
               }
            }
         );
      this.goalSelector.addGoal(5, new Rodling.ShootAttackGoal(this));
      this.goalSelector
         .addGoal(
            6,
            new ApproachTargetGoal(
               this,
               (Double)RodlingCommonConfig.tamed_follow_target_wanted_distance.get(),
               (Double)RodlingCommonConfig.tamed_following_movement_speed_multiplier.get(),
               true
            )
         );
      this.goalSelector.addGoal(7, new LookAtTargetGoal(this));
      this.goalSelector.addGoal(9, new WaterAvoidingRandomStrollGoal(this, 1.0));
      this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, Player.class, 20.0F));
      this.goalSelector.addGoal(11, new LookAtPlayerGoal(this, Mob.class, 10.0F));
      this.goalSelector.addGoal(12, new RandomLookAroundGoal(this));
      this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
      this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
      this.targetSelector.addGoal(3, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]).setUnseenMemoryTicks(6000));
      this.targetSelector
         .addGoal(
            4,
            new NearestAttackableTargetGoal<>(
               this,
               LivingEntity.class,
               20,
               false,
               false,
               (entity, level) -> this.getAttackType() == Rodling.AttackType.SIGHT
                  ? entity.is(TagInit.EntityTypes.TAMED_RODLING_TARGETS) || entity instanceof Enemy
                  : false
            )
         );
   }

   public static Builder createConfiguredAttributes() {
      return Mob.createMobAttributes()
         .add(Attributes.MAX_HEALTH, (Double)RodlingCommonConfig.hostile_max_health.get())
         .add(Attributes.ARMOR, (Double)RodlingCommonConfig.hostile_armour.get())
         .add(Attributes.ARMOR_TOUGHNESS, (Double)RodlingCommonConfig.hostile_armour_toughness.get())
         .add(Attributes.KNOCKBACK_RESISTANCE, (Double)RodlingCommonConfig.hostile_knockback_resistance.get())
         .add(Attributes.FOLLOW_RANGE, (Double)RodlingCommonConfig.hostile_follow_range.get())
         .add(Attributes.MOVEMENT_SPEED, (Double)RodlingCommonConfig.hostile_movement_speed.get())
         .add(Attributes.FLYING_SPEED, (Double)RodlingCommonConfig.hostile_movement_speed.get());
   }

   @Override
   public void setTame(boolean p_21836_, boolean includeSideEffects) {
      super.setTame(p_21836_, includeSideEffects);
      if (p_21836_) {
         this.getAttribute(Attributes.MAX_HEALTH).setBaseValue((Double)RodlingCommonConfig.tamed_max_health.get());
         this.getAttribute(Attributes.ARMOR).setBaseValue((Double)RodlingCommonConfig.tamed_armour.get());
         this.getAttribute(Attributes.ARMOR_TOUGHNESS).setBaseValue((Double)RodlingCommonConfig.tamed_armour_toughness.get());
         this.getAttribute(Attributes.KNOCKBACK_RESISTANCE).setBaseValue((Double)RodlingCommonConfig.tamed_knockback_resistance.get());
         this.getAttribute(Attributes.FOLLOW_RANGE).setBaseValue((Double)RodlingCommonConfig.tamed_follow_range.get());
         this.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((Double)RodlingCommonConfig.tamed_movement_speed.get());
         this.getAttribute(Attributes.FLYING_SPEED).setBaseValue((Double)RodlingCommonConfig.tamed_movement_speed.get());
      } else {
         this.getAttribute(Attributes.MAX_HEALTH).setBaseValue((Double)RodlingCommonConfig.hostile_max_health.get());
         this.getAttribute(Attributes.ARMOR).setBaseValue((Double)RodlingCommonConfig.hostile_armour.get());
         this.getAttribute(Attributes.ARMOR_TOUGHNESS).setBaseValue((Double)RodlingCommonConfig.hostile_armour_toughness.get());
         this.getAttribute(Attributes.KNOCKBACK_RESISTANCE).setBaseValue((Double)RodlingCommonConfig.hostile_knockback_resistance.get());
         this.getAttribute(Attributes.FOLLOW_RANGE).setBaseValue((Double)RodlingCommonConfig.hostile_follow_range.get());
         this.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((Double)RodlingCommonConfig.hostile_movement_speed.get());
         this.getAttribute(Attributes.FLYING_SPEED).setBaseValue((Double)RodlingCommonConfig.hostile_movement_speed.get());
      }
   }

   public boolean canAttack(LivingEntity target) {
      return this.canTarget(target) && super.canAttack(target);
   }

   boolean canTarget(Entity target) {
      if (this.getAttackType() == Rodling.AttackType.NONE) {
         return false;
      } else {
         return !this.isTame() && MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.HOSTILE_RODLING_CANT_TARGET, this, target, this, null)
            ? true
            : this.isTame() && MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.TAMED_RODLING_CANT_TARGET, this, target, this, null);
      }
   }

   public boolean shouldBeStationary() {
      return this.getFollowType() == Rodling.FollowType.SIT;
   }

   protected PathNavigation createNavigation(Level p_218342_) {
      FlyingPathNavigation flyingpathnavigation = new FlyingPathNavigation(this, p_218342_);
      flyingpathnavigation.setCanOpenDoors(false);
      flyingpathnavigation.setCanFloat(true);
      return flyingpathnavigation;
   }

   public void travel(Vec3 p_218382_) {
      if (this.isEffectiveAi() || this.isLocalInstanceAuthoritative()) {
         if (this.isInWater()) {
            this.moveRelative(0.02F, p_218382_);
            this.move(MoverType.SELF, this.getDeltaMovement());
            this.setDeltaMovement(this.getDeltaMovement().scale(0.8F));
         } else if (this.isInLava()) {
            this.moveRelative(0.02F, p_218382_);
            this.move(MoverType.SELF, this.getDeltaMovement());
            this.setDeltaMovement(this.getDeltaMovement().scale(0.5));
         } else {
            this.moveRelative(this.getSpeed(), p_218382_);
            this.move(MoverType.SELF, this.getDeltaMovement());
            this.setDeltaMovement(this.getDeltaMovement().scale(0.91F));
         }
      }

      this.calculateEntityAnimation(false);
   }

   protected void updateAnimations() {
      this.noveltyAnimation.animateWhen(this.noveltyAnimationTick > 0, this.tickCount);
      this.shootAnimation.animateWhen(this.shootAnimationTick > 0, this.tickCount);
   }

   public void tickDownAnimTimers() {
      if (this.noveltyAnimationTick > 0) {
         this.noveltyAnimationTick--;
      }

      if (this.shootAnimationTick > 0) {
         this.shootAnimationTick--;
      }
   }

   protected int getInventorySize() {
      return 4;
   }

   protected void createInventory() {
      SimpleContainer simplecontainer = this.inventory;
      // 26.x SimpleContainer has no listeners; setChanged is the hook
      this.inventory = new SimpleContainer(this.getInventorySize()) {
         @Override
         public void setChanged() {
            super.setChanged();
            Rodling.this.containerChanged(this);
         }
      };
      if (simplecontainer != null) {
         int i = Math.min(simplecontainer.getContainerSize(), this.inventory.getContainerSize());

         for (int j = 0; j < i; j++) {
            ItemStack itemstack = simplecontainer.getItem(j);
            if (!itemstack.isEmpty()) {
               this.inventory.setItem(j, itemstack.copy());
            }
         }
      }

   }


   public boolean hasInventoryChanged(Container p_149512_) {
      return this.inventory != p_149512_;
   }

   protected void updateContainerEquipment() {
      if (!this.level().isClientSide()) {
         this.setFlag(2, !this.inventory.getItem(0).isEmpty());
         this.setFlag(4, !this.inventory.getItem(1).isEmpty());
         this.setFlag(8, !this.inventory.getItem(2).isEmpty());
         this.setFlag(16, !this.inventory.getItem(3).isEmpty());
      }
   }

   public void containerChanged(Container container) {
      if (!this.level().isClientSide()) {
         boolean hadHelmet = this.hasArmour();
         boolean hadShields = this.hasShields();
         boolean hadCosmeticItem = this.hasCosmeticItem();
         this.updateContainerEquipment();
         if (this.tickCount > 20 && !hadHelmet && this.hasArmour()) {
            this.playSound(SoundEventInit.RODLING_EQUIP_ARMOUR, 1.5F, this.getVoicePitch());
         }

         if (this.tickCount > 20 && !hadShields && this.hasShields()) {
            this.playSound(SoundEventInit.RODLING_EQUIP_SHIELDS, 1.5F, this.getVoicePitch());
         }

         if (this.tickCount > 20 && !hadCosmeticItem && this.hasCosmeticItem()) {
            if (this.inventory.getItem(3).is(TagInit.Items.CONVERTS_RODLINGS_TO_SOUL)) {
               this.playSound(SoundEventInit.RODLING_TRANSFORM_SOUL, this.getSoundVolume(), this.getVoicePitch());

               for (int i = 0; i < 5; i++) {
                  ((ServerLevel)this.level())
                     .sendParticles(ParticleTypes.SOUL_FIRE_FLAME, this.getRandomX(1.0), this.getRandomY(), this.getRandomZ(1.0), 1, 0.0, 0.0, 0.0, 0.0);
               }

               this.setSoul(true);
            } else if (this.inventory.getItem(3).is(TagInit.Items.CONVERTS_RODLINGS_TO_NORMAL)) {
               this.playSound(SoundEventInit.RODLING_TRANSFORM_BLAZE, this.getSoundVolume(), this.getVoicePitch());

               for (int i = 0; i < 5; i++) {
                  ((ServerLevel)this.level())
                     .sendParticles(ParticleTypes.FLAME, this.getRandomX(1.0), this.getRandomY(), this.getRandomZ(1.0), 1, 0.0, 0.0, 0.0, 0.0);
               }

               this.setSoul(false);
            } else if (this.inventory.getItem(3).is(TagInit.Items.REMOVES_DYE_FROM_RODLINGS)) {
               for (int i = 0; i < 5; i++) {
                  ((ServerLevel)this.level())
                     .sendParticles(ParticleTypes.CRIT, this.getRandomX(1.0), this.getRandomY(), this.getRandomZ(1.0), 1, 0.0, 0.0, 0.0, 0.0);
               }

               this.setColor(null);
            } else if (this.inventory.getItem(3).has(DataComponents.DYE)) {
               for (int i = 0; i < 5; i++) {
                  ((ServerLevel)this.level())
                     .sendParticles(ParticleTypes.HAPPY_VILLAGER, this.getRandomX(1.0), this.getRandomY(), this.getRandomZ(1.0), 1, 0.0, 0.0, 0.0, 0.0);
               }

               this.setColor(this.inventory.getItem(3).get(DataComponents.DYE));
            }

            this.inventory.getItem(3).shrink(1);
         }
      }
   }

   public boolean hasArmour() {
      return this.getFlag(2);
   }

   public boolean hasShields() {
      return this.getFlag(4);
   }

   public boolean hasFood() {
      return this.getFlag(8);
   }

   public boolean hasCosmeticItem() {
      return this.getFlag(16);
   }

   public boolean griefing() {
      return this.getFlag(32);
   }

   public boolean alwaysShowsName() {
      return this.getFlag(64);
   }

   public boolean smokeParticles() {
      return this.getFlag(128);
   }


   protected float getSoundVolume() {
      return this.isTame() ? 0.5F : super.getSoundVolume();
   }

   protected SoundEvent getAmbientSound() {
      return this.isTame() ? SoundEventInit.RODLING_IDLE : SoundEventInit.RODLING_IDLE_HOSTILE;
   }

   protected SoundEvent getHurtSound(DamageSource p_21239_) {
      return SoundEventInit.RODLING_HURT;
   }

   protected SoundEvent getDeathSound() {
      return SoundEventInit.RODLING_DEATH;
   }

   public int getAmbientSoundInterval() {
      return !this.isTame() ? 60 : 120;
   }

   @Override
   public boolean hurtServer(ServerLevel level, DamageSource p_27567_, float p_27568_) {
      if (this.hasShields()
         && this.getShields() > 0
         && !p_27567_.is(DamageTypes.GENERIC_KILL)
         && !p_27567_.is(DamageTypes.FELL_OUT_OF_WORLD)
         && !this.isInvulnerableTo(level, p_27567_)) {
         Entity entity1 = p_27567_.getEntity();
         if (entity1 != null) {
            if (entity1 instanceof LivingEntity && !p_27567_.is(DamageTypeTags.NO_ANGER)) {
               this.setLastHurtByMob((LivingEntity)entity1);
            }

            if (entity1 instanceof Player player) {
               this.setLastHurtByPlayer(player, 100);
            } else if (entity1 instanceof TamableAnimal tamableEntity && tamableEntity.isTame() && tamableEntity.getOwner() instanceof Player owner) {
               this.setLastHurtByPlayer(owner, 100);
            }
         }

         this.setInvulnerableTime(20);
         this.breakShield();
         return false;
      } else {
         return this.hasArmour() && !p_27567_.is(DamageTypeTags.BYPASSES_ARMOR)
            ? super.hurtServer(level, p_27567_, p_27568_ / 2.0F)
            : super.hurtServer(level, p_27567_, p_27568_);
      }
   }

   protected void defineSynchedData(SynchedEntityData.Builder builder) {
      super.defineSynchedData(builder);
      builder.define(FOLLOW_TYPE, 0);
      builder.define(ATTACK_TYPE, 0);
      builder.define(SHIELDS, 2);
      builder.define(SOUL, false);
      builder.define(FLAGS, (byte)0);
      builder.define(AMOUNT_TO_HEAL, 0.0F);
      builder.define(COLOR_ID, (byte)16);
      this.setFlag(32, true);
      this.setFlag(128, true);
   }

   protected void addAdditionalSaveData(ValueOutput tag) {
      super.addAdditionalSaveData(tag);
      tag.putInt("FollowType", this.getFollowType().ordinal());
      tag.putInt("AttackType", this.getAttackType().ordinal());
      tag.putBoolean("Griefing", this.griefing());
      tag.putBoolean("AlwaysShowsName", this.alwaysShowsName());
      tag.putBoolean("SmokeParticles", this.smokeParticles());
      tag.putBoolean("Soul", this.isSoul());
      tag.putInt("Shields", this.getShields());
      tag.putFloat("AmountToHeal", this.getAmountToHeal());
      tag.putByte("Color", (Byte)this.entityData.get(COLOR_ID));
      if (!this.inventory.getItem(0).isEmpty()) {
         tag.store("HelmetItem", ItemStack.CODEC, this.inventory.getItem(0));
      }

      if (!this.inventory.getItem(1).isEmpty()) {
         tag.store("ShieldsItem", ItemStack.CODEC, this.inventory.getItem(1));
      }

      if (!this.inventory.getItem(2).isEmpty()) {
         tag.store("FoodItem", ItemStack.CODEC, this.inventory.getItem(2));
      }

      if (!this.inventory.getItem(3).isEmpty()) {
         tag.store("DyeItem", ItemStack.CODEC, this.inventory.getItem(3));
      }
   }

   protected void readAdditionalSaveData(ValueInput tag) {
      super.readAdditionalSaveData(tag);
      this.setFollowType(Rodling.FollowType.values()[tag.getIntOr("FollowType", 0)]);
      this.setAttackType(Rodling.AttackType.values()[tag.getIntOr("AttackType", 0)]);
      this.setFlag(32, tag.getBooleanOr("Griefing", false));
      this.setFlag(64, tag.getBooleanOr("AlwaysShowsName", false));
      this.setFlag(128, tag.getBooleanOr("SmokeParticles", false));
      this.setSoul(tag.getBooleanOr("Soul", false));
      this.setShields(tag.getIntOr("Shields", 0));
      this.setAmountToHeal(tag.getFloatOr("AmountToHeal", 0));
      this.entityData.set(COLOR_ID, tag.getByteOr("Color", (byte)16));

      tag.read("HelmetItem", ItemStack.CODEC).ifPresent(stack -> this.inventory.setItem(0, stack));

      tag.read("ShieldsItem", ItemStack.CODEC).ifPresent(stack -> this.inventory.setItem(1, stack));

      tag.read("FoodItem", ItemStack.CODEC).ifPresent(stack -> this.inventory.setItem(2, stack));

      tag.read("DyeItem", ItemStack.CODEC).ifPresent(stack -> this.inventory.setItem(3, stack));

      this.updateContainerEquipment();
   }

   public boolean getFlag(int flag) {
      return ((Byte)this.entityData.get(FLAGS) & flag) != 0;
   }

   public void setFlag(int flag, boolean value) {
      byte b0 = (Byte)this.entityData.get(FLAGS);
      if (value) {
         this.entityData.set(FLAGS, (byte)(b0 | flag));
      } else {
         this.entityData.set(FLAGS, (byte)(b0 & ~flag));
      }
   }

   private void setColor(DyeColor p_149778_) {
      if (p_149778_ == null) {
         this.entityData.set(COLOR_ID, (byte)16);
      } else {
         this.entityData.set(COLOR_ID, (byte)p_149778_.getId());
      }
   }

   @Nullable
   public DyeColor getColor() {
      byte b0 = (Byte)this.entityData.get(COLOR_ID);
      return b0 != 16 && b0 <= 15 ? DyeColor.byId(b0) : null;
   }

   public boolean isSoul() {
      return (Boolean)this.entityData.get(SOUL);
   }

   public void setSoul(boolean value) {
      this.entityData.set(SOUL, value);
   }

   public float getAmountToHeal() {
      return (Float)this.entityData.get(AMOUNT_TO_HEAL);
   }

   public void setAmountToHeal(float value) {
      this.entityData.set(AMOUNT_TO_HEAL, value);
   }

   public Rodling.FollowType getFollowType() {
      return Rodling.FollowType.values()[this.entityData.get(FOLLOW_TYPE)];
   }

   public void setFollowType(Rodling.FollowType value) {
      this.entityData.set(FOLLOW_TYPE, value.ordinal());
   }

   public Rodling.AttackType getAttackType() {
      return Rodling.AttackType.values()[this.entityData.get(ATTACK_TYPE)];
   }

   public void setAttackType(Rodling.AttackType value) {
      this.entityData.set(ATTACK_TYPE, value.ordinal());
   }

   public int getShields() {
      return Mth.clamp((Integer)this.entityData.get(SHIELDS), 0, 2);
   }

   public void setShields(int p_191997_1_) {
      this.entityData.set(SHIELDS, p_191997_1_);
   }

   public boolean isSensitiveToWater() {
      return !this.hasArmour();
   }

   public void aiStep() {
      if (this.level().isClientSide() && this.smokeParticles()) {
         this.level().addParticle(ParticleTypes.SMOKE, this.getRandomX(0.5), this.getRandomY(), this.getRandomZ(0.5), 0.0, 0.0, 0.0);
      }

      super.aiStep();
   }

   public void tick() {
      super.tick();
      if (this.level().isClientSide()) {
         this.updateAnimations();
      }
   }

   public void baseTick() {
      super.baseTick();
      this.tickDownAnimTimers();
      if (!this.isTame()) {
         this.xpReward = (Integer)RodlingCommonConfig.hostile_exp_reward.get();
         this.regenerateShieldTime = (Integer)RodlingCommonConfig.hostile_shield_regenerate_speed.get();
      } else {
         this.xpReward = 0;
         this.regenerateShieldTime = (Integer)RodlingCommonConfig.tamed_shield_regenerate_speed.get();
      }

      if (this.hasShields() && this.getShields() < 2 && this.regenerateShieldTick > 0) {
         this.regenerateShieldTick--;
         if (this.regenerateShieldTick == 0) {
            this.regenerateShield();
         }
      }

      if (this.getFollowType() == Rodling.FollowType.SIT) {
         if (this.onGround()) {
            this.setDeltaMovement(0.0, 0.0, 0.0);
         } else {
            this.setDeltaMovement(this.getDeltaMovement().add(0.0, -0.1, 0.0));
         }
      }

      Vec3 velocity = this.getDeltaMovement();
      float groundSpeed = Mth.sqrt((float)(velocity.x * velocity.x + velocity.z * velocity.z));
      if (!this.level().isClientSide()
         && groundSpeed <= 0.1F
         && this.noveltyAnimationTick <= 0
         && this.random.nextInt(400) == 0
         && (this.getTarget() == null || this.getTarget().isDeadOrDying() || this.getTarget().isRemoved())) {
         this.noveltyAnimationTick = this.noveltyAnimationLength;
         this.level().broadcastEntityEvent(this, (byte)4);
      }

      if (this.getHealth() < this.getMaxHealth()) {
         if (this.getAmountToHeal() > 0.0F) {
            float healSpeed = this.healAmount() / ((Integer)RodlingCommonConfig.tamed_heal_time.get()).intValue();
            this.setAmountToHeal(this.getAmountToHeal() - healSpeed);
            this.heal(healSpeed);
         } else if (this.hasFood()) {
            if (!this.level().isClientSide()) {
               this.inventory.getItem(2).shrink(1);
            }

            this.setAmountToHeal(this.healAmount());
            this.playSound(SoundEventInit.RODLING_HEAL, this.getSoundVolume() / 2.0F, this.getVoicePitch());
            this.updateContainerEquipment();
            this.level().addParticle(ParticleTypes.HEART, this.getRandomX(0.5), this.getEyeY(), this.getRandomZ(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public float healAmount() {
      return this.getMaxHealth() * (((Integer)RodlingCommonConfig.tamed_fed_heal_percent.get()).floatValue() / 100.0F);
   }

   public void breakShield() {
      this.regenerateShieldTick = this.regenerateShieldTime;
      this.setShields(this.getShields() - 1);
      this.playSound(SoundEventInit.RODLING_SHIELD_BREAK, this.getSoundVolume(), this.getVoicePitch());
   }

   public void regenerateShield() {
      this.setShields(this.getShields() + 1);
      this.playSound(SoundEventInit.RODLING_REGENERATE_SHIELD, this.getSoundVolume(), this.getVoicePitch());
      this.regenerateShieldTick = this.regenerateShieldTime;
   }

   public void handleEntityEvent(byte p_28844_) {
      if (p_28844_ == 4) {
         this.noveltyAnimationTick = this.noveltyAnimationLength;
      } else if (p_28844_ == 11) {
         this.shootAnimationTick = this.shootAnimationLength;
      } else {
         super.handleEntityEvent(p_28844_);
      }
   }


   public boolean causeFallDamage(float p_148989_, float p_148990_, DamageSource p_148991_) {
      return false;
   }

   protected void checkFallDamage(double p_29370_, boolean p_29371_, BlockState p_29372_, BlockPos p_29373_) {
   }

   public boolean canMate(Animal p_29381_) {
      return false;
   }

   @Nullable
   public AgeableMob getBreedOffspring(ServerLevel p_148993_, AgeableMob p_148994_) {
      return null;
   }

   public boolean isFood(ItemStack p_27600_) {
      return false;
   }

   public boolean canBreed() {
      return false;
   }

   protected void playBlockFallSound() {
   }

   protected void playStepSound(BlockPos p_20135_, BlockState p_20136_) {
   }

   public enum AttackType {
      PROVOKED(Component.translatable("gui.mutantmore.rodling_checker.attack_provoked")),
      SIGHT(Component.translatable("gui.mutantmore.rodling_checker.attack_sight")),
      NONE(Component.translatable("gui.mutantmore.rodling_checker.attack_none"));

      public Component title;

      AttackType(Component title) {
         this.title = title;
      }

      public Rodling.AttackType scroll() {
         int i = this.ordinal() + 1;
         if (i < 0) {
            i = values().length - 1;
         }

         if (i > values().length - 1) {
            i = 0;
         }

         return values()[i];
      }
   }

   public enum FollowType {
      FOLLOW(Component.translatable("gui.mutantmore.rodling_checker.follow_follow")),
      SIT(Component.translatable("gui.mutantmore.rodling_checker.follow_sit")),
      WANDER(Component.translatable("gui.mutantmore.rodling_checker.follow_wander"));

      public Component title;

      FollowType(Component title) {
         this.title = title;
      }

      public Rodling.FollowType scroll() {
         int i = this.ordinal() + 1;
         if (i < 0) {
            i = values().length - 1;
         }

         if (i > values().length - 1) {
            i = 0;
         }

         return values()[i];
      }
   }

   class RemainStationaryGoal extends Goal {
      public RemainStationaryGoal() {
         this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK, Flag.TARGET, Flag.JUMP));
      }

      public boolean canUse() {
         return Rodling.this.shouldBeStationary();
      }
   }

   class ShootAttackGoal extends Goal {
      public Rodling mob;
      @Nullable
      public LivingEntity target;
      public int nextUseTime;

      public ShootAttackGoal(Rodling mob) {
         this.setFlags(EnumSet.of(Flag.MOVE, Flag.JUMP, Flag.LOOK));
         this.mob = mob;
         this.target = mob.getTarget();
      }

      public boolean isInterruptable() {
         return this.mob.shouldBeStationary();
      }

      public boolean requiresUpdateEveryTick() {
         return true;
      }

      public boolean canUse() {
         this.target = this.mob.getTarget();
         double distance = this.mob.isTame()
            ? (Double)RodlingCommonConfig.tamed_shoot_max_distance.get()
            : (Double)RodlingCommonConfig.hostile_shoot_max_distance.get();
         return this.target != null
            && !this.target.isRemoved()
            && !this.target.isDeadOrDying()
            && this.mob.tickCount >= this.nextUseTime
            && this.mob.hasLineOfSight(this.target)
            && this.mob.distanceTo(this.target) <= distance
            && this.animationsUseable();
      }

      public boolean canContinueToUse() {
         return this.target != null && !this.target.isRemoved() && !this.target.isDeadOrDying() && !this.animationsUseable();
      }

      public void start() {
         this.mob.shootAnimationTick = this.mob.shootAnimationLength;
         this.mob.level().broadcastEntityEvent(this.mob, (byte)11);
         this.mob.playSound(SoundEventInit.RODLING_CHARGE_SHOT, this.mob.getSoundVolume(), 1.0F);
      }

      public void tick() {
         this.target = this.mob.getTarget();
         this.mob.getNavigation().stop();
         if (this.mob.shootAnimationTick == this.mob.shootAnimationLength - 5) {
            ((ServerLevel)this.mob.level())
               .sendParticles(
                  new AdvancedParticleOption(ParticleTypeInit.RODLING_CHARGE_SHOT, List.of((float)this.mob.getId(), 0.0F, this.mob.getBbHeight() * 0.45F, 0.0F)),
                  this.mob.getX(),
                  this.mob.getY(0.45),
                  this.mob.getZ(),
                  1,
                  0.0,
                  0.0,
                  0.0,
                  0.0
               );
         }

         if (this.target != null) {
            this.mob.getLookControl().setLookAt(this.target);
            double d1 = this.target.getX() - this.mob.getX();
            double d2 = this.target.getY(0.5) - this.mob.getY(0.5);
            double d3 = this.target.getZ() - this.mob.getZ();
            if (this.mob.shootAnimationTick == this.mob.shootAnimationActionPoint) {
               RodlingFireball fireball = new RodlingFireball(this.mob.level(), this.mob, d1, d2, d3);
               if (this.mob.isTame()) {
                  fireball.damage = ((Double)RodlingCommonConfig.tamed_fireball_damage.get()).floatValue();
                  fireball.fireLength = (Integer)RodlingCommonConfig.tamed_fireball_fire_length.get();
                  fireball.griefing = this.mob.griefing();
                  fireball.ignoresInvulTime = (Boolean)RodlingCommonConfig.tamed_ignores_invulnerability_time.get();
               } else {
                  fireball.damage = ((Double)RodlingCommonConfig.hostile_fireball_damage.get()).floatValue();
                  fireball.fireLength = (Integer)RodlingCommonConfig.hostile_fireball_fire_length.get();
                  fireball.griefing = (Boolean)RodlingCommonConfig.hostile_fireball_griefing.get()
                     && !(Boolean)MutantMoreGroupedOptionsCommonConfig.mob_griefing_off.get();
                  fireball.ignoresInvulTime = (Boolean)RodlingCommonConfig.hostile_ignores_invulnerability_time.get();
               }

               fireball.setPos(fireball.getX(), this.mob.getY(0.5), fireball.getZ());
               this.mob.level().addFreshEntity(fireball);
               this.mob.playSound(SoundEventInit.RODLING_SHOOT, this.mob.getSoundVolume(), this.mob.getVoicePitch());
            }
         }
      }

      public void stop() {
         this.nextUseTime = this.mob.tickCount + 20;
      }

      public boolean animationsUseable() {
         return this.mob.shootAnimationTick <= 0;
      }
   }
}
