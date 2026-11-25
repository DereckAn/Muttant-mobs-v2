package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.client.SentryVineRenderState;
import com.alexander.mutantmore.entities.SentryVine;
import com.alexander.mutantmore.init.ModelLayerInit;
import com.alexander.mutantmore.models.entities.SentryVineModel;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

public class SentryVineRenderer extends MobRenderer<SentryVine, SentryVineRenderState, SentryVineModel> {
   private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/sentry_vine.png");

   public SentryVineRenderer(EntityRendererProvider.Context context) {
      super(context, new SentryVineModel(context.bakeLayer(ModelLayerInit.SENTRY_VINE)), 0.75F);
   }

   // Hidden on its first tick so the deploy animation doesn't pop in fully grown
   @Override
   public boolean shouldRender(SentryVine entity, Frustum frustum, double camX, double camY, double camZ, float partialTicks) {
      return entity.tickCount > 1 && super.shouldRender(entity, frustum, camX, camY, camZ, partialTicks);
   }

   @Override
   protected float getFlipDegrees() {
      return 0.0F;
   }

   @Override
   public Identifier getTextureLocation(SentryVineRenderState state) {
      return TEXTURE;
   }

   @Override
   public SentryVineRenderState createRenderState() {
      return new SentryVineRenderState();
   }

   @Override
   public void extractRenderState(SentryVine entity, SentryVineRenderState state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.deployAnimationState.copyFrom(entity.deployAnimationState);
      state.attackAnimationState.copyFrom(entity.attackAnimationState);
      state.trySlamAnimationState.copyFrom(entity.trySlamAnimationState);
      state.slamAnimationState.copyFrom(entity.slamAnimationState);
      state.deployAnimationTick = entity.deployAnimationTick;
      state.attackAnimationTick = entity.attackAnimationTick;
      state.trySlamAnimationTick = entity.trySlamAnimationTick;
      state.slamAnimationTick = entity.slamAnimationTick;
   }
}
