package com.alexander.mutantmore.animation.math_animation.definition;

import com.alexander.mutantmore.animation.math_animation.MathAnim;
import com.alexander.mutantmore.animation.math_animation.MathAnimationDefinition;

public class MutantShulkerTurretMathAnimations {
   public static final MathAnimationDefinition IDLE = MathAnimationDefinition.Builder.withLength(0.0F)
      .addAnimation(
         "head",
         (data, transforms) -> {
            transforms.position(0.0F, -1.5F + MathAnim.cosWave(data.ageInSeconds(), 200.0F, 0.1F, 25.0F), 0.0F);
            transforms.rotation(
               -MathAnim.cosWave(data.ageInSeconds(), 200.0F, 1.0F, 75.0F),
               -MathAnim.cosWave(data.ageInSeconds(), 200.0F, -1.0F, 125.0F),
               MathAnim.cosWave(data.ageInSeconds(), 200.0F, 1.0F, 25.0F),
               true
            );
         }
      )
      .addAnimation(
         "head2",
         (data, transforms) -> {
            transforms.position(0.0F, -1.5F + MathAnim.cosWave(data.ageInSeconds(), 200.0F, 0.5F, 50.0F), 0.0F);
            transforms.rotation(
               -MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 125.0F),
               -MathAnim.cosWave(data.ageInSeconds(), 100.0F, -2.5F, 25.0F),
               MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 75.0F),
               true
            );
         }
      )
      .addAnimation(
         "head3",
         (data, transforms) -> {
            transforms.position(0.0F, -1.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F), 0.0F);
            transforms.rotation(
               -MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 75.0F),
               -MathAnim.cosWave(data.ageInSeconds(), 100.0F, -2.5F, 125.0F),
               MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 25.0F),
               true
            );
         }
      )
      .addAnimation("upperShell1", (data, transforms) -> transforms.position(0.0F, 3.0F, 0.0F))
      .addAnimation("upperShell2", (data, transforms) -> transforms.position(0.0F, 3.0F, 0.0F))
      .addAnimation("upperShell3", (data, transforms) -> transforms.position(0.0F, 3.0F, 0.0F))
      .build();
}
