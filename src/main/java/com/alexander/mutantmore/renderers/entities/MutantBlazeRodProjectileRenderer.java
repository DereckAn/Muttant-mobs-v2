package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.entities.MutantBlazeRodProjectile;
import com.alexander.mutantmore.models.entities.RodlingModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;

/** The Mutant Blaze's thrown rod: a plain rod, or a Rodling that's about to hatch; both become collectable once landed. */
public class MutantBlazeRodProjectileRenderer extends EntityRenderer<MutantBlazeRodProjectile, RodlingModel.State> {
   private final RodlingModel model;

   public MutantBlazeRodProjectileRenderer(EntityRendererProvider.Context context) {
      super(context);
      this.model = new RodlingModel(context.bakeLayer(RodlingRenderer.LAYER));
   }

   @Override
   protected int getBlockLightLevel(MutantBlazeRodProjectile entity, BlockPos pos) {
      return 15;
   }

   @Override
   public void submit(RodlingModel.State state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
      Identifier texture = state.tame ? RodlingRenderer.TAME : RodlingRenderer.HOSTILE;
      poseStack.pushPose();
      if (state.rodShape) {
         poseStack.scale(1.5F, 1.5F, 1.5F);
      }
      poseStack.rotate(Axis.YP.rotationDegrees(state.entityId * 500.0F));
      poseStack.scale(-1.0F, -1.0F, 1.0F);
      poseStack.translate(0.0F, -1.501F, 0.0F);
      collector.submitModel(this.model, state, poseStack, RenderTypes.entityTranslucent(texture), state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor);
      collector.order(1).submitModel(this.model, state, poseStack, RenderTypes.entityTranslucentEmissive(texture), state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor);
      poseStack.popPose();
      super.submit(state, poseStack, collector, camera);
   }

   @Override
   public RodlingModel.State createRenderState() {
      return new RodlingModel.State();
   }

   @Override
   public void extractRenderState(MutantBlazeRodProjectile entity, RodlingModel.State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.rodShape = !entity.isRodling();
      state.hasArmour = entity.hasArmour();
      state.hasShields = entity.hasShields();
      state.tame = entity.isCollectable();
      state.sitting = entity.isCollectable() && entity.landed;
      state.flying = !state.sitting;
      state.entityId = entity.getId();
   }
}
