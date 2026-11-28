package com.alexander.mutantmore.config;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class MutationCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> formula_y_mutate_chance;
   public static final ConfigValue<Integer> compound_z_mutate_chance;
   public static final ConfigValue<Double> formula_y_cloud_movement_speed;
   public static final ConfigValue<Double> compound_z_cloud_movement_speed;
   public static final ConfigValue<Double> mutation_cloud_search_range;
   public static final ConfigValue<Double> mutation_cloud_search_range_y;
   public static final ConfigValue<Boolean> mutating_no_ai;
   public static final ConfigValue<Boolean> classic_mutations;
   public static final ConfigValue<Integer> classic_mutation_min_time;
   public static final ConfigValue<Integer> classic_mutation_max_time;
   public static final ConfigValue<List<? extends String>> formula_y_recipe;
   public static final ConfigValue<List<? extends String>> compound_z_recipe;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      formula_y_mutate_chance = BUILDER.define(List.of("Formula Y Mutate Chance (in percent, default: 10)"), 10);
      compound_z_mutate_chance = BUILDER.define(List.of("Compound Z Mutate Chance (in percent, default: 100)"), 100);
      formula_y_cloud_movement_speed = BUILDER.define(List.of("Formula Y Cloud Movement Speed (default: 0.2)"), 0.2);
      compound_z_cloud_movement_speed = BUILDER.define(List.of("Compound Z Cloud Movement Speed (default: 0.4)"), 0.4);
      mutation_cloud_search_range = BUILDER.define(
      List.of("Mutation Cloud Horizontal Targeting Range (in blocks, default: 12)"), 12.0
   );
      mutation_cloud_search_range_y = BUILDER.define(
      List.of("Mutation Cloud Vertical Targeting Range (in blocks, default: 6)"), 6.0
   );
      mutating_no_ai = BUILDER.define(List.of("Disable AI Of Mutating Mobs (default: true)"), true);
      classic_mutations = BUILDER.define(List.of("Mutant Creatures-Style Mutations (default: false)"), false);
      classic_mutation_min_time = BUILDER.define(
      List.of("Mutant Creatures-Style Mutation Minimum Duration (in ticks, default: 100)"), 100
   );
      classic_mutation_max_time = BUILDER.define(
      List.of("Mutant Creatures-Style Mutation Maximum Duration (in ticks, default: 300)"), 300
   );
      formula_y_recipe = BUILDER.defineList(
      List.of(
         "Formula Y Recipe (default: \"minecraft:nether_wart\", \"minecraft:gunpowder\", \"minecraft:golden_carrot\", \"minecraft:fermented_spider_eye\", \"minecraft:crying_obsidian\""
      ),
      Lists.newArrayList(
         new String[]{"minecraft:nether_wart", "minecraft:gunpowder", "minecraft:golden_carrot", "minecraft:fermented_spider_eye", "minecraft:crying_obsidian"}
      ),
      element -> element instanceof String
   );
      compound_z_recipe = BUILDER.defineList(
      List.of(
         "Compound Z Recipe (default: \"mutantmore:formula_y\", \"minecraft:glowstone_dust\", \"minecraft:golden_apple\", \"minecraft:experience_bottle\", \"minecraft:prismarine_crystals\", \"minecraft:redstone\", \"minecraft:sculk_catalyst\", \"minecraft:end_crystal\")"
      ),
      Lists.newArrayList(
         new String[]{
            "mutantmore:formula_y",
            "minecraft:glowstone_dust",
            "minecraft:golden_apple",
            "minecraft:experience_bottle",
            "minecraft:prismarine_crystals",
            "minecraft:redstone",
            "minecraft:sculk_catalyst",
            "minecraft:end_crystal"
         }
      ),
      element -> element instanceof String
   );
      SPEC = BUILDER.build();
   }
}
