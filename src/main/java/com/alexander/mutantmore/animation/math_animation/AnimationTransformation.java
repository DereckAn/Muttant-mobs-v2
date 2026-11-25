package com.alexander.mutantmore.animation.math_animation;

import org.joml.Vector3f;

public class AnimationTransformation {
   public static final AnimationTransformation INSTANCE = new AnimationTransformation();
   private float posOffsetX;
   private float posOffsetY;
   private float posOffsetZ;
   private float rotOffsetX;
   private float rotOffsetY;
   private float rotOffsetZ;
   private float scaleOffsetX;
   private float scaleOffsetY;
   private float scaleOffsetZ;

   private AnimationTransformation() {
   }

   public Vector3f getPositionOffset(Vector3f cache) {
      return cache.set(this.posOffsetX, this.posOffsetY, this.posOffsetZ);
   }

   public Vector3f getRotationOffset(Vector3f cache) {
      return cache.set(this.rotOffsetX, this.rotOffsetY, this.rotOffsetZ);
   }

   public Vector3f getScaleOffset(Vector3f cache) {
      return cache.set(this.scaleOffsetX, this.scaleOffsetY, this.scaleOffsetZ);
   }

   public void position(float x, float y, float z) {
      this.posOffsetX = -x;
      this.posOffsetY = -y;
      this.posOffsetZ = z;
   }

   public void rotation(float x, float y, float z, boolean degrees) {
      if (degrees) {
         x = (float)Math.toRadians(x);
         y = (float)Math.toRadians(y);
         z = (float)Math.toRadians(z);
      }

      this.rotOffsetX = -x;
      this.rotOffsetY = -y;
      this.rotOffsetZ = z;
   }

   public void scale(float x, float y, float z) {
      this.scaleOffsetX = x - 1.0F;
      this.scaleOffsetY = y - 1.0F;
      this.scaleOffsetZ = z - 1.0F;
   }

   public void uniformScale(float scale) {
      this.scale(scale, scale, scale);
   }

   public void reset() {
      this.posOffsetX = 0.0F;
      this.posOffsetY = 0.0F;
      this.posOffsetZ = 0.0F;
      this.rotOffsetX = 0.0F;
      this.rotOffsetY = 0.0F;
      this.rotOffsetZ = 0.0F;
      this.scaleOffsetX = 0.0F;
      this.scaleOffsetY = 0.0F;
      this.scaleOffsetZ = 0.0F;
   }
}
