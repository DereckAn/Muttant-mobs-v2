package com.alexander.mutantmore.animation.sine_wave_animations.definition;

import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveMotionTypes;
import com.alexander.mutantmore.models.items.MutantJungleZombieArmModel;

public class MutantJungleZombieArmSineWaveAnimations {
   private static float floatMax = Float.MAX_VALUE;

   public static void mutantJungleZombieArmIdleAnimation(MutantJungleZombieArmModel model, float tick, float speedMultiplier, float amountMultiplier) {
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine2, 47.5F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine3, 65.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine4, 45.0F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine5, 62.5F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
   }

   public static void mutantJungleZombieArmStandbyAnimation(MutantJungleZombieArmModel model, float tick, float speedMultiplier, float amountMultiplier) {
   }

   public static void mutantJungleZombieArmInventoryAnimation(MutantJungleZombieArmModel model, float tick, float speedMultiplier, float amountMultiplier) {
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine1, -50.3892F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine1, 60.6699F, amountMultiplier, SineWaveMotionTypes.ROTATION_Y);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine1, -3.9798F, amountMultiplier, SineWaveMotionTypes.ROTATION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine2, 30.7433F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine2, -10.7008F, amountMultiplier, SineWaveMotionTypes.ROTATION_Y);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine2, 11.6839F, amountMultiplier, SineWaveMotionTypes.ROTATION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine3, 67.8102F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine3, -14.9471F, amountMultiplier, SineWaveMotionTypes.ROTATION_Y);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine3, -5.0775F, amountMultiplier, SineWaveMotionTypes.ROTATION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine4, 65.1178F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine4, -0.4474F, amountMultiplier, SineWaveMotionTypes.ROTATION_Y);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine4, -3.4215F, amountMultiplier, SineWaveMotionTypes.ROTATION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine5, 45.4701F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine5, -12.3588F, amountMultiplier, SineWaveMotionTypes.ROTATION_Y);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine5, 1.7271F, amountMultiplier, SineWaveMotionTypes.ROTATION_Z);
   }

   public static void mutantJungleZombieArmGrabbingAnimation(MutantJungleZombieArmModel model, float tick, float speedMultiplier, float amountMultiplier) {
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine2, -27.9935F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine2, 10.9093F, amountMultiplier, SineWaveMotionTypes.ROTATION_Y);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine2, 14.422F, amountMultiplier, SineWaveMotionTypes.ROTATION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine3, -30.0863F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine3, -4.7663F, amountMultiplier, SineWaveMotionTypes.ROTATION_Y);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine3, -28.6026F, amountMultiplier, SineWaveMotionTypes.ROTATION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine4, 16.484F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine4, 9.6282F, amountMultiplier, SineWaveMotionTypes.ROTATION_Y);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine4, -25.8883F, amountMultiplier, SineWaveMotionTypes.ROTATION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine5, 64.2668F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine5, 11.0458F, amountMultiplier, SineWaveMotionTypes.ROTATION_Y);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine5, 72.8782F, amountMultiplier, SineWaveMotionTypes.ROTATION_Z);
   }

   public static void mutantJungleZombieArmStrangleAnimation(MutantJungleZombieArmModel model, float tick, float speedMultiplier, float amountMultiplier) {
      SineWaveAnimationUtils.addSineWaveMotionToModelPart(
         model.vine2, 2.0F, 5000.0F, tick, -floatMax, floatMax, 0.0F, speedMultiplier, amountMultiplier, SineWaveMotionTypes.ROTATION_Z
      );
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine2, -27.9935F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine2, 10.9093F, amountMultiplier, SineWaveMotionTypes.ROTATION_Y);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine2, 14.422F, amountMultiplier, SineWaveMotionTypes.ROTATION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine3, -30.0863F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine3, -4.7663F, amountMultiplier, SineWaveMotionTypes.ROTATION_Y);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine3, -28.6026F, amountMultiplier, SineWaveMotionTypes.ROTATION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine4, 16.484F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine4, 9.6282F, amountMultiplier, SineWaveMotionTypes.ROTATION_Y);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine4, -25.8883F, amountMultiplier, SineWaveMotionTypes.ROTATION_Z);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine5, 64.2668F, amountMultiplier, SineWaveMotionTypes.ROTATION_X);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine5, 11.0458F, amountMultiplier, SineWaveMotionTypes.ROTATION_Y);
      SineWaveAnimationUtils.adjustPositionOfModelPart(model.vine5, 72.8782F, amountMultiplier, SineWaveMotionTypes.ROTATION_Z);
   }
}
