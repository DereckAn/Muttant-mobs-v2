package com.alexander.mutantmore.mixin;

import com.alexander.mutantmore.items.IncompleteMutationPotionItem;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BrewingStandBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/** Formula Y / Compound Z brew one config-defined step per ingredient (was Forge IBrewingRecipe; vanilla brewing recipes can't match the step). */
@Mixin(BrewingStandBlockEntity.class)
public abstract class BrewingStandMixin {
   private static ItemStack mutantmore$brew(ItemStack bottle, ItemStack reagent) {
      return bottle.getItem() instanceof IncompleteMutationPotionItem incomplete ? incomplete.brew(bottle, reagent) : ItemStack.EMPTY;
   }

   @Inject(method = "isBrewable", at = @At("HEAD"), cancellable = true)
   private static void mutantmore$isBrewable(ServerLevel level, BrewingStandBlockEntity entity, CallbackInfoReturnable<Boolean> cir) {
      NonNullList<ItemStack> items = ((BrewingStandAccessor)entity).mutantmore$items();
      for (int slot = 0; slot < 3; slot++) {
         if (!mutantmore$brew(items.get(slot), items.get(3)).isEmpty()) {
            cir.setReturnValue(true);
            return;
         }
      }
   }

   // Our bottles are swapped first; vanilla then finds no recipe for them, leaves them alone, and uses up the ingredient as usual
   @Inject(method = "doBrew", at = @At("HEAD"))
   private static void mutantmore$doBrew(ServerLevel level, BlockPos pos, BrewingStandBlockEntity entity, CallbackInfo ci) {
      NonNullList<ItemStack> items = ((BrewingStandAccessor)entity).mutantmore$items();
      for (int slot = 0; slot < 3; slot++) {
         ItemStack result = mutantmore$brew(items.get(slot), items.get(3));
         if (!result.isEmpty()) {
            items.set(slot, result);
         }
      }
   }

   @Inject(method = "canPlaceItem", at = @At("HEAD"), cancellable = true)
   private void mutantmore$canPlaceItem(int slot, ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
      if (slot == 3 && com.alexander.mutantmore.items.MutationBrewing.isReagent(stack)) {
         cir.setReturnValue(true);
      }
   }
}
