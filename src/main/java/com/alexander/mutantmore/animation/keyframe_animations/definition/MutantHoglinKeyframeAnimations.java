package com.alexander.mutantmore.animation.keyframe_animations.definition;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class MutantHoglinKeyframeAnimations {
   public static final AnimationDefinition MUTANT_HOGLIN_NOVELTY = Builder.withLength(1.5F)
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(-27.41F, -2.31F, -4.44F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-27.41F, 2.31F, 4.44F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-27.41F, -2.31F, -4.44F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-27.41F, 2.31F, 4.44F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-27.41F, -2.31F, -4.44F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-27.41F, 2.31F, 4.44F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "chest",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(32.28F, -4.02F, 6.34F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(32.28F, 4.02F, -6.34F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(32.28F, -4.02F, 6.34F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(32.28F, 4.02F, -6.34F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(32.28F, -4.02F, 6.34F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(32.28F, 4.02F, -6.34F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(32.28F, -4.02F, 6.34F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "neck",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(26.1F, 4.14F, 11.48F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(26.1F, -4.14F, -11.48F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(26.1F, 4.14F, 11.48F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(26.1F, -4.14F, -11.48F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(26.1F, 4.14F, 11.48F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(26.1F, -4.14F, -11.48F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-11.91F, 22.27F, 0.11F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-11.91F, -22.27F, -0.11F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-11.91F, 22.27F, 0.11F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-11.91F, -22.27F, -0.11F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(-11.91F, 22.27F, 0.11F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-15.93F, -2.4F, 10.26F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(21.49F, 15.27F, 37.62F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-69.14F, 67.76F, -71.57F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(21.49F, 15.27F, 37.62F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-69.14F, 67.76F, -71.57F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(21.49F, 15.27F, 37.62F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-69.14F, 67.76F, -71.57F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(49.25F, 78.08F, 48.87F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-69.14F, -67.76F, 71.57F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(21.49F, -15.27F, -37.62F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-69.14F, -67.76F, 71.57F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(21.49F, -15.27F, -37.62F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(-69.14F, -67.76F, 71.57F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(21.49F, -15.27F, -37.62F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(49.25F, -78.08F, -48.87F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "tail",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(161.81F, -13.47F, -35.33F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(161.81F, 13.47F, 35.33F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(161.81F, -13.47F, -35.33F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(161.81F, 13.47F, 35.33F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(161.81F, -13.47F, -35.33F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(161.81F, 13.47F, 35.33F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.posVec(-3.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(-5.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.posVec(-3.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.posVec(-5.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(-3.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.posVec(-5.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.posVec(-3.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(-5.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.5F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -22.5F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.5F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -22.5F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.5F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -22.5F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.5F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -22.5F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLegLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.posVec(-0.5F, 0.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.posVec(-0.5F, 0.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.posVec(0.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(-0.5F, 0.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.posVec(0.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.posVec(-0.5F, 0.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 30.5F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 19.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 30.5F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 19.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 30.5F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 19.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 30.5F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 19.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.posVec(5.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(3.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.posVec(5.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.posVec(3.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(5.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.posVec(3.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.posVec(5.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(3.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 22.5F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 27.5F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 22.5F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 27.5F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 22.5F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 27.5F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 22.5F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 27.5F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLegLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.posVec(-0.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.5F, 0.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.posVec(-0.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.posVec(0.5F, 0.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(-0.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.posVec(0.5F, 0.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.posVec(-0.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.5F, 0.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -19.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -30.5F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -19.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -30.5F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -19.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -30.5F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -19.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -30.5F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_HOGLIN_ATTACK = Builder.withLength(1.125F)
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "chest",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "neck",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-34.82F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-19.82F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-46.17F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-48.67F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(10.1F, 26.79F, 4.82F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(89.2F, -11.82F, 80.15F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(-16.15F, 58.7F, -23.72F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(10.1F, -26.79F, -4.82F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(89.2F, 11.82F, -80.15F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(-16.15F, -58.7F, 23.72F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "tail",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(154.69F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(175.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(150.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(182.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(-4.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(-4.0F, 1.0F, 2.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.posVec(-4.0F, 1.0F, 2.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, -17.5F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, -17.5F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLegLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(0.5F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(-0.5F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.posVec(-0.5F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 12.5F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 12.5F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(4.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(4.0F, 1.0F, 2.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.posVec(4.0F, 1.0F, 2.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 17.5F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 17.5F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLegLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(-0.5F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.5F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.posVec(0.5F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -12.5F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -12.5F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_HOGLIN_STOMP = Builder.withLength(2.5F)
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-34.76F, 4.56F, 5.96F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-34.76F, 4.56F, 5.96F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(-22.59F, -1.79F, -7.64F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-22.59F, -1.79F, -7.64F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-34.76F, 4.56F, 5.96F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-34.76F, 4.56F, 5.96F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(-22.59F, -1.79F, -7.64F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-22.59F, -1.79F, -7.64F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-34.76F, 4.56F, 5.96F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(-34.76F, 4.56F, 5.96F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-22.59F, -1.79F, -7.64F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-22.59F, -1.79F, -7.64F), Interpolations.CATMULLROM),
               new Keyframe(2.4583435F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "chest",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(23.56F, -3.85F, 17.37F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(23.56F, -3.85F, 17.37F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(40.7F, 2.32F, -2.58F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(40.7F, 2.32F, -2.58F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(23.56F, -3.85F, 17.37F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(23.56F, -3.85F, 17.37F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(40.7F, 2.32F, -2.58F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.degreeVec(40.7F, 2.32F, -2.58F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(23.56F, -3.85F, 17.37F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(23.56F, -3.85F, 17.37F), Interpolations.CATMULLROM),
               new Keyframe(1.9583433F, KeyframeAnimations.degreeVec(40.7F, 2.32F, -2.58F), Interpolations.CATMULLROM),
               new Keyframe(2.0834334F, KeyframeAnimations.degreeVec(40.7F, 2.32F, -2.58F), Interpolations.CATMULLROM),
               new Keyframe(2.4167664F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "neck",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(26.62F, -8.52F, -16.5F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(26.62F, -8.52F, -16.5F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(17.17F, 4.95F, 22.94F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(17.17F, 4.95F, 22.94F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(26.62F, -8.52F, -16.5F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(26.62F, -8.52F, -16.5F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(17.17F, 4.95F, 22.94F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(17.17F, 4.95F, 22.94F), Interpolations.CATMULLROM),
               new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(26.62F, -8.52F, -16.5F), Interpolations.CATMULLROM),
               new Keyframe(1.9167666F, KeyframeAnimations.degreeVec(26.62F, -8.52F, -16.5F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(17.17F, 4.95F, 22.94F), Interpolations.CATMULLROM),
               new Keyframe(2.1676664F, KeyframeAnimations.degreeVec(17.17F, 4.95F, 22.94F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-4.91F, -2.31F, -4.44F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-4.91F, -2.31F, -4.44F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-27.41F, -2.31F, -4.44F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-24.92F, -8.67F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-4.91F, -2.31F, -4.44F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-4.91F, -2.31F, -4.44F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-27.41F, -2.31F, -4.44F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-24.92F, -8.67F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(-4.91F, -2.31F, -4.44F), Interpolations.CATMULLROM),
               new Keyframe(1.9167666F, KeyframeAnimations.degreeVec(-4.91F, -2.31F, -4.44F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(-27.41F, -2.31F, -4.44F), Interpolations.CATMULLROM),
               new Keyframe(2.1676664F, KeyframeAnimations.degreeVec(-24.92F, -8.67F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(41.42F, 76.32F, 40.84F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(12.06F, 41.52F, 8.3F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(35.47F, 74.36F, 34.69F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(41.42F, 76.32F, 40.84F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(12.06F, 41.52F, 8.3F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(35.47F, 74.36F, 34.69F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(41.42F, 76.32F, 40.84F), Interpolations.CATMULLROM),
               new Keyframe(1.9167666F, KeyframeAnimations.degreeVec(12.06F, 41.52F, 8.3F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(35.47F, 74.36F, 34.69F), Interpolations.CATMULLROM),
               new Keyframe(2.1676664F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(41.42F, -76.32F, -40.84F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(12.06F, -41.52F, -8.3F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(35.47F, -74.36F, -34.69F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(41.42F, -76.32F, -40.84F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(12.06F, -41.52F, -8.3F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(35.47F, -74.36F, -34.69F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(41.42F, -76.32F, -40.84F), Interpolations.CATMULLROM),
               new Keyframe(1.9167666F, KeyframeAnimations.degreeVec(12.06F, -41.52F, -8.3F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(35.47F, -74.36F, -34.69F), Interpolations.CATMULLROM),
               new Keyframe(2.1676664F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "tail",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(122.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(122.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(180.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(180.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(122.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(122.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(180.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.degreeVec(180.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(122.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(122.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.9583433F, KeyframeAnimations.degreeVec(180.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0834334F, KeyframeAnimations.degreeVec(180.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(-5.0F, 1.0F, 2.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.posVec(-5.0F, 1.0F, 2.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.posVec(-5.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.posVec(-5.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.posVec(-5.0F, 1.0F, 2.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.posVec(-5.0F, 1.0F, 2.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.posVec(-5.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.posVec(-5.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.posVec(-5.0F, 1.0F, 2.0F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.posVec(-5.0F, 1.0F, 2.0F), Interpolations.CATMULLROM),
               new Keyframe(1.9583433F, KeyframeAnimations.posVec(-5.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0834334F, KeyframeAnimations.posVec(-5.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(-2.5F, -0.11F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-2.5F, -0.11F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -30.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -30.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-2.5F, -0.11F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(-2.5F, -0.11F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -30.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -30.0F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(-2.5F, -0.11F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(-2.5F, -0.11F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(1.9583433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -30.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -30.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLegLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(0.0F, -2.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.posVec(0.0F, -2.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, -2.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.posVec(0.0F, -2.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.posVec(0.0F, -2.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.posVec(0.0F, -2.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.9583433F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0834334F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 12.5F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 12.5F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 30.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 30.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 12.5F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 12.5F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 30.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 30.0F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 12.5F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 12.5F), Interpolations.CATMULLROM),
               new Keyframe(1.9583433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 30.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 30.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(3.0F, 12.0F, 7.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(6.0F, 15.0F, 7.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.posVec(2.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(2.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(2.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.posVec(6.0F, 15.0F, 7.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(6.0F, 15.0F, 7.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.posVec(2.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.posVec(2.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(2.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.posVec(4.0F, 13.0F, 7.0F), Interpolations.CATMULLROM),
               new Keyframe(1.7916766F, KeyframeAnimations.posVec(6.0F, 15.0F, 7.0F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.posVec(2.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.9167666F, KeyframeAnimations.posVec(2.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.posVec(2.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.2083435F, KeyframeAnimations.posVec(3.0F, 1.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-9.92F, -1.3F, 15.11F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 22.5F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 22.5F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 22.5F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 7.5F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 7.5F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 7.5F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(-19.96F, -0.87F, 17.58F), Interpolations.CATMULLROM),
               new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(-19.96F, -0.87F, 17.58F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 7.5F), Interpolations.CATMULLROM),
               new Keyframe(1.9167666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 7.5F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 7.5F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLegLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.7916766F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.9167666F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -7.5F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(17.74F, 9.97F, -14.46F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -7.5F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(17.55F, 5.85F, -10.88F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -7.5F), Interpolations.CATMULLROM),
               new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(25.0F, 0.0F, -7.5F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(1.9167666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_HOGLIN_KICK = Builder.withLength(2.25F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.20834334F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4167667F, KeyframeAnimations.posVec(0.0F, 12.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(0.0F, -90.0F, -7.5F), Interpolations.LINEAR),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(5.0F, -180.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-1.0F, -180.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, -180.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, -180.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -9.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 7.0F, 10.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 7.0F, 10.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "chest",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(23.16F, 4.98F, 7.51F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(22.87F, 2.69F, 6.54F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(33.75F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "neck",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(2.41F, 0.65F, -14.99F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(2.41F, -0.65F, 14.99F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(2.41F, 0.65F, -14.99F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-6.76F, 11.09F, 16.42F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-6.76F, 11.09F, 16.42F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(12.06F, 41.52F, 8.3F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(15.31F, 53.67F, 12.68F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-44.3F, 66.95F, -37.91F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-44.3F, 66.95F, -37.91F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(27.34F, 70.08F, 26.16F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(48.38F, 41.3F, 54.62F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-41.35F, 41.84F, -54.41F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(12.47F, 55.06F, 13.52F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(-20.31F, 42.25F, -16.72F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(12.06F, -41.52F, -8.3F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(15.31F, -53.67F, -12.68F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(28.0F, -13.3F, -22.88F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(28.0F, -13.3F, -22.88F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(27.34F, -70.08F, -26.16F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(48.38F, -41.3F, -54.62F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-41.35F, -41.84F, 54.41F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(12.47F, -55.06F, -13.52F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(-20.31F, -42.25F, 16.72F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "tail",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(155.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(165.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(166.94F, 7.44F, 29.15F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(169.27F, 10.55F, 44.01F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(158.44F, -6.61F, -16.24F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(182.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(125.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.posVec(-3.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.posVec(-3.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(-3.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.posVec(-3.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(-4.0F, -3.0F, -8.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.posVec(-4.0F, -3.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(-4.0F, -3.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.5F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -27.5F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(-7.19F, -10.32F, -14.26F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLegLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 30.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 30.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 12.5F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 12.5F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.posVec(3.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.posVec(3.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(3.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.posVec(3.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(4.0F, -3.0F, -8.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.posVec(4.0F, -3.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(4.0F, -3.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 27.5F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 27.5F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(12.6F, 7.32F, 29.13F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLegLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -30.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -30.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -12.5F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -12.5F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftBackLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(0.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -4.0F, -11.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.posVec(0.0F, 0.07F, -9.67F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 2.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.posVec(0.0F, 2.0F, 12.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.posVec(0.0F, 1.12F, -3.4F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftBackLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(12.5F, 0.0F, -15.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(12.5F, 0.0F, -15.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(87.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(87.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(63.75F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightBackLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(0.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -4.0F, -11.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.posVec(0.0F, 0.07F, -9.67F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 2.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.posVec(0.0F, 2.0F, 12.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.posVec(0.0F, 1.12F, -3.4F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightBackLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(12.5F, 0.0F, -15.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(12.5F, 0.0F, -15.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(87.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(87.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(63.75F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_HOGLIN_PREPARE_CHARGE = Builder.withLength(1.75F)
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "chest",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(25.43F, -8.63F, 9.32F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(37.23F, -0.04F, 5.72F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(25.43F, -8.63F, 9.32F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(37.23F, -0.04F, 5.72F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "neck",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(27.07F, 2.37F, -10.03F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(12.23F, -1.13F, -5.67F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(27.07F, 2.37F, -10.03F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(12.23F, -1.13F, -5.67F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(30.91F, 72.26F, 29.93F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(13.75F, 48.83F, 10.68F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(30.91F, 72.26F, 29.93F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(13.75F, 48.83F, 10.68F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(30.91F, -72.26F, -29.93F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(13.75F, -48.83F, -10.68F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(30.91F, -72.26F, -29.93F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(13.75F, -48.83F, -10.68F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "tail",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(-1.0F, -1.0F, 2.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(-2.0F, -3.0F, -4.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(-1.0F, -1.0F, 2.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.posVec(-2.0F, -3.0F, -4.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(4.99F, -0.33F, -17.52F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(4.99F, -0.33F, -17.52F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLegLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.5F, 1.6F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.posVec(0.5F, 1.6F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 22.5F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 15.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 22.5F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 15.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(4.0F, 0.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.posVec(4.0F, -3.5F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(4.0F, 0.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.posVec(4.0F, -3.5F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.posVec(4.0F, 0.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-12.44F, -1.19F, 20.14F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(19.9F, 2.14F, 22.76F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-12.44F, -1.19F, 20.14F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(19.9F, 2.14F, 22.76F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(12.5F, 0.0F, -17.5F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, -17.5F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(7.5F, 0.0F, -17.5F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, -17.5F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, -17.5F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(7.5F, 0.0F, -17.5F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_HOGLIN_DANCE = Builder.withLength(7.0F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(6.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, -89.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(7.0F, KeyframeAnimations.degreeVec(0.0F, 720.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.75F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.25F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.75F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.25F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.5F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.75F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.25F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.5F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.75F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-82.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-82.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "chest",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(56.91F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "neck",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.2916765F, KeyframeAnimations.posVec(2.5F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5416765F, KeyframeAnimations.posVec(0.0F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(2.7916765F, KeyframeAnimations.posVec(-2.5F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0416765F, KeyframeAnimations.posVec(0.0F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(3.2916765F, KeyframeAnimations.posVec(2.5F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(3.5416765F, KeyframeAnimations.posVec(0.0F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(3.7916765F, KeyframeAnimations.posVec(-2.5F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(4.041677F, KeyframeAnimations.posVec(0.0F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(4.291677F, KeyframeAnimations.posVec(2.5F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(4.541677F, KeyframeAnimations.posVec(0.0F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(4.791677F, KeyframeAnimations.posVec(-2.5F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(5.041677F, KeyframeAnimations.posVec(0.0F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(5.291677F, KeyframeAnimations.posVec(2.5F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(5.541677F, KeyframeAnimations.posVec(0.0F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(5.791677F, KeyframeAnimations.posVec(-2.5F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(6.041677F, KeyframeAnimations.posVec(0.0F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(6.291677F, KeyframeAnimations.posVec(2.5F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(6.541677F, KeyframeAnimations.posVec(0.0F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(6.791677F, KeyframeAnimations.posVec(-2.5F, -5.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, -5.0F, -2.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "neck",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(62.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(62.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.2916765F, KeyframeAnimations.degreeVec(72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5416765F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.7916765F, KeyframeAnimations.degreeVec(72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0416765F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.2916765F, KeyframeAnimations.degreeVec(72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.5416765F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.7916765F, KeyframeAnimations.degreeVec(72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.041677F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.291677F, KeyframeAnimations.degreeVec(72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.541677F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.791677F, KeyframeAnimations.degreeVec(72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.041677F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.291677F, KeyframeAnimations.degreeVec(72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.541677F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.791677F, KeyframeAnimations.degreeVec(72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.041677F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.291677F, KeyframeAnimations.degreeVec(72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.541677F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.791677F, KeyframeAnimations.degreeVec(72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(7.0F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-60.16F, 58.31F, -66.21F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-20.04F, 73.84F, -23.03F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-20.04F, 73.84F, -23.03F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-60.16F, -58.31F, 66.21F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-20.04F, -73.84F, 23.03F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-20.04F, -73.84F, 23.03F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "tail",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(177.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(135.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(135.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(-4.0F, 9.7F, 12.08F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(-4.0F, 20.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.posVec(-4.0F, 14.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(2.2916765F, KeyframeAnimations.posVec(-4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5416765F, KeyframeAnimations.posVec(-4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(2.7916765F, KeyframeAnimations.posVec(-4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0416765F, KeyframeAnimations.posVec(-4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(3.2916765F, KeyframeAnimations.posVec(-4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(3.5416765F, KeyframeAnimations.posVec(-4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(3.7916765F, KeyframeAnimations.posVec(-4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(4.041677F, KeyframeAnimations.posVec(-4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(4.291677F, KeyframeAnimations.posVec(-4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(4.541677F, KeyframeAnimations.posVec(-4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(4.791677F, KeyframeAnimations.posVec(-4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(5.041677F, KeyframeAnimations.posVec(-4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(5.291677F, KeyframeAnimations.posVec(-4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(5.541677F, KeyframeAnimations.posVec(-4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(5.791677F, KeyframeAnimations.posVec(-4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(6.041677F, KeyframeAnimations.posVec(-4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(6.291677F, KeyframeAnimations.posVec(-4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(6.541677F, KeyframeAnimations.posVec(-4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(6.791677F, KeyframeAnimations.posVec(-4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(7.0F, KeyframeAnimations.posVec(-4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(7.6F, -1.58F, -27.03F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -90.0F), Interpolations.CATMULLROM),
               new Keyframe(2.2916765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -87.5F), Interpolations.CATMULLROM),
               new Keyframe(2.5416765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -92.5F), Interpolations.CATMULLROM),
               new Keyframe(2.7916765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -87.5F), Interpolations.CATMULLROM),
               new Keyframe(3.0416765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -92.5F), Interpolations.CATMULLROM),
               new Keyframe(3.2916765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -87.5F), Interpolations.CATMULLROM),
               new Keyframe(3.5416765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -92.5F), Interpolations.CATMULLROM),
               new Keyframe(3.7916765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -87.5F), Interpolations.CATMULLROM),
               new Keyframe(4.041677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -92.5F), Interpolations.CATMULLROM),
               new Keyframe(4.291677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -87.5F), Interpolations.CATMULLROM),
               new Keyframe(4.541677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -92.5F), Interpolations.CATMULLROM),
               new Keyframe(4.791677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -87.5F), Interpolations.CATMULLROM),
               new Keyframe(5.041677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -92.5F), Interpolations.CATMULLROM),
               new Keyframe(5.291677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -87.5F), Interpolations.CATMULLROM),
               new Keyframe(5.541677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -92.5F), Interpolations.CATMULLROM),
               new Keyframe(5.791677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -87.5F), Interpolations.CATMULLROM),
               new Keyframe(6.041677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -92.5F), Interpolations.CATMULLROM),
               new Keyframe(6.291677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -87.5F), Interpolations.CATMULLROM),
               new Keyframe(6.541677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -92.5F), Interpolations.CATMULLROM),
               new Keyframe(6.791677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -87.5F), Interpolations.CATMULLROM),
               new Keyframe(7.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -92.5F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(4.0F, 9.7F, 12.08F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(4.0F, 20.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.posVec(4.0F, 14.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(2.2916765F, KeyframeAnimations.posVec(4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5416765F, KeyframeAnimations.posVec(4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(2.7916765F, KeyframeAnimations.posVec(4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0416765F, KeyframeAnimations.posVec(4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(3.2916765F, KeyframeAnimations.posVec(4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(3.5416765F, KeyframeAnimations.posVec(4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(3.7916765F, KeyframeAnimations.posVec(4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(4.041677F, KeyframeAnimations.posVec(4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(4.291677F, KeyframeAnimations.posVec(4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(4.541677F, KeyframeAnimations.posVec(4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(4.791677F, KeyframeAnimations.posVec(4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(5.041677F, KeyframeAnimations.posVec(4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(5.291677F, KeyframeAnimations.posVec(4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(5.541677F, KeyframeAnimations.posVec(4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(5.791677F, KeyframeAnimations.posVec(4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(6.041677F, KeyframeAnimations.posVec(4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(6.291677F, KeyframeAnimations.posVec(4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(6.541677F, KeyframeAnimations.posVec(4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(6.791677F, KeyframeAnimations.posVec(4.0F, 16.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(7.0F, KeyframeAnimations.posVec(4.0F, 12.0F, 31.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(7.6F, 1.58F, 27.03F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 90.0F), Interpolations.CATMULLROM),
               new Keyframe(2.2916765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 87.5F), Interpolations.CATMULLROM),
               new Keyframe(2.5416765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 92.5F), Interpolations.CATMULLROM),
               new Keyframe(2.7916765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 87.5F), Interpolations.CATMULLROM),
               new Keyframe(3.0416765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 92.5F), Interpolations.CATMULLROM),
               new Keyframe(3.2916765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 87.5F), Interpolations.CATMULLROM),
               new Keyframe(3.5416765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 92.5F), Interpolations.CATMULLROM),
               new Keyframe(3.7916765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 87.5F), Interpolations.CATMULLROM),
               new Keyframe(4.041677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 92.5F), Interpolations.CATMULLROM),
               new Keyframe(4.291677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 87.5F), Interpolations.CATMULLROM),
               new Keyframe(4.541677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 92.5F), Interpolations.CATMULLROM),
               new Keyframe(4.791677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 87.5F), Interpolations.CATMULLROM),
               new Keyframe(5.041677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 92.5F), Interpolations.CATMULLROM),
               new Keyframe(5.291677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 87.5F), Interpolations.CATMULLROM),
               new Keyframe(5.541677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 92.5F), Interpolations.CATMULLROM),
               new Keyframe(5.791677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 87.5F), Interpolations.CATMULLROM),
               new Keyframe(6.041677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 92.5F), Interpolations.CATMULLROM),
               new Keyframe(6.291677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 87.5F), Interpolations.CATMULLROM),
               new Keyframe(6.541677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 92.5F), Interpolations.CATMULLROM),
               new Keyframe(6.791677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 87.5F), Interpolations.CATMULLROM),
               new Keyframe(7.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 92.5F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_HOGLIN_DEATH = Builder.withLength(4.0F)
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.posVec(0.0F, -8.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.posVec(0.0F, -8.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-82.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-93.44F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(-93.44F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "chest",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5416766F, KeyframeAnimations.posVec(0.0F, 3.0F, 3.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.0416765F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.1676664F, KeyframeAnimations.posVec(0.0F, -3.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.2916765F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "chest",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(56.91F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0416765F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.1676664F, KeyframeAnimations.degreeVec(-39.4F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.2916765F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.4167664F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "neck",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, -5.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "neck",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(31.89F, 6.38F, 3.95F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(52.84F, -5.52F, -9.71F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(63.93F, 9.09F, 17.89F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(55.15F, -13.69F, -13.41F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(41.08F, 8.29F, 5.22F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(25.82F, -10.6F, -3.59F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(8.09F, 5.9F, -0.59F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-7.84F, -9.91F, 1.36F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-9.0F, 9.15F, -1.62F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-8.5F, -9.07F, 1.2F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(-7.84F, 9.91F, -1.36F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(-7.72F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.1676664F, KeyframeAnimations.degreeVec(-34.42F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.posVec(0.0F, -4.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.posVec(0.0F, -4.0F, -2.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-5.89F, 7.9F, 12.22F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(2.43F, -5.04F, -12.15F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(9.75F, 3.51F, 10.32F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(15.18F, -1.62F, -12.4F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(10.37F, 2.67F, 12.22F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(2.7F, -6.46F, -12.86F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-7.14F, 7.37F, 10.74F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-18.31F, -10.39F, -10.05F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-29.04F, 11.85F, 9.26F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-29.69F, -3.82F, -2.84F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(-28.17F, 2.91F, 2.57F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(-29.76F, -5.94F, -4.58F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-60.16F, 58.31F, -66.21F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-20.04F, 73.84F, -23.03F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(69.25F, 45.23F, 72.76F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(80.74F, -12.02F, 90.97F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(68.35F, -54.96F, 56.78F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(7.1F, -69.05F, 128.04F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-187.14F, -37.03F, 315.39F), Interpolations.CATMULLROM),
               new Keyframe(2.5416765F, KeyframeAnimations.degreeVec(-191.56F, -80.12F, 352.62F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(170.96F, -76.08F, -21.25F), Interpolations.CATMULLROM),
               new Keyframe(3.1676664F, KeyframeAnimations.degreeVec(267.58F, 25.23F, -61.61F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(39.56F, 55.25F, 26.92F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(39.56F, 55.25F, 26.92F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-60.16F, -58.31F, 66.21F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-20.04F, -73.84F, 23.03F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(69.25F, -45.23F, -72.76F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(80.74F, 12.02F, -90.97F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(68.35F, 54.96F, -56.78F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(7.1F, 69.05F, -128.04F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-187.14F, 37.03F, -315.39F), Interpolations.CATMULLROM),
               new Keyframe(2.5416765F, KeyframeAnimations.degreeVec(-191.56F, 80.12F, -352.62F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(170.96F, 76.08F, 21.25F), Interpolations.CATMULLROM),
               new Keyframe(3.1676664F, KeyframeAnimations.degreeVec(267.58F, -25.23F, 61.61F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(39.56F, -55.25F, -26.92F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(39.56F, -55.25F, -26.92F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "tail",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(177.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(135.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(147.18F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(152.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(62.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(-4.0F, 9.7F, 12.08F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(-4.0F, 20.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.posVec(-4.0F, 19.64F, 44.18F), Interpolations.CATMULLROM),
               new Keyframe(2.3433335F, KeyframeAnimations.posVec(-4.06F, 19.41F, 51.73F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.posVec(-4.0F, 18.0F, 47.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.posVec(-3.0F, 8.0F, 11.5F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.posVec(-2.0F, -34.0F, -6.0F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.posVec(-2.0F, -34.0F, -6.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(7.6F, -1.58F, -27.03F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(7.6F, -1.58F, -27.03F), Interpolations.CATMULLROM),
               new Keyframe(3.0834334F, KeyframeAnimations.degreeVec(7.6F, -1.58F, -27.03F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(-69.44F, -3.17F, -11.97F), Interpolations.CATMULLROM),
               new Keyframe(3.3433335F, KeyframeAnimations.degreeVec(-69.9F, -3.85F, -5.63F), Interpolations.CATMULLROM),
               new Keyframe(3.4583435F, KeyframeAnimations.degreeVec(-69.9F, -3.85F, -5.63F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(-14.71F, -6.94F, -6.6F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(-14.71F, -6.94F, -6.6F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(4.0F, 9.7F, 12.08F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(4.0F, 20.0F, 31.0F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.posVec(4.0F, 19.64F, 44.18F), Interpolations.CATMULLROM),
               new Keyframe(2.3433335F, KeyframeAnimations.posVec(4.06F, 19.41F, 51.73F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.posVec(4.0F, 18.0F, 47.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.posVec(3.0F, 8.0F, 11.5F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.posVec(2.0F, -34.0F, -6.0F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.posVec(2.0F, -34.0F, -6.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(7.6F, 1.58F, 27.03F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(7.6F, 1.58F, 27.03F), Interpolations.CATMULLROM),
               new Keyframe(3.0834334F, KeyframeAnimations.degreeVec(7.6F, 1.58F, 27.03F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(-69.44F, 3.17F, 11.97F), Interpolations.CATMULLROM),
               new Keyframe(3.3433335F, KeyframeAnimations.degreeVec(-69.9F, 3.85F, 5.63F), Interpolations.CATMULLROM),
               new Keyframe(3.4583435F, KeyframeAnimations.degreeVec(-69.9F, 3.85F, 5.63F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(-14.71F, 6.94F, 6.6F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(-14.71F, 6.94F, 6.6F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.2083435F, KeyframeAnimations.posVec(0.0F, 0.0F, -16.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftBackLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.posVec(0.0F, -15.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftBackLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(85.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightBackLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.posVec(0.0F, -15.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightBackLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(85.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_HOGLIN_INTRO = Builder.withLength(1.4167666F)
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-37.5F, -0.79F, 0.61F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-37.5F, 0.79F, -0.61F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-37.5F, -0.79F, 0.61F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-37.5F, 0.79F, -0.61F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-37.5F, -0.79F, 0.61F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-37.5F, 0.79F, -0.61F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-37.5F, -0.79F, 0.61F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-37.5F, 0.79F, -0.61F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "chest",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(17.52F, 2.38F, 0.75F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(17.52F, -2.38F, -0.75F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(17.52F, 2.38F, 0.75F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(17.52F, -2.38F, -0.75F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(17.52F, 2.38F, 0.75F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(17.52F, -2.38F, -0.75F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(17.52F, 2.38F, 0.75F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(17.52F, -2.38F, -0.75F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "neck",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(15.35F, 12.07F, 3.28F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(15.35F, -12.07F, -3.28F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(15.35F, 12.07F, 3.28F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(15.35F, -12.07F, -3.28F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(15.35F, 12.07F, 3.28F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(15.35F, -12.07F, -3.28F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(15.35F, 12.07F, 3.28F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(15.35F, -12.07F, -3.28F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(4.99F, 0.45F, 0.12F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-15.35F, 12.07F, 3.28F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-15.35F, -12.07F, -3.28F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-15.35F, 12.07F, 3.28F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-15.35F, -12.07F, -3.28F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(-15.35F, 12.07F, 3.28F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-15.35F, -12.07F, -3.28F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(-15.35F, 12.07F, 3.28F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(12.06F, 41.52F, 8.3F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(28.06F, 70.47F, 26.92F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(12.06F, 41.52F, 8.3F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(28.06F, 70.47F, 26.92F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(12.06F, 41.52F, 8.3F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(28.06F, 70.47F, 26.92F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(12.06F, 41.52F, 8.3F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(28.06F, 70.47F, 26.92F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(11.63F, 39.07F, 7.63F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(17.41F, 58.47F, 15.2F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightEar",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(28.06F, -70.47F, -26.92F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(12.06F, -41.52F, -8.3F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(28.06F, -70.47F, -26.92F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(12.06F, -41.52F, -8.3F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(28.06F, -70.47F, -26.92F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(12.06F, -41.52F, -8.3F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(28.06F, -70.47F, -26.92F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(12.06F, -41.52F, -8.3F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(28.06F, -70.47F, -26.92F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(11.63F, -39.07F, -7.63F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(17.41F, -58.47F, -15.2F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "tail",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(158.73F, 7.52F, 18.59F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(158.73F, -7.52F, -18.59F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(158.73F, 7.52F, 18.59F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(158.73F, -7.52F, -18.59F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(158.73F, 7.52F, 18.59F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(158.73F, -7.52F, -18.59F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(158.73F, 7.52F, 18.59F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(158.73F, -7.52F, -18.59F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(172.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(157.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.posVec(-4.0F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(-3.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.posVec(-4.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(-3.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(-4.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(-3.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(-4.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(-3.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.posVec(-4.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.posVec(-4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-9.82F, 1.62F, -12.6F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-9.82F, 1.62F, -12.6F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLegLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(1.31F, 0.3F, 2.62F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(1.32F, 0.28F, 3.62F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(1.3F, 0.32F, 1.62F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(1.32F, 0.28F, 3.62F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(1.3F, 0.32F, 1.62F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(1.32F, 0.28F, 3.62F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(1.3F, 0.32F, 1.62F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(1.32F, 0.28F, 3.62F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(1.3F, 0.32F, 1.62F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.posVec(4.0F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(4.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.posVec(3.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(4.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(3.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(4.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(3.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(4.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.posVec(3.5F, 0.0F, 8.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.posVec(4.0F, -3.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-9.82F, -1.62F, 12.6F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-9.82F, -1.62F, 12.6F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLegLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightFrontLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(1.31F, -0.3F, -2.62F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(1.3F, -0.32F, -1.62F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(1.32F, -0.28F, -3.62F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(1.3F, -0.32F, -1.62F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(1.32F, -0.28F, -3.62F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(1.3F, -0.32F, -1.62F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(1.32F, -0.28F, -3.62F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(1.3F, -0.32F, -1.62F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(1.32F, -0.28F, -3.62F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
}
