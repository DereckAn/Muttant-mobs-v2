package com.alexander.mutantmore.models.blockentities;

import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import com.alexander.mutantmore.animation.sine_wave_animations.definition.SnowstormGeneratorSineWaveAnimations;
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

/** Snowstorm Generator; state = block entity age in ticks (spins the core), or a negative value for the still item. */
public class SnowstormGeneratorModel extends Model<Float> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "snowstorm_generator"), "main");
   private final ModelPart everything;
   public final ModelPart core;

   public SnowstormGeneratorModel(ModelPart root) {
      super(root, RenderTypes::entityCutout);
      this.everything = root.getChild("everything");
      this.core = this.everything.getChild("core");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild(
         "everything",
         CubeListBuilder.create()
            .texOffs(22, 25)
            .addBox(-8.0F, 6.0F, -8.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
            .texOffs(38, 0)
            .addBox(-6.0F, -6.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
            .texOffs(0, 46)
            .addBox(-5.5F, -12.0F, -5.5F, 11.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 14.0F, 0.0F)
      );
      PartDefinition core = everything.addOrReplaceChild(
         "core",
         CubeListBuilder.create().texOffs(-9, 0).addBox(-4.5F, -0.1F, -4.5F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -8.9F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 86, 86);
   }

   @Override
   public void setupAnim(Float age) {
      super.setupAnim(age);
      if (age >= 0.0F) {
         SnowstormGeneratorSineWaveAnimations.snowstormGeneratorIdleAnimation(this, SineWaveAnimationUtils.getTick(age, true), 1.0F, 1.0F);
      }
   }
}
