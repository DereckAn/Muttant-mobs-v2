package com.alexander.mutantmore.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;

/** Client → server "attack key pressed" actions of reward items (were separate Forge packets). */
public record RewardActionPayload(Action action) implements CustomPacketPayload {
   public static final Type<RewardActionPayload> TYPE = new Type<>(Identifier.fromNamespaceAndPath("mutantmore", "reward_action"));
   public static final StreamCodec<ByteBuf, RewardActionPayload> CODEC = ByteBufCodecs.idMapper(i -> Action.values()[i], Action::ordinal)
      .map(RewardActionPayload::new, RewardActionPayload::action);

   public enum Action {
      /** Mutant Shulker Shield: fire a bullet while blocking */
      SHIELD_SHOOT,
      /** Leafblower: toggle suck / blow */
      LEAFBLOWER_SWAP
   }

   @Override
   public Type<? extends CustomPacketPayload> type() {
      return TYPE;
   }
}
