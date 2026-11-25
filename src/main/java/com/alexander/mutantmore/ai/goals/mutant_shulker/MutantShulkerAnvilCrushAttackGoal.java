package com.alexander.mutantmore.ai.goals.mutant_shulker;

import com.alexander.mutantmore.config.mutant_shulker.MutantShulkerCommonConfig;
import com.alexander.mutantmore.entities.MutantShulker;
import com.alexander.mutantmore.init.SoundEventInit;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.Goal.Flag;
import net.minecraft.world.entity.player.Player;

public class MutantShulkerAnvilCrushAttackGoal extends Goal {
   public MutantShulker mob;
   @Nullable
   public LivingEntity target;

   public MutantShulkerAnvilCrushAttackGoal(MutantShulker mob) {
      this.setFlags(EnumSet.of(Flag.MOVE, Flag.JUMP, Flag.LOOK));
      this.mob = mob;
      this.target = mob.getTarget();
   }

   public boolean isInterruptable() {
      return this.mob.shouldBeStationary();
   }

   public boolean requiresUpdateEveryTick() {
      return true;
   }

   public boolean canUse() {
      this.target = this.mob.getTarget();
      return this.target != null
         && !this.target.isRemoved()
         && !this.target.isDeadOrDying()
         && this.mob.getRandom().nextInt((Integer)MutantShulkerCommonConfig.anvil_crush_chance.get()) == 0
         && this.animationsUseable()
         && this.mob.isInBox();
   }

   public boolean canContinueToUse() {
      return this.target != null && !this.target.isRemoved() && !this.target.isDeadOrDying() && !this.animationsUseable();
   }

   public void start() {
      this.mob.playSound(SoundEventInit.MUTANT_SHULKER_OPEN);
      this.mob.anvilCrushAnimationTick = this.mob.anvilCrushAnimationLength;
      this.mob.level().broadcastEntityEvent(this.mob, (byte)37);
   }

   public void tick() {
      this.target = this.mob.getTarget();
      this.mob.getNavigation().stop();
      if (this.target != null) {
         this.mob.getLookControl().setLookAt(this.target);
      }

      if (this.target != null && this.mob.anvilCrushAnimationTick == this.mob.anvilCrushAnimationActionPoint) {
         this.mob.teleportTo(this.target.getX(), this.target.getY() + 12.5, this.target.getZ());
         this.mob
            .level()
            .playSound(
               (Player)null,
               this.mob.xo,
               this.mob.yo,
               this.mob.zo,
               SoundEventInit.MUTANT_SHULKER_TELEPORT,
               this.mob.getSoundSource(),
               1.0F,
               1.0F
            );
         this.mob.playSound(SoundEventInit.MUTANT_SHULKER_TELEPORT, 1.0F, 1.0F);
         this.mob.setAnvilAttacking(true);
      }
   }

   public boolean animationsUseable() {
      return this.mob.anvilCrushAnimationTick <= 0;
   }
}
