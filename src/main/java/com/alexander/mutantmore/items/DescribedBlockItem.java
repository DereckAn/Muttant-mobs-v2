package com.alexander.mutantmore.items;

import java.util.function.Consumer;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.Block;

/** Redstone-powered reward block items: "Redstone powered" plus a description line (was SnowstormGeneratorBlockItem etc.). */
public class DescribedBlockItem extends BlockItem {
   private final String description;

   public DescribedBlockItem(Block block, Properties properties, String description) {
      super(block, properties);
      this.description = description;
   }

   @Override
   public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.desc.redstone_powered").withStyle(ChatFormatting.GRAY));
      tooltip.accept(Component.translatable(this.description).withStyle(ChatFormatting.BLUE));
   }
}
