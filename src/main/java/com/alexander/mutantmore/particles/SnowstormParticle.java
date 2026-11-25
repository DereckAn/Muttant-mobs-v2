package com.alexander.mutantmore.particles;

import com.alexander.mutantmore.util.PositionUtils;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

/** A snowflake (or, with heat=true, an ember) circling a centre, optionally following an entity. Values: range, start angle, speed, entity id, follow flag, offset x/y/z. */
public class SnowstormParticle extends SingleQuadParticle {
   private final float rollSpeed;
   private final double circleRange;
   private float circleProgress;
   private final float circleSpeed;
   private final int followedEntityID;
   private final boolean shouldFollowEntity;
   private final double offsetX;
   private final double offsetY;
   private final double offsetZ;
   private Vec3 circleCentrePos;
   private final boolean heat;

   protected SnowstormParticle(ClientLevel level, double x, double y, double z, SpriteSet sprites, AdvancedParticleOption options, boolean heat) {
      super(level, x, y, z, 0.0, 0.0, 0.0, sprites.get(level.getRandom()));
      this.circleRange = options.value(0);
      this.circleProgress = options.value(1);
      this.circleSpeed = options.value(2);
      this.followedEntityID = (int)options.value(3);
      this.shouldFollowEntity = options.value(4) > 0.0F;
      this.offsetX = options.value(5);
      this.offsetY = options.value(6);
      this.offsetZ = options.value(7);
      this.heat = heat;
      this.rollSpeed = this.random.nextFloat() * (heat ? 0.06F : 0.1F);
      this.friction = 0.8F;
      this.quadSize = this.quadSize * (this.random.nextFloat() * 3.0F);
      this.lifetime = heat ? 20 + this.random.nextInt(80) : 30 + this.random.nextInt(100);
      this.alpha = 0.0F;
      this.circleCentrePos = new Vec3(this.x, this.y, this.z);
   }

   @Override
   public void tick() {
      super.tick();
      this.x = this.circleCentrePos.x + this.circleRange * Mth.cos(this.circleProgress);
      this.y = this.circleCentrePos.y;
      this.z = this.circleCentrePos.z + this.circleRange * Mth.sin(this.circleProgress);
      this.setPos(this.x, this.y, this.z);
      this.circleProgress += this.circleSpeed;
      this.oRoll = this.roll;
      this.roll += this.rollSpeed;
      this.alpha = this.age <= 2 ? 0.0F : 1.0F;
      Entity entity = this.followedEntityID != 0 ? this.level.getEntity(this.followedEntityID) : null;
      if (this.shouldFollowEntity && this.followedEntityID != 0 && entity == null) {
         this.remove();
      } else if (entity != null) {
         float rotation = entity instanceof LivingEntity living ? living.yBodyRot : entity.getYRot();
         this.circleCentrePos = PositionUtils.getOffsetPos(entity, this.offsetX, this.offsetY, this.offsetZ, 0.0F, rotation);
      }
   }

   @Override
   public int getLightCoords(float partialTick) {
      return this.heat ? 240 : super.getLightCoords(partialTick);
   }

   @Override
   protected SingleQuadParticle.Layer getLayer() {
      return SingleQuadParticle.Layer.TRANSLUCENT;
   }

   public record Provider(SpriteSet sprites, boolean heat) implements ParticleProvider<AdvancedParticleOption> {
      public Provider(SpriteSet sprites) {
         this(sprites, false);
      }

      @Override
      public Particle createParticle(AdvancedParticleOption options, ClientLevel level, double x, double y, double z, double dx, double dy, double dz, RandomSource random) {
         return new SnowstormParticle(level, x, y, z, this.sprites, options, this.heat);
      }
   }
}
