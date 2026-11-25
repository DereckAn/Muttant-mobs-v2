package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.client.MutantHuskRenderState;
import com.alexander.mutantmore.entities.MutantHusk;
import com.alexander.mutantmore.init.ModelLayerInit;
import com.alexander.mutantmore.models.entities.MutantHuskModel;
import com.alexander.mutantmore.util.MiscUtils;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

public class MutantHuskRenderer extends MobRenderer<MutantHusk, MutantHuskRenderState, MutantHuskModel> {
   private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_husk.png");
   private static final Identifier RED_SAND_TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_husk_red_sand.png");

   public MutantHuskRenderer(EntityRendererProvider.Context context) {
      super(context, new MutantHuskModel(context.bakeLayer(ModelLayerInit.MUTANT_HUSK)), 1.5F);
   }

   @Override
   protected void scale(MutantHuskRenderState state, PoseStack poseStack) {
      super.scale(state, poseStack);
      poseStack.scale(1.3F, 1.3F, 1.3F);
   }

   @Override
   protected float getFlipDegrees() {
      return 0.0F;
   }

   @Override
   public Identifier getTextureLocation(MutantHuskRenderState state) {
      return "_red_sand".equals(state.sandType) ? RED_SAND_TEXTURE : TEXTURE;
   }

   @Override
   public MutantHuskRenderState createRenderState() {
      return new MutantHuskRenderState();
   }

   @Override
   public void extractRenderState(MutantHusk entity, MutantHuskRenderState state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.noveltyAnimationState.copyFrom(entity.noveltyAnimationState);
      state.throwSandAnimationState.copyFrom(entity.throwSandAnimationState);
      state.attackAnimationState.copyFrom(entity.attackAnimationState);
      state.trapAnimationState.copyFrom(entity.trapAnimationState);
      state.roarAnimationState.copyFrom(entity.roarAnimationState);
      state.introAnimationState.copyFrom(entity.introAnimationState);
      state.geyserAnimationState.copyFrom(entity.geyserAnimationState);
      state.jumpAnimationState.copyFrom(entity.jumpAnimationState);
      state.slamAnimationState.copyFrom(entity.slamAnimationState);
      state.downAnimationState.copyFrom(entity.downAnimationState);
      state.noveltyAnimationTick = entity.noveltyAnimationTick;
      state.throwSandAnimationTick = entity.throwSandAnimationTick;
      state.attackAnimationTick = entity.attackAnimationTick;
      state.trapAnimationTick = entity.trapAnimationTick;
      state.roarAnimationTick = entity.roarAnimationTick;
      state.introAnimationTick = entity.introAnimationTick;
      state.geyserAnimationTick = entity.geyserAnimationTick;
      state.jumpAnimationTick = entity.jumpAnimationTick;
      state.slamAnimationTick = entity.slamAnimationTick;
      state.downAnimationTick = entity.downAnimationTick;
      state.sandType = entity.getSandType();
      state.jumping = entity.jumping;
      state.notCurrentlyPlayingKeyframeAnimation = entity.notCurrentlyPlayingKeyframeAnimation();
      state.movingOnLand = MiscUtils.isMovingOnLand(entity);
      state.walkSpeed = Math.min((float)entity.getDeltaMovement().lengthSqr() * 50.0F, 8.0F);
   }
}
