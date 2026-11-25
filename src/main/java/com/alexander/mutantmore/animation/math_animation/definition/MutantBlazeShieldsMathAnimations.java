package com.alexander.mutantmore.animation.math_animation.definition;

import com.alexander.mutantmore.animation.math_animation.MathAnim;
import com.alexander.mutantmore.animation.math_animation.MathAnimationDefinition;

public class MutantBlazeShieldsMathAnimations {
   public static final MathAnimationDefinition IDLE = MathAnimationDefinition.Builder.withLength(0.0F).addAnimation("everything", (data, transforms) -> {
      transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 1.5F, -50.0F), 0.0F);
      transforms.rotation(MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, 100.0F), -data.ageInSeconds() * 250.0F, 0.0F, true);
   }).build();
}
