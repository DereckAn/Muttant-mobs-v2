package com.alexander.mutantmore.config.mutant_hoglin;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class MutantHoglinClientConfig {
   public static final Builder BUILDER = new Builder();
   public static final ForgeConfigSpec SPEC = BUILDER.build();
   public static final ConfigValue<Boolean> show_health_bar = BUILDER.define(List.of("Health Bar (default: false)"), false);
   public static final ConfigValue<Boolean> play_battle_music = BUILDER.define(List.of("Battle Music (default: true)"), true);
}
