package com.alexander.mutantmore.gui;

import com.alexander.mutantmore.entities.Rodling;
import com.alexander.mutantmore.init.ItemInit;
import com.alexander.mutantmore.init.TagInit;
import net.fabricmc.fabric.api.menu.v1.ExtendedMenuType;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.resources.Identifier;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

/** Rodling Checker: helmet, shields, food and cosmetic slots of one tamed Rodling (opening data = its entity id). */
public class RodlingCheckerMenu extends AbstractContainerMenu {
   public static final ExtendedMenuType<RodlingCheckerMenu, Integer> TYPE = Registry.register(
      BuiltInRegistries.MENU,
      Identifier.fromNamespaceAndPath("mutantmore", "rodling_checker"),
      new ExtendedMenuType<>(
         (id, inventory, rodlingId) -> new RodlingCheckerMenu(id, inventory, inventory.player.level().getEntity(rodlingId) instanceof Rodling r ? r : null),
         ByteBufCodecs.VAR_INT
      )
   );
   public final Rodling rodling;
   private final Container container;

   public RodlingCheckerMenu(int id, Inventory inventory, Rodling rodling) {
      super(TYPE, id);
      this.rodling = rodling;
      this.container = rodling != null ? rodling.inventory : new SimpleContainer(4);
      this.container.startOpen(inventory.player);
      this.addSlot(new LimitedSlot(this.container, 0, 8, 26, stack -> stack.is(ItemInit.RODLING_HELMET)));
      this.addSlot(new LimitedSlot(this.container, 1, 8, 44, stack -> stack.is(ItemInit.RODLING_SHIELDS)));
      this.addSlot(new Slot(this.container, 2, 8, 62) {
         @Override
         public boolean mayPlace(ItemStack stack) {
            return stack.is(TagInit.Items.HEALS_RODLINGS);
         }
      });
      this.addSlot(new LimitedSlot(this.container, 3, 8, 80, this::isUsefulCosmetic));
      for (int row = 0; row < 3; row++) {
         for (int col = 0; col < 9; col++) {
            this.addSlot(new Slot(inventory, col + row * 9 + 9, 8 + col * 18, 110 + row * 18));
         }
      }

      for (int col = 0; col < 9; col++) {
         this.addSlot(new Slot(inventory, col, 8 + col * 18, 168));
      }
   }

   private boolean isUsefulCosmetic(ItemStack stack) {
      if (this.rodling == null) {
         return false;
      }

      var dye = stack.get(DataComponents.DYE);
      return dye != null && dye != this.rodling.getColor()
         || stack.is(TagInit.Items.CONVERTS_RODLINGS_TO_NORMAL) && this.rodling.isSoul()
         || stack.is(TagInit.Items.CONVERTS_RODLINGS_TO_SOUL) && !this.rodling.isSoul()
         || stack.is(TagInit.Items.REMOVES_DYE_FROM_RODLINGS) && this.rodling.getColor() != null;
   }

   @Override
   public boolean stillValid(Player player) {
      return this.rodling != null && this.rodling.isAlive() && !this.rodling.hasInventoryChanged(this.container) && this.rodling.isOwnedBy(player)
         && this.rodling.distanceTo(player) < 24.0F;
   }

   @Override
   public ItemStack quickMoveStack(Player player, int index) {
      Slot slot = this.slots.get(index);
      if (!slot.hasItem()) {
         return ItemStack.EMPTY;
      }

      ItemStack stack = slot.getItem();
      ItemStack copy = stack.copy();
      if (index < 4 ? !this.moveItemStackTo(stack, 4, 40, true) : !this.moveItemStackTo(stack, 0, 4, false)) {
         return ItemStack.EMPTY;
      }

      if (stack.isEmpty()) {
         slot.setByPlayer(ItemStack.EMPTY);
      } else {
         slot.setChanged();
      }

      return copy;
   }

   @Override
   public void removed(Player player) {
      super.removed(player);
      this.container.stopOpen(player);
   }

   /** One item, only if the test passes and the slot is empty. */
   private static class LimitedSlot extends Slot {
      private final java.util.function.Predicate<ItemStack> test;

      LimitedSlot(Container container, int index, int x, int y, java.util.function.Predicate<ItemStack> test) {
         super(container, index, x, y);
         this.test = test;
      }

      @Override
      public boolean mayPlace(ItemStack stack) {
         return !this.hasItem() && this.test.test(stack);
      }

      @Override
      public int getMaxStackSize() {
         return 1;
      }
   }
}
