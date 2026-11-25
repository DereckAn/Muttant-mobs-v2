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
import com.alexander.mutantmore.entities.IcicleSpike;
import com.alexander.mutantmore.models.entities.IcicleSpikeModel;
import net.minecraft.world.entity.AnimationState;

/** An icicle bursting out of the ground (drawn once its rise animation starts). */
public class IcicleSpikeRenderer extends EntityRenderer<IcicleSpike, IcicleSpikeRenderer.State> {
   static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_frozen_zombie.png");
   private final IcicleSpikeModel model;

   public IcicleSpikeRenderer(EntityRendererProvider.Context context) {
      super(context);
      this.model = new IcicleSpikeModel(context.bakeLayer(ModelLayerInit.ICICLE_SPIKE));
   }

   @Override
   public void submit(State state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
      if (state.spikeAnimationState.isStarted()) {
         poseStack.pushPose();
         poseStack.scale(-1.0F, -1.0F, 1.0F);
         poseStack.translate(0.0, -1.8F, 0.0);
         collector.submitModel(this.model, state, poseStack, TEXTURE, state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor);
         poseStack.popPose();
      }

      super.submit(state, poseStack, collector, camera);
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(IcicleSpike entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.spikeAnimationState.copyFrom(entity.spikeAnimationState);
      state.xRot = entity.getXRot();
      state.yRot = entity.getYRot();
   }

   public static class State extends EntityRenderState {
      public final AnimationState spikeAnimationState = new AnimationState();
      public float xRot;
      public float yRot;
   }
}
