package com.alexander.mutantmore.config.mutant_frozen_zombie;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class MutantFrozenZombieCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> exp_reward;
   public static final ConfigValue<Double> max_health;
   public static final ConfigValue<Double> movement_speed;
   public static final ConfigValue<Double> knockback_resistance;
   public static final ConfigValue<Double> armour;
   public static final ConfigValue<Double> armour_toughness;
   public static final ConfigValue<Double> follow_player_distance;
   public static final ConfigValue<Double> follow_non_player_distance;
   public static final ConfigValue<Double> melee_attack_damage;
   public static final ConfigValue<Integer> melee_attack_freezing_length;
   public static final ConfigValue<Integer> melee_attack_freezing_level;
   public static final ConfigValue<Double> thrown_icicle_damage;
   public static final ConfigValue<Integer> thrown_icicle_disable_shield_length;
   public static final ConfigValue<Integer> thrown_icicle_freezing_length;
   public static final ConfigValue<Integer> thrown_icicle_freezing_level;
   public static final ConfigValue<Integer> lost_life_thrown_icicle_bonus;
   public static final ConfigValue<Integer> roar_min_summoned_zombies;
   public static final ConfigValue<Integer> roar_max_summoned_zombies;
   public static final ConfigValue<Integer> roar_summon_zombies_range;
   public static final ConfigValue<String> roar_summoned_zombie_type;
   public static final ConfigValue<Integer> roar_snowstorm_duration;
   public static final ConfigValue<Double> roar_snowstorm_range;
   public static final ConfigValue<Double> roar_snowstorm_range_y;
   public static final ConfigValue<Integer> roar_snowstorm_freeze_speed;
   public static final ConfigValue<Integer> roar_snowstorm_max_freeze_amount;
   public static final ConfigValue<Double> ice_smash_damage;
   public static final ConfigValue<Integer> ice_smash_disable_shield_length;
   public static final ConfigValue<Double> icicle_slam_icicle_damage;
   public static final ConfigValue<Integer> icicle_slam_icicle_row_length;
   public static final ConfigValue<Integer> icicle_slam_freezing_length;
   public static final ConfigValue<Integer> icicle_slam_freezing_level;
   public static final ConfigValue<Boolean> ignores_invulnerability_time;
   public static final ConfigValue<Boolean> uses_melee_attack;
   public static final ConfigValue<Double> max_melee_attack_distance;
   public static final ConfigValue<Integer> melee_attack_cooldown;
   public static final ConfigValue<Boolean> uses_icicle_throw;
   public static final ConfigValue<Integer> icicle_throw_cooldown;
   public static final ConfigValue<Double> min_icicle_throw_distance;
   public static final ConfigValue<Double> max_icicle_throw_distance;
   public static final ConfigValue<Boolean> uses_roar;
   public static final ConfigValue<Integer> min_roar_cooldown;
   public static final ConfigValue<Integer> max_roar_cooldown;
   public static final ConfigValue<Boolean> uses_snow_throw;
   public static final ConfigValue<Integer> snow_throw_cooldown;
   public static final ConfigValue<Boolean> uses_ice_smash;
   public static final ConfigValue<Boolean> uses_icicle_slam;
   public static final ConfigValue<Integer> min_icicle_slam_cooldown;
   public static final ConfigValue<Integer> max_icicle_slam_cooldown;
   public static final ConfigValue<Double> max_icicle_slam_distance;
   public static final ConfigValue<Boolean> attacks_players;
   public static final ConfigValue<Boolean> attacks_baby_turtles;
   public static final ConfigValue<Double> following_movement_speed_multiplier;
   public static final ConfigValue<Double> following_movement_speed_multiplier_snowstorm;
   public static final ConfigValue<Double> follow_target_wanted_distance;
   public static final ConfigValue<Integer> get_up_times;
   public static final ConfigValue<Boolean> walk_griefing;
   public static final ConfigValue<Boolean> walk_griefing_drops_blocks;
   public static final ConfigValue<Boolean> hurt_griefing;
   public static final ConfigValue<Boolean> hurt_griefing_drops_blocks;
   public static final ConfigValue<Boolean> snowstorm_griefing;
   public static final ConfigValue<Boolean> despawns;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      BUILDER.push("STATS");
      exp_reward = BUILDER.define(List.of("Experience Reward (default: 40)"), 40);
      max_health = BUILDER.define(List.of("Max Health (default: 100)"), 100.0);
      movement_speed = BUILDER.define(List.of("Movement Speed (default: 0.22)"), 0.22);
      knockback_resistance = BUILDER.define(List.of("Knockback Resistance (default: 1)"), 1.0);
      armour = BUILDER.define(List.of("Armour Value (default: 2)"), 2.0);
      armour_toughness = BUILDER.define(List.of("Armour Toughness (default: 0)"), 0.0);
      follow_player_distance = BUILDER.define(List.of("Target Players Range (in blocks, default: 64)"), 64.0);
      follow_non_player_distance = BUILDER.define(List.of("Target Mobs Range (in blocks, default: 20)"), 20.0);
      melee_attack_damage = BUILDER.define(List.of("Melee Attack Damage (default: 6)"), 6.0);
      melee_attack_freezing_length = BUILDER.define(
      List.of("Melee Attack Freezing Effect Duration (in ticks, default: 140)"), 140
   );
      melee_attack_freezing_level = BUILDER.define(List.of("Melee Attack Freezing Effect Level (default: 0)"), 0);
      thrown_icicle_damage = BUILDER.define(List.of("Thrown Icicle Damage (default: 12)"), 12.0);
      thrown_icicle_disable_shield_length = BUILDER.define(
      List.of("Thrown Icicle Disable Shields Duration (in ticks, default: 60)"), 60
   );
      thrown_icicle_freezing_length = BUILDER.define(
      List.of("Thrown Icicle Freezing Effect Duration (in ticks, default: 100)"), 100
   );
      thrown_icicle_freezing_level = BUILDER.define(List.of("Thrown Icicle Freezing Effect Level (default: 0)"), 0);
      lost_life_thrown_icicle_bonus = BUILDER.define(List.of("Lost Life Extra Thrown Icicle Amount (default: 1)"), 1);
      roar_min_summoned_zombies = BUILDER.define(List.of("Roar Ability Minimum Summoned Zombies (default: 3)"), 3);
      roar_max_summoned_zombies = BUILDER.define(List.of("Roar Ability Maximum Summoned Zombies (default: 7)"), 7);
      roar_summon_zombies_range = BUILDER.define(
      List.of("Roar Ability Summon Zombies Range (in blocks, default: 10)"), 10
   );
      roar_summoned_zombie_type = BUILDER.define(
      List.of("Roar Ability Summoned Zombie Type (default: \"dungeons_mobs:frozen_zombie\")"), "dungeons_mobs:frozen_zombie"
   );
      roar_snowstorm_duration = BUILDER.define(List.of("Roar Ability Snowstorm Duration (default: 300)"), 300);
      roar_snowstorm_range = BUILDER.define(
      List.of("Roar Ability Snowstorm Horizontal Radius (in blocks, default: 20)"), 20.0
   );
      roar_snowstorm_range_y = BUILDER.define(
      List.of("Roar Ability Snowstorm Vertical Radius (in blocks, default: 10)"), 10.0
   );
      roar_snowstorm_freeze_speed = BUILDER.define(
      List.of("Roar Ability Snowstorm Freeze Speed (per tick, default: 1)"), 1
   );
      roar_snowstorm_max_freeze_amount = BUILDER.define(
      List.of("Roar Ability Snowstorm Maximum Freeze Amount (mobs get damaged at 140, default: 200)"), 200
   );
      ice_smash_damage = BUILDER.define(List.of("Ice Smash Attack Damage (default: 14)"), 14.0);
      ice_smash_disable_shield_length = BUILDER.define(
      List.of("Ice Smash Attack Disable Shields Duration (in ticks, default: 400)"), 400
   );
      icicle_slam_icicle_damage = BUILDER.define(List.of("Icicle Spike Damage (default: 16)"), 16.0);
      icicle_slam_icicle_row_length = BUILDER.define(List.of("Icicle Spike Row Length (default: 30)"), 30);
      icicle_slam_freezing_length = BUILDER.define(
      List.of("Icicle Spike Freezing Effect Duration (in ticks, default: 100)"), 100
   );
      icicle_slam_freezing_level = BUILDER.define(List.of("Icicle Spike Freezing Effect Level (default: 1)"), 1);
      ignores_invulnerability_time = BUILDER.define(List.of("Attacks Ignore Hurt Invulnerability (default: true)"), true);
      BUILDER.pop();
      BUILDER.push("AI");
      uses_melee_attack = BUILDER.define(List.of("Uses Melee Attack (default: true)"), true);
      max_melee_attack_distance = BUILDER.define(List.of("Melee Attack Maximum Use Distance (in blocks, default: 4)"), 4.0);
      melee_attack_cooldown = BUILDER.define(List.of("Melee Attack Cooldown (in ticks, default: 20)"), 20);
      uses_icicle_throw = BUILDER.define(List.of("Uses Icicle Throw Attack (default: true)"), true);
      icicle_throw_cooldown = BUILDER.define(List.of("Icicle Throw Attack Cooldown (in ticks, default: 10)"), 10);
      min_icicle_throw_distance = BUILDER.define(
      List.of("Icicle Throw Attack Minimum Use Distance (in blocks, default: 4)"), 4.0
   );
      max_icicle_throw_distance = BUILDER.define(
      List.of("Icicle Throw Attack Maximum Use Distance (in blocks, default: 30)"), 30.0
   );
      uses_roar = BUILDER.define(List.of("Uses Roar Ability (default: true)"), true);
      min_roar_cooldown = BUILDER.define(List.of("Roar Ability Minimum Cooldown (in ticks, default: 500)"), 500);
      max_roar_cooldown = BUILDER.define(List.of("Roar Ability Maximum Cooldown (in ticks, default: 800)"), 800);
      uses_snow_throw = BUILDER.define(List.of("Uses Snow Throw Attack (default: true)"), true);
      snow_throw_cooldown = BUILDER.define(List.of("Snow Throw Attack Cooldown (in ticks, default: 100)"), 100);
      uses_ice_smash = BUILDER.define(List.of("Uses Ice Smash Attack (default: true)"), true);
      uses_icicle_slam = BUILDER.define(List.of("Uses Icicle Slam Attack (default: true)"), true);
      min_icicle_slam_cooldown = BUILDER.define(
      List.of("Icicle Slam Attack Minimum Cooldown (in ticks, default: 200)"), 200
   );
      max_icicle_slam_cooldown = BUILDER.define(
      List.of("Icicle Slam Attack Maximum Cooldown (in ticks, default: 400)"), 400
   );
      max_icicle_slam_distance = BUILDER.define(
      List.of("Icicle Slam Attack Maximum Use Distance (in blocks, default: 40)"), 40.0
   );
      attacks_players = BUILDER.define(List.of("Attacks Players (default: true)"), true);
      attacks_baby_turtles = BUILDER.define(List.of("Attacks Baby Turtles (default: true)"), true);
      following_movement_speed_multiplier = BUILDER.define(
      List.of("Following Target Movement Speed Multiplier (default: 1.2)"), 1.2
   );
      following_movement_speed_multiplier_snowstorm = BUILDER.define(
      List.of("Following Target Movement Speed Multiplier Snowstorm (default: 1.6)"), 1.6
   );
      follow_target_wanted_distance = BUILDER.define(
      List.of("Following Target Close Enough Distance (in blocks, default: 20)"), 20.0
   );
      BUILDER.pop();
      BUILDER.push("DEATH");
      get_up_times = BUILDER.define(List.of("Revive Times (default: 2)"), 2);
      BUILDER.pop();
      BUILDER.push("GRIEFING");
      walk_griefing = BUILDER.define(List.of("Walk Griefing (default: true)"), true);
      walk_griefing_drops_blocks = BUILDER.define(List.of("Walk Griefing Drops Blocks (default: false)"), false);
      hurt_griefing = BUILDER.define(List.of("Hurt Griefing (default: true)"), true);
      hurt_griefing_drops_blocks = BUILDER.define(List.of("Hurt Griefing Drops Blocks (default: false)"), false);
      snowstorm_griefing = BUILDER.define(List.of("Snowstorm Griefing (default: true)"), true);
      BUILDER.pop();
      BUILDER.push("SPAWNING");
      despawns = BUILDER.define(List.of("Despawns (default: false)"), false);
      BUILDER.pop();
      SPEC = BUILDER.build();
   }
}
