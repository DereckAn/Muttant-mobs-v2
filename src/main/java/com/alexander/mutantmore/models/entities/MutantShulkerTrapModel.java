package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.animation.keyframe_animations.definition.MutantShulkerTrapKeyframeAnimations;
import com.alexander.mutantmore.animation.math_animation.definition.MutantShulkerTrapMathAnimations;
import com.alexander.mutantmore.renderers.entities.MutantShulkerTrapRenderer;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class MutantShulkerTrapModel extends MMBaseEntityModel<MutantShulkerTrapRenderer.State> {

   private final KeyframeAnimation activate;
   private final KeyframeAnimation playerActivate;
   private final KeyframeAnimation vanish;

   public MutantShulkerTrapModel(ModelPart root) {
      super(root);

      this.activate = MutantShulkerTrapKeyframeAnimations.ACTIVATE.bake(root);
      this.playerActivate = MutantShulkerTrapKeyframeAnimations.PLAYER_ACTIVATE.bake(root);
      this.vanish = MutantShulkerTrapKeyframeAnimations.VANISH.bake(root);
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, 0.0F));
      everything.addOrReplaceChild(
         "side1",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-8.0F, -6.0F, 0.0F, 16.0F, 6.0F, 8.0F, new CubeDeformation(-0.01F))
            .texOffs(0, 46)
            .addBox(-8.0F, -2.0F, 0.0F, 16.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)),
         PartPose.offset(0.0F, 4.0F, 0.0F)
      );
      everything.addOrReplaceChild(
         "side2",
         CubeListBuilder.create()
            .texOffs(0, 27)
            .addBox(-8.0F, -6.0F, -8.0F, 16.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(0, 55)
            .addBox(-8.0F, -2.0F, -8.0F, 16.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 4.0F, 0.0F)
      );
      everything.addOrReplaceChild(
         "head",
         CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 1.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 64, 64);
   }

   @Override
   public void setupAnim(MutantShulkerTrapRenderer.State state) {
      super.setupAnim(state);
      if (state.airborne) {
         this.mathAnimate(state, MutantShulkerTrapMathAnimations.AIRBORNE, 0L, 1.0F);
      }

      this.mathAnimateState(state, state.idleAnimation, MutantShulkerTrapMathAnimations.IDLE, 1.0F, 1.0F);
      (state.multiuse ? this.playerActivate : this.activate).apply(state.activateAnimation, state.ageInTicks);
      this.vanish.apply(state.vanishAnimation, state.ageInTicks);
   }
}
