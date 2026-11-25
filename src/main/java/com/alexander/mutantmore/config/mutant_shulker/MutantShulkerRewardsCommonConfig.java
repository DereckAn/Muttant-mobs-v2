package com.alexander.mutantmore.config.mutant_shulker;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class MutantShulkerRewardsCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> shield_durability;
   public static final ConfigValue<Double> shield_bullet_damage;
   public static final ConfigValue<Double> shield_bullet_explosion_size;
   public static final ConfigValue<Integer> shield_bullet_levitation_length;
   public static final ConfigValue<Integer> shield_bullet_levitation_level;
   public static final ConfigValue<Integer> shield_shoot_cooldown;
   public static final ConfigValue<Boolean> shield_bullet_griefing;
   public static final ConfigValue<Boolean> shield_bullet_griefing_drops_blocks;
   public static final ConfigValue<Double> turret_mutant_shulker_bullet_damage;
   public static final ConfigValue<Double> turret_mutant_shulker_bullet_explosion_size;
   public static final ConfigValue<Integer> turret_mutant_shulker_bullet_levitation_length;
   public static final ConfigValue<Integer> turret_mutant_shulker_bullet_levitation_level;
   public static final ConfigValue<Boolean> turret_mutant_shulker_bullet_griefing;
   public static final ConfigValue<Boolean> turret_mutant_shulker_bullet_griefing_drops_blocks;
   public static final ConfigValue<Double> turret_shulker_bullet_damage;
   public static final ConfigValue<Integer> turret_shulker_bullet_levitation_length;
   public static final ConfigValue<Integer> turret_shulker_bullet_levitation_level;
   public static final ConfigValue<Boolean> turret_ignores_levitating_mobs;
   public static final ConfigValue<Integer> turret_shoot_cooldown;
   public static final ConfigValue<Boolean> turret_locked_horizontal_movement;
   public static final ConfigValue<Double> turret_max_health;
   public static final ConfigValue<Integer> turret_repair_heal_percent;
   public static final ConfigValue<Double> turret_knockback_resistance;
   public static final ConfigValue<Double> turret_armour;
   public static final ConfigValue<Double> turret_armour_toughness;
   public static final ConfigValue<Double> turret_follow_range;
   public static final ConfigValue<Boolean> turret_friendly_fire;
   public static final ConfigValue<Double> trap_mutant_shulker_damage;
   public static final ConfigValue<Double> trap_player_damage;
   public static final ConfigValue<Boolean> trap_mutant_shulker_multiuse;
   public static final ConfigValue<Boolean> trap_player_multiuse;
   public static final ConfigValue<Boolean> trap_turns_to_bullet;
   public static final ConfigValue<Integer> trap_turn_to_bullet_time;
   public static final ConfigValue<Integer> trap_slowness_length;
   public static final ConfigValue<Integer> trap_slowness_level;
   public static final ConfigValue<Double> trap_thorns_damage;
   public static final ConfigValue<Double> trap_max_health;
   public static final ConfigValue<Double> trap_armour;
   public static final ConfigValue<Double> trap_armour_toughness;
   public static final ConfigValue<Double> trap_knockback_resistance;
   public static final ConfigValue<Double> trap_shulker_bullet_damage;
   public static final ConfigValue<Integer> trap_shulker_bullet_levitation_length;
   public static final ConfigValue<Integer> trap_shulker_bullet_levitation_level;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      BUILDER.push("MUTANT SHULKER SHIELD");
      shield_durability = BUILDER.define(List.of("Shield Durability"), 672);
      shield_bullet_damage = BUILDER.define(List.of("Shield Bullet Damage"), 8.0);
      shield_bullet_explosion_size = BUILDER.define(List.of("Shield Bullet Explosion Size"), 2.0);
      shield_bullet_levitation_length = BUILDER.define(List.of("Shield Bullet Levitation Length"), 100);
      shield_bullet_levitation_level = BUILDER.define(List.of("Shield Bullet Levitation Level"), 3);
      shield_shoot_cooldown = BUILDER.define(List.of("Shield Shoot Cooldown"), 200);
      shield_bullet_griefing = BUILDER.define(List.of("Shield Bullet Griefing"), false);
      shield_bullet_griefing_drops_blocks = BUILDER.define(List.of("Shield Bullet Griefing Drops Blocks"), true);
      BUILDER.pop();
      BUILDER.push("MUTANT SHULKER TURRET");
      turret_mutant_shulker_bullet_damage = BUILDER.define(List.of("Turret Mutant Shulker Bullet Damage"), 8.0);
      turret_mutant_shulker_bullet_explosion_size = BUILDER.define(
      List.of("Turret Mutant Shulker Bullet Explosion Size"), 2.0
   );
      turret_mutant_shulker_bullet_levitation_length = BUILDER.define(
      List.of("Turret Mutant Shulker Bullet Levitation Length"), 100
   );
      turret_mutant_shulker_bullet_levitation_level = BUILDER.define(
      List.of("Turret Mutant Shulker Bullet Levitation Level"), 3
   );
      turret_mutant_shulker_bullet_griefing = BUILDER.define(List.of("Turret Mutant Shulker Bullet Griefing"), false);
      turret_mutant_shulker_bullet_griefing_drops_blocks = BUILDER.define(
      List.of("Turret Mutant Shulker Bullet Griefing Drops Blocks"), true
   );
      turret_shulker_bullet_damage = BUILDER.define(List.of("Turret Shulker Bullet Damage"), 4.0);
      turret_shulker_bullet_levitation_length = BUILDER.define(List.of("Turret Shulker Bullet Levitation Length"), 200);
      turret_shulker_bullet_levitation_level = BUILDER.define(List.of("Turret Shulker Bullet Levitation Level"), 0);
      turret_ignores_levitating_mobs = BUILDER.define(List.of("Turret Ignores Levitating Mobs"), true);
      turret_shoot_cooldown = BUILDER.define(List.of("Turret Shoot Cooldown"), 60);
      turret_locked_horizontal_movement = BUILDER.define(List.of("Turret Locked Horizontal Movement"), true);
      turret_max_health = BUILDER.define(List.of("Turret Max Health"), 200.0);
      turret_repair_heal_percent = BUILDER.define(List.of("Turret Repair Heal Percent"), 50);
      turret_knockback_resistance = BUILDER.define(List.of("Turret Knockback Resistance"), 1.0);
      turret_armour = BUILDER.define(List.of("Turret Armour"), 10.0);
      turret_armour_toughness = BUILDER.define(List.of("Turret Armour Toughness"), 0.0);
      turret_follow_range = BUILDER.define(List.of("Turret Target Mobs Range"), 30.0);
      turret_friendly_fire = BUILDER.define(List.of("Turret Friendly Fire"), false);
      BUILDER.pop();
      BUILDER.push("MUTANT SHULKER TRAP");
      trap_mutant_shulker_damage = BUILDER.define(List.of("Trap Mutant Shulker Damage"), 10.0);
      trap_player_damage = BUILDER.define(List.of("Trap Player Damage"), 10.0);
      trap_mutant_shulker_multiuse = BUILDER.define(List.of("Trap Mutant Shulker Multi-Use"), false);
      trap_player_multiuse = BUILDER.define(List.of("Trap Player Multi-Use"), true);
      trap_turns_to_bullet = BUILDER.define(List.of("Trap Turns to Bullet"), true);
      trap_turn_to_bullet_time = BUILDER.define(List.of("Trap Turn to Bullet Time"), 300);
      trap_slowness_length = BUILDER.define(List.of("Trap Slowness Length"), 80);
      trap_slowness_level = BUILDER.define(List.of("Trap Slowness Level"), 1);
      trap_thorns_damage = BUILDER.define(List.of("Trap Thorns Damage"), 4.0);
      trap_max_health = BUILDER.define(List.of("Trap Max Health"), 5.0);
      trap_armour = BUILDER.define(List.of("Trap Armour"), 5.0);
      trap_armour_toughness = BUILDER.define(List.of("Trap Armour Toughness"), 0.0);
      trap_knockback_resistance = BUILDER.define(List.of("Trap Knockback Resistance"), 1.0);
      trap_shulker_bullet_damage = BUILDER.define(List.of("Trap Shulker Bullet Damage"), 8.0);
      trap_shulker_bullet_levitation_length = BUILDER.define(List.of("Trap Shulker Bullet Levitation Length"), 100);
      trap_shulker_bullet_levitation_level = BUILDER.define(List.of("Trap Shulker Bullet Levitation Level"), 0);
      BUILDER.pop();
      SPEC = BUILDER.build();
   }
}
