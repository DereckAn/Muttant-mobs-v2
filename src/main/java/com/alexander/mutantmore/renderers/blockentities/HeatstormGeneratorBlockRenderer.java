package com.alexander.mutantmore.renderers.blockentities;

import com.alexander.mutantmore.blockentities.HeatstormGeneratorBlockEntity;
import com.alexander.mutantmore.blocks.HeatstormGeneratorBlock;
import com.alexander.mutantmore.models.blockentities.HeatstormGeneratorModel;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

public class HeatstormGeneratorBlockRenderer implements BlockEntityRenderer<HeatstormGeneratorBlockEntity, HeatstormGeneratorBlockRenderer.State> {
   public static final Identifier ON = Identifier.fromNamespaceAndPath("mutantmore", "textures/block/heatstorm_generator_on.png");
   public static final Identifier OFF = Identifier.fromNamespaceAndPath("mutantmore", "textures/block/heatstorm_generator_off.png");
   private final HeatstormGeneratorModel model;

   public HeatstormGeneratorBlockRenderer(BlockEntityRendererProvider.Context context) {
      this.model = new HeatstormGeneratorModel(context.bakeLayer(HeatstormGeneratorModel.LAYER));
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(
      HeatstormGeneratorBlockEntity generator, State state, float partialTicks, Vec3 cameraPosition, ModelFeatureRenderer.@Nullable CrumblingOverlay breakProgress
   ) {
      BlockEntityRenderer.super.extractRenderState(generator, state, partialTicks, cameraPosition, breakProgress);
      state.age = generator.tickCount + partialTicks;
      state.powered = generator.getBlockState().getValue(HeatstormGeneratorBlock.POWERED);
   }

   @Override
   public void submit(State state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
      poseStack.pushPose();
      poseStack.translate(0.5, 0.5, 0.5);
      poseStack.scale(0.9995F, 0.9995F, 0.9995F);
      poseStack.scale(1.0F, -1.0F, -1.0F);
      poseStack.translate(0.0, -1.0, 0.0);
      collector.submitModel(this.model, state.age, poseStack, state.powered ? ON : OFF, state.lightCoords, OverlayTexture.NO_OVERLAY, 0);
      poseStack.popPose();
   }

   public static class State extends BlockEntityRenderState {
      public float age;
      public boolean powered;
   }
}
