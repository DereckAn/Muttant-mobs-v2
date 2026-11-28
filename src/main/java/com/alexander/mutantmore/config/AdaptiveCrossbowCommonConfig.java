package com.alexander.mutantmore.config;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class AdaptiveCrossbowCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> durability;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      durability = BUILDER.define(List.of("Durability (default: 465)"), 465);
      SPEC = BUILDER.build();
   }
}
