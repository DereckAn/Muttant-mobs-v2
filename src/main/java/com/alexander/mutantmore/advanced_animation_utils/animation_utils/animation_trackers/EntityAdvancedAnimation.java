package com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers;

import com.alexander.mutantmore.network.SyncAdvancedAnimationPayload;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;

public class EntityAdvancedAnimation extends AbstractAdvancedAnimation {
   public final Entity entity;

   public EntityAdvancedAnimation(Entity entity, boolean holdOnLastFrame) {
      super(holdOnLastFrame);
      this.entity = entity;
   }

   @Override
   public void syncToClient() {
      if (this.serverSide()) {
         SyncAdvancedAnimationPayload payload = SyncAdvancedAnimationPayload.of(this.entity.getId(), this);
         for (ServerPlayer player : PlayerLookup.tracking(this.entity)) {
            ServerPlayNetworking.send(player, payload);
         }
      }
   }

   @Override
   public boolean serverSide() {
      return !this.entity.level().isClientSide();
   }
}
