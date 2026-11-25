package com.alexander.mutantmore.items;

import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinRewardsCommonConfig;
import com.alexander.mutantmore.init.EffectInit;
import com.alexander.mutantmore.init.ItemInit;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

/** Hog Helm rage: getting hurt builds Enraged levels; each enraged hit or Hoglin weapon ability spends one. (Was HogHelmRageEvents.) */
public final class RageItems {
   private RageItems() {
   }

   private static int maxLevel() {
      return MutantHoglinRewardsCommonConfig.helmet_max_rage_level.get();
   }

   /** Server: the wearer took damage. */
   public static void onWearerHurt(LivingEntity entity) {
      if (!entity.getItemBySlot(EquipmentSlot.HEAD).is(ItemInit.HOG_HELM)) {
         return;
      }

      MobEffectInstance rage = entity.getEffect(EffectInit.ENRAGED);
      if (rage == null) {
         entity.addEffect(new MobEffectInstance(EffectInit.ENRAGED, MutantHoglinRewardsCommonConfig.helmet_initial_rage_duration_increase.get(), 0));
      } else {
         int duration = Mth.clamp(
            rage.getDuration() + MutantHoglinRewardsCommonConfig.helmet_rage_duration_increase.get(), 0, MutantHoglinRewardsCommonConfig.helmet_max_rage_duration.get()
         );
         entity.addEffect(new MobEffectInstance(EffectInit.ENRAGED, duration, Mth.clamp(rage.getAmplifier() + 1, 0, maxLevel())));
      }
   }

   /** Server: an enraged attacker hits; returns the boosted damage and spends one rage level. */
   public static float onEnragedAttack(LivingEntity attacker, float amount) {
      MobEffectInstance rage = attacker.getEffect(EffectInit.ENRAGED);
      if (rage == null) {
         return amount;
      }

      float boosted = amount * (1.0F + rage.getAmplifier() * ((Number)MutantHoglinRewardsCommonConfig.helmet_rage_damage_multiplier.get()).floatValue());
      spendLevel(attacker, rage);
      return boosted;
   }

   /** Ability cooldown, shortened by rage (and spending a level of it), as the Hoglance and Hogfist Gauntlet do. */
   public static void cooldownAndSpendRage(Player player, ItemStack stack, int cooldown) {
      MobEffectInstance rage = player.getEffect(EffectInit.ENRAGED);
      if (rage == null) {
         player.getCooldowns().addCooldown(stack, cooldown);
      } else {
         player.getCooldowns().addCooldown(stack, cooldown / (rage.getAmplifier() * 2 + 1));
         spendLevel(player, rage);
      }
   }

   private static void spendLevel(LivingEntity entity, MobEffectInstance rage) {
      entity.removeEffect(EffectInit.ENRAGED);
      entity.addEffect(new MobEffectInstance(EffectInit.ENRAGED, rage.getDuration(), Mth.clamp(rage.getAmplifier() - 1, 0, maxLevel())));
   }
}
