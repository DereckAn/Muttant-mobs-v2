package com.alexander.mutantmore.models.blockentities;

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

/** Placed Mutant Wither Skeleton skull; state = standing on the floor (jaw closed, tilted) vs hung on a wall (jaw open). */
public class CustomSkullModel extends Model<Boolean> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "custom_skull"), "main");
   private final ModelPart head;
   private final ModelPart jaw;

   public CustomSkullModel(ModelPart root) {
      super(root, RenderTypes::entityTranslucent);
      this.head = root.getChild("head");
      this.jaw = this.head.getChild("jaw");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition head = partdefinition.addOrReplaceChild(
         "head",
         CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 23.5F, 0.0F)
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
         PartPose.offsetAndRotation(-4.0F, -1.0F, 0.5F, 1.0036F, 0.0F, 0.0F)
      );
      head.addOrReplaceChild(
         "jaw",
         CubeListBuilder.create().texOffs(72, 0).addBox(-4.0F, -2.8935F, -8.0351F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.25F)),
         PartPose.offset(0.0F, 0.0F, 4.0F)
      );
      return LayerDefinition.create(meshdefinition, 128, 128);
   }

   @Override
   public void setupAnim(Boolean onGround) {
      super.setupAnim(onGround);
      if (onGround) {
         this.head.y -= 0.6F;
         this.head.xRot -= (float)Math.toRadians(10.0);
         this.jaw.xRot += (float)Math.toRadians(10.0);
      } else {
         this.head.z -= 0.05F;
         this.jaw.y -= 0.4F;
         this.jaw.z -= 0.3F;
         this.jaw.xRot += (float)Math.toRadians(27.5);
         this.jaw.zScale -= 0.1F;
      }
   }
}
