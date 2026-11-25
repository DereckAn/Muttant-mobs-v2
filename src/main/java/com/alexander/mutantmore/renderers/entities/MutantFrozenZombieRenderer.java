package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.client.MutantFrozenZombieRenderState;
import com.alexander.mutantmore.entities.MutantFrozenZombie;
import com.alexander.mutantmore.init.ModelLayerInit;
import com.alexander.mutantmore.models.entities.MutantFrozenZombieModel;
import com.alexander.mutantmore.util.MiscUtils;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

public class MutantFrozenZombieRenderer extends MobRenderer<MutantFrozenZombie, MutantFrozenZombieRenderState, MutantFrozenZombieModel> {
   private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_frozen_zombie.png");

   public MutantFrozenZombieRenderer(EntityRendererProvider.Context context) {
      super(context, new MutantFrozenZombieModel(context.bakeLayer(ModelLayerInit.MUTANT_FROZEN_ZOMBIE)), 1.25F);
   }

   @Override
   protected void scale(MutantFrozenZombieRenderState state, PoseStack poseStack) {
      super.scale(state, poseStack);
      poseStack.scale(1.3F, 1.3F, 1.3F);
   }

   @Override
   protected float getFlipDegrees() {
      return 0.0F;
   }

   @Override
   public Identifier getTextureLocation(MutantFrozenZombieRenderState state) {
      return TEXTURE;
   }

   @Override
   public MutantFrozenZombieRenderState createRenderState() {
      return new MutantFrozenZombieRenderState();
   }

   @Override
   public void extractRenderState(MutantFrozenZombie entity, MutantFrozenZombieRenderState state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.downAnimationState.copyFrom(entity.downAnimationState);
      state.roarAnimationState.copyFrom(entity.roarAnimationState);
      state.snowThrowAnimationState.copyFrom(entity.snowThrowAnimationState);
      state.slamAnimationState.copyFrom(entity.slamAnimationState);
      state.jumpAnimationState.copyFrom(entity.jumpAnimationState);
      state.iciclesAnimationState.copyFrom(entity.iciclesAnimationState);
      state.throwAnimationState.copyFrom(entity.throwAnimationState);
      state.attackAnimationState.copyFrom(entity.attackAnimationState);
      state.introAnimationState.copyFrom(entity.introAnimationState);
      state.noveltyAnimationState.copyFrom(entity.noveltyAnimationState);
      state.downAnimationTick = entity.downAnimationTick;
      state.roarAnimationTick = entity.roarAnimationTick;
      state.snowThrowAnimationTick = entity.snowThrowAnimationTick;
      state.slamAnimationTick = entity.slamAnimationTick;
      state.jumpAnimationTick = entity.jumpAnimationTick;
      state.iciclesAnimationTick = entity.iciclesAnimationTick;
      state.throwAnimationTick = entity.throwAnimationTick;
      state.attackAnimationTick = entity.attackAnimationTick;
      state.introAnimationTick = entity.introAnimationTick;
      state.noveltyAnimationTick = entity.noveltyAnimationTick;
      state.jumping = entity.jumping;
      state.notCurrentlyPlayingKeyframeAnimation = entity.notCurrentlyPlayingKeyframeAnimation();
      state.movingOnLand = MiscUtils.isMovingOnLand(entity);
      state.walkSpeed = Math.min((float)entity.getDeltaMovement().lengthSqr() * 50.0F, 8.0F);
   }
}
