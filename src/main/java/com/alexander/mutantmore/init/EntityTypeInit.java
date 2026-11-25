package com.alexander.mutantmore.init;

import com.alexander.mutantmore.entities.AreaDamage;
import com.alexander.mutantmore.entities.MutantBlaze;
import com.alexander.mutantmore.entities.MutantBlazeFireball;
import com.alexander.mutantmore.entities.MutantBlazeRodProjectile;
import com.alexander.mutantmore.entities.Rodling;
import com.alexander.mutantmore.entities.RodlingFireball;
import com.alexander.mutantmore.entities.CustomShulkerBullet;
import com.alexander.mutantmore.entities.MutantShulker;
import com.alexander.mutantmore.entities.MutantShulkerBullet;
import com.alexander.mutantmore.entities.MutantShulkerTrap;
import com.alexander.mutantmore.entities.MutantShulkerTurret;
import com.alexander.mutantmore.entities.GiantSnowball;
import com.alexander.mutantmore.entities.IceCube;
import com.alexander.mutantmore.entities.IcicleSpike;
import com.alexander.mutantmore.entities.MutantFrozenZombie;
import com.alexander.mutantmore.entities.ThrownIcicle;
import com.alexander.mutantmore.entities.MutantHoglin;
import com.alexander.mutantmore.entities.MutantHusk;
import com.alexander.mutantmore.entities.SandBoulder;
import com.alexander.mutantmore.entities.ZombieResurrection;
import com.alexander.mutantmore.entities.MutantJungleZombie;
import com.alexander.mutantmore.entities.SentryVine;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class EntityTypeInit {
   public static final EntityType<MutantHoglin> MUTANT_HOGLIN = register(
      "mutant_hoglin", EntityType.Builder.of(MutantHoglin::new, MobCategory.MONSTER).sized(2.9F, 3.0F).eyeHeight(2.0F).clientTrackingRange(10)
   );

   public static final EntityType<MutantJungleZombie> MUTANT_JUNGLE_ZOMBIE = register(
      "mutant_jungle_zombie", EntityType.Builder.of(MutantJungleZombie::new, MobCategory.MONSTER).sized(1.8F, 3.2F).clientTrackingRange(10)
   );
   public static final EntityType<SentryVine> SENTRY_VINE = register(
      "sentry_vine", EntityType.Builder.of(SentryVine::new, MobCategory.MISC).sized(1.25F, 3.0F)
   );
   public static final EntityType<MutantHusk> MUTANT_HUSK = register(
      "mutant_husk", EntityType.Builder.of(MutantHusk::new, MobCategory.MONSTER).sized(1.9F, 3.4F).clientTrackingRange(10)
   );
   public static final EntityType<SandBoulder> SAND_BOULDER = register(
      "sand_boulder", EntityType.Builder.<SandBoulder>of(SandBoulder::new, MobCategory.MISC).sized(1.5F, 1.5F)
   );
   public static final EntityType<ZombieResurrection> ZOMBIE_RESURRECTION = register(
      "zombie_resurrection", EntityType.Builder.<ZombieResurrection>of(ZombieResurrection::new, MobCategory.MISC).sized(0.6F, 1.95F)
   );
   public static final EntityType<MutantFrozenZombie> MUTANT_FROZEN_ZOMBIE = register(
      "mutant_frozen_zombie", EntityType.Builder.of(MutantFrozenZombie::new, MobCategory.MONSTER).sized(1.8F, 3.2F).clientTrackingRange(10)
   );
   public static final EntityType<IcicleSpike> ICICLE_SPIKE = register("icicle_spike", EntityType.Builder.<IcicleSpike>of(IcicleSpike::new, MobCategory.MISC).sized(1.6F, 2.0F));
   public static final EntityType<ThrownIcicle> THROWN_ICICLE = register("thrown_icicle", EntityType.Builder.<ThrownIcicle>of(ThrownIcicle::new, MobCategory.MISC).sized(1.0F, 1.0F));
   public static final EntityType<GiantSnowball> GIANT_SNOWBALL = register("giant_snowball", EntityType.Builder.<GiantSnowball>of(GiantSnowball::new, MobCategory.MISC).sized(1.8F, 1.8F));
   public static final EntityType<IceCube> ICE_CUBE = register("ice_cube", EntityType.Builder.<IceCube>of(IceCube::new, MobCategory.MISC).sized(1.0F, 1.0F));
   public static final EntityType<MutantShulker> MUTANT_SHULKER = register(
      "mutant_shulker", EntityType.Builder.of(MutantShulker::new, MobCategory.MONSTER).fireImmune().sized(2.75F, 2.75F).eyeHeight(1.8F).clientTrackingRange(10)
   );
   public static final EntityType<MutantShulkerTurret> MUTANT_SHULKER_TURRET = register(
      "mutant_shulker_turret", EntityType.Builder.of(MutantShulkerTurret::new, MobCategory.MISC).fireImmune().sized(1.25F, 4.25F)
   );
   public static final EntityType<MutantShulkerTrap> MUTANT_SHULKER_TRAP = register(
      "mutant_shulker_trap", EntityType.Builder.of(MutantShulkerTrap::new, MobCategory.MISC).sized(0.95F, 0.5F).fireImmune()
   );
   public static final EntityType<MutantShulkerBullet> MUTANT_SHULKER_BULLET = register(
      "mutant_shulker_bullet", EntityType.Builder.<MutantShulkerBullet>of(MutantShulkerBullet::new, MobCategory.MISC).sized(0.85F, 0.85F)
   );
   public static final EntityType<CustomShulkerBullet> CUSTOM_SHULKER_BULLET = register(
      "custom_shulker_bullet", EntityType.Builder.<CustomShulkerBullet>of(CustomShulkerBullet::new, MobCategory.MISC).sized(0.3125F, 0.3125F).clientTrackingRange(8)
   );
   public static final EntityType<MutantBlaze> MUTANT_BLAZE = register(
      "mutant_blaze", EntityType.Builder.of(MutantBlaze::new, MobCategory.MONSTER).sized(1.9F, 4.5F).fireImmune().clientTrackingRange(10)
   );
   public static final EntityType<MutantBlazeFireball> MUTANT_BLAZE_FIREBALL = register(
      "mutant_blaze_fireball", EntityType.Builder.<MutantBlazeFireball>of(MutantBlazeFireball::new, MobCategory.MISC).sized(1.0F, 1.0F)
   );
   public static final EntityType<MutantBlazeRodProjectile> MUTANT_BLAZE_ROD_PROJECTILE = register(
      "mutant_blaze_rod_projectile", EntityType.Builder.<MutantBlazeRodProjectile>of(MutantBlazeRodProjectile::new, MobCategory.MISC).sized(0.5F, 0.5F).fireImmune()
   );
   public static final EntityType<Rodling> RODLING = register("rodling", EntityType.Builder.of(Rodling::new, MobCategory.MISC).sized(0.25F, 0.65F).fireImmune());
   public static final EntityType<RodlingFireball> RODLING_FIREBALL = register(
      "rodling_fireball", EntityType.Builder.<RodlingFireball>of(RodlingFireball::new, MobCategory.MISC).sized(0.3125F, 0.3125F)
   );
   public static final EntityType<com.alexander.mutantmore.entities.MutantWitherSkeleton> MUTANT_WITHER_SKELETON = register(
      "mutant_wither_skeleton", EntityType.Builder.of(com.alexander.mutantmore.entities.MutantWitherSkeleton::new, MobCategory.MONSTER).sized(1.25F, 3.9F).fireImmune().clientTrackingRange(10)
   );
   public static final EntityType<com.alexander.mutantmore.entities.MutantWitherSkeletonBodyPart> MUTANT_WITHER_SKELETON_BODY_PART = register(
      "mutant_wither_skeleton_body_part",
      EntityType.Builder.<com.alexander.mutantmore.entities.MutantWitherSkeletonBodyPart>of(com.alexander.mutantmore.entities.MutantWitherSkeletonBodyPart::new, MobCategory.MISC).sized(0.7F, 0.7F).fireImmune().clientTrackingRange(4)
   );
   public static final EntityType<com.alexander.mutantmore.entities.WitherSlash> WITHER_SLASH = register(
      "wither_slash", EntityType.Builder.<com.alexander.mutantmore.entities.WitherSlash>of(com.alexander.mutantmore.entities.WitherSlash::new, MobCategory.MISC).sized(1.25F, 0.25F)
   );
   public static final EntityType<AreaDamage> AREA_DAMAGE = register(
      "area_damage", EntityType.Builder.<AreaDamage>of(AreaDamage::new, MobCategory.MISC).sized(1.0F, 1.0F).fireImmune().noSave()
   );

   private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
      ResourceKey<EntityType<?>> key = ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath("mutantmore", name));
      return Registry.register(BuiltInRegistries.ENTITY_TYPE, key, builder.build(key));
   }

   public static void init() {
   }
}
