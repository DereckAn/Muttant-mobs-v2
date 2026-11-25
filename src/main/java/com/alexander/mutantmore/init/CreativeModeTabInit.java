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
            output.accept(ItemInit.MUTANT_HOGLIN_TUSK);
            output.accept(ItemInit.DISC_FRAGMENT_ADRENALINE_RUSH);
            output.accept(ItemInit.MUTANT_JUNGLE_ZOMBIE_VINE_SEED);
            output.accept(ItemInit.MUTANT_JUNGLE_ZOMBIE_VINE);
            output.accept(ItemInit.SENTRY_VINE);
            output.accept(ItemInit.MUTANT_JUNGLE_ZOMBIE_ARM);
            output.accept(ItemInit.MUTANT_HOGLIN_SPAWN_EGG);
            output.accept(ItemInit.MUTANT_JUNGLE_ZOMBIE_SPAWN_EGG);
         })
         .build()
   );

   public static void init() {
   }
}
