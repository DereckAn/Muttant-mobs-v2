package com.alexander.mutantmore.animation.keyframe_animations.definition;

import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class MutantFrozenZombieKeyframeAnimations {
   private static float floatMax = Float.MAX_VALUE;
   public static final AnimationDefinition MUTANT_FROZEN_ZOMBIE_ATTACK = Builder.withLength(1.625F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(28.19F, -34.5F, -14.22F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(28.19F, -34.5F, -14.22F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(55.13F, 34.04F, 23.4F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(55.13F, 34.04F, 23.4F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(20.86F, -12.85F, -11.03F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(20.86F, -12.85F, -11.03F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(29.97F, 6.81F, -5.97F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(29.97F, 6.81F, -5.97F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(30.48F, 19.22F, 5.36F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-40.6F, 55.3F, -13.54F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-59.28F, -38.75F, 35.77F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(-46.22F, -21.79F, 10.46F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(-24.71F, -3.72F, -7.34F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-48.77F, -6.17F, -1.28F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-51.7F, 8.83F, 59.61F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(45.63F, 14.28F, 73.45F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(45.63F, 14.28F, 73.45F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "projectile",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.posVec(2.0F, 5.0F, -6.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.posVec(2.0F, 5.0F, -6.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.posVec(2.0F, 6.5F, 2.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(-65.68F, 12.62F, -14.86F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-16.73F, -3.39F, 18.6F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(56.78F, -16.53F, -75.02F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-109.91F, -28.35F, -70.61F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-109.91F, -28.35F, -70.61F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-89.68F, 11.11F, -21.96F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-41.02F, 20.01F, 5.67F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(36.84F, -7.57F, 9.98F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(56.55F, 9.07F, -12.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-60.95F, 9.07F, -12.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-24.01F, 19.96F, -8.52F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-9.98F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "snowBlock",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
      )
      .build();
   public static final AnimationDefinition MUTANT_FROZEN_ZOMBIE_THROW = Builder.withLength(2.125F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(40.75F, -17.47F, -11.35F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(40.75F, -17.47F, -11.35F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(4.8F, 13.05F, 12.61F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(4.8F, 13.05F, 12.61F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(40.96F, -17.95F, -13.02F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.degreeVec(40.96F, -17.95F, -13.02F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(33.37F, -12.85F, -11.03F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(33.37F, -12.85F, -11.03F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(4.55F, 3.45F, 7.85F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(4.55F, 3.45F, 7.85F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(15.32F, -18.31F, 2.04F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(15.32F, -18.31F, 2.04F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-41.15F, 41.72F, -19.79F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-41.15F, 41.72F, -19.79F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(2.14F, 4.47F, -13.64F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(2.64F, 4.03F, -13.57F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-52.33F, 36.94F, -12.2F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-52.33F, 36.94F, -12.2F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(-52.33F, 36.94F, -12.2F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(-106.65F, 24.1F, -0.45F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-106.65F, 24.1F, -0.45F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-266.61F, -8.25F, -20.35F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-266.61F, -8.25F, -20.35F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-205.7F, -6.28F, -15.59F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(-104.46F, 26.97F, -22.08F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-104.46F, 26.97F, -22.08F), Interpolations.CATMULLROM),
               new Keyframe(1.9167666F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-3.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.9167666F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "projectile",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(1.0834333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, -20.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "projectile",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(0.0F, 180.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(0.0F, 180.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(35.0F, 180.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "projectile",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(0.5416766F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(1.1676667F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(1.2083433F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(-80.34F, 0.66F, -8.06F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(-39.08F, 10.02F, -2.52F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(27.25F, -15.93F, -37.35F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(27.25F, -15.93F, -37.35F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-42.07F, -15.75F, -36.93F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(39.99F, -14.27F, -33.42F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(39.99F, -14.27F, -33.42F), Interpolations.CATMULLROM),
               new Keyframe(1.9167666F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-10.09F, 0.03F, 17.91F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-2.57F, -0.31F, 10.42F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(43.54F, -0.36F, 9.28F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(23.18F, -0.38F, 8.92F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(23.18F, -0.38F, 8.92F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(32.98F, -0.4F, 8.5F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(-67.87F, -0.43F, 7.9F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(23.17F, -0.46F, 7.11F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(23.17F, -0.46F, 7.11F), Interpolations.CATMULLROM),
               new Keyframe(1.9583433F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "snowBlock",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
      )
      .build();
   public static final AnimationDefinition MUTANT_FROZEN_ZOMBIE_ROAR = Builder.withLength(6.0F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(43.07F, -9.59F, -1.51F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(43.07F, -9.59F, -1.51F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(5.57F, -9.59F, -1.51F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-6.92F, -9.59F, -1.51F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(5.57F, -9.59F, -1.51F), Interpolations.CATMULLROM),
               new Keyframe(3.7083435F, KeyframeAnimations.degreeVec(45.11F, -5.92F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(5.208343F, KeyframeAnimations.degreeVec(45.11F, -5.92F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(35.13F, 6.09F, 1.19F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(35.13F, 6.09F, 1.19F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(2.63F, 6.09F, 1.19F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(2.09F, 6.3F, -3.84F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(2.9F, 5.97F, 3.7F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(2.09F, 6.3F, -3.84F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(2.9F, 5.97F, 3.7F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(2.09F, 6.3F, -3.84F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(2.9F, 5.97F, 3.7F), Interpolations.CATMULLROM),
               new Keyframe(3.875F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.375F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(23.54F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(23.54F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(8.54F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-51.46F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(-51.46F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(3.7083435F, KeyframeAnimations.degreeVec(11.04F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(4.625F, KeyframeAnimations.degreeVec(11.04F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(5.25F, KeyframeAnimations.degreeVec(33.01F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(5.625F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-84.19F, 10.38F, 26.26F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-84.19F, 10.38F, 26.26F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-15.0F, 60.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-15.0F, 60.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.875F, KeyframeAnimations.degreeVec(-107.01F, 83.5F, 62.02F), Interpolations.CATMULLROM),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(-77.79F, 2.26F, 93.32F), Interpolations.CATMULLROM),
               new Keyframe(5.25F, KeyframeAnimations.degreeVec(-77.79F, 2.26F, 93.32F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-54.73F, -33.53F, -17.9F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-54.73F, -33.53F, -17.9F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(-1.54F, 1.68F, 47.27F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(9.04F, 2.09F, 64.97F), Interpolations.CATMULLROM),
               new Keyframe(5.0F, KeyframeAnimations.degreeVec(-1.54F, 1.68F, 47.27F), Interpolations.CATMULLROM),
               new Keyframe(5.5F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "projectile",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(6.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-98.71F, 3.81F, -34.32F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-98.71F, 3.81F, -34.32F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, -35.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(-147.5F, -35.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(-147.5F, -35.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.5F, KeyframeAnimations.degreeVec(-64.64F, -20.39F, 14.23F), Interpolations.CATMULLROM),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(-123.13F, -8.61F, 18.63F), Interpolations.CATMULLROM),
               new Keyframe(5.25F, KeyframeAnimations.degreeVec(-123.13F, -8.61F, 18.63F), Interpolations.CATMULLROM),
               new Keyframe(5.583433F, KeyframeAnimations.degreeVec(-85.05F, -36.99F, 3.19F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-19.98F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-19.98F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(0.11F, 37.59F, 40.09F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-22.11F, 28.62F, -15.2F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(13.78F, 18.16F, 9.31F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(14.51F, 3.84F, -14.51F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(14.51F, 3.84F, -14.51F), Interpolations.CATMULLROM),
               new Keyframe(1.9167666F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.7916765F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.5F, KeyframeAnimations.degreeVec(-115.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.625F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.875F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.0F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.25F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.5F, KeyframeAnimations.degreeVec(-16.6F, 11.31F, 33.34F), Interpolations.CATMULLROM),
               new Keyframe(5.791677F, KeyframeAnimations.degreeVec(-19.9F, -4.94F, -10.65F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "snowBlock",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
      )
      .build();
   public static final AnimationDefinition MUTANT_FROZEN_ZOMBIE_SNOW_THROW = Builder.withLength(3.125F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(55.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(55.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(23.4F, 13.44F, 8.29F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(23.4F, 13.44F, 8.29F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(9.81F, -25.97F, -7.63F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(9.81F, -25.97F, -7.63F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(17.63F, 6.09F, 1.19F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(30.96F, 17.98F, 5.14F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(30.96F, 17.98F, 5.14F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(20.8F, -1.75F, 2.66F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(20.8F, -1.75F, 2.66F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-21.46F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-21.46F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-21.46F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-78.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(-35.64F, 4.14F, 5.58F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(-15.1F, 32.48F, -9.81F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-24.21F, 29.1F, -8.95F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(-24.21F, 29.1F, -8.95F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.posVec(0.0F, 4.0F, -7.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.posVec(0.0F, 1.0F, -6.0F), Interpolations.CATMULLROM),
               new Keyframe(2.625F, KeyframeAnimations.posVec(0.0F, 1.0F, -6.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(-108.08F, -14.29F, 4.61F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-108.08F, -14.29F, 4.61F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-176.59F, 7.63F, 12.52F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-176.59F, 7.63F, 12.52F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(102.22F, -19.18F, 16.68F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(102.22F, -19.18F, 16.68F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-99.12F, 24.6F, -7.54F), Interpolations.CATMULLROM),
               new Keyframe(2.625F, KeyframeAnimations.degreeVec(-98.36F, 7.3F, -4.79F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "projectile",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(3.125F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(2.0F, 4.0F, -7.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.posVec(2.0F, 4.0F, -7.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.posVec(2.0F, 4.0F, -7.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-108.08F, 14.29F, -4.61F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-108.08F, 14.29F, -4.61F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-173.04F, -2.49F, -11.66F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-173.04F, -2.49F, -11.66F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(15.29F, -12.27F, -15.5F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-20.76F, -29.55F, -11.53F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(-13.26F, -29.55F, -11.53F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-50.42F, 4.58F, -5.5F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(44.58F, 4.58F, -5.5F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(44.58F, 4.58F, -5.5F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(51.68F, -0.53F, 0.31F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-59.98F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-59.98F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(27.52F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(11.9F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(2.0834334F, KeyframeAnimations.degreeVec(46.9F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-67.23F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(2.625F, KeyframeAnimations.degreeVec(22.77F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(2.9167664F, KeyframeAnimations.degreeVec(17.52F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "snowBlock",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.7083434F, KeyframeAnimations.posVec(0.0F, -51.0F, -40.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.posVec(0.0F, 68.0F, -3.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 182.0F, -3.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.posVec(0.0F, 248.0F, -13.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, 248.0F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.posVec(0.0F, 12.0F, -46.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, 22.0F, -124.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "snowBlock",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-400.26F, -31.85F, -689.77F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "snowBlock",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(0.6766666F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(0.7083434F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_FROZEN_ZOMBIE_INTRO = Builder.withLength(2.25F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-4.44F, -2.09F, -1.44F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-4.44F, -2.09F, -1.44F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(45.56F, -2.09F, -1.44F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(45.38F, 5.05F, -8.45F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(44.55F, -10.95F, 7.44F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.degreeVec(45.38F, 5.05F, -8.45F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(44.55F, -10.95F, 7.44F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(2.63F, 6.09F, 1.19F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(2.63F, 6.09F, 1.19F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(34.93F, 1.99F, -1.69F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(33.16F, 11.84F, -16.28F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(33.06F, -12.15F, 19.07F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(33.16F, 11.84F, -16.28F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(33.06F, -12.15F, 19.07F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(10.21F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-71.46F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-91.46F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-73.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-74.68F, -6.85F, 24.69F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(-74.27F, 5.81F, -18.59F), Interpolations.CATMULLROM),
               new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(-74.68F, -6.85F, 24.69F), Interpolations.CATMULLROM),
               new Keyframe(2.0834334F, KeyframeAnimations.degreeVec(-74.27F, 5.81F, -18.59F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-123.77F, 25.03F, 13.07F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(21.57F, 18.45F, 29.39F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(21.57F, 18.45F, 29.39F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-95.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "projectile",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(25.53F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-41.95F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(45.53F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(45.53F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(-66.97F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-52.12F, -23.19F, 3.25F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-88.28F, -24.95F, -24.11F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-34.98F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(15.64F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-47.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(20.02F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(45.02F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(45.02F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(-2.7F, 5.38F, 10.04F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(40.47F, 14.99F, -15.83F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "snowBlock",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_FROZEN_ZOMBIE_NOVELTY = Builder.withLength(3.0F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(23.76F, -16.47F, -4.57F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(23.76F, -16.47F, -4.57F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(20.48F, 11.58F, -0.68F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(20.48F, 11.58F, -0.68F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(18.06F, -20.74F, 1.19F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(18.06F, -20.74F, 1.19F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(19.95F, 20.76F, 3.18F), Interpolations.CATMULLROM),
               new Keyframe(2.625F, KeyframeAnimations.degreeVec(19.95F, 20.76F, 3.18F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(32.45F, -2.35F, -4.19F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(32.45F, -2.35F, -4.19F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(31.66F, 16.41F, -1.21F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(31.66F, 16.41F, -1.21F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(30.18F, -2.41F, -3.81F), Interpolations.CATMULLROM),
               new Keyframe(2.0834334F, KeyframeAnimations.degreeVec(30.18F, -2.41F, -3.81F), Interpolations.CATMULLROM),
               new Keyframe(2.3433335F, KeyframeAnimations.degreeVec(32.68F, 11.96F, 1.56F), Interpolations.CATMULLROM),
               new Keyframe(2.7083435F, KeyframeAnimations.degreeVec(32.68F, 11.96F, 1.56F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-48.29F, -24.22F, 30.35F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-42.25F, -20.72F, 11.27F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-39.36F, -7.43F, -0.49F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-41.06F, -36.44F, 20.74F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-29.59F, -25.06F, -6.07F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(4.36F, 17.68F, 23.43F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-39.19F, 5.6F, 29.65F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(1.69F, 14.58F, 22.73F), Interpolations.CATMULLROM),
               new Keyframe(2.3433335F, KeyframeAnimations.degreeVec(-36.88F, -1.33F, 34.97F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "projectile",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-59.47F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-4.47F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-60.4F, -11.26F, -8.41F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-81.99F, -2.57F, -11.09F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.73F, -2.52F, -16.09F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(12.61F, -4.76F, -6.32F), Interpolations.CATMULLROM),
               new Keyframe(2.4583435F, KeyframeAnimations.degreeVec(-88.82F, -26.87F, 14.73F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(-98.93F, -9.37F, 15.09F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-62.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(27.52F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(52.52F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-72.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(1.9583433F, KeyframeAnimations.degreeVec(27.52F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(2.2916765F, KeyframeAnimations.degreeVec(47.52F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(2.6766665F, KeyframeAnimations.degreeVec(-44.98F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "snowBlock",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
      )
      .build();
   public static final AnimationDefinition MUTANT_FROZEN_ZOMBIE_JUMP = Builder.withLength(0.375F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.posVec(0.0F, -5.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(27.5F, -2.5F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-176.68F, 14.64F, 12.93F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-39.89F, -3.21F, -3.83F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.posVec(0.0F, -2.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(-55.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(77.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.posVec(0.0F, -2.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(-55.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(77.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "projectile",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(27.5F, 2.5F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-219.1F, -0.7F, 4.95F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(64.29F, 2.04F, 2.37F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-57.39F, 3.21F, 3.83F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "snowBlock",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.CATMULLROM)})
      )
      .build();
   public static final AnimationDefinition MUTANT_FROZEN_ZOMBIE_SLAM = Builder.withLength(0.625F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-3.89F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -4.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -4.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-176.68F, 14.64F, 12.93F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-76.93F, -12.51F, 0.04F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-76.93F, -12.51F, 0.04F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-39.89F, -3.21F, -3.83F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-17.11F, -3.73F, -11.94F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-17.11F, -3.73F, -11.94F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "sandBlock",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
      )
      .addAnimation(
         "projectile",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -4.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -4.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-219.1F, -0.7F, 4.95F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(-144.05F, 8.6F, 1.44F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-76.93F, 12.51F, -0.04F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-76.93F, 12.51F, -0.04F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-57.39F, 3.21F, 3.83F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(-99.05F, 3.58F, 9.54F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(-17.11F, 3.73F, 11.94F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-17.11F, 3.73F, 11.94F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "snowBlock",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.CATMULLROM)
            }
         )
      )
      .build();

   public static final AnimationDefinition MUTANT_FROZEN_ZOMBIE_DOWN(float ageInTicks) {
      return Builder.withLength(5.0F)
         .addAnimation(
            "pelvis",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(
                     2.4167664F,
                     KeyframeAnimations.posVec(
                        SineWaveAnimationUtils.getSineWaveKeyframe(
                           0.25F, 5000.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 0.0F
                        ),
                        0.0F,
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     3.5F,
                     KeyframeAnimations.posVec(
                        SineWaveAnimationUtils.getSineWaveKeyframe(
                           0.25F, 5000.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 0.0F
                        ),
                        0.0F,
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "pelvis",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM),
                  new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.6766665F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "body",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.6766665F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "head",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
                  new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-86.7F, 2.4F, 15.84F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-77.02F, -28.43F, 13.63F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-2.02F, -28.43F, 13.63F), Interpolations.CATMULLROM),
                  new Keyframe(0.75F, KeyframeAnimations.degreeVec(-2.02F, -28.43F, 13.63F), Interpolations.LINEAR),
                  new Keyframe(1.75F, KeyframeAnimations.degreeVec(-2.02F, -28.43F, 13.63F), Interpolations.LINEAR),
                  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-36.78F, -3.44F, 12.77F), Interpolations.LINEAR),
                  new Keyframe(4.416767F, KeyframeAnimations.degreeVec(14.61F, 4.36F, -2.48F), Interpolations.CATMULLROM),
                  new Keyframe(4.75F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightArm",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.degreeVec(-220.0F, -2.5F, -20.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-135.0F, -2.5F, -20.0F), Interpolations.LINEAR),
                  new Keyframe(2.5F, KeyframeAnimations.degreeVec(-135.0F, -2.5F, -20.0F), Interpolations.LINEAR),
                  new Keyframe(3.4167664F, KeyframeAnimations.degreeVec(-235.0F, -2.5F, -20.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.6766665F, KeyframeAnimations.degreeVec(-200.0F, -2.5F, -20.0F), Interpolations.CATMULLROM),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(-120.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightArmLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.0F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.6766665F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightLeg",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(4.167667F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(4.676667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
               }
            )
         )
         .addAnimation(
            "rightLegLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
               }
            )
         )
         .addAnimation(
            "leftLeg",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(4.583433F, KeyframeAnimations.posVec(0.0F, 3.0F, 3.0F), Interpolations.LINEAR),
                  new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
               }
            )
         )
         .addAnimation(
            "leftLeg",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.9167664F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(4.583433F, KeyframeAnimations.degreeVec(-77.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
               }
            )
         )
         .addAnimation(
            "leftLegLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
               }
            )
         )
         .addAnimation(
            "everything",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.16766666F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.3433333F, KeyframeAnimations.posVec(0.0F, -7.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.posVec(0.0F, -7.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -8.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.posVec(0.0F, -7.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.6766666F, KeyframeAnimations.posVec(0.0F, -7.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(4.25F, KeyframeAnimations.posVec(0.0F, -7.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "everything",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(75.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(75.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "projectile",
            new AnimationChannel(
               Targets.SCALE,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
                  new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
               }
            )
         )
         .addAnimation(
            "leftArm",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArm",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.degreeVec(55.53F, -5.05F, -11.44F), Interpolations.CATMULLROM),
                  new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-22.75F, -9.26F, -28.56F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-22.75F, -9.26F, -28.56F), Interpolations.LINEAR),
                  new Keyframe(2.5F, KeyframeAnimations.degreeVec(-22.75F, -9.26F, -28.56F), Interpolations.LINEAR),
                  new Keyframe(3.75F, KeyframeAnimations.degreeVec(-22.75F, -9.26F, -28.56F), Interpolations.LINEAR),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(-59.54F, -23.16F, 1.55F), Interpolations.CATMULLROM),
                  new Keyframe(4.75F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArmLower",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArmLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
                  new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(-64.98F, -0.75F, 0.43F), Interpolations.CATMULLROM),
                  new Keyframe(0.375F, KeyframeAnimations.degreeVec(50.21F, -0.75F, 0.43F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(28.12F, -0.75F, 0.43F), Interpolations.CATMULLROM),
                  new Keyframe(0.625F, KeyframeAnimations.degreeVec(28.12F, -0.75F, 0.43F), Interpolations.LINEAR),
                  new Keyframe(3.75F, KeyframeAnimations.degreeVec(28.12F, -0.75F, 0.43F), Interpolations.LINEAR),
                  new Keyframe(4.0F, KeyframeAnimations.degreeVec(65.78F, 28.84F, 6.68F), Interpolations.CATMULLROM),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(85.12F, 27.29F, 12.68F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "snowBlock",
            new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
         )
         .build();
   }

   public static final AnimationDefinition MUTANT_FROZEN_ZOMBIE_ICICLES(float ageInTicks) {
      return Builder.withLength(3.5F)
         .addAnimation(
            "everything",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "everything",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "pelvis",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM),
                  new Keyframe(
                     1.5F,
                     KeyframeAnimations.degreeVec(
                        -19.33F,
                        0.34F,
                        SineWaveAnimationUtils.getSineWaveKeyframe(
                           1.5F, 5000.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 0.0F
                        )
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(1.625F, KeyframeAnimations.degreeVec(45.67F, 0.34F, -2.71F), Interpolations.CATMULLROM),
                  new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(45.67F, 0.34F, -2.71F), Interpolations.CATMULLROM),
                  new Keyframe(2.6766665F, KeyframeAnimations.degreeVec(45.67F, 0.34F, -2.71F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(23.07F, -9.59F, -1.51F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "body",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM),
                  new Keyframe(1.0F, KeyframeAnimations.degreeVec(7.52F, 0.96F, 2.31F), Interpolations.CATMULLROM),
                  new Keyframe(1.5F, KeyframeAnimations.degreeVec(7.52F, 0.96F, 2.31F), Interpolations.CATMULLROM),
                  new Keyframe(1.625F, KeyframeAnimations.degreeVec(-16.28F, 0.96F, 2.31F), Interpolations.CATMULLROM),
                  new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(57.52F, 0.96F, 2.31F), Interpolations.CATMULLROM),
                  new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(57.52F, 0.96F, 2.31F), Interpolations.CATMULLROM),
                  new Keyframe(2.75F, KeyframeAnimations.degreeVec(57.52F, 0.96F, 2.31F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(32.63F, 6.09F, 1.19F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "head",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
                  new Keyframe(1.0F, KeyframeAnimations.degreeVec(-53.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
                  new Keyframe(1.5F, KeyframeAnimations.degreeVec(-53.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
                  new Keyframe(1.625F, KeyframeAnimations.degreeVec(-101.46F, 0.88F, -1.76F), Interpolations.CATMULLROM),
                  new Keyframe(1.75F, KeyframeAnimations.degreeVec(46.04F, 0.88F, -1.76F), Interpolations.CATMULLROM),
                  new Keyframe(1.875F, KeyframeAnimations.degreeVec(46.04F, 0.88F, -1.76F), Interpolations.CATMULLROM),
                  new Keyframe(2.8343334F, KeyframeAnimations.degreeVec(46.04F, 0.88F, -1.76F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightArm",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM),
                  new Keyframe(1.0F, KeyframeAnimations.degreeVec(-215.27F, -8.65F, -28.84F), Interpolations.CATMULLROM),
                  new Keyframe(1.5F, KeyframeAnimations.degreeVec(-215.27F, -8.65F, -28.84F), Interpolations.CATMULLROM),
                  new Keyframe(1.625F, KeyframeAnimations.degreeVec(-222.3F, -19.38F, -11.66F), Interpolations.CATMULLROM),
                  new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(-110.06F, 3.09F, -33.15F), Interpolations.CATMULLROM),
                  new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(-110.06F, 3.09F, -33.15F), Interpolations.CATMULLROM),
                  new Keyframe(2.75F, KeyframeAnimations.degreeVec(-110.06F, 3.09F, -33.15F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(-15.78F, 10.2F, 22.85F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightArmLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.625F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.75F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(2.7916765F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "projectile",
            new AnimationChannel(
               Targets.SCALE,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
                  new Keyframe(3.5F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
               }
            )
         )
         .addAnimation(
            "leftArm",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArm",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM),
                  new Keyframe(1.0F, KeyframeAnimations.degreeVec(-215.29F, 20.2F, 26.01F), Interpolations.CATMULLROM),
                  new Keyframe(1.5F, KeyframeAnimations.degreeVec(-215.29F, 20.2F, 26.01F), Interpolations.CATMULLROM),
                  new Keyframe(1.625F, KeyframeAnimations.degreeVec(-232.44F, 3.55F, 32.8F), Interpolations.CATMULLROM),
                  new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(-111.32F, -0.69F, 34.54F), Interpolations.CATMULLROM),
                  new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(-111.32F, -0.69F, 34.54F), Interpolations.CATMULLROM),
                  new Keyframe(2.75F, KeyframeAnimations.degreeVec(-111.32F, -0.69F, 34.54F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(-36.97F, -5.05F, -11.44F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArmLower",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArmLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
                  new Keyframe(1.5F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
                  new Keyframe(1.625F, KeyframeAnimations.degreeVec(-82.48F, -0.75F, 0.43F), Interpolations.CATMULLROM),
                  new Keyframe(1.75F, KeyframeAnimations.degreeVec(-31.72F, -7.41F, -10.18F), Interpolations.CATMULLROM),
                  new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(-31.72F, -7.41F, -10.18F), Interpolations.CATMULLROM),
                  new Keyframe(2.7916765F, KeyframeAnimations.degreeVec(-31.72F, -7.41F, -10.18F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(-22.48F, -0.75F, 0.43F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightLeg",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
               }
            )
         )
         .addAnimation(
            "rightLegLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
               }
            )
         )
         .addAnimation(
            "leftLeg",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
               }
            )
         )
         .addAnimation(
            "leftLegLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR)
               }
            )
         )
         .addAnimation(
            "snowBlock",
            new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
         )
         .build();
   }
}
