package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.config.mutant_blaze.MutantBlazeClientConfig;
import com.alexander.mutantmore.entities.MutantBlaze;
import com.alexander.mutantmore.models.entities.MutantBlazeModel;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.LivingEntityEmissiveLayer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.AnimationState;

public class MutantBlazeRenderer extends MobRenderer<MutantBlaze, MutantBlazeRenderer.State, MutantBlazeModel> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "mutant_blaze"), "main");
   private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_blaze.png");
   private static final Identifier ARMOURED = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_blaze_armoured.png");

   public MutantBlazeRenderer(EntityRendererProvider.Context context) {
      super(context, new MutantBlazeModel(context.bakeLayer(LAYER)), 1.25F);
      this.addLayer(new LivingEntityEmissiveLayer<>(this, state -> texture(), (state, age) -> 1.0F, this.model, RenderTypes::entityTranslucentEmissive, false));
      this.shadowStrength = 0.5F;
   }

   static Identifier texture() {
      return MutantBlazeClientConfig.armoured_texture.get() ? ARMOURED : TEXTURE;
   }

   @Override
   protected void scale(State state, PoseStack poseStack) {
      poseStack.scale(1.5F, 1.5F, 1.5F);
      super.scale(state, poseStack);
   }

   @Override
   protected int getBlockLightLevel(MutantBlaze entity, BlockPos pos) {
      return entity.stunnedTicks >= entity.stunnedAnimationActionPoint + 30 ? 1 : 15;
   }

   @Override
   protected float getFlipDegrees() {
      return 0.0F;
   }

   @Override
   public Identifier getTextureLocation(State state) {
      return texture();
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(MutantBlaze entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.introAnimation.copyFrom(entity.introAnimation);
      state.noveltyAnimation.copyFrom(entity.noveltyAnimation);
      state.shootAnimation.copyFrom(entity.shootAnimation);
      state.rodShotAnimation.copyFrom(entity.rodShotAnimation);
      state.stunnedAnimation.copyFrom(entity.stunnedAnimation);
      state.deathAnimation.copyFrom(entity.deathAnimation);
      state.entityId = entity.getId();
      state.crouching = entity.isCrouching();
      state.walkSpeed = (float)entity.getDeltaMovement().horizontalDistance() * 15.0F;
      for (int i = 0; i < state.brokenShields.length; i++) {
         state.brokenShields[i] = entity.isShieldBroken(i);
      }
   }

   public static class State extends LivingEntityRenderState {
      public final AnimationState introAnimation = new AnimationState();
      public final AnimationState noveltyAnimation = new AnimationState();
      public final AnimationState shootAnimation = new AnimationState();
      public final AnimationState rodShotAnimation = new AnimationState();
      public final AnimationState stunnedAnimation = new AnimationState();
      public final AnimationState deathAnimation = new AnimationState();
      public final boolean[] brokenShields = new boolean[7];
      public int entityId;
      public boolean crouching;
      public float walkSpeed;
   }
}
