package com.alexander.mutantmore.entities;

import com.alexander.mutantmore.init.ParticleTypeInit;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.projectile.arrow.AbstractArrow;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

/**
 * One of the 7 shields orbiting a Mutant Blaze. Was a Forge PartEntity (its own hitbox in the world); Fabric/26.x has no
 * multipart entities, so it is now a plain hitbox the Blaze moves every tick, and MutantBlaze.hurtServer checks whether a
 * hit passed through it (see {@link MutantBlaze#shieldInTheWay}).
 */
public class MutantBlazeShieldPart {
   private static final double WIDTH = 1.21875;
   private static final double HEIGHT = 1.875;
   public final MutantBlaze parentMob;
   public final int partNumber;
   private double x;
   private double y;
   private double z;

   public MutantBlazeShieldPart(MutantBlaze parentMob, int partNumber) {
      this.parentMob = parentMob;
      this.partNumber = partNumber;
   }

   public void setPos(double x, double y, double z) {
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public AABB getBoundingBox() {
      return new AABB(this.x - WIDTH / 2.0, this.y, this.z - WIDTH / 2.0, this.x + WIDTH / 2.0, this.y + HEIGHT, this.z + WIDTH / 2.0);
   }

   public double getRandomX(double scale) {
      return this.x + WIDTH * (2.0 * this.parentMob.getRandom().nextDouble() - 1.0) * scale;
   }

   public double getRandomY() {
      return this.y + HEIGHT * this.parentMob.getRandom().nextDouble();
   }

   public double getRandomZ(double scale) {
      return this.z + WIDTH * (2.0 * this.parentMob.getRandom().nextDouble() - 1.0) * scale;
   }

   public boolean isActive() {
      return !this.parentMob.shieldsInactive() && !this.parentMob.isShieldBroken(this.partNumber);
   }

   /** The shield takes the hit and breaks. Returns true if the hit still goes through (piercing arrows), as the original did. */
   public boolean hurt(ServerLevel level, DamageSource source) {
      for (int i = 0; i < 20; i++) {
         level.sendParticles(ParticleTypeInit.BROKEN_MUTANT_BLAZE_SHIELD, this.getRandomX(0.75), this.getRandomY(), this.getRandomZ(0.75), 1, 0.0, 0.0, 0.0, 0.0);
      }

      this.parentMob.setShieldBroken(this.partNumber, true);
      return source.getDirectEntity() instanceof AbstractArrow arrow && arrow.getPierceLevel() > 0;
   }

   public boolean isHitBy(Vec3 from, Vec3 to) {
      return this.getBoundingBox().inflate(0.1).clip(from, to).isPresent() || this.getBoundingBox().contains(from);
   }
}
