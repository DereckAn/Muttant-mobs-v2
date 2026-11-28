package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.client.armour.ArmourWearingModel;
import com.alexander.mutantmore.client.armour.ArmourWearingModel.Part;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers.AbstractAdvancedAnimation;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedAnimationDefinition;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedAnimator;
import com.alexander.mutantmore.animation.definitions.mutant_wither_skeleton.MutantWitherSkeletonAggressiveAdvancedAnimations;
import com.alexander.mutantmore.animation.definitions.mutant_wither_skeleton.MutantWitherSkeletonIdleAdvancedAnimations;
import com.alexander.mutantmore.animation.definitions.mutant_wither_skeleton.MutantWitherSkeletonLungeAdvancedAnimations;
import com.alexander.mutantmore.renderers.entities.MutantWitherSkeletonRenderer;
import com.mojang.blaze3d.vertex.PoseStack;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.client.model.ArmedModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.HumanoidArm;

// ponytail: armour layers (AdvancedArmourLayer) skipped like the other mutants; held scimitars are rendered
public class MutantWitherSkeletonModel extends MMBaseEntityModel<MutantWitherSkeletonRenderer.State> implements ArmedModel<MutantWitherSkeletonRenderer.State>, ArmourWearingModel {
   private final ModelPart head;
   private final List<ModelPart> parts;
   private final List<ModelPart> rightHand;
   private final List<ModelPart> leftHand;

   public MutantWitherSkeletonModel(ModelPart root) {
      super(root);
      this.head = this.findPart("head");
      this.parts = root.getAllParts();
      this.rightHand = this.chain("everything", "pelvis1", "pelvis2", "spine1", "spine2", "spine3", "rightArm", "rightArmLower", "rightHand");
      this.leftHand = this.chain("everything", "pelvis1", "pelvis2", "spine1", "spine2", "spine3", "leftArm", "leftArmLower", "leftHand");
   }

   private List<ModelPart> chain(String... names) {
      return Stream.concat(Stream.of(this.root()), Stream.of(names).map(this::findPart)).toList();
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 0.0F));
      PartDefinition pelvis1 = everything.addOrReplaceChild(
         "pelvis1",
         CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -3.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(-0.35F)),
         PartPose.offset(0.0F, -8.0F, 0.0F)
      );
      PartDefinition pelvis2 = pelvis1.addOrReplaceChild(
         "pelvis2",
         CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, -6.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(-0.5F)),
         PartPose.offset(-0.5F, -2.0F, 0.0F)
      );
      PartDefinition spine1 = pelvis2.addOrReplaceChild(
         "spine1",
         CubeListBuilder.create().texOffs(50, 0).addBox(-2.5F, -4.0F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.5F, -5.0F, 0.0F)
      );
      PartDefinition rib13 = spine1.addOrReplaceChild(
         "rib13",
         CubeListBuilder.create().texOffs(32, 12).mirror().addBox(-6.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offset(-2.5F, -2.0F, 0.5F)
      );
      PartDefinition rib14 = rib13.addOrReplaceChild(
         "rib14",
         CubeListBuilder.create()
            .texOffs(32, 12)
            .mirror()
            .addBox(-6.0F, -1.02F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(-6.0F, 0.0F, 0.0F)
      );
      PartDefinition rib15 = rib14.addOrReplaceChild(
         "rib15",
         CubeListBuilder.create()
            .texOffs(33, 12)
            .mirror()
            .addBox(-5.0F, -1.01F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(-6.0F, 0.0F, 0.0F)
      );
      PartDefinition rib = spine1.addOrReplaceChild(
         "rib",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.5F, -2.0F, 0.5F)
      );
      PartDefinition rib2 = rib.addOrReplaceChild(
         "rib2",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.02F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(6.0F, 0.0F, 0.0F)
      );
      PartDefinition rib3 = rib2.addOrReplaceChild(
         "rib3",
         CubeListBuilder.create().texOffs(33, 12).addBox(0.0F, -1.01F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(6.0F, 0.0F, 0.0F)
      );
      PartDefinition spine2 = spine1.addOrReplaceChild(
         "spine2",
         CubeListBuilder.create().texOffs(50, 0).addBox(-2.5F, -4.0F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -4.0F, 0.0F)
      );
      PartDefinition rib10 = spine2.addOrReplaceChild(
         "rib10",
         CubeListBuilder.create().texOffs(32, 12).mirror().addBox(-6.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offset(-2.5F, -2.0F, 0.5F)
      );
      PartDefinition rib11 = rib10.addOrReplaceChild(
         "rib11",
         CubeListBuilder.create()
            .texOffs(32, 12)
            .mirror()
            .addBox(-6.0F, -1.02F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(-6.0F, 0.0F, 0.0F)
      );
      PartDefinition rib12 = rib11.addOrReplaceChild(
         "rib12",
         CubeListBuilder.create()
            .texOffs(34, 12)
            .mirror()
            .addBox(-4.0F, -1.01F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(-6.0F, 0.0F, 0.0F)
      );
      PartDefinition rib4 = spine2.addOrReplaceChild(
         "rib4",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.5F, -2.0F, 0.5F)
      );
      PartDefinition rib5 = rib4.addOrReplaceChild(
         "rib5",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.02F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(6.0F, 0.0F, 0.0F)
      );
      PartDefinition rib6 = rib5.addOrReplaceChild(
         "rib6",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.01F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(6.0F, 0.0F, 0.0F)
      );
      PartDefinition spine3 = spine2.addOrReplaceChild(
         "spine3",
         CubeListBuilder.create().texOffs(50, 0).addBox(-2.5F, -4.0F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -4.0F, 0.0F)
      );
      PartDefinition rightShoulderPad = spine3.addOrReplaceChild(
         "rightShoulderPad",
         CubeListBuilder.create().texOffs(65, 42).addBox(-10.0F, -2.5F, -4.0F, 10.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.0F, -5.0F, 0.0F, -0.3155F, 0.2494F, -0.0804F)
      );
      PartDefinition leftShoulderPad = spine3.addOrReplaceChild(
         "leftShoulderPad",
         CubeListBuilder.create().texOffs(28, 16).addBox(0.2989F, -1.6477F, -2.9377F, 8.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.0F, -5.0F, 0.0F, -0.3155F, -0.2494F, 0.0804F)
      );
      PartDefinition rib16 = spine3.addOrReplaceChild(
         "rib16",
         CubeListBuilder.create().texOffs(32, 12).mirror().addBox(-6.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offset(-2.5F, -2.0F, 0.5F)
      );
      PartDefinition rib17 = rib16.addOrReplaceChild(
         "rib17",
         CubeListBuilder.create()
            .texOffs(32, 12)
            .mirror()
            .addBox(-6.0F, -1.02F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(-6.0F, 0.0F, 0.0F)
      );
      PartDefinition rib18 = rib17.addOrReplaceChild(
         "rib18",
         CubeListBuilder.create()
            .texOffs(32, 12)
            .mirror()
            .addBox(-6.0F, -1.01F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(-6.0F, 0.0F, 0.0F)
      );
      PartDefinition rib7 = spine3.addOrReplaceChild(
         "rib7",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.5F, -2.0F, 0.5F)
      );
      PartDefinition rib8 = rib7.addOrReplaceChild(
         "rib8",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.02F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(6.0F, 0.0F, 0.0F)
      );
      PartDefinition rib9 = rib8.addOrReplaceChild(
         "rib9",
         CubeListBuilder.create().texOffs(35, 12).addBox(0.0F, -1.01F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(6.0F, 0.0F, 0.0F)
      );
      PartDefinition neck = spine3.addOrReplaceChild(
         "neck",
         CubeListBuilder.create().texOffs(68, 0).addBox(-1.5F, -4.0F, -2.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -4.0F, 0.5F)
      );
      PartDefinition head = neck.addOrReplaceChild(
         "head",
         CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -5.5F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -3.0F, 0.0F)
      );
      PartDefinition rightHorn_r1 = head.addOrReplaceChild(
         "rightHorn_r1",
         CubeListBuilder.create()
            .texOffs(62, 21)
            .mirror()
            .addBox(-2.0F, -12.0F, 2.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(62, 21)
            .addBox(8.0F, -10.0F, 2.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-4.0F, -1.0F, -1.0F, 1.0036F, 0.0F, 0.0F)
      );
      PartDefinition jaw = head.addOrReplaceChild(
         "jaw",
         CubeListBuilder.create().texOffs(72, 0).addBox(-4.0F, -2.8935F, -8.0351F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.25F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 2.5F, 0.1745F, 0.0F, 0.0F)
      );
      PartDefinition rightArm = spine3.addOrReplaceChild(
         "rightArm",
         CubeListBuilder.create()
            .texOffs(16, 28)
            .mirror()
            .addBox(-4.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(57, 11)
            .addBox(-5.0F, 11.0F, 1.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-3.0F, -3.0F, 0.0F)
      );
      PartDefinition rightArmLower = rightArm.addOrReplaceChild(
         "rightArmLower",
         CubeListBuilder.create()
            .texOffs(32, 28)
            .mirror()
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(0, 64)
            .addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.25F)),
         PartPose.offset(-2.0F, 14.0F, 0.0F)
      );
      PartDefinition rightHand = rightArmLower.addOrReplaceChild("rightHand", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 0.0F));
      PartDefinition leftArm = spine3.addOrReplaceChild(
         "leftArm",
         CubeListBuilder.create()
            .texOffs(16, 28)
            .addBox(0.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(98, 60)
            .addBox(-1.5F, 10.5F, 1.0F, 7.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(3.0F, -3.0F, 0.0F)
      );
      PartDefinition leftArmLower = leftArm.addOrReplaceChild(
         "leftArmLower",
         CubeListBuilder.create()
            .texOffs(32, 28)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 64)
            .addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.25F)),
         PartPose.offset(2.0F, 14.0F, 0.0F)
      );
      PartDefinition leftHand = leftArmLower.addOrReplaceChild("leftHand", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 0.0F));
      PartDefinition rightLeg = everything.addOrReplaceChild(
         "rightLeg",
         CubeListBuilder.create()
            .texOffs(0, 28)
            .mirror()
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(57, 11)
            .addBox(-3.0F, 11.0F, -3.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-3.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F)
      );
      PartDefinition rightLegLower = rightLeg.addOrReplaceChild(
         "rightLegLower",
         CubeListBuilder.create()
            .texOffs(0, 46)
            .mirror()
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.01F))
            .mirror(false)
            .texOffs(68, 59)
            .mirror()
            .addBox(-2.5F, 2.0F, -2.5F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.1F))
            .mirror(false),
         PartPose.offset(0.0F, 14.0F, 0.0F)
      );
      PartDefinition leftLeg = everything.addOrReplaceChild(
         "leftLeg",
         CubeListBuilder.create()
            .texOffs(0, 28)
            .addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(57, 11)
            .addBox(-3.0F, 11.0F, -3.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(3.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F)
      );
      PartDefinition leftLegLower = leftLeg.addOrReplaceChild(
         "leftLegLower",
         CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.01F)),
         PartPose.offset(0.0F, 14.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 128, 128);
   }

   @Override
   public void setupAnim(MutantWitherSkeletonRenderer.State state) {
      super.setupAnim(state);
      this.head.xRot = state.xRot * (float)(Math.PI / 180.0);
      this.head.yRot = state.yRot * (float)(Math.PI / 180.0);
      if (state.tracker == null) {
         return;
      }

      this.animate(state, "attack_left", MutantWitherSkeletonAggressiveAdvancedAnimations.MUTANT_WITHER_SKELETON_ATTACK_LEFT);
      this.animate(state, "attack_right", MutantWitherSkeletonAggressiveAdvancedAnimations.MUTANT_WITHER_SKELETON_ATTACK_RIGHT);
      this.animate(state, "block", MutantWitherSkeletonAggressiveAdvancedAnimations.MUTANT_WITHER_SKELETON_BLOCK);
      this.animate(state, "rib_crush", MutantWitherSkeletonAggressiveAdvancedAnimations.MUTANT_WITHER_SKELETON_RIB_CRUSH);
      this.animate(state, "wither_breath", MutantWitherSkeletonAggressiveAdvancedAnimations.MUTANT_WITHER_SKELETON_WITHER_BREATH);
      this.animate(state, "wither_slash", MutantWitherSkeletonAggressiveAdvancedAnimations.MUTANT_WITHER_SKELETON_WITHER_SLASH);
      this.animate(state, "crouching_pose", MutantWitherSkeletonIdleAdvancedAnimations.MUTANT_WITHER_SKELETON_CROUCHING_POSE);
      this.animate(state, "death", MutantWitherSkeletonIdleAdvancedAnimations.MUTANT_WITHER_SKELETON_DEATH);
      this.animate(state, "idle", MutantWitherSkeletonIdleAdvancedAnimations.MUTANT_WITHER_SKELETON_IDLE);
      this.animate(state, "hurt", MutantWitherSkeletonIdleAdvancedAnimations.MUTANT_WITHER_SKELETON_HURT);
      this.animate(state, "intro", MutantWitherSkeletonIdleAdvancedAnimations.MUTANT_WITHER_SKELETON_INTRO);
      this.animate(state, "offset_legs", MutantWitherSkeletonIdleAdvancedAnimations.MUTANT_WITHER_SKELETON_OFFSET_LEGS);
      this.animate(state, "walk", MutantWitherSkeletonIdleAdvancedAnimations.MUTANT_WITHER_SKELETON_WALK);
      this.animate(state, "lunge", MutantWitherSkeletonLungeAdvancedAnimations.MUTANT_WITHER_SKELETON_LUNGE);
      this.animate(state, "lunge_land", MutantWitherSkeletonLungeAdvancedAnimations.MUTANT_WITHER_SKELETON_LUNGE_LAND);
      this.animate(state, "lunging", MutantWitherSkeletonLungeAdvancedAnimations.MUTANT_WITHER_SKELETON_LUNGING);
      this.animate(state, "stunned", MutantWitherSkeletonLungeAdvancedAnimations.MUTANT_WITHER_SKELETON_STUNNED);
   }

   private void animate(MutantWitherSkeletonRenderer.State state, String name, AdvancedAnimationDefinition definition) {
      if (state.tracker.getAnimation(name) instanceof AbstractAdvancedAnimation animation) {
         AdvancedAnimator.animate(this.parts, animation, definition);
      }
   }

   @Override
   public void translateToHand(MutantWitherSkeletonRenderer.State state, HumanoidArm arm, PoseStack stack) {
      (arm == HumanoidArm.RIGHT ? this.rightHand : this.leftHand).forEach(part -> part.translateAndRotate(stack));
      stack.translate(arm == HumanoidArm.RIGHT ? 0.0625F : -0.0625F, -0.5625F, 0.0F);
   }

   @Override
   public ModelPart getHead() {
      return ArmourWearingModel.find(this.root(), "head");
   }

   @Override
   public void translateArmour(Part modelPart, PoseStack stack, boolean innerModel) {
      switch (modelPart) {
         case HEAD:
            ArmourWearingModel.through(this.root(), stack, "everything", "pelvis1", "pelvis2", "spine1", "spine2", "spine3", "neck", "head");
            stack.translate(0.0F, 0.0F, -0.09375F);
            break;
         case BODY:
            if (innerModel) {
               ArmourWearingModel.through(this.root(), stack, "everything", "pelvis1");
               stack.translate(0.0F, -0.8125F, 0.0F);
               stack.scale(1.0F, 1.3F, 1.1F);
            } else {
               ArmourWearingModel.through(this.root(), stack, "everything", "pelvis1", "pelvis2", "spine1", "spine2");
               stack.translate(0.0F, -0.5F, 0.0F);
               stack.scale(1.0F, 1.2F, 1.5F);
            }
            break;
         case RIGHT_ARM:
            ArmourWearingModel.through(this.root(), stack, "everything", "pelvis1", "pelvis2", "spine1", "spine2", "spine3", "rightShoulderPad");
            stack.translate(0.34375F, -0.15625F, 0.0F);
            stack.scale(1.75F, 1.0F, 1.4F);
            break;
         case LEFT_ARM:
            ArmourWearingModel.through(this.root(), stack, "everything", "pelvis1", "pelvis2", "spine1", "spine2", "spine3", "leftShoulderPad");
            stack.translate(-0.28125F, -0.0625F, 0.0F);
            stack.scale(1.5F, 1.0F, 1.1F);
            break;
         case RIGHT_LEG:
            if (innerModel) {
               ArmourWearingModel.through(this.root(), stack, "everything", "rightLeg");
               stack.translate(0.125F, -0.75F, 0.0F);
            } else {
               ArmourWearingModel.through(this.root(), stack, "everything", "rightLeg", "rightLegLower");
               stack.translate(0.125F, -0.65625F, 0.0F);
            }
            break;
         case LEFT_LEG:
            if (innerModel) {
               ArmourWearingModel.through(this.root(), stack, "everything", "leftLeg");
               stack.translate(-0.125F, -0.75F, 0.0F);
            } else {
               ArmourWearingModel.through(this.root(), stack, "everything", "leftLeg", "leftLegLower");
               stack.translate(-0.125F, -0.65625F, 0.0F);
            }
      }
   }
}
