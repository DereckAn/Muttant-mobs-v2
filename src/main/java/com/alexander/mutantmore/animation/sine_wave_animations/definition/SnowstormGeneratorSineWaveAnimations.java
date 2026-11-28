package com.alexander.mutantmore.animation.sine_wave_animations.definition;

import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveMotionTypes;
import com.alexander.mutantmore.models.blockentities.SnowstormGeneratorModel;

public class SnowstormGeneratorSineWaveAnimations {
   private static float floatMax = Float.MAX_VALUE;

   public static void snowstormGeneratorIdleAnimation(SnowstormGeneratorModel model, float tick, float speedMultiplier, float amountMultiplier) {
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.core, -15.0F, 250.0F, tick, -floatMax, floatMax, -50.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_Z
      );
      SineWaveAnimationUtils.addConstantMotionToModelPart(model.core, -300.0F, tick, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_Y);
   }
}
