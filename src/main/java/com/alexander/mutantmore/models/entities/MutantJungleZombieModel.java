package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.animation.keyframe_animations.definition.MutantJungleZombieKeyframeAnimations;
import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import com.alexander.mutantmore.animation.sine_wave_animations.definition.MutantJungleZombieSineWaveAnimations;
import com.alexander.mutantmore.client.MutantJungleZombieRenderState;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.rendertype.RenderTypes;

// ponytail: armour and held-item layers (AdvancedArmourLayer, translateToHand) skipped; they only show Halloween pumpkins / items it never holds
public class MutantJungleZombieModel extends EntityModel<MutantJungleZombieRenderState> {
   public final ModelPart everything;
   public final ModelPart pelvis;
   public final ModelPart body;
   public final ModelPart head;
   public final ModelPart leftArm;
   public final ModelPart leftArmLower;
   public final ModelPart leftVine;
   public final ModelPart leftVine2;
   public final ModelPart leftVine3;
   public final ModelPart leftVine4;
   public final ModelPart rightArm;
   public final ModelPart rightArmLower;
   public final ModelPart vines;
   public final ModelPart rightLeg;
   public final ModelPart rightLegLower;
   public final ModelPart leftLeg;
   public final ModelPart leftLegLower;

   private final KeyframeAnimation lowAttackSlowed;
   private final KeyframeAnimation highAttackSlowed;
   private final KeyframeAnimation punch;
   private final KeyframeAnimation tryChoke;
   private final KeyframeAnimation trySlam;
   private final KeyframeAnimation slam;
   private final KeyframeAnimation novelty;
   private final KeyframeAnimation intro;
   private final KeyframeAnimation jump;
   private final KeyframeAnimation stopResting;

   public MutantJungleZombieModel(ModelPart root) {
      super(root, RenderTypes::entityTranslucent);
      this.everything = root.getChild("everything");
      this.pelvis = this.everything.getChild("pelvis");
      this.body = this.pelvis.getChild("body");
      this.head = this.body.getChild("head");
      this.leftArm = this.body.getChild("leftArm");
      this.leftArmLower = this.leftArm.getChild("leftArmLower");
      this.leftVine = this.leftArmLower.getChild("leftVine");
      this.leftVine2 = this.leftVine.getChild("leftVine2");
      this.leftVine3 = this.leftVine2.getChild("leftVine3");
      this.leftVine4 = this.leftVine3.getChild("leftVine4");
      this.rightArm = this.body.getChild("rightArm");
      this.rightArmLower = this.rightArm.getChild("rightArmLower");
      this.vines = this.body.getChild("vines");
      this.leftLeg = this.everything.getChild("leftLeg");
      this.leftLegLower = this.leftLeg.getChild("leftLegLower");
      this.rightLeg = this.everything.getChild("rightLeg");
      this.rightLegLower = this.rightLeg.getChild("rightLegLower");
      this.lowAttackSlowed = com.alexander.mutantmore.animation.LenientBake.bake(MutantJungleZombieKeyframeAnimations.MUTANT_JUNGLE_ZOMBIE_LOW_ATTACK_SLOWED, root);
      this.highAttackSlowed = com.alexander.mutantmore.animation.LenientBake.bake(MutantJungleZombieKeyframeAnimations.MUTANT_JUNGLE_ZOMBIE_HIGH_ATTACK_SLOWED, root);
      this.punch = com.alexander.mutantmore.animation.LenientBake.bake(MutantJungleZombieKeyframeAnimations.MUTANT_JUNGLE_ZOMBIE_PUNCH, root);
      this.tryChoke = com.alexander.mutantmore.animation.LenientBake.bake(MutantJungleZombieKeyframeAnimations.MUTANT_JUNGLE_ZOMBIE_TRY_CHOKE, root);
      this.trySlam = com.alexander.mutantmore.animation.LenientBake.bake(MutantJungleZombieKeyframeAnimations.MUTANT_JUNGLE_ZOMBIE_TRY_SLAM, root);
      this.slam = com.alexander.mutantmore.animation.LenientBake.bake(MutantJungleZombieKeyframeAnimations.MUTANT_JUNGLE_ZOMBIE_SLAM, root);
      this.novelty = com.alexander.mutantmore.animation.LenientBake.bake(MutantJungleZombieKeyframeAnimations.MUTANT_JUNGLE_ZOMBIE_NOVELTY, root);
      this.intro = com.alexander.mutantmore.animation.LenientBake.bake(MutantJungleZombieKeyframeAnimations.MUTANT_JUNGLE_ZOMBIE_INTRO, root);
      this.jump = com.alexander.mutantmore.animation.LenientBake.bake(MutantJungleZombieKeyframeAnimations.MUTANT_JUNGLE_ZOMBIE_JUMP, root);
      this.stopResting = com.alexander.mutantmore.animation.LenientBake.bake(MutantJungleZombieKeyframeAnimations.MUTANT_JUNGLE_ZOMBIE_STOP_RESTING, root);
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 9.0F, 2.0F));
      PartDefinition pelvis = everything.addOrReplaceChild(
         "pelvis",
         CubeListBuilder.create().texOffs(0, 44).addBox(-7.0F, -14.0F, -6.0F, 14.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition body = pelvis.addOrReplaceChild(
         "body",
         CubeListBuilder.create()
            .texOffs(0, 16)
            .addBox(-12.0F, -11.0F, -8.0F, 24.0F, 12.0F, 16.0F, new CubeDeformation(0.0F))
            .texOffs(0, 103)
            .addBox(-12.0F, -11.0F, -8.0F, 24.0F, 7.0F, 16.0F, new CubeDeformation(0.5F)),
         PartPose.offset(0.0F, -11.0F, 0.0F)
      );
      PartDefinition head = body.addOrReplaceChild(
         "head",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-4.0F, -7.6037F, -7.5837F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(32, 0)
            .addBox(-4.0F, -7.6F, -7.6F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
         PartPose.offset(0.0F, -9.0F, -2.0F)
      );
      PartDefinition leftArm = body.addOrReplaceChild(
         "leftArm",
         CubeListBuilder.create().texOffs(104, 0).addBox(-1.075F, -2.6606F, -2.829F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(12.0F, -7.0F, 1.0F)
      );
      PartDefinition leftArmLower = leftArm.addOrReplaceChild(
         "leftArmLower",
         CubeListBuilder.create().texOffs(80, 31).addBox(-4.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.01F)),
         PartPose.offset(2.925F, 13.3394F, 0.171F)
      );
      PartDefinition leftVine = leftArmLower.addOrReplaceChild(
         "leftVine",
         CubeListBuilder.create().texOffs(63, 64).addBox(-2.55F, -1.633F, -2.5283F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.01F)),
         PartPose.offset(-1.0F, 8.633F, 0.0283F)
      );
      PartDefinition leftVine2 = leftVine.addOrReplaceChild(
         "leftVine2",
         CubeListBuilder.create().texOffs(105, 55).addBox(-2.025F, -1.5F, -2.0283F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.01F)),
         PartPose.offset(0.0F, 5.0F, 0.0F)
      );
      PartDefinition leftVine3 = leftVine2.addOrReplaceChild(
         "leftVine3",
         CubeListBuilder.create().texOffs(12, 75).addBox(-1.525F, 0.5F, -1.4283F, 3.0F, 14.0F, 3.0F, new CubeDeformation(0.01F)),
         PartPose.offset(0.0F, 9.0F, -0.1F)
      );
      PartDefinition leftVine4 = leftVine3.addOrReplaceChild(
         "leftVine4",
         CubeListBuilder.create().texOffs(45, 82).addBox(-0.525F, 0.5F, -1.4283F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.01F)),
         PartPose.offset(-0.5F, 14.0F, 0.5F)
      );
      PartDefinition rightArm = body.addOrReplaceChild(
         "rightArm",
         CubeListBuilder.create().texOffs(104, 0).addBox(-5.0F, -3.0F, -3.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-12.0F, -6.0F, 1.0F)
      );
      PartDefinition rightArmLower = rightArm.addOrReplaceChild(
         "rightArmLower",
         CubeListBuilder.create().texOffs(104, 22).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.01F)),
         PartPose.offset(-2.0F, 13.0F, 0.0F)
      );
      PartDefinition vines = body.addOrReplaceChild(
         "vines",
         CubeListBuilder.create().texOffs(64, 79).addBox(-12.0F, 0.4F, 0.5F, 24.0F, 9.0F, -1.0F, new CubeDeformation(0.5F)),
         PartPose.offset(0.0F, -11.4F, -8.5F)
      );
      PartDefinition rightLeg = everything.addOrReplaceChild(
         "rightLeg",
         CubeListBuilder.create().texOffs(80, 0).addBox(-3.0F, -0.5F, -3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.5F, 0.0F, 1.0F)
      );
      PartDefinition rightLegLower = rightLeg.addOrReplaceChild(
         "rightLegLower",
         CubeListBuilder.create().texOffs(80, 17).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.1F)),
         PartPose.offset(0.0F, 10.0F, 0.0F)
      );
      PartDefinition leftLeg = everything.addOrReplaceChild(
         "leftLeg",
         CubeListBuilder.create().texOffs(80, 0).addBox(-3.0F, -0.5F, -3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.5F, 0.0F, 1.0F)
      );
      PartDefinition leftLegLower = leftLeg.addOrReplaceChild(
         "leftLegLower",
         CubeListBuilder.create().texOffs(80, 17).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.1F)),
         PartPose.offset(0.0F, 10.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 128, 128);
   }

   @Override
   public void setupAnim(MutantJungleZombieRenderState state) {
      super.setupAnim(state);
      float age = state.ageInTicks;
      boolean resting = state.restTick > 0;
      boolean idleKeyframes = state.notCurrentlyPlayingKeyframeAnimation;
      boolean shouldPlayWalkAnimation = state.movingOnLand && !resting && idleKeyframes;
      boolean shouldPlayIdleAnimation = !shouldPlayWalkAnimation && !resting && idleKeyframes;
      this.head.xRot = state.xRot * (float) (Math.PI / 180.0);
      this.head.yRot = state.yRot * (float) (Math.PI / 180.0);
      float tick = SineWaveAnimationUtils.getTick(age, true);
      if (state.downAnimationTick > 0) {
         // DOWN and CHOKE wobble with age, so they are rebuilt each frame (only while playing)
         com.alexander.mutantmore.animation.LenientBake.bake(MutantJungleZombieKeyframeAnimations.MUTANT_JUNGLE_ZOMBIE_DOWN(age), this.root()).apply(state.downAnimationState, age);
      } else if (state.introAnimationTick > 0) {
         this.intro.apply(state.introAnimationState, age);
      } else if (state.stopRestingAnimationTick > 0) {
         this.stopResting.apply(state.stopRestingAnimationState, age);
      } else if (resting) {
         MutantJungleZombieSineWaveAnimations.mutantJungleZombieRestingAnimation(this, tick, 1.0F, 1.0F);
      } else if (state.jumpAnimationTick > 0) {
         this.jump.apply(state.jumpAnimationState, age);
      } else if (state.trySlamAnimationTick > 0) {
         this.trySlam.apply(state.trySlamAnimationState, age);
         this.leftArm.xRot += state.grabArmXRot * (float) (Math.PI / 180.0);
      } else if (state.tryChokeAnimationTick > 0) {
         this.tryChoke.apply(state.tryChokeAnimationState, age);
         this.leftArm.xRot += state.grabArmXRot * (float) (Math.PI / 180.0);
      } else if (state.punchAnimationTick > 0) {
         this.punch.apply(state.punchAnimationState, age);
      } else if (state.highAttackAnimationTick > 0) {
         this.highAttackSlowed.apply(state.highAttackAnimationState, age);
      } else if (state.lowAttackAnimationTick > 0) {
         this.lowAttackSlowed.apply(state.lowAttackAnimationState, age);
      } else if (state.slamAnimationTick > 0) {
         this.slam.apply(state.slamAnimationState, age);
      } else if (state.chokeAnimationTick > 0) {
         com.alexander.mutantmore.animation.LenientBake.bake(MutantJungleZombieKeyframeAnimations.MUTANT_JUNGLE_ZOMBIE_CHOKE(age), this.root()).apply(state.chokeAnimationState, age);
      } else if (state.noveltyAnimationTick > 0) {
         this.novelty.apply(state.noveltyAnimationState, age);
      } else {
         MutantJungleZombieSineWaveAnimations.mutantJungleZombieWalkAnimation(this, tick, state.walkSpeed, shouldPlayWalkAnimation ? 1.0F : 0.0F);
         MutantJungleZombieSineWaveAnimations.mutantJungleZombieIdleAnimation(this, tick, 1.0F, shouldPlayIdleAnimation ? 1.0F : 0.0F);
      }
   }
}
