package com.alexander.mutantmore.gui;

import com.alexander.mutantmore.entities.Rodling;
import com.alexander.mutantmore.network.RodlingSettingsPayload;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;

/**
 * Rodling Checker: one Rodling's equipment slots, name, health and behaviour settings.
 * ponytail: the original's side list for switching between / bulk-editing nearby Rodlings is not ported; open the checker on each Rodling instead.
 */
public class RodlingCheckerScreen extends AbstractContainerScreen<RodlingCheckerMenu> {
   private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/gui/rodling_checker.png");
   private static final Component ON = Component.translatable("options.on");
   private static final Component OFF = Component.translatable("options.off");
   private static final String[] SETTINGS = {"griefing", "show_name", "particles", "silent", "follow_type", "attack_type"};
   private final Rodling rodling;
   private boolean griefing;
   private boolean showsName;
   private boolean silent;
   private boolean particles;
   private Rodling.FollowType followType;
   private Rodling.AttackType attackType;
   private int setting;
   private EditBox name;
   private Button valueButton;
   private float xMouse;
   private float yMouse;

   public RodlingCheckerScreen(RodlingCheckerMenu menu, Inventory inventory, Component title) {
      super(menu, inventory, title, 176, 192);
      this.rodling = menu.rodling;
      this.inventoryLabelY = this.imageHeight - 94 + 2;
      if (this.rodling != null) {
         this.griefing = this.rodling.griefing();
         this.showsName = this.rodling.alwaysShowsName();
         this.silent = this.rodling.isSilent();
         this.particles = this.rodling.smokeParticles();
         this.followType = this.rodling.getFollowType();
         this.attackType = this.rodling.getAttackType();
      }
   }

   @Override
   protected void init() {
      super.init();
      if (this.rodling == null) {
         return;
      }

      this.name = new EditBox(this.font, this.leftPos + 7, this.topPos + 8, 71, 12, Component.translatable("container.repair"));
      this.name.setCanLoseFocus(true);
      this.name.setTextColor(-1);
      this.name.setTextColorUneditable(-1);
      this.name.setBordered(false);
      this.name.setMaxLength(50);
      this.name.setValue(this.rodling.getName().getString());
      this.name.setResponder(value -> this.send(value));
      this.addRenderableWidget(this.name);
      this.addRenderableWidget(Button.builder(Component.literal("<"), b -> this.scroll(-1)).bounds(this.leftPos + 82, this.topPos + 40, 14, 14).build());
      this.addRenderableWidget(Button.builder(Component.literal(">"), b -> this.scroll(1)).bounds(this.leftPos + 158, this.topPos + 40, 14, 14).build());
      this.valueButton = this.addRenderableWidget(Button.builder(this.value(), b -> this.toggle()).bounds(this.leftPos + 82, this.topPos + 58, 90, 20).build());
   }

   private void scroll(int by) {
      this.setting = Math.floorMod(this.setting + by, SETTINGS.length);
      this.valueButton.setMessage(this.value());
   }

   private Component value() {
      return switch (this.setting) {
         case 0 -> this.griefing ? ON : OFF;
         case 1 -> this.showsName ? ON : OFF;
         case 2 -> this.particles ? ON : OFF;
         case 3 -> this.silent ? ON : OFF;
         case 4 -> this.followType.title;
         default -> this.attackType.title;
      };
   }

   private void toggle() {
      switch (this.setting) {
         case 0 -> this.griefing = !this.griefing;
         case 1 -> this.showsName = !this.showsName;
         case 2 -> this.particles = !this.particles;
         case 3 -> this.silent = !this.silent;
         case 4 -> this.followType = this.followType.scroll();
         default -> this.attackType = this.attackType.scroll();
      }

      this.valueButton.setMessage(this.value());
      this.send("");
   }

   private void send(String newName) {
      int flags = (this.griefing ? 1 : 0) | (this.showsName ? 2 : 0) | (this.silent ? 4 : 0) | (this.particles ? 8 : 0);
      ClientPlayNetworking.send(new RodlingSettingsPayload(this.rodling.getId(), newName, flags, this.followType.ordinal(), this.attackType.ordinal()));
   }

   @Override
   public boolean keyPressed(KeyEvent event) {
      if (this.name != null && this.name.isFocused() && !event.isEscape()) {
         return this.name.keyPressed(event) || this.name.canConsumeInput() || super.keyPressed(event);
      }

      return super.keyPressed(event);
   }

   @Override
   public void extractRenderState(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float a) {
      this.xMouse = mouseX;
      this.yMouse = mouseY;
      super.extractRenderState(graphics, mouseX, mouseY, a);
   }

   @Override
   public void extractBackground(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float a) {
      super.extractBackground(graphics, mouseX, mouseY, a);
      graphics.blit(RenderPipelines.GUI_TEXTURED, TEXTURE, this.leftPos, this.topPos, 0.0F, 0.0F, this.imageWidth, this.imageHeight, 512, 256);
      // slot hint icons (helmet, shields) when empty
      if (!this.menu.getSlot(0).hasItem()) {
         graphics.blit(RenderPipelines.GUI_TEXTURED, TEXTURE, this.leftPos + 7, this.topPos + 25, 284.0F, 129.0F, 18, 18, 512, 256);
      }

      if (!this.menu.getSlot(1).hasItem()) {
         graphics.blit(RenderPipelines.GUI_TEXTURED, TEXTURE, this.leftPos + 7, this.topPos + 43, 284.0F, 147.0F, 18, 18, 512, 256);
      }

      if (this.rodling != null) {
         int health = (int)(this.rodling.getHealth() / this.rodling.getMaxHealth() * 90.0F);
         int healing = (int)(this.rodling.getAmountToHeal() / this.rodling.healAmount() * 15.0F);
         graphics.blit(RenderPipelines.GUI_TEXTURED, TEXTURE, this.leftPos + 82, this.topPos + 4, 399.0F, 110.0F, health, 15, 512, 256);
         graphics.blit(RenderPipelines.GUI_TEXTURED, TEXTURE, this.leftPos + 82, this.topPos + 4, 307.0F, 110.0F, health, 15 - healing, 512, 256);
         InventoryScreen.extractEntityInInventoryFollowsMouse(
            graphics, this.leftPos + 27, this.topPos + 20, this.leftPos + 78, this.topPos + 100, 30, 0.0625F, this.xMouse, this.yMouse, this.rodling
         );
      }
   }

   private static String shorten(float value) {
      return String.format(java.util.Locale.ROOT, "%.1f", value);
   }

   @Override
   protected void extractLabels(GuiGraphicsExtractor graphics, int xm, int ym) {
      graphics.text(this.font, this.playerInventoryTitle, this.inventoryLabelX, this.inventoryLabelY, -12566464, false);
      if (this.rodling != null) {
         graphics.centeredText(this.font, shorten(this.rodling.getHealth()) + "/" + shorten(this.rodling.getMaxHealth()), 127, 8, -1);
         graphics.text(this.font, Component.translatable("gui.mutantmore.rodling_checker.settings"), 82, 28, -12566464, false);
         graphics.centeredText(this.font, Component.translatable("gui.mutantmore.rodling_checker." + SETTINGS[this.setting]), 127, 44, -1);
      }
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }
}
