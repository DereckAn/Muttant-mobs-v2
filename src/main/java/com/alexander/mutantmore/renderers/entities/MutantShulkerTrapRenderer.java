package com.alexander.mutantmore.renderers.entities;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.LivingEntityEmissiveLayer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.item.DyeColor;
import org.jspecify.annotations.Nullable;
import com.alexander.mutantmore.config.mutant_shulker.MutantShulkerRewardsCommonConfig;
import com.alexander.mutantmore.entities.MutantShulkerTrap;
import com.alexander.mutantmore.models.entities.MutantShulkerTrapModel;

public class MutantShulkerTrapRenderer extends MobRenderer<MutantShulkerTrap, MutantShulkerTrapRenderer.State, MutantShulkerTrapModel> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "mutant_shulker_trap"), "main");

   public MutantShulkerTrapRenderer(EntityRendererProvider.Context context) {
      super(context, new MutantShulkerTrapModel(context.bakeLayer(LAYER)), 0.75F);
   }

   static Identifier texture(String base, @Nullable DyeColor color) {
      return Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/" + base + (color == null ? "" : "_" + color.getName()) + ".png");
   }

   @Override
   protected float getFlipDegrees() {
      return 0.0F;
   }

   @Override
   public Identifier getTextureLocation(State state) {
      return texture("mutant_shulker_trap", state.color);
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(MutantShulkerTrap entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.idleAnimation.copyFrom(entity.idleAnimation);
      state.activateAnimation.copyFrom(entity.activateAnimation);
      state.vanishAnimation.copyFrom(entity.vanishAnimation);
      state.color = entity.getColor();
      boolean byShulker = entity.isSpawnedByMutantShulker();
      state.airborne = !entity.onGround() && byShulker;
      state.multiuse = byShulker ? MutantShulkerRewardsCommonConfig.trap_mutant_shulker_multiuse.get() : MutantShulkerRewardsCommonConfig.trap_player_multiuse.get();
   }

   public static class State extends LivingEntityRenderState {
      public final AnimationState idleAnimation = new AnimationState();
      public final AnimationState activateAnimation = new AnimationState();
      public final AnimationState vanishAnimation = new AnimationState();
      public @Nullable DyeColor color;
      public boolean airborne;
      public boolean multiuse;
   }
}
