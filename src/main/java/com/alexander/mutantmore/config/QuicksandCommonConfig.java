package com.alexander.mutantmore.config;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class QuicksandCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> min_lifespan;
   public static final ConfigValue<Integer> max_lifespan;
   public static final ConfigValue<Double> horizontal_movement_multiplication;
   public static final ConfigValue<Double> vertical_movement_multiplication;
   public static final ConfigValue<Boolean> player_quicksand_doesnt_vanish;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      min_lifespan = BUILDER.define(List.of("Minimum Lifespan (in ticks, default: 200)"), 200);
      max_lifespan = BUILDER.define(List.of("Maximum Lifespan (in ticks, default: 400)"), 400);
      horizontal_movement_multiplication = BUILDER.define(
      List.of("Mob Horizontal Movement Multiplier (default: 0.75)"), 0.75
   );
      vertical_movement_multiplication = BUILDER.define(List.of("Mob Vertical Movement Multiplier (default: 0.5)"), 0.5);
      player_quicksand_doesnt_vanish = BUILDER.define(
      List.of("Player-Placed Quicksand Doesn't Despawn (default: true)"), true
   );
      SPEC = BUILDER.build();
   }
}
