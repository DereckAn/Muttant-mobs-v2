package com.alexander.mutantmore.config.mutant_jungle_zombie;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class MutantJungleZombieCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> exp_reward;
   public static final ConfigValue<Double> max_health;
   public static final ConfigValue<Double> movement_speed;
   public static final ConfigValue<Double> knockback_resistance;
   public static final ConfigValue<Double> armour;
   public static final ConfigValue<Double> armour_toughness;
   public static final ConfigValue<Double> follow_player_distance;
   public static final ConfigValue<Double> follow_non_player_distance;
   public static final ConfigValue<Double> punch_attack_damage;
   public static final ConfigValue<Integer> punch_attack_disable_shield_length;
   public static final ConfigValue<Integer> punch_attack_poison_length;
   public static final ConfigValue<Integer> punch_attack_poison_level;
   public static final ConfigValue<Double> strangle_attack_damage;
   public static final ConfigValue<Integer> strangle_attack_poison_length;
   public static final ConfigValue<Integer> strangle_attack_poison_level;
   public static final ConfigValue<Double> vine_attack_damage;
   public static final ConfigValue<Integer> vine_attack_poison_length;
   public static final ConfigValue<Integer> vine_attack_poison_level;
   public static final ConfigValue<Double> slam_attack_damage;
   public static final ConfigValue<Double> jump_poison_cloud_damage;
   public static final ConfigValue<Boolean> ignores_invulnerability_time;
   public static final ConfigValue<Boolean> uses_punch_attack;
   public static final ConfigValue<Double> max_punch_attack_distance;
   public static final ConfigValue<Double> max_punch_attack_damage_distance;
   public static final ConfigValue<Integer> punch_attack_cooldown;
   public static final ConfigValue<Boolean> uses_strangle_attack;
   public static final ConfigValue<Double> max_strangle_attack_distance;
   public static final ConfigValue<Double> max_strangle_attack_grab_distance;
   public static final ConfigValue<Integer> min_strangle_attack_cooldown;
   public static final ConfigValue<Integer> max_strangle_attack_cooldown;
   public static final ConfigValue<Boolean> uses_vine_attack;
   public static final ConfigValue<Double> max_vine_attack_distance;
   public static final ConfigValue<Integer> vine_attack_cooldown;
   public static final ConfigValue<Boolean> uses_slam_attack;
   public static final ConfigValue<Double> max_slam_attack_distance;
   public static final ConfigValue<Double> max_slam_attack_grab_distance;
   public static final ConfigValue<Integer> min_slam_attack_cooldown;
   public static final ConfigValue<Integer> max_slam_attack_cooldown;
   public static final ConfigValue<Boolean> uses_jump;
   public static final ConfigValue<Double> min_jump_distance;
   public static final ConfigValue<Double> min_jump_distance_y;
   public static final ConfigValue<Boolean> attacks_players;
   public static final ConfigValue<Boolean> attacks_baby_turtles;
   public static final ConfigValue<Double> following_movement_speed_multiplier;
   public static final ConfigValue<Double> follow_target_wanted_distance;
   public static final ConfigValue<Integer> get_up_times;
   public static final ConfigValue<Double> death_poison_cloud_damage;
   public static final ConfigValue<Boolean> walk_griefing;
   public static final ConfigValue<Boolean> walk_griefing_drops_blocks;
   public static final ConfigValue<Boolean> jump_griefing;
   public static final ConfigValue<Boolean> jump_griefing_drops_blocks;
   public static final ConfigValue<Boolean> hurt_griefing;
   public static final ConfigValue<Boolean> hurt_griefing_drops_blocks;
   public static final ConfigValue<Boolean> despawns;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      BUILDER.push("STATS");
      exp_reward = BUILDER.define(List.of("Experience Reward (default: 40)"), 40);
      max_health = BUILDER.define(List.of("Max Health (default: 60)"), 60.0);
      movement_speed = BUILDER.define(List.of("Movement Speed (default: 0.24)"), 0.24);
      knockback_resistance = BUILDER.define(List.of("Knockback Resistance (default: 1)"), 1.0);
      armour = BUILDER.define(List.of("Armour Value (default: 2)"), 2.0);
      armour_toughness = BUILDER.define(List.of("Armour Toughness Value (default: 0)"), 0.0);
      follow_player_distance = BUILDER.define(List.of("Target Players Range (in blocks, default: 64)"), 64.0);
      follow_non_player_distance = BUILDER.define(List.of("Target Mobs Range (in blocks, default: 20)"), 20.0);
      punch_attack_damage = BUILDER.define(List.of("Punch Attack Damage (default: 10)"), 10.0);
      punch_attack_disable_shield_length = BUILDER.define(
      List.of("Punch Attack Disable Shields Duration (in ticks, default: 100)"), 100
   );
      punch_attack_poison_length = BUILDER.define(
      List.of("Punch Attack Poison Effect Duration (in ticks, default: 60)"), 60
   );
      punch_attack_poison_level = BUILDER.define(List.of("Punch Attack Poison Effect Level (default: 0)"), 0);
      strangle_attack_damage = BUILDER.define(List.of("Strangle Attack Damage (default: 6)"), 6.0);
      strangle_attack_poison_length = BUILDER.define(
      List.of("Strangle Attack Poison Effect Duration (in ticks, default: 120)"), 120
   );
      strangle_attack_poison_level = BUILDER.define(
      List.of("Strangle Attack Poison Effect Level (in ticks, default: 1)"), 1
   );
      vine_attack_damage = BUILDER.define(List.of("Vine Attack Damage (default: 8)"), 8.0);
      vine_attack_poison_length = BUILDER.define(
      List.of("Vine Attack Poison Effect Duration (in ticks, default: 80)"), 80
   );
      vine_attack_poison_level = BUILDER.define(List.of("Vine Attack Poison Level (default: 0)"), 0);
      slam_attack_damage = BUILDER.define(List.of("Slam Attack Damage (default: 12)"), 12.0);
      jump_poison_cloud_damage = BUILDER.define(List.of("Jump Ability Poison Cloud Damage (default: 2)"), 2.0);
      ignores_invulnerability_time = BUILDER.define(List.of("Attacks Ignore Hurt Invulnerability (default: true)"), true);
      BUILDER.pop();
      BUILDER.push("AI");
      uses_punch_attack = BUILDER.define(List.of("Uses Punch Attack (default: true)"), true);
      max_punch_attack_distance = BUILDER.define(List.of("Punch Attack Maximum Use Distance (in blocks, default: 4)"), 4.0);
      max_punch_attack_damage_distance = BUILDER.define(
      List.of("Punch Attack Maximum Damage Distance (in blocks, default: 6)"), 6.0
   );
      punch_attack_cooldown = BUILDER.define(List.of("Punch Attack Cooldown (in ticks, default: 60)"), 60);
      uses_strangle_attack = BUILDER.define(List.of("Uses Strangle Attack (default: true)"), true);
      max_strangle_attack_distance = BUILDER.define(
      List.of("Strangle Attack Maximum Use Distance (in blocks, default: 13)"), 13.0
   );
      max_strangle_attack_grab_distance = BUILDER.define(
      List.of("Strangle Attack Maximum Grab Distance (in blocks, default: 15)"), 15.0
   );
      min_strangle_attack_cooldown = BUILDER.define(
      List.of("Strangle Attack Minimum Cooldown (in ticks, default: 200)"), 200
   );
      max_strangle_attack_cooldown = BUILDER.define(
      List.of("Strangle Attack Maximum Cooldown (in ticks, default: 400)"), 400
   );
      uses_vine_attack = BUILDER.define(List.of("Uses Vine Attack (default: true)"), true);
      max_vine_attack_distance = BUILDER.define(List.of("Vine Attack Maximum Use Distance (in blocks, default: 9)"), 9.0);
      vine_attack_cooldown = BUILDER.define(List.of("Vine Attack Cooldown (in ticks, default: 20)"), 20);
      uses_slam_attack = BUILDER.define(List.of("Uses Strangle Attack (default: true)"), true);
      max_slam_attack_distance = BUILDER.define(List.of("Slam Attack Maximum Use Distance (in blocks, default: 13)"), 13.0);
      max_slam_attack_grab_distance = BUILDER.define(
      List.of("Slam Attack Maximum Grab Distance (in blocks, default: 13)"), 13.0
   );
      min_slam_attack_cooldown = BUILDER.define(List.of("Slam Attack Minimum Cooldown (in ticks, default: 300)"), 300);
      max_slam_attack_cooldown = BUILDER.define(List.of("Slam Attack Maximum Cooldown (in ticks, default: 500)"), 500);
      uses_jump = BUILDER.define(List.of("Uses Jump Ability (default: true)"), true);
      min_jump_distance = BUILDER.define(List.of("Jump Ability Minimum Use Distance (in blocks, default: 20)"), 20.0);
      min_jump_distance_y = BUILDER.define(List.of("Jump Ability Vertical Use Distance (in blocks, default: 5)"), 5.0);
      attacks_players = BUILDER.define(List.of("Attacks Players (default: true)"), true);
      attacks_baby_turtles = BUILDER.define(List.of("Attacks Baby Turtles (default: true)"), true);
      following_movement_speed_multiplier = BUILDER.define(
      List.of("Following Target Movement Speed Multiplier (default: 1.5)"), 1.5
   );
      follow_target_wanted_distance = BUILDER.define(
      List.of("Following Target Close Enough Distance (in blocks, default: 0)"), 0.0
   );
      BUILDER.pop();
      BUILDER.push("DEATH");
      get_up_times = BUILDER.define(List.of("Revive Times (default: 4)"), 4);
      death_poison_cloud_damage = BUILDER.define(List.of("Death Poison Cloud Damage (default: 2)"), 2.0);
      BUILDER.pop();
      BUILDER.push("GRIEFING");
      walk_griefing = BUILDER.define(List.of("Walk Griefing (default: true)"), true);
      walk_griefing_drops_blocks = BUILDER.define(List.of("Walk Griefing Drops Blocks (default: true)"), false);
      jump_griefing = BUILDER.define(List.of("Jump Griefing (default: true)"), true);
      jump_griefing_drops_blocks = BUILDER.define(List.of("Jump Griefing Drops Blocks (default: false)"), false);
      hurt_griefing = BUILDER.define(List.of("Hurt Griefing (default: true)"), true);
      hurt_griefing_drops_blocks = BUILDER.define(List.of("Hurt Griefing Drops Blocks (default: false)"), false);
      BUILDER.pop();
      BUILDER.push("SPAWNING");
      despawns = BUILDER.define(List.of("Despawns (default: false)"), false);
      BUILDER.pop();
      SPEC = BUILDER.build();
   }
}
