package com.alexander.mutantmore.renderers.entities;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import com.alexander.mutantmore.init.ModelLayerInit;
import com.alexander.mutantmore.entities.GiantSnowball;
import com.alexander.mutantmore.models.entities.GiantSnowballModel;

public class GiantSnowballRenderer extends EntityRenderer<GiantSnowball, GiantSnowballRenderer.State> {
   static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_frozen_zombie.png");
   private final GiantSnowballModel model;

   public GiantSnowballRenderer(EntityRendererProvider.Context context) {
      super(context);
      this.model = new GiantSnowballModel(context.bakeLayer(ModelLayerInit.GIANT_SNOWBALL));
   }

   @Override
   public void submit(State state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
      poseStack.pushPose();
      poseStack.translate(0.0, -0.25, 0.0);
      poseStack.rotate(Axis.YP.rotationDegrees(state.yRot - 90.0F));
      collector.submitModel(this.model, state, poseStack, TEXTURE, state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor);
      poseStack.popPose();
      super.submit(state, poseStack, collector, camera);
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(GiantSnowball entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.yRot = entity.getYRot(partialTicks);
   }

   public static class State extends EntityRenderState {
      public float yRot;
   }
}
