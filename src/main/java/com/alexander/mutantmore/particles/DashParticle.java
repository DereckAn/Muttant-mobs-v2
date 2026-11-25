package com.alexander.mutantmore.particles;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;

/** Speed lines in front of a Hoglance charge. */
public class DashParticle extends SingleQuadParticle {
   protected DashParticle(ClientLevel level, double x, double y, double z, SpriteSet sprites, double xd, double yd, double zd) {
      super(level, x, y, z, xd, yd, zd, sprites.get(level.getRandom()));
      this.xd += xd;
      this.yd += yd;
      this.zd += zd;
      this.quadSize *= 1.5F;
      this.lifetime = 10;
      this.hasPhysics = true;
   }

   @Override
   protected SingleQuadParticle.Layer getLayer() {
      return SingleQuadParticle.Layer.TRANSLUCENT;
   }

   public record Provider(SpriteSet sprites) implements ParticleProvider<SimpleParticleType> {
      @Override
      public Particle createParticle(SimpleParticleType type, ClientLevel level, double x, double y, double z, double dx, double dy, double dz, RandomSource random) {
         return new DashParticle(level, x, y, z, this.sprites, dx, dy, dz);
      }
   }
}
