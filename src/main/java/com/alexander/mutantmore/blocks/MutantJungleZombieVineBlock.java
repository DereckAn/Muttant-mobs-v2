package com.alexander.mutantmore.blocks;

import com.alexander.mutantmore.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MutantJungleZombieVineBlock extends CropBlock {
   private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
      Block.box(4.0, 0.0, 4.0, 12.0, 7.0, 12.0),
      Block.box(4.0, 0.0, 4.0, 12.0, 7.0, 12.0),
      Block.box(4.0, 0.0, 4.0, 12.0, 11.0, 12.0),
      Block.box(4.0, 0.0, 4.0, 12.0, 11.0, 12.0),
      Block.box(4.0, 0.0, 4.0, 12.0, 16.0, 12.0),
      Block.box(4.0, 0.0, 4.0, 12.0, 16.0, 12.0),
      Block.box(4.0, 0.0, 4.0, 12.0, 16.0, 12.0),
      Block.box(4.0, 0.0, 4.0, 12.0, 24.0, 12.0)
   };

   public MutantJungleZombieVineBlock(Properties properties) {
      super(properties);
   }

   @Override
   protected ItemLike getBaseSeedId() {
      return ItemInit.MUTANT_JUNGLE_ZOMBIE_VINE_SEED;
   }

   @Override
   protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
      return SHAPE_BY_AGE[this.getAge(state)];
   }
}
