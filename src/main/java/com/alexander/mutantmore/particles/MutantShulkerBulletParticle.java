package com.alexander.mutantmore.particles;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;

/** Full-bright bullet trail (MUTANT_SHULKER_BULLET) and the slower healing sparkle (MUTANT_SHULKER_HEAL). */
public class MutantShulkerBulletParticle extends SingleQuadParticle {
   private final SpriteSet sprites;
   private final boolean heal;

   protected MutantShulkerBulletParticle(ClientLevel level, double x, double y, double z, SpriteSet sprites, double xd, double yd, double zd, boolean heal) {
      super(level, x, y, z, heal ? 0.0 : xd, heal ? 0.0 : yd, heal ? 0.0 : zd, sprites.first());
      this.sprites = sprites;
      this.heal = heal;
      if (heal) {
         this.speedUpWhenYMotionIsBlocked = true;
         this.friction = 0.86F;
         this.xd *= 0.01F;
         this.yd *= 0.01F;
         this.zd *= 0.01F;
         this.hasPhysics = false;
         this.lifetime = 10 + this.random.nextInt(20);
      } else {
         this.friction = 0.8F;
         this.xd = xd;
         this.yd = yd;
         this.zd = zd;
         this.lifetime = 10;
      }

      this.quadSize *= 2.5F;
      this.setSpriteFromAge(sprites);
   }

   @Override
   public int getLightCoords(float partialTick) {
      return this.heal ? super.getLightCoords(partialTick) : 240;
   }

   @Override
   public float getQuadSize(float partialTick) {
      return this.heal ? this.quadSize * Mth.clamp((this.age + partialTick) / this.lifetime * 32.0F, 0.0F, 1.0F) : super.getQuadSize(partialTick);
   }

   @Override
   public void tick() {
      super.tick();
      this.setSpriteFromAge(this.sprites);
   }

   @Override
   protected SingleQuadParticle.Layer getLayer() {
      return SingleQuadParticle.Layer.TRANSLUCENT;
   }

   public record Provider(SpriteSet sprites, boolean heal) implements ParticleProvider<SimpleParticleType> {
      public Provider(SpriteSet sprites) {
         this(sprites, false);
      }

      @Override
      public Particle createParticle(SimpleParticleType type, ClientLevel level, double x, double y, double z, double dx, double dy, double dz, RandomSource random) {
         return new MutantShulkerBulletParticle(level, x, y, z, this.sprites, dx, dy, dz, this.heal);
      }
   }
}
