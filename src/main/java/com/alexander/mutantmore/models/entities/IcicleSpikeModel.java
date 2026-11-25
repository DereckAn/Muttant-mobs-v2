package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.animation.keyframe_animations.definition.IcicleSpikeKeyframeAnimations;
import com.alexander.mutantmore.renderers.entities.IcicleSpikeRenderer;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.rendertype.RenderTypes;

public class IcicleSpikeModel extends Model<IcicleSpikeRenderer.State> {
   public final ModelPart spike;
   private final KeyframeAnimation rise;

   public IcicleSpikeModel(ModelPart root) {
      super(root, RenderTypes::entityTranslucent);
      this.spike = root.getChild("spike");
      this.rise = IcicleSpikeKeyframeAnimations.ICICLE_SPIKE.bake(root);
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition spike = partdefinition.addOrReplaceChild(
         "spike",
         CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, -6.5F, -23.0F, 0.0F, 13.0F, 43.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 47.5F, 0.0F, -1.5708F, 0.0F, 0.0F)
      );
      PartDefinition projectiles_r1 = spike.addOrReplaceChild(
         "projectiles_r1",
         CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, -6.5F, -1.0F, 0.0F, 13.0F, 43.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 0.0F, -22.0F, 0.0F, 0.0F, 1.5708F)
      );
      return LayerDefinition.create(meshdefinition, 320, 128);
   }

   @Override
   public void setupAnim(IcicleSpikeRenderer.State state) {
      super.setupAnim(state);
      this.rise.apply(state.spikeAnimationState, state.ageInTicks);
      this.root().xRot += state.xRot * (float) (Math.PI / 180.0);
      this.root().yRot += state.yRot * (float) (Math.PI / 180.0);
   }
}
