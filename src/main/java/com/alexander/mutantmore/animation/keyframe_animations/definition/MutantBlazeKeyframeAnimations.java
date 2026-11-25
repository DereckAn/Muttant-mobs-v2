package com.alexander.mutantmore.animation.keyframe_animations.definition;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class MutantBlazeKeyframeAnimations {
   public static final AnimationDefinition NOVELTY = Builder.withLength(4.0F)
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.0417F, KeyframeAnimations.degreeVec(0.0F, -1.39F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.0833F, KeyframeAnimations.degreeVec(0.0F, -5.56F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, -12.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.1667F, KeyframeAnimations.degreeVec(0.0F, -22.22F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.2083F, KeyframeAnimations.degreeVec(0.0F, -34.72F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, -50.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.2917F, KeyframeAnimations.degreeVec(0.0F, -68.06F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.3333F, KeyframeAnimations.degreeVec(0.0F, -88.89F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, -112.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4167F, KeyframeAnimations.degreeVec(0.0F, -138.89F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4583F, KeyframeAnimations.degreeVec(0.0F, -168.06F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -200.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5417F, KeyframeAnimations.degreeVec(0.0F, -216.67F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5833F, KeyframeAnimations.degreeVec(0.0F, -233.33F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, -250.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, -266.67F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.degreeVec(0.0F, -283.33F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, -300.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.degreeVec(0.0F, -316.67F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.8333F, KeyframeAnimations.degreeVec(0.0F, -333.33F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, -350.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.degreeVec(0.0F, -366.67F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.degreeVec(0.0F, -383.33F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -400.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0417F, KeyframeAnimations.degreeVec(0.0F, -416.67F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0833F, KeyframeAnimations.degreeVec(0.0F, -433.33F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, -450.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.degreeVec(0.0F, -466.67F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.2083F, KeyframeAnimations.degreeVec(0.0F, -483.33F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, -500.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.2917F, KeyframeAnimations.degreeVec(0.0F, -516.67F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.3333F, KeyframeAnimations.degreeVec(0.0F, -533.33F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, -550.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.4167F, KeyframeAnimations.degreeVec(0.0F, -566.67F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.4583F, KeyframeAnimations.degreeVec(0.0F, -583.33F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -600.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5417F, KeyframeAnimations.degreeVec(0.0F, -616.67F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5833F, KeyframeAnimations.degreeVec(0.0F, -633.33F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(0.0F, -650.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.6667F, KeyframeAnimations.degreeVec(0.0F, -666.67F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.7083F, KeyframeAnimations.degreeVec(0.0F, -683.33F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, -700.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.7917F, KeyframeAnimations.degreeVec(0.0F, -682.54F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.8333F, KeyframeAnimations.degreeVec(0.0F, -663.49F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.0F, -642.86F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.9167F, KeyframeAnimations.degreeVec(0.0F, -620.63F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.9583F, KeyframeAnimations.degreeVec(0.0F, -596.83F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -571.43F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0417F, KeyframeAnimations.degreeVec(0.0F, -544.44F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0833F, KeyframeAnimations.degreeVec(0.0F, -515.87F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(0.0F, -485.71F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.degreeVec(0.0F, -453.97F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2083F, KeyframeAnimations.degreeVec(0.0F, -420.63F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, -385.71F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.degreeVec(0.0F, -349.21F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.degreeVec(0.0F, -311.11F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(0.0F, -271.43F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, -230.16F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4583F, KeyframeAnimations.degreeVec(0.0F, -187.3F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, -142.86F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5417F, KeyframeAnimations.degreeVec(0.0F, -96.83F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5833F, KeyframeAnimations.degreeVec(0.0F, -49.21F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.6667F, KeyframeAnimations.degreeVec(0.0F, 50.79F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.7083F, KeyframeAnimations.degreeVec(0.0F, 103.17F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 157.14F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.7917F, KeyframeAnimations.degreeVec(0.0F, 212.7F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.8333F, KeyframeAnimations.degreeVec(0.0F, 269.84F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.875F, KeyframeAnimations.degreeVec(0.0F, 328.57F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.9167F, KeyframeAnimations.degreeVec(0.0F, 388.89F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.9583F, KeyframeAnimations.degreeVec(0.0F, 450.79F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 514.29F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.0417F, KeyframeAnimations.degreeVec(0.0F, 579.37F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.0833F, KeyframeAnimations.degreeVec(0.0F, 646.03F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(0.0F, 714.29F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.1667F, KeyframeAnimations.degreeVec(0.0F, 784.13F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.2083F, KeyframeAnimations.degreeVec(0.0F, 855.56F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(0.0F, 928.57F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.2917F, KeyframeAnimations.degreeVec(0.0F, 1003.17F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.3333F, KeyframeAnimations.degreeVec(0.0F, 1079.37F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(0.0F, 1157.14F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.4167F, KeyframeAnimations.degreeVec(0.0F, 1236.51F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.4583F, KeyframeAnimations.degreeVec(0.0F, 1317.46F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 1400.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.5417F, KeyframeAnimations.degreeVec(0.0F, 1298.61F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.5833F, KeyframeAnimations.degreeVec(0.0F, 1194.44F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.625F, KeyframeAnimations.degreeVec(0.0F, 1087.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.6667F, KeyframeAnimations.degreeVec(0.0F, 977.78F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.7083F, KeyframeAnimations.degreeVec(0.0F, 865.28F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(0.0F, 750.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.7917F, KeyframeAnimations.degreeVec(0.0F, 631.94F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.8333F, KeyframeAnimations.degreeVec(0.0F, 511.11F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.875F, KeyframeAnimations.degreeVec(0.0F, 387.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.9167F, KeyframeAnimations.degreeVec(0.0F, 261.11F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.9583F, KeyframeAnimations.degreeVec(0.0F, 131.94F, 0.0F), Interpolations.LINEAR),
               new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.0417F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.0833F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.2083F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.2917F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.3333F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4167F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4583F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5833F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.8333F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0417F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0833F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.2083F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.2917F, KeyframeAnimations.posVec(0.0F, 0.86F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.3333F, KeyframeAnimations.posVec(0.0F, 1.18F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.posVec(0.0F, 1.41F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.4167F, KeyframeAnimations.posVec(0.0F, 1.53F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.4583F, KeyframeAnimations.posVec(0.0F, 1.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 1.31F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5417F, KeyframeAnimations.posVec(0.0F, 0.94F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5833F, KeyframeAnimations.posVec(0.0F, 0.41F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.625F, KeyframeAnimations.posVec(0.0F, -0.28F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.6667F, KeyframeAnimations.posVec(0.0F, -1.11F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.7083F, KeyframeAnimations.posVec(0.0F, -2.05F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, -3.04F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.7917F, KeyframeAnimations.posVec(0.0F, -3.71F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.8333F, KeyframeAnimations.posVec(0.0F, -4.26F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, -4.66F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.9167F, KeyframeAnimations.posVec(0.0F, -4.91F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.9583F, KeyframeAnimations.posVec(0.0F, -5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -4.92F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0417F, KeyframeAnimations.posVec(0.0F, -4.69F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0833F, KeyframeAnimations.posVec(0.0F, -4.29F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.posVec(0.0F, -3.76F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.posVec(0.0F, -3.1F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2083F, KeyframeAnimations.posVec(0.0F, -2.34F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, -1.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, -0.62F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.posVec(0.0F, 0.29F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.posVec(0.0F, 1.19F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.posVec(0.0F, 2.05F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4583F, KeyframeAnimations.posVec(0.0F, 2.84F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 3.54F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5417F, KeyframeAnimations.posVec(0.0F, 4.12F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5833F, KeyframeAnimations.posVec(0.0F, 4.56F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.625F, KeyframeAnimations.posVec(0.0F, 4.86F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.6667F, KeyframeAnimations.posVec(0.0F, 4.99F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.7083F, KeyframeAnimations.posVec(0.0F, 4.96F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, 4.77F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.7917F, KeyframeAnimations.posVec(0.0F, 4.42F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.8333F, KeyframeAnimations.posVec(0.0F, 3.92F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.875F, KeyframeAnimations.posVec(0.0F, 3.3F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.9167F, KeyframeAnimations.posVec(0.0F, 2.56F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.9583F, KeyframeAnimations.posVec(0.0F, 1.74F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 0.87F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.0417F, KeyframeAnimations.posVec(0.0F, -0.04F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.0833F, KeyframeAnimations.posVec(0.0F, -0.94F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.125F, KeyframeAnimations.posVec(0.0F, -1.81F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.1667F, KeyframeAnimations.posVec(0.0F, -2.62F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.2083F, KeyframeAnimations.posVec(0.0F, -3.35F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.25F, KeyframeAnimations.posVec(0.0F, -3.97F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.2917F, KeyframeAnimations.posVec(0.0F, -4.45F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.3333F, KeyframeAnimations.posVec(0.0F, -4.79F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.375F, KeyframeAnimations.posVec(0.0F, -4.97F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.4167F, KeyframeAnimations.posVec(0.0F, -4.99F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.4583F, KeyframeAnimations.posVec(0.0F, -4.84F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, -4.53F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.5417F, KeyframeAnimations.posVec(0.0F, -3.69F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.5833F, KeyframeAnimations.posVec(0.0F, -2.82F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.625F, KeyframeAnimations.posVec(0.0F, -1.96F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.6667F, KeyframeAnimations.posVec(0.0F, -1.15F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.7083F, KeyframeAnimations.posVec(0.0F, -0.44F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.75F, KeyframeAnimations.posVec(0.0F, 0.14F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.7917F, KeyframeAnimations.posVec(0.0F, 0.58F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.8333F, KeyframeAnimations.posVec(0.0F, 0.86F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.875F, KeyframeAnimations.posVec(0.0F, 0.98F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.9167F, KeyframeAnimations.posVec(0.0F, 0.94F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.9583F, KeyframeAnimations.posVec(0.0F, 0.78F, 0.0F), Interpolations.LINEAR),
               new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "coreParts",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.0417F, KeyframeAnimations.posVec(2.44F, 0.29F, 0.54F), Interpolations.LINEAR),
               new Keyframe(0.0833F, KeyframeAnimations.posVec(4.53F, 1.06F, 2.11F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(5.95F, 2.08F, 4.57F), Interpolations.LINEAR),
               new Keyframe(0.1667F, KeyframeAnimations.posVec(6.43F, 3.05F, 7.66F), Interpolations.LINEAR),
               new Keyframe(0.2083F, KeyframeAnimations.posVec(5.77F, 3.64F, 11.09F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(3.88F, 3.61F, 14.49F), Interpolations.LINEAR),
               new Keyframe(0.2917F, KeyframeAnimations.posVec(0.76F, 2.83F, 17.48F), Interpolations.LINEAR),
               new Keyframe(0.3333F, KeyframeAnimations.posVec(-3.47F, 1.3F, 19.7F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.posVec(-8.61F, 0.81F, 20.79F), Interpolations.LINEAR),
               new Keyframe(0.4167F, KeyframeAnimations.posVec(-14.34F, 3.21F, 20.48F), Interpolations.LINEAR),
               new Keyframe(0.4583F, KeyframeAnimations.posVec(-20.28F, 5.52F, 18.58F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.posVec(-25.98F, 7.32F, 15.0F), Interpolations.LINEAR),
               new Keyframe(0.5417F, KeyframeAnimations.posVec(-28.61F, 7.63F, 9.02F), Interpolations.LINEAR),
               new Keyframe(0.5833F, KeyframeAnimations.posVec(-29.89F, 6.94F, 2.61F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.posVec(-29.74F, 5.39F, -3.92F), Interpolations.LINEAR),
               new Keyframe(0.6667F, KeyframeAnimations.posVec(-28.19F, 3.22F, -10.26F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.posVec(-25.3F, 0.71F, -16.12F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.posVec(-21.21F, 1.78F, -21.21F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.posVec(-16.12F, 3.94F, -25.3F), Interpolations.LINEAR),
               new Keyframe(0.8333F, KeyframeAnimations.posVec(-10.26F, 5.51F, -28.19F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.posVec(-3.92F, 6.3F, -29.74F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.posVec(2.61F, 6.26F, -29.89F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.posVec(9.02F, 5.41F, -28.61F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.posVec(15.0F, 3.9F, -25.98F), Interpolations.LINEAR),
               new Keyframe(1.0417F, KeyframeAnimations.posVec(20.27F, 1.95F, -22.12F), Interpolations.LINEAR),
               new Keyframe(1.0833F, KeyframeAnimations.posVec(24.57F, 0.17F, -17.21F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.posVec(27.72F, 2.18F, -11.48F), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.posVec(29.54F, 3.83F, -5.21F), Interpolations.LINEAR),
               new Keyframe(1.2083F, KeyframeAnimations.posVec(29.97F, 4.92F, 1.31F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.posVec(28.98F, 5.33F, 7.76F), Interpolations.LINEAR),
               new Keyframe(1.2917F, KeyframeAnimations.posVec(26.61F, 5.04F, 13.85F), Interpolations.LINEAR),
               new Keyframe(1.3333F, KeyframeAnimations.posVec(22.98F, 4.12F, 19.28F), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.posVec(18.26F, 2.7F, 23.8F), Interpolations.LINEAR),
               new Keyframe(1.4167F, KeyframeAnimations.posVec(12.68F, 1.0F, 27.19F), Interpolations.LINEAR),
               new Keyframe(1.4583F, KeyframeAnimations.posVec(6.49F, 0.77F, 29.29F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 2.36F, 30.0F), Interpolations.LINEAR),
               new Keyframe(1.5417F, KeyframeAnimations.posVec(-6.49F, 3.59F, 26.85F), Interpolations.LINEAR),
               new Keyframe(1.5833F, KeyframeAnimations.posVec(-12.68F, 4.3F, 22.66F), Interpolations.LINEAR),
               new Keyframe(1.625F, KeyframeAnimations.posVec(-18.26F, 4.43F, 17.85F), Interpolations.LINEAR),
               new Keyframe(1.6667F, KeyframeAnimations.posVec(-22.98F, 3.99F, 12.86F), Interpolations.LINEAR),
               new Keyframe(1.7083F, KeyframeAnimations.posVec(-26.61F, 3.05F, 8.08F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.posVec(-28.98F, 1.76F, 3.88F), Interpolations.LINEAR),
               new Keyframe(1.7917F, KeyframeAnimations.posVec(-29.97F, 0.3F, 0.55F), Interpolations.LINEAR),
               new Keyframe(1.8333F, KeyframeAnimations.posVec(-29.54F, 1.15F, -1.74F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.posVec(-27.72F, 2.38F, -2.87F), Interpolations.LINEAR),
               new Keyframe(1.9167F, KeyframeAnimations.posVec(-24.57F, 3.26F, -2.87F), Interpolations.LINEAR),
               new Keyframe(1.9583F, KeyframeAnimations.posVec(-20.27F, 3.69F, -1.84F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(-15.0F, 3.62F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0417F, KeyframeAnimations.posVec(-9.02F, 3.09F, 2.38F), Interpolations.LINEAR),
               new Keyframe(2.0833F, KeyframeAnimations.posVec(-2.61F, 2.19F, 4.98F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.posVec(3.92F, 1.04F, 7.44F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.posVec(10.26F, 0.2F, 9.4F), Interpolations.LINEAR),
               new Keyframe(2.2083F, KeyframeAnimations.posVec(16.12F, 1.36F, 10.54F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(21.21F, 2.3F, 10.61F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(25.3F, 2.9F, 9.4F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.posVec(28.19F, 3.11F, 6.84F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.posVec(29.74F, 2.91F, 2.94F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.posVec(29.89F, 2.34F, -2.18F), Interpolations.LINEAR),
               new Keyframe(2.4583F, KeyframeAnimations.posVec(28.61F, 1.5F, -8.27F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.posVec(25.98F, 0.5F, -15.0F), Interpolations.LINEAR),
               new Keyframe(2.5417F, KeyframeAnimations.posVec(22.12F, 0.53F, -20.27F), Interpolations.LINEAR),
               new Keyframe(2.5833F, KeyframeAnimations.posVec(17.21F, 1.44F, -24.57F), Interpolations.LINEAR),
               new Keyframe(2.625F, KeyframeAnimations.posVec(11.48F, 2.14F, -27.72F), Interpolations.LINEAR),
               new Keyframe(2.6667F, KeyframeAnimations.posVec(5.21F, 2.53F, -29.54F), Interpolations.LINEAR),
               new Keyframe(2.7083F, KeyframeAnimations.posVec(-1.31F, 2.57F, -29.97F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.posVec(-7.76F, 2.29F, -28.98F), Interpolations.LINEAR),
               new Keyframe(2.7917F, KeyframeAnimations.posVec(-13.85F, 1.73F, -26.61F), Interpolations.LINEAR),
               new Keyframe(2.8333F, KeyframeAnimations.posVec(-19.28F, 0.96F, -22.98F), Interpolations.LINEAR),
               new Keyframe(2.875F, KeyframeAnimations.posVec(-23.8F, 0.1F, -18.26F), Interpolations.LINEAR),
               new Keyframe(2.9167F, KeyframeAnimations.posVec(-27.19F, 0.73F, -12.68F), Interpolations.LINEAR),
               new Keyframe(2.9583F, KeyframeAnimations.posVec(-29.29F, 1.44F, -6.49F), Interpolations.LINEAR),
               new Keyframe(3.0F, KeyframeAnimations.posVec(-30.0F, 1.93F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.0417F, KeyframeAnimations.posVec(-29.29F, 2.16F, 6.49F), Interpolations.LINEAR),
               new Keyframe(3.0833F, KeyframeAnimations.posVec(-27.19F, 2.1F, 12.68F), Interpolations.LINEAR),
               new Keyframe(3.125F, KeyframeAnimations.posVec(-23.8F, 1.77F, 18.26F), Interpolations.LINEAR),
               new Keyframe(3.1667F, KeyframeAnimations.posVec(-19.28F, 1.23F, 22.98F), Interpolations.LINEAR),
               new Keyframe(3.2083F, KeyframeAnimations.posVec(-13.85F, 0.55F, 26.61F), Interpolations.LINEAR),
               new Keyframe(3.25F, KeyframeAnimations.posVec(-7.76F, 0.17F, 28.98F), Interpolations.LINEAR),
               new Keyframe(3.2917F, KeyframeAnimations.posVec(-1.31F, 0.84F, 29.97F), Interpolations.LINEAR),
               new Keyframe(3.3333F, KeyframeAnimations.posVec(5.21F, 1.37F, 29.54F), Interpolations.LINEAR),
               new Keyframe(3.375F, KeyframeAnimations.posVec(11.48F, 1.71F, 27.72F), Interpolations.LINEAR),
               new Keyframe(3.4167F, KeyframeAnimations.posVec(17.21F, 1.81F, 24.57F), Interpolations.LINEAR),
               new Keyframe(3.4583F, KeyframeAnimations.posVec(22.11F, 1.68F, 20.27F), Interpolations.LINEAR),
               new Keyframe(3.5F, KeyframeAnimations.posVec(23.98F, 1.23F, 13.85F), Interpolations.LINEAR),
               new Keyframe(3.5417F, KeyframeAnimations.posVec(24.21F, 0.7F, 7.63F), Interpolations.LINEAR),
               new Keyframe(3.5833F, KeyframeAnimations.posVec(22.99F, 0.19F, 2.01F), Interpolations.LINEAR),
               new Keyframe(3.625F, KeyframeAnimations.posVec(20.59F, 0.24F, -2.71F), Interpolations.LINEAR),
               new Keyframe(3.6667F, KeyframeAnimations.posVec(17.35F, 0.54F, -6.31F), Interpolations.LINEAR),
               new Keyframe(3.7083F, KeyframeAnimations.posVec(13.62F, 0.68F, -8.68F), Interpolations.LINEAR),
               new Keyframe(3.75F, KeyframeAnimations.posVec(9.79F, 0.68F, -9.79F), Interpolations.LINEAR),
               new Keyframe(3.7917F, KeyframeAnimations.posVec(6.2F, 0.57F, -9.73F), Interpolations.LINEAR),
               new Keyframe(3.8333F, KeyframeAnimations.posVec(3.16F, 0.4F, -8.67F), Interpolations.LINEAR),
               new Keyframe(3.875F, KeyframeAnimations.posVec(0.9F, 0.22F, -6.86F), Interpolations.LINEAR),
               new Keyframe(3.9167F, KeyframeAnimations.posVec(-0.4F, 0.08F, -4.6F), Interpolations.LINEAR),
               new Keyframe(3.9583F, KeyframeAnimations.posVec(-0.69F, 0.0F, -2.2F), Interpolations.LINEAR),
               new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final AnimationDefinition CROUCH = Builder.withLength(0.0F)
      .looping()
      .addAnimation(
         "head",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -15.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rodLayer1Rot",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -15.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rodLayer2Rot",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -9.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "shieldLayer2Rot",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -12.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "coreParts",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -11.0F, 0.0F), Interpolations.LINEAR)})
      )
      .build();
   public static final AnimationDefinition SHOOT = Builder.withLength(3.5F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0208F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.02F), Interpolations.LINEAR),
               new Keyframe(1.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.09F), Interpolations.LINEAR),
               new Keyframe(1.0625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.13F), Interpolations.LINEAR),
               new Keyframe(1.0833F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.09F), Interpolations.LINEAR),
               new Keyframe(1.1042F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.27F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), Interpolations.LINEAR),
               new Keyframe(1.1458F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.37F), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.24F), Interpolations.LINEAR),
               new Keyframe(1.1875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.34F), Interpolations.LINEAR),
               new Keyframe(1.2083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.49F), Interpolations.LINEAR),
               new Keyframe(1.2292F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.15F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.67F), Interpolations.LINEAR),
               new Keyframe(1.2708F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.18F), Interpolations.LINEAR),
               new Keyframe(1.2917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.68F), Interpolations.LINEAR),
               new Keyframe(1.3125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.56F), Interpolations.LINEAR),
               new Keyframe(1.3333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.49F), Interpolations.LINEAR),
               new Keyframe(1.3542F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.89F), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.09F), Interpolations.LINEAR),
               new Keyframe(1.3958F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.04F), Interpolations.LINEAR),
               new Keyframe(1.4167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.44F), Interpolations.LINEAR),
               new Keyframe(1.4375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.93F), Interpolations.LINEAR),
               new Keyframe(1.4583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.96F), Interpolations.LINEAR),
               new Keyframe(1.4792F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.52F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.31F), Interpolations.LINEAR),
               new Keyframe(1.5208F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.1F), Interpolations.LINEAR),
               new Keyframe(1.5417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.37F), Interpolations.LINEAR),
               new Keyframe(1.5625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.81F), Interpolations.LINEAR),
               new Keyframe(1.5833F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.07F), Interpolations.LINEAR),
               new Keyframe(1.6042F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.41F), Interpolations.LINEAR),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.43F), Interpolations.LINEAR),
               new Keyframe(1.6458F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.72F), Interpolations.LINEAR),
               new Keyframe(1.6667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.41F), Interpolations.LINEAR),
               new Keyframe(1.6875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.63F), Interpolations.LINEAR),
               new Keyframe(1.7083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.26F), Interpolations.LINEAR),
               new Keyframe(1.7292F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.09F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.88F), Interpolations.LINEAR),
               new Keyframe(1.7708F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.2F), Interpolations.LINEAR),
               new Keyframe(1.7917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.98F), Interpolations.LINEAR),
               new Keyframe(1.8125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.77F), Interpolations.LINEAR),
               new Keyframe(1.8333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.6F), Interpolations.LINEAR),
               new Keyframe(1.8542F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.55F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.85F), Interpolations.LINEAR),
               new Keyframe(1.8958F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.96F), Interpolations.LINEAR),
               new Keyframe(1.9167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.12F), Interpolations.LINEAR),
               new Keyframe(1.9375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.91F), Interpolations.LINEAR),
               new Keyframe(1.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.05F), Interpolations.LINEAR),
               new Keyframe(1.9792F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.39F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.73F), Interpolations.LINEAR),
               new Keyframe(2.0208F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.54F), Interpolations.LINEAR),
               new Keyframe(2.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.93F), Interpolations.LINEAR),
               new Keyframe(2.0625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.41F), Interpolations.LINEAR),
               new Keyframe(2.0833F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.67F), Interpolations.LINEAR),
               new Keyframe(2.1042F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.2F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.03F), Interpolations.LINEAR),
               new Keyframe(2.1458F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.65F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.2F), Interpolations.LINEAR),
               new Keyframe(2.1875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.69F), Interpolations.LINEAR),
               new Keyframe(2.2083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.62F), Interpolations.LINEAR),
               new Keyframe(2.2292F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.32F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.23F), Interpolations.LINEAR),
               new Keyframe(2.2708F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.68F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.5F), Interpolations.LINEAR),
               new Keyframe(2.3125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.07F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.41F), Interpolations.LINEAR),
               new Keyframe(2.3542F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.73F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.99F), Interpolations.LINEAR),
               new Keyframe(2.3958F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.17F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.38F), Interpolations.LINEAR),
               new Keyframe(2.4375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.3F), Interpolations.LINEAR),
               new Keyframe(2.4583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.26F), Interpolations.LINEAR),
               new Keyframe(2.4792F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.11F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.77F), Interpolations.LINEAR),
               new Keyframe(2.5208F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.68F), Interpolations.LINEAR),
               new Keyframe(2.5417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.05F), Interpolations.LINEAR),
               new Keyframe(2.5625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.14F), Interpolations.LINEAR),
               new Keyframe(2.5833F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.06F), Interpolations.LINEAR),
               new Keyframe(2.6042F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.37F), Interpolations.LINEAR),
               new Keyframe(2.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.82F), Interpolations.LINEAR),
               new Keyframe(2.6458F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.73F), Interpolations.LINEAR),
               new Keyframe(2.6667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.42F), Interpolations.LINEAR),
               new Keyframe(2.6875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.88F), Interpolations.LINEAR),
               new Keyframe(2.7083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), Interpolations.LINEAR),
               new Keyframe(2.7292F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.8F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.4F), Interpolations.LINEAR),
               new Keyframe(2.7708F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.55F), Interpolations.LINEAR),
               new Keyframe(2.7917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.62F), Interpolations.LINEAR),
               new Keyframe(2.8125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.21F), Interpolations.LINEAR),
               new Keyframe(2.8333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.67F), Interpolations.LINEAR),
               new Keyframe(2.8542F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.12F), Interpolations.LINEAR),
               new Keyframe(2.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.54F), Interpolations.LINEAR),
               new Keyframe(2.8958F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.36F), Interpolations.LINEAR),
               new Keyframe(2.9167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.32F), Interpolations.LINEAR),
               new Keyframe(2.9375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.46F), Interpolations.LINEAR),
               new Keyframe(2.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.07F), Interpolations.LINEAR),
               new Keyframe(2.9792F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.43F), Interpolations.LINEAR),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.14F), Interpolations.LINEAR),
               new Keyframe(3.0208F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.3F), Interpolations.LINEAR),
               new Keyframe(3.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.25F), Interpolations.LINEAR),
               new Keyframe(3.0625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.14F), Interpolations.LINEAR),
               new Keyframe(3.0833F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.26F), Interpolations.LINEAR),
               new Keyframe(3.1042F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.19F), Interpolations.LINEAR),
               new Keyframe(3.1458F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.08F), Interpolations.LINEAR),
               new Keyframe(3.1667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.1F), Interpolations.LINEAR),
               new Keyframe(3.1875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.08F), Interpolations.LINEAR),
               new Keyframe(3.2083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.02F), Interpolations.LINEAR),
               new Keyframe(3.2292F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.03F), Interpolations.LINEAR),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0417F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 9.0F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.posVec(0.0F, -3.0F, -9.0F), Interpolations.LINEAR),
               new Keyframe(2.875F, KeyframeAnimations.posVec(0.0F, 0.0F, -9.0F), Interpolations.LINEAR),
               new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "coreParts",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -4.0F, 9.0F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.posVec(0.0F, -4.0F, -6.0F), Interpolations.LINEAR),
               new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, -4.0F, -6.0F), Interpolations.LINEAR),
               new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "coreParts",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.scaleVec(2.0, 2.0, 2.0), Interpolations.LINEAR),
               new Keyframe(3.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "coreRings",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.scaleVec(0.75, 0.75, 0.75), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final AnimationDefinition ROD_SHOT_KEYFRAME = Builder.withLength(5.25F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0208F, KeyframeAnimations.degreeVec(-0.12F, 0.0F, -0.01F), Interpolations.LINEAR),
               new Keyframe(2.0417F, KeyframeAnimations.degreeVec(-0.23F, 0.0F, 0.08F), Interpolations.LINEAR),
               new Keyframe(2.0625F, KeyframeAnimations.degreeVec(-0.35F, 0.0F, -0.03F), Interpolations.LINEAR),
               new Keyframe(2.0833F, KeyframeAnimations.degreeVec(-0.47F, 0.0F, -0.14F), Interpolations.LINEAR),
               new Keyframe(2.1042F, KeyframeAnimations.degreeVec(-0.59F, 0.0F, 0.13F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-0.7F, 0.0F, 0.13F), Interpolations.LINEAR),
               new Keyframe(2.1458F, KeyframeAnimations.degreeVec(-0.82F, 0.0F, -0.26F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.degreeVec(-0.94F, 0.0F, -0.04F), Interpolations.LINEAR),
               new Keyframe(2.1875F, KeyframeAnimations.degreeVec(-1.05F, 0.0F, 0.35F), Interpolations.LINEAR),
               new Keyframe(2.2083F, KeyframeAnimations.degreeVec(-1.17F, 0.0F, -0.14F), Interpolations.LINEAR),
               new Keyframe(2.2292F, KeyframeAnimations.degreeVec(-1.29F, 0.0F, -0.35F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-1.41F, 0.0F, 0.36F), Interpolations.LINEAR),
               new Keyframe(2.2708F, KeyframeAnimations.degreeVec(-1.52F, 0.0F, 0.22F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.degreeVec(-1.64F, 0.0F, -0.54F), Interpolations.LINEAR),
               new Keyframe(2.3125F, KeyframeAnimations.degreeVec(-1.76F, 0.0F, 0.03F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.degreeVec(-1.88F, 0.0F, 0.6F), Interpolations.LINEAR),
               new Keyframe(2.3542F, KeyframeAnimations.degreeVec(-1.99F, 0.0F, -0.34F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(-2.11F, 0.0F, -0.5F), Interpolations.LINEAR),
               new Keyframe(2.3958F, KeyframeAnimations.degreeVec(-2.23F, 0.0F, 0.64F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.degreeVec(-2.34F, 0.0F, 0.22F), Interpolations.LINEAR),
               new Keyframe(2.4375F, KeyframeAnimations.degreeVec(-2.46F, 0.0F, -0.82F), Interpolations.LINEAR),
               new Keyframe(2.4583F, KeyframeAnimations.degreeVec(-2.58F, 0.0F, 0.17F), Interpolations.LINEAR),
               new Keyframe(2.4792F, KeyframeAnimations.degreeVec(-2.7F, 0.0F, 0.81F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-2.81F, 0.0F, -0.6F), Interpolations.LINEAR),
               new Keyframe(2.5208F, KeyframeAnimations.degreeVec(-2.93F, 0.0F, -0.57F), Interpolations.LINEAR),
               new Keyframe(2.5417F, KeyframeAnimations.degreeVec(-3.05F, 0.0F, 0.94F), Interpolations.LINEAR),
               new Keyframe(2.5625F, KeyframeAnimations.degreeVec(-3.16F, 0.0F, 0.14F), Interpolations.LINEAR),
               new Keyframe(2.5833F, KeyframeAnimations.degreeVec(-3.28F, 0.0F, -1.09F), Interpolations.LINEAR),
               new Keyframe(2.6042F, KeyframeAnimations.degreeVec(-3.4F, 0.0F, 0.4F), Interpolations.LINEAR),
               new Keyframe(2.625F, KeyframeAnimations.degreeVec(-3.52F, 0.0F, 0.96F), Interpolations.LINEAR),
               new Keyframe(2.6458F, KeyframeAnimations.degreeVec(-3.63F, 0.0F, -0.92F), Interpolations.LINEAR),
               new Keyframe(2.6667F, KeyframeAnimations.degreeVec(-3.75F, 0.0F, -0.56F), Interpolations.LINEAR),
               new Keyframe(2.6875F, KeyframeAnimations.degreeVec(-3.87F, 0.0F, 1.26F), Interpolations.LINEAR),
               new Keyframe(2.7083F, KeyframeAnimations.degreeVec(-3.98F, 0.0F, -0.04F), Interpolations.LINEAR),
               new Keyframe(2.7292F, KeyframeAnimations.degreeVec(-4.1F, 0.0F, -1.32F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(-4.22F, 0.0F, 0.7F), Interpolations.LINEAR),
               new Keyframe(2.7708F, KeyframeAnimations.degreeVec(-4.34F, 0.0F, 1.04F), Interpolations.LINEAR),
               new Keyframe(2.7917F, KeyframeAnimations.degreeVec(-4.45F, 0.0F, -1.26F), Interpolations.LINEAR),
               new Keyframe(2.8125F, KeyframeAnimations.degreeVec(-4.57F, 0.0F, -0.46F), Interpolations.LINEAR),
               new Keyframe(2.8333F, KeyframeAnimations.degreeVec(-4.69F, 0.0F, 1.56F), Interpolations.LINEAR),
               new Keyframe(2.8542F, KeyframeAnimations.degreeVec(-4.8F, 0.0F, -0.3F), Interpolations.LINEAR),
               new Keyframe(2.875F, KeyframeAnimations.degreeVec(-4.92F, 0.0F, -1.49F), Interpolations.LINEAR),
               new Keyframe(2.8958F, KeyframeAnimations.degreeVec(-5.04F, 0.0F, 1.06F), Interpolations.LINEAR),
               new Keyframe(2.9167F, KeyframeAnimations.degreeVec(-5.16F, 0.0F, 1.03F), Interpolations.LINEAR),
               new Keyframe(2.9375F, KeyframeAnimations.degreeVec(-5.27F, 0.0F, -1.62F), Interpolations.LINEAR),
               new Keyframe(2.9583F, KeyframeAnimations.degreeVec(-5.39F, 0.0F, -0.26F), Interpolations.LINEAR),
               new Keyframe(2.9792F, KeyframeAnimations.degreeVec(-5.51F, 0.0F, 1.83F), Interpolations.LINEAR),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(-5.63F, 0.0F, -0.64F), Interpolations.LINEAR),
               new Keyframe(3.0208F, KeyframeAnimations.degreeVec(-5.74F, 0.0F, -1.58F), Interpolations.LINEAR),
               new Keyframe(3.0417F, KeyframeAnimations.degreeVec(-5.86F, 0.0F, 1.46F), Interpolations.LINEAR),
               new Keyframe(3.0625F, KeyframeAnimations.degreeVec(-5.98F, 0.0F, 0.92F), Interpolations.LINEAR),
               new Keyframe(3.0833F, KeyframeAnimations.degreeVec(-6.09F, 0.0F, -1.98F), Interpolations.LINEAR),
               new Keyframe(3.1042F, KeyframeAnimations.degreeVec(-6.21F, 0.0F, 0.03F), Interpolations.LINEAR),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(-6.33F, 0.0F, 2.04F), Interpolations.LINEAR),
               new Keyframe(3.1458F, KeyframeAnimations.degreeVec(-6.45F, 0.0F, -1.05F), Interpolations.LINEAR),
               new Keyframe(3.1667F, KeyframeAnimations.degreeVec(-6.56F, 0.0F, -1.59F), Interpolations.LINEAR),
               new Keyframe(3.1875F, KeyframeAnimations.degreeVec(-6.68F, 0.0F, 1.88F), Interpolations.LINEAR),
               new Keyframe(3.2083F, KeyframeAnimations.degreeVec(-6.8F, 0.0F, 0.71F), Interpolations.LINEAR),
               new Keyframe(3.2292F, KeyframeAnimations.degreeVec(-6.91F, 0.0F, -2.3F), Interpolations.LINEAR),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(-7.03F, 0.0F, 0.41F), Interpolations.LINEAR),
               new Keyframe(3.2708F, KeyframeAnimations.degreeVec(-7.15F, 0.0F, 2.17F), Interpolations.LINEAR),
               new Keyframe(3.2917F, KeyframeAnimations.degreeVec(-7.27F, 0.0F, -1.5F), Interpolations.LINEAR),
               new Keyframe(3.3125F, KeyframeAnimations.degreeVec(-7.38F, 0.0F, -1.5F), Interpolations.LINEAR),
               new Keyframe(3.3333F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 2.3F), Interpolations.LINEAR),
               new Keyframe(3.3542F, KeyframeAnimations.degreeVec(-5.42F, 0.0F, 0.4F), Interpolations.LINEAR),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(-3.33F, 0.0F, -2.49F), Interpolations.LINEAR),
               new Keyframe(3.3958F, KeyframeAnimations.degreeVec(-1.25F, 0.0F, 0.82F), Interpolations.LINEAR),
               new Keyframe(3.4167F, KeyframeAnimations.degreeVec(0.83F, 0.0F, 2.09F), Interpolations.LINEAR),
               new Keyframe(3.4375F, KeyframeAnimations.degreeVec(2.92F, 0.0F, -1.84F), Interpolations.LINEAR),
               new Keyframe(3.4583F, KeyframeAnimations.degreeVec(5.0F, 0.0F, -1.19F), Interpolations.LINEAR),
               new Keyframe(3.4792F, KeyframeAnimations.degreeVec(7.08F, 0.0F, 2.42F), Interpolations.LINEAR),
               new Keyframe(3.5F, KeyframeAnimations.degreeVec(9.17F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.5208F, KeyframeAnimations.degreeVec(11.25F, 0.0F, -2.42F), Interpolations.LINEAR),
               new Keyframe(3.5417F, KeyframeAnimations.degreeVec(13.33F, 0.0F, 1.19F), Interpolations.LINEAR),
               new Keyframe(3.5625F, KeyframeAnimations.degreeVec(15.42F, 0.0F, 1.84F), Interpolations.LINEAR),
               new Keyframe(3.5833F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -2.09F), Interpolations.LINEAR),
               new Keyframe(3.6042F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -0.82F), Interpolations.LINEAR),
               new Keyframe(3.625F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 2.49F), Interpolations.LINEAR),
               new Keyframe(3.6458F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -0.4F), Interpolations.LINEAR),
               new Keyframe(3.6667F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -2.3F), Interpolations.LINEAR),
               new Keyframe(3.6875F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 1.52F), Interpolations.LINEAR),
               new Keyframe(3.7083F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 1.55F), Interpolations.LINEAR),
               new Keyframe(3.7292F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -2.28F), Interpolations.LINEAR),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -0.43F), Interpolations.LINEAR),
               new Keyframe(3.7708F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 2.49F), Interpolations.LINEAR),
               new Keyframe(3.7917F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -0.79F), Interpolations.LINEAR),
               new Keyframe(3.8125F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -2.11F), Interpolations.LINEAR),
               new Keyframe(3.8333F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 1.82F), Interpolations.LINEAR),
               new Keyframe(3.8542F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 1.22F), Interpolations.LINEAR),
               new Keyframe(3.875F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -2.41F), Interpolations.LINEAR),
               new Keyframe(3.8958F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -0.04F), Interpolations.LINEAR),
               new Keyframe(3.9167F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 2.43F), Interpolations.LINEAR),
               new Keyframe(3.9375F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -1.15F), Interpolations.LINEAR),
               new Keyframe(3.9583F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -1.87F), Interpolations.LINEAR),
               new Keyframe(3.9792F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 2.07F), Interpolations.LINEAR),
               new Keyframe(4.0F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.86F), Interpolations.LINEAR),
               new Keyframe(4.0208F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -2.49F), Interpolations.LINEAR),
               new Keyframe(4.0417F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.36F), Interpolations.LINEAR),
               new Keyframe(4.0625F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 2.31F), Interpolations.LINEAR),
               new Keyframe(4.0833F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -1.49F), Interpolations.LINEAR),
               new Keyframe(4.1042F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -1.58F), Interpolations.LINEAR),
               new Keyframe(4.125F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 2.27F), Interpolations.LINEAR),
               new Keyframe(4.1458F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.47F), Interpolations.LINEAR),
               new Keyframe(4.1667F, KeyframeAnimations.degreeVec(17.5F, 0.0F, -2.5F), Interpolations.LINEAR),
               new Keyframe(4.1875F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.75F), Interpolations.LINEAR),
               new Keyframe(4.2083F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 2.13F), Interpolations.LINEAR),
               new Keyframe(4.2292F, KeyframeAnimations.degreeVec(17.04F, 0.0F, -1.75F), Interpolations.LINEAR),
               new Keyframe(4.25F, KeyframeAnimations.degreeVec(16.58F, 0.0F, -1.18F), Interpolations.LINEAR),
               new Keyframe(4.2708F, KeyframeAnimations.degreeVec(16.12F, 0.0F, 2.22F), Interpolations.LINEAR),
               new Keyframe(4.2917F, KeyframeAnimations.degreeVec(15.66F, 0.0F, 0.07F), Interpolations.LINEAR),
               new Keyframe(4.3125F, KeyframeAnimations.degreeVec(15.2F, 0.0F, -2.12F), Interpolations.LINEAR),
               new Keyframe(4.3333F, KeyframeAnimations.degreeVec(14.74F, 0.0F, 0.94F), Interpolations.LINEAR),
               new Keyframe(4.3542F, KeyframeAnimations.degreeVec(14.28F, 0.0F, 1.54F), Interpolations.LINEAR),
               new Keyframe(4.375F, KeyframeAnimations.degreeVec(13.82F, 0.0F, -1.62F), Interpolations.LINEAR),
               new Keyframe(4.3958F, KeyframeAnimations.degreeVec(13.36F, 0.0F, -0.68F), Interpolations.LINEAR),
               new Keyframe(4.4167F, KeyframeAnimations.degreeVec(12.89F, 0.0F, 1.83F), Interpolations.LINEAR),
               new Keyframe(4.4375F, KeyframeAnimations.degreeVec(12.43F, 0.0F, -0.23F), Interpolations.LINEAR),
               new Keyframe(4.4583F, KeyframeAnimations.degreeVec(11.97F, 0.0F, -1.59F), Interpolations.LINEAR),
               new Keyframe(4.4792F, KeyframeAnimations.degreeVec(11.51F, 0.0F, 0.96F), Interpolations.LINEAR),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(11.05F, 0.0F, 1.01F), Interpolations.LINEAR),
               new Keyframe(4.5208F, KeyframeAnimations.degreeVec(10.59F, 0.0F, -1.36F), Interpolations.LINEAR),
               new Keyframe(4.5417F, KeyframeAnimations.degreeVec(10.13F, 0.0F, -0.29F), Interpolations.LINEAR),
               new Keyframe(4.5625F, KeyframeAnimations.degreeVec(9.67F, 0.0F, 1.38F), Interpolations.LINEAR),
               new Keyframe(4.5833F, KeyframeAnimations.degreeVec(9.21F, 0.0F, -0.38F), Interpolations.LINEAR),
               new Keyframe(4.6042F, KeyframeAnimations.degreeVec(8.75F, 0.0F, -1.07F), Interpolations.LINEAR),
               new Keyframe(4.625F, KeyframeAnimations.degreeVec(8.29F, 0.0F, 0.84F), Interpolations.LINEAR),
               new Keyframe(4.6458F, KeyframeAnimations.degreeVec(7.83F, 0.0F, 0.57F), Interpolations.LINEAR),
               new Keyframe(4.6667F, KeyframeAnimations.degreeVec(7.37F, 0.0F, -1.01F), Interpolations.LINEAR),
               new Keyframe(4.6875F, KeyframeAnimations.degreeVec(6.91F, 0.0F, -0.04F), Interpolations.LINEAR),
               new Keyframe(4.7083F, KeyframeAnimations.degreeVec(6.45F, 0.0F, 0.9F), Interpolations.LINEAR),
               new Keyframe(4.7292F, KeyframeAnimations.degreeVec(5.99F, 0.0F, -0.37F), Interpolations.LINEAR),
               new Keyframe(4.75F, KeyframeAnimations.degreeVec(5.53F, 0.0F, -0.6F), Interpolations.LINEAR),
               new Keyframe(4.7708F, KeyframeAnimations.degreeVec(5.07F, 0.0F, 0.59F), Interpolations.LINEAR),
               new Keyframe(4.7917F, KeyframeAnimations.degreeVec(4.61F, 0.0F, 0.24F), Interpolations.LINEAR),
               new Keyframe(4.8125F, KeyframeAnimations.degreeVec(4.14F, 0.0F, -0.59F), Interpolations.LINEAR),
               new Keyframe(4.8333F, KeyframeAnimations.degreeVec(3.68F, 0.0F, 0.06F), Interpolations.LINEAR),
               new Keyframe(4.8542F, KeyframeAnimations.degreeVec(3.22F, 0.0F, 0.43F), Interpolations.LINEAR),
               new Keyframe(4.875F, KeyframeAnimations.degreeVec(2.76F, 0.0F, -0.23F), Interpolations.LINEAR),
               new Keyframe(4.8958F, KeyframeAnimations.degreeVec(2.3F, 0.0F, -0.22F), Interpolations.LINEAR),
               new Keyframe(4.9167F, KeyframeAnimations.degreeVec(1.84F, 0.0F, 0.24F), Interpolations.LINEAR),
               new Keyframe(4.9375F, KeyframeAnimations.degreeVec(1.38F, 0.0F, 0.04F), Interpolations.LINEAR),
               new Keyframe(4.9583F, KeyframeAnimations.degreeVec(0.92F, 0.0F, -0.13F), Interpolations.LINEAR),
               new Keyframe(4.9792F, KeyframeAnimations.degreeVec(0.46F, 0.0F, 0.02F), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.4167F, KeyframeAnimations.posVec(0.0F, 0.09F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.5417F, KeyframeAnimations.posVec(0.0F, 0.0F, -8.0F), Interpolations.LINEAR),
               new Keyframe(4.2083F, KeyframeAnimations.posVec(0.0F, 0.0F, -8.0F), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.5F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(4.125F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 3.0F, 4.0F), Interpolations.LINEAR),
               new Keyframe(3.25F, KeyframeAnimations.posVec(0.0F, 3.0F, 4.0F), Interpolations.LINEAR),
               new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 3.0F, -4.0F), Interpolations.LINEAR),
               new Keyframe(4.125F, KeyframeAnimations.posVec(0.0F, 3.0F, -4.0F), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodLayer1Rot",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(4.4583F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodLayer1",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 13.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(4.4583F, KeyframeAnimations.posVec(0.0F, 13.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(4.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(3.5833F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(3.625F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.1667F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation2",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(3.625F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(3.6667F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.1667F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation3",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(3.6667F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(3.7083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.1667F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation4",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(3.7083F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(3.75F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.1667F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation5",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(3.75F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(3.7917F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.1667F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation6",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(3.7917F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(3.8333F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.1667F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation7",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(3.8333F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(3.875F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.1667F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation8",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(3.875F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(3.9167F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.1667F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation9",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(3.9167F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(3.9583F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.1667F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation10",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(3.9583F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(4.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.1667F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation11",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(4.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(4.0417F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.1667F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation12",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(4.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(4.0833F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.1667F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation13",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(4.0833F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(4.125F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.1667F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation14",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(4.125F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(4.1667F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.1667F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation15",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(4.1667F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(4.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(5.1667F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodLayer2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 8.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(4.375F, KeyframeAnimations.posVec(0.0F, 8.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(5.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final AnimationDefinition DEATH_KEYFRAME = Builder.withLength(10.75F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 5.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-50.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.2917F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(10.5F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(10.75F, KeyframeAnimations.degreeVec(35.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 3.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, -2.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(10.25F, KeyframeAnimations.posVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(10.375F, KeyframeAnimations.posVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(10.625F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.5417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.625F, KeyframeAnimations.scaleVec(1.1F, 1.1F, 1.1F), Interpolations.LINEAR),
               new Keyframe(10.7083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shield",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shield2",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shield3",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shield4",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shield5",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shield6",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shield7",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 6.0F, -11.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 6.0F, -11.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation2",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation3",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(9.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rodRotation3",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 6.0F, -11.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation3",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation4",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 6.0F, -11.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation4",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation5",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 6.0F, -11.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation5",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation6",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 6.0F, -11.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation6",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation7",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 6.0F, -11.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation7",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation8",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 6.0F, -11.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation8",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation9",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 6.0F, -11.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation9",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation10",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 6.0F, -11.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation10",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation11",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 6.0F, -11.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation11",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation12",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 6.0F, -11.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation12",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation13",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 6.0F, -11.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation13",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation14",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 6.0F, -11.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation14",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation15",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 11.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 6.0F, -11.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation15",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation16",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, -19.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation16",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation17",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, -19.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation17",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation18",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, -19.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation18",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation19",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, -19.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation19",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation20",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, -19.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation20",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation21",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, -19.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation21",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation22",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, -19.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation22",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation23",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, -19.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation23",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation24",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, -19.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation24",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation25",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, -19.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation25",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation26",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, -7.0F, -13.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation26",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation27",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, -7.0F, -13.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation27",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation28",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, -7.0F, -13.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation28",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation29",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, -7.0F, -13.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation29",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation30",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, -7.0F, -13.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation30",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation31",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, -7.0F, -13.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation31",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation32",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 10.0F), Interpolations.LINEAR),
               new Keyframe(10.0833F, KeyframeAnimations.posVec(0.0F, -7.0F, -13.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rodRotation32",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(10.0417F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(10.125F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(10.2083F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .build();
}
