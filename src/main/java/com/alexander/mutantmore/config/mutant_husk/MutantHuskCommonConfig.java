package com.alexander.mutantmore.config.mutant_husk;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class MutantHuskCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> exp_reward;
   public static final ConfigValue<Double> max_health;
   public static final ConfigValue<Double> movement_speed;
   public static final ConfigValue<Double> knockback_resistance;
   public static final ConfigValue<Double> armour;
   public static final ConfigValue<Double> armour_toughness;
   public static final ConfigValue<Double> follow_player_distance;
   public static final ConfigValue<Double> follow_non_player_distance;
   public static final ConfigValue<Double> sand_boulder_damage;
   public static final ConfigValue<Integer> sand_boulder_lifespan;
   public static final ConfigValue<Double> basic_attack_damage;
   public static final ConfigValue<Double> basic_attack_knockback;
   public static final ConfigValue<Integer> basic_attack_shockwave_length;
   public static final ConfigValue<Double> punch_attack_damage;
   public static final ConfigValue<Integer> punch_attack_disable_shield_length;
   public static final ConfigValue<Integer> punch_attack_hunger_length;
   public static final ConfigValue<Integer> punch_attack_hunger_level;
   public static final ConfigValue<Double> roar_damage;
   public static final ConfigValue<Double> roar_damage_range;
   public static final ConfigValue<Double> roar_quicksand_range;
   public static final ConfigValue<Integer> roar_min_summoned_zombies;
   public static final ConfigValue<Integer> roar_max_summoned_zombies;
   public static final ConfigValue<Integer> roar_summon_zombies_range;
   public static final ConfigValue<String> roar_summoned_zombie_type;
   public static final ConfigValue<Double> geyser_attack_damage;
   public static final ConfigValue<Integer> geyser_attack_shockwave_length;
   public static final ConfigValue<Double> geyser_attack_slam_damage;
   public static final ConfigValue<Integer> geyser_attack_slam_disable_shield_length;
   public static final ConfigValue<Integer> geyser_attack_slam_hunger_length;
   public static final ConfigValue<Integer> geyser_attack_slam_hunger_level;
   public static final ConfigValue<Boolean> ignores_invulnerability_time;
   public static final ConfigValue<Boolean> uses_sand_throw;
   public static final ConfigValue<Integer> min_sand_throw_cooldown;
   public static final ConfigValue<Integer> max_sand_throw_cooldown;
   public static final ConfigValue<Double> min_sand_throw_distance;
   public static final ConfigValue<Double> max_sand_throw_distance;
   public static final ConfigValue<Boolean> uses_basic_attack;
   public static final ConfigValue<Double> max_basic_attack_distance;
   public static final ConfigValue<Integer> basic_attack_cooldown;
   public static final ConfigValue<Boolean> uses_punch_attack;
   public static final ConfigValue<Double> max_punch_attack_distance;
   public static final ConfigValue<Integer> punch_attack_cooldown;
   public static final ConfigValue<Boolean> uses_roar;
   public static final ConfigValue<Integer> min_roar_cooldown;
   public static final ConfigValue<Integer> max_roar_cooldown;
   public static final ConfigValue<Boolean> uses_geyser_attack;
   public static final ConfigValue<Double> max_geyser_attack_distance;
   public static final ConfigValue<Integer> min_geyser_attack_cooldown;
   public static final ConfigValue<Integer> max_geyser_attack_cooldown;
   public static final ConfigValue<Boolean> attacks_players;
   public static final ConfigValue<Boolean> attacks_baby_turtles;
   public static final ConfigValue<Double> following_movement_speed_multiplier;
   public static final ConfigValue<Double> follow_target_wanted_distance;
   public static final ConfigValue<Integer> get_up_times;
   public static final ConfigValue<Boolean> walk_griefing;
   public static final ConfigValue<Boolean> walk_griefing_drops_blocks;
   public static final ConfigValue<Boolean> hurt_griefing;
   public static final ConfigValue<Boolean> hurt_griefing_drops_blocks;
   public static final ConfigValue<Boolean> sand_boulder_griefing;
   public static final ConfigValue<Boolean> punch_attack_griefing;
   public static final ConfigValue<Boolean> roar_attack_griefing;
   public static final ConfigValue<Boolean> geyser_attack_griefing;
   public static final ConfigValue<Boolean> despawns;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      BUILDER.push("STATS");
      exp_reward = BUILDER.define(List.of("Experience Reward (default: 40)"), 40);
      max_health = BUILDER.define(List.of("Max Health (default: 180)"), 180.0);
      movement_speed = BUILDER.define(List.of("Movement Speed (default: 0.24)"), 0.24);
      knockback_resistance = BUILDER.define(List.of("Knockback Resistance (default: 1)"), 1.0);
      armour = BUILDER.define(List.of("Armour Value (default: 4)"), 4.0);
      armour_toughness = BUILDER.define(List.of("Armour Toughness Value (default: 0)"), 0.0);
      follow_player_distance = BUILDER.define(List.of("Target Players Range (in blocks, default: 64)"), 64.0);
      follow_non_player_distance = BUILDER.define(List.of("Target Mobs Range (in blocks default: 20)"), 20.0);
      sand_boulder_damage = BUILDER.define(List.of("Sand Boulder Damage (default: 10)"), 10.0);
      sand_boulder_lifespan = BUILDER.define(List.of("Sand Boulders Despawn After (in ticks, default: 100)"), 100);
      basic_attack_damage = BUILDER.define(List.of("Basic Attack Damage (default: 14)"), 14.0);
      basic_attack_knockback = BUILDER.define(List.of("Basic Attack Knockback (default: 1)"), 1.0);
      basic_attack_shockwave_length = BUILDER.define(List.of("Basic Attack Shockwave Length (default: 7)"), 7);
      punch_attack_damage = BUILDER.define(List.of("Punch Attack Damage (default: 16)"), 16.0);
      punch_attack_disable_shield_length = BUILDER.define(
      List.of("Punch Attack Disable Shields Duration (in ticks, default: 120)"), 120
   );
      punch_attack_hunger_length = BUILDER.define(
      List.of("Punch Attack Hunger Effect Duration (in ticks, default: 200)"), 200
   );
      punch_attack_hunger_level = BUILDER.define(List.of("Punch Attack Hunger Effect Level (default: 1)"), 1);
      roar_damage = BUILDER.define(List.of("Roar Attack Damage (default: 4)"), 4.0);
      roar_damage_range = BUILDER.define(List.of("Roar Attack Damage Range (in blocks, default: 16)"), 16.0);
      roar_quicksand_range = BUILDER.define(List.of("Roar Attack Quicksand Range (in blocks, default: 12)"), 12.0);
      roar_min_summoned_zombies = BUILDER.define(List.of("Roar Attack Minimum Summoned Zombies (default: 2)"), 2);
      roar_max_summoned_zombies = BUILDER.define(List.of("Roar Attack Maximum Summoned Zombies (default: 5)"), 5);
      roar_summon_zombies_range = BUILDER.define(List.of("Roar Attack Summon Zombies Range (in blocks, default: 15)"), 15);
      roar_summoned_zombie_type = BUILDER.define(
      List.of("Roar Attack Summoned Zombie Type (default: \"minecraft:husk\")"), "minecraft:husk"
   );
      geyser_attack_damage = BUILDER.define(List.of("Geyser Attack Damage (default: 8)"), 8.0);
      geyser_attack_shockwave_length = BUILDER.define(List.of("Geyser Attack Shockwave Length (default: 12)"), 12);
      geyser_attack_slam_damage = BUILDER.define(List.of("Geyser Attack Slam Damage (default: 16)"), 16.0);
      geyser_attack_slam_disable_shield_length = BUILDER.define(
      List.of("Geyser Attack Slam Disable Shields Duration (in ticks, default: 150)"), 150
   );
      geyser_attack_slam_hunger_length = BUILDER.define(
      List.of("Geyser Attack Slam Hunger Effect Duration (in ticks, default: 200)"), 200
   );
      geyser_attack_slam_hunger_level = BUILDER.define(List.of("Geyser Attack Slam Hunger Effect Level (default: 1)"), 1);
      ignores_invulnerability_time = BUILDER.define(List.of("Attacks Ignore Hurt Invulnerability (default: true)"), true);
      BUILDER.pop();
      BUILDER.push("AI");
      uses_sand_throw = BUILDER.define(List.of("Uses Sand Throw Attack (default: true)"), true);
      min_sand_throw_cooldown = BUILDER.define(
      List.of("Sand Throw Attack Minimum Cooldown (in ticks, default: 100)"), 100
   );
      max_sand_throw_cooldown = BUILDER.define(
      List.of("Sand Throw Attack Maximum Cooldown (in ticks, default: 200)"), 200
   );
      min_sand_throw_distance = BUILDER.define(
      List.of("Sand Throw Attack Minimum Use Distance (in blocks, default: 5)"), 5.0
   );
      max_sand_throw_distance = BUILDER.define(
      List.of("Sand Throw Attack Maximum Use Distance (in blocks, default: 30)"), 30.0
   );
      uses_basic_attack = BUILDER.define(List.of("Uses Basic Attack (default: true)"), true);
      max_basic_attack_distance = BUILDER.define(
      List.of("Basic Attack Maximum Use Distance (in blocks, default: 14)"), 14.0
   );
      basic_attack_cooldown = BUILDER.define(List.of("Basic Attack Cooldown (in ticks, default: 10)"), 10);
      uses_punch_attack = BUILDER.define(List.of("Uses Punch Attack (default: true)"), true);
      max_punch_attack_distance = BUILDER.define(List.of("Punch Attack Maximum Use Distance (in blocks, default: 4)"), 4.0);
      punch_attack_cooldown = BUILDER.define(List.of("Punch Attack Cooldown (in ticks, default: 60)"), 60);
      uses_roar = BUILDER.define(List.of("Uses Roar Attack (default: true)"), true);
      min_roar_cooldown = BUILDER.define(List.of("Roar Attack Minimum Cooldown (in ticks, default: 400)"), 400);
      max_roar_cooldown = BUILDER.define(List.of("Roar Attack Maximum Cooldown (in ticks, default: 600)"), 600);
      uses_geyser_attack = BUILDER.define(List.of("Uses Geyser Attack (default: true)"), true);
      max_geyser_attack_distance = BUILDER.define(
      List.of("Geyser Attack Maximum Use Distance (in blocks, default: 18)"), 18.0
   );
      min_geyser_attack_cooldown = BUILDER.define(List.of("Geyser Attack Minimum Cooldown (in ticks, default: 300)"), 300);
      max_geyser_attack_cooldown = BUILDER.define(List.of("Geyser Attack Maximum Cooldown (in ticks, default: 400)"), 400);
      attacks_players = BUILDER.define(List.of("Attacks Players (default: true)"), true);
      attacks_baby_turtles = BUILDER.define(List.of("Attacks Baby Turtles (default: true)"), true);
      following_movement_speed_multiplier = BUILDER.define(
      List.of("Following Target Movement Speed Multiplier (default: 1.2)"), 1.2
   );
      follow_target_wanted_distance = BUILDER.define(
      List.of("Following Target Close Enough Distance (in blocks, default: 10)"), 10.0
   );
      BUILDER.pop();
      BUILDER.push("DEATH");
      get_up_times = BUILDER.define(List.of("Revive Times (default: 1)"), 1);
      BUILDER.pop();
      BUILDER.push("GRIEFING");
      walk_griefing = BUILDER.define(List.of("Walk Griefing (default: true)"), true);
      walk_griefing_drops_blocks = BUILDER.define(List.of("Walk Griefing Drops Blocks (default: false)"), false);
      hurt_griefing = BUILDER.define(List.of("Hurt Griefing (default: true)"), true);
      hurt_griefing_drops_blocks = BUILDER.define(List.of("Hurt Griefing Drops Blocks (default: false)"), false);
      sand_boulder_griefing = BUILDER.define(List.of("Sand Boulder Griefing (default: true)"), true);
      punch_attack_griefing = BUILDER.define(List.of("Punch Attack Griefing (default: true)"), true);
      roar_attack_griefing = BUILDER.define(List.of("Roar Attack Griefing (default: true)"), true);
      geyser_attack_griefing = BUILDER.define(List.of("Geyser Attack Griefing (default: true)"), true);
      BUILDER.pop();
      BUILDER.push("SPAWNING");
      despawns = BUILDER.define(List.of("Despawns (default: false)"), false);
      BUILDER.pop();
      SPEC = BUILDER.build();
   }
}
