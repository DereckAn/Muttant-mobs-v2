package com.alexander.mutantmore.renderers.items;

import com.alexander.mutantmore.models.blockentities.CustomSkullModel;
import com.alexander.mutantmore.renderers.blockentities.CustomSkullBlockRenderer;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.serialization.MapCodec;
import java.util.function.Consumer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.special.NoDataSpecialModelRenderer;
import net.minecraft.client.renderer.special.SpecialModelRenderer;
import net.minecraft.resources.Identifier;
import org.joml.Vector3fc;

/** Mutant Wither Skeleton skull item: the placed floor skull (was the BEWLR branch). */
public class CustomSkullSpecialRenderer implements NoDataSpecialModelRenderer {
   public static final Identifier ID = Identifier.fromNamespaceAndPath("mutantmore", "mutant_wither_skeleton_skull");
   private final CustomSkullModel model;

   public CustomSkullSpecialRenderer(CustomSkullModel model) {
      this.model = model;
   }

   @Override
   public void submit(PoseStack poseStack, SubmitNodeCollector collector, int light, int overlay, boolean hasFoil, int outlineColor) {
      CustomSkullBlockRenderer.submitSkull(this.model, null, 0, poseStack, collector, light, outlineColor);
   }

   @Override
   public void getExtents(Consumer<Vector3fc> output) {
      PoseStack poseStack = new PoseStack();
      this.model.setupAnim(true);
      this.model.root().getExtentsForGui(poseStack, output);
   }

   public record Unbaked() implements NoDataSpecialModelRenderer.Unbaked {
      public static final MapCodec<Unbaked> MAP_CODEC = MapCodec.unit(new Unbaked());

      @Override
      public MapCodec<Unbaked> type() {
         return MAP_CODEC;
      }

      @Override
      public SpecialModelRenderer<Void> bake(SpecialModelRenderer.BakingContext context) {
         return new CustomSkullSpecialRenderer(new CustomSkullModel(context.entityModelSet().bakeLayer(CustomSkullModel.LAYER)));
      }
   }
}
