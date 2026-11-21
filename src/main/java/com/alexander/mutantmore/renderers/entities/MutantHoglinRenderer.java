package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.client.MutantHoglinRenderState;
import com.alexander.mutantmore.entities.MutantHoglin;
import com.alexander.mutantmore.init.ModelLayerInit;
import com.alexander.mutantmore.models.entities.MutantHoglinModel;
import com.alexander.mutantmore.util.MiscUtils;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.LivingEntityEmissiveLayer;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;

public class MutantHoglinRenderer extends MobRenderer<MutantHoglin, MutantHoglinRenderState, MutantHoglinModel> {
   private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_hoglin.png");
   private static final Identifier ENRAGED_TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_hoglin_enraged.png");

   public MutantHoglinRenderer(EntityRendererProvider.Context context) {
      super(context, new MutantHoglinModel(context.bakeLayer(ModelLayerInit.MUTANT_HOGLIN)), 2.25F);
      // Was MutantHoglinEnragedLayer: the enraged texture fades in with the rage meter
      this.addLayer(new LivingEntityEmissiveLayer<>(
         this, state -> ENRAGED_TEXTURE, (state, ageInTicks) -> state.enragedAmount, this.model, RenderTypes::entityTranslucentEmissive, false
      ));
   }

   @Override
   protected void scale(MutantHoglinRenderState state, PoseStack poseStack) {
      super.scale(state, poseStack);
      poseStack.scale(1.1F, 1.1F, 1.1F);
   }

   @Override
   protected float getFlipDegrees() {
      return 0.0F;
   }

   @Override
   public Identifier getTextureLocation(MutantHoglinRenderState state) {
      return TEXTURE;
   }

   @Override
   public MutantHoglinRenderState createRenderState() {
      return new MutantHoglinRenderState();
   }

   @Override
   public void extractRenderState(MutantHoglin entity, MutantHoglinRenderState state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.noveltyAnimationState.copyFrom(entity.noveltyAnimationState);
      state.attackAnimationState.copyFrom(entity.attackAnimationState);
      state.stompAnimationState.copyFrom(entity.stompAnimationState);
      state.kickAnimationState.copyFrom(entity.kickAnimationState);
      state.prepareChargeAnimationState.copyFrom(entity.prepareChargeAnimationState);
      state.introAnimationState.copyFrom(entity.introAnimationState);
      state.deathAnimationState.copyFrom(entity.deathAnimationState);
      state.danceAnimationState.copyFrom(entity.danceAnimationState);
      state.noveltyAnimationTick = entity.noveltyAnimationTick;
      state.attackAnimationTick = entity.attackAnimationTick;
      state.stompAnimationTick = entity.stompAnimationTick;
      state.kickAnimationTick = entity.kickAnimationTick;
      state.prepareChargeAnimationTick = entity.prepareChargeAnimationTick;
      state.introAnimationTick = entity.introAnimationTick;
      state.deathTime = entity.deathTime;
      state.notCurrentlyPlayingKeyframeAnimation = entity.notCurrentlyPlayingKeyframeAnimation();
      state.charging = entity.charging;
      state.movingOnLand = MiscUtils.isMovingOnLand(entity);
      Vec3 velocity = entity.getDeltaMovement();
      state.groundSpeed = Mth.sqrt((float)velocity.horizontalDistanceSqr());
      state.walkSpeed = Math.min((float)velocity.lengthSqr() * 50.0F, 8.0F);
      state.enragedAmount = entity.getEnragedAmount();
   }
}
