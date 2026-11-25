package com.alexander.mutantmore.config.mutant_frozen_zombie;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class MutantFrozenZombieClientConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Boolean> show_health_bar;
   public static final ConfigValue<Boolean> play_battle_music;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      show_health_bar = BUILDER.define(List.of("Health Bar (default: false)"), false);
      play_battle_music = BUILDER.define(List.of("Battle Music (default: true)"), true);
      SPEC = BUILDER.build();
   }
}
