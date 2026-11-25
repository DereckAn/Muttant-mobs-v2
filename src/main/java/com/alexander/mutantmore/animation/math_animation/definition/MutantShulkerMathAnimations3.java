package com.alexander.mutantmore.animation.math_animation.definition;

import com.alexander.mutantmore.animation.math_animation.MathAnim;
import com.alexander.mutantmore.animation.math_animation.MathAnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.util.Mth;

public class MutantShulkerMathAnimations3 {
   public static final MathAnimationDefinition DEATH = MathAnimationDefinition.Builder.withLength(5.9583F)
      .addAnimation(
         "everything",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation("box", (data, transforms) -> {
         float baseRotXWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.5F, 125.0F);
         float baseRotYWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 100.0F);
         float baseRotZWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 75.0F);
         float xRot;
         if (data.elapsedSeconds() < 0.1667F) {
            float progress = data.elapsedSeconds() / 0.1667F;
            xRot = Mth.lerp(progress, 2.5F + baseRotXWave, 12.5F + baseRotXWave);
         } else if (data.elapsedSeconds() < 0.25F) {
            float progress = (data.elapsedSeconds() - 0.1667F) / 0.083299994F;
            xRot = Mth.lerp(progress, 12.5F + baseRotXWave, 10.0F + baseRotXWave);
         } else if (data.elapsedSeconds() < 0.5F) {
            xRot = 10.0F + baseRotXWave;
         } else if (data.elapsedSeconds() < 5.0F) {
            float progress = (data.elapsedSeconds() - 0.5F) / 4.5F;
            xRot = Mth.lerp(progress, 10.0F + baseRotXWave, 0.0F);
         } else if (data.elapsedSeconds() <= 5.9583F) {
            xRot = 0.0F;
         } else {
            xRot = 0.0F;
         }

         float yRot;
         if (data.elapsedSeconds() < 0.5F) {
            yRot = baseRotYWave;
         } else if (data.elapsedSeconds() <= 5.0F) {
            float progress = (data.elapsedSeconds() - 0.5F) / 5.0F;
            yRot = Mth.lerp(progress, baseRotYWave, 1800.0F);
         } else {
            yRot = 1800.0F;
         }

         float zRot;
         if (data.elapsedSeconds() < 5.0F) {
            zRot = baseRotZWave;
         } else if (data.elapsedSeconds() <= 5.9583F) {
            float progress = (data.elapsedSeconds() - 5.0F) / 0.9583001F;
            zRot = Mth.lerp(progress, baseRotZWave, 0.0F);
         } else {
            zRot = 0.0F;
         }

         float basePosYWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 0.0F);
         float yPos;
         if (data.elapsedSeconds() < 0.5F) {
            float progress = data.elapsedSeconds() / 0.5F;
            yPos = Mth.lerp(progress, basePosYWave, 0.64F);
         } else if (data.elapsedSeconds() < 5.0F) {
            float progress = (data.elapsedSeconds() - 0.5F) / 4.5F;
            yPos = Mth.lerp(progress, 0.64F, -4.0F + basePosYWave);
         } else if (data.elapsedSeconds() < 5.375F) {
            yPos = -4.0F + basePosYWave;
         } else if (data.elapsedSeconds() < 5.5F) {
            float progress = (data.elapsedSeconds() - 5.375F) / 0.125F;
            yPos = Mth.lerp(progress, -4.0F + basePosYWave, -6.0F);
         } else if (data.elapsedSeconds() < 5.6667F) {
            float progress = (data.elapsedSeconds() - 5.5F) / 0.16669989F;
            yPos = Mth.lerp(progress, -6.0F, -2.0F);
         } else if (data.elapsedSeconds() < 5.7917F) {
            float progress = (data.elapsedSeconds() - 5.6667F) / 0.125F;
            yPos = Mth.lerp(progress, -2.0F, -8.5F);
         } else if (data.elapsedSeconds() < 5.8333F) {
            float progress = (data.elapsedSeconds() - 5.7917F) / 0.041600227F;
            yPos = Mth.lerp(progress, -8.5F, -8.0F);
         } else {
            yPos = -8.0F;
         }

         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation("head", (data, transforms) -> {
         float baseRotXWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 75.0F);
         float baseRotYWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, -2.5F, 125.0F);
         float baseRotZWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 25.0F);
         float xRot;
         if (data.elapsedSeconds() < 0.2083F) {
            float progress = data.elapsedSeconds() / 0.2083F;
            xRot = Mth.lerp(progress, baseRotXWave, -45.0F + baseRotXWave);
         } else if (data.elapsedSeconds() < 0.2917F) {
            float progress = (data.elapsedSeconds() - 0.2083F) / 0.08340001F;
            xRot = Mth.lerp(progress, -45.0F + baseRotXWave, -40.0F + baseRotXWave);
         } else {
            xRot = -40.0F + baseRotXWave;
         }

         float yRot;
         if (data.elapsedSeconds() < 0.5F) {
            yRot = baseRotYWave;
         } else if (data.elapsedSeconds() <= 5.0F) {
            float progress = (data.elapsedSeconds() - 0.5F) / 5.0F;
            yRot = Mth.lerp(progress, baseRotYWave, -1800.0F);
         } else {
            yRot = -1800.0F;
         }

         float zRot;
         if (data.elapsedSeconds() < 5.0F) {
            zRot = baseRotZWave;
         } else if (data.elapsedSeconds() <= 5.9583F) {
            float progress = (data.elapsedSeconds() - 5.0F) / 0.9583001F;
            zRot = Mth.lerp(progress, baseRotZWave, 0.0F);
         } else {
            zRot = 0.0F;
         }

         float basePosYWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F);
         float yPos;
         if (data.elapsedSeconds() < 0.2083F) {
            float progress = data.elapsedSeconds() / 0.2083F;
            yPos = Mth.lerp(progress, -1.5F + basePosYWave, -0.5F + basePosYWave);
         } else if (data.elapsedSeconds() < 0.5F) {
            yPos = -0.5F + basePosYWave;
         } else if (data.elapsedSeconds() < 5.0F) {
            float progress = (data.elapsedSeconds() - 0.5F) / 4.5F;
            yPos = Mth.lerp(progress, -0.5F + basePosYWave, 10.5F + basePosYWave);
         } else {
            yPos = 10.5F + basePosYWave;
         }

         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation(
         "head",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(5.5F, KeyframeAnimations.scaleVec(0.75, 0.75, 0.75), Interpolations.LINEAR),
               new Keyframe(5.625F, KeyframeAnimations.scaleVec(1.5, 1.5, 1.5), Interpolations.LINEAR),
               new Keyframe(5.6667F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("uppershell", (data, transforms) -> {
         float baseRotXWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.5F, 50.0F);
         float xRot;
         if (data.elapsedSeconds() < 0.1667F) {
            float progress = data.elapsedSeconds() / 0.1667F;
            xRot = Mth.lerp(progress, baseRotXWave, -40.0F + baseRotXWave);
         } else if (data.elapsedSeconds() < 0.25F) {
            float progress = (data.elapsedSeconds() - 0.1667F) / 0.083299994F;
            xRot = Mth.lerp(progress, -40.0F + baseRotXWave, -35.0F + baseRotXWave);
         } else if (data.elapsedSeconds() < 0.5F) {
            xRot = -35.0F + baseRotXWave;
         } else if (data.elapsedSeconds() < 5.0F) {
            float progress = (data.elapsedSeconds() - 0.5F) / 4.5F;
            xRot = Mth.lerp(progress, -35.0F + baseRotXWave, 0.0F);
         } else if (data.elapsedSeconds() <= 5.9583F) {
            xRot = 0.0F;
         } else {
            xRot = 0.0F;
         }

         float yRot;
         if (data.elapsedSeconds() < 0.5F) {
            yRot = 0.0F;
         } else if (data.elapsedSeconds() <= 5.0F) {
            float progress = (data.elapsedSeconds() - 0.5F) / 5.0F;
            yRot = Mth.lerp(progress, 0.0F, -3600.0F);
         } else {
            yRot = -3600.0F;
         }

         float basePosYWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, -50.0F);
         float yPos;
         if (data.elapsedSeconds() < 0.1667F) {
            float progress = data.elapsedSeconds() / 0.1667F;
            yPos = Mth.lerp(progress, -5.0F + basePosYWave, -0.55F);
         } else if (data.elapsedSeconds() < 0.25F) {
            float progress = (data.elapsedSeconds() - 0.1667F) / 0.083299994F;
            yPos = Mth.lerp(progress, -0.55F, -1.55F);
         } else if (data.elapsedSeconds() < 0.5F) {
            yPos = -1.55F;
         } else if (data.elapsedSeconds() < 5.0F) {
            float progress = (data.elapsedSeconds() - 0.5F) / 4.5F;
            yPos = Mth.lerp(progress, -1.55F, 20.45F);
         } else if (data.elapsedSeconds() < 5.75F) {
            yPos = 20.45F;
         } else if (data.elapsedSeconds() < 5.9167F) {
            float progress = (data.elapsedSeconds() - 5.75F) / 0.16669989F;
            yPos = Mth.lerp(progress, 20.45F, -10.25F);
         } else if (data.elapsedSeconds() < 5.9583F) {
            float progress = (data.elapsedSeconds() - 5.9167F) / 0.041600227F;
            yPos = Mth.lerp(progress, -10.25F, -9.25F);
         } else {
            yPos = -9.25F;
         }

         float zPos;
         if (data.elapsedSeconds() < 0.1667F) {
            float progress = data.elapsedSeconds() / 0.1667F;
            zPos = Mth.lerp(progress, 0.0F, 3.0F);
         } else if (data.elapsedSeconds() < 0.25F) {
            zPos = 3.0F;
         } else if (data.elapsedSeconds() < 0.5F) {
            zPos = 3.0F;
         } else if (data.elapsedSeconds() < 5.0F) {
            float progress = (data.elapsedSeconds() - 0.5F) / 4.5F;
            zPos = Mth.lerp(progress, 3.0F, 0.0F);
         } else {
            zPos = 0.0F;
         }

         transforms.position(0.0F, yPos, zPos);
         transforms.rotation(-xRot, -yRot, 0.0F, true);
      })
      .addAnimation(
         "legright1Rotator",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(5.5F, KeyframeAnimations.scaleVec(0.75, 0.75, 0.75), Interpolations.LINEAR),
               new Keyframe(5.625F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(5.6667F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("legright1", (data, transforms) -> {
         float yPos = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 0.0F);
         float zRotWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, 0.0F);
         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-24.7851F, 38.8447F, -36.3602F + zRotWave, true);
      })
      .addAnimation(
         "legright1joint1",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation("legright1joint2", (data, transforms) -> {
         float baseWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 0.0F);
         transforms.rotation(-(50.0F + baseWave * -3.0F), 0.0F, baseWave * -5.0F, true);
      })
      .addAnimation(
         "legright2Rotator",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(5.5F, KeyframeAnimations.scaleVec(0.75, 0.75, 0.75), Interpolations.LINEAR),
               new Keyframe(5.625F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(5.6667F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("legright2", (data, transforms) -> {
         float yPos = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 25.0F);
         float zRotWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, -5.0F, 25.0F);
         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(24.7851F, -38.8447F, -36.3602F + zRotWave, true);
      })
      .addAnimation(
         "legright2joint1",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation("legright2joint2", (data, transforms) -> {
         float baseWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 25.0F);
         transforms.rotation(-(50.0F + baseWave * -3.0F), 0.0F, baseWave * 5.0F, true);
      })
      .addAnimation(
         "legleft1Rotator",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(5.5F, KeyframeAnimations.scaleVec(0.75, 0.75, 0.75), Interpolations.LINEAR),
               new Keyframe(5.625F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(5.6667F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("legleft1", (data, transforms) -> {
         float yPos = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, -25.0F);
         float zRotWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, -25.0F);
         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-24.78507F, -38.84468F, 36.3602F + zRotWave, true);
      })
      .addAnimation(
         "legleft1joint1",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 90.0F), Interpolations.LINEAR)})
      )
      .addAnimation("legleft1joint2", (data, transforms) -> {
         float baseWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, -25.0F);
         transforms.rotation(-(50.0F + baseWave * -3.0F), 0.0F, baseWave * 5.0F, true);
      })
      .addAnimation(
         "legleft2Rotator",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(5.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(5.5F, KeyframeAnimations.scaleVec(0.75, 0.75, 0.75), Interpolations.LINEAR),
               new Keyframe(5.625F, KeyframeAnimations.scaleVec(1.25, 1.25, 1.25), Interpolations.LINEAR),
               new Keyframe(5.6667F, KeyframeAnimations.scaleVec(0.0, 0.0, 0.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("legleft2", (data, transforms) -> {
         float yPos = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 50.0F);
         float zRotWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 5.0F, 50.0F);
         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(24.7851F, 38.8447F, 36.3602F + zRotWave, true);
      })
      .addAnimation(
         "legleft2joint1",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation("legleft2joint2", (data, transforms) -> {
         float baseWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 50.0F);
         transforms.rotation(-(50.0F + baseWave * -3.0F), 0.0F, baseWave * -5.0F, true);
      })
      .addAnimation(
         "tendons",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5417F, KeyframeAnimations.degreeVec(1.05F, -769.56F, 0.0F), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.degreeVec(0.0F, -1800.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tendons",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(2.5417F, KeyframeAnimations.scaleVec(0.75, 1.6F, 0.75), Interpolations.LINEAR),
               new Keyframe(5.0F, KeyframeAnimations.scaleVec(1.0, 2.2F, 1.0), Interpolations.LINEAR),
               new Keyframe(5.6667F, KeyframeAnimations.scaleVec(1.0, 2.2F, 1.0), Interpolations.LINEAR),
               new Keyframe(5.9583F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final MathAnimationDefinition IDLE_IN_SHELL = MathAnimationDefinition.Builder.withLength(0.0F)
      .addAnimation(
         "head",
         (data, transforms) -> {
            transforms.position(0.0F, -1.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F), 0.0F);
            transforms.rotation(
               -MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 75.0F),
               -MathAnim.cosWave(data.ageInSeconds(), 100.0F, -2.5F, 125.0F),
               MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 25.0F),
               true
            );
         }
      )
      .addAnimation("uppershell", (data, transforms) -> transforms.position(0.0F, -9.25F, 0.0F))
      .addAnimation("shoulderleft3", (data, transforms) -> transforms.position(1.0F, -1.0F, -1.0F))
      .addAnimation("shoulderright2", (data, transforms) -> transforms.position(-1.0F, -1.0F, 1.0F))
      .addAnimation("shoulderright3", (data, transforms) -> transforms.position(-1.0F, -1.0F, -1.0F))
      .addAnimation("shoulderleft2", (data, transforms) -> transforms.position(1.0F, -1.0F, 1.0F))
      .addAnimation("shoulderleft4", (data, transforms) -> transforms.position(1.0F, 1.0F, -1.0F))
      .addAnimation("shoulderright4", (data, transforms) -> transforms.position(-1.0F, 1.0F, 1.0F))
      .addAnimation("shoulderright5", (data, transforms) -> transforms.position(-1.0F, 1.0F, -1.0F))
      .addAnimation("shoulderleft5", (data, transforms) -> transforms.position(1.0F, 1.0F, 1.0F))
      .addAnimation("legright1Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .addAnimation("legright2Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .addAnimation("legleft1Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .addAnimation("legleft2Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .build();
   public static final MathAnimationDefinition IDLE_RARE_IN_SHELL = MathAnimationDefinition.Builder.withLength(2.5F)
      .dontApplyScaleToKeyframes()
      .addAnimation(
         "box",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 2.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.posVec(0.0F, -0.25F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "head",
         (data, transforms) -> {
            float basePosY = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F);
            float yPos;
            if (data.elapsedSeconds() < 0.5F) {
               yPos = basePosY + Mth.lerp(data.elapsedSeconds() / 0.5F, -1.5F, 0.5F);
            } else if (data.elapsedSeconds() < 0.75F) {
               yPos = basePosY + Mth.lerp((data.elapsedSeconds() - 0.5F) / 0.25F, 0.5F, 0.25F);
            } else if (data.elapsedSeconds() < 1.75F) {
               yPos = basePosY + 0.25F;
            } else if (data.elapsedSeconds() < 2.0F) {
               yPos = basePosY + Mth.lerp((data.elapsedSeconds() - 1.75F) / 0.25F, 0.25F, 0.5F);
            } else if (data.elapsedSeconds() < 2.5F) {
               yPos = basePosY + Mth.lerp((data.elapsedSeconds() - 2.0F) / 0.5F, 0.5F, -1.5F);
            } else {
               yPos = basePosY - 1.5F;
            }

            transforms.position(0.0F, yPos, 0.0F);
            transforms.rotation(
               -MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 75.0F),
               -MathAnim.cosWave(data.ageInSeconds(), 100.0F, -2.5F, 125.0F),
               MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 25.0F),
               true
            );
         }
      )
      .addAnimation("uppershell", (data, transforms) -> {
         float xRot;
         if (data.elapsedSeconds() < 0.0833F) {
            xRot = Mth.lerp(data.elapsedSeconds() / 0.0833F, 0.0F, 3.16F);
         } else if (data.elapsedSeconds() < 0.5F) {
            xRot = Mth.lerp((data.elapsedSeconds() - 0.0833F) / 0.4167F, 3.16F, -27.5F);
         } else if (data.elapsedSeconds() < 0.625F) {
            xRot = Mth.lerp((data.elapsedSeconds() - 0.5F) / 0.125F, -27.5F, -25.0F + MathAnim.cosWave(data.ageInSeconds(), 175.0F, -2.5F, -25.0F));
         } else if (data.elapsedSeconds() < 1.75F) {
            xRot = -25.0F + MathAnim.cosWave(data.ageInSeconds(), 175.0F, -2.5F, -25.0F);
         } else if (data.elapsedSeconds() < 1.875F) {
            xRot = Mth.lerp((data.elapsedSeconds() - 1.75F) / 0.125F, -25.0F + MathAnim.cosWave(data.ageInSeconds(), 175.0F, -2.5F, -25.0F), -27.5F);
         } else if (data.elapsedSeconds() < 2.3333F) {
            xRot = Mth.lerp((data.elapsedSeconds() - 1.875F) / 0.4583001F, -27.5F, 3.16F);
         } else if (data.elapsedSeconds() < 2.4167F) {
            xRot = Mth.lerp((data.elapsedSeconds() - 2.3333F) / 0.08339977F, 3.16F, 0.0F);
         } else {
            xRot = 0.0F;
         }

         transforms.rotation(-xRot, 0.0F, 0.0F, true);
      })
      .addAnimation(
         "uppershell",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -9.25F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.0833F, KeyframeAnimations.posVec(0.0F, -9.25F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -4.25F, 2.0F), Interpolations.LINEAR),
               new Keyframe(0.5833F, KeyframeAnimations.posVec(0.0F, -4.25F, 1.8F), Interpolations.LINEAR),
               new Keyframe(1.7917F, KeyframeAnimations.posVec(0.0F, -4.25F, 1.8F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, -4.25F, 2.0F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.posVec(0.0F, -9.25F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.posVec(0.0F, -9.25F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderleft3",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, -1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.posVec(-1.0F, -1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderright2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, -1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.posVec(1.0F, -1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderright3",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, -1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.posVec(1.0F, -1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderleft2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, -1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.posVec(-1.0F, -1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderleft4",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, 1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.posVec(-1.0F, 1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderright4",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.posVec(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderright5",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, 1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.posVec(1.0F, 1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderleft5",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.posVec(-1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tendons",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tendons",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("legright1Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .addAnimation("legright2Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .addAnimation("legleft1Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .addAnimation("legleft2Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .build();
   public static final MathAnimationDefinition SHOOT_IN_SHELL = MathAnimationDefinition.Builder.withLength(2.375F)
      .addAnimation(
         "box",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 2.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2083F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, -0.25F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "box",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(1.2917F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.scaleVec(1.01F, 1.01F, 1.01F), Interpolations.LINEAR),
               new Keyframe(1.4583F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("head", (data, transforms) -> {
         float basePosWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F);
         float yPos;
         if (data.elapsedSeconds() < 0.375F) {
            yPos = -1.5F + basePosWave;
         } else if (data.elapsedSeconds() < 0.875F) {
            yPos = Mth.lerp((data.elapsedSeconds() - 0.375F) / 0.5F, -1.5F, 3.5F) + basePosWave;
         } else if (data.elapsedSeconds() < 1.25F) {
            yPos = Mth.lerp((data.elapsedSeconds() - 0.875F) / 0.375F, 3.5F, 2.5F) + basePosWave;
         } else if (data.elapsedSeconds() < 1.75F) {
            yPos = 2.5F + basePosWave;
         } else if (data.elapsedSeconds() < 1.9167F) {
            yPos = Mth.lerp((data.elapsedSeconds() - 1.75F) / 0.1667F, 2.5F, 3.5F) + basePosWave;
         } else if (data.elapsedSeconds() < 2.1667F) {
            yPos = 3.5F + basePosWave;
         } else if (data.elapsedSeconds() < 2.3333F) {
            yPos = Mth.lerp((data.elapsedSeconds() - 2.1667F) / 0.16660023F, 3.5F, -1.5F) + basePosWave;
         } else {
            yPos = -1.5F + basePosWave;
         }

         float baseRotX = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 75.0F);
         float baseRotY = MathAnim.cosWave(data.ageInSeconds(), 100.0F, -2.5F, 125.0F);
         float baseRotZ = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 25.0F);
         float xRot;
         float yRot;
         float zRot;
         if (data.elapsedSeconds() < 0.125F) {
            xRot = 0.0F;
            yRot = 0.0F;
            zRot = 0.0F;
         } else if (data.elapsedSeconds() < 0.375F) {
            float fade = 1.0F - (data.elapsedSeconds() - 0.125F) / 0.25F;
            xRot = baseRotX * fade;
            yRot = baseRotY * fade;
            zRot = baseRotZ * fade;
         } else if (data.elapsedSeconds() < 2.1667F) {
            xRot = 0.0F;
            yRot = 0.0F;
            zRot = 0.0F;
         } else if (data.elapsedSeconds() < 2.3333F) {
            float fade = (data.elapsedSeconds() - 2.1667F) / 0.16660023F;
            xRot = baseRotX * fade;
            yRot = baseRotY * fade;
            zRot = baseRotZ * fade;
         } else {
            xRot = baseRotX;
            yRot = baseRotY;
            zRot = baseRotZ;
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
               new Keyframe(1.5F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "uppershell",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.2083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, (float) (Math.PI * 2), 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, (float) (Math.PI * 2), 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "uppershell",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -9.25F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.2083F, KeyframeAnimations.posVec(0.0F, -10.75F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 6.7F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, 6.7F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, -10.75F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.posVec(0.0F, -9.25F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderleft3",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, -1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(-1.0F, -1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderright2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, -1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(1.0F, -1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderright3",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, -1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(1.0F, -1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderleft2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, -1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(-1.0F, -1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderleft4",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, 1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(-1.0F, 1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderright4",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderright5",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, 1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(1.0F, 1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderleft5",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(-1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tendons",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.2083F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, (float) (Math.PI * 2), 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, (float) (Math.PI * 2), 0.0F), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "tendons",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.2083F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.5417F, KeyframeAnimations.scaleVec(0.75, 1.25, 0.75), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.scaleVec(1.0, 1.5, 1.0), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.scaleVec(1.0, 1.5, 1.0), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.scaleVec(0.75, 1.25, 0.75), Interpolations.LINEAR),
               new Keyframe(2.25F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("legright1Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .addAnimation("legright2Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .addAnimation("legleft1Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .addAnimation("legleft2Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .build();
   public static final MathAnimationDefinition ANVIL_CRUSH = MathAnimationDefinition.Builder.withLength(2.1667F)
      .addAnimation(
         "box",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 2.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 2.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, 2.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("head", (data, transforms) -> {
         float baseHeadBob = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F);
         float animTime = data.elapsedSeconds();
         float yPos;
         if (animTime < 0.3333F) {
            yPos = Mth.lerp(animTime / 0.3333F, -1.5F + baseHeadBob, -1.44F);
         } else if (animTime < 0.6667F) {
            yPos = Mth.lerp((animTime - 0.3333F) / 0.3334F, -1.44F, baseHeadBob);
         } else if (animTime < 0.75F) {
            yPos = Mth.lerp((animTime - 0.6667F) / 0.083299994F, baseHeadBob, -0.25F + baseHeadBob);
         } else if (animTime < 0.9583F) {
            yPos = -0.25F + baseHeadBob;
         } else if (animTime < 1.4167F) {
            yPos = Mth.lerp((animTime - 0.9583F) / 0.4584F, -0.25F + baseHeadBob, 2.25F + baseHeadBob);
         } else if (animTime < 1.9167F) {
            yPos = 2.25F + baseHeadBob;
         } else if (animTime < 2.1667F) {
            yPos = Mth.lerp((animTime - 1.9167F) / 0.24999988F, 2.25F + baseHeadBob, -1.5F + baseHeadBob);
         } else {
            yPos = -1.5F + baseHeadBob;
         }

         float xRot = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 75.0F);
         float yRot = MathAnim.cosWave(data.ageInSeconds(), 100.0F, -2.5F, 125.0F);
         float zRot = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 25.0F);
         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation(
         "uppershell",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -9.25F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -9.25F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.3333F, KeyframeAnimations.posVec(0.0F, -10.25F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, -1.25F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.7083F, KeyframeAnimations.posVec(0.0F, -2.25F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.0417F, KeyframeAnimations.posVec(0.0F, -2.25F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.5417F, KeyframeAnimations.posVec(0.0F, 0.75F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.9167F, KeyframeAnimations.posVec(0.0F, 0.75F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0417F, KeyframeAnimations.posVec(0.0F, -10.25F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.1667F, KeyframeAnimations.posVec(0.0F, -9.25F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderleft3",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, -1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(-1.0F, -1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderright2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, -1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(1.0F, -1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderright3",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, -1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(1.0F, -1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderleft2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, -1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(-1.0F, -1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderleft4",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, 1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(-1.0F, 1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderright4",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderright5",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, 1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(1.0F, 1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderleft5",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.0F, KeyframeAnimations.posVec(-1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("legright1Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .addAnimation("legright2Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .addAnimation("legleft1Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .addAnimation("legleft2Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .build();
   public static final MathAnimationDefinition SUMMON_TRAPS = MathAnimationDefinition.Builder.withLength(2.5F)
      .addAnimation("everything", (data, transforms) -> transforms.position(0.0F, 9.0F, 0.0F))
      .addAnimation("box", (data, transforms) -> {
         float age = data.ageInSeconds();
         float yPos = MathAnim.cosWave(age, 100.0F, 1.0F, 0.0F);
         float xRot = 2.5F + MathAnim.cosWave(age, 100.0F, 1.5F, 125.0F);
         float yRot = MathAnim.cosWave(age, 100.0F, 1.0F, 100.0F);
         float zRot = MathAnim.cosWave(age, 100.0F, 1.0F, 75.0F);
         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation("head", (data, transforms) -> {
         float age = data.ageInSeconds();
         float time = data.elapsedSeconds();
         float baseRotX = MathAnim.cosWave(age, 100.0F, 2.5F, 75.0F);
         float baseRotY = MathAnim.cosWave(age, 100.0F, -2.5F, 125.0F);
         float baseRotZ = MathAnim.cosWave(age, 100.0F, 2.5F, 25.0F);
         float basePosY = -1.5F + MathAnim.cosWave(age, 100.0F, 0.5F, 50.0F);
         float raisedPosY = 0.5F + MathAnim.cosWave(age, 100.0F, 0.5F, 50.0F);
         float xRot;
         float yRot;
         float zRot;
         if (time < 0.7917F) {
            float progress = time / 0.7917F;
            xRot = Mth.lerp(progress, baseRotX, -2.25F);
            yRot = Mth.lerp(progress, baseRotY, 2.28F);
            zRot = Mth.lerp(progress, baseRotZ, -0.61F);
         } else if (time < 1.625F) {
            float progress = (time - 0.7917F) / 0.8333F;
            float spinYaw = baseRotY - 360.0F;
            xRot = Mth.lerp(progress, -2.25F, baseRotX);
            yRot = Mth.lerp(progress, 2.28F, spinYaw);
            zRot = Mth.lerp(progress, -0.61F, baseRotZ);
         } else if (time < 2.5F) {
            float progress = (time - 1.625F) / 0.875F;
            float spinYaw = baseRotY - 360.0F;
            xRot = baseRotX;
            yRot = Mth.lerp(progress, spinYaw, baseRotY);
            zRot = baseRotZ;
         } else {
            xRot = baseRotX;
            yRot = baseRotY;
            zRot = baseRotZ;
         }

         float yPos;
         float zPos;
         if (time < 0.7917F) {
            yPos = basePosY;
            zPos = 0.0F;
         } else if (time < 1.5F) {
            float progress = (time - 0.7917F) / 0.7083F;
            yPos = Mth.lerp(progress, basePosY, raisedPosY);
            zPos = Mth.lerp(progress, 0.0F, -5.0F);
         } else if (time < 2.5F) {
            float progress = time - 1.5F;
            yPos = Mth.lerp(progress, raisedPosY, basePosY);
            zPos = Mth.lerp(progress, -5.0F, 0.0F);
         } else {
            yPos = basePosY;
            zPos = 0.0F;
         }

         transforms.position(0.0F, yPos, zPos);
         transforms.rotation(-xRot, -yRot, zRot, true);
      })
      .addAnimation("uppershell", (data, transforms) -> {
         float age = data.ageInSeconds();
         float time = data.elapsedSeconds();
         float baseRotX = MathAnim.cosWave(age, 100.0F, 1.5F, 50.0F);
         float xRot;
         float yRot;
         if (time < 0.7917F) {
            float progress = time / 0.7917F;
            xRot = Mth.lerp(progress, baseRotX, -0.95F);
            yRot = 0.0F;
         } else if (time < 1.5F) {
            float progress = (time - 0.7917F) / 0.7083F;
            float loweredRotX = -22.5F + baseRotX;
            xRot = Mth.lerp(progress, -0.95F, loweredRotX);
            yRot = Mth.lerp(progress, 0.0F, 360.0F);
         } else if (time < 1.625F) {
            xRot = -22.5F + baseRotX;
            yRot = 360.0F;
         } else if (time < 2.5F) {
            float progress = (time - 1.625F) / 0.875F;
            xRot = Mth.lerp(progress, -22.5F + baseRotX, baseRotX);
            yRot = Mth.lerp(progress, 360.0F, 0.0F);
         } else {
            xRot = baseRotX;
            yRot = 0.0F;
         }

         float basePosY = -5.0F + MathAnim.cosWave(age, 100.0F, 0.5F, -50.0F);
         float yPos;
         if (time < 0.5F) {
            float progress = time / 0.5F;
            yPos = Mth.lerp(progress, basePosY, -9.3F);
         } else if (time < 0.7917F) {
            yPos = -9.3F;
         } else if (time < 0.9167F) {
            float progress = (time - 0.7917F) / 0.125F;
            yPos = Mth.lerp(progress, -9.3F, -11.45F);
         } else if (time < 1.25F) {
            float progress = (time - 0.9167F) / 0.3333F;
            yPos = Mth.lerp(progress, -11.45F, -3.3F);
         } else if (time < 1.625F) {
            yPos = -3.3F;
         } else if (time < 2.5F) {
            float progress = (time - 1.625F) / 0.875F;
            yPos = Mth.lerp(progress, -3.3F, basePosY);
         } else {
            yPos = basePosY;
         }

         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-xRot, -yRot, 0.0F, true);
      })
      .addAnimation("shoulderleft3", (data, transforms) -> {
         float age = data.ageInSeconds();
         float time = data.elapsedSeconds();
         float baseScale = 1.0F + MathAnim.cosWave(age, 1000.0F, 0.1F, 50.0F);
         float scale;
         if (time < 1.625F) {
            scale = baseScale;
         } else if (time < 2.5F) {
            float progress = (time - 1.625F) / 0.875F;
            scale = Mth.lerp(progress, baseScale, 1.0F);
         } else {
            scale = 1.0F;
         }

         transforms.uniformScale(scale);
      })
      .addAnimation("shoulderright2", (data, transforms) -> {
         float age = data.ageInSeconds();
         float time = data.elapsedSeconds();
         float baseScale = 1.0F + MathAnim.cosWave(age, 1000.0F, 0.1F, 0.0F);
         float scale;
         if (time < 1.625F) {
            scale = baseScale;
         } else if (time < 2.5F) {
            float progress = (time - 1.625F) / 0.875F;
            scale = Mth.lerp(progress, baseScale, 1.0F);
         } else {
            scale = 1.0F;
         }

         transforms.uniformScale(scale);
      })
      .addAnimation("shoulderright3", (data, transforms) -> {
         float age = data.ageInSeconds();
         float time = data.elapsedSeconds();
         float baseScale = 1.0F + MathAnim.cosWave(age, 1000.0F, 0.1F, 25.0F);
         float scale;
         if (time < 1.625F) {
            scale = baseScale;
         } else if (time < 2.5F) {
            float progress = (time - 1.625F) / 0.875F;
            scale = Mth.lerp(progress, baseScale, 1.0F);
         } else {
            scale = 1.0F;
         }

         transforms.uniformScale(scale);
      })
      .addAnimation("shoulderleft2", (data, transforms) -> {
         float age = data.ageInSeconds();
         float time = data.elapsedSeconds();
         float baseScale = 1.0F + MathAnim.cosWave(age, 1000.0F, 0.1F, 75.0F);
         float scale;
         if (time < 1.625F) {
            scale = baseScale;
         } else if (time < 2.5F) {
            float progress = (time - 1.625F) / 0.875F;
            scale = Mth.lerp(progress, baseScale, 1.0F);
         } else {
            scale = 1.0F;
         }

         transforms.uniformScale(scale);
      })
      .addAnimation(
         "tendons",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.7917F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(1.0833F, KeyframeAnimations.scaleVec(0.5, 1.0, 0.5), Interpolations.LINEAR),
               new Keyframe(1.375F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(1.625F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(2.0833F, KeyframeAnimations.scaleVec(0.5, 1.0, 0.5), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("legright1", (data, transforms) -> {
         float age = data.ageInSeconds();
         float yPos = MathAnim.cosWave(age, 100.0F, 1.0F, 0.0F);
         float zRot = -36.3602F + MathAnim.cosWave(age, 100.0F, -5.0F, 0.0F);
         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-24.7851F, 38.8447F, zRot, true);
      })
      .addAnimation("legright1joint1", (data, transforms) -> transforms.rotation(-90.0F, 0.0F, 0.0F, true))
      .addAnimation("legright1joint2", (data, transforms) -> {
         float age = data.ageInSeconds();
         float xRot = 50.0F + MathAnim.cosWave(age, 100.0F, -3.0F, 0.0F);
         float zRot = MathAnim.cosWave(age, 100.0F, -5.0F, 0.0F);
         transforms.rotation(-xRot, 0.0F, zRot, true);
      })
      .addAnimation("legright2", (data, transforms) -> {
         float age = data.ageInSeconds();
         float yPos = MathAnim.cosWave(age, 100.0F, 1.0F, 25.0F);
         float zRot = -36.3602F + MathAnim.cosWave(age, 100.0F, -5.0F, 25.0F);
         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(24.7851F, -38.8447F, zRot, true);
      })
      .addAnimation("legright2joint1", (data, transforms) -> transforms.rotation(-90.0F, 0.0F, 0.0F, true))
      .addAnimation("legright2joint2", (data, transforms) -> {
         float age = data.ageInSeconds();
         float xRot = 50.0F + MathAnim.cosWave(age, 100.0F, -3.0F, 25.0F);
         float zRot = MathAnim.cosWave(age, 100.0F, 5.0F, 25.0F);
         transforms.rotation(-xRot, 0.0F, zRot, true);
      })
      .addAnimation("legleft1", (data, transforms) -> {
         float age = data.ageInSeconds();
         float yPos = MathAnim.cosWave(age, 100.0F, 1.0F, -25.0F);
         float zRot = 36.3602F + MathAnim.cosWave(age, 100.0F, 5.0F, -25.0F);
         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(-24.78507F, -38.84468F, zRot, true);
      })
      .addAnimation("legleft1joint1", (data, transforms) -> transforms.rotation(0.0F, 0.0F, 90.0F, true))
      .addAnimation("legleft1joint2", (data, transforms) -> {
         float age = data.ageInSeconds();
         float xRot = 50.0F + MathAnim.cosWave(age, 100.0F, -3.0F, -25.0F);
         float zRot = MathAnim.cosWave(age, 100.0F, 5.0F, -25.0F);
         transforms.rotation(-xRot, 0.0F, zRot, true);
      })
      .addAnimation("legleft2", (data, transforms) -> {
         float age = data.ageInSeconds();
         float yPos = MathAnim.cosWave(age, 100.0F, 1.0F, 50.0F);
         float zRot = 36.3602F + MathAnim.cosWave(age, 100.0F, 5.0F, 50.0F);
         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(24.7851F, 38.8447F, zRot, true);
      })
      .addAnimation("legleft2joint1", (data, transforms) -> transforms.rotation(-90.0F, 0.0F, 0.0F, true))
      .addAnimation("legleft2joint2", (data, transforms) -> {
         float age = data.ageInSeconds();
         float xRot = 50.0F + MathAnim.cosWave(age, 100.0F, -3.0F, 50.0F);
         float zRot = MathAnim.cosWave(age, 100.0F, -5.0F, 50.0F);
         transforms.rotation(-xRot, 0.0F, zRot, true);
      })
      .build();
   public static final MathAnimationDefinition SUMMON_TRAPS_IN_SHELL = MathAnimationDefinition.Builder.withLength(2.5F)
      .addAnimation(
         "box",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 2.5F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.3333F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.posVec(0.0F, -0.25F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("head", (data, transforms) -> {
         float basePosYOffset = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, 50.0F);
         float basePosYDown = -1.5F + basePosYOffset;
         float basePosYUp = 0.5F + basePosYOffset;
         float yPos;
         float zPos;
         if (data.elapsedSeconds() < 0.375F) {
            yPos = basePosYDown;
            zPos = 0.0F;
         } else if (data.elapsedSeconds() < 1.0833F) {
            float progress = (data.elapsedSeconds() - 0.375F) / 0.7083F;
            yPos = Mth.lerp(progress, basePosYDown, basePosYUp);
            zPos = Mth.lerp(progress, 0.0F, -5.0F);
         } else if (data.elapsedSeconds() < 2.0833F) {
            float progress = (data.elapsedSeconds() - 1.0833F) / 1.0000001F;
            yPos = Mth.lerp(progress, basePosYUp, basePosYDown);
            zPos = Mth.lerp(progress, -5.0F, 0.0F);
         } else {
            yPos = basePosYDown;
            zPos = 0.0F;
         }

         float baseRotX = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 75.0F);
         float baseRotY = MathAnim.cosWave(data.ageInSeconds(), 100.0F, -2.5F, 125.0F);
         float baseRotZ = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 2.5F, 25.0F);
         float rotationX;
         float rotationY;
         float rotationZ;
         if (data.elapsedSeconds() < 0.375F) {
            float progress = data.elapsedSeconds() / 0.375F;
            rotationX = Mth.lerp(progress, baseRotX, -2.25F);
            rotationY = Mth.lerp(progress, baseRotY, 2.28F);
            rotationZ = Mth.lerp(progress, baseRotZ, -0.61F);
         } else if (data.elapsedSeconds() < 1.2083F) {
            float progress = (data.elapsedSeconds() - 0.375F) / 0.8333F;
            float spinningBaseRotY = -360.0F + baseRotY;
            rotationX = Mth.lerp(progress, -2.25F, baseRotX);
            rotationY = Mth.lerp(progress, 2.28F, spinningBaseRotY);
            rotationZ = Mth.lerp(progress, -0.61F, baseRotZ);
         } else if (data.elapsedSeconds() < 2.0833F) {
            float progress = (data.elapsedSeconds() - 1.2083F) / 0.8750001F;
            float spinningBaseRotY = -360.0F + baseRotY;
            rotationX = baseRotX;
            rotationY = Mth.lerp(progress, spinningBaseRotY, baseRotY);
            rotationZ = baseRotZ;
         } else {
            rotationX = baseRotX;
            rotationY = baseRotY;
            rotationZ = baseRotZ;
         }

         transforms.position(0.0F, yPos, zPos);
         transforms.rotation(-rotationX, -rotationY, rotationZ, true);
      })
      .addAnimation("uppershell", (data, transforms) -> {
         float shellRotWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.5F, 50.0F);
         float shellPosWave = MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, -50.0F);
         float shellBasePosY = -5.0F + shellPosWave;
         float rotationX;
         if (data.elapsedSeconds() < 0.375F) {
            float progress = data.elapsedSeconds() / 0.375F;
            rotationX = Mth.lerp(progress, 0.0F, -0.95F);
         } else if (data.elapsedSeconds() < 1.0833F) {
            float progress = (data.elapsedSeconds() - 0.375F) / 0.7083F;
            rotationX = Mth.lerp(progress, -0.95F, -22.5F + shellRotWave);
         } else if (data.elapsedSeconds() < 2.0833F) {
            float progress = (data.elapsedSeconds() - 1.0833F) / 1.0000001F;
            rotationX = Mth.lerp(progress, -22.5F + shellRotWave, shellRotWave);
         } else if (data.elapsedSeconds() <= 2.5F) {
            float progress = (data.elapsedSeconds() - 2.0833F) / 0.4166999F;
            rotationX = Mth.lerp(progress, shellRotWave, 0.0F);
         } else {
            rotationX = 0.0F;
         }

         float rotationY;
         if (data.elapsedSeconds() < 1.0833F) {
            rotationY = 0.0F;
         } else if (data.elapsedSeconds() < 1.2083F) {
            float progress = (data.elapsedSeconds() - 1.0833F) / 0.125F;
            rotationY = Mth.lerp(progress, 0.0F, 360.0F);
         } else if (data.elapsedSeconds() < 2.0833F) {
            float progress = (data.elapsedSeconds() - 1.2083F) / 0.8750001F;
            rotationY = Mth.lerp(progress, 360.0F, 0.0F);
         } else {
            rotationY = 0.0F;
         }

         float posY;
         if (data.elapsedSeconds() < 0.375F) {
            float progress = data.elapsedSeconds() / 0.375F;
            posY = Mth.lerp(progress, -9.25F, -9.3F);
         } else if (data.elapsedSeconds() < 0.5F) {
            float progress = (data.elapsedSeconds() - 0.375F) / 0.125F;
            posY = Mth.lerp(progress, -9.3F, -11.45F);
         } else if (data.elapsedSeconds() < 0.8333F) {
            float progress = (data.elapsedSeconds() - 0.5F) / 0.3333F;
            posY = Mth.lerp(progress, -11.45F, -3.3F);
         } else if (data.elapsedSeconds() < 1.2083F) {
            posY = -3.3F;
         } else if (data.elapsedSeconds() < 2.0833F) {
            float progress = (data.elapsedSeconds() - 1.2083F) / 0.8750001F;
            posY = Mth.lerp(progress, -3.3F, shellBasePosY);
         } else if (data.elapsedSeconds() <= 2.5F) {
            float progress = (data.elapsedSeconds() - 2.0833F) / 0.4166999F;
            posY = Mth.lerp(progress, shellBasePosY, -9.25F);
         } else {
            posY = -9.25F;
         }

         transforms.position(0.0F, posY, 0.0F);
         transforms.rotation(-rotationX, -rotationY, 0.0F, true);
      })
      .addAnimation(
         "shoulderleft3",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, -1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.posVec(-1.0F, -1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("shoulderleft3", (data, transforms) -> {
         float baseScale = 1.0F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, 0.1F, 50.0F);
         float scale;
         if (data.elapsedSeconds() < 1.625F) {
            scale = baseScale;
         } else if (data.elapsedSeconds() < 2.5F) {
            float progress = (data.elapsedSeconds() - 1.625F) / 0.875F;
            scale = Mth.lerp(progress, baseScale, 1.0F);
         } else {
            scale = 1.0F;
         }

         transforms.uniformScale(scale);
      })
      .addAnimation(
         "shoulderright2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, -1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.posVec(1.0F, -1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("shoulderright2", (data, transforms) -> {
         float baseScale = 1.0F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, 0.1F, 0.0F);
         float scale;
         if (data.elapsedSeconds() < 1.625F) {
            scale = baseScale;
         } else if (data.elapsedSeconds() < 2.5F) {
            float progress = (data.elapsedSeconds() - 1.625F) / 0.875F;
            scale = Mth.lerp(progress, baseScale, 1.0F);
         } else {
            scale = 1.0F;
         }

         transforms.uniformScale(scale);
      })
      .addAnimation(
         "shoulderright3",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, -1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.posVec(1.0F, -1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("shoulderright3", (data, transforms) -> {
         float baseScale = 1.0F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, 0.1F, 25.0F);
         float scale;
         if (data.elapsedSeconds() < 1.625F) {
            scale = baseScale;
         } else if (data.elapsedSeconds() < 2.5F) {
            float progress = (data.elapsedSeconds() - 1.625F) / 0.875F;
            scale = Mth.lerp(progress, baseScale, 1.0F);
         } else {
            scale = 1.0F;
         }

         transforms.uniformScale(scale);
      })
      .addAnimation(
         "shoulderleft2",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, -1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.posVec(-1.0F, -1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("shoulderleft2", (data, transforms) -> {
         float baseScale = 1.0F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, 0.1F, 75.0F);
         float scale;
         if (data.elapsedSeconds() < 1.625F) {
            scale = baseScale;
         } else if (data.elapsedSeconds() < 2.5F) {
            float progress = (data.elapsedSeconds() - 1.625F) / 0.875F;
            scale = Mth.lerp(progress, baseScale, 1.0F);
         } else {
            scale = 1.0F;
         }

         transforms.uniformScale(scale);
      })
      .addAnimation(
         "shoulderleft4",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, 1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.posVec(-1.0F, 1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderright4",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.posVec(1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderright5",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, 1.0F, -1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.posVec(1.0F, 1.0F, -1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation(
         "shoulderleft5",
         new AnimationChannel(
            Targets.POSITION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.posVec(-1.0F, 1.0F, 1.0F), Interpolations.LINEAR),
               new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.4167F, KeyframeAnimations.posVec(-1.0F, 1.0F, 1.0F), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("tendons", (data, transforms) -> transforms.position(0.0F, -1.0F, 0.0F))
      .addAnimation(
         "tendons",
         new AnimationChannel(
            Targets.SCALE,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.375F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(0.6667F, KeyframeAnimations.scaleVec(0.5, 1.0, 0.5), Interpolations.LINEAR),
               new Keyframe(0.9583F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(1.2083F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR),
               new Keyframe(1.6667F, KeyframeAnimations.scaleVec(0.5, 1.0, 0.5), Interpolations.LINEAR),
               new Keyframe(2.0833F, KeyframeAnimations.scaleVec(1.0, 1.0, 1.0), Interpolations.LINEAR)
            }
         )
      )
      .addAnimation("legright1Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .addAnimation("legright2Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .addAnimation("legleft1Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .addAnimation("legleft2Rotator", (data, transforms) -> transforms.uniformScale(0.0F))
      .build();
}
