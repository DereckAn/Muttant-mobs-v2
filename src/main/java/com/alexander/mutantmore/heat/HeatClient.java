package com.alexander.mutantmore.heat;

import com.alexander.mutantmore.config.mutant_blaze.HeatClientConfig;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.resources.Identifier;
import net.minecraft.util.ARGB;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

/**
 * Screen overlays that fade in with your heat (was HeatOverlay); each one is toggled in the heat client config.
 * ponytail: the "heat hearts" (burning heart icons at full heat) aren't ported; they need a mixin into the 26.x heart rendering.
 */
public final class HeatClient {
   private HeatClient() {
   }

   private static Identifier tex(String name) {
      return Identifier.fromNamespaceAndPath("mutantmore", "textures/gui/" + name + ".png");
   }

   public static void register() {
      HudElementRegistry.addLast(Identifier.fromNamespaceAndPath("mutantmore", "heat_overlay"), (graphics, deltaTracker) -> {
         Minecraft mc = Minecraft.getInstance();
         if (mc.player == null) {
            return;
         }

         float heat = (float)Heat.of(mc.player);
         if (heat <= 0.0F) {
            return;
         }

         draw(graphics, HeatClientConfig.show_pure_orange_heat_overlay, tex("pure_orange_heat_overlay"), heat);
         draw(graphics, HeatClientConfig.show_static_flame_heat_overlay, tex("heat_outline_0"), heat);
         draw(graphics, HeatClientConfig.show_animated_flame_heat_overlay, tex(mc.player.tickCount % 10 > 5 ? "heat_outline_0" : "heat_outline_1"), heat);
         draw(graphics, HeatClientConfig.show_orange_edges_heat_overlay, tex("orange_edges_heat_overlay"), heat);
         draw(graphics, HeatClientConfig.show_ash_heat_overlay, tex("ash_heat_overlay"), heat);
      });
   }

   private static void draw(GuiGraphicsExtractor graphics, ConfigValue<Boolean> enabled, Identifier texture, float alpha) {
      if (enabled.get()) {
         int width = graphics.guiWidth();
         int height = graphics.guiHeight();
         graphics.blit(RenderPipelines.GUI_TEXTURED, texture, 0, 0, 0.0F, 0.0F, width, height, width, height, ARGB.white(alpha));
      }
   }
}
