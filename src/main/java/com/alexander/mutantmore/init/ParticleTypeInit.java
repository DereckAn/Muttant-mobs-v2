package com.alexander.mutantmore.init;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class ParticleTypeInit {
   public static final SimpleParticleType SHOCKWAVE = simple("shockwave");
   public static final SimpleParticleType POISON_CLOUD = simple("poison_cloud");

   private static SimpleParticleType simple(String name) {
      return Registry.register(BuiltInRegistries.PARTICLE_TYPE, Identifier.fromNamespaceAndPath("mutantmore", name), FabricParticleTypes.simple(false));
   }

   public static void init() {
   }
}
