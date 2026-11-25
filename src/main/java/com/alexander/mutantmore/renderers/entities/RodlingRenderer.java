package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.entities.Rodling;
import com.alexander.mutantmore.models.entities.RodlingModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.LivingEntityEmissiveLayer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;

public class RodlingRenderer extends MobRenderer<Rodling, RodlingModel.State, RodlingModel> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "rodling"), "main");
   static final Identifier TAME = tex("rodling");
   static final Identifier HOSTILE = tex("rodling_hostile");
   private static final Identifier SOUL_TAME = tex("soul_rodling");
   private static final Identifier SOUL_HOSTILE = tex("soul_rodling_hostile");
   private static final Identifier COLOUR = tex("rodling_colour");

   public RodlingRenderer(EntityRendererProvider.Context context) {
      super(context, new RodlingModel(context.bakeLayer(LAYER)), 0.5F);
      this.addLayer(new LivingEntityEmissiveLayer<>(this, this::getTextureLocation, (state, age) -> 1.0F, this.model, RenderTypes::entityTranslucentEmissive, false));
      // collar-style dye overlay (was RodlingColourLayer)
      this.addLayer(new RenderLayer<>(this) {
         @Override
         public void submit(com.mojang.blaze3d.vertex.PoseStack poseStack, net.minecraft.client.renderer.SubmitNodeCollector collector, int light, RodlingModel.State state, float yRot, float xRot) {
            if (state.color != null) {
               collector.order(2).submitModel(RodlingRenderer.this.model, state, poseStack, RenderTypes.entityTranslucentEmissive(COLOUR), light,
                  LivingEntityRenderer.getOverlayCoords(state, 0.0F), state.color.getTextureDiffuseColor(), null, state.outlineColor);
            }
         }
      });
      this.shadowStrength = 0.5F;
   }

   static Identifier tex(String name) {
      return Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/" + name + ".png");
   }

   @Override
   protected int getBlockLightLevel(Rodling entity, BlockPos pos) {
      return 15;
   }

   @Override
   protected boolean shouldShowName(Rodling entity, double distanceToCameraSq) {
      return entity.alwaysShowsName() || super.shouldShowName(entity, distanceToCameraSq);
   }

   @Override
   public Identifier getTextureLocation(RodlingModel.State state) {
      return state.soul ? (state.tame ? SOUL_TAME : SOUL_HOSTILE) : (state.tame ? TAME : HOSTILE);
   }

   @Override
   public RodlingModel.State createRenderState() {
      return new RodlingModel.State();
   }

   @Override
   public void extractRenderState(Rodling entity, RodlingModel.State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.noveltyAnimation.copyFrom(entity.noveltyAnimation);
      state.shootAnimation.copyFrom(entity.shootAnimation);
      state.living = true;
      state.hasArmour = entity.hasArmour();
      state.hasShields = entity.hasShields();
      state.shields = entity.getShields();
      state.sitting = entity.getFollowType() == Rodling.FollowType.SIT;
      state.idleScale = (float)entity.getDeltaMovement().horizontalDistance() * 7.5F;
      state.soul = entity.isSoul();
      state.tame = entity.isTame();
      state.color = entity.getColor();
   }
}
