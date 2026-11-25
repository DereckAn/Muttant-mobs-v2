package com.alexander.mutantmore.animation.math_animation.definition;

import com.alexander.mutantmore.animation.math_animation.MathAnim;
import com.alexander.mutantmore.animation.math_animation.MathAnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.util.Mth;

public class MutantShulkerMathAnimations1 {
   public static final MathAnimationDefinition IDLE = MathAnimationDefinition.Builder.withLength(0.0F)
      .addAnimation("everything", (data, transforms) -> transforms.position(0.0F, 9.0F, 0.0F))
      .addAnimation(
         "box",
         (data, transforms) -> {
            transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 0.0F), 0.0F);
            transforms.rotation(
               -(2.5F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.5F, 125.0F)),
               -MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 100.0F),
               MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.0F, 75.0F),
               true
            );
         }
      )
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
      .addAnimation("uppershell", (data, transforms) -> {
         transforms.position(0.0F, -5.0F + MathAnim.cosWave(data.ageInSeconds(), 100.0F, 0.5F, -50.0F), 0.0F);
         transforms.rotation(-MathAnim.cosWave(data.ageInSeconds(), 100.0F, 1.5F, 50.0F), 0.0F, 0.0F, true);
      })
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
   public static final MathAnimationDefinition IDLE_RARE = MathAnimationDefinition.Builder.withLength(2.25F)
      .addAnimation(
         "everything",
         new AnimationChannel(Targets.POSITION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 9.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation("box", (data, transforms) -> {
         float animTime = data.elapsedSeconds();
         float ageSeconds = data.ageInSeconds();
         float boxRotXSlowWave = MathAnim.cosWave(ageSeconds, 100.0F, 1.5F, 125.0F);
         float boxRotXFastWave = MathAnim.cosWave(ageSeconds, 750.0F, 1.0F, 125.0F);
         float boxRotYWave = MathAnim.cosWave(ageSeconds, 100.0F, 1.0F, 100.0F);
         float boxRotZWave = MathAnim.cosWave(ageSeconds, 100.0F, 1.0F, 75.0F);
         float boxBasePosY = MathAnim.cosWave(ageSeconds, 100.0F, 1.0F, 0.0F);
         float boxRotX;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            float startRot = 2.5F + boxRotXSlowWave;
            float endRot = -2.5F + boxRotXSlowWave;
            boxRotX = Mth.lerp(progress, startRot, endRot);
         } else if (animTime < 0.625F) {
            boxRotX = -2.5F + boxRotXSlowWave;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            float startRot = -2.5F + boxRotXSlowWave;
            float endRot = 15.0F + boxRotXFastWave;
            boxRotX = Mth.lerp(progress, startRot, endRot);
         } else if (animTime < 1.75F) {
            boxRotX = 15.0F + boxRotXFastWave;
         } else if (animTime < 2.0F) {
            float progress = (animTime - 1.75F) / 0.25F;
            float startRot = 15.0F + boxRotXFastWave;
            float endRot = 2.5F + boxRotXSlowWave;
            boxRotX = Mth.lerp(progress, startRot, endRot);
         } else {
            boxRotX = 2.5F + boxRotXSlowWave;
         }

         float boxPosY;
         if (animTime < 0.625F) {
            boxPosY = boxBasePosY;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            float endPos = 1.0F + boxBasePosY;
            boxPosY = Mth.lerp(progress, boxBasePosY, endPos);
         } else if (animTime < 1.75F) {
            boxPosY = 1.0F + boxBasePosY;
         } else if (animTime < 2.125F) {
            float progress = (animTime - 1.75F) / 0.375F;
            float startPos = 1.0F + boxBasePosY;
            boxPosY = Mth.lerp(progress, startPos, boxBasePosY);
         } else {
            boxPosY = boxBasePosY;
         }

         float boxPosZ;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            boxPosZ = Mth.lerp(progress, 0.0F, 1.0F);
         } else if (animTime < 0.625F) {
            boxPosZ = 1.0F;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            boxPosZ = Mth.lerp(progress, 1.0F, -1.0F);
         } else if (animTime < 1.75F) {
            boxPosZ = -1.0F;
         } else if (animTime < 2.125F) {
            float progress = (animTime - 1.75F) / 0.375F;
            boxPosZ = Mth.lerp(progress, -1.0F, 0.0F);
         } else {
            boxPosZ = 0.0F;
         }

         transforms.position(0.0F, boxPosY, boxPosZ);
         transforms.rotation(-boxRotX, -boxRotYWave, boxRotZWave, true);
      })
      .addAnimation("head", (data, transforms) -> {
         float animTime = data.elapsedSeconds();
         float ageSeconds = data.ageInSeconds();
         float headBaseRotXWave = MathAnim.cosWave(ageSeconds, 100.0F, 2.5F, 75.0F);
         float headBaseRotY = MathAnim.cosWave(ageSeconds, 100.0F, -2.5F, 125.0F);
         float headBaseRotZ = MathAnim.cosWave(ageSeconds, 100.0F, 2.5F, 25.0F);
         float headBasePosY = -1.5F + MathAnim.cosWave(ageSeconds, 100.0F, 0.5F, 50.0F);
         float headRotX;
         if (animTime < 0.625F) {
            headRotX = headBaseRotXWave;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            float endRot = -12.5F + headBaseRotXWave;
            headRotX = Mth.lerp(progress, headBaseRotXWave, endRot);
         } else if (animTime < 1.875F) {
            headRotX = -12.5F + headBaseRotXWave;
         } else if (animTime < 2.0F) {
            float progress = (animTime - 1.875F) / 0.125F;
            float startRot = -12.5F + headBaseRotXWave;
            headRotX = Mth.lerp(progress, startRot, headBaseRotXWave);
         } else {
            headRotX = headBaseRotXWave;
         }

         transforms.position(0.0F, headBasePosY, 0.0F);
         transforms.rotation(-headRotX, -headBaseRotY, headBaseRotZ, true);
      })
      .addAnimation("uppershell", (data, transforms) -> {
         float animTime = data.elapsedSeconds();
         float ageSeconds = data.ageInSeconds();
         float upperShellBaseRotXWave = MathAnim.cosWave(ageSeconds, 100.0F, 1.5F, 50.0F);
         float upperShellFastRotXWave = MathAnim.cosWave(ageSeconds, 750.0F, 1.0F, 75.0F);
         float upperShellBasePosY = -5.0F + MathAnim.cosWave(ageSeconds, 100.0F, 0.5F, -50.0F);
         float upperShellRotX;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            upperShellRotX = Mth.lerp(progress, upperShellBaseRotXWave, 0.0F);
         } else if (animTime < 0.625F) {
            upperShellRotX = 0.0F;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            float endRot = -32.5F + upperShellFastRotXWave;
            upperShellRotX = Mth.lerp(progress, 0.0F, endRot);
         } else if (animTime < 1.8333F) {
            upperShellRotX = -32.5F + upperShellFastRotXWave;
         } else if (animTime < 2.25F) {
            float progress = (animTime - 1.8333F) / 0.4167F;
            float startRot = -32.5F + upperShellFastRotXWave;
            upperShellRotX = Mth.lerp(progress, startRot, upperShellBaseRotXWave);
         } else {
            upperShellRotX = upperShellBaseRotXWave;
         }

         float upperShellPosY;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            upperShellPosY = Mth.lerp(progress, upperShellBasePosY, -9.0F);
         } else if (animTime < 0.625F) {
            upperShellPosY = -9.0F;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            upperShellPosY = Mth.lerp(progress, -9.0F, -4.0F);
         } else if (animTime < 1.8333F) {
            upperShellPosY = -4.0F;
         } else if (animTime < 2.25F) {
            float progress = (animTime - 1.8333F) / 0.4167F;
            upperShellPosY = Mth.lerp(progress, -4.0F, upperShellBasePosY);
         } else {
            upperShellPosY = upperShellBasePosY;
         }

         float upperShellPosZ;
         if (animTime < 0.625F) {
            upperShellPosZ = 0.0F;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            upperShellPosZ = Mth.lerp(progress, 0.0F, 1.0F);
         } else if (animTime < 1.8333F) {
            upperShellPosZ = 1.0F;
         } else if (animTime < 2.25F) {
            float progress = (animTime - 1.8333F) / 0.4167F;
            upperShellPosZ = Mth.lerp(progress, 1.0F, 0.0F);
         } else {
            upperShellPosZ = 0.0F;
         }

         transforms.position(0.0F, upperShellPosY, upperShellPosZ);
         transforms.rotation(-upperShellRotX, 0.0F, 0.0F, true);
      })
      .addAnimation("legright1", (data, transforms) -> {
         float animTime = data.elapsedSeconds();
         float ageSeconds = data.ageInSeconds();
         float legRight1PosBaseY = MathAnim.cosWave(ageSeconds, 100.0F, 1.0F, 0.0F);
         float legRight1PosShiftY = MathAnim.cosWave(ageSeconds, 100.0F, 1.0F, -25.0F);
         float legRight1RotZBase = -36.3602F + MathAnim.cosWave(ageSeconds, 100.0F, -5.0F, 0.0F);
         float legRight1RotZMid = -39.2406F + MathAnim.cosWave(ageSeconds, 100.0F, -5.0F, -25.0F);
         float legRight1RotZLow = -26.0614F + MathAnim.cosWave(ageSeconds, 100.0F, -5.0F, -25.0F);
         float legRight1RotX;
         float legRight1RotY;
         float legRight1RotZ;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            legRight1RotX = Mth.lerp(progress, 24.7851F, 26.6849F);
            legRight1RotY = Mth.lerp(progress, -38.8447F, -43.3451F);
            legRight1RotZ = Mth.lerp(progress, legRight1RotZBase, legRight1RotZMid);
         } else if (animTime < 0.625F) {
            legRight1RotX = 26.6849F;
            legRight1RotY = -43.3451F;
            legRight1RotZ = legRight1RotZMid;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            legRight1RotX = Mth.lerp(progress, 26.6849F, 17.29758F);
            legRight1RotY = Mth.lerp(progress, -43.3451F, -47.115F);
            legRight1RotZ = Mth.lerp(progress, legRight1RotZMid, legRight1RotZLow);
         } else if (animTime < 1.75F) {
            legRight1RotX = 17.29758F;
            legRight1RotY = -47.115F;
            legRight1RotZ = legRight1RotZLow;
         } else if (animTime < 2.0F) {
            float progress = (animTime - 1.75F) / 0.25F;
            legRight1RotX = Mth.lerp(progress, 17.29758F, 24.7851F);
            legRight1RotY = Mth.lerp(progress, -47.115F, -38.8447F);
            legRight1RotZ = Mth.lerp(progress, legRight1RotZLow, legRight1RotZBase);
         } else {
            legRight1RotX = 24.7851F;
            legRight1RotY = -38.8447F;
            legRight1RotZ = legRight1RotZBase;
         }

         float legRight1PosZ;
         float legRight1PosY;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            legRight1PosY = Mth.lerp(progress, legRight1PosBaseY, legRight1PosShiftY);
            legRight1PosZ = Mth.lerp(progress, 0.0F, 2.0F);
         } else if (animTime < 0.625F) {
            legRight1PosY = legRight1PosShiftY;
            legRight1PosZ = 2.0F;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            legRight1PosY = Mth.lerp(progress, legRight1PosShiftY, -2.0F + legRight1PosShiftY);
            legRight1PosZ = Mth.lerp(progress, 2.0F, -2.0F);
         } else if (animTime < 1.75F) {
            legRight1PosY = -2.0F + legRight1PosShiftY;
            legRight1PosZ = -2.0F;
         } else if (animTime < 2.0F) {
            float progress = (animTime - 1.75F) / 0.25F;
            legRight1PosY = Mth.lerp(progress, -2.0F + legRight1PosShiftY, legRight1PosBaseY);
            legRight1PosZ = Mth.lerp(progress, -2.0F, 0.0F);
         } else {
            legRight1PosY = legRight1PosBaseY;
            legRight1PosZ = 0.0F;
         }

         transforms.position(0.0F, legRight1PosY, legRight1PosZ);
         transforms.rotation(-legRight1RotX, -legRight1RotY, legRight1RotZ, true);
      })
      .addAnimation(
         "legright1joint1",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation("legright1joint2", (data, transforms) -> {
         float animTime = data.elapsedSeconds();
         float ageSeconds = data.ageInSeconds();
         float baseWaveX = MathAnim.cosWave(ageSeconds, 100.0F, -3.0F, 0.0F);
         float baseWaveZ = MathAnim.cosWave(ageSeconds, 100.0F, -5.0F, 0.0F);
         float shiftedWaveX = MathAnim.cosWave(ageSeconds, 100.0F, -3.0F, -25.0F);
         float shiftedWaveZ = MathAnim.cosWave(ageSeconds, 100.0F, -5.0F, -25.0F);
         float rotX0 = 50.0F + baseWaveX;
         float rotX05 = 44.9902F + shiftedWaveX;
         float rotY05 = 1.0091F;
         float rotZ05 = -1.1099F + shiftedWaveZ;
         float rotX075 = 62.0081F + shiftedWaveX;
         float rotY075 = 9.4039F;
         float rotZ075 = -6.5342F + shiftedWaveZ;
         float jointRotX;
         float jointRotY;
         float jointRotZ;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            jointRotX = Mth.lerp(progress, rotX0, rotX05);
            jointRotY = Mth.lerp(progress, 0.0F, rotY05);
            jointRotZ = Mth.lerp(progress, baseWaveZ, rotZ05);
         } else if (animTime < 0.625F) {
            jointRotX = rotX05;
            jointRotY = rotY05;
            jointRotZ = rotZ05;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            jointRotX = Mth.lerp(progress, rotX05, rotX075);
            jointRotY = Mth.lerp(progress, rotY05, rotY075);
            jointRotZ = Mth.lerp(progress, rotZ05, rotZ075);
         } else if (animTime < 1.75F) {
            jointRotX = rotX075;
            jointRotY = rotY075;
            jointRotZ = rotZ075;
         } else if (animTime < 2.0F) {
            float progress = (animTime - 1.75F) / 0.25F;
            jointRotX = Mth.lerp(progress, rotX075, rotX0);
            jointRotY = Mth.lerp(progress, rotY075, 0.0F);
            jointRotZ = Mth.lerp(progress, rotZ075, baseWaveZ);
         } else {
            jointRotX = rotX0;
            jointRotY = 0.0F;
            jointRotZ = baseWaveZ;
         }

         transforms.rotation(-jointRotX, -jointRotY, jointRotZ, true);
      })
      .addAnimation("legright2", (data, transforms) -> {
         float animTime = data.elapsedSeconds();
         float ageSeconds = data.ageInSeconds();
         float legRight2WaveZ = MathAnim.cosWave(ageSeconds, 100.0F, -5.0F, 25.0F);
         float legRight2BasePosY = MathAnim.cosWave(ageSeconds, 100.0F, 1.0F, 25.0F);
         float legRight2RaisedPosY = 3.0F + legRight2BasePosY;
         float rotZ0 = -36.3602F + legRight2WaveZ;
         float rotZ05 = -35.0554F + legRight2WaveZ;
         float rotZ075 = -55.0457F + legRight2WaveZ;
         float legRight2RotX;
         float legRight2RotY;
         float legRight2RotZ;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            legRight2RotX = Mth.lerp(progress, -24.7851F, -23.99189F);
            legRight2RotY = Mth.lerp(progress, 38.8447F, 36.56301F);
            legRight2RotZ = Mth.lerp(progress, rotZ0, rotZ05);
         } else if (animTime < 0.625F) {
            legRight2RotX = -23.99189F;
            legRight2RotY = 36.56301F;
            legRight2RotZ = rotZ05;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            legRight2RotX = Mth.lerp(progress, -23.99189F, -35.23202F);
            legRight2RotY = Mth.lerp(progress, 36.56301F, 39.08929F);
            legRight2RotZ = Mth.lerp(progress, rotZ05, rotZ075);
         } else if (animTime < 1.7917F) {
            legRight2RotX = -35.23202F;
            legRight2RotY = 39.08929F;
            legRight2RotZ = rotZ075;
         } else if (animTime < 2.0F) {
            float progress = (animTime - 1.7917F) / 0.2083F;
            legRight2RotX = Mth.lerp(progress, -35.23202F, -24.7851F);
            legRight2RotY = Mth.lerp(progress, 39.08929F, 38.8447F);
            legRight2RotZ = Mth.lerp(progress, rotZ075, rotZ0);
         } else {
            legRight2RotX = -24.7851F;
            legRight2RotY = 38.8447F;
            legRight2RotZ = rotZ0;
         }

         float legRight2PosZ;
         float legRight2PosY;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            legRight2PosY = legRight2BasePosY;
            legRight2PosZ = Mth.lerp(progress, 0.0F, 1.0F);
         } else if (animTime < 0.625F) {
            legRight2PosY = legRight2BasePosY;
            legRight2PosZ = 1.0F;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            legRight2PosY = Mth.lerp(progress, legRight2BasePosY, legRight2RaisedPosY);
            legRight2PosZ = Mth.lerp(progress, 1.0F, -4.0F);
         } else if (animTime < 1.7917F) {
            legRight2PosY = legRight2RaisedPosY;
            legRight2PosZ = -4.0F;
         } else if (animTime < 2.0F) {
            float progress = (animTime - 1.7917F) / 0.2083F;
            legRight2PosY = Mth.lerp(progress, legRight2RaisedPosY, legRight2BasePosY);
            legRight2PosZ = Mth.lerp(progress, -4.0F, 0.0F);
         } else {
            legRight2PosY = legRight2BasePosY;
            legRight2PosZ = 0.0F;
         }

         transforms.position(0.0F, legRight2PosY, legRight2PosZ);
         transforms.rotation(-legRight2RotX, -legRight2RotY, legRight2RotZ, true);
      })
      .addAnimation(
         "legright2joint1",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation("legright2joint2", (data, transforms) -> {
         float animTime = data.elapsedSeconds();
         float ageSeconds = data.ageInSeconds();
         float waveX = MathAnim.cosWave(ageSeconds, 100.0F, -3.0F, 25.0F);
         float waveZ = MathAnim.cosWave(ageSeconds, 100.0F, 5.0F, 25.0F);
         float rotX0 = 50.0F + waveX;
         float rotX05 = 51.9903F + waveX;
         float rotY05 = 1.13584F;
         float rotZ05 = -0.9798F + waveZ;
         float rotX075 = 31.9857F + waveX;
         float rotY075 = -1.27933F;
         float rotZ075 = 2.8148F + waveZ;
         float jointRotX;
         float jointRotY;
         float jointRotZ;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            jointRotX = Mth.lerp(progress, rotX0, rotX05);
            jointRotY = Mth.lerp(progress, 0.0F, rotY05);
            jointRotZ = Mth.lerp(progress, waveZ, rotZ05);
         } else if (animTime < 0.625F) {
            jointRotX = rotX05;
            jointRotY = rotY05;
            jointRotZ = rotZ05;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            jointRotX = Mth.lerp(progress, rotX05, rotX075);
            jointRotY = Mth.lerp(progress, rotY05, rotY075);
            jointRotZ = Mth.lerp(progress, rotZ05, rotZ075);
         } else if (animTime < 1.7917F) {
            jointRotX = rotX075;
            jointRotY = rotY075;
            jointRotZ = rotZ075;
         } else if (animTime < 2.0F) {
            float progress = (animTime - 1.7917F) / 0.2083F;
            jointRotX = Mth.lerp(progress, rotX075, rotX0);
            jointRotY = Mth.lerp(progress, rotY075, 0.0F);
            jointRotZ = Mth.lerp(progress, rotZ075, waveZ);
         } else {
            jointRotX = rotX0;
            jointRotY = 0.0F;
            jointRotZ = waveZ;
         }

         transforms.rotation(-jointRotX, -jointRotY, jointRotZ, true);
      })
      .addAnimation("legleft1", (data, transforms) -> {
         float animTime = data.elapsedSeconds();
         float ageSeconds = data.ageInSeconds();
         float legLeft1PosBaseY = MathAnim.cosWave(ageSeconds, 100.0F, 1.0F, -25.0F);
         float legLeft1PosLowerY = -2.0F + legLeft1PosBaseY;
         float rotZBase = 36.3602F + MathAnim.cosWave(ageSeconds, 100.0F, 5.0F, -25.0F);
         float rotZMid = 39.2406F + MathAnim.cosWave(ageSeconds, 100.0F, 5.0F, -25.0F);
         float rotZLow = 26.0614F + MathAnim.cosWave(ageSeconds, 100.0F, 5.0F, -25.0F);
         float legLeft1RotX;
         float legLeft1RotY;
         float legLeft1RotZ;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            legLeft1RotX = Mth.lerp(progress, 24.78507F, 26.68489F);
            legLeft1RotY = Mth.lerp(progress, 38.84468F, 43.34512F);
            legLeft1RotZ = Mth.lerp(progress, rotZBase, rotZMid);
         } else if (animTime < 0.625F) {
            legLeft1RotX = 26.68489F;
            legLeft1RotY = 43.34512F;
            legLeft1RotZ = rotZMid;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            legLeft1RotX = Mth.lerp(progress, 26.68489F, 17.29758F);
            legLeft1RotY = Mth.lerp(progress, 43.34512F, 47.11505F);
            legLeft1RotZ = Mth.lerp(progress, rotZMid, rotZLow);
         } else if (animTime < 1.75F) {
            legLeft1RotX = 17.29758F;
            legLeft1RotY = 47.11505F;
            legLeft1RotZ = rotZLow;
         } else if (animTime < 2.0F) {
            float progress = (animTime - 1.75F) / 0.25F;
            legLeft1RotX = Mth.lerp(progress, 17.29758F, 24.78507F);
            legLeft1RotY = Mth.lerp(progress, 47.11505F, 38.84468F);
            legLeft1RotZ = Mth.lerp(progress, rotZLow, rotZBase);
         } else {
            legLeft1RotX = 24.78507F;
            legLeft1RotY = 38.84468F;
            legLeft1RotZ = rotZBase;
         }

         float legLeft1PosZ;
         float legLeft1PosY;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            legLeft1PosY = legLeft1PosBaseY;
            legLeft1PosZ = Mth.lerp(progress, 0.0F, 2.0F);
         } else if (animTime < 0.625F) {
            legLeft1PosY = legLeft1PosBaseY;
            legLeft1PosZ = 2.0F;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            legLeft1PosY = Mth.lerp(progress, legLeft1PosBaseY, legLeft1PosLowerY);
            legLeft1PosZ = Mth.lerp(progress, 2.0F, -2.0F);
         } else if (animTime < 1.75F) {
            legLeft1PosY = legLeft1PosLowerY;
            legLeft1PosZ = -2.0F;
         } else if (animTime < 2.0F) {
            float progress = (animTime - 1.75F) / 0.25F;
            legLeft1PosY = Mth.lerp(progress, legLeft1PosLowerY, legLeft1PosBaseY);
            legLeft1PosZ = Mth.lerp(progress, -2.0F, 0.0F);
         } else {
            legLeft1PosY = legLeft1PosBaseY;
            legLeft1PosZ = 0.0F;
         }

         transforms.position(0.0F, legLeft1PosY, legLeft1PosZ);
         transforms.rotation(-legLeft1RotX, -legLeft1RotY, legLeft1RotZ, true);
      })
      .addAnimation(
         "legleft1joint1",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 90.0F), Interpolations.LINEAR)})
      )
      .addAnimation("legleft1joint2", (data, transforms) -> {
         float animTime = data.elapsedSeconds();
         float ageSeconds = data.ageInSeconds();
         float waveX = MathAnim.cosWave(ageSeconds, 100.0F, -3.0F, -25.0F);
         float waveZ = MathAnim.cosWave(ageSeconds, 100.0F, 5.0F, -25.0F);
         float rotX0 = 50.0F + waveX;
         float rotX05 = 44.9902F + waveX;
         float rotY05 = -1.00909F;
         float rotZ05 = 1.1099F + waveZ;
         float rotX075 = 62.0081F + waveX;
         float rotY075 = -9.40393F;
         float rotZ075 = 6.5342F + waveZ;
         float jointRotX;
         float jointRotY;
         float jointRotZ;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            jointRotX = Mth.lerp(progress, rotX0, rotX05);
            jointRotY = Mth.lerp(progress, 0.0F, rotY05);
            jointRotZ = Mth.lerp(progress, waveZ, rotZ05);
         } else if (animTime < 0.625F) {
            jointRotX = rotX05;
            jointRotY = rotY05;
            jointRotZ = rotZ05;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            jointRotX = Mth.lerp(progress, rotX05, rotX075);
            jointRotY = Mth.lerp(progress, rotY05, rotY075);
            jointRotZ = Mth.lerp(progress, rotZ05, rotZ075);
         } else if (animTime < 1.75F) {
            jointRotX = rotX075;
            jointRotY = rotY075;
            jointRotZ = rotZ075;
         } else if (animTime < 2.0F) {
            float progress = (animTime - 1.75F) / 0.25F;
            jointRotX = Mth.lerp(progress, rotX075, rotX0);
            jointRotY = Mth.lerp(progress, rotY075, 0.0F);
            jointRotZ = Mth.lerp(progress, rotZ075, waveZ);
         } else {
            jointRotX = rotX0;
            jointRotY = 0.0F;
            jointRotZ = waveZ;
         }

         transforms.rotation(-jointRotX, -jointRotY, jointRotZ, true);
      })
      .addAnimation("legleft2", (data, transforms) -> {
         float animTime = data.elapsedSeconds();
         float ageSeconds = data.ageInSeconds();
         float baseWaveY50 = MathAnim.cosWave(ageSeconds, 100.0F, 1.0F, 50.0F);
         float baseWaveY25 = MathAnim.cosWave(ageSeconds, 100.0F, 1.0F, 25.0F);
         float legLeft2RaisedPosY = 3.0F + baseWaveY25;
         float rotZ0 = 36.3602F + MathAnim.cosWave(ageSeconds, 100.0F, 5.0F, 50.0F);
         float rotZ05 = 35.0554F + MathAnim.cosWave(ageSeconds, 100.0F, 5.0F, 25.0F);
         float rotZ075 = 55.0457F + MathAnim.cosWave(ageSeconds, 100.0F, 5.0F, 25.0F);
         float legLeft2RotX;
         float legLeft2RotY;
         float legLeft2RotZ;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            legLeft2RotX = Mth.lerp(progress, -24.7851F, -23.99189F);
            legLeft2RotY = Mth.lerp(progress, -38.8447F, -36.563F);
            legLeft2RotZ = Mth.lerp(progress, rotZ0, rotZ05);
         } else if (animTime < 0.625F) {
            legLeft2RotX = -23.99189F;
            legLeft2RotY = -36.563F;
            legLeft2RotZ = rotZ05;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            legLeft2RotX = Mth.lerp(progress, -23.99189F, -35.23202F);
            legLeft2RotY = Mth.lerp(progress, -36.563F, -39.0893F);
            legLeft2RotZ = Mth.lerp(progress, rotZ05, rotZ075);
         } else if (animTime < 1.7917F) {
            legLeft2RotX = -35.23202F;
            legLeft2RotY = -39.0893F;
            legLeft2RotZ = rotZ075;
         } else if (animTime < 2.0F) {
            float progress = (animTime - 1.7917F) / 0.2083F;
            legLeft2RotX = Mth.lerp(progress, -35.23202F, -24.7851F);
            legLeft2RotY = Mth.lerp(progress, -39.0893F, -38.8447F);
            legLeft2RotZ = Mth.lerp(progress, rotZ075, rotZ0);
         } else {
            legLeft2RotX = -24.7851F;
            legLeft2RotY = -38.8447F;
            legLeft2RotZ = rotZ0;
         }

         float legLeft2PosZ;
         float legLeft2PosY;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            legLeft2PosY = baseWaveY50;
            legLeft2PosZ = Mth.lerp(progress, 0.0F, 1.0F);
         } else if (animTime < 0.625F) {
            legLeft2PosY = baseWaveY25;
            legLeft2PosZ = 1.0F;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            legLeft2PosY = Mth.lerp(progress, baseWaveY25, legLeft2RaisedPosY);
            legLeft2PosZ = Mth.lerp(progress, 1.0F, -4.0F);
         } else if (animTime < 1.7917F) {
            legLeft2PosY = legLeft2RaisedPosY;
            legLeft2PosZ = -4.0F;
         } else if (animTime < 2.0F) {
            float progress = (animTime - 1.7917F) / 0.2083F;
            legLeft2PosY = Mth.lerp(progress, legLeft2RaisedPosY, baseWaveY50);
            legLeft2PosZ = Mth.lerp(progress, -4.0F, 0.0F);
         } else {
            legLeft2PosY = baseWaveY50;
            legLeft2PosZ = 0.0F;
         }

         transforms.position(0.0F, legLeft2PosY, legLeft2PosZ);
         transforms.rotation(-legLeft2RotX, -legLeft2RotY, legLeft2RotZ, true);
      })
      .addAnimation(
         "legleft2joint1",
         new AnimationChannel(Targets.ROTATION, new Keyframe[]{new Keyframe(0.0F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.LINEAR)})
      )
      .addAnimation("legleft2joint2", (data, transforms) -> {
         float animTime = data.elapsedSeconds();
         float ageSeconds = data.ageInSeconds();
         float waveX50 = MathAnim.cosWave(ageSeconds, 100.0F, -3.0F, 50.0F);
         float waveZ50 = MathAnim.cosWave(ageSeconds, 100.0F, -5.0F, 50.0F);
         float waveX25 = MathAnim.cosWave(ageSeconds, 100.0F, -3.0F, 25.0F);
         float waveZ25 = MathAnim.cosWave(ageSeconds, 100.0F, -5.0F, 25.0F);
         float rotX0 = 50.0F + waveX50;
         float rotX05 = 51.9903F + waveX25;
         float rotY05 = -1.1358F;
         float rotZ05 = 0.9798F + waveZ25;
         float rotX075 = 31.9857F + waveX25;
         float rotY075 = 1.2793F;
         float rotZ075 = -2.8148F + waveZ25;
         float jointRotX;
         float jointRotY;
         float jointRotZ;
         if (animTime < 0.5F) {
            float progress = animTime / 0.5F;
            jointRotX = Mth.lerp(progress, rotX0, rotX05);
            jointRotY = Mth.lerp(progress, 0.0F, rotY05);
            jointRotZ = Mth.lerp(progress, waveZ50, rotZ05);
         } else if (animTime < 0.625F) {
            jointRotX = rotX05;
            jointRotY = rotY05;
            jointRotZ = rotZ05;
         } else if (animTime < 0.75F) {
            float progress = (animTime - 0.625F) / 0.125F;
            jointRotX = Mth.lerp(progress, rotX05, rotX075);
            jointRotY = Mth.lerp(progress, rotY05, rotY075);
            jointRotZ = Mth.lerp(progress, rotZ05, rotZ075);
         } else if (animTime < 1.7917F) {
            jointRotX = rotX075;
            jointRotY = rotY075;
            jointRotZ = rotZ075;
         } else if (animTime < 2.0F) {
            float progress = (animTime - 1.7917F) / 0.2083F;
            jointRotX = Mth.lerp(progress, rotX075, rotX0);
            jointRotY = Mth.lerp(progress, rotY075, 0.0F);
            jointRotZ = Mth.lerp(progress, rotZ075, waveZ50);
         } else {
            jointRotX = rotX0;
            jointRotY = 0.0F;
            jointRotZ = waveZ50;
         }

         transforms.rotation(-jointRotX, -jointRotY, jointRotZ, true);
      })
      .addAnimation(
         "tendons",
         new AnimationChannel(
            Targets.ROTATION,
            new Keyframe[]{
               new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(0.75F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(1.75F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.LINEAR),
               new Keyframe(2.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR)
            }
         )
      )
      .build();
   public static final MathAnimationDefinition SPINNING = MathAnimationDefinition.Builder.withLength(0.0F)
      .addAnimation("everything", (data, transforms) -> transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 1.25F, 0.0F), 0.0F))
      .addAnimation("head", (data, transforms) -> transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 1.0F, 25.0F), 0.0F))
      .addAnimation(
         "uppershell",
         (data, transforms) -> {
            transforms.position(0.0F, -5.0F + MathAnim.cosWave(data.ageInSeconds(), 250.0F, 2.0F, 50.0F), 0.0F);
            transforms.rotation(
               -MathAnim.cosWave(data.ageInSeconds(), 250.0F, 4.0F, 75.0F),
               -MathAnim.cosWave(data.ageInSeconds(), 275.0F, 2.0F, 85.0F),
               MathAnim.cosWave(data.ageInSeconds(), 260.0F, 3.0F, 95.0F),
               true
            );
         }
      )
      .addAnimation(
         "legright1",
         (data, transforms) -> transforms.rotation(-40.144F, 22.32924F, -65.7495F + MathAnim.cosWave(data.ageInSeconds(), 250.0F, -25.0F, 25.0F), true)
      )
      .addAnimation("legright1joint2", (data, transforms) -> transforms.rotation(-27.5F, 0.0F, 0.0F, true))
      .addAnimation(
         "legright2",
         (data, transforms) -> transforms.rotation(132.79488F, 18.88952F, 106.6854F + MathAnim.cosWave(data.ageInSeconds(), 250.0F, -25.0F, 125.0F), true)
      )
      .addAnimation("legright2joint2", (data, transforms) -> {
         transforms.position(0.0F, -1.2F, -0.6F);
         transforms.rotation(27.5F, 0.0F, 0.0F, true);
      })
      .addAnimation(
         "legleft1",
         (data, transforms) -> transforms.rotation(-42.18626F, -17.38772F, 71.7511F + MathAnim.cosWave(data.ageInSeconds(), 250.0F, -25.0F, -50.0F), true)
      )
      .addAnimation("legleft1joint2", (data, transforms) -> transforms.rotation(-27.5F, 0.0F, 0.0F, true))
      .addAnimation(
         "legleft2",
         (data, transforms) -> transforms.rotation(133.41006F, -20.71501F, -108.501F + MathAnim.cosWave(data.ageInSeconds(), 250.0F, -25.0F, -100.0F), true)
      )
      .addAnimation("legleft2joint2", (data, transforms) -> {
         transforms.position(0.0F, -1.2F, -0.6F);
         transforms.rotation(27.5F, 0.0F, 0.0F, true);
      })
      .addAnimation(
         "lowershell",
         (data, transforms) -> transforms.rotation(
            -MathAnim.cosWave(data.ageInSeconds(), 500.0F, 2.5F, 0.0F),
            -data.ageInSeconds() * 600.0F,
            MathAnim.cosWave(data.ageInSeconds(), 300.0F, 5.0F, 50.0F),
            true
         )
      )
      .addAnimation(
         "tendons",
         (data, transforms) -> {
            transforms.rotation(
               -MathAnim.cosWave(data.ageInSeconds(), 500.0F, 2.5F, 0.0F),
               -data.ageInSeconds() * 150.0F,
               MathAnim.cosWave(data.ageInSeconds(), 300.0F, 5.0F, 50.0F),
               true
            );
            transforms.scale(0.75F, 1.0F, 0.75F);
         }
      )
      .addAnimation(
         "legs",
         (data, transforms) -> {
            transforms.position(0.0F, 3.0F, 0.0F);
            transforms.rotation(
               -MathAnim.cosWave(data.ageInSeconds(), 500.0F, 2.5F, 0.0F),
               -data.ageInSeconds() * 600.0F,
               MathAnim.cosWave(data.ageInSeconds(), 300.0F, 5.0F, 50.0F),
               true
            );
         }
      )
      .addAnimation("shoulders3", (data, transforms) -> transforms.position(0.0F, 1.9F, 0.0F))
      .build();
   public static final MathAnimationDefinition WALK = MathAnimationDefinition.Builder.withLength(0.0F)
      .dontApplyScaleToKeyframes()
      .addAnimation("everything", (data, transforms) -> transforms.position(0.0F, 9.0F, 0.0F))
      .addAnimation(
         "legright1",
         (data, transforms) -> transforms.rotation(
            0.56242F, 0.6518F, 67.6561F + Mth.clamp(MathAnim.cosWave(data.ageInSeconds(), data.animScale() * 250.0F, 25.0F, 140.0F), 0.0F, 360.0F), true
         )
      )
      .addAnimation("legright1joint1", (data, transforms) -> transforms.rotation(-90.0F, 0.0F, 0.0F, true))
      .addAnimation(
         "legright1joint2",
         (data, transforms) -> transforms.rotation(
            -(50.0F + Mth.clamp(MathAnim.cosWave(data.ageInSeconds(), data.animScale() * 250.0F, -25.0F, 140.0F), -360.0F, 0.0F)), 0.0F, 0.0F, true
         )
      )
      .addAnimation(
         "legright2",
         (data, transforms) -> transforms.rotation(
            0.56242F, 0.65181F, 67.6561F + Mth.clamp(MathAnim.cosWave(data.ageInSeconds(), data.animScale() * 250.0F, 25.0F, 230.0F), 0.0F, 360.0F), true
         )
      )
      .addAnimation("legright2joint1", (data, transforms) -> transforms.rotation(-90.0F, 0.0F, 0.0F, true))
      .addAnimation(
         "legright2joint2",
         (data, transforms) -> transforms.rotation(
            -(50.0F + Mth.clamp(MathAnim.cosWave(data.ageInSeconds(), data.animScale() * 250.0F, -25.0F, 230.0F), -360.0F, 0.0F)), 0.0F, 0.0F, true
         )
      )
      .addAnimation(
         "legleft1",
         (data, transforms) -> transforms.rotation(
            0.56242F, -0.6518F, -67.6561F + Mth.clamp(MathAnim.cosWave(data.ageInSeconds(), data.animScale() * 250.0F, -25.0F, 410.0F), -360.0F, 0.0F), true
         )
      )
      .addAnimation("legleft1joint1", (data, transforms) -> transforms.rotation(0.0F, 0.0F, 90.0F, true))
      .addAnimation(
         "legleft1joint2",
         (data, transforms) -> transforms.rotation(
            -(50.0F + Mth.clamp(MathAnim.cosWave(data.ageInSeconds(), data.animScale() * 250.0F, -25.0F, 410.0F), -360.0F, 0.0F)), 0.0F, 0.0F, true
         )
      )
      .addAnimation(
         "legleft2",
         (data, transforms) -> transforms.rotation(
            0.56242F, -0.6518F, -67.6561F + Mth.clamp(MathAnim.cosWave(data.ageInSeconds(), data.animScale() * 250.0F, -25.0F, 320.0F), -360.0F, 0.0F), true
         )
      )
      .addAnimation("legleft2joint1", (data, transforms) -> transforms.rotation(-90.0F, 0.0F, 0.0F, true))
      .addAnimation(
         "legleft2joint2",
         (data, transforms) -> transforms.rotation(
            -(50.0F + Mth.clamp(MathAnim.cosWave(data.ageInSeconds(), data.animScale() * 250.0F, -25.0F, 320.0F), -360.0F, 0.0F)), 0.0F, 0.0F, true
         )
      )
      .addAnimation("legright1Rotator", (data, transforms) -> {
         float walkSpeed = data.animScale() * 250.0F;
         transforms.position(0.0F, Mth.clamp(MathAnim.cosWave(data.ageInSeconds(), walkSpeed, 2.5F, 140.0F), 0.0F, 360.0F), 0.0F);
         transforms.rotation(-(30.0F + MathAnim.cosWave(data.ageInSeconds(), walkSpeed, 50.0F, 90.0F)), 0.0F, -90.0F, true);
      })
      .addAnimation("legright2Rotator", (data, transforms) -> {
         float walkSpeed = data.animScale() * 250.0F;
         transforms.position(0.0F, Mth.clamp(MathAnim.cosWave(data.ageInSeconds(), walkSpeed, 2.5F, 230.0F), 0.0F, 360.0F), 0.0F);
         transforms.rotation(-(-30.0F + MathAnim.cosWave(data.ageInSeconds(), walkSpeed, 50.0F, 180.0F)), 0.0F, -90.0F, true);
      })
      .addAnimation("legleft1Rotator", (data, transforms) -> {
         float walkSpeed = data.animScale() * 250.0F;
         transforms.position(0.0F, Mth.clamp(MathAnim.cosWave(data.ageInSeconds(), walkSpeed, 2.5F, 410.0F), 0.0F, 360.0F), 0.0F);
         transforms.rotation(-(30.0F + MathAnim.cosWave(data.ageInSeconds(), walkSpeed, 50.0F, 360.0F)), 0.0F, 90.0F, true);
      })
      .addAnimation("legleft2Rotator", (data, transforms) -> {
         float walkSpeed = data.animScale() * 250.0F;
         transforms.position(0.0F, Mth.clamp(MathAnim.cosWave(data.ageInSeconds(), walkSpeed, 2.5F, 320.0F), 0.0F, 360.0F), 0.0F);
         transforms.rotation(-(-30.0F + MathAnim.cosWave(data.ageInSeconds(), walkSpeed, 50.0F, 270.0F)), 0.0F, 90.0F, true);
      })
      .addAnimation(
         "box",
         (data, transforms) -> {
            float fastWalkSpeed = data.animScale() * 500.0F;
            transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), fastWalkSpeed, 1.5F, 0.0F), 0.0F);
            transforms.rotation(
               -(2.5F + MathAnim.cosWave(data.ageInSeconds(), fastWalkSpeed, 2.5F, 25.0F)),
               0.0F,
               MathAnim.cosWave(data.ageInSeconds(), data.animScale() * 250.0F, 1.0F, -25.0F),
               true
            );
         }
      )
      .addAnimation(
         "head",
         (data, transforms) -> {
            float fastWalkSpeed = data.animScale() * 500.0F;
            transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), fastWalkSpeed, 0.5F, 75.0F), 0.0F);
            transforms.rotation(
               -MathAnim.cosWave(data.ageInSeconds(), fastWalkSpeed, 2.5F, 100.0F),
               0.0F,
               MathAnim.cosWave(data.ageInSeconds(), data.animScale() * 250.0F, 1.0F, 25.0F),
               true
            );
         }
      )
      .addAnimation("uppershell", (data, transforms) -> {
         transforms.position(0.0F, -5.0F + MathAnim.cosWave(data.ageInSeconds(), data.animScale() * 100.0F, 0.5F, -50.0F), 0.0F);
         transforms.rotation(-(-10.0F + MathAnim.cosWave(data.ageInSeconds(), data.animScale() * 500.0F, 2.5F, 50.0F)), 0.0F, 0.0F, true);
      })
      .build();
}
