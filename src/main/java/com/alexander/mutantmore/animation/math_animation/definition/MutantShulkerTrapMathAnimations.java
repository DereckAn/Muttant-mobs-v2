package com.alexander.mutantmore.animation.math_animation.definition;

import com.alexander.mutantmore.animation.math_animation.MathAnim;
import com.alexander.mutantmore.animation.math_animation.MathAnimationDefinition;

public class MutantShulkerTrapMathAnimations {
   public static final MathAnimationDefinition AIRBORNE = MathAnimationDefinition.Builder.withLength(0.0F)
      .addAnimation("everything", (data, transforms) -> transforms.rotation(-data.ageInSeconds() * 500.0F, -data.ageInSeconds() * 300.0F, 0.0F, true))
      .addAnimation("side1", (data, transforms) -> transforms.rotation(-40.0F, 0.0F, 0.0F, true))
      .addAnimation("side2", (data, transforms) -> transforms.rotation(40.0F, 0.0F, 0.0F, true))
      .build();
   public static final MathAnimationDefinition IDLE = MathAnimationDefinition.Builder.withLength(0.0F).addAnimation("head", (data, transforms) -> {
      transforms.position(0.0F, MathAnim.cosWave(data.elapsedSeconds(), 100.0F, 0.5F, 50.0F), 0.0F);
      transforms.rotation(0.0F, -data.elapsedSeconds() * 100.0F, 0.0F, true);
   }).build();
}
