package com.alexander.mutantmore.events;

import com.alexander.mutantmore.network.ShakeCameraPayload;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

// Shakes are queued here on the client; client.CameraShake ticks them and CameraMixin applies them.
public class ShakeCameraEvent {
   public static final List<CameraShakeHandler> cameraShakes = new ArrayList<>();

   public static void shake(Level level, int duration, float amount, BlockPos causePosition, int range) {
      if (level == null || level.isClientSide()) {
         cameraShakes.add(0, new CameraShakeHandler(amount, duration, causePosition, range));
      } else {
         for (Player player : level.players()) {
            if (player instanceof ServerPlayer serverPlayer) {
               ServerPlayNetworking.send(serverPlayer, new ShakeCameraPayload(duration, amount, causePosition, range));
            }
         }
      }
   }

   public static class CameraShakeHandler {
      public final float amount;
      public final int duration;
      public int time;
      public final BlockPos causePosition;
      public final int range;

      public CameraShakeHandler(float amount, int duration, BlockPos causePosition, int range) {
         this.amount = amount;
         this.duration = duration;
         this.time = duration;
         this.causePosition = causePosition;
         this.range = range;
      }
   }
}
