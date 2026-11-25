package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.client.MutantJungleZombieRenderState;
import com.alexander.mutantmore.entities.MutantJungleZombie;
import com.alexander.mutantmore.init.ModelLayerInit;
import com.alexander.mutantmore.models.entities.MutantJungleZombieModel;
import com.alexander.mutantmore.util.MiscUtils;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

public class MutantJungleZombieRenderer extends MobRenderer<MutantJungleZombie, MutantJungleZombieRenderState, MutantJungleZombieModel> {
   private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_jungle_zombie.png");

   public MutantJungleZombieRenderer(EntityRendererProvider.Context context) {
      super(context, new MutantJungleZombieModel(context.bakeLayer(ModelLayerInit.MUTANT_JUNGLE_ZOMBIE)), 1.25F);
   }

   @Override
   protected void scale(MutantJungleZombieRenderState state, PoseStack poseStack) {
      super.scale(state, poseStack);
      poseStack.scale(1.3F, 1.3F, 1.3F);
   }

   @Override
   protected float getFlipDegrees() {
      return 0.0F;
   }

   @Override
   public Identifier getTextureLocation(MutantJungleZombieRenderState state) {
      return TEXTURE;
   }

   @Override
   public MutantJungleZombieRenderState createRenderState() {
      return new MutantJungleZombieRenderState();
   }

   @Override
   public void extractRenderState(MutantJungleZombie entity, MutantJungleZombieRenderState state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.noveltyAnimationState.copyFrom(entity.noveltyAnimationState);
      state.downAnimationState.copyFrom(entity.downAnimationState);
      state.introAnimationState.copyFrom(entity.introAnimationState);
      state.punchAnimationState.copyFrom(entity.punchAnimationState);
      state.tryChokeAnimationState.copyFrom(entity.tryChokeAnimationState);
      state.chokeAnimationState.copyFrom(entity.chokeAnimationState);
      state.lowAttackAnimationState.copyFrom(entity.lowAttackAnimationState);
      state.highAttackAnimationState.copyFrom(entity.highAttackAnimationState);
      state.jumpAnimationState.copyFrom(entity.jumpAnimationState);
      state.trySlamAnimationState.copyFrom(entity.trySlamAnimationState);
      state.slamAnimationState.copyFrom(entity.slamAnimationState);
      state.stopRestingAnimationState.copyFrom(entity.stopRestingAnimationState);
      state.noveltyAnimationTick = entity.noveltyAnimationTick;
      state.downAnimationTick = entity.downAnimationTick;
      state.introAnimationTick = entity.introAnimationTick;
      state.punchAnimationTick = entity.punchAnimationTick;
      state.tryChokeAnimationTick = entity.tryChokeAnimationTick;
      state.chokeAnimationTick = entity.chokeAnimationTick;
      state.lowAttackAnimationTick = entity.lowAttackAnimationTick;
      state.highAttackAnimationTick = entity.highAttackAnimationTick;
      state.jumpAnimationTick = entity.jumpAnimationTick;
      state.trySlamAnimationTick = entity.trySlamAnimationTick;
      state.slamAnimationTick = entity.slamAnimationTick;
      state.stopRestingAnimationTick = entity.stopRestingAnimationTick;
      state.restTick = entity.restTick;
      state.grabArmXRot = entity.getGrabArmXRot();
      state.notCurrentlyPlayingKeyframeAnimation = entity.notCurrentlyPlayingKeyframeAnimation();
      state.movingOnLand = MiscUtils.isMovingOnLand(entity);
      state.walkSpeed = Math.min((float)entity.getDeltaMovement().lengthSqr() * 50.0F, 8.0F);
   }
}
