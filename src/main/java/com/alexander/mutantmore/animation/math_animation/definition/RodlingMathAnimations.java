package com.alexander.mutantmore.animation.math_animation.definition;

import com.alexander.mutantmore.animation.math_animation.MathAnim;
import com.alexander.mutantmore.animation.math_animation.MathAnimationDefinition;

public class RodlingMathAnimations {
   public static final MathAnimationDefinition IDLE = MathAnimationDefinition.Builder.withLength(0.0F)
      .addAnimation(
         "head",
         (data, transforms) -> {
            transforms.position(0.0F, data.animScale() * 0.5F + MathAnim.cosWave(data.ageInSeconds(), 250.0F, 1.0F, 100.0F), -data.animScale() * 0.5F);
            transforms.rotation(
               -MathAnim.cosWave(data.ageInSeconds(), 250.0F, -3.5F, -50.0F), 0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, -3.5F, 50.0F), true
            );
         }
      )
      .addAnimation(
         "coreParts", (data, transforms) -> transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 0.0F), data.animScale() * 0.5F)
      )
      .addAnimation("core", (data, transforms) -> transforms.rotation(-data.ageInSeconds() * 200.0F, -data.ageInSeconds() * 250.0F, 0.0F, true))
      .addAnimation(
         "coreRing",
         (data, transforms) -> transforms.rotation(0.0F, data.ageInSeconds() * 350.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, -25.0F, -50.0F), true)
      )
      .addAnimation("rods", (data, transforms) -> {
         transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 1.0F, 50.0F), data.animScale() * 0.5F);
         transforms.rotation(0.0F, -data.ageInSeconds() * 300.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, -5.0F, 0.0F), true);
      })
      .addAnimation(
         "rodRemainsLower",
         (data, transforms) -> {
            transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 0.0F), data.animScale() * 2.5F);
            transforms.rotation(
               -data.animScale() * 40.0F - MathAnim.cosWave(data.ageInSeconds(), 250.0F, -3.5F, -50.0F),
               0.0F,
               MathAnim.cosWave(data.ageInSeconds(), 250.0F, 3.5F, 50.0F),
               true
            );
         }
      )
      .addAnimation(
         "rodRemainsUpper",
         (data, transforms) -> {
            transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 75.0F), data.animScale() * 2.5F);
            transforms.rotation(
               -data.animScale() * 10.0F - MathAnim.cosWave(data.ageInSeconds(), 250.0F, 3.5F, -50.0F),
               0.0F,
               MathAnim.cosWave(data.ageInSeconds(), 250.0F, -3.5F, 50.0F),
               true
            );
         }
      )
      .build();
}
