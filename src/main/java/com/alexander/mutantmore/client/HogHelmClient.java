package com.alexander.mutantmore.client;

import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinRewardsClientConfig;
import com.alexander.mutantmore.init.EffectInit;
import com.alexander.mutantmore.init.ItemInit;
import com.alexander.mutantmore.init.ModelLayerInit;
import com.alexander.mutantmore.models.armour.HogHelmModel;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.ARGB;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;

/** Hog Helm's 3D model on the head (was IClientItemExtensions) and the red "fully enraged" screen overlay (was RageOverlay). */
public final class HogHelmClient {
   private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/armour/hog_helm.png");
   private static final Identifier OVERLAY = Identifier.fromNamespaceAndPath("mutantmore", "textures/gui/rage_overlay.png");
   private static float overlayVisibility;

   private HogHelmClient() {
   }

   public static void register() {
      ArmorRenderer.register(context -> {
         HogHelmModel model = new HogHelmModel(context.bakeLayer(ModelLayerInit.HOG_HELM));
         return (poseStack, collector, stack, state, slot, light, wearerModel) -> ArmorRenderer.submitTransformCopyingModel(
            wearerModel, state, model, state, false, collector, poseStack, RenderTypes.armorCutoutNoCull(TEXTURE), light, OverlayTexture.NO_OVERLAY, state.outlineColor
         );
      }, ItemInit.HOG_HELM);
      HudElementRegistry.addLast(Identifier.fromNamespaceAndPath("mutantmore", "rage_overlay"), (graphics, deltaTracker) -> {
         Minecraft mc = Minecraft.getInstance();
         if (mc.player == null || !MutantHoglinRewardsClientConfig.helmet_show_fully_enraged_screen_overlay.get()) {
            return;
         }

         MobEffectInstance rage = mc.player.getEffect(EffectInit.ENRAGED);
         boolean fullyEnraged = mc.player.getItemBySlot(EquipmentSlot.HEAD).is(ItemInit.HOG_HELM) && rage != null && rage.getAmplifier() >= 4;
         overlayVisibility = Mth.lerp(deltaTracker.getGameTimeDeltaPartialTick(false) * 0.1F, overlayVisibility, fullyEnraged ? 1.0F : 0.0F);
         if (overlayVisibility > 0.01F) {
            int width = graphics.guiWidth();
            int height = graphics.guiHeight();
            graphics.blit(RenderPipelines.GUI_TEXTURED, OVERLAY, 0, 0, 0.0F, 0.0F, width, height, width, height, ARGB.white(overlayVisibility));
         }
      });
   }
}
