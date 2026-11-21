package com.alexander.mutantmore.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;

public record ShakeCameraPayload(int duration, float amount, BlockPos causePos, int range) implements CustomPacketPayload {
   public static final Type<ShakeCameraPayload> TYPE = new Type<>(Identifier.fromNamespaceAndPath("mutantmore", "shake_camera"));
   public static final StreamCodec<ByteBuf, ShakeCameraPayload> CODEC = StreamCodec.composite(
      ByteBufCodecs.VAR_INT, ShakeCameraPayload::duration,
      ByteBufCodecs.FLOAT, ShakeCameraPayload::amount,
      BlockPos.STREAM_CODEC, ShakeCameraPayload::causePos,
      ByteBufCodecs.VAR_INT, ShakeCameraPayload::range,
      ShakeCameraPayload::new
   );

   @Override
   public Type<? extends CustomPacketPayload> type() {
      return TYPE;
   }
}
