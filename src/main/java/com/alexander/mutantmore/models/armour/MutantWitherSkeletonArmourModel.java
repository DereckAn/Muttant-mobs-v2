package com.alexander.mutantmore.models.armour;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.world.entity.EquipmentSlot;

/** Bone armour worn by players; one instance per slot, showing only that slot's pieces (rendering is deferred, so visibility can't be toggled per call). */
public class MutantWitherSkeletonArmourModel extends HumanoidModel<HumanoidRenderState> {
   public MutantWitherSkeletonArmourModel(ModelPart root, EquipmentSlot slot) {
      super(root);
      this.head.getChild("armorHead").visible = slot == EquipmentSlot.HEAD;
      this.body.getChild("armorBody").visible = slot == EquipmentSlot.CHEST;
      this.leftArm.getChild("armorLeftArm").visible = slot == EquipmentSlot.CHEST;
      this.rightArm.getChild("armorRightArm").visible = slot == EquipmentSlot.CHEST;
      this.body.getChild("armorLeggingsTop").visible = slot == EquipmentSlot.CHEST;
      this.leftLeg.getChild("armorLeftLeg").visible = slot == EquipmentSlot.LEGS;
      this.rightLeg.getChild("armorRightLeg").visible = slot == EquipmentSlot.LEGS;
      this.leftLeg.getChild("armorLeftBoot").visible = slot == EquipmentSlot.FEET;
      this.rightLeg.getChild("armorRightBoot").visible = slot == EquipmentSlot.FEET;
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition head = partdefinition.addOrReplaceChild(
         "head",
         CubeListBuilder.create().texOffs(45, 86).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      head.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
      PartDefinition armorHead = head.addOrReplaceChild(
         "armorHead",
         CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.55F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      armorHead.addOrReplaceChild(
         "rightHorn_r1",
         CubeListBuilder.create()
            .texOffs(56, 18)
            .mirror()
            .addBox(-2.5F, -12.0F, 2.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.1F))
            .mirror(false)
            .texOffs(56, 18)
            .addBox(8.5F, -10.0F, 2.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.1F)),
         PartPose.offsetAndRotation(-4.0F, -1.0F, 0.5F, 1.0036F, 0.0F, 0.0F)
      );
      armorHead.addOrReplaceChild(
         "jaw",
         CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -2.8935F, -8.0351F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.6F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.2182F, 0.0F, 0.0F)
      );
      PartDefinition body = partdefinition.addOrReplaceChild(
         "body",
         CubeListBuilder.create().texOffs(0, 112).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      body.addOrReplaceChild(
         "armorBody",
         CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.51F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      body.addOrReplaceChild(
         "armorLeggingsTop",
         CubeListBuilder.create().texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.251F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition right_arm = partdefinition.addOrReplaceChild(
         "right_arm",
         CubeListBuilder.create().texOffs(112, 112).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-5.0F, 2.0F, 0.0F)
      );
      right_arm.addOrReplaceChild(
         "armorRightArm",
         CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition left_arm = partdefinition.addOrReplaceChild(
         "left_arm",
         CubeListBuilder.create().texOffs(62, 112).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(5.0F, 2.0F, 0.0F)
      );
      left_arm.addOrReplaceChild(
         "armorLeftArm",
         CubeListBuilder.create()
            .texOffs(40, 16)
            .mirror()
            .addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F))
            .mirror(false),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition left_leg = partdefinition.addOrReplaceChild(
         "left_leg",
         CubeListBuilder.create().texOffs(36, 112).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.9F, 12.0F, 0.0F)
      );
      left_leg.addOrReplaceChild(
         "armorLeftLeg",
         CubeListBuilder.create().texOffs(0, 48).addBox(2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
         PartPose.offset(-3.9F, 0.0F, 0.0F)
      );
      left_leg.addOrReplaceChild(
         "armorLeftBoot",
         CubeListBuilder.create().texOffs(0, 16).addBox(2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
         PartPose.offset(-3.9F, 0.0F, 0.0F)
      );
      PartDefinition right_leg = partdefinition.addOrReplaceChild(
         "right_leg",
         CubeListBuilder.create().texOffs(112, 78).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.9F, 12.0F, 0.0F)
      );
      right_leg.addOrReplaceChild(
         "armorRightLeg",
         CubeListBuilder.create().texOffs(0, 48).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
         PartPose.offset(3.9F, 0.0F, 0.0F)
      );
      right_leg.addOrReplaceChild(
         "armorRightBoot",
         CubeListBuilder.create().texOffs(0, 16).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
         PartPose.offset(3.9F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 128, 128);
   }
}
