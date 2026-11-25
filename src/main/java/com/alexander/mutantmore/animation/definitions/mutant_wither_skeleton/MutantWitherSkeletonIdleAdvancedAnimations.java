package com.alexander.mutantmore.animation.definitions.mutant_wither_skeleton;

import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedAnimationChannel;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedAnimationDefinition;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedAnimationInstance;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedKeyframe;
import net.minecraft.util.Mth;

public class MutantWitherSkeletonIdleAdvancedAnimations {
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_INTRO = AdvancedAnimationDefinition.Builder.withLength(1.5F)
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 34.9833, modifiers -> 6.4605, modifiers -> 8.4107),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> -18.2543 + Math.cos(modifiers.get("life_time") * 4000.0F + 50.0F) * 1.0,
                     modifiers -> 6.5334 + Math.cos(modifiers.get("life_time") * 4000.0F) * 2.0,
                     modifiers -> 0.4564 + Math.cos(modifiers.get("life_time") * 4000.0F - 100.0F) * 1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -18.2543 + Math.cos(modifiers.get("life_time") * 4000.0F + 50.0F) * 1.0,
                     modifiers -> 6.5334 + Math.cos(modifiers.get("life_time") * 4000.0F) * 2.0,
                     modifiers -> 0.4564 + Math.cos(modifiers.get("life_time") * 4000.0F - 100.0F) * 1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -1.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 34.79698357352848, modifiers -> -3.8588181012601126, modifiers -> 1.172169753050154),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> 19.797 + Math.cos(modifiers.get("life_time") * 4000.0F - 0.0F) * 1.0,
                     modifiers -> -3.858818101259985,
                     modifiers -> 1.1721697530501114
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 19.797 + Math.cos(modifiers.get("life_time") * 4000.0F - 0.0F) * 1.0,
                     modifiers -> -3.858818101259985,
                     modifiers -> 1.1721697530501114
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  0.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> -5.0 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * 1.0, modifiers -> 0.0, modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -5.0 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * 1.0, modifiers -> 0.0, modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  new AdvancedAnimationInstance(modifiers -> 21.657732978285722, modifiers -> -39.47805293166175, modifiers -> -32.61709226688592),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  1.5F,
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
                  1.5F,
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
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  1.5F,
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
                  1.5F,
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
                  new AdvancedAnimationInstance(modifiers -> 27.4334, modifiers -> -0.8833787120001944, modifiers -> -5.5187),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> -7.5666 + Math.cos(modifiers.get("life_time") * 4000.0F - 100.0F) * 1.0,
                     modifiers -> -0.8833787120000852,
                     modifiers -> -5.5187000000000985
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -7.5666 + Math.cos(modifiers.get("life_time") * 4000.0F - 100.0F) * 1.0,
                     modifiers -> -0.8833787120000852,
                     modifiers -> -5.5187000000000985
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 26.245560601119415, modifiers -> -30.427187445957152, modifiers -> -16.404360109136142),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 26.245560601119415, modifiers -> -30.427187445957152, modifiers -> -16.404360109136142),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  1.5F,
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
                  1.5F,
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
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 25.30180879088948, modifiers -> 30.472538852772686, modifiers -> 5.36074157983694),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 25.30180879088948, modifiers -> 30.472538852772686, modifiers -> 5.36074157983694),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  1.5F,
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
                  1.5F,
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
                  new AdvancedAnimationInstance(modifiers -> 44.5447, modifiers -> -6.472949974376661, modifiers -> 8.0381),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> -10.5751 + Math.cos(modifiers.get("life_time") * 4000.0F - 150.0F) * 1.0,
                     modifiers -> 10.73760854394439,
                     modifiers -> 4.854192341199941
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -10.5751 + Math.cos(modifiers.get("life_time") * 4000.0F - 150.0F) * 1.0,
                     modifiers -> 10.73760854394439,
                     modifiers -> 4.854192341199941
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  new AdvancedAnimationInstance(modifiers -> -25.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 12.880340713315945, modifiers -> 12.11530357944821, modifiers -> -4.507116372994005),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 12.880340713315945, modifiers -> 12.11530357944821, modifiers -> -4.507116372994005),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 15.902527946734153, modifiers -> -28.30293267030447, modifiers -> -22.432011657980638),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 15.902527946734153, modifiers -> -28.30293267030447, modifiers -> -22.432011657980638),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 38.21168034908247, modifiers -> -38.701793578114646, modifiers -> -23.323327383738796),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  1.5F,
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
                  1.5F,
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
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 39.04009921751098, modifiers -> 31.81473784375998, modifiers -> 16.090782851096648),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  1.5F,
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
                  1.5F,
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
                  new AdvancedAnimationInstance(modifiers -> 40.359899999999996, modifiers -> -6.633789277667802, modifiers -> -2.4405),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 15.359899999999797, modifiers -> -6.6337892776676926, modifiers -> -2.440500000000102),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  0.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> -62.6241 + Math.cos(modifiers.get("life_time") * 4000.0F + 0.0F) * 2.0, modifiers -> 2.9927, modifiers -> 4.200650739916091
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(
                     modifiers -> -62.6241 + Math.cos(modifiers.get("life_time") * 4000.0F + 0.0F) * 2.0, modifiers -> 2.9927, modifiers -> 4.200650739916091
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 1.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 1.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
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
                  new AdvancedAnimationInstance(modifiers -> 1.843, modifiers -> -0.7651155028479479, modifiers -> -8.350498088964741),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> 84.3226 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * 7.5,
                     modifiers -> -0.19554585521065748,
                     modifiers -> -5.916148942692962
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(
                     modifiers -> 84.3226 + Math.cos(modifiers.get("life_time") * 4000.0F - 50.0F) * 7.5,
                     modifiers -> -0.19554585521065748,
                     modifiers -> -5.916148942692962
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  new AdvancedAnimationInstance(modifiers -> -48.457156131923185, modifiers -> 50.865248222225844, modifiers -> 75.49214567578565),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> 12.062162229967306,
                     modifiers -> 27.78453304855349,
                     modifiers -> 38.131 + Math.cos(modifiers.get("life_time") * 4000.0F - 150.0F) * 3.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 12.062162229967306,
                     modifiers -> 27.78453304855349,
                     modifiers -> 38.131 + Math.cos(modifiers.get("life_time") * 4000.0F - 150.0F) * 3.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  new AdvancedAnimationInstance(modifiers -> -78.42659999999955, modifiers -> 19.0568, modifiers -> -20.208484171647342),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -12.797065922503577, modifiers -> -7.752843777607211, modifiers -> -13.996523064434733),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -12.797065922503577, modifiers -> -7.752843777607211, modifiers -> -13.996523064434733),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
                  new AdvancedAnimationInstance(modifiers -> -48.4266, modifiers -> 19.0568, modifiers -> -20.208484171647342),
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
                  new AdvancedAnimationInstance(modifiers -> -84.27390448552444, modifiers -> -41.579442797800425, modifiers -> -31.03111822018127),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> 40.84252756223849,
                     modifiers -> -30.642715987942736,
                     modifiers -> -48.0292 + Math.cos(modifiers.get("life_time") * 4000.0F - 200.0F) * 3.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  new AdvancedAnimationInstance(modifiers -> -90.5061, modifiers -> -10.5249, modifiers -> 6.7719950935656925),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -27.52937026812812, modifiers -> 2.7643004799738087, modifiers -> -0.21673400761026684),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
                  new AdvancedAnimationInstance(modifiers -> -33.0061, modifiers -> -10.5249, modifiers -> 6.7719950935656925),
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
                  1.5F,
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  new AdvancedAnimationInstance(modifiers -> -27.67468502347856, modifiers -> -18.01339295914977, modifiers -> -10.2699),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .build();
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_IDLE = AdvancedAnimationDefinition.Builder.withLength(0.0F)
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 7.4833 + Math.cos(modifiers.get("life_time") * 100.0F + 0.0F) * 2.5,
                     modifiers -> 6.4605 + Math.cos(modifiers.get("life_time") * 2000.0F) * 0.25,
                     modifiers -> 8.4107 + Math.cos(modifiers.get("life_time") * 100.0F - 50.0F) * 1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(
                     modifiers -> Math.cos(modifiers.get("life_time") * 100.0F) * 0.5,
                     modifiers -> -1.0 + Math.cos(modifiers.get("life_time") * 100.0F + 75.0F) * 0.75,
                     modifiers -> 1.0 + Math.cos(modifiers.get("life_time") * 100.0F + 50.0F) * 0.5
                  ),
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
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 4.9811 + Math.cos(modifiers.get("life_time") * 100.0F - 50.0F) * 2.5,
                     modifiers -> 0.43523000247023447,
                     modifiers -> -4.9811 + Math.cos(modifiers.get("life_time") * 100.0F - 100.0F) * 1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(
                     modifiers -> 10.0 + Math.cos(modifiers.get("life_time") * 100.0F - 100.0F) * 2.5,
                     modifiers -> 0.0,
                     modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 100.0F - 150.0F) * 1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(modifiers -> 7.558553640232834, modifiers -> 33.30736048902137, modifiers -> 18.67432686714366),
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
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 17.4334 + Math.cos(modifiers.get("life_time") * 100.0F - 150.0F) * 2.5,
                     modifiers -> -0.8833787120001944,
                     modifiers -> -5.5187 + Math.cos(modifiers.get("life_time") * 100.0F - 200.0F) * 1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 32.5, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 24.5447 + Math.cos(modifiers.get("life_time") * 100.0F - 200.0F) * 2.5,
                     modifiers -> -6.472949974376661,
                     modifiers -> 8.0381 + Math.cos(modifiers.get("life_time") * 100.0F - 250.0F) * 1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> -25.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> -27.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(modifiers -> -38.71307261662236, modifiers -> 34.73537768420235, modifiers -> -40.829801352036434),
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
         "neck",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -24.6401 + Math.cos(modifiers.get("life_time") * 100.0F - 250.0F) * 7.5,
                     modifiers -> -6.633789277667802,
                     modifiers -> -2.4405 + Math.cos(modifiers.get("life_time") * 100.0F - 300.0F) * 1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(
                     modifiers -> -30.04154900070398,
                     modifiers -> 5.212 + Math.cos(modifiers.get("life_time") * 50.0F - 350.0F) * 5.0,
                     modifiers -> 5.3547 + Math.cos(modifiers.get("life_time") * 50.0F - 350.0F) * 5.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                     modifiers -> -10.0775 + Math.cos(modifiers.get("life_time") * 100.0F + 25.0F) * 10.0,
                     modifiers -> 8.6887 + Math.cos(modifiers.get("life_time") * 1000.0F) * 1.0,
                     modifiers -> 36.124817767709374
                  ),
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
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -48.4266 + Math.cos(modifiers.get("life_time") * 100.0F - 25.0F) * 5.0,
                     modifiers -> 19.0568 + Math.cos(modifiers.get("life_time") * 1000.0F - 50.0F) * -1.0,
                     modifiers -> -20.208484171647342
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                     modifiers -> -25.3084 + Math.cos(modifiers.get("life_time") * 100.0F + 75.0F) * 10.0,
                     modifiers -> -24.1499,
                     modifiers -> -29.14689223552932
                  ),
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
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -33.0061 + Math.cos(modifiers.get("life_time") * 100.0F + 25.0F) * 5.0,
                     modifiers -> -10.5249,
                     modifiers -> 6.7719950935656925
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 22.5, modifiers -> 10.0 + Math.cos(modifiers.get("life_time") * 100.0F) * 1.0),
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
                  new AdvancedAnimationInstance(modifiers -> -1.0 + Math.cos(modifiers.get("life_time") * 100.0F) * 0.5, modifiers -> 0.0, modifiers -> 3.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                     modifiers -> -27.67468502347856,
                     modifiers -> -18.01339295914977,
                     modifiers -> -10.2699 + Math.cos(modifiers.get("life_time") * 100.0F) * 1.0
                  ),
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
                  new AdvancedAnimationInstance(modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 100.0F) * 0.5, modifiers -> -2.0, modifiers -> 0.0),
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
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .build();
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_WALK = AdvancedAnimationDefinition.Builder.withLength(0.0F)
      .addAnimation(
         "everything",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0,
                     modifiers -> Math.cos(modifiers.get("walk_progress") * 5000.0F)
                        * (1.0F * (Math.cos(modifiers.get("walk_progress") * 1000.0F + 40.0F) * -1.0 > 0.8 ? modifiers.get("ground_speed") * 1.0F : 0.0F)),
                     modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(
                     modifiers -> 25.0 + Math.cos(modifiers.get("walk_progress") * 1000.0F + 50.0F) * -10.0,
                     modifiers -> 0.0
                        + Math.cos(modifiers.get("walk_progress") * 500.0F - 25.0F) * 7.5
                        + Math.cos(modifiers.get("life_time") * 2000.0F) * (1.0F * modifiers.get("ground_speed")),
                     modifiers -> 0.0 + Math.cos(modifiers.get("walk_progress") * 500.0F + 0.0F) * 12.5
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0 + Math.cos(modifiers.get("walk_progress") * 500.0F + 50.0F) * 0.75,
                     modifiers -> Math.cos(modifiers.get("walk_progress") * 1000.0F - 150.0F)
                        * (1.0 * (-1.5 + Math.cos(modifiers.get("walk_progress") * 1000.0F - 100.0F) * -0.5)),
                     modifiers -> 0.0
                  ),
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
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 4.9811 + Math.cos(modifiers.get("walk_progress") * 1000.0F - 0.0F) * -2.5,
                     modifiers -> 0.43523000247023447,
                     modifiers -> -4.9811 + Math.cos(modifiers.get("walk_progress") * 500.0F - 50.0F) * 2.5
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(
                     modifiers -> 10.0 + Math.cos(modifiers.get("walk_progress") * 1000.0F - 50.0F) * -2.5,
                     modifiers -> 0.0,
                     modifiers -> 0.0 + Math.cos(modifiers.get("walk_progress") * 500.0F - 100.0F) * 2.5
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(modifiers -> 7.558553640232834, modifiers -> 33.30736048902137, modifiers -> 18.67432686714366),
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
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 17.4334 + Math.cos(modifiers.get("walk_progress") * 1000.0F - 100.0F) * -2.5,
                     modifiers -> -0.8833787120001944,
                     modifiers -> -5.5187 + Math.cos(modifiers.get("walk_progress") * 500.0F - 150.0F) * 2.5
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 32.5, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 24.5447 + Math.cos(modifiers.get("walk_progress") * 1000.0F - 150.0F) * -2.5,
                     modifiers -> -6.472949974376661,
                     modifiers -> 8.0381 + Math.cos(modifiers.get("walk_progress") * 500.0F - 200.0F) * 2.5
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(modifiers -> -38.71307261662236, modifiers -> 34.73537768420235, modifiers -> -40.829801352036434),
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
         "neck",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0, modifiers -> 0.0 + Math.cos(modifiers.get("walk_progress") * 500.0F - 25.0F) * -12.5, modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(
                     modifiers -> -73.02073218019541,
                     modifiers -> 8.639651529104867,
                     modifiers -> -2.552 + Math.cos(modifiers.get("walk_progress") * 500.0F - 25.0F) * 7.5
                  ),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                     modifiers -> -10.0775 + Math.cos(modifiers.get("walk_progress") * 500.0F - 50.0F) * (1.0F * (40.0F * modifiers.get("ground_speed"))),
                     modifiers -> 8.6887 + Math.cos(modifiers.get("walk_progress") * 500.0F - 50.0F) * -15.0,
                     modifiers -> 36.124817767709374
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
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0,
                     modifiers -> 0.0 + Math.cos(modifiers.get("walk_progress") * 500.0F - 50.0F) * -2.0,
                     modifiers -> 0.0 + Math.cos(modifiers.get("walk_progress") * 500.0F - 50.0F) * 2.0
                  ),
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -48.4266, modifiers -> 19.0568, modifiers -> -20.208484171647342),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                     modifiers -> -25.3084 + Math.cos(modifiers.get("walk_progress") * 500.0F - 100.0F) * (1.0F * (-40.0F * modifiers.get("ground_speed"))),
                     modifiers -> -24.1499,
                     modifiers -> -29.14689223552932
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
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0,
                     modifiers -> 0.0 + Math.cos(modifiers.get("walk_progress") * 500.0F - 100.0F) * 2.0,
                     modifiers -> 0.0 + Math.cos(modifiers.get("walk_progress") * 500.0F - 100.0F) * -2.0
                  ),
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -33.0061, modifiers -> -10.5249, modifiers -> 6.7719950935656925),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                     modifiers -> 0.4137 + Math.cos(modifiers.get("walk_progress") * 500.0F - 50.0F) * (1.0F * (-50.0F * modifiers.get("ground_speed"))),
                     modifiers -> 0.0,
                     modifiers -> 4.3965228780703
                  ),
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
                  new AdvancedAnimationInstance(
                     modifiers -> -1.0,
                     modifiers -> -1.0
                        + Mth.clamp(
                           Math.cos(modifiers.get("walk_progress") * 500.0F + 50.0F)
                              * (1.0 * (10.0 + Math.cos(modifiers.get("walk_progress") * 500.0F + 100.0F) * -5.0)),
                           0.0,
                           360.0
                        ),
                     modifiers -> Math.cos(modifiers.get("walk_progress") * 500.0F - 50.0F) * -2.5
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
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> Mth.clamp(
                        Math.cos(modifiers.get("walk_progress") * 500.0F + 30.0F) * (1.0F * (70.0F * modifiers.get("ground_speed"))), 0.0, 360.0
                     ),
                     modifiers -> 0.0,
                     modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                     modifiers -> 0.4137 + Math.cos(modifiers.get("walk_progress") * 500.0F - 50.0F) * (1.0F * (50.0F * modifiers.get("ground_speed"))),
                     modifiers -> 0.0,
                     modifiers -> -4.3965
                  ),
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
                  new AdvancedAnimationInstance(
                     modifiers -> 1.0,
                     modifiers -> -1.0
                        + Mth.clamp(
                           Math.cos(modifiers.get("walk_progress") * 500.0F + 50.0F)
                              * (1.0 * (-10.0 + Math.cos(modifiers.get("walk_progress") * 500.0F + 100.0F) * -5.0)),
                           0.0,
                           360.0
                        ),
                     modifiers -> Math.cos(modifiers.get("walk_progress") * 500.0F - 50.0F) * 2.5
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
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> Mth.clamp(
                        Math.cos(modifiers.get("walk_progress") * 500.0F + 30.0F) * (1.0F * (-70.0F * modifiers.get("ground_speed"))), 0.0, 360.0
                     ),
                     modifiers -> 0.0,
                     modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(
                     modifiers -> -8.2456 + Math.cos(modifiers.get("walk_progress") * 500.0F - 50.0F) * (1.0F * (20.0F * modifiers.get("ground_speed"))),
                     modifiers -> -10.3606,
                     modifiers -> 11.0022
                  ),
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
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0,
                     modifiers -> -1.0 + Math.cos(modifiers.get("walk_progress") * 500.0F - 50.0F) * -2.0,
                     modifiers -> 1.0 + Math.cos(modifiers.get("walk_progress") * 500.0F - 50.0F) * 2.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(
                     modifiers -> -8.2456 + Math.cos(modifiers.get("walk_progress") * 500.0F - 100.0F) * (1.0F * (-20.0F * modifiers.get("ground_speed"))),
                     modifiers -> 10.360613952179392,
                     modifiers -> -11.00219798279295
                  ),
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
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0,
                     modifiers -> -1.0 + Math.cos(modifiers.get("walk_progress") * 500.0F - 100.0F) * 2.0,
                     modifiers -> 1.0 + Math.cos(modifiers.get("walk_progress") * 500.0F - 100.0F) * -2.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                     modifiers -> 15.0
                        + Math.cos(modifiers.get("walk_progress") * 1000.0F - 250.0F) * 12.5
                        + Math.cos(modifiers.get("life_time") * 2000.0F - 50.0F) * 1.5,
                     modifiers -> 0.0 + Math.cos(modifiers.get("walk_progress") * 500.0F - 300.0F) * 2.5,
                     modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .build();
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_CROUCHING_POSE = AdvancedAnimationDefinition.Builder.withLength(0.0F)
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -12.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 20.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 12.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 1.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 1.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> -42.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(modifiers -> -51.89681324729827, modifiers -> 29.6877, modifiers -> -13.2827),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(modifiers -> -51.89681324729827, modifiers -> -29.6877, modifiers -> 13.2827),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(modifiers -> -24.972825510945313, modifiers -> -1.6887, modifiers -> -1.8437),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -6.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 52.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(modifiers -> -24.972825510945313, modifiers -> 1.688684113970794, modifiers -> 1.8437273061858832),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> -6.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 52.5, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .build();
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_OFFSET_LEGS = AdvancedAnimationDefinition.Builder.withLength(0.0F)
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0, modifiers -> 0.0, modifiers -> modifiers.get("left_leg_y") * -30.0F + modifiers.get("right_leg_y") * 30.0F
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
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
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0, modifiers -> modifiers.get("left_leg_y") * 8.0F + modifiers.get("right_leg_y") * 8.0F, modifiers -> 0.0
                  ),
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
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> modifiers.get("right_leg_y") * 16.0F, modifiers -> 0.0),
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
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> modifiers.get("left_leg_y") * 16.0F, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               )
            }
         )
      )
      .build();
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_DEATH = AdvancedAnimationDefinition.Builder.withLength(0.25F)
      .addAnimation(
         "everything",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 6000.0F) * 1.0,
                     modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 6000.0F + 50.0F) * 1.0,
                     modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 6000.0F - 200.0F) * 1.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 6000.0F) * 1.0,
                     modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 6000.0F + 50.0F) * 1.0,
                     modifiers -> 0.0 + Math.cos(modifiers.get("life_time") * 6000.0F - 200.0F) * 1.0
                  ),
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
                  new AdvancedAnimationInstance(modifiers -> 7.4833, modifiers -> 6.4605, modifiers -> 8.4107),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -8.048365685279823, modifiers -> 5.783002957417884, modifiers -> 3.42835356243555),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> -8.048365685279823, modifiers -> 5.783002957417884, modifiers -> 3.42835356243555),
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
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -14.286786835816219, modifiers -> 3.272900057082952, modifiers -> 17.353378733973404),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> -14.286786835816219, modifiers -> 3.272900057082952, modifiers -> 17.353378733973404),
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
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -6.528805108989218, modifiers -> 6.193754632693981, modifiers -> -30.921048917491134),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> -6.528805108989218, modifiers -> 6.193754632693981, modifiers -> -30.921048917491134),
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
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 19.971454774373505, modifiers -> -17.687523485605087, modifiers -> -26.980314833941993),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 19.971454774373505, modifiers -> -17.687523485605087, modifiers -> -26.980314833941993),
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
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 32.43174950644876, modifiers -> 1.9326451843955326, modifiers -> 38.79167052320921),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 32.43174950644876, modifiers -> 1.9326451843955326, modifiers -> 38.79167052320921),
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
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 20.792145535760973, modifiers -> 20.491024820403055, modifiers -> 31.693380924322845),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 20.792145535760973, modifiers -> 20.491024820403055, modifiers -> 31.693380924322845),
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
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -75.04154900070401, modifiers -> 5.211999999999953, modifiers -> 5.354699999999957),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> -75.04154900070401, modifiers -> 5.211999999999953, modifiers -> 5.354699999999957),
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
                  new AdvancedAnimationInstance(modifiers -> 1.843, modifiers -> -0.7651155028479479, modifiers -> -8.350498088964741),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 84.3429999999997, modifiers -> -0.7651155028479661, modifiers -> -8.350498088964832),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 84.3429999999997, modifiers -> -0.7651155028479661, modifiers -> -8.350498088964832),
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
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 46.74406269717194, modifiers -> 1.8699556228088472, modifiers -> 28.774468580845785),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 46.74406269717194, modifiers -> 1.8699556228088472, modifiers -> 28.774468580845785),
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
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 38.606589851718525, modifiers -> -7.705908508239098, modifiers -> -39.0742849524594),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 38.606589851718525, modifiers -> -7.705908508239098, modifiers -> -39.0742849524594),
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
         "rightLeg",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
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
                  0.0F,
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
                  0.0F,
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
                  0.0F,
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .build();
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_HURT = AdvancedAnimationDefinition.Builder.withLength(0.25F)
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -7.492942810808472, modifiers -> -0.32621370972219665, modifiers -> -2.4786389426803908),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 1.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -2.5095012534748093, modifiers -> 0.21782074970724352, modifiers -> -4.995265197606386),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  new AdvancedAnimationInstance(modifiers -> -5.0, modifiers -> 0.0, modifiers -> 5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -22.5, modifiers -> 15.0, modifiers -> -17.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -4.900171945775128, modifiers -> 16.768664881959012, modifiers -> 15.572673742017741),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -7.497623568589006, modifiers -> -0.10901393533140435, modifiers -> -2.497623568589006),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 29.53894035680014, modifiers -> 19.6589836237481, modifiers -> 0.7595840843928272),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 20.55627001793937, modifiers -> -5.119681632866559, modifiers -> -7.073690269329745),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 7.575584848786548, modifiers -> 0.8671724090795578, modifiers -> 9.962710787263859),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 32.81441633159602, modifiers -> 9.760610979188641, modifiers -> -12.686636324129267),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -10.0, modifiers -> 17.5, modifiers -> 5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -7.606071133395744, modifiers -> 13.28709446427547, modifiers -> -14.008302616501169),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.041666668F,
                  new AdvancedAnimationInstance(modifiers -> 6.158349942035802, modifiers -> 6.4284635541769255, modifiers -> -15.613660145710362),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 7.538430772695392, modifiers -> 34.373863984555555, modifiers -> 6.207961847585921),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 11.861699364533251, modifiers -> 12.158571108216165, modifiers -> 1.7915051471672996),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -12.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> 14.211251211965646, modifiers -> -17.30746586784153, modifiers -> -17.855589614125165),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -12.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .build();
}
