package com.alexander.mutantmore.config;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class FreezingEffectCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Integer> max_freezing_amount;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      max_freezing_amount = BUILDER.define(List.of("Maximum Freeze Amount (mobs get damaged at 140, default: 200)"), 200);
      SPEC = BUILDER.build();
   }
}
