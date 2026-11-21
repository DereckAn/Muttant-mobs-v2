package com.alexander.mutantmore.mixin.client;

import com.alexander.mutantmore.client.CameraShake;
import net.minecraft.client.Camera;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Camera.class)
public abstract class CameraMixin {
   @Shadow private Entity entity;
   @Shadow private float xRot;
   @Shadow private float yRot;

   @Shadow protected abstract void setRotation(float yRot, float xRot);

   @Inject(method = "alignWithEntity", at = @At("TAIL"))
   private void mutantmore$shake(float partialTicks, CallbackInfo ci) {
      float[] o = CameraShake.offsets(this.entity, partialTicks);
      if (o != null) this.setRotation(this.yRot + o[0], this.xRot + o[1]);
   }
}
