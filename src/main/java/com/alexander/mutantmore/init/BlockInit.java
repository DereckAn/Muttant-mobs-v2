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

   public static final Block MUTANT_WITHER_SKELETON_SKULL = register(
      "mutant_wither_skeleton_skull",
      com.alexander.mutantmore.blocks.CustomSkullBlock::new,
      BlockBehaviour.Properties.of().instrument(net.minecraft.world.level.block.state.properties.NoteBlockInstrument.WITHER_SKELETON).strength(1.0F)
         .pushReaction(net.minecraft.world.level.material.PushReaction.POPPED).noOcclusion()
   );
   public static final Block MUTANT_WITHER_SKELETON_WALL_SKULL = register(
      "mutant_wither_skeleton_wall_skull",
      com.alexander.mutantmore.blocks.CustomWallSkullBlock::new,
      BlockBehaviour.Properties.of().overrideLootTable(MUTANT_WITHER_SKELETON_SKULL.getLootTable()).overrideDescription(MUTANT_WITHER_SKELETON_SKULL.getDescriptionId())
         .strength(1.0F).pushReaction(net.minecraft.world.level.material.PushReaction.POPPED).noOcclusion()
   );

   public static final Block SNOWSTORM_GENERATOR = register(
      "snowstorm_generator", com.alexander.mutantmore.blocks.SnowstormGeneratorBlock::new,
      BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.5F).noOcclusion()
   );
   public static final Block HEATSTORM_GENERATOR = register(
      "heatstorm_generator", com.alexander.mutantmore.blocks.HeatstormGeneratorBlock::new,
      BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.5F).lightLevel(state -> 10).noOcclusion()
   );
   public static final Block FREEZING_FAN = register(
      "freezing_fan", com.alexander.mutantmore.blocks.FreezingFanBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).requiresCorrectToolForDrops().strength(3.5F)
   );

   private static Block register(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
      ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("mutantmore", name));
      return Registry.register(BuiltInRegistries.BLOCK, key, factory.apply(properties.setId(key)));
   }

   public static void init() {
   }
}
