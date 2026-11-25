package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.advanced_animation_utils.animation_utils.AdvancedAnimationUtils;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers.AdvancedAnimationTracker;
import com.alexander.mutantmore.entities.MutantWitherSkeleton;
import com.alexander.mutantmore.models.entities.MutantWitherSkeletonModel;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.client.renderer.entity.state.ArmedEntityRenderState;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import org.jspecify.annotations.Nullable;

public class MutantWitherSkeletonRenderer extends MobRenderer<MutantWitherSkeleton, MutantWitherSkeletonRenderer.State, MutantWitherSkeletonModel> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "mutant_wither_skeleton"), "main");
   private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_wither_skeleton.png");
   private static final Identifier APRIL_FOOLS = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_wither_skeleton_april_fools.png");

   public MutantWitherSkeletonRenderer(EntityRendererProvider.Context context) {
      super(context, new MutantWitherSkeletonModel(context.bakeLayer(LAYER)), 1.25F);
      this.addLayer(new ItemInHandLayer<>(this));
   }

   public static Identifier texture() {
      return MiscUtils.isAprilFools() ? APRIL_FOOLS : TEXTURE;
   }

   @Override
   protected void scale(State state, PoseStack poseStack) {
      super.scale(state, poseStack);
      poseStack.scale(1.2F, 1.2F, 1.2F);
   }

   @Override
   protected void setupRotations(State state, PoseStack poseStack, float bodyRot, float entityScale) {
      super.setupRotations(state, poseStack, bodyRot, entityScale);
      poseStack.rotate(Axis.XP.rotationDegrees(state.lungingXRot));
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
   public void extractRenderState(MutantWitherSkeleton entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      ArmedEntityRenderState.extractArmedEntityRenderState(entity, state, this.itemModelResolver, partialTicks);
      state.tracker = entity.getAnimationTracker();
      // Per-frame inputs of the walk and leg-height animations (were computed inside the model's setupAnim)
      AdvancedAnimationUtils.addWalkModifiers(entity.getAnimation("walk"), entity, 3.0F, 1.0F);
      AdvancedAnimationUtils.addLegHeightOffsetModifier(
         entity, PositionUtils.getOffsetPos(entity, -0.75, 0.0, 0.0, 0.0F, entity.yBodyRot), 2, "offset_legs", "left_leg_y", 0.2F, -0.75F, 1.5F, 1.2F
      );
      AdvancedAnimationUtils.addLegHeightOffsetModifier(
         entity, PositionUtils.getOffsetPos(entity, 0.75, 0.0, 0.0, 0.0F, entity.yBodyRot), 2, "offset_legs", "right_leg_y", 0.2F, -0.75F, 1.5F, 1.2F
      );
      entity.lungingXRot = (float)Mth.lerp(
         partialTicks, entity.lungingXRot, entity.getAnimation("lunging").isPlaying() ? Mth.clamp(entity.getDeltaMovement().y * 30.0, -90.0, 90.0) : 0.0
      );
      state.lungingXRot = entity.lungingXRot;
   }

   public static class State extends ArmedEntityRenderState {
      /** ponytail: the animations live on the entity (server-synced, client-ticked); the state borrows them for this frame */
      public @Nullable AdvancedAnimationTracker tracker;
      public float lungingXRot;
   }
}
