package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.animation.keyframe_animations.definition.MutantShulkerTurretKeyframeAnimations;
import com.alexander.mutantmore.animation.math_animation.definition.MutantShulkerTurretMathAnimations;
import com.alexander.mutantmore.renderers.entities.MutantShulkerTurretRenderer;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class MutantShulkerTurretModel extends MMBaseEntityModel<MutantShulkerTurretRenderer.State> {
   private final ModelPart bottomHead;
   private final ModelPart middleHead;
   private final ModelPart topHead;

   private final KeyframeAnimation deploy;
   private final KeyframeAnimation bottomShoot;
   private final KeyframeAnimation middleShoot;
   private final KeyframeAnimation topShoot;

   public MutantShulkerTurretModel(ModelPart root) {
      super(root);

      this.bottomHead = root.getChild("everything").getChild("shell1").getChild("head");
      this.middleHead = root.getChild("everything").getChild("shell1").getChild("upperShell1").getChild("shell2").getChild("head2");
      this.topHead = root.getChild("everything")
         .getChild("shell1")
         .getChild("upperShell1")
         .getChild("shell2")
         .getChild("upperShell2")
         .getChild("shell3")
         .getChild("head3");
      this.deploy = MutantShulkerTurretKeyframeAnimations.DEPLOY.bake(root);
      this.bottomShoot = MutantShulkerTurretKeyframeAnimations.BOTTOM_SHOOT.bake(root);
      this.middleShoot = MutantShulkerTurretKeyframeAnimations.MIDDLE_SHOOT.bake(root);
      this.topShoot = MutantShulkerTurretKeyframeAnimations.TOP_SHOOT.bake(root);
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 25.0F, 0.0F));
      PartDefinition shell1 = everything.addOrReplaceChild(
         "shell1",
         CubeListBuilder.create()
            .texOffs(0, 36)
            .addBox(-12.0F, -8.0F, -12.0F, 24.0F, 8.0F, 24.0F, new CubeDeformation(0.0F))
            .texOffs(84, 85)
            .addBox(-12.0F, -15.0F, -12.0F, 24.0F, 7.0F, 24.0F, new CubeDeformation(0.0F))
            .texOffs(72, 36)
            .addBox(-15.0F, -6.0F, -15.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(72, 36)
            .addBox(-15.0F, -6.0F, 8.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(72, 36)
            .mirror()
            .addBox(8.0F, -6.0F, -15.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(72, 36)
            .mirror()
            .addBox(8.0F, -6.0F, 8.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(0.0F, -2.0F, 0.0F)
      );
      PartDefinition upperShell1 = shell1.addOrReplaceChild(
         "upperShell1",
         CubeListBuilder.create()
            .texOffs(0, 98)
            .addBox(-12.0F, 2.8F, -12.0F, 24.0F, 8.0F, 24.0F, new CubeDeformation(-0.01F))
            .texOffs(0, 0)
            .addBox(-12.0F, -7.175F, -12.0F, 24.0F, 10.0F, 24.0F, new CubeDeformation(-0.01F))
            .texOffs(72, 36)
            .addBox(-13.0F, -11.2F, -13.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(72, 36)
            .mirror()
            .addBox(6.0F, -11.2F, -13.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(72, 36)
            .addBox(-13.0F, -11.2F, 6.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(72, 36)
            .mirror()
            .addBox(6.0F, -11.2F, 6.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(0.0F, -19.8F, 0.0F)
      );
      PartDefinition shell2 = upperShell1.addOrReplaceChild(
         "shell2",
         CubeListBuilder.create().texOffs(100, 28).addBox(-8.0F, -8.1F, -8.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -7.0F, 0.0F)
      );
      PartDefinition upperShell2 = shell2.addOrReplaceChild(
         "upperShell2",
         CubeListBuilder.create()
            .texOffs(100, 0)
            .addBox(-8.0F, -5.1F, -8.0F, 16.0F, 12.0F, 16.0F, new CubeDeformation(0.0F))
            .texOffs(72, 50)
            .mirror()
            .addBox(4.5F, -7.8F, -9.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(72, 50)
            .mirror()
            .addBox(4.5F, -7.8F, 4.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(72, 50)
            .mirror()
            .addBox(-9.5F, -7.8F, -9.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
            .mirror(false)
            .texOffs(72, 50)
            .mirror()
            .addBox(-9.5F, -7.8F, 4.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(0.0F, -11.0F, 0.0F)
      );
      PartDefinition shell3 = upperShell2.addOrReplaceChild(
         "shell3",
         CubeListBuilder.create().texOffs(100, 28).addBox(-8.0F, -8.11F, -8.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -5.0F, 0.0F)
      );
      shell3.addOrReplaceChild(
         "upperShell3",
         CubeListBuilder.create().texOffs(100, 0).addBox(-8.0F, -5.11F, -8.0F, 16.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -11.0F, 0.0F)
      );
      shell3.addOrReplaceChild(
         "head3",
         CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.11F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -10.0F, 0.0F)
      );
      shell2.addOrReplaceChild(
         "head2",
         CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.1F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -10.0F, 0.0F)
      );
      shell1.addOrReplaceChild(
         "head",
         CubeListBuilder.create().texOffs(96, 52).addBox(-4.5F, -4.4F, -4.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -15.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 180, 130);
   }

   @Override
   public void setupAnim(MutantShulkerTurretRenderer.State state) {
      super.setupAnim(state);
      this.mathAnimate(state, MutantShulkerTurretMathAnimations.IDLE, 0L, 1.0F);
      this.deploy.apply(state.deployAnimation, state.ageInTicks);
      this.bottomShoot.apply(state.bottomShootAnimation, state.ageInTicks);
      this.middleShoot.apply(state.middleShootAnimation, state.ageInTicks);
      this.topShoot.apply(state.topShootAnimation, state.ageInTicks);
      this.bottomHead.xRot += (float)Math.toRadians(state.xRot);
      this.bottomHead.yRot += (float)Math.toRadians(state.yRot);
      this.middleHead.xRot += (float)Math.toRadians(state.midHeadXRot);
      this.middleHead.yRot += (float)Math.toRadians(state.midHeadYRot);
      this.topHead.xRot += (float)Math.toRadians(state.topHeadXRot);
      this.topHead.yRot += (float)Math.toRadians(state.topHeadYRot);
   }
}
