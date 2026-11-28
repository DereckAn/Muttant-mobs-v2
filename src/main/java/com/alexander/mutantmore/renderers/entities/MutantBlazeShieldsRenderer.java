package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.config.mutant_blaze.MutantBlazeRewardsClientConfig;
import com.alexander.mutantmore.entities.MutantBlazeShields;
import com.alexander.mutantmore.models.entities.MutantBlazeShieldsModel;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.util.ARGB;
import net.minecraft.world.entity.Entity;

/** Shields orbiting the wearer, scaled to its width; see-through in your own first-person view. */
public class MutantBlazeShieldsRenderer extends EntityRenderer<MutantBlazeShields, MutantBlazeShieldsRenderer.State> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "mutant_blaze_shields"), "main");
   private final MutantBlazeShieldsModel model;

   public MutantBlazeShieldsRenderer(EntityRendererProvider.Context context) {
      super(context);
      this.model = new MutantBlazeShieldsModel(context.bakeLayer(LAYER));
   }

   @Override
   protected int getBlockLightLevel(MutantBlazeShields entity, BlockPos pos) {
      return 15;
   }

   @Override
   public void submit(State state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
      poseStack.pushPose();
      poseStack.scale(state.scale, state.scale, state.scale);
      poseStack.scale(-1.0F, -1.0F, 1.0F);
      poseStack.translate(0.0F, -1.501F, 0.0F);
      collector.submitModel(
         this.model, state, poseStack, RenderTypes.entityTranslucent(MutantBlazeRenderer.texture()), state.lightCoords, OverlayTexture.NO_OVERLAY,
         ARGB.white(state.alpha), null, state.outlineColor
      );
      poseStack.popPose();
      super.submit(state, poseStack, collector, camera);
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(MutantBlazeShields entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      Entity attached = entity.getAttachedEntity();
      Minecraft mc = Minecraft.getInstance();
      state.shields = entity.getRemainingShields();
      state.scale = attached != null ? attached.getBbWidth() + 0.4F : 1.0F;
      boolean firstPerson = attached != null && attached == mc.getCameraEntity() && mc.options.getCameraType().isFirstPerson();
      state.alpha = firstPerson ? MutantBlazeRewardsClientConfig.shields_first_person_opacity.get().floatValue() : 1.0F;
   }

   public static class State extends LivingEntityRenderState {
      public int shields;
      public float scale = 1.0F;
      public float alpha = 1.0F;
   }
}
