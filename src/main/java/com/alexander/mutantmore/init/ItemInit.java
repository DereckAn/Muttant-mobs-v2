package com.alexander.mutantmore.init;

import java.util.function.Function;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import com.alexander.mutantmore.config.mutant_jungle_zombie.MutantJungleZombieRewardsCommonConfig;
import com.alexander.mutantmore.items.MutantJungleZombieArmItem;
import com.alexander.mutantmore.items.SentryVineItem;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SpawnEggItem;

public class ItemInit {
   public static final Item MUTANT_HOGLIN_SPAWN_EGG = register(
      "mutant_hoglin_spawn_egg", SpawnEggItem::new, new Item.Properties().spawnEgg(EntityTypeInit.MUTANT_HOGLIN)
   );

   public static final Item MUTANT_JUNGLE_ZOMBIE_SPAWN_EGG = register(
      "mutant_jungle_zombie_spawn_egg", SpawnEggItem::new, new Item.Properties().spawnEgg(EntityTypeInit.MUTANT_JUNGLE_ZOMBIE)
   );

   public static final Item MUTANT_HOGLIN_TUSK = register("mutant_hoglin_tusk", Item::new, new Item.Properties().rarity(Rarity.UNCOMMON));
   // ponytail: plain item; combining fragments into the Adrenaline Rush disc comes with the music-disc pass (jukebox_song data)
   public static final Item DISC_FRAGMENT_ADRENALINE_RUSH = register("disc_fragment_adrenaline_rush", Item::new, new Item.Properties().fireResistant());

   public static final Item MUTANT_JUNGLE_ZOMBIE_VINE_SEED = register(
      "mutant_jungle_zombie_vine_seed",
      p -> new BlockItem(BlockInit.MUTANT_JUNGLE_ZOMBIE_VINE, p),
      new Item.Properties().rarity(Rarity.UNCOMMON).useItemDescriptionPrefix()
   );
   public static final Item MUTANT_JUNGLE_ZOMBIE_VINE = register("mutant_jungle_zombie_vine", Item::new, new Item.Properties().rarity(Rarity.UNCOMMON));
   public static final Item SENTRY_VINE = register("sentry_vine", SentryVineItem::new, new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
   // ponytail: durability and reach are read from the rewards config once at startup (the original re-read durability live)
   public static final Item MUTANT_JUNGLE_ZOMBIE_ARM = register(
      "mutant_jungle_zombie_arm",
      MutantJungleZombieArmItem::new,
      new Item.Properties()
         .rarity(Rarity.RARE)
         .durability((Integer)MutantJungleZombieRewardsCommonConfig.arm_durability.get())
         .repairable(TagInit.Items.REPAIRS_MUTANT_JUNGLE_ZOMBIE_ARM)
         .attributes(
            ItemAttributeModifiers.builder()
               .add(
                  Attributes.ENTITY_INTERACTION_RANGE,
                  new AttributeModifier(
                     Identifier.fromNamespaceAndPath("mutantmore", "mutant_jungle_zombie_arm_reach"),
                     (Double)MutantJungleZombieRewardsCommonConfig.arm_attack_range_increase.get(),
                     AttributeModifier.Operation.ADD_VALUE
                  ),
                  EquipmentSlotGroup.MAINHAND
               )
               .build()
         )
   );

   private static Item register(String name, Function<Item.Properties, Item> factory, Item.Properties properties) {
      ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("mutantmore", name));
      return Registry.register(BuiltInRegistries.ITEM, key, factory.apply(properties.setId(key)));
   }

   public static void init() {
   }
}
