package com.alexander.mutantmore.animation.keyframe_animations.definition;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class MutantShulkerShieldKeyframeAnimations {
   public static final AnimationDefinition SHOOT = Builder.withLength(1.1667F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.25F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.0208F, KeyframeAnimations.posVec(-0.06F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.0417F, KeyframeAnimations.posVec(-0.22F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.0625F, KeyframeAnimations.posVec(0.17F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.0833F, KeyframeAnimations.posVec(0.14F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.1042F, KeyframeAnimations.posVec(-0.24F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(-0.02F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.1458F, KeyframeAnimations.posVec(0.25F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.1667F, KeyframeAnimations.posVec(-0.1F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.1875F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.2083F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.2292F, KeyframeAnimations.posVec(0.1F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(-0.25F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.2708F, KeyframeAnimations.posVec(0.02F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.2917F, KeyframeAnimations.posVec(0.24F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.3125F, KeyframeAnimations.posVec(-0.13F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.3333F, KeyframeAnimations.posVec(-0.17F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.3542F, KeyframeAnimations.posVec(0.22F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.posVec(0.06F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.3958F, KeyframeAnimations.posVec(-0.25F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4167F, KeyframeAnimations.posVec(0.06F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4375F, KeyframeAnimations.posVec(0.22F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4583F, KeyframeAnimations.posVec(-0.17F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4792F, KeyframeAnimations.posVec(-0.14F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.23F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.scaleVec(1.05F, 1.05F, 1.05F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "upperJaw",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-17.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "upperJaw",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 7.9F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.posVec(0.0F, 7.7F, -0.1F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 7.7F, -0.1F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.posVec(0.0F, 9.0F, -0.1F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "lowerJaw",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "lowerJaw",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, -4.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.posVec(0.0F, -3.5F, 0.3F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, -3.5F, 0.3F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.posVec(0.0F, -4.5F, 0.3F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tendons",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.6667F, KeyframeAnimations.scaleVec(1.0, 1.3F, 1.0), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.scaleVec(1.0, 1.3F, 1.0), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .build();
}
