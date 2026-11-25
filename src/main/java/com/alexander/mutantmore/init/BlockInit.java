package com.alexander.mutantmore.init;

import com.alexander.mutantmore.blocks.MutantJungleZombieVineBlock;
import com.alexander.mutantmore.blocks.QuicksandBlock;
import java.util.function.Function;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlockInit {
   public static final Block MUTANT_JUNGLE_ZOMBIE_VINE = register(
      "mutant_jungle_zombie_vine",
      MutantJungleZombieVineBlock::new,
      BlockBehaviour.Properties.ofFullCopy(Blocks.VINE).noCollision().randomTicks().instabreak().sound(SoundType.CROP)
   );

   public static final Block QUICKSAND = register(
      "quicksand",
      QuicksandBlock::new,
      BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).noCollision().strength(0.3F).requiresCorrectToolForDrops().sound(SoundType.SAND)
   );
   public static final Block RED_QUICKSAND = register(
      "red_quicksand",
      QuicksandBlock::new,
      BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).noCollision().strength(0.3F).requiresCorrectToolForDrops().sound(SoundType.SAND)
   );

   private static Block register(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
      ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("mutantmore", name));
      return Registry.register(BuiltInRegistries.BLOCK, key, factory.apply(properties.setId(key)));
   }

   public static void init() {
   }
}
