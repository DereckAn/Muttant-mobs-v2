package com.alexander.mutantmore.interfaces;

import net.minecraft.world.entity.LivingEntity;

public interface ISnowstormSource {
   double snowstormRange();

   double snowstormRangeY();

   boolean canFreeze(LivingEntity var1);
}
