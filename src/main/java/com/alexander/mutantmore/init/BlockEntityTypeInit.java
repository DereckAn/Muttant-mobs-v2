package com.alexander.mutantmore.init;

import com.alexander.mutantmore.blockentities.CustomSkullBlockEntity;
import java.util.Set;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class BlockEntityTypeInit {
   public static final BlockEntityType<CustomSkullBlockEntity> CUSTOM_SKULL = Registry.register(
      BuiltInRegistries.BLOCK_ENTITY_TYPE,
      Identifier.fromNamespaceAndPath("mutantmore", "custom_skull"),
      new BlockEntityType<>(CustomSkullBlockEntity::new, Set.of(BlockInit.MUTANT_WITHER_SKELETON_SKULL, BlockInit.MUTANT_WITHER_SKELETON_WALL_SKULL))
   );

   public static final BlockEntityType<com.alexander.mutantmore.blockentities.SnowstormGeneratorBlockEntity> SNOWSTORM_GENERATOR = register(
      "snowstorm_generator", new BlockEntityType<>(com.alexander.mutantmore.blockentities.SnowstormGeneratorBlockEntity::new, Set.of(BlockInit.SNOWSTORM_GENERATOR))
   );
   public static final BlockEntityType<com.alexander.mutantmore.blockentities.HeatstormGeneratorBlockEntity> HEATSTORM_GENERATOR = register(
      "heatstorm_generator", new BlockEntityType<>(com.alexander.mutantmore.blockentities.HeatstormGeneratorBlockEntity::new, Set.of(BlockInit.HEATSTORM_GENERATOR))
   );
   public static final BlockEntityType<com.alexander.mutantmore.blockentities.FreezingFanBlockEntity> FREEZING_FAN = register(
      "freezing_fan", new BlockEntityType<>(com.alexander.mutantmore.blockentities.FreezingFanBlockEntity::new, Set.of(BlockInit.FREEZING_FAN))
   );

   private static <T extends net.minecraft.world.level.block.entity.BlockEntity> BlockEntityType<T> register(String name, BlockEntityType<T> type) {
      return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath("mutantmore", name), type);
   }

   public static void init() {
   }
}
