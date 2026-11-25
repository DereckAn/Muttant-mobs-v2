package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveMotionTypes;
import com.alexander.mutantmore.util.MiscUtils;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.rendertype.RenderTypes;

public class GiantSnowballModel extends Model<EntityRenderState> {
   public final ModelPart snowBlock;

   public GiantSnowballModel(ModelPart root) {
      super(root, RenderTypes::entityTranslucent);
      this.snowBlock = root.getChild("snowBlock");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition snowBlock = partdefinition.addOrReplaceChild(
         "snowBlock",
         CubeListBuilder.create().texOffs(128, 0).addBox(-20.0F, -20.0F, -20.0F, 40.0F, 40.0F, 40.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 4.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 288, 128);
   }

   @Override
   public void setupAnim(EntityRenderState state) {
      super.setupAnim(state);
      // Tumbles as it flies
      float tick = SineWaveAnimationUtils.getTick(state.ageInTicks, true);
      this.snowBlock.yRot = MiscUtils.degToRad(90.0F);
      SineWaveAnimationUtils.addConstantMotionToModelPart(this.snowBlock, 400.0F, tick, 1.0F, 1.0F, SineWaveMotionTypes.ROTATION_Z);
      SineWaveAnimationUtils.addConstantMotionToModelPart(this.snowBlock, 100.0F, tick, 1.0F, 1.0F, SineWaveMotionTypes.ROTATION_Y);
   }
}
