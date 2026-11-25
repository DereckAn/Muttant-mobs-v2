package com.alexander.mutantmore.network;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;

/** Client -> server: the player is holding attack while grabbing with the Mutant Jungle Zombie Arm. */
public record ArmStranglePayload() implements CustomPacketPayload {
   public static final CustomPacketPayload.Type<ArmStranglePayload> TYPE = new CustomPacketPayload.Type<>(
      Identifier.fromNamespaceAndPath("mutantmore", "arm_strangle")
   );
   public static final StreamCodec<RegistryFriendlyByteBuf, ArmStranglePayload> CODEC = StreamCodec.unit(new ArmStranglePayload());

   @Override
   public Type<? extends CustomPacketPayload> type() {
      return TYPE;
   }
}
