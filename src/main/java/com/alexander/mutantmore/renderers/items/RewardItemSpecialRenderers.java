package com.alexander.mutantmore.renderers.items;

import com.alexander.mutantmore.client.RewardItemsClient;
import com.alexander.mutantmore.models.items.LeafblowerModel;
import com.alexander.mutantmore.models.items.MutantShulkerShieldModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.serialization.MapCodec;
import java.util.function.Consumer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.special.SpecialModelRenderer;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

/** Animated item models of the Mutant Shulker Shield and Leafblower (were BEWLR branches). */
public final class RewardItemSpecialRenderers {
   public static final Identifier SHIELD_ID = Identifier.fromNamespaceAndPath("mutantmore", "mutant_shulker_shield");
   public static final Identifier LEAFBLOWER_ID = Identifier.fromNamespaceAndPath("mutantmore", "leafblower");
   private static final Identifier SHIELD_TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/item/mutant_shulker_shield.png");
   private static final Identifier LEAFBLOWER_TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/item/leafblower.png");

   private RewardItemSpecialRenderers() {
   }

   /** The original's per-hand offsets (shared with the Wither Bomb). */
   static void handOffset(PoseStack poseStack, WitherBombSpecialRenderer.Hand hand) {
      switch (hand) {
         case FIRST_PERSON_RIGHT -> poseStack.translate(0.0F, -1.25F, -1.0F);
         case FIRST_PERSON_LEFT -> poseStack.translate(1.0F, -1.25F, -1.0F);
         default -> {
            poseStack.translate(0.0, -1.6, -1.0);
            poseStack.translate(0.5F, -0.4F, 0.5F);
         }
      }
   }

   public record Shield(MutantShulkerShieldModel model, WitherBombSpecialRenderer.Hand hand) implements SpecialModelRenderer<Integer> {
      @Override
      public Integer extractArgument(ItemStack stack) {
         return RewardItemsClient.shieldShootTick(stack);
      }

      @Override
      public void submit(@Nullable Integer shootTick, PoseStack poseStack, SubmitNodeCollector collector, int light, int overlay, boolean hasFoil, int outlineColor) {
         poseStack.pushPose();
         poseStack.scale(1.0F, -1.0F, -1.0F);
         handOffset(poseStack, this.hand);
         collector.submitModel(this.model, shootTick == null ? -1 : shootTick, poseStack, SHIELD_TEXTURE, light, overlay, outlineColor);
         poseStack.popPose();
      }

      @Override
      public void getExtents(Consumer<Vector3fc> output) {
         this.model.setupAnim(-1);
         this.model.root().getExtentsForGui(new PoseStack(), output);
      }

      public record Unbaked(WitherBombSpecialRenderer.Hand hand) implements SpecialModelRenderer.Unbaked<Integer> {
         public static final MapCodec<Unbaked> MAP_CODEC = WitherBombSpecialRenderer.Hand.CODEC.optionalFieldOf("hand", WitherBombSpecialRenderer.Hand.OTHER)
            .xmap(Unbaked::new, Unbaked::hand);

         @Override
         public MapCodec<Unbaked> type() {
            return MAP_CODEC;
         }

         @Override
         public SpecialModelRenderer<Integer> bake(SpecialModelRenderer.BakingContext context) {
            return new Shield(new MutantShulkerShieldModel(context.entityModelSet().bakeLayer(MutantShulkerShieldModel.LAYER)), this.hand);
         }
      }
   }

   public record Leafblower(LeafblowerModel model, boolean still) implements SpecialModelRenderer<LeafblowerModel.State> {
      @Override
      public LeafblowerModel.State extractArgument(ItemStack stack) {
         return this.still ? LeafblowerModel.State.STILL : RewardItemsClient.leafblowerState(stack);
      }

      @Override
      public void submit(
         LeafblowerModel.@Nullable State state, PoseStack poseStack, SubmitNodeCollector collector, int light, int overlay, boolean hasFoil, int outlineColor
      ) {
         poseStack.pushPose();
         poseStack.scale(1.0F, -1.0F, -1.0F);
         collector.submitModel(this.model, state == null ? LeafblowerModel.State.STILL : state, poseStack, LEAFBLOWER_TEXTURE, light, overlay, outlineColor);
         poseStack.popPose();
      }

      @Override
      public void getExtents(Consumer<Vector3fc> output) {
         this.model.setupAnim(LeafblowerModel.State.STILL);
         this.model.root().getExtentsForGui(new PoseStack(), output);
      }

      public record Unbaked(boolean still) implements SpecialModelRenderer.Unbaked<LeafblowerModel.State> {
         public static final MapCodec<Unbaked> MAP_CODEC = com.mojang.serialization.Codec.BOOL.optionalFieldOf("still", false).xmap(Unbaked::new, Unbaked::still);

         @Override
         public MapCodec<Unbaked> type() {
            return MAP_CODEC;
         }

         @Override
         public SpecialModelRenderer<LeafblowerModel.State> bake(SpecialModelRenderer.BakingContext context) {
            return new Leafblower(new LeafblowerModel(context.entityModelSet().bakeLayer(LeafblowerModel.LAYER)), this.still);
         }
      }
   }
}
