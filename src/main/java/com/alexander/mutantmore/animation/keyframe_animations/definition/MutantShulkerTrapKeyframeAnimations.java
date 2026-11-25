package com.alexander.mutantmore.animation.keyframe_animations.definition;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class MutantShulkerTrapKeyframeAnimations {
   public static final AnimationDefinition ACTIVATE = Builder.withLength(1.0F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.5F, 0.5F, 0.5F), Interpolations.LINEAR),
               new Keyframe(0.0208F, KeyframeAnimations.posVec(0.37F, 0.23F, 0.31F), Interpolations.LINEAR),
               new Keyframe(0.0417F, KeyframeAnimations.posVec(0.06F, -0.29F, -0.12F), Interpolations.LINEAR),
               new Keyframe(0.0625F, KeyframeAnimations.posVec(-0.29F, -0.5F, -0.46F), Interpolations.LINEAR),
               new Keyframe(0.0833F, KeyframeAnimations.posVec(-0.49F, -0.17F, -0.44F), Interpolations.LINEAR),
               new Keyframe(0.1042F, KeyframeAnimations.posVec(-0.44F, 0.34F, -0.08F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(-0.17F, 0.48F, 0.34F), Interpolations.LINEAR),
               new Keyframe(0.1458F, KeyframeAnimations.posVec(0.18F, 0.44F, 0.5F), Interpolations.LINEAR),
               new Keyframe(0.1667F, KeyframeAnimations.posVec(0.45F, 0.28F, 0.27F), Interpolations.LINEAR),
               new Keyframe(0.1875F, KeyframeAnimations.posVec(0.48F, 0.54F, -0.16F), Interpolations.LINEAR),
               new Keyframe(0.2083F, KeyframeAnimations.posVec(0.27F, 1.29F, -0.47F), Interpolations.LINEAR),
               new Keyframe(0.2292F, KeyframeAnimations.posVec(-0.07F, 2.09F, -0.42F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(-0.38F, 2.43F, -0.04F), Interpolations.LINEAR),
               new Keyframe(0.2708F, KeyframeAnimations.posVec(-0.42F, 1.65F, 0.31F), Interpolations.LINEAR),
               new Keyframe(0.2917F, KeyframeAnimations.posVec(-0.24F, 1.03F, 0.33F), Interpolations.LINEAR),
               new Keyframe(0.3125F, KeyframeAnimations.posVec(-0.02F, 0.8F, 0.12F), Interpolations.LINEAR),
               new Keyframe(0.3333F, KeyframeAnimations.posVec(0.1F, 0.7F, -0.07F), Interpolations.LINEAR),
               new Keyframe(0.3542F, KeyframeAnimations.posVec(0.08F, 0.41F, -0.08F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -4.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "side1",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "side1",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 4.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "side2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "side2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -4.0F), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final AnimationDefinition VANISH = Builder.withLength(1.5F)
      .addAnimation(
         "side1",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, -6.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "side1",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.375F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "side2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -6.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "side2",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.0417F, KeyframeAnimations.degreeVec(0.0F, 0.35F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.0833F, KeyframeAnimations.degreeVec(0.0F, 1.39F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 3.12F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.1667F, KeyframeAnimations.degreeVec(0.0F, 5.56F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.2083F, KeyframeAnimations.degreeVec(0.0F, 8.68F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.2917F, KeyframeAnimations.degreeVec(0.0F, 17.01F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.3333F, KeyframeAnimations.degreeVec(0.0F, 22.22F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 28.12F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4167F, KeyframeAnimations.degreeVec(0.0F, 34.72F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.4583F, KeyframeAnimations.degreeVec(0.0F, 42.01F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 50.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5417F, KeyframeAnimations.degreeVec(0.0F, 58.68F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5833F, KeyframeAnimations.degreeVec(0.0F, 68.06F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 78.12F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, 88.89F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.degreeVec(0.0F, 100.35F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 112.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.degreeVec(0.0F, 125.35F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.8333F, KeyframeAnimations.degreeVec(0.0F, 138.89F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 153.12F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.degreeVec(0.0F, 168.06F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.degreeVec(0.0F, 183.68F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 200.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0417F, KeyframeAnimations.degreeVec(0.0F, 217.01F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0833F, KeyframeAnimations.degreeVec(0.0F, 234.72F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 253.12F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.degreeVec(0.0F, 272.22F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.2083F, KeyframeAnimations.degreeVec(0.0F, 292.01F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 312.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.2917F, KeyframeAnimations.degreeVec(0.0F, 333.68F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.3333F, KeyframeAnimations.degreeVec(0.0F, 355.56F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, 378.13F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.4167F, KeyframeAnimations.degreeVec(0.0F, 401.39F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.4583F, KeyframeAnimations.degreeVec(0.0F, 425.35F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 450.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.posVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(1.1667F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(1.2917F, KeyframeAnimations.scaleVec(0.9F, 0.9F, 0.9F), Interpolations.LINEAR),
               new Keyframe(1.4167F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final AnimationDefinition PLAYER_ACTIVATE = Builder.withLength(1.0F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.5F, 0.5F, 0.5F), Interpolations.LINEAR),
               new Keyframe(0.0208F, KeyframeAnimations.posVec(0.37F, 0.23F, 0.31F), Interpolations.LINEAR),
               new Keyframe(0.0417F, KeyframeAnimations.posVec(0.06F, -0.29F, -0.12F), Interpolations.LINEAR),
               new Keyframe(0.0625F, KeyframeAnimations.posVec(-0.29F, -0.5F, -0.46F), Interpolations.LINEAR),
               new Keyframe(0.0833F, KeyframeAnimations.posVec(-0.49F, -0.17F, -0.44F), Interpolations.LINEAR),
               new Keyframe(0.1042F, KeyframeAnimations.posVec(-0.44F, 0.34F, -0.08F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(-0.17F, 0.48F, 0.34F), Interpolations.LINEAR),
               new Keyframe(0.1458F, KeyframeAnimations.posVec(0.18F, 0.44F, 0.5F), Interpolations.LINEAR),
               new Keyframe(0.1667F, KeyframeAnimations.posVec(0.45F, 0.28F, 0.27F), Interpolations.LINEAR),
               new Keyframe(0.1875F, KeyframeAnimations.posVec(0.48F, 0.54F, -0.16F), Interpolations.LINEAR),
               new Keyframe(0.2083F, KeyframeAnimations.posVec(0.27F, 1.29F, -0.47F), Interpolations.LINEAR),
               new Keyframe(0.2292F, KeyframeAnimations.posVec(-0.07F, 2.09F, -0.42F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(-0.38F, 2.43F, -0.04F), Interpolations.LINEAR),
               new Keyframe(0.2708F, KeyframeAnimations.posVec(-0.42F, 1.65F, 0.31F), Interpolations.LINEAR),
               new Keyframe(0.2917F, KeyframeAnimations.posVec(-0.24F, 1.03F, 0.33F), Interpolations.LINEAR),
               new Keyframe(0.3125F, KeyframeAnimations.posVec(-0.02F, 0.8F, 0.12F), Interpolations.LINEAR),
               new Keyframe(0.3333F, KeyframeAnimations.posVec(0.1F, 0.7F, -0.07F), Interpolations.LINEAR),
               new Keyframe(0.3542F, KeyframeAnimations.posVec(0.08F, 0.41F, -0.08F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "side1",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "side1",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 4.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 4.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "side2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "side2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -4.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -4.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .build();
}
