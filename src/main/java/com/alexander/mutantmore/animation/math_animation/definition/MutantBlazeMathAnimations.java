package com.alexander.mutantmore.animation.math_animation.definition;

import com.alexander.mutantmore.animation.math_animation.AnimationData;
import com.alexander.mutantmore.animation.math_animation.AnimationTransformation;
import com.alexander.mutantmore.animation.math_animation.MathAnim;
import com.alexander.mutantmore.animation.math_animation.MathAnimationDefinition;
import com.alexander.mutantmore.entities.MutantBlaze;
import net.minecraft.util.Mth;

public class MutantBlazeMathAnimations {
   public static final MathAnimationDefinition INTRO = MathAnimationDefinition.Builder.withLength(1.25F)
      .addAnimation("everything", (data, transforms) -> {
         transforms.position(0.0F, data.animScale() * 2.0F + MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 125.0F), -data.animScale() * 2.0F);
         float fade = data.elapsedSeconds() >= 1.0F ? Math.min((data.elapsedSeconds() - 1.0F) / 0.25F, 1.0F) : 0.0F;
         transforms.rotation(0.0F, 0.0F, Mth.lerp(fade, MathAnim.cosWave(data.ageInSeconds(), 6000.0F, -0.5F, 0.0F), 0.0F), true);
      })
      .addAnimation("head", (data, transforms) -> {
         float basePosY = MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 50.0F);
         float baseRotX = -MathAnim.cosWave(data.ageInSeconds(), 250.0F, -3.5F, -50.0F);
         float baseRotZ = MathAnim.cosWave(data.ageInSeconds(), 250.0F, -3.5F, 50.0F);
         float shakeZ = MathAnim.cosWave(data.ageInSeconds(), 6000.0F, -1.5F, 0.0F);
         float animPosY;
         if (data.elapsedSeconds() < 0.5F) {
            animPosY = Mth.lerp(data.elapsedSeconds() / 0.5F, 0.0F, 8.0F);
         } else if (data.elapsedSeconds() < 0.75F) {
            animPosY = 8.0F;
         } else if (data.elapsedSeconds() < 1.125F) {
            animPosY = Mth.lerp((data.elapsedSeconds() - 0.75F) / 0.375F, 8.0F, -2.0F);
         } else if (data.elapsedSeconds() < 1.25F) {
            animPosY = Mth.lerp((data.elapsedSeconds() - 1.125F) / 0.125F, -2.0F, 0.0F);
         } else {
            animPosY = 0.0F;
         }

         float animRotX;
         if (data.elapsedSeconds() < 0.5F) {
            animRotX = Mth.lerp(data.elapsedSeconds() / 0.5F, 0.0F, -22.5F);
         } else if (data.elapsedSeconds() < 0.75F) {
            animRotX = -22.5F;
         } else if (data.elapsedSeconds() < 1.125F) {
            animRotX = Mth.lerp((data.elapsedSeconds() - 0.75F) / 0.375F, -22.5F, 0.0F);
         } else {
            animRotX = 0.0F;
         }

         float animRotZ;
         if (data.elapsedSeconds() < 0.5F) {
            animRotZ = baseRotZ;
         } else if (data.elapsedSeconds() < 1.125F) {
            animRotZ = shakeZ;
         } else {
            animRotZ = baseRotZ;
         }

         transforms.position(0.0F, basePosY + animPosY, 0.0F);
         transforms.rotation(baseRotX + animRotX, 0.0F, animRotZ, true);
      })
      .addAnimation("rodLayer1Rot", (data, transforms) -> transforms.rotation(-data.animScale() * 5.0F, 0.0F, 0.0F, true))
      .addAnimation("rodLayer1", (data, transforms) -> {
         transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 75.0F), 0.0F);
         float yRotSpeed;
         if (data.elapsedSeconds() < 1.0F) {
            yRotSpeed = 300.0F;
         } else if (data.elapsedSeconds() < 1.25F) {
            float progress = (data.elapsedSeconds() - 1.0F) / 0.25F;
            yRotSpeed = Mth.lerp(progress, 300.0F, 150.0F);
         } else {
            yRotSpeed = 150.0F;
         }

         transforms.rotation(0.0F, -data.ageInSeconds() * yRotSpeed, MathAnim.cosWave(data.ageInSeconds(), 250.0F, -5.0F, 0.0F), true);
      })
      .addAnimation("rodLayer2Rot", (data, transforms) -> {
         transforms.position(0.0F, 0.0F, data.animScale() * 2.0F);
         transforms.rotation(-data.animScale() * 7.5F, 0.0F, 0.0F, true);
      })
      .addAnimation("rodLayer2", (data, transforms) -> {
         transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, -25.0F), 0.0F);
         float yRotSpeed;
         if (data.elapsedSeconds() < 1.0F) {
            yRotSpeed = 250.0F;
         } else if (data.elapsedSeconds() < 1.25F) {
            float progress = (data.elapsedSeconds() - 1.0F) / 0.25F;
            yRotSpeed = Mth.lerp(progress, 250.0F, 125.0F);
         } else {
            yRotSpeed = 125.0F;
         }

         transforms.rotation(0.0F, data.ageInSeconds() * yRotSpeed, MathAnim.cosWave(data.ageInSeconds(), 250.0F, -5.0F, 100.0F), true);
      })
      .addAnimation("rodLayer3Rot", (data, transforms) -> {
         transforms.position(0.0F, 0.0F, data.animScale() * 5.0F);
         transforms.rotation(-data.animScale() * 10.0F, 0.0F, 0.0F, true);
      })
      .addAnimation("rodLayer3", (data, transforms) -> {
         transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, -75.0F), 0.0F);
         float yRotSpeed;
         if (data.elapsedSeconds() < 0.875F) {
            yRotSpeed = 200.0F;
         } else if (data.elapsedSeconds() < 1.25F) {
            float progress = (data.elapsedSeconds() - 0.875F) / 0.375F;
            yRotSpeed = Mth.lerp(progress, 200.0F, 100.0F);
         } else {
            yRotSpeed = 100.0F;
         }

         transforms.rotation(0.0F, data.ageInSeconds() * yRotSpeed, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 7.5F, 75.0F), true);
      })
      .addAnimation("shieldLayer1Rot", (data, transforms) -> {
         transforms.position(0.0F, 0.0F, data.animScale() * 4.0F);
         transforms.rotation(-data.animScale() * 8.75F, 0.0F, 0.0F, true);
      })
      .addAnimation("shieldLayer1", (data, transforms) -> {
         float basePosY = MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, -50.0F);
         float animPosY;
         if (data.elapsedSeconds() < 0.5F) {
            animPosY = Mth.lerp(data.elapsedSeconds() / 0.5F, 0.0F, 21.0F);
         } else if (data.elapsedSeconds() < 1.0F) {
            animPosY = Mth.lerp((data.elapsedSeconds() - 0.5F) / 0.5F, 21.0F, 0.0F);
         } else {
            animPosY = 0.0F;
         }

         transforms.position(0.0F, basePosY + animPosY, 0.0F);
         transforms.rotation(-MathAnim.cosWave(data.ageInSeconds(), 250.0F, 15.0F, 50.0F), -data.ageInSeconds() * 250.0F, 0.0F, true);
      })
      .addAnimation("shieldLayer2Rot", (data, transforms) -> {
         transforms.position(0.0F, 0.0F, data.animScale());
         transforms.rotation(-data.animScale() * 6.25F, 0.0F, 0.0F, true);
      })
      .addAnimation("shieldLayer2", (data, transforms) -> {
         float basePosY = MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 25.0F);
         float animPosY;
         if (data.elapsedSeconds() < 0.25F) {
            animPosY = Mth.lerp(data.elapsedSeconds() / 0.25F, 0.0F, -19.0F);
         } else if (data.elapsedSeconds() < 0.625F) {
            animPosY = -19.0F;
         } else if (data.elapsedSeconds() < 1.0F) {
            animPosY = Mth.lerp((data.elapsedSeconds() - 0.625F) / 0.375F, -19.0F, 6.0F);
         } else if (data.elapsedSeconds() < 1.25F) {
            animPosY = Mth.lerp((data.elapsedSeconds() - 1.0F) / 0.25F, 6.0F, 0.0F);
         } else {
            animPosY = 0.0F;
         }

         float rotProgress;
         if (data.elapsedSeconds() < 0.5F) {
            rotProgress = 0.0F;
         } else if (data.elapsedSeconds() < 1.0F) {
            rotProgress = (data.elapsedSeconds() - 0.5F) / 0.5F;
         } else {
            rotProgress = 1.0F;
         }

         transforms.position(0.0F, basePosY + animPosY, 0.0F);
         transforms.rotation(
            -MathAnim.cosWave(data.ageInSeconds(), 250.0F, -10.0F, 25.0F) * rotProgress, data.ageInSeconds() * 250.0F * rotProgress, 0.0F, true
         );
      })
      .addAnimation("coreParts", (data, transforms) -> transforms.position(0.0F, 0.0F, data.animScale() * 1.5F))
      .addAnimation("core", (data, transforms) -> {
         float pulsing = 1.0F + MathAnim.cosWave(data.ageInSeconds(), 1000.0F, 0.25F, 0.0F);
         float scale;
         if (data.elapsedSeconds() < 1.125F) {
            scale = pulsing;
         } else if (data.elapsedSeconds() < 1.25F) {
            scale = Mth.lerp((data.elapsedSeconds() - 1.125F) / 0.125F, pulsing, 1.0F);
         } else {
            scale = 1.0F;
         }

         transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 0.0F), 0.0F);
         transforms.rotation(-data.ageInSeconds() * 200.0F, -data.ageInSeconds() * 250.0F, 0.0F, true);
         transforms.uniformScale(scale);
      })
      .addAnimation("coreExterior", (data, transforms) -> transforms.rotation(0.0F, data.ageInSeconds() * 100.0F, data.ageInSeconds() * 100.0F, true))
      .addAnimation(
         "coreRings",
         (data, transforms) -> transforms.rotation(0.0F, data.ageInSeconds() * 200.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, -25.0F, -50.0F), true)
      )
      .build();
   public static final MathAnimationDefinition IDLE = MathAnimationDefinition.Builder.withLength(0.0F)
      .addAnimation(
         "everything",
         (data, transforms) -> transforms.position(
            0.0F, data.animScale() * 2.0F + MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 125.0F), -data.animScale() * 2.0F
         )
      )
      .addAnimation(
         "head",
         (data, transforms) -> {
            transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 50.0F), 0.0F);
            transforms.rotation(
               -MathAnim.cosWave(data.ageInSeconds(), 250.0F, -3.5F, -50.0F), 0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, -3.5F, 50.0F), true
            );
         }
      )
      .addAnimation(
         "rodLayer1",
         (data, transforms) -> {
            transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 75.0F), 0.0F);
            MutantBlaze blaze = null;
            if (data.level() != null && data.level().getEntity(data.entityId()) instanceof MutantBlaze) {
               blaze = (MutantBlaze)data.level().getEntity(data.entityId());
            }

            transforms.rotation(
               0.0F,
               blaze == null || !blaze.deathAnimation.isStarted() && !blaze.rodShotAnimation.isStarted() ? -data.ageInSeconds() * 150.0F : 0.0F,
               MathAnim.cosWave(data.ageInSeconds(), 250.0F, -5.0F, 0.0F),
               true
            );
         }
      )
      .addAnimation(
         "rodLayer2",
         (data, transforms) -> {
            transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, -25.0F), 0.0F);
            MutantBlaze blaze = null;
            if (data.level() != null && data.level().getEntity(data.entityId()) instanceof MutantBlaze) {
               blaze = (MutantBlaze)data.level().getEntity(data.entityId());
            }

            transforms.rotation(
               0.0F,
               blaze != null && blaze.deathAnimation.isStarted() ? 0.0F : data.ageInSeconds() * 125.0F,
               MathAnim.cosWave(data.ageInSeconds(), 250.0F, -5.0F, 100.0F),
               true
            );
         }
      )
      .addAnimation(
         "rodLayer3",
         (data, transforms) -> {
            transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, -75.0F), 0.0F);
            MutantBlaze blaze = null;
            if (data.level() != null && data.level().getEntity(data.entityId()) instanceof MutantBlaze) {
               blaze = (MutantBlaze)data.level().getEntity(data.entityId());
            }

            transforms.rotation(
               0.0F,
               blaze != null && blaze.deathAnimation.isStarted() ? 0.0F : data.ageInSeconds() * 100.0F,
               MathAnim.cosWave(data.ageInSeconds(), 250.0F, 7.5F, 75.0F),
               true
            );
         }
      )
      .addAnimation("shieldLayer1", (data, transforms) -> {
         transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, -50.0F), 0.0F);
         transforms.rotation(-MathAnim.cosWave(data.ageInSeconds(), 250.0F, 15.0F, 50.0F), -data.ageInSeconds() * 250.0F, 0.0F, true);
      })
      .addAnimation("shieldLayer2", (data, transforms) -> {
         transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 25.0F), 0.0F);
         transforms.rotation(-MathAnim.cosWave(data.ageInSeconds(), 250.0F, -10.0F, 25.0F), data.ageInSeconds() * 250.0F, 0.0F, true);
      })
      .addAnimation("core", (data, transforms) -> {
         transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 0.0F), 0.0F);
         transforms.rotation(-data.ageInSeconds() * 200.0F, -data.ageInSeconds() * 250.0F, 0.0F, true);
      })
      .addAnimation("coreExterior", (data, transforms) -> transforms.rotation(0.0F, data.ageInSeconds() * 100.0F, data.ageInSeconds() * 100.0F, true))
      .addAnimation(
         "coreRings",
         (data, transforms) -> transforms.rotation(0.0F, data.ageInSeconds() * 200.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, -25.0F, -50.0F), true)
      )
      .addAnimation("rodLayer3Rot", (data, transforms) -> {
         transforms.position(0.0F, 0.0F, data.animScale() * 5.0F);
         transforms.rotation(-data.animScale() * 10.0F, 0.0F, 0.0F, true);
      })
      .addAnimation("coreParts", (data, transforms) -> transforms.position(0.0F, 0.0F, data.animScale() * 1.5F))
      .addAnimation("rodLayer2Rot", (data, transforms) -> {
         transforms.position(0.0F, 0.0F, data.animScale() * 2.0F);
         transforms.rotation(-data.animScale() * 7.5F, 0.0F, 0.0F, true);
      })
      .addAnimation("rodLayer1Rot", (data, transforms) -> transforms.rotation(-data.animScale() * 5.0F, 0.0F, 0.0F, true))
      .addAnimation("shieldLayer2Rot", (data, transforms) -> {
         transforms.position(0.0F, 0.0F, data.animScale() * 1.0F);
         transforms.rotation(-data.animScale() * 6.25F, 0.0F, 0.0F, true);
      })
      .addAnimation("shieldLayer1Rot", (data, transforms) -> {
         transforms.position(0.0F, 0.0F, data.animScale() * 4.0F);
         transforms.rotation(-data.animScale() * 8.75F, 0.0F, 0.0F, true);
      })
      .build();
   public static final MathAnimationDefinition ROD_SHOT_MATH = MathAnimationDefinition.Builder.withLength(5.25F)
      .addAnimation("rodLayer1", (data, transforms) -> {
         float rotSpeed;
         if (data.elapsedSeconds() < 1.5F) {
            rotSpeed = 150.0F;
         } else if (data.elapsedSeconds() < 3.5F) {
            rotSpeed = Mth.lerp((data.elapsedSeconds() - 1.5F) / 2.0F, 300.0F, 600.0F);
         } else if (data.elapsedSeconds() < 4.5F) {
            rotSpeed = 300.0F;
         } else {
            rotSpeed = 150.0F;
         }

         transforms.rotation(0.0F, -data.ageInSeconds() * rotSpeed, 0.0F, true);
      })
      .addAnimation("rodRotation", (data, transforms) -> shotRodRotation(data, transforms, 250.0F, 10.0F))
      .addAnimation("rodRotation2", (data, transforms) -> shotRodRotation(data, transforms, 100.0F, 15.0F))
      .addAnimation("rodRotation3", (data, transforms) -> shotRodRotation(data, transforms, 20.0F, 100.0F))
      .addAnimation("rodRotation4", (data, transforms) -> shotRodRotation(data, transforms, 5.0F, 50.0F))
      .addAnimation("rodRotation5", (data, transforms) -> shotRodRotation(data, transforms, 50.0F, 100.0F))
      .addAnimation("rodRotation6", (data, transforms) -> shotRodRotation(data, transforms, 500.0F, 15.0F))
      .addAnimation("rodRotation7", (data, transforms) -> shotRodRotation(data, transforms, 1000.0F, 10.0F))
      .addAnimation("rodRotation8", (data, transforms) -> shotRodRotation(data, transforms, 10.0F, 10.0F))
      .addAnimation("rodRotation9", (data, transforms) -> shotRodRotation(data, transforms, 400.0F, 15.0F))
      .addAnimation("rodRotation10", (data, transforms) -> shotRodRotation(data, transforms, 300.0F, 150.0F))
      .addAnimation("rodRotation11", (data, transforms) -> shotRodRotation(data, transforms, 500.0F, 50.0F))
      .addAnimation("rodRotation12", (data, transforms) -> shotRodRotation(data, transforms, 50.0F, 250.0F))
      .addAnimation("rodRotation13", (data, transforms) -> shotRodRotation(data, transforms, 200.0F, 5.0F))
      .addAnimation("rodRotation14", (data, transforms) -> shotRodRotation(data, transforms, 300.0F, 50.0F))
      .addAnimation("rodRotation15", (data, transforms) -> shotRodRotation(data, transforms, 400.0F, 100.0F))
      .build();
   public static final MathAnimationDefinition STUNNED = MathAnimationDefinition.Builder.withLength(10.1667F)
      .addAnimation("everything", (data, transforms) -> {
         transforms.position(0.0F, data.animScale() * 2.0F + MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 125.0F), -data.animScale() * 2.0F);
         float zRot;
         if (data.elapsedSeconds() < 8.5F) {
            zRot = 0.0F;
         } else if (data.elapsedSeconds() < 9.0F) {
            zRot = MathAnim.cosWave(data.ageInSeconds(), 5000.0F, -2.0F, 50.0F);
         } else if (data.elapsedSeconds() < 9.0833F) {
            zRot = Mth.lerp(1.0F - (data.elapsedSeconds() - 9.0F) / 0.0833F, MathAnim.cosWave(data.ageInSeconds(), 5000.0F, -2.0F, 50.0F), 0.0F);
         } else {
            zRot = 0.0F;
         }

         transforms.rotation(0.0F, 0.0F, zRot, true);
      })
      .addAnimation("head", (data, transforms) -> {
         float basePosY = MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 50.0F);
         float baseRotX = -MathAnim.cosWave(data.ageInSeconds(), 250.0F, -3.5F, -50.0F);
         float baseRotZ = MathAnim.cosWave(data.ageInSeconds(), 250.0F, -3.5F, 50.0F);
         float yPos;
         if (data.elapsedSeconds() < 0.375F) {
            yPos = basePosY + Mth.lerp(data.elapsedSeconds() / 0.375F, 0.0F, 3.0F);
         } else if (data.elapsedSeconds() < 0.875F) {
            yPos = basePosY + Mth.lerp((data.elapsedSeconds() - 0.375F) / 0.5F, 3.0F, -5.0F);
         } else if (data.elapsedSeconds() < 7.25F) {
            yPos = basePosY - 5.0F;
         } else if (data.elapsedSeconds() < 8.25F) {
            yPos = basePosY + Mth.lerp(data.elapsedSeconds() - 7.25F, -5.0F, 0.0F);
         } else if (data.elapsedSeconds() < 8.875F) {
            yPos = Mth.lerp((data.elapsedSeconds() - 8.25F) / 0.625F, basePosY, -0.5F);
         } else if (data.elapsedSeconds() < 9.25F) {
            yPos = Mth.lerp((data.elapsedSeconds() - 8.875F) / 0.375F, -0.5F, basePosY + 7.0F);
         } else if (data.elapsedSeconds() < 9.625F) {
            yPos = basePosY + 7.0F;
         } else if (data.elapsedSeconds() < 10.0F) {
            yPos = Mth.lerp((data.elapsedSeconds() - 9.625F) / 0.375F, basePosY + 7.0F, basePosY);
         } else {
            yPos = basePosY;
         }

         float zPos;
         if (data.elapsedSeconds() < 0.375F) {
            zPos = Mth.lerp(data.elapsedSeconds() / 0.375F, 0.0F, 3.0F);
         } else if (data.elapsedSeconds() < 0.875F) {
            zPos = Mth.lerp((data.elapsedSeconds() - 0.375F) / 0.5F, 3.0F, -2.0F);
         } else if (data.elapsedSeconds() < 7.25F) {
            zPos = -2.0F;
         } else if (data.elapsedSeconds() < 8.25F) {
            zPos = Mth.lerp(data.elapsedSeconds() - 7.25F, -2.0F, 0.0F);
         } else {
            zPos = 0.0F;
         }

         float animRotX;
         if (data.elapsedSeconds() < 0.5F) {
            animRotX = Mth.lerp(data.elapsedSeconds() / 0.5F, 0.0F, -15.0F);
         } else if (data.elapsedSeconds() < 1.0F) {
            animRotX = Mth.lerp((data.elapsedSeconds() - 0.5F) / 0.5F, -15.0F, 25.0F);
         } else if (data.elapsedSeconds() < 7.25F) {
            animRotX = 25.0F;
         } else if (data.elapsedSeconds() < 8.0F) {
            animRotX = Mth.lerp((data.elapsedSeconds() - 7.25F) / 0.75F, 25.0F, 0.0F);
         } else if (data.elapsedSeconds() < 8.875F) {
            animRotX = 0.0F;
         } else if (data.elapsedSeconds() < 9.375F) {
            animRotX = Mth.lerp((data.elapsedSeconds() - 8.875F) / 0.5F, 0.0F, -25.0F);
         } else if (data.elapsedSeconds() <= 10.1667F) {
            animRotX = Mth.lerp((data.elapsedSeconds() - 9.375F) / 0.79170036F, -25.0F, 0.0F);
         } else {
            animRotX = 0.0F;
         }

         float zRot;
         if (data.elapsedSeconds() < 9.375F) {
            zRot = baseRotZ;
         } else if (data.elapsedSeconds() <= 10.1667F) {
            float shakeFade = 1.0F - (data.elapsedSeconds() - 9.375F) / 0.79170036F;
            zRot = Mth.lerp(shakeFade, baseRotZ, MathAnim.cosWave(data.ageInSeconds(), 5000.0F, -2.0F, 50.0F));
         } else {
            zRot = baseRotZ;
         }

         transforms.position(0.0F, yPos, zPos);
         transforms.rotation(baseRotX + animRotX, 0.0F, zRot, true);
      })
      .addAnimation("rodLayer1Rot", (data, transforms) -> transforms.rotation(-data.animScale() * 5.0F, 0.0F, 0.0F, true))
      .addAnimation("rodLayer1", (data, transforms) -> {
         float basePosY = MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 75.0F);
         float yPos;
         if (data.elapsedSeconds() < 0.375F) {
            yPos = basePosY + Mth.lerp(data.elapsedSeconds() / 0.375F, 0.0F, 3.0F);
         } else if (data.elapsedSeconds() < 1.125F) {
            yPos = basePosY + Mth.lerp((data.elapsedSeconds() - 0.375F) / 0.75F, 3.0F, -7.0F);
         } else if (data.elapsedSeconds() < 7.25F) {
            yPos = basePosY - 7.0F;
         } else if (data.elapsedSeconds() < 8.0F) {
            yPos = basePosY + Mth.lerp((data.elapsedSeconds() - 7.25F) / 0.75F, -7.0F, 0.0F);
         } else {
            yPos = basePosY;
         }

         float yRotSpeed;
         if (data.elapsedSeconds() < 1.5F) {
            yRotSpeed = Mth.lerp(data.elapsedSeconds() / 1.5F, 150.0F, 50.0F);
         } else if (data.elapsedSeconds() < 9.0417F) {
            yRotSpeed = 50.0F;
         } else if (data.elapsedSeconds() < 9.0833F) {
            yRotSpeed = Mth.lerp((data.elapsedSeconds() - 9.0417F) / 0.0416F, 50.0F, 150.0F);
         } else {
            yRotSpeed = 150.0F;
         }

         float zRotScale;
         if (data.elapsedSeconds() < 1.5F) {
            zRotScale = 1.0F - data.elapsedSeconds() / 1.5F;
         } else if (data.elapsedSeconds() < 9.0417F) {
            zRotScale = 0.0F;
         } else if (data.elapsedSeconds() < 9.0833F) {
            zRotScale = (data.elapsedSeconds() - 9.0417F) / 0.0416F;
         } else {
            zRotScale = 1.0F;
         }

         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(0.0F, -data.ageInSeconds() * yRotSpeed, MathAnim.cosWave(data.ageInSeconds(), 250.0F, -5.0F, 0.0F) * zRotScale, true);
      })
      .addAnimation("rodLayer2Rot", (data, transforms) -> {
         transforms.position(0.0F, 0.0F, data.animScale() * 2.0F);
         transforms.rotation(-data.animScale() * 7.5F, 0.0F, 0.0F, true);
      })
      .addAnimation("rodLayer2", (data, transforms) -> {
         float basePosY = MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, -25.0F);
         float yPos;
         if (data.elapsedSeconds() < 0.5F) {
            yPos = basePosY + Mth.lerp(data.elapsedSeconds() / 0.5F, 0.0F, 2.0F);
         } else if (data.elapsedSeconds() < 1.25F) {
            yPos = basePosY + Mth.lerp((data.elapsedSeconds() - 0.5F) / 0.75F, 2.0F, -7.0F);
         } else if (data.elapsedSeconds() < 7.125F) {
            yPos = basePosY - 7.0F;
         } else if (data.elapsedSeconds() < 7.875F) {
            yPos = basePosY + Mth.lerp((data.elapsedSeconds() - 7.125F) / 0.75F, -7.0F, 0.0F);
         } else {
            yPos = basePosY;
         }

         float yRotSpeed;
         if (data.elapsedSeconds() < 1.5F) {
            yRotSpeed = Mth.lerp(data.elapsedSeconds() / 1.5F, 125.0F, 40.0F);
         } else if (data.elapsedSeconds() < 9.0417F) {
            yRotSpeed = 40.0F;
         } else if (data.elapsedSeconds() < 9.0833F) {
            yRotSpeed = Mth.lerp((data.elapsedSeconds() - 9.0417F) / 0.0416F, 40.0F, 125.0F);
         } else {
            yRotSpeed = 125.0F;
         }

         float zRotScale;
         if (data.elapsedSeconds() < 1.5F) {
            zRotScale = 1.0F - data.elapsedSeconds() / 1.5F;
         } else if (data.elapsedSeconds() < 9.0417F) {
            zRotScale = 0.0F;
         } else if (data.elapsedSeconds() < 9.0833F) {
            zRotScale = (data.elapsedSeconds() - 9.0417F) / 0.0416F;
         } else {
            zRotScale = 1.0F;
         }

         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(0.0F, data.ageInSeconds() * yRotSpeed, MathAnim.cosWave(data.ageInSeconds(), 250.0F, -5.0F, 100.0F) * zRotScale, true);
      })
      .addAnimation("rodLayer3Rot", (data, transforms) -> {
         transforms.position(0.0F, 0.0F, data.animScale() * 5.0F);
         transforms.rotation(-data.animScale() * 10.0F, 0.0F, 0.0F, true);
      })
      .addAnimation("rodLayer3", (data, transforms) -> {
         float basePosY = MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, -75.0F);
         float yPos;
         if (data.elapsedSeconds() < 0.75F) {
            yPos = basePosY + Mth.lerp(data.elapsedSeconds() / 0.75F, 0.0F, -5.0F);
         } else if (data.elapsedSeconds() < 7.0F) {
            yPos = basePosY - 5.0F;
         } else if (data.elapsedSeconds() < 7.75F) {
            yPos = basePosY + Mth.lerp((data.elapsedSeconds() - 7.0F) / 0.75F, -5.0F, 0.0F);
         } else {
            yPos = basePosY;
         }

         float yRotSpeed;
         if (data.elapsedSeconds() < 1.5F) {
            yRotSpeed = Mth.lerp(data.elapsedSeconds() / 1.5F, 100.0F, 30.0F);
         } else if (data.elapsedSeconds() < 9.0417F) {
            yRotSpeed = 30.0F;
         } else if (data.elapsedSeconds() < 9.0833F) {
            yRotSpeed = Mth.lerp((data.elapsedSeconds() - 9.0417F) / 0.0416F, 30.0F, 100.0F);
         } else {
            yRotSpeed = 100.0F;
         }

         float zRotScale;
         if (data.elapsedSeconds() < 1.5F) {
            zRotScale = 1.0F - data.elapsedSeconds() / 1.5F;
         } else if (data.elapsedSeconds() < 9.0417F) {
            zRotScale = 0.0F;
         } else if (data.elapsedSeconds() < 9.0833F) {
            zRotScale = (data.elapsedSeconds() - 9.0417F) / 0.0416F;
         } else {
            zRotScale = 1.0F;
         }

         transforms.position(0.0F, yPos, 0.0F);
         transforms.rotation(0.0F, data.ageInSeconds() * yRotSpeed, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 7.5F, 75.0F) * zRotScale, true);
      })
      .addAnimation("shieldLayer1Rot", (data, transforms) -> {
         transforms.position(0.0F, 0.0F, data.animScale() * 4.0F);
         transforms.rotation(-data.animScale() * 8.75F, 0.0F, 0.0F, true);
      })
      .addAnimation("shieldLayer1", (data, transforms) -> {
         float baseRotX = -MathAnim.cosWave(data.ageInSeconds(), 250.0F, 15.0F, 50.0F);
         float baseRotY = -data.ageInSeconds() * 250.0F;
         float xRot;
         float yRot;
         if (data.elapsedSeconds() < 1.0F) {
            xRot = Mth.lerp(data.elapsedSeconds(), baseRotX, 0.0F);
            yRot = Mth.lerp(data.elapsedSeconds(), baseRotY, 120.0F);
         } else if (data.elapsedSeconds() < 9.0417F) {
            xRot = 0.0F;
            yRot = 120.0F;
         } else if (data.elapsedSeconds() < 9.0833F) {
            xRot = Mth.lerp((data.elapsedSeconds() - 9.0417F) / 0.0416F, 0.0F, baseRotX);
            yRot = Mth.lerp((data.elapsedSeconds() - 9.0417F) / 0.0416F, 120.0F, baseRotY);
         } else {
            xRot = baseRotX;
            yRot = baseRotY;
         }

         transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, -50.0F), 0.0F);
         transforms.rotation(xRot, yRot, 0.0F, true);
      })
      .addAnimation("shield", MutantBlazeMathAnimations::stunnedShieldScale)
      .addAnimation("shield2", MutantBlazeMathAnimations::stunnedShieldScale)
      .addAnimation("shield3", MutantBlazeMathAnimations::stunnedShieldScale)
      .addAnimation("shield4", MutantBlazeMathAnimations::stunnedShieldScale)
      .addAnimation("shield5", MutantBlazeMathAnimations::stunnedShieldScale)
      .addAnimation("shield6", MutantBlazeMathAnimations::stunnedShieldScale)
      .addAnimation("shield7", MutantBlazeMathAnimations::stunnedShieldScale)
      .addAnimation("shieldLayer2Rot", (data, transforms) -> {
         transforms.position(0.0F, 0.0F, data.animScale());
         transforms.rotation(-data.animScale() * 6.25F, 0.0F, 0.0F, true);
      })
      .addAnimation("shieldLayer2", (data, transforms) -> {
         float baseRotX = -MathAnim.cosWave(data.ageInSeconds(), 250.0F, -10.0F, 25.0F);
         float baseRotY = data.ageInSeconds() * 250.0F;
         float xRot;
         float yRot;
         if (data.elapsedSeconds() < 1.0F) {
            xRot = Mth.lerp(data.elapsedSeconds(), baseRotX, 0.0F);
            yRot = Mth.lerp(data.elapsedSeconds(), baseRotY, -180.0F);
         } else if (data.elapsedSeconds() < 9.0417F) {
            xRot = 0.0F;
            yRot = -180.0F;
         } else if (data.elapsedSeconds() < 9.0833F) {
            xRot = Mth.lerp((data.elapsedSeconds() - 9.0417F) / 0.0416F, 0.0F, baseRotX);
            yRot = Mth.lerp((data.elapsedSeconds() - 9.0417F) / 0.0416F, -180.0F, baseRotY);
         } else {
            xRot = baseRotX;
            yRot = baseRotY;
         }

         transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 25.0F), 0.0F);
         transforms.rotation(xRot, yRot, 0.0F, true);
      })
      .addAnimation("shield2", MutantBlazeMathAnimations::stunnedShieldScale)
      .addAnimation("shield3", MutantBlazeMathAnimations::stunnedShieldScale)
      .addAnimation("shield4", MutantBlazeMathAnimations::stunnedShieldScale)
      .addAnimation("shield5", MutantBlazeMathAnimations::stunnedShieldScale)
      .addAnimation("shield6", MutantBlazeMathAnimations::stunnedShieldScale)
      .addAnimation("shield7", MutantBlazeMathAnimations::stunnedShieldScale)
      .addAnimation("shieldRotation", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("shieldRotation2", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("shieldRotation3", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("shieldRotation4", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("shieldRotation5", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("shieldRotation6", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("shieldRotation7", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("coreParts", (data, transforms) -> {
         float yPos;
         if (data.elapsedSeconds() < 0.5F) {
            yPos = Mth.lerp(data.elapsedSeconds() / 0.5F, 0.0F, -8.0F);
         } else if (data.elapsedSeconds() < 7.0F) {
            yPos = -8.0F;
         } else if (data.elapsedSeconds() < 8.0F) {
            yPos = Mth.lerp(data.elapsedSeconds() - 7.0F, -8.0F, 0.0F);
         } else {
            yPos = 0.0F;
         }

         transforms.position(0.0F, yPos, data.animScale() * 1.5F);
      })
      .addAnimation("core", (data, transforms) -> {
         float xRotSpeed;
         float yRotSpeed;
         if (data.elapsedSeconds() < 1.0F) {
            xRotSpeed = 200.0F;
            yRotSpeed = 250.0F;
         } else if (data.elapsedSeconds() < 9.0833F) {
            xRotSpeed = 100.0F;
            yRotSpeed = 125.0F;
         } else if (data.elapsedSeconds() < 9.125F) {
            xRotSpeed = Mth.lerp((data.elapsedSeconds() - 9.0833F) / 0.041700363F, 100.0F, 200.0F);
            yRotSpeed = Mth.lerp((data.elapsedSeconds() - 9.0833F) / 0.041700363F, 125.0F, 250.0F);
         } else {
            xRotSpeed = 200.0F;
            yRotSpeed = 250.0F;
         }

         transforms.position(0.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, 0.5F, 0.0F), 0.0F);
         transforms.rotation(-data.ageInSeconds() * xRotSpeed, -data.ageInSeconds() * yRotSpeed, 0.0F, true);
         float scale;
         if (data.elapsedSeconds() < 7.75F) {
            scale = 1.0F;
         } else if (data.elapsedSeconds() < 9.0F) {
            scale = Mth.lerp((data.elapsedSeconds() - 7.75F) / 1.25F, 1.0F, 0.5F);
         } else if (data.elapsedSeconds() < 9.125F) {
            scale = Mth.lerp((data.elapsedSeconds() - 9.0F) / 0.125F, 0.5F, 1.75F);
         } else if (data.elapsedSeconds() < 9.25F) {
            scale = 1.75F;
         } else if (data.elapsedSeconds() < 9.5F) {
            scale = Mth.lerp((data.elapsedSeconds() - 9.25F) / 0.25F, 1.75F, 1.0F);
         } else {
            scale = 1.0F;
         }

         transforms.uniformScale(scale);
      })
      .addAnimation("coreExterior", (data, transforms) -> {
         float yRotSpeed;
         float xRotSpeed;
         if (data.elapsedSeconds() < 1.0F) {
            yRotSpeed = -100.0F;
            xRotSpeed = 100.0F;
         } else if (data.elapsedSeconds() < 9.0833F) {
            yRotSpeed = -50.0F;
            xRotSpeed = 50.0F;
         } else if (data.elapsedSeconds() < 9.125F) {
            float progress = (data.elapsedSeconds() - 9.0833F) / 0.041700363F;
            yRotSpeed = Mth.lerp(progress, -50.0F, -100.0F);
            xRotSpeed = Mth.lerp(progress, 50.0F, 100.0F);
         } else {
            yRotSpeed = -100.0F;
            xRotSpeed = 100.0F;
         }

         transforms.rotation(0.0F, data.ageInSeconds() * yRotSpeed, data.ageInSeconds() * xRotSpeed, true);
      })
      .addAnimation(
         "coreRings",
         (data, transforms) -> transforms.rotation(0.0F, data.ageInSeconds() * 200.0F, MathAnim.cosWave(data.ageInSeconds(), 250.0F, -25.0F, -50.0F), true)
      )
      .addAnimation("rodRotation", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation2", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation3", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation4", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation5", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation6", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation7", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation8", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation9", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation10", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation11", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation12", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation13", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation14", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation15", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation16", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation17", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation18", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation19", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation20", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation21", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation22", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation23", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation24", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation25", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation26", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation27", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation28", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation29", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation30", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation31", MutantBlazeMathAnimations::stunnedRodPosition)
      .addAnimation("rodRotation32", MutantBlazeMathAnimations::stunnedRodPosition)
      .build();
   public static final MathAnimationDefinition DEATH_MATH = MathAnimationDefinition.Builder.withLength(10.75F)
      .addAnimation(
         "everything",
         (data, transforms) -> transforms.rotation(
            0.0F,
            0.0F,
            MathAnim.cosWave(
               data.ageInSeconds(), 5000.0F, data.elapsedSeconds() <= 10.0F ? Math.max(0.0F, -3.5F * ((data.elapsedSeconds() - 1.0F) / 9.0F)) : 0.0F, 0.0F
            ),
            true
         )
      )
      .addAnimation("rodLayer1", (data, transforms) -> {
         float rotSpeed;
         if (data.elapsedSeconds() < 1.0F) {
            rotSpeed = 150.0F;
         } else {
            rotSpeed = Mth.lerp((data.elapsedSeconds() - 1.0F) / 9.0F, 150.0F, 600.0F);
         }

         transforms.rotation(0.0F, -data.ageInSeconds() * rotSpeed, 0.0F, true);
      })
      .addAnimation("rodLayer2", (data, transforms) -> {
         float rotSpeed;
         if (data.elapsedSeconds() < 1.0F) {
            rotSpeed = 125.0F;
         } else {
            rotSpeed = Mth.lerp((data.elapsedSeconds() - 1.0F) / 9.0F, 125.0F, 500.0F);
         }

         transforms.rotation(0.0F, data.ageInSeconds() * rotSpeed, 0.0F, true);
      })
      .addAnimation("rodLayer3", (data, transforms) -> {
         float rotSpeed;
         if (data.elapsedSeconds() < 1.0F) {
            rotSpeed = 100.0F;
         } else {
            rotSpeed = Mth.lerp((data.elapsedSeconds() - 1.0F) / 9.0F, 100.0F, 400.0F);
         }

         transforms.rotation(0.0F, data.ageInSeconds() * rotSpeed, 0.0F, true);
      })
      .build();

   private static void shotRodRotation(AnimationData data, AnimationTransformation transforms, float xStartSpeed, float zStartSpeed) {
      float xRotSpeed = data.elapsedSeconds() < 1.5F
         ? data.elapsedSeconds() / 1.5F * xStartSpeed
         : (data.elapsedSeconds() < 5.0F ? Mth.lerp((data.elapsedSeconds() - 1.5F) / 3.5F, xStartSpeed, 400.0F) : 0.0F);
      float zRotSpeed = data.elapsedSeconds() < 1.5F
         ? data.elapsedSeconds() / 1.5F * zStartSpeed
         : (data.elapsedSeconds() < 5.0F ? Mth.lerp((data.elapsedSeconds() - 1.5F) / 3.5F, zStartSpeed, 100.0F) : 0.0F);
      transforms.rotation(-data.elapsedSeconds() * xRotSpeed, 0.0F, MathAnim.cosWave(data.elapsedSeconds(), zRotSpeed, -50.0F, 0.0F), true);
   }

   private static void stunnedShieldScale(AnimationData data, AnimationTransformation transforms) {
      float scale;
      if (data.elapsedSeconds() < 1.0F) {
         scale = 1.0F;
      } else if (data.elapsedSeconds() < 1.125F) {
         scale = Mth.lerp((data.elapsedSeconds() - 1.0F) / 0.125F, 1.0F, 1.25F);
      } else if (data.elapsedSeconds() < 1.25F) {
         scale = Mth.lerp((data.elapsedSeconds() - 1.125F) / 0.125F, 1.25F, 0.0F);
      } else if (data.elapsedSeconds() < 7.75F) {
         scale = 0.0F;
      } else if (data.elapsedSeconds() < 7.875F) {
         scale = Mth.lerp((data.elapsedSeconds() - 7.75F) / 0.125F, 0.0F, 1.25F);
      } else if (data.elapsedSeconds() < 8.0F) {
         scale = Mth.lerp((data.elapsedSeconds() - 7.875F) / 0.125F, 1.25F, 1.0F);
      } else {
         scale = 1.0F;
      }

      transforms.uniformScale(scale);
   }

   private static void stunnedRodPosition(AnimationData data, AnimationTransformation transforms) {
      float zPos;
      if (data.elapsedSeconds() < 7.75F) {
         zPos = 0.0F;
      } else if (data.elapsedSeconds() < 9.0F) {
         zPos = Mth.lerp((data.elapsedSeconds() - 7.75F) / 1.25F, 0.0F, 12.0F);
      } else if (data.elapsedSeconds() < 9.125F) {
         zPos = Mth.lerp((data.elapsedSeconds() - 9.0F) / 0.125F, 12.0F, -13.0F);
      } else if (data.elapsedSeconds() < 9.5F) {
         zPos = Mth.lerp((data.elapsedSeconds() - 9.125F) / 0.375F, -13.0F, 0.0F);
      } else {
         zPos = 0.0F;
      }

      transforms.position(0.0F, 0.0F, zPos);
   }
}
