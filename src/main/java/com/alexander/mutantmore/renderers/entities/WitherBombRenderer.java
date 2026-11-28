package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.entities.WitherBomb;
import com.alexander.mutantmore.models.entities.WitherBombModel;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.AnimationState;

public class WitherBombRenderer extends EntityRenderer<WitherBomb, WitherBombRenderer.State> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "wither_bomb"), "main");
   private final WitherBombModel model;

   public WitherBombRenderer(EntityRendererProvider.Context context) {
      super(context);
      this.model = new WitherBombModel(context.bakeLayer(LAYER));
      this.shadowRadius = 0.75F;
   }

   @Override
   public void submit(State state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
      poseStack.pushPose();
      poseStack.scale(-1.0F, -1.0F, 1.0F);
      poseStack.translate(0.0F, -1.501F, 0.0F);
      collector.submitModel(this.model, state, poseStack, MutantWitherSkeletonRenderer.texture(), state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor);
      poseStack.popPose();
      super.submit(state, poseStack, collector, camera);
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(WitherBomb entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.deployAnimation.copyFrom(entity.deployAnimation);
      state.activateAnimation.copyFrom(entity.activateAnimation);
      state.deployed = entity.isDeployed();
   }

   public static class State extends EntityRenderState {
      public final AnimationState deployAnimation = new AnimationState();
      public final AnimationState activateAnimation = new AnimationState();
      public boolean deployed;
      /** item pose (folded, slightly bigger) */
      public boolean item;
   }
}
