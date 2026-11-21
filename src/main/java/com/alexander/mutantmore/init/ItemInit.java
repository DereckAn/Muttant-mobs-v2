package com.alexander.mutantmore.init;

import java.util.function.Function;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SpawnEggItem;

public class ItemInit {
   public static final Item MUTANT_HOGLIN_SPAWN_EGG = register(
      "mutant_hoglin_spawn_egg", SpawnEggItem::new, new Item.Properties().spawnEgg(EntityTypeInit.MUTANT_HOGLIN)
   );

   public static final Item MUTANT_HOGLIN_TUSK = register("mutant_hoglin_tusk", Item::new, new Item.Properties().rarity(Rarity.UNCOMMON));
   // ponytail: plain item; combining fragments into the Adrenaline Rush disc comes with the music-disc pass (jukebox_song data)
   public static final Item DISC_FRAGMENT_ADRENALINE_RUSH = register("disc_fragment_adrenaline_rush", Item::new, new Item.Properties().fireResistant());

   private static Item register(String name, Function<Item.Properties, Item> factory, Item.Properties properties) {
      ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("mutantmore", name));
      return Registry.register(BuiltInRegistries.ITEM, key, factory.apply(properties.setId(key)));
   }

   public static void init() {
   }
}
