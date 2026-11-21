package com.alexander.mutantmore.init;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class ParticleTypeInit {
   public static final SimpleParticleType SHOCKWAVE = Registry.register(
      BuiltInRegistries.PARTICLE_TYPE, Identifier.fromNamespaceAndPath("mutantmore", "shockwave"), FabricParticleTypes.simple(false)
   );

   public static void init() {
   }
}
