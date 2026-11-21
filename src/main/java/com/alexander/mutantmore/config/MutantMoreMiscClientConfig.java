package com.alexander.mutantmore.config;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class MutantMoreMiscClientConfig {
   public static final Builder BUILDER = new Builder();
   public static final ForgeConfigSpec SPEC = BUILDER.build();
   public static final ConfigValue<Double> battle_music_volume = BUILDER.define(List.of("Battle Music Volume (default: 0.5)"), 0.5);
   public static final ConfigValue<Float> screen_shake_amount = BUILDER.define(List.of("Screen Shake Intensity (default: 1)"), 1.0F);
   public static final ConfigValue<Boolean> custom_panorama = BUILDER.define(List.of("Custom Panorama (default: true)"), true);

   static {
      BUILDER.push("BATTLE MUSIC");
      BUILDER.pop();
      BUILDER.push("CAMERA SHAKE");
      BUILDER.pop();
      BUILDER.push("TITLE SCREEN");
      BUILDER.pop();
   }
}
