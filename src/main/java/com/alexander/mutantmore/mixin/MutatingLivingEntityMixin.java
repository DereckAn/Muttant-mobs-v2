package com.alexander.mutantmore.mixin;

import com.alexander.mutantmore.config.MutationCommonConfig;
import com.alexander.mutantmore.entities.MutationCloud;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/** A mob being mutated sounds deeper and louder as the mutation goes on. */
@Mixin(LivingEntity.class)
public abstract class MutatingLivingEntityMixin {
   private MutationCloud mutantmore$cloud() {
      return (Object)this instanceof Mob mob && !MutationCommonConfig.classic_mutations.get() ? MutationCloud.forMob(mob) : null;
   }

   @Inject(method = "getVoicePitch", at = @At("RETURN"), cancellable = true)
   private void mutantmore$deeperWhileMutating(CallbackInfoReturnable<Float> cir) {
      MutationCloud cloud = this.mutantmore$cloud();
      if (cloud != null) {
         cir.setReturnValue(cir.getReturnValue() / (1.0F + cloud.mutateAnimation().progress() / cloud.mutateAnimation().getLength()));
      }
   }

   @Inject(method = "getSoundVolume", at = @At("RETURN"), cancellable = true)
   private void mutantmore$louderWhileMutating(CallbackInfoReturnable<Float> cir) {
      if (this.mutantmore$cloud() != null) {
         cir.setReturnValue(cir.getReturnValue() * 2.0F);
      }
   }
}
