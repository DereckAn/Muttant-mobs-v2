package com.alexander.mutantmore.config.mutant_shulker;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class MutantShulkerCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> exp_reward;
   public static final ConfigValue<Double> max_health;
   public static final ConfigValue<Double> movement_speed;
   public static final ConfigValue<Double> flying_movement_speed;
   public static final ConfigValue<Double> knockback_resistance;
   public static final ConfigValue<Double> armour;
   public static final ConfigValue<Double> armour_toughness;
   public static final ConfigValue<Double> follow_player_distance;
   public static final ConfigValue<Double> follow_non_player_distance;
   public static final ConfigValue<Double> mutant_shulker_bullet_damage;
   public static final ConfigValue<Integer> mutant_shulker_bullet_hits;
   public static final ConfigValue<Double> mutant_shulker_bullet_explosion_size;
   public static final ConfigValue<Integer> mutant_shulker_bullet_levitation_length;
   public static final ConfigValue<Integer> mutant_shulker_bullet_levitation_level;
   public static final ConfigValue<Double> bite_damage;
   public static final ConfigValue<Integer> bite_disable_shield_length;
   public static final ConfigValue<Double> fly_damage;
   public static final ConfigValue<Double> anvil_crush_damage;
   public static final ConfigValue<Double> death_explosion_damage;
   public static final ConfigValue<Boolean> ignores_invulnerability_time;
   public static final ConfigValue<Double> shell_heal_amount;
   public static final ConfigValue<Integer> shell_heal_interval;
   public static final ConfigValue<Boolean> enters_shell;
   public static final ConfigValue<Boolean> leaves_shell;
   public static final ConfigValue<Boolean> uses_fly;
   public static final ConfigValue<Boolean> uses_anvil_crush;
   public static final ConfigValue<Boolean> uses_scatter_traps;
   public static final ConfigValue<Boolean> uses_scatter_traps_in_shell;
   public static final ConfigValue<Boolean> uses_bite;
   public static final ConfigValue<Boolean> uses_shoot;
   public static final ConfigValue<Boolean> uses_shoot_in_shell;
   public static final ConfigValue<Boolean> attacks_players;
   public static final ConfigValue<Boolean> no_target_enter_shell;
   public static final ConfigValue<Double> leave_shell_health_healed;
   public static final ConfigValue<Integer> enter_shell_health_threshold;
   public static final ConfigValue<Integer> enter_shell_cooldown;
   public static final ConfigValue<Integer> no_target_enter_shell_chance;
   public static final ConfigValue<Integer> targeting_enter_shell_chance;
   public static final ConfigValue<Double> following_movement_speed_multiplier;
   public static final ConfigValue<Double> follow_target_wanted_distance;
   public static final ConfigValue<Integer> fly_health_threshold;
   public static final ConfigValue<Integer> stop_flying_time;
   public static final ConfigValue<Integer> fly_cooldown;
   public static final ConfigValue<Boolean> enters_shell_after_flying;
   public static final ConfigValue<Boolean> getting_hit_cancels_flying;
   public static final ConfigValue<Integer> anvil_crush_chance;
   public static final ConfigValue<Integer> scatter_traps_chance;
   public static final ConfigValue<Integer> scatter_traps_in_shell_chance;
   public static final ConfigValue<Double> max_bite_distance;
   public static final ConfigValue<Double> max_bite_damage_distance;
   public static final ConfigValue<Integer> shoot_chance;
   public static final ConfigValue<Integer> shoot_max_nearby_mutant_shulker_bullets;
   public static final ConfigValue<Integer> shoot_in_shell_chance;
   public static final ConfigValue<Integer> shoot_in_shell_max_nearby_mutant_shulker_bullets;
   public static final ConfigValue<Boolean> teleports_when_hit;
   public static final ConfigValue<Integer> teleport_when_hit_chance;
   public static final ConfigValue<Boolean> teleports_to_follow_target;
   public static final ConfigValue<Boolean> teleports_while_flying;
   public static final ConfigValue<Boolean> teleports_while_in_shell;
   public static final ConfigValue<Integer> basic_teleport_chance;
   public static final ConfigValue<Boolean> teleports_in_water;
   public static final ConfigValue<Boolean> teleports_to_avoid_falling_into_the_void;
   public static final ConfigValue<Boolean> mutant_shulker_bullet_griefing;
   public static final ConfigValue<Boolean> mutant_shulker_bullet_griefing_drops_blocks;
   public static final ConfigValue<Boolean> death_griefing;
   public static final ConfigValue<Boolean> death_griefing_drops_blocks;
   public static final ConfigValue<Boolean> flight_griefing;
   public static final ConfigValue<Boolean> flight_griefing_drops_blocks;
   public static final ConfigValue<Boolean> walk_griefing;
   public static final ConfigValue<Boolean> walk_griefing_drops_blocks;
   public static final ConfigValue<Boolean> hurt_griefing;
   public static final ConfigValue<Boolean> hurt_griefing_drops_blocks;
   public static final ConfigValue<Boolean> spawn_griefing;
   public static final ConfigValue<Boolean> spawn_griefing_drops_blocks;
   public static final ConfigValue<Boolean> despawns;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      BUILDER.push("stat_config");
      exp_reward = BUILDER.comment(
         "\n The amount of Experience dropped by the Mutant Shulker when it dies\n usually set to 60"
      )
      .define("Experience Reward", 60);
      max_health = BUILDER.comment("\n The Mutant Shulker's max health\n usually set to 300").define("Max Health", 300.0);
      movement_speed = BUILDER.comment("\n The Mutant Shulker's movement speed\n usually set to 0.275D")
      .define("Movement Speed", 0.275);
      flying_movement_speed = BUILDER.comment(
         "\n The speed that the Mutant Shulker moves while flying\n usually set to 1.0"
      )
      .define("Flying Movement Speed", 1.0);
      knockback_resistance = BUILDER.comment(
         "\n The Mutant Shulker's resistance to attack knockback\n usually set to 1.0 (no knockback)"
      )
      .define("Knockback Resistance", 1.0);
      armour = BUILDER.comment("\n The Mutant Shulker's armour value\n usually set to 10.0").define("Armour", 10.0);
      armour_toughness = BUILDER.comment("\n The Mutant Shulker's armour toughness value\n usually set to 0.0")
      .define("Armour Toughness", 0.0);
      follow_player_distance = BUILDER.comment(
         "\n The distance that the Mutant Shulker can target players from\n usually set to 64.0"
      )
      .define("Follow Player Distance", 64.0);
      follow_non_player_distance = BUILDER.comment(
         "\n The distance that the Mutant Shulker can target non-player entities from\n usually set to 25.0"
      )
      .define("Follow Non-Player Distance", 25.0);
      mutant_shulker_bullet_damage = BUILDER.comment(
         "\n The damage dealt to mobs caught in the explosion caused when a Mutant Shulker Bullet fired by the Mutant Shulker collides with blocks or mobs\n usually set to 8.0"
      )
      .define("Mutant Shulker Bullet Damage", 8.0);
      mutant_shulker_bullet_hits = BUILDER.comment(
         "\n The amount of times that a Mutant Shulker Bullet fired by the Mutant Shulker can be hit before it is destroyed\n usually set to 3"
      )
      .define("Mutant Shulker Bullet Hits", 3);
      mutant_shulker_bullet_explosion_size = BUILDER.comment(
         "\n The size of explosions caused when Mutant Shulker Bullets fired by the Mutant Shulker collide with blocks or mobs\n usually set to 2.0"
      )
      .define("Mutant Shulker Bullet Explosion Size", 2.0);
      mutant_shulker_bullet_levitation_length = BUILDER.comment(
         "\n The length in ticks that the Levitation effect is applied to mobs hit by Mutant Shulker Bullets fired by the Mutant Shulker for\n usually set to 100"
      )
      .define("Mutant Shulker Bullet Levitation Length", 100);
      mutant_shulker_bullet_levitation_level = BUILDER.comment(
         "\n The level of the Levitation effect applied to mobs hit by Mutant Shulker Bullets fired by the Mutant Shulker\n usually set to 3 (Levitation 4)"
      )
      .define("Mutant Shulker Bullet Levitation Level", 3);
      bite_damage = BUILDER.comment("\n The damage that the Mutant Shulker's bite attack deals\n usually set to 25.0")
      .define("Bite Damage", 25.0);
      bite_disable_shield_length = BUILDER.comment(
         "\n The amount of time in ticks that the Mutant Shulker disables its target's Shield for if they block its bite attack\n usually set to"
      )
      .define("Bite Disable Shield Length", 160);
      fly_damage = BUILDER.comment(
         "\n The damage that the Mutant Shulker deals when flying into mobs\n usually set to 10.0"
      )
      .define("Fly Damage", 10.0);
      anvil_crush_damage = BUILDER.comment(
         "\n The damage that the Mutant Shulker's anvil crush attack deals\n usually set to 30.0"
      )
      .define("Anvil Crush Damage", 30.0);
      death_explosion_damage = BUILDER.comment(
         "\n The damage that the explosion caused when the Mutant Shulker dies deals\n usually set to 30.0"
      )
      .define("Death Explosion Damage", 30.0);
      ignores_invulnerability_time = BUILDER.comment(
         "\n If the Mutant Shulker's attacks ignore the brief invulnerability mobs get when damaged\n Makes sure the Mutant Shulker's attacks always hit when they're supposed to\n usually set to true"
      )
      .define("Ignores Invulnerability Time", true);
      shell_heal_amount = BUILDER.comment(
         "\n The amount that the Mutant Shulker heals itself while in its shell every shell heal intervalusually set to 1.0"
      )
      .define("Shell Heal Amount", 1.0);
      shell_heal_interval = BUILDER.comment(
         "\n The interval in ticks between the Mutant Shulker healing itself while in its shellusually set to 10"
      )
      .define("Shell Heal Interval", 10);
      BUILDER.pop();
      BUILDER.push("ai_config");
      enters_shell = BUILDER.comment("\n If the Mutant Shulker enters its shell to heal\n usually set to true")
      .define("Enters Shell", true);
      leaves_shell = BUILDER.comment("\n If the Mutant Shulker leaves its shell after healing\n usually set to true")
      .define("Leaves Shell", true);
      uses_fly = BUILDER.comment("\n If the Mutant Shulker uses its fly ability\n usually set to true")
      .define("Uses Fly", true);
      uses_anvil_crush = BUILDER.comment("\n If the Mutant Shulker uses its anvil crush attack\n usually set to true")
      .define("Uses Anvil Crush", true);
      uses_scatter_traps = BUILDER.comment("\n If the Mutant Shulker uses its scatter traps attack\n usually set to true")
      .define("Uses Scatter Traps", true);
      uses_scatter_traps_in_shell = BUILDER.comment(
         "\n If the Mutant Shulker uses its scatter traps attack while in its shell\n usually set to true"
      )
      .define("Uses Scatter Traps In Shell", true);
      uses_bite = BUILDER.comment("\n If the Mutant Shulker uses its bite attack\n usually set to true")
      .define("Uses Bite", true);
      uses_shoot = BUILDER.comment("\n If the Mutant Shulker uses its shoot attack\n usually set to true")
      .define("Uses Shoot", true);
      uses_shoot_in_shell = BUILDER.comment(
         "\n If the Mutant Shulker uses its shoot attack while in its shell\n usually set to true"
      )
      .define("Uses Shoot In Shell", true);
      attacks_players = BUILDER.comment("\n If the Mutant Shulker attacks players\n usually set to true")
      .define("Attacks Players", true);
      no_target_enter_shell = BUILDER.comment(
         "\n If the Mutant Shulker enters its shell to heal if below full health when it doesn't have a target\n usually set to true"
      )
      .define("No Target Enter Shell", true);
      leave_shell_health_healed = BUILDER.comment(
         "\n The amount of health that the Mutant Shulker must heal while in its shell before leaving the shell when it does have a target\n usually set to 25.0"
      )
      .define("Leave Shell Health Healed", 25.0);
      enter_shell_health_threshold = BUILDER.comment(
         "\n The percentage of max health that the Mutant Shulker must be at or below to enter its shell to heal\n usually set to 50%"
      )
      .define("Enter Shell Health Threshold", 50);
      enter_shell_cooldown = BUILDER.comment(
         "\n The amount of time in ticks after leaving its shell before the Mutant Shulker can enter its shell to heal again\n usually set to 400"
      )
      .define("Enter Shell Cooldown", 400);
      no_target_enter_shell_chance = BUILDER.comment(
         "\n The chance every tick if the Mutant Shulker isn't using an ability, that it will enter its shell if below max health when it doesn't have a target\n usually set to 1 in 25"
      )
      .define("No Target Enter Shell Chance", 25);
      targeting_enter_shell_chance = BUILDER.comment(
         "\n The chance every tick if the Mutant Shulker isn't using an ability, that it will enter its shell if its health is at or below enter shell health threshold when it has a target\n usually set to 1 in 5"
      )
      .define("Targeting Enter Shell Chance", 5);
      following_movement_speed_multiplier = BUILDER.comment(
         "\n The amount that the Mutant Shulker's movement speed is multiplied when it's pursuing a target\n usually set to 1.5"
      )
      .define("Following Movement Speed Multiplier", 1.5);
      follow_target_wanted_distance = BUILDER.comment(
         "\n The distance to its target that the Mutant Shulker tries to reach\n usually set to 10.0"
      )
      .define("Follow Target Wanted Distance", 10.0);
      fly_health_threshold = BUILDER.comment(
         "\n The percentage of max health that the Mutant Shulker must be at or below to use its fly ability\n usually set to 75%"
      )
      .define("Fly Health Threshold", 75);
      stop_flying_time = BUILDER.comment(
         "\n The amount of time in ticks that the Mutant Shulker can fly for before having to land\n usually set to 400"
      )
      .define("Stop Flying Time", 400);
      fly_cooldown = BUILDER.comment(
         "\n The amount of time in ticks that the Mutant Shulker has to wait after flying before it can fly again\n usually set to 600"
      )
      .define("Flying Cooldown", 600);
      enters_shell_after_flying = BUILDER.comment(
         "\n If the Mutant Shulker enters its shell when it finishes flying\n usually set to true"
      )
      .define("Enters Shell After Flying", true);
      getting_hit_cancels_flying = BUILDER.comment(
         "\n If the Mutant Shulker stops flying if it gets hurt while doing so\n usually set to true"
      )
      .define("Getting Hit Cancels Flying", true);
      anvil_crush_chance = BUILDER.comment(
         "\n The chance every tick if the Mutant Shulker isn't using an ability, that it will use its anvil crush attack (only used while in its shell)\n usually set to 1 in 35"
      )
      .define("Anvil Crush Chance", 35);
      scatter_traps_chance = BUILDER.comment(
         "\n The chance every tick if the Mutant Shulker isn't using an ability, that it will use its scatter traps attack\n usually set to 1 in 100"
      )
      .define("Scatter Traps Chance", 100);
      scatter_traps_in_shell_chance = BUILDER.comment(
         "\n The chance every tick if the Mutant Shulker isn't using an ability, that it will use its scatter traps attack while in its shell\n usually set to 1 in 100"
      )
      .define("Scatter Traps In Shell Chance", 100);
      max_bite_distance = BUILDER.comment(
         "\n The maximum distance from its target that the Mutant Shulker can be to use its bite attack\n usually set to 4.0"
      )
      .define("Maximum Bite Distance", 4.0);
      max_bite_damage_distance = BUILDER.comment(
         "\n The maximum distance from its target that the Mutant Shulker can be to damage them using its bite attack\n usually set to 5.0"
      )
      .define("Maximum Bite Damage Distance", 5.0);
      shoot_chance = BUILDER.comment(
         "\n The chance every tick if the Mutant Shulker isn't using an ability, that it will use its shoot attack\n usually set to 1 in 15"
      )
      .define("Shoot Chance", 15);
      shoot_max_nearby_mutant_shulker_bullets = BUILDER.comment(
         "\n The maximum amount of Mutant Shulker Bullets that can be nearby for the Mutant Shulker to shoot more\n usually set to 0"
      )
      .define("Shoot Max Nearby Mutant Shulker Bullets", 0);
      shoot_in_shell_chance = BUILDER.comment(
         "\n The chance every tick if the Mutant Shulker isn't using an ability, that it will use its shoot attack while in its shell\n usually set to 1 in 25"
      )
      .define("Shoot In Shell Chance", 25);
      shoot_in_shell_max_nearby_mutant_shulker_bullets = BUILDER.comment(
         "\n The maximum amount of Mutant Shulker Bullets that can be nearby for the Mutant Shulker to shoot more while in its shell\n usually set to 4"
      )
      .define("Shoot In Shell Max Nearby Mutant Shulker Bullets", 4);
      teleports_when_hit = BUILDER.comment(
         "\n If the Mutant Shulker can teleport to avoid being hit\n usually set to true"
      )
      .define("Teleports To Avoid Being Hit", true);
      teleport_when_hit_chance = BUILDER.comment(
         "\n The chance that the Mutant Shulker will teleport to avoid being hit\n usually set to 1 in 5"
      )
      .define("Teleport to Avoid Being Hit Chance", 5);
      teleports_to_follow_target = BUILDER.comment(
         "\n If the Mutant Shulker can teleport to follow its target\n usually set to true"
      )
      .define("Teleports to Follow Target", true);
      teleports_while_flying = BUILDER.comment(
         "\n If the Mutant Shulker can teleport to confuse its target while flying\n usually set to true"
      )
      .define("Teleports While Flying", true);
      teleports_while_in_shell = BUILDER.comment(
         "\n If the Mutant Shulker can teleport to avoid its target while in its shell\n usually set to true"
      )
      .define("Teleports While in Shell", true);
      basic_teleport_chance = BUILDER.comment(
         "\n The chance every tick that the Mutant Shulker will teleport to follow its target, confuse its target while flying or teleport to avoid its target while in its shell\n usually set to 1 in 125"
      )
      .define("Basic Teleport Chance", 125);
      teleports_in_water = BUILDER.comment("\n If the Mutant Shulker teleports to avoid water\n usually set to true")
      .define("Teleports in Water", true);
      teleports_to_avoid_falling_into_the_void = BUILDER.comment(
         "\n If the Mutant Shulker teleports to avoid falling into the void and dying\n usually set to true"
      )
      .define("Teleports to Avoid Falling Into The Void", true);
      BUILDER.pop();
      BUILDER.push("griefing_config");
      mutant_shulker_bullet_griefing = BUILDER.comment(
         "\n If Mutant Shulker Bullets fired by the Mutant Shulker destroy blocks when they explode\n usually set to true"
      )
      .define("Mutant Shulker Bullet Griefing", true);
      mutant_shulker_bullet_griefing_drops_blocks = BUILDER.comment(
         "\n If blocks destroyed by Mutant Shulker Bullets fired by the Mutant Shulker exploding drop themselves as items, allowing them to be recovered, impacts performance\n usually set to false"
      )
      .define("Mutant Shulker Bullet Griefing Drops Blocks", false);
      death_griefing = BUILDER.comment(
         "\n If the Mutant Shulker destroys blocks when it explodes when dying\n usually set to true"
      )
      .define("Death Griefing", true);
      death_griefing_drops_blocks = BUILDER.comment(
         "\n If blocks destroyed by Mutant Shulker exploding when dying drop themselves as items, allowing them to be recovered, impacts performance\n usually set to false"
      )
      .define("Death Griefing Drops Blocks", false);
      flight_griefing = BUILDER.comment("\n If the Mutant Shulker breaks blocks it flies into\n usually set to true")
      .define("Flight Griefing", true);
      flight_griefing_drops_blocks = BUILDER.comment(
         "\n If blocks the Mutant Shulker breaks by flying drop themselves as items, allowing them to be recovered, impacts performance\n usually set to false"
      )
      .define("Flight Griefing Drops Blocks", false);
      walk_griefing = BUILDER.comment(
         "\n If the Mutant Shulker breaks certain types of blocks it walks into, helps with pathfinding\n usually set to true"
      )
      .define("Walk Griefing", true);
      walk_griefing_drops_blocks = BUILDER.comment(
         "\n If blocks the Mutant Shulker breaks by walking drop themselves as items, allowing them to be recovered, impacts performance\n usually set to false"
      )
      .define("Walk Griefing Drops Blocks", false);
      hurt_griefing = BUILDER.comment(
         "\n If the Mutant Shulker breaks blocks around it after getting hurt, similarly to the Wither, helps prevent cheesing\n usually set to true"
      )
      .define("Hurt Griefing", true);
      hurt_griefing_drops_blocks = BUILDER.comment(
         "\n If blocks the Mutant Shulker breaks after getting hurt drop themselves as items, allowing them to be recovered, impacts performance\n usually set to false"
      )
      .define("Hurt Griefing Drops Blocks", false);
      spawn_griefing = BUILDER.comment(
         "\n If the Mutant Shulker breaks blocks ardound it when spawning naturally, helps to stop the Mutant Shulker from getting stuck when spawning\n usually set to true"
      )
      .define("Spawn Griefing", true);
      spawn_griefing_drops_blocks = BUILDER.comment(
         "\n If blocks the Mutant Shulker breaks when spawning drop themselves as items, allowing them to be recovered, impacts performance\n usually set to true"
      )
      .define("Spawn Griefing Drops Blocks", true);
      BUILDER.pop();
      BUILDER.push("spawn_config");
      despawns = BUILDER.comment(
         "\n If the Mutant Shulker naturally despawnsNot recommended unless Spawns Naturally is set to true\n usually set to false"
      )
      .define("Despawns", false);
      BUILDER.pop();
      SPEC = BUILDER.build();
   }
}
