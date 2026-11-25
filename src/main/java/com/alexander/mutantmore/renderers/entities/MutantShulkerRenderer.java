package com.alexander.mutantmore.renderers.entities;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.LivingEntityEmissiveLayer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.item.DyeColor;
import org.jspecify.annotations.Nullable;
import com.alexander.mutantmore.entities.MutantShulker;
import com.alexander.mutantmore.models.entities.MutantShulkerModel;
import net.minecraft.util.Mth;

public class MutantShulkerRenderer extends MobRenderer<MutantShulker, MutantShulkerRenderer.State, MutantShulkerModel> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "mutant_shulker"), "main");
   private static final Identifier NORMAN_FACE = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_shulker_norman_face.png");

   public MutantShulkerRenderer(EntityRendererProvider.Context context) {
      super(context, new MutantShulkerModel(context.bakeLayer(LAYER)), 2.75F);
      // Easter egg: a Mutant Shulker named "Norman" gets a face
      this.addLayer(new LivingEntityEmissiveLayer<>(this, state -> NORMAN_FACE, (state, age) -> state.norman ? 1.0F : 0.0F, this.model, RenderTypes::entityTranslucentEmissive, false));
   }

   static Identifier texture(String base, @Nullable DyeColor color) {
      return Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/" + base + (color == null ? "" : "_" + color.getName()) + ".png");
   }

   @Override
   protected void scale(State state, PoseStack poseStack) {
      poseStack.scale(1.25F, 1.25F, 1.25F);
      super.scale(state, poseStack);
   }

   @Override
   protected float getFlipDegrees() {
      return 0.0F;
   }

   @Override
   public Identifier getTextureLocation(State state) {
      return texture("mutant_shulker", state.color);
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(MutantShulker entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.idleAnimation.copyFrom(entity.idleAnimation);
      state.idleRareAnimation.copyFrom(entity.idleRareAnimation);
      state.spinningAnimation.copyFrom(entity.spinningAnimation);
      state.shulkerWalkAnimation.copyFrom(entity.shulkerWalkAnimation);
      state.shootAnimation.copyFrom(entity.shootAnimation);
      state.biteAnimation.copyFrom(entity.biteAnimation);
      state.enterSpinAnimation.copyFrom(entity.enterSpinAnimation);
      state.deathAnimation.copyFrom(entity.deathAnimation);
      state.idleInShellAnimation.copyFrom(entity.idleInShellAnimation);
      state.idleRareInShellAnimation.copyFrom(entity.idleRareInShellAnimation);
      state.shootInShellAnimation.copyFrom(entity.shootInShellAnimation);
      state.anvilCrushAnimation.copyFrom(entity.anvilCrushAnimation);
      state.summonTrapsAnimation.copyFrom(entity.summonTrapsAnimation);
      state.summonTrapsInShellAnimation.copyFrom(entity.summonTrapsInShellAnimation);
      state.color = entity.getColor();
      state.norman = entity.hasCustomName() && "Norman".equals(entity.getName().getString());
      // Walk animation scale eases toward the ground speed (was done inside the model's setupAnim)
      float groundSpeed = (float)entity.getDeltaMovement().horizontalDistance();
      entity.currentSpeed = entity.currentSpeed > groundSpeed
         ? Math.max(groundSpeed, entity.currentSpeed - entity.currentSpeedChangeSpeed)
         : Math.min(groundSpeed, entity.currentSpeed + entity.currentSpeedChangeSpeed);
      state.walkScale = groundSpeed * 10.0F;
   }

   public static class State extends LivingEntityRenderState {
      public final AnimationState idleAnimation = new AnimationState();
      public final AnimationState idleRareAnimation = new AnimationState();
      public final AnimationState spinningAnimation = new AnimationState();
      public final AnimationState shulkerWalkAnimation = new AnimationState();
      public final AnimationState shootAnimation = new AnimationState();
      public final AnimationState biteAnimation = new AnimationState();
      public final AnimationState enterSpinAnimation = new AnimationState();
      public final AnimationState deathAnimation = new AnimationState();
      public final AnimationState idleInShellAnimation = new AnimationState();
      public final AnimationState idleRareInShellAnimation = new AnimationState();
      public final AnimationState shootInShellAnimation = new AnimationState();
      public final AnimationState anvilCrushAnimation = new AnimationState();
      public final AnimationState summonTrapsAnimation = new AnimationState();
      public final AnimationState summonTrapsInShellAnimation = new AnimationState();
      public @Nullable DyeColor color;
      public boolean norman;
      public float walkScale;
   }
}
