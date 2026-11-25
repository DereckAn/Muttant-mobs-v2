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
import com.alexander.mutantmore.entities.ThrownIcicle;
import com.alexander.mutantmore.models.entities.ThrownIcicleModel;
import net.minecraft.util.Unit;

public class ThrownIcicleRenderer extends EntityRenderer<ThrownIcicle, ThrownIcicleRenderer.State> {
   static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_frozen_zombie.png");
   private final ThrownIcicleModel model;

   public ThrownIcicleRenderer(EntityRendererProvider.Context context) {
      super(context);
      this.model = new ThrownIcicleModel(context.bakeLayer(ModelLayerInit.THROWN_ICICLE));
   }

   @Override
   public void submit(State state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
      poseStack.pushPose();
      poseStack.rotate(Axis.YP.rotationDegrees(state.yRot + 180.0F));
      poseStack.rotate(Axis.XP.rotationDegrees(state.xRot));
      poseStack.translate(0.0, -0.8, 1.0);
      collector.submitModel(this.model, Unit.INSTANCE, poseStack, TEXTURE, state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor);
      poseStack.popPose();
      super.submit(state, poseStack, collector, camera);
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(ThrownIcicle entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.xRot = entity.getXRot(partialTicks);
      state.yRot = entity.getYRot(partialTicks);
   }

   public static class State extends EntityRenderState {
      public float xRot;
      public float yRot;
   }
}
