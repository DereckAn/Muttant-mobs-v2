package com.alexander.mutantmore.animation.definitions;

import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedAnimationChannel;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedAnimationDefinition;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedAnimationInstance;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedKeyframe;

public class HeatstormGeneratorAdvancedAnimations {
   public static final AdvancedAnimationDefinition HEATSTORM_GENERATOR_IDLE = AdvancedAnimationDefinition.Builder.withLength(0.0F)
      .addAnimation(
         "core",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> Math.cos(modifiers.get("life_time") * 250.0F - 50.0F) * -1.0,
                     modifiers -> Math.cos(modifiers.get("life_time") * 500.0F - 50.0F) * -1.0,
                     modifiers -> 0.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "core",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.POSITION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(modifiers -> 0.0, modifiers -> Math.cos(modifiers.get("life_time") * 250.0F) * 0.1, modifiers -> 0.0),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "coreExterior",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0,
                     modifiers -> Math.cos(modifiers.get("life_time") * 250.0F + 50.0F) * 5.0,
                     modifiers -> Math.cos(modifiers.get("life_time") * 250.0F - 50.0F) * -4.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .addAnimation(
         "coreRings",
         new AdvancedAnimationChannel(
            AdvancedAnimationChannel.Targets.ROTATION,
            new AdvancedKeyframe[]{
               new AdvancedKeyframe(
                  0.0F,
                  new AdvancedAnimationInstance(
                     modifiers -> 0.0,
                     modifiers -> modifiers.get("life_time") * -400.0F,
                     modifiers -> Math.cos(modifiers.get("life_time") * 250.0F - 50.0F) * -25.0
                  ),
                  AdvancedAnimationChannel.Interpolations.CATMULLROM
               )
            }
         )
      )
      .build();
}
