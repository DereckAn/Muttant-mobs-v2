package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.animation.keyframe_animations.definition.MutantHoglinKeyframeAnimations;
import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import com.alexander.mutantmore.animation.sine_wave_animations.definition.MutantHoglinSineWaveAnimations;
import com.alexander.mutantmore.client.MutantHoglinRenderState;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class MutantHoglinModel extends EntityModel<MutantHoglinRenderState> {
   public final ModelPart everything;
   public final ModelPart body;
   public final ModelPart chest;
   public final ModelPart neck;
   public final ModelPart head;
   public final ModelPart leftEar;
   public final ModelPart rightEar;
   public final ModelPart tail;
   public final ModelPart leftBackLeg;
   public final ModelPart rightBackLeg;
   public final ModelPart leftFrontLeg;
   public final ModelPart leftFrontLegLower;
   public final ModelPart rightFrontLeg;
   public final ModelPart rightFrontLegLower;
   private final KeyframeAnimation death;
   private final KeyframeAnimation dance;
   private final KeyframeAnimation stomp;
   private final KeyframeAnimation prepareCharge;
   private final KeyframeAnimation kick;
   private final KeyframeAnimation attack;
   private final KeyframeAnimation intro;
   private final KeyframeAnimation novelty;

   public MutantHoglinModel(ModelPart root) {
      super(root);
      this.everything = root.getChild("everything");
      this.body = this.everything.getChild("body");
      this.chest = this.body.getChild("chest");
      this.neck = this.chest.getChild("neck");
      this.head = this.neck.getChild("head");
      this.leftEar = this.head.getChild("leftEar");
      this.rightEar = this.head.getChild("rightEar");
      this.tail = this.body.getChild("tail");
      this.leftBackLeg = this.everything.getChild("leftBackLeg");
      this.rightBackLeg = this.everything.getChild("rightBackLeg");
      this.leftFrontLeg = this.everything.getChild("leftFrontLeg");
      this.leftFrontLegLower = this.leftFrontLeg.getChild("leftFrontLegLower");
      this.rightFrontLeg = this.everything.getChild("rightFrontLeg");
      this.rightFrontLegLower = this.rightFrontLeg.getChild("rightFrontLegLower");
      this.death = com.alexander.mutantmore.animation.LenientBake.bake(MutantHoglinKeyframeAnimations.MUTANT_HOGLIN_DEATH, root);
      this.dance = com.alexander.mutantmore.animation.LenientBake.bake(MutantHoglinKeyframeAnimations.MUTANT_HOGLIN_DANCE, root);
      this.stomp = com.alexander.mutantmore.animation.LenientBake.bake(MutantHoglinKeyframeAnimations.MUTANT_HOGLIN_STOMP, root);
      this.prepareCharge = com.alexander.mutantmore.animation.LenientBake.bake(MutantHoglinKeyframeAnimations.MUTANT_HOGLIN_PREPARE_CHARGE, root);
      this.kick = com.alexander.mutantmore.animation.LenientBake.bake(MutantHoglinKeyframeAnimations.MUTANT_HOGLIN_KICK, root);
      this.attack = com.alexander.mutantmore.animation.LenientBake.bake(MutantHoglinKeyframeAnimations.MUTANT_HOGLIN_ATTACK, root);
      this.intro = com.alexander.mutantmore.animation.LenientBake.bake(MutantHoglinKeyframeAnimations.MUTANT_HOGLIN_INTRO, root);
      this.novelty = com.alexander.mutantmore.animation.LenientBake.bake(MutantHoglinKeyframeAnimations.MUTANT_HOGLIN_NOVELTY, root);
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
      PartDefinition body = everything.addOrReplaceChild(
         "body",
         CubeListBuilder.create()
            .texOffs(67, 0)
            .addBox(-11.0F, -11.0F, -36.0F, 22.0F, 22.0F, 36.0F, new CubeDeformation(0.0F))
            .texOffs(193, 205)
            .addBox(0.1F, -32.0F, -36.0F, 0.0F, 21.0F, 28.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -19.0F, 27.0F)
      );
      PartDefinition chest = body.addOrReplaceChild(
         "chest",
         CubeListBuilder.create()
            .texOffs(29, 60)
            .addBox(-15.0F, -15.0F, -24.0F, 30.0F, 28.0F, 24.0F, new CubeDeformation(0.0F))
            .texOffs(192, 163)
            .addBox(0.0F, -39.0F, -24.0F, 0.0F, 24.0F, 32.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -1.0F, -28.0F)
      );
      PartDefinition neck = chest.addOrReplaceChild(
         "neck",
         CubeListBuilder.create()
            .texOffs(15, 65)
            .addBox(-5.0F, -5.0F, -8.0F, 10.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(203, 151)
            .addBox(-0.1F, -21.0F, -8.0F, 0.0F, 16.0F, 14.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, -24.0F)
      );
      PartDefinition head = neck.addOrReplaceChild(
         "head",
         CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -6.0F, -19.0F, 14.0F, 6.0F, 19.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -3.0F, -4.0F, 1.1781F, 0.0F, 0.0F)
      );
      PartDefinition leftEar = head.addOrReplaceChild(
         "leftEar",
         CubeListBuilder.create().texOffs(47, 0).mirror().addBox(0.0F, 0.0F, -2.5F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offsetAndRotation(7.0F, -3.0F, -1.5F, -1.5708F, 0.0F, 0.0F)
      );
      PartDefinition tusks = head.addOrReplaceChild(
         "tusks",
         CubeListBuilder.create()
            .texOffs(87, 162)
            .mirror()
            .addBox(-10.0F, -13.0F, -2.0F, 3.0F, 18.0F, 4.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(87, 162)
            .addBox(7.0F, -13.0F, -2.0F, 3.0F, 18.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(57, 162)
            .addBox(7.0F, -13.0F, 2.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(58, 163)
            .mirror()
            .addBox(-10.0F, -13.0F, 2.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(0.0F, -3.0F, -14.0F)
      );
      PartDefinition rightEar = head.addOrReplaceChild(
         "rightEar",
         CubeListBuilder.create().texOffs(47, 0).addBox(-8.0F, 0.0F, -2.5F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-7.0F, -3.0F, -1.5F, -1.5708F, 0.0F, 0.0F)
      );
      PartDefinition tail = body.addOrReplaceChild(
         "tail",
         CubeListBuilder.create().texOffs(2, 64).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 30.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -4.0F, 0.5F)
      );
      PartDefinition leftBackLeg = everything.addOrReplaceChild(
         "leftBackLeg",
         CubeListBuilder.create().texOffs(2, 28).addBox(-2.0F, -1.0F, -5.0F, 12.0F, 22.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offset(9.0F, -21.0F, 26.0F)
      );
      PartDefinition rightBackLeg = everything.addOrReplaceChild(
         "rightBackLeg",
         CubeListBuilder.create()
            .texOffs(2, 28)
            .mirror()
            .addBox(-10.0F, -1.0F, -5.0F, 12.0F, 22.0F, 12.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(-9.0F, -21.0F, 25.0F)
      );
      PartDefinition leftFrontLeg = everything.addOrReplaceChild(
         "leftFrontLeg",
         CubeListBuilder.create()
            .texOffs(59, 114)
            .mirror()
            .addBox(-6.0F, -4.0F, -6.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(21.0F, -50.0F, -12.0F)
      );
      PartDefinition leftFrontLegLower = leftFrontLeg.addOrReplaceChild(
         "leftFrontLegLower",
         CubeListBuilder.create()
            .texOffs(109, 116)
            .mirror()
            .addBox(-8.0F, 0.0F, -8.0F, 16.0F, 24.0F, 16.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(0.0F, 26.0F, 0.0F)
      );
      PartDefinition rightFrontLeg = everything.addOrReplaceChild(
         "rightFrontLeg",
         CubeListBuilder.create().texOffs(59, 114).addBox(-6.0F, -4.0F, -6.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-21.0F, -50.0F, -12.0F)
      );
      PartDefinition rightFrontLegLower = rightFrontLeg.addOrReplaceChild(
         "rightFrontLegLower",
         CubeListBuilder.create().texOffs(109, 116).addBox(-8.0F, 0.0F, -8.0F, 16.0F, 24.0F, 16.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 26.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 256, 256);
   }

   @Override
   public void setupAnim(MutantHoglinRenderState state) {
      super.setupAnim(state);
      boolean idleKeyframes = state.notCurrentlyPlayingKeyframeAnimation;
      boolean shouldPlayChargingAnimation = state.charging && idleKeyframes;
      boolean shouldPlayWalkAnimation = state.movingOnLand && !shouldPlayChargingAnimation && idleKeyframes;
      boolean shouldPlayIdleAnimation = !shouldPlayWalkAnimation && !shouldPlayChargingAnimation && idleKeyframes;
      this.neck.xRot = state.xRot * (float) (Math.PI / 180.0);
      this.neck.yRot = state.yRot * (float) (Math.PI / 180.0);
      float age = state.ageInTicks;
      if (state.deathTime > 0) {
         this.death.apply(state.deathAnimationState, age);
         this.dance.apply(state.danceAnimationState, age);
      } else if (state.stompAnimationTick > 0) {
         this.stomp.apply(state.stompAnimationState, age);
      } else if (state.prepareChargeAnimationTick > 0) {
         this.prepareCharge.apply(state.prepareChargeAnimationState, age, 1.5F);
      } else if (state.kickAnimationTick > 0) {
         this.kick.apply(state.kickAnimationState, age);
      } else if (state.attackAnimationTick > 0) {
         this.attack.apply(state.attackAnimationState, age);
      } else if (state.introAnimationTick > 0) {
         this.intro.apply(state.introAnimationState, age);
      } else if (state.noveltyAnimationTick > 0) {
         this.novelty.apply(state.noveltyAnimationState, age);
      } else {
         float tick = SineWaveAnimationUtils.getTick(age, true);
         MutantHoglinSineWaveAnimations.mutantHoglinChargingAnimation(this, tick, state.groundSpeed * 8.0F, shouldPlayChargingAnimation ? 1.0F : 0.0F);
         MutantHoglinSineWaveAnimations.mutantHoglinWalkAnimation(this, tick, state.walkSpeed, shouldPlayWalkAnimation ? 1.0F : 0.0F);
         MutantHoglinSineWaveAnimations.mutantHoglinIdleAnimation(this, tick, 1.0F, shouldPlayIdleAnimation ? 1.0F : 0.0F);
      }
   }
}
