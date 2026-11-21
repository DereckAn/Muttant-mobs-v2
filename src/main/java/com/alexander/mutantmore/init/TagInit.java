package com.alexander.mutantmore.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.structure.Structure;

public class TagInit {
   public static class Biomes {
      public static final TagKey<Biome> VANILLA_MUTANT_FROZEN_ZOMBIE_REQUIRED_BIOMES = tag("vanilla_mutant_frozen_zombie_required_biomes");
      public static final TagKey<Biome> VANILLA_MUTANT_JUNGLE_ZOMBIE_REQUIRED_BIOMES = tag("vanilla_mutant_jungle_zombie_required_biomes");

      public static TagKey<Biome> createBiomeTag(String prefix, String name) {
         return TagKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(prefix, name));
      }

      private static TagKey<Biome> tag(String name) {
         return TagKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath("mutantmore", name));
      }
   }

   public static class Blocks {
      public static final TagKey<Block> MUTANT_WITHER_SKELETON_WALKS_THROUGH = tag("mutant_wither_skeleton_walks_through");
      public static final TagKey<Block> MUTANT_SHULKER_WALKS_THROUGH = tag("mutant_shulker_walks_through");
      public static final TagKey<Block> MUTANT_BLAZE_WALKS_THROUGH = tag("mutant_blaze_walks_through");
      public static final TagKey<Block> MUTANT_HUSK_WALKS_THROUGH = tag("mutant_husk_walks_through");
      public static final TagKey<Block> MUTANT_HOGLIN_WALKS_THROUGH = tag("mutant_hoglin_walks_through");
      public static final TagKey<Block> MUTANT_HOGLIN_STOMP_BREAKS = tag("mutant_hoglin_stomp_breaks");
      public static final TagKey<Block> MUTANT_FROZEN_ZOMBIE_WALKS_THROUGH = tag("mutant_frozen_zombie_walks_through");
      public static final TagKey<Block> MUTANT_JUNGLE_ZOMBIE_WALKS_THROUGH = tag("mutant_jungle_zombie_walks_through");
      public static final TagKey<Block> MUTANT_PHANTOM_WALKS_THROUGH = tag("mutant_phantom_walks_through");
      public static final TagKey<Block> REMOVED_BY_LEAFBLOWER = tag("removed_by_leafblower");
      public static final TagKey<Block> UNBREAKABLE = tag("unbreakable");
      public static final TagKey<Block> RED_SAND = tag("red_sand");
      public static final TagKey<Block> MUTANT_SHULKER_BULLET_FLIES_THROUGH = tag("mutant_shulker_bullet_flies_through");

      private static TagKey<Block> tag(String name) {
         return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("mutantmore", name));
      }

      private static TagKey<Block> forgeTag(String name) {
         return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("c", name));
      }
   }

   public static class Effects {
      public static TagKey<MobEffect> createEffectTag(String prefix, String name) {
         return tag(prefix, name);
      }

      private static TagKey<MobEffect> tag(String prefix, String name) {
         return TagKey.create(Registries.MOB_EFFECT, Identifier.fromNamespaceAndPath(prefix, name));
      }
   }

   public static class Enchantments {
      public static final TagKey<Enchantment> HUSK_HAMMER_ENCHANTED_WITH = tag("husk_hammer_enchanted_with");
      public static final TagKey<Enchantment> HOGLANCE_ENCHANTED_WITH = tag("hoglance_enchanted_with");
      public static final TagKey<Enchantment> HOGFIST_GAUNTLET_ENCHANTED_WITH = tag("hogfist_gauntlet_enchanted_with");

      private static TagKey<Enchantment> tag(String name) {
         return TagKey.create(Registries.ENCHANTMENT, Identifier.fromNamespaceAndPath("mutantmore", name));
      }

      private static TagKey<Enchantment> forgeTag(String name) {
         return TagKey.create(Registries.ENCHANTMENT, Identifier.fromNamespaceAndPath("c", name));
      }
   }

   public static class EntityTypes {
      public static final TagKey<EntityType<?>> MUTATION_CLOUD_CANT_AIM_FOR = tag("mutation_cloud_cant_aim_for");
      public static final TagKey<EntityType<?>> CANT_BE_HEATED = tag("cant_be_heated");
      public static final TagKey<EntityType<?>> HEATSTORM_GENERATOR_CANT_HEAT = tag("heatstorm_generator_cant_heat");
      public static final TagKey<EntityType<?>> HOSTILE_RODLING_CANT_TARGET = tag("hostile_rodling_cant_target");
      public static final TagKey<EntityType<?>> HOSTILE_RODLING_FIREBALL_CANT_HIT = tag("hostile_rodling_fireball_cant_hit");
      public static final TagKey<EntityType<?>> HOSTILE_RODLING_FIREBALL_CANT_HURT = tag("hostile_rodling_fireball_cant_hurt");
      public static final TagKey<EntityType<?>> HOSTILE_RODLING_TARGETS = tag("hostile_rodling_targets");
      public static final TagKey<EntityType<?>> MUTANT_BLAZE_CANT_HEAT = tag("mutant_blaze_cant_heat");
      public static final TagKey<EntityType<?>> MUTANT_BLAZE_CANT_HURT = tag("mutant_blaze_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_BLAZE_CANT_TARGET = tag("mutant_blaze_cant_target");
      public static final TagKey<EntityType<?>> MUTANT_BLAZE_FIREBALL_CANT_HIT = tag("mutant_blaze_fireball_cant_hit");
      public static final TagKey<EntityType<?>> MUTANT_BLAZE_FIREBALL_CANT_HURT = tag("mutant_blaze_fireball_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_BLAZE_ROD_PROJECTILE_CANT_HIT = tag("mutant_blaze_rod_projectile_cant_hit");
      public static final TagKey<EntityType<?>> MUTANT_BLAZE_ROD_PROJECTILE_CANT_HURT = tag("mutant_blaze_rod_projectile_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_BLAZE_TARGETS = tag("mutant_blaze_targets");
      public static final TagKey<EntityType<?>> MUTANT_SHULKER_CANT_HURT = tag("mutant_shulker_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_SHULKER_CANT_TARGET = tag("mutant_shulker_cant_target");
      public static final TagKey<EntityType<?>> MUTANT_SHULKER_MUTANT_SHULKER_BULLET_CANT_HIT = tag("mutant_shulker_mutant_shulker_bullet_cant_hit");
      public static final TagKey<EntityType<?>> MUTANT_SHULKER_MUTANT_SHULKER_BULLET_CANT_HURT = tag("mutant_shulker_mutant_shulker_bullet_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_SHULKER_TARGETS = tag("mutant_shulker_targets");
      public static final TagKey<EntityType<?>> MUTANT_SHULKER_TRAP_CANT_HURT = tag("mutant_shulker_trap_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_SHULKER_TRAP_SHULKER_BULLET_CANT_HIT = tag("mutant_shulker_trap_shulker_bullet_cant_hit");
      public static final TagKey<EntityType<?>> MUTANT_SHULKER_TRAP_SHULKER_BULLET_CANT_HURT = tag("mutant_shulker_trap_shulker_bullet_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_SHULKER_TRAP_WONT_SNAP = tag("mutant_shulker_trap_wont_snap");
      public static final TagKey<EntityType<?>> MUTANT_SHULKER_TURRET_CANT_TARGET = tag("mutant_shulker_turret_cant_target");
      public static final TagKey<EntityType<?>> MUTANT_SHULKER_TURRET_MUTANT_SHULKER_BULLET_CANT_HIT = tag(
         "mutant_shulker_turret_mutant_shulker_bullet_cant_hit"
      );
      public static final TagKey<EntityType<?>> MUTANT_SHULKER_TURRET_MUTANT_SHULKER_BULLET_CANT_HURT = tag(
         "mutant_shulker_turret_mutant_shulker_bullet_cant_hurt"
      );
      public static final TagKey<EntityType<?>> MUTANT_SHULKER_TURRET_SHULKER_BULLET_CANT_HIT = tag("mutant_shulker_turret_shulker_bullet_cant_hit");
      public static final TagKey<EntityType<?>> MUTANT_SHULKER_TURRET_SHULKER_BULLET_CANT_HURT = tag("mutant_shulker_turret_shulker_bullet_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_SHULKER_TURRET_TARGETS = tag("mutant_shulker_turret_targets");
      public static final TagKey<EntityType<?>> MUTANT_WITHER_SKELETON_CANT_HURT = tag("mutant_wither_skeleton_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_WITHER_SKELETON_CANT_TARGET = tag("mutant_wither_skeleton_cant_target");
      public static final TagKey<EntityType<?>> MUTANT_WITHER_SKELETON_WITHER_SLASH_CANT_HIT = tag("mutant_wither_skeleton_wither_slash_cant_hit");
      public static final TagKey<EntityType<?>> MUTANT_WITHER_SKELETON_WITHER_SLASH_CANT_HURT = tag("mutant_wither_skeleton_wither_slash_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_WITHER_SKELETON_TARGETS = tag("mutant_wither_skeleton_targets");
      public static final TagKey<EntityType<?>> MUTANT_HUSK_CANT_HURT = tag("mutant_husk_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_HUSK_CANT_TARGET = tag("mutant_husk_cant_target");
      public static final TagKey<EntityType<?>> MUTANT_HUSK_TARGETS = tag("mutant_husk_targets");
      public static final TagKey<EntityType<?>> MUTANT_FROZEN_ZOMBIE_CANT_HURT = tag("mutant_frozen_zombie_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_FROZEN_ZOMBIE_CANT_TARGET = tag("mutant_frozen_zombie_cant_target");
      public static final TagKey<EntityType<?>> MUTANT_FROZEN_ZOMBIE_TARGETS = tag("mutant_frozen_zombie_targets");
      public static final TagKey<EntityType<?>> MUTANT_JUNGLE_ZOMBIE_CANT_HURT = tag("mutant_jungle_zombie_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_JUNGLE_ZOMBIE_CANT_TARGET = tag("mutant_jungle_zombie_cant_target");
      public static final TagKey<EntityType<?>> MUTANT_JUNGLE_ZOMBIE_TARGETS = tag("mutant_jungle_zombie_targets");
      public static final TagKey<EntityType<?>> MUTANT_HOGLIN_CANT_HURT = tag("mutant_hoglin_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_HOGLIN_CANT_TARGET = tag("mutant_hoglin_cant_target");
      public static final TagKey<EntityType<?>> MUTANT_HOGLIN_TARGETS = tag("mutant_hoglin_targets");
      public static final TagKey<EntityType<?>> PLAYER_WITHER_SLASH_CANT_HIT = tag("player_wither_slash_cant_hit");
      public static final TagKey<EntityType<?>> PLAYER_WITHER_SLASH_CANT_HURT = tag("player_wither_slash_cant_hurt");
      public static final TagKey<EntityType<?>> PLAYER_MUTANT_SHULKER_BULLET_CANT_HIT = tag("player_mutant_shulker_bullet_cant_hit");
      public static final TagKey<EntityType<?>> PLAYER_MUTANT_SHULKER_BULLET_CANT_HURT = tag("player_mutant_shulker_bullet_cant_hurt");
      public static final TagKey<EntityType<?>> TAMED_RODLING_CANT_TARGET = tag("tamed_rodling_cant_target");
      public static final TagKey<EntityType<?>> TAMED_RODLING_FIREBALL_CANT_HIT = tag("tamed_rodling_fireball_cant_hit");
      public static final TagKey<EntityType<?>> TAMED_RODLING_FIREBALL_CANT_HURT = tag("tamed_rodling_fireball_cant_hurt");
      public static final TagKey<EntityType<?>> TAMED_RODLING_TARGETS = tag("tamed_rodling_targets");
      public static final TagKey<EntityType<?>> WITHER_BOMB_CANT_HURT = tag("wither_bomb_cant_hurt");
      public static final TagKey<EntityType<?>> WITHER_BOMB_ISNT_TRIGGERED_BY = tag("wither_bomb_isnt_triggered_by");
      public static final TagKey<EntityType<?>> PIGLINS_THAT_ATTACK_MUTANT_WITHER_SKELETON = tag("piglins_that_attack_mutant_wither_skeleton");
      public static final TagKey<EntityType<?>> UNAFFECTED_BY_QUICKSAND = tag("unaffected_by_quicksand");
      public static final TagKey<EntityType<?>> MUTANT_HUSK_SAND_BOULDER_CANT_HIT = tag("mutant_husk_sand_boulder_cant_hit");
      public static final TagKey<EntityType<?>> MUTANT_HUSK_SAND_BOULDER_CANT_HURT = tag("mutant_husk_sand_boulder_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_FROZEN_ZOMBIE_THROWN_ICICLE_CANT_HIT = tag("mutant_frozen_zombie_thrown_icicle_cant_hit");
      public static final TagKey<EntityType<?>> MUTANT_FROZEN_ZOMBIE_THROWN_ICICLE_CANT_HURT = tag("mutant_frozen_zombie_thrown_icicle_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_FROZEN_ZOMBIE_GIANT_SNOWBALL_CANT_HIT = tag("mutant_frozen_zombie_giant_snowball_cant_hit");
      public static final TagKey<EntityType<?>> PLAYER_THROWN_ICICLE_CANT_HIT = tag("player_thrown_icicle_cant_hit");
      public static final TagKey<EntityType<?>> PLAYER_THROWN_ICICLE_CANT_HURT = tag("player_thrown_icicle_cant_hurt");
      public static final TagKey<EntityType<?>> HUSK_HAMMER_SHOCKWAVE_CANT_HURT = tag("husk_hammer_shockwave_cant_hurt");
      public static final TagKey<EntityType<?>> DESERT_HORN_CANT_HURT = tag("desert_horn_cant_hurt");
      public static final TagKey<EntityType<?>> PLAYER_SAND_BOULDER_CANT_HIT = tag("player_sand_boulder_cant_hit");
      public static final TagKey<EntityType<?>> PLAYER_SAND_BOULDER_CANT_HURT = tag("player_sand_boulder_cant_hurt");
      public static final TagKey<EntityType<?>> HOGLANCE_CHARGING_PLAYER_CANT_HURT = tag("hoglance_charging_player_cant_hurt");
      public static final TagKey<EntityType<?>> HOGFIST_GAUNTLET_STOMPING_PLAYER_CANT_HURT = tag("hogfist_gauntlet_stomping_player_cant_hurt");
      public static final TagKey<EntityType<?>> UNAFFECTED_BY_SNOWSTORMS = tag("unaffected_by_snowstorms");
      public static final TagKey<EntityType<?>> UNAFFECTED_BY_MUTANT_FROZEN_ZOMBIE_SNOWSTORMS = tag("unaffected_by_mutant_frozen_zombie_snowstorms");
      public static final TagKey<EntityType<?>> UNAFFECTED_BY_SNOWSTORM_GENERATOR_SNOWSTORMS = tag("unaffected_by_snowstorm_generator_snowstorms");
      public static final TagKey<EntityType<?>> SENTRY_VINE_CANT_HURT = tag("sentry_vine_cant_hurt");
      public static final TagKey<EntityType<?>> SENTRY_VINE_CANT_TARGET = tag("sentry_vine_cant_target");
      public static final TagKey<EntityType<?>> SENTRY_VINE_TARGETS = tag("sentry_vine_targets");
      public static final TagKey<EntityType<?>> LEAFBLOWER_CANT_AFFECT = tag("leafblower_cant_affect");
      public static final TagKey<EntityType<?>> MUTANT_PHANTOM_CANT_HURT = tag("mutant_phantom_cant_hurt");
      public static final TagKey<EntityType<?>> MUTANT_PHANTOM_CANT_TARGET = tag("mutant_phantom_cant_target");
      public static final TagKey<EntityType<?>> MUTANT_PHANTOM_TARGETS = tag("mutant_phantom_targets");

      private static TagKey<EntityType<?>> tag(String p_203849_) {
         return TagKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath("mutantmore", p_203849_));
      }
   }

   public static class Items {
      public static final TagKey<Item> HEALS_RODLINGS = tag("heals_rodlings");
      public static final TagKey<Item> CONVERTS_RODLINGS_TO_SOUL = tag("converts_rodlings_to_soul");
      public static final TagKey<Item> CONVERTS_RODLINGS_TO_NORMAL = tag("converts_rodlings_to_normal");
      public static final TagKey<Item> REMOVES_DYE_FROM_RODLINGS = tag("removes_dye_from_rodlings");
      public static final TagKey<Item> REPAIRS_WITHERED_SCIMITAR = tag("repairs_withered_scimitar");
      public static final TagKey<Item> REPAIRS_MUTANT_SHULKER_SHIELD = tag("repairs_mutant_shulker_shield");
      public static final TagKey<Item> REPAIRS_MUTANT_SHULKER_TURRET = tag("repairs_mutant_shulker_turret");
      public static final TagKey<Item> REPAIRS_MUTANT_WITHER_SKELETON_ARMOUR = tag("repairs_mutant_wither_skeleton_armour");
      public static final TagKey<Item> QUICKSAND_IMMUNE_BOOTS = tag("quicksand_immune_boots");
      public static final TagKey<Item> REPAIRS_HOG_HELM = tag("repairs_hog_helm");
      public static final TagKey<Item> REPAIRS_HOGLANCE = tag("repairs_hoglance");
      public static final TagKey<Item> REPAIRS_HOGFIST_GAUNTLET = tag("repairs_hogfist_gauntlet");
      public static final TagKey<Item> REPAIRS_HUSK_HAMMER = tag("repairs_husk_hammer");
      public static final TagKey<Item> REPAIRS_DESERT_HORN = tag("repairs_desert_horn");
      public static final TagKey<Item> REPAIRS_SAND_CANNON = tag("repairs_sand_cannon");
      public static final TagKey<Item> REPAIRS_ADAPTIVE_CROSSBOW = tag("repairs_adaptive_crossbow");
      public static final TagKey<Item> REPAIRS_MUTANT_JUNGLE_ZOMBIE_ARM = tag("repairs_mutant_jungle_zombie_arm");
      public static final TagKey<Item> RESISTS_FREEZING_FAN_SNOWSTORMS = tag("resists_freezing_fan_snowstorms");
      public static final TagKey<Item> RESISTS_SNOWSTORM_GENERATOR_SNOWSTORMS = tag("resists_snowstorm_generator_snowstorms");
      public static final TagKey<Item> HEALS_SENTRY_VINE = tag("heals_sentry_vine");
      public static final TagKey<Item> REPAIRS_LEAFBLOWER = tag("repairs_leafblower");

      private static TagKey<Item> tag(String name) {
         return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("mutantmore", name));
      }

      private static TagKey<Item> forgeTag(String name) {
         return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("c", name));
      }
   }

   public static class SoundEvents {
      public static final TagKey<SoundEvent> OVERRIDES_BATTLE_MUSIC = tag("overrides_battle_music");
      public static final TagKey<SoundEvent> BATTLE_MUSIC_CANT_OVERRIDE = tag("battle_music_cant_override");

      private static TagKey<SoundEvent> tag(String p_203849_) {
         return TagKey.create(Registries.SOUND_EVENT, Identifier.fromNamespaceAndPath("mutantmore", p_203849_));
      }
   }

   public static class Structures {
      public static final TagKey<Structure> ON_SUSPICIOUS_ENTRANCE_MAPS = tag("on_suspicious_entrance_maps");

      public static TagKey<Structure> createStructureTag(String prefix, String name) {
         return TagKey.create(Registries.STRUCTURE, Identifier.fromNamespaceAndPath(prefix, name));
      }

      private static TagKey<Structure> tag(String name) {
         return TagKey.create(Registries.STRUCTURE, Identifier.fromNamespaceAndPath("mutantmore", name));
      }
   }
}
