package com.alexander.mutantmore.mixin;

import com.alexander.mutantmore.heat.Heat;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Was the Forge LivingTickEvent handler HandleEntityHeatEvent. */
@Mixin(LivingEntity.class)
public abstract class LivingEntityHeatMixin {
   @Inject(method = "tick()V", at = @At("TAIL"))
   private void mutantmore$tickHeat(CallbackInfo ci) {
      Heat.tick((LivingEntity)(Object)this);
   }
}
