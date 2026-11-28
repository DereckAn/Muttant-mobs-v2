package com.alexander.mutantmore.items;

import com.alexander.mutantmore.config.mutant_blaze.MutantBlazeRewardsCommonConfig;
import com.alexander.mutantmore.entities.MutantBlazeShields;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import java.util.function.Consumer;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;

/** Use to surround yourself with four Mutant Blaze shields; crouch-use on a mob to give them to it. */
public class MutantBlazeShieldsItem extends Item {
   public MutantBlazeShieldsItem(Item.Properties properties) {
      super(properties);
   }

   @Override
   public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.desc.abilities").withStyle(ChatFormatting.GRAY));
      tooltip.accept(
         Component.translatable("mutantmore.mutant_blaze_shields.desc", Component.keybind("key.use"), Component.keybind("key.use"), Component.keybind("key.sneak"))
            .withStyle(ChatFormatting.BLUE)
      );
   }

   private static boolean hasShields(Level level, Entity target) {
      return level.getEntitiesOfClass(MutantBlazeShields.class, target.getBoundingBox().inflate(5.0)).stream().anyMatch(s -> s.getAttachedEntity() == target);
   }

   private void giveShields(Player player, ItemStack stack, Entity target, int cooldown) {
      player.getCooldowns().addCooldown(stack, cooldown);
      player.awardStat(Stats.ITEM_USED.get(this));
      if (!player.level().isClientSide()) {
         MutantBlazeShields shields = EntityTypeInit.MUTANT_BLAZE_SHIELDS.create(player.level(), EntitySpawnReason.MOB_SUMMONED);
         if (shields != null) {
            shields.setAttachedEntityID(target.getId());
            shields.setRemainingShields(4);
            shields.snapTo(target.position());
            shields.playSound(SoundEventInit.MUTANT_BLAZE_SHIELDS_APPEAR, 1.0F, (player.getRandom().nextFloat() - player.getRandom().nextFloat()) * 0.2F + 1.0F);
            player.level().addFreshEntity(shields);
         }
      }
   }

   @Override
   public InteractionResult use(Level level, Player player, InteractionHand hand) {
      if (player.isCrouching() || hasShields(level, player)) {
         return InteractionResult.PASS;
      }

      this.giveShields(player, player.getItemInHand(hand), player, MutantBlazeRewardsCommonConfig.shields_use_cooldown.get());
      return InteractionResult.SUCCESS;
   }

   @Override
   public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity target, InteractionHand hand) {
      if (!player.isCrouching() || target.isInvulnerable() || hasShields(player.level(), target)) {
         return InteractionResult.PASS;
      }

      // ponytail: the original hardcodes 2 minutes here instead of the config cooldown
      this.giveShields(player, stack, target, 2400);
      return InteractionResult.SUCCESS;
   }
}
