package com.alexander.mutantmore.animation.math_animation.definition;

import com.alexander.mutantmore.animation.math_animation.MathAnim;
import com.alexander.mutantmore.animation.math_animation.MathAnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.util.Mth;

public class MutantShulkerMathAnimations2 {
   public static final MathAnimationDefinition SHOOT = MathAnimationDefinition.Builder.withLength(2.25F)
      .addAnimation("everything", (data, transforms) -> transforms.position(0.0F, 9.0F, 0.0F))
      .addAnimation("box", (data, transforms) -> {
         float animTime = data.elapsedSeconds();
         float baseRotX = 2.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.5F, 125.0F);
         float baseRotY = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 100.0F);
         float baseRotZ = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 75.0F);
         float xRot;
         if (animTime < 0.25F) {
            xRot = Mth.lerp(animTime / 0.25F, baseRotX, 0.0F);
         } else if (animTime < 1.9167F) {
            xRot = 0.0F;
         } else if (animTime < 2.25F) {
            xRot = Mth.lerp((animTime - 1.9167F) / 0.3333F, 0.0F, baseRotX);
         } else {
            xRot = baseRotX;
         }

         float yRot;
         if (animTime < 0.25F) {
            yRot = Mth.lerp(animTime / 0.25F, baseRotY, 0.0F);
         } else if (animTime < 1.9167F) {
            yRot = 0.0F;
         } else if (animTime < 2.25F) {
            yRot = Mth.lerp((animTime - 1.9167F) / 0.3333F, 0.0F, baseRotY);
         } else {
            yRot = baseRotY;
         }

         float zRot;
         if (animTime < 0.25F) {
            zRot = Mth.lerp(animTime / 0.25F, baseRotZ, 0.0F);
         } else if (animTime < 1.9167F) {
            zRot = 0.0F;
         } else if (animTime < 2.25F) {
            zRot = Mth.lerp((animTime - 1.9167F) / 0.3333F, 0.0F, baseRotZ);
         } else {
            zRot = baseRotZ;
         }

         float basePosY = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 0.0F);
         float yPos;
         if (animTime < 0.25F) {
            yPos = Mth.lerp(animTime / 0.25F, basePosY, basePosY - 2.0F);
         } else if (animTime < 0.875F) {
            yPos = Mth.lerp((animTime - 0.25F) / 0.625F, basePosY - 2.0F, basePosY);
         } else if (animTime < 1.0F) {
            yPos = Mth.lerp((animTime - 0.875F) / 0.125F, basePosY, basePosY - 1.0F);
         } else if (animTime < 1.7917F) {
            yPos = Mth.lerp((animTime - 1.0F) / 0.7917F, basePosY - 1.0F, -2.0F);
         } else if (animTime < 1.9167F) {
            yPos = Mth.lerp((animTime - 1.7917F) / 0.125F, -2.0F, basePosY + 1.0F);
         } else if (animTime < 2.25F) {
            yPos = Mth.lerp((animTime - 1.9167F) / 0.3333F, basePosY + 1.0F, basePosY);
         } else {
            yPos = basePosY;
         }

         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation(
         "box",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(1.2917F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.scaleVec(1.01F, 1.01F, 1.01F), Interpolations.LINEAR),
               new Keyframe(1.4583F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(1.5417F, KeyframeAnimations.scaleVec(1.01F, 1.01F, 1.01F), Interpolations.LINEAR),
               new Keyframe(1.625F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(1.7083F, KeyframeAnimations.scaleVec(1.01F, 1.01F, 1.01F), Interpolations.LINEAR),
               new Keyframe(1.7917F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("head", (data, transforms) -> {
         float animTime = data.elapsedSeconds();
         float baseRotX = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 75.0F);
         float baseRotY = MathAnim.cosWave(data.ageInSeconds(), 100.0F, -2.5F, 125.0F);
         float baseRotZ = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 25.0F);
         float xRot;
         if (animTime < 0.5F) {
            xRot = Mth.lerp(animTime / 0.5F, baseRotX, 0.0F);
         } else if (animTime < 1.8333F) {
            xRot = 0.0F;
         } else if (animTime < 2.25F) {
            xRot = Mth.lerp((animTime - 1.8333F) / 0.4167F, 0.0F, baseRotX);
         } else {
            xRot = baseRotX;
         }

         float yRot;
         if (animTime < 0.5F) {
            yRot = Mth.lerp(animTime / 0.5F, baseRotY, 0.0F);
         } else if (animTime < 1.8333F) {
            yRot = 0.0F;
         } else if (animTime < 2.25F) {
            yRot = Mth.lerp((animTime - 1.8333F) / 0.4167F, 0.0F, baseRotY);
         } else {
            yRot = baseRotY;
         }

         float zRot;
         if (animTime < 0.5F) {
            zRot = Mth.lerp(animTime / 0.5F, baseRotZ, 0.0F);
         } else if (animTime < 1.8333F) {
            zRot = 0.0F;
         } else if (animTime < 2.25F) {
            zRot = Mth.lerp((animTime - 1.8333F) / 0.4167F, 0.0F, baseRotZ);
         } else {
            zRot = baseRotZ;
         }

         float basePosY = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F);
         float yPos;
         if (animTime < 0.5F) {
            yPos = -1.5F + basePosY;
         } else if (animTime < 0.875F) {
            yPos = Mth.lerp((animTime - 0.5F) / 0.375F, -1.5F + basePosY, 2.5F + basePosY);
         } else if (animTime < 1.25F) {
            yPos = Mth.lerp((animTime - 0.875F) / 0.375F, 2.5F + basePosY, 1.5F + basePosY);
         } else if (animTime < 1.7083F) {
            yPos = 1.5F + basePosY;
         } else if (animTime < 1.8333F) {
            yPos = Mth.lerp((animTime - 1.7083F) / 0.125F, 1.5F + basePosY, 3.5F + basePosY);
         } else if (animTime < 2.25F) {
            yPos = Mth.lerp((animTime - 1.8333F) / 0.4167F, 3.5F + basePosY, -1.5F + basePosY);
         } else {
            yPos = -1.5F + basePosY;
         }

         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(1.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(1.4167F, KeyframeAnimations.scaleVec(1.1F, 1.1F, 1.1F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(1.5833F, KeyframeAnimations.scaleVec(1.1F, 1.1F, 1.1F), Interpolations.LINEAR),
               new Keyframe(1.6667F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.scaleVec(1.1F, 1.1F, 1.1F), Interpolations.LINEAR),
               new Keyframe(1.8333F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("uppershell", (data, transforms) -> {
         float animTime = data.elapsedSeconds();
         float baseRotX = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.5F, 50.0F);
         float xRot;
         if (animTime < 0.25F) {
            xRot = Mth.lerp(animTime / 0.25F, baseRotX, 0.0F);
         } else if (animTime < 1.875F) {
            xRot = 0.0F;
         } else if (animTime < 2.25F) {
            xRot = Mth.lerp((animTime - 1.875F) / 0.375F, 0.0F, baseRotX);
         } else {
            xRot = baseRotX;
         }

         float yRot;
         if (animTime < 0.375F) {
            yRot = 0.0F;
         } else if (animTime < 0.875F) {
            yRot = Mth.lerp((animTime - 0.375F) / 0.5F, 0.0F, 360.0F);
         } else if (animTime < 1.875F) {
            yRot = 360.0F;
         } else if (animTime < 2.25F) {
            yRot = Mth.lerp((animTime - 1.875F) / 0.375F, 360.0F, 0.0F);
         } else {
            yRot = 0.0F;
         }

         float basePosY = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, -50.0F);
         float yPos;
         if (animTime < 0.25F) {
            yPos = Mth.lerp(animTime / 0.25F, -5.0F + basePosY, -9.3F);
         } else if (animTime < 0.375F) {
            yPos = -9.3F;
         } else if (animTime < 0.875F) {
            yPos = Mth.lerp((animTime - 0.375F) / 0.5F, -9.3F, 6.7F);
         } else if (animTime < 1.125F) {
            yPos = Mth.lerp((animTime - 0.875F) / 0.25F, 6.7F, 5.0F);
         } else if (animTime < 1.75F) {
            yPos = 5.0F;
         } else if (animTime < 1.875F) {
            yPos = Mth.lerp((animTime - 1.75F) / 0.125F, 5.0F, 7.0F);
         } else if (animTime < 2.25F) {
            yPos = Mth.lerp((animTime - 1.875F) / 0.375F, 7.0F, -5.0F + basePosY);
         } else {
            yPos = -5.0F + basePosY;
         }

         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-xRot, -yRot, 0.0F, true);
      })
      .addAnimation(
         "tendons",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 360.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.0F, 360.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tendons",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.375F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.scaleVec(0.75, 1.25, 0.75), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.scaleVec(1.0, 1.5, 1.0), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.scaleVec(1.0, 1.5, 1.0), Interpolations.LINEAR),
               new Keyframe(2.0417F, KeyframeAnimations.scaleVec(0.75, 1.2934F, 0.75), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("legright1", (data, transforms) -> {
         transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 0.0F), 0.0F);
         transforms.rotation(-24.7851F, 38.8447F, -36.3602F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, 0.0F), true);
      })
      .addAnimation("legright1joint1", (data, transforms) -> transforms.rotation(-90.0F, 0.0F, 0.0F, true))
      .addAnimation(
         "legright1joint2",
         (data, transforms) -> transforms.rotation(
            -(50.0F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, 0.0F)), 0.0F, MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, 0.0F), true
         )
      )
      .addAnimation("legright2", (data, transforms) -> {
         transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 25.0F), 0.0F);
         transforms.rotation(24.7851F, -38.8447F, -36.3602F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, 25.0F), true);
      })
      .addAnimation("legright2joint1", (data, transforms) -> transforms.rotation(-90.0F, 0.0F, 0.0F, true))
      .addAnimation(
         "legright2joint2",
         (data, transforms) -> transforms.rotation(
            -(50.0F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, 25.0F)), 0.0F, MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, 25.0F), true
         )
      )
      .addAnimation("legleft1", (data, transforms) -> {
         transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, -25.0F), 0.0F);
         transforms.rotation(-24.78507F, -38.84468F, 36.3602F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, -25.0F), true);
      })
      .addAnimation("legleft1joint1", (data, transforms) -> transforms.rotation(0.0F, 0.0F, 90.0F, true))
      .addAnimation(
         "legleft1joint2",
         (data, transforms) -> transforms.rotation(
            -(50.0F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, -25.0F)), 0.0F, MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, -25.0F), true
         )
      )
      .addAnimation("legleft2", (data, transforms) -> {
         transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 50.0F), 0.0F);
         transforms.rotation(24.7851F, 38.8447F, 36.3602F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, 50.0F), true);
      })
      .addAnimation("legleft2joint1", (data, transforms) -> transforms.rotation(-90.0F, 0.0F, 0.0F, true))
      .addAnimation(
         "legleft2joint2",
         (data, transforms) -> transforms.rotation(
            -(50.0F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, 50.0F)), 0.0F, MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, 50.0F), true
         )
      )
      .build();
   public static final MathAnimationDefinition BITE = MathAnimationDefinition.Builder.withLength(2.75F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 9.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.posVec(0.0F, 15.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.8333F, KeyframeAnimations.posVec(0.0F, 9.0F, -5.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.posVec(0.0F, 9.0F, -5.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, 9.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("box", (data, transforms) -> {
         float basePosY = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 0.0F);
         float yPos;
         if (data.elapsedSeconds() < 0.5F) {
            yPos = basePosY;
         } else if (data.elapsedSeconds() < 2.25F) {
            yPos = 0.0F;
         } else if (data.elapsedSeconds() < 2.75F) {
            yPos = Mth.lerp((data.elapsedSeconds() - 2.25F) / 0.5F, 0.0F, basePosY);
         } else {
            yPos = basePosY;
         }

         float zPos;
         if (data.elapsedSeconds() < 0.9167F) {
            zPos = 0.0F;
         } else if (data.elapsedSeconds() < 2.25F) {
            zPos = Mth.lerp((data.elapsedSeconds() - 0.9167F) / 1.3333F, -6.0F, -3.0F);
         } else if (data.elapsedSeconds() < 2.75F) {
            zPos = Mth.lerp((data.elapsedSeconds() - 2.25F) / 0.5F, -3.0F, 0.0F);
         } else {
            zPos = 0.0F;
         }

         float baseRotXIdle = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.5F, 125.0F);
         float baseRotYIdle = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 100.0F);
         float baseRotZIdle = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 75.0F);
         float xRot;
         float yRot;
         float zRot;
         if (data.elapsedSeconds() < 1.5F) {
            float xOffset;
            if (data.elapsedSeconds() < 0.5F) {
               xOffset = Mth.lerp(data.elapsedSeconds() / 0.5F, 2.5F, 0.0F);
            } else if (data.elapsedSeconds() < 0.75F) {
               xOffset = Mth.lerp((data.elapsedSeconds() - 0.5F) / 0.25F, 0.0F, -12.5F);
            } else if (data.elapsedSeconds() < 0.9167F) {
               xOffset = Mth.lerp((data.elapsedSeconds() - 0.75F) / 0.1667F, -12.5F, 12.5F);
            } else if (data.elapsedSeconds() < 1.2083F) {
               xOffset = Mth.lerp((data.elapsedSeconds() - 0.9167F) / 0.2916F, 12.5F, 5.0F);
            } else {
               xOffset = 5.0F;
            }

            xRot = baseRotXIdle + xOffset;
            yRot = baseRotYIdle;
            zRot = baseRotZIdle;
         } else if (data.elapsedSeconds() < 2.25F) {
            xRot = 12.28777F;
            yRot = -0.5367F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, 5.0F, 100.0F);
            zRot = 2.45093F;
         } else if (data.elapsedSeconds() < 2.5F) {
            float progress = (data.elapsedSeconds() - 2.25F) / 0.25F;
            xRot = Mth.lerp(progress, 12.28777F, 16.71F);
            yRot = Mth.lerp(progress, -0.5367F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, 5.0F, 100.0F), 2.49F);
            zRot = Mth.lerp(progress, 2.45093F, 1.83F);
         } else if (data.elapsedSeconds() <= 2.75F) {
            float progress = (data.elapsedSeconds() - 2.5F) / 0.25F;
            float baseX = 2.5F + baseRotXIdle;
            xRot = Mth.lerp(progress, 16.71F, baseX);
            yRot = Mth.lerp(progress, 2.49F, baseRotYIdle);
            zRot = Mth.lerp(progress, 1.83F, baseRotZIdle);
         } else {
            xRot = 2.5F + baseRotXIdle;
            yRot = baseRotYIdle;
            zRot = baseRotZIdle;
         }

         transforms.position(0.0F, yPos, zPos);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation("head", (data, transforms) -> {
         float baseRotX = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 75.0F);
         float baseRotY = MathAnim.cosWave(data.ageInSeconds(), 100.0F, -2.5F, 125.0F);
         float baseRotZ = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 25.0F);
         float xRot;
         if (data.elapsedSeconds() < 0.4167F) {
            xRot = Mth.lerp(data.elapsedSeconds() / 0.4167F, baseRotX, -5.0F);
         } else if (data.elapsedSeconds() < 0.7917F) {
            xRot = Mth.lerp((data.elapsedSeconds() - 0.4167F) / 0.375F, -5.0F, -15.0F);
         } else if (data.elapsedSeconds() < 0.9167F) {
            xRot = Mth.lerp((data.elapsedSeconds() - 0.7917F) / 0.125F, -15.0F, -5.0F);
         } else if (data.elapsedSeconds() < 2.4583F) {
            xRot = -5.0F;
         } else if (data.elapsedSeconds() <= 2.75F) {
            xRot = Mth.lerp((data.elapsedSeconds() - 2.4583F) / 0.2916999F, -5.0F, baseRotX);
         } else {
            xRot = baseRotX;
         }

         float yRot;
         if (data.elapsedSeconds() < 1.3333F) {
            yRot = 0.0F;
         } else if (data.elapsedSeconds() < 2.4583F) {
            yRot = MathAnim.cosWave(data.ageInSeconds(), 1000.0F, 7.5F, 75.0F);
         } else if (data.elapsedSeconds() <= 2.75F) {
            yRot = Mth.lerp((data.elapsedSeconds() - 2.4583F) / 0.2916999F, MathAnim.cosWave(data.ageInSeconds(), 1000.0F, 7.5F, 75.0F), baseRotY);
         } else {
            yRot = baseRotY;
         }

         float zRot;
         if (data.elapsedSeconds() < 0.4167F) {
            zRot = baseRotZ;
         } else if (data.elapsedSeconds() < 2.4583F) {
            zRot = 0.0F;
         } else if (data.elapsedSeconds() <= 2.75F) {
            zRot = Mth.lerp((data.elapsedSeconds() - 2.4583F) / 0.2916999F, 0.0F, baseRotZ);
         } else {
            zRot = baseRotZ;
         }

         float basePosY = -1.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F);
         float yPos;
         float zPos;
         if (data.elapsedSeconds() < 0.3333F) {
            float targetY = -2.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F);
            yPos = Mth.lerp(data.elapsedSeconds() / 0.3333F, basePosY, targetY);
            zPos = Mth.lerp(data.elapsedSeconds() / 0.3333F, 0.0F, 1.0F);
         } else if (data.elapsedSeconds() < 0.6667F) {
            yPos = Mth.lerp((data.elapsedSeconds() - 0.3333F) / 0.3334F, -2.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F), -2.07F);
            zPos = Mth.lerp((data.elapsedSeconds() - 0.3333F) / 0.3334F, 1.0F, 2.69F);
         } else if (data.elapsedSeconds() < 0.8333F) {
            float targetY = -0.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F);
            yPos = Mth.lerp((data.elapsedSeconds() - 0.6667F) / 0.16659999F, -2.07F, targetY);
            zPos = Mth.lerp((data.elapsedSeconds() - 0.6667F) / 0.16659999F, 2.69F, 0.0F);
         } else if (data.elapsedSeconds() < 1.1667F) {
            float targetY = -1.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F);
            yPos = Mth.lerp((data.elapsedSeconds() - 0.8333F) / 0.3334F, -0.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F), targetY);
            zPos = 0.0F;
         } else if (data.elapsedSeconds() < 2.2917F) {
            yPos = -1.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F);
            zPos = 0.0F;
         } else if (data.elapsedSeconds() <= 2.75F) {
            float targetY = -1.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F);
            yPos = Mth.lerp((data.elapsedSeconds() - 2.2917F) / 0.4583001F, targetY, targetY);
            zPos = 0.0F;
         } else {
            yPos = basePosY;
            zPos = 0.0F;
         }

         transforms.position(0.0F, yPos, zPos);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation("uppershell", (data, transforms) -> {
         float baseRotX = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.5F, 50.0F);
         float xRot;
         float yRot;
         if (data.elapsedSeconds() < 0.5F) {
            xRot = Mth.lerp(data.elapsedSeconds() / 0.5F, baseRotX, -0.26F);
            yRot = 0.0F;
         } else if (data.elapsedSeconds() < 0.75F) {
            xRot = Mth.lerp((data.elapsedSeconds() - 0.5F) / 0.25F, -0.26F, -15.56F);
            yRot = 0.0F;
         } else if (data.elapsedSeconds() < 0.8333F) {
            xRot = Mth.lerp((data.elapsedSeconds() - 0.75F) / 0.083299994F, -15.56F, -20.55F);
            yRot = 0.0F;
         } else if (data.elapsedSeconds() < 0.9583F) {
            xRot = Mth.lerp((data.elapsedSeconds() - 0.8333F) / 0.125F, -20.55F, 2.5F);
            yRot = 0.0F;
         } else if (data.elapsedSeconds() < 1.2917F) {
            xRot = Mth.lerp((data.elapsedSeconds() - 0.9583F) / 0.3334F, 2.5F, -5.0F);
            yRot = 0.0F;
         } else if (data.elapsedSeconds() < 1.625F) {
            xRot = -5.0F;
            yRot = 0.0F;
         } else if (data.elapsedSeconds() < 2.25F) {
            xRot = -5.0F;
            yRot = MathAnim.cosWave(data.ageInSeconds(), 1000.0F, 2.5F, 50.0F);
         } else if (data.elapsedSeconds() < 2.5417F) {
            float progress = (data.elapsedSeconds() - 2.25F) / 0.2916999F;
            xRot = Mth.lerp(progress, -5.0F, 2.1F);
            yRot = Mth.lerp(progress, MathAnim.cosWave(data.ageInSeconds(), 1000.0F, 2.5F, 50.0F), 1.54F);
         } else if (data.elapsedSeconds() <= 2.75F) {
            float progress = (data.elapsedSeconds() - 2.5417F) / 0.20830011F;
            float targetX = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.5F, 50.0F);
            xRot = Mth.lerp(progress, 2.1F, targetX);
            yRot = Mth.lerp(progress, 1.54F, 0.0F);
         } else {
            xRot = baseRotX;
            yRot = 0.0F;
         }

         float basePosY = -5.0F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, -50.0F);
         float zPos;
         float yPos;
         if (data.elapsedSeconds() < 0.5F) {
            yPos = Mth.lerp(data.elapsedSeconds() / 0.5F, basePosY, -5.5F);
            zPos = 0.0F;
         } else if (data.elapsedSeconds() < 0.75F) {
            float progress = (data.elapsedSeconds() - 0.5F) / 0.25F;
            yPos = Mth.lerp(progress, -5.5F, 1.0F);
            zPos = Mth.lerp(progress, 0.0F, 1.0F);
         } else if (data.elapsedSeconds() < 0.875F) {
            float progress = (data.elapsedSeconds() - 0.75F) / 0.125F;
            yPos = Mth.lerp(progress, 1.0F, 1.12F);
            zPos = Mth.lerp(progress, 1.0F, 1.75F);
         } else if (data.elapsedSeconds() < 0.9583F) {
            float progress = (data.elapsedSeconds() - 0.875F) / 0.083299994F;
            yPos = Mth.lerp(progress, 1.12F, -10.5F);
            zPos = Mth.lerp(progress, 1.75F, 0.0F);
         } else if (data.elapsedSeconds() < 1.1667F) {
            yPos = Mth.lerp((data.elapsedSeconds() - 0.9583F) / 0.20840001F, -10.5F, -7.5F);
            zPos = 0.0F;
         } else if (data.elapsedSeconds() < 2.25F) {
            yPos = -7.5F;
            zPos = 0.0F;
         } else if (data.elapsedSeconds() <= 2.75F) {
            float targetY = -5.0F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, -50.0F);
            yPos = Mth.lerp((data.elapsedSeconds() - 2.25F) / 0.5F, -7.5F, targetY);
            zPos = 0.0F;
         } else {
            yPos = basePosY;
            zPos = 0.0F;
         }

         transforms.position(0.0F, yPos, zPos);
         transforms.rotation(-xRot, -yRot, 0.0F, true);
      })
      .addAnimation(
         "legright1Rotator",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.degreeVec(0.0F, 25.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, 25.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, 25.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "legright1",
         (data, transforms) -> {
            float baseRotX = 24.7851F;
            float baseRotY = -38.8447F;
            float baseRotZ = -36.3602F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, 0.0F);
            float xRot;
            float yRot;
            float zRot;
            if (data.elapsedSeconds() < 0.5F) {
               xRot = baseRotX;
               yRot = baseRotY;
               zRot = baseRotZ;
            } else if (data.elapsedSeconds() < 0.6667F) {
               float progress = (data.elapsedSeconds() - 0.5F) / 0.1667F;
               xRot = Mth.lerp(progress, baseRotX, 39.32408F);
               yRot = Mth.lerp(progress, baseRotY, -23.9215F);
               zRot = Mth.lerp(progress, baseRotZ, -67.3962F);
            } else if (data.elapsedSeconds() < 2.0F) {
               xRot = Mth.lerp(Math.min(1.0F, (data.elapsedSeconds() - 0.6667F) / 0.25F), 39.32408F, 20.94671F);
               yRot = Mth.lerp(Math.min(1.0F, (data.elapsedSeconds() - 0.6667F) / 0.25F), -23.9215F, -40.7852F);
               zRot = -30.3618F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, -25.0F);
            } else if (data.elapsedSeconds() < 2.25F) {
               xRot = 20.95F;
               yRot = -40.79F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, 10.0F, 100.0F);
               zRot = -30.3618F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, -25.0F);
            } else if (data.elapsedSeconds() < 2.4167F) {
               xRot = 20.95F;
               yRot = -40.79F;
               zRot = -30.3618F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, -25.0F);
            } else if (data.elapsedSeconds() <= 2.75F) {
               float progress = (data.elapsedSeconds() - 2.4167F) / 0.3333001F;
               xRot = Mth.lerp(progress, 20.95F, baseRotX);
               yRot = Mth.lerp(progress, -40.79F, baseRotY);
               zRot = Mth.lerp(progress, -30.3618F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, -25.0F), baseRotZ);
            } else {
               xRot = baseRotX;
               yRot = baseRotY;
               zRot = baseRotZ;
            }

            float basePosY = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 0.0F);
            float yPos;
            float xPos;
            float zPos;
            if (data.elapsedSeconds() < 0.6667F) {
               xPos = 0.0F;
               yPos = basePosY;
               zPos = 0.0F;
            } else if (data.elapsedSeconds() < 0.75F) {
               float progress = (data.elapsedSeconds() - 0.6667F) / 0.083299994F;
               xPos = Mth.lerp(progress, 0.0F, 0.0F);
               yPos = Mth.lerp(progress, basePosY, 1.26F);
               zPos = Mth.lerp(progress, 0.0F, -2.0F);
            } else if (data.elapsedSeconds() < 1.2083F) {
               float progress = (data.elapsedSeconds() - 0.75F) / 0.4583F;
               xPos = Mth.lerp(progress, 0.0F, 2.5F);
               yPos = -2.0F + basePosY;
               zPos = Mth.lerp(progress, -2.0F, -5.7F);
            } else if (data.elapsedSeconds() < 2.0F) {
               xPos = Mth.lerp((data.elapsedSeconds() - 1.2083F) / 0.7917F, 2.5F, 1.4F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, -1.0F, 100.0F));
               yPos = -1.0F + basePosY;
               zPos = Mth.lerp((data.elapsedSeconds() - 1.2083F) / 0.7917F, -5.7F, -3.9F);
            } else if (data.elapsedSeconds() < 2.25F) {
               xPos = Mth.lerp(
                  (data.elapsedSeconds() - 2.0F) / 0.25F,
                  1.4F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, -1.0F, 100.0F),
                  2.5F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, -1.0F, 100.0F)
               );
               yPos = -1.0F + basePosY;
               zPos = -4.0F;
            } else if (data.elapsedSeconds() < 2.4167F) {
               xPos = Mth.lerp((data.elapsedSeconds() - 2.25F) / 0.16669989F, 2.5F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, -1.0F, 100.0F), -0.37F);
               yPos = Mth.lerp((data.elapsedSeconds() - 2.25F) / 0.16669989F, -1.0F + basePosY, -1.22F);
               zPos = Mth.lerp((data.elapsedSeconds() - 2.25F) / 0.16669989F, -4.0F, -3.0F);
            } else if (data.elapsedSeconds() <= 2.75F) {
               float progress = (data.elapsedSeconds() - 2.4167F) / 0.3333001F;
               xPos = Mth.lerp(progress, -0.37F, 0.0F);
               yPos = Mth.lerp(progress, -1.22F, basePosY);
               zPos = Mth.lerp(progress, -3.0F, 0.0F);
            } else {
               xPos = 0.0F;
               yPos = basePosY;
               zPos = 0.0F;
            }

            transforms.position(-xPos, yPos, zPos);
            transforms.rotation(-xRot, -yRot, zRot, true);
         }
      )
      .addAnimation(
         "legright1joint1",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation("legright1joint2", (data, transforms) -> {
         float baseRotX = 50.0F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, 0.0F);
         float baseRotZ = MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, 0.0F);
         float xRot;
         float yRot;
         float zRot;
         if (data.elapsedSeconds() < 0.6667F) {
            xRot = baseRotX;
            yRot = 0.0F;
            zRot = baseRotZ;
         } else if (data.elapsedSeconds() < 0.9167F) {
            float progress = (data.elapsedSeconds() - 0.6667F) / 0.25F;
            xRot = Mth.lerp(progress, baseRotX, 67.5473F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, -25.0F));
            yRot = Mth.lerp(progress, 0.0F, -7.8672F);
            zRot = Mth.lerp(progress, baseRotZ, -35.2238F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, -25.0F));
         } else if (data.elapsedSeconds() < 2.25F) {
            xRot = 67.5473F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, -25.0F);
            yRot = -7.8672F;
            zRot = -35.2238F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, -25.0F);
         } else if (data.elapsedSeconds() <= 2.75F) {
            float progress = (data.elapsedSeconds() - 2.25F) / 0.5F;
            xRot = Mth.lerp(progress, 67.5473F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, -25.0F), baseRotX);
            yRot = Mth.lerp(progress, -7.8672F, 0.0F);
            zRot = Mth.lerp(progress, -35.2238F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, -25.0F), baseRotZ);
         } else {
            xRot = baseRotX;
            yRot = 0.0F;
            zRot = baseRotZ;
         }

         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation(
         "legright2Rotator",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.degreeVec(0.0F, 22.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 22.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "legright2Rotator",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(2.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("legright2", (data, transforms) -> {
         float baseRotX = -24.7851F;
         float baseRotY = 38.8447F;
         float baseRotZ = -36.3602F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, 25.0F);
         float xRot;
         float yRot;
         float zRot;
         if (data.elapsedSeconds() < 0.6667F) {
            xRot = baseRotX;
            yRot = baseRotY;
            zRot = baseRotZ;
         } else if (data.elapsedSeconds() < 0.9167F) {
            float progress = (data.elapsedSeconds() - 0.6667F) / 0.25F;
            xRot = Mth.lerp(progress, baseRotX, -29.8414F);
            yRot = Mth.lerp(progress, baseRotY, 35.39107F);
            zRot = -44.7183F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, 25.0F);
         } else if (data.elapsedSeconds() < 2.25F) {
            xRot = -26.56961F;
            yRot = 37.75638F;
            zRot = -39.2312F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, 25.0F);
         } else if (data.elapsedSeconds() <= 2.75F) {
            float progress = (data.elapsedSeconds() - 2.25F) / 0.5F;
            xRot = Mth.lerp(progress, -26.56961F, baseRotX);
            yRot = Mth.lerp(progress, 37.75638F, baseRotY);
            zRot = Mth.lerp(progress, -39.2312F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, 25.0F), baseRotZ);
         } else {
            xRot = baseRotX;
            yRot = baseRotY;
            zRot = baseRotZ;
         }

         float basePosY = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 25.0F);
         float xPos;
         float yPos;
         float zPos;
         if (data.elapsedSeconds() < 0.6667F) {
            xPos = 0.0F;
            yPos = basePosY;
            zPos = 0.0F;
         } else if (data.elapsedSeconds() < 0.75F) {
            float progress = (data.elapsedSeconds() - 0.6667F) / 0.083299994F;
            xPos = 0.0F;
            yPos = Mth.lerp(progress, basePosY, -1.74F);
            zPos = Mth.lerp(progress, 0.0F, -2.0F);
         } else if (data.elapsedSeconds() < 1.1667F) {
            xPos = 0.5F;
            yPos = 2.0F + basePosY;
            zPos = Mth.lerp((data.elapsedSeconds() - 0.75F) / 0.4167F, -2.0F, -7.0F);
         } else if (data.elapsedSeconds() < 2.0F) {
            xPos = 0.5F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, -1.0F, 250.0F);
            yPos = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 0.0F);
            zPos = -7.0F;
         } else if (data.elapsedSeconds() < 2.25F) {
            xPos = 0.5F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, -1.0F, 250.0F);
            yPos = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 0.0F);
            zPos = Mth.lerp((data.elapsedSeconds() - 2.0F) / 0.25F, -7.0F, -5.0F);
         } else if (data.elapsedSeconds() < 2.4167F) {
            float progress = (data.elapsedSeconds() - 2.25F) / 0.16669989F;
            xPos = Mth.lerp(progress, 0.5F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, -1.0F, 250.0F), 1.63F);
            yPos = Mth.lerp(progress, MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 0.0F), 1.78F);
            zPos = Mth.lerp(progress, -5.0F, -4.0F);
         } else if (data.elapsedSeconds() <= 2.75F) {
            float progress = (data.elapsedSeconds() - 2.4167F) / 0.3333001F;
            xPos = Mth.lerp(progress, 1.63F, 0.0F);
            yPos = Mth.lerp(progress, 1.78F, basePosY);
            zPos = Mth.lerp(progress, -4.0F, 0.0F);
         } else {
            xPos = 0.0F;
            yPos = basePosY;
            zPos = 0.0F;
         }

         transforms.position(-xPos, yPos, zPos);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation(
         "legright2joint1",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation("legright2joint2", (data, transforms) -> {
         float baseRotX = 50.0F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, 25.0F);
         float baseRotZ = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, 25.0F);
         float xRot;
         float yRot;
         float zRot;
         if (data.elapsedSeconds() < 0.6667F) {
            xRot = baseRotX;
            yRot = 0.0F;
            zRot = baseRotZ;
         } else if (data.elapsedSeconds() < 0.9167F) {
            float progress = (data.elapsedSeconds() - 0.6667F) / 0.25F;
            xRot = Mth.lerp(progress, baseRotX, 32.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, 25.0F));
            yRot = 0.0F;
            zRot = Mth.lerp(progress, baseRotZ, MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, 25.0F));
         } else if (data.elapsedSeconds() < 2.25F) {
            xRot = 32.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, 25.0F);
            yRot = 0.0F;
            zRot = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, 25.0F);
         } else if (data.elapsedSeconds() <= 2.75F) {
            float progress = (data.elapsedSeconds() - 2.25F) / 0.5F;
            xRot = Mth.lerp(progress, 32.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, 25.0F), baseRotX);
            yRot = 0.0F;
            zRot = Mth.lerp(progress, MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, 25.0F), baseRotZ);
         } else {
            xRot = baseRotX;
            yRot = 0.0F;
            zRot = baseRotZ;
         }

         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation(
         "legleft1Rotator",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.degreeVec(0.0F, -25.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, -25.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.degreeVec(0.0F, -25.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("legleft1", (data, transforms) -> {
         float baseRotX = 24.78507F;
         float baseRotY = 38.84468F;
         float baseRotZ = 36.3602F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, -25.0F);
         float xRot;
         float yRot;
         float zRot;
         if (data.elapsedSeconds() < 0.5F) {
            xRot = baseRotX;
            yRot = baseRotY;
            zRot = baseRotZ;
         } else if (data.elapsedSeconds() < 0.6667F) {
            float progress = (data.elapsedSeconds() - 0.5F) / 0.1667F;
            xRot = Mth.lerp(progress, baseRotX, 39.32408F);
            yRot = Mth.lerp(progress, baseRotY, 23.92154F);
            zRot = Mth.lerp(progress, baseRotZ, 67.39623F);
         } else if (data.elapsedSeconds() < 2.0F) {
            xRot = 20.95F;
            yRot = 40.79F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, -10.0F, 100.0F);
            zRot = 30.3618F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, -25.0F);
         } else if (data.elapsedSeconds() < 2.25F) {
            xRot = 20.95F;
            yRot = 40.79F;
            zRot = 30.3618F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, -25.0F);
         } else if (data.elapsedSeconds() <= 2.75F) {
            float progress = (data.elapsedSeconds() - 2.25F) / 0.5F;
            xRot = Mth.lerp(progress, 20.95F, baseRotX);
            yRot = Mth.lerp(progress, 40.79F, baseRotY);
            zRot = Mth.lerp(progress, 30.3618F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, -25.0F), baseRotZ);
         } else {
            xRot = baseRotX;
            yRot = baseRotY;
            zRot = baseRotZ;
         }

         float basePosY = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, -25.0F);
         float xPos;
         float yPos;
         float zPos;
         if (data.elapsedSeconds() < 0.6667F) {
            xPos = 0.0F;
            yPos = basePosY;
            zPos = 0.0F;
         } else if (data.elapsedSeconds() < 0.75F) {
            float progress = (data.elapsedSeconds() - 0.6667F) / 0.083299994F;
            xPos = 0.0F;
            yPos = Mth.lerp(progress, basePosY, 1.26F);
            zPos = Mth.lerp(progress, 0.0F, -2.0F);
         } else if (data.elapsedSeconds() < 1.2083F) {
            xPos = -2.0F;
            yPos = -2.0F + basePosY;
            zPos = -6.0F;
         } else if (data.elapsedSeconds() < 2.0F) {
            xPos = -2.0F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, -1.0F, 100.0F);
            yPos = -1.0F + basePosY;
            zPos = Mth.lerp((data.elapsedSeconds() - 1.2083F) / 0.7917F, -6.0F, -4.0F);
         } else if (data.elapsedSeconds() < 2.25F) {
            xPos = -2.0F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, -1.0F, 100.0F);
            yPos = -1.0F + basePosY;
            zPos = Mth.lerp((data.elapsedSeconds() - 2.0F) / 0.25F, -4.0F, -3.8F);
         } else if (data.elapsedSeconds() < 2.4167F) {
            float progress = (data.elapsedSeconds() - 2.25F) / 0.16669989F;
            xPos = Mth.lerp(progress, -0.9F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, -1.0F, 100.0F), -1.63F);
            yPos = Mth.lerp(progress, -1.0F + basePosY, -2.22F);
            zPos = Mth.lerp(progress, -3.8F, -4.0F);
         } else if (data.elapsedSeconds() <= 2.75F) {
            float progress = (data.elapsedSeconds() - 2.4167F) / 0.3333001F;
            xPos = Mth.lerp(progress, -1.63F, 0.0F);
            yPos = Mth.lerp(progress, -2.22F, basePosY);
            zPos = Mth.lerp(progress, -4.0F, 0.0F);
         } else {
            xPos = 0.0F;
            yPos = basePosY;
            zPos = 0.0F;
         }

         transforms.position(-xPos, yPos, zPos);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation(
         "legleft1joint1",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 90.0F), Interpolations.LINEAR)})
      )
      .addAnimation("legleft1joint2", (data, transforms) -> {
         float baseRotX = 50.0F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, -25.0F);
         float baseRotZ = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, -25.0F);
         float xRot;
         float yRot;
         float zRot;
         if (data.elapsedSeconds() < 0.6667F) {
            xRot = baseRotX;
            yRot = 0.0F;
            zRot = baseRotZ;
         } else if (data.elapsedSeconds() < 0.9167F) {
            float progress = (data.elapsedSeconds() - 0.6667F) / 0.25F;
            xRot = Mth.lerp(progress, baseRotX, 67.5473F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, -25.0F));
            yRot = Mth.lerp(progress, 0.0F, -7.8672F);
            zRot = Mth.lerp(progress, baseRotZ, -35.2238F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, -25.0F));
         } else if (data.elapsedSeconds() < 2.25F) {
            xRot = 67.5473F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, -25.0F);
            yRot = -7.8672F;
            zRot = -35.2238F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, -25.0F);
         } else if (data.elapsedSeconds() <= 2.75F) {
            float progress = (data.elapsedSeconds() - 2.25F) / 0.5F;
            xRot = Mth.lerp(progress, 67.5473F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, -25.0F), baseRotX);
            yRot = Mth.lerp(progress, -7.8672F, 0.0F);
            zRot = Mth.lerp(progress, -35.2238F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, -25.0F), baseRotZ);
         } else {
            xRot = baseRotX;
            yRot = 0.0F;
            zRot = baseRotZ;
         }

         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation(
         "legleft2Rotator",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.degreeVec(0.0F, -22.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, -22.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "legleft2Rotator",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.9167F, KeyframeAnimations.posVec(-2.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(-2.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("legleft2", (data, transforms) -> {
         float baseRotX = -24.7851F;
         float baseRotY = -38.8447F;
         float baseRotZ = 36.3602F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, 50.0F);
         float xRot;
         float yRot;
         float zRot;
         if (data.elapsedSeconds() < 0.6667F) {
            xRot = baseRotX;
            yRot = baseRotY;
            zRot = baseRotZ;
         } else if (data.elapsedSeconds() < 0.9167F) {
            float progress = (data.elapsedSeconds() - 0.6667F) / 0.25F;
            xRot = Mth.lerp(progress, baseRotX, -32.73555F);
            yRot = Mth.lerp(progress, baseRotY, -32.7923F);
            zRot = 49.8779F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, 50.0F);
         } else if (data.elapsedSeconds() < 2.25F) {
            xRot = -26.56961F;
            yRot = -37.75638F;
            zRot = 39.2312F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, 50.0F);
         } else if (data.elapsedSeconds() <= 2.75F) {
            float progress = (data.elapsedSeconds() - 2.25F) / 0.5F;
            xRot = Mth.lerp(progress, -26.56961F, baseRotX);
            yRot = Mth.lerp(progress, -37.75638F, baseRotY);
            zRot = Mth.lerp(progress, 39.2312F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, 50.0F), baseRotZ);
         } else {
            xRot = baseRotX;
            yRot = baseRotY;
            zRot = baseRotZ;
         }

         float basePosY = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 50.0F);
         float xPos;
         float yPos;
         float zPos;
         if (data.elapsedSeconds() < 0.6667F) {
            xPos = 0.0F;
            yPos = basePosY;
            zPos = 0.0F;
         } else if (data.elapsedSeconds() < 0.75F) {
            float progress = (data.elapsedSeconds() - 0.6667F) / 0.083299994F;
            xPos = 0.0F;
            yPos = Mth.lerp(progress, basePosY, -1.74F);
            zPos = Mth.lerp(progress, 0.0F, -2.0F);
         } else if (data.elapsedSeconds() < 1.2083F) {
            xPos = -0.5F;
            yPos = 2.0F + basePosY;
            zPos = -8.0F;
         } else if (data.elapsedSeconds() < 2.0F) {
            xPos = -0.5F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, -1.0F, 250.0F);
            yPos = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 0.0F);
            zPos = -7.0F;
         } else if (data.elapsedSeconds() < 2.25F) {
            xPos = -0.5F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, -1.0F, 250.0F);
            yPos = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 0.0F);
            zPos = Mth.lerp((data.elapsedSeconds() - 2.0F) / 0.25F, -7.0F, -5.0F);
         } else if (data.elapsedSeconds() < 2.4167F) {
            float progress = (data.elapsedSeconds() - 2.25F) / 0.16669989F;
            xPos = Mth.lerp(progress, -0.5F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, -1.0F, 250.0F), 0.37F);
            yPos = Mth.lerp(progress, MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 0.0F), 1.78F);
            zPos = Mth.lerp(progress, -5.0F, -6.0F);
         } else if (data.elapsedSeconds() <= 2.75F) {
            float progress = (data.elapsedSeconds() - 2.4167F) / 0.3333001F;
            xPos = Mth.lerp(progress, 0.37F, 0.0F);
            yPos = Mth.lerp(progress, 1.78F, basePosY);
            zPos = Mth.lerp(progress, -6.0F, 0.0F);
         } else {
            xPos = 0.0F;
            yPos = basePosY;
            zPos = 0.0F;
         }

         transforms.position(-xPos, yPos, zPos);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation(
         "legleft2joint1",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation("legleft2joint2", (data, transforms) -> {
         float baseRotX = 50.0F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, 50.0F);
         float baseRotZ = MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, 50.0F);
         float xRot;
         float yRot;
         float zRot;
         if (data.elapsedSeconds() < 0.6667F) {
            xRot = baseRotX;
            yRot = 0.0F;
            zRot = baseRotZ;
         } else if (data.elapsedSeconds() < 0.9167F) {
            float progress = (data.elapsedSeconds() - 0.6667F) / 0.25F;
            xRot = Mth.lerp(progress, baseRotX, 32.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, 25.0F));
            yRot = 0.0F;
            zRot = Mth.lerp(progress, baseRotZ, MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, 25.0F));
         } else if (data.elapsedSeconds() < 2.25F) {
            xRot = 32.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, 25.0F);
            yRot = 0.0F;
            zRot = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, 25.0F);
         } else if (data.elapsedSeconds() <= 2.75F) {
            float progress = (data.elapsedSeconds() - 2.25F) / 0.5F;
            xRot = Mth.lerp(progress, 32.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, -3.0F, 25.0F), baseRotX);
            yRot = 0.0F;
            zRot = Mth.lerp(progress, MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, 25.0F), baseRotZ);
         } else {
            xRot = baseRotX;
            yRot = 0.0F;
            zRot = baseRotZ;
         }

         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .build();
   public static final MathAnimationDefinition ENTER_SPIN = MathAnimationDefinition.Builder.withLength(1.0F)
      .addAnimation(
         "everything",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 19.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("box", (data, transforms) -> {
         float ageInSeconds = data.ageInSeconds();
         float elapsedSeconds = data.elapsedSeconds();
         float xRot;
         float yRot;
         float zRot;
         if (elapsedSeconds < 0.5F) {
            float progress = elapsedSeconds / 0.5F;
            xRot = Mth.lerp(progress, 2.5F + MathAnim.cosWave(ageInSeconds, 100.0F, 1.5F, 125.0F), 2.5F);
            yRot = Mth.lerp(progress, MathAnim.cosWave(ageInSeconds, 100.0F, 1.0F, 100.0F), 0.0F);
            zRot = Mth.lerp(progress, MathAnim.cosWave(ageInSeconds, 100.0F, 1.0F, 75.0F), 0.0F);
         } else if (elapsedSeconds < 0.625F) {
            xRot = 2.5F;
            yRot = 0.0F;
            zRot = 0.0F;
         } else {
            xRot = 2.5F;
            yRot = 0.0F;
            zRot = 0.0F;
         }

         float yPos;
         if (elapsedSeconds < 0.5F) {
            yPos = Mth.lerp(elapsedSeconds / 0.5F, MathAnim.cosWave(ageInSeconds, 100.0F, 1.0F, 0.0F), 0.0F);
         } else if (elapsedSeconds < 0.625F) {
            yPos = 0.0F;
         } else if (elapsedSeconds < 0.6667F) {
            yPos = Mth.lerp((elapsedSeconds - 0.625F) / 0.041700006F, 0.0F, -2.0F);
         } else if (elapsedSeconds < 0.875F) {
            yPos = Mth.lerp((elapsedSeconds - 0.6667F) / 0.2083F, -2.0F, 0.0F);
         } else {
            yPos = 0.0F;
         }

         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation("uppershell", (data, transforms) -> {
         float ageInSeconds = data.ageInSeconds();
         float elapsedSeconds = data.elapsedSeconds();
         float xRot;
         if (elapsedSeconds < 0.5F) {
            xRot = Mth.lerp(elapsedSeconds / 0.5F, MathAnim.cosWave(ageInSeconds, 100.0F, 1.5F, 50.0F), 0.0F);
         } else {
            xRot = 0.0F;
         }

         float yPos;
         if (elapsedSeconds < 0.5F) {
            yPos = Mth.lerp(elapsedSeconds / 0.5F, -5.0F + MathAnim.cosWave(ageInSeconds, 100.0F, 0.5F, -50.0F), -5.0F);
         } else {
            yPos = -5.0F;
         }

         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-xRot, 0.0F, 0.0F, true);
      })
      .addAnimation("legright1", (data, transforms) -> {
         float ageInSeconds = data.ageInSeconds();
         float elapsedSeconds = data.elapsedSeconds();
         float xRot;
         float yRot;
         float zRot;
         if (elapsedSeconds < 0.5F) {
            float progress = elapsedSeconds / 0.5F;
            xRot = Mth.lerp(progress, 24.7851F, 14.5176F);
            yRot = Mth.lerp(progress, -38.8447F, -43.076F);
            zRot = Mth.lerp(progress, -36.3602F + MathAnim.cosWave(ageInSeconds, 100.0F, -5.0F, 0.0F), -20.7551F);
         } else if (elapsedSeconds < 0.625F) {
            xRot = 14.5176F;
            yRot = -43.076F;
            zRot = -20.7551F;
         } else if (elapsedSeconds < 0.75F) {
            float progress = (elapsedSeconds - 0.625F) / 0.125F;
            xRot = Mth.lerp(progress, 14.5176F, 45.00282F);
            yRot = Mth.lerp(progress, -43.076F, 0.00618F);
            zRot = Mth.lerp(progress, -20.7551F, -90.00014F);
         } else if (elapsedSeconds < 0.875F) {
            float progress = (elapsedSeconds - 0.75F) / 0.125F;
            xRot = Mth.lerp(progress, 45.00282F, 44.98F);
            yRot = Mth.lerp(progress, 0.00618F, -1.76F);
            zRot = Mth.lerp(progress, -90.00014F, -88.23F);
         } else {
            xRot = 44.98F;
            yRot = -1.76F;
            zRot = -88.23F;
         }

         float yPos;
         if (elapsedSeconds < 0.5F) {
            yPos = Mth.lerp(elapsedSeconds / 0.5F, MathAnim.cosWave(ageInSeconds, 100.0F, 1.0F, 0.0F), 0.0F);
         } else {
            yPos = 0.0F;
         }

         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation("legright1joint1", (data, transforms) -> transforms.rotation(-90.0F, 0.0F, 0.0F, true))
      .addAnimation("legright1joint2", (data, transforms) -> {
         float ageInSeconds = data.ageInSeconds();
         float elapsedSeconds = data.elapsedSeconds();
         float xRot;
         float zRot;
         if (elapsedSeconds < 0.5F) {
            float progress = elapsedSeconds / 0.5F;
            xRot = Mth.lerp(progress, 50.0F + MathAnim.cosWave(ageInSeconds, 100.0F, -3.0F, 0.0F), 57.5F);
            zRot = Mth.lerp(progress, MathAnim.cosWave(ageInSeconds, 100.0F, -5.0F, 0.0F), 0.0F);
         } else if (elapsedSeconds < 0.625F) {
            xRot = 57.5F;
            zRot = 0.0F;
         } else if (elapsedSeconds < 0.75F) {
            float progress = (elapsedSeconds - 0.625F) / 0.125F;
            xRot = Mth.lerp(progress, 57.5F, 35.0F);
            zRot = 0.0F;
         } else {
            xRot = 35.0F;
            zRot = 0.0F;
         }

         transforms.rotation(-xRot, 0.0F, zRot, true);
      })
      .addAnimation("legright2", (data, transforms) -> {
         float ageInSeconds = data.ageInSeconds();
         float elapsedSeconds = data.elapsedSeconds();
         float xRot;
         float yRot;
         float zRot;
         if (elapsedSeconds < 0.5F) {
            float progress = elapsedSeconds / 0.5F;
            xRot = Mth.lerp(progress, -24.7851F, -14.51761F);
            yRot = Mth.lerp(progress, 38.8447F, 43.07604F);
            zRot = Mth.lerp(progress, -36.3602F + MathAnim.cosWave(ageInSeconds, 100.0F, -5.0F, 25.0F), -20.75508F);
         } else if (elapsedSeconds < 0.625F) {
            xRot = -14.51761F;
            yRot = 43.07604F;
            zRot = -20.75508F;
         } else if (elapsedSeconds < 0.75F) {
            float progress = (elapsedSeconds - 0.625F) / 0.125F;
            xRot = Mth.lerp(progress, -14.51761F, -45.0028F);
            yRot = Mth.lerp(progress, 43.07604F, -0.0062F);
            zRot = Mth.lerp(progress, -20.75508F, -90.0001F);
         } else if (elapsedSeconds < 0.875F) {
            float progress = (elapsedSeconds - 0.75F) / 0.125F;
            xRot = Mth.lerp(progress, -45.0028F, -44.9757F);
            yRot = Mth.lerp(progress, -0.0062F, 1.76143F);
            zRot = Mth.lerp(progress, -90.0001F, -88.2319F);
         } else {
            xRot = -44.9757F;
            yRot = 1.76143F;
            zRot = -88.2319F;
         }

         float yPos;
         if (elapsedSeconds < 0.5F) {
            yPos = Mth.lerp(elapsedSeconds / 0.5F, MathAnim.cosWave(ageInSeconds, 100.0F, 1.0F, 25.0F), 0.0F);
         } else {
            yPos = 0.0F;
         }

         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation("legright2joint1", (data, transforms) -> transforms.rotation(-90.0F, 0.0F, 0.0F, true))
      .addAnimation("legright2joint2", (data, transforms) -> {
         float ageInSeconds = data.ageInSeconds();
         float elapsedSeconds = data.elapsedSeconds();
         float xRot;
         float zRot;
         if (elapsedSeconds < 0.5F) {
            float progress = elapsedSeconds / 0.5F;
            xRot = Mth.lerp(progress, 50.0F + MathAnim.cosWave(ageInSeconds, 100.0F, -3.0F, 25.0F), 57.5F);
            zRot = Mth.lerp(progress, MathAnim.cosWave(ageInSeconds, 100.0F, 5.0F, 25.0F), 0.0F);
         } else if (elapsedSeconds < 0.625F) {
            xRot = 57.5F;
            zRot = 0.0F;
         } else if (elapsedSeconds < 0.75F) {
            float progress = (elapsedSeconds - 0.625F) / 0.125F;
            xRot = Mth.lerp(progress, 57.5F, 35.0F);
            zRot = 0.0F;
         } else {
            xRot = 35.0F;
            zRot = 0.0F;
         }

         transforms.rotation(-xRot, 0.0F, zRot, true);
      })
      .addAnimation("legleft1", (data, transforms) -> {
         float ageInSeconds = data.ageInSeconds();
         float elapsedSeconds = data.elapsedSeconds();
         float xRot;
         float yRot;
         float zRot;
         if (elapsedSeconds < 0.5F) {
            float progress = elapsedSeconds / 0.5F;
            xRot = Mth.lerp(progress, 24.78507F, 14.5176F);
            yRot = Mth.lerp(progress, 38.84468F, 43.076F);
            zRot = Mth.lerp(progress, 36.3602F + MathAnim.cosWave(ageInSeconds, 100.0F, 5.0F, -25.0F), 20.7551F);
         } else if (elapsedSeconds < 0.625F) {
            xRot = 14.5176F;
            yRot = 43.076F;
            zRot = 20.7551F;
         } else if (elapsedSeconds < 0.75F) {
            float progress = (elapsedSeconds - 0.625F) / 0.125F;
            xRot = Mth.lerp(progress, 14.5176F, 45.00282F);
            yRot = Mth.lerp(progress, 43.076F, -0.0062F);
            zRot = Mth.lerp(progress, 20.7551F, 90.0001F);
         } else if (elapsedSeconds < 0.875F) {
            float progress = (elapsedSeconds - 0.75F) / 0.125F;
            xRot = Mth.lerp(progress, 45.00282F, 44.97573F);
            yRot = Mth.lerp(progress, -0.0062F, 1.76143F);
            zRot = Mth.lerp(progress, 90.0001F, 88.23191F);
         } else {
            xRot = 44.97573F;
            yRot = 1.76143F;
            zRot = 88.23191F;
         }

         float yPos;
         if (elapsedSeconds < 0.5F) {
            yPos = Mth.lerp(elapsedSeconds / 0.5F, MathAnim.cosWave(ageInSeconds, 100.0F, 1.0F, -25.0F), 0.0F);
         } else {
            yPos = 0.0F;
         }

         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation("legleft1joint1", (data, transforms) -> transforms.rotation(-90.0F, 0.0F, 0.0F, true))
      .addAnimation("legleft1joint2", (data, transforms) -> {
         float ageInSeconds = data.ageInSeconds();
         float elapsedSeconds = data.elapsedSeconds();
         float xRot;
         float zRot;
         if (elapsedSeconds < 0.5F) {
            float progress = elapsedSeconds / 0.5F;
            xRot = Mth.lerp(progress, 50.0F + MathAnim.cosWave(ageInSeconds, 100.0F, -3.0F, -25.0F), 57.5F);
            zRot = Mth.lerp(progress, MathAnim.cosWave(ageInSeconds, 100.0F, 5.0F, -25.0F), 0.0F);
         } else if (elapsedSeconds < 0.625F) {
            xRot = 57.5F;
            zRot = 0.0F;
         } else if (elapsedSeconds < 0.75F) {
            float progress = (elapsedSeconds - 0.625F) / 0.125F;
            xRot = Mth.lerp(progress, 57.5F, 35.0F);
            zRot = 0.0F;
         } else {
            xRot = 35.0F;
            zRot = 0.0F;
         }

         transforms.rotation(-xRot, 0.0F, zRot, true);
      })
      .addAnimation("legleft2", (data, transforms) -> {
         float ageInSeconds = data.ageInSeconds();
         float elapsedSeconds = data.elapsedSeconds();
         float xRot;
         float yRot;
         float zRot;
         if (elapsedSeconds < 0.5F) {
            float progress = elapsedSeconds / 0.5F;
            xRot = Mth.lerp(progress, -24.7851F, -14.51761F);
            yRot = Mth.lerp(progress, -38.8447F, -43.076F);
            zRot = Mth.lerp(progress, 36.3602F + MathAnim.cosWave(ageInSeconds, 100.0F, 5.0F, 50.0F), 20.7551F);
         } else if (elapsedSeconds < 0.625F) {
            xRot = -14.51761F;
            yRot = -43.076F;
            zRot = 20.7551F;
         } else if (elapsedSeconds < 0.75F) {
            float progress = (elapsedSeconds - 0.625F) / 0.125F;
            xRot = Mth.lerp(progress, -14.51761F, -45.0028F);
            yRot = Mth.lerp(progress, -43.076F, -0.0062F);
            zRot = Mth.lerp(progress, 20.7551F, 90.0001F);
         } else if (elapsedSeconds < 0.875F) {
            float progress = (elapsedSeconds - 0.75F) / 0.125F;
            xRot = Mth.lerp(progress, -45.0028F, -44.9757F);
            yRot = Mth.lerp(progress, -0.0062F, -1.7614F);
            zRot = Mth.lerp(progress, 90.0001F, 88.2319F);
         } else {
            xRot = -44.9757F;
            yRot = -1.7614F;
            zRot = 88.2319F;
         }

         float yPos;
         if (elapsedSeconds < 0.5F) {
            yPos = Mth.lerp(elapsedSeconds / 0.5F, MathAnim.cosWave(ageInSeconds, 100.0F, 1.0F, 50.0F), 0.0F);
         } else {
            yPos = 0.0F;
         }

         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation("legleft2joint1", (data, transforms) -> transforms.rotation(-90.0F, 0.0F, 0.0F, true))
      .addAnimation("legleft2joint2", (data, transforms) -> {
         float ageInSeconds = data.ageInSeconds();
         float elapsedSeconds = data.elapsedSeconds();
         float xRot;
         float zRot;
         if (elapsedSeconds < 0.5F) {
            float progress = elapsedSeconds / 0.5F;
            xRot = Mth.lerp(progress, 50.0F + MathAnim.cosWave(ageInSeconds, 100.0F, -3.0F, 50.0F), 57.5F);
            zRot = Mth.lerp(progress, MathAnim.cosWave(ageInSeconds, 100.0F, -5.0F, 50.0F), 0.0F);
         } else if (elapsedSeconds < 0.625F) {
            xRot = 57.5F;
            zRot = 0.0F;
         } else if (elapsedSeconds < 0.75F) {
            float progress = (elapsedSeconds - 0.625F) / 0.125F;
            xRot = Mth.lerp(progress, 57.5F, 35.0F);
            zRot = 0.0F;
         } else {
            xRot = 35.0F;
            zRot = 0.0F;
         }

         transforms.rotation(-xRot, 0.0F, zRot, true);
      })
      .build();
}
