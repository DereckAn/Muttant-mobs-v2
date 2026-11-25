package com.alexander.mutantmore.config.mutant_blaze;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class MutantBlazeRewardsCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> shields_use_cooldown;
   public static final ConfigValue<Integer> checker_detect_rodling_range;
   public static final ConfigValue<Double> generator_heat_range;
   public static final ConfigValue<Double> generator_heat_range_y;
   public static final ConfigValue<Double> generator_heat_speed;
   public static final ConfigValue<Boolean> generator_heats_fire_immune_mobs;
   public static final ConfigValue<Boolean> generator_heat_griefing;
   public static final ConfigValue<Integer> generator_heat_griefing_chance;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      BUILDER.push("MUTANT BLAZE SHIELDS");
      shields_use_cooldown = BUILDER.define(List.of("Use Cooldown (in ticks, default: 2400)"), 2400);
      BUILDER.pop();
      BUILDER.push("RODLING CHECKER");
      checker_detect_rodling_range = BUILDER.define(List.of("List Rodlings Range (in blocks, default: 20)"), 20);
      BUILDER.pop();
      BUILDER.push("HEATSTORM GENERATOR");
      generator_heat_range = BUILDER.define(List.of("Heat Zone Horizontal Radius (in blocks, default: 10)"), 10.0);
      generator_heat_range_y = BUILDER.define(List.of("Heat Zone Vertical Radius (in blocks, default: 5)"), 5.0);
      generator_heat_speed = BUILDER.define(List.of("Heat Speed (per tick: default: 0.005)"), 0.005);
      generator_heats_fire_immune_mobs = BUILDER.define(List.of("Affects Fire Immune Mobs (default: false)"), false);
      generator_heat_griefing = BUILDER.define(List.of("Heat Griefing (default: false)"), false);
      generator_heat_griefing_chance = BUILDER.define(
      List.of("Heat Griefing Chance (per tick, the action is performed if a random number between 0 and this is 0, default: 20)"), 20
   );
      BUILDER.pop();
      SPEC = BUILDER.build();
   }
}
