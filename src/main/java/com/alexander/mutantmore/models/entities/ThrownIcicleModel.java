package com.alexander.mutantmore.models.entities;

import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.util.Unit;

public class ThrownIcicleModel extends Model<Unit> {
   public ThrownIcicleModel(ModelPart root) {
      super(root, RenderTypes::entityCutout);
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition projectile = partdefinition.addOrReplaceChild(
         "projectile",
         CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, -6.5F, -23.0F, 0.0F, 13.0F, 43.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 18.5F, 1.0F)
      );
      PartDefinition projectiles_r1 = projectile.addOrReplaceChild(
         "projectiles_r1",
         CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, -6.5F, -1.0F, 0.0F, 13.0F, 43.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, -22.0F, 0.0F, 0.0F, 1.5708F)
      );
      return LayerDefinition.create(meshdefinition, 320, 128);
   }
}
