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

   public static void init() {
   }
}
