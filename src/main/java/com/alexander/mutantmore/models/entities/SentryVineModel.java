package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.animation.keyframe_animations.definition.SentryVineKeyframeAnimations;
import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import com.alexander.mutantmore.animation.sine_wave_animations.definition.SentryVineSineWaveAnimations;
import com.alexander.mutantmore.client.SentryVineRenderState;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class SentryVineModel extends EntityModel<SentryVineRenderState> {
   public final ModelPart everything;
   public final ModelPart vine1;
   public final ModelPart vine2;
   public final ModelPart vine3;
   public final ModelPart vine4;
   public final ModelPart vine5;
   public final ModelPart vine6;

   private final KeyframeAnimation deploy;
   private final KeyframeAnimation trySlam;
   private final KeyframeAnimation slam;
   private final KeyframeAnimation attack;

   public SentryVineModel(ModelPart root) {
      super(root);

      this.everything = root.getChild("everything");
      this.vine1 = this.everything.getChild("vine1");
      this.vine2 = this.vine1.getChild("vine2");
      this.vine3 = this.vine2.getChild("vine3");
      this.vine4 = this.vine3.getChild("vine4");
      this.vine5 = this.vine4.getChild("vine5");
      this.vine6 = this.vine5.getChild("vine6");
      this.deploy = SentryVineKeyframeAnimations.SENTRY_VINE_DEPLOY.bake(root);
      this.trySlam = SentryVineKeyframeAnimations.SENTRY_VINE_TRY_SLAM.bake(root);
      this.slam = SentryVineKeyframeAnimations.SENTRY_VINE_SLAM.bake(root);
      this.attack = SentryVineKeyframeAnimations.SENTRY_VINE_ATTACK.bake(root);
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 25.0F, 0.0F));
      PartDefinition vine1 = everything.addOrReplaceChild(
         "vine1",
         CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -20.0F, -6.0F, 12.0F, 20.0F, 12.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition vine2 = vine1.addOrReplaceChild(
         "vine2",
         CubeListBuilder.create().texOffs(0, 32).addBox(-5.0F, -18.0F, -5.0F, 10.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -19.0F, 0.0F)
      );
      PartDefinition vine3 = vine2.addOrReplaceChild(
         "vine3",
         CubeListBuilder.create().texOffs(0, 60).addBox(-4.0F, -18.0F, -4.0F, 8.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -17.0F, 0.0F)
      );
      PartDefinition vine4 = vine3.addOrReplaceChild(
         "vine4",
         CubeListBuilder.create().texOffs(47, 36).addBox(-3.0F, -18.0F, -3.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -17.0F, 0.0F)
      );
      PartDefinition vine5 = vine4.addOrReplaceChild(
         "vine5",
         CubeListBuilder.create().texOffs(36, 62).addBox(-2.0F, -18.0F, -2.0F, 4.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -17.0F, 0.0F)
      );
      PartDefinition vine6 = vine5.addOrReplaceChild(
         "vine6",
         CubeListBuilder.create().texOffs(54, 15).addBox(-1.0F, -18.0F, -1.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -17.0F, 0.0F)
      );
      PartDefinition spike7 = vine5.addOrReplaceChild("spike7", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -10.5F, 0.0F, 0.6397F, -0.2359F, -0.8501F));
      PartDefinition spike_r1 = spike7.addOrReplaceChild(
         "spike_r1",
         CubeListBuilder.create().texOffs(76, 15).addBox(0.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F)
      );
      PartDefinition spike_r2 = spike7.addOrReplaceChild(
         "spike_r2",
         CubeListBuilder.create().texOffs(76, 15).addBox(0.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F)
      );
      PartDefinition spike6 = vine3.addOrReplaceChild("spike6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -12.5F, -3.0F, -0.3764F, 0.5134F, -2.7524F));
      PartDefinition spike_r3 = spike6.addOrReplaceChild(
         "spike_r3",
         CubeListBuilder.create().texOffs(76, 15).addBox(0.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F)
      );
      PartDefinition spike_r4 = spike6.addOrReplaceChild(
         "spike_r4",
         CubeListBuilder.create().texOffs(76, 15).addBox(0.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F)
      );
      PartDefinition spike4 = vine2.addOrReplaceChild("spike4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -9.5F, -4.0F, -1.0735F, 0.8227F, -0.8593F));
      PartDefinition spike_r5 = spike4.addOrReplaceChild(
         "spike_r5",
         CubeListBuilder.create().texOffs(76, 15).addBox(0.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F)
      );
      PartDefinition spike_r6 = spike4.addOrReplaceChild(
         "spike_r6",
         CubeListBuilder.create().texOffs(76, 15).addBox(0.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F)
      );
      PartDefinition spike5 = vine2.addOrReplaceChild("spike5", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -16.5F, 4.0F, -1.1042F, -0.33F, -1.1613F));
      PartDefinition spike_r7 = spike5.addOrReplaceChild(
         "spike_r7",
         CubeListBuilder.create().texOffs(76, 15).addBox(0.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F)
      );
      PartDefinition spike_r8 = spike5.addOrReplaceChild(
         "spike_r8",
         CubeListBuilder.create().texOffs(76, 15).addBox(0.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F)
      );
      PartDefinition spike = vine1.addOrReplaceChild("spike", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -15.5F, -2.0F, 0.0F, -0.2618F, -0.2618F));
      PartDefinition spike_r9 = spike.addOrReplaceChild(
         "spike_r9",
         CubeListBuilder.create().texOffs(76, 15).addBox(0.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F)
      );
      PartDefinition spike_r10 = spike.addOrReplaceChild(
         "spike_r10",
         CubeListBuilder.create().texOffs(76, 15).addBox(0.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F)
      );
      PartDefinition spike2 = vine1.addOrReplaceChild("spike2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -9.5F, -5.0F, 2.2353F, 1.2923F, 2.2544F));
      PartDefinition spike_r11 = spike2.addOrReplaceChild(
         "spike_r11",
         CubeListBuilder.create().texOffs(76, 15).addBox(0.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F)
      );
      PartDefinition spike_r12 = spike2.addOrReplaceChild(
         "spike_r12",
         CubeListBuilder.create().texOffs(76, 15).addBox(0.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F)
      );
      PartDefinition spike3 = vine1.addOrReplaceChild("spike3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -12.5F, 4.0F, 2.8555F, -0.4968F, -2.5886F));
      PartDefinition spike_r13 = spike3.addOrReplaceChild(
         "spike_r13",
         CubeListBuilder.create().texOffs(76, 15).addBox(0.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F)
      );
      PartDefinition spike_r14 = spike3.addOrReplaceChild(
         "spike_r14",
         CubeListBuilder.create().texOffs(76, 15).addBox(0.0F, -1.5F, 0.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 100, 100);
   }

   @Override
   public void setupAnim(SentryVineRenderState state) {
      super.setupAnim(state);
      float age = state.ageInTicks;
      if (state.deployAnimationTick > 0) {
         this.deploy.apply(state.deployAnimationState, age);
      } else if (state.trySlamAnimationTick > 0) {
         this.trySlam.apply(state.trySlamAnimationState, age);
      } else if (state.slamAnimationTick > 0) {
         this.slam.apply(state.slamAnimationState, age);
      } else if (state.attackAnimationTick > 0) {
         this.attack.apply(state.attackAnimationState, age);
      } else {
         SentryVineSineWaveAnimations.sentryVineIdleAnimation(this, SineWaveAnimationUtils.getTick(age, true), 1.0F, 1.0F);
      }
   }
}
