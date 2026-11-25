package com.alexander.mutantmore.animation.math_animation;

import org.jspecify.annotations.Nullable;
import net.minecraft.world.level.Level;

public record AnimationData(
   @Nullable Level level,
   int entityId,
   float elapsedSeconds,
   float animScale,
   float limbSwing,
   float limbSwingAmount,
   float entityAge,
   float netHeadYaw,
   float headPitch
) {
   public float ageInSeconds() {
      return this.entityAge / 20.0F;
   }
}
