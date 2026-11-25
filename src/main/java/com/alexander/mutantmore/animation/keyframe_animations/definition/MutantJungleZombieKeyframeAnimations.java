package com.alexander.mutantmore.animation.keyframe_animations.definition;

import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;

public class MutantJungleZombieKeyframeAnimations {
   private static float floatMax = Float.MAX_VALUE;
   public static final AnimationDefinition MUTANT_JUNGLE_ZOMBIE_LOW_ATTACK = Builder.withLength(1.375F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(50.71F, 55.14F, 29.39F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(30.66F, 29.84F, 0.74F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(17.33F, -45.45F, 22.9F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(17.33F, -45.45F, 22.9F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(17.33F, -45.45F, 22.9F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(36.22F, 27.74F, -30.14F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(36.22F, 27.74F, -30.14F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(13.05F, -5.65F, 6.72F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(13.05F, -5.65F, 6.72F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-63.11F, -23.45F, 45.53F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-63.11F, -23.45F, 45.53F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-38.1F, 9.54F, -7.08F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(-45.42F, 23.88F, -33.75F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-45.42F, 23.88F, -33.75F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-37.66F, 9.24F, -36.64F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(1.0F, 2.0F, -4.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.posVec(1.0F, 2.0F, -4.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, -1.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -1.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.posVec(0.0F, -1.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(7.63F, -26.45F, -15.66F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-119.85F, 7.54F, 9.11F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-119.85F, 7.54F, 9.11F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-111.53F, -15.03F, 52.66F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-173.22F, -37.6F, 96.21F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-173.22F, -37.6F, 96.21F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-0.29F, 17.33F, 8.92F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-0.29F, 17.33F, 8.92F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(28.24F, 43.37F, 49.16F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 35.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(9.98F, 7.57F, -1.84F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(1.57F, -29.66F, 8.1F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(39.36F, -19.09F, -61.23F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(48.84F, -2.33F, -77.35F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(50.82F, 11.45F, -70.87F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(48.07F, 17.4F, -61.05F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-3.52F, 32.5F, -75.54F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-56.6F, 46.8F, -90.53F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(7.37F, -24.45F, 28.02F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(8.73F, -23.83F, 30.43F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-0.33F, -3.74F, -74.99F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.4167667F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.scaleVec(1.0, 5.0, 2.0), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.scaleVec(1.0, 6.0, 2.0), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(25.39F, 25.92F, -27.69F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(11.77F, 7.04F, -11.65F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-18.09F, -9.77F, 7.94F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-3.36F, -10.94F, 29.23F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-31.84F, -32.83F, -0.53F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-29.7F, -24.72F, -2.58F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(22.46F, -1.97F, 7.57F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-2.62F, 8.45F, -25.59F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-44.0F, 16.46F, -29.73F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(2.88F, 23.11F, 62.11F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(82.64F, 47.96F, 71.93F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(12.8F, 18.15F, 66.78F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(-24.6F, 15.06F, -9.57F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-24.6F, 15.06F, -9.57F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(6.24F, 12.77F, -33.27F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(45.58F, 21.68F, 21.51F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(28.46F, 29.84F, 11.05F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(2.76F, 29.76F, 19.69F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(2.76F, 29.76F, 19.69F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(2.76F, 29.76F, 19.69F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(70.44F, -9.7F, 19.65F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-76.14F, -4.75F, 58.67F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-65.01F, 2.22F, 43.83F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "vines",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-77.06F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-42.06F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(-69.56F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-22.06F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-82.06F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.LINEAR)}
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_JUNGLE_ZOMBIE_HIGH_ATTACK = Builder.withLength(1.375F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(3.39F, -31.25F, -11.17F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(3.39F, -31.25F, -11.17F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(6.52F, 63.56F, -3.57F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(6.52F, 63.56F, -3.57F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(33.53F, -7.07F, -21.36F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(33.53F, -7.07F, -21.36F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(31.76F, 34.76F, -11.65F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(31.76F, 34.76F, -11.65F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-20.65F, 51.28F, 6.63F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-20.65F, 51.28F, 6.63F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(-55.59F, -53.33F, 60.63F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-46.64F, -40.11F, 31.35F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-9.41F, 14.54F, -1.04F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-24.02F, 15.04F, 4.98F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(39.44F, -18.03F, -61.75F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(39.44F, -18.03F, -61.75F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(-49.98F, -18.81F, -80.46F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(-96.63F, -37.01F, -64.67F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-95.62F, -19.61F, -66.79F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(2.97F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(-54.9F, -4.09F, -2.87F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-54.9F, -4.09F, -2.87F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-54.24F, 17.27F, 36.66F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-11.74F, 17.27F, 36.66F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(40.08F, 15.36F, -6.71F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-36.38F, 9.64F, 14.58F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-36.38F, 9.64F, 14.58F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.5834334F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.scaleVec(1.0, 3.0, 4.0), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.scaleVec(1.0, 3.0, 4.0), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(20.5F, -13.23F, 14.55F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(20.5F, -13.23F, 14.55F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(52.39F, -3.96F, 3.05F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(13.39F, -3.62F, 2.62F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(52.39F, -3.96F, 3.05F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(-12.61F, -3.96F, 3.05F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-43.11F, -1.57F, 1.21F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-18.3F, 8.49F, 17.29F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-18.3F, 8.49F, 17.29F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(41.65F, -7.44F, 13.06F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(5.25F, -7.5F, 13.44F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(41.65F, -7.44F, 13.06F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-44.48F, -14.54F, 5.88F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-35.46F, -3.26F, 0.3F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-47.49F, 1.26F, -1.46F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-35.64F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-35.64F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(24.79F, -12.31F, 24.79F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(39.98F, -1.15F, 2.22F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-40.02F, -1.15F, 2.22F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-28.14F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(-1.5F, 44.24F, -58.46F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-74.74F, -0.13F, 44.1F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-74.74F, -0.13F, 44.1F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-74.74F, -0.13F, 44.1F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(60.26F, -0.13F, 44.1F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(60.26F, -0.13F, 44.1F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "vines",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(-72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.LINEAR)}
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_JUNGLE_ZOMBIE_PUNCH = Builder.withLength(1.25F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(12.01F, 33.26F, 13.24F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(12.01F, 33.26F, 13.24F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(14.88F, -31.09F, 3.42F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(14.88F, -31.09F, 3.42F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(24.05F, 26.77F, 7.67F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(24.05F, 26.77F, 7.67F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(15.23F, -23.79F, 9.55F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(15.23F, -23.79F, 9.55F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-31.18F, -35.43F, 15.91F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-40.7F, -49.69F, 29.83F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-35.44F, 35.19F, -29.9F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-35.44F, 35.19F, -29.9F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-31.31F, 12.68F, -25.67F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-58.02F, -24.47F, -21.97F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-58.02F, -24.47F, -21.97F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(89.48F, -4.03F, -63.29F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(42.53F, -3.23F, -33.24F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-102.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-102.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(70.44F, 4.25F, 11.77F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(70.44F, 4.25F, 11.77F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-29.34F, -5.66F, -5.63F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-46.32F, -20.44F, -11.37F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(17.48F, 1.27F, 2.21F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(76.95F, 14.53F, 6.68F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(76.95F, 14.53F, 6.68F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-2.13F, 14.57F, 29.94F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-69.47F, 4.16F, 12.07F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(29.97F, -1.89F, 4.83F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(29.97F, -1.89F, 4.83F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-7.53F, -1.89F, 4.83F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-4.12F, -13.89F, 10.44F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-20.06F, -11.23F, 14.78F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(63.58F, -1.77F, 24.13F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(63.58F, -1.77F, 24.13F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-58.72F, -5.67F, 21.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-39.06F, 0.62F, 28.79F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(14.8F, 8.85F, 10.98F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.posVec(-2.0F, 0.0F, -6.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.posVec(-2.0F, 0.0F, -6.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(44.31F, -12.47F, 53.15F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(43.28F, 5.72F, 70.41F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-59.74F, 38.63F, 53.48F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(-44.9F, 43.0F, 57.83F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-59.74F, 38.63F, 53.48F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-97.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vines",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-75.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-75.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.LINEAR)}
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_JUNGLE_ZOMBIE_TRY_CHOKE = Builder.withLength(1.75F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(5.63F, -30.84F, 3.71F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(5.63F, -30.84F, 3.71F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(14.33F, 14.67F, -5.97F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(14.33F, 14.67F, -5.97F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.degreeVec(7.51F, -10.42F, 0.92F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(44.76F, -16.39F, -15.63F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(44.76F, -16.39F, -15.63F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(26.94F, 5.74F, -11.13F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(26.94F, 5.74F, -11.13F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-56.06F, 27.38F, -37.62F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-56.06F, 27.38F, -37.62F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-34.63F, -17.99F, 21.23F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-34.63F, -17.99F, 21.23F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-30.16F, 9.73F, 4.26F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(42.96F, -20.46F, -39.33F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(42.96F, -20.46F, -39.33F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-125.3F, -11.69F, 28.21F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(-125.3F, -11.69F, 28.21F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-125.98F, -15.41F, 30.97F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-112.32F, -7.59F, 25.29F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-2.5F, 7.82F, 7.17F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-5.0F, 7.82F, 7.17F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-2.54F, 16.95F, -1.55F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.0, 1.0, -1.0), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.scaleVec(1.0, 2.7F, 1.0), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.scaleVec(1.0, 2.7F, 1.0), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.scaleVec(1.0, 1.0, -1.0), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, -17.5F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-19.41F, -8.42F, 5.93F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(10.03F, 8.55F, 9.12F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-0.53F, -6.43F, 14.14F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-20.0F, -25.0F, -7.5F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-2.64F, -15.52F, -16.16F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-63.91F, 16.02F, 60.03F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-63.91F, 16.02F, 60.03F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(41.09F, 16.02F, 60.03F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(41.09F, 16.02F, 60.03F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "vines",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-55.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.LINEAR)}
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_JUNGLE_ZOMBIE_TRY_SLAM = Builder.withLength(1.5F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-2.94F, -9.74F, -12.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-2.94F, -9.74F, -12.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(31.6F, 6.46F, 3.68F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(31.6F, 6.46F, 3.68F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.1F, -6.16F, -10.56F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-0.1F, -6.16F, -10.56F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(5.56F, 1.65F, 6.78F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(5.56F, 1.65F, 6.78F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(12.18F, 3.06F, 21.79F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-21.83F, -3.27F, 2.73F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-28.19F, -7.82F, -8.97F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-202.43F, 1.85F, 24.86F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-202.43F, 1.85F, 24.86F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-90.24F, -4.82F, -14.28F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-90.24F, -4.82F, -14.28F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(-55.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(-33.75F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(-44.82F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-45.38F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.6766666F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.scaleVec(1.0, 3.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.scaleVec(1.0, 3.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.scaleVec(1.0, 3.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.scaleVec(1.0, 1.0, -1.0), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(14.97F, 1.86F, -1.67F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-7.53F, 1.86F, -1.67F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(0.55F, 3.44F, 10.74F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-19.45F, 3.44F, 10.74F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(-4.86F, 2.83F, 3.25F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(32.18F, 2.81F, 2.85F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-4.86F, 2.83F, 3.25F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(27.48F, 0.96F, -2.31F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-20.02F, 0.96F, -2.31F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(-27.52F, 0.96F, -2.31F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-27.52F, 0.96F, -2.31F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-58.78F, -0.92F, -0.04F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-65.71F, -12.8F, 74.01F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-80.71F, -12.8F, 74.01F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(74.24F, -2.41F, 39.91F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(74.24F, -2.41F, 39.91F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "vines",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(-72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.LINEAR)}
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_JUNGLE_ZOMBIE_SLAM = Builder.withLength(4.0F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(31.6F, 6.46F, 3.68F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(31.6F, 6.46F, 3.68F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-9.17F, 5.31F, -3.77F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-9.54F, -16.9F, -0.12F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(23.08F, -18.26F, 0.01F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-11.04F, 24.67F, -3.52F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(-11.04F, 24.67F, -3.52F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(28.96F, 24.67F, -3.52F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-3.23F, 4.7F, -2.31F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.degreeVec(-3.23F, 4.7F, -2.31F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(42.0F, -2.36F, -1.93F), Interpolations.CATMULLROM),
               new Keyframe(1.9583433F, KeyframeAnimations.degreeVec(-3.13F, 12.57F, -3.39F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(-3.13F, 12.57F, -3.39F), Interpolations.CATMULLROM),
               new Keyframe(2.2083435F, KeyframeAnimations.degreeVec(36.87F, 12.57F, -3.39F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-3.02F, 27.37F, -5.61F), Interpolations.CATMULLROM),
               new Keyframe(2.8343334F, KeyframeAnimations.degreeVec(-3.02F, 27.37F, -5.61F), Interpolations.CATMULLROM),
               new Keyframe(2.9167664F, KeyframeAnimations.degreeVec(10.6F, -25.24F, -0.1F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(10.6F, -25.24F, -0.1F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(10.6F, -25.24F, -0.1F), Interpolations.CATMULLROM),
               new Keyframe(3.5F, KeyframeAnimations.degreeVec(10.6F, -25.24F, -0.1F), Interpolations.CATMULLROM),
               new Keyframe(4.0F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.56F, 1.65F, 6.78F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(10.56F, 1.65F, 6.78F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-19.63F, 0.11F, -5.63F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-19.63F, 0.11F, -5.63F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(30.37F, 0.11F, -5.63F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(30.37F, 0.11F, -5.63F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(12.85F, 0.17F, -15.63F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(12.85F, 0.17F, -15.63F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(45.07F, -0.47F, 8.92F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(-2.35F, -9.07F, -8.09F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(-2.35F, -9.07F, -8.09F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(21.96F, -6.03F, 8.51F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(-1.07F, -5.43F, -11.57F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(-1.07F, -5.43F, -11.57F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(26.2F, -6.64F, -9.37F), Interpolations.CATMULLROM),
               new Keyframe(2.4167664F, KeyframeAnimations.degreeVec(-1.34F, 19.59F, -12.81F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(-1.34F, 19.59F, -12.81F), Interpolations.CATMULLROM),
               new Keyframe(2.8343334F, KeyframeAnimations.degreeVec(24.84F, -26.71F, -4.76F), Interpolations.CATMULLROM),
               new Keyframe(2.9167664F, KeyframeAnimations.degreeVec(24.84F, -26.71F, -4.76F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(24.84F, -26.71F, -4.76F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(24.84F, -26.71F, -4.76F), Interpolations.CATMULLROM),
               new Keyframe(3.875F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-31.6F, -12.39F, -3.68F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(16.5F, -19.59F, -5.86F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-1.0F, -19.59F, -5.86F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-21.06F, -27.09F, -5.71F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-36.02F, -43.17F, 2.81F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-57.49F, -7.61F, 3.18F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-65.98F, -42.88F, -11.3F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-39.99F, -7.61F, 3.18F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-83.17F, -34.57F, 31.55F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-32.85F, -20.27F, 20.12F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(4.09F, -20.54F, 4.31F), Interpolations.CATMULLROM),
               new Keyframe(2.9167664F, KeyframeAnimations.degreeVec(-21.62F, 43.87F, -3.8F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(-21.62F, 43.87F, -3.8F), Interpolations.CATMULLROM),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM),
               new Keyframe(4.0F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -7.0F), Interpolations.CATMULLROM),
               new Keyframe(2.2083435F, KeyframeAnimations.posVec(0.0F, 0.0F, -7.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-90.24F, -7.32F, -14.27F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(-90.24F, -7.32F, -14.27F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-140.84F, -18.79F, -0.67F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-140.84F, -18.79F, -0.67F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-80.17F, -31.13F, -2.1F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-182.34F, 6.32F, 20.08F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(-182.34F, 6.32F, 20.08F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-129.08F, -0.42F, -3.54F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(-191.58F, -0.42F, -3.54F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(-191.58F, -0.42F, -3.54F), Interpolations.CATMULLROM),
               new Keyframe(1.6766667F, KeyframeAnimations.degreeVec(-104.08F, -0.42F, -3.54F), Interpolations.CATMULLROM),
               new Keyframe(1.9583433F, KeyframeAnimations.degreeVec(-212.8F, -14.13F, 18.82F), Interpolations.CATMULLROM),
               new Keyframe(2.0834334F, KeyframeAnimations.degreeVec(-212.8F, -14.13F, 18.82F), Interpolations.CATMULLROM),
               new Keyframe(2.2083435F, KeyframeAnimations.degreeVec(-78.0F, -4.21F, 20.07F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(26.39F, -18.06F, -8.74F), Interpolations.CATMULLROM),
               new Keyframe(2.8343334F, KeyframeAnimations.degreeVec(43.89F, -18.06F, -8.74F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(-51.11F, -18.06F, -8.74F), Interpolations.CATMULLROM),
               new Keyframe(3.5F, KeyframeAnimations.degreeVec(-51.11F, -18.06F, -8.74F), Interpolations.CATMULLROM),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM),
               new Keyframe(4.0F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.2083435F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.88F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(53.57F, 8.4F, 14.72F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(53.57F, 8.4F, 14.72F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-43.93F, 8.4F, 14.72F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-41.04F, -18.77F, 37.09F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(43.24F, 24.33F, -8.15F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-41.53F, 4.38F, 2.66F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-41.53F, 4.38F, 2.66F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(23.42F, -2.5F, -0.32F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(40.15F, -9.01F, 7.31F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(25.15F, -9.01F, 7.31F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-22.14F, 4.88F, 1.64F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(-3.72F, 5.61F, 11.66F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(27.18F, -13.05F, -1.03F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(-10.32F, -13.05F, -1.03F), Interpolations.CATMULLROM),
               new Keyframe(2.1676664F, KeyframeAnimations.degreeVec(-49.74F, -0.59F, -0.35F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-17.17F, 1.63F, 6.81F), Interpolations.CATMULLROM),
               new Keyframe(2.3433335F, KeyframeAnimations.degreeVec(-63.11F, -21.17F, -7.95F), Interpolations.CATMULLROM),
               new Keyframe(2.4167664F, KeyframeAnimations.degreeVec(-51.89F, 1.08F, 4.37F), Interpolations.CATMULLROM),
               new Keyframe(2.625F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.7916765F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(4.77F, -1.5F, 17.44F), Interpolations.CATMULLROM),
               new Keyframe(3.4167664F, KeyframeAnimations.degreeVec(4.77F, -1.5F, 17.44F), Interpolations.CATMULLROM),
               new Keyframe(3.5834334F, KeyframeAnimations.degreeVec(13.66F, -1.1F, 12.79F), Interpolations.CATMULLROM),
               new Keyframe(3.9583435F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 3.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(2.1676664F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.scaleVec(1.0, 1.0, -1.0), Interpolations.CATMULLROM),
               new Keyframe(2.7916765F, KeyframeAnimations.scaleVec(1.0, 1.0, -1.0), Interpolations.CATMULLROM),
               new Keyframe(2.9167664F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-52.84F, -18.27F, -13.36F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-19.84F, -2.56F, -7.05F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-7.67F, -1.25F, 2.87F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(29.83F, 1.24F, -1.47F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(12.33F, 1.24F, -1.47F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-32.67F, 1.24F, -1.47F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(-20.0F, 2.96F, 3.23F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(19.23F, 6.32F, -6.22F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(-18.27F, 6.32F, -6.22F), Interpolations.CATMULLROM),
               new Keyframe(2.1676664F, KeyframeAnimations.degreeVec(-41.97F, -11.62F, -0.86F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-7.02F, -4.13F, -0.46F), Interpolations.CATMULLROM),
               new Keyframe(2.625F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(25.14F, 2.83F, 3.25F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(31.34F, -8.65F, 15.27F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(31.34F, -8.65F, 15.27F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-24.56F, -3.4F, 23.83F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-3.57F, 19.27F, 13.11F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(21.15F, 11.53F, -1.38F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-4.74F, 13.86F, 5.93F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-17.24F, 13.86F, 5.93F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-19.74F, 9.54F, 15.81F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(32.51F, -7.91F, -10.61F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(-14.99F, -7.91F, -10.61F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-23.45F, -4.0F, -1.35F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(-18.45F, -4.0F, -1.35F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(29.05F, -4.0F, -1.35F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(-13.45F, -4.0F, -1.35F), Interpolations.CATMULLROM),
               new Keyframe(2.1676664F, KeyframeAnimations.degreeVec(-10.95F, -4.0F, -1.35F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-18.45F, -4.0F, -1.35F), Interpolations.CATMULLROM),
               new Keyframe(2.625F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(22.42F, 1.91F, -4.62F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-10.08F, 1.91F, -4.62F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-22.58F, 1.91F, -4.62F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-10.23F, -0.75F, -19.38F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(23.2F, -8.95F, -1.06F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(-34.3F, -8.95F, -1.06F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-21.8F, -8.95F, -1.06F), Interpolations.CATMULLROM),
               new Keyframe(1.7083433F, KeyframeAnimations.degreeVec(8.11F, 3.42F, 0.71F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(30.61F, 3.42F, 0.71F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(-11.89F, 3.42F, 0.71F), Interpolations.CATMULLROM),
               new Keyframe(2.1676664F, KeyframeAnimations.degreeVec(-1.89F, 3.42F, 0.71F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(3.11F, 3.42F, 0.71F), Interpolations.CATMULLROM),
               new Keyframe(2.625F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.875F, KeyframeAnimations.posVec(0.0F, 2.0F, -8.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 2.0F, -8.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0834334F, KeyframeAnimations.posVec(0.0F, 2.0F, -8.0F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.posVec(0.0F, 2.0F, -8.0F), Interpolations.CATMULLROM),
               new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(74.24F, -2.41F, 39.91F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-55.65F, -14.12F, 56.33F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-90.6F, -15.65F, 84.76F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(22.03F, -6.32F, 58.37F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-64.34F, 10.82F, 24.86F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-64.34F, 10.82F, 24.86F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(55.66F, 10.82F, 24.86F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-106.84F, 10.82F, 24.86F), Interpolations.CATMULLROM),
               new Keyframe(1.5834333F, KeyframeAnimations.degreeVec(-106.84F, 10.82F, 24.86F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(38.16F, 10.82F, 24.86F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(-112.0F, 35.46F, 24.41F), Interpolations.CATMULLROM),
               new Keyframe(2.1676664F, KeyframeAnimations.degreeVec(-112.0F, 35.46F, 24.41F), Interpolations.CATMULLROM),
               new Keyframe(2.375F, KeyframeAnimations.degreeVec(75.91F, 16.78F, 86.21F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(76.05F, -14.8F, 93.99F), Interpolations.CATMULLROM),
               new Keyframe(2.875F, KeyframeAnimations.degreeVec(-116.71F, 48.54F, -11.49F), Interpolations.CATMULLROM),
               new Keyframe(2.9583435F, KeyframeAnimations.degreeVec(-116.71F, 48.54F, -11.49F), Interpolations.CATMULLROM),
               new Keyframe(3.0416765F, KeyframeAnimations.degreeVec(-116.71F, 48.54F, -11.49F), Interpolations.CATMULLROM),
               new Keyframe(3.2916765F, KeyframeAnimations.degreeVec(-116.71F, 48.54F, -11.49F), Interpolations.CATMULLROM),
               new Keyframe(3.4583435F, KeyframeAnimations.degreeVec(-116.71F, 48.54F, -11.49F), Interpolations.CATMULLROM),
               new Keyframe(4.0F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.5F, KeyframeAnimations.degreeVec(-135.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(-135.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(3.6766665F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vines",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-70.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-62.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0416765F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.2916765F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.7083435F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.3433335F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.LINEAR)}
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_JUNGLE_ZOMBIE_NOVELTY = Builder.withLength(4.5F)
      .addAnimation(
         "everything",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "everything",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(7.72F, 16.85F, 4.54F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(7.72F, 16.85F, 4.54F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-0.54F, 16.84F, 1.93F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(-0.54F, 16.84F, 1.93F), Interpolations.CATMULLROM),
               new Keyframe(2.2083435F, KeyframeAnimations.degreeVec(7.72F, 16.85F, 4.54F), Interpolations.CATMULLROM),
               new Keyframe(2.8343334F, KeyframeAnimations.degreeVec(7.72F, 16.85F, 4.54F), Interpolations.CATMULLROM),
               new Keyframe(3.1676664F, KeyframeAnimations.degreeVec(-0.54F, 16.84F, 1.93F), Interpolations.CATMULLROM),
               new Keyframe(3.7083435F, KeyframeAnimations.degreeVec(-0.54F, 16.84F, 1.93F), Interpolations.CATMULLROM),
               new Keyframe(4.041677F, KeyframeAnimations.degreeVec(7.72F, 16.85F, 4.54F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(33.52F, 21.26F, 2.38F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(33.52F, 21.26F, 2.38F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(18.09F, 23.77F, -5.27F), Interpolations.CATMULLROM),
               new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(18.09F, 23.77F, -5.27F), Interpolations.CATMULLROM),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(33.52F, 21.26F, 2.38F), Interpolations.CATMULLROM),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(33.52F, 21.26F, 2.38F), Interpolations.CATMULLROM),
               new Keyframe(3.0834334F, KeyframeAnimations.degreeVec(18.09F, 23.77F, -5.27F), Interpolations.CATMULLROM),
               new Keyframe(3.625F, KeyframeAnimations.degreeVec(18.09F, 23.77F, -5.27F), Interpolations.CATMULLROM),
               new Keyframe(3.9583435F, KeyframeAnimations.degreeVec(33.52F, 21.26F, 2.38F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-44.2F, -50.12F, 28.16F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-44.2F, -50.12F, 28.16F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(-31.59F, -75.38F, 16.61F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-31.59F, -75.38F, 16.61F), Interpolations.CATMULLROM),
               new Keyframe(2.3433335F, KeyframeAnimations.degreeVec(-44.2F, -50.12F, 28.16F), Interpolations.CATMULLROM),
               new Keyframe(2.9583435F, KeyframeAnimations.degreeVec(-44.2F, -50.12F, 28.16F), Interpolations.CATMULLROM),
               new Keyframe(3.2916765F, KeyframeAnimations.degreeVec(-31.59F, -75.38F, 16.61F), Interpolations.CATMULLROM),
               new Keyframe(3.8343334F, KeyframeAnimations.degreeVec(-31.59F, -75.38F, 16.61F), Interpolations.CATMULLROM),
               new Keyframe(4.167667F, KeyframeAnimations.degreeVec(-44.2F, -50.12F, 28.16F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-118.14F, -32.49F, 21.25F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-118.14F, -32.49F, 21.25F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-145.64F, -32.49F, 21.25F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-145.64F, -32.49F, 21.25F), Interpolations.CATMULLROM),
               new Keyframe(1.9583433F, KeyframeAnimations.degreeVec(-118.14F, -32.49F, 21.25F), Interpolations.CATMULLROM),
               new Keyframe(2.5834334F, KeyframeAnimations.degreeVec(-118.14F, -32.49F, 21.25F), Interpolations.CATMULLROM),
               new Keyframe(2.9167664F, KeyframeAnimations.degreeVec(-145.64F, -32.49F, 21.25F), Interpolations.CATMULLROM),
               new Keyframe(3.4583435F, KeyframeAnimations.degreeVec(-145.64F, -32.49F, 21.25F), Interpolations.CATMULLROM),
               new Keyframe(3.7916765F, KeyframeAnimations.degreeVec(-118.14F, -32.49F, 21.25F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.2083435F, KeyframeAnimations.degreeVec(-17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.8343334F, KeyframeAnimations.degreeVec(-17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.1676664F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.7083435F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.041677F, KeyframeAnimations.degreeVec(-17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(15.91F, 33.25F, -19.09F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.2083435F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.8343334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.1676664F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.7083435F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.041677F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.208343F, KeyframeAnimations.degreeVec(-35.63F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(4.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(4.208343F, KeyframeAnimations.scaleVec(1.0, 1.0, -1.0), Interpolations.CATMULLROM),
               new Keyframe(4.343333F, KeyframeAnimations.scaleVec(1.0, 1.0, -1.0), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-1.46F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.9167666F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(-1.46F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.875F, KeyframeAnimations.degreeVec(-1.46F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.2083435F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.75F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.083433F, KeyframeAnimations.degreeVec(-1.46F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-1.38F, -0.05F, 0.05F), Interpolations.CATMULLROM),
               new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(-101.94F, 3.73F, 17.11F), Interpolations.CATMULLROM),
               new Keyframe(1.9583433F, KeyframeAnimations.degreeVec(-101.94F, 3.73F, 17.11F), Interpolations.CATMULLROM),
               new Keyframe(2.2916765F, KeyframeAnimations.degreeVec(-1.38F, -0.05F, 0.05F), Interpolations.CATMULLROM),
               new Keyframe(2.9167664F, KeyframeAnimations.degreeVec(-1.38F, -0.05F, 0.05F), Interpolations.CATMULLROM),
               new Keyframe(3.25F, KeyframeAnimations.degreeVec(-101.94F, 3.73F, 17.11F), Interpolations.CATMULLROM),
               new Keyframe(3.7916765F, KeyframeAnimations.degreeVec(-101.94F, 3.73F, 17.11F), Interpolations.CATMULLROM),
               new Keyframe(4.125F, KeyframeAnimations.degreeVec(-1.38F, -0.05F, 0.05F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-0.78F, -0.85F, -0.21F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(-134.22F, -17.64F, 3.46F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-134.22F, -17.64F, 3.46F), Interpolations.CATMULLROM),
               new Keyframe(2.3433335F, KeyframeAnimations.degreeVec(-0.78F, -0.85F, -0.21F), Interpolations.CATMULLROM),
               new Keyframe(2.9583435F, KeyframeAnimations.degreeVec(-0.78F, -0.85F, -0.21F), Interpolations.CATMULLROM),
               new Keyframe(3.2916765F, KeyframeAnimations.degreeVec(-134.22F, -17.64F, 3.46F), Interpolations.CATMULLROM),
               new Keyframe(3.8343334F, KeyframeAnimations.degreeVec(-134.22F, -17.64F, 3.46F), Interpolations.CATMULLROM),
               new Keyframe(4.167667F, KeyframeAnimations.degreeVec(-0.78F, -0.85F, -0.21F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-7.89F, 37.62F, 18.05F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-7.89F, 37.62F, 18.05F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(1.71F, 12.63F, 17.14F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(1.71F, 12.63F, 17.14F), Interpolations.CATMULLROM),
               new Keyframe(2.2083435F, KeyframeAnimations.degreeVec(-7.89F, 37.62F, 18.05F), Interpolations.CATMULLROM),
               new Keyframe(2.8343334F, KeyframeAnimations.degreeVec(-7.89F, 37.62F, 18.05F), Interpolations.CATMULLROM),
               new Keyframe(3.1676664F, KeyframeAnimations.degreeVec(1.71F, 12.63F, 17.14F), Interpolations.CATMULLROM),
               new Keyframe(3.7083435F, KeyframeAnimations.degreeVec(1.71F, 12.63F, 17.14F), Interpolations.CATMULLROM),
               new Keyframe(4.041677F, KeyframeAnimations.degreeVec(-7.89F, 37.62F, 18.05F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "vines",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-45.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5416766F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0834334F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.4167664F, KeyframeAnimations.degreeVec(-45.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.0416765F, KeyframeAnimations.degreeVec(-45.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.375F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(3.9167664F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.25F, KeyframeAnimations.degreeVec(-45.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(4.5F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.LINEAR)}
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_JUNGLE_ZOMBIE_INTRO = Builder.withLength(2.0F)
      .addAnimation(
         "everything",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "everything",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.33F, 10.0F, -0.04F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-1.66F, -1.0F, -0.09F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-3.65F, 10.0F, -0.15F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-5.59F, -10.0F, -0.19F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-0.85F, 10.0F, 0.59F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(2.59F, -10.0F, 1.14F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-0.68F, 20.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-3.52F, -20.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-6.56F, 20.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-9.09F, -20.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(10.13F, 20.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(35.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-38.2F, 11.91F, -9.53F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-39.52F, -11.3F, 9.4F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-38.2F, 11.91F, -9.53F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-39.52F, -11.3F, 9.4F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-53.2F, 11.91F, -9.53F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-52.42F, -12.92F, 17.73F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-29.71F, -25.35F, 6.13F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-25.83F, -52.12F, -8.84F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-133.37F, -58.79F, -12.92F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-117.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-61.56F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(39.03F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(33.11F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(36.92F, -31.53F, -21.45F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(34.67F, 14.71F, 10.77F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(36.7F, -16.24F, -11.65F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(34.54F, 25.43F, 16.47F), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-18.35F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(1.7083433F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(1.75F, KeyframeAnimations.scaleVec(1.0, 1.0, -1.0), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.scaleVec(1.0, 1.0, -1.0), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(67.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(38.46F, 11.85F, 9.26F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(45.53F, 42.07F, -17.36F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(54.42F, 26.64F, -1.81F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(50.06F, 14.18F, 7.13F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(50.06F, 14.18F, 7.13F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-15.67F, -15.42F, 12.63F), Interpolations.CATMULLROM),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.62F, 12.45F, 1.11F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(10.12F, 12.45F, 1.11F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(10.12F, 12.45F, 1.11F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-24.88F, 12.45F, 1.11F), Interpolations.CATMULLROM),
               new Keyframe(1.8343333F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-29.71F, 25.35F, -6.13F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-25.83F, 52.12F, 8.84F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-133.37F, 58.79F, 12.92F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-117.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.625F, KeyframeAnimations.degreeVec(-61.56F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vines",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.7916766F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_JUNGLE_ZOMBIE_JUMP = Builder.withLength(1.0F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "everything",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-7.6F, -2.98F, 1.9F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(-7.6F, -2.98F, 1.9F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(22.4F, -2.98F, 1.9F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-22.45F, 0.23F, -3.53F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-44.95F, 0.23F, -3.53F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(-24.95F, 0.23F, -3.53F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-133.1F, -10.8F, 6.33F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-133.1F, -10.8F, 6.33F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(6.22F, -9.87F, -3.79F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(87.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-57.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-30.03F, 1.86F, -1.67F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-9.28F, -2.82F, 12.82F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-30.03F, -5.12F, 13.23F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.3433333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.posVec(0.0F, -2.0F, -3.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-133.1F, 10.8F, -6.33F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-133.1F, 10.8F, -6.33F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(6.22F, 9.87F, 3.79F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vines",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-54.76F, 4.56F, 5.96F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-54.76F, 4.56F, 5.96F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(20.24F, 4.56F, 5.96F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(20.24F, 4.56F, 5.96F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(71.88F, 3.04F, -3.97F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(71.88F, 3.04F, -3.97F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(17.39F, 3.04F, -3.97F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.26F, -4.56F, -5.96F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-54.76F, -4.56F, -5.96F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-54.76F, -4.56F, -5.96F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(20.24F, -4.56F, -5.96F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(20.24F, -4.56F, -5.96F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-37.26F, -4.56F, -5.96F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(71.88F, -3.04F, 3.97F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(71.88F, -3.04F, 3.97F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(17.39F, -3.04F, 3.97F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_JUNGLE_ZOMBIE_STOP_RESTING = Builder.withLength(1.25F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(17.4F, -2.98F, 1.9F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(52.53F, -1.52F, -1.98F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(56.99F, -0.68F, -0.89F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.56F, 2.71F, -3.2F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(6.36F, 0.63F, -3.47F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-77.31F, -9.76F, -2.19F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(27.2F, 19.1F, 7.85F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(82.79F, 2.69F, 12.21F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(74.73F, 8.9F, -4.26F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(44.28F, -0.35F, 10.63F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-79.91F, 7.34F, 1.52F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "vines",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-72.19F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-57.19F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_JUNGLE_ZOMBIE_LOW_ATTACK_SLOWED = Builder.withLength(1.5F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(50.71F, 55.14F, 29.39F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(30.66F, 29.84F, 0.74F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(17.33F, -45.45F, 22.9F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(17.33F, -45.45F, 22.9F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.degreeVec(17.33F, -45.45F, 22.9F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(36.22F, 27.74F, -30.14F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(36.22F, 27.74F, -30.14F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(13.05F, -5.65F, 6.72F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(13.05F, -5.65F, 6.72F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-63.11F, -23.45F, 45.53F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-63.11F, -23.45F, 45.53F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-38.1F, 9.54F, -7.08F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-45.42F, 23.88F, -33.75F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-45.42F, 23.88F, -33.75F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-37.66F, 9.24F, -36.64F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.posVec(1.0F, 2.0F, -4.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.posVec(1.0F, 2.0F, -4.0F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.posVec(0.0F, -1.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.posVec(0.0F, -1.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(1.2916766F, KeyframeAnimations.posVec(0.0F, -1.0F, -1.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM),
               new Keyframe(0.08343333F, KeyframeAnimations.degreeVec(7.63F, -26.45F, -15.66F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(-119.85F, 7.54F, 9.11F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-119.85F, 7.54F, 9.11F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-111.53F, -15.03F, 52.66F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-173.22F, -37.6F, 96.21F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-173.22F, -37.6F, 96.21F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.2916767F, KeyframeAnimations.degreeVec(-0.29F, 17.33F, 8.92F), Interpolations.CATMULLROM),
               new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-0.29F, 17.33F, 8.92F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(28.24F, 43.37F, 49.16F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 35.0F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(9.98F, 7.57F, -1.84F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(1.57F, -29.66F, 8.1F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(39.36F, -19.09F, -61.23F), Interpolations.CATMULLROM),
               new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(48.84F, -2.33F, -77.35F), Interpolations.CATMULLROM),
               new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(50.82F, 11.45F, -70.87F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(48.07F, 17.4F, -61.05F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-3.52F, 32.5F, -75.54F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-56.6F, 46.8F, -90.53F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(7.37F, -24.45F, 28.02F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(8.73F, -23.83F, 30.43F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 20.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-0.33F, -3.74F, -74.99F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.4583433F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.scaleVec(1.0, 5.0, 2.0), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.scaleVec(1.0, 6.0, 2.0), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(25.39F, 25.92F, -27.69F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(11.77F, 7.04F, -11.65F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-18.09F, -9.77F, 7.94F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-3.36F, -10.94F, 29.23F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-31.84F, -32.83F, -0.53F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-29.7F, -24.72F, -2.58F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(22.46F, -1.97F, 7.57F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-2.62F, 8.45F, -25.59F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-44.0F, 16.46F, -29.73F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(2.88F, 23.11F, 62.11F), Interpolations.CATMULLROM),
               new Keyframe(0.6766666F, KeyframeAnimations.degreeVec(82.64F, 47.96F, 71.93F), Interpolations.CATMULLROM),
               new Keyframe(0.9167666F, KeyframeAnimations.degreeVec(12.8F, 18.15F, 66.78F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-24.6F, 15.06F, -9.57F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(-24.6F, 15.06F, -9.57F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(6.24F, 12.77F, -33.27F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(45.58F, 21.68F, 21.51F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(28.46F, 29.84F, 11.05F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(2.76F, 29.76F, 19.69F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(2.76F, 29.76F, 19.69F), Interpolations.CATMULLROM),
               new Keyframe(1.2083433F, KeyframeAnimations.degreeVec(2.76F, 29.76F, 19.69F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(70.44F, -9.7F, 19.65F), Interpolations.CATMULLROM),
               new Keyframe(0.8343334F, KeyframeAnimations.degreeVec(-76.14F, -4.75F, 58.67F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-65.01F, 2.22F, 43.83F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "vines",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-77.06F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-42.06F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-69.56F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-22.06F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-82.06F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.LINEAR)}
         )
      )
      .build();
   public static final AnimationDefinition MUTANT_JUNGLE_ZOMBIE_HIGH_ATTACK_SLOWED = Builder.withLength(1.5F)
      .addAnimation(
         "pelvis",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "pelvis",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(3.39F, -31.25F, -11.17F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(3.39F, -31.25F, -11.17F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(6.52F, 63.56F, -3.57F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(6.52F, 63.56F, -3.57F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "body",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(33.53F, -7.07F, -21.36F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(33.53F, -7.07F, -21.36F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(31.76F, 34.76F, -11.65F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(31.76F, 34.76F, -11.65F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-20.65F, 51.28F, 6.63F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-20.65F, 51.28F, 6.63F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-55.59F, -53.33F, 60.63F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-46.64F, -40.11F, 31.35F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-9.41F, 14.54F, -1.04F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(-24.02F, 15.04F, 4.98F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)})
      )
      .addAnimation(
         "leftArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(39.44F, -18.03F, -61.75F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(39.44F, -18.03F, -61.75F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-49.98F, -18.81F, -80.46F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-96.63F, -37.01F, -64.67F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-95.62F, -19.61F, -66.79F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(2.97F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-54.9F, -4.09F, -2.87F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-54.9F, -4.09F, -2.87F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-54.24F, 17.27F, 36.66F), Interpolations.CATMULLROM),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(-11.74F, 17.27F, 36.66F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(40.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(40.08F, 15.36F, -6.71F), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.degreeVec(-36.38F, 9.64F, 14.58F), Interpolations.CATMULLROM),
               new Keyframe(1.125F, KeyframeAnimations.degreeVec(-36.38F, 9.64F, 14.58F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.625F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.scaleVec(1.0, 3.0, 4.0), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.scaleVec(1.0, 3.0, 4.0), Interpolations.CATMULLROM),
               new Keyframe(0.9583434F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine2",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(20.5F, -13.23F, 14.55F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(20.5F, -13.23F, 14.55F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(52.39F, -3.96F, 3.05F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(13.39F, -3.62F, 2.62F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(52.39F, -3.96F, 3.05F), Interpolations.CATMULLROM),
               new Keyframe(1.0416766F, KeyframeAnimations.degreeVec(-12.61F, -3.96F, 3.05F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-43.11F, -1.57F, 1.21F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine3",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-18.3F, 8.49F, 17.29F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-18.3F, 8.49F, 17.29F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(41.65F, -7.44F, 13.06F), Interpolations.CATMULLROM),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(5.25F, -7.5F, 13.44F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(41.65F, -7.44F, 13.06F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-44.48F, -14.54F, 5.88F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-35.46F, -3.26F, 0.3F), Interpolations.CATMULLROM),
               new Keyframe(1.4583433F, KeyframeAnimations.degreeVec(-47.49F, 1.26F, -1.46F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "leftVine4",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-35.64F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-35.64F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(24.79F, -12.31F, 24.79F), Interpolations.CATMULLROM),
               new Keyframe(0.7916766F, KeyframeAnimations.degreeVec(39.98F, -1.15F, 2.22F), Interpolations.CATMULLROM),
               new Keyframe(1.0834333F, KeyframeAnimations.degreeVec(-40.02F, -1.15F, 2.22F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(-28.14F, 29.22F, 7.12F), Interpolations.CATMULLROM),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(-1.5F, 44.24F, -58.46F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM),
               new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-74.74F, -0.13F, 44.1F), Interpolations.CATMULLROM),
               new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-74.74F, -0.13F, 44.1F), Interpolations.CATMULLROM),
               new Keyframe(0.7083434F, KeyframeAnimations.degreeVec(-74.74F, -0.13F, 44.1F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(60.26F, -0.13F, 44.1F), Interpolations.CATMULLROM),
               new Keyframe(1.25F, KeyframeAnimations.degreeVec(60.26F, -0.13F, 44.1F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation(
         "vines",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.0F, KeyframeAnimations.degreeVec(-72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.1676667F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.3433332F, KeyframeAnimations.degreeVec(-72.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
               new Keyframe(1.5F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "rightLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLeg",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.LINEAR)}
         )
      )
      .addAnimation(
         "leftLegLower",
         new AnimationChannel(
            Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.LINEAR)}
         )
      )
      .build();

   public static AnimationDefinition MUTANT_JUNGLE_ZOMBIE_CHOKE(float ageInTicks) {
      return Builder.withLength(4.0F)
         .addAnimation(
            "pelvis",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(14.33F, 14.67F, -5.97F), Interpolations.CATMULLROM),
                  new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.0F, KeyframeAnimations.degreeVec(-7.5F, -2.5F, 0.11F), Interpolations.CATMULLROM),
                  new Keyframe(3.25F, KeyframeAnimations.degreeVec(-15.42F, -14.7F, 2.89F), Interpolations.CATMULLROM),
                  new Keyframe(3.375F, KeyframeAnimations.degreeVec(30.83F, 5.83F, 12.5F), Interpolations.CATMULLROM),
                  new Keyframe(3.625F, KeyframeAnimations.degreeVec(30.83F, 5.83F, 12.5F), Interpolations.CATMULLROM),
                  new Keyframe(4.0F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "body",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(26.94F, 5.74F, -11.13F), Interpolations.CATMULLROM),
                  new Keyframe(0.125F, KeyframeAnimations.degreeVec(7.56F, -7.44F, -0.98F), Interpolations.CATMULLROM),
                  new Keyframe(0.375F, KeyframeAnimations.degreeVec(7.56F, -7.44F, -0.98F), Interpolations.CATMULLROM),
                  new Keyframe(2.0F, KeyframeAnimations.degreeVec(3.2F, -7.19F, -6.01F), Interpolations.CATMULLROM),
                  new Keyframe(3.0F, KeyframeAnimations.degreeVec(3.2F, -7.19F, -6.01F), Interpolations.CATMULLROM),
                  new Keyframe(3.25F, KeyframeAnimations.degreeVec(3.57F, -27.16F, -7.24F), Interpolations.CATMULLROM),
                  new Keyframe(3.375F, KeyframeAnimations.degreeVec(0.88F, 10.26F, -4.48F), Interpolations.CATMULLROM),
                  new Keyframe(3.625F, KeyframeAnimations.degreeVec(0.88F, 10.26F, -4.48F), Interpolations.CATMULLROM),
                  new Keyframe(4.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "head",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-34.63F, -17.99F, 21.23F), Interpolations.CATMULLROM),
                  new Keyframe(0.125F, KeyframeAnimations.degreeVec(-31.33F, -13.86F, 18.31F), Interpolations.CATMULLROM),
                  new Keyframe(0.375F, KeyframeAnimations.degreeVec(-27.67F, -25.82F, 10.91F), Interpolations.CATMULLROM),
                  new Keyframe(1.625F, KeyframeAnimations.degreeVec(-12.16F, -26.76F, 7.94F), Interpolations.CATMULLROM),
                  new Keyframe(3.0F, KeyframeAnimations.degreeVec(-15.17F, -25.82F, 10.91F), Interpolations.CATMULLROM),
                  new Keyframe(3.25F, KeyframeAnimations.degreeVec(-35.17F, -25.82F, 10.91F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(-18.41F, -23.88F, 1.77F), Interpolations.CATMULLROM),
                  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArm",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 2.0F, -8.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 2.0F, -8.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.625F, KeyframeAnimations.posVec(0.0F, 2.0F, -8.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArm",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.125F, KeyframeAnimations.degreeVec(-125.3F, -11.69F, 28.21F), Interpolations.CATMULLROM),
                  new Keyframe(
                     3.0F,
                     KeyframeAnimations.degreeVec(
                        -110.32F,
                        -17.26F,
                        SineWaveAnimationUtils.getSineWaveKeyframe(
                           2.0F, 5000.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 0.0F
                        )
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(3.2083435F, KeyframeAnimations.degreeVec(-164.59F, -4.79F, 27.43F), Interpolations.CATMULLROM),
                  new Keyframe(3.3433335F, KeyframeAnimations.degreeVec(-107.42F, -12.69F, 24.89F), Interpolations.CATMULLROM),
                  new Keyframe(3.625F, KeyframeAnimations.degreeVec(-86.09F, -14.3F, -61.13F), Interpolations.CATMULLROM),
                  new Keyframe(4.0F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArmLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.75F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftVine",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-5.0F, 7.82F, 7.17F), Interpolations.CATMULLROM),
                  new Keyframe(0.125F, KeyframeAnimations.degreeVec(-3.93F, 8.4F, 14.72F), Interpolations.CATMULLROM),
                  new Keyframe(3.25F, KeyframeAnimations.degreeVec(-3.93F, 8.4F, 14.72F), Interpolations.CATMULLROM),
                  new Keyframe(3.375F, KeyframeAnimations.degreeVec(-37.74F, 5.94F, -4.58F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.875F, KeyframeAnimations.degreeVec(-31.68F, 28.46F, -16.39F), Interpolations.CATMULLROM),
                  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftVine",
            new AnimationChannel(
               Targets.SCALE,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 2.7F, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(3.75F, KeyframeAnimations.scaleVec(1.0, 1.0, -1.0), Interpolations.CATMULLROM),
                  new Keyframe(4.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftVine2",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, -17.5F), Interpolations.CATMULLROM),
                  new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(-7.63F, 12.95F, 41.63F), Interpolations.CATMULLROM),
                  new Keyframe(3.25F, KeyframeAnimations.degreeVec(-7.63F, 12.95F, 41.63F), Interpolations.CATMULLROM),
                  new Keyframe(3.375F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftVine3",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.03F, 8.55F, 9.12F), Interpolations.CATMULLROM),
                  new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-8.68F, -22.07F, 102.74F), Interpolations.CATMULLROM),
                  new Keyframe(3.25F, KeyframeAnimations.degreeVec(-8.68F, -22.07F, 102.74F), Interpolations.CATMULLROM),
                  new Keyframe(3.375F, KeyframeAnimations.degreeVec(-9.85F, 1.73F, 9.85F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftVine4",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-20.0F, -25.0F, -7.5F), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.degreeVec(3.84F, 31.4F, 139.1F), Interpolations.CATMULLROM),
                  new Keyframe(3.25F, KeyframeAnimations.degreeVec(3.84F, 31.4F, 139.1F), Interpolations.CATMULLROM),
                  new Keyframe(3.375F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.5F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightArm",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(41.09F, 16.02F, 60.03F), Interpolations.CATMULLROM),
                  new Keyframe(0.125F, KeyframeAnimations.degreeVec(8.59F, 16.02F, 60.03F), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.degreeVec(73.59F, 16.02F, 60.03F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(73.59F, 16.02F, 60.03F), Interpolations.CATMULLROM),
                  new Keyframe(1.4167666F, KeyframeAnimations.degreeVec(74.05F, 8.82F, 62.17F), Interpolations.CATMULLROM),
                  new Keyframe(2.25F, KeyframeAnimations.degreeVec(73.59F, 16.02F, 60.03F), Interpolations.CATMULLROM),
                  new Keyframe(3.0F, KeyframeAnimations.degreeVec(73.59F, 16.02F, 60.03F), Interpolations.CATMULLROM),
                  new Keyframe(3.3433335F, KeyframeAnimations.degreeVec(-57.22F, -18.41F, 46.66F), Interpolations.CATMULLROM),
                  new Keyframe(3.5416765F, KeyframeAnimations.degreeVec(50.28F, -18.41F, 46.66F), Interpolations.CATMULLROM),
                  new Keyframe(3.75F, KeyframeAnimations.degreeVec(50.28F, -18.41F, 46.66F), Interpolations.CATMULLROM),
                  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightArmLower",
            new AnimationChannel(
               Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)}
            )
         )
         .addAnimation(
            "vines",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.0F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(1.625F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(2.125F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(2.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.375F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.5834334F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(3.7916765F, KeyframeAnimations.degreeVec(-62.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(4.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightLeg",
            new AnimationChannel(
               Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.LINEAR)}
            )
         )
         .addAnimation(
            "rightLegLower",
            new AnimationChannel(
               Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.LINEAR)}
            )
         )
         .addAnimation(
            "leftLeg",
            new AnimationChannel(
               Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.LINEAR)}
            )
         )
         .addAnimation(
            "leftLegLower",
            new AnimationChannel(
               Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.LINEAR)}
            )
         )
         .build();
   }

   public static AnimationDefinition MUTANT_JUNGLE_ZOMBIE_DOWN(float ageInTicks) {
      return Builder.withLength(8.0F)
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
                  new Keyframe(7.25F, KeyframeAnimations.posVec(0.0F, -7.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "everything",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(75.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(7.25F, KeyframeAnimations.degreeVec(75.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(8.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "pelvis",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(4.75F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(
                     5.416767F,
                     KeyframeAnimations.posVec(
                        SineWaveAnimationUtils.getSineWaveKeyframe(
                           0.25F, 5000.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 0.0F
                        ),
                        -1.0F,
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(
                     6.5F,
                     KeyframeAnimations.posVec(
                        SineWaveAnimationUtils.getSineWaveKeyframe(
                           0.25F, 5000.0F, SineWaveAnimationUtils.getTick(ageInTicks, true), -floatMax, floatMax, 0.0F
                        ),
                        0.0F,
                        0.0F
                     ),
                     Interpolations.CATMULLROM
                  ),
                  new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "pelvis",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM),
                  new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(6.676667F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(7.25F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(8.0F, KeyframeAnimations.degreeVec(7.4F, -2.98F, 1.9F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "body",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(6.676667F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(7.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(8.0F, KeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "head",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM),
                  new Keyframe(0.20834334F, KeyframeAnimations.degreeVec(-86.7F, 2.4F, 15.84F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-77.02F, -28.43F, 13.63F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-2.02F, -28.43F, 13.63F), Interpolations.CATMULLROM),
                  new Keyframe(0.75F, KeyframeAnimations.degreeVec(-2.02F, -28.43F, 13.63F), Interpolations.LINEAR),
                  new Keyframe(4.75F, KeyframeAnimations.degreeVec(-2.02F, -28.43F, 13.63F), Interpolations.LINEAR),
                  new Keyframe(7.0F, KeyframeAnimations.degreeVec(-36.78F, -3.44F, 12.77F), Interpolations.LINEAR),
                  new Keyframe(7.416767F, KeyframeAnimations.degreeVec(14.61F, 4.36F, -2.48F), Interpolations.CATMULLROM),
                  new Keyframe(7.75F, KeyframeAnimations.degreeVec(-48.96F, 0.88F, -1.76F), Interpolations.CATMULLROM),
                  new Keyframe(8.0F, KeyframeAnimations.degreeVec(-47.45F, 0.23F, -3.53F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArm",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArm",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.degreeVec(-220.0F, 2.5F, 20.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-135.0F, 2.5F, 20.0F), Interpolations.LINEAR),
                  new Keyframe(5.5F, KeyframeAnimations.degreeVec(-135.0F, 2.5F, 20.0F), Interpolations.LINEAR),
                  new Keyframe(6.416767F, KeyframeAnimations.degreeVec(-235.0F, 2.5F, 20.0F), Interpolations.CATMULLROM),
                  new Keyframe(6.676667F, KeyframeAnimations.degreeVec(-200.0F, 2.5F, 20.0F), Interpolations.CATMULLROM),
                  new Keyframe(7.25F, KeyframeAnimations.degreeVec(-120.0F, -2.5F, 20.0F), Interpolations.CATMULLROM),
                  new Keyframe(8.0F, KeyframeAnimations.degreeVec(1.98F, -24.47F, -21.97F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftArmLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(6.0F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(6.676667F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(7.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(8.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftVine",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(6.25F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(6.625F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftVine",
            new AnimationChannel(
               Targets.SCALE,
               new Keyframe[]{
                  new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.scaleVec(1.0, 1.0, -1.0), Interpolations.LINEAR),
                  new Keyframe(7.625F, KeyframeAnimations.scaleVec(1.0, 1.0, -1.0), Interpolations.LINEAR),
                  new Keyframe(8.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftVine2",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.375F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(-4.96F, 0.65F, 7.47F), Interpolations.LINEAR),
                  new Keyframe(5.5F, KeyframeAnimations.degreeVec(-4.96F, 0.65F, 7.47F), Interpolations.LINEAR),
                  new Keyframe(5.916767F, KeyframeAnimations.degreeVec(-29.96F, 0.65F, 7.47F), Interpolations.CATMULLROM),
                  new Keyframe(6.25F, KeyframeAnimations.degreeVec(-4.96F, 0.65F, 7.47F), Interpolations.CATMULLROM),
                  new Keyframe(6.625F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(7.0F, KeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(7.5F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftVine3",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM),
                  new Keyframe(0.5416766F, KeyframeAnimations.degreeVec(-9.13F, 4.03F, 15.72F), Interpolations.LINEAR),
                  new Keyframe(5.5F, KeyframeAnimations.degreeVec(-9.13F, 4.03F, 15.72F), Interpolations.LINEAR),
                  new Keyframe(5.916767F, KeyframeAnimations.degreeVec(-51.63F, 4.03F, 15.72F), Interpolations.CATMULLROM),
                  new Keyframe(6.25F, KeyframeAnimations.degreeVec(-9.13F, 4.03F, 15.72F), Interpolations.CATMULLROM),
                  new Keyframe(6.625F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM),
                  new Keyframe(7.5F, KeyframeAnimations.degreeVec(47.47F, 1.86F, -1.67F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftVine4",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM),
                  new Keyframe(0.4583433F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(3.84F, -8.19F, 4.44F), Interpolations.LINEAR),
                  new Keyframe(5.5F, KeyframeAnimations.degreeVec(3.84F, -8.19F, 4.44F), Interpolations.LINEAR),
                  new Keyframe(5.916767F, KeyframeAnimations.degreeVec(-43.66F, -8.19F, 4.44F), Interpolations.CATMULLROM),
                  new Keyframe(6.25F, KeyframeAnimations.degreeVec(3.84F, -8.19F, 4.44F), Interpolations.CATMULLROM),
                  new Keyframe(6.625F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM),
                  new Keyframe(7.0F, KeyframeAnimations.degreeVec(0.74F, 1.92F, -5.94F), Interpolations.CATMULLROM),
                  new Keyframe(7.5F, KeyframeAnimations.degreeVec(26.86F, 29.22F, 7.12F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightArm",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.degreeVec(-220.0F, -2.5F, -20.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.4167667F, KeyframeAnimations.degreeVec(-135.0F, -2.5F, -20.0F), Interpolations.LINEAR),
                  new Keyframe(5.5F, KeyframeAnimations.degreeVec(-135.0F, -2.5F, -20.0F), Interpolations.LINEAR),
                  new Keyframe(6.416767F, KeyframeAnimations.degreeVec(-235.0F, -2.5F, -20.0F), Interpolations.CATMULLROM),
                  new Keyframe(6.676667F, KeyframeAnimations.degreeVec(-200.0F, -2.5F, -20.0F), Interpolations.CATMULLROM),
                  new Keyframe(7.25F, KeyframeAnimations.degreeVec(-120.0F, 2.5F, -20.0F), Interpolations.CATMULLROM),
                  new Keyframe(8.0F, KeyframeAnimations.degreeVec(-14.95F, 30.22F, 4.48F), Interpolations.CATMULLROM)
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
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(6.0F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(6.676667F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(7.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(8.0F, KeyframeAnimations.degreeVec(-60.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "vines",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.25F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(6.708343F, KeyframeAnimations.degreeVec(3.11F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(7.125F, KeyframeAnimations.degreeVec(-61.21F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(7.5F, KeyframeAnimations.degreeVec(-69.01F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(7.834333F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(8.0F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightLeg",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.LINEAR),
                  new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(7.167667F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(7.25F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(7.676667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(8.0F, KeyframeAnimations.degreeVec(-37.26F, 4.56F, 5.96F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "rightLegLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.LINEAR),
                  new Keyframe(8.0F, KeyframeAnimations.degreeVec(37.39F, 3.04F, -3.97F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftLeg",
            new AnimationChannel(
               Targets.POSITION,
               new Keyframe[]{
                  new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(7.583433F, KeyframeAnimations.posVec(0.0F, 3.0F, 3.0F), Interpolations.LINEAR),
                  new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftLeg",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.LINEAR),
                  new Keyframe(0.16766666F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.3433333F, KeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5F, KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(0.5834334F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(6.916767F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.LINEAR),
                  new Keyframe(7.0F, KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(7.583433F, KeyframeAnimations.degreeVec(-77.5F, 0.0F, 0.0F), Interpolations.CATMULLROM),
                  new Keyframe(8.0F, KeyframeAnimations.degreeVec(-37.08F, -6.07F, -7.96F), Interpolations.CATMULLROM)
               }
            )
         )
         .addAnimation(
            "leftLegLower",
            new AnimationChannel(
               Targets.ROTATION,
               new Keyframe[]{
                  new Keyframe(0.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.LINEAR),
                  new Keyframe(8.0F, KeyframeAnimations.degreeVec(37.39F, -3.04F, 3.97F), Interpolations.CATMULLROM)
               }
            )
         )
         .build();
   }
}
