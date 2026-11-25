package com.alexander.mutantmore.animation.keyframe_animations.definition;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class ZombieResurrectionAnimations {
   public static final AnimationDefinition ZOMBIE_RESURRECTION = Builder.withLength(4.625F)
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -34.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -34.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, -25.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.posVec(0.0F, -21.13F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, -14.0F, -5.9F), Interpolations.CATMULLROM),
               new Keyframe(2.875F, KeyframeAnimations.posVec(0.0F, -13.0F, -7.9F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.posVec(0.0F, -12.5F, -10.4F), Interpolations.CATMULLROM),
               new Keyframe(3.625F, KeyframeAnimations.posVec(0.0F, -12.5F, -10.4F), Interpolations.CATMULLROM),
               new Keyframe(3.7916765F, KeyframeAnimations.posVec(0.0F, -7.5F, -10.01F), Interpolations.CATMULLROM),
               new Keyframe(3.9583435F, KeyframeAnimations.posVec(0.0F, -2.23F, -6.77F), Interpolations.CATMULLROM),
               new Keyframe(4.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.12F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.875F, KeyframeAnimations.degreeVec(62.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(87.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.625F, KeyframeAnimations.degreeVec(87.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.9583435F, KeyframeAnimations.degreeVec(72.61F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.416767F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.01F, -34.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.posVec(0.01F, -20.5F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.01F, -14.0F, -6.5F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.posVec(0.01F, -12.0F, -10.5F), Interpolations.CATMULLROM),
               new Keyframe(3.625F, KeyframeAnimations.posVec(0.01F, -12.0F, -11.5F), Interpolations.CATMULLROM),
               new Keyframe(3.9167664F, KeyframeAnimations.posVec(0.01F, -2.83F, -7.38F), Interpolations.CATMULLROM),
               new Keyframe(4.25F, KeyframeAnimations.posVec(0.01F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.375F, KeyframeAnimations.posVec(0.01F, 0.0F, 0.98F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.posVec(0.01F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.625F, KeyframeAnimations.degreeVec(75.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "left_arm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -34.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, -20.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -20.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.posVec(0.0F, -20.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.posVec(0.0F, -20.0F, -5.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, -20.0F, -5.0F), Interpolations.LINEAR),
               new Keyframe(2.2916765F, KeyframeAnimations.posVec(0.0F, -20.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(2.4167664F, KeyframeAnimations.posVec(0.0F, -18.41F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, -13.0F, -9.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.posVec(0.0F, -12.0F, -11.0F), Interpolations.CATMULLROM),
               new Keyframe(3.625F, KeyframeAnimations.posVec(0.0F, -12.0F, -11.0F), Interpolations.CATMULLROM),
               new Keyframe(3.8343334F, KeyframeAnimations.posVec(0.0F, -6.13F, -8.02F), Interpolations.CATMULLROM),
               new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, -1.51F, -5.14F), Interpolations.CATMULLROM),
               new Keyframe(4.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "left_arm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-180.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-180.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-90.0F, -10.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(-90.0F, -10.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-90.0F, -10.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-90.0F, -10.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2916765F, KeyframeAnimations.degreeVec(-90.0F, -10.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(-29.14F, -12.47F, -4.43F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(-11.64F, -12.47F, -4.43F), Interpolations.CATMULLROM),
               new Keyframe(3.625F, KeyframeAnimations.degreeVec(-11.64F, -12.47F, -4.43F), Interpolations.CATMULLROM),
               new Keyframe(3.8343334F, KeyframeAnimations.degreeVec(-13.56F, -7.53F, -2.67F), Interpolations.CATMULLROM),
               new Keyframe(4.125F, KeyframeAnimations.degreeVec(-97.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "right_arm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -34.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -20.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -20.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, -20.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.posVec(0.0F, -20.02F, -5.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, -20.02F, -5.0F), Interpolations.LINEAR),
               new Keyframe(2.2916765F, KeyframeAnimations.posVec(0.0F, -20.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(2.4167664F, KeyframeAnimations.posVec(0.0F, -18.41F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, -13.0F, -9.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.posVec(0.0F, -12.0F, -11.0F), Interpolations.CATMULLROM),
               new Keyframe(3.625F, KeyframeAnimations.posVec(0.0F, -12.0F, -11.0F), Interpolations.CATMULLROM),
               new Keyframe(3.8343334F, KeyframeAnimations.posVec(0.0F, -6.13F, -8.02F), Interpolations.CATMULLROM),
               new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, -1.51F, -5.14F), Interpolations.CATMULLROM),
               new Keyframe(4.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "right_arm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-180.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-180.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-90.0F, 5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(-90.0F, 5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-90.0F, 5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-90.0F, 5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2916765F, KeyframeAnimations.degreeVec(-90.0F, 5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(-29.79F, 6.25F, 2.18F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(-10.83F, 26.59F, -1.57F), Interpolations.CATMULLROM),
               new Keyframe(3.625F, KeyframeAnimations.degreeVec(-10.83F, 26.59F, -1.57F), Interpolations.CATMULLROM),
               new Keyframe(3.8343334F, KeyframeAnimations.degreeVec(-13.56F, 7.53F, 2.67F), Interpolations.CATMULLROM),
               new Keyframe(4.125F, KeyframeAnimations.degreeVec(-97.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "left_leg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -13.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, -13.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.875F, KeyframeAnimations.posVec(0.0F, -12.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.posVec(0.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(3.625F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "left_leg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.875F, KeyframeAnimations.degreeVec(2.5F, 0.0F, -7.5F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(3.5F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.625F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "right_leg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -13.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, -13.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.875F, KeyframeAnimations.posVec(0.0F, -12.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.posVec(0.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(3.625F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "right_leg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.875F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 7.5F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.5F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.625F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
}
