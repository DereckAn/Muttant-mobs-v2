package com.alexander.mutantmore.init;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;

public class CreativeModeTabInit {
   // ponytail: icon was Formula Y in the original; switch back once Formula Y is ported
   public static final CreativeModeTab MUTANT_MORE_TAB = Registry.register(
      BuiltInRegistries.CREATIVE_MODE_TAB,
      Identifier.fromNamespaceAndPath("mutantmore", "mutantmore"),
      FabricCreativeModeTab.builder()
         .title(Component.translatable("itemGroup.mutant_more"))
         .icon(ItemInit.MUTANT_HOGLIN_SPAWN_EGG::getDefaultInstance)
         .displayItems((parameters, output) -> {
            output.accept(ItemInit.MUTANT_HUSK_VOCAL_CORDS);
            output.accept(ItemInit.HUSK_HAMMER);
            output.accept(ItemInit.DESERT_HORN);
            output.accept(ItemInit.SAND_CANNON);
            output.accept(ItemInit.QUICKSAND);
            output.accept(ItemInit.RED_QUICKSAND);
            output.accept(ItemInit.MUTANT_SHULKER_SHELL);
            output.accept(ItemInit.MUTANT_SHULKER_TRAP);
            output.accept(ItemInit.MUTANT_SHULKER_TURRET);
            output.accept(ItemInit.MUTANT_BLAZE_CORE);
            output.accept(ItemInit.MUTANT_HOGLIN_TUSK);
            output.accept(ItemInit.HOG_HELM);
            output.accept(ItemInit.HOGLANCE);
            output.accept(ItemInit.HOGFIST_GAUNTLET);
            output.accept(ItemInit.DISC_FRAGMENT_ADRENALINE_RUSH);
            output.accept(ItemInit.MUSIC_DISC_ADRENALINE_RUSH);
            output.accept(ItemInit.MUSIC_DISC_AEGIS);
            output.accept(ItemInit.MUSIC_DISC_FORCES_UNKNOWN);
            output.accept(ItemInit.DISC_FRAGMENT_AEGIS);
            output.accept(ItemInit.DISC_FRAGMENT_FORCES_UNKNOWN);
            output.accept(ItemInit.MUTANT_FROZEN_ZOMBIE_SPIKES);
            output.accept(ItemInit.MUTANT_JUNGLE_ZOMBIE_VINE_SEED);
            output.accept(ItemInit.MUTANT_JUNGLE_ZOMBIE_VINE);
            output.accept(ItemInit.SENTRY_VINE);
            output.accept(ItemInit.MUTANT_JUNGLE_ZOMBIE_ARM);
            output.accept(ItemInit.MUTANT_HUSK_SPAWN_EGG);
            output.accept(ItemInit.MUTANT_FROZEN_ZOMBIE_SPAWN_EGG);
            output.accept(ItemInit.MUTANT_SHULKER_SPAWN_EGG);
            output.accept(ItemInit.MUTANT_BLAZE_SPAWN_EGG);
            output.accept(ItemInit.RODLING_SPAWN_EGG);
            output.accept(ItemInit.MUTANT_HOGLIN_SPAWN_EGG);
            output.accept(ItemInit.MUTANT_JUNGLE_ZOMBIE_SPAWN_EGG);
         })
         .build()
   );

   public static void init() {
   }
}
