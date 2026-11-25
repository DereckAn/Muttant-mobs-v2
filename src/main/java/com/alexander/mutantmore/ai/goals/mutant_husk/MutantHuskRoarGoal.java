package com.alexander.mutantmore.ai.goals.mutant_husk;

import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.config.mutant_husk.MutantHuskCommonConfig;
import com.alexander.mutantmore.entities.MutantHusk;
import com.alexander.mutantmore.entities.ZombieResurrection;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.commands.arguments.EntityAnchorArgument.Anchor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;

public class MutantHuskRoarGoal extends Goal {
   public MutantHusk mob;
   @Nullable
   public LivingEntity target;
   public int nextUseTime;

   public MutantHuskRoarGoal(MutantHusk mob) {
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
         && this.mob.resurrectedMobs.isEmpty()
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

      if (this.mob.roarAnimationTick == 103) {
         this.mob.playSound(SoundEventInit.MUTANT_HUSK_ROAR, 3.0F, 1.0F);
         int randomAddedzombies = MutantHuskCommonConfig.roar_max_summoned_zombies.get() - MutantHuskCommonConfig.roar_min_summoned_zombies.get() <= 0
            ? 0
            : this.mob
               .getRandom()
               .nextInt((Integer)MutantHuskCommonConfig.roar_max_summoned_zombies.get() - (Integer)MutantHuskCommonConfig.roar_min_summoned_zombies.get());
         int zombies = (Integer)MutantHuskCommonConfig.roar_min_summoned_zombies.get() + randomAddedzombies;

         for (int i = 0; i < zombies; i++) {
            ZombieResurrection resurrection = new ZombieResurrection(this.mob.level(), this.mob.getRandom().nextInt(100), this.mob);
            resurrection.snapTo(
               this.mob
                  .position()
                  .add(
                     -(Integer)MutantHuskCommonConfig.roar_summon_zombies_range.get()
                        + this.mob.getRandom().nextInt((Integer)MutantHuskCommonConfig.roar_summon_zombies_range.get() * 2),
                     0.0,
                     -(Integer)MutantHuskCommonConfig.roar_summon_zombies_range.get()
                        + this.mob.getRandom().nextInt((Integer)MutantHuskCommonConfig.roar_summon_zombies_range.get() * 2)
                  )
            );
            // Unknown ids in the config fall back to a zombie
            String typeId = MutantHuskCommonConfig.roar_summoned_zombie_type.get();
            Identifier id = Identifier.tryParse(typeId);
            resurrection.setEntityType(id == null ? EntityTypes.ZOMBIE : BuiltInRegistries.ENTITY_TYPE.getOptional(id).orElse(EntityTypes.ZOMBIE));
            resurrection.setYRot(this.mob.getRandom().nextFloat() * 360.0F);
            PositionUtils.moveToCorrectHeight(resurrection, true);
            ((ServerLevel)this.mob.level()).addFreshEntityWithPassengers(resurrection);
         }

         ShakeCameraEvent.shake(this.mob.level(), 100, 0.1F, this.mob.blockPosition(), 25);
      }
   }

   public void stop() {
      super.stop();
      int randomAddedCooldown = MutantHuskCommonConfig.max_roar_cooldown.get() - MutantHuskCommonConfig.min_roar_cooldown.get() <= 0
         ? 0
         : this.mob.getRandom().nextInt((Integer)MutantHuskCommonConfig.max_roar_cooldown.get() - (Integer)MutantHuskCommonConfig.min_roar_cooldown.get());
      int cooldown = (Integer)MutantHuskCommonConfig.min_roar_cooldown.get() + randomAddedCooldown;
      this.nextUseTime = this.mob.tickCount + cooldown;
   }

   public boolean animationsUseable() {
      return this.mob.roarAnimationTick <= 0;
   }
}
