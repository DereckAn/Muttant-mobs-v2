package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.entities.MutationCloud;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.util.ARGB;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;

/** Light rays bursting out of the mob being mutated, growing with the mutation (like the dragon's death rays). */
public class MutationCloudRenderer extends EntityRenderer<MutationCloud, MutationCloudRenderer.State> {
   public MutationCloudRenderer(EntityRendererProvider.Context context) {
      super(context);
   }

   @Override
   protected int getBlockLightLevel(MutationCloud entity, BlockPos pos) {
      return 15;
   }

   @Override
   public void submit(State state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
      int rays = (int)(state.progress * 30.0F - 5.0F);
      if (rays > 0) {
         poseStack.pushPose();
         poseStack.translate(0.0F, state.height / 2.0F, 0.0F);
         collector.submitCustomGeometry(poseStack, RenderTypes.dragonRays(), (pose, buffer) -> {
            RandomSource random = RandomSource.createThreadLocalInstance(432L);
            float spin = state.progress / 100.0F;
            int outer = ARGB.colorFromFloat(0.0F, state.r, state.g, state.b);
            for (int i = 0; i < rays; i++) {
               PoseStack.Pose ray = pose.copy();
               ray.rotate(Axis.XP.rotationDegrees(random.nextFloat() * 360.0F));
               ray.rotate(Axis.YP.rotationDegrees(random.nextFloat() * 360.0F));
               ray.rotate(Axis.ZP.rotationDegrees(random.nextFloat() * 360.0F));
               ray.rotate(Axis.YP.rotationDegrees(random.nextFloat() * 360.0F + spin * 180.0F));
               float length = state.size * state.progress * 2.5F + Mth.sin((state.ageInTicks + random.nextInt(200)) / 3.0F);
               float tipLeft = length + Mth.sin((state.ageInTicks - 10.0F) / 5.0F) * (length / 10.0F);
               float tipRight = length + Mth.sin(state.ageInTicks / 5.0F) * (length / 10.0F);
               buffer.addVertex(ray, 0.0F, 0.0F, 0.0F).setColor(-1);
               buffer.addVertex(ray, -length / 8.0F, tipLeft, 0.0F).setColor(outer);
               buffer.addVertex(ray, length / 8.0F, tipRight, 0.0F).setColor(outer);
            }
         });
         poseStack.popPose();
      }

      super.submit(state, poseStack, collector, camera);
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(MutationCloud entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.progress = entity.getMutationProgress();
      state.size = Math.max(entity.getBbWidth(), entity.getBbHeight());
      state.height = entity.getBbHeight();
      MutationCloud.Colour colour = entity.mutationColour();
      state.r = colour.r();
      state.g = colour.g();
      state.b = colour.b();
   }

   public static class State extends EntityRenderState {
      public float progress;
      public float size;
      public float height;
      public float r;
      public float g;
      public float b;
   }
}
