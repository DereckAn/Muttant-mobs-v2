package com.alexander.mutantmore.items;

import com.alexander.mutantmore.init.ItemInit;
import net.minecraft.world.item.ItemStack;

/** Brewing-stand hooks for the two mutation brews (used by the brewing mixins). */
public final class MutationBrewing {
   private MutationBrewing() {
   }

   public static boolean isReagent(ItemStack stack) {
      return !stack.isEmpty()
         && (((IncompleteMutationPotionItem)ItemInit.INCOMPLETE_FORMULA_Y).isReagent(stack) || ((IncompleteMutationPotionItem)ItemInit.INCOMPLETE_COMPOUND_Z).isReagent(stack));
   }
}
