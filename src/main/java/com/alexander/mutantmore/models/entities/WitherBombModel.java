package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.animation.keyframe_animations.definition.WitherBombKeyframeAnimations;
import com.alexander.mutantmore.renderers.entities.WitherBombRenderer;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.rendertype.RenderTypes;

/** Wither Bomb: a spinning, shrunken ball in flight; unfolds when deployed. Also used (state == null) for the item. */
public class WitherBombModel extends EntityModel<WitherBombRenderer.State> {
   private final ModelPart ball;
   private final ModelPart everything;
   private final KeyframeAnimation deploy;
   private final KeyframeAnimation activate;
   private final KeyframeAnimation ground;

   public WitherBombModel(ModelPart root) {
      super(root, RenderTypes::entityTranslucent);
      this.ball = root.getChild("ball");
      this.everything = this.ball.getChild("everything");
      this.deploy = WitherBombKeyframeAnimations.DEPLOY.bake(root);
      this.activate = WitherBombKeyframeAnimations.ACTIVATE.bake(root);
      this.ground = WitherBombKeyframeAnimations.GROUND.bake(root);
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition ball = partdefinition.addOrReplaceChild("ball", CubeListBuilder.create(), PartPose.offset(0.0F, 18.0F, 0.0F));
      PartDefinition everything = ball.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0F, 0.0F));
      PartDefinition jaw = everything.addOrReplaceChild(
         "jaw",
         CubeListBuilder.create().texOffs(72, 0).addBox(-4.0F, -2.8935F, -8.0351F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.25F)),
         PartPose.offsetAndRotation(0.0F, -1.4527F, 4.0304F, -0.1309F, 0.0F, 0.0F)
      );
      PartDefinition head = jaw.addOrReplaceChild(
         "head",
         CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.6527F, -7.4696F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -0.3473F, -0.5304F, -0.1745F, 0.0F, 0.0F)
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
         PartPose.offsetAndRotation(-4.0F, -0.6527F, -2.9696F, 1.0036F, 0.0F, 0.0F)
      );
      PartDefinition ribs = everything.addOrReplaceChild("ribs", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
      PartDefinition rib10 = ribs.addOrReplaceChild(
         "rib10",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, 0.0F, 1.5708F, 0.0F)
      );
      PartDefinition rib11 = rib10.addOrReplaceChild(
         "rib11",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.02F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
         PartPose.offset(6.0F, 0.0F, 0.0F)
      );
      rib11.addOrReplaceChild(
         "rib12",
         CubeListBuilder.create().texOffs(33, 12).addBox(0.0F, -1.01F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(6.0F, 0.0F, 0.0F)
      );
      rib10.addOrReplaceChild(
         "shoulderPad1",
         CubeListBuilder.create().texOffs(28, 16).addBox(0.0F, -1.0F, -3.0F, 8.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.2182F)
      );
      PartDefinition rib7 = ribs.addOrReplaceChild(
         "rib7",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.0F, -1.0F, 0.0F, 0.0F, 3.1416F, 0.0F)
      );
      PartDefinition rib8 = rib7.addOrReplaceChild(
         "rib8",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.02F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
         PartPose.offset(6.0F, 0.0F, 0.0F)
      );
      rib8.addOrReplaceChild(
         "rib9",
         CubeListBuilder.create().texOffs(31, 12).addBox(0.0F, -1.01F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(6.0F, 0.0F, 0.0F)
      );
      rib7.addOrReplaceChild(
         "shoulderPad2",
         CubeListBuilder.create().texOffs(28, 16).addBox(2.0F, -1.0F, -3.0F, 8.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1745F)
      );
      PartDefinition rib = ribs.addOrReplaceChild(
         "rib",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(2.0F, -1.0F, 0.0F)
      );
      PartDefinition rib2 = rib.addOrReplaceChild(
         "rib2",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.02F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
         PartPose.offset(6.0F, 0.0F, 0.0F)
      );
      rib2.addOrReplaceChild(
         "rib3",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.01F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(6.0F, 0.0F, 0.0F)
      );
      rib.addOrReplaceChild(
         "shoulderPad3",
         CubeListBuilder.create().texOffs(28, 16).addBox(2.0F, -1.0F, -3.0F, 8.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1745F)
      );
      PartDefinition rib4 = ribs.addOrReplaceChild(
         "rib4",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -1.0F, 2.0F, 0.0F, -1.5708F, 0.0F)
      );
      PartDefinition rib5 = rib4.addOrReplaceChild(
         "rib5",
         CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, -1.02F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
         PartPose.offset(6.0F, 0.0F, 0.0F)
      );
      rib5.addOrReplaceChild(
         "rib6",
         CubeListBuilder.create().texOffs(33, 12).addBox(0.0F, -1.01F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(6.0F, 0.0F, 0.0F)
      );
      rib4.addOrReplaceChild(
         "shoulderPad4",
         CubeListBuilder.create().texOffs(28, 16).addBox(2.0F, -1.0F, -3.0F, 8.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1745F)
      );
      return LayerDefinition.create(meshdefinition, 128, 128);
   }

   @Override
   public void setupAnim(WitherBombRenderer.State state) {
      super.setupAnim(state);
      if (state.item) {
         this.ground.applyStatic();
         this.everything.xScale += 0.25F;
         this.everything.yScale += 0.25F;
         this.everything.zScale += 0.25F;
         return;
      }

      this.deploy.apply(state.deployAnimation, state.ageInTicks);
      this.activate.apply(state.activateAnimation, state.ageInTicks);
      if (!state.deployAnimation.isStarted() && !state.activateAnimation.isStarted()) {
         this.ground.applyStatic();
      }

      if (!state.deployed) {
         float seconds = state.ageInTicks / 20.0F;
         this.ball.xRot += (float)Math.toRadians(-seconds * 500.0F);
         this.ball.yRot += (float)Math.toRadians(seconds * 200.0F);
         this.everything.xScale -= 0.25F;
         this.everything.yScale -= 0.25F;
         this.everything.zScale -= 0.25F;
      }
   }
}
