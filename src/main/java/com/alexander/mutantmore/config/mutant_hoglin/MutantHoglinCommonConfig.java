package com.alexander.mutantmore.config.mutant_hoglin;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class MutantHoglinCommonConfig {
   public static final Builder BUILDER = new Builder();
   public static final ForgeConfigSpec SPEC = BUILDER.build();
   public static final ConfigValue<Integer> exp_reward = BUILDER.define(List.of("Experience Reward (default: 45)"), 45);
   public static final ConfigValue<Double> max_health = BUILDER.define(List.of("Max Health (default: 250)"), 250.0);
   public static final ConfigValue<Double> movement_speed = BUILDER.define(List.of("Movement Speed (default: 0.28)"), 0.28);
   public static final ConfigValue<Double> knockback_resistance = BUILDER.define(List.of("Knockback Resistance (default: 1)"), 1.0);
   public static final ConfigValue<Double> armour = BUILDER.define(List.of("Armour Value (default: 12)"), 12.0);
   public static final ConfigValue<Double> armour_toughness = BUILDER.define(List.of("Armour Toughness (default: 0)"), 0.0);
   public static final ConfigValue<Double> follow_player_distance = BUILDER.define(List.of("Target Players Range (in blocks, default: 64)"), 64.0);
   public static final ConfigValue<Double> follow_non_player_distance = BUILDER.define(List.of("Target Mobs Range (in blocks, default: 20)"), 15.0);
   public static final ConfigValue<Double> attack_knockback = BUILDER.define(List.of("Melee Attack Knockback (default: 1.75)"), 1.75);
   public static final ConfigValue<Double> basic_attack_damage = BUILDER.define(List.of("Melee Attack Damage (default: 8)"), 8.0);
   public static final ConfigValue<Double> stomp_attack_damage = BUILDER.define(List.of("Stomp Attack Damage (default: 4)"), 4.0);
   public static final ConfigValue<Double> stomp_attack_range = BUILDER.define(List.of("Stomp Attack Range (in blocks, default: 25)"), 25.0);
   public static final ConfigValue<Double> stomp_attack_falling_block_damage = BUILDER.define(List.of("Stomp Attack Falling Block Damage (default: 10)"), 10.0);
   public static final ConfigValue<Double> charge_attack_damage = BUILDER.define(List.of("Charge Attack Damage (default: 14)"), 14.0);
   public static final ConfigValue<Integer> charge_disable_shield_length = BUILDER.define(
      List.of("Charge Attack Disable Shields Duration (in ticks, default: 200)"), 200
   );
   public static final ConfigValue<Double> kick_attack_damage = BUILDER.define(List.of("Kick Attack Damage (default: 18)"), 18.0);
   public static final ConfigValue<Integer> kick_disable_shield_length = BUILDER.define(
      List.of("Kick Attack Disable Shields Duration (in ticks, default: 300)"), 300
   );
   public static final ConfigValue<Integer> kick_slowness_length = BUILDER.define(List.of("Kick Attack Slowness Effect Duration (in ticks, default: 100)"), 100);
   public static final ConfigValue<Integer> kick_slowness_level = BUILDER.define(List.of("Kick Attack Slowness Effect Level (default: 2)"), 2);
   public static final ConfigValue<Double> death_damage = BUILDER.define(List.of("Death Damage (default: 16)"), 16.0);
   public static final ConfigValue<Double> death_range = BUILDER.define(List.of("Death Range (in blocks, default: 30)"), 30.0);
   public static final ConfigValue<Double> death_falling_block_damage = BUILDER.define(List.of("Death Falling Block Damage (default: 14)"), 14.0);
   public static final ConfigValue<Boolean> ignores_invulnerability_time = BUILDER.define(List.of("Attacks Ignore Hurt Invulnerability (default: true)"), true);
   public static final ConfigValue<Boolean> uses_charge = BUILDER.define(List.of("Uses Charge Attack (default: true)"), true);
   public static final ConfigValue<Integer> min_charge_cooldown = BUILDER.define(List.of("Charge Attack Minimum Cooldown (in ticks, default: 200)"), 200);
   public static final ConfigValue<Integer> max_charge_cooldown = BUILDER.define(List.of("Charge Attack Maximum Cooldown (in ticks, default: 400)"), 400);
   public static final ConfigValue<Integer> lost_health_percent_for_bonus_charge = BUILDER.define(
      List.of("Charge Attack Bonus Charge Lost Health Requirement (in percent, default: 20)"), 20
   );
   public static final ConfigValue<Boolean> uses_basic_attack = BUILDER.define(List.of("Uses Basic Attack (default: true)"), true);
   public static final ConfigValue<Double> max_basic_attack_distance = BUILDER.define(List.of("Basic Attack Maximum Use Distance (in blocks, default: 4)"), 4.0);
   public static final ConfigValue<Double> max_basic_attack_damage_distance = BUILDER.define(
      List.of("Basic Attack Maximum Damage Distance (in blocks, default: 5)"), 5.0
   );
   public static final ConfigValue<Integer> basic_attack_cooldown = BUILDER.define(List.of("Basic Attack Cooldown (in ticks, default: 15)"), 15);
   public static final ConfigValue<Boolean> uses_stomp_attack = BUILDER.define(List.of("Uses Stomp Attack (default: true)"), true);
   public static final ConfigValue<Integer> min_stomp_cooldown = BUILDER.define(List.of("Stomp Attack Minimum Cooldown (in ticks, default: 100)"), 100);
   public static final ConfigValue<Integer> max_stomp_cooldown = BUILDER.define(List.of("Stomp Attack Maximum Cooldown (in ticks, default: 300)"), 300);
   public static final ConfigValue<Boolean> uses_kick_attack = BUILDER.define(List.of("Uses Kick Attack (default: true)"), true);
   public static final ConfigValue<Double> max_kick_attack_distance = BUILDER.define(List.of("Kick Attack Maximum Use Distance (in blocks, default: 4)"), 4.0);
   public static final ConfigValue<Integer> kick_cooldown = BUILDER.define(List.of("Kick Attack Cooldown (in ticks, default: 40)"), 40);
   public static final ConfigValue<Boolean> attacks_players = BUILDER.define(List.of("Attacks Players (default: true)"), true);
   public static final ConfigValue<Double> following_movement_speed_multiplier = BUILDER.define(
      List.of("Following Target Movement Speed Multiplier (default: 1.3)"), 1.3
   );
   public static final ConfigValue<Double> follow_target_wanted_distance = BUILDER.define(
      List.of("Following Target Close Enough Distance (in blocks, default: 0)"), 0.0
   );
   public static final ConfigValue<Boolean> walk_griefing = BUILDER.define(List.of("Walk Griefing (default: true)"), true);
   public static final ConfigValue<Boolean> walk_griefing_drops_blocks = BUILDER.define(List.of("Walk Griefing Drops Blocks (default: false)"), false);
   public static final ConfigValue<Boolean> hurt_griefing = BUILDER.define(List.of("Hurt Griefing (default: true)"), true);
   public static final ConfigValue<Boolean> hurt_griefing_drops_blocks = BUILDER.define(List.of("Hurt Griefing Drops Blocks (default: false)"), false);
   public static final ConfigValue<Boolean> charge_griefing = BUILDER.define(List.of("Charge Griefing (default: true)"), true);
   public static final ConfigValue<Boolean> charge_griefing_drops_blocks = BUILDER.define(List.of("Charge Griefing Drops Blocks (default: false)"), false);
   public static final ConfigValue<Boolean> stomp_griefing = BUILDER.define(List.of("Stomp Griefing (default: true)"), true);
   public static final ConfigValue<Boolean> stomp_griefing_drops_blocks = BUILDER.define(List.of("Stomp Griefing Drops Blocks (default: false)"), false);
   public static final ConfigValue<Boolean> death_griefing = BUILDER.define(List.of("Death Griefing (default: true)"), true);
   public static final ConfigValue<Float> enrage_amount = BUILDER.define(
      List.of("Hurt Enrage Amount (stacks, Mutant Hoglin is fully enraged when enragedAmount reaches 1, default: 0.15)"), 0.15F
   );
   public static final ConfigValue<Integer> enrage_duration = BUILDER.define(List.of("Hurt Enrage Duration (in ticks, stacks, default: 40)"), 40);
   public static final ConfigValue<Integer> max_enrage_duration = BUILDER.define(List.of("Maximum Enrage Duration (in ticks, default: 200)"), 200);
   public static final ConfigValue<Float> enrage_lower_speed = BUILDER.define(List.of("Enrage Lower Speed (per tick, default: 0.05)"), 0.05F);
   public static final ConfigValue<Float> enraged_speed_multiplier = BUILDER.define(
      List.of("Enraged Speed Multiplier (end result is 1 + enragedAmount * this, default: 0.25)"), 0.25F
   );
   public static final ConfigValue<Float> enraged_damage_multiplier = BUILDER.define(
      List.of("Enraged Damage Multiplier (end result is 1 + enragedAmount * this, default: 0.5)"), 0.5F
   );
   public static final ConfigValue<Float> enraged_knockback_multiplier = BUILDER.define(
      List.of("Enraged Knockback Multiplier (end result is 1 + enragedAmount * this, default: 0.5)"), 0.5F
   );
   public static final ConfigValue<Boolean> despawns = BUILDER.define(List.of("Despawns (default: false)"), false);

   static {
      BUILDER.push("STATS");
      BUILDER.pop();
      BUILDER.push("AI");
      BUILDER.pop();
      BUILDER.push("GRIEFING");
      BUILDER.pop();
      BUILDER.push("ENRAGING");
      BUILDER.pop();
      BUILDER.push("SPAWNING");
      BUILDER.pop();
   }
}
