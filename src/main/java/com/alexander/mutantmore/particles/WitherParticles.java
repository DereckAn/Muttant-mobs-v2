package com.alexander.mutantmore.particles;

import com.alexander.mutantmore.init.ParticleTypeInit;
import java.util.List;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.ARGB;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;

/** Mutant Wither Skeleton particles plus two shared ones (ABSORB sparkles, GROUND_TRAIL decals). */
public final class WitherParticles {
   private WitherParticles() {
   }

   private static void colour(SingleQuadParticle particle, float rgb) {
      int c = (int)rgb;
      particle.setColor(ARGB.redFloat(c), ARGB.greenFloat(c), ARGB.blueFloat(c));
   }

   /** Pixel flying from (v4,v5,v6) into the spawn point. Values: glow, colour, size, lifetime, startX, startY, startZ. */
   public static class Absorb extends SingleQuadParticle {
      private final boolean glow;
      private final Vec3 start;
      private final Vec3 target;

      Absorb(ClientLevel level, double x, double y, double z, SpriteSet sprites, AdvancedParticleOption options) {
         super(level, x, y, z, 0.0, 0.0, 0.0, sprites.get(level.getRandom()));
         this.glow = options.value(0) > 0.0F;
         colour(this, options.value(1));
         this.friction = 1.0F;
         this.quadSize = options.value(2);
         this.lifetime = (int)options.value(3);
         this.alpha = 0.0F;
         this.target = new Vec3(x, y, z);
         this.start = new Vec3(options.value(4), options.value(5), options.value(6));
         this.setPos(this.start.x, this.start.y, this.start.z);
         this.xo = this.start.x;
         this.yo = this.start.y;
         this.zo = this.start.z;
      }

      @Override
      public void tick() {
         super.tick();
         float t = (float)this.age / this.lifetime;
         this.setPos(Mth.lerp(t, this.start.x, this.target.x), Mth.lerp(t, this.start.y, this.target.y), Mth.lerp(t, this.start.z, this.target.z));
         if (this.age > 2) {
            this.alpha = 1.0F;
         }
      }

      @Override
      public int getLightCoords(float partialTick) {
         return this.glow ? 240 : super.getLightCoords(partialTick);
      }

      @Override
      protected SingleQuadParticle.Layer getLayer() {
         return SingleQuadParticle.Layer.TRANSLUCENT;
      }

      public record Provider(SpriteSet sprites) implements ParticleProvider<AdvancedParticleOption> {
         @Override
         public Particle createParticle(AdvancedParticleOption options, ClientLevel level, double x, double y, double z, double dx, double dy, double dz, RandomSource random) {
            return new Absorb(level, x, y, z, this.sprites, options);
         }
      }
   }

   /** Flat decal lying on the ground. Values: size, glow, colour, roll (degrees), lifetime, fades out, random sprite. */
   public static class GroundTrail extends SingleQuadParticle {
      private final SpriteSet sprites;
      private final boolean glows;
      private final boolean fadesOut;
      private final boolean randomSprite;

      GroundTrail(ClientLevel level, double x, double y, double z, SpriteSet sprites, double xd, double yd, double zd, AdvancedParticleOption options) {
         super(level, x, y, z, 0.0, 0.0, 0.0, sprites.first());
         this.sprites = sprites;
         this.xd = xd;
         this.yd = yd;
         this.zd = zd;
         this.quadSize = options.value(0);
         this.glows = options.value(1) > 0.0F;
         colour(this, options.value(2));
         this.roll = options.value(3) * (float)(Math.PI / 180.0);
         this.oRoll = this.roll;
         this.lifetime = (int)options.value(4);
         this.fadesOut = options.value(5) > 0.0F;
         this.randomSprite = options.value(6) > 0.0F;
         if (this.randomSprite) {
            this.setSprite(sprites.get(level.getRandom()));
         } else {
            this.setSpriteFromAge(sprites);
         }
      }

      @Override
      public SingleQuadParticle.FacingCameraMode getFacingCameraMode() {
         return (target, camera, partialTick) -> target.rotationX((float)(Math.PI / 2));
      }

      @Override
      public void tick() {
         super.tick();
         if (this.fadesOut) {
            this.alpha = 1.0F - (float)this.age / this.lifetime;
         }

         if (!this.randomSprite) {
            this.setSpriteFromAge(this.sprites);
         }
      }

      @Override
      public int getLightCoords(float partialTick) {
         return this.glows ? 240 : super.getLightCoords(partialTick);
      }

      @Override
      protected SingleQuadParticle.Layer getLayer() {
         return SingleQuadParticle.Layer.TRANSLUCENT;
      }

      public record Provider(SpriteSet sprites) implements ParticleProvider<AdvancedParticleOption> {
         @Override
         public Particle createParticle(AdvancedParticleOption options, ClientLevel level, double x, double y, double z, double dx, double dy, double dz, RandomSource random) {
            return new GroundTrail(level, x, y, z, this.sprites, dx, dy, dz, options);
         }
      }
   }

   /** Life-drain orb flying from the victim to the healed mob (value 0: that mob's id), shedding red sparkles. */
   public static class Leech extends SingleQuadParticle {
      private static final int[] COLOURS = {13838890, 10361370, 7751767, 5912384};
      private final SpriteSet sprites;
      private final Vec3 start;
      private final Entity target;

      Leech(ClientLevel level, double x, double y, double z, SpriteSet sprites, AdvancedParticleOption options) {
         super(level, x, y, z, 0.0, 0.0, 0.0, sprites.first());
         this.sprites = sprites;
         this.quadSize = 1.0F;
         this.hasPhysics = false;
         this.lifetime = 20;
         this.setSpriteFromAge(sprites);
         this.start = new Vec3(x, y, z);
         this.target = options.value(0) == 0.0F ? null : level.getEntity((int)options.value(0));
      }

      @Override
      public void tick() {
         super.tick();
         if (this.target == null) {
            this.remove();
            return;
         }

         float t = (float)this.age / this.lifetime;
         this.quadSize = 1.0F - t;
         this.setPos(Mth.lerp(t, this.start.x, this.target.getX()), Mth.lerp(t, this.start.y, this.target.getY(0.75)), Mth.lerp(t, this.start.z, this.target.getZ()));
         float range = this.quadSize + 0.5F;
         this.level.addParticle(
            new AdvancedParticleOption(
               ParticleTypeInit.ABSORB,
               List.of(
                  0.0F, (float)COLOURS[this.random.nextInt(COLOURS.length)], 0.05F, 20.0F,
                  (float)(this.x + this.random.nextGaussian() * range), (float)(this.y + this.random.nextGaussian() * range), (float)(this.z + this.random.nextGaussian() * range)
               )
            ),
            this.target.getX(), this.target.getY(0.75), this.target.getZ(), 0.0, 0.0, 0.0
         );
         this.setSpriteFromAge(this.sprites);
      }

      @Override
      protected SingleQuadParticle.Layer getLayer() {
         return SingleQuadParticle.Layer.TRANSLUCENT;
      }

      public record Provider(SpriteSet sprites) implements ParticleProvider<AdvancedParticleOption> {
         @Override
         public Particle createParticle(AdvancedParticleOption options, ClientLevel level, double x, double y, double z, double dx, double dy, double dz, RandomSource random) {
            return new Leech(level, x, y, z, this.sprites, options);
         }
      }
   }

   /** Dark grey gas puff from the wither breath. */
   public static class Gas extends SingleQuadParticle {
      private final SpriteSet sprites;

      Gas(ClientLevel level, double x, double y, double z, SpriteSet sprites, double xd, double yd, double zd) {
         super(level, x, y, z, xd, yd, zd, sprites.first());
         this.sprites = sprites;
         this.xd = xd;
         this.yd = yd;
         this.zd = zd;
         float c = 0.15F + this.random.nextFloat() * 0.1F;
         this.setColor(c, c, c);
         this.quadSize = 1.0F;
         this.lifetime = 10 + this.random.nextInt(90);
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
      }

      @Override
      protected SingleQuadParticle.Layer getLayer() {
         return SingleQuadParticle.Layer.TRANSLUCENT;
      }

      public record Provider(SpriteSet sprites) implements ParticleProvider<SimpleParticleType> {
         @Override
         public Particle createParticle(SimpleParticleType type, ClientLevel level, double x, double y, double z, double dx, double dy, double dz, RandomSource random) {
            return new Gas(level, x, y, z, this.sprites, dx, dy, dz);
         }
      }
   }
}
