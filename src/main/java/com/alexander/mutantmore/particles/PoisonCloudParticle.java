package com.alexander.mutantmore.particles;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;

public class PoisonCloudParticle extends SingleQuadParticle {
   private final SpriteSet sprites;
   private final float rotation;
   private final float scale;

   protected PoisonCloudParticle(ClientLevel level, double x, double y, double z, SpriteSet sprites, double xd, double yd, double zd) {
      super(level, x, y, z, xd, yd, zd, sprites.first());
      this.sprites = sprites;
      this.xd += xd;
      this.yd += yd;
      this.zd += zd;
      this.rotation = this.random.nextFloat() * 360.0F;
      this.quadSize = 0.0F;
      this.scale = 0.5F + this.random.nextFloat() * 1.5F;
      this.lifetime = 20 + this.random.nextInt(40);
      this.setSpriteFromAge(sprites);
   }

   @Override
   public void tick() {
      super.tick();
      this.xd *= 0.95F;
      this.yd *= 0.95F;
      this.zd *= 0.95F;
      this.roll = this.rotation;
      this.oRoll = this.rotation;
      if (this.quadSize < this.scale) {
         this.quadSize = Mth.clamp(this.quadSize + 0.2F, 0.0F, this.scale);
      }

      this.setSpriteFromAge(this.sprites);
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
         return new PoisonCloudParticle(level, x, y, z, this.sprites, dx, dy, dz);
      }
   }
}
