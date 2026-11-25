package com.alexander.mutantmore.particles;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;

/** A particle carrying a few floats (e.g. a colour). The original had 10 fixed float fields plus a type-name string. */
public record AdvancedParticleOption(ParticleType<AdvancedParticleOption> type, List<Float> values) implements ParticleOptions {
   public static MapCodec<AdvancedParticleOption> codec(ParticleType<AdvancedParticleOption> type) {
      return Codec.FLOAT.listOf().fieldOf("values").xmap(values -> new AdvancedParticleOption(type, values), AdvancedParticleOption::values);
   }

   public static StreamCodec<RegistryFriendlyByteBuf, AdvancedParticleOption> streamCodec(ParticleType<AdvancedParticleOption> type) {
      return ByteBufCodecs.FLOAT.apply(ByteBufCodecs.list()).map(values -> new AdvancedParticleOption(type, values), AdvancedParticleOption::values).cast();
   }

   public float value(int index) {
      return index < this.values.size() ? this.values.get(index) : 0.0F;
   }

   @Override
   public ParticleType<AdvancedParticleOption> getType() {
      return this.type;
   }
}
