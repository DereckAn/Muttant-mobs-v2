package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveMotionTypes;
import com.alexander.mutantmore.renderers.entities.SandBoulderRenderer;
import com.alexander.mutantmore.util.MiscUtils;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.rendertype.RenderTypes;

public class SandBoulderModel extends Model<SandBoulderRenderer.State> {
   public final ModelPart sandBlock;

   public SandBoulderModel(ModelPart root) {
      super(root, RenderTypes::entityTranslucent);
      this.sandBlock = root.getChild("sandBlock");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition sandBlock = partdefinition.addOrReplaceChild(
         "sandBlock",
         CubeListBuilder.create()
            .texOffs(151, 2)
            .addBox(-10.0F, -10.0F, -10.0F, 20.0F, 20.0F, 20.0F, new CubeDeformation(0.0F))
            .texOffs(169, 85)
            .addBox(-10.0F, -10.0F, -10.0F, 20.0F, 20.0F, 20.0F, new CubeDeformation(0.5F)),
         PartPose.offset(0.0F, 14.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 256, 128);
   }

   @Override
   public void setupAnim(SandBoulderRenderer.State state) {
      super.setupAnim(state);
      this.sandBlock.yRot = MiscUtils.degToRad(90.0F);
      // Rolls faster the faster it moves
      SineWaveAnimationUtils.addConstantMotionToModelPart(
         this.sandBlock, state.speed * 600.0F, SineWaveAnimationUtils.getTick(state.ageInTicks, true), 1.0F, 1.0F, SineWaveMotionTypes.ROTATION_X
      );
   }
}
