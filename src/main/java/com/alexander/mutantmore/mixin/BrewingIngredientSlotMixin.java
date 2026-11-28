package com.alexander.mutantmore.mixin;

import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/** Lets Formula Y / Compound Z ingredients (crying obsidian, end crystals, ...) go in the brewing stand's ingredient slot. */
@Mixin(targets = "net.minecraft.world.inventory.BrewingStandMenu$IngredientsSlot")
public abstract class BrewingIngredientSlotMixin {
   @Inject(method = "mayPlace", at = @At("HEAD"), cancellable = true)
   private void mutantmore$mayPlace(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
      if (com.alexander.mutantmore.items.MutationBrewing.isReagent(stack)) {
         cir.setReturnValue(true);
      }
   }
}
