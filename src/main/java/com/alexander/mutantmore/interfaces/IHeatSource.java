package com.alexander.mutantmore.interfaces;

import net.minecraft.world.entity.LivingEntity;

public interface IHeatSource {
   double heatRange();

   double heatRangeY();

   double heatSpeed();

   boolean canHeat(LivingEntity var1);
}
