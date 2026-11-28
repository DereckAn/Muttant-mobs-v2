package com.alexander.mutantmore.renderers.blockentities;

import com.alexander.mutantmore.blockentities.CustomSkullBlockEntity;
import com.alexander.mutantmore.blocks.CustomSkullBlock;
import com.alexander.mutantmore.blocks.CustomWallSkullBlock;
import com.alexander.mutantmore.models.blockentities.CustomSkullModel;
import com.alexander.mutantmore.renderers.entities.MutantWitherSkeletonRenderer;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

public class CustomSkullBlockRenderer implements BlockEntityRenderer<CustomSkullBlockEntity, CustomSkullBlockRenderer.State> {
   private final CustomSkullModel model;

   public CustomSkullBlockRenderer(BlockEntityRendererProvider.Context context) {
      this.model = new CustomSkullModel(context.bakeLayer(CustomSkullModel.LAYER));
   }

   /** Shared with the item renderer: places and submits the skull for a floor rotation (0-15) or a wall facing. */
   public static void submitSkull(CustomSkullModel model, @Nullable Direction wallFacing, int rotation, PoseStack poseStack, SubmitNodeCollector collector, int light, int outlineColor) {
      poseStack.pushPose();
      poseStack.scale(-1.0F, -1.0F, 1.0F);
      poseStack.translate(-1.0F, -1.501F, 0.0F);
      if (wallFacing != null) {
         poseStack.translate(0.5F + wallFacing.getStepX() * 0.25F, -0.25F, 0.5F - wallFacing.getStepZ() * 0.25F);
      } else {
         poseStack.translate(0.5, 0.0, 0.5);
      }

      poseStack.rotate(Axis.YP.rotationDegrees(22.5F * (wallFacing != null ? (2 + wallFacing.get2DDataValue()) * 4 : rotation)));
      collector.submitModel(model, wallFacing == null, poseStack, RenderTypes.entityTranslucent(MutantWitherSkeletonRenderer.texture()), light, OverlayTexture.NO_OVERLAY, outlineColor);
      poseStack.popPose();
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(
      CustomSkullBlockEntity blockEntity, State state, float partialTicks, Vec3 cameraPosition, ModelFeatureRenderer.@Nullable CrumblingOverlay breakProgress
   ) {
      BlockEntityRenderer.super.extractRenderState(blockEntity, state, partialTicks, cameraPosition, breakProgress);
      BlockState blockState = blockEntity.getBlockState();
      state.wallFacing = blockState.getBlock() instanceof CustomWallSkullBlock ? blockState.getValue(CustomWallSkullBlock.FACING) : null;
      state.rotation = blockState.getBlock() instanceof CustomSkullBlock ? blockState.getValue(CustomSkullBlock.ROTATION) : 0;
   }

   @Override
   public void submit(State state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
      submitSkull(this.model, state.wallFacing, state.rotation, poseStack, collector, state.lightCoords, 0);
   }

   public static class State extends BlockEntityRenderState {
      public @Nullable Direction wallFacing;
      public int rotation;
   }
}
