package com.alexander.mutantmore.animation.sine_wave_animations.definition;

import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveMotionTypes;
import com.alexander.mutantmore.models.items.LeafblowerModel;

public class LeafblowerSineWaveAnimations {
   private static float floatMax = Float.MAX_VALUE;

   public static void leafblowerSuckIdleAnimation(LeafblowerModel model, float tick, float speedMultiplier, float amountMultiplier) {
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.lever, 90.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petals, 8.0F, amountMultiplier, SineWaveMotionTypes.POSITION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal1, -65.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal2, -65.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal3, -65.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal4, -65.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
   }

   public static void leafblowerBlowIdleAnimation(LeafblowerModel model, float tick, float speedMultiplier, float amountMultiplier) {
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petals, 1.0F, amountMultiplier, SineWaveMotionTypes.POSITION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal1, 57.5F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal2, 67.5F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal3, 70.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal4, 67.5F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.flowerNozzle, -1.0F, amountMultiplier, SineWaveMotionTypes.SCALE_Z);
   }

   public static void leafblowerSuckAnimation(LeafblowerModel model, float tick, float speedMultiplier, float amountMultiplier) {
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.lever, 90.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.addConstantMotionToModelPart(model.petals, 500.0F, tick, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petals, 8.0F, amountMultiplier, SineWaveMotionTypes.POSITION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal1, -50.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal2, -50.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal3, -50.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal4, -50.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.everything, 0.1F, 5000.0F, tick, -floatMax, floatMax, 0.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.POSITION_X
      );
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.everything, 0.1F, 5000.0F, tick, -floatMax, floatMax, 100.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.POSITION_Y
      );
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.everything, 0.1F, 5000.0F, tick, -floatMax, floatMax, 50.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.POSITION_Z
      );
   }

   public static void leafblowerBlowAnimation(LeafblowerModel model, float tick, float speedMultiplier, float amountMultiplier) {
      SineWaveAnimationUtils.addConstantMotionToModelPart(model.petals, -500.0F, tick, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petals, 1.0F, amountMultiplier, SineWaveMotionTypes.POSITION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal1, 50.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal2, 50.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal3, 50.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.petal4, 50.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.flowerNozzle, -1.0F, amountMultiplier, SineWaveMotionTypes.SCALE_Z);
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.everything, 0.1F, 5000.0F, tick, -floatMax, floatMax, 0.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.POSITION_X
      );
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.everything, 0.1F, 5000.0F, tick, -floatMax, floatMax, 100.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.POSITION_Y
      );
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.everything, 0.1F, 5000.0F, tick, -floatMax, floatMax, 50.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.POSITION_Z
      );
   }
}
