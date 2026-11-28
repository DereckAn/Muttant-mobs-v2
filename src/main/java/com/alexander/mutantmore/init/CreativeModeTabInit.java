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
            output.accept(ItemInit.MUTANT_BLAZE_SHIELDS);
            output.accept(ItemInit.RODLING_CHECKER);
            output.accept(ItemInit.RODLING_HELMET);
            output.accept(ItemInit.RODLING_SHIELDS);
            output.accept(ItemInit.WITHERED_SCIMITAR);
            output.accept(ItemInit.WITHER_BOMB);
            output.accept(ItemInit.INCOMPLETE_FORMULA_Y);
            output.accept(ItemInit.FORMULA_Y);
            output.accept(ItemInit.INCOMPLETE_COMPOUND_Z);
            output.accept(ItemInit.COMPOUND_Z);
            output.accept(ItemInit.SNOWSTORM_GENERATOR);
            output.accept(ItemInit.FREEZING_FAN);
            output.accept(ItemInit.ICICLE_AMMO_CHARGE);
            output.accept(ItemInit.ADAPTIVE_CROSSBOW);
            output.accept(ItemInit.HEATSTORM_GENERATOR);
            output.accept(ItemInit.MUTANT_SHULKER_SHIELD);
            output.accept(ItemInit.LEAFBLOWER);
            output.accept(ItemInit.MUTANT_WITHER_SKELETON_CHESTPLATE);
            output.accept(ItemInit.MUTANT_WITHER_SKELETON_LEGGINGS);
            output.accept(ItemInit.MUTANT_WITHER_SKELETON_BOOTS);
            output.accept(ItemInit.MUTANT_WITHER_SKELETON_SKULL);
            output.accept(ItemInit.MUTANT_WITHER_SKELETON_ARMS);
            output.accept(ItemInit.MUTANT_WITHER_SKELETON_LIMB);
            output.accept(ItemInit.MUTANT_WITHER_SKELETON_PELVIS);
            output.accept(ItemInit.MUTANT_WITHER_SKELETON_RIB);
            output.accept(ItemInit.MUTANT_WITHER_SKELETON_RIB_CAGE);
            output.accept(ItemInit.MUTANT_WITHER_SKELETON_SHOULDER_PAD);
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
            output.accept(ItemInit.MUTANT_WITHER_SKELETON_SPAWN_EGG);
            output.accept(ItemInit.RODLING_SPAWN_EGG);
            output.accept(ItemInit.MUTANT_HOGLIN_SPAWN_EGG);
            output.accept(ItemInit.MUTANT_JUNGLE_ZOMBIE_SPAWN_EGG);
         })
         .build()
   );

   public static void init() {
   }
}
