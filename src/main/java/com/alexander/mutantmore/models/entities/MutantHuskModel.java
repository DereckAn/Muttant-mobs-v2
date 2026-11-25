package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.animation.keyframe_animations.definition.MutantHuskKeyframeAnimations;
import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import com.alexander.mutantmore.animation.sine_wave_animations.definition.MutantHuskSineWaveAnimations;
import com.alexander.mutantmore.client.MutantHuskRenderState;
import com.alexander.mutantmore.config.mutant_husk.MutantHuskClientConfig;
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

// ponytail: armour and held-item layers skipped, same as the Jungle Zombie
public class MutantHuskModel extends EntityModel<MutantHuskRenderState> {
   public final ModelPart everything;
   public final ModelPart pelvis;
   public final ModelPart body;
   public final ModelPart head;
   public final ModelPart leftArm;
   public final ModelPart leftArmLower;
   public final ModelPart rightArm;
   public final ModelPart rightArmLower;
   public final ModelPart sandBlock;
   public final ModelPart rightLeg;
   public final ModelPart rightLegLower;
   public final ModelPart leftLeg;
   public final ModelPart leftLegLower;
   public final ModelPart cacti;
   public final ModelPart cactus4;
   public final ModelPart cactus5;

   private final KeyframeAnimation attack;
   private final KeyframeAnimation trap;
   private final KeyframeAnimation jump;
   private final KeyframeAnimation slam;
   private final KeyframeAnimation roar;
   private final KeyframeAnimation throwSand;
   private final KeyframeAnimation intro;

   public MutantHuskModel(ModelPart root) {
      super(root, RenderTypes::entityTranslucent);
      this.everything = root.getChild("everything");
      this.pelvis = this.everything.getChild("pelvis");
      this.body = this.pelvis.getChild("body");
      this.head = this.body.getChild("head");
      this.leftArm = this.body.getChild("leftArm");
      this.leftArmLower = this.leftArm.getChild("leftArmLower");
      this.rightArm = this.body.getChild("rightArm");
      this.rightArmLower = this.rightArm.getChild("rightArmLower");
      this.sandBlock = this.rightArmLower.getChild("sandBlock");
      this.leftLeg = this.everything.getChild("leftLeg");
      this.leftLegLower = this.leftLeg.getChild("leftLegLower");
      this.rightLeg = this.everything.getChild("rightLeg");
      this.rightLegLower = this.rightLeg.getChild("rightLegLower");
      this.cacti = this.body.getChild("cacti");
      this.cactus5 = this.pelvis.getChild("cactus5");
      this.cactus4 = this.rightArm.getChild("cactus4");
      this.attack = MutantHuskKeyframeAnimations.MUTANT_HUSK_ATTACK.bake(root);
      this.trap = MutantHuskKeyframeAnimations.MUTANT_HUSK_TRAP.bake(root);
      this.jump = MutantHuskKeyframeAnimations.MUTANT_HUSK_JUMP.bake(root);
      this.slam = MutantHuskKeyframeAnimations.MUTANT_HUSK_SLAM.bake(root);
      this.roar = MutantHuskKeyframeAnimations.MUTANT_HUSK_ROAR.bake(root);
      this.throwSand = MutantHuskKeyframeAnimations.MUTANT_HUSK_THROW_SAND.bake(root);
      this.intro = MutantHuskKeyframeAnimations.MUTANT_HUSK_INTRO.bake(root);
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 5.5F, 3.0F));
      PartDefinition pelvis = everything.addOrReplaceChild(
         "pelvis",
         CubeListBuilder.create().texOffs(0, 44).addBox(-8.0F, -14.0F, -6.0F, 16.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -2.0F, 0.0F)
      );
      PartDefinition body = pelvis.addOrReplaceChild(
         "body",
         CubeListBuilder.create().texOffs(0, 76).addBox(-13.0F, -14.0F, -8.0F, 26.0F, 14.0F, 16.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -11.0F, 0.0F)
      );
      PartDefinition head = body.addOrReplaceChild(
         "head",
         CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -5.0F, -7.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -12.0F, -4.0F)
      );
      PartDefinition leftArm = body.addOrReplaceChild(
         "leftArm",
         CubeListBuilder.create().texOffs(95, 91).addBox(0.0F, -2.0F, -4.5F, 7.0F, 20.0F, 9.0F, new CubeDeformation(0.01F)),
         PartPose.offset(11.0F, -9.0F, 1.0F)
      );
      PartDefinition leftArmLower = leftArm.addOrReplaceChild(
         "leftArmLower",
         CubeListBuilder.create().texOffs(128, 91).addBox(-3.5F, -1.0F, -4.5F, 7.0F, 20.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(3.5F, 18.0F, 0.0F)
      );
      PartDefinition rightArm = body.addOrReplaceChild(
         "rightArm",
         CubeListBuilder.create()
            .texOffs(95, 91)
            .mirror()
            .addBox(-7.0F, -2.0F, -4.5F, 7.0F, 20.0F, 9.0F, new CubeDeformation(0.01F))
            .mirror(false),
         PartPose.offset(-11.0F, -9.0F, 1.0F)
      );
      PartDefinition rightArmLower = rightArm.addOrReplaceChild(
         "rightArmLower",
         CubeListBuilder.create()
            .texOffs(128, 91)
            .mirror()
            .addBox(-3.5F, -1.0F, -4.5F, 7.0F, 20.0F, 9.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(-3.5F, 18.0F, 0.0F)
      );
      PartDefinition sandBlock = rightArmLower.addOrReplaceChild(
         "sandBlock",
         CubeListBuilder.create()
            .texOffs(151, 2)
            .addBox(-10.0F, -10.0F, -10.0F, 20.0F, 20.0F, 20.0F, new CubeDeformation(0.0F))
            .texOffs(169, 85)
            .addBox(-10.0F, -10.0F, -10.0F, 20.0F, 20.0F, 20.0F, new CubeDeformation(0.5F)),
         PartPose.offset(7.5F, 26.5F, 0.0F)
      );
      PartDefinition cactus4 = rightArm.addOrReplaceChild(
         "cactus4",
         CubeListBuilder.create()
            .texOffs(227, 50)
            .addBox(-3.5F, -13.0F, -3.5F, 7.0F, 14.0F, 7.0F, new CubeDeformation(-1.0F))
            .texOffs(125, 69)
            .addBox(-3.5F, -13.0F, -3.5F, 7.0F, 14.0F, 7.0F, new CubeDeformation(-0.75F)),
         PartPose.offsetAndRotation(-4.5F, 8.5F, 1.5F, -0.3288F, 0.121F, -1.3962F)
      );
      PartDefinition cactus_r1 = cactus4.addOrReplaceChild(
         "cactus_r1",
         CubeListBuilder.create()
            .texOffs(227, 50)
            .addBox(8.0F, -7.0F, -30.0F, 7.0F, 5.0F, 7.0F, new CubeDeformation(-1.0F))
            .texOffs(125, 69)
            .addBox(8.0F, -7.0F, -30.0F, 7.0F, 5.0F, 7.0F, new CubeDeformation(-0.75F)),
         PartPose.offsetAndRotation(0.5F, 19.0F, -11.5F, 0.0F, -1.5708F, -1.5708F)
      );
      PartDefinition cacti = body.addOrReplaceChild("cacti", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
      PartDefinition cactus1 = cacti.addOrReplaceChild(
         "cactus1",
         CubeListBuilder.create()
            .texOffs(169, 43)
            .addBox(-7.0F, -1.5F, -7.0F, 14.0F, 16.0F, 14.0F, new CubeDeformation(-2.0F))
            .texOffs(169, 43)
            .addBox(-7.0F, 10.5F, -7.0F, 14.0F, 16.0F, 14.0F, new CubeDeformation(-2.0F))
            .texOffs(169, 43)
            .addBox(-7.0F, 22.5F, -7.0F, 14.0F, 8.0F, 14.0F, new CubeDeformation(-2.0F)),
         PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 2.138F, 0.0F, 0.0F)
      );
      PartDefinition cactus2 = cacti.addOrReplaceChild(
         "cactus2",
         CubeListBuilder.create()
            .texOffs(227, 50)
            .addBox(-3.5F, -15.0F, -3.5F, 7.0F, 16.0F, 7.0F, new CubeDeformation(-1.0F))
            .texOffs(125, 67)
            .addBox(-3.5F, -15.0F, -3.5F, 7.0F, 16.0F, 7.0F, new CubeDeformation(-0.75F)),
         PartPose.offsetAndRotation(-9.5F, -11.5F, 5.5F, -0.5888F, -0.1733F, -0.2528F)
      );
      PartDefinition cactus_r2 = cactus2.addOrReplaceChild(
         "cactus_r2",
         CubeListBuilder.create()
            .texOffs(227, 50)
            .addBox(-4.0F, -20.0F, -30.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(-1.0F))
            .texOffs(125, 67)
            .addBox(-4.0F, -20.0F, -30.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(-0.75F)),
         PartPose.offsetAndRotation(0.5F, 19.0F, -11.5F, -1.5708F, 0.0F, 0.0F)
      );
      PartDefinition cactus3 = cacti.addOrReplaceChild(
         "cactus3",
         CubeListBuilder.create()
            .texOffs(227, 50)
            .addBox(-3.5F, -15.0F, -3.5F, 7.0F, 16.0F, 7.0F, new CubeDeformation(-1.0F))
            .texOffs(227, 50)
            .addBox(-3.5F, -23.0F, -3.5F, 7.0F, 10.0F, 7.0F, new CubeDeformation(-1.0F))
            .texOffs(128, 68)
            .addBox(-3.5F, -15.0F, -3.5F, 7.0F, 16.0F, 7.0F, new CubeDeformation(-0.75F))
            .texOffs(128, 68)
            .addBox(-3.5F, -23.0F, -3.5F, 7.0F, 10.0F, 7.0F, new CubeDeformation(-0.75F)),
         PartPose.offsetAndRotation(10.5F, -7.5F, 4.5F, -1.0619F, 0.1975F, 0.2898F)
      );
      PartDefinition cactus_r3 = cactus3.addOrReplaceChild(
         "cactus_r3",
         CubeListBuilder.create()
            .texOffs(128, 68)
            .addBox(-15.0F, -9.0F, -32.0F, 7.0F, 8.0F, 7.0F, new CubeDeformation(-0.75F))
            .texOffs(128, 68)
            .addBox(-15.0F, 2.0F, -41.0F, 7.0F, 6.0F, 7.0F, new CubeDeformation(-0.75F))
            .texOffs(227, 50)
            .addBox(-15.0F, 2.0F, -41.0F, 7.0F, 6.0F, 7.0F, new CubeDeformation(-1.0F))
            .texOffs(227, 50)
            .addBox(-15.0F, -9.0F, -32.0F, 7.0F, 8.0F, 7.0F, new CubeDeformation(-1.0F)),
         PartPose.offsetAndRotation(0.5F, 19.0F, -11.5F, 0.0F, 1.5708F, 1.5708F)
      );
      PartDefinition cactus5 = pelvis.addOrReplaceChild(
         "cactus5",
         CubeListBuilder.create()
            .texOffs(227, 50)
            .addBox(-3.5F, -15.0F, -3.5F, 7.0F, 16.0F, 7.0F, new CubeDeformation(-1.0F))
            .texOffs(125, 67)
            .addBox(-3.5F, -15.0F, -3.5F, 7.0F, 16.0F, 7.0F, new CubeDeformation(-0.75F)),
         PartPose.offsetAndRotation(5.5F, -2.5F, 4.5F, -1.1943F, -0.4807F, 2.4307F)
      );
      PartDefinition cactus_r4 = cactus5.addOrReplaceChild(
         "cactus_r4",
         CubeListBuilder.create()
            .texOffs(125, 67)
            .addBox(8.0F, -9.0F, -32.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(-0.75F))
            .texOffs(227, 50)
            .addBox(8.0F, -9.0F, -32.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(-1.0F)),
         PartPose.offsetAndRotation(0.5F, 19.0F, -11.5F, 0.0F, -1.5708F, -1.5708F)
      );
      PartDefinition rightLeg = everything.addOrReplaceChild(
         "rightLeg",
         CubeListBuilder.create()
            .texOffs(61, 49)
            .mirror()
            .addBox(-3.0F, -2.5F, -3.0F, 7.0F, 13.0F, 7.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(-7.0F, 1.0F, -0.5F)
      );
      PartDefinition rightLegLower = rightLeg.addOrReplaceChild(
         "rightLegLower",
         CubeListBuilder.create()
            .texOffs(85, 67)
            .mirror()
            .addBox(-4.0F, -1.0F, -4.0F, 8.0F, 11.0F, 8.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(0.5F, 9.0F, 0.5F)
      );
      PartDefinition leftLeg = everything.addOrReplaceChild(
         "leftLeg",
         CubeListBuilder.create().texOffs(61, 49).addBox(-4.0F, -2.5F, -3.0F, 7.0F, 13.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(7.0F, 1.0F, -0.5F)
      );
      PartDefinition leftLegLower = leftLeg.addOrReplaceChild(
         "leftLegLower",
         CubeListBuilder.create().texOffs(85, 67).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-0.5F, 9.0F, 0.5F)
      );
      return LayerDefinition.create(meshdefinition, 256, 128);
   }

   @Override
   public void setupAnim(MutantHuskRenderState state) {
      super.setupAnim(state);
      float age = state.ageInTicks;
      float tick = SineWaveAnimationUtils.getTick(age, true);
      boolean idleKeyframes = state.notCurrentlyPlayingKeyframeAnimation;
      boolean shouldPlayJumpingAnimation = state.jumping && idleKeyframes;
      boolean shouldPlayWalkAnimation = state.movingOnLand && !shouldPlayJumpingAnimation && idleKeyframes;
      boolean shouldPlayIdleAnimation = !shouldPlayWalkAnimation && !shouldPlayJumpingAnimation && idleKeyframes;
      this.head.xRot = state.xRot * (float) (Math.PI / 180.0);
      this.head.yRot = state.yRot * (float) (Math.PI / 180.0);
      // DOWN, GEYSER and NOVELTY wobble with age, so they are rebuilt each frame (only while playing)
      if (state.downAnimationTick > 0) {
         MutantHuskKeyframeAnimations.MUTANT_HUSK_DOWN(age).bake(this.root()).apply(state.downAnimationState, age);
      } else if (state.roarAnimationTick > 0) {
         this.roar.apply(state.roarAnimationState, age);
      } else if (state.geyserAnimationTick > 0) {
         MutantHuskKeyframeAnimations.MUTANT_HUSK_GEYSER(age).bake(this.root()).apply(state.geyserAnimationState, age);
      } else if (state.slamAnimationTick > 0) {
         this.slam.apply(state.slamAnimationState, age);
      } else if (state.jumpAnimationTick > 0) {
         this.jump.apply(state.jumpAnimationState, age);
      } else if (state.trapAnimationTick > 0) {
         this.trap.apply(state.trapAnimationState, age);
      } else if (state.throwSandAnimationTick > 0) {
         this.throwSand.apply(state.throwSandAnimationState, age);
      } else if (state.attackAnimationTick > 0) {
         this.attack.apply(state.attackAnimationState, age);
      } else if (state.introAnimationTick > 0) {
         this.intro.apply(state.introAnimationState, age);
      } else if (state.noveltyAnimationTick > 0) {
         MutantHuskKeyframeAnimations.MUTANT_HUSK_NOVELTY(age).bake(this.root()).apply(state.noveltyAnimationState, age);
      } else {
         MutantHuskSineWaveAnimations.mutantHuskJumpingAnimation(this, tick, 1.0F, shouldPlayJumpingAnimation ? 1.0F : 0.0F);
         MutantHuskSineWaveAnimations.mutantHuskWalkAnimation(this, tick, state.walkSpeed, shouldPlayWalkAnimation ? 1.0F : 0.0F);
         MutantHuskSineWaveAnimations.mutantHuskIdleAnimation(this, tick, 1.0F, shouldPlayIdleAnimation ? 1.0F : 0.0F);
      }

      if (state.throwSandAnimationTick <= 0) {
         this.sandBlock.xScale = 0.0F;
         this.sandBlock.yScale = 0.0F;
         this.sandBlock.zScale = 0.0F;
      }

      boolean cacti = MutantHuskClientConfig.cacti.get();
      this.cacti.visible = cacti;
      this.cactus4.visible = cacti;
      this.cactus5.visible = cacti;
   }
}
