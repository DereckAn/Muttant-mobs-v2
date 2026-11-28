package com.alexander.mutantmore.config.mutant_frozen_zombie;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class MutantFrozenZombieRewardsCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Double> generator_snowstorm_range;
   public static final ConfigValue<Double> generator_snowstorm_range_y;
   public static final ConfigValue<Integer> generator_freeze_speed;
   public static final ConfigValue<Integer> generator_max_freeze_amount;
   public static final ConfigValue<Boolean> generator_snowstorm_griefing;
   public static final ConfigValue<Integer> generator_snowstorm_griefing_amount;
   public static final ConfigValue<Integer> generator_slowness_length;
   public static final ConfigValue<Integer> generator_slowness_level;
   public static final ConfigValue<Integer> generator_weakness_length;
   public static final ConfigValue<Integer> generator_weakness_level;
   public static final ConfigValue<Integer> fan_freeze_speed;
   public static final ConfigValue<Integer> fan_max_freeze_amount;
   public static final ConfigValue<Double> fan_ice_cube_max_health;
   public static final ConfigValue<Double> charge_icicle_damage;
   public static final ConfigValue<Integer> charge_icicle_disable_shield_length;
   public static final ConfigValue<Integer> charge_icicle_freezing_length;
   public static final ConfigValue<Integer> charge_icicle_freezing_level;
   public static final ConfigValue<Integer> charge_max_ammo;
   public static final ConfigValue<Integer> charge_charge_interval;
   public static final ConfigValue<Integer> charge_load_duration;
   public static final ConfigValue<Integer> charge_durability_consumption;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      BUILDER.push("SNOWSTORM GENERATOR");
      generator_snowstorm_range = BUILDER.define("Snowstorm Horizontal Radius (in blocks, default: 14)", 14.0);
      generator_snowstorm_range_y = BUILDER.define("Snowstorm Vertical Radius (in blocks, default: 7)", 7.0);
      generator_freeze_speed = BUILDER.define("Freeze Speed (per tick, default: 1)", 1);
      generator_max_freeze_amount = BUILDER.define("Maximum Freeze Amount (mobs get damaged at 140, default: 100)", 100);
      generator_snowstorm_griefing = BUILDER.define("Snowstorm Griefing (default: false)", false);
      generator_snowstorm_griefing_amount = BUILDER.define("Snowstorm Griefing Amount (default: 10)", 10);
      generator_slowness_length = BUILDER.define("Slowness Effect Duration (in ticks, default: 200)", 200);
      generator_slowness_level = BUILDER.define("Slowness Effect Level (default: 1)", 1);
      generator_weakness_length = BUILDER.define("Weakness Effect Duration (in ticks, default: 200)", 200);
      generator_weakness_level = BUILDER.define("Weakness Effect Level (default: 0)", 0);
      BUILDER.pop();
      BUILDER.push("FREEZING FAN");
      fan_freeze_speed = BUILDER.define("Freeze Speed (per tick, default: 1)", 1);
      fan_max_freeze_amount = BUILDER.define("Maximum Freeze Amount (mobs get damaged at 140, default: 200)", 200);
      fan_ice_cube_max_health = BUILDER.define("Resist Ice Cube Max Health (default: 50)", 50.0);
      BUILDER.pop();
      BUILDER.push("ICICLE AMMO CHARGE");
      charge_icicle_damage = BUILDER.define("Icicle Damage (default: 10)", 10.0);
      charge_icicle_disable_shield_length = BUILDER.define("Icicle Disable Shields Duration (in ticks, default: 20)", 20);
      charge_icicle_freezing_length = BUILDER.define("Icicle Freezing Effect Duration (in ticks, default: 40)", 40);
      charge_icicle_freezing_level = BUILDER.define("Icicle Freezing Effect Level (default: 0)", 0);
      charge_max_ammo = BUILDER.define("Max Ammo (default: 20)", 20);
      charge_charge_interval = BUILDER.define("Create Ammo Interval (in ticks, default: 10)", 10);
      charge_load_duration = BUILDER.define("Load Crossbow Duration (in ticks, default: 40)", 40);
      charge_durability_consumption = BUILDER.define("Crossbow Durability Consumption (default: 1)", 1);
      BUILDER.pop();
      SPEC = BUILDER.build();
   }
}
