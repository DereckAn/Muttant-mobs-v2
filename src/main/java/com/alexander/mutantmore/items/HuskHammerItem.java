package com.alexander.mutantmore.items;

import com.alexander.mutantmore.config.mutant_husk.MutantHuskRewardsCommonConfig;
import com.alexander.mutantmore.entities.AreaDamage;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

/** Melee hammer; right-click the top of a block to send a line of sand shockwaves ending in a geyser. Damage/speed/durability come from Item.Properties (see ItemInit). */
public class HuskHammerItem extends Item {
   public HuskHammerItem(Properties properties) {
      super(properties);
   }

   @Override
   @SuppressWarnings("deprecation")
   public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.desc.abilities").withStyle(ChatFormatting.GRAY));
      tooltip.accept(Component.translatable("mutantmore.husk_hammer.desc", Component.keybind("key.use")).withStyle(ChatFormatting.BLUE));
   }

   @Override
   public boolean mineBlock(ItemStack stack, Level level, BlockState state, BlockPos pos, LivingEntity owner) {
      if (state.getDestroySpeed(level, pos) != 0.0F) {
         stack.hurtAndBreak(2, owner, net.minecraft.world.entity.EquipmentSlot.MAINHAND);
      }

      return true;
   }

   @Override
   public InteractionResult useOn(UseOnContext context) {
      Player player = context.getPlayer();
      Level level = context.getLevel();
      if (player == null || context.getClickedFace() != Direction.UP) {
         return super.useOn(context);
      }

      ShakeCameraEvent.shake(level, 5, 0.04F, player.blockPosition(), 5);
      if (level instanceof ServerLevel serverLevel) {
         serverLevel.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEventInit.MUTANT_HUSK_THUD, SoundSource.PLAYERS, 1.0F, MiscUtils.randomSoundPitch());
         int length = MutantHuskRewardsCommonConfig.hammer_shockwave_length.get();
         float damage = ((Number)MutantHuskRewardsCommonConfig.hammer_shockwave_damage.get()).floatValue();
         List<AreaDamage> shockwaves = new ArrayList<>();
         for (int i = 0; i < length; i++) {
            boolean geyser = i == length - 1;
            // A line of ground shockwaves, each 2 ticks after the last, ending in a sand geyser
            Vec3 pos = PositionUtils.getOffsetPos(context.getClickLocation(), 0.0, 0.0, (geyser ? 0.25 : 0.0) + i * 2.25, 0.0F, player.yHeadRot);
            AreaDamage areaDamage = AreaDamage.spawnAreaDamage(
               level,
               pos,
               player,
               damage,
               geyser ? MMDamageTypes.geyserAttack(player.damageSources(), player) : player.damageSources().mobAttack(player),
               2.5F,
               2.5F,
               0.0F,
               geyser ? 5.0F : 0.4F,
               geyser ? 25 : 5,
               i * 2,
               false,
               false,
               geyser ? 0.0 : MutantHuskRewardsCommonConfig.hammer_shockwave_knockback.get(),
               geyser ? MutantHuskRewardsCommonConfig.hammer_geyser_knockback.get() : 0.05,
               true,
               false,
               0,
               true,
               TagInit.EntityTypes.HUSK_HAMMER_SHOCKWAVE_CANT_HURT,
               geyser ? 2 : 1
            );
            PositionUtils.moveToCorrectHeight(areaDamage, true);
            areaDamage.setSandType(MiscUtils.sandStringForPos(level, areaDamage.getOnPos()));
            serverLevel.addFreshEntityWithPassengers(areaDamage);
            shockwaves.add(areaDamage);
         }

         // The ground shockwaves share a hit list so each mob is hit once by the line (the geyser still hits separately)
         for (AreaDamage areaDamage : shockwaves.subList(0, shockwaves.size() - 1)) {
            areaDamage.connectedAreaDamages = new ArrayList<>(shockwaves);
            areaDamage.connectedAreaDamages.remove(areaDamage);
         }
      }

      player.getCooldowns().addCooldown(context.getItemInHand(), MutantHuskRewardsCommonConfig.hammer_shockwave_cooldown.get());
      player.awardStat(Stats.ITEM_USED.get(this));
      context.getItemInHand().hurtAndBreak(MutantHuskRewardsCommonConfig.hammer_shockwave_durability_consumption.get(), player, context.getHand());
      return InteractionResult.SUCCESS;
   }
}
