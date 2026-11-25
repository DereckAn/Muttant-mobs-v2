package com.alexander.mutantmore.network;

import com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers.AdvancedAnimatable;
import com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers.AdvancedAnimation;
import io.netty.buffer.Unpooled;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.Level;

/** Server → client: the full state of one advanced animation (was SyncAdvancedAnimationToClient). */
public record SyncAdvancedAnimationPayload(int entityId, String name, byte[] data) implements CustomPacketPayload {
   public static final Type<SyncAdvancedAnimationPayload> TYPE = new Type<>(Identifier.fromNamespaceAndPath("mutantmore", "sync_advanced_animation"));
   public static final StreamCodec<RegistryFriendlyByteBuf, SyncAdvancedAnimationPayload> CODEC = StreamCodec.composite(
      ByteBufCodecs.VAR_INT, SyncAdvancedAnimationPayload::entityId,
      ByteBufCodecs.STRING_UTF8, SyncAdvancedAnimationPayload::name,
      ByteBufCodecs.BYTE_ARRAY, SyncAdvancedAnimationPayload::data,
      SyncAdvancedAnimationPayload::new
   );

   public static SyncAdvancedAnimationPayload of(int entityId, AdvancedAnimation animation) {
      FriendlyByteBuf buf = new FriendlyByteBuf(Unpooled.buffer());
      animation.write(buf);
      byte[] bytes = new byte[buf.readableBytes()];
      buf.readBytes(bytes);
      return new SyncAdvancedAnimationPayload(entityId, animation.getName(), bytes);
   }

   public void apply(Level level) {
      if (level.getEntity(this.entityId) instanceof AdvancedAnimatable animatable && animatable.getAnimationTracker().getAnimation(this.name) instanceof AdvancedAnimation animation) {
         animation.read(new FriendlyByteBuf(Unpooled.wrappedBuffer(this.data)));
      }
   }

   @Override
   public Type<? extends CustomPacketPayload> type() {
      return TYPE;
   }
}
