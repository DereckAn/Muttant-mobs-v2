package com.alexander.mutantmore.items;

import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.mutant_shulker.MutantShulkerRewardsCommonConfig;
import com.alexander.mutantmore.entities.MutantShulkerBullet;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.phys.Vec3;

/** Shield (blocking comes from the BLOCKS_ATTACKS component); attack while blocking fires a Mutant Shulker bullet. */
public class MutantShulkerShieldItem extends Item {
   public static final int SHOOT_ANIMATION_LENGTH = 24;
   /** ticks until the bullet leaves (11) and blocking ends (1); was a Forge capability, not saved */
   private static final Map<LivingEntity, Integer> SHOOT_TIMERS = new WeakHashMap<>();

   public MutantShulkerShieldItem(Item.Properties properties) {
      super(properties);
   }

   @Override
   public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.desc.abilities").withStyle(ChatFormatting.GRAY));
      tooltip.accept(Component.translatable("mutantmore.mutant_shulker_shield.desc", Component.keybind("key.use"), Component.keybind("key.attack")).withStyle(ChatFormatting.BLUE));
   }

   /** Server side of the attack-while-blocking request. */
   public static void startShooting(ServerPlayer player) {
      ItemStack stack = player.getUseItem();
      if (!(stack.getItem() instanceof MutantShulkerShieldItem) || player.getCooldowns().isOnCooldown(stack) || SHOOT_TIMERS.getOrDefault(player, 0) > 0) {
         return;
      }

      stack.hurtAndBreak(3, player, player.getUsedItemHand());
      player.getCooldowns().addCooldown(stack, MutantShulkerRewardsCommonConfig.shield_shoot_cooldown.get());
      player.level().playSound(null, player.blockPosition(), SoundEventInit.MUTANT_SHULKER_SHIELD_SHOOT, SoundSource.PLAYERS, 1.0F, 1.0F);
      SHOOT_TIMERS.put(player, 23);
   }

   /** Called every server tick. */
   public static void tickShooters() {
      SHOOT_TIMERS.replaceAll((living, time) -> {
         time--;
         if (time == 11 && living.level() instanceof ServerLevel level) {
            MutantShulkerBullet bullet = EntityTypeInit.MUTANT_SHULKER_BULLET.create(level, EntitySpawnReason.MOB_SUMMONED);
            if (bullet != null) {
               bullet.damage = MutantShulkerRewardsCommonConfig.shield_bullet_damage.get().floatValue();
               bullet.griefing = MutantShulkerRewardsCommonConfig.shield_bullet_griefing.get();
               bullet.griefingDropsBlocks = MutantShulkerRewardsCommonConfig.shield_bullet_griefing_drops_blocks.get()
                  || MutantMoreGroupedOptionsCommonConfig.griefing_drops_blocks_on.get();
               bullet.explosionSize = MutantShulkerRewardsCommonConfig.shield_bullet_explosion_size.get().floatValue();
               bullet.levitationLength = MutantShulkerRewardsCommonConfig.shield_bullet_levitation_length.get();
               bullet.levitationLevel = MutantShulkerRewardsCommonConfig.shield_bullet_levitation_level.get();
               bullet.setOwner(living);
               bullet.snapTo(living.getX(), living.getEyeY() - 0.25, living.getZ());
               Vec3 view = living.getViewVector(1.0F);
               bullet.shoot(view.x, view.y, view.z, 2.0F, 1.0F);
               level.addFreshEntity(bullet);
               bullet.playSound(SoundEventInit.MUTANT_SHULKER_SHOOT);
            }
         } else if (time == 1) {
            living.stopUsingItem();
         }

         return time;
      });
      SHOOT_TIMERS.values().removeIf(time -> time <= 0);
   }
}
