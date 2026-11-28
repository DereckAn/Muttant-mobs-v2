package com.alexander.mutantmore.animation.keyframe_animations.definition;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class LeafblowerKeyframeAnimations {
   public static final AnimationDefinition LEAFBLOWER_SWITCH_SUCK = Builder.withLength(0.3433333F)
      .addAnimation(
         "petal1",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "petal2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(67.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "petal3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(70.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "petal4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(67.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "petals",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.posVec(0.0F, 0.0F, 8.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "flowerNozzle",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 0.0), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "lever",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition LEAFBLOWER_SWITCH_BLOW = Builder.withLength(0.3433333F)
      .addAnimation(
         "petal1",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "petal2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(67.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(67.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "petal3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(70.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(70.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "petal4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(67.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(67.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "petals",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "flowerNozzle",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.0, 1.0, 0.5), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 0.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "lever",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
}
