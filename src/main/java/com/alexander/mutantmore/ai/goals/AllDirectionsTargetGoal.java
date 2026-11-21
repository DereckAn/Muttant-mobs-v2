package com.alexander.mutantmore.ai.goals;

import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import org.jspecify.annotations.Nullable;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.phys.AABB;

public class AllDirectionsTargetGoal<T extends LivingEntity> extends NearestAttackableTargetGoal<T> {
   public AllDirectionsTargetGoal(Mob p_26060_, Class<T> p_26061_, boolean p_26062_) {
      this(p_26060_, p_26061_, 10, p_26062_, false, (TargetingConditions.Selector)null);
   }

   public AllDirectionsTargetGoal(Mob p_199891_, Class<T> p_199892_, boolean p_199893_, TargetingConditions.Selector p_199894_) {
      this(p_199891_, p_199892_, 10, p_199893_, false, p_199894_);
   }

   public AllDirectionsTargetGoal(Mob p_26064_, Class<T> p_26065_, boolean p_26066_, boolean p_26067_) {
      this(p_26064_, p_26065_, 10, p_26066_, p_26067_, (TargetingConditions.Selector)null);
   }

   public AllDirectionsTargetGoal(Mob p_26053_, Class<T> p_26054_, int p_26055_, boolean p_26056_, boolean p_26057_, TargetingConditions.Selector p_26058_) {
      super(p_26053_, p_26054_, p_26055_, p_26057_, p_26057_, p_26058_);
   }

   protected AABB getTargetSearchArea(double p_26069_) {
      return this.mob.getBoundingBox().inflate(p_26069_, p_26069_, p_26069_);
   }
}
