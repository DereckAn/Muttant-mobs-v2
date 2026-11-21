package com.alexander.mutantmore.ai.goals;

import org.jspecify.annotations.Nullable;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.phys.Vec3;

public class GroundPullAntiCheeseGoal extends Goal {
   public Mob mob;
   @Nullable
   public LivingEntity target;
   public int usingFor;

   public GroundPullAntiCheeseGoal(Mob mob) {
      this.mob = mob;
      this.target = mob.getTarget();
   }

   public boolean canUse() {
      this.target = this.mob.getTarget();
      return this.mob.onGround()
         && this.target != null
         && !this.target.isRemoved()
         && !this.target.isDeadOrDying()
         && this.mob.getLastHurtByMob() == this.target
         && this.target.getY() < this.mob.getY()
         && this.distanceToXZ(this.target) < 2.0F
         && this.distanceToY(this.target) >= 3.0F
         && this.mob.getLastHurtByMobTimestamp() - this.mob.tickCount < 20;
   }

   public boolean canContinueToUse() {
      return this.target != null && !this.target.isRemoved() && !this.target.isDeadOrDying() && this.target.getY() < this.mob.getY();
   }

   public void start() {
      super.start();
      this.usingFor = 0;
   }

   public float distanceToXZ(Entity p_20271_) {
      float f = (float)(this.mob.getX() - p_20271_.getX());
      float f2 = (float)(this.mob.getZ() - p_20271_.getZ());
      return Mth.sqrt(f * f + f2 * f2);
   }

   public float distanceToY(Entity p_20271_) {
      float f1 = (float)(this.mob.getY() - p_20271_.getY());
      return Mth.sqrt(f1 * f1);
   }

   public void tick() {
      this.usingFor++;
      if (this.target != null) {
         this.target.needsSync = true;
         this.target.push(0.0, 0.3, 0.0);
         if (this.usingFor >= 20) {
            Vec3 targetPos = this.mob.position().add(this.mob.getRandom().nextGaussian(), 0.25, this.mob.getRandom().nextGaussian());
            this.target.setPos(targetPos);
            if (this.target instanceof ServerPlayer) {
               ((ServerPlayer)this.target).teleportTo(targetPos.x, targetPos.y, targetPos.z);
            }
         }
      }
   }
}
