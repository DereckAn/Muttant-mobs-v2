package com.alexander.mutantmore.client;

import com.alexander.mutantmore.items.IncompleteMutationPotionItem;
import com.mojang.serialization.MapCodec;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.item.properties.numeric.RangeSelectItemModelProperty;
import net.minecraft.world.entity.ItemOwner;
import net.minecraft.world.item.ItemStack;
import org.jspecify.annotations.Nullable;

/** "mutantmore:brewing_progress" item model property: the unfinished brew's step, picks its bottle texture. */
public record BrewingProgressProperty() implements RangeSelectItemModelProperty {
   public static final MapCodec<BrewingProgressProperty> MAP_CODEC = MapCodec.unit(new BrewingProgressProperty());

   @Override
   public float get(ItemStack stack, @Nullable ClientLevel level, @Nullable ItemOwner owner, int seed) {
      return IncompleteMutationPotionItem.progress(stack);
   }

   @Override
   public MapCodec<BrewingProgressProperty> type() {
      return MAP_CODEC;
   }
}
