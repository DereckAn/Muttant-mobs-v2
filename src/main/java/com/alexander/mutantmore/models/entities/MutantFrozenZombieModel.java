package com.alexander.mutantmore.models.entities;

import com.mojang.blaze3d.vertex.PoseStack;
import com.alexander.mutantmore.client.armour.ArmourWearingModel;
import com.alexander.mutantmore.client.armour.ArmourWearingModel.Part;
import com.alexander.mutantmore.animation.keyframe_animations.definition.MutantFrozenZombieKeyframeAnimations;
import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import com.alexander.mutantmore.animation.sine_wave_animations.definition.MutantFrozenZombieSineWaveAnimations;
import com.alexander.mutantmore.client.MutantFrozenZombieRenderState;
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

// ponytail: armour and held-item layers skipped, same as the other mutants
public class MutantFrozenZombieModel extends EntityModel<MutantFrozenZombieRenderState> implements ArmourWearingModel {
   public final ModelPart everything;
   public final ModelPart pelvis;
   public final ModelPart body;
   public final ModelPart head;
   public final ModelPart leftArm;
   public final ModelPart leftArmLower;
   public final ModelPart rightArm;
   public final ModelPart rightArmLower;
   public final ModelPart projectile;
   public final ModelPart snowBlock;
   public final ModelPart rightLeg;
   public final ModelPart rightLegLower;
   public final ModelPart leftLeg;
   public final ModelPart leftLegLower;

   private final KeyframeAnimation roar;
   private final KeyframeAnimation snowThrow;
   private final KeyframeAnimation slam;
   private final KeyframeAnimation jump;
   private final KeyframeAnimation throwAnim;
   private final KeyframeAnimation attack;
   private final KeyframeAnimation intro;
   private final KeyframeAnimation novelty;

   public MutantFrozenZombieModel(ModelPart root) {
      super(root, RenderTypes::entityTranslucent);
      this.everything = root.getChild("everything");
      this.pelvis = this.everything.getChild("pelvis");
      this.body = this.pelvis.getChild("body");
      this.head = this.body.getChild("head");
      this.leftArm = this.body.getChild("leftArm");
      this.leftArmLower = this.leftArm.getChild("leftArmLower");
      this.rightArm = this.body.getChild("rightArm");
      this.rightArmLower = this.rightArm.getChild("rightArmLower");
      this.projectile = this.rightArmLower.getChild("projectile");
      this.leftLeg = this.everything.getChild("leftLeg");
      this.leftLegLower = this.leftLeg.getChild("leftLegLower");
      this.rightLeg = this.everything.getChild("rightLeg");
      this.rightLegLower = this.rightLeg.getChild("rightLegLower");
      this.snowBlock = this.everything.getChild("snowBlock");
      this.roar = com.alexander.mutantmore.animation.LenientBake.bake(MutantFrozenZombieKeyframeAnimations.MUTANT_FROZEN_ZOMBIE_ROAR, root);
      this.snowThrow = com.alexander.mutantmore.animation.LenientBake.bake(MutantFrozenZombieKeyframeAnimations.MUTANT_FROZEN_ZOMBIE_SNOW_THROW, root);
      this.slam = com.alexander.mutantmore.animation.LenientBake.bake(MutantFrozenZombieKeyframeAnimations.MUTANT_FROZEN_ZOMBIE_SLAM, root);
      this.jump = com.alexander.mutantmore.animation.LenientBake.bake(MutantFrozenZombieKeyframeAnimations.MUTANT_FROZEN_ZOMBIE_JUMP, root);
      this.throwAnim = com.alexander.mutantmore.animation.LenientBake.bake(MutantFrozenZombieKeyframeAnimations.MUTANT_FROZEN_ZOMBIE_THROW, root);
      this.attack = com.alexander.mutantmore.animation.LenientBake.bake(MutantFrozenZombieKeyframeAnimations.MUTANT_FROZEN_ZOMBIE_ATTACK, root);
      this.intro = com.alexander.mutantmore.animation.LenientBake.bake(MutantFrozenZombieKeyframeAnimations.MUTANT_FROZEN_ZOMBIE_INTRO, root);
      this.novelty = com.alexander.mutantmore.animation.LenientBake.bake(MutantFrozenZombieKeyframeAnimations.MUTANT_FROZEN_ZOMBIE_NOVELTY, root);
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 9.0F, 2.0F));
      PartDefinition pelvis = everything.addOrReplaceChild(
         "pelvis",
         CubeListBuilder.create().texOffs(0, 44).addBox(-7.0F, -14.0F, -6.0F, 14.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -2.0F, 0.0F)
      );
      PartDefinition body = pelvis.addOrReplaceChild(
         "body",
         CubeListBuilder.create()
            .texOffs(0, 16)
            .addBox(-12.0F, -12.0F, -8.0F, 24.0F, 12.0F, 16.0F, new CubeDeformation(0.0F))
            .texOffs(0, 86)
            .addBox(-12.0F, -12.0F, -8.0F, 24.0F, 10.0F, 16.0F, new CubeDeformation(0.25F)),
         PartPose.offset(0.0F, -10.0F, 0.0F)
      );
      PartDefinition iceSpikes = body.addOrReplaceChild("iceSpikes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
      PartDefinition cube_r1 = iceSpikes.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(0, 94)
            .mirror()
            .addBox(5.0F, -23.0F, -3.0F, 0.0F, 16.0F, 18.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, -0.2973F, -0.1308F, 0.3138F)
      );
      PartDefinition cube_r2 = iceSpikes.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create().texOffs(0, 94).addBox(0.0F, -23.0F, -1.0F, 0.0F, 16.0F, 18.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, -0.3054F, 0.0F, 0.0F)
      );
      PartDefinition cube_r3 = iceSpikes.addOrReplaceChild(
         "cube_r3",
         CubeListBuilder.create().texOffs(0, 94).addBox(-5.0F, -23.0F, -3.0F, 0.0F, 16.0F, 18.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, -0.2973F, 0.1308F, -0.3138F)
      );
      PartDefinition head = body.addOrReplaceChild(
         "head",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-4.0F, -7.6037F, -7.5837F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(32, 0)
            .addBox(-4.0F, -7.6F, -7.6F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)),
         PartPose.offset(0.0F, -9.0F, -4.0F)
      );
      PartDefinition rightArm = body.addOrReplaceChild(
         "rightArm",
         CubeListBuilder.create()
            .texOffs(104, 0)
            .addBox(-3.0F, -3.0F, -3.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(54, 46)
            .addBox(-3.0F, -3.0F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.25F)),
         PartPose.offset(-13.0F, -6.0F, 1.0F)
      );
      PartDefinition rightArmLower = rightArm.addOrReplaceChild(
         "rightArmLower",
         CubeListBuilder.create().texOffs(104, 22).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.01F)),
         PartPose.offset(0.0F, 13.0F, 0.0F)
      );
      PartDefinition projectile = rightArmLower.addOrReplaceChild(
         "projectile",
         CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, -6.5F, -23.0F, 0.0F, 13.0F, 43.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 16.5F, 1.0F)
      );
      PartDefinition projectiles_r1 = projectile.addOrReplaceChild(
         "projectiles_r1",
         CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, -6.5F, -1.0F, 0.0F, 13.0F, 43.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, -22.0F, 0.0F, 0.0F, 1.5708F)
      );
      PartDefinition leftArm = body.addOrReplaceChild(
         "leftArm",
         CubeListBuilder.create()
            .texOffs(104, 0)
            .mirror()
            .addBox(-3.0F, -3.0F, -3.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(54, 46)
            .mirror()
            .addBox(-3.0F, -3.0F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.25F))
            .mirror(false),
         PartPose.offset(12.0F, -3.0F, 0.0F)
      );
      PartDefinition leftArmLower = leftArm.addOrReplaceChild(
         "leftArmLower",
         CubeListBuilder.create()
            .texOffs(104, 22)
            .mirror()
            .addBox(-3.0F, 0.0F, -3.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.01F))
            .mirror(false),
         PartPose.offset(0.0F, 13.0F, 0.0F)
      );
      PartDefinition rightLeg = everything.addOrReplaceChild(
         "rightLeg",
         CubeListBuilder.create().texOffs(80, 0).addBox(-3.0F, -0.5F, -3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 0.0F, 1.0F)
      );
      PartDefinition rightLegLower = rightLeg.addOrReplaceChild(
         "rightLegLower",
         CubeListBuilder.create()
            .texOffs(80, 17)
            .addBox(-3.0F, -1.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.1F))
            .texOffs(104, 114)
            .addBox(-3.0F, -1.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.25F)),
         PartPose.offset(0.0F, 10.0F, 0.0F)
      );
      PartDefinition leftLeg = everything.addOrReplaceChild(
         "leftLeg",
         CubeListBuilder.create().texOffs(80, 0).addBox(-3.0F, -0.5F, -3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 0.0F, 1.0F)
      );
      PartDefinition leftLegLower = leftLeg.addOrReplaceChild(
         "leftLegLower",
         CubeListBuilder.create()
            .texOffs(80, 17)
            .addBox(-3.0F, -1.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.1F))
            .texOffs(104, 114)
            .mirror()
            .addBox(-3.0F, -1.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.25F))
            .mirror(false),
         PartPose.offset(0.0F, 10.0F, 0.0F)
      );
      PartDefinition snowBlock = everything.addOrReplaceChild(
         "snowBlock",
         CubeListBuilder.create().texOffs(128, 0).addBox(-20.0F, -20.0F, -20.0F, 40.0F, 40.0F, 40.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -5.0F, -2.0F)
      );
      return LayerDefinition.create(meshdefinition, 288, 128);
   }

   @Override
   public void setupAnim(MutantFrozenZombieRenderState state) {
      super.setupAnim(state);
      float age = state.ageInTicks;
      float tick = SineWaveAnimationUtils.getTick(age, true);
      boolean idleKeyframes = state.notCurrentlyPlayingKeyframeAnimation;
      boolean shouldPlayJumpingAnimation = state.jumping && idleKeyframes;
      boolean shouldPlayWalkAnimation = state.movingOnLand && !shouldPlayJumpingAnimation && idleKeyframes;
      boolean shouldPlayIdleAnimation = !shouldPlayWalkAnimation && !shouldPlayJumpingAnimation && idleKeyframes;
      this.head.xRot = state.xRot * (float) (Math.PI / 180.0);
      this.head.yRot = state.yRot * (float) (Math.PI / 180.0);
      if (state.downAnimationTick > 0) {
         com.alexander.mutantmore.animation.LenientBake.bake(MutantFrozenZombieKeyframeAnimations.MUTANT_FROZEN_ZOMBIE_DOWN(age), this.root()).apply(state.downAnimationState, age);
      } else if (state.roarAnimationTick > 0) {
         this.roar.apply(state.roarAnimationState, age);
      } else if (state.snowThrowAnimationTick > 0) {
         this.snowThrow.apply(state.snowThrowAnimationState, age);
      } else if (state.slamAnimationTick > 0) {
         this.slam.apply(state.slamAnimationState, age);
      } else if (state.jumpAnimationTick > 0) {
         this.jump.apply(state.jumpAnimationState, age);
      } else if (state.iciclesAnimationTick > 0) {
         com.alexander.mutantmore.animation.LenientBake.bake(MutantFrozenZombieKeyframeAnimations.MUTANT_FROZEN_ZOMBIE_ICICLES(age), this.root()).apply(state.iciclesAnimationState, age);
      } else if (state.throwAnimationTick > 0) {
         this.throwAnim.apply(state.throwAnimationState, age);
      } else if (state.attackAnimationTick > 0) {
         this.attack.apply(state.attackAnimationState, age);
      } else if (state.introAnimationTick > 0) {
         this.intro.apply(state.introAnimationState, age);
      } else if (state.noveltyAnimationTick > 0) {
         this.novelty.apply(state.noveltyAnimationState, age);
      } else {
         MutantFrozenZombieSineWaveAnimations.mutantFrozenZombieJumpingAnimation(this, tick, 1.0F, shouldPlayJumpingAnimation ? 1.0F : 0.0F);
         MutantFrozenZombieSineWaveAnimations.mutantFrozenZombieWalkAnimation(this, tick, state.walkSpeed, shouldPlayWalkAnimation ? 1.0F : 0.0F);
         MutantFrozenZombieSineWaveAnimations.mutantFrozenZombieIdleAnimation(this, tick, 1.0F, shouldPlayIdleAnimation ? 1.0F : 0.0F);
      }

      if (state.throwAnimationTick <= 0) {
         this.projectile.xScale = 0.0F;
         this.projectile.yScale = 0.0F;
         this.projectile.zScale = 0.0F;
      }

      if (state.snowThrowAnimationTick <= 0) {
         this.snowBlock.xScale = 0.0F;
         this.snowBlock.yScale = 0.0F;
         this.snowBlock.zScale = 0.0F;
      }
   }

   @Override
   public ModelPart getHead() {
      return this.head;
   }

   @Override
   public void translateArmour(Part modelPart, PoseStack stack, boolean innerModel) {
      switch (modelPart) {
         case HEAD:
            ArmourWearingModel.through(this.root(), stack, "everything", "pelvis", "body", "head");
            stack.translate(0.0, 0.0, -0.21875);
            break;
         case BODY:
            ArmourWearingModel.through(this.root(), stack, "everything", "pelvis");
            if (innerModel) {
               stack.translate(0.0F, -2.125F, 0.0F);
               stack.scale(1.8F, 2.9F, 2.4F);
            } else {
               this.body.translateAndRotate(stack);
               stack.translate(0.0F, -0.6875F, 0.0F);
               stack.scale(2.5F, 1.2F, 2.75F);
            }
            break;
         case RIGHT_ARM:
            ArmourWearingModel.through(this.root(), stack, "everything", "pelvis", "body", "rightArm");
            stack.translate(0.4375F, -0.125F, 0.0F);
            stack.scale(1.2F, 1.6F, 1.2F);
            break;
         case LEFT_ARM:
            ArmourWearingModel.through(this.root(), stack, "everything", "pelvis", "body", "leftArm");
            stack.translate(-0.4375F, -0.125F, 0.0F);
            stack.scale(1.2F, 1.6F, 1.2F);
            break;
         case RIGHT_LEG:
            ArmourWearingModel.through(this.root(), stack, "everything", "rightLeg");
            if (innerModel) {
               stack.translate(0.1875F, -1.0625F, 0.03125F);
               stack.scale(1.5F, 1.3F, 1.5F);
            } else {
               this.rightLegLower.translateAndRotate(stack);
               stack.translate(0.15625F, -1.875F, 0.0F);
               stack.scale(1.25F, 1.5F, 1.25F);
            }
            break;
         case LEFT_LEG:
            ArmourWearingModel.through(this.root(), stack, "everything", "leftLeg");
            if (innerModel) {
               stack.translate(-0.1875F, -1.0625F, 0.03125F);
               stack.scale(1.5F, 1.3F, 1.5F);
            } else {
               this.leftLegLower.translateAndRotate(stack);
               stack.translate(-0.15625F, -1.875F, 0.0F);
               stack.scale(1.25F, 1.5F, 1.25F);
            }
      }
   }
}
