package com.alexander.mutantmore.animation.sine_wave_animations;

import com.alexander.mutantmore.util.MiscUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;

public class SineWaveAnimationUtils {
   public static void addSineWaveMotionToModelPart(
      ModelPart modelPart,
      float amount,
      float speed,
      float tick,
      float min,
      float max,
      float offset,
      float speedMultiplier,
      float amountMultiplier,
      SineWaveMotionTypes motionType
   ) {
      float rotationMotion = Mth.clamp(
         Mth.cos(tick * (speedMultiplier * speed) + MiscUtils.degToRad(offset)) * MiscUtils.degToRad(amount),
         MiscUtils.degToRad(min),
         MiscUtils.degToRad(max)
      );
      float motion = Mth.clamp(Mth.cos(tick * (speedMultiplier * speed) + offset) * amount, min, max);
      if (motionType == SineWaveMotionTypes.POSITION_Y) {
         motion = -motion;
      }

      affectModelPartBasedOnMotionType(modelPart, rotationMotion * amountMultiplier, motion * amountMultiplier, motionType);
   }

   public static void addConstantMotionToModelPart(
      ModelPart modelPart, float speed, float tick, float speedMultiplier, float amountMultiplier, SineWaveMotionTypes motionType
   ) {
      float rotationMotion = tick * (speed * speedMultiplier);
      float motion = tick * (speed * speedMultiplier);
      if (motionType == SineWaveMotionTypes.POSITION_Y) {
         motion = -motion;
      }

      affectModelPartBasedOnMotionType(modelPart, rotationMotion * amountMultiplier, motion * amountMultiplier, motionType);
   }

   public static void adjustPositionOfModelPart(ModelPart modelPart, float amount, float amountMultiplier, SineWaveMotionTypes motionType) {
      float newAmount = amount;
      float newPositionAmount = amount;
      if (motionType == SineWaveMotionTypes.POSITION_Y) {
         newPositionAmount = -newPositionAmount;
      }

      affectModelPartBasedOnMotionType(modelPart, MiscUtils.degToRad(newAmount) * amountMultiplier, newPositionAmount * amountMultiplier, motionType);
   }

   public static float getSineWaveKeyframe(float amount, float speed, float tick, float min, float max, float offset) {
      return Mth.clamp(Mth.cos(tick * (1.0F * speed) + offset) * amount, min, max);
   }

   public static float getConstantMotionKeyframe(float speed, float tick) {
      return tick * speed;
   }

   public static void affectModelPartBasedOnMotionType(ModelPart modelPart, float rotationMotion, float motion, SineWaveMotionTypes motionType) {
      switch (motionType) {
         case ROTATION_X:
            modelPart.xRot += rotationMotion;
            break;
         case ROTATION_Y:
            modelPart.yRot += rotationMotion;
            break;
         case ROTATION_Z:
            modelPart.zRot += rotationMotion;
            break;
         case POSITION_X:
            modelPart.x += motion;
            break;
         case POSITION_Y:
            modelPart.y += motion;
            break;
         case POSITION_Z:
            modelPart.z += motion;
            break;
         case SCALE_X:
            modelPart.xScale += motion;
            break;
         case SCALE_Y:
            modelPart.yScale += motion;
            break;
         case SCALE_Z:
            modelPart.zScale += motion;
      }
   }

   public static float tickAmountMultiplierChange(float value, boolean shouldPlay, float transitionSpeed) {
      float newValue = value;
      if (shouldPlay) {
         if (newValue < 1.0F) {
            if (newValue + transitionSpeed > 1.0F) {
               newValue = 1.0F;
            } else {
               newValue += transitionSpeed;
            }
         }
      } else if (newValue > 0.0F) {
         if (newValue - transitionSpeed < 0.0F) {
            newValue = 0.0F;
         } else {
            newValue -= transitionSpeed;
         }
      }

      return newValue;
   }

   // ageInTicks already includes the partial tick (was tickCount + frame time)
   public static float getTick(float ageInTicks, boolean convertToRadians) {
      return convertToRadians ? MiscUtils.degToRad(ageInTicks) / 20.0F : ageInTicks / 20.0F;
   }
}
