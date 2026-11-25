package com.alexander.mutantmore.config.mutant_husk;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class MutantHuskRewardsCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> hammer_shockwave_length;
   public static final ConfigValue<Integer> hammer_shockwave_cooldown;
   public static final ConfigValue<Double> hammer_shockwave_damage;
   public static final ConfigValue<Double> hammer_shockwave_knockback;
   public static final ConfigValue<Double> hammer_geyser_knockback;
   public static final ConfigValue<Integer> hammer_shockwave_durability_consumption;
   public static final ConfigValue<Integer> hammer_durability;
   public static final ConfigValue<Double> hammer_attack_speed;
   public static final ConfigValue<Double> hammer_attack_damage;
   public static final ConfigValue<Integer> cannon_durability;
   public static final ConfigValue<Integer> cannon_use_cooldown;
   public static final ConfigValue<Double> cannon_damage;
   public static final ConfigValue<Integer> cannon_sand_boulder_lifespan;
   public static final ConfigValue<Boolean> cannon_griefing;
   public static final ConfigValue<Integer> horn_durability;
   public static final ConfigValue<Integer> horn_use_cooldown;
   public static final ConfigValue<Double> horn_damage_range;
   public static final ConfigValue<Double> horn_damage;
   public static final ConfigValue<Double> horn_quicksand_range;
   public static final ConfigValue<Boolean> horn_griefing;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      BUILDER.push("HUSK HAMMER");
      hammer_shockwave_length = BUILDER.define(List.of("Shockwave Length (default: 5)"), 5);
      hammer_shockwave_cooldown = BUILDER.define(List.of("Shockwave Cooldown (in ticks, default: 40)"), 40);
      hammer_shockwave_damage = BUILDER.define(List.of("Shockwave Damage (default: 6)"), 6.0);
      hammer_shockwave_knockback = BUILDER.define(List.of("Shockwave Knockback (default: 0.5)"), 0.5);
      hammer_geyser_knockback = BUILDER.define(List.of("Geyser Knockback (default: 0.8)"), 0.8);
      hammer_shockwave_durability_consumption = BUILDER.define(
      List.of("Shockwave Durability Consumption (default: 5)"), 5
   );
      hammer_durability = BUILDER.define(List.of("Durability (default: 500)"), 500);
      hammer_attack_speed = BUILDER.define(List.of("Attack Speed (default: -3)"), -3.0);
      hammer_attack_damage = BUILDER.define(List.of("Attack Damage (default: 8)"), 8.0);
      BUILDER.pop();
      BUILDER.push("SAND CANNON");
      cannon_durability = BUILDER.define(List.of("Durability (default: 75)"), 75);
      cannon_use_cooldown = BUILDER.define(List.of("Use Cooldown (in ticks, default: 200)"), 200);
      cannon_damage = BUILDER.define(List.of("Damage (default: 7)"), 7.0);
      cannon_sand_boulder_lifespan = BUILDER.define(List.of("Sand Boulders Despawn After (in ticks, default: 60)"), 60);
      cannon_griefing = BUILDER.define(List.of("Griefing (default: true)"), true);
      BUILDER.pop();
      BUILDER.push("DESERT HORN");
      horn_durability = BUILDER.define(List.of("Durability (default: 100)"), 100);
      horn_use_cooldown = BUILDER.define(List.of("Use Cooldown (in ticks, default: 200)"), 200);
      horn_damage_range = BUILDER.define(List.of("Damage Range (in blocks, default: 14)"), 14.0);
      horn_damage = BUILDER.define(List.of("Damage (default: 4)"), 4.0);
      horn_quicksand_range = BUILDER.define(List.of("Quicksand Range (in blocks, default: 12)"), 12.0);
      horn_griefing = BUILDER.define(List.of("Griefing (default: true)"), true);
      BUILDER.pop();
      SPEC = BUILDER.build();
   }
}
