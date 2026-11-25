package com.alexander.mutantmore.config.mutant_blaze;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class HeatCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Double> cool_down_speed;
   public static final ConfigValue<Integer> cool_down_delay;
   public static final ConfigValue<Integer> damage_interval;
   public static final ConfigValue<Double> damage;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      cool_down_speed = BUILDER.define(List.of("Cool Down Speed (per tick, default: 0.025)"), 0.025);
      cool_down_delay = BUILDER.define(List.of("Cool Down Delay (in ticks, default: 40)"), 40);
      damage_interval = BUILDER.define(List.of("Damage Interval (in ticks, default: 20)"), 20);
      damage = BUILDER.define(List.of("Damage (default: 2)"), 2.0);
      SPEC = BUILDER.build();
   }
}
