package com.alexander.mutantmore.config;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class MutantMoreGroupedOptionsClientConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Boolean> show_health_bars_on;
   public static final ConfigValue<Boolean> play_battle_music_off;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      show_health_bars_on = BUILDER.define(List.of("Health Bars On (default: false)"), false);
      play_battle_music_off = BUILDER.define(List.of("Battle Music Off (default: false)"), false);
      SPEC = BUILDER.build();
   }
}
