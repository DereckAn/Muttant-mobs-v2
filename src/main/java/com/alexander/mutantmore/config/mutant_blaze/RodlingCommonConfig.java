package com.alexander.mutantmore.config.mutant_blaze;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class RodlingCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> hostile_exp_reward;
   public static final ConfigValue<Double> hostile_fireball_damage;
   public static final ConfigValue<Integer> hostile_fireball_fire_length;
   public static final ConfigValue<Double> hostile_shoot_max_distance;
   public static final ConfigValue<Double> hostile_max_health;
   public static final ConfigValue<Double> hostile_armour;
   public static final ConfigValue<Double> hostile_armour_toughness;
   public static final ConfigValue<Double> hostile_movement_speed;
   public static final ConfigValue<Double> hostile_follow_range;
   public static final ConfigValue<Double> hostile_knockback_resistance;
   public static final ConfigValue<Boolean> hostile_ignores_invulnerability_time;
   public static final ConfigValue<Boolean> hostile_fireball_griefing;
   public static final ConfigValue<Integer> hostile_shield_regenerate_speed;
   public static final ConfigValue<Boolean> hostile_attacks_players;
   public static final ConfigValue<Double> hostile_following_movement_speed_multiplier;
   public static final ConfigValue<Double> hostile_following_target_distance;
   public static final ConfigValue<Double> tamed_fireball_damage;
   public static final ConfigValue<Integer> tamed_fireball_fire_length;
   public static final ConfigValue<Double> tamed_shoot_max_distance;
   public static final ConfigValue<Double> tamed_max_health;
   public static final ConfigValue<Double> tamed_armour;
   public static final ConfigValue<Double> tamed_armour_toughness;
   public static final ConfigValue<Double> tamed_movement_speed;
   public static final ConfigValue<Double> tamed_follow_range;
   public static final ConfigValue<Double> tamed_knockback_resistance;
   public static final ConfigValue<Boolean> tamed_ignores_invulnerability_time;
   public static final ConfigValue<Integer> tamed_shield_regenerate_speed;
   public static final ConfigValue<Integer> tamed_fed_heal_percent;
   public static final ConfigValue<Integer> tamed_heal_time;
   public static final ConfigValue<Boolean> tamed_friendly_fire;
   public static final ConfigValue<Double> tamed_following_movement_speed_multiplier;
   public static final ConfigValue<Double> tamed_follow_target_wanted_distance;
   public static final ConfigValue<Double> tamed_follow_owner_movement_speed_multiplier;
   public static final ConfigValue<Double> tamed_follow_owner_start_min_distance;
   public static final ConfigValue<Double> tamed_follow_owner_stop_max_distance;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      BUILDER.push("HOSTILE");
      hostile_exp_reward = BUILDER.define(List.of("Experience Reward (default: 5)"), 5);
      hostile_fireball_damage = BUILDER.define(List.of("Fireball Damage (default: 6)"), 6.0);
      hostile_fireball_fire_length = BUILDER.define(List.of("Fireball Fire Duration (in seconds, default: 5)"), 5);
      hostile_shoot_max_distance = BUILDER.define(
      List.of("Fireball Attack Maximum Use Distance (in blocks, default: 10)"), 10.0
   );
      hostile_max_health = BUILDER.define(List.of("Max Health (default: 10)"), 10.0);
      hostile_armour = BUILDER.define(List.of("Armour Value (default: 0)"), 0.0);
      hostile_armour_toughness = BUILDER.define(List.of("Armour Toughness Value (default: 0)"), 0.0);
      hostile_movement_speed = BUILDER.define(List.of("Movement Speed (default: 0.125)"), 0.125);
      hostile_follow_range = BUILDER.define(List.of("Target Players Range (in blocks, default: 30)"), 30.0);
      hostile_knockback_resistance = BUILDER.define(List.of("Knockback Resistance (default: 0)"), 0.0);
      hostile_ignores_invulnerability_time = BUILDER.define(
      List.of("Attacks Ignore Hurt Invulnerability (default: true)"), true
   );
      hostile_fireball_griefing = BUILDER.define(List.of("Fireball Griefing (default: true)"), true);
      hostile_shield_regenerate_speed = BUILDER.define(List.of("Shield Broken Duration (in ticks, default: 150)"), 150);
      hostile_attacks_players = BUILDER.define(List.of("Attacks Players (default: true)"), true);
      hostile_following_movement_speed_multiplier = BUILDER.define(
      List.of("Following Target Movement Speed Multiplier (default: 1.5)"), 1.5
   );
      hostile_following_target_distance = BUILDER.define(
      List.of("Following Target Close Enough Distance (in blocks, default: 7.5)"), 7.5
   );
      BUILDER.pop();
      BUILDER.push("TAMED");
      tamed_fireball_damage = BUILDER.define(List.of("Fireball Damage (default: 3)"), 3.0);
      tamed_fireball_fire_length = BUILDER.define(List.of("Fireball Fire Duration (in seconds, default: 5)"), 5);
      tamed_shoot_max_distance = BUILDER.define(
      List.of("Fireball Attack Maximum Use Distance (in blocks, default: 10)"), 10.0
   );
      tamed_max_health = BUILDER.define(List.of("Max Health (default: 15)"), 15.0);
      tamed_armour = BUILDER.define(List.of("Armour Value (default: 0)"), 0.0);
      tamed_armour_toughness = BUILDER.define(List.of("Armour Toughness Value (default: 0)"), 0.0);
      tamed_movement_speed = BUILDER.define(List.of("Movement Speed (default: 0.125)"), 0.125);
      tamed_follow_range = BUILDER.define(List.of("Target Mobs Range (in blocks, default: 20)"), 20.0);
      tamed_knockback_resistance = BUILDER.define(List.of("Knockback Resistance (default: 0)"), 0.0);
      tamed_ignores_invulnerability_time = BUILDER.define(
      List.of("Attacks Ignore Hurt Invulnerability (default: true)"), true
   );
      tamed_shield_regenerate_speed = BUILDER.define(List.of("Shield Broken Duration (in ticks, default: 150)"), 150);
      tamed_fed_heal_percent = BUILDER.define(List.of("Fed Heal Amount (in percent, default: 20)"), 20);
      tamed_heal_time = BUILDER.define(List.of("Fed Heal Duration (in ticks, default: 100)"), 100);
      tamed_friendly_fire = BUILDER.define(List.of("Friendly Fire (default: false)"), false);
      tamed_following_movement_speed_multiplier = BUILDER.define(
      List.of("Following Target Movement Speed Multiplier (default: 1.5)"), 1.5
   );
      tamed_follow_target_wanted_distance = BUILDER.define(
      List.of("Following Target Close Enough Distance (in blocks, default: 7.5)"), 7.5
   );
      tamed_follow_owner_movement_speed_multiplier = BUILDER.define(
      List.of("Following Owner Movement Speed Multiplier (default: 1.5)"), 1.5
   );
      tamed_follow_owner_start_min_distance = BUILDER.define(
      List.of("Start Following Owner Minimum Distance (in blocks, default: 7.5)"), 7.5
   );
      tamed_follow_owner_stop_max_distance = BUILDER.define(
      List.of("Stop Following Owner Maximum Distance (in blocks, default: 5)"), 5.0
   );
      BUILDER.pop();
      SPEC = BUILDER.build();
   }
}
