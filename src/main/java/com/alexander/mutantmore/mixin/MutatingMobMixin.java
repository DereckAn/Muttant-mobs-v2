package com.alexander.mutantmore.mixin;

import com.alexander.mutantmore.config.MutationCommonConfig;
import com.alexander.mutantmore.entities.MutationCloud;
import net.minecraft.world.entity.Mob;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/** Mobs being mutated stop thinking (was EntityMixin; only Mobs can be mutated). */
@Mixin(Mob.class)
public abstract class MutatingMobMixin {
   @Inject(method = "isEffectiveAi", at = @At("HEAD"), cancellable = true)
   private void mutantmore$noAiWhileMutating(CallbackInfoReturnable<Boolean> cir) {
      if (MutationCommonConfig.mutating_no_ai.get() && !MutationCommonConfig.classic_mutations.get() && MutationCloud.forMob((Mob)(Object)this) != null) {
         cir.setReturnValue(false);
      }
   }
}
