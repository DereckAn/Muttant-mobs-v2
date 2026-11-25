package com.alexander.mutantmore.animation.keyframe_animations.definition;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class MutantShulkerTurretKeyframeAnimations {
   public static final AnimationDefinition DEPLOY = Builder.withLength(3.25F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.96F, 0.0F, -0.96F), Interpolations.LINEAR),
               new Keyframe(0.0417F, KeyframeAnimations.degreeVec(1.49F, 0.0F, 0.57F), Interpolations.LINEAR),
               new Keyframe(0.0833F, KeyframeAnimations.degreeVec(-0.75F, 0.0F, 1.49F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-0.63F, 0.0F, 0.81F), Interpolations.LINEAR),
               new Keyframe(0.1667F, KeyframeAnimations.degreeVec(1.48F, 0.0F, -0.75F), Interpolations.LINEAR),
               new Keyframe(0.2083F, KeyframeAnimations.degreeVec(-1.06F, 0.0F, -1.5F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.26F, 0.0F, -0.63F), Interpolations.LINEAR),
               new Keyframe(0.2917F, KeyframeAnimations.degreeVec(1.36F, 0.0F, 0.91F), Interpolations.LINEAR),
               new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-1.3F, 0.0F, 1.48F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.13F, 0.0F, 0.45F), Interpolations.LINEAR),
               new Keyframe(0.4167F, KeyframeAnimations.degreeVec(1.15F, 0.0F, -1.06F), Interpolations.LINEAR),
               new Keyframe(0.4583F, KeyframeAnimations.degreeVec(-1.45F, 0.0F, -1.43F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.51F, 0.0F, -0.26F), Interpolations.LINEAR),
               new Keyframe(0.5417F, KeyframeAnimations.degreeVec(0.86F, 0.0F, 1.19F), Interpolations.LINEAR),
               new Keyframe(0.5833F, KeyframeAnimations.degreeVec(-1.5F, 0.0F, 1.36F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.86F, 0.0F, 0.07F), Interpolations.LINEAR),
               new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.51F, 0.0F, -1.3F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.degreeVec(-1.45F, 0.0F, -1.27F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(1.15F, 0.0F, 0.13F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.degreeVec(0.13F, 0.0F, 1.39F), Interpolations.LINEAR),
               new Keyframe(0.8333F, KeyframeAnimations.degreeVec(-1.3F, 0.0F, 1.15F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(1.36F, 0.0F, -0.32F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.degreeVec(-0.26F, 0.0F, -1.45F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.degreeVec(-1.06F, 0.0F, -1.01F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(1.48F, 0.0F, 0.51F), Interpolations.LINEAR),
               new Keyframe(1.0417F, KeyframeAnimations.degreeVec(-0.63F, 0.0F, 1.49F), Interpolations.LINEAR),
               new Keyframe(1.0833F, KeyframeAnimations.degreeVec(-0.75F, 0.0F, 0.86F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(1.49F, 0.0F, -0.69F), Interpolations.LINEAR),
               new Keyframe(1.1667F, KeyframeAnimations.degreeVec(-0.96F, 0.0F, -1.5F), Interpolations.LINEAR),
               new Keyframe(1.2083F, KeyframeAnimations.degreeVec(-0.39F, 0.0F, -0.69F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(1.41F, 0.0F, 0.86F), Interpolations.LINEAR),
               new Keyframe(1.2917F, KeyframeAnimations.degreeVec(-1.23F, 0.0F, 1.49F), Interpolations.LINEAR),
               new Keyframe(1.3333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.51F), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(1.23F, 0.0F, -1.01F), Interpolations.LINEAR),
               new Keyframe(1.4167F, KeyframeAnimations.degreeVec(-1.41F, 0.0F, -1.45F), Interpolations.LINEAR),
               new Keyframe(1.4583F, KeyframeAnimations.degreeVec(0.39F, 0.0F, -0.32F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.96F, 0.0F, 1.15F), Interpolations.LINEAR),
               new Keyframe(1.5417F, KeyframeAnimations.degreeVec(-1.49F, 0.0F, 1.39F), Interpolations.LINEAR),
               new Keyframe(1.5833F, KeyframeAnimations.degreeVec(0.75F, 0.0F, 0.13F), Interpolations.LINEAR),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(0.63F, 0.0F, -1.27F), Interpolations.LINEAR),
               new Keyframe(1.6667F, KeyframeAnimations.degreeVec(-1.48F, 0.0F, -1.3F), Interpolations.LINEAR),
               new Keyframe(1.7083F, KeyframeAnimations.degreeVec(1.06F, 0.0F, 0.07F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.26F, 0.0F, 1.36F), Interpolations.LINEAR),
               new Keyframe(1.7917F, KeyframeAnimations.degreeVec(-1.36F, 0.0F, 1.19F), Interpolations.LINEAR),
               new Keyframe(1.8333F, KeyframeAnimations.degreeVec(1.3F, 0.0F, -0.26F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(-0.13F, 0.0F, -1.43F), Interpolations.LINEAR),
               new Keyframe(1.9167F, KeyframeAnimations.degreeVec(-1.15F, 0.0F, -1.06F), Interpolations.LINEAR),
               new Keyframe(1.9583F, KeyframeAnimations.degreeVec(1.45F, 0.0F, 0.45F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-0.51F, 0.0F, 1.48F), Interpolations.LINEAR),
               new Keyframe(2.0417F, KeyframeAnimations.degreeVec(-0.86F, 0.0F, 0.91F), Interpolations.LINEAR),
               new Keyframe(2.0833F, KeyframeAnimations.degreeVec(1.5F, 0.0F, -0.63F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-0.86F, 0.0F, -1.5F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.degreeVec(-0.51F, 0.0F, -0.75F), Interpolations.LINEAR),
               new Keyframe(2.2083F, KeyframeAnimations.degreeVec(1.45F, 0.0F, 0.81F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-1.15F, 0.0F, 1.49F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.degreeVec(-0.13F, 0.0F, 0.57F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.degreeVec(1.3F, 0.0F, -0.96F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(-1.36F, 0.0F, -1.46F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.26F, 0.0F, -0.39F), Interpolations.LINEAR),
               new Keyframe(2.4583F, KeyframeAnimations.degreeVec(1.06F, 0.0F, 1.11F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-1.48F, 0.0F, 1.41F), Interpolations.LINEAR),
               new Keyframe(2.5417F, KeyframeAnimations.degreeVec(0.42F, 0.0F, 0.13F), Interpolations.LINEAR),
               new Keyframe(2.5833F, KeyframeAnimations.degreeVec(0.25F, 0.0F, -0.41F), Interpolations.LINEAR),
               new Keyframe(2.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 4.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.625F, KeyframeAnimations.posVec(0.0F, 4.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.625F, KeyframeAnimations.posVec(0.0F, 4.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "upperShell1",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, -360.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "upperShell1",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, -3.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shell2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -180.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, -180.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -90.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, -90.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shell2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -28.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -28.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, -16.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -16.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "upperShell2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 360.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.625F, KeyframeAnimations.degreeVec(0.0F, 360.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "upperShell2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.625F, KeyframeAnimations.posVec(0.0F, -3.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shell3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 90.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(0.0F, 90.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "upperShell3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, -360.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "upperShell3",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -3.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, -3.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final AnimationDefinition TOP_SHOOT = Builder.withLength(1.125F)
      .addAnimation(
         "upperShell3",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0417F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head3",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 1.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 1.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head3",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.0208F, KeyframeAnimations.scaleVec(1.006F, 1.006F, 1.006F), Interpolations.LINEAR),
               new Keyframe(0.0417F, KeyframeAnimations.scaleVec(1.0092F, 1.0092F, 1.0092F), Interpolations.LINEAR),
               new Keyframe(0.0625F, KeyframeAnimations.scaleVec(1.0063F, 1.0063F, 1.0063F), Interpolations.LINEAR),
               new Keyframe(0.0833F, KeyframeAnimations.scaleVec(1.0191F, 1.0191F, 1.0191F), Interpolations.LINEAR),
               new Keyframe(0.1042F, KeyframeAnimations.scaleVec(1.0298F, 1.0298F, 1.0298F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.0162F, 1.0162F, 1.0162F), Interpolations.LINEAR),
               new Keyframe(0.1458F, KeyframeAnimations.scaleVec(1.0217F, 1.0217F, 1.0217F), Interpolations.LINEAR),
               new Keyframe(0.1667F, KeyframeAnimations.scaleVec(1.0493F, 1.0493F, 1.0493F), Interpolations.LINEAR),
               new Keyframe(0.1875F, KeyframeAnimations.scaleVec(1.0383F, 1.0383F, 1.0383F), Interpolations.LINEAR),
               new Keyframe(0.2083F, KeyframeAnimations.scaleVec(1.0213F, 1.0213F, 1.0213F), Interpolations.LINEAR),
               new Keyframe(0.2292F, KeyframeAnimations.scaleVec(1.0558F, 1.0558F, 1.0558F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.scaleVec(1.0692F, 1.0692F, 1.0692F), Interpolations.LINEAR),
               new Keyframe(0.2708F, KeyframeAnimations.scaleVec(1.0322F, 1.0322F, 1.0322F), Interpolations.LINEAR),
               new Keyframe(0.2917F, KeyframeAnimations.scaleVec(1.0476F, 1.0476F, 1.0476F), Interpolations.LINEAR),
               new Keyframe(0.3125F, KeyframeAnimations.scaleVec(1.0935F, 1.0935F, 1.0935F), Interpolations.LINEAR),
               new Keyframe(0.3333F, KeyframeAnimations.scaleVec(1.0628F, 1.0628F, 1.0628F), Interpolations.LINEAR),
               new Keyframe(0.3542F, KeyframeAnimations.scaleVec(1.0377F, 1.0377F, 1.0377F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.scaleVec(1.0965F, 1.0965F, 1.0965F), Interpolations.LINEAR),
               new Keyframe(0.3958F, KeyframeAnimations.scaleVec(1.105F, 1.105F, 1.105F), Interpolations.LINEAR),
               new Keyframe(0.4167F, KeyframeAnimations.scaleVec(1.0461F, 1.0461F, 1.0461F), Interpolations.LINEAR),
               new Keyframe(0.4375F, KeyframeAnimations.scaleVec(1.078F, 1.078F, 1.078F), Interpolations.LINEAR),
               new Keyframe(0.4583F, KeyframeAnimations.scaleVec(1.1375F, 1.1375F, 1.1375F), Interpolations.LINEAR),
               new Keyframe(0.4792F, KeyframeAnimations.scaleVec(1.0828F, 1.0828F, 1.0828F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0567F, 1.0567F, 1.0567F), Interpolations.LINEAR),
               new Keyframe(0.5208F, KeyframeAnimations.scaleVec(1.1182F, 1.1182F, 1.1182F), Interpolations.LINEAR),
               new Keyframe(0.5417F, KeyframeAnimations.scaleVec(1.0929F, 1.0929F, 1.0929F), Interpolations.LINEAR),
               new Keyframe(0.5625F, KeyframeAnimations.scaleVec(1.0023F, 1.0023F, 1.0023F), Interpolations.LINEAR),
               new Keyframe(0.5833F, KeyframeAnimations.scaleVec(1.0304F, 1.0304F, 1.0304F), Interpolations.LINEAR),
               new Keyframe(0.6042F, KeyframeAnimations.scaleVec(1.0658F, 1.0658F, 1.0658F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.scaleVec(0.9789F, 0.9789F, 0.9789F), Interpolations.LINEAR),
               new Keyframe(0.6458F, KeyframeAnimations.scaleVec(0.9446F, 0.9446F, 0.9446F), Interpolations.LINEAR),
               new Keyframe(0.6667F, KeyframeAnimations.scaleVec(1.0068F, 1.0068F, 1.0068F), Interpolations.LINEAR),
               new Keyframe(0.6875F, KeyframeAnimations.scaleVec(0.9691F, 0.9691F, 0.9691F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.scaleVec(0.8839F, 0.8839F, 0.8839F), Interpolations.LINEAR),
               new Keyframe(0.7292F, KeyframeAnimations.scaleVec(0.9217F, 0.9217F, 0.9217F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.scaleVec(0.947F, 0.947F, 0.947F), Interpolations.LINEAR),
               new Keyframe(0.7708F, KeyframeAnimations.scaleVec(0.9719F, 0.9719F, 0.9719F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.scaleVec(1.0668F, 1.0668F, 1.0668F), Interpolations.LINEAR),
               new Keyframe(0.8125F, KeyframeAnimations.scaleVec(1.2444F, 1.2444F, 1.2444F), Interpolations.LINEAR),
               new Keyframe(0.8333F, KeyframeAnimations.scaleVec(1.3115F, 1.3115F, 1.3115F), Interpolations.LINEAR),
               new Keyframe(0.8542F, KeyframeAnimations.scaleVec(1.35F, 1.35F, 1.35F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.scaleVec(1.5129F, 1.5129F, 1.5129F), Interpolations.LINEAR),
               new Keyframe(0.8958F, KeyframeAnimations.scaleVec(1.4531F, 1.4531F, 1.4531F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.scaleVec(1.3105F, 1.3105F, 1.3105F), Interpolations.LINEAR),
               new Keyframe(0.9375F, KeyframeAnimations.scaleVec(1.2366F, 1.2366F, 1.2366F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.scaleVec(1.1825F, 1.1825F, 1.1825F), Interpolations.LINEAR),
               new Keyframe(0.9792F, KeyframeAnimations.scaleVec(1.0839F, 1.0839F, 1.0839F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final AnimationDefinition MIDDLE_SHOOT = Builder.withLength(1.125F)
      .addAnimation(
         "upperShell2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0417F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 1.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 1.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head2",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.0208F, KeyframeAnimations.scaleVec(1.006F, 1.006F, 1.006F), Interpolations.LINEAR),
               new Keyframe(0.0417F, KeyframeAnimations.scaleVec(1.0092F, 1.0092F, 1.0092F), Interpolations.LINEAR),
               new Keyframe(0.0625F, KeyframeAnimations.scaleVec(1.0063F, 1.0063F, 1.0063F), Interpolations.LINEAR),
               new Keyframe(0.0833F, KeyframeAnimations.scaleVec(1.0191F, 1.0191F, 1.0191F), Interpolations.LINEAR),
               new Keyframe(0.1042F, KeyframeAnimations.scaleVec(1.0298F, 1.0298F, 1.0298F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.0162F, 1.0162F, 1.0162F), Interpolations.LINEAR),
               new Keyframe(0.1458F, KeyframeAnimations.scaleVec(1.0217F, 1.0217F, 1.0217F), Interpolations.LINEAR),
               new Keyframe(0.1667F, KeyframeAnimations.scaleVec(1.0493F, 1.0493F, 1.0493F), Interpolations.LINEAR),
               new Keyframe(0.1875F, KeyframeAnimations.scaleVec(1.0383F, 1.0383F, 1.0383F), Interpolations.LINEAR),
               new Keyframe(0.2083F, KeyframeAnimations.scaleVec(1.0213F, 1.0213F, 1.0213F), Interpolations.LINEAR),
               new Keyframe(0.2292F, KeyframeAnimations.scaleVec(1.0558F, 1.0558F, 1.0558F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.scaleVec(1.0692F, 1.0692F, 1.0692F), Interpolations.LINEAR),
               new Keyframe(0.2708F, KeyframeAnimations.scaleVec(1.0322F, 1.0322F, 1.0322F), Interpolations.LINEAR),
               new Keyframe(0.2917F, KeyframeAnimations.scaleVec(1.0476F, 1.0476F, 1.0476F), Interpolations.LINEAR),
               new Keyframe(0.3125F, KeyframeAnimations.scaleVec(1.0935F, 1.0935F, 1.0935F), Interpolations.LINEAR),
               new Keyframe(0.3333F, KeyframeAnimations.scaleVec(1.0628F, 1.0628F, 1.0628F), Interpolations.LINEAR),
               new Keyframe(0.3542F, KeyframeAnimations.scaleVec(1.0377F, 1.0377F, 1.0377F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.scaleVec(1.0965F, 1.0965F, 1.0965F), Interpolations.LINEAR),
               new Keyframe(0.3958F, KeyframeAnimations.scaleVec(1.105F, 1.105F, 1.105F), Interpolations.LINEAR),
               new Keyframe(0.4167F, KeyframeAnimations.scaleVec(1.0461F, 1.0461F, 1.0461F), Interpolations.LINEAR),
               new Keyframe(0.4375F, KeyframeAnimations.scaleVec(1.078F, 1.078F, 1.078F), Interpolations.LINEAR),
               new Keyframe(0.4583F, KeyframeAnimations.scaleVec(1.1375F, 1.1375F, 1.1375F), Interpolations.LINEAR),
               new Keyframe(0.4792F, KeyframeAnimations.scaleVec(1.0828F, 1.0828F, 1.0828F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0567F, 1.0567F, 1.0567F), Interpolations.LINEAR),
               new Keyframe(0.5208F, KeyframeAnimations.scaleVec(1.1182F, 1.1182F, 1.1182F), Interpolations.LINEAR),
               new Keyframe(0.5417F, KeyframeAnimations.scaleVec(1.0929F, 1.0929F, 1.0929F), Interpolations.LINEAR),
               new Keyframe(0.5625F, KeyframeAnimations.scaleVec(1.0023F, 1.0023F, 1.0023F), Interpolations.LINEAR),
               new Keyframe(0.5833F, KeyframeAnimations.scaleVec(1.0304F, 1.0304F, 1.0304F), Interpolations.LINEAR),
               new Keyframe(0.6042F, KeyframeAnimations.scaleVec(1.0658F, 1.0658F, 1.0658F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.scaleVec(0.9789F, 0.9789F, 0.9789F), Interpolations.LINEAR),
               new Keyframe(0.6458F, KeyframeAnimations.scaleVec(0.9446F, 0.9446F, 0.9446F), Interpolations.LINEAR),
               new Keyframe(0.6667F, KeyframeAnimations.scaleVec(1.0068F, 1.0068F, 1.0068F), Interpolations.LINEAR),
               new Keyframe(0.6875F, KeyframeAnimations.scaleVec(0.9691F, 0.9691F, 0.9691F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.scaleVec(0.8839F, 0.8839F, 0.8839F), Interpolations.LINEAR),
               new Keyframe(0.7292F, KeyframeAnimations.scaleVec(0.9217F, 0.9217F, 0.9217F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.scaleVec(0.947F, 0.947F, 0.947F), Interpolations.LINEAR),
               new Keyframe(0.7708F, KeyframeAnimations.scaleVec(0.9719F, 0.9719F, 0.9719F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.scaleVec(1.0668F, 1.0668F, 1.0668F), Interpolations.LINEAR),
               new Keyframe(0.8125F, KeyframeAnimations.scaleVec(1.2444F, 1.2444F, 1.2444F), Interpolations.LINEAR),
               new Keyframe(0.8333F, KeyframeAnimations.scaleVec(1.3115F, 1.3115F, 1.3115F), Interpolations.LINEAR),
               new Keyframe(0.8542F, KeyframeAnimations.scaleVec(1.35F, 1.35F, 1.35F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.scaleVec(1.5129F, 1.5129F, 1.5129F), Interpolations.LINEAR),
               new Keyframe(0.8958F, KeyframeAnimations.scaleVec(1.4531F, 1.4531F, 1.4531F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.scaleVec(1.3105F, 1.3105F, 1.3105F), Interpolations.LINEAR),
               new Keyframe(0.9375F, KeyframeAnimations.scaleVec(1.2366F, 1.2366F, 1.2366F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.scaleVec(1.1825F, 1.1825F, 1.1825F), Interpolations.LINEAR),
               new Keyframe(0.9792F, KeyframeAnimations.scaleVec(1.0839F, 1.0839F, 1.0839F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final AnimationDefinition BOTTOM_SHOOT = Builder.withLength(1.125F)
      .addAnimation(
         "upperShell1",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0417F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 1.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 1.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.0208F, KeyframeAnimations.scaleVec(1.006F, 1.006F, 1.006F), Interpolations.LINEAR),
               new Keyframe(0.0417F, KeyframeAnimations.scaleVec(1.0092F, 1.0092F, 1.0092F), Interpolations.LINEAR),
               new Keyframe(0.0625F, KeyframeAnimations.scaleVec(1.0063F, 1.0063F, 1.0063F), Interpolations.LINEAR),
               new Keyframe(0.0833F, KeyframeAnimations.scaleVec(1.0191F, 1.0191F, 1.0191F), Interpolations.LINEAR),
               new Keyframe(0.1042F, KeyframeAnimations.scaleVec(1.0298F, 1.0298F, 1.0298F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.0162F, 1.0162F, 1.0162F), Interpolations.LINEAR),
               new Keyframe(0.1458F, KeyframeAnimations.scaleVec(1.0217F, 1.0217F, 1.0217F), Interpolations.LINEAR),
               new Keyframe(0.1667F, KeyframeAnimations.scaleVec(1.0493F, 1.0493F, 1.0493F), Interpolations.LINEAR),
               new Keyframe(0.1875F, KeyframeAnimations.scaleVec(1.0383F, 1.0383F, 1.0383F), Interpolations.LINEAR),
               new Keyframe(0.2083F, KeyframeAnimations.scaleVec(1.0213F, 1.0213F, 1.0213F), Interpolations.LINEAR),
               new Keyframe(0.2292F, KeyframeAnimations.scaleVec(1.0558F, 1.0558F, 1.0558F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.scaleVec(1.0692F, 1.0692F, 1.0692F), Interpolations.LINEAR),
               new Keyframe(0.2708F, KeyframeAnimations.scaleVec(1.0322F, 1.0322F, 1.0322F), Interpolations.LINEAR),
               new Keyframe(0.2917F, KeyframeAnimations.scaleVec(1.0476F, 1.0476F, 1.0476F), Interpolations.LINEAR),
               new Keyframe(0.3125F, KeyframeAnimations.scaleVec(1.0935F, 1.0935F, 1.0935F), Interpolations.LINEAR),
               new Keyframe(0.3333F, KeyframeAnimations.scaleVec(1.0628F, 1.0628F, 1.0628F), Interpolations.LINEAR),
               new Keyframe(0.3542F, KeyframeAnimations.scaleVec(1.0377F, 1.0377F, 1.0377F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.scaleVec(1.0965F, 1.0965F, 1.0965F), Interpolations.LINEAR),
               new Keyframe(0.3958F, KeyframeAnimations.scaleVec(1.105F, 1.105F, 1.105F), Interpolations.LINEAR),
               new Keyframe(0.4167F, KeyframeAnimations.scaleVec(1.0461F, 1.0461F, 1.0461F), Interpolations.LINEAR),
               new Keyframe(0.4375F, KeyframeAnimations.scaleVec(1.078F, 1.078F, 1.078F), Interpolations.LINEAR),
               new Keyframe(0.4583F, KeyframeAnimations.scaleVec(1.1375F, 1.1375F, 1.1375F), Interpolations.LINEAR),
               new Keyframe(0.4792F, KeyframeAnimations.scaleVec(1.0828F, 1.0828F, 1.0828F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0567F, 1.0567F, 1.0567F), Interpolations.LINEAR),
               new Keyframe(0.5208F, KeyframeAnimations.scaleVec(1.1182F, 1.1182F, 1.1182F), Interpolations.LINEAR),
               new Keyframe(0.5417F, KeyframeAnimations.scaleVec(1.0929F, 1.0929F, 1.0929F), Interpolations.LINEAR),
               new Keyframe(0.5625F, KeyframeAnimations.scaleVec(1.0023F, 1.0023F, 1.0023F), Interpolations.LINEAR),
               new Keyframe(0.5833F, KeyframeAnimations.scaleVec(1.0304F, 1.0304F, 1.0304F), Interpolations.LINEAR),
               new Keyframe(0.6042F, KeyframeAnimations.scaleVec(1.0658F, 1.0658F, 1.0658F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.scaleVec(0.9789F, 0.9789F, 0.9789F), Interpolations.LINEAR),
               new Keyframe(0.6458F, KeyframeAnimations.scaleVec(0.9446F, 0.9446F, 0.9446F), Interpolations.LINEAR),
               new Keyframe(0.6667F, KeyframeAnimations.scaleVec(1.0068F, 1.0068F, 1.0068F), Interpolations.LINEAR),
               new Keyframe(0.6875F, KeyframeAnimations.scaleVec(0.9691F, 0.9691F, 0.9691F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.scaleVec(0.8839F, 0.8839F, 0.8839F), Interpolations.LINEAR),
               new Keyframe(0.7292F, KeyframeAnimations.scaleVec(0.9217F, 0.9217F, 0.9217F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.scaleVec(0.947F, 0.947F, 0.947F), Interpolations.LINEAR),
               new Keyframe(0.7708F, KeyframeAnimations.scaleVec(0.9719F, 0.9719F, 0.9719F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.scaleVec(1.0668F, 1.0668F, 1.0668F), Interpolations.LINEAR),
               new Keyframe(0.8125F, KeyframeAnimations.scaleVec(1.2444F, 1.2444F, 1.2444F), Interpolations.LINEAR),
               new Keyframe(0.8333F, KeyframeAnimations.scaleVec(1.3115F, 1.3115F, 1.3115F), Interpolations.LINEAR),
               new Keyframe(0.8542F, KeyframeAnimations.scaleVec(1.35F, 1.35F, 1.35F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.scaleVec(1.5129F, 1.5129F, 1.5129F), Interpolations.LINEAR),
               new Keyframe(0.8958F, KeyframeAnimations.scaleVec(1.4531F, 1.4531F, 1.4531F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.scaleVec(1.3105F, 1.3105F, 1.3105F), Interpolations.LINEAR),
               new Keyframe(0.9375F, KeyframeAnimations.scaleVec(1.2366F, 1.2366F, 1.2366F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.scaleVec(1.1825F, 1.1825F, 1.1825F), Interpolations.LINEAR),
               new Keyframe(0.9792F, KeyframeAnimations.scaleVec(1.0839F, 1.0839F, 1.0839F), Interpolations.LINEAR),
               new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .build();
}
