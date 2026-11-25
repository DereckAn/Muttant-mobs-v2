package com.alexander.mutantmore.advanced_animation_utils.animation_utils;

import com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers.AdvancedAnimatable;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers.AdvancedAnimation;
import com.mojang.blaze3d.vertex.PoseStack;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

/** Client-side helpers for advanced animations: per-frame modifiers and part transforms. */
public class AdvancedAnimationUtils {
   public static float partialTick() {
      return Minecraft.getInstance().getDeltaTracker().getGameTimeDeltaPartialTick(false);
   }

   private static float frameTicks() {
      return Minecraft.getInstance().getDeltaTracker().getGameTimeDeltaTicks();
   }

   public static float getTick(float originalTick) {
      return (originalTick + partialTick()) * (float)(Math.PI / 180.0) / 20.0F;
   }

   public static void addWalkModifiers(AdvancedAnimation animation, LivingEntity entity, float groundSpeedMultiplier, float walkProgressMultiplier) {
      double xDiff = entity.getX() - entity.xo;
      double zDiff = entity.getZ() - entity.zo;
      float distanceTravelled = (float)Math.sqrt(xDiff * xDiff + zDiff * zDiff);
      float progress = modifierIfPresent(animation, "walk_progress");
      animation.getModifiers().put("walk_progress", Mth.lerp(frameTicks(), progress, progress + distanceTravelled / 300.0F * walkProgressMultiplier));
      animation.getModifiers().put("ground_speed", distanceTravelled * groundSpeedMultiplier);
   }

   public static void addLegHeightOffsetModifier(
      LivingEntity entity, Vec3 footPos, int maxSearchRange, String animationName, String modifierName, float lerpSpeed, float minLegHeight, float maxLegHeight, float modelScale
   ) {
      if (entity instanceof AdvancedAnimatable animatable) {
         AdvancedAnimation animation = animatable.getAnimationTracker().getAnimation(animationName);
         animation.getModifiers().put(
            modifierName,
            Mth.lerp(
               frameTicks() * lerpSpeed,
               modifierIfPresent(animation, modifierName),
               Mth.clamp(getLegHeightOffset(entity, footPos, maxSearchRange), minLegHeight, maxLegHeight) / modelScale
            )
         );
      }
   }

   private static boolean solid(LivingEntity entity, BlockPos pos) {
      return !entity.level().getBlockState(pos).getCollisionShape(entity.level(), pos).isEmpty();
   }

   public static float getLegHeightOffset(LivingEntity entity, Vec3 footPos, int maxSearchRange) {
      BlockPos blockpos = BlockPos.containing(footPos.x, footPos.y, footPos.z);
      boolean setCurrentHeight = false;
      float currentHeight = -maxSearchRange;
      int foundBlocks = 0;

      for (int i = -maxSearchRange; i < maxSearchRange; i++) {
         BlockPos offsetPos = blockpos.offset(0, i - 1, 0);
         boolean solid = solid(entity, offsetPos);
         if (Mth.abs(i) < Mth.abs(currentHeight) && solid && !solid(entity, offsetPos.above())) {
            currentHeight = i + (float)entity.level().getBlockState(offsetPos).getCollisionShape(entity.level(), offsetPos).max(Direction.Axis.Y) - 1.0F;
            setCurrentHeight = true;
         }

         if (solid) {
            foundBlocks++;
         }
      }

      if (!setCurrentHeight) {
         currentHeight = foundBlocks > maxSearchRange ? maxSearchRange : -maxSearchRange;
      }

      return (float)(currentHeight - (entity.getY() - entity.getBlockY()));
   }

   public static float modifierIfPresent(AdvancedAnimation animation, String modifier) {
      return animation.getModifiers().getOrDefault(modifier, 0.0F);
   }

   public static void translateAndRotateForAllParts(PoseStack stack, List<ModelPart> parts) {
      parts.forEach(part -> part.translateAndRotate(stack));
   }
}
