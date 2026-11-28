package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.animation.keyframe_animations.definition.RodlingKeyframeAnimations;
import com.alexander.mutantmore.animation.math_animation.MathAnim;
import com.alexander.mutantmore.animation.math_animation.definition.RodlingMathAnimations;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.item.DyeColor;
import org.jspecify.annotations.Nullable;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

/** Shared by the Rodling and the Mutant Blaze's rod projectile (which turns into a Rodling or a collectable rod). */
public class RodlingModel extends MMBaseEntityModel<RodlingModel.State> {
   private final ModelPart rodling;
   private final ModelPart projectile;
   private final ModelPart head;
   private final ModelPart rod1;
   private final ModelPart rod2;
   private final ModelPart shield1;
   private final ModelPart shield2;
   private final ModelPart headArmour;
   private final ModelPart rodArmour;
   private final ModelPart shieldArmour;
   private final ModelPart rodArmour2;
   private final ModelPart shieldArmour2;
   private final KeyframeAnimation sit;
   private final KeyframeAnimation projectilePose;
   private final KeyframeAnimation novelty;
   private final KeyframeAnimation shoot;

   public RodlingModel(ModelPart root) {
      super(root);
      this.rodling = root.getChild("everything");
      this.projectile = root.getChild("projectile");
      this.head = this.rodling.getChild("head");
      ModelPart rod1Parts = this.rodling.getChild("rods").getChild("rod1Parts");
      ModelPart rod2Parts = this.rodling.getChild("rods").getChild("rod2Parts");
      this.rod1 = rod1Parts.getChild("rod1");
      this.rod2 = rod2Parts.getChild("rod2");
      this.shield1 = rod1Parts.getChild("shield1");
      this.shield2 = rod2Parts.getChild("shield2");
      this.headArmour = this.head.getChild("headArmour");
      this.rodArmour = this.rod1.getChild("rodArmour");
      this.shieldArmour = this.shield2.getChild("shieldArmour");
      this.rodArmour2 = this.rod2.getChild("rodArmour2");
      this.shieldArmour2 = this.shield1.getChild("shieldArmour2");
      this.sit = com.alexander.mutantmore.animation.LenientBake.bake(RodlingKeyframeAnimations.SIT, root);
      this.projectilePose = com.alexander.mutantmore.animation.LenientBake.bake(RodlingKeyframeAnimations.PROJECTILE, root);
      this.novelty = com.alexander.mutantmore.animation.LenientBake.bake(RodlingKeyframeAnimations.NOVELTY, root);
      this.shoot = com.alexander.mutantmore.animation.LenientBake.bake(RodlingKeyframeAnimations.SHOOT, root);
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition projectile = partdefinition.addOrReplaceChild("projectile", CubeListBuilder.create(), PartPose.offset(0.0F, 23.0F, 0.0F));
      projectile.addOrReplaceChild(
         "rod",
         CubeListBuilder.create().texOffs(24, 18).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F)
      );
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 18.5F, 0.0F));
      PartDefinition head = everything.addOrReplaceChild(
         "head",
         CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -2.5F, 0.0F)
      );
      head.addOrReplaceChild(
         "headArmour",
         CubeListBuilder.create()
            .texOffs(16, 5)
            .addBox(-4.0F, -4.0F, 0.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.25F))
            .texOffs(16, 0)
            .addBox(-4.0F, -5.5F, 0.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.25F)),
         PartPose.offset(2.0F, 2.0F, -2.0F)
      );
      PartDefinition rods = everything.addOrReplaceChild("rods", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, 0.0F));
      PartDefinition rod1Parts = rods.addOrReplaceChild("rod1Parts", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 0.0F, -2.5F, 0.0F, 0.7854F, 0.0F));
      PartDefinition rod1 = rod1Parts.addOrReplaceChild(
         "rod1",
         CubeListBuilder.create().texOffs(8, 14).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      rod1.addOrReplaceChild(
         "rodArmour",
         CubeListBuilder.create().texOffs(12, 14).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition shield1 = rod1Parts.addOrReplaceChild(
         "shield1",
         CubeListBuilder.create().texOffs(8, 8).addBox(-0.5F, -1.0F, 2.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(-1.0F, -1.5F, -3.0F)
      );
      shield1.addOrReplaceChild(
         "shieldArmour2",
         CubeListBuilder.create().texOffs(17, 14).addBox(-1.5F, -2.5F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.1F)),
         PartPose.offset(1.0F, 1.5F, 3.0F)
      );
      PartDefinition rod2Parts = rods.addOrReplaceChild("rod2Parts", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 0.0F, 2.5F, 0.0F, 0.7854F, 0.0F));
      PartDefinition rod2 = rod2Parts.addOrReplaceChild(
         "rod2",
         CubeListBuilder.create().texOffs(8, 14).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      rod2.addOrReplaceChild(
         "rodArmour2",
         CubeListBuilder.create().texOffs(12, 14).addBox(4.5F, -0.5F, 4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)),
         PartPose.offset(-5.0F, 0.0F, -5.0F)
      );
      PartDefinition shield2 = rod2Parts.addOrReplaceChild(
         "shield2",
         CubeListBuilder.create().texOffs(8, 8).addBox(-3.0F, -5.0F, 0.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(1.5F, 2.5F, -0.5F)
      );
      shield2.addOrReplaceChild(
         "shieldArmour",
         CubeListBuilder.create().texOffs(17, 14).addBox(-1.5F, -2.5F, -0.5F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.1F)),
         PartPose.offset(-1.5F, -2.5F, 0.5F)
      );
      PartDefinition rodRemains = everything.addOrReplaceChild("rodRemains", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, 0.0F));
      rodRemains.addOrReplaceChild(
         "rodRemainsUpper",
         CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
         PartPose.offset(0.0F, -2.0F, 0.0F)
      );
      rodRemains.addOrReplaceChild(
         "rodRemainsLower",
         CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)),
         PartPose.offset(0.0F, 3.0F, 0.0F)
      );
      PartDefinition coreParts = rodRemains.addOrReplaceChild("coreParts", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 0.0F));
      coreParts.addOrReplaceChild(
         "core",
         CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -4.0F, 0.0F)
      );
      coreParts.addOrReplaceChild(
         "coreRing",
         CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -4.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 32, 29);
   }

   @Override
   public void setupAnim(State state) {
      super.setupAnim(state);
      this.projectile.visible = state.rodShape;
      this.rodling.visible = !state.rodShape;
      if (state.rodShape) {
         return;
      }

      this.headArmour.visible = state.hasArmour;
      this.rodArmour.visible = state.hasArmour;
      this.shieldArmour.visible = state.hasArmour;
      this.rodArmour2.visible = state.hasArmour;
      this.shieldArmour2.visible = state.hasArmour;
      this.shield1.visible = state.hasShields && state.shields > 0;
      this.shield2.visible = state.hasShields && state.shields > 1;
      this.rod1.visible = !state.hasShields;
      this.rod2.visible = !state.hasShields;
      if (state.sitting) {
         this.sit.applyStatic();
         this.head.xRot += (float)Math.toRadians(-15.0F - MathAnim.cosWave(state.ageInTicks / 20.0F, 50.0F, -3.5F, -50.0F));
      } else if (state.flying) {
         this.projectilePose.applyStatic();
      } else {
         this.mathAnimate(state, RodlingMathAnimations.IDLE, 0L, state.idleScale);
      }

      if (state.living) {
         this.novelty.apply(state.noveltyAnimation, state.ageInTicks);
         this.shoot.apply(state.shootAnimation, state.ageInTicks);
         this.head.xRot += (float)Math.toRadians(state.xRot);
         this.head.yRot += (float)Math.toRadians(state.yRot);
      }
   }

   public static class State extends LivingEntityRenderState {
      public final AnimationState noveltyAnimation = new AnimationState();
      public final AnimationState shootAnimation = new AnimationState();
      /** plain blaze rod (projectile that isn't a Rodling) */
      public boolean rodShape;
      public boolean living;
      public boolean flying;
      public boolean sitting;
      public boolean hasArmour;
      public boolean hasShields;
      public int shields = 2;
      public int entityId;
      public float idleScale;
      public boolean soul;
      public boolean tame;
      public @Nullable DyeColor color;
   }
}
