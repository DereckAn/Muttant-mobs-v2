package com.alexander.mutantmore.items;

import com.alexander.mutantmore.entities.Rodling;
import java.util.function.Consumer;
import net.minecraft.ChatFormatting;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;

/** Opens the Rodling Checker: on one of your Rodlings, or (used in the air) on your nearest one. In creative it also tames wild Rodlings. */
public class RodlingCheckerItem extends Item {
   public RodlingCheckerItem(Item.Properties properties) {
      super(properties);
   }

   @Override
   public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.desc.abilities").withStyle(ChatFormatting.GRAY));
      tooltip.accept(Component.translatable("mutantmore.rodling_checker.desc", Component.keybind("key.use"), Component.keybind("key.use")).withStyle(ChatFormatting.BLUE));
      tooltip.accept(Component.translatable("mutantmore.desc.creative_mode").withStyle(ChatFormatting.GRAY));
      tooltip.accept(Component.translatable("mutantmore.rodling_checker.desc_creative", Component.keybind("key.use")).withStyle(ChatFormatting.BLUE));
   }

   @Override
   public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity target, InteractionHand hand) {
      if (!(target instanceof Rodling rodling)) {
         return InteractionResult.PASS;
      }

      if (rodling.isOwnedBy(player)) {
         if (!player.level().isClientSide()) {
            rodling.openCustomInventoryScreen(player);
         }
      } else if (rodling.getOwner() == null && player.isCreative()) {
         for (int i = 0; i < 3; i++) {
            rodling.level().addParticle(ParticleTypes.HEART, rodling.getRandomX(1.0), rodling.getRandomY(), rodling.getRandomZ(1.0), 0.0, 0.0, 0.0);
         }

         rodling.setFollowType(Rodling.FollowType.SIT);
         rodling.tame(player);
      }

      return InteractionResult.SUCCESS;
   }

   @Override
   public InteractionResult use(Level level, Player player, InteractionHand hand) {
      Rodling nearest = null;
      for (Rodling rodling : level.getEntitiesOfClass(Rodling.class, player.getBoundingBox().inflate(20.0))) {
         if (rodling.isAlive() && rodling.isOwnedBy(player) && (nearest == null || rodling.distanceTo(player) < nearest.distanceTo(player))) {
            nearest = rodling;
         }
      }

      if (nearest == null) {
         return InteractionResult.PASS;
      }

      if (!level.isClientSide()) {
         nearest.openCustomInventoryScreen(player);
      }

      return InteractionResult.SUCCESS;
   }
}
