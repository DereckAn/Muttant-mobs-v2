package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.renderers.entities.MutantWitherSkeletonBodyPartRenderer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class MutantWitherSkeletonBodyPartModel extends EntityModel<MutantWitherSkeletonBodyPartRenderer.State> {
   private final ModelPart everything;
   private final ModelPart pelvis;
   private final ModelPart limb;
   private final ModelPart rib;
   private final ModelPart shoulderPad;
   private final ModelPart head;

   public MutantWitherSkeletonBodyPartModel(ModelPart root) {
      super(root);
      this.everything = root.getChild("everything");
      this.pelvis = this.everything.getChild("pelvis");
      this.limb = this.everything.getChild("limb");
      this.rib = this.everything.getChild("rib");
      this.shoulderPad = this.everything.getChild("shoulderPad");
      this.head = this.everything.getChild("head");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 23.0F, 0.0F));
      everything.addOrReplaceChild(
         "pelvis",
         CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -3.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 1.0F, 0.0F)
      );
      everything.addOrReplaceChild(
         "limb",
         CubeListBuilder.create().texOffs(0, 28).addBox(-2.0F, -9.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 4.0F, 0.0F)
      );
      PartDefinition rib = everything.addOrReplaceChild(
         "rib",
         CubeListBuilder.create().texOffs(32, 12).addBox(-6.0F, -1.0F, -5.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-0.5F, 1.0F, 0.5F)
      );
      PartDefinition rib2 = rib.addOrReplaceChild(
         "rib2",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.02F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0F, -0.711F, 0.0F)
      );
      rib2.addOrReplaceChild(
         "rib3",
         CubeListBuilder.create().texOffs(33, 12).addBox(0.0F, -1.01F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, -0.8727F, 0.0F)
      );
      everything.addOrReplaceChild(
         "shoulderPad",
         CubeListBuilder.create().texOffs(28, 16).addBox(-4.0F, -2.0F, -2.9377F, 8.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.0F, 0.0F)
      );
      PartDefinition head = everything.addOrReplaceChild(
         "head",
         CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      head.addOrReplaceChild(
         "rightHorn_r1",
         CubeListBuilder.create()
            .texOffs(62, 21)
            .mirror()
            .addBox(-2.0F, -12.0F, 2.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(62, 21)
            .addBox(8.0F, -10.0F, 2.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-4.0F, 3.0F, 0.5F, 1.0036F, 0.0F, 0.0F)
      );
      head.addOrReplaceChild(
         "jaw",
         CubeListBuilder.create().texOffs(72, 0).addBox(-4.0F, -2.8935F, -8.0351F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.25F)),
         PartPose.offsetAndRotation(0.0F, 4.0F, 4.0F, 0.1745F, 0.0F, 0.0F)
      );
      head.addOrReplaceChild(
         "armorHead",
         CubeListBuilder.create().texOffs(96, 15).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
         PartPose.offset(0.0F, 4.0F, 1.0F)
      );
      everything.addOrReplaceChild(
         "sword",
         CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 1.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 128, 128);
   }

   @Override
   public void setupAnim(MutantWitherSkeletonBodyPartRenderer.State state) {
      super.setupAnim(state);
      this.pelvis.visible = state.part == 0;
      this.limb.visible = state.part == 3;
      this.rib.visible = state.part == 1;
      this.shoulderPad.visible = state.part == 4;
      this.head.visible = state.part == 2;
   }
}
