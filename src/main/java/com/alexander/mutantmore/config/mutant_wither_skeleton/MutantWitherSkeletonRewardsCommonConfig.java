package com.alexander.mutantmore.config.mutant_wither_skeleton;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class MutantWitherSkeletonRewardsCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> scimitar_shoot_wither_slash_speed;
   public static final ConfigValue<Integer> scimitar_shoot_wither_slash_durability_consumption;
   public static final ConfigValue<Double> scimitar_wither_slash_damage;
   public static final ConfigValue<Integer> scimitar_wither_slash_wither_length;
   public static final ConfigValue<Integer> scimitar_wither_slash_wither_level;
   public static final ConfigValue<Integer> scimitar_attack_wither_length;
   public static final ConfigValue<Integer> scimitar_attack_wither_level;
   public static final ConfigValue<Integer> scimitar_durability;
   public static final ConfigValue<Double> scimitar_attack_speed;
   public static final ConfigValue<Double> scimitar_attack_damage;
   public static final ConfigValue<Integer> scimitar_enchantment_value;
   public static final ConfigValue<Integer> armour_durability_multiplier;
   public static final ConfigValue<Integer> armour_helmet_armour_value;
   public static final ConfigValue<Double> armour_helmet_attack_speed_increase;
   public static final ConfigValue<Integer> armour_chestplate_armour_value;
   public static final ConfigValue<Double> armour_chestplate_damage_increase;
   public static final ConfigValue<Integer> armour_leggings_armour_value;
   public static final ConfigValue<Integer> armour_boots_armour_value;
   public static final ConfigValue<Integer> armour_enchantment_value;
   public static final ConfigValue<Float> armour_armour_toughness;
   public static final ConfigValue<Float> armour_knockback_resistance;
   public static final ConfigValue<Double> bomb_detection_range;
   public static final ConfigValue<Double> bomb_damage_range;
   public static final ConfigValue<Integer> bomb_wither_length;
   public static final ConfigValue<Integer> bomb_wither_level;
   public static final ConfigValue<Integer> bomb_slowness_length;
   public static final ConfigValue<Integer> bomb_slowness_level;
   public static final ConfigValue<Integer> bomb_blindness_length;
   public static final ConfigValue<Integer> bomb_damage_interval;
   public static final ConfigValue<Double> bomb_damage;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      BUILDER.push("WITHERED SCIMITAR");
      scimitar_shoot_wither_slash_speed = BUILDER.define(
      List.of("Shoot Wither Slash Cooldown (in ticks, default: 30)"), 30
   );
      scimitar_shoot_wither_slash_durability_consumption = BUILDER.define(
      List.of("Shoot Wither Slash Durability Consumption (default: 5)"), 5
   );
      scimitar_wither_slash_damage = BUILDER.define(List.of("Wither Slash Damage (default: 4)"), 4.0);
      scimitar_wither_slash_wither_length = BUILDER.define(
      List.of("Wither Slash Wither Effect Duration (in ticks, default: 300)"), 300
   );
      scimitar_wither_slash_wither_level = BUILDER.define(List.of("Wither Slash Wither Effect Level (default: 0)"), 0);
      scimitar_attack_wither_length = BUILDER.define(
      List.of("Attack Wither Effect Duration (in ticks, default: 200)"), 200
   );
      scimitar_attack_wither_level = BUILDER.define(List.of("Attack Wither Effect Level (default: 0)"), 0);
      scimitar_durability = BUILDER.define(List.of("Durability (default: 350)"), 350);
      scimitar_attack_speed = BUILDER.define(List.of("Attack Speed (default: -2.6)"), -2.6);
      scimitar_attack_damage = BUILDER.define(List.of("Attack Damage (default: 6)"), 6.0);
      scimitar_enchantment_value = BUILDER.define(List.of("Enchantment Value (default: 15)"), 15);
      BUILDER.pop();
      BUILDER.push("MUTANT WITHER SKELETON ARMOUR");
      armour_durability_multiplier = BUILDER.define(
      List.of("Durability Multiplier (end result is D * this, (D is 11 for helmet, 16 for chestplate, 15 for leggings, or 13 for boots), default: 17)"), 17
   );
      armour_helmet_armour_value = BUILDER.define(List.of("Helmet Armour Value (default: 3)"), 3);
      armour_helmet_attack_speed_increase = BUILDER.define(List.of("Helmet Attack Speed Increase (default: 0.25)"), 0.25);
      armour_chestplate_armour_value = BUILDER.define(List.of("Chestplate Armour Value (default: 7)"), 7);
      armour_chestplate_damage_increase = BUILDER.define(List.of("Chestplate Attack Damage Increase (default: 2)"), 2.0);
      armour_leggings_armour_value = BUILDER.define(List.of("Leggings Armour Value (default: 6)"), 6);
      armour_boots_armour_value = BUILDER.define(List.of("Boots Armour Value (default: 3)"), 3);
      armour_enchantment_value = BUILDER.define(List.of("Enchantment Value (default: 15)"), 15);
      armour_armour_toughness = BUILDER.define(List.of("Armour Toughness Value (default: 0)"), 0.0F);
      armour_knockback_resistance = BUILDER.define(List.of("Knockback Resistance (default: 0.1)"), 0.1F);
      BUILDER.pop();
      BUILDER.push("WITHER BOMB");
      bomb_detection_range = BUILDER.define(List.of("Target Detection Range (in blocks, default: 7.5)"), 7.5);
      bomb_damage_range = BUILDER.define(List.of("Damage Range (in blocks, default: 7.5)"), 7.5);
      bomb_wither_length = BUILDER.define(List.of("Wither Effect Duration (in ticks, default: 220)"), 220);
      bomb_wither_level = BUILDER.define(List.of("Wither Effect Level (default: 3)"), 3);
      bomb_slowness_length = BUILDER.define(List.of("Slowness Effect Duration (in ticks, default: 260)"), 260);
      bomb_slowness_level = BUILDER.define(List.of("Slowness Effect Level (default: 1)"), 1);
      bomb_blindness_length = BUILDER.define(List.of("Blindness Effect Duration (in ticks, default: 180)"), 180);
      bomb_damage_interval = BUILDER.define(List.of("Damage Interval (in ticks, default: 10)"), 10);
      bomb_damage = BUILDER.define(List.of("Damage (default: 1)"), 1.0);
      BUILDER.pop();
      SPEC = BUILDER.build();
   }
}
