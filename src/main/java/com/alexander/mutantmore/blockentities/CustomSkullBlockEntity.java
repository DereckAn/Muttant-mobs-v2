package com.alexander.mutantmore.blockentities;

import com.alexander.mutantmore.init.BlockEntityTypeInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

/** Only exists so the skull can be drawn with an entity model (CustomSkullBlockRenderer). */
public class CustomSkullBlockEntity extends BlockEntity {
   public CustomSkullBlockEntity(BlockPos pos, BlockState state) {
      super(BlockEntityTypeInit.CUSTOM_SKULL, pos, state);
   }
}
