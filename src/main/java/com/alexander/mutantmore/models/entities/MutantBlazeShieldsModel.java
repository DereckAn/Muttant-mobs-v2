package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.animation.math_animation.definition.MutantBlazeShieldsMathAnimations;
import com.alexander.mutantmore.renderers.entities.MutantBlazeShieldsRenderer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class MutantBlazeShieldsModel extends MMBaseEntityModel<MutantBlazeShieldsRenderer.State> {
   private final ModelPart shield;
   private final ModelPart shield2;
   private final ModelPart shield3;
   private final ModelPart shield4;

   public MutantBlazeShieldsModel(ModelPart root) {
      super(root);
      ModelPart everything = root.getChild("everything");
      this.shield = everything.getChild("shield");
      this.shield2 = everything.getChild("shield2");
      this.shield3 = everything.getChild("shield3");
      this.shield4 = everything.getChild("shield4");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 0.0F));
      everything.addOrReplaceChild(
         "shield",
         CubeListBuilder.create().texOffs(8, 16).addBox(-6.5F, -10.0F, -3.0F, 13.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(11.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.1745F)
      );
      everything.addOrReplaceChild(
         "shield2",
         CubeListBuilder.create().texOffs(8, 16).addBox(-6.5F, -10.0F, -1.0F, 13.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, -13.0F, 0.1745F, 0.0F, 0.0F)
      );
      everything.addOrReplaceChild(
         "shield3",
         CubeListBuilder.create().texOffs(8, 16).addBox(-6.5F, -10.0F, -1.0F, 13.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 13.0F, 0.1745F, 3.1416F, 0.0F)
      );
      everything.addOrReplaceChild(
         "shield4",
         CubeListBuilder.create().texOffs(7, 16).addBox(-6.5F, -10.0F, -1.0F, 13.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-13.0F, 0.0F, 0.0F, 0.1745F, 1.5708F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 86, 86);
   }

   @Override
   public void setupAnim(MutantBlazeShieldsRenderer.State state) {
      super.setupAnim(state);
      this.shield.visible = state.shields > 0;
      this.shield2.visible = state.shields > 1;
      this.shield3.visible = state.shields > 2;
      this.shield4.visible = state.shields > 3;
      this.mathAnimate(state, MutantBlazeShieldsMathAnimations.IDLE, 0L, 1.0F);
   }
}
