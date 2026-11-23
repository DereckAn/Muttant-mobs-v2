package com.alexander.mutantmore.config.mutant_hoglin;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class MutantHoglinRewardsClientConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Boolean> helmet_show_fully_enraged_screen_overlay;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      BUILDER.push("HOG HELM");
      helmet_show_fully_enraged_screen_overlay = BUILDER.define(
      List.of("Fully Enraged Screen Overlay (default: true)"), true
   );
      BUILDER.pop();
      SPEC = BUILDER.build();
   }
}
