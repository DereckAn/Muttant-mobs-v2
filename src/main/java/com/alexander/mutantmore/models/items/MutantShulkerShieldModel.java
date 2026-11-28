package com.alexander.mutantmore.models.items;

import com.alexander.mutantmore.animation.keyframe_animations.definition.MutantShulkerShieldKeyframeAnimations;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.AnimationState;

/** Mutant Shulker Shield; state = ticks into the shoot animation, or -1 when not shooting (whole ticks keep the GUI atlas bounded). */
public class MutantShulkerShieldModel extends Model<Integer> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "mutant_shulker_shield"), "main");
   private final KeyframeAnimation shoot;
   private final AnimationState scratch = new AnimationState();

   public MutantShulkerShieldModel(ModelPart root) {
      super(root, RenderTypes::entityCutout);
      this.shoot = com.alexander.mutantmore.animation.LenientBake.bake(MutantShulkerShieldKeyframeAnimations.SHOOT, root);
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 3.0F));
      everything.addOrReplaceChild(
         "upperJaw",
         CubeListBuilder.create().texOffs(22, 77).addBox(-14.0F, -8.0F, -1.0F, 26.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.0F, -6.0F, -5.0F)
      );
      everything.addOrReplaceChild(
         "lowerJaw",
         CubeListBuilder.create().texOffs(22, 111).addBox(-14.0F, -15.0F, -1.0F, 26.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.0F, 12.0F, -5.0F)
      );
      everything.addOrReplaceChild(
         "main",
         CubeListBuilder.create()
            .texOffs(28, 39)
            .addBox(-25.0F, -26.0F, -1.0F, 26.0F, 26.0F, 3.0F, new CubeDeformation(0.0F))
            .texOffs(64, 91)
            .addBox(-24.0F, -25.0F, 0.0F, 24.0F, 24.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(12.0F, 12.0F, -5.0F)
      );
      everything.addOrReplaceChild(
         "handle",
         CubeListBuilder.create().texOffs(89, 66).addBox(-5.0F, -2.0F, -1.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.0F, 1.0F, -2.0F)
      );
      everything.addOrReplaceChild(
         "tendons",
         CubeListBuilder.create()
            .texOffs(95, 39)
            .addBox(-10.0F, -19.1F, -2.0F, 6.0F, 19.0F, 1.0F, new CubeDeformation(0.0F))
            .texOffs(114, 39)
            .addBox(4.0F, -19.1F, -2.0F, 6.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 12.0F, -3.0F)
      );
      return LayerDefinition.create(meshdefinition, 128, 128);
   }

   @Override
   public void setupAnim(Integer shootTick) {
      super.setupAnim(shootTick);
      if (shootTick >= 0) {
         this.scratch.start(0);
         this.shoot.apply(this.scratch, shootTick);
      }
   }
}
