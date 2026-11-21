package com.alexander.mutantmore.client;

import com.alexander.mutantmore.config.MutantMoreMiscClientConfig;
import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.events.ShakeCameraEvent.CameraShakeHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;

public class CameraShake {
   public static void tick(Minecraft minecraft) {
      if (minecraft.isPaused()) return;
      ShakeCameraEvent.cameraShakes.removeIf(h -> --h.time <= 0);
   }

   /** Returns {yaw, pitch} offsets in degrees for this frame. */
   public static float[] offsets(Entity cameraEntity, float partialTicks) {
      float yaw = 0.0F, pitch = 0.0F;
      if (cameraEntity == null || ShakeCameraEvent.cameraShakes.isEmpty()) return null;
      float t = cameraEntity.tickCount + partialTicks;
      float scale = ((Number)MutantMoreMiscClientConfig.screen_shake_amount.get()).floatValue();
      for (CameraShakeHandler h : ShakeCameraEvent.cameraShakes) {
         if (h.time > 0 && Math.sqrt(cameraEntity.distanceToSqr(net.minecraft.world.phys.Vec3.atCenterOf(h.causePosition))) <= h.range) {
            float amount = h.amount * ((float)h.time / h.duration) * scale;
            pitch += (float)(amount * Math.cos(t * 3.0F + 2.0F) * 25.0);
            yaw += (float)(amount * Math.cos(t * 5.0F + 9.0F) * 25.0);
         }
      }
      // ponytail: roll shake dropped (26.x Camera has no roll); add a GameRenderer bobView-style mixin if it's missed
      return new float[]{yaw, pitch};
   }
}
