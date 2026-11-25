package com.alexander.mutantmore.init;

import com.alexander.mutantmore.entities.AreaDamage;
import com.alexander.mutantmore.entities.MutantHoglin;
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
