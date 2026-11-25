package com.alexander.mutantmore.config.mutant_blaze;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class MutantBlazeCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> exp_reward;
   public static final ConfigValue<Double> max_health;
   public static final ConfigValue<Double> movement_speed;
   public static final ConfigValue<Double> flying_sideways_speed;
   public static final ConfigValue<Double> flying_sideways_change_speed;
   public static final ConfigValue<Double> flying_movement_speed;
   public static final ConfigValue<Double> flying_vertical_speed;
   public static final ConfigValue<Double> knockback_resistance;
   public static final ConfigValue<Double> armour;
   public static final ConfigValue<Double> armour_toughness;
   public static final ConfigValue<Double> follow_player_distance;
   public static final ConfigValue<Double> follow_non_player_distance;
   public static final ConfigValue<Double> fireball_damage;
   public static final ConfigValue<Double> fireball_explosion_damage;
   public static final ConfigValue<Double> fireball_explosion_radius;
   public static final ConfigValue<Integer> fireball_fire_length;
   public static final ConfigValue<Double> rod_damage;
   public static final ConfigValue<Integer> rod_fire_length;
   public static final ConfigValue<Boolean> stunnable;
   public static final ConfigValue<Double> stun_shockwave_damage;
   public static final ConfigValue<Integer> stun_shockwave_fire_length;
   public static final ConfigValue<Integer> stun_shockwave_disable_shield_length;
   public static final ConfigValue<Double> stun_shockwave_range;
   public static final ConfigValue<Boolean> ignores_invulnerability_time;
   public static final ConfigValue<Integer> shield_regenerate_speed;
   public static final ConfigValue<Boolean> uses_fireball_attack;
   public static final ConfigValue<Integer> fireball_attack_extra_fireballs_health_threshold_1;
   public static final ConfigValue<Integer> fireball_attack_extra_fireballs_health_threshold_2;
   public static final ConfigValue<Integer> fireball_attack_cooldown;
   public static final ConfigValue<Boolean> uses_rod_shot;
   public static final ConfigValue<Integer> rod_shot_cooldown;
   public static final ConfigValue<Integer> rodling_shot_max_nearby_rodlings;
   public static final ConfigValue<Integer> rodling_shot_rodling_amount;
   public static final ConfigValue<Integer> rodling_shot_armoured_rodlings_health_threshold;
   public static final ConfigValue<Integer> rodling_shot_shielded_rodlings_health_threshold;
   public static final ConfigValue<Integer> rodling_shot_shoot_armoured_rodlings_chance;
   public static final ConfigValue<Integer> rodling_shot_shoot_shielded_rodlings_chance;
   public static final ConfigValue<Boolean> uses_fly;
   public static final ConfigValue<Double> fly_height;
   public static final ConfigValue<Integer> fly_land_search_range_horizontal;
   public static final ConfigValue<Integer> fly_land_search_range_vertical;
   public static final ConfigValue<Double> fly_approach_target_min_distance;
   public static final ConfigValue<Double> fly_avoid_target_max_distance;
   public static final ConfigValue<Integer> fly_health_threshold;
   public static final ConfigValue<Double> fly_below_target_start_distance;
   public static final ConfigValue<Integer> stop_flying_time;
   public static final ConfigValue<Integer> fly_cooldown;
   public static final ConfigValue<Boolean> avoids_corridors;
   public static final ConfigValue<Double> avoid_corridor_movement_speed_multiplier;
   public static final ConfigValue<Boolean> avoids_target;
   public static final ConfigValue<Double> avoid_target_max_range;
   public static final ConfigValue<Double> stop_avoiding_target_min_distance;
   public static final ConfigValue<Double> avoid_target_movement_speed_multiplier;
   public static final ConfigValue<Boolean> attacks_players;
   public static final ConfigValue<Double> following_movement_speed_multiplier;
   public static final ConfigValue<Double> following_target_distance;
   public static final ConfigValue<Boolean> explode_into_parts;
   public static final ConfigValue<Boolean> parts_glow;
   public static final ConfigValue<Double> part_collision_damage;
   public static final ConfigValue<Integer> part_fire_length;
   public static final ConfigValue<Integer> part_persist_length;
   public static final ConfigValue<Integer> part_amount;
   public static final ConfigValue<Integer> rodling_part_amount;
   public static final ConfigValue<Boolean> walk_griefing;
   public static final ConfigValue<Boolean> walk_griefing_drops_blocks;
   public static final ConfigValue<Boolean> hurt_griefing;
   public static final ConfigValue<Boolean> hurt_griefing_drops_blocks;
   public static final ConfigValue<Boolean> fireball_griefing;
   public static final ConfigValue<Boolean> fireball_griefing_drops_blocks;
   public static final ConfigValue<Boolean> fireball_explosion_fire;
   public static final ConfigValue<Boolean> rod_griefing;
   public static final ConfigValue<Boolean> rod_griefing_drops_blocks;
   public static final ConfigValue<Boolean> rod_fire;
   public static final ConfigValue<Boolean> heat_griefing;
   public static final ConfigValue<Integer> heat_griefing_chance;
   public static final ConfigValue<Double> heat_range;
   public static final ConfigValue<Double> heat_range_y;
   public static final ConfigValue<Double> heat_speed;
   public static final ConfigValue<Boolean> heats_fire_immune_mobs;
   public static final ConfigValue<Boolean> despawns;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      BUILDER.push("STATS");
      exp_reward = BUILDER.define(List.of("Experience Reward (default: 50)"), 50);
      max_health = BUILDER.define(List.of("Max Health (default: 250)"), 250.0);
      movement_speed = BUILDER.define(List.of("Movement Speed (default: 0.25)"), 0.25);
      flying_sideways_speed = BUILDER.define(List.of("Fly Sideways Speed (default: 0.2)"), 0.2);
      flying_sideways_change_speed = BUILDER.define(List.of("Fly Sideways Change Direction Speed (default: 0.004)"), 0.004);
      flying_movement_speed = BUILDER.define(List.of("Fly Forwards/Backwards Speed (default: 0.25)"), 0.25);
      flying_vertical_speed = BUILDER.define(List.of("Fly Upwards Speed (default: 0.1)"), 0.1);
      knockback_resistance = BUILDER.define(List.of("Knockback Resistance (default: 1)"), 1.0);
      armour = BUILDER.define(List.of("Armour Value (default: 10)"), 10.0);
      armour_toughness = BUILDER.define(List.of("Armour Toughness Value (default: 0)"), 0.0);
      follow_player_distance = BUILDER.define(List.of("Target Players Range (in blocks, default: 64)"), 64.0);
      follow_non_player_distance = BUILDER.define(List.of("Target Mobs Range (in blocks, default: 25)"), 25.0);
      fireball_damage = BUILDER.define(List.of("Fireball Damage (default: 12)"), 12.0);
      fireball_explosion_damage = BUILDER.define(List.of("Fireball Explosion Damage (default: 10)"), 10.0);
      fireball_explosion_radius = BUILDER.define(List.of("Fireball Explosion Size (default: 3)"), 3.0);
      fireball_fire_length = BUILDER.define(List.of("Fireball Fire Duration (in seconds, default: 5)"), 5);
      rod_damage = BUILDER.define(List.of("Rod Projectile Damage (default: 4)"), 4.0);
      rod_fire_length = BUILDER.define(List.of("Rod Projectile Fire Duration (in seconds, default: 3)"), 3);
      stunnable = BUILDER.define(List.of("Can Be Stunned (default: true)"), true);
      stun_shockwave_damage = BUILDER.define(List.of("Stun Shockwave Damage (default: 20)"), 20.0);
      stun_shockwave_fire_length = BUILDER.define(List.of("Stun Shockwave Fire Duration (in seconds, default: 7)"), 7);
      stun_shockwave_disable_shield_length = BUILDER.define(
      List.of("Stun Shockwave Disable Shields Duration (in ticks, default: 100)"), 100
   );
      stun_shockwave_range = BUILDER.define(List.of("Stun Shockwave Range (default: 7.5)"), 7.5);
      ignores_invulnerability_time = BUILDER.define(List.of("Attacks Ignore Hurt Invulnerability (default: true)"), true);
      shield_regenerate_speed = BUILDER.define(List.of("Shield Broken Duration (in ticks, default: 300)"), 300);
      BUILDER.pop();
      BUILDER.push("AI");
      uses_fireball_attack = BUILDER.define(List.of("Uses Fireball Attack (default: true)"), true);
      fireball_attack_extra_fireballs_health_threshold_1 = BUILDER.define(
      List.of("Fireball Attack Extra Fireballs Health Threshold 1 (in percent, default: 75)"), 75
   );
      fireball_attack_extra_fireballs_health_threshold_2 = BUILDER.define(
      List.of("Fireball Attack Extra Fireballs Health Threshold 2 (in percent, default: 50)"), 50
   );
      fireball_attack_cooldown = BUILDER.define(List.of("Fireball Attack Cooldown (in ticks, default: 100)"), 100);
      uses_rod_shot = BUILDER.define(List.of("Uses Rod Shot Attack (default: true)"), true);
      rod_shot_cooldown = BUILDER.define(List.of("Rod Shot Cooldown (in ticks, default: 600)"), 600);
      rodling_shot_max_nearby_rodlings = BUILDER.define(
      List.of("Rod Shot Shoot Rodlings Maximum Nearby Rodlings (default: 1)"), 1
   );
      rodling_shot_rodling_amount = BUILDER.define(List.of("Rod Shot Rodling Amount (default: 2)"), 2);
      rodling_shot_armoured_rodlings_health_threshold = BUILDER.define(
      List.of("Rod Shot Shoot Armoured Rodlings Health Threshold (in percent, default: 50)"), 50
   );
      rodling_shot_shielded_rodlings_health_threshold = BUILDER.define(
      List.of("Rod Shot Shoot Shielded Rodlings Health Threshold (in percent, default: 25)"), 25
   );
      rodling_shot_shoot_armoured_rodlings_chance = BUILDER.define(
      List.of("Rod Shot Shoot Armoured Rodlings Chance (in percent, default: 50)"), 50
   );
      rodling_shot_shoot_shielded_rodlings_chance = BUILDER.define(
      List.of("Rod Shot Shoot Shielded Rodlings Chance (in percent, default: 50)"), 50
   );
      uses_fly = BUILDER.define(List.of("Uses Fly Ability (default: true)"), true);
      fly_height = BUILDER.define(List.of("Fly Height (default: 2)"), 2.0);
      fly_land_search_range_horizontal = BUILDER.define(
      List.of("Flying Landing Spot Search Range Horizontal (in blocks, default: 15)"), 15
   );
      fly_land_search_range_vertical = BUILDER.define(
      List.of("Flying Landing Spot Search Range Vertical (in blocks, default: 10)"), 10
   );
      fly_approach_target_min_distance = BUILDER.define(
      List.of("Flying Approach Target Minimum Distance (in blocks, default: 20)"), 20.0
   );
      fly_avoid_target_max_distance = BUILDER.define(
      List.of("Flying Avoid Target Maximum Distance (in blocks, default: 15)"), 15.0
   );
      fly_health_threshold = BUILDER.define(List.of("Fly Health Threshold (in percent, default: 50)"), 50);
      fly_below_target_start_distance = BUILDER.define(
      List.of("Below Target Start Flying Minimum Distance (in blocks, default: 10)"), 10.0
   );
      stop_flying_time = BUILDER.define(List.of("Flies For (in ticks, default: 300)"), 300);
      fly_cooldown = BUILDER.define(List.of("Fly Cooldown (in ticks, default: 400)"), 400);
      avoids_corridors = BUILDER.define(List.of("Avoids Corridors (default: true)"), true);
      avoid_corridor_movement_speed_multiplier = BUILDER.define(
      List.of("Avoiding Corridor Movement Speed Multiplier (default: 1.5)"), 1.5
   );
      avoids_target = BUILDER.define(List.of("Avoids Target (default: true)"), true);
      avoid_target_max_range = BUILDER.define(
      List.of("Start Avoiding Target Maximum Distance (in blocks, default: 10)"), 10.0
   );
      stop_avoiding_target_min_distance = BUILDER.define(
      List.of("Stop Avoiding Target Minimum Distance (in blocks, default: 15)"), 15.0
   );
      avoid_target_movement_speed_multiplier = BUILDER.define(
      List.of("Avoiding Target Movement Speed Multiplier (default: 1.35)"), 1.35
   );
      attacks_players = BUILDER.define(List.of("Attacks Players (default: true)"), true);
      following_movement_speed_multiplier = BUILDER.define(
      List.of("Following Target Movement Speed Multiplier (default: 1.35)"), 1.35
   );
      following_target_distance = BUILDER.define(
      List.of("Following Target Close Enough Distance (in blocks, default: 20)"), 20.0
   );
      BUILDER.pop();
      BUILDER.push("DEATH");
      explode_into_parts = BUILDER.define(List.of("Explodes Into Parts (default: true)"), true);
      parts_glow = BUILDER.define(List.of("Parts Glow (default: false)"), false);
      part_collision_damage = BUILDER.define(List.of("Part Collision Damage (default: 8)"), 8.0);
      part_fire_length = BUILDER.define(List.of("Parts Fire Duration (in seconds, default: 5)"), 5);
      part_persist_length = BUILDER.define(List.of("Parts Despawn After (in ticks, default: 6000)"), 6000);
      part_amount = BUILDER.define(List.of("Dropped Part Amount (default: 32)"), 32);
      rodling_part_amount = BUILDER.define(List.of("Dropped Rodling Amount (default: 1)"), 1);
      BUILDER.pop();
      BUILDER.push("GRIEFING");
      walk_griefing = BUILDER.define(List.of("Walk Griefing (default: true)"), true);
      walk_griefing_drops_blocks = BUILDER.define(List.of("Walk Griefing Drops Blocks (default: false)"), false);
      hurt_griefing = BUILDER.define(List.of("Hurt Griefing (default: true)"), true);
      hurt_griefing_drops_blocks = BUILDER.define(List.of("Hurt Griefing Drops Blocks (default: false)"), false);
      fireball_griefing = BUILDER.define(List.of("Fireball Griefing (default: true)"), true);
      fireball_griefing_drops_blocks = BUILDER.define(List.of("Fireball Griefing Drops Blocks (default: false)"), false);
      fireball_explosion_fire = BUILDER.define(List.of("Fireball Explosions Leave Fire (default: true)"), true);
      rod_griefing = BUILDER.define(List.of("Rod Projectile Griefing (default: true)"), true);
      rod_griefing_drops_blocks = BUILDER.define(List.of("Rod Projectile Griefing Drops Blocks (default: false)"), false);
      rod_fire = BUILDER.define(List.of("Rod Projectiles Leave Fire (default: true)"), true);
      heat_griefing = BUILDER.define(List.of("Heat Griefing (default: true)"), true);
      heat_griefing_chance = BUILDER.define(
      List.of("Heat Griefing Chance (per tick, the action is performed if a random number between 0 and this is 0, default: 20)"), 20
   );
      BUILDER.pop();
      BUILDER.push("HEAT ZONE");
      heat_range = BUILDER.define(List.of("Heat Zone Horizontal Radius (in blocks, default: 10)"), 10.0);
      heat_range_y = BUILDER.define(List.of("Heat Zone Vertical Radius (in blocks, default: 5)"), 5.0);
      heat_speed = BUILDER.define(List.of("Heat Speed (per tick, default: 0.005)"), 0.005);
      heats_fire_immune_mobs = BUILDER.define(List.of("Affects Fire Immune Mobs (default: false)"), false);
      BUILDER.pop();
      BUILDER.push("SPAWNING");
      despawns = BUILDER.define(List.of("Despawns (default: false)"), false);
      BUILDER.pop();
      SPEC = BUILDER.build();
   }
}
