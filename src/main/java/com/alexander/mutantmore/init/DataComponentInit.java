package com.alexander.mutantmore.init;

import com.mojang.serialization.Codec;
import java.util.function.UnaryOperator;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.resources.Identifier;

/** Item data that was NBT in the original ("Ammo", "ChargeTime", "Charged"+"ProjectileType"). */
public class DataComponentInit {
   public static final DataComponentType<Integer> AMMO = register("ammo", b -> b.persistent(Codec.INT).networkSynchronized(ByteBufCodecs.VAR_INT));
   public static final DataComponentType<Integer> CHARGE_TIME = register(
      "charge_time", b -> b.persistent(Codec.INT).networkSynchronized(ByteBufCodecs.VAR_INT).ignoreSwapAnimation()
   );
   /** The ammo charge item a loaded Adaptive Crossbow will fire; absent = not loaded. */
   public static final DataComponentType<Identifier> LOADED_AMMO = register(
      "loaded_ammo", b -> b.persistent(Identifier.CODEC).networkSynchronized(Identifier.STREAM_CODEC)
   );

   /** Leafblower mode: true = blowing poison, absent/false = sucking things in. */
   public static final DataComponentType<Boolean> LEAFBLOWER_BLOWING = register(
      "leafblower_blowing", b -> b.persistent(Codec.BOOL).networkSynchronized(ByteBufCodecs.BOOL)
   );

   /** Formula Y / Compound Z brewing step: 0 empty bottle, 1 water, 2+ ingredients added (unstable). */
   public static final DataComponentType<Integer> BREWING_PROGRESS = register("brewing_progress", b -> b.persistent(Codec.INT).networkSynchronized(ByteBufCodecs.VAR_INT));

   private static <T> DataComponentType<T> register(String name, UnaryOperator<DataComponentType.Builder<T>> builder) {
      return Registry.register(
         BuiltInRegistries.DATA_COMPONENT_TYPE, Identifier.fromNamespaceAndPath("mutantmore", name), builder.apply(DataComponentType.builder()).build()
      );
   }

   public static void init() {
   }
}
