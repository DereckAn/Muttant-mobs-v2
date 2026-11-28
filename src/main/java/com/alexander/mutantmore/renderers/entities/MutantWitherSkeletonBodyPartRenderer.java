package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.entities.MutantWitherSkeletonBodyPart;
import com.alexander.mutantmore.models.entities.MutantWitherSkeletonBodyPartModel;
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

/** A bone left behind when a Mutant Wither Skeleton falls apart; tumbles while airborne. */
public class MutantWitherSkeletonBodyPartRenderer extends EntityRenderer<MutantWitherSkeletonBodyPart, MutantWitherSkeletonBodyPartRenderer.State> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "mutant_wither_skeleton_body_part"), "main");
   private final MutantWitherSkeletonBodyPartModel model;

   public MutantWitherSkeletonBodyPartRenderer(EntityRendererProvider.Context context) {
      super(context);
      this.model = new MutantWitherSkeletonBodyPartModel(context.bakeLayer(LAYER));
      this.shadowRadius = 0.25F;
      this.shadowStrength = 0.5F;
   }

   @Override
   public void submit(State state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
      poseStack.pushPose();
      poseStack.scale(1.2F, 1.2F, 1.2F);
      // drawn upright like the original, so bones lie flat on the floor
      poseStack.scale(-1.0F, -1.0F, 1.0F);
      poseStack.translate(0.0F, -1.501F, 0.0F);
      collector.submitModel(
         this.model, state, poseStack, RenderTypes.entityCutout(MutantWitherSkeletonRenderer.texture()), state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor
      );
      poseStack.popPose();
      super.submit(state, poseStack, collector, camera);
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(MutantWitherSkeletonBodyPart entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.part = entity.getPart();
      state.xRot = Mth.rotLerp(partialTicks, entity.xRotO, entity.getXRot());
      state.yRot = Mth.rotLerp(partialTicks, entity.yRotO, entity.getYRot());
   }

   public static class State extends EntityRenderState {
      public int part;
      public float xRot;
      public float yRot;
   }
}
