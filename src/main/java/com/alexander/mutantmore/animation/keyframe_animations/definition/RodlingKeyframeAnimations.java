package com.alexander.mutantmore.animation.keyframe_animations.definition;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class RodlingKeyframeAnimations {
   public static final AnimationDefinition SHOOT = Builder.withLength(1.125F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.0208F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.05F), Interpolations.LINEAR),
               new Keyframe(0.0417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.03F), Interpolations.LINEAR),
               new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.21F), Interpolations.LINEAR),
               new Keyframe(0.0833F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.08F), Interpolations.LINEAR),
               new Keyframe(0.1042F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.34F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.36F), Interpolations.LINEAR),
               new Keyframe(0.1458F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.32F), Interpolations.LINEAR),
               new Keyframe(0.1667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.71F), Interpolations.LINEAR),
               new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.04F), Interpolations.LINEAR),
               new Keyframe(0.2083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.98F), Interpolations.LINEAR),
               new Keyframe(0.2292F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.49F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.97F), Interpolations.LINEAR),
               new Keyframe(0.2708F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.14F), Interpolations.LINEAR),
               new Keyframe(0.2917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.57F), Interpolations.LINEAR),
               new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.67F), Interpolations.LINEAR),
               new Keyframe(0.3333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.21F), Interpolations.LINEAR),
               new Keyframe(0.3542F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.83F), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.2F), Interpolations.LINEAR),
               new Keyframe(0.3958F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.45F), Interpolations.LINEAR),
               new Keyframe(0.4167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.09F), Interpolations.LINEAR),
               new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.53F), Interpolations.LINEAR),
               new Keyframe(0.4583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 2.55F), Interpolations.LINEAR),
               new Keyframe(0.4792F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.72F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.37F), Interpolations.LINEAR),
               new Keyframe(0.5208F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.96F), Interpolations.LINEAR),
               new Keyframe(0.5417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.51F), Interpolations.LINEAR),
               new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.79F), Interpolations.LINEAR),
               new Keyframe(0.5833F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.17F), Interpolations.LINEAR),
               new Keyframe(0.6042F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 2.94F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.27F), Interpolations.LINEAR),
               new Keyframe(0.6458F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.27F), Interpolations.LINEAR),
               new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 2.19F), Interpolations.LINEAR),
               new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.94F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.07F), Interpolations.LINEAR),
               new Keyframe(0.7292F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.17F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.2F), Interpolations.LINEAR),
               new Keyframe(0.7708F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.49F), Interpolations.LINEAR),
               new Keyframe(0.7917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -0.34F), Interpolations.LINEAR),
               new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.18F), Interpolations.LINEAR),
               new Keyframe(0.8333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8333F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 1.0F, 3.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.5F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 0.2F, -1.3F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rods",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 2.0F, 1.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rodRemainsUpper",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5417F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rodRemainsUpper",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, 1.0F, 1.5F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rodRemainsLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5833F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rodRemainsLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5833F, KeyframeAnimations.posVec(0.0F, 0.5F, 1.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "core",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.5F), Interpolations.CATMULLROM),
               new Keyframe(0.8333F, KeyframeAnimations.posVec(0.0F, 0.5F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "coreRing",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.5F), Interpolations.CATMULLROM),
               new Keyframe(0.8333F, KeyframeAnimations.posVec(0.0F, 0.5F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition SIT = Builder.withLength(0.0F)
      .looping()
      .addAnimation(
         "everything",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -0.5F, -0.25F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "rods",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 45.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rod1",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 90.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rod1",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.5F, 1.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "shield1",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.5F, 1.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rod2",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 90.0F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "rod2",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.5F, -1.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "shield2",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.5F, -1.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rodRemainsUpper",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rodRemainsLower",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "coreRing",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
      )
      .build();
   public static final AnimationDefinition NOVELTY = Builder.withLength(1.5F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-360.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.91F, 0.0F, 3.49F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -2.0F, -3.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rods",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(360.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rodRemainsLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rodRemainsLower",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 1.0F, 2.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "coreRing",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(360.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition PROJECTILE = Builder.withLength(0.0F)
      .looping()
      .addAnimation(
         "everything",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "everything",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -3.5F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "head",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "head",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rods",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 45.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rod1",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "shield1",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rod2",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "shield2",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "rodRemainsLower",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "core",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "coreRing",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
      )
      .build();
}
