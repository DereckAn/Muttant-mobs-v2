package com.alexander.mutantmore.network;

import com.alexander.mutantmore.entities.Rodling;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerPlayer;

/** Client → server: the Rodling Checker's settings for one Rodling (was RodlingCheckerUpdateRodlingPacket). flags: 1 griefing, 2 show name, 4 silent, 8 particles. */
public record RodlingSettingsPayload(int rodlingId, String name, int flags, int followType, int attackType) implements CustomPacketPayload {
   public static final Type<RodlingSettingsPayload> TYPE = new Type<>(Identifier.fromNamespaceAndPath("mutantmore", "rodling_settings"));
   public static final StreamCodec<RegistryFriendlyByteBuf, RodlingSettingsPayload> CODEC = StreamCodec.composite(
      ByteBufCodecs.VAR_INT, RodlingSettingsPayload::rodlingId,
      ByteBufCodecs.stringUtf8(50), RodlingSettingsPayload::name,
      ByteBufCodecs.VAR_INT, RodlingSettingsPayload::flags,
      ByteBufCodecs.VAR_INT, RodlingSettingsPayload::followType,
      ByteBufCodecs.VAR_INT, RodlingSettingsPayload::attackType,
      RodlingSettingsPayload::new
   );

   public void apply(ServerPlayer player) {
      if (!(player.level().getEntity(this.rodlingId) instanceof Rodling rodling) || !rodling.isOwnedBy(player) || rodling.distanceTo(player) > 24.0F) {
         return;
      }

      if (!this.name.isEmpty()) {
         rodling.setCustomName(rodling.getType().getDescription().getString().equals(this.name) ? null : Component.literal(this.name));
      }

      rodling.setFlag(32, (this.flags & 1) != 0);
      rodling.setFlag(64, (this.flags & 2) != 0);
      rodling.setSilent((this.flags & 4) != 0);
      rodling.setFlag(128, (this.flags & 8) != 0);
      rodling.setFollowType(Rodling.FollowType.values()[Math.floorMod(this.followType, Rodling.FollowType.values().length)]);
      rodling.setAttackType(Rodling.AttackType.values()[Math.floorMod(this.attackType, Rodling.AttackType.values().length)]);
   }

   @Override
   public Type<? extends CustomPacketPayload> type() {
      return TYPE;
   }
}
