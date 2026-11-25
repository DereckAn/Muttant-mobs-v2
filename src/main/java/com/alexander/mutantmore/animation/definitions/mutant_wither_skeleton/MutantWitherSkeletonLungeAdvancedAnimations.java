package com.alexander.mutantmore.animation.definitions.mutant_wither_skeleton;

import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedAnimationChannel;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedAnimationDefinition;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedAnimationInstance;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedKeyframe;

public class MutantWitherSkeletonLungeAdvancedAnimations {
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_LUNGE = AdvancedAnimationDefinition.Builder.withLength(0.75F)
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 7.4833, modifiers -> 6.4605 + Math.cos(modifiers.get("life_time") * 2000.0F) * 0.25, modifiers -> 8.4107
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(
                     modifiers -> 22.48, modifiers -> 6.46 + Math.cos(modifiers.get("life_time") * 2000.0F) * 0.25, modifiers -> 8.41
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 22.48, modifiers -> 6.46 + Math.cos(modifiers.get("life_time") * 4000.0F) * 1.0, modifiers -> 8.41),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -1.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -7.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -7.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "pelvis2",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 4.9811, modifiers -> 0.43523000247023447, modifiers -> -4.9811),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "spine1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.33333334F,
                  new AdvancedAnimationInstance(modifiers -> 17.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 17.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib13",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 21.657732978285722, modifiers -> -39.47805293166175, modifiers -> -32.61709226688592),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib14",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib15",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 7.558553640232834, modifiers -> 33.30736048902137, modifiers -> 18.67432686714366),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib2",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib3",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "spine2",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 17.4334, modifiers -> -0.8833787120001944, modifiers -> -5.5187),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib10",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -4.03977695801359, modifiers -> -37.32372634615467, modifiers -> 6.286198496930865),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib11",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib12",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib4",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 32.5, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib5",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib6",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "spine3",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 24.5447, modifiers -> -6.472949974376661, modifiers -> 8.0381),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> 42.04, modifiers -> -6.47, modifiers -> 8.04),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 42.04, modifiers -> -6.47, modifiers -> 8.04),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightShoulderPad",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -25.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftShoulderPad",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -27.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib16",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -25.885842414559548, modifiers -> -24.83077443070033, modifiers -> 26.55142675713096),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib17",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib18",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib7",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -38.71307261662236, modifiers -> 34.73537768420235, modifiers -> -40.829801352036434),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib8",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib9",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "neck",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -24.6401, modifiers -> -6.633789277667802, modifiers -> -2.4405),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "head",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -30.04154900070398, modifiers -> 5.212, modifiers -> 5.3547),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> 2.460000000000001, modifiers -> 5.21, modifiers -> 5.35 + Math.cos(modifiers.get("life_time") * 4000.0F + 50.0F) * 2.5
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "jaw",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 1.843 + Math.cos(modifiers.get("life_time") * 2000.0F - 50.0F) * 0.75,
                     modifiers -> -0.7651155028479479,
                     modifiers -> -8.350498088964741
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(
                     modifiers -> 1.843 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * 5.0,
                     modifiers -> -0.7651155028479479,
                     modifiers -> -8.350498088964741
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -10.0775, modifiers -> 8.6887, modifiers -> 36.124817767709374),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -10.08, modifiers -> 8.69, modifiers -> 36.12),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -24.545017554457516, modifiers -> 68.43448792884732, modifiers -> 25.904625278280143),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(modifiers -> -10.0775, modifiers -> 8.6887, modifiers -> 36.124817767709374),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> -10.0775, modifiers -> 8.6887, modifiers -> 36.124817767709374),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -48.4266, modifiers -> 19.0568, modifiers -> -20.208484171647342),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(modifiers -> 122.5, modifiers -> 0.0, modifiers -> 180.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 122.5, modifiers -> 0.0, modifiers -> 180.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -25.3084, modifiers -> -24.1499, modifiers -> -29.14689223552932),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -25.31, modifiers -> -24.15, modifiers -> -29.15),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> -21.985759436431692, modifiers -> -67.51313978826138, modifiers -> -50.20642577367962),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.33333334F,
                  new AdvancedAnimationInstance(modifiers -> -25.3084, modifiers -> -24.1499, modifiers -> -29.14689223552932),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -25.3084, modifiers -> -24.1499, modifiers -> -29.14689223552932),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -33.0061, modifiers -> -10.5249, modifiers -> 6.7719950935656925),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.33333334F,
                  new AdvancedAnimationInstance(modifiers -> 122.5, modifiers -> 0.0, modifiers -> -180.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 122.5, modifiers -> 0.0, modifiers -> -180.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.33333334F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 22.5, modifiers -> 10.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> -22.42052901068928, modifiers -> 28.07451973523257, modifiers -> 10.441094925834477),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -22.42052901068928, modifiers -> 28.07451973523257, modifiers -> 10.441094925834477),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -2.9999999999999996, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -2.9999999999999996, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rightLegLower",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F, new AdvancedAnimationInstance(modifiers -> 55.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.75F, new AdvancedAnimationInstance(modifiers -> 55.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -27.67468502347856, modifiers -> -18.01339295914977, modifiers -> -10.2699),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> -45.17, modifiers -> -18.01, modifiers -> -10.27),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -45.17, modifiers -> -18.01, modifiers -> -10.27),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -4.500000000000002, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -4.500000000000002, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "leftLegLower",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 59.760000000000005, modifiers -> 1.45, modifiers -> 3.54),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 59.760000000000005, modifiers -> 1.45, modifiers -> 3.54),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .build();
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_LUNGING = AdvancedAnimationDefinition.Builder.withLength(0.0F)
      .addAnimation(
         "everything",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -16.0, modifiers -> 9.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 90.0, modifiers -> 0.0, modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 2000.0F) * 0.5),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "pelvis2",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 2.5), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib13",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 52.59241262403738, modifiers -> -33.990511015279935, modifiers -> -46.658070631438676),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib14",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib15",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 46.8608587333366, modifiers -> 28.58190381071146, modifiers -> 41.38642508737641),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib2",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib3",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "spine2",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> -2.5, modifiers -> 0.0, modifiers -> -5.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib10",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 41.18762669516809, modifiers -> -34.31059437782142, modifiers -> -27.6060451908329),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib11",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib12",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib4",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 35.06884914053853, modifiers -> 29.140888801338406, modifiers -> 28.938025186811046),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib5",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib6",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "spine3",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 5.0, modifiers -> 0.0, modifiers -> 2.5), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rightShoulderPad",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -109.69330270567616, modifiers -> -9.773162413786395, modifiers -> 2.044189211847879),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rightShoulderPad",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 2.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "leftShoulderPad",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -127.19330270567616, modifiers -> 9.7732, modifiers -> -2.0442),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "leftShoulderPad",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 2.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib16",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 29.14725617585519, modifiers -> -34.83786032236594, modifiers -> -12.403543675303531),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib17",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib18",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib7",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 33.522422152650556, modifiers -> 50.0253809023952, modifiers -> 18.354440268347567),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib8",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib9",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "head",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -95.0, modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 4000.0F) * 1.5, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "head",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 4.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "jaw",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 80.0 + Math.cos(modifiers.get("life_time") * 4000.0F - 100.0F) * 5.0, modifiers -> 0.0, modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -182.4484345574583, modifiers -> 48.8358, modifiers -> -15.5981 + Math.cos(modifiers.get("life_time") * 4000.0F) * 1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> -2.0, modifiers -> 3.0, modifiers -> -3.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rightHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 122.5, modifiers -> 0.0, modifiers -> 180.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rightHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -182.4484345574583,
                     modifiers -> -48.83578703898729,
                     modifiers -> 15.5981 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * -1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 2.0, modifiers -> 3.0, modifiers -> -3.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "leftHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 122.5, modifiers -> 0.0, modifiers -> -180.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "leftHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 84.98571439939269, modifiers -> -4.9905 + Math.cos(modifiers.get("life_time") * 4000.0F + 50.0F) * -1.0, modifiers -> 0.2186
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rightLegLower",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 84.98571439939269,
                     modifiers -> 4.9905 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * -1.0,
                     modifiers -> -0.2186496123717916
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "leftLegLower",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .build();
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_LUNGE_LAND = AdvancedAnimationDefinition.Builder.withLength(2.75F)
      .addAnimation(
         "everything",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.041666668F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F, new AdvancedAnimationInstance(modifiers -> 720.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F, new AdvancedAnimationInstance(modifiers -> 720.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 720.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "everything",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -16.0, modifiers -> 9.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> 9.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -10.0, modifiers -> 14.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -10.0, modifiers -> 14.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.75F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 13.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 13.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 13.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 90.0, modifiers -> 0.0, modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 2000.0F) * 0.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 90.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 90.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 3000.0F - 50.0F) * 0.5,
                     modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 2000.0F) * 0.5,
                     modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 7.4833, modifiers -> 6.4605, modifiers -> 8.4107),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -10.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -10.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.7083333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -1.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -1.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "pelvis2",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 2.5), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 32.5, modifiers -> 0.0, modifiers -> 2.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 32.5, modifiers -> 0.0, modifiers -> 2.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F, new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F, new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 4.9811, modifiers -> 0.43523000247023447, modifiers -> -4.9811),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "spine1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 27.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 27.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F, new AdvancedAnimationInstance(modifiers -> 20.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F, new AdvancedAnimationInstance(modifiers -> 20.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 20.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib13",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 52.59241262403738, modifiers -> -33.990511015279935, modifiers -> -46.658070631438676),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 21.657732978285722, modifiers -> -39.47805293166175, modifiers -> -32.61709226688592),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 21.657732978285722, modifiers -> -39.47805293166175, modifiers -> -32.61709226688592),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 21.657732978285722, modifiers -> -39.47805293166175, modifiers -> -32.61709226688592),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 21.657732978285722, modifiers -> -39.47805293166175, modifiers -> -32.61709226688592),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib14",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib15",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 46.8608587333366, modifiers -> 28.58190381071146, modifiers -> 41.38642508737641),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 32.56, modifiers -> 33.31, modifiers -> 18.67),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 32.56, modifiers -> 33.31, modifiers -> 18.67),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 32.56, modifiers -> 33.31, modifiers -> 18.67),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 7.558553640232834, modifiers -> 33.30736048902137, modifiers -> 18.67432686714366),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib2",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib3",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "spine2",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -2.5, modifiers -> 0.0, modifiers -> -5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 25.0, modifiers -> 0.0, modifiers -> -5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 25.0, modifiers -> 0.0, modifiers -> -5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 24.81196607778702, modifiers -> -3.162198011703822, modifiers -> 6.804231425768194),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 24.81196607778702, modifiers -> -3.162198011703822, modifiers -> 6.804231425768194),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 24.81196607778702, modifiers -> -3.162198011703822, modifiers -> 6.804231425768194),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 17.4334, modifiers -> -0.8833787120001944, modifiers -> -5.5187),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib10",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 41.18762669516809, modifiers -> -34.31059437782142, modifiers -> -27.6060451908329),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -4.03977695801359, modifiers -> -37.32372634615467, modifiers -> 6.286198496930865),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -4.03977695801359, modifiers -> -37.32372634615467, modifiers -> 6.286198496930865),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> -4.03977695801359, modifiers -> -37.32372634615467, modifiers -> 6.286198496930865),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> -4.03977695801359, modifiers -> -37.32372634615467, modifiers -> 6.286198496930865),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib11",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib12",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib4",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 35.06884914053853, modifiers -> 29.140888801338406, modifiers -> 28.938025186811046),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 32.5, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 32.5, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 32.5, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 32.5, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib5",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib6",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "spine3",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 5.0, modifiers -> 0.0, modifiers -> 2.5), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 32.5, modifiers -> 0.0, modifiers -> 2.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 32.5, modifiers -> 0.0, modifiers -> 2.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 19.478378302019337, modifiers -> -0.33819670505999966, modifiers -> -8.264089872533532),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 19.478378302019337, modifiers -> -0.33819670505999966, modifiers -> -8.264089872533532),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 19.478378302019337, modifiers -> -0.33819670505999966, modifiers -> -8.264089872533532),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 24.5447, modifiers -> -6.472949974376661, modifiers -> 8.0381),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightShoulderPad",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -109.69330270567616, modifiers -> -9.773162413786395, modifiers -> 2.044189211847879),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -109.69, modifiers -> -9.77, modifiers -> 2.04),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -52.251900958602164, modifiers -> -1.218295405759818, modifiers -> -22.89389108137766),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -52.251900958602164, modifiers -> -1.218295405759818, modifiers -> -22.89389108137766),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.0833333F,
                  new AdvancedAnimationInstance(modifiers -> -52.251900958602164, modifiers -> -1.218295405759818, modifiers -> -22.89389108137766),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.2083333F,
                  new AdvancedAnimationInstance(modifiers -> -129.2742463680451, modifiers -> 7.454427409935033, modifiers -> -14.1674620429248),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> -129.2742463680451, modifiers -> 7.454427409935033, modifiers -> -14.1674620429248),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> -25.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightShoulderPad",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 2.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0833333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 2.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.2083333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftShoulderPad",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -127.19330270567616, modifiers -> 9.7732, modifiers -> -2.0442),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -109.69, modifiers -> 9.77, modifiers -> -2.04),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -52.251900958602164, modifiers -> 1.2183, modifiers -> 22.8939),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -52.251900958602164, modifiers -> 1.2183, modifiers -> 22.8939),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.0F,
                  new AdvancedAnimationInstance(modifiers -> -52.251900958602164, modifiers -> 1.2183, modifiers -> 22.8939),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> -139.75190095860216, modifiers -> 1.2183, modifiers -> 22.8939),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.375F,
                  new AdvancedAnimationInstance(modifiers -> -139.75190095860216, modifiers -> 1.2183, modifiers -> 22.8939),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> -27.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftShoulderPad",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 2.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 2.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.375F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib16",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 29.14725617585519, modifiers -> -34.83786032236594, modifiers -> -12.403543675303531),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -25.885842414559548, modifiers -> -24.83077443070033, modifiers -> 26.55142675713096),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -25.885842414559548, modifiers -> -24.83077443070033, modifiers -> 26.55142675713096),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> -25.885842414559548, modifiers -> -24.83077443070033, modifiers -> 26.55142675713096),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> -25.885842414559548, modifiers -> -24.83077443070033, modifiers -> 26.55142675713096),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib17",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib18",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib7",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 33.522422152650556, modifiers -> 50.0253809023952, modifiers -> 18.354440268347567),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -35.12844977122628, modifiers -> 26.733947304245014, modifiers -> -33.845914387621704),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -35.12844977122628, modifiers -> 26.733947304245014, modifiers -> -33.845914387621704),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> -35.12844977122628, modifiers -> 26.733947304245014, modifiers -> -33.845914387621704),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> -38.71307261662236, modifiers -> 34.73537768420235, modifiers -> -40.829801352036434),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib8",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib9",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "neck",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 37.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 37.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 40.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 40.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 40.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> -24.6401, modifiers -> -6.633789277667802, modifiers -> -2.4405),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "head",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -95.0, modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 4000.0F) * 1.5, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.041666668F,
                  new AdvancedAnimationInstance(modifiers -> -135.0, modifiers -> -0.73, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -55.0 + Math.cos(modifiers.get("life_time") * 3000.0F) * 2.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F, new AdvancedAnimationInstance(modifiers -> -55.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> -55.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5416667F,
                  new AdvancedAnimationInstance(modifiers -> -9.939999999999998, modifiers -> 3.67, modifiers -> 3.77),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> -30.04154900070398, modifiers -> 5.212, modifiers -> 5.3547),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "head",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 4.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "jaw",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 80.0 + Math.cos(modifiers.get("life_time") * 4000.0F - 100.0F) * 5.0, modifiers -> 0.0, modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 5.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> 2.4552 + Math.cos(modifiers.get("life_time") * 3000.0F - 50.0F) * 2.5,
                     modifiers -> -1.3603 + Math.cos(modifiers.get("life_time") * 2000.0F) * 5.0,
                     modifiers -> -5.421184527217065
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 2.4552, modifiers -> -1.3603, modifiers -> -5.421184527217065),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 2.4552, modifiers -> -1.3603, modifiers -> -5.421184527217065),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 1.843, modifiers -> -0.7651155028479479, modifiers -> -8.350498088964741),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -182.4484345574583, modifiers -> 48.8358, modifiers -> -15.5981 + Math.cos(modifiers.get("life_time") * 4000.0F) * 1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -450.7517220288948, modifiers -> -7.708722524189994, modifiers -> -158.68361827157042),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -450.7517220288948, modifiers -> -7.708722524189994, modifiers -> -158.68361827157042),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -87.23563500922637, modifiers -> 20.9795, modifiers -> 16.1714),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -87.23563500922637, modifiers -> 20.9795, modifiers -> 16.1714),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.0833333F,
                  new AdvancedAnimationInstance(
                     modifiers -> -87.23563500922637,
                     modifiers -> 20.9795,
                     modifiers -> 16.1714 + Math.cos(modifiers.get("life_time") * 4000.0F - 100.0F) * -5.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.2083333F,
                  new AdvancedAnimationInstance(modifiers -> -173.92062607672202, modifiers -> 30.8832, modifiers -> -7.3228),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> -173.92062607672202, modifiers -> 30.8832, modifiers -> -7.3228),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> -10.0775, modifiers -> 8.6887, modifiers -> 36.124817767709374),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -2.0, modifiers -> 3.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -2.0, modifiers -> 3.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F, new AdvancedAnimationInstance(modifiers -> -3.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F, new AdvancedAnimationInstance(modifiers -> -3.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.0833333F,
                  new AdvancedAnimationInstance(modifiers -> -3.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> -3.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.75F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -137.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -137.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> -79.179 + Math.cos(modifiers.get("life_time") * 3000.0F - 150.0F) * 0.5, modifiers -> 19.5103, modifiers -> -18.1632
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -79.179, modifiers -> 19.5103, modifiers -> -18.1632),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> -79.179, modifiers -> 19.5103, modifiers -> -18.1632),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> -48.4266, modifiers -> 19.0568, modifiers -> -20.208484171647342),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 122.5, modifiers -> 0.0, modifiers -> 180.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 122.5, modifiers -> 0.0, modifiers -> 180.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 167.5, modifiers -> 0.0, modifiers -> 180.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 167.5, modifiers -> 0.0, modifiers -> 180.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 167.5, modifiers -> 0.0, modifiers -> 180.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4583333F,
                  new AdvancedAnimationInstance(modifiers -> 167.5, modifiers -> 0.0, modifiers -> 180.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.625F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.SCALE,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 1.0, modifiers -> 1.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 1.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F, new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 1.0, modifiers -> 1.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 1.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -182.4484345574583,
                     modifiers -> -48.83578703898729,
                     modifiers -> 15.5981 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * -1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -450.7517220288948, modifiers -> 7.7087, modifiers -> 158.6836),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -450.7517220288948, modifiers -> 7.7087, modifiers -> 158.6836),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -87.23563500922637, modifiers -> -20.9795, modifiers -> -16.1714),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -87.23563500922637, modifiers -> -20.9795, modifiers -> -16.1714),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -87.23563500922637,
                     modifiers -> -20.9795,
                     modifiers -> -16.1714 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * -5.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> -173.92062607672202, modifiers -> -30.883238480652036, modifiers -> 7.322814065733784),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.375F,
                  new AdvancedAnimationInstance(modifiers -> -173.92062607672202, modifiers -> -30.883238480652036, modifiers -> 7.322814065733784),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> -25.3084, modifiers -> -24.1499, modifiers -> -29.14689223552932),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 2.0, modifiers -> 3.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 2.0, modifiers -> 3.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F, new AdvancedAnimationInstance(modifiers -> 3.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F, new AdvancedAnimationInstance(modifiers -> 3.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.0F, new AdvancedAnimationInstance(modifiers -> 3.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.375F, new AdvancedAnimationInstance(modifiers -> 3.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.75F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -137.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -137.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> -79.179 + Math.cos(modifiers.get("life_time") * 3000.0F - 150.0F) * 0.5,
                     modifiers -> -19.51030501127252,
                     modifiers -> 18.163195835606075
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -79.179, modifiers -> -19.51030501127252, modifiers -> 18.163195835606075),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> -79.179, modifiers -> -19.51030501127252, modifiers -> 18.163195835606075),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5F,
                  new AdvancedAnimationInstance(modifiers -> -33.0061, modifiers -> -10.5249, modifiers -> 6.7719950935656925),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 122.5, modifiers -> 0.0, modifiers -> -180.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 122.5, modifiers -> 0.0, modifiers -> -180.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 167.5, modifiers -> 0.0, modifiers -> -180.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 167.5, modifiers -> 0.0, modifiers -> -180.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 167.5, modifiers -> 0.0, modifiers -> -180.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.375F,
                  new AdvancedAnimationInstance(modifiers -> 167.5, modifiers -> 0.0, modifiers -> -180.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.SCALE,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 1.0, modifiers -> 1.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 1.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F, new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 1.0, modifiers -> 1.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 1.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 84.98571439939269, modifiers -> -4.9905 + Math.cos(modifiers.get("life_time") * 4000.0F + 50.0F) * -1.0, modifiers -> 0.2186
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 21.796258453368168, modifiers -> -5.5985, modifiers -> 7.7274),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 21.8, modifiers -> -5.6, modifiers -> 7.73),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -72.07745152496818, modifiers -> 17.670524875580213, modifiers -> 0.24255265142210192),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -72.07745152496818, modifiers -> 17.670524875580213, modifiers -> 0.24255265142210192),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> -72.07745152496818, modifiers -> 17.670524875580213, modifiers -> 0.24255265142210192),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 22.5, modifiers -> 10.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F, new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -10.0, modifiers -> 3.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -10.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.5F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -2.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.7083333F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightLegLower",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 155.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 155.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 75.0 + Math.cos(modifiers.get("life_time") * 4000.0F) * 0.25, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F, new AdvancedAnimationInstance(modifiers -> 75.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 75.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 84.98571439939269,
                     modifiers -> 4.9905 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * -1.0,
                     modifiers -> -0.2186496123717916
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 21.796258453368168, modifiers -> 5.598493005558001, modifiers -> -7.727427219417423),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 21.796258453368168, modifiers -> 5.598493005558001, modifiers -> -7.727427219417423),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 39.31977521908402, modifiers -> 2.546431318100076, modifiers -> -10.878387220285731),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 39.31977521908402, modifiers -> 2.546431318100076, modifiers -> -10.878387220285731),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 39.31977521908402, modifiers -> 2.546431318100076, modifiers -> -10.878387220285731),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> -27.67468502347856, modifiers -> -18.01339295914977, modifiers -> -10.2699),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -10.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -10.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.5F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 3.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.625F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 3.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.7083333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftLegLower",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 155.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 155.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 25.0 + Math.cos(modifiers.get("life_time") * 4000.0F) * 0.25, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.75F, new AdvancedAnimationInstance(modifiers -> 25.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 25.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5F,
                  new AdvancedAnimationInstance(modifiers -> 53.91, modifiers -> 0.91, modifiers -> 2.21),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.625F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .build();
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_STUNNED = AdvancedAnimationDefinition.Builder.withLength(5.5F)
      .addAnimation(
         "everything",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -16.0, modifiers -> 9.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 6000.0F) * 1.0,
                     modifiers -> -7.0 + Math.cos(modifiers.get("life_time") * 6000.0F + 50.0F) * 1.0,
                     modifiers -> -1.0 + Math.cos(modifiers.get("life_time") * 6000.0F - 200.0F) * 1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.16666667F,
                  new AdvancedAnimationInstance(modifiers -> 0.1, modifiers -> -12.01, modifiers -> -1.53),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -22.0, modifiers -> -1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -22.0, modifiers -> -1.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.75F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -22.0, modifiers -> -1.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.75F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.1666667F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 6000.0F) * 0.5,
                     modifiers -> Math.cos(modifiers.get("life_time") * 6000.0F + 50.0F) * 0.5,
                     modifiers -> Math.cos(modifiers.get("life_time") * 6000.0F - 200.0F) * 0.5
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.3333333F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 6000.0F) * 0.1,
                     modifiers -> Math.cos(modifiers.get("life_time") * 6000.0F + 50.0F) * 0.1,
                     modifiers -> Math.cos(modifiers.get("life_time") * 6000.0F - 200.0F) * 0.1
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 6000.0F) * 0.1,
                     modifiers -> Math.cos(modifiers.get("life_time") * 6000.0F + 50.0F) * 0.1,
                     modifiers -> Math.cos(modifiers.get("life_time") * 6000.0F - 200.0F) * 0.1
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 90.0, modifiers -> 0.0, modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 2000.0F) * 0.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 90.0, modifiers -> 0.0, modifiers -> 15.0 + Math.cos(modifiers.get("life_time") * 2000.0F) * 0.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 57.5, modifiers -> 0.0, modifiers -> 15.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F, new AdvancedAnimationInstance(modifiers -> 57.5, modifiers -> 0.0, modifiers -> 15.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 57.5, modifiers -> 0.0, modifiers -> 15.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.625F,
                  new AdvancedAnimationInstance(modifiers -> 17.225274394730604, modifiers -> 3.198220786654474, modifiers -> 5.522809057030372),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.0F,
                  new AdvancedAnimationInstance(modifiers -> 17.23, modifiers -> 3.2, modifiers -> 5.52),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> 17.166925948151384, modifiers -> -3.5319358507593277, modifiers -> 27.0017879500647),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.75F,
                  new AdvancedAnimationInstance(modifiers -> 17.166925948151384, modifiers -> -3.5319358507593277, modifiers -> 27.0017879500647),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.25F,
                  new AdvancedAnimationInstance(modifiers -> 7.4833, modifiers -> 6.4605, modifiers -> 8.4107),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.375F,
                  new AdvancedAnimationInstance(modifiers -> 1.88, modifiers -> 7.09, modifiers -> 7.25),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> 7.4833, modifiers -> 6.4605, modifiers -> 8.4107),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.75F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -22.0, modifiers -> -1.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -22.0, modifiers -> -1.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -22.0, modifiers -> -1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -16.0, modifiers -> -1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -16.0, modifiers -> -1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -1.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -1.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "pelvis2",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 2.5), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 20.0, modifiers -> 0.0, modifiers -> 2.5),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 20.0, modifiers -> 0.0, modifiers -> 2.5), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.75F,
                  new AdvancedAnimationInstance(modifiers -> -2.5, modifiers -> 0.0, modifiers -> 2.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.0F,
                  new AdvancedAnimationInstance(modifiers -> -2.5, modifiers -> 0.0, modifiers -> 2.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> -2.3099134439830777, modifiers -> -0.9564494572964577, modifiers -> -19.98071702609377),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.25F,
                  new AdvancedAnimationInstance(modifiers -> 4.9811, modifiers -> 0.43523000247023447, modifiers -> -4.9811),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> 4.9811, modifiers -> 0.43523000247023447, modifiers -> -4.9811),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "spine1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -20.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> -20.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.5F, new AdvancedAnimationInstance(modifiers -> -20.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  5.25F,
                  new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib13",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 52.59241262403738, modifiers -> -33.990511015279935, modifiers -> -46.658070631438676),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 52.59241262403738, modifiers -> -33.990511015279935, modifiers -> -46.658070631438676),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
                  new AdvancedAnimationInstance(modifiers -> 43.23346889814265, modifiers -> -34.28970488977711, modifiers -> -39.39576104666932),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> 43.23346889814265, modifiers -> -34.28970488977711, modifiers -> -39.39576104666932),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> 21.657732978285722, modifiers -> -39.47805293166175, modifiers -> -32.61709226688592),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> 21.657732978285722, modifiers -> -39.47805293166175, modifiers -> -32.61709226688592),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib14",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib15",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 46.8608587333366, modifiers -> 28.58190381071146, modifiers -> 41.38642508737641),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 46.8608587333366, modifiers -> 28.58190381071146, modifiers -> 41.38642508737641),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
                  new AdvancedAnimationInstance(modifiers -> 37.05161790381008, modifiers -> 27.81647759079525, modifiers -> 17.464064302644342),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> 37.05161790381008, modifiers -> 27.81647759079525, modifiers -> 17.464064302644342),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> 7.558553640232834, modifiers -> 33.30736048902137, modifiers -> 18.67432686714366),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> 7.558553640232834, modifiers -> 33.30736048902137, modifiers -> 18.67432686714366),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib2",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib3",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "spine2",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -2.5, modifiers -> 0.0, modifiers -> -5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 27.5, modifiers -> 0.0, modifiers -> -5.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 27.5, modifiers -> 0.0, modifiers -> -5.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.5F, new AdvancedAnimationInstance(modifiers -> 27.5, modifiers -> 0.0, modifiers -> -5.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  5.25F,
                  new AdvancedAnimationInstance(modifiers -> 17.4334, modifiers -> -0.8833787120001944, modifiers -> -5.5187),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> 17.4334, modifiers -> -0.8833787120001944, modifiers -> -5.5187),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib10",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 41.18762669516809, modifiers -> -34.31059437782142, modifiers -> -27.6060451908329),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 41.18762669516809, modifiers -> -34.31059437782142, modifiers -> -27.6060451908329),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
                  new AdvancedAnimationInstance(modifiers -> 8.348287957775483, modifiers -> -43.18418112736981, modifiers -> -6.700553741793556),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> 8.348287957775483, modifiers -> -43.18418112736981, modifiers -> -6.700553741793556),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> -4.03977695801359, modifiers -> -37.32372634615467, modifiers -> 6.286198496930865),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> -4.03977695801359, modifiers -> -37.32372634615467, modifiers -> 6.286198496930865),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib11",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib12",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib4",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 35.06884914053853, modifiers -> 29.140888801338406, modifiers -> 28.938025186811046),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 35.06884914053853, modifiers -> 29.140888801338406, modifiers -> 28.938025186811046),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
                  new AdvancedAnimationInstance(modifiers -> 3.2742952720145695, modifiers -> 29.95464123992633, modifiers -> 4.086973874377691),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> 3.2742952720145695, modifiers -> 29.95464123992633, modifiers -> 4.086973874377691),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 32.5, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 32.5, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib5",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib6",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "spine3",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 5.0, modifiers -> 0.0, modifiers -> 2.5), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -38.07778685612129, modifiers -> 14.290604655089282, modifiers -> -2.1065913484694647),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> -38.07778685612129, modifiers -> 14.290604655089282, modifiers -> -2.1065913484694647),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.0F,
                  new AdvancedAnimationInstance(modifiers -> -38.08, modifiers -> 14.29, modifiers -> -2.11),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> -23.08, modifiers -> 14.29, modifiers -> -2.11),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.25F,
                  new AdvancedAnimationInstance(modifiers -> 24.5447, modifiers -> -6.472949974376661, modifiers -> 8.0381),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> 24.5447, modifiers -> -6.472949974376661, modifiers -> 8.0381),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightShoulderPad",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -109.69330270567616, modifiers -> -9.773162413786395, modifiers -> 2.044189211847879),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -131.0810113889342, modifiers -> -24.57014949059432, modifiers -> -50.38881562864159),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> -131.0810113889342, modifiers -> -24.57014949059432, modifiers -> -50.38881562864159),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.75F,
                  new AdvancedAnimationInstance(modifiers -> -27.189999999999998, modifiers -> -9.77, modifiers -> 2.04),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.4583335F,
                  new AdvancedAnimationInstance(modifiers -> -27.189999999999998, modifiers -> -9.77, modifiers -> 2.04),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> -25.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> -25.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightShoulderPad",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 2.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "leftShoulderPad",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -127.19330270567616, modifiers -> 9.7732, modifiers -> -2.0442),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -171.92611769688796, modifiers -> 18.72064787634601, modifiers -> 64.05431793875684),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> -171.92611769688796, modifiers -> 18.72064787634601, modifiers -> 64.05431793875684),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.75F,
                  new AdvancedAnimationInstance(modifiers -> -46.42624729850195, modifiers -> 9.15014126666756, modifiers -> -20.882080577605393),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.4583335F,
                  new AdvancedAnimationInstance(modifiers -> -46.42624729850195, modifiers -> 9.15014126666756, modifiers -> -20.882080577605393),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> -27.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> -27.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftShoulderPad",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 2.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib16",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 29.14725617585519, modifiers -> -34.83786032236594, modifiers -> -12.403543675303531),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 29.14725617585519, modifiers -> -34.83786032236594, modifiers -> -12.403543675303531),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
                  new AdvancedAnimationInstance(modifiers -> 45.59317700231087, modifiers -> -36.121676736538575, modifiers -> -31.369387188933793),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> 45.59317700231087, modifiers -> -36.121676736538575, modifiers -> -31.369387188933793),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> -25.885842414559548, modifiers -> -24.83077443070033, modifiers -> 26.55142675713096),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> -25.885842414559548, modifiers -> -24.83077443070033, modifiers -> 26.55142675713096),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib17",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib18",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib7",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 33.522422152650556, modifiers -> 50.0253809023952, modifiers -> 18.354440268347567),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 33.522422152650556, modifiers -> 50.0253809023952, modifiers -> 18.354440268347567),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
                  new AdvancedAnimationInstance(modifiers -> 44.42636457387886, modifiers -> 23.51704855021623, modifiers -> 19.013784735068555),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> 44.42636457387886, modifiers -> 23.51704855021623, modifiers -> 19.013784735068555),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> -38.71307261662236, modifiers -> 34.73537768420235, modifiers -> -40.829801352036434),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> -38.71307261662236, modifiers -> 34.73537768420235, modifiers -> -40.829801352036434),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rib8",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rib9",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "neck",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -29.40842388939518, modifiers -> -6.212705393508259, modifiers -> -10.8681501181768),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 13.09, modifiers -> -6.21, modifiers -> -10.87),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 13.09, modifiers -> -6.21, modifiers -> -10.87),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.75F,
                  new AdvancedAnimationInstance(modifiers -> 53.09, modifiers -> -6.21, modifiers -> -10.87),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> 53.09, modifiers -> -6.21, modifiers -> -10.87),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> -24.6401, modifiers -> -6.633789277667802, modifiers -> -2.4405),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> -24.6401, modifiers -> -6.633789277667802, modifiers -> -2.4405),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "head",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -95.0, modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 4000.0F) * 1.5, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(
                     modifiers -> -111.16799236889074,
                     modifiers -> -18.1001 + Math.cos(modifiers.get("life_time") * 4000.0F) * 1.5,
                     modifiers -> -21.136827003306735
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -48.67, modifiers -> -18.1001, modifiers -> -21.14),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -48.67, modifiers -> -18.1001, modifiers -> -21.14),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> -48.67, modifiers -> -18.1001, modifiers -> -21.14),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0833333F,
                  new AdvancedAnimationInstance(
                     modifiers -> -89.85206995690723,
                     modifiers -> -16.941956192742563,
                     modifiers -> -2.7453 + Math.cos(modifiers.get("life_time") * 4000.0F + 50.0F) * 5.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.1666667F,
                  new AdvancedAnimationInstance(
                     modifiers -> -89.85206995690723,
                     modifiers -> -16.941956192742563,
                     modifiers -> -2.7453 + Math.cos(modifiers.get("life_time") * 4000.0F + 50.0F) * 5.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
                  new AdvancedAnimationInstance(modifiers -> 16.104112863880417, modifiers -> -3.222758046768014, modifiers -> 1.6674532405548774),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.875F,
                  new AdvancedAnimationInstance(modifiers -> -28.9, modifiers -> -3.22, modifiers -> 1.67),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.25F,
                  new AdvancedAnimationInstance(modifiers -> -3.8999999999999986, modifiers -> -3.22, modifiers -> 1.67),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> -3.9, modifiers -> -3.22, modifiers -> 1.67),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> 6.9782148341514585, modifiers -> 5.840651588830507, modifiers -> 0.37117446474680715),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> -30.04154900070398, modifiers -> 5.212, modifiers -> 5.3547),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "head",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 4.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 4.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "jaw",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 80.0 + Math.cos(modifiers.get("life_time") * 4000.0F - 100.0F) * 5.0, modifiers -> 0.0, modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(
                     modifiers -> 10.091 + Math.cos(modifiers.get("life_time") * 4000.0F - 100.0F) * 5.0,
                     modifiers -> 14.915491835070043,
                     modifiers -> -26.77125854574706
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.29166666F,
                  new AdvancedAnimationInstance(
                     modifiers -> 10.091 + Math.cos(modifiers.get("life_time") * 4000.0F - 100.0F) * 5.0,
                     modifiers -> 14.915491835070043,
                     modifiers -> -26.77125854574706
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 36.4936156967866, modifiers -> -4.793068708533228, modifiers -> 7.4660380247032485),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 36.4936156967866, modifiers -> -4.793068708533228, modifiers -> 7.4660380247032485),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 36.4936156967866, modifiers -> -4.793068708533228, modifiers -> 7.4660380247032485),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0833333F,
                  new AdvancedAnimationInstance(
                     modifiers -> 54.36 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * 5.0, modifiers -> -4.51, modifiers -> 7.56
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.1666667F,
                  new AdvancedAnimationInstance(
                     modifiers -> 54.36 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * 5.0, modifiers -> -4.51, modifiers -> 7.56
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
                  new AdvancedAnimationInstance(modifiers -> -1.0612346588848212, modifiers -> -2.425658202889317, modifiers -> 8.28400643092229),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.875F,
                  new AdvancedAnimationInstance(modifiers -> 8.94, modifiers -> -2.43, modifiers -> 8.28),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.25F,
                  new AdvancedAnimationInstance(modifiers -> -1.0612346588848212, modifiers -> -2.425658202889317, modifiers -> 8.28400643092229),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.75F,
                  new AdvancedAnimationInstance(modifiers -> 8.94, modifiers -> -2.43, modifiers -> 8.28),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> 26.439999999999998, modifiers -> -2.43, modifiers -> 8.28),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> 1.843, modifiers -> -0.7651155028479479, modifiers -> -8.350498088964741),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -182.4484345574583, modifiers -> 48.8358, modifiers -> -15.5981 + Math.cos(modifiers.get("life_time") * 4000.0F) * 1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(
                     modifiers -> -163.59611462432366,
                     modifiers -> 36.952463235226645,
                     modifiers -> -20.9264 + Math.cos(modifiers.get("life_time") * 4000.0F) * 1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> -163.6, modifiers -> 36.95, modifiers -> -20.9264),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> -163.6, modifiers -> 36.95, modifiers -> -20.9264),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.75F,
                  new AdvancedAnimationInstance(modifiers -> -68.11293601284805, modifiers -> -2.729266020603788, modifiers -> 2.281736958666734),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.4583335F,
                  new AdvancedAnimationInstance(modifiers -> -68.11293601284805, modifiers -> -2.729266020603788, modifiers -> 2.281736958666734),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> -10.0775, modifiers -> 8.6887, modifiers -> 36.124817767709374),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> -10.0775, modifiers -> 8.6887, modifiers -> 36.124817767709374),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightArm",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -2.0, modifiers -> 3.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -2.0, modifiers -> -2.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> -2.0, modifiers -> -2.0, modifiers -> -3.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.75F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.4583335F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "rightArmLower",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -54.89549437179903, modifiers -> 20.881272338444433, modifiers -> 74.06573268483817),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> -54.66501793530815, modifiers -> -10.436577484659775, modifiers -> 44.069841737276704),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> -54.66501793530815, modifiers -> -10.436577484659775, modifiers -> 44.069841737276704),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.25F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.4583335F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> -48.4266, modifiers -> 19.0568, modifiers -> -20.208484171647342),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> -48.4266, modifiers -> 19.0568, modifiers -> -20.208484171647342),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 122.5, modifiers -> 0.0, modifiers -> 180.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 127.47178330733504, modifiers -> 0.651816991375199, modifiers -> 175.0425616113821),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 127.47178330733504, modifiers -> 0.651816991375199, modifiers -> 175.0425616113821),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -182.4484345574583,
                     modifiers -> -48.83578703898729,
                     modifiers -> 15.5981 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * -1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(
                     modifiers -> -5.084104931712943,
                     modifiers -> -63.21162549029063,
                     modifiers -> -145.5326 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * -1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> -5.08, modifiers -> -63.21, modifiers -> -145.5326),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> -5.08, modifiers -> -63.21, modifiers -> -145.5326),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.75F,
                  new AdvancedAnimationInstance(modifiers -> -56.2049994842301, modifiers -> 29.078862634525684, modifiers -> -98.20188407942149),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.4583335F,
                  new AdvancedAnimationInstance(modifiers -> -56.2049994842301, modifiers -> 29.078862634525684, modifiers -> -98.20188407942149),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> -25.3084, modifiers -> -24.1499, modifiers -> -29.14689223552932),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> -25.3084, modifiers -> -24.1499, modifiers -> -29.14689223552932),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftArm",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 2.0, modifiers -> 3.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 2.0, modifiers -> -2.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 2.0, modifiers -> -2.0, modifiers -> -3.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.75F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.4583335F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .addAnimation(
         "leftArmLower",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 63.581771434910934, modifiers -> -34.57734510667251, modifiers -> -100.11666166780196),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 49.108500723863386, modifiers -> -39.126693002384144, modifiers -> -56.56829939702624),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 49.108500723863386, modifiers -> -39.126693002384144, modifiers -> -56.56829939702624),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.25F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.4583335F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> -33.0061, modifiers -> -10.5249, modifiers -> 6.7719950935656925),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> -33.0061, modifiers -> -10.5249, modifiers -> 6.7719950935656925),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 122.5, modifiers -> 0.0, modifiers -> -180.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 340.0, modifiers -> 0.0, modifiers -> -180.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 340.0, modifiers -> 0.0, modifiers -> -180.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -90.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -90.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftHand",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 84.98571439939269, modifiers -> -4.9905 + Math.cos(modifiers.get("life_time") * 4000.0F + 50.0F) * -1.0, modifiers -> 0.2186
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(
                     modifiers -> 76.05336731391365,
                     modifiers -> -19.9285 + Math.cos(modifiers.get("life_time") * 4000.0F + 50.0F) * -1.0,
                     modifiers -> -9.130341060812754
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 107.64, modifiers -> -19.12, modifiers -> -1.42),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> 76.77833398664306, modifiers -> -18.053791841075522, modifiers -> 3.9438450157646177),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 76.77833398664306, modifiers -> -18.053791841075522, modifiers -> 3.9438450157646177),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 76.77833398664306, modifiers -> -18.053791841075522, modifiers -> 3.9438450157646177),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.0F,
                  new AdvancedAnimationInstance(modifiers -> 76.77833398664306, modifiers -> -18.053791841075522, modifiers -> 3.9438450157646177),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> -82.05755800319113, modifiers -> 6.577649294949605, modifiers -> 5.563679987652847),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.75F,
                  new AdvancedAnimationInstance(modifiers -> -82.05755800319113, modifiers -> 6.577649294949605, modifiers -> 5.563679987652847),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.1666665F,
                  new AdvancedAnimationInstance(modifiers -> -24.97994072016172, modifiers -> 4.277945862868364, modifiers -> 3.521179792532621),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 22.5, modifiers -> 10.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightLeg",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.041666668F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.75F, new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 3.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -22.0, modifiers -> 2.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -22.0, modifiers -> 2.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.0F, new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -22.0, modifiers -> 2.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.2083335F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -13.23, modifiers -> 2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -12.500000000000005, modifiers -> 2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.75F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -12.500000000000005, modifiers -> 2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.1666665F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -2.0, modifiers -> 2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.3333335F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 2.66, modifiers -> 2.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.4583335F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "rightLegLower",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.0F, new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.3333335F,
                  new AdvancedAnimationInstance(modifiers -> 122.69, modifiers -> -2.27, modifiers -> -6.27),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> 90.28047494223847, modifiers -> 4.095043144538977, modifiers -> -9.371369567013517),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.75F,
                  new AdvancedAnimationInstance(modifiers -> 90.28047494223847, modifiers -> 4.095043144538977, modifiers -> -9.371369567013517),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.1666665F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.5F,
                  new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 84.98571439939269,
                     modifiers -> 4.9905 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * -1.0,
                     modifiers -> -0.2186496123717916
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(
                     modifiers -> 61.08825032912978,
                     modifiers -> 24.3055 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * -1.0,
                     modifiers -> -10.74695137068531
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 105.2422638483806, modifiers -> 25.063871508244628, modifiers -> -11.254212199776703),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> 78.59, modifiers -> 24.3055, modifiers -> -10.75),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 78.59, modifiers -> 24.3055, modifiers -> -10.75),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 78.59, modifiers -> 24.3055, modifiers -> -10.75),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.0F,
                  new AdvancedAnimationInstance(modifiers -> 78.59, modifiers -> 24.31, modifiers -> -10.75),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> 66.09, modifiers -> 24.31, modifiers -> -10.75),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.75F,
                  new AdvancedAnimationInstance(modifiers -> 66.09, modifiers -> 24.31, modifiers -> -10.75),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.2083335F,
                  new AdvancedAnimationInstance(modifiers -> -27.67468502347856, modifiers -> -18.01339295914977, modifiers -> -10.2699),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftLeg",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.041666668F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.75F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -24.0, modifiers -> -1.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -24.0, modifiers -> -1.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -24.0, modifiers -> -1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -19.0, modifiers -> -1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -19.0, modifiers -> -1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 2.3200000000000003, modifiers -> -0.57),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.2083335F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "leftLegLower",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  4.5F, new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.75F,
                  new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  4.9166665F,
                  new AdvancedAnimationInstance(modifiers -> 42.379999999999995, modifiers -> 0.73, modifiers -> 1.77),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0833335F,
                  new AdvancedAnimationInstance(modifiers -> 45.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.2083335F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .build();
}
