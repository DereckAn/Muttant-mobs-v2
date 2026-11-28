package com.alexander.mutantmore.items;

import com.alexander.mutantmore.init.DataComponentInit;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

/**
 * Unfinished Formula Y / Compound Z bottle. Fill it with water, then brew in each ingredient of the config's recipe list, in order,
 * at a brewing stand (see MutationBrewing). Once anything is brewed in it is unstable: throwing it just explodes.
 */
public class IncompleteMutationPotionItem extends Item {
   private final Supplier<List<? extends String>> recipe;
   private final Supplier<Item> result;
   private final float pitch;
   private final float upAngle;
   private final float power;

   public IncompleteMutationPotionItem(Item.Properties properties, Supplier<List<? extends String>> recipe, Supplier<Item> result, float pitch, float upAngle, float power) {
      super(properties);
      this.recipe = recipe;
      this.result = result;
      this.pitch = pitch;
      this.upAngle = upAngle;
      this.power = power;
   }

   public static int progress(ItemStack stack) {
      return stack.getOrDefault(DataComponentInit.BREWING_PROGRESS, 0);
   }

   /** The brew after adding this reagent, or empty if the reagent isn't the next step. */
   public ItemStack brew(ItemStack bottle, ItemStack reagent) {
      int progress = progress(bottle);
      List<? extends String> steps = this.recipe.get();
      if (progress < 1 || progress > steps.size() || !reagent.is(BuiltInRegistries.ITEM.getValue(Identifier.tryParse(steps.get(progress - 1))))) {
         return ItemStack.EMPTY;
      }

      if (progress == steps.size()) {
         return new ItemStack(this.result.get());
      }

      ItemStack next = new ItemStack(this);
      next.set(DataComponentInit.BREWING_PROGRESS, progress + 1);
      return next;
   }

   /** Any ingredient of this brew's recipe. */
   public boolean isReagent(ItemStack stack) {
      return this.recipe.get().stream().anyMatch(id -> stack.is(BuiltInRegistries.ITEM.getValue(Identifier.tryParse(id))));
   }

   @Override
   public Component getName(ItemStack stack) {
      int progress = progress(stack);
      return progress == 0
         ? Component.translatable(this.getDescriptionId() + ".empty")
         : progress == 1 ? Component.translatable(this.getDescriptionId() + ".filled") : super.getName(stack);
   }

   @Override
   public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.mutation_potion_progress", progress(stack), 1 + this.recipe.get().size()).withStyle(ChatFormatting.GRAY));
      if (progress(stack) > 1) {
         tooltip.accept(Component.translatable("mutantmore.mutation_potion_unstable").withStyle(ChatFormatting.BLUE));
      }
   }

   @Override
   public InteractionResult use(Level level, Player player, InteractionHand hand) {
      ItemStack stack = player.getItemInHand(hand);
      if (progress(stack) > 1) {
         return MutationPotionItem.throwPotion(level, player, hand, this.pitch, this.upAngle, this.power);
      }

      HitResult hit = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);
      if (progress(stack) != 0 || !(hit instanceof BlockHitResult blockHit) || hit.getType() != HitResult.Type.BLOCK) {
         return InteractionResult.PASS;
      }

      BlockPos pos = blockHit.getBlockPos();
      if (!level.getFluidState(pos).is(FluidTags.WATER) && !level.getBlockState(pos).is(Blocks.WATER_CAULDRON)) {
         return InteractionResult.PASS;
      }

      if (level.getBlockState(pos).getBlock() instanceof LayeredCauldronBlock) {
         LayeredCauldronBlock.lowerFillLevel(level.getBlockState(pos), level, pos);
      }

      level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.BOTTLE_FILL, SoundSource.NEUTRAL, 1.0F, 1.0F);
      level.gameEvent(player, GameEvent.FLUID_PICKUP, pos);
      player.awardStat(Stats.ITEM_USED.get(this));
      // ponytail: fills the whole held stack at once (the original did the same; bottles stack to 1 anyway)
      stack.set(DataComponentInit.BREWING_PROGRESS, 1);
      return InteractionResult.SUCCESS;
   }
}
