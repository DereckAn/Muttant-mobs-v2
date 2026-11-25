package com.alexander.mutantmore.ai.goals.mutant_frozen_zombie;

import com.alexander.mutantmore.util.MiscUtils;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.config.mutant_frozen_zombie.MutantFrozenZombieCommonConfig;
import com.alexander.mutantmore.config.mutant_husk.MutantHuskCommonConfig;
import com.alexander.mutantmore.entities.MutantFrozenZombie;
import com.alexander.mutantmore.entities.ZombieResurrection;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.commands.arguments.EntityAnchorArgument.Anchor;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;

public class MutantFrozenZombieRoarGoal extends Goal {
   public MutantFrozenZombie mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;

   public MutantFrozenZombieRoarGoal(MutantFrozenZombie mob) {
      this.setFlags(EnumSet.of(Flag.MOVE, Flag.JUMP));
      this.mob = mob;
      this.target = mob.getTarget();
   }

   public boolean isInterruptable() {
      return false;
   }

   public boolean requiresUpdateEveryTick() {
      return true;
   }

   public boolean canUse() {
      this.target = this.mob.getTarget();

      for (Entity entity : this.mob.resurrectedMobs) {
         if (entity == null || entity.isRemoved()) {
            this.mob.resurrectedMobs.remove(entity);
            break;
         }
      }

      return this.target != null
         && this.mob.tickCount >= this.nextUseTime
         && !this.target.isRemoved()
         && !this.target.isDeadOrDying()
         && this.animationsUseable()
         && this.mob.hasLineOfSight(this.target);
   }

   public boolean canContinueToUse() {
      return !this.animationsUseable();
   }

   public void start() {
      this.mob.roarAnimationTick = 120;
      this.mob.noveltyAnimationTick = 0;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)10);
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null) {
         this.mob.lookAt(Anchor.EYES, this.target.position());
      }

      if (this.mob.roarAnimationTick == 100 && this.mob.resurrectedMobs.isEmpty()) {
         int randomAddedFrozenZombies = MutantFrozenZombieCommonConfig.roar_max_summoned_zombies.get()
                  - MutantFrozenZombieCommonConfig.roar_min_summoned_zombies.get()
               <= 0
            ? 0
            : this.mob
               .getRandom()
               .nextInt(
                  (Integer)MutantFrozenZombieCommonConfig.roar_max_summoned_zombies.get()
                     - (Integer)MutantFrozenZombieCommonConfig.roar_min_summoned_zombies.get()
               );
         int frozenZombies = (Integer)MutantFrozenZombieCommonConfig.roar_min_summoned_zombies.get() + randomAddedFrozenZombies;

         for (int i = 0; i < frozenZombies; i++) {
            ZombieResurrection resurrection = new ZombieResurrection(this.mob.level(), this.mob.getRandom().nextInt(100), this.mob);
            resurrection.snapTo(
               this.mob
                  .position()
                  .add(
                     -(Integer)MutantFrozenZombieCommonConfig.roar_summon_zombies_range.get()
                        + this.mob.getRandom().nextInt((Integer)MutantFrozenZombieCommonConfig.roar_summon_zombies_range.get() * 2),
                     0.0,
                     -(Integer)MutantFrozenZombieCommonConfig.roar_summon_zombies_range.get()
                        + this.mob.getRandom().nextInt((Integer)MutantFrozenZombieCommonConfig.roar_summon_zombies_range.get() * 2)
                  )
            );
            resurrection.setEntityType(MiscUtils.entityTypeOrZombie(MutantFrozenZombieCommonConfig.roar_summoned_zombie_type.get()));
            resurrection.setYRot(this.mob.getRandom().nextFloat() * 360.0F);
            PositionUtils.moveToCorrectHeight(resurrection, true);
            ((ServerLevel)this.mob.level()).addFreshEntityWithPassengers(resurrection);
            ShakeCameraEvent.shake(this.mob.level(), 66, 0.025F, this.mob.blockPosition(), 25);
         }
      }
   }

   public void stop() {
      super.stop();
      int randomAddedCooldown = MutantFrozenZombieCommonConfig.max_roar_cooldown.get() - MutantFrozenZombieCommonConfig.min_roar_cooldown.get() <= 0
         ? 0
         : this.mob
            .getRandom()
            .nextInt((Integer)MutantFrozenZombieCommonConfig.max_roar_cooldown.get() - (Integer)MutantFrozenZombieCommonConfig.min_roar_cooldown.get());
      int cooldown = (Integer)MutantFrozenZombieCommonConfig.min_roar_cooldown.get() + randomAddedCooldown;
      this.nextUseTime = this.mob.tickCount + cooldown;
   }

   public boolean animationsUseable() {
      return this.mob.roarAnimationTick <= 0;
   }
}
