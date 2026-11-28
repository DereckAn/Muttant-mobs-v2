package com.alexander.mutantmore.models.blockentities;

import com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers.AbstractAdvancedAnimation;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.model_animations.AdvancedAnimator;
import com.alexander.mutantmore.animation.definitions.HeatstormGeneratorAdvancedAnimations;
import java.util.List;
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

/** Heatstorm Generator; state = block entity age in ticks (bobs the core), or negative for the still item. */
public class HeatstormGeneratorModel extends Model<Float> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "heatstorm_generator"), "main");
   private final List<ModelPart> parts;
   /** ponytail: the idle animation only reads life_time, so one always-looping animation driven by the age is enough */
   private final AbstractAdvancedAnimation idle = new AbstractAdvancedAnimation(false) {
      {
         this.startLooping(0);
      }

      @Override
      public boolean serverSide() {
         return true;
      }

      @Override
      public void syncToClient() {
      }

      @Override
      public void clientUpdate() {
      }

      @Override
      public float lerpAmount() {
         return 1.0F;
      }
   };

   public HeatstormGeneratorModel(ModelPart root) {
      super(root, RenderTypes::entityCutout);
      this.parts = root.getAllParts();
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
      PartDefinition coreParts = everything.addOrReplaceChild("coreParts", CubeListBuilder.create(), PartPose.offset(0.0F, -5.9F, 0.0F));
      PartDefinition core = coreParts.addOrReplaceChild(
         "core",
         CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition coreExterior = core.addOrReplaceChild(
         "coreExterior",
         CubeListBuilder.create().texOffs(5, 12).addBox(-4.5F, -4.5F, 0.0F, 9.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition coreExterior_r1 = coreExterior.addOrReplaceChild(
         "coreExterior_r1",
         CubeListBuilder.create().texOffs(5, 12).addBox(0.0F, -9.0F, 0.0F, 9.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, 4.5F, -4.5F, 0.0F, -1.5708F, 0.0F)
      );
      PartDefinition coreRings = coreParts.addOrReplaceChild(
         "coreRings",
         CubeListBuilder.create().texOffs(0, 65).addBox(-10.0F, 0.0F, -10.0F, 20.0F, 1.0F, 20.0F, new CubeDeformation(1.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 86, 86);
   }

   @Override
   public void setupAnim(Float age) {
      super.setupAnim(age);
      if (age >= 0.0F) {
         this.idle.getModifiers().put("life_time", age * (float)(Math.PI / 180.0) / 20.0F);
         this.idle.getModifiers().put("anim_time", 0.0F);
         AdvancedAnimator.animate(this.parts, this.idle, HeatstormGeneratorAdvancedAnimations.HEATSTORM_GENERATOR_IDLE);
      }
   }
}
