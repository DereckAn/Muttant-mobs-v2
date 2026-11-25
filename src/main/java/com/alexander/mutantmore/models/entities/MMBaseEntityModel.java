package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.animation.math_animation.AnimationData;
import com.alexander.mutantmore.animation.math_animation.MathAnim;
import com.alexander.mutantmore.animation.math_animation.MathAnimationDefinition;
import java.util.function.Function;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.AnimationState;

/** Base for models driven by the mod's "math animations" (code-defined bone transforms plus keyframe channels), now fed from a render state. */
public abstract class MMBaseEntityModel<S extends LivingEntityRenderState> extends EntityModel<S> {
   protected MMBaseEntityModel(ModelPart root) {
      this(root, RenderTypes::entityTranslucent);
   }

   protected MMBaseEntityModel(ModelPart root, Function<Identifier, RenderType> renderType) {
      super(root, renderType);
   }

   /** Entity id passed to animations that look the entity up (only the Mutant Blaze's do); override when the state carries it. */
   protected int entityId(S state) {
      return 0;
   }

   protected void mathAnimateState(S state, AnimationState animation, MathAnimationDefinition definition, float speed, float scale) {
      if (animation.isStarted()) {
         this.mathAnimate(state, definition, (long)(animation.getTimeInMillis(state.ageInTicks) * speed), scale);
      }
   }

   protected void mathAnimateLook(S state, MathAnimationDefinition definition, float angle) {
      if (definition.lengthInSeconds() != 2.0F) {
         throw new IllegalArgumentException("Look mathAnimations must be exactly 2 seconds long.");
      }

      this.mathAnimate(state, definition, (long)((angle / 90.0F + 1.0F) * 1000.0F), 1.0F);
   }

   protected void mathAnimateWalk(S state, MathAnimationDefinition definition, float maxSpeed, float scaleFactor) {
      long elapsed = (long)(state.walkAnimationPos * 50.0F * maxSpeed);
      this.mathAnimate(state, definition, elapsed, Math.min(state.walkAnimationSpeed * scaleFactor, 1.0F));
   }

   protected void mathAnimate(S state, MathAnimationDefinition definition, long elapsedMillis, float animScale) {
      float seconds = elapsedMillis / 1000.0F;
      if (definition.looping()) {
         seconds %= definition.lengthInSeconds();
      }

      AnimationData data = new AnimationData(
         Minecraft.getInstance().level, this.entityId(state), seconds, animScale, state.walkAnimationPos, state.walkAnimationSpeed, state.ageInTicks, state.yRot, state.xRot
      );
      MathAnim.animate(this::findPart, data, definition);
   }

   /** Was HierarchicalModel.getAnyDescendantWithName. */
   protected ModelPart findPart(String name) {
      if (name.equals("root")) {
         return this.root();
      }

      return this.root().getAllParts().stream().filter(part -> part.hasChild(name)).findFirst().map(part -> part.getChild(name)).orElse(null);
   }
}
