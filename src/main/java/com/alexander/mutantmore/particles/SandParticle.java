package com.alexander.mutantmore.particles;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;

/** Sand puffs (SAND) and the big geyser column (SAND_GEYSER); value 0 is the RGB colour (white sand / red sand). */
public class SandParticle extends SingleQuadParticle {
   private final SpriteSet sprites;
   private final boolean geyser;

   protected SandParticle(ClientLevel level, double x, double y, double z, SpriteSet sprites, double xd, double yd, double zd, AdvancedParticleOption options, boolean geyser) {
      super(level, x, y, z, xd, yd, zd, sprites.first());
      this.sprites = sprites;
      this.geyser = geyser;
      int colour = (int)options.value(0);
      this.rCol = (colour >> 16 & 255) / 255.0F;
      this.gCol = (colour >> 8 & 255) / 255.0F;
      this.bCol = (colour & 255) / 255.0F;
      if (geyser) {
         this.xd = xd;
         this.yd = yd;
         this.zd = zd;
         this.quadSize = 3.0F;
         this.lifetime = 20;
      } else {
         this.xd += xd;
         this.yd += yd;
         this.zd += zd;
         this.quadSize *= 1.5F;
         this.lifetime = 10 + this.random.nextInt(30);
      }

      this.hasPhysics = true;
      this.setSpriteFromAge(sprites);
   }

   @Override
   public void tick() {
      super.tick();
      this.xd *= 0.95F;
      this.yd *= 0.75;
      this.zd *= 0.95F;
      this.setSpriteFromAge(this.sprites);
      if (this.geyser && Mth.abs((float)this.yd) < 0.05) {
         this.remove();
      }
   }

   @Override
   protected SingleQuadParticle.Layer getLayer() {
      return SingleQuadParticle.Layer.TRANSLUCENT;
   }

   public record Provider(SpriteSet sprites, boolean geyser) implements ParticleProvider<AdvancedParticleOption> {
      @Override
      public Particle createParticle(AdvancedParticleOption options, ClientLevel level, double x, double y, double z, double dx, double dy, double dz, RandomSource random) {
         return new SandParticle(level, x, y, z, this.sprites, dx, dy, dz, options, this.geyser);
      }
   }
}
