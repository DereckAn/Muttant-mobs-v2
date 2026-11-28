package com.alexander.mutantmore.particles;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;

/** Snowflake blown by the Freezing Fan: carried along its speed, slowing and fading out. */
public class MotionSnowstormParticle extends SingleQuadParticle {
   MotionSnowstormParticle(ClientLevel level, double x, double y, double z, SpriteSet sprites, double xd, double yd, double zd) {
      super(level, x, y, z, xd, yd, zd, sprites.get(level.getRandom()));
      this.xd += xd;
      this.yd += yd;
      this.zd += zd;
      this.quadSize *= this.random.nextFloat() * 3.0F;
      this.lifetime = 30 + this.random.nextInt(5);
      this.hasPhysics = false;
   }

   @Override
   public void tick() {
      super.tick();
      this.xd *= 0.95F;
      this.yd *= 0.95F;
      this.zd *= 0.95F;
      this.alpha = 1.0F - (float)this.age / this.lifetime;
   }

   @Override
   protected SingleQuadParticle.Layer getLayer() {
      return SingleQuadParticle.Layer.TRANSLUCENT;
   }

   public record Provider(SpriteSet sprites) implements ParticleProvider<SimpleParticleType> {
      @Override
      public Particle createParticle(SimpleParticleType type, ClientLevel level, double x, double y, double z, double dx, double dy, double dz, RandomSource random) {
         return new MotionSnowstormParticle(level, x, y, z, this.sprites, dx, dy, dz);
      }
   }
}
