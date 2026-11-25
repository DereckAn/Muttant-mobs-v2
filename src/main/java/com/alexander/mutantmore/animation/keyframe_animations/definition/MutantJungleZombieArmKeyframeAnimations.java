package com.alexander.mutantmore.animation.keyframe_animations.definition;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class MutantJungleZombieArmKeyframeAnimations {
   public static final AnimationDefinition MUTANT_JUNGLE_ZOMBIE_ARM_GRAB = Builder.withLength(0.375F)
      .addAnimation(
         "vine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-27.99F, 10.91F, 14.42F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-27.99F, 10.91F, 14.42F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-30.09F, -4.77F, -28.6F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-30.09F, -4.77F, -28.6F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(16.48F, 9.63F, -25.89F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(16.48F, 9.63F, -25.89F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine5",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(64.27F, 11.05F, 72.88F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(64.27F, 11.05F, 72.88F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_JUNGLE_ZOMBIE_ARM_RELEASE = Builder.withLength(0.375F)
      .addAnimation(
         "vine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.99F, 10.91F, 14.42F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-30.09F, -4.77F, -28.6F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(16.48F, 9.63F, -25.89F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine5",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(64.27F, 11.05F, 72.88F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(62.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(62.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
}
