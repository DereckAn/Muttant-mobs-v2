package com.alexander.mutantmore.animation.keyframe_animations.definition;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class SentryVineKeyframeAnimations {
   public static final AnimationDefinition SENTRY_VINE_ATTACK = Builder.withLength(2.0F)
      .addAnimation(
         "vine1",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(37.06F, 24.62F, 3.01F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(198.84F, 70.65F, 158.33F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(72.74F, 60.44F, 6.72F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(60.37F, -5.79F, -10.06F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(94.16F, -61.55F, -34.18F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(87.54F, -66.07F, -35.69F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(76.66F, -61.55F, -34.18F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(76.66F, -61.55F, -34.18F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(7.44F, 0.98F, -7.44F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.08F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(7.3F, -12.54F, 23.54F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(62.58F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(67.41F, 5.34F, 3.48F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(67.41F, 5.34F, 3.48F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(28.12F, 30.01F, -33.28F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(22.31F, 26.14F, -23.66F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(64.84F, -15.04F, 30.17F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(64.84F, -15.04F, 30.17F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(15.08F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(15.08F, 4.62F, 1.92F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine2",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.5834334F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.scaleVec(2.0, 2.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(27.59F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(-21.5F, 8.93F, 32.68F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-9.91F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-14.98F, 5.08F, 21.21F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-10.7F, 3.28F, 11.35F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-10.33F, -4.32F, -27.95F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-10.19F, 4.64F, 18.75F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-10.19F, 4.64F, 18.75F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(25.22F, -32.8F, -12.05F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(25.22F, -32.8F, -12.05F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(27.59F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(27.59F, -4.33F, -2.5F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(27.59F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(-24.48F, 6.01F, 7.23F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(-14.36F, -37.76F, 8.83F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-6.9F, 5.63F, 30.21F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-9.28F, 5.26F, 9.97F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-5.65F, 1.97F, -22.3F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.13F, 5.5F, 25.18F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.13F, 5.5F, 25.18F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(27.59F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(1.9167666F, KeyframeAnimations.degreeVec(27.59F, 4.33F, 2.5F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine5",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.4F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-32.45F, 8.54F, 24.31F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(2.4F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-0.45F, -8.2F, 19.3F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(5.5F, -6.1F, -26.03F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-2.14F, -7.07F, -9.54F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(4.15F, -8.82F, 21.8F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(4.15F, -8.82F, 21.8F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(37.4F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(1.9583433F, KeyframeAnimations.degreeVec(37.4F, -7.85F, -0.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine6",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.41F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-22.5F, 6.39F, 4.91F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-10.09F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-18.67F, 2.49F, 10.41F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-3.99F, 2.74F, 20.69F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(-5.49F, 0.89F, -24.3F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-3.26F, 4.51F, 20.61F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-3.26F, 4.51F, 20.61F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(42.41F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(42.41F, 2.5F, -4.33F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition SENTRY_VINE_TRY_SLAM = Builder.withLength(2.0834334F)
      .addAnimation(
         "vine1",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(62.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(68.29F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(67.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.08F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-12.42F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-12.42F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(-12.14F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(20.08F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(10.08F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(25.08F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(15.08F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(1.9167666F, KeyframeAnimations.degreeVec(15.08F, 4.62F, 1.92F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine2",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.75F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.7916766F, KeyframeAnimations.scaleVec(1.0, 1.5, 1.0), Interpolations.LINEAR),
               new Keyframe(1.2083433F, KeyframeAnimations.scaleVec(1.0, 1.5, 1.0), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "vine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(27.59F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-17.41F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(-17.41F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(-4.91F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(24.32F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(2.59F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(27.59F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(1.9583433F, KeyframeAnimations.degreeVec(27.59F, -4.33F, -2.5F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(27.59F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.41F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-12.41F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(10.4F, 2.56F, 12.34F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-9.54F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-4.91F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(27.59F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(27.59F, 4.33F, 2.5F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine5",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.4F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-25.1F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(-25.1F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(1.34F, -8.16F, -28.67F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-19.22F, -1.46F, 18.13F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-0.1F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(37.4F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(37.4F, -7.85F, -0.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine6",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.41F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-22.59F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-22.59F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-7.59F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(34.44F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-0.09F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(42.41F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(2.0834334F, KeyframeAnimations.degreeVec(42.41F, 2.5F, -4.33F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition SENTRY_VINE_SLAM = Builder.withLength(1.8343333F)
      .addAnimation(
         "vine1",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(67.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(-26.94F, 5.74F, 11.13F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(-26.94F, 5.74F, 11.13F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(44.6F, 17.45F, 2.31F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(44.6F, 17.45F, 2.31F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-54.84F, 75.45F, -31.81F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-54.84F, 75.45F, -31.81F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(25.08F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(8.28F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-39.92F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-39.92F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-39.92F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(29.63F, 6.72F, -2.64F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(29.63F, 6.72F, -2.64F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(37.86F, -8.21F, -7.81F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-54.64F, -8.21F, -7.81F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(-54.64F, -8.21F, -7.81F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(15.08F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(15.08F, 4.62F, 1.92F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine2",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.5, 1.0), Interpolations.LINEAR),
               new Keyframe(0.041676663F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "vine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.59F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(13.22F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-37.41F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-37.41F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-35.29F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(45.09F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(45.09F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(45.09F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-49.91F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(-49.91F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-49.91F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(27.59F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(27.59F, -4.33F, -2.5F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-4.91F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(21.65F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-24.91F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-24.91F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-32.41F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(0.09F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.09F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(34.39F, -8.6F, 20.96F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(14.39F, -8.6F, 20.96F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(14.39F, -8.6F, 20.96F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-19.28F, 4.17F, 48.86F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(27.59F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(27.59F, 4.33F, 2.5F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine5",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.1F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(17.4F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(17.4F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-7.6F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-27.6F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-27.6F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(18.16F, -11.29F, 24.22F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(20.99F, 3.56F, -15.81F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(20.99F, 3.56F, -15.81F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-76.54F, 31.55F, -3.68F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.degreeVec(37.4F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(37.4F, -7.85F, -0.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine6",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.09F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(29.91F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(29.91F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-12.59F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(10.73F, 5.15F, 7.91F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(20.73F, 5.15F, 7.91F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(20.73F, 5.15F, 7.91F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-3.69F, -8.2F, 28.82F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(42.41F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(42.41F, 2.5F, -4.33F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition SENTRY_VINE_DEPLOY = Builder.withLength(1.0F)
      .addAnimation(
         "vine1",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -105.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine1",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine1",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.scaleVec(1.1F, 1.3F, 1.1F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(15.08F, 4.62F, 1.92F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(15.08F, 4.62F, 1.92F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(27.59F, -4.33F, -2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(27.59F, -4.33F, -2.5F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(27.59F, 4.33F, 2.5F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(27.59F, 4.33F, 2.5F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine5",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(37.4F, -7.85F, -0.9F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(37.4F, -7.85F, -0.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vine6",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(42.41F, 2.5F, -4.33F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(42.41F, 2.5F, -4.33F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
}
