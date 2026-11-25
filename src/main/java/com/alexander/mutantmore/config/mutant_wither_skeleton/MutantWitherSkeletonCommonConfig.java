package com.alexander.mutantmore.config.mutant_wither_skeleton;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class MutantWitherSkeletonCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> exp_reward;
   public static final ConfigValue<Double> max_health;
   public static final ConfigValue<Double> movement_speed;
   public static final ConfigValue<Double> crouching_movement_speed_decrease;
   public static final ConfigValue<Double> knockback_resistance;
   public static final ConfigValue<Double> armour;
   public static final ConfigValue<Double> armour_toughness;
   public static final ConfigValue<Double> follow_player_distance;
   public static final ConfigValue<Double> follow_non_player_distance;
   public static final ConfigValue<Double> melee_attack_damage;
   public static final ConfigValue<Double> melee_attack_knockback;
   public static final ConfigValue<Double> melee_attack_leech_amount;
   public static final ConfigValue<Integer> melee_attack_wither_length;
   public static final ConfigValue<Integer> melee_attack_wither_level;
   public static final ConfigValue<Double> rib_crush_damage;
   public static final ConfigValue<Double> rib_crush_leech_amount;
   public static final ConfigValue<Integer> rib_crush_disable_shield_length;
   public static final ConfigValue<Integer> rib_crush_wither_length;
   public static final ConfigValue<Integer> rib_crush_wither_level;
   public static final ConfigValue<Double> wither_slash_damage;
   public static final ConfigValue<Double> wither_slash_leech_amount;
   public static final ConfigValue<Integer> wither_slash_wither_length;
   public static final ConfigValue<Integer> wither_slash_wither_level;
   public static final ConfigValue<Double> big_wither_slash_damage;
   public static final ConfigValue<Double> big_wither_slash_leech_amount;
   public static final ConfigValue<Integer> big_wither_slash_wither_length;
   public static final ConfigValue<Integer> big_wither_slash_wither_level;
   public static final ConfigValue<Double> block_damage;
   public static final ConfigValue<Integer> block_slowness_length;
   public static final ConfigValue<Integer> block_slowness_level;
   public static final ConfigValue<Double> lunge_damage;
   public static final ConfigValue<Integer> lunge_disable_shield_length;
   public static final ConfigValue<Integer> wither_breath_wither_length;
   public static final ConfigValue<Integer> wither_breath_wither_level;
   public static final ConfigValue<Integer> wither_breath_slowness_length;
   public static final ConfigValue<Integer> wither_breath_slowness_level;
   public static final ConfigValue<Integer> wither_breath_blindness_length;
   public static final ConfigValue<Boolean> ignores_invulnerability_time;
   public static final ConfigValue<Boolean> walks_on_lava;
   public static final ConfigValue<Boolean> uses_melee_attack;
   public static final ConfigValue<Integer> melee_attack_cooldown;
   public static final ConfigValue<Double> max_melee_attack_distance;
   public static final ConfigValue<Double> max_melee_attack_damage_distance;
   public static final ConfigValue<Boolean> uses_rib_crush;
   public static final ConfigValue<Integer> min_rib_crush_cooldown;
   public static final ConfigValue<Integer> max_rib_crush_cooldown;
   public static final ConfigValue<Double> max_rib_crush_distance;
   public static final ConfigValue<Double> max_rib_crush_damage_distance;
   public static final ConfigValue<Boolean> uses_wither_slash;
   public static final ConfigValue<Integer> min_wither_slash_cooldown;
   public static final ConfigValue<Integer> max_wither_slash_cooldown;
   public static final ConfigValue<Double> min_wither_slash_distance;
   public static final ConfigValue<Double> max_wither_slash_distance;
   public static final ConfigValue<Boolean> uses_block;
   public static final ConfigValue<Integer> block_hit_requirement;
   public static final ConfigValue<Boolean> uses_lunge;
   public static final ConfigValue<Integer> lunge_cooldown;
   public static final ConfigValue<Double> min_lunge_distance;
   public static final ConfigValue<Boolean> uses_wither_breath;
   public static final ConfigValue<Integer> min_wither_breath_cooldown;
   public static final ConfigValue<Integer> max_wither_breath_cooldown;
   public static final ConfigValue<Double> max_wither_breath_distance;
   public static final ConfigValue<Boolean> attacks_players;
   public static final ConfigValue<Boolean> attacks_baby_turtles;
   public static final ConfigValue<Double> following_movement_speed_multiplier;
   public static final ConfigValue<Double> following_target_distance;
   public static final ConfigValue<Boolean> explode_into_parts;
   public static final ConfigValue<Boolean> parts_glow;
   public static final ConfigValue<Double> part_collision_damage;
   public static final ConfigValue<Integer> part_collision_wither_mobs_length;
   public static final ConfigValue<Integer> part_collision_wither_mobs_level;
   public static final ConfigValue<Integer> part_persist_length;
   public static final ConfigValue<Boolean> walk_griefing;
   public static final ConfigValue<Boolean> walk_griefing_drops_blocks;
   public static final ConfigValue<Boolean> hurt_griefing;
   public static final ConfigValue<Boolean> hurt_griefing_drops_blocks;
   public static final ConfigValue<Boolean> lunge_griefing;
   public static final ConfigValue<Boolean> lunge_griefing_drops_blocks;
   public static final ConfigValue<Boolean> despawns;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      BUILDER.push("STATS");
      exp_reward = BUILDER.define(List.of("Experience Reward (default: 40)"), 40);
      max_health = BUILDER.define(List.of("Max Health (default: 200)"), 200.0);
      movement_speed = BUILDER.define(List.of("Movement Speed (default: 0.27)"), 0.27);
      crouching_movement_speed_decrease = BUILDER.define(
      List.of("Crouching Movement Speed Decrease (default: 0.05)"), 0.05
   );
      knockback_resistance = BUILDER.define(List.of("Knockback Resistance (default: 1)"), 1.0);
      armour = BUILDER.define(List.of("Armour Value (default: 6)"), 6.0);
      armour_toughness = BUILDER.define(List.of("Armour Toughness Value (default: 0)"), 0.0);
      follow_player_distance = BUILDER.define(List.of("Target Players Distance (default: 64)"), 64.0);
      follow_non_player_distance = BUILDER.define(List.of("Target Mobs Distance (default: 15)"), 15.0);
      melee_attack_damage = BUILDER.define(List.of("Melee Attack Damage (default: 8)"), 8.0);
      melee_attack_knockback = BUILDER.define(List.of("Melee Attack Knockback (default: 0.2)"), 0.2);
      melee_attack_leech_amount = BUILDER.define(List.of("Melee Attack Health Leeched (default: 4)"), 4.0);
      melee_attack_wither_length = BUILDER.define(
      List.of("Melee Attack Wither Effect Duration (in ticks, default: 200)"), 200
   );
      melee_attack_wither_level = BUILDER.define(List.of("Melee Attack Wither Effect Level (default: 0)"), 0);
      rib_crush_damage = BUILDER.define(List.of("Rib Crush Attack Damage (default: 16)"), 16.0);
      rib_crush_leech_amount = BUILDER.define(List.of("Rib Crush Attack Health Leeched (default: 16)"), 16.0);
      rib_crush_disable_shield_length = BUILDER.define(
      List.of("Rib Crush Attack Disable Shields Duration (in ticks, default: 100)"), 100
   );
      rib_crush_wither_length = BUILDER.define(
      List.of("Rib Crush Attack Wither Effect Duration (in ticks, default: 150)"), 150
   );
      rib_crush_wither_level = BUILDER.define(List.of("Rib Crush Attack Wither Effect Level (default: 2)"), 2);
      wither_slash_damage = BUILDER.define(List.of("Wither Slash Damage (default: 6)"), 6.0);
      wither_slash_leech_amount = BUILDER.define(List.of("Wither Slash Health Leeched (default: 4)"), 4.0);
      wither_slash_wither_length = BUILDER.define(
      List.of("Wither Slash Wither Effect Duration (in ticks, default: 300)"), 300
   );
      wither_slash_wither_level = BUILDER.define(List.of("Wither Slash Wither Effect Level (default: 0)"), 0);
      big_wither_slash_damage = BUILDER.define(List.of("Big Wither Slash Damage (default: 16)"), 16.0);
      big_wither_slash_leech_amount = BUILDER.define(List.of("Big Wither Slash Health Leeched (default: 12)"), 12.0);
      big_wither_slash_wither_length = BUILDER.define(
      List.of("Big Wither Slash Wither Effect Duration (in ticks, default: 300)"), 300
   );
      big_wither_slash_wither_level = BUILDER.define(List.of("Big Wither Slash Wither Effect Level (default: 0)"), 0);
      block_damage = BUILDER.define(List.of("Block Ability Damage (default: 4)"), 4.0);
      block_slowness_length = BUILDER.define(
      List.of("Block Ability Slowness Effect Duration (in ticks, default: 100)"), 100
   );
      block_slowness_level = BUILDER.define(List.of("Block Ability Slowness Effect Level (default: 3)"), 3);
      lunge_damage = BUILDER.define(List.of("Lunge Attack Damage (default: 20)"), 20.0);
      lunge_disable_shield_length = BUILDER.define(
      List.of("Lunge Attack Disable Shields Duration (in ticks, default: 300)"), 300
   );
      wither_breath_wither_length = BUILDER.define(
      List.of("Wither Breath Attack Wither Effect Duration (in ticks, default: 100)"), 100
   );
      wither_breath_wither_level = BUILDER.define(List.of("Wither Breath Attack Wither Effect Level (default: 1)"), 1);
      wither_breath_slowness_length = BUILDER.define(
      List.of("Wither Breath Attack Slowness Effect Duration (in ticks, default: 80)"), 80
   );
      wither_breath_slowness_level = BUILDER.define(List.of("Wither Breath Attack Slowness Effect Level (default: 0)"), 0);
      wither_breath_blindness_length = BUILDER.define(
      List.of("Wither Breath Attack Blindness Effect Duration (in ticks, default: 40)"), 40
   );
      ignores_invulnerability_time = BUILDER.define(List.of("Attacks Ignore Hurt Invulnerability (default: true)"), true);
      walks_on_lava = BUILDER.define(List.of("Walks On Lava (default: true)"), true);
      BUILDER.pop();
      BUILDER.push("AI");
      uses_melee_attack = BUILDER.define(List.of("Uses Melee Attack (default: true)"), true);
      melee_attack_cooldown = BUILDER.define(List.of("Melee Attack Cooldown (in ticks, default: 10)"), 10);
      max_melee_attack_distance = BUILDER.define(List.of("Melee Attack Maximum Use Distance (in blocks, default: 3)"), 3.0);
      max_melee_attack_damage_distance = BUILDER.define(
      List.of("Melee Attack Maximum Damage Distance (in blocks, default: 3.5)"), 3.5
   );
      uses_rib_crush = BUILDER.define(List.of("Uses Rib Crush Attack (default: true)"), true);
      min_rib_crush_cooldown = BUILDER.define(List.of("Rib Crush Attack Minimum Cooldown (in ticks, default: 100)"), 100);
      max_rib_crush_cooldown = BUILDER.define(List.of("Rib Crush Attack Maximum Cooldown (in ticks, default: 200)"), 200);
      max_rib_crush_distance = BUILDER.define(
      List.of("Rib Crush Attack Maximum Use Distance (in blocks, default: 3)"), 3.0
   );
      max_rib_crush_damage_distance = BUILDER.define(
      List.of("Rib Crush Attack Maximum Damage Distance (in blocks, default: 3.5)"), 3.5
   );
      uses_wither_slash = BUILDER.define(List.of("Uses Wither Slash Attack (default: true)"), true);
      min_wither_slash_cooldown = BUILDER.define(
      List.of("Wither Slash Attack Minimum Cooldown (in ticks, default: 100)"), 100
   );
      max_wither_slash_cooldown = BUILDER.define(
      List.of("Wither Slash Attack Maximum Cooldown (in ticks, default: 300)"), 300
   );
      min_wither_slash_distance = BUILDER.define(
      List.of("Wither Slash Attack Minimum Use Distance (in blocks, default: 10)"), 10.0
   );
      max_wither_slash_distance = BUILDER.define(
      List.of("Wither Slash Attack Maximum Use Distance (in blocks, default: 50)"), 50.0
   );
      uses_block = BUILDER.define(List.of("Uses Block Ability (default: true)"), true);
      block_hit_requirement = BUILDER.define(List.of("Block Ability Required Times Hurt (default: 5)"), 5);
      uses_lunge = BUILDER.define(List.of("Uses Lunge Attack (default: true)"), true);
      lunge_cooldown = BUILDER.define(List.of("Lunge Attack Cooldown (in ticks, default: 100)"), 100);
      min_lunge_distance = BUILDER.define(List.of("Lunge Attack Minimum Use Distance (in blocks, default: 15)"), 15.0);
      uses_wither_breath = BUILDER.define(List.of("Uses Wither Breath Attack (default: true)"), true);
      min_wither_breath_cooldown = BUILDER.define(
      List.of("Wither Breath Attack Minimum Cooldown (in ticks, default: 400)"), 400
   );
      max_wither_breath_cooldown = BUILDER.define(
      List.of("Wither Breath Attack Maximum Cooldown (in ticks, default: 800)"), 800
   );
      max_wither_breath_distance = BUILDER.define(
      List.of("Wither Breath Attack Maximum Use Distance (in blocks, default: 15)"), 15.0
   );
      attacks_players = BUILDER.define(List.of("Attacks Players (default: true)"), true);
      attacks_baby_turtles = BUILDER.define(List.of("Attacks Baby Turtles (default: true)"), true);
      following_movement_speed_multiplier = BUILDER.define(
      List.of("Following Target Movement Speed Multiplier (default: 1.5)"), 1.5
   );
      following_target_distance = BUILDER.define(
      List.of("Following Target Close Enough Distance (in blocks, default: 0)"), 0.0
   );
      BUILDER.pop();
      BUILDER.push("DEATH");
      explode_into_parts = BUILDER.define(List.of("Explode Into Parts (default: true)"), true);
      parts_glow = BUILDER.define(List.of("Parts Glow (default: false)"), false);
      part_collision_damage = BUILDER.define(List.of("Part Collision Damage (default: 6)"), 6.0);
      part_collision_wither_mobs_length = BUILDER.define(
      List.of("Part Collision Wither Effect Duration (in ticks, default: 150)"), 150
   );
      part_collision_wither_mobs_level = BUILDER.define(List.of("Part Collision Wither Effect Level (default: 1)"), 1);
      part_persist_length = BUILDER.define(List.of("Parts Despawn After (in ticks, default: 6000)"), 6000);
      BUILDER.pop();
      BUILDER.push("GRIEFING");
      walk_griefing = BUILDER.define(List.of("Walk Griefing (default: true)"), true);
      walk_griefing_drops_blocks = BUILDER.define(List.of("Walk Griefing Drops Blocks (default: false)"), false);
      hurt_griefing = BUILDER.define(List.of("Hurt Griefing (default: true)"), true);
      hurt_griefing_drops_blocks = BUILDER.define(List.of("Hurt Griefing Drops Blocks (default: false)"), false);
      lunge_griefing = BUILDER.define(List.of("Lunge Griefing (default: true)"), true);
      lunge_griefing_drops_blocks = BUILDER.define(List.of("Lunge Griefing Drops Blocks (default: false)"), false);
      BUILDER.pop();
      BUILDER.push("SPAWNING");
      despawns = BUILDER.define(List.of("Despawns (default: false)"), false);
      BUILDER.pop();
      SPEC = BUILDER.build();
   }
}
