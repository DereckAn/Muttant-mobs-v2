package com.alexander.mutantmore.config;

import java.util.List;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public final class MutantMoreGroupedOptionsCommonConfig {
   public static final Builder BUILDER;
   public static final ConfigValue<Boolean> mob_griefing_off;
   public static final ConfigValue<Boolean> quicksand_griefing_off;
   public static final ConfigValue<Boolean> griefing_drops_blocks_on;
   public static final ConfigValue<Boolean> mutant_despawning_on;
   public static final ConfigValue<Boolean> mutants_explode_into_parts_off;
   public static final ConfigValue<Boolean> mutant_parts_glow_on;
   public static final ConfigValue<Boolean> mutants_attack_players_off;
   public static final ConfigValue<Boolean> friendly_fire_on;
   public static final ForgeConfigSpec SPEC;

   static {
      BUILDER = new Builder();
      mob_griefing_off = BUILDER.define(List.of("Mob Griefing Off (default: false)"), false);
      quicksand_griefing_off = BUILDER.define(List.of("Quicksand Griefing Off (default: false)"), false);
      griefing_drops_blocks_on = BUILDER.define(List.of("Griefing Drops Blocks On (default: false)"), false);
      mutant_despawning_on = BUILDER.define(List.of("Mutant Despawning On (default: false)"), false);
      mutants_explode_into_parts_off = BUILDER.define(List.of("Mutants Explode Into Parts Off (default: false)"), false);
      mutant_parts_glow_on = BUILDER.define(List.of("Mutant Parts Glow On (default: false)"), false);
      mutants_attack_players_off = BUILDER.define(List.of("Mutants Attack Players Off (default: false)"), false);
      friendly_fire_on = BUILDER.define(List.of("Friendly Fire On (default: false)"), false);
      SPEC = BUILDER.build();
   }
}
