package com.alexander.mutantmore.animation;

import java.util.Map;
import java.util.stream.Collectors;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.geom.ModelPart;

/** Bakes a keyframe animation, dropping tracks for parts the model doesn't have (1.20 ignored them; 26.x throws and breaks every renderer). */
public final class LenientBake {
   private LenientBake() {
   }

   public static KeyframeAnimation bake(AnimationDefinition definition, ModelPart root) {
      Map<String, ?> kept = definition.boneAnimations()
         .entrySet()
         .stream()
         .filter(entry -> root.getAllParts().stream().anyMatch(part -> part.hasChild(entry.getKey())))
         .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
      if (kept.size() == definition.boneAnimations().size()) {
         return definition.bake(root);
      }

      @SuppressWarnings("unchecked")
      var bones = (Map<String, java.util.List<net.minecraft.client.animation.AnimationChannel>>)kept;
      return new AnimationDefinition(definition.lengthInSeconds(), definition.looping(), bones).bake(root);
   }
}
