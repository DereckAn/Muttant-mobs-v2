package com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers;

import java.util.LinkedHashMap;
import java.util.Map;

/** Named server-driven animations of one entity; each start/stop is synced to clients, which tick them locally in between. */
public class AdvancedAnimationTracker {
   public final Map<String, AdvancedAnimation> animations = new LinkedHashMap<>();

   public AdvancedAnimation getAnimation(String name) {
      return this.animations.get(name);
   }

   public void tick() {
      this.animations.forEach((name, animation) -> animation.tick());
   }

   public void addAnimation(String name, AdvancedAnimation newAnimation) {
      newAnimation.setName(name);
      newAnimation.setTracker(this);
      this.animations.put(name, newAnimation);
   }

   public void addModifierToAllAnimations(String name, float modifier) {
      this.animations.forEach((animationName, animation) -> animation.getModifiers().put(name, modifier));
   }
}
