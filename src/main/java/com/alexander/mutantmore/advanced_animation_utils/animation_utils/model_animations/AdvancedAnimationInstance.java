package com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations;

import java.util.Map;

public record AdvancedAnimationInstance(
   AdvancedAnimationInstance.AnimationValueConsumer x, AdvancedAnimationInstance.AnimationValueConsumer y, AdvancedAnimationInstance.AnimationValueConsumer z
) {
   @FunctionalInterface
   public interface AnimationValueConsumer {
      double accept(Map<String, Float> var1);
   }
}
