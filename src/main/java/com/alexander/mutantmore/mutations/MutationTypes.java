package com.alexander.mutantmore.mutations;

import java.util.Map;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.FileToIdConverter;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.tags.TagKey;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import org.jspecify.annotations.Nullable;

/** Loaded mutation types (server side only; clients never need them). */
public final class MutationTypes {
   private static Map<Identifier, MutationType> types = Map.of();

   private MutationTypes() {
   }

   public static class ReloadListener extends SimpleJsonResourceReloadListener<MutationType> {
      public ReloadListener() {
         super(MutationType.CODEC, FileToIdConverter.json("mutation_type"));
      }

      @Override
      protected void apply(Map<Identifier, MutationType> loaded, ResourceManager manager, ProfilerFiller profiler) {
         types = Map.copyOf(loaded);
      }
   }

   /** Some mutation exists for this mob type (maybe not under the current conditions). */
   public static boolean hasMutation(LivingEntity entity) {
      return types.values().stream().anyMatch(type -> type.entityType() == entity.getType());
   }

   /** The first mutation of this mob whose conditions it meets right now, or null. */
   public static @Nullable MutationType forMob(LivingEntity entity) {
      if (!(entity.level() instanceof ServerLevel level)) {
         return null;
      }

      for (MutationType type : types.values()) {
         if (type.entityType() == entity.getType() && conditionsMet(type, entity, level)) {
            return type;
         }
      }

      return null;
   }

   private static @Nullable Identifier tagId(String id) {
      return id.isEmpty() ? null : Identifier.tryParse(id.startsWith("#") ? id.substring(1) : id);
   }

   private static boolean conditionsMet(MutationType type, LivingEntity entity, ServerLevel level) {
      FabricLoader loader = FabricLoader.getInstance();
      if (!type.requiredMods().stream().allMatch(loader::isModLoaded) || type.modsThatPreventMutation().stream().anyMatch(id -> !id.isEmpty() && loader.isModLoaded(id))) {
         return false;
      }

      if (type.minYLevel() != -456 && type.maxYLevel() != -456 && (entity.getY() < type.minYLevel() || entity.getY() > type.maxYLevel())) {
         return false;
      }

      // Biome and structure requirements: either one is enough when both are given
      Identifier biomes = tagId(type.requiredBiomes());
      Identifier structures = tagId(type.requiredStructures());
      boolean inBiome = biomes != null && level.getBiome(entity.blockPosition()).is(TagKey.create(Registries.BIOME, biomes));
      boolean inStructure = structures != null
         && level.structureManager().getStructureWithPieceAt(entity.blockPosition(), TagKey.create(Registries.STRUCTURE, structures)).isValid();
      if ((biomes != null || structures != null) && !inBiome && !inStructure) {
         return false;
      }

      // Effects: the mob must have at least one effect, and all of its effects must be in the tag
      Identifier effects = tagId(type.requiredEffects());
      if (effects != null) {
         TagKey<net.minecraft.world.effect.MobEffect> tag = TagKey.create(Registries.MOB_EFFECT, effects);
         var active = entity.getActiveEffects();
         return !active.isEmpty() && active.stream().map(MobEffectInstance::getEffect).allMatch(effect -> effect.is(tag));
      }

      return true;
   }
}
