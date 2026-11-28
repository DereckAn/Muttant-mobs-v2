package com.alexander.mutantmore.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;

/** Shared "is it powered" check of the original's redstone-driven blocks (like a dropper: any neighbour, or the block above's neighbours). */
final class RedstoneLevers {
   private RedstoneLevers() {
   }

   static boolean powered(Level level, BlockPos pos) {
      for (Direction direction : Direction.values()) {
         if (direction != Direction.UP && level.hasSignal(pos.relative(direction), direction)) {
            return true;
         }
      }

      if (level.hasSignal(pos, Direction.DOWN)) {
         return true;
      }

      BlockPos above = pos.above();
      for (Direction direction : Direction.values()) {
         if (direction != Direction.DOWN && level.hasSignal(above.relative(direction), direction)) {
            return true;
         }
      }

      return false;
   }
}
