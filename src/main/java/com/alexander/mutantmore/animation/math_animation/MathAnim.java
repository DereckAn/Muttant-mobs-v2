package com.alexander.mutantmore.animation.math_animation;

import java.util.List;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import org.joml.Vector3f;

public final class MathAnim {
   private static final Vector3f VECTOR_CACHE = new Vector3f();

   public static void animate(Function<String, ModelPart> partSupplier, AnimationData data, MathAnimationDefinition definition) {
      for (Entry<String, BiConsumer<AnimationData, AnimationTransformation>> entry : definition.mathAnimations().entrySet()) {
         ModelPart part = partSupplier.apply(entry.getKey());
         if (part != null) {
            AnimationTransformation.INSTANCE.reset();
            entry.getValue().accept(data, AnimationTransformation.INSTANCE);
            part.offsetPos(AnimationTransformation.INSTANCE.getPositionOffset(VECTOR_CACHE));
            part.offsetRotation(AnimationTransformation.INSTANCE.getRotationOffset(VECTOR_CACHE));
            part.offsetScale(AnimationTransformation.INSTANCE.getScaleOffset(VECTOR_CACHE));
         }
      }

      for (Entry<String, List<AnimationChannel>> entry : definition.keyframeAnimations().entrySet()) {
         ModelPart part = partSupplier.apply(entry.getKey());
         if (part != null) {
            for (AnimationChannel channel : entry.getValue()) {
               Keyframe[] keyframes = channel.keyframes();
               int i = Math.max(0, Mth.binarySearch(0, keyframes.length, index -> data.elapsedSeconds() <= keyframes[index].timestamp()) - 1);
               int j = Math.min(keyframes.length - 1, i + 1);
               Keyframe keyframe = keyframes[i];
               Keyframe keyframe1 = keyframes[j];
               float f1 = data.elapsedSeconds() - keyframe.timestamp();
               float f2;
               if (j != i) {
                  f2 = Mth.clamp(f1 / (keyframe1.timestamp() - keyframe.timestamp()), 0.0F, 1.0F);
               } else {
                  f2 = 0.0F;
               }

               keyframe1.interpolation().apply(VECTOR_CACHE, f2, keyframes, i, j, definition.dontApplyScaleToKeyframes() ? 1.0F : data.animScale());
               channel.target().apply(part, VECTOR_CACHE);
            }
         }
      }
   }

   public static float sinWave(float time, float speed, float scale, float offset) {
      return sin(offset + time * speed) * scale;
   }

   public static float cosWave(float time, float speed, float scale, float offset) {
      return cos(offset + time * speed) * scale;
   }

   public static float sin(float angle) {
      return (float)Math.sin(Math.toRadians(angle));
   }

   public static float cos(float angle) {
      return (float)Math.cos(Math.toRadians(angle));
   }

   public static float tan(float angle) {
      return (float)Math.tan(Math.toRadians(angle));
   }

   public static float asin(float value) {
      return (float)Math.toDegrees(Math.asin(value));
   }

   public static float acos(float value) {
      return (float)Math.toDegrees(Math.acos(value));
   }

   public static float atan(float value) {
      return (float)Math.toDegrees(Math.atan(value));
   }

   public static float atan2(float y, float x) {
      return (float)Math.toDegrees(Math.atan2(y, x));
   }
}
