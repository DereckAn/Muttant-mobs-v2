package com.alexander.mutantmore.config.mutant_jungle_zombie;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class MutantJungleZombieRewardsCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> arm_grab_durability_consumption;
   public static final ConfigValue<Double> arm_strangle_damage;
   public static final ConfigValue<Integer> arm_grab_cooldown;
   public static final ConfigValue<Integer> arm_max_grab_duration;
   public static final ConfigValue<Integer> arm_durability;
   public static final ConfigValue<Double> arm_attack_range_increase;
   public static final ConfigValue<Integer> leafblower_use_durability_consumption;
   public static final ConfigValue<Double> leafblower_poison_damage;
   public static final ConfigValue<Integer> leafblower_suck_cooldown;
   public static final ConfigValue<Integer> leafblower_blow_cooldown;
   public static final ConfigValue<Integer> leafblower_max_use_duration;
   public static final ConfigValue<Integer> leafblower_durability;
   public static final ConfigValue<Integer> leafblower_shoot_range;
   public static final ConfigValue<Double> vine_attack_damage;
   public static final ConfigValue<Integer> vine_attack_poison_length;
   public static final ConfigValue<Integer> vine_attack_poison_level;
   public static final ConfigValue<Integer> vine_attack_cooldown;
   public static final ConfigValue<Double> vine_slam_damage;
   public static final ConfigValue<Integer> vine_slam_cooldown;
   public static final ConfigValue<Boolean> vine_locked_horizontal_movement;
   public static final ConfigValue<Double> vine_max_health;
   public static final ConfigValue<Integer> vine_repair_heal_percent;
   public static final ConfigValue<Double> vine_knockback_resistance;
   public static final ConfigValue<Double> vine_armour;
   public static final ConfigValue<Double> vine_armour_toughness;
   public static final ConfigValue<Double> vine_follow_range;
   public static final ConfigValue<Boolean> vine_friendly_fire;
   public static final ConfigValue<Boolean> vine_ignores_invulnerability_time;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      BUILDER.push("MUTANT JUNGLE ZOMBIE ARM");
      arm_grab_durability_consumption = BUILDER.define(List.of("Grab Durability Consumption (default: 1)"), 1);
      arm_strangle_damage = BUILDER.define(List.of("Strangle Damage (default: 2)"), 2.0);
      arm_grab_cooldown = BUILDER.define(List.of("Grab Cooldown (in ticks, default: 200)"), 200);
      arm_max_grab_duration = BUILDER.define(List.of("Max Grab Duration (in ticks, default: 200)"), 200);
      arm_durability = BUILDER.define(List.of("Durability (default: 200)"), 200);
      arm_attack_range_increase = BUILDER.define(List.of("Attack Range Increase (default: 2)"), 2.0);
      BUILDER.pop();
      BUILDER.push("LEAFBLOWER");
      leafblower_use_durability_consumption = BUILDER.define(List.of("Use Durability Consumption (default: 1)"), 1);
      leafblower_poison_damage = BUILDER.define(List.of("Poison Damage (default: 1)"), 1.0);
      leafblower_suck_cooldown = BUILDER.define(List.of("Suck Cooldown (in ticks, default: 20)"), 20);
      leafblower_blow_cooldown = BUILDER.define(List.of("Blow Cooldown (in ticks, default: 200)"), 200);
      leafblower_max_use_duration = BUILDER.define(List.of("Max Use Duration (in ticks, default: 200)"), 200);
      leafblower_durability = BUILDER.define(List.of("Durability (default: 200)"), 200);
      leafblower_shoot_range = BUILDER.define(List.of("Shoot Range (in blocks, default: 15)"), 15);
      BUILDER.pop();
      BUILDER.push("SENTRY VINE");
      vine_attack_damage = BUILDER.define(List.of("Attack Damage (default: 6)"), 6.0);
      vine_attack_poison_length = BUILDER.define(List.of("Attack Poison Effect Duration (in ticks, default: 100)"), 100);
      vine_attack_poison_level = BUILDER.define(List.of("Attack Poison Effect Level (default: 1)"), 1);
      vine_attack_cooldown = BUILDER.define(List.of("Attack Cooldown (in ticks, default: 5)"), 5);
      vine_slam_damage = BUILDER.define(List.of("Slam Damage (default: 10)"), 10.0);
      vine_slam_cooldown = BUILDER.define(List.of("Slam Cooldown (in ticks, default: 100)"), 100);
      vine_locked_horizontal_movement = BUILDER.define(List.of("Locked Horizontal Movement (default: true)"), true);
      vine_max_health = BUILDER.define(List.of("Max Health (default: 100)"), 100.0);
      vine_repair_heal_percent = BUILDER.define(List.of("Fed Heal Amount (in percent, default: 10)"), 10);
      vine_knockback_resistance = BUILDER.define(List.of("Knockback Resistance (default: 1)"), 1.0);
      vine_armour = BUILDER.define(List.of("Armour Value (default: 0)"), 0.0);
      vine_armour_toughness = BUILDER.define(List.of("Armour Toughness (default: 0)"), 0.0);
      vine_follow_range = BUILDER.define(List.of("Target Mobs Range (in blocks, default: 15)"), 15.0);
      vine_friendly_fire = BUILDER.define(List.of("Friendly Fire (default: false)"), false);
      vine_ignores_invulnerability_time = BUILDER.define(
      List.of("Attacks Ignore Hurt Invulnerability (default: true)"), true
   );
      BUILDER.pop();
      SPEC = BUILDER.build();
   }
}
