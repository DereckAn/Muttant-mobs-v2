package com.alexander.mutantmore.animation.keyframe_animations.definition;

import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class MutantHuskKeyframeAnimations {
   private static float floatMax = Float.MAX_VALUE;
   public static final AnimationDefinition MUTANT_HUSK_ATTACK = Builder.withLength(1.3433332F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(2.01F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-100.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-180.0F, 2.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-105.0F, 2.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-105.0F, 2.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-100.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-180.0F, -2.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-105.0F, -2.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-105.0F, -2.5F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "sandBlock",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
      )
      .build();
   public static final AnimationDefinition MUTANT_HUSK_TRAP = Builder.withLength(2.75F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(5.79F, 11.43F, 6.99F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(5.79F, 11.43F, 6.99F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(23.54F, -28.56F, 3.6F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(23.54F, -28.56F, 3.6F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(23.54F, -28.56F, 3.6F), Interpolations.LINEAR),
               new Keyframe(1.9167666F, KeyframeAnimations.degreeVec(23.54F, -28.56F, 3.6F), Interpolations.CATMULLROM),
               new Keyframe(2.4167664F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.6766665F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(25.7F, 7.57F, 7.32F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(25.7F, 7.57F, 7.32F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(27.12F, -19.42F, -5.97F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(27.12F, -19.42F, -5.97F), Interpolations.LINEAR),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(27.12F, -19.42F, -5.97F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(27.12F, -19.42F, -5.97F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.1676667F, KeyframeAnimations.posVec(-1.0F, 0.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(1.2083433F, KeyframeAnimations.posVec(-1.0F, 0.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(1.9167666F, KeyframeAnimations.posVec(-1.0F, 0.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(1.9583433F, KeyframeAnimations.posVec(-1.0F, 0.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.6766665F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-15.05F, -20.12F, -3.62F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-15.05F, -20.12F, -3.62F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-31.47F, 30.66F, -17.48F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-31.47F, 30.66F, -17.48F), Interpolations.LINEAR),
               new Keyframe(1.9167666F, KeyframeAnimations.degreeVec(-31.47F, 30.66F, -17.48F), Interpolations.LINEAR),
               new Keyframe(1.9583433F, KeyframeAnimations.degreeVec(-31.47F, 30.66F, -17.48F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.6766665F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(9.91F, -20.75F, -26.7F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(9.91F, -20.75F, -26.7F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(35.78F, -17.89F, -36.86F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(35.78F, -17.89F, -36.86F), Interpolations.CATMULLROM),
               new Keyframe(2.2916765F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5834334F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(-2.0F, 0.0F, 6.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(-2.0F, 0.0F, 6.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.posVec(0.0F, -1.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.posVec(0.0F, -1.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.posVec(0.0F, -1.0F, -2.0F), Interpolations.LINEAR),
               new Keyframe(1.7083433F, KeyframeAnimations.posVec(0.0F, -1.0F, -2.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, -1.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(2.4583435F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(24.41F, 2.55F, 16.68F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(24.41F, 2.55F, 16.68F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-84.18F, 31.25F, -24.28F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-84.18F, 31.25F, -24.28F), Interpolations.LINEAR),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(-84.18F, 31.25F, -24.28F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(-84.18F, 31.25F, -24.28F), Interpolations.CATMULLROM),
               new Keyframe(2.4583435F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(2.625F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-112.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.1676664F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.4167664F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "sandBlock",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
      )
      .build();
   public static final AnimationDefinition MUTANT_HUSK_JUMP = Builder.withLength(0.375F)
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
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
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
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
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
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(27.5F, 2.5F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-176.68F, -14.64F, -12.93F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-39.89F, 3.21F, 3.83F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
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
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
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
         "sandBlock",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
      )
      .build();
   public static final AnimationDefinition MUTANT_HUSK_SLAM = Builder.withLength(0.625F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
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
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
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
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
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
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-176.68F, -14.64F, -12.93F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-76.93F, 12.51F, -0.04F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-76.93F, 12.51F, -0.04F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-39.89F, 3.21F, 3.83F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-17.11F, 3.73F, 11.94F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-17.11F, 3.73F, 11.94F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
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
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -4.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
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
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM)
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
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "sandBlock",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
      )
      .build();
   public static final AnimationDefinition MUTANT_HUSK_ROAR = Builder.withLength(6.0F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5417F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5833F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6667F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7917F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8333F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9167F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9583F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3333F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7917F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5833F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.3333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.7083F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.5F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2917F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3333F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5417F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5833F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6667F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7917F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8333F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9167F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9583F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(70.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7917F, KeyframeAnimations.degreeVec(70.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 5.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(10.0F, 0.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 5.0F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(10.0F, 0.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 5.0F), Interpolations.CATMULLROM),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.7083F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.5F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8333F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2083F, KeyframeAnimations.degreeVec(-50.0F, -15.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(-50.0F, 15.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(2.4167F, KeyframeAnimations.degreeVec(-70.0F, 7.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(2.9167F, KeyframeAnimations.degreeVec(-70.0F, -7.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(3.4167F, KeyframeAnimations.degreeVec(-80.0F, 0.0F, 25.0F), Interpolations.CATMULLROM),
               new Keyframe(3.9167F, KeyframeAnimations.degreeVec(-80.0F, 0.0F, -25.0F), Interpolations.CATMULLROM),
               new Keyframe(4.7083F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.5F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-99.59F, 3.78F, -12.6F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-100.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0833F, KeyframeAnimations.degreeVec(0.0F, -90.0F, -70.0F), Interpolations.CATMULLROM),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(-120.0F, 0.0F, -15.0F), Interpolations.CATMULLROM),
               new Keyframe(4.7083F, KeyframeAnimations.degreeVec(-105.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.5F, KeyframeAnimations.degreeVec(-105.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583F, KeyframeAnimations.degreeVec(-85.0F, 25.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7917F, KeyframeAnimations.degreeVec(-85.0F, 25.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-40.0F, 25.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.7083F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.5F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-99.59F, -3.78F, 12.6F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-100.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0833F, KeyframeAnimations.degreeVec(0.0F, 90.0F, 70.0F), Interpolations.CATMULLROM),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(-120.0F, 0.0F, 15.0F), Interpolations.CATMULLROM),
               new Keyframe(4.7083F, KeyframeAnimations.degreeVec(-105.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.5F, KeyframeAnimations.degreeVec(-105.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583F, KeyframeAnimations.degreeVec(-85.0F, -25.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7917F, KeyframeAnimations.degreeVec(-85.0F, -25.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-40.0F, -25.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.7083F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(5.5F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(6.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "sandBlock",
         new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
      )
      .build();
   public static final AnimationDefinition MUTANT_HUSK_THROW_SAND = Builder.withLength(2.375F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.9583433F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 1.0F, -3.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -9.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.posVec(4.0F, 3.93F, 4.95F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-94.84F, 12.39F, -18.78F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-89.84F, 14.89F, -18.77F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-46.54F, 11.59F, 1.39F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-122.2F, 6.99F, -7.51F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(-203.83F, -12.18F, -3.59F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-203.83F, -12.18F, -3.59F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(-107.46F, 3.07F, -11.38F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-107.46F, 3.07F, -11.38F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 1.0F, -3.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -9.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.posVec(-4.0F, 3.93F, 4.95F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-94.84F, -12.39F, 18.78F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-89.84F, -14.89F, 18.77F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-46.54F, -11.59F, -1.39F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-122.2F, -6.99F, 7.51F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(-203.83F, 12.18F, 3.59F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-203.83F, 12.18F, 3.59F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(-107.46F, -3.07F, 11.38F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-107.46F, -3.07F, 11.38F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "sandBlock",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.4167667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.posVec(2.0F, 6.0F, -3.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.posVec(2.0F, 6.0F, -2.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.posVec(-1.0F, 9.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(1.2083433F, KeyframeAnimations.posVec(-1.0F, 9.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(1.3433332F, KeyframeAnimations.posVec(3.0F, 6.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.4167666F, KeyframeAnimations.posVec(-5.0F, -21.0F, -18.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "sandBlock",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 12.5F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "sandBlock",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(0.4167667F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(0.5416766F, KeyframeAnimations.scaleVec(0.77F, 0.77F, 0.77F), Interpolations.LINEAR),
               new Keyframe(1.3433332F, KeyframeAnimations.scaleVec(0.77F, 0.77F, 0.77F), Interpolations.LINEAR),
               new Keyframe(1.4167666F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_HUSK_INTRO = Builder.withLength(2.5F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.041676663F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.041676663F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(-0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(0.2F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(70.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(70.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 5.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(10.0F, 0.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 5.0F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(10.0F, 0.0F, -5.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.1676664F, KeyframeAnimations.degreeVec(-80.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-99.59F, 3.78F, -12.6F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-100.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(0.0F, -90.0F, -70.0F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(-120.0F, 0.0F, -15.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-85.0F, 25.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-85.0F, 25.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-40.0F, 25.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-100.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-100.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(0.0F, 90.0F, 70.0F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(-120.0F, 0.0F, 15.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-85.0F, -25.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-85.0F, -25.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-40.0F, -25.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "sandBlock",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .build();

   public static AnimationDefinition MUTANT_HUSK_GEYSER(float ageInTicks) {
      return Builder.withLength(3.5F)
         .addAnimation(
            "pelvis",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(
                     1.0F,
                     KeyframeAnimations.degreeVec(
                        -2.5F,
                        0.0F,
                        SineWaveAnimationUtils.getSineWaveKeyframe(
                           0.5F, 5000.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 0.0F
                        )
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.5F,
                     KeyframeAnimations.degreeVec(
                        -2.5F,
                        0.0F,
                        SineWaveAnimationUtils.getSineWaveKeyframe(
                           1.5F, 5000.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 0.0F
                        )
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(80.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.75F, KeyframeAnimations.degreeVec(80.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(80.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(2.5F, KeyframeAnimations.degreeVec(80.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.1676664F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "body",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.875F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.5F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(2.625F, KeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.25F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "head",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.75F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.5F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.625F, KeyframeAnimations.degreeVec(-97.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.75F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.875F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(2.7916765F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(2.9167664F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.25F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArm",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.875F, KeyframeAnimations.degreeVec(-208.67F, -13.59F, -3.83F), Interpolations.CATMULLROM),
                  new Keyframe(1.5F, KeyframeAnimations.degreeVec(-208.67F, -13.59F, -3.83F), Interpolations.CATMULLROM),
                  new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-218.72F, -10.1F, -10.58F), Interpolations.CATMULLROM),
                  new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(-148.78F, -6.62F, -17.33F), Interpolations.CATMULLROM),
                  new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(-148.78F, -6.62F, -17.33F), Interpolations.LINEAR),
                  new Keyframe(2.375F, KeyframeAnimations.degreeVec(-148.78F, -6.62F, -17.33F), Interpolations.LINEAR),
                  new Keyframe(2.875F, KeyframeAnimations.degreeVec(-65.81F, -2.69F, -18.48F), Interpolations.CATMULLROM),
                  new Keyframe(3.25F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArmLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), Interpolations.CATMULLROM),
                  new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 17.5F), Interpolations.CATMULLROM),
                  new Keyframe(1.625F, KeyframeAnimations.degreeVec(-44.92F, -2.11F, 12.97F), Interpolations.CATMULLROM),
                  new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(-57.42F, -2.11F, 12.97F), Interpolations.CATMULLROM),
                  new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(-44.92F, -2.11F, 12.97F), Interpolations.CATMULLROM),
                  new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(-44.92F, -2.11F, 12.97F), Interpolations.LINEAR),
                  new Keyframe(2.25F, KeyframeAnimations.degreeVec(-44.92F, -2.11F, 12.97F), Interpolations.LINEAR),
                  new Keyframe(2.375F, KeyframeAnimations.degreeVec(-44.92F, -2.11F, 12.97F), Interpolations.CATMULLROM),
                  new Keyframe(2.5834334F, KeyframeAnimations.degreeVec(-69.49F, -1.82F, 11.18F), Interpolations.CATMULLROM),
                  new Keyframe(2.875F, KeyframeAnimations.degreeVec(-41.16F, -1.29F, 7.93F), Interpolations.CATMULLROM),
                  new Keyframe(3.25F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightArm",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.875F, KeyframeAnimations.degreeVec(-208.67F, 13.59F, 3.83F), Interpolations.CATMULLROM),
                  new Keyframe(1.5F, KeyframeAnimations.degreeVec(-208.67F, 13.59F, 3.83F), Interpolations.CATMULLROM),
                  new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-218.72F, 10.1F, 10.58F), Interpolations.CATMULLROM),
                  new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(-148.78F, 6.62F, 17.33F), Interpolations.CATMULLROM),
                  new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(-148.78F, 6.62F, 17.33F), Interpolations.LINEAR),
                  new Keyframe(2.375F, KeyframeAnimations.degreeVec(-148.78F, 6.62F, 17.33F), Interpolations.LINEAR),
                  new Keyframe(2.875F, KeyframeAnimations.degreeVec(-65.81F, 2.69F, 18.48F), Interpolations.CATMULLROM),
                  new Keyframe(3.25F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightArmLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), Interpolations.CATMULLROM),
                  new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -17.5F), Interpolations.CATMULLROM),
                  new Keyframe(1.625F, KeyframeAnimations.degreeVec(-44.92F, 2.11F, -12.97F), Interpolations.CATMULLROM),
                  new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(-57.42F, 2.11F, -12.97F), Interpolations.CATMULLROM),
                  new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(-44.92F, 2.11F, -12.97F), Interpolations.CATMULLROM),
                  new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(-44.92F, 2.11F, -12.97F), Interpolations.LINEAR),
                  new Keyframe(2.25F, KeyframeAnimations.degreeVec(-44.92F, 2.11F, -12.97F), Interpolations.LINEAR),
                  new Keyframe(2.375F, KeyframeAnimations.degreeVec(-44.92F, 2.11F, -12.97F), Interpolations.CATMULLROM),
                  new Keyframe(2.5834334F, KeyframeAnimations.degreeVec(-69.49F, 1.82F, -11.18F), Interpolations.CATMULLROM),
                  new Keyframe(2.875F, KeyframeAnimations.degreeVec(-41.16F, 1.29F, -7.93F), Interpolations.CATMULLROM),
                  new Keyframe(3.25F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightLeg",
            new AnimationChannel(
               Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)}
            )
         )
         .addAnimation(
            "rightLegLower",
            new AnimationChannel(
               Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)}
            )
         )
         .addAnimation(
            "leftLeg",
            new AnimationChannel(
               Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)}
            )
         )
         .addAnimation(
            "leftLegLower",
            new AnimationChannel(
               Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)}
            )
         )
         .addAnimation(
            "sandBlock",
            new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
         )
         .build();
   }

   public static AnimationDefinition MUTANT_HUSK_NOVELTY(float ageInTicks) {
      return Builder.withLength(3.75F)
         .addAnimation(
            "pelvis",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.9167666F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(2.1676664F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.375F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.625F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "pelvis",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(
                     0.0F,
                     KeyframeAnimations.degreeVec(
                        14.8959F
                           + SineWaveAnimationUtils.getSineWaveKeyframe(
                              2.5F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 0.0F
                           ),
                        -2.98F,
                        1.9025F
                           + SineWaveAnimationUtils.getSineWaveKeyframe(
                              0.5F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 25.0F
                           )
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     0.08343333F,
                     KeyframeAnimations.degreeVec(
                        19.8959F
                           + SineWaveAnimationUtils.getSineWaveKeyframe(
                              2.5F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 0.0F
                           ),
                        -2.98F,
                        1.9025F
                           + SineWaveAnimationUtils.getSineWaveKeyframe(
                              0.5F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 25.0F
                           )
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     0.375F,
                     KeyframeAnimations.degreeVec(
                        0.0F,
                        -2.24F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        -0.49F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     0.7083434F,
                     KeyframeAnimations.degreeVec(
                        0.0F,
                        -2.24F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        -0.49F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     0.7916766F,
                     KeyframeAnimations.degreeVec(
                        -2.5F,
                        -2.24F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        -0.49F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     0.875F,
                     KeyframeAnimations.degreeVec(
                        0.0F,
                        -2.24F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        -0.49F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.0416766F,
                     KeyframeAnimations.degreeVec(
                        0.0F,
                        -2.24F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        -0.49F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.125F,
                     KeyframeAnimations.degreeVec(
                        -2.5F,
                        -2.24F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        -0.49F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.2083433F,
                     KeyframeAnimations.degreeVec(
                        0.0F,
                        -2.24F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        -0.49F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.4167666F,
                     KeyframeAnimations.degreeVec(
                        0.0F,
                        -2.24F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        -0.49F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.5F,
                     KeyframeAnimations.degreeVec(
                        -2.5F,
                        -2.24F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        -0.49F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.5834333F,
                     KeyframeAnimations.degreeVec(
                        0.0F,
                        -2.24F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        -0.49F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.75F,
                     KeyframeAnimations.degreeVec(
                        0.0F,
                        -2.24F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        -0.49F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.8343333F,
                     KeyframeAnimations.degreeVec(
                        -2.5F,
                        -2.24F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        -0.49F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.9167666F,
                     KeyframeAnimations.degreeVec(
                        0.0F,
                        -2.24F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        -0.49F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     2.0416765F,
                     KeyframeAnimations.degreeVec(
                        -15.0F,
                        -2.24F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        -0.49F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     2.25F,
                     KeyframeAnimations.degreeVec(
                        22.5F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              1.0F, 750.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        0.0F,
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     3.375F,
                     KeyframeAnimations.degreeVec(
                        22.5F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              1.0F, 750.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -25.0F
                           ),
                        0.0F,
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     3.625F,
                     KeyframeAnimations.degreeVec(
                        14.8959F
                           + SineWaveAnimationUtils.getSineWaveKeyframe(
                              2.5F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 0.0F
                           ),
                        -2.98F,
                        1.9025F
                           + SineWaveAnimationUtils.getSineWaveKeyframe(
                              0.5F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 25.0F
                           )
                     ),
                     Interpolations.CATMULLROM
                  )
               }
            )
         )
         .addAnimation(
            "body",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(
                     0.0F,
                     KeyframeAnimations.degreeVec(
                        30.0F
                           + SineWaveAnimationUtils.getSineWaveKeyframe(
                              2.5F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -100.0F
                           ),
                        0.0F,
                        SineWaveAnimationUtils.getSineWaveKeyframe(
                           0.5F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 75.0F
                        )
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     0.5F,
                     KeyframeAnimations.degreeVec(
                        -2.5F,
                        -SineWaveAnimationUtils.getSineWaveKeyframe(
                           10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -50.0F
                        ),
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     0.6766666F,
                     KeyframeAnimations.degreeVec(
                        -2.5F,
                        -SineWaveAnimationUtils.getSineWaveKeyframe(
                           10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -50.0F
                        ),
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     0.75F,
                     KeyframeAnimations.degreeVec(
                        -5.0F,
                        -SineWaveAnimationUtils.getSineWaveKeyframe(
                           10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -50.0F
                        ),
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     0.8343334F,
                     KeyframeAnimations.degreeVec(
                        -2.5F,
                        -SineWaveAnimationUtils.getSineWaveKeyframe(
                           10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -50.0F
                        ),
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.0F,
                     KeyframeAnimations.degreeVec(
                        -2.5F,
                        -SineWaveAnimationUtils.getSineWaveKeyframe(
                           10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -50.0F
                        ),
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.0834333F,
                     KeyframeAnimations.degreeVec(
                        -5.0F,
                        -SineWaveAnimationUtils.getSineWaveKeyframe(
                           10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -50.0F
                        ),
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.1676667F,
                     KeyframeAnimations.degreeVec(
                        -2.5F,
                        -SineWaveAnimationUtils.getSineWaveKeyframe(
                           10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -50.0F
                        ),
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.375F,
                     KeyframeAnimations.degreeVec(
                        -2.5F,
                        -SineWaveAnimationUtils.getSineWaveKeyframe(
                           10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -50.0F
                        ),
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.4583433F,
                     KeyframeAnimations.degreeVec(
                        -5.0F,
                        -SineWaveAnimationUtils.getSineWaveKeyframe(
                           10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -50.0F
                        ),
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.5416766F,
                     KeyframeAnimations.degreeVec(
                        -2.5F,
                        -SineWaveAnimationUtils.getSineWaveKeyframe(
                           10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -50.0F
                        ),
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.7083433F,
                     KeyframeAnimations.degreeVec(
                        -2.5F,
                        -SineWaveAnimationUtils.getSineWaveKeyframe(
                           10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -50.0F
                        ),
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.7916766F,
                     KeyframeAnimations.degreeVec(
                        -5.0F,
                        -SineWaveAnimationUtils.getSineWaveKeyframe(
                           10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -50.0F
                        ),
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.875F,
                     KeyframeAnimations.degreeVec(
                        -2.5F,
                        -SineWaveAnimationUtils.getSineWaveKeyframe(
                           10.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -50.0F
                        ),
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     2.2083435F,
                     KeyframeAnimations.degreeVec(
                        40.0F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              1.0F, 750.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -75.0F
                           ),
                        0.0F,
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     3.375F,
                     KeyframeAnimations.degreeVec(
                        40.0F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              1.0F, 750.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -75.0F
                           ),
                        0.0F,
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     3.625F,
                     KeyframeAnimations.degreeVec(
                        30.0F
                           + SineWaveAnimationUtils.getSineWaveKeyframe(
                              2.5F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -100.0F
                           ),
                        0.0F,
                        SineWaveAnimationUtils.getSineWaveKeyframe(
                           0.5F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 75.0F
                        )
                     ),
                     Interpolations.CATMULLROM
                  )
               }
            )
         )
         .addAnimation(
            "body",
            new AnimationChannel(
               Targets.SCALE,
               new Keyframe[]{
                  new Keyframe(0.6766666F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(0.75F, KeyframeAnimations.scaleVec(1.03F, 1.03F, 1.03F), Interpolations.CATMULLROM),
                  new Keyframe(0.8343334F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.0834333F, KeyframeAnimations.scaleVec(1.03F, 1.03F, 1.03F), Interpolations.CATMULLROM),
                  new Keyframe(1.1676667F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.375F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.4583433F, KeyframeAnimations.scaleVec(1.03F, 1.03F, 1.03F), Interpolations.CATMULLROM),
                  new Keyframe(1.5416766F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.7083433F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.7916766F, KeyframeAnimations.scaleVec(1.03F, 1.03F, 1.03F), Interpolations.CATMULLROM),
                  new Keyframe(1.875F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "head",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(
                     0.0F,
                     KeyframeAnimations.degreeVec(
                        -44.9526F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              5.0F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -75.0F
                           ),
                        0.23F,
                        -3.53F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     0.375F,
                     KeyframeAnimations.degreeVec(
                        -44.95F,
                        0.23F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              20.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -75.0F
                           ),
                        -3.53F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     1.9167666F,
                     KeyframeAnimations.degreeVec(
                        -44.95F,
                        0.23F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              20.0F, 250.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -75.0F
                           ),
                        -3.53F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     2.25F,
                     KeyframeAnimations.degreeVec(
                        -54.8912F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              1.0F, 750.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -75.0F
                           ),
                        3.68F,
                        3.38F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     3.375F,
                     KeyframeAnimations.degreeVec(
                        -54.8912F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              1.0F, 750.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -75.0F
                           ),
                        3.68F,
                        3.38F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     3.75F,
                     KeyframeAnimations.degreeVec(
                        -44.9526F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              5.0F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -75.0F
                           ),
                        0.23F,
                        -3.53F
                     ),
                     Interpolations.CATMULLROM
                  )
               }
            )
         )
         .addAnimation(
            "head",
            new AnimationChannel(
               Targets.SCALE,
               new Keyframe[]{
                  new Keyframe(0.6766666F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(0.75F, KeyframeAnimations.scaleVec(0.98F, 0.98F, 0.98F), Interpolations.CATMULLROM),
                  new Keyframe(0.8343334F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.0834333F, KeyframeAnimations.scaleVec(0.98F, 0.98F, 0.98F), Interpolations.CATMULLROM),
                  new Keyframe(1.1676667F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.375F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.4583433F, KeyframeAnimations.scaleVec(0.98F, 0.98F, 0.98F), Interpolations.CATMULLROM),
                  new Keyframe(1.5416766F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.7083433F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.7916766F, KeyframeAnimations.scaleVec(0.98F, 0.98F, 0.98F), Interpolations.CATMULLROM),
                  new Keyframe(1.875F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArm",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, -3.0F, -2.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.0834333F, KeyframeAnimations.posVec(6.0F, -3.0F, -2.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.5F, KeyframeAnimations.posVec(2.0F, -3.0F, -2.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.7916766F, KeyframeAnimations.posVec(6.0F, -3.0F, -2.0F), Interpolations.CATMULLROM),
                  new Keyframe(2.4167664F, KeyframeAnimations.posVec(0.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.375F, KeyframeAnimations.posVec(0.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArm",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(
                     0.0F,
                     KeyframeAnimations.degreeVec(
                        -20.0F
                           + SineWaveAnimationUtils.getSineWaveKeyframe(
                              5.0F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 75.0F
                           ),
                        2.5F,
                        -20.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-95.09F, 40.23F, -94.61F), Interpolations.CATMULLROM),
                  new Keyframe(1.5F, KeyframeAnimations.degreeVec(-47.31F, 32.01F, -56.66F), Interpolations.CATMULLROM),
                  new Keyframe(1.875F, KeyframeAnimations.degreeVec(-95.09F, 40.23F, -94.61F), Interpolations.CATMULLROM),
                  new Keyframe(
                     2.4167664F,
                     KeyframeAnimations.degreeVec(
                        23.9687F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              1.0F, 750.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -75.0F
                           ),
                        0.92F,
                        -59.03F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     3.375F,
                     KeyframeAnimations.degreeVec(
                        23.9687F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              1.0F, 750.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -75.0F
                           ),
                        0.92F,
                        -59.03F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     3.75F,
                     KeyframeAnimations.degreeVec(
                        -20.0F
                           + SineWaveAnimationUtils.getSineWaveKeyframe(
                              5.0F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 75.0F
                           ),
                        2.5F,
                        -20.0F
                     ),
                     Interpolations.CATMULLROM
                  )
               }
            )
         )
         .addAnimation(
            "leftArm",
            new AnimationChannel(
               Targets.SCALE,
               new Keyframe[]{
                  new Keyframe(0.6766666F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(0.75F, KeyframeAnimations.scaleVec(0.98F, 0.98F, 0.98F), Interpolations.CATMULLROM),
                  new Keyframe(0.8343334F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.0834333F, KeyframeAnimations.scaleVec(0.98F, 0.98F, 0.98F), Interpolations.CATMULLROM),
                  new Keyframe(1.1676667F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.375F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.4583433F, KeyframeAnimations.scaleVec(0.98F, 0.98F, 0.98F), Interpolations.CATMULLROM),
                  new Keyframe(1.5416766F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.7083433F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.7916766F, KeyframeAnimations.scaleVec(0.98F, 0.98F, 0.98F), Interpolations.CATMULLROM),
                  new Keyframe(1.875F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArmLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.75F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.125F, KeyframeAnimations.degreeVec(-120.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(-120.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(2.375F, KeyframeAnimations.degreeVec(-75.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.375F, KeyframeAnimations.degreeVec(-75.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.6766665F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightArm",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -3.0F, -2.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.posVec(-6.0F, -3.0F, -2.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.0F, KeyframeAnimations.posVec(-2.0F, -3.0F, -2.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.2916766F, KeyframeAnimations.posVec(-6.0F, -3.0F, -2.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.9583433F, KeyframeAnimations.posVec(-6.0F, -3.0F, -2.0F), Interpolations.CATMULLROM),
                  new Keyframe(2.4167664F, KeyframeAnimations.posVec(0.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.375F, KeyframeAnimations.posVec(0.0F, -4.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightArm",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(
                     0.0F,
                     KeyframeAnimations.degreeVec(
                        -17.2212F
                           + SineWaveAnimationUtils.getSineWaveKeyframe(
                              5.0F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 50.0F
                           ),
                        3.34F,
                        13.39F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(0.25F, KeyframeAnimations.degreeVec(-3.97F, 3.89F, 20.88F), Interpolations.CATMULLROM),
                  new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-95.09F, -40.23F, 94.61F), Interpolations.CATMULLROM),
                  new Keyframe(1.0F, KeyframeAnimations.degreeVec(-47.31F, -32.01F, 56.66F), Interpolations.CATMULLROM),
                  new Keyframe(1.375F, KeyframeAnimations.degreeVec(-95.09F, -40.23F, 94.61F), Interpolations.CATMULLROM),
                  new Keyframe(1.9583433F, KeyframeAnimations.degreeVec(-95.09F, -40.23F, 94.61F), Interpolations.CATMULLROM),
                  new Keyframe(
                     2.4167664F,
                     KeyframeAnimations.degreeVec(
                        23.9687F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              1.0F, 750.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -75.0F
                           ),
                        -0.92F,
                        59.03F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     3.375F,
                     KeyframeAnimations.degreeVec(
                        23.9687F
                           - SineWaveAnimationUtils.getSineWaveKeyframe(
                              1.0F, 750.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, -75.0F
                           ),
                        -0.92F,
                        59.03F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     3.75F,
                     KeyframeAnimations.degreeVec(
                        -17.2212F
                           + SineWaveAnimationUtils.getSineWaveKeyframe(
                              5.0F, 50.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 50.0F
                           ),
                        3.34F,
                        13.39F
                     ),
                     Interpolations.CATMULLROM
                  )
               }
            )
         )
         .addAnimation(
            "rightArm",
            new AnimationChannel(
               Targets.SCALE,
               new Keyframe[]{
                  new Keyframe(0.6766666F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(0.75F, KeyframeAnimations.scaleVec(0.98F, 0.98F, 0.98F), Interpolations.CATMULLROM),
                  new Keyframe(0.8343334F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.0834333F, KeyframeAnimations.scaleVec(0.98F, 0.98F, 0.98F), Interpolations.CATMULLROM),
                  new Keyframe(1.1676667F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.375F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.4583433F, KeyframeAnimations.scaleVec(0.98F, 0.98F, 0.98F), Interpolations.CATMULLROM),
                  new Keyframe(1.5416766F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.7083433F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(1.7916766F, KeyframeAnimations.scaleVec(0.98F, 0.98F, 0.98F), Interpolations.CATMULLROM),
                  new Keyframe(1.875F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightArmLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-120.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.875F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.125F, KeyframeAnimations.degreeVec(-50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.375F, KeyframeAnimations.degreeVec(-120.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(-50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(2.0F, KeyframeAnimations.degreeVec(-50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(2.375F, KeyframeAnimations.degreeVec(-75.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.375F, KeyframeAnimations.degreeVec(-75.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.6766665F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightLeg",
            new AnimationChannel(
               Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)}
            )
         )
         .addAnimation(
            "rightLegLower",
            new AnimationChannel(
               Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)}
            )
         )
         .addAnimation(
            "leftLeg",
            new AnimationChannel(
               Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)}
            )
         )
         .addAnimation(
            "leftLegLower",
            new AnimationChannel(
               Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)}
            )
         )
         .addAnimation(
            "sandBlock",
            new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
         )
         .build();
   }

   public static AnimationDefinition MUTANT_HUSK_DOWN(float ageInTicks) {
      return Builder.withLength(5.0F)
         .addAnimation(
            "everything",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), Interpolations.CATMULLROM),
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
                  new Keyframe(0.4167F, KeyframeAnimations.degreeVec(75.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(75.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
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
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.6766665F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "body",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.6766665F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "head",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.degreeVec(-87.57F, 3.28F, -1.66F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-130.68F, 5.71F, -2.89F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-100.65F, 18.85F, -5.62F), Interpolations.LINEAR),
                  new Keyframe(1.75F, KeyframeAnimations.degreeVec(-100.65F, 18.85F, -5.62F), Interpolations.LINEAR),
                  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-100.14F, 6.56F, -3.31F), Interpolations.CATMULLROM),
                  new Keyframe(4.416767F, KeyframeAnimations.degreeVec(-110.39F, 4.36F, -2.48F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArm",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.degreeVec(-220.0F, 2.5F, 20.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-170.0F, 2.5F, 20.0F), Interpolations.LINEAR),
                  new Keyframe(2.5F, KeyframeAnimations.degreeVec(-170.0F, 2.5F, 20.0F), Interpolations.LINEAR),
                  new Keyframe(3.4167F, KeyframeAnimations.degreeVec(-235.0F, 2.5F, 20.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.6667F, KeyframeAnimations.degreeVec(-235.0F, 2.5F, 20.0F), Interpolations.CATMULLROM),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(-120.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(-20.0F, 2.5F, -20.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArmLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.0F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.6667F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightArm",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.degreeVec(-220.0F, -2.5F, -20.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-170.0F, -2.5F, -20.0F), Interpolations.LINEAR),
                  new Keyframe(2.5F, KeyframeAnimations.degreeVec(-170.0F, -2.5F, -20.0F), Interpolations.LINEAR),
                  new Keyframe(3.4167F, KeyframeAnimations.degreeVec(-235.0F, -2.5F, -20.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.6667F, KeyframeAnimations.degreeVec(-235.0F, -2.5F, -20.0F), Interpolations.CATMULLROM),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(-120.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(-20.0F, -2.5F, 20.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightArmLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.0F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.6667F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightLeg",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(4.167667F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(4.25F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(4.676667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightLegLower",
            new AnimationChannel(
               Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)}
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
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(3.9167664F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-38.16F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(4.583433F, KeyframeAnimations.degreeVec(-77.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(5.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftLegLower",
            new AnimationChannel(
               Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)}
            )
         )
         .addAnimation(
            "sandBlock",
            new AnimationChannel(Targets.SCALE, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)})
         )
         .build();
   }
}
