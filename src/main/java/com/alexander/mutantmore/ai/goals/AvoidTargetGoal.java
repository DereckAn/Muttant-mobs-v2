package com.alexander.mutantmore.ai.goals;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.ai.util.DefaultRandomPos;
import net.minecraft.world.level.pathfinder.Path;
import net.minecraft.world.phys.Vec3;

public class AvoidTargetGoal extends Goal {
   public PathfinderMob mob;
   public LivingEntity target;
   public double startAvoidingRange;
   public double stopAvoidingDistance;
   public double avoidSpeed;
   public boolean avoidUnseenTarget;
   @Nullable
   protected Path path;
   public int runningFor;

   public AvoidTargetGoal(PathfinderMob mob, double startAvoidingRange, double stopAvoidingDistance, double avoidSpeed, boolean avoidUnseenTarget) {
      this.setFlags(EnumSet.of(Flag.MOVE));
      this.mob = mob;
      this.startAvoidingRange = startAvoidingRange;
      this.stopAvoidingDistance = stopAvoidingDistance;
      this.avoidSpeed = avoidSpeed;
      this.avoidUnseenTarget = avoidUnseenTarget;
   }

   public boolean canUse() {
      this.target = this.mob.getTarget();
      if (this.target == null) {
         return false;
      }

      Vec3 vec3 = DefaultRandomPos.getPosAway(
         this.mob, Mth.ceil(this.stopAvoidingDistance), Mth.ceil(this.stopAvoidingDistance / 2.0), this.target.position()
      );
      if (vec3 == null) {
         return false;
      }

      if (this.target.distanceToSqr(vec3.x, vec3.y, vec3.z) < this.target.distanceToSqr(this.mob)) {
         return false;
      }

      this.path = this.mob.getNavigation().createPath(vec3.x, vec3.y, vec3.z, 0);
      return this.path != null && this.mob.distanceTo(this.target) <= this.startAvoidingRange && (this.mob.hasLineOfSight(this.target) || this.avoidUnseenTarget);
   }

   public boolean canContinueToUse() {
      return this.target != null && this.mob.distanceTo(this.target) < this.stopAvoidingDistance && !this.mob.getNavigation().isDone() && this.runningFor < 200;
   }

   public void start() {
      super.start();
      this.runningFor = 0;
      this.mob.getNavigation().moveTo(this.path, this.avoidSpeed);
   }

   public void tick() {
      super.tick();
      this.runningFor++;
   }

   public void stop() {
      super.stop();
      this.mob.getNavigation().stop();
   }
}
