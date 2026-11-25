package com.alexander.mutantmore.items;

import com.alexander.mutantmore.config.mutant_wither_skeleton.MutantWitherSkeletonRewardsCommonConfig;
import com.alexander.mutantmore.entities.WitherSlash;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.SoundEventInit;
import java.util.function.Consumer;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

/** Sword that withers on hit; right click throws a Wither Slash. Damage/speed/durability come from ItemInit's weapon properties. */
public class WitheredScimitarItem extends Item {
   public WitheredScimitarItem(Item.Properties properties) {
      super(properties);
   }

   @Override
   public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.desc.abilities").withStyle(ChatFormatting.GRAY));
      tooltip.accept(Component.translatable("mutantmore.withered_scimitar.desc", Component.keybind("key.use")).withStyle(ChatFormatting.BLUE));
   }

   @Override
   public InteractionResult use(Level level, Player player, InteractionHand hand) {
      ItemStack stack = player.getItemInHand(hand);
      player.swing(hand, net.minecraft.world.item.component.SwingAnimation.DEFAULT, true);
      player.getCooldowns().addCooldown(stack, MutantWitherSkeletonRewardsCommonConfig.scimitar_shoot_wither_slash_speed.get());
      ShakeCameraEvent.shake(level, 5, 0.04F, player.blockPosition(), 5);
      if (!level.isClientSide()) {
         Vec3 look = player.getViewVector(1.0F);
         WitherSlash projectile = new WitherSlash(level, player, player.yHeadRot);
         projectile.shoot(look.x, look.y, look.z, 2.0F, 0.0F);
         projectile.snapTo(player.getX(), player.getY(0.6F), player.getZ());
         projectile.damage = MutantWitherSkeletonRewardsCommonConfig.scimitar_wither_slash_damage.get().floatValue();
         projectile.witherLength = MutantWitherSkeletonRewardsCommonConfig.scimitar_wither_slash_wither_length.get();
         projectile.witherLevel = MutantWitherSkeletonRewardsCommonConfig.scimitar_wither_slash_wither_level.get();
         stack.hurtAndBreak(MutantWitherSkeletonRewardsCommonConfig.scimitar_shoot_wither_slash_durability_consumption.get(), player, hand);
         double dx = -net.minecraft.util.Mth.sin(player.getYRot() * (float)(Math.PI / 180.0));
         double dz = net.minecraft.util.Mth.cos(player.getYRot() * (float)(Math.PI / 180.0));
         ((net.minecraft.server.level.ServerLevel)level).sendParticles(net.minecraft.core.particles.ParticleTypes.SWEEP_ATTACK, player.getX() + dx, player.getY(0.5), player.getZ() + dz, 0, dx, 0.0, dz, 0.0);
         level.addFreshEntity(projectile);
         level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEventInit.MUTANT_WITHER_SKELETON_FIRE_SLASH, SoundSource.PLAYERS, 1.0F, 1.0F);
      }

      return InteractionResult.SUCCESS;
   }

   @Override
   public void hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
      target.addEffect(
         new MobEffectInstance(
            MobEffects.WITHER, MutantWitherSkeletonRewardsCommonConfig.scimitar_attack_wither_length.get(), MutantWitherSkeletonRewardsCommonConfig.scimitar_attack_wither_level.get()
         ),
         attacker
      );
      super.hurtEnemy(stack, target, attacker);
   }
}
