package com.alexander.mutantmore.ai.goals.mutant_blaze;

import com.alexander.mutantmore.entities.MutantBlaze;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.phys.Vec3;

public class MutantBlazeLeaveCorridorsGoal extends Goal {
   protected final MutantBlaze mob;
   private double wantedX;
   private double wantedY;
   private double wantedZ;
   private final double speedModifier;

   public MutantBlazeLeaveCorridorsGoal(MutantBlaze p_25221_, double p_25222_) {
      this.mob = p_25221_;
      this.speedModifier = p_25222_;
      this.setFlags(EnumSet.of(Flag.MOVE));
   }

   public boolean canUse() {
      return !this.mob.isCrouching() ? false : this.setWantedPos();
   }

   protected boolean setWantedPos() {
      Vec3 vec3 = this.getHidePos();
      if (vec3 == null) {
         return false;
      }

      this.wantedX = vec3.x;
      this.wantedY = vec3.y;
      this.wantedZ = vec3.z;
      return true;
   }

   public boolean canContinueToUse() {
      return !this.mob.getNavigation().isDone();
   }

   public void start() {
      this.mob.getNavigation().moveTo(this.wantedX, this.wantedY, this.wantedZ, this.speedModifier);
   }

   @Nullable
   protected Vec3 getHidePos() {
      RandomSource randomsource = this.mob.getRandom();
      BlockPos blockpos = this.mob.blockPosition();

      for (int i = 0; i < 20; i++) {
         BlockPos blockpos1 = blockpos.offset(randomsource.nextInt(80) - 40, randomsource.nextInt(6) - 3, randomsource.nextInt(80) - 40);
         if (!this.mob.shouldCrouchAt(blockpos1) && this.mob.getWalkTargetValue(blockpos1) < 0.0F) {
            return Vec3.atBottomCenterOf(blockpos1);
         }
      }

      return null;
   }
}
