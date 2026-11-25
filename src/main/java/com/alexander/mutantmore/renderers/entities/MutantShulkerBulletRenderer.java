package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.entities.MutantShulkerBullet;
import com.alexander.mutantmore.models.entities.MutantShulkerBulletModel;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.RandomSource;
import net.minecraft.world.phys.Vec3;

/** Mutant Shulker's big homing bullet: the model plus an emissive glow pass; it shakes harder as it takes hits. */
public class MutantShulkerBulletRenderer extends EntityRenderer<MutantShulkerBullet, MutantShulkerBulletRenderer.State> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "mutant_shulker_bullet"), "main");
   private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_shulker_bullet.png");
   private final MutantShulkerBulletModel model;

   public MutantShulkerBulletRenderer(EntityRendererProvider.Context context) {
      super(context);
      this.model = new MutantShulkerBulletModel(context.bakeLayer(LAYER));
   }

   @Override
   public void submit(State state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
      poseStack.pushPose();
      poseStack.scale(-1.0F, -1.0F, 1.0F);
      poseStack.translate(0.0F, -1.501F, 0.0F);
      collector.submitModel(this.model, state, poseStack, TEXTURE, state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor);
      collector.order(1).submitModel(this.model, state, poseStack, RenderTypes.entityTranslucentEmissive(TEXTURE), state.lightCoords, OverlayTexture.NO_OVERLAY, -1, null, state.outlineColor);
      poseStack.popPose();
      super.submit(state, poseStack, collector, camera);
   }

   @Override
   public Vec3 getRenderOffset(State state) {
      RandomSource random = RandomSource.create();
      double shake = state.remainingHits < 2 ? 0.04 : state.remainingHits < 3 ? 0.02 : 0.0;
      return shake == 0.0 ? super.getRenderOffset(state) : new Vec3(random.nextGaussian() * shake, random.nextGaussian() * shake, random.nextGaussian() * shake);
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(MutantShulkerBullet entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.remainingHits = entity.getRemainingHits();
      state.yRot = entity.getYRot(partialTicks);
      state.xRot = entity.getXRot(partialTicks);
   }

   public static class State extends LivingEntityRenderState {
      public int remainingHits;
   }
}
