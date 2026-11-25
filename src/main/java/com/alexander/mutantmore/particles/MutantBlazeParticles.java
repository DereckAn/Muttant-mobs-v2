package com.alexander.mutantmore.particles;

import com.alexander.mutantmore.entities.Rodling;
import com.alexander.mutantmore.util.PositionUtils;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.particle.SpriteSet;
import com.alexander.mutantmore.init.ParticleTypeInit;
import java.util.List;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.ARGB;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

/** Mutant Blaze particles: broken shield shards, fire trail, and the charge-shot orb (Blaze and Rodling). */
public final class MutantBlazeParticles {
   private MutantBlazeParticles() {
   }

   /** Falling shield shard (BROKEN_MUTANT_BLAZE_SHIELD). */
   public static class Shard extends SingleQuadParticle {
      Shard(ClientLevel level, double x, double y, double z, SpriteSet sprites, double xd, double yd, double zd) {
         super(level, x, y, z, xd, yd, zd, sprites.get(level.getRandom()));
         this.xd = xd - 0.1 + this.random.nextFloat() * 0.2;
         this.yd = yd + this.random.nextFloat() * 0.25;
         this.zd = zd - 0.1 + this.random.nextFloat() * 0.2;
         this.quadSize *= 1.25F;
         this.lifetime = 20 + this.random.nextInt(20);
         this.hasPhysics = true;
         this.gravity = 1.0F;
      }

      @Override
      protected SingleQuadParticle.Layer getLayer() {
         return SingleQuadParticle.Layer.TRANSLUCENT;
      }

      public record Provider(SpriteSet sprites) implements ParticleProvider<SimpleParticleType> {
         @Override
         public Particle createParticle(SimpleParticleType type, ClientLevel level, double x, double y, double z, double dx, double dy, double dz, RandomSource random) {
            return new Shard(level, x, y, z, this.sprites, dx, dy, dz);
         }
      }
   }

   /** Full-bright animated flame left behind fireballs (FIRE_TRAIL). */
   public static class FireTrail extends SingleQuadParticle {
      private final SpriteSet sprites;

      FireTrail(ClientLevel level, double x, double y, double z, SpriteSet sprites, double xd, double yd, double zd) {
         super(level, x, y, z, xd, yd, zd, sprites.first());
         this.sprites = sprites;
         this.friction = 0.8F;
         this.xd = xd;
         this.yd = yd;
         this.zd = zd;
         this.lifetime = 10 + this.random.nextInt(10);
         this.setSpriteFromAge(sprites);
      }

      @Override
      public void tick() {
         super.tick();
         this.setSpriteFromAge(this.sprites);
      }

      @Override
      public int getLightCoords(float partialTick) {
         return 240;
      }

      @Override
      protected SingleQuadParticle.Layer getLayer() {
         return SingleQuadParticle.Layer.TRANSLUCENT;
      }

      public record Provider(SpriteSet sprites) implements ParticleProvider<SimpleParticleType> {
         @Override
         public Particle createParticle(SimpleParticleType type, ClientLevel level, double x, double y, double z, double dx, double dy, double dz, RandomSource random) {
            return new FireTrail(level, x, y, z, this.sprites, dx, dy, dz);
         }
      }
   }

   /**
    * Shrinking orb glued to an entity offset (values: entity id, x, y, z offset) while a shot charges, sucking in sparkles.
    */
   public static class ChargeShot extends SingleQuadParticle {
      private static final int[] COLOURS = {16775239, 16560663, 13727744};
      private static final int[] SOUL_COLOURS = {9304059, 2088676, 90726};
      private final int followedEntityId;
      private final double offsetX;
      private final double offsetY;
      private final double offsetZ;
      private final boolean rodling;
      private Vec3 targetPos;

      ChargeShot(ClientLevel level, double x, double y, double z, SpriteSet sprites, double xd, double yd, double zd, AdvancedParticleOption options, boolean rodling) {
         super(level, x, y, z, xd, yd, zd, sprites.get(level.getRandom()));
         this.followedEntityId = (int)options.value(0);
         this.offsetX = options.value(1);
         this.offsetY = options.value(2);
         this.offsetZ = options.value(3);
         this.rodling = rodling;
         this.friction = 1.0F;
         this.xd = xd;
         this.yd = yd;
         this.zd = zd;
         this.quadSize = rodling ? 0.75F : 6.0F;
         this.lifetime = 500;
         this.alpha = 0.0F;
         if (!rodling) {
            this.setColor(0.7137255F, 0.28235295F, 0.0F);
         }

         this.targetPos = new Vec3(x, y, z);
      }

      @Override
      public void tick() {
         super.tick();
         this.setPos(this.targetPos.x, this.targetPos.y, this.targetPos.z);
         Entity entity = this.followedEntityId != 0 ? this.level.getEntity(this.followedEntityId) : null;
         int[] palette = COLOURS;
         Integer dyeColour = null;
         if (entity != null) {
            if (entity instanceof Rodling rodling) {
               boolean soul = rodling.isSoul();
               palette = soul ? SOUL_COLOURS : COLOURS;
               if (rodling.getColor() != null) {
                  int c = rodling.getColor().getTextureDiffuseColor();
                  dyeColour = c & 0xFFFFFF;
                  this.setColor(ARGB.redFloat(c), ARGB.greenFloat(c), ARGB.blueFloat(c));
               } else if (soul) {
                  this.setColor(0.0F, 0.75686276F, 1.0F);
               } else {
                  this.setColor(0.7137255F, 0.28235295F, 0.0F);
               }
            }

            float rotation = entity instanceof LivingEntity living ? living.yBodyRot : entity.getYRot();
            this.targetPos = PositionUtils.getOffsetPos(entity, this.offsetX, this.offsetY, this.offsetZ, 0.0F, rotation);
         }

         float range = this.rodling ? 0.5F : 4.0F;
         if (this.quadSize > (this.rodling ? 0.25F : 2.0F) && (!this.rodling || entity != null)) {
            for (int i = 0; i < (this.rodling ? 1 : 10); i++) {
               int colour = dyeColour != null ? dyeColour : palette[this.random.nextInt(palette.length)];
               this.level.addParticle(
                  new AdvancedParticleOption(
                     ParticleTypeInit.ABSORB,
                     List.of(
                        1.0F, (float)colour, this.rodling ? 0.05F : 0.2F, 5.0F,
                        (float)(this.x + this.random.nextGaussian() * range), (float)(this.y + this.random.nextGaussian() * range), (float)(this.z + this.random.nextGaussian() * range)
                     )
                  ),
                  this.x, this.y, this.z, 0.0, 0.0, 0.0
               );
            }
         }

         this.quadSize -= this.rodling ? 0.075F : 0.25F;
         if (this.quadSize <= 0.0F) {
            this.remove();
         }

         if (this.rodling) {
            this.alpha = Math.min(1.0F, this.alpha + 0.25F);
         } else if (this.age > 2) {
            this.alpha = 1.0F;
         }
      }

      @Override
      public int getLightCoords(float partialTick) {
         return 240;
      }

      @Override
      protected SingleQuadParticle.Layer getLayer() {
         return SingleQuadParticle.Layer.TRANSLUCENT;
      }

      public record Provider(SpriteSet sprites, boolean rodling) implements ParticleProvider<AdvancedParticleOption> {
         @Override
         public Particle createParticle(AdvancedParticleOption options, ClientLevel level, double x, double y, double z, double dx, double dy, double dz, RandomSource random) {
            return new ChargeShot(level, x, y, z, this.sprites, dx, dy, dz, options, this.rodling);
         }
      }
   }
}
