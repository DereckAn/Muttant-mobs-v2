package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.entities.WitherSlash;
import com.alexander.mutantmore.models.entities.WitherSlashModel;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;

public class WitherSlashRenderer extends EntityRenderer<WitherSlash, WitherSlashRenderer.State> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "wither_slash"), "main");
   private static final Identifier[] TEXTURES = {
      Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/wither_slash_0.png"), Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/wither_slash_1.png")
   };
   private final WitherSlashModel model;

   public WitherSlashRenderer(EntityRendererProvider.Context context) {
      super(context);
      this.model = new WitherSlashModel(context.bakeLayer(LAYER));
   }

   @Override
   public void submit(State state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
      poseStack.pushPose();
      poseStack.scale(-1.0F, -1.0F, 1.0F);
      poseStack.scale(state.size, state.size, state.size);
      poseStack.translate(0.0, -1.5, 0.0);
      collector.submitModel(this.model, state, poseStack, RenderTypes.entityTranslucent(TEXTURES[state.texture % TEXTURES.length]), state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor);
      poseStack.popPose();
      super.submit(state, poseStack, collector, camera);
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(WitherSlash entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.size = entity.getSize();
      state.fixedYaw = entity.getFixedYaw();
      state.xRot = -Mth.lerp(partialTicks, entity.xRotO, entity.getXRot());
      state.texture = entity.textureChange;
   }

   public static class State extends EntityRenderState {
      public float size = 1.0F;
      public float fixedYaw;
      public float xRot;
      public int texture;
   }
}
