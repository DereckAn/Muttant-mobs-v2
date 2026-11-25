package com.alexander.mutantmore.blocks;

import com.alexander.mutantmore.config.QuicksandCommonConfig;
import com.alexander.mutantmore.entities.AreaDamage;
import com.alexander.mutantmore.init.TagInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jspecify.annotations.Nullable;

/**
 * Thin sand layer that slows anything walking in it and vanishes after a random lifespan unless PERSISTENT.
 * ponytail: the original used a ticking block entity just for the lifespan timer; a scheduled block tick does the same.
 */
public class QuicksandBlock extends Block {
   public static final BooleanProperty PERSISTENT = BlockStateProperties.PERSISTENT;
   public static final VoxelShape SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);

   public QuicksandBlock(Properties properties) {
      super(properties);
      this.registerDefaultState(this.stateDefinition.any().setValue(PERSISTENT, false));
   }

   @Override
   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
      builder.add(PERSISTENT);
   }

   @Override
   public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
      BlockState state = super.getStateForPlacement(context);
      return state != null && context.getPlayer() != null && QuicksandCommonConfig.player_quicksand_doesnt_vanish.get() ? state.setValue(PERSISTENT, true) : state;
   }

   @Override
   protected boolean useShapeForLightOcclusion(BlockState state) {
      return true;
   }

   @Override
   protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
      return SHAPE;
   }

   @Override
   protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
      return survivable(state, level, pos);
   }

   public static boolean survivable(BlockState state, LevelReader level, BlockPos pos) {
      BlockState below = level.getBlockState(pos.below());
      return Block.isFaceFull(below.getCollisionShape(level, pos.below()), Direction.UP);
   }

   @Override
   protected BlockState updateShape(
      BlockState state, LevelReader level, ScheduledTickAccess ticks, BlockPos pos, Direction direction, BlockPos neighbourPos, BlockState neighbourState, RandomSource random
   ) {
      return !state.canSurvive(level, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, level, ticks, pos, direction, neighbourPos, neighbourState, random);
   }

   @Override
   protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
      if (!state.getValue(PERSISTENT) && !oldState.is(this)) {
         int min = QuicksandCommonConfig.min_lifespan.get();
         int extra = QuicksandCommonConfig.max_lifespan.get() - min;
         level.scheduleTick(pos, this, min + (extra <= 0 ? 0 : level.getRandom().nextInt(extra)));
      }
   }

   @Override
   protected void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
      if (!state.getValue(PERSISTENT)) {
         level.removeBlock(pos, false);
      }
   }

   @Override
   protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity, InsideBlockEffectApplier effectApplier, boolean isPrecise) {
      // A sand geyser (AreaDamage type 2) launches you out instead of sinking you
      for (AreaDamage areaDamage : level.getEntitiesOfClass(AreaDamage.class, entity.getBoundingBox())) {
         if (areaDamage.getActiveType() == 2 || areaDamage.getAreaDamageType() == 2) {
            return;
         }
      }

      if (entity instanceof LivingEntity living && living.getItemBySlot(EquipmentSlot.FEET).is(TagInit.Items.QUICKSAND_IMMUNE_BOOTS)) {
         return;
      }

      if (entity.fallDistance <= 5.0 && entity.getY() <= pos.getY() + 0.25 && !entity.is(TagInit.EntityTypes.UNAFFECTED_BY_QUICKSAND)) {
         double horizontal = QuicksandCommonConfig.horizontal_movement_multiplication.get();
         entity.makeStuckInBlock(state, new Vec3(horizontal, QuicksandCommonConfig.vertical_movement_multiplication.get(), horizontal));
      }
   }
}
