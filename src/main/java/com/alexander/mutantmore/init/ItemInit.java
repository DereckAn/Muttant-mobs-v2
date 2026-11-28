package com.alexander.mutantmore.init;

import com.alexander.mutantmore.config.mutant_wither_skeleton.MutantWitherSkeletonRewardsCommonConfig;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.core.Holder;
import net.minecraft.core.Direction;
import net.minecraft.world.item.StandingAndWallBlockItem;
import java.util.function.Function;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import com.alexander.mutantmore.config.mutant_jungle_zombie.MutantJungleZombieRewardsCommonConfig;
import com.alexander.mutantmore.config.mutant_husk.MutantHuskRewardsCommonConfig;
import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinRewardsCommonConfig;
import com.alexander.mutantmore.items.DescribedItem;
import com.alexander.mutantmore.items.DesertHornItem;
import net.minecraft.world.item.JukeboxSong;
import com.alexander.mutantmore.items.HogHelmItem;
import com.alexander.mutantmore.items.HogfistGauntletItem;
import com.alexander.mutantmore.items.HoglanceItem;
import java.util.Map;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import com.alexander.mutantmore.items.HuskHammerItem;
import com.alexander.mutantmore.items.MutantJungleZombieArmItem;
import com.alexander.mutantmore.items.SandCannonItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.component.Weapon;
import com.alexander.mutantmore.items.PlaceEntityItem;
import com.alexander.mutantmore.entities.MutantShulkerTrap;
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

   public static final Item MUTANT_HUSK_SPAWN_EGG = register(
      "mutant_husk_spawn_egg", SpawnEggItem::new, new Item.Properties().spawnEgg(EntityTypeInit.MUTANT_HUSK)
   );
   public static final Item QUICKSAND = register("quicksand", p -> new BlockItem(BlockInit.QUICKSAND, p), new Item.Properties().useBlockDescriptionPrefix());
   public static final Item RED_QUICKSAND = register("red_quicksand", p -> new BlockItem(BlockInit.RED_QUICKSAND, p), new Item.Properties().useBlockDescriptionPrefix());
   public static final Item MUTANT_HUSK_VOCAL_CORDS = register("mutant_husk_vocal_cords", Item::new, new Item.Properties().rarity(Rarity.UNCOMMON));

   // ponytail: durability, damage and speed are read from the rewards config once at startup
   public static final Item HUSK_HAMMER = register(
      "husk_hammer",
      HuskHammerItem::new,
      new Item.Properties()
         .rarity(Rarity.EPIC)
         .durability(MutantHuskRewardsCommonConfig.hammer_durability.get())
         .repairable(TagInit.Items.REPAIRS_HUSK_HAMMER)
         .component(DataComponents.WEAPON, new Weapon(1, 0.0F))
         .attributes(
            ItemAttributeModifiers.builder()
               .add(
                  Attributes.ATTACK_DAMAGE,
                  new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, MutantHuskRewardsCommonConfig.hammer_attack_damage.get(), AttributeModifier.Operation.ADD_VALUE),
                  EquipmentSlotGroup.MAINHAND
               )
               .add(
                  Attributes.ATTACK_SPEED,
                  new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, MutantHuskRewardsCommonConfig.hammer_attack_speed.get(), AttributeModifier.Operation.ADD_VALUE),
                  EquipmentSlotGroup.MAINHAND
               )
               .build()
         )
   );
   public static final Item DESERT_HORN = register(
      "desert_horn",
      DesertHornItem::new,
      new Item.Properties().rarity(Rarity.RARE).durability(MutantHuskRewardsCommonConfig.horn_durability.get()).repairable(TagInit.Items.REPAIRS_DESERT_HORN)
   );
   public static final Item SAND_CANNON = register(
      "sand_cannon",
      SandCannonItem::new,
      new Item.Properties().rarity(Rarity.RARE).durability(MutantHuskRewardsCommonConfig.cannon_durability.get()).repairable(TagInit.Items.REPAIRS_SAND_CANNON)
   );

   public static final Item MUTANT_FROZEN_ZOMBIE_SPAWN_EGG = register(
      "mutant_frozen_zombie_spawn_egg", SpawnEggItem::new, new Item.Properties().spawnEgg(EntityTypeInit.MUTANT_FROZEN_ZOMBIE)
   );

   public static final ResourceKey<EquipmentAsset> HOG_HELM_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath("mutantmore", "hog_helm"));
   // ponytail: armour, lance and gauntlet stats are read from the Hoglin rewards config once at startup
   public static final Item HOG_HELM = register(
      "hog_helm",
      HogHelmItem::new,
      new Item.Properties()
         .rarity(Rarity.EPIC)
         .fireResistant()
         .humanoidArmor(
            new ArmorMaterial(
               MutantHoglinRewardsCommonConfig.helmet_durability_multiplier.get(),
               Map.of(ArmorType.HELMET, MutantHoglinRewardsCommonConfig.helmet_armour_value.get()),
               MutantHoglinRewardsCommonConfig.helmet_enchantment_value.get(),
               SoundEvents.ARMOR_EQUIP_NETHERITE,
               ((Number)MutantHoglinRewardsCommonConfig.helmet_armour_toughness.get()).floatValue(),
               ((Number)MutantHoglinRewardsCommonConfig.helmet_knockback_resistance.get()).floatValue(),
               TagInit.Items.REPAIRS_HOG_HELM,
               HOG_HELM_ASSET
            ),
            ArmorType.HELMET
         )
   );
   public static final Item HOGLANCE = register(
      "hoglance",
      HoglanceItem::new,
      weapon(new Item.Properties().rarity(Rarity.RARE), MutantHoglinRewardsCommonConfig.lance_durability.get(), TagInit.Items.REPAIRS_HOGLANCE,
         MutantHoglinRewardsCommonConfig.lance_attack_damage.get(), MutantHoglinRewardsCommonConfig.lance_attack_speed.get(), MutantHoglinRewardsCommonConfig.lance_attack_range_increase.get())
   );
   public static final Item HOGFIST_GAUNTLET = register(
      "hogfist_gauntlet",
      HogfistGauntletItem::new,
      weapon(new Item.Properties().rarity(Rarity.RARE), MutantHoglinRewardsCommonConfig.gauntlet_durability.get(), TagInit.Items.REPAIRS_HOGFIST_GAUNTLET,
         MutantHoglinRewardsCommonConfig.gauntlet_attack_damage.get(), MutantHoglinRewardsCommonConfig.gauntlet_attack_speed.get(), 0.0)
   );

   /** Melee weapon properties: 1 durability per hit, damage/speed/reach added like the original "Weapon modifier"s. */
   private static Item.Properties weapon(Item.Properties properties, int durability, TagKey<Item> repair, double damage, double speed, double reach) {
      ItemAttributeModifiers.Builder modifiers = ItemAttributeModifiers.builder()
         .add(Attributes.ATTACK_DAMAGE, new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, damage, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
         .add(Attributes.ATTACK_SPEED, new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, speed, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND);
      if (reach != 0.0) {
         modifiers.add(
            Attributes.ENTITY_INTERACTION_RANGE,
            new AttributeModifier(Identifier.fromNamespaceAndPath("mutantmore", "weapon_reach"), reach, AttributeModifier.Operation.ADD_VALUE),
            EquipmentSlotGroup.MAINHAND
         );
      }

      return properties.durability(durability).repairable(repair).component(DataComponents.WEAPON, new Weapon(1, 0.0F)).attributes(modifiers.build());
   }

   public static final Item MUTANT_SHULKER_SPAWN_EGG = register(
      "mutant_shulker_spawn_egg", SpawnEggItem::new, new Item.Properties().spawnEgg(EntityTypeInit.MUTANT_SHULKER)
   );

   public static final Item MUTANT_SHULKER_SHELL = register("mutant_shulker_shell", Item::new, new Item.Properties().rarity(Rarity.EPIC));
   public static final Item MUTANT_SHULKER_TRAP = register(
      "mutant_shulker_trap",
      p -> new PlaceEntityItem(p, () -> EntityTypeInit.MUTANT_SHULKER_TRAP, "mutant_shulker_trap", (entity, player) -> ((MutantShulkerTrap)entity).setOwnerUUID(player.getUUID())),
      new Item.Properties().stacksTo(16).rarity(Rarity.RARE)
   );
   public static final Item MUTANT_SHULKER_TURRET = register(
      "mutant_shulker_turret",
      p -> new PlaceEntityItem(p, () -> EntityTypeInit.MUTANT_SHULKER_TURRET, "mutant_shulker_turret", (entity, player) -> {}),
      new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)
   );

   public static final Item MUTANT_BLAZE_SPAWN_EGG = register("mutant_blaze_spawn_egg", SpawnEggItem::new, new Item.Properties().spawnEgg(EntityTypeInit.MUTANT_BLAZE));
   public static final Item RODLING_SPAWN_EGG = register("rodling_spawn_egg", SpawnEggItem::new, new Item.Properties().spawnEgg(EntityTypeInit.RODLING));
   // ponytail: plain equipment items for now; equipping them needs the Rodling Checker screen (not ported yet). Rods from a Mutant Blaze can still hatch armoured/shielded Rodlings.
   public static final Item RODLING_HELMET = register("rodling_helmet", Item::new, new Item.Properties().stacksTo(1));
   public static final Item RODLING_SHIELDS = register("rodling_shields", Item::new, new Item.Properties().stacksTo(1));
   public static final Item MUTANT_BLAZE_CORE = register("mutant_blaze_core", Item::new, new Item.Properties().rarity(Rarity.EPIC).fireResistant());

   public static final Item MUTANT_WITHER_SKELETON_SPAWN_EGG = register(
      "mutant_wither_skeleton_spawn_egg", SpawnEggItem::new, new Item.Properties().spawnEgg(EntityTypeInit.MUTANT_WITHER_SKELETON)
   );
   public static final Item MUTANT_WITHER_SKELETON_ARMS = register("mutant_wither_skeleton_arms", Item::new, new Item.Properties().fireResistant());
   public static final Item MUTANT_WITHER_SKELETON_LIMB = register("mutant_wither_skeleton_limb", Item::new, new Item.Properties().fireResistant());
   public static final Item MUTANT_WITHER_SKELETON_PELVIS = register("mutant_wither_skeleton_pelvis", Item::new, new Item.Properties().fireResistant());
   public static final Item MUTANT_WITHER_SKELETON_RIB = register("mutant_wither_skeleton_rib", Item::new, new Item.Properties().fireResistant());
   public static final Item MUTANT_WITHER_SKELETON_RIB_CAGE = register("mutant_wither_skeleton_rib_cage", Item::new, new Item.Properties().fireResistant());
   public static final Item MUTANT_WITHER_SKELETON_SHOULDER_PAD = register("mutant_wither_skeleton_shoulder_pad", Item::new, new Item.Properties().fireResistant());
   public static final ResourceKey<EquipmentAsset> MUTANT_WITHER_SKELETON_ASSET = ResourceKey.create(
      EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath("mutantmore", "mutant_wither_skeleton")
   );
   // ponytail: armour stats are read from the Wither Skeleton rewards config once at startup
   private static final ArmorMaterial MUTANT_WITHER_SKELETON_ARMOUR = new ArmorMaterial(
      MutantWitherSkeletonRewardsCommonConfig.armour_durability_multiplier.get(),
      Map.of(
         ArmorType.HELMET, MutantWitherSkeletonRewardsCommonConfig.armour_helmet_armour_value.get(),
         ArmorType.CHESTPLATE, MutantWitherSkeletonRewardsCommonConfig.armour_chestplate_armour_value.get(),
         ArmorType.LEGGINGS, MutantWitherSkeletonRewardsCommonConfig.armour_leggings_armour_value.get(),
         ArmorType.BOOTS, MutantWitherSkeletonRewardsCommonConfig.armour_boots_armour_value.get()
      ),
      MutantWitherSkeletonRewardsCommonConfig.armour_enchantment_value.get(),
      net.minecraft.core.registries.BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEventInit.MUTANT_WITHER_SKELETON_ARMOUR_EQUIP),
      ((Number)MutantWitherSkeletonRewardsCommonConfig.armour_armour_toughness.get()).floatValue(),
      ((Number)MutantWitherSkeletonRewardsCommonConfig.armour_knockback_resistance.get()).floatValue(),
      TagInit.Items.REPAIRS_MUTANT_WITHER_SKELETON_ARMOUR,
      MUTANT_WITHER_SKELETON_ASSET
   );

   /** Armour properties plus the piece's own bonus attribute (skull: attack speed, chestplate: attack damage). */
   private static Item.Properties witherArmour(ArmorType type, Holder<Attribute> bonus, double bonusAmount) {
      ItemAttributeModifiers modifiers = MUTANT_WITHER_SKELETON_ARMOUR.createAttributes(type);
      if (bonus != null) {
         modifiers = modifiers.withModifierAdded(
            bonus,
            new AttributeModifier(Identifier.fromNamespaceAndPath("mutantmore", "mutant_wither_skeleton_" + type.getName() + "_bonus"), bonusAmount, AttributeModifier.Operation.ADD_VALUE),
            EquipmentSlotGroup.bySlot(type.getSlot())
         );
      }

      return new Item.Properties().rarity(Rarity.RARE).fireResistant().humanoidArmor(MUTANT_WITHER_SKELETON_ARMOUR, type).attributes(modifiers);
   }

   public static final Item MUTANT_WITHER_SKELETON_SKULL = register(
      "mutant_wither_skeleton_skull",
      p -> new StandingAndWallBlockItem(BlockInit.MUTANT_WITHER_SKELETON_SKULL, BlockInit.MUTANT_WITHER_SKELETON_WALL_SKULL, Direction.DOWN, p),
      witherArmour(ArmorType.HELMET, Attributes.ATTACK_SPEED, MutantWitherSkeletonRewardsCommonConfig.armour_helmet_attack_speed_increase.get()).useBlockDescriptionPrefix()
   );
   public static final Item MUTANT_WITHER_SKELETON_CHESTPLATE = register(
      "mutant_wither_skeleton_chestplate", Item::new,
      witherArmour(ArmorType.CHESTPLATE, Attributes.ATTACK_DAMAGE, MutantWitherSkeletonRewardsCommonConfig.armour_chestplate_damage_increase.get())
   );
   public static final Item MUTANT_WITHER_SKELETON_LEGGINGS = register("mutant_wither_skeleton_leggings", Item::new, witherArmour(ArmorType.LEGGINGS, null, 0.0));
   public static final Item MUTANT_WITHER_SKELETON_BOOTS = register("mutant_wither_skeleton_boots", Item::new, witherArmour(ArmorType.BOOTS, null, 0.0));
   public static final Item WITHERED_SCIMITAR = register(
      "withered_scimitar",
      com.alexander.mutantmore.items.WitheredScimitarItem::new,
      weapon(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).fireResistant().enchantable(com.alexander.mutantmore.config.mutant_wither_skeleton.MutantWitherSkeletonRewardsCommonConfig.scimitar_enchantment_value.get()),
         com.alexander.mutantmore.config.mutant_wither_skeleton.MutantWitherSkeletonRewardsCommonConfig.scimitar_durability.get(), TagInit.Items.REPAIRS_WITHERED_SCIMITAR,
         com.alexander.mutantmore.config.mutant_wither_skeleton.MutantWitherSkeletonRewardsCommonConfig.scimitar_attack_damage.get(),
         com.alexander.mutantmore.config.mutant_wither_skeleton.MutantWitherSkeletonRewardsCommonConfig.scimitar_attack_speed.get(), 0.0)
   );

   public static final Item WITHER_BOMB = register(
      "wither_bomb", com.alexander.mutantmore.items.WitherBombItem::new, new Item.Properties().stacksTo(16).rarity(Rarity.RARE).fireResistant()
   );

   public static final Item MUTANT_HOGLIN_TUSK = register("mutant_hoglin_tusk", Item::new, new Item.Properties().rarity(Rarity.UNCOMMON));
   public static final Item MUSIC_DISC_ADRENALINE_RUSH = disc("adrenaline_rush");
   public static final Item MUSIC_DISC_AEGIS = disc("aegis");
   public static final Item MUSIC_DISC_FORCES_UNKNOWN = disc("forces_unknown");

   /** Songs are data now: data/mutantmore/jukebox_song/<name>.json */
   private static Item disc(String song) {
      ResourceKey<JukeboxSong> key = ResourceKey.create(Registries.JUKEBOX_SONG, Identifier.fromNamespaceAndPath("mutantmore", song));
      return register("music_disc_" + song, Item::new, new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.RARE).jukeboxPlayable(key));
   }

   public static final Item DISC_FRAGMENT_AEGIS = register("disc_fragment_aegis", DescribedItem::new, new Item.Properties().fireResistant());
   public static final Item DISC_FRAGMENT_FORCES_UNKNOWN = register("disc_fragment_forces_unknown", DescribedItem::new, new Item.Properties().fireResistant());
   public static final Item MUTANT_FROZEN_ZOMBIE_SPIKES = register("mutant_frozen_zombie_spikes", Item::new, new Item.Properties().rarity(Rarity.UNCOMMON));
   public static final Item DISC_FRAGMENT_ADRENALINE_RUSH = register("disc_fragment_adrenaline_rush", DescribedItem::new, new Item.Properties().fireResistant());

   public static final Item MUTANT_JUNGLE_ZOMBIE_VINE_SEED = register(
      "mutant_jungle_zombie_vine_seed",
      p -> new BlockItem(BlockInit.MUTANT_JUNGLE_ZOMBIE_VINE, p),
      new Item.Properties().rarity(Rarity.UNCOMMON).useItemDescriptionPrefix()
   );
   public static final Item MUTANT_JUNGLE_ZOMBIE_VINE = register("mutant_jungle_zombie_vine", Item::new, new Item.Properties().rarity(Rarity.UNCOMMON));
   public static final Item SENTRY_VINE = register(
      "sentry_vine", p -> new PlaceEntityItem(p, () -> EntityTypeInit.SENTRY_VINE, "sentry_vine", (entity, player) -> {}), new Item.Properties().stacksTo(1).rarity(Rarity.RARE)
   );
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
