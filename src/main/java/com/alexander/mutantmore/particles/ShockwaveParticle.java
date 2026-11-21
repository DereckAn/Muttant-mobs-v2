package com.alexander.mutantmore.particles;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;

public class ShockwaveParticle extends SingleQuadParticle {
   private final SpriteSet sprites;

   protected ShockwaveParticle(ClientLevel level, double x, double y, double z, SpriteSet sprites, double xd, double yd, double zd) {
      super(level, x, y, z, xd, yd, zd, sprites.first());
      this.sprites = sprites;
      this.friction = 1.0F;
      this.xd = xd;
      this.yd = yd;
      this.zd = zd;
      this.quadSize = 10.0F;
      this.lifetime = 20;
      this.setSpriteFromAge(sprites);
   }

   @Override
   public void tick() {
      super.tick();
      this.alpha = -(1.0F / this.lifetime) * this.age + 1.0F;
      this.setSpriteFromAge(this.sprites);
   }

   @Override
   public int getLightCoords(float partialTick) {
      return 15728880;
   }

   @Override
   protected SingleQuadParticle.Layer getLayer() {
      return SingleQuadParticle.Layer.TRANSLUCENT;
   }

   public static class Provider implements ParticleProvider<SimpleParticleType> {
      private final SpriteSet sprites;

      public Provider(SpriteSet sprites) {
         this.sprites = sprites;
      }

      @Override
      public Particle createParticle(SimpleParticleType type, ClientLevel level, double x, double y, double z, double dx, double dy, double dz, RandomSource random) {
         return new ShockwaveParticle(level, x, y, z, this.sprites, dx, dy, dz);
      }
   }
}
