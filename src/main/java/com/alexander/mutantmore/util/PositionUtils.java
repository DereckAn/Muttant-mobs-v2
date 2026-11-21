package com.alexander.mutantmore.util;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.HitResult.Type;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PositionUtils {
   public static Vec3 getOffsetPos(Entity entity, double offsetX, double offsetY, double offsetZ, float rotationX, float rotationY) {
      Vec3 Vec3 = new Vec3(offsetZ, offsetY, offsetX)
         .zRot(MiscUtils.degToRad(rotationX))
         .yRot(-rotationY * (float) (Math.PI / 180.0) - (float) (Math.PI / 2));
      return entity.position().add(Vec3.x, Vec3.y, Vec3.z);
   }

   public static Vec3 getOffsetPos(Vec3 pos, double offsetX, double offsetY, double offsetZ, float rotationX, float rotationY) {
      Vec3 Vec3 = new Vec3(offsetZ, offsetY, offsetX)
         .zRot(MiscUtils.degToRad(rotationX))
         .yRot(-rotationY * (float) (Math.PI / 180.0) - (float) (Math.PI / 2));
      return pos.add(Vec3.x, Vec3.y, Vec3.z);
   }

   public static BlockPos getOffsetBlockPos(Entity entity, double offsetX, double offsetY, double offsetZ, float rotationX, float rotationY) {
      Vec3 Vec3 = new Vec3(offsetZ, offsetY, offsetX)
         .zRot(MiscUtils.degToRad(rotationX))
         .yRot(-rotationY * (float) (Math.PI / 180.0) - (float) (Math.PI / 2));
      return entity.blockPosition().offset((int)Vec3.x, (int)Vec3.y, (int)Vec3.z);
   }

   public static Vec3 getOffsetMotion(Entity entity, double offsetX, double offsetY, double offsetZ, float rotationX, float rotationY) {
      return new Vec3(offsetZ, offsetY, offsetX)
         .zRot(MiscUtils.degToRad(rotationX))
         .yRot(-rotationY * (float) (Math.PI / 180.0) - (float) (Math.PI / 2));
   }

   public static void moveToCorrectHeight(Entity entity, boolean discardIfOutOfBounds) {
      boolean flag = false;
      double d0 = 0.0;
      int i = 0;

      BlockPos blockpos;
      while (true) {
         blockpos = entity.blockPosition().offset(0, i, 0);
         BlockPos blockpos1 = blockpos.below();
         BlockState blockstate = entity.level().getBlockState(blockpos1);
         if (blockstate.isFaceSturdy(entity.level(), blockpos1, Direction.UP)
            && (entity.level().isEmptyBlock(blockpos) || entity.level().getBlockState(blockpos).getCollisionShape(entity.level(), blockpos).isEmpty())) {
            if (!entity.level().isEmptyBlock(blockpos)) {
               BlockState blockstate1 = entity.level().getBlockState(blockpos);
               VoxelShape voxelshape = blockstate1.getCollisionShape(entity.level(), blockpos);
               if (!voxelshape.isEmpty()) {
                  d0 = voxelshape.max(Axis.Y);
               }
            }

            flag = true;
            break;
         }

         blockpos = entity.blockPosition().offset(0, -i, 0);
         BlockPos blockpos2 = blockpos.below();
         BlockState blockstate1 = entity.level().getBlockState(blockpos2);
         if (!blockstate1.isFaceSturdy(entity.level(), blockpos2, Direction.UP)
            || !entity.level().isEmptyBlock(blockpos) && !entity.level().getBlockState(blockpos).getCollisionShape(entity.level(), blockpos).isEmpty()) {
            if (blockpos.getY() <= entity.level().getMaxY() && blockpos.getY() >= entity.level().getMinY()) {
               i++;
               if (flag) {
                  break;
               }
               continue;
            }

            if (discardIfOutOfBounds) {
               entity.discard();
            }

            blockpos = entity.blockPosition();
            flag = true;
            break;
         }

         if (!entity.level().isEmptyBlock(blockpos)) {
            BlockState blockstate11 = entity.level().getBlockState(blockpos);
            VoxelShape voxelshape = blockstate11.getCollisionShape(entity.level(), blockpos);
            if (!voxelshape.isEmpty()) {
               d0 = voxelshape.max(Axis.Y);
            }
         }

         flag = true;
         break;
      }

      if (flag) {
         entity.snapTo(entity.getX(), blockpos.getY() + d0, entity.getZ());
      }
   }

   public static float distanceBetweenVecs(Vec3 pos1, Vec3 pos2) {
      float f = (float)(pos1.x - pos2.x);
      float f1 = (float)(pos1.y - pos2.y);
      float f2 = (float)(pos1.z - pos2.z);
      return Mth.sqrt(f * f + f1 * f1 + f2 * f2);
   }

   public static boolean hasLineOfSight(Entity entitySearching, Vec3 targetPos) {
      Vec3 vec3 = new Vec3(entitySearching.getX(), entitySearching.getEyeY(), entitySearching.getZ());
      Vec3 vec31 = new Vec3(targetPos.x, targetPos.y, targetPos.z);
      if (vec31.distanceTo(vec3) > 128.0) {
         return false;
      }

      BlockHitResult clip = entitySearching.level().clip(new ClipContext(vec3, vec31, Block.COLLIDER, Fluid.NONE, entitySearching));
      return clip.getType() == Type.MISS;
   }

   public static boolean hasLineOfSight(Level level, Vec3 searchingPos, Vec3 targetPos) {
      Vec3 vec3 = new Vec3(searchingPos.x, searchingPos.y, searchingPos.z);
      Vec3 vec31 = new Vec3(targetPos.x, targetPos.y, targetPos.z);
      if (vec31.distanceTo(vec3) > 128.0) {
         return false;
      }

      BlockHitResult clip = level.clip(new ClipContext(vec3, vec31, Block.COLLIDER, Fluid.NONE, CollisionContext.empty()));
      return clip.getType() == Type.MISS;
   }

   public static Vec2 rotationToFace(Vec3 rotatingFrom, Vec3 facing) {
      double x = facing.x - rotatingFrom.x;
      double y = facing.y - rotatingFrom.y;
      double z = facing.z - rotatingFrom.z;
      double distance = Math.sqrt(x * x + z * z);
      float yRot = (float)(Mth.atan2(z, x) * 180.0F / (float)Math.PI) - 90.0F;
      float xRot = (float)(-(Mth.atan2(y, distance) * 180.0F / (float)Math.PI));
      return new Vec2(xRot, yRot);
   }
}
