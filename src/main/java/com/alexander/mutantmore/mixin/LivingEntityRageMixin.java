package com.alexander.mutantmore.mixin;

import com.alexander.mutantmore.init.EffectInit;
import com.alexander.mutantmore.items.RageItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

/** Was HogHelmRageEvents (Forge LivingHurtEvent): Hog Helm wearers gain rage when hurt; enraged attackers hit harder. */
@Mixin(LivingEntity.class)
public abstract class LivingEntityRageMixin {
   @ModifyVariable(method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", at = @At("HEAD"), argsOnly = true)
   private float mutantmore$rage(float amount, ServerLevel level, DamageSource source, float originalAmount) {
      if (amount > 0.0F) {
         RageItems.onWearerHurt((LivingEntity)(Object)this);
      }

      if (source.getEntity() instanceof LivingEntity attacker && attacker.hasEffect(EffectInit.ENRAGED)) {
         return RageItems.onEnragedAttack(attacker, amount);
      }

      return amount;
   }
}
