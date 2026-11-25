package com.alexander.mutantmore.animation.sine_wave_animations.definition;

import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveMotionTypes;
import com.alexander.mutantmore.models.entities.SentryVineModel;

public class SentryVineSineWaveAnimations {
   private static float floatMax = Float.MAX_VALUE;

   public static void sentryVineIdleAnimation(SentryVineModel model, float tick, float speedMultiplier, float amountMultiplier) {
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.vine1, 0.5F, 100.0F, tick, -floatMax, floatMax, 0.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_X
      );
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.vine1, 2.5F, 25.0F, tick, -floatMax, floatMax, 0.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_Z
      );
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine1, 7.5F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.vine2, 1.0F, 100.0F, tick, -floatMax, floatMax, -50.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_X
      );
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.vine2, 2.5F, 25.0F, tick, -floatMax, floatMax, -50.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_Z
      );
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine2, 15.0773F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine2, 4.6185F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine2, 1.9176F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.vine3, 1.0F, 100.0F, tick, -floatMax, floatMax, -100.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_X
      );
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.vine3, 2.5F, 25.0F, tick, -floatMax, floatMax, -100.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_Z
      );
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine3, 27.5947F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine3, -4.3288F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine3, -2.5048F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.vine4, 1.5F, 100.0F, tick, -floatMax, floatMax, -150.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_X
      );
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.vine4, 2.5F, 25.0F, tick, -floatMax, floatMax, -150.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_Z
      );
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine4, 27.5947F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine4, 4.3288F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine4, 2.5048F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.vine5, 1.5F, 100.0F, tick, -floatMax, floatMax, -200.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_X
      );
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.vine5, 5.0F, 25.0F, tick, -floatMax, floatMax, -200.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_Z
      );
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine5, 37.398F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine5, -7.8522F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine5, -0.901F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.vine6, 2.0F, 100.0F, tick, -floatMax, floatMax, -250.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_X
      );
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.vine6, 10.0F, 25.0F, tick, -floatMax, floatMax, -250.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_Z
      );
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine6, 42.4055F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine6, 2.4976F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine6, -4.3329F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
   }
}
