package com.alexander.mutantmore.ai.goals;

import java.util.EnumSet;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;

public class LookAtTargetGoal extends Goal {
   protected final Mob mob;

   public LookAtTargetGoal(Mob mob) {
      this.setFlags(EnumSet.of(Flag.LOOK));
      this.mob = mob;
   }

   public boolean canUse() {
      return this.mob.getTarget() != null && this.mob.getTarget().isAlive();
   }

   public boolean canContinueToUse() {
      return this.mob.getTarget() != null && this.mob.getTarget().isAlive();
   }

   public void tick() {
      if (this.mob.getTarget() != null && this.mob.getTarget().isAlive()) {
         this.mob.getLookControl().setLookAt(this.mob.getTarget().getX(), this.mob.getTarget().getEyeY(), this.mob.getTarget().getZ());
      }
   }
}
