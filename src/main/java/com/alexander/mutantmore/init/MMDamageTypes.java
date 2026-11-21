package com.alexander.mutantmore.init;

import org.jspecify.annotations.Nullable;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class MMDamageTypes {
   private static final ResourceKey<DamageType> HEAT = register("heat");
   private static final ResourceKey<DamageType> POISON_CLOUD = register("poison_cloud");
   private static final ResourceKey<DamageType> RIB_CRUSH = register("rib_crush");
   private static final ResourceKey<DamageType> WITHER_SLASH = register("wither_slash");
   private static final ResourceKey<DamageType> FIRE_RESISTANCE_BYPASSING_FIREBALL = register("fire_resistance_bypassing_fireball");
   private static final ResourceKey<DamageType> MUTANT_BLAZE_ROD_PROJECTILE = register("mutant_blaze_rod_projectile");
   private static final ResourceKey<DamageType> MUTANT_SHULKER_BULLET = register("mutant_shulker_bullet");
   private static final ResourceKey<DamageType> SAND_BOULDER = register("sand_boulder");
   private static final ResourceKey<DamageType> ICICLE = register("icicle");
   private static final ResourceKey<DamageType> MUTANT_SHULKER_BITE = register("mutant_shulker_bite");
   private static final ResourceKey<DamageType> CANT_AVOID = register("cant_avoid");
   private static final ResourceKey<DamageType> EARTHQUAKE_ATTACK = register("earthquake_attack");
   private static final ResourceKey<DamageType> MUTANT_SHULKER_ANVIL_CRUSH = register("mutant_shulker_anvil_crush");
   private static final ResourceKey<DamageType> MUTANT_SHULKER_TRAP = register("mutant_shulker_trap");
   private static final ResourceKey<DamageType> GEYSER = register("geyser");
   private static final ResourceKey<DamageType> STRANGLE = register("strangle");

   private static ResourceKey<DamageType> register(String name) {
      return ResourceKey.create(Registries.DAMAGE_TYPE, Identifier.fromNamespaceAndPath("mutantmore", name));
   }

   public static DamageSource heat(DamageSources sources) {
      return source(sources, HEAT);
   }

   public static DamageSource poisonCloud(DamageSources sources) {
      return source(sources, POISON_CLOUD);
   }

   public static DamageSource ribCrushAttack(DamageSources sources, LivingEntity p_19371_) {
      return source(sources, RIB_CRUSH, p_19371_);
   }

   public static DamageSource witherSlashAttack(DamageSources sources, Entity p_19341_, @Nullable Entity p_19342_) {
      return source(sources, WITHER_SLASH, p_19341_, p_19342_);
   }

   public static DamageSource fireResBypassingFireball(DamageSources sources, Entity p_19341_, @Nullable Entity p_19342_) {
      return source(sources, FIRE_RESISTANCE_BYPASSING_FIREBALL, p_19341_, p_19342_);
   }

   public static DamageSource mutantBlazeRodProjectile(DamageSources sources, Entity p_19341_, @Nullable Entity p_19342_) {
      return source(sources, MUTANT_BLAZE_ROD_PROJECTILE, p_19341_, p_19342_);
   }

   public static DamageSource mutantShulkerBulletAttack(DamageSources sources, Entity p_19341_, @Nullable Entity p_19342_) {
      return source(sources, MUTANT_SHULKER_BULLET, p_19341_, p_19342_);
   }

   public static DamageSource sandBoulderAttack(DamageSources sources, Entity p_19341_, @Nullable Entity p_19342_) {
      return source(sources, SAND_BOULDER, p_19341_, p_19342_);
   }

   public static DamageSource icicleAttack(DamageSources sources, Entity p_19341_, @Nullable Entity p_19342_) {
      return source(sources, ICICLE, p_19341_, p_19342_);
   }

   public static DamageSource mutantShulkerBiteAttack(DamageSources sources, LivingEntity p_19371_) {
      return source(sources, MUTANT_SHULKER_BITE, p_19371_);
   }

   public static DamageSource cantAvoidMobAttack(DamageSources sources, LivingEntity p_19371_) {
      return source(sources, CANT_AVOID, p_19371_);
   }

   public static DamageSource earthquakeAttack(DamageSources sources, LivingEntity p_19371_) {
      return source(sources, EARTHQUAKE_ATTACK, p_19371_);
   }

   public static DamageSource mutantShulkerAnvilCrushAttack(DamageSources sources, LivingEntity p_19371_) {
      return source(sources, MUTANT_SHULKER_ANVIL_CRUSH, p_19371_);
   }

   public static DamageSource mutantShulkerTrapAttack(DamageSources sources, LivingEntity p_19371_) {
      return source(sources, MUTANT_SHULKER_TRAP, p_19371_);
   }

   public static DamageSource geyserAttack(DamageSources sources, LivingEntity p_19371_) {
      return source(sources, GEYSER, p_19371_);
   }

   public static DamageSource strangleAttack(DamageSources sources, LivingEntity p_19371_) {
      return source(sources, STRANGLE, p_19371_);
   }

   public static DamageSource source(DamageSources sources, ResourceKey<DamageType> pDamageTypeKey) {
      return sources.source(pDamageTypeKey);
   }

   public static DamageSource source(DamageSources sources, ResourceKey<DamageType> pDamageTypeKey, @Nullable Entity pEntity) {
      return sources.source(pDamageTypeKey, pEntity);
   }

   public static DamageSource source(
      DamageSources sources, ResourceKey<DamageType> pDamageTypeKey, @Nullable Entity pCausingEntity, @Nullable Entity pDirectEntity
   ) {
      return sources.source(pDamageTypeKey, pCausingEntity, pDirectEntity);
   }
}
