package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.renderers.entities.WitherSlashRenderer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.rendertype.RenderTypes;

public class WitherSlashModel extends EntityModel<WitherSlashRenderer.State> {
   private final ModelPart everything;

   public WitherSlashModel(ModelPart root) {
      super(root, RenderTypes::entityTranslucent);
      this.everything = root.getChild("everything");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
      PartDefinition everything_r1 = everything.addOrReplaceChild(
         "everything_r1",
         CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, 0.5F, 0.0F, 32.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -0.5F, -6.0F, 0.349066F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 100, 19);
   }

   @Override
   public void setupAnim(WitherSlashRenderer.State state) {
      super.setupAnim(state);
      this.everything.yRot = -(180.0F - state.fixedYaw) * (float)(Math.PI / 180.0);
      this.everything.xRot = state.xRot * (float)(Math.PI / 180.0);
   }
}
