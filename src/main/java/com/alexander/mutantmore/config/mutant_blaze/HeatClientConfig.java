package com.alexander.mutantmore.config.mutant_blaze;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class HeatClientConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Boolean> show_heat_hearts;
   public static final ConfigValue<Boolean> show_pure_orange_heat_overlay;
   public static final ConfigValue<Boolean> show_static_flame_heat_overlay;
   public static final ConfigValue<Boolean> show_animated_flame_heat_overlay;
   public static final ConfigValue<Boolean> show_orange_edges_heat_overlay;
   public static final ConfigValue<Boolean> show_ash_heat_overlay;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      show_heat_hearts = BUILDER.define(List.of("Retexture Hearts When Heated (default: true)"), true);
      show_pure_orange_heat_overlay = BUILDER.define(List.of("Pure Orange Heat Overlay (default: false)"), false);
      show_static_flame_heat_overlay = BUILDER.define(List.of("Static Flame Heat Overlay (default: false)"), false);
      show_animated_flame_heat_overlay = BUILDER.define(List.of("Animated Flame Heat Overlay (default: true)"), true);
      show_orange_edges_heat_overlay = BUILDER.define(List.of("Orange Edges Heat Overlay (default: false)"), false);
      show_ash_heat_overlay = BUILDER.define(List.of("Ash Heat Overlay (default: true)"), true);
      SPEC = BUILDER.build();
   }
}
