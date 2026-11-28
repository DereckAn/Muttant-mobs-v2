package com.alexander.mutantmore.animation.keyframe_animations.definition;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class WitherBombKeyframeAnimations {
   public static final AnimationDefinition ACTIVATE = Builder.withLength(3.375F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(2.35F, -2.5F, -1.98F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.degreeVec(2.34F, -2.21F, -2.44F), Interpolations.LINEAR),
               new Keyframe(0.8333F, KeyframeAnimations.degreeVec(1.14F, -1.27F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-0.66F, 0.06F, 1.23F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.degreeVec(-2.15F, 1.38F, 2.54F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.degreeVec(-2.56F, 2.32F, 1.89F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-1.67F, 2.59F, -0.23F), Interpolations.LINEAR),
               new Keyframe(1.0417F, KeyframeAnimations.degreeVec(0.08F, 2.1F, -2.19F), Interpolations.LINEAR),
               new Keyframe(1.0833F, KeyframeAnimations.degreeVec(1.8F, 1.0F, -2.48F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(2.62F, -0.4F, -0.85F), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.degreeVec(2.12F, -1.7F, 1.45F), Interpolations.LINEAR),
               new Keyframe(1.2083F, KeyframeAnimations.degreeVec(0.54F, -2.51F, 2.64F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-1.33F, -2.59F, 1.79F), Interpolations.LINEAR),
               new Keyframe(1.2917F, KeyframeAnimations.degreeVec(-2.53F, -1.92F, -0.44F), Interpolations.LINEAR),
               new Keyframe(1.3333F, KeyframeAnimations.degreeVec(-2.45F, -0.69F, -2.35F), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-1.13F, 0.75F, -2.45F), Interpolations.LINEAR),
               new Keyframe(1.4167F, KeyframeAnimations.degreeVec(0.77F, 1.97F, -0.66F), Interpolations.LINEAR),
               new Keyframe(1.4583F, KeyframeAnimations.degreeVec(2.28F, 2.63F, 1.65F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(2.64F, 2.52F, 2.68F), Interpolations.LINEAR),
               new Keyframe(1.5417F, KeyframeAnimations.degreeVec(1.66F, 1.68F, 1.65F), Interpolations.LINEAR),
               new Keyframe(1.5833F, KeyframeAnimations.degreeVec(-0.16F, 0.35F, -0.66F), Interpolations.LINEAR),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-1.9F, -1.08F, -2.46F), Interpolations.LINEAR),
               new Keyframe(1.6667F, KeyframeAnimations.degreeVec(-2.68F, -2.2F, -2.36F), Interpolations.LINEAR),
               new Keyframe(1.7083F, KeyframeAnimations.degreeVec(-2.11F, -2.68F, -0.45F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-0.47F, -2.38F, 1.81F), Interpolations.LINEAR),
               new Keyframe(1.7917F, KeyframeAnimations.degreeVec(1.41F, -1.39F, 2.67F), Interpolations.LINEAR),
               new Keyframe(1.8333F, KeyframeAnimations.degreeVec(2.57F, 0.0F, 1.47F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(2.42F, 1.39F, -0.86F), Interpolations.LINEAR),
               new Keyframe(1.9167F, KeyframeAnimations.degreeVec(1.06F, 2.37F, -2.52F), Interpolations.LINEAR),
               new Keyframe(1.9583F, KeyframeAnimations.degreeVec(-0.84F, 2.66F, -2.24F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-2.31F, 2.18F, -0.23F), Interpolations.LINEAR),
               new Keyframe(2.0417F, KeyframeAnimations.degreeVec(-2.6F, 1.07F, 1.95F), Interpolations.LINEAR),
               new Keyframe(2.0833F, KeyframeAnimations.degreeVec(-1.58F, -0.35F, 2.62F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(0.23F, -1.66F, 1.27F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.degreeVec(1.92F, -2.48F, -1.05F), Interpolations.LINEAR),
               new Keyframe(2.2083F, KeyframeAnimations.degreeVec(2.64F, -2.59F, -2.55F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(2.02F, -1.94F, -2.09F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.degreeVec(0.38F, -0.73F, -0.02F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.degreeVec(-1.44F, 0.68F, 2.05F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(-2.52F, 1.89F, 2.54F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.degreeVec(-2.33F, 2.54F, 1.07F), Interpolations.LINEAR),
               new Keyframe(2.4583F, KeyframeAnimations.degreeVec(-0.96F, 2.46F, -1.22F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.89F, 1.67F, -2.55F), Interpolations.LINEAR),
               new Keyframe(2.5417F, KeyframeAnimations.degreeVec(2.28F, 0.39F, -1.92F), Interpolations.LINEAR),
               new Keyframe(2.5833F, KeyframeAnimations.degreeVec(2.51F, -0.99F, 0.19F), Interpolations.LINEAR),
               new Keyframe(2.625F, KeyframeAnimations.degreeVec(1.48F, -2.07F, 2.14F), Interpolations.LINEAR),
               new Keyframe(2.6667F, KeyframeAnimations.degreeVec(-0.3F, -2.56F, 2.44F), Interpolations.LINEAR),
               new Keyframe(2.7083F, KeyframeAnimations.degreeVec(-1.91F, -2.3F, 0.86F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(-2.55F, -1.37F, -1.37F), Interpolations.LINEAR),
               new Keyframe(2.7917F, KeyframeAnimations.degreeVec(-1.9F, -0.06F, -2.54F), Interpolations.LINEAR),
               new Keyframe(2.8333F, KeyframeAnimations.degreeVec(-0.3F, 1.27F, -1.74F), Interpolations.LINEAR),
               new Keyframe(2.875F, KeyframeAnimations.degreeVec(1.45F, 2.22F, 0.39F), Interpolations.LINEAR),
               new Keyframe(2.9167F, KeyframeAnimations.degreeVec(2.46F, 2.53F, 2.21F), Interpolations.LINEAR),
               new Keyframe(2.9583F, KeyframeAnimations.degreeVec(2.22F, 2.1F, 2.33F), Interpolations.LINEAR),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.86F, 1.07F, 0.65F), Interpolations.LINEAR),
               new Keyframe(3.0417F, KeyframeAnimations.degreeVec(-0.93F, -0.27F, -1.52F), Interpolations.LINEAR),
               new Keyframe(3.0833F, KeyframeAnimations.degreeVec(-2.25F, -1.53F, -2.51F), Interpolations.LINEAR),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(-2.42F, -2.34F, -1.57F), Interpolations.LINEAR),
               new Keyframe(3.1667F, KeyframeAnimations.degreeVec(-1.38F, -2.47F, 0.58F), Interpolations.LINEAR),
               new Keyframe(3.2083F, KeyframeAnimations.degreeVec(0.36F, -1.88F, 2.28F), Interpolations.LINEAR),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(1.92F, -0.75F, 2.22F), Interpolations.LINEAR),
               new Keyframe(3.2917F, KeyframeAnimations.degreeVec(2.5F, 0.59F, 0.45F), Interpolations.LINEAR),
               new Keyframe(3.3333F, KeyframeAnimations.degreeVec(1.82F, 1.77F, -1.66F), Interpolations.LINEAR),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(0.22F, 2.43F, -2.49F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 2.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 2.08F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 1.8F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.8333F, KeyframeAnimations.posVec(0.0F, 1.75F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 1.95F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.posVec(0.0F, 2.3F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.posVec(0.0F, 2.63F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 2.76F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0417F, KeyframeAnimations.posVec(0.0F, 2.62F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0833F, KeyframeAnimations.posVec(0.0F, 2.29F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 1.92F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.posVec(0.0F, 1.7F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.2083F, KeyframeAnimations.posVec(0.0F, 1.74F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 2.03F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.2917F, KeyframeAnimations.posVec(0.0F, 2.41F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.3333F, KeyframeAnimations.posVec(0.0F, 2.7F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.posVec(0.0F, 2.74F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.4167F, KeyframeAnimations.posVec(0.0F, 2.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.4583F, KeyframeAnimations.posVec(0.0F, 2.12F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 1.77F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5417F, KeyframeAnimations.posVec(0.0F, 1.63F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5833F, KeyframeAnimations.posVec(0.0F, 1.78F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.625F, KeyframeAnimations.posVec(0.0F, 2.14F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.6667F, KeyframeAnimations.posVec(0.0F, 2.52F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.7083F, KeyframeAnimations.posVec(0.0F, 2.73F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, 2.66F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.7917F, KeyframeAnimations.posVec(0.0F, 2.35F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.8333F, KeyframeAnimations.posVec(0.0F, 1.95F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, 1.66F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.9167F, KeyframeAnimations.posVec(0.0F, 1.63F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.9583F, KeyframeAnimations.posVec(0.0F, 1.87F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 2.27F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0417F, KeyframeAnimations.posVec(0.0F, 2.61F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0833F, KeyframeAnimations.posVec(0.0F, 2.73F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.posVec(0.0F, 2.56F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.posVec(0.0F, 2.2F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2083F, KeyframeAnimations.posVec(0.0F, 1.82F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, 1.62F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, 1.7F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.posVec(0.0F, 2.01F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.posVec(0.0F, 2.4F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.posVec(0.0F, 2.68F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4583F, KeyframeAnimations.posVec(0.0F, 2.69F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 2.45F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5417F, KeyframeAnimations.posVec(0.0F, 2.07F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5833F, KeyframeAnimations.posVec(0.0F, 1.75F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.625F, KeyframeAnimations.posVec(0.0F, 1.66F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.6667F, KeyframeAnimations.posVec(0.0F, 1.83F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.7083F, KeyframeAnimations.posVec(0.0F, 2.18F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, 2.54F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.7917F, KeyframeAnimations.posVec(0.0F, 2.73F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.8333F, KeyframeAnimations.posVec(0.0F, 2.65F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.875F, KeyframeAnimations.posVec(0.0F, 2.36F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.9167F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.9583F, KeyframeAnimations.posVec(0.0F, 1.77F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 1.78F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.1667F, KeyframeAnimations.posVec(0.0F, 3.25F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.2917F, KeyframeAnimations.posVec(0.0F, 1.25F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(3.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(3.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7917F, KeyframeAnimations.degreeVec(-46.38F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.8333F, KeyframeAnimations.degreeVec(-47.22F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-47.46F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.degreeVec(-47.03F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.degreeVec(-45.98F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-44.43F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0417F, KeyframeAnimations.degreeVec(-42.58F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0833F, KeyframeAnimations.degreeVec(-40.67F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-38.94F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.degreeVec(-37.62F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.2083F, KeyframeAnimations.degreeVec(-36.89F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-36.83F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.2917F, KeyframeAnimations.degreeVec(-37.46F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.3333F, KeyframeAnimations.degreeVec(-38.7F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-40.39F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.4167F, KeyframeAnimations.degreeVec(-42.29F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.4583F, KeyframeAnimations.degreeVec(-44.16F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-45.75F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5417F, KeyframeAnimations.degreeVec(-46.85F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5833F, KeyframeAnimations.degreeVec(-47.31F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-47.07F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.6667F, KeyframeAnimations.degreeVec(-46.16F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.7083F, KeyframeAnimations.degreeVec(-44.7F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-42.88F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.7917F, KeyframeAnimations.degreeVec(-40.95F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.8333F, KeyframeAnimations.degreeVec(-39.15F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(-37.72F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.9167F, KeyframeAnimations.degreeVec(-36.86F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.9583F, KeyframeAnimations.degreeVec(-36.67F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-37.17F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0417F, KeyframeAnimations.degreeVec(-38.31F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0833F, KeyframeAnimations.degreeVec(-39.93F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-41.82F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.degreeVec(-43.73F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2083F, KeyframeAnimations.degreeVec(-45.42F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-46.66F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.degreeVec(-47.31F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.degreeVec(-47.27F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(-46.57F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.degreeVec(-45.29F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4583F, KeyframeAnimations.degreeVec(-43.61F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-41.76F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5417F, KeyframeAnimations.degreeVec(-39.98F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5833F, KeyframeAnimations.degreeVec(-38.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.625F, KeyframeAnimations.degreeVec(-37.52F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.6667F, KeyframeAnimations.degreeVec(-37.16F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.7083F, KeyframeAnimations.degreeVec(-37.48F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(-38.42F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.7917F, KeyframeAnimations.degreeVec(-39.87F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.8333F, KeyframeAnimations.degreeVec(-41.63F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.875F, KeyframeAnimations.degreeVec(-43.49F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.9167F, KeyframeAnimations.degreeVec(-45.19F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.9583F, KeyframeAnimations.degreeVec(-46.52F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(-47.31F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.0417F, KeyframeAnimations.degreeVec(-47.46F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.0833F, KeyframeAnimations.degreeVec(-46.95F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(-45.86F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.1667F, KeyframeAnimations.degreeVec(-44.33F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.2083F, KeyframeAnimations.degreeVec(-42.56F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(-40.78F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.2917F, KeyframeAnimations.degreeVec(-39.23F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.3333F, KeyframeAnimations.degreeVec(-38.1F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(-37.54F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "jaw",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(0.6667F, KeyframeAnimations.scaleVec(0.938F, 0.938F, 0.938F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.scaleVec(0.9135F, 0.9135F, 0.9135F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.scaleVec(0.9001F, 0.9001F, 0.9001F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.scaleVec(0.8997F, 0.8997F, 0.8997F), Interpolations.LINEAR),
               new Keyframe(0.8333F, KeyframeAnimations.scaleVec(0.9126F, 0.9126F, 0.9126F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.scaleVec(0.9371F, 0.9371F, 0.9371F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.scaleVec(0.9702F, 0.9702F, 0.9702F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.scaleVec(1.0076F, 1.0076F, 1.0076F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0443F, 1.0443F, 1.0443F), Interpolations.LINEAR),
               new Keyframe(1.0417F, KeyframeAnimations.scaleVec(1.0754F, 1.0754F, 1.0754F), Interpolations.LINEAR),
               new Keyframe(1.0833F, KeyframeAnimations.scaleVec(1.0969F, 1.0969F, 1.0969F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.scaleVec(1.1057F, 1.1057F, 1.1057F), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.scaleVec(1.1007F, 1.1007F, 1.1007F), Interpolations.LINEAR),
               new Keyframe(1.2083F, KeyframeAnimations.scaleVec(1.0825F, 1.0825F, 1.0825F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.scaleVec(1.0533F, 1.0533F, 1.0533F), Interpolations.LINEAR),
               new Keyframe(1.2917F, KeyframeAnimations.scaleVec(1.017F, 1.017F, 1.017F), Interpolations.LINEAR),
               new Keyframe(1.3333F, KeyframeAnimations.scaleVec(0.9784F, 0.9784F, 0.9784F), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.scaleVec(0.9424F, 0.9424F, 0.9424F), Interpolations.LINEAR),
               new Keyframe(1.4167F, KeyframeAnimations.scaleVec(0.914F, 0.914F, 0.914F), Interpolations.LINEAR),
               new Keyframe(1.4583F, KeyframeAnimations.scaleVec(0.8968F, 0.8968F, 0.8968F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.scaleVec(0.893F, 0.893F, 0.893F), Interpolations.LINEAR),
               new Keyframe(1.5417F, KeyframeAnimations.scaleVec(0.9033F, 0.9033F, 0.9033F), Interpolations.LINEAR),
               new Keyframe(1.5833F, KeyframeAnimations.scaleVec(0.9263F, 0.9263F, 0.9263F), Interpolations.LINEAR),
               new Keyframe(1.625F, KeyframeAnimations.scaleVec(0.9589F, 0.9589F, 0.9589F), Interpolations.LINEAR),
               new Keyframe(1.6667F, KeyframeAnimations.scaleVec(0.9969F, 0.9969F, 0.9969F), Interpolations.LINEAR),
               new Keyframe(1.7083F, KeyframeAnimations.scaleVec(1.0352F, 1.0352F, 1.0352F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.scaleVec(1.0689F, 1.0689F, 1.0689F), Interpolations.LINEAR),
               new Keyframe(1.7917F, KeyframeAnimations.scaleVec(1.0935F, 1.0935F, 1.0935F), Interpolations.LINEAR),
               new Keyframe(1.8333F, KeyframeAnimations.scaleVec(1.1058F, 1.1058F, 1.1058F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.scaleVec(1.1043F, 1.1043F, 1.1043F), Interpolations.LINEAR),
               new Keyframe(1.9167F, KeyframeAnimations.scaleVec(1.0891F, 1.0891F, 1.0891F), Interpolations.LINEAR),
               new Keyframe(1.9583F, KeyframeAnimations.scaleVec(1.0624F, 1.0624F, 1.0624F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.scaleVec(1.0275F, 1.0275F, 1.0275F), Interpolations.LINEAR),
               new Keyframe(2.0417F, KeyframeAnimations.scaleVec(0.9892F, 0.9892F, 0.9892F), Interpolations.LINEAR),
               new Keyframe(2.0833F, KeyframeAnimations.scaleVec(0.9525F, 0.9525F, 0.9525F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.scaleVec(0.922F, 0.922F, 0.922F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.scaleVec(0.9019F, 0.9019F, 0.9019F), Interpolations.LINEAR),
               new Keyframe(2.2083F, KeyframeAnimations.scaleVec(0.8947F, 0.8947F, 0.8947F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.scaleVec(0.9013F, 0.9013F, 0.9013F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.scaleVec(0.9207F, 0.9207F, 0.9207F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.scaleVec(0.9504F, 0.9504F, 0.9504F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.scaleVec(0.9864F, 0.9864F, 0.9864F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.scaleVec(1.024F, 1.024F, 1.024F), Interpolations.LINEAR),
               new Keyframe(2.4583F, KeyframeAnimations.scaleVec(1.0583F, 1.0583F, 1.0583F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.scaleVec(1.0848F, 1.0848F, 1.0848F), Interpolations.LINEAR),
               new Keyframe(2.5417F, KeyframeAnimations.scaleVec(1.1001F, 1.1001F, 1.1001F), Interpolations.LINEAR),
               new Keyframe(2.5833F, KeyframeAnimations.scaleVec(1.1023F, 1.1023F, 1.1023F), Interpolations.LINEAR),
               new Keyframe(2.625F, KeyframeAnimations.scaleVec(1.0912F, 1.0912F, 1.0912F), Interpolations.LINEAR),
               new Keyframe(2.6667F, KeyframeAnimations.scaleVec(1.0682F, 1.0682F, 1.0682F), Interpolations.LINEAR),
               new Keyframe(2.7083F, KeyframeAnimations.scaleVec(1.0364F, 1.0364F, 1.0364F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(2.7917F, KeyframeAnimations.scaleVec(0.9638F, 0.9638F, 0.9638F), Interpolations.LINEAR),
               new Keyframe(2.8333F, KeyframeAnimations.scaleVec(0.9325F, 0.9325F, 0.9325F), Interpolations.LINEAR),
               new Keyframe(2.875F, KeyframeAnimations.scaleVec(0.9101F, 0.9101F, 0.9101F), Interpolations.LINEAR),
               new Keyframe(2.9167F, KeyframeAnimations.scaleVec(0.8995F, 0.8995F, 0.8995F), Interpolations.LINEAR),
               new Keyframe(2.9583F, KeyframeAnimations.scaleVec(0.9021F, 0.9021F, 0.9021F), Interpolations.LINEAR),
               new Keyframe(3.0F, KeyframeAnimations.scaleVec(0.9174F, 0.9174F, 0.9174F), Interpolations.LINEAR),
               new Keyframe(3.0417F, KeyframeAnimations.scaleVec(0.9435F, 0.9435F, 0.9435F), Interpolations.LINEAR),
               new Keyframe(3.0833F, KeyframeAnimations.scaleVec(0.9768F, 0.9768F, 0.9768F), Interpolations.LINEAR),
               new Keyframe(3.125F, KeyframeAnimations.scaleVec(1.0131F, 1.0131F, 1.0131F), Interpolations.LINEAR),
               new Keyframe(3.1667F, KeyframeAnimations.scaleVec(1.0476F, 1.0476F, 1.0476F), Interpolations.LINEAR),
               new Keyframe(3.2083F, KeyframeAnimations.scaleVec(1.0758F, 1.0758F, 1.0758F), Interpolations.LINEAR),
               new Keyframe(3.25F, KeyframeAnimations.scaleVec(1.0941F, 1.0941F, 1.0941F), Interpolations.LINEAR),
               new Keyframe(3.2917F, KeyframeAnimations.scaleVec(1.1F, 1.1F, 1.1F), Interpolations.LINEAR),
               new Keyframe(3.3333F, KeyframeAnimations.scaleVec(1.0929F, 1.0929F, 1.0929F), Interpolations.LINEAR),
               new Keyframe(3.375F, KeyframeAnimations.scaleVec(1.0737F, 1.0737F, 1.0737F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rib10",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib11",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -67.5F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib12",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -60.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib8",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -67.5F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib9",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -60.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib5",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -67.5F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib6",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -60.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib2",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -67.5F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib3",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -60.0F), Interpolations.CATMULLROM)})
      )
      .build();
   public static final AnimationDefinition DEPLOY = Builder.withLength(0.5F)
      .addAnimation(
         "everything",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2917F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.75, 0.75, 0.75), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rib10",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib11",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -67.5F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib12",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -60.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib8",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -67.5F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib9",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -60.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib5",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -67.5F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib6",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -60.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib2",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -67.5F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rib3",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -60.0F), Interpolations.CATMULLROM)})
      )
      .build();
   public static final AnimationDefinition GROUND = Builder.withLength(0.0F)
      .looping()
      .addAnimation(
         "everything",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rib10",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rib11",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -67.5F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rib12",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -60.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rib8",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -67.5F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rib9",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -60.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rib5",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -67.5F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rib6",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -60.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rib",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rib2",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -67.5F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rib3",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -60.0F), Interpolations.LINEAR)})
      )
      .build();
}
