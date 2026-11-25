package com.alexander.mutantmore.config.mutant_blaze;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class MutantBlazeRewardsClientConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Double> shields_first_person_opacity;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      BUILDER.push("MUTANT BLAZE SHIELDS");
      shields_first_person_opacity = BUILDER.define(List.of("First Person Opacity (default: 0.15)"), 0.15);
      BUILDER.pop();
      SPEC = BUILDER.build();
   }
}
