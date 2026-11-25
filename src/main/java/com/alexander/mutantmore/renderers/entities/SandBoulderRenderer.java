package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.entities.SandBoulder;
import com.alexander.mutantmore.init.ModelLayerInit;
import com.alexander.mutantmore.models.entities.SandBoulderModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;

/** Rolling sand block thrown by the Mutant Husk; it reuses the husk texture (white or red sand). */
public class SandBoulderRenderer extends EntityRenderer<SandBoulder, SandBoulderRenderer.State> {
   private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_husk.png");
   private static final Identifier RED_SAND_TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_husk_red_sand.png");
   private final SandBoulderModel model;

   public SandBoulderRenderer(EntityRendererProvider.Context context) {
      super(context);
      this.model = new SandBoulderModel(context.bakeLayer(ModelLayerInit.SAND_BOULDER));
   }

   @Override
   public void submit(State state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
      poseStack.pushPose();
      poseStack.scale(1.25F, 1.25F, 1.25F);
      poseStack.translate(0.0, -0.15F, 0.0);
      poseStack.rotate(Axis.YP.rotationDegrees(state.yRot - 90.0F));
      collector.submitModel(this.model, state, poseStack, state.redSand ? RED_SAND_TEXTURE : TEXTURE, state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor);
      poseStack.popPose();
      super.submit(state, poseStack, collector, camera);
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(SandBoulder entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.yRot = entity.getYRot(partialTicks);
      state.speed = (float)entity.getDeltaMovement().horizontalDistance();
      state.redSand = "_red_sand".equals(entity.getSandType());
   }

   public static class State extends EntityRenderState {
      public float yRot;
      public float speed;
      public boolean redSand;
   }
}
