package com.alexander.mutantmore.particles;

import com.alexander.mutantmore.entities.MutationCloud;
import com.alexander.mutantmore.util.PositionUtils;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

/** Particles of a Mutation Cloud: rising sparks (MUTATION) and the dark swirl pulled into the mob (MUTATION_SWIRL). */
public final class MutationParticles {
   private MutationParticles() {
   }

   /** Full-bright spark fading from white to the given colour (values: r, g, b). */
   public static class Spark extends SingleQuadParticle {
      private final SpriteSet sprites;
      private final float targetR;
      private final float targetG;
      private final float targetB;

      Spark(ClientLevel level, double x, double y, double z, SpriteSet sprites, double xd, double yd, double zd, AdvancedParticleOption options) {
         super(level, x, y, z, xd, yd, zd, sprites.first());
         this.sprites = sprites;
         this.targetR = options.value(0);
         this.targetG = options.value(1);
         this.targetB = options.value(2);
         this.xd = xd;
         this.yd = yd;
         this.zd = zd;
         this.lifetime = 20;
         this.quadSize *= 2.5F;
         this.setSpriteFromAge(sprites);
      }

      @Override
      public void tick() {
         super.tick();
         float t = (float)this.age / this.lifetime;
         this.setColor(Mth.lerp(t, 1.0F, this.targetR), Mth.lerp(t, 1.0F, this.targetG), Mth.lerp(t, 1.0F, this.targetB));
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

      public record Provider(SpriteSet sprites) implements ParticleProvider<AdvancedParticleOption> {
         @Override
         public Particle createParticle(AdvancedParticleOption options, ClientLevel level, double x, double y, double z, double dx, double dy, double dz, RandomSource random) {
            return new Spark(level, x, y, z, this.sprites, dx, dy, dz, options);
         }
      }
   }

   /** Orbits the cloud (value 0: its entity id, value 1: height offset), spiralling in; scatters when the cloud is gone. */
   public static class Swirl extends SingleQuadParticle {
      private final SpriteSet sprites;
      private final int cloudId;
      private final double offsetY;
      private final float turnSpeed;
      private float initialSpeed;
      private float speed;
      private float distance;
      private float rotation;
      private double yPosition;
      private Vec3 targetPos;
      private boolean exploded;
      private @Nullable Vec3 finishMotion;
      private boolean startedWithNoProgress;

      Swirl(ClientLevel level, double x, double y, double z, SpriteSet sprites, AdvancedParticleOption options) {
         super(level, x, y, z, 0.0, 0.0, 0.0, sprites.first());
         this.sprites = sprites;
         this.cloudId = (int)options.value(0);
         this.offsetY = options.value(1);
         MutationCloud cloud = this.cloud();
         float progress = cloud != null ? cloud.getMutationProgress() : 0.0F;
         this.initialSpeed = 0.25F + this.random.nextFloat() * 2.0F;
         if (progress > 0.01F) {
            this.distance = 5.0F + this.random.nextFloat() * progress * 15.0F;
         } else {
            this.startedWithNoProgress = true;
            this.distance = 5.0F;
            this.initialSpeed = 10.0F;
         }

         this.speed = this.initialSpeed;
         this.rotation = this.random.nextFloat() * 360.0F;
         this.quadSize = 0.0F;
         this.lifetime = 20;
         this.yPosition = this.random.nextGaussian() * (progress > 0.01F ? 3 : 2);
         this.turnSpeed = (float)(this.random.nextGaussian() * 0.1);
         this.hasPhysics = false;
         this.setColor(0.0F, 0.0F, 0.0F);
         this.alpha = 0.0F;
         this.targetPos = new Vec3(x, y, z);
         this.setSpriteFromAge(sprites);
      }

      private @Nullable MutationCloud cloud() {
         return this.level.getEntity(this.cloudId) instanceof MutationCloud cloud ? cloud : null;
      }

      private float closeness(MutationCloud cloud) {
         float p = cloud.getMutationProgress();
         return Mth.clamp((p * 10.0F - this.distance) / (p * 10.0F), 0.0F, 1.0F);
      }

      @Override
      public void tick() {
         super.tick();
         MutationCloud cloud = this.cloud();
         if (cloud != null) {
            float progress = cloud.getMutationProgress();
            boolean mutating = progress > 0.01F && !this.startedWithNoProgress;
            this.targetPos = cloud.position();
            if (!this.startedWithNoProgress) {
               this.speed = this.initialSpeed * (1.0F + progress * 15.0F);
            }

            Vec3 pos = PositionUtils.getOffsetPos(this.targetPos, 0.0, this.offsetY + this.yPosition, this.distance, 0.0F, this.rotation);
            this.setPos(pos.x, pos.y, pos.z);
            this.rotation += this.speed;
            this.distance -= mutating ? 0.4F : 0.15F;
            this.yPosition = Mth.lerp(0.05, this.yPosition, 0.0);
            this.roll += this.turnSpeed;
            this.oRoll = this.roll;
            if (mutating) {
               float c = this.closeness(cloud);
               MutationCloud.Colour colour = cloud.mutationColour();
               this.setColor(c * progress * colour.r(), c * progress * colour.g(), c * progress * colour.b());
            }

            if (this.age > 2) {
               this.alpha = 0.5F;
            }

            this.quadSize = Math.min(this.quadSize + 0.1F, mutating ? 1.0F : 0.5F);
            this.finishMotion = new Vec3(this.x - this.xo, this.y - this.yo, this.z - this.zo);
         } else if (!this.exploded) {
            if (this.finishMotion == null) {
               this.remove();
            } else {
               this.xd = (this.x - this.targetPos.x) / 3.0 + this.finishMotion.x;
               this.zd = (this.z - this.targetPos.z) / 3.0 + this.finishMotion.z;
               this.exploded = true;
            }
         } else {
            this.quadSize -= 0.1F;
            if (this.quadSize < 0.0F) {
               this.remove();
            }
         }

         this.setSpriteFromAge(this.sprites);
         if (this.distance <= 0.0F) {
            this.remove();
         }
      }

      @Override
      public int getLightCoords(float partialTick) {
         MutationCloud cloud = this.cloud();
         int base = super.getLightCoords(partialTick);
         return cloud != null && !this.startedWithNoProgress
            ? (int)Mth.clamp(Mth.lerp(this.closeness(cloud), base, cloud.getMutationProgress() * 255.0F), 0.0F, 255.0F)
            : base;
      }

      @Override
      protected SingleQuadParticle.Layer getLayer() {
         return SingleQuadParticle.Layer.TRANSLUCENT;
      }

      public record Provider(SpriteSet sprites) implements ParticleProvider<AdvancedParticleOption> {
         @Override
         public Particle createParticle(AdvancedParticleOption options, ClientLevel level, double x, double y, double z, double dx, double dy, double dz, RandomSource random) {
            return new Swirl(level, x, y, z, this.sprites, options);
         }
      }
   }
}
