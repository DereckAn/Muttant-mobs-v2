package com.alexander.mutantmore.blocks;

import com.alexander.mutantmore.blockentities.SnowstormGeneratorBlockEntity;
import com.alexander.mutantmore.init.BlockEntityTypeInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jspecify.annotations.Nullable;

/** Redstone-powered block that keeps a snowstorm around itself (freezes mobs, optionally piles up snow). */
public class SnowstormGeneratorBlock extends BaseEntityBlock {
   public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
   private static final VoxelShape BASE = Block.box(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   private static final VoxelShape BODY = Block.box(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   private static final VoxelShape ACTIVE = Shapes.or(BASE, BODY, Block.box(2.5, 16.0, 2.5, 13.5, 20.0, 13.5));
   private static final VoxelShape INACTIVE = Shapes.or(BASE, BODY, Block.box(2.5, 16.0, 2.5, 13.5, 22.0, 13.5));

   public SnowstormGeneratorBlock(Properties properties) {
      super(properties);
      this.registerDefaultState(this.stateDefinition.any().setValue(POWERED, false));
   }

   @Override
   protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
      return state.getValue(POWERED) ? ACTIVE : INACTIVE;
   }

   @Override
   protected VoxelShape getOcclusionShape(BlockState state) {
      return Shapes.empty();
   }

   @Override
   public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity by, ItemStack stack) {
      this.updatePowered(level, pos, state);
   }

   @Override
   protected void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, @Nullable Orientation orientation, boolean movedByPiston) {
      this.updatePowered(level, pos, state);
   }

   @Override
   protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
      if (!oldState.is(state.getBlock())) {
         this.updatePowered(level, pos, state);
      }
   }

   private void updatePowered(Level level, BlockPos pos, BlockState state) {
      boolean powered = RedstoneLevers.powered(level, pos);
      if (!level.isClientSide() && state.getValue(POWERED) != powered) {
         level.setBlock(pos, state.setValue(POWERED, powered), Block.UPDATE_CLIENTS);
      }
   }

   @Override
   public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
      return new SnowstormGeneratorBlockEntity(pos, state);
   }

   @Override
   protected RenderShape getRenderShape(BlockState state) {
      return RenderShape.INVISIBLE;
   }

   @Override
   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
      builder.add(POWERED);
   }

   @Override
   public <T extends BlockEntity> @Nullable BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
      return createTickerHelper(type, BlockEntityTypeInit.SNOWSTORM_GENERATOR, SnowstormGeneratorBlockEntity::tick);
   }
}
