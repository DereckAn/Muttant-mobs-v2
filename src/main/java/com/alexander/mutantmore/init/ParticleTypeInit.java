package com.alexander.mutantmore.init;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import com.alexander.mutantmore.particles.AdvancedParticleOption;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class ParticleTypeInit {
   public static final SimpleParticleType SHOCKWAVE = simple("shockwave");
   public static final SimpleParticleType POISON_CLOUD = simple("poison_cloud");
   public static final SimpleParticleType DASH = simple("dash");
   public static final SimpleParticleType MUTANT_SHULKER_BULLET = simple("mutant_shulker_bullet");
   public static final SimpleParticleType MUTANT_SHULKER_HEAL = simple("mutant_shulker_heal");

   public static final ParticleType<AdvancedParticleOption> SAND = advanced("sand");
   public static final ParticleType<AdvancedParticleOption> SAND_GEYSER = advanced("sand_geyser");
   public static final ParticleType<AdvancedParticleOption> SNOWSTORM = advanced("snowstorm");

   private static ParticleType<AdvancedParticleOption> advanced(String name) {
      return Registry.register(
         BuiltInRegistries.PARTICLE_TYPE,
         Identifier.fromNamespaceAndPath("mutantmore", name),
         FabricParticleTypes.complex(false, AdvancedParticleOption::codec, AdvancedParticleOption::streamCodec)
      );
   }

   private static SimpleParticleType simple(String name) {
      return Registry.register(BuiltInRegistries.PARTICLE_TYPE, Identifier.fromNamespaceAndPath("mutantmore", name), FabricParticleTypes.simple(false));
   }

   public static void init() {
   }
}
