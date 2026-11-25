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

/** Hoglin-head helmet; only the head part has cubes, and it copies the wearer's head pose. */
public class HogHelmModel extends HumanoidModel<HumanoidRenderState> {
   public HogHelmModel(ModelPart root) {
      super(root);
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F);
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
      PartDefinition headRot = head.addOrReplaceChild(
         "headRot",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-5.0F, -13.0F, -5.0F, 10.0F, 14.0F, 10.0F, new CubeDeformation(0.25F))
            .texOffs(32, 10)
            .addBox(0.0F, -22.3F, -5.0F, 0.0F, 20.0F, 16.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.0F, 0.0F)
      );
      PartDefinition tusks = headRot.addOrReplaceChild(
         "tusks",
         CubeListBuilder.create()
            .texOffs(1, 41)
            .mirror()
            .addBox(-8.0F, -12.2F, -2.0F, 3.0F, 18.0F, 4.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(1, 41)
            .addBox(5.0F, -12.2F, -2.0F, 3.0F, 18.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(1, 31)
            .addBox(5.0F, -12.2F, 2.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
            .texOffs(2, 32)
            .mirror()
            .addBox(-8.0F, -12.2F, 2.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offsetAndRotation(0.0F, -9.0F, 2.2F, 1.5708F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 64, 64);
   }
}
