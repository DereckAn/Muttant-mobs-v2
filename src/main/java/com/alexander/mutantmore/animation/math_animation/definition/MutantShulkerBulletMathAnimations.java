package com.alexander.mutantmore.animation.math_animation.definition;

import com.alexander.mutantmore.animation.math_animation.MathAnim;
import com.alexander.mutantmore.animation.math_animation.MathAnimationDefinition;

public class MutantShulkerBulletMathAnimations {
   public static final MathAnimationDefinition IDLE = MathAnimationDefinition.Builder.withLength(0.0F)
      .addAnimation(
         "everything",
         (data, transforms) -> transforms.rotation(
            -MathAnim.cosWave(data.ageInSeconds(), 50.0F, 500.0F, 0.0F),
            -MathAnim.cosWave(data.ageInSeconds(), 25.0F, 375.0F, 25.0F),
            MathAnim.cosWave(data.ageInSeconds(), 10.0F, 180.0F, 125.0F),
            true
         )
      )
      .addAnimation("transparent", (data, transforms) -> transforms.uniformScale(1.25F + MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.1F, -50.0F)))
      .build();
}
