package com.alexander.mutantmore.renderers.items;

import com.alexander.mutantmore.models.blockentities.SnowstormGeneratorModel;
import com.alexander.mutantmore.renderers.blockentities.SnowstormGeneratorBlockRenderer;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;
import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.special.NoDataSpecialModelRenderer;
import net.minecraft.client.renderer.special.SpecialModelRenderer;
import net.minecraft.resources.Identifier;
import net.minecraft.util.StringRepresentable;
import org.joml.Vector3fc;

/** Items that are drawn with their block-entity model, still (the generators; was the BEWLR). "gui" picks the original's inventory offset. */
public class BlockModelSpecialRenderer implements NoDataSpecialModelRenderer {
   public static final Identifier ID = Identifier.fromNamespaceAndPath("mutantmore", "block_model");
   private final Model<Float> model;
   private final Identifier texture;
   private final boolean gui;

   public BlockModelSpecialRenderer(Model<Float> model, Identifier texture, boolean gui) {
      this.model = model;
      this.texture = texture;
      this.gui = gui;
   }

   @Override
   public void submit(PoseStack poseStack, SubmitNodeCollector collector, int light, int overlay, boolean hasFoil, int outlineColor) {
      poseStack.pushPose();
      poseStack.scale(1.0F, -1.0F, -1.0F);
      poseStack.translate(0.0, -1.6, -1.0);
      if (!this.gui) {
         poseStack.translate(0.5, -0.4, 0.5);
      }

      collector.submitModel(this.model, -1.0F, poseStack, this.texture, light, overlay, outlineColor);
      poseStack.popPose();
   }

   @Override
   public void getExtents(Consumer<Vector3fc> output) {
      this.model.setupAnim(-1.0F);
      this.model.root().getExtentsForGui(new PoseStack(), output);
   }

   public enum Kind implements StringRepresentable {
      SNOWSTORM_GENERATOR,
      HEATSTORM_GENERATOR;

      public static final Codec<Kind> CODEC = StringRepresentable.fromEnum(Kind::values);

      @Override
      public String getSerializedName() {
         return this.name().toLowerCase();
      }
   }

   public record Unbaked(Kind kind, boolean gui) implements NoDataSpecialModelRenderer.Unbaked {
      public static final MapCodec<Unbaked> MAP_CODEC = RecordCodecBuilder.mapCodec(
         i -> i.group(Kind.CODEC.fieldOf("kind").forGetter(Unbaked::kind), Codec.BOOL.optionalFieldOf("gui", false).forGetter(Unbaked::gui)).apply(i, Unbaked::new)
      );

      @Override
      public MapCodec<Unbaked> type() {
         return MAP_CODEC;
      }

      @Override
      public SpecialModelRenderer<Void> bake(SpecialModelRenderer.BakingContext context) {
         return switch (this.kind) {
            case SNOWSTORM_GENERATOR -> new BlockModelSpecialRenderer(
               new SnowstormGeneratorModel(context.entityModelSet().bakeLayer(SnowstormGeneratorModel.LAYER)), SnowstormGeneratorBlockRenderer.OFF, this.gui
            );
            case HEATSTORM_GENERATOR -> new BlockModelSpecialRenderer(
               new com.alexander.mutantmore.models.blockentities.HeatstormGeneratorModel(
                  context.entityModelSet().bakeLayer(com.alexander.mutantmore.models.blockentities.HeatstormGeneratorModel.LAYER)
               ),
               com.alexander.mutantmore.renderers.blockentities.HeatstormGeneratorBlockRenderer.OFF,
               this.gui
            );
         };
      }
   }
}
