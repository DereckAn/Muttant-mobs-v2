package com.alexander.mutantmore.config.mutant_hoglin;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class MutantHoglinRewardsClientConfig {
   public static final Builder BUILDER = new Builder();
   public static final ForgeConfigSpec SPEC = BUILDER.build();
   public static final ConfigValue<Boolean> helmet_show_fully_enraged_screen_overlay = BUILDER.define(
      List.of("Fully Enraged Screen Overlay (default: true)"), true
   );

   static {
      BUILDER.push("HOG HELM");
      BUILDER.pop();
   }
}
