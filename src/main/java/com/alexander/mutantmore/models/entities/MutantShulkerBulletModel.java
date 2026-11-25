package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.animation.math_animation.definition.MutantShulkerBulletMathAnimations;
import com.alexander.mutantmore.renderers.entities.MutantShulkerBulletRenderer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class MutantShulkerBulletModel extends MMBaseEntityModel<MutantShulkerBulletRenderer.State> {

   public MutantShulkerBulletModel(ModelPart root) {
      super(root);

   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, 0.0F));
      everything.addOrReplaceChild(
         "transparent",
         CubeListBuilder.create()
            .texOffs(0, 83)
            .addBox(-2.0F, -7.0F, -7.0F, 4.0F, 14.0F, 14.0F, new CubeDeformation(0.0F))
            .texOffs(58, 64)
            .addBox(-7.0F, -7.0F, -2.0F, 14.0F, 14.0F, 4.0F, new CubeDeformation(0.01F))
            .texOffs(0, 64)
            .addBox(-7.0F, -2.0F, -7.0F, 14.0F, 4.0F, 14.0F, new CubeDeformation(-0.01F))
            .texOffs(37, 83)
            .addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      everything.addOrReplaceChild(
         "main",
         CubeListBuilder.create()
            .texOffs(0, 19)
            .addBox(-2.0F, -7.0F, -7.0F, 4.0F, 14.0F, 14.0F, new CubeDeformation(0.0F))
            .texOffs(58, 0)
            .addBox(-7.0F, -7.0F, -2.0F, 14.0F, 14.0F, 4.0F, new CubeDeformation(0.01F))
            .texOffs(0, 0)
            .addBox(-7.0F, -2.0F, -7.0F, 14.0F, 4.0F, 14.0F, new CubeDeformation(-0.01F))
            .texOffs(37, 19)
            .addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 128, 128);
   }

   @Override
   public void setupAnim(MutantShulkerBulletRenderer.State state) {
      super.setupAnim(state);
      this.mathAnimate(state, MutantShulkerBulletMathAnimations.IDLE, 0L, 1.0F);
   }
}
