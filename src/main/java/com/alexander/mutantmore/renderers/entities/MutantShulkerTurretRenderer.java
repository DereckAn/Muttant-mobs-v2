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
import com.alexander.mutantmore.entities.MutantShulkerTurret;
import com.alexander.mutantmore.models.entities.MutantShulkerTurretModel;

public class MutantShulkerTurretRenderer extends MobRenderer<MutantShulkerTurret, MutantShulkerTurretRenderer.State, MutantShulkerTurretModel> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "mutant_shulker_turret"), "main");
   private static final Identifier GLOW = Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_shulker_turret_glow.png");

   public MutantShulkerTurretRenderer(EntityRendererProvider.Context context) {
      super(context, new MutantShulkerTurretModel(context.bakeLayer(LAYER)), 1.5F);
      this.addLayer(new LivingEntityEmissiveLayer<>(this, state -> GLOW, (state, age) -> 0.5F, this.model, RenderTypes::eyes, false));
      this.addLayer(new LivingEntityEmissiveLayer<>(
         this,
         state -> Identifier.fromNamespaceAndPath("mutantmore", "textures/entities/mutant_shulker_turret_crackiness_" + state.crackiness.name().toLowerCase() + ".png"),
         (state, age) -> state.crackiness == MutantShulkerTurret.Crackiness.NONE ? 0.0F : 1.0F,
         this.model,
         RenderTypes::entityTranslucent,
         false
      ));
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
      return texture("mutant_shulker_turret", state.color);
   }

   @Override
   public State createRenderState() {
      return new State();
   }

   @Override
   public void extractRenderState(MutantShulkerTurret entity, State state, float partialTicks) {
      super.extractRenderState(entity, state, partialTicks);
      state.deployAnimation.copyFrom(entity.deployAnimation);
      state.bottomShootAnimation.copyFrom(entity.bottomShootAnimation);
      state.middleShootAnimation.copyFrom(entity.middleShootAnimation);
      state.topShootAnimation.copyFrom(entity.topShootAnimation);
      state.color = entity.getColor();
      state.crackiness = entity.getCrackiness();
      state.topHeadXRot = entity.topHeadXRot;
      state.topHeadYRot = entity.topHeadYRot - entity.yBodyRot;
      state.midHeadXRot = entity.midHeadXRot;
      state.midHeadYRot = entity.midHeadYRot - entity.yBodyRot;
   }

   public static class State extends LivingEntityRenderState {
      public final AnimationState deployAnimation = new AnimationState();
      public final AnimationState bottomShootAnimation = new AnimationState();
      public final AnimationState middleShootAnimation = new AnimationState();
      public final AnimationState topShootAnimation = new AnimationState();
      public @Nullable DyeColor color;
      public MutantShulkerTurret.Crackiness crackiness = MutantShulkerTurret.Crackiness.NONE;
      public float topHeadXRot;
      public float topHeadYRot;
      public float midHeadXRot;
      public float midHeadYRot;
   }
}
