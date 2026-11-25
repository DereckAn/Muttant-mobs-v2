package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.entities.IceCube;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.FallingBlockRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.core.BlockPos;

/** A block of ice around a frozen mob, drawn like falling sand; a second inverted copy makes the inside faces visible from within. */
public class IceCubeRenderer extends EntityRenderer<IceCube, FallingBlockRenderState> {
   public IceCubeRenderer(EntityRendererProvider.Context context) {
      super(context);
      this.shadowRadius = 0.5F;
   }

   @Override
   public void submit(FallingBlockRenderState state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
      float width = state.boundingBoxWidth + 0.6F;
      float height = state.boundingBoxHeight + 0.4F;
      poseStack.pushPose();
      poseStack.translate(-width / 2.0F, -0.2F, -width / 2.0F);
      poseStack.scale(width, height, width);
      collector.submitMovingBlock(poseStack, state.movingBlockRenderState, state.outlineColor);
      poseStack.popPose();
      poseStack.pushPose();
      poseStack.scale(-1.0F, -1.0F, -1.0F);
      poseStack.translate(-width / 2.0F, -(state.boundingBoxHeight + 0.2F), -width / 2.0F);
      poseStack.scale(width, height, width);
      collector.submitMovingBlock(poseStack, state.movingBlockRenderState, state.outlineColor);
      poseStack.popPose();
      super.submit(state, poseStack, collector, camera);
   }

   @Override
   public FallingBlockRenderState createRenderState() {
      return new FallingBlockRenderState();
   }

   @Override
   public void extractRenderState(IceCube entity, FallingBlockRenderState state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      BlockPos pos = entity.blockPosition();
      state.movingBlockRenderState.randomSeedPos = pos;
      state.movingBlockRenderState.blockPos = pos;
      state.movingBlockRenderState.blockState = entity.getBlockState();
      if (entity.level() instanceof ClientLevel level) {
         state.movingBlockRenderState.biome = level.getBiome(pos);
         state.movingBlockRenderState.cardinalLighting = level.cardinalLighting();
         state.movingBlockRenderState.lightEngine = level.getLightEngine();
      }
   }
}
