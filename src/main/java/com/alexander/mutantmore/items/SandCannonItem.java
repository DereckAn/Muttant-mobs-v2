package com.alexander.mutantmore.items;

import com.alexander.mutantmore.config.mutant_husk.MutantHuskRewardsCommonConfig;
import com.alexander.mutantmore.entities.SandBoulder;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.util.MiscUtils;
import java.util.function.Consumer;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;

/** Hold to charge (half a second minimum), release to fire a rolling sand boulder. */
public class SandCannonItem extends Item {
   public SandCannonItem(Properties properties) {
      super(properties);
   }

   @Override
   @SuppressWarnings("deprecation")
   public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.desc.abilities").withStyle(ChatFormatting.GRAY));
      tooltip.accept(Component.translatable("mutantmore.sand_cannon.desc", Component.keybind("key.use")).withStyle(ChatFormatting.BLUE));
   }

   @Override
   public ItemUseAnimation getUseAnimation(ItemStack stack) {
      return ItemUseAnimation.BOW;
   }

   @Override
   public int getUseDuration(ItemStack stack, LivingEntity user) {
      return 72000;
   }

   @Override
   public InteractionResult use(Level level, Player player, InteractionHand hand) {
      player.startUsingItem(hand);
      return InteractionResult.CONSUME;
   }

   @Override
   public boolean releaseUsing(ItemStack stack, Level level, LivingEntity user, int remainingTime) {
      if (!(user instanceof Player player) || this.getUseDuration(stack, user) - remainingTime < 10) {
         return false;
      }

      if (!level.isClientSide()) {
         SandBoulder boulder = new SandBoulder(level, player);
         boulder.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 0.75F, 1.5F);
         boulder.damage = ((Number)MutantHuskRewardsCommonConfig.cannon_damage.get()).floatValue();
         boulder.lifeSpan = MutantHuskRewardsCommonConfig.cannon_sand_boulder_lifespan.get();
         boulder.griefing = MutantHuskRewardsCommonConfig.cannon_griefing.get();
         boulder.ignoresInvulTime = true;
         boulder.setSandType(MiscUtils.sandStringForPos(level, player.getOnPos()));
         level.addFreshEntity(boulder);
      }

      ShakeCameraEvent.shake(level, 13, 0.03F, player.blockPosition(), 5);
      stack.hurtAndBreak(1, player, user.getUsedItemHand());
      player.getCooldowns().addCooldown(stack, MutantHuskRewardsCommonConfig.cannon_use_cooldown.get());
      player.awardStat(Stats.ITEM_USED.get(this));
      return true;
   }
}
