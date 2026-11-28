package com.alexander.mutantmore.mixin;

import com.alexander.mutantmore.mutations.NaturalMutantSpawns;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.ServerLevelAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/** Remember freshly spawned mobs; NaturalMutantSpawns may swap them for their mutant once they're in the world (was FinalizeSpawn). */
@Mixin(Mob.class)
public abstract class NaturalMutantSpawnMixin {
   @Inject(method = "finalizeSpawn", at = @At("RETURN"))
   private void mutantmore$markFreshSpawn(
      ServerLevelAccessor level, DifficultyInstance difficulty, EntitySpawnReason reason, SpawnGroupData groupData, CallbackInfoReturnable<SpawnGroupData> cir
   ) {
      NaturalMutantSpawns.markFreshSpawn((Mob)(Object)this, reason);
   }
}
