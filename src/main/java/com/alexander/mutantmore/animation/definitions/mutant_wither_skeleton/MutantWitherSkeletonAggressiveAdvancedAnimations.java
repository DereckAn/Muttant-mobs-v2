package com.alexander.mutantmore.animation.definitions.mutant_wither_skeleton;

import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedAnimationChannel;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedAnimationDefinition;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedAnimationInstance;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedKeyframe;

public class MutantWitherSkeletonAggressiveAdvancedAnimations {
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_ATTACK_RIGHT = AdvancedAnimationDefinition.Builder.withLength(1.125F)
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 7.4833, modifiers -> 6.4605 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25, modifiers -> 8.4107
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(
                     modifiers -> 15.233866339394336,
                     modifiers -> 38.9804 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25,
                     modifiers -> 26.417821257548585
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(
                     modifiers -> 15.23, modifiers -> 38.98 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25, modifiers -> 26.42
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(
                     modifiers -> 30.43, modifiers -> 4.65 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25, modifiers -> 18.13
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(
                     modifiers -> 11.960341020941978,
                     modifiers -> -9.8016 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25,
                     modifiers -> 14.636360623198854
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> 11.960341020941978,
                     modifiers -> -9.8016 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25,
                     modifiers -> 14.636360623198854
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> 7.4833, modifiers -> 6.4605 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25, modifiers -> 8.4107
                  ),
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 0.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 0.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -3.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -3.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -2.0323631227725123, modifiers -> 15.280147873633668, modifiers -> -12.097295805754566),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -2.0323631227725123, modifiers -> 15.280147873633668, modifiers -> -12.097295805754566),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 11.251019935454039, modifiers -> 0.7446959513199545, modifiers -> -13.483968550373902),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 11.251019935454039, modifiers -> 0.7446959513199545, modifiers -> -13.483968550373902),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.125F, new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
               ),
               new AdvancedKeyframe(
                  1.125F,
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
               ),
               new AdvancedKeyframe(
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
               ),
               new AdvancedKeyframe(
                  1.125F,
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
               ),
               new AdvancedKeyframe(
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 15.713698628195452, modifiers -> -0.18246906729780665, modifiers -> 18.126231723999336),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(modifiers -> 15.713698628195452, modifiers -> -0.18246906729780665, modifiers -> 18.126231723999336),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 15.73226068517306, modifiers -> -7.390427637696849, modifiers -> -16.25108518068697),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 15.73226068517306, modifiers -> -7.390427637696849, modifiers -> -16.25108518068697),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 12.800980902440607, modifiers -> -35.56019598903715, modifiers -> -21.69524834044838),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(modifiers -> 12.800980902440607, modifiers -> -35.56019598903715, modifiers -> -21.69524834044838),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 9.061149791284116, modifiers -> -53.54554919623395, modifiers -> 1.8808334425497009),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 9.061149791284116, modifiers -> -53.54554919623395, modifiers -> 1.8808334425497009),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> -12.292101800998807, modifiers -> 30.324480525246145, modifiers -> -23.342879439292574),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(modifiers -> -12.292101800998807, modifiers -> 30.324480525246145, modifiers -> -23.342879439292574),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> -2.1447765164097294, modifiers -> 32.210791122699135, modifiers -> 0.7107990477770727),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> -2.1447765164097294, modifiers -> 32.210791122699135, modifiers -> 0.7107990477770727),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 24.82274285568341, modifiers -> 5.198406182346644, modifiers -> -16.906661248135116),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(modifiers -> 24.82274285568341, modifiers -> 5.198406182346644, modifiers -> -16.906661248135116),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 27.437788375151303, modifiers -> -6.211420400422339, modifiers -> 2.5671971217701692),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 27.437788375151303, modifiers -> -6.211420400422339, modifiers -> 2.5671971217701692),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 2.5118138832162913, modifiers -> -5.588292293779432, modifiers -> 12.198881229820017),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> 2.5118138832162913, modifiers -> -5.588292293779432, modifiers -> 12.198881229820017),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> -7.870212937412724, modifiers -> 3.9316743201862323, modifiers -> 14.297563345485344),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -7.870212937412724, modifiers -> 3.9316743201862323, modifiers -> 14.297563345485344),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  new AdvancedAnimationInstance(modifiers -> -27.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -87.90426394062962, modifiers -> -25.75099123674641, modifiers -> 30.057135642930135),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -87.90426394062962, modifiers -> -25.75099123674641, modifiers -> 30.057135642930135),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> -22.459999999999994, modifiers -> -20.23, modifiers -> 23.62),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.8333333F,
                  new AdvancedAnimationInstance(modifiers -> -22.459999999999994, modifiers -> -20.23, modifiers -> 23.62),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> -19.92286519485164, modifiers -> -29.7187408775181, modifiers -> 13.594744049251677),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(modifiers -> -19.92286519485164, modifiers -> -29.7187408775181, modifiers -> 13.594744049251677),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> -32.14163615138327, modifiers -> -58.44381263057468, modifiers -> 10.656485654180724),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> -32.14163615138327, modifiers -> -58.44381263057468, modifiers -> 10.656485654180724),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
               ),
               new AdvancedKeyframe(
                  1.125F,
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
               ),
               new AdvancedKeyframe(
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 5.92649851748989, modifiers -> -28.57483517522576, modifiers -> -14.001867352463648),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> 5.92649851748989, modifiers -> -28.57483517522576, modifiers -> -14.001867352463648),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> -21.621614153516255, modifiers -> -9.543147554366225, modifiers -> -12.040312582401093),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> -24.6401, modifiers -> -6.633789277667802, modifiers -> -2.4405),
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
                  new AdvancedAnimationInstance(modifiers -> -30.04154900070398, modifiers -> 5.212, modifiers -> 5.3547),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> -23.57993186642083, modifiers -> -17.40920944317171, modifiers -> 24.857632287116395),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -23.57993186642083, modifiers -> -17.40920944317171, modifiers -> 24.857632287116395),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> -46.90583340163828, modifiers -> 32.08657209277162, modifiers -> 14.921289575588197),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> -30.04154900070398, modifiers -> 5.212, modifiers -> 5.3547),
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
                     modifiers -> 1.843 + Math.cos(modifiers.get("anim_time") * 2000.0F - 50.0F) * 0.75,
                     modifiers -> -0.7651155028479479,
                     modifiers -> -8.350498088964741
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(
                     modifiers -> -0.657 + Math.cos(modifiers.get("anim_time") * 3000.0F - 50.0F) * 1.5,
                     modifiers -> -0.7651155028479479,
                     modifiers -> -8.350498088964741
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(
                     modifiers -> 34.343 + Math.cos(modifiers.get("anim_time") * 2000.0F - 50.0F) * 5.0,
                     modifiers -> -0.7651155028479479,
                     modifiers -> -8.350498088964741
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(
                     modifiers -> 36.8177 + Math.cos(modifiers.get("anim_time") * 2000.0F - 50.0F) * 5.0,
                     modifiers -> -15.463184363569326,
                     modifiers -> -25.610273537944977
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(
                     modifiers -> 34.9093 + Math.cos(modifiers.get("anim_time") * 2000.0F - 50.0F) * 5.0,
                     modifiers -> -4.823898791203192,
                     modifiers -> -14.851086694595779
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> 1.843 + Math.cos(modifiers.get("anim_time") * 2000.0F - 50.0F) * 0.75,
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
                  new AdvancedAnimationInstance(
                     modifiers -> -10.0775, modifiers -> 8.6887 + Math.cos(modifiers.get("anim_time") * 1000.0F) * 1.0, modifiers -> 36.124817767709374
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(
                     modifiers -> 59.92, modifiers -> 8.69 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 5.0, modifiers -> 36.12
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(
                     modifiers -> 59.92, modifiers -> 8.69 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 5.0, modifiers -> 36.12
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> -118.25596981002725, modifiers -> 26.937828818915875, modifiers -> 8.037076490490215),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> -118.25596981002725, modifiers -> 26.937828818915875, modifiers -> 8.037076490490215),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> -2.0, modifiers -> 0.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> -2.0, modifiers -> 0.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -48.4266, modifiers -> 19.0568, modifiers -> -20.208484171647342),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -79.33015370331367, modifiers -> -2.4418599999589254, modifiers -> -14.31776017079843),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -79.33015370331367, modifiers -> -2.4418599999589254, modifiers -> -14.31776017079843),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -96.01, modifiers -> -0.72, modifiers -> -4.24),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(modifiers -> 82.23859946322091, modifiers -> 14.868698647770543, modifiers -> -2.0030683550808135),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 37.23859946322091, modifiers -> 14.868698647770543, modifiers -> -2.0030683550808135),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -25.3084, modifiers -> -24.1499, modifiers -> -29.14689223552932),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -86.69737276607884, modifiers -> -65.6201988370567, modifiers -> -1.3909885740449681),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -86.69737276607884, modifiers -> -65.6201988370567, modifiers -> -1.3909885740449681),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 8.129123904157439, modifiers -> -35.612540077458014, modifiers -> -8.38932228212834),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.8333333F,
                  new AdvancedAnimationInstance(modifiers -> 8.129123904157439, modifiers -> -35.612540077458014, modifiers -> -8.38932228212834),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
               ),
               new AdvancedKeyframe(
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> -121.16962857160001, modifiers -> -4.124929604351582, modifiers -> 31.1533274581184),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -121.16962857160001, modifiers -> -4.124929604351582, modifiers -> 31.1533274581184),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> -58.446887192098984, modifiers -> 4.595703714503998, modifiers -> -11.522893259576904),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.8333333F,
                  new AdvancedAnimationInstance(modifiers -> -58.446887192098984, modifiers -> 4.595703714503998, modifiers -> -11.522893259576904),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -6.035932761413733, modifiers -> 22.695026496585797, modifiers -> 7.279751939556718),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -6.035932761413733, modifiers -> 22.695026496585797, modifiers -> 7.279751939556718),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 16.366008815072746, modifiers -> 16.582251798950438, modifiers -> 15.508870973355442),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 16.366008815072746, modifiers -> 16.582251798950438, modifiers -> 15.508870973355442),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 6.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 6.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -1.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -1.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -18.786529239291596, modifiers -> -16.357687110528115, modifiers -> -6.473194204667397),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -18.786529239291596, modifiers -> -16.357687110528115, modifiers -> -6.473194204667397),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -36.29911485598852, modifiers -> -12.787658782220223, modifiers -> -10.289734448505532),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -36.29911485598852, modifiers -> -12.787658782220223, modifiers -> -10.289734448505532),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> -1.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> -1.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.9, modifiers -> -4.1, modifiers -> -4.1),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.9, modifiers -> -4.1, modifiers -> -4.1),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> 7.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 64.45904913052615, modifiers -> 0.14392503432794912, modifiers -> 0.3512632064212994),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 64.45904913052615, modifiers -> 0.14392503432794912, modifiers -> 0.3512632064212994),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .build();
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_ATTACK_LEFT = AdvancedAnimationDefinition.Builder.withLength(1.125F)
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 7.4833, modifiers -> 6.4605 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25, modifiers -> 8.4107
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(
                     modifiers -> 31.099579143168267,
                     modifiers -> 41.9555 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25,
                     modifiers -> 20.438167978950478
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(
                     modifiers -> 31.099579143168267,
                     modifiers -> 41.9555 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25,
                     modifiers -> 20.438167978950478
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(
                     modifiers -> 22.299999999999997, modifiers -> 13.06 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25, modifiers -> 1.68
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(
                     modifiers -> 19.903933749285425,
                     modifiers -> -15.3959 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25,
                     modifiers -> 14.10312451306956
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(
                     modifiers -> 19.903933749285425,
                     modifiers -> -15.3959 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25,
                     modifiers -> 14.10312451306956
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> 7.4833, modifiers -> 6.4605 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25, modifiers -> 8.4107
                  ),
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -2.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -2.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -3.0, modifiers -> -1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 2.0, modifiers -> 0.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 2.0, modifiers -> 0.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -4.035901369954463, modifiers -> -9.200329471034422, modifiers -> -5.243664725202034),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -4.035901369954463, modifiers -> -9.200329471034422, modifiers -> -5.243664725202034),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 1.7998883479888352, modifiers -> -25.56121835617887, modifiers -> -3.5866603782327546),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 1.7998883479888352, modifiers -> -25.56121835617887, modifiers -> -3.5866603782327546),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 24.860950385790147, modifiers -> 3.769810901139408, modifiers -> 18.31862933865432),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(modifiers -> 24.860950385790147, modifiers -> 3.769810901139408, modifiers -> 18.31862933865432),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 29.928136055461145, modifiers -> -1.7676620931602884, modifiers -> -13.441955573866526),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.8333333F,
                  new AdvancedAnimationInstance(modifiers -> 29.928136055461145, modifiers -> -1.7676620931602884, modifiers -> -13.441955573866526),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.125F,
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
               ),
               new AdvancedKeyframe(
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
               ),
               new AdvancedKeyframe(
                  1.125F,
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
               ),
               new AdvancedKeyframe(
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 17.4334, modifiers -> -0.8833787120001944, modifiers -> -5.5187),
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
               ),
               new AdvancedKeyframe(
                  1.125F,
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
               ),
               new AdvancedKeyframe(
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
               ),
               new AdvancedKeyframe(
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 32.5, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> 24.052291275859297, modifiers -> -7.190956782698977, modifiers -> -19.79503729252925),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(modifiers -> 24.052291275859297, modifiers -> -7.190956782698977, modifiers -> -19.79503729252925),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 21.973827992629523, modifiers -> 3.3841320379831075, modifiers -> 6.647036784909579),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.8333333F,
                  new AdvancedAnimationInstance(modifiers -> 21.973827992629523, modifiers -> 3.3841320379831075, modifiers -> 6.647036784909579),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -6.831194334046813, modifiers -> 18.310116662994915, modifiers -> 10.615137327033153),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -12.584445744572221, modifiers -> 15.598776795429112, modifiers -> -19.589307240743345),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> -42.415143975980136, modifiers -> -12.428610307435083, modifiers -> -10.026919411126),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -42.415143975980136, modifiers -> -12.428610307435083, modifiers -> -10.026919411126),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.5F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> -2.0, modifiers -> -1.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -2.0, modifiers -> -1.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  new AdvancedAnimationInstance(modifiers -> -27.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -60.01048993941349, modifiers -> -26.873674890952607, modifiers -> -12.501064986224375),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -60.01048993941349, modifiers -> -26.873674890952607, modifiers -> -12.501064986224375),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -82.51048993941349, modifiers -> -26.873674890952607, modifiers -> -12.501064986224375),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 13.464583037745982, modifiers -> -39.589121691473224, modifiers -> -8.567667093686431),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 13.464583037745982, modifiers -> -39.589121691473224, modifiers -> -8.567667093686431),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.125F,
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
               ),
               new AdvancedKeyframe(
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
               ),
               new AdvancedKeyframe(
                  1.125F,
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
               ),
               new AdvancedKeyframe(
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 55.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
                  1.125F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
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
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -36.39927149832796, modifiers -> -21.76148221954225, modifiers -> 27.031237619992737),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -36.39927149832796, modifiers -> -21.76148221954225, modifiers -> 27.031237619992737),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -61.06453796854836, modifiers -> -7.3033138514087845, modifiers -> -10.898805986876905),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> -61.64356453956143, modifiers -> 5.447909353673168, modifiers -> -46.66271337224855),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -27.908103797669845, modifiers -> -12.922453601160704, modifiers -> -1.6862448931973617),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -28.3, modifiers -> -9.63, modifiers -> -0.41),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -48.7013363276219, modifiers -> -6.004570033780856, modifiers -> 1.9353948386715456),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> -41.24, modifiers -> -1.52, modifiers -> 3.3),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 2.0, modifiers -> -5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 2.0, modifiers -> -5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                     modifiers -> 1.843 + Math.cos(modifiers.get("anim_time") * 2000.0F - 50.0F) * 0.75,
                     modifiers -> -0.7651155028479479,
                     modifiers -> -8.350498088964741
                  ),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(
                     modifiers -> -0.657 + Math.cos(modifiers.get("anim_time") * 3000.0F - 50.0F) * 1.5,
                     modifiers -> -0.7651155028479479,
                     modifiers -> -8.350498088964741
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(
                     modifiers -> 71.843 + Math.cos(modifiers.get("anim_time") * 2000.0F - 50.0F) * 5.0,
                     modifiers -> -0.7651155028479479,
                     modifiers -> -8.350498088964741
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(
                     modifiers -> 47.5372 + Math.cos(modifiers.get("anim_time") * 2000.0F - 50.0F) * 5.0,
                     modifiers -> 5.533994329839061,
                     modifiers -> -33.77282637177268
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> 41.2333 + Math.cos(modifiers.get("anim_time") * 2000.0F - 50.0F) * 5.0,
                     modifiers -> -24.330269510119706,
                     modifiers -> -38.497984462099794
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  new AdvancedAnimationInstance(modifiers -> -10.0775, modifiers -> 8.6887, modifiers -> 36.124817767709374),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 24.92, modifiers -> 8.69, modifiers -> 36.12),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 24.92, modifiers -> 8.69, modifiers -> 36.12),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> -43.27121073184624, modifiers -> 19.45512822771019, modifiers -> 43.23617612450163),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -43.27121073184624, modifiers -> 19.45512822771019, modifiers -> 43.23617612450163),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -48.43, modifiers -> 19.06, modifiers -> -20.21),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -48.43, modifiers -> 19.06, modifiers -> -20.21),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> -44.02343901054172, modifiers -> 32.01220962513759, modifiers -> 6.820505377017561),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -64.94773684528371, modifiers -> 24.464335074938447, modifiers -> 30.95334304357133),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  new AdvancedAnimationInstance(modifiers -> -39.897427887047364, modifiers -> -17.7797009554338, modifiers -> -99.34526760475042),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -71.32597599663546, modifiers -> -25.144156074094006, modifiers -> -106.97918426088782),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -113.98050298441336, modifiers -> -36.93554957140659, modifiers -> -79.3181291705877),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(modifiers -> -108.48785674736814, modifiers -> -40.20109268435619, modifiers -> -68.6029517338413),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 12.331826133697888, modifiers -> -18.332930342982856, modifiers -> -55.523059589859855),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 25.096333084094823, modifiers -> -44.9800311102569, modifiers -> -28.37459600855327),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 25.096333084094823, modifiers -> -44.9800311102569, modifiers -> -28.37459600855327),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -73.00999999999999, modifiers -> -10.52, modifiers -> 6.77),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -73.00999999999999, modifiers -> -10.52, modifiers -> 6.77),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> -11.939999999999998, modifiers -> -10.52, modifiers -> 6.77),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> -11.939999999999998, modifiers -> -10.52, modifiers -> 6.77),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(modifiers -> 45.332658598655144, modifiers -> 15.763362811172556, modifiers -> -23.552187374218647),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 32.56489028968281, modifiers -> -39.5465316395771, modifiers -> -12.947349909980403),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 44.79526035440995, modifiers -> -23.680853759314687, modifiers -> -35.83490379952309),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 49.38416939105127, modifiers -> -3.343284535940711, modifiers -> -54.9962127963081),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 49.38416939105127, modifiers -> -3.343284535940711, modifiers -> -54.9962127963081),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 22.5, modifiers -> 10.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -2.008859349261911, modifiers -> 21.71689884064017, modifiers -> 7.357653743274568),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -2.008859349261911, modifiers -> 21.71689884064017, modifiers -> 7.357653743274568),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 8.353316594097834, modifiers -> 2.3764695980945163, modifiers -> 6.912251593695364),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 5.470702305857776, modifiers -> 4.225082572223528, modifiers -> 10.823652610312873),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 5.470702305857776, modifiers -> 4.225082572223528, modifiers -> 10.823652610312873),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 6.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 6.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -2.0, modifiers -> -8.326673E-17F, modifiers -> -1.4299999999999997),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 0.08000000000000007, modifiers -> -0.33000000000000007, modifiers -> 2.94),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 0.08000000000000007, modifiers -> -0.33000000000000007, modifiers -> 2.94),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 11.43, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -34.300813398894135, modifiers -> -14.02817982412149, modifiers -> -13.417078102077102),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -34.300813398894135, modifiers -> -14.02817982412149, modifiers -> -13.417078102077102),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -44.27745441399802, modifiers -> -11.628212897032062, modifiers -> -8.82258733572664),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> -21.489107327931052, modifiers -> -10.013893492656425, modifiers -> -3.2299236096964155),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> -21.489107327931052, modifiers -> -10.013893492656425, modifiers -> -3.2299236096964155),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -3.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -3.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 1.4400000000000004, modifiers -> -4.0600000000000005, modifiers -> -0.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 3.05, modifiers -> -1.7000000000000002, modifiers -> 4.54),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 3.05, modifiers -> -1.7000000000000002, modifiers -> 4.54),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
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
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 39.76334858148563, modifiers -> 1.4519496110166983, modifiers -> 3.5436258765458115),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.41666666F,
                  new AdvancedAnimationInstance(modifiers -> 39.76334858148563, modifiers -> 1.4519496110166983, modifiers -> 3.5436258765458115),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 60.4776342957716, modifiers -> 1.4519496110166983, modifiers -> 3.5436258765458115),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .build();
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_RIB_CRUSH = AdvancedAnimationDefinition.Builder.withLength(1.75F)
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 7.4833, modifiers -> 6.4605 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25, modifiers -> 8.4107
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(
                     modifiers -> -12.952316551942218,
                     modifiers -> 1.8657 + Math.cos(modifiers.get("anim_time") * 4000.0F) * 2.0,
                     modifiers -> 2.4646075499059954
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> -12.952316551942218,
                     modifiers -> 1.8657 + Math.cos(modifiers.get("anim_time") * 4000.0F) * 2.0,
                     modifiers -> 2.4646075499059954
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> 19.547683448057782, modifiers -> 1.86566820240565, modifiers -> 2.4646075499059954),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 19.547683448057782, modifiers -> 1.86566820240565, modifiers -> 2.4646075499059954),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> 19.547683448057782, modifiers -> 1.86566820240565, modifiers -> 2.4646075499059954),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
                  new AdvancedAnimationInstance(modifiers -> 7.4833, modifiers -> 6.4605, modifiers -> 8.4107),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> 7.4833, modifiers -> 6.4605 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25, modifiers -> 8.4107
                  ),
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
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -1.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -1.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.8333333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 1.0, modifiers -> -4.33),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -4.0, modifiers -> -7.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -4.0, modifiers -> -7.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -0.5, modifiers -> -6.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.45833334F,
                  new AdvancedAnimationInstance(modifiers -> -12.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> -12.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.9166667F,
                  new AdvancedAnimationInstance(modifiers -> 15.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0416666F,
                  new AdvancedAnimationInstance(modifiers -> 15.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> 15.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5416666F,
                  new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 9.848581192847774, modifiers -> 15.774031730750288, modifiers -> -48.35006117755949),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 9.848581192847774, modifiers -> 15.774031730750288, modifiers -> -48.35006117755949),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> 48.1523617654631, modifiers -> -58.057145692794144, modifiers -> -43.76298709427612),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 48.1523617654631, modifiers -> -58.057145692794144, modifiers -> -43.76298709427612),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> 48.1523617654631, modifiers -> -58.057145692794144, modifiers -> -43.76298709427612),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
                  new AdvancedAnimationInstance(modifiers -> 21.657732978285722, modifiers -> -39.47805293166175, modifiers -> -32.61709226688592),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 2.706396591126631, modifiers -> -13.619239111628247, modifiers -> 41.20566325923066),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 2.706396591126631, modifiers -> -13.619239111628247, modifiers -> 41.20566325923066),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> 25.63194443011167, modifiers -> 57.1564534112818, modifiers -> 31.71932168121286),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 25.63194443011167, modifiers -> 57.1564534112818, modifiers -> 31.71932168121286),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> 25.63194443011167, modifiers -> 57.1564534112818, modifiers -> 31.71932168121286),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> 7.558553640232834, modifiers -> 33.30736048902137, modifiers -> 18.67432686714366),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  new AdvancedAnimationInstance(modifiers -> 17.4334, modifiers -> -0.8833787120001944, modifiers -> -5.5187),
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
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -3.22467410088806, modifiers -> 5.103197611542946, modifiers -> 3.550980488950281),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -3.22467410088806, modifiers -> 5.103197611542946, modifiers -> 3.550980488950281),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> 6.188945772139759, modifiers -> -59.749759490605264, modifiers -> -5.554388814796493),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 6.188945772139759, modifiers -> -59.749759490605264, modifiers -> -5.554388814796493),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.3333334F,
                  new AdvancedAnimationInstance(modifiers -> 6.188945772139759, modifiers -> -59.749759490605264, modifiers -> -5.554388814796493),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.6666666F,
                  new AdvancedAnimationInstance(modifiers -> -4.03977695801359, modifiers -> -37.32372634615467, modifiers -> 6.286198496930865),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 32.5, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -10.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -10.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> -1.7694787372461178, modifiers -> 46.55846854197034, modifiers -> 14.627707109634684),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -1.7694787372461178, modifiers -> 46.55846854197034, modifiers -> 14.627707109634684),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.375F,
                  new AdvancedAnimationInstance(modifiers -> -1.7694787372461178, modifiers -> 46.55846854197034, modifiers -> 14.627707109634684),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5833334F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 32.5, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  new AdvancedAnimationInstance(modifiers -> 24.5447, modifiers -> -6.472949974376661, modifiers -> 8.0381),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -18.13703972333493, modifiers -> 10.181298412239158, modifiers -> 2.634322407008348),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.8333333F,
                  new AdvancedAnimationInstance(modifiers -> -18.13703972333493, modifiers -> 10.181298412239158, modifiers -> 2.634322407008348),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.9583333F,
                  new AdvancedAnimationInstance(modifiers -> 38.18617146120992, modifiers -> 8.041749925495587, modifiers -> 13.733565321323002),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0833334F,
                  new AdvancedAnimationInstance(modifiers -> 38.18617146120992, modifiers -> 8.041749925495587, modifiers -> 13.733565321323002),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.3333334F,
                  new AdvancedAnimationInstance(modifiers -> 24.5447, modifiers -> -6.472949974376661, modifiers -> 8.0381),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5833334F,
                  new AdvancedAnimationInstance(modifiers -> 24.5447, modifiers -> -6.472949974376661, modifiers -> 8.0381),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -17.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -17.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -8.88715754477289, modifiers -> -0.7747028594476433, modifiers -> -13.833070336763285),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> -8.88715754477289, modifiers -> -0.7747028594476433, modifiers -> -13.833070336763285),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  new AdvancedAnimationInstance(modifiers -> -27.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -17.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -17.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -8.88715754477289, modifiers -> 0.7747, modifiers -> 13.8331),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> -8.88715754477289, modifiers -> 0.7747, modifiers -> 13.8331),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F, new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 0.0, modifiers -> 1.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 0.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  new AdvancedAnimationInstance(modifiers -> -25.885842414559548, modifiers -> -24.83077443070033, modifiers -> 26.55142675713096),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -18.62668244784949, modifiers -> 16.269197037983687, modifiers -> 35.73420875612355),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -18.62668244784949, modifiers -> 16.269197037983687, modifiers -> 35.73420875612355),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> -36.3186053103376, modifiers -> -46.323550491330465, modifiers -> 26.92541556487638),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -36.3186053103376, modifiers -> -46.323550491330465, modifiers -> 26.92541556487638),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2083334F,
                  new AdvancedAnimationInstance(modifiers -> -36.3186053103376, modifiers -> -46.323550491330465, modifiers -> 26.92541556487638),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -22.450649808885792, modifiers -> -21.3343235978166, modifiers -> -29.92537457097167),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -22.450649808885792, modifiers -> -21.3343235978166, modifiers -> -29.92537457097167),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> -40.30802125285636, modifiers -> 60.70370986275286, modifiers -> -35.82136881949025),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -40.30802125285636, modifiers -> 60.70370986275286, modifiers -> -35.82136881949025),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> -40.30802125285636, modifiers -> 60.70370986275286, modifiers -> -35.82136881949025),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> -38.71307261662236, modifiers -> 34.73537768420235, modifiers -> -40.829801352036434),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  new AdvancedAnimationInstance(modifiers -> -24.6401, modifiers -> -6.633789277667802, modifiers -> -2.4405),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 10.36, modifiers -> -6.63, modifiers -> -2.44),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 10.36, modifiers -> -6.63, modifiers -> -2.44),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> 52.86, modifiers -> -6.63, modifiers -> -2.44),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 52.86, modifiers -> -6.63, modifiers -> -2.44),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> 52.86, modifiers -> -6.63, modifiers -> -2.44),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
                  new AdvancedAnimationInstance(modifiers -> -24.6401, modifiers -> -6.633789277667802, modifiers -> -2.4405),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -39.96073550929217, modifiers -> 16.80242189380848, modifiers -> 18.732018713501112),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -39.96073550929217, modifiers -> 16.80242189380848, modifiers -> 18.732018713501112),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> -77.67910649164875, modifiers -> 3.515183443414845, modifiers -> 3.5026259539699645),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -125.17910649164875, modifiers -> 3.515183443414845, modifiers -> 3.5026259539699645),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> -125.38525646313789, modifiers -> 3.261135990281492, modifiers -> -5.5155344003219575),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
                  new AdvancedAnimationInstance(modifiers -> -30.04154900070398, modifiers -> 5.212, modifiers -> 5.3547),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -30.04154900070398, modifiers -> 5.212, modifiers -> 5.3547),
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
                     modifiers -> 1.843 + Math.cos(modifiers.get("anim_time") * 2000.0F - 50.0F) * 0.75,
                     modifiers -> -0.7651155028479479,
                     modifiers -> -8.350498088964741
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(
                     modifiers -> 11.6437 + Math.cos(modifiers.get("anim_time") * 3000.0F - 50.0F) * 2.5,
                     modifiers -> -2.348636380148964,
                     modifiers -> -24.879332803022955
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> 11.6437 + Math.cos(modifiers.get("anim_time") * 3000.0F - 50.0F) * 2.5,
                     modifiers -> -2.348636380148964,
                     modifiers -> -24.879332803022955
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 26.64, modifiers -> -2.35, modifiers -> -24.88),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> 31.552440711638283, modifiers -> 6.22277033365517, modifiers -> 4.111612197020914),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> 1.843 + Math.cos(modifiers.get("anim_time") * 2000.0F - 50.0F) * 0.75,
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
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 49.31774053509018, modifiers -> 3.3973056753983997, modifiers -> 33.825858845301916),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 49.31774053509018, modifiers -> 3.3973056753983997, modifiers -> 33.825858845301916),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -11.389529647126963, modifiers -> 21.214197150451525, modifiers -> 31.480767459897486),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> -11.389529647126963, modifiers -> 21.214197150451525, modifiers -> 31.480767459897486),
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
                  new AdvancedAnimationInstance(modifiers -> -25.3084, modifiers -> -24.1499, modifiers -> -29.14689223552932),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 42.394677455489216, modifiers -> -20.77453084097524, modifiers -> -36.5518368209513),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 42.394677455489216, modifiers -> -20.77453084097524, modifiers -> -36.5518368209513),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -20.409175977334655, modifiers -> -25.15580467068539, modifiers -> -36.787406195349284),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> -20.409175977334655, modifiers -> -25.15580467068539, modifiers -> -36.787406195349284),
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
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 22.5, modifiers -> 10.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -2.3, modifiers -> 22.47728877892314, modifiers -> 9.1),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -2.3, modifiers -> 22.47728877892314, modifiers -> 9.1),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> 15.710716154652072, modifiers -> 11.19979781366008, modifiers -> 14.607703274294272),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 15.710716154652072, modifiers -> 11.19979781366008, modifiers -> 14.607703274294272),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> 15.710716154652072, modifiers -> 11.19979781366008, modifiers -> 14.607703274294272),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
                  new AdvancedAnimationInstance(modifiers -> 20.74660658295761, modifiers -> 20.581989021170557, modifiers -> 16.112884089803174),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 4.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 4.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -2.0, modifiers -> -7.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -2.0, modifiers -> -7.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -2.0, modifiers -> -7.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -1.0, modifiers -> -5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F, new AdvancedAnimationInstance(modifiers -> 20.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.25F, new AdvancedAnimationInstance(modifiers -> 20.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.5F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -25.880185902841205, modifiers -> -16.932574244956196, modifiers -> -7.904920176106334),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.6666667F,
                  new AdvancedAnimationInstance(modifiers -> -25.880185902841205, modifiers -> -16.932574244956196, modifiers -> -7.904920176106334),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -32.35, modifiers -> -12.19, modifiers -> -8.8),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.8333333F,
                  new AdvancedAnimationInstance(modifiers -> -39.90926098075613, modifiers -> -1.25453988000816, modifiers -> -9.856155747679987),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.9166667F,
                  new AdvancedAnimationInstance(modifiers -> -44.963611486725455, modifiers -> -3.796706709130831, modifiers -> -1.2125237028807163),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -44.963611486725455, modifiers -> -3.796706709130831, modifiers -> -1.2125237028807163),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> -44.963611486725455, modifiers -> -3.796706709130831, modifiers -> -1.2125237028807163),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
                  new AdvancedAnimationInstance(modifiers -> -44.963611486725455, modifiers -> -3.796706709130831, modifiers -> -1.2125237028807163),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> -46.87746169456992, modifiers -> -9.300762339373705, modifiers -> -6.3426989401217355),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.6666667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.59, modifiers -> -2.38, modifiers -> 1.05),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.8333333F,
                  new AdvancedAnimationInstance(modifiers -> 2.0, modifiers -> 3.0, modifiers -> -4.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> 2.0, modifiers -> -0.6699999999999999, modifiers -> -7.33),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.9166667F,
                  new AdvancedAnimationInstance(modifiers -> 2.0, modifiers -> -4.0, modifiers -> -9.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 2.0, modifiers -> -4.0, modifiers -> -9.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> 2.0, modifiers -> -4.0, modifiers -> -9.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5F,
                  new AdvancedAnimationInstance(modifiers -> 2.0, modifiers -> -4.0, modifiers -> -9.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5833334F,
                  new AdvancedAnimationInstance(modifiers -> 0.69, modifiers -> -0.69, modifiers -> -3.11),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.6666666F,
                  new AdvancedAnimationInstance(modifiers -> 0.18, modifiers -> 0.26, modifiers -> 2.21),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
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
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 12.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.6666667F,
                  new AdvancedAnimationInstance(modifiers -> 12.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 35.19, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.8333333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.9166667F,
                  new AdvancedAnimationInstance(modifiers -> 47.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 47.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> 47.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.4166666F,
                  new AdvancedAnimationInstance(modifiers -> 47.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> 27.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .build();
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_WITHER_BREATH = AdvancedAnimationDefinition.Builder.withLength(5.0F)
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 7.4833, modifiers -> 6.4605 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25, modifiers -> 8.4107
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -7.52, modifiers -> 6.46 + Math.cos(modifiers.get("anim_time") * 3000.0F) * 1.0, modifiers -> 8.41),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(
                     modifiers -> -9.219450781249835,
                     modifiers -> 6.7053 + Math.cos(modifiers.get("anim_time") * 3000.0F) * 1.0,
                     modifiers -> 8.409950781249936
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -7.52, modifiers -> 6.46 + Math.cos(modifiers.get("anim_time") * 3000.0F) * 1.0, modifiers -> 8.41),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 19.98, modifiers -> 6.46 + Math.cos(modifiers.get("anim_time") * 4000.0F) * 2.5, modifiers -> 8.41),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 19.98, modifiers -> 6.46 + Math.cos(modifiers.get("anim_time") * 4000.0F) * 2.5, modifiers -> 8.41),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 7.4833, modifiers -> 6.4605 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25, modifiers -> 8.4107
                  ),
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
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> 4.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> 4.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -5.0, modifiers -> -8.09),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -5.0, modifiers -> -8.09),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  0.5416667F,
                  new AdvancedAnimationInstance(modifiers -> -6.036730751452087, modifiers -> 9.364449367644683, modifiers -> -11.727296146203553),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0416666F,
                  new AdvancedAnimationInstance(modifiers -> -6.036730751452087, modifiers -> 9.364449367644683, modifiers -> -11.727296146203553),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 14.105539287630528, modifiers -> 18.248335734793145, modifiers -> 6.090790492957712),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 14.105539287630528, modifiers -> 18.248335734793145, modifiers -> 6.090790492957712),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 0.8494455196846502, modifiers -> -15.009048472657469, modifiers -> 5.09288512478679),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0416666F,
                  new AdvancedAnimationInstance(modifiers -> 0.8494455196846502, modifiers -> -15.009048472657469, modifiers -> 5.09288512478679),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 12.780188040893881, modifiers -> -31.023818004944367, modifiers -> -12.789572533920055),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 12.780188040893881, modifiers -> -31.023818004944367, modifiers -> -12.789572533920055),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> -3.262105842869314,
                     modifiers -> -44.0683 + Math.cos(modifiers.get("anim_time") * 1000.0F - 50.0F) * 10.0,
                     modifiers -> 4.054590506417192
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -3.262105842869314,
                     modifiers -> -44.0683 + Math.cos(modifiers.get("anim_time") * 1000.0F - 50.0F) * 10.0,
                     modifiers -> 4.054590506417192
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> 22.01785844229402,
                     modifiers -> 7.5499 + Math.cos(modifiers.get("anim_time") * 1000.0F - 50.0F) * 10.0,
                     modifiers -> -23.54289878133177
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 22.01785844229402,
                     modifiers -> 7.5499 + Math.cos(modifiers.get("anim_time") * 1000.0F - 50.0F) * 10.0,
                     modifiers -> -23.54289878133177
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> 59.7617, modifiers -> 61.585 + Math.cos(modifiers.get("anim_time") * 1000.0F) * 10.0, modifiers -> 63.2377
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 59.7617, modifiers -> 61.585 + Math.cos(modifiers.get("anim_time") * 1000.0F) * 10.0, modifiers -> 63.2377
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> 14.47617468177328,
                     modifiers -> 2.7219 + Math.cos(modifiers.get("anim_time") * 1000.0F) * 10.0,
                     modifiers -> 20.77121312471194
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 14.47617468177328,
                     modifiers -> 2.7219 + Math.cos(modifiers.get("anim_time") * 1000.0F) * 10.0,
                     modifiers -> 20.77121312471194
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  new AdvancedAnimationInstance(modifiers -> 17.4334, modifiers -> -0.8833787120001944, modifiers -> -5.5187),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 8.424662475366567, modifiers -> 11.551694999142565, modifiers -> -12.228417555552387),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0833334F,
                  new AdvancedAnimationInstance(modifiers -> 8.424662475366567, modifiers -> 11.551694999142565, modifiers -> -12.228417555552387),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> 14.012888830226002, modifiers -> 32.47910554421996, modifiers -> -0.2345342879507193),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0416667F,
                  new AdvancedAnimationInstance(modifiers -> 14.012888830226002, modifiers -> 32.47910554421996, modifiers -> -0.2345342879507193),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> -23.347436047291502,
                     modifiers -> -63.0153 + Math.cos(modifiers.get("anim_time") * 1000.0F - 150.0F) * 10.0,
                     modifiers -> 46.79441176040613
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -23.347436047291502,
                     modifiers -> -63.0153 + Math.cos(modifiers.get("anim_time") * 1000.0F - 150.0F) * 10.0,
                     modifiers -> 46.79441176040613
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> -7.078084906952974,
                     modifiers -> -20.6136 + Math.cos(modifiers.get("anim_time") * 1000.0F - 150.0F) * 10.0,
                     modifiers -> 21.15139642461103
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -7.078084906952974,
                     modifiers -> -20.6136 + Math.cos(modifiers.get("anim_time") * 1000.0F - 150.0F) * 10.0,
                     modifiers -> 21.15139642461103
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 32.5, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> 25.730521262753882,
                     modifiers -> 46.5585 + Math.cos(modifiers.get("anim_time") * 1000.0F - 100.0F) * 10.0,
                     modifiers -> 14.627707109634684
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 25.730521262753882,
                     modifiers -> 46.5585 + Math.cos(modifiers.get("anim_time") * 1000.0F - 100.0F) * 10.0,
                     modifiers -> 14.627707109634684
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> -15.897128514946889,
                     modifiers -> -29.7692 + Math.cos(modifiers.get("anim_time") * 1000.0F - 100.0F) * 10.0,
                     modifiers -> 3.0310548090286655
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -15.897128514946889,
                     modifiers -> -29.7692 + Math.cos(modifiers.get("anim_time") * 1000.0F - 100.0F) * 10.0,
                     modifiers -> 3.0310548090286655
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  new AdvancedAnimationInstance(modifiers -> 24.5447, modifiers -> -6.472949974376661, modifiers -> 8.0381),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.6666667F,
                  new AdvancedAnimationInstance(modifiers -> 17.939955600043994, modifiers -> -13.802143863546206, modifiers -> 18.636720956914395),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0833334F,
                  new AdvancedAnimationInstance(modifiers -> 17.939955600043994, modifiers -> -13.802143863546206, modifiers -> 18.636720956914395),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> 29.803647054612558, modifiers -> -28.003988815608682, modifiers -> 13.459495264651778),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0416667F,
                  new AdvancedAnimationInstance(modifiers -> 29.803647054612558, modifiers -> -28.003988815608682, modifiers -> 13.459495264651778),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -77.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -77.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 13.260891320736391, modifiers -> 37.42124622143547, modifiers -> -3.023815529921194),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 13.260891320736391, modifiers -> 37.42124622143547, modifiers -> -3.023815529921194),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -92.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -92.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 20.79770146101555, modifiers -> -32.47548696110471, modifiers -> -1.5076821804095744),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 20.79770146101555, modifiers -> -32.47548696110471, modifiers -> -1.5076821804095744),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> -72.5819959791694,
                     modifiers -> -65.4602 + Math.cos(modifiers.get("anim_time") * 1000.0F - 250.0F) * 10.0,
                     modifiers -> 86.00185863527376
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -72.5819959791694,
                     modifiers -> -65.4602 + Math.cos(modifiers.get("anim_time") * 1000.0F - 250.0F) * 10.0,
                     modifiers -> 86.00185863527376
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> -12.12972037467678,
                     modifiers -> 20.178 + Math.cos(modifiers.get("anim_time") * 1000.0F - 250.0F) * 10.0,
                     modifiers -> 29.41093426100406
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -12.12972037467678,
                     modifiers -> 20.178 + Math.cos(modifiers.get("anim_time") * 1000.0F - 250.0F) * 10.0,
                     modifiers -> 29.41093426100406
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> -79.17828300658309,
                     modifiers -> 48.2944 + Math.cos(modifiers.get("anim_time") * 1000.0F - 200.0F) * 10.0,
                     modifiers -> -93.83647884523278
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -79.17828300658309,
                     modifiers -> 48.2944 + Math.cos(modifiers.get("anim_time") * 1000.0F - 200.0F) * 10.0,
                     modifiers -> -93.83647884523278
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> -49.30172298671613,
                     modifiers -> -5.0288 + Math.cos(modifiers.get("anim_time") * 1000.0F - 200.0F) * 10.0,
                     modifiers -> -15.667328074297387
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -49.30172298671613,
                     modifiers -> -5.0288 + Math.cos(modifiers.get("anim_time") * 1000.0F - 200.0F) * 10.0,
                     modifiers -> -15.667328074297387
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  new AdvancedAnimationInstance(modifiers -> -24.6401, modifiers -> -6.633789277667802, modifiers -> -2.4405),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -24.64, modifiers -> -6.63, modifiers -> -2.44),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 7.859999999999999, modifiers -> -6.63, modifiers -> -2.44),
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  new AdvancedAnimationInstance(modifiers -> -62.54, modifiers -> 5.21, modifiers -> 5.35),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -62.54, modifiers -> 5.21, modifiers -> 5.35),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> -87.53999999999999, modifiers -> 5.21 + Math.cos(modifiers.get("anim_time") * 5000.0F + 50.0F) * 5.0, modifiers -> 5.35
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -87.53999999999999, modifiers -> 5.21 + Math.cos(modifiers.get("anim_time") * 5000.0F + 50.0F) * 5.0, modifiers -> 5.35
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  1.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 2.0, modifiers -> -5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 2.0, modifiers -> -5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
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
                     modifiers -> 1.843 + Math.cos(modifiers.get("anim_time") * 2000.0F - 50.0F) * 0.75,
                     modifiers -> -0.7651155028479479,
                     modifiers -> -8.350498088964741
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(
                     modifiers -> -7.5 + Math.cos(modifiers.get("anim_time") * 4000.0F - 50.0F) * 1.0, modifiers -> 0.0, modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> -7.5 + Math.cos(modifiers.get("anim_time") * 4000.0F - 50.0F) * 1.0, modifiers -> 0.0, modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(
                     modifiers -> 85.0 + Math.cos(modifiers.get("anim_time") * 3000.0F - 50.0F) * 7.5, modifiers -> 0.0, modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 85.0 + Math.cos(modifiers.get("anim_time") * 3000.0F - 50.0F) * 7.5, modifiers -> 0.0, modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 1.843 + Math.cos(modifiers.get("anim_time") * 2000.0F - 50.0F) * 0.75,
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
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -91.78560242799365, modifiers -> 37.51955816741969, modifiers -> 40.29012140598126),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -91.78560242799365, modifiers -> 37.51955816741969, modifiers -> 40.29012140598126),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 53.777091399831036, modifiers -> -0.038453622373687324, modifiers -> 37.3461694994085),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 53.777091399831036, modifiers -> -0.038453622373687324, modifiers -> 37.3461694994085),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  new AdvancedAnimationInstance(modifiers -> -25.3084, modifiers -> -24.1499, modifiers -> -29.14689223552932),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -101.73404658097667, modifiers -> -24.99585227632351, modifiers -> -31.73691854447261),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -101.73404658097667, modifiers -> -24.99585227632351, modifiers -> -31.73691854447261),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 41.3391826417642, modifiers -> -6.710535987779167, modifiers -> -46.35372397160039),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 41.3391826417642, modifiers -> -6.710535987779167, modifiers -> -46.35372397160039),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 22.5, modifiers -> 10.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -4.6199869162092, modifiers -> 22.452583497199612, modifiers -> 8.376874930372196),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -4.6199869162092, modifiers -> 22.452583497199612, modifiers -> 8.376874930372196),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 33.2972979367031, modifiers -> 19.458803276441085, modifiers -> 20.39847707221032),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 33.2972979367031, modifiers -> 19.458803276441085, modifiers -> 20.39847707221032),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  0.5F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 5.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> -1.5000000000000004, modifiers -> -3.0, modifiers -> -8.499999999999998),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> -1.5000000000000004, modifiers -> -3.0, modifiers -> -8.499999999999998),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -25.068263631440843, modifiers -> -17.166604717109077, modifiers -> -8.959018576745638),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> -24.01000952841143, modifiers -> -5.787379755580115, modifiers -> -14.247752696766856),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> -24.01000952841143, modifiers -> -5.787379755580115, modifiers -> -14.247752696766856),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -3.4999999999999996, modifiers -> -9.45),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -3.4999999999999996, modifiers -> -9.45),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
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
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 12.260000000000002, modifiers -> 1.45, modifiers -> 3.54),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 64.77783256493127, modifiers -> -1.7507660442259294, modifiers -> -3.243611515352277),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 64.77783256493127, modifiers -> -1.7507660442259294, modifiers -> -3.243611515352277),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  5.0F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .build();
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_WITHER_SLASH = AdvancedAnimationDefinition.Builder.withLength(3.5F)
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
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> 50.90607798117024, modifiers -> 66.54408317155955, modifiers -> 41.703705648701686),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 50.90607798117024, modifiers -> 66.54408317155955, modifiers -> 41.703705648701686),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 31.00698463012546, modifiers -> -31.760611784628466, modifiers -> -15.30526710740132),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> 31.00698463012546, modifiers -> -31.760611784628466, modifiers -> -15.30526710740132),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> 28.987606196631774, modifiers -> 50.3933621712133, modifiers -> 18.858752727500303),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> 28.987606196631774, modifiers -> 50.3933621712133, modifiers -> 18.858752727500303),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 25.458319830160907, modifiers -> -45.98363154759532, modifiers -> -12.980406324703509),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0F,
                  new AdvancedAnimationInstance(modifiers -> 25.458319830160907, modifiers -> -45.98363154759532, modifiers -> -12.980406324703509),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.1666667F,
                  new AdvancedAnimationInstance(modifiers -> -13.382049255830918, modifiers -> 6.528728537876887, modifiers -> 1.1352265560970949),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> -13.382049255830918, modifiers -> 6.528728537876887, modifiers -> 1.1352265560970949),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 24.55886136245146, modifiers -> 4.468191216363976, modifiers -> 5.716426767541306),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 24.55886136245146, modifiers -> 4.468191216363976, modifiers -> 5.716426767541306),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.6666667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 0.0, modifiers -> 2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 0.0, modifiers -> 2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2083334F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.6666666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 0.0, modifiers -> 2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0F, new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> 0.0, modifiers -> 2.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.1666667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 1.0, modifiers -> 2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 1.0, modifiers -> 2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  0.33333334F,
                  new AdvancedAnimationInstance(modifiers -> 7.608966773304456, modifiers -> 12.891972926344296, modifiers -> -3.8755810106381254),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.625F,
                  new AdvancedAnimationInstance(modifiers -> 7.608966773304456, modifiers -> 12.891972926344296, modifiers -> -3.8755810106381254),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 9.73705344798238, modifiers -> -2.7227407990492605, modifiers -> -3.3705602659976286),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2083334F,
                  new AdvancedAnimationInstance(modifiers -> 9.73705344798238, modifiers -> -2.7227407990492605, modifiers -> -3.3705602659976286),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.3333334F,
                  new AdvancedAnimationInstance(modifiers -> 6.786694458980346, modifiers -> 19.97741002796136, modifiers -> -2.1589590699253858),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.6666666F,
                  new AdvancedAnimationInstance(modifiers -> 6.786694458980346, modifiers -> 19.97741002796136, modifiers -> -2.1589590699253858),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.7916666F,
                  new AdvancedAnimationInstance(modifiers -> 9.48061927420573, modifiers -> 11.436551971926455, modifiers -> -0.6280899181019959),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0416667F,
                  new AdvancedAnimationInstance(modifiers -> 9.48061927420573, modifiers -> 11.436551971926455, modifiers -> -0.6280899181019959),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.2083333F,
                  new AdvancedAnimationInstance(modifiers -> 3.503892993307673, modifiers -> 3.506438336005303, modifiers -> -6.925926514376861),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4583333F,
                  new AdvancedAnimationInstance(modifiers -> 3.503892993307673, modifiers -> 3.506438336005303, modifiers -> -6.925926514376861),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 16.01992900195148, modifiers -> -2.235591013243484, modifiers -> -5.753398296177256),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0416667F,
                  new AdvancedAnimationInstance(modifiers -> 16.01992900195148, modifiers -> -2.235591013243484, modifiers -> -5.753398296177256),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> 6.761514824064307, modifiers -> 10.474174376960491, modifiers -> -3.2857771429571585),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.6666667F,
                  new AdvancedAnimationInstance(modifiers -> 6.761514824064307, modifiers -> 10.474174376960491, modifiers -> -3.2857771429571585),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.8333333F,
                  new AdvancedAnimationInstance(modifiers -> 12.2135463613273, modifiers -> -17.96597448990373, modifiers -> 1.3417904898315829),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> 12.2135463613273, modifiers -> -17.96597448990373, modifiers -> 1.3417904898315829),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.375F,
                  new AdvancedAnimationInstance(modifiers -> 3.8450993901320913, modifiers -> 17.059884563496198, modifiers -> 5.934814739674312),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.7083334F,
                  new AdvancedAnimationInstance(modifiers -> 3.8450993901320913, modifiers -> 17.059884563496198, modifiers -> 5.934814739674312),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.8333334F,
                  new AdvancedAnimationInstance(modifiers -> 8.166468200638155, modifiers -> -20.29062089010349, modifiers -> 13.65739904310789),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0833333F,
                  new AdvancedAnimationInstance(modifiers -> 8.166468200638155, modifiers -> -20.29062089010349, modifiers -> 13.65739904310789),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.25F,
                  new AdvancedAnimationInstance(modifiers -> 7.644932521031533, modifiers -> -12.030054390585029, modifiers -> 18.78516451538084),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5F,
                  new AdvancedAnimationInstance(modifiers -> 7.644932521031533, modifiers -> -12.030054390585029, modifiers -> 18.78516451538084),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.625F,
                  new AdvancedAnimationInstance(modifiers -> 8.635006402021045, modifiers -> 2.0599519025636077, modifiers -> 14.068276235346694),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0833333F,
                  new AdvancedAnimationInstance(modifiers -> 8.635006402021045, modifiers -> 2.0599519025636077, modifiers -> 14.068276235346694),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  3.5F,
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  3.5F,
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  3.5F,
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 32.5, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  3.5F,
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  new AdvancedAnimationInstance(modifiers -> 25.212149774534318, modifiers -> 5.470858513453805, modifiers -> -5.702974992434939),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7083333F,
                  new AdvancedAnimationInstance(modifiers -> 25.212149774534318, modifiers -> 5.470858513453805, modifiers -> -5.702974992434939),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.875F,
                  new AdvancedAnimationInstance(modifiers -> 18.337116947278847, modifiers -> -1.1923335890971432, modifiers -> 13.801208838697931),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> 18.337116947278847, modifiers -> -1.1923335890971432, modifiers -> 13.801208838697931),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.4166666F,
                  new AdvancedAnimationInstance(modifiers -> 20.568897477066493, modifiers -> 8.909018286104018, modifiers -> 6.482145187698606),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 20.568897477066493, modifiers -> 8.909018286104018, modifiers -> 6.482145187698606),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.875F,
                  new AdvancedAnimationInstance(modifiers -> 18.6875824407109, modifiers -> -9.370992944184309, modifiers -> 18.727111955614237),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.125F,
                  new AdvancedAnimationInstance(modifiers -> 18.6875824407109, modifiers -> -9.370992944184309, modifiers -> 18.727111955614237),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.2916667F,
                  new AdvancedAnimationInstance(modifiers -> 19.56198492341824, modifiers -> -7.835397917309038, modifiers -> -13.75707547650076),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 19.56198492341824, modifiers -> -7.835397917309038, modifiers -> -13.75707547650076),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.6666667F,
                  new AdvancedAnimationInstance(modifiers -> 18.733209690418335, modifiers -> -18.112890211872546, modifiers -> -4.726902979804509),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.125F,
                  new AdvancedAnimationInstance(modifiers -> 18.733209690418335, modifiers -> -18.112890211872546, modifiers -> -4.726902979804509),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> -29.688798449712067, modifiers -> 12.341668141799346, modifiers -> -13.282701978932437),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -94.31638715037971, modifiers -> -11.06169396498695, modifiers -> 41.73167297392758),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> -94.31638715037971, modifiers -> -11.06169396498695, modifiers -> 41.73167297392758),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> -28.890116114098348, modifiers -> 40.091028853023346, modifiers -> 1.0740515762290102),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5833334F,
                  new AdvancedAnimationInstance(modifiers -> -23.206327977492876, modifiers -> 18.9982039246959, modifiers -> 5.6250841318482685),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -18.047887665827695, modifiers -> 3.4785685364715384, modifiers -> 17.48944697083629),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.1666667F,
                  new AdvancedAnimationInstance(modifiers -> -133.92976808215053, modifiers -> 25.96915356607837, modifiers -> -5.394351490566823),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> -133.92976808215053, modifiers -> 25.96915356607837, modifiers -> -5.394351490566823),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5416667F,
                  new AdvancedAnimationInstance(modifiers -> -11.831662855674608, modifiers -> 31.751813222375166, modifiers -> -6.994774679439143),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.25F,
                  new AdvancedAnimationInstance(modifiers -> -11.831662855674608, modifiers -> 31.751813222375166, modifiers -> -6.994774679439143),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> -76.21255416408576, modifiers -> 26.37325856202733, modifiers -> -34.11153775527464),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> -76.21255416408576, modifiers -> 26.37325856202733, modifiers -> -34.11153775527464),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -18.245577280718265, modifiers -> -19.383926803874147, modifiers -> -4.354960178999114),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> -18.245577280718265, modifiers -> -19.383926803874147, modifiers -> -4.354960178999114),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> -109.79779961471903, modifiers -> 0.3016142732696778, modifiers -> -41.179221198053),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> -109.79779961471903, modifiers -> 0.3016142732696778, modifiers -> -41.179221198053),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -161.04503495361703, modifiers -> -53.968029232341415, modifiers -> -6.84888828161732),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0F,
                  new AdvancedAnimationInstance(modifiers -> -161.04503495361703, modifiers -> -53.968029232341415, modifiers -> -6.84888828161732),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.1666667F,
                  new AdvancedAnimationInstance(modifiers -> -159.06718121786844, modifiers -> -34.97253161733761, modifiers -> -1.689415518910664),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> -159.06718121786844, modifiers -> -34.97253161733761, modifiers -> -1.689415518910664),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 6.9387203400610815, modifiers -> -22.532768735613445, modifiers -> -11.900911486718542),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.25F,
                  new AdvancedAnimationInstance(modifiers -> 6.9387203400610815, modifiers -> -22.532768735613445, modifiers -> -11.900911486718542),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  3.5F,
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  3.5F,
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
                  0.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 50.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  3.5F,
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
               ),
               new AdvancedKeyframe(
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> -52.80744422749753, modifiers -> -40.737326198115056, modifiers -> 44.625418837218206),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> -52.80744422749753, modifiers -> -40.737326198115056, modifiers -> 44.625418837218206),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -46.32794337263803, modifiers -> 40.991262485175994, modifiers -> -19.162420967191068),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> -46.32794337263803, modifiers -> 40.991262485175994, modifiers -> -19.162420967191068),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> -24.296868474145775, modifiers -> -21.732532500268462, modifiers -> 8.012108010397114),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> -24.296868474145775, modifiers -> -21.732532500268462, modifiers -> 8.012108010397114),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -24.4993184535852, modifiers -> 7.04679099791667, modifiers -> -15.588929529806501),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0F,
                  new AdvancedAnimationInstance(modifiers -> -28.936328154243764, modifiers -> 31.723470142273182, modifiers -> -28.598373905758216),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.375F,
                  new AdvancedAnimationInstance(modifiers -> -44.89077845200745, modifiers -> 3.5332871946307023, modifiers -> 3.54002475735615),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5F,
                  new AdvancedAnimationInstance(modifiers -> -24.6401, modifiers -> -6.633789277667802, modifiers -> -2.4405),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  2.375F,
                  new AdvancedAnimationInstance(modifiers -> -30.04, modifiers -> 5.21, modifiers -> 5.35),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5F,
                  new AdvancedAnimationInstance(modifiers -> -62.800497921465684, modifiers -> 13.25660940059057, modifiers -> 5.719628064980133),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  2.375F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 1.0, modifiers -> -3.0),
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
                  AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  2.375F,
                  new AdvancedAnimationInstance(modifiers -> 1.84, modifiers -> -0.77, modifiers -> -8.35),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5F,
                  new AdvancedAnimationInstance(
                     modifiers -> 51.84 + Math.cos(modifiers.get("anim_time") * 3000.0F - 50.0F) * 2.5, modifiers -> -0.77, modifiers -> -8.35
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  new AdvancedAnimationInstance(modifiers -> -10.0775, modifiers -> 8.6887, modifiers -> 36.124817767709374),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> -10.08, modifiers -> 8.69, modifiers -> 36.12),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -105.30909391417896, modifiers -> 38.83146826086153, modifiers -> 90.75038273880739),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> -105.30909391417896, modifiers -> 38.83146826086153, modifiers -> 90.75038273880739),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2083334F,
                  new AdvancedAnimationInstance(modifiers -> -68.42376327293094, modifiers -> 57.2785550024356, modifiers -> 91.6448783050718),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> -1.798259338401408, modifiers -> 44.02025352011793, modifiers -> 72.85714528140252),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5833334F,
                  new AdvancedAnimationInstance(modifiers -> -13.860632264585291, modifiers -> 25.014280293813844, modifiers -> 20.647389918331882),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -7.157114324340114, modifiers -> 20.403004819730143, modifiers -> 57.57150739081581),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.1666667F,
                  new AdvancedAnimationInstance(modifiers -> -110.93365332633675, modifiers -> 31.009881917821076, modifiers -> 54.91838574729036),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> -110.93365332633675, modifiers -> 31.009881917821076, modifiers -> 54.91838574729036),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 30.286300660925292, modifiers -> -10.45542461436995, modifiers -> 43.42938508599175),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.25F,
                  new AdvancedAnimationInstance(modifiers -> 30.286300660925292, modifiers -> -10.45542461436995, modifiers -> 43.42938508599175),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> -48.43, modifiers -> 19.06, modifiers -> -20.21),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -85.23032188363732, modifiers -> 1.501793342711153, modifiers -> -17.43745071540934),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> -85.23032188363732, modifiers -> 1.501793342711153, modifiers -> -17.43745071540934),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2083334F,
                  new AdvancedAnimationInstance(modifiers -> -7.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5833334F,
                  new AdvancedAnimationInstance(modifiers -> -27.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0833333F,
                  new AdvancedAnimationInstance(modifiers -> -27.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.3333333F,
                  new AdvancedAnimationInstance(modifiers -> -87.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.875F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  1.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.LINEAR
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 45.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5833334F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.3333333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> 50.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.875F,
                  new AdvancedAnimationInstance(modifiers -> 50.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.25F,
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -25.3084, modifiers -> -24.1499, modifiers -> -29.14689223552932),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> -117.35595582090997, modifiers -> -34.33376953323013, modifiers -> -82.96694082642435),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> -117.35595582090997, modifiers -> -34.33376953323013, modifiers -> -82.96694082642435),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.6666667F,
                  new AdvancedAnimationInstance(modifiers -> -72.48923092092667, modifiers -> -67.60004256405907, modifiers -> -64.53541723621218),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -1.023593984206272, modifiers -> -31.11908211958196, modifiers -> -62.483298255493736),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> -25.360482674286704, modifiers -> -18.69553352557534, modifiers -> -8.52179767647656),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> -91.27122585478992, modifiers -> -37.85330320987225, modifiers -> -119.18997539404742),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> -91.27122585478992, modifiers -> -37.85330320987225, modifiers -> -119.18997539404742),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.6666666F,
                  new AdvancedAnimationInstance(modifiers -> -72.93696583125946, modifiers -> -54.69984745102377, modifiers -> -77.73266057354796),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 46.91596958697228, modifiers -> -37.62899843199151, modifiers -> -55.33486759294321),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0F,
                  new AdvancedAnimationInstance(modifiers -> 46.91596958697228, modifiers -> -37.62899843199151, modifiers -> -55.33486759294321),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.1666667F,
                  new AdvancedAnimationInstance(modifiers -> -138.10056063614502, modifiers -> -38.48797994640465, modifiers -> -46.7586344504838),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> -138.10056063614502, modifiers -> -38.48797994640465, modifiers -> -46.7586344504838),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 20.810249783806114, modifiers -> 5.774893379430139, modifiers -> -43.45388850665489),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.25F,
                  new AdvancedAnimationInstance(modifiers -> 20.810249783806114, modifiers -> 5.774893379430139, modifiers -> -43.45388850665489),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
               ),
               new AdvancedKeyframe(
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> -77.78730374693987, modifiers -> -2.6850668883971593, modifiers -> 12.212696253060585),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> -77.78730374693987, modifiers -> -2.6850668883971593, modifiers -> 12.212696253060585),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -10.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> -22.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5833334F,
                  new AdvancedAnimationInstance(modifiers -> -64.74234410515237, modifiers -> -11.253100523759258, modifiers -> 22.470963016173755),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.6666666F,
                  new AdvancedAnimationInstance(modifiers -> -17.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0F,
                  new AdvancedAnimationInstance(modifiers -> -17.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.3333333F,
                  new AdvancedAnimationInstance(modifiers -> -70.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.875F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.6666667F,
                  new AdvancedAnimationInstance(modifiers -> 45.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.5833334F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.6666666F,
                  new AdvancedAnimationInstance(modifiers -> 45.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0833333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.3333333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> 50.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.875F,
                  new AdvancedAnimationInstance(modifiers -> 50.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.25F,
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 22.5, modifiers -> 10.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> -1.828201212517797, modifiers -> 22.485543442422113, modifiers -> 7.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> -1.828201212517797, modifiers -> 22.485543442422113, modifiers -> 7.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.6666667F,
                  new AdvancedAnimationInstance(modifiers -> 16.984480110662115, modifiers -> 21.33854153907645, modifiers -> 14.919355443838903),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 13.337501256737795, modifiers -> 21.022406989691117, modifiers -> 16.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> 13.337501256737795, modifiers -> 21.022406989691117, modifiers -> 16.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2083334F,
                  new AdvancedAnimationInstance(modifiers -> 16.984480110662115, modifiers -> 21.33854153907645, modifiers -> 14.919355443838903),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> -1.828201212517797, modifiers -> 22.485543442422113, modifiers -> 7.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> -1.828201212517797, modifiers -> 22.485543442422113, modifiers -> 7.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.6666666F,
                  new AdvancedAnimationInstance(modifiers -> 16.984480110662115, modifiers -> 21.33854153907645, modifiers -> 14.919355443838903),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 13.337501256737795, modifiers -> 21.022406989691117, modifiers -> 16.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0F,
                  new AdvancedAnimationInstance(modifiers -> 13.337501256737795, modifiers -> 21.022406989691117, modifiers -> 16.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.1666667F,
                  new AdvancedAnimationInstance(modifiers -> 6.817410761509217, modifiers -> 21.80500332505733, modifiers -> 11.327183691170886),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> 6.817410761509217, modifiers -> 21.80500332505733, modifiers -> 11.327183691170886),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 14.75704146126218, modifiers -> 21.24329728495546, modifiers -> 13.83490428050116),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 14.75704146126218, modifiers -> 21.24329728495546, modifiers -> 13.83490428050116),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 6.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 6.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.6666667F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -1.0, modifiers -> -2.05),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -0.5, modifiers -> -0.48),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -1.08),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2083334F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -1.0, modifiers -> -2.05),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 6.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 6.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.6666666F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -1.0, modifiers -> -2.05),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -1.08),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> -1.08),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.1666667F,
                  new AdvancedAnimationInstance(modifiers -> -1.0700000000000003, modifiers -> 0.0, modifiers -> 2.2199999999999998),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> -1.0700000000000003, modifiers -> 0.0, modifiers -> 2.2199999999999998),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5416667F,
                  new AdvancedAnimationInstance(modifiers -> -2.06, modifiers -> -1.08, modifiers -> -2.72),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> -2.06, modifiers -> -1.08, modifiers -> -2.72),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> -25.121221039782924, modifiers -> -20.27318085830235, modifiers -> -14.989968559251356),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> -25.121221039782924, modifiers -> -20.27318085830235, modifiers -> -14.989968559251356),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.6666667F,
                  new AdvancedAnimationInstance(modifiers -> -28.678402978513677, modifiers -> -6.001716768014138, modifiers -> -14.059329443005408),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -19.45717425705285, modifiers -> -4.097307790242667, modifiers -> -5.139782803488506),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> -19.45717425705285, modifiers -> -4.097307790242667, modifiers -> -5.139782803488506),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2083334F,
                  new AdvancedAnimationInstance(modifiers -> -28.678402978513677, modifiers -> -6.001716768014138, modifiers -> -14.059329443005408),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> -25.121221039782924, modifiers -> -20.27318085830235, modifiers -> -14.989968559251356),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> -25.121221039782924, modifiers -> -20.27318085830235, modifiers -> -14.989968559251356),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.6666666F,
                  new AdvancedAnimationInstance(modifiers -> -28.678402978513677, modifiers -> -6.001716768014138, modifiers -> -14.059329443005408),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> -19.45717425705285, modifiers -> -4.097307790242667, modifiers -> -5.139782803488506),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0F,
                  new AdvancedAnimationInstance(modifiers -> -19.45717425705285, modifiers -> -4.097307790242667, modifiers -> -5.139782803488506),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.1666667F,
                  new AdvancedAnimationInstance(modifiers -> -25.372270490612483, modifiers -> -5.874180508239861, modifiers -> -7.366788580072134),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> -25.372270490612483, modifiers -> -5.874180508239861, modifiers -> -7.366788580072134),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5416667F,
                  new AdvancedAnimationInstance(modifiers -> -32.833658901883425, modifiers -> -7.887654278631362, modifiers -> -9.282304019045878),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> -32.833658901883425, modifiers -> -7.887654278631362, modifiers -> -9.282304019045878),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  0.29166666F,
                  new AdvancedAnimationInstance(modifiers -> -2.0, modifiers -> -2.0, modifiers -> -1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> -2.0, modifiers -> -2.0, modifiers -> -1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.6666667F,
                  new AdvancedAnimationInstance(modifiers -> 0.030000000000000027, modifiers -> -2.0, modifiers -> -2.98),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 3.06, modifiers -> -1.0, modifiers -> 3.04),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> 3.06, modifiers -> -1.0, modifiers -> 3.04),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2083334F,
                  new AdvancedAnimationInstance(modifiers -> 0.030000000000000027, modifiers -> -2.0, modifiers -> -2.98),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> -2.0, modifiers -> -2.0, modifiers -> -1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> -2.0, modifiers -> -2.0, modifiers -> -1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.6666666F,
                  new AdvancedAnimationInstance(modifiers -> 0.030000000000000027, modifiers -> -2.0, modifiers -> -2.98),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 3.06, modifiers -> -1.0, modifiers -> 3.04),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0F,
                  new AdvancedAnimationInstance(modifiers -> 3.06, modifiers -> -1.0, modifiers -> 3.04),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.1666667F,
                  new AdvancedAnimationInstance(modifiers -> 1.91, modifiers -> -1.15, modifiers -> 0.6699999999999999),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> 1.91, modifiers -> -1.15, modifiers -> 0.6699999999999999),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 1.76, modifiers -> -2.29, modifiers -> -3.46),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 1.76, modifiers -> -2.29, modifiers -> -3.46),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
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
                  0.5833333F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.6666667F,
                  new AdvancedAnimationInstance(modifiers -> 42.260000000000005, modifiers -> 1.45, modifiers -> 3.54),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.1666666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2083334F,
                  new AdvancedAnimationInstance(modifiers -> 42.260000000000005, modifiers -> 1.45, modifiers -> 3.54),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.6666666F,
                  new AdvancedAnimationInstance(modifiers -> 42.260000000000005, modifiers -> 1.45, modifiers -> 3.54),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.75F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.0F, new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0), AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.1666667F,
                  new AdvancedAnimationInstance(modifiers -> 20.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.4166667F,
                  new AdvancedAnimationInstance(modifiers -> 20.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  2.5416667F,
                  new AdvancedAnimationInstance(modifiers -> 50.55, modifiers -> 0.11, modifiers -> 0.27),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.0F,
                  new AdvancedAnimationInstance(modifiers -> 50.55, modifiers -> 0.11, modifiers -> 0.27),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  3.5F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .build();
   public static final AdvancedAnimationDefinition MUTANT_WITHER_SKELETON_BLOCK = AdvancedAnimationDefinition.Builder.withLength(1.625F)
      .addAnimation(
         "pelvis1",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 7.4833, modifiers -> 6.4605 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25, modifiers -> 8.4107
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(
                     modifiers -> 27.72560109146387,
                     modifiers -> -0.1735 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25,
                     modifiers -> 4.934066027372555
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(
                     modifiers -> 27.72560109146387,
                     modifiers -> -0.1735 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25,
                     modifiers -> 4.934066027372555
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.9583333F,
                  new AdvancedAnimationInstance(
                     modifiers -> 27.72560109146387,
                     modifiers -> -0.1735 + Math.cos(modifiers.get("anim_time") * 6000.0F) * 1.0,
                     modifiers -> 4.934066027372555
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0416666F,
                  new AdvancedAnimationInstance(modifiers -> 50.230000000000004, modifiers -> -0.1735, modifiers -> 4.93),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 22.729999999999997, modifiers -> -0.17, modifiers -> 4.93),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.375F,
                  new AdvancedAnimationInstance(
                     modifiers -> 7.4833, modifiers -> 6.4605 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25, modifiers -> 8.4107
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(
                     modifiers -> 7.4833, modifiers -> 6.4605 + Math.cos(modifiers.get("anim_time") * 2000.0F) * 0.25, modifiers -> 8.4107
                  ),
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
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -5.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -5.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.9583333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -5.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0416666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -8.0, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -1.0, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  new AdvancedAnimationInstance(modifiers -> 2.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7083333F,
                  new AdvancedAnimationInstance(modifiers -> 2.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 2.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  new AdvancedAnimationInstance(modifiers -> 7.433400000000056, modifiers -> -0.8833787120000852, modifiers -> -5.5187000000000985),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7083333F,
                  new AdvancedAnimationInstance(modifiers -> 7.433400000000056, modifiers -> -0.8833787120000852, modifiers -> -5.5187000000000985),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 7.433400000000056, modifiers -> -0.8833787120000852, modifiers -> -5.5187000000000985),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 17.044699999999956, modifiers -> -6.472949974376861, modifiers -> 8.038099999999794),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7083333F,
                  new AdvancedAnimationInstance(modifiers -> 17.044699999999956, modifiers -> -6.472949974376861, modifiers -> 8.038099999999794),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 17.04, modifiers -> -6.47, modifiers -> 8.04),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0416666F,
                  new AdvancedAnimationInstance(modifiers -> -6.002578187252276, modifiers -> -5.970364786092632, modifiers -> 13.044470763153676),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 17.04, modifiers -> -6.47, modifiers -> 8.04),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 47.86, modifiers -> -6.63, modifiers -> -2.44),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 47.86, modifiers -> -6.63, modifiers -> -2.44),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> 47.86, modifiers -> -6.63, modifiers -> -2.44),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> 47.86, modifiers -> -6.63, modifiers -> -2.44),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0833334F,
                  new AdvancedAnimationInstance(modifiers -> -24.6401, modifiers -> -6.633789277667802, modifiers -> -2.4405),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  0.16666667F,
                  new AdvancedAnimationInstance(modifiers -> -99.05837970379801, modifiers -> 8.588666569005419, modifiers -> -6.673062750178724),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> -99.05837970379801, modifiers -> 8.588666569005419, modifiers -> -6.673062750178724),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -99.05837970379801, modifiers -> 8.588666569005419, modifiers -> -6.673062750178724),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -99.45207103023589, modifiers -> -18.56682002540223, modifiers -> -2.274758815094083),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0833334F,
                  new AdvancedAnimationInstance(modifiers -> -15.881702524086933, modifiers -> 5.742823143229963, modifiers -> 1.3416689831752588),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> -30.04154900070398, modifiers -> 5.212, modifiers -> 5.3547),
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
                  new AdvancedAnimationInstance(modifiers -> 20.54, modifiers -> -0.72, modifiers -> -4.6),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.25F,
                  new AdvancedAnimationInstance(modifiers -> -3.254856762913878, modifiers -> -0.6772677330150327, modifiers -> -0.8499734691805312),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.375F,
                  new AdvancedAnimationInstance(modifiers -> -3.254856762913878, modifiers -> -0.6772677330150327, modifiers -> -0.8499734691805312),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -1.051327238265003, modifiers -> 2.84658323006699, modifiers -> 12.131868072783982),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 34.312976125424484, modifiers -> 2.582906491839658, modifiers -> 2.9396288054944306),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> 34.312976125424484, modifiers -> 2.582906491839658, modifiers -> 2.9396288054944306),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  new AdvancedAnimationInstance(modifiers -> -10.0775, modifiers -> 8.6887, modifiers -> 36.124817767709374),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -71.0249192650349, modifiers -> 20.75353823778005, modifiers -> 26.11009637237521),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.16666667F,
                  new AdvancedAnimationInstance(modifiers -> -71.0249192650349, modifiers -> 20.75353823778005, modifiers -> 26.11009637237521),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -71.0249192650349, modifiers -> 20.75353823778005, modifiers -> 26.11009637237521),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -71.02, modifiers -> 20.75, modifiers -> 26.11),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 22.32760214877679, modifiers -> 39.03806998111577, modifiers -> 66.61420436759168),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.375F,
                  new AdvancedAnimationInstance(modifiers -> 22.32760214877679, modifiers -> 39.03806998111577, modifiers -> 66.61420436759168),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  0.041666668F,
                  new AdvancedAnimationInstance(modifiers -> -48.4266, modifiers -> 19.0568, modifiers -> -20.208484171647342),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -47.246824358056074, modifiers -> -17.046787207330453, modifiers -> 14.909198567680505),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -47.246824358056074, modifiers -> -17.046787207330453, modifiers -> 14.909198567680505),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> -47.246824358056074, modifiers -> -17.046787207330453, modifiers -> 14.909198567680505),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -47.25, modifiers -> -17.05, modifiers -> 14.91),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -18.843590180490537, modifiers -> -21.40583962068058, modifiers -> -75.40000924885135),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.16666667F,
                  new AdvancedAnimationInstance(modifiers -> -18.843590180490537, modifiers -> -21.40583962068058, modifiers -> -75.40000924885135),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -18.843590180490537, modifiers -> -21.40583962068058, modifiers -> -75.40000924885135),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -18.84, modifiers -> -21.41, modifiers -> -75.4),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> -40.0, modifiers -> 82.5, modifiers -> -82.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> -40.0, modifiers -> 82.5, modifiers -> -82.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> -25.3084, modifiers -> -24.1499, modifiers -> -29.14689223552932),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.083333336F,
                  new AdvancedAnimationInstance(modifiers -> -76.84646824624633, modifiers -> -23.626140004830177, modifiers -> -25.16120439865972),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.16666667F,
                  new AdvancedAnimationInstance(modifiers -> -76.84646824624633, modifiers -> -23.626140004830177, modifiers -> -25.16120439865972),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -76.84646824624633, modifiers -> -23.626140004830177, modifiers -> -25.16120439865972),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -76.85, modifiers -> -23.63, modifiers -> -25.16),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 11.239658499320655, modifiers -> -51.560838098592626, modifiers -> -75.74459087525352),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.375F,
                  new AdvancedAnimationInstance(modifiers -> 11.239658499320655, modifiers -> -51.560838098592626, modifiers -> -75.74459087525352),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  0.041666668F,
                  new AdvancedAnimationInstance(modifiers -> -33.0061, modifiers -> -10.5249, modifiers -> 6.7719950935656925),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -37.150978682661844, modifiers -> 31.321304379598587, modifiers -> -16.484565156052668),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -37.150978682661844, modifiers -> 31.321304379598587, modifiers -> -16.484565156052668),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.7916667F,
                  new AdvancedAnimationInstance(modifiers -> -37.150978682661844, modifiers -> 31.321304379598587, modifiers -> -16.484565156052668),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -37.15, modifiers -> 31.32, modifiers -> -16.48),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.2916666F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  new AdvancedAnimationInstance(modifiers -> -22.5, modifiers -> 10.0, modifiers -> 60.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.16666667F,
                  new AdvancedAnimationInstance(modifiers -> -22.5, modifiers -> 10.0, modifiers -> 60.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.75F,
                  new AdvancedAnimationInstance(modifiers -> -22.5, modifiers -> 10.0, modifiers -> 60.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0F,
                  new AdvancedAnimationInstance(modifiers -> -22.5, modifiers -> 10.0, modifiers -> 60.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> -40.0, modifiers -> -82.5, modifiers -> 82.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.25F,
                  new AdvancedAnimationInstance(modifiers -> -40.0, modifiers -> -82.5, modifiers -> 82.5),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 22.5, modifiers -> 10.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -0.67085534190619, modifiers -> 22.537891144977493, modifiers -> 12.164711409885967),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.9583333F,
                  new AdvancedAnimationInstance(modifiers -> -0.67085534190619, modifiers -> 22.537891144977493, modifiers -> 12.164711409885967),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0416666F,
                  new AdvancedAnimationInstance(modifiers -> -6.009308144030383, modifiers -> 3.428664193947988, modifiers -> 11.792398753835332),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> 22.5, modifiers -> 10.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -0.5, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -0.5, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.9583333F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -0.5, modifiers -> 1.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0416666F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> -2.5, modifiers -> -3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> -1.0, modifiers -> 0.0, modifiers -> 3.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 22.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.9583333F,
                  new AdvancedAnimationInstance(modifiers -> 22.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0416666F,
                  new AdvancedAnimationInstance(modifiers -> 52.5, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 10.0, modifiers -> 0.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> -48.67, modifiers -> -18.01, modifiers -> -10.27),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.9583333F,
                  new AdvancedAnimationInstance(modifiers -> -48.67, modifiers -> -18.01, modifiers -> -10.27),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0416666F,
                  new AdvancedAnimationInstance(modifiers -> -56.11725604631185, modifiers -> -11.354369802821349, modifiers -> -11.251992110665032),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> -27.67468502347856, modifiers -> -18.01339295914977, modifiers -> -10.2699),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -5.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.20833333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -5.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.9583333F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -5.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0416666F,
                  new AdvancedAnimationInstance(modifiers -> 1.0, modifiers -> -7.0, modifiers -> -2.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> -2.0, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
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
                  0.125F,
                  new AdvancedAnimationInstance(modifiers -> 62.26334858148563, modifiers -> 1.4519496110166983, modifiers -> 3.5436258765458115),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  0.9583333F,
                  new AdvancedAnimationInstance(modifiers -> 62.26334858148563, modifiers -> 1.4519496110166983, modifiers -> 3.5436258765458115),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.0416666F,
                  new AdvancedAnimationInstance(modifiers -> 82.26000000000045, modifiers -> 1.45, modifiers -> 3.54),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.125F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               ),
               new AdvancedKeyframe(
                  1.625F,
                  new AdvancedAnimationInstance(modifiers -> 27.263348581486298, modifiers -> 1.4519496110165164, modifiers -> 3.543625876545775),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .build();
}
