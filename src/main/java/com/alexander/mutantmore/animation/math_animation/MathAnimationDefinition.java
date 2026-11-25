package com.alexander.mutantmore.animation.math_animation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import net.minecraft.client.animation.AnimationChannel;

public record MathAnimationDefinition(
   float lengthInSeconds,
   boolean looping,
   Map<String, BiConsumer<AnimationData, AnimationTransformation>> mathAnimations,
   Map<String, List<AnimationChannel>> keyframeAnimations,
   boolean dontApplyScaleToKeyframes
) {
   public static class Builder {
      private final Map<String, BiConsumer<AnimationData, AnimationTransformation>> mathAnimations = new HashMap<>();
      private final Map<String, List<AnimationChannel>> keyframeAnimations = new HashMap<>();
      private final float lengthInSeconds;
      private boolean looping;
      private boolean dontApplyScaleToKeyframes;

      private Builder(float lengthInSeconds) {
         this.lengthInSeconds = lengthInSeconds;
      }

      public static MathAnimationDefinition.Builder withLength(float lengthInSeconds) {
         return new MathAnimationDefinition.Builder(lengthInSeconds);
      }

      public MathAnimationDefinition.Builder looping() {
         this.looping = true;
         return this;
      }

      public MathAnimationDefinition.Builder dontApplyScaleToKeyframes() {
         this.dontApplyScaleToKeyframes = true;
         return this;
      }

      public MathAnimationDefinition.Builder addAnimation(String name, BiConsumer<AnimationData, AnimationTransformation> transformsSupplier) {
         this.mathAnimations.put(name, transformsSupplier);
         return this;
      }

      public MathAnimationDefinition.Builder addAnimation(String name, AnimationChannel channel) {
         this.keyframeAnimations.computeIfAbsent(name, s -> new ArrayList<>()).add(channel);
         return this;
      }

      public MathAnimationDefinition build() {
         return new MathAnimationDefinition(this.lengthInSeconds, this.looping, this.mathAnimations, this.keyframeAnimations, this.dontApplyScaleToKeyframes);
      }
   }
}
