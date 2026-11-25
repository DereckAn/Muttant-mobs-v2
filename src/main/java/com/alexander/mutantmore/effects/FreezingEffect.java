package com.alexander.mutantmore.effects;

import com.alexander.mutantmore.config.FreezingEffectCommonConfig;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

/** Freezes like standing in powder snow, faster per level, up to the configured cap (was HandleFreezingEffectEvent). */
public class FreezingEffect extends SimpleEffect {
   public FreezingEffect(MobEffectCategory category, int color) {
      super(category, color);
   }

   @Override
   public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
      return true;
   }

   @Override
   public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
      int max = FreezingEffectCommonConfig.max_freezing_amount.get();
      entity.setIsInPowderSnow(true);
      if (entity.getTicksFrozen() <= max) {
         entity.setTicksFrozen(Mth.clamp(entity.getTicksFrozen() + 2 + amplifier + 1, 0, max));
      }

      return true;
   }
}
