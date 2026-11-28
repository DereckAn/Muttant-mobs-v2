package com.alexander.mutantmore.renderers.items;

import com.alexander.mutantmore.models.entities.WitherBombModel;
import com.alexander.mutantmore.renderers.entities.MutantWitherSkeletonRenderer;
import com.alexander.mutantmore.renderers.entities.WitherBombRenderer;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Consumer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.special.NoDataSpecialModelRenderer;
import net.minecraft.client.renderer.special.SpecialModelRenderer;
import net.minecraft.resources.Identifier;
import net.minecraft.util.StringRepresentable;
import org.joml.Vector3fc;

/** Wither Bomb item (was the BEWLR branch). "hand" in the item definition picks the original's per-hand offsets. */
public class WitherBombSpecialRenderer implements NoDataSpecialModelRenderer {
   public static final Identifier ID = Identifier.fromNamespaceAndPath("mutantmore", "wither_bomb");
   private static final WitherBombRenderer.State ITEM_STATE = new WitherBombRenderer.State();

   static {
      ITEM_STATE.item = true;
   }

   private final WitherBombModel model;
   private final Hand hand;

   public WitherBombSpecialRenderer(WitherBombModel model, Hand hand) {
      this.model = model;
      this.hand = hand;
   }

   @Override
   public void submit(PoseStack poseStack, SubmitNodeCollector collector, int light, int overlay, boolean hasFoil, int outlineColor) {
      poseStack.pushPose();
      poseStack.scale(1.0F, -1.0F, -1.0F);
      switch (this.hand) {
         case FIRST_PERSON_RIGHT -> poseStack.translate(0.0F, -1.25F, -1.0F);
         case FIRST_PERSON_LEFT -> poseStack.translate(1.0F, -1.25F, -1.0F);
         default -> {
            poseStack.translate(0.0, -1.6, -1.0);
            poseStack.translate(0.5F, -0.4F, 0.5F);
         }
      }

      collector.submitModel(this.model, ITEM_STATE, poseStack, MutantWitherSkeletonRenderer.texture(), light, overlay, outlineColor);
      poseStack.popPose();
   }

   @Override
   public void getExtents(Consumer<Vector3fc> output) {
      this.model.setupAnim(ITEM_STATE);
      this.model.root().getExtentsForGui(new PoseStack(), output);
   }

   public enum Hand implements StringRepresentable {
      OTHER,
      FIRST_PERSON_RIGHT,
      FIRST_PERSON_LEFT;

      public static final Codec<Hand> CODEC = StringRepresentable.fromEnum(Hand::values);

      @Override
      public String getSerializedName() {
         return this.name().toLowerCase();
      }
   }

   public record Unbaked(Hand hand) implements NoDataSpecialModelRenderer.Unbaked {
      public static final MapCodec<Unbaked> MAP_CODEC = Hand.CODEC.optionalFieldOf("hand", Hand.OTHER).xmap(Unbaked::new, Unbaked::hand);

      @Override
      public MapCodec<Unbaked> type() {
         return MAP_CODEC;
      }

      @Override
      public SpecialModelRenderer<Void> bake(SpecialModelRenderer.BakingContext context) {
         return new WitherBombSpecialRenderer(new WitherBombModel(context.entityModelSet().bakeLayer(WitherBombRenderer.LAYER)), this.hand);
      }
   }
}
