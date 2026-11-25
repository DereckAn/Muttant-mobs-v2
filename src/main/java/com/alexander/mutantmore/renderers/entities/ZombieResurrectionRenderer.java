package com.alexander.mutantmore.renderers.entities;

import com.alexander.mutantmore.entities.ZombieResurrection;
import com.alexander.mutantmore.init.ModelLayerInit;
import com.alexander.mutantmore.models.entities.ZombieResurrectionModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityTypes;

/**
 * Draws the zombie digging itself out while the grave's animation plays.
 * ponytail: textured as a husk or a zombie; the original borrowed whatever mob's texture the config named (no clean way with 26.x render states).
 */
public class ZombieResurrectionRenderer extends EntityRenderer<ZombieResurrection, ZombieResurrectionRenderer.State> {
   private static final Identifier ZOMBIE = Identifier.withDefaultNamespace("textures/entity/zombie/zombie.png");
   private static final Identifier HUSK = Identifier.withDefaultNamespace("textures/entity/zombie/husk.png");
   private final ZombieResurrectionModel model;

   public ZombieResurrectionRenderer(EntityRendererProvider.Context context) {
      super(context);
      this.model = new ZombieResurrectionModel(context.bakeLayer(ModelLayerInit.ZOMBIE_RESURRECTION));
   }

   @Override
   public void submit(State state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
      if (state.resurrectAnimationState.isStarted()) {
         poseStack.pushPose();
         poseStack.scale(-1.0F, -1.0F, 1.0F);
         poseStack.translate(0.0, -1.501F, 0.0);
         poseStack.rotate(Axis.YP.rotationDegrees(state.yRot));
         if (state.husk) {
            poseStack.translate(0.0, -0.1, 0.0);
            poseStack.scale(1.0625F, 1.0625F, 1.0625F);
         }

         collector.submitModel(this.model, state, poseStack, state.husk ? HUSK : ZOMBIE, state.lightCoords, OverlayTexture.NO_OVERLAY, state.outlineColor);
         poseStack.popPose();
      }

      super.submit(state, poseStack, collector, camera);
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(ZombieResurrection entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.resurrectAnimationState.copyFrom(entity.resurrectAnimationState);
      state.yRot = entity.getYRot();
      state.husk = entity.getEntityType() == EntityTypes.HUSK;
   }

   public static class State extends EntityRenderState {
      public final AnimationState resurrectAnimationState = new AnimationState();
      public float yRot;
      public boolean husk;
   }
}
