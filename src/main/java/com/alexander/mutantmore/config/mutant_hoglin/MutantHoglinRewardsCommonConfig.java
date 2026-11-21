package com.alexander.mutantmore.config.mutant_hoglin;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class MutantHoglinRewardsCommonConfig {
   public static final Builder BUILDER = new Builder();
   public static final ForgeConfigSpec SPEC = BUILDER.build();
   public static final ConfigValue<Integer> helmet_durability_multiplier = BUILDER.define(List.of("Durability Multiplier (end result is 11 * this)"), 37);
   public static final ConfigValue<Integer> helmet_armour_value = BUILDER.define(List.of("Armour Value (default: 3)"), 3);
   public static final ConfigValue<Float> helmet_armour_toughness = BUILDER.define(List.of("Armour Toughness Value (default: 3)"), 3.0F);
   public static final ConfigValue<Integer> helmet_enchantment_value = BUILDER.define(List.of("Enchantment Value (default: 15)"), 15);
   public static final ConfigValue<Float> helmet_knockback_resistance = BUILDER.define(List.of("Knockback Resistance (default: 0.1)"), 0.1F);
   public static final ConfigValue<Integer> helmet_max_rage_level = BUILDER.define(List.of("Enraged Effect Maximum Level (default: 4)"), 4);
   public static final ConfigValue<Integer> helmet_initial_rage_duration_increase = BUILDER.define(
      List.of("Initial Enraged Effect Duration Increase (in ticks, default: 40)"), 40
   );
   public static final ConfigValue<Integer> helmet_rage_duration_increase = BUILDER.define(
      List.of("Enraged Effect Duration Increase (in ticks, default: 30)"), 30
   );
   public static final ConfigValue<Integer> helmet_max_rage_duration = BUILDER.define(List.of("Enraged Effect Maximum Duration (in ticks, default: 200)"), 200);
   public static final ConfigValue<Float> helmet_rage_damage_multiplier = BUILDER.define(
      List.of("Enraged Damage Multiplier (end result is 1 + Enraged effect level * this, default: 0.2)"), 0.2F
   );
   public static final ConfigValue<Integer> lance_charge_durability_consumption = BUILDER.define(List.of("Charge Durability Consumption (default: 5)"), 5);
   public static final ConfigValue<Double> lance_charge_damage = BUILDER.define(List.of("Charge Damage (default: 12)"), 12.0);
   public static final ConfigValue<Integer> lance_charge_cooldown = BUILDER.define(List.of("Charge Cooldown (in ticks, default: 100)"), 100);
   public static final ConfigValue<Integer> lance_durability = BUILDER.define(List.of("Durability (default: 400)"), 400);
   public static final ConfigValue<Double> lance_attack_speed = BUILDER.define(List.of("Attack Speed (default: -2.5)"), -2.5);
   public static final ConfigValue<Double> lance_attack_damage = BUILDER.define(List.of("Attack Damage (default: 7)"), 7.0);
   public static final ConfigValue<Double> lance_attack_range_increase = BUILDER.define(List.of("Attack Range Increase (default: 0.5)"), 0.5);
   public static final ConfigValue<Integer> gauntlet_stomp_durability_consumption = BUILDER.define(List.of("Stomp Durability Consumption (default: 5)"), 5);
   public static final ConfigValue<Double> gauntlet_stomp_damage = BUILDER.define(List.of("Stomp Damage (default: 8)"), 8.0);
   public static final ConfigValue<Double> gauntlet_stomp_range = BUILDER.define(List.of("Stomp Range (in blocks, default: 10)"), 10.0);
   public static final ConfigValue<Integer> gauntlet_stomp_cooldown = BUILDER.define(List.of("Stomp Cooldown (default: 150)"), 150);
   public static final ConfigValue<Integer> gauntlet_durability = BUILDER.define(List.of("Durability (default: 600)"), 600);
   public static final ConfigValue<Double> gauntlet_attack_speed = BUILDER.define(List.of("Attack Speed (default: -1)"), -1.0);
   public static final ConfigValue<Double> gauntlet_attack_damage = BUILDER.define(List.of("Attack Damage (default: 5)"), 5.0);

   static {
      BUILDER.push("HOG HELM");
      BUILDER.pop();
      BUILDER.push("HOGLANCE");
      BUILDER.pop();
      BUILDER.push("HOGFIST GAUNTLET");
      BUILDER.pop();
   }
}
