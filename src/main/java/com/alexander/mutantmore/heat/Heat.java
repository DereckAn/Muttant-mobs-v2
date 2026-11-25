package com.alexander.mutantmore.heat;

import com.alexander.mutantmore.config.mutant_blaze.HeatCommonConfig;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.interfaces.IHeatSource;
import com.alexander.mutantmore.particles.AdvancedParticleOption;
import com.alexander.mutantmore.util.MiscUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry;
import net.fabricmc.fabric.api.attachment.v1.AttachmentSyncPredicate;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.minecraft.core.BlockPos;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

/**
 * Heat: builds up near heat sources (Mutant Blaze), cools after a delay (faster in water/rain or when freezing),
 * and burns at full heat. Was a Forge capability plus a sync packet; now a persistent Fabric attachment synced to its own player.
 */
public record Heat(double amount, int coolDelay) {
   public static final Heat NONE = new Heat(0.0, 0);
   public static final Codec<Heat> CODEC = RecordCodecBuilder.create(
      i -> i.group(Codec.DOUBLE.fieldOf("HeatAmount").forGetter(Heat::amount), Codec.INT.fieldOf("CoolDelay").forGetter(Heat::coolDelay)).apply(i, Heat::new)
   );
   public static final StreamCodec<io.netty.buffer.ByteBuf, Heat> STREAM_CODEC = StreamCodec.composite(
      ByteBufCodecs.DOUBLE, Heat::amount, ByteBufCodecs.VAR_INT, Heat::coolDelay, Heat::new
   );
   public static final AttachmentType<Heat> TYPE = AttachmentRegistry.<Heat>builder()
      .persistent(CODEC)
      .syncWith(STREAM_CODEC, AttachmentSyncPredicate.targetOnly())
      .buildAndRegister(Identifier.fromNamespaceAndPath("mutantmore", "heat"));
   private static final RandomSource RANDOM = RandomSource.create();

   public static void init() {
   }

   /** 0..1 */
   public double level() {
      return Mth.clamp(this.amount, 0.0, 1.0);
   }

   public static double of(Entity entity) {
      Heat heat = entity.getAttached(TYPE);
      return heat == null ? 0.0 : heat.level();
   }

   /** Every LivingEntity, every tick (LivingEntityHeatMixin). Mirrors the original HandleEntityHeatEvent. */
   public static void tick(LivingEntity entity) {
      if (entity instanceof IHeatSource source) {
         performHeating(source, entity.blockPosition(), entity.level(), source.heatSpeed());
      }

      if (!(entity.level() instanceof ServerLevel level)) {
         return;
      }

      Heat heat = entity.getAttached(TYPE);
      if (heat == null) {
         return;
      }

      double amount = heat.amount;
      int delay = heat.coolDelay;
      double cool = HeatCommonConfig.cool_down_speed.get();
      if (delay > 0) {
         delay--;
      } else {
         amount -= cool;
      }

      if (amount > 0.0) {
         entity.setTicksFrozen(entity.getTicksFrozen() - 2);
      }

      if (entity.isInWaterOrRain() || entity.isFreezing()) {
         amount -= cool * 2.0;
      }

      if (amount >= 1.0 && entity.isAttackable() && !entity.isInvulnerable() && entity.tickCount % HeatCommonConfig.damage_interval.get() == 0) {
         entity.hurtServer(level, MMDamageTypes.heat(entity.damageSources()), ((Number)HeatCommonConfig.damage.get()).floatValue());
      }

      amount = Mth.clamp(amount, 0.0, 1.0);
      if (amount <= 0.0 && delay <= 0) {
         entity.removeAttached(TYPE);
      } else if (amount != heat.amount || delay != heat.coolDelay) {
         entity.setAttached(TYPE, new Heat(amount, delay));
      }
   }

   public static void performHeating(IHeatSource source, BlockPos pos, Level level, double heatSpeed) {
      if (source.heatRange() <= 0.0) {
         return;
      }

      if (level.isClientSide()) {
         createHeatParticles(source, pos, level);
         return;
      }

      AABB range = source instanceof Entity entity
         ? entity.getBoundingBox().inflate(source.heatRange(), source.heatRangeY(), source.heatRange())
         : new AABB(pos).inflate(source.heatRange(), source.heatRangeY(), source.heatRange());
      for (Entity target : level.getEntities(source instanceof Entity e ? e : null, range)) {
         if (target instanceof LivingEntity living && source.canHeat(living)) {
            Heat heat = living.getAttachedOrElse(TYPE, NONE);
            living.setAttached(TYPE, new Heat(Mth.clamp(heat.amount + heatSpeed, 0.0, 1.0), HeatCommonConfig.cool_down_delay.get()));
         }
      }
   }

   private static void createHeatParticles(IHeatSource source, BlockPos pos, Level level) {
      float heightIncrease = source instanceof Entity entity ? entity.getBbHeight() : 0.0F;
      int sourceId = source instanceof Entity entity ? entity.getId() : 0;
      for (int j = 0; j < 4; j++) {
         for (int i = (int)(-source.heatRangeY()); i < source.heatRangeY() + heightIncrease; i++) {
            if ((i == 0 || RANDOM.nextInt(1 + Math.abs(i) / 2) == 0) && RANDOM.nextBoolean()) {
               level.addAlwaysVisibleParticle(
                  new AdvancedParticleOption(
                     ParticleTypeInit.HEAT,
                     List.of(
                        (float)source.heatRange(),
                        MiscUtils.degToRad(RANDOM.nextFloat() * 360.0F),
                        0.001F + RANDOM.nextFloat() * 0.05F,
                        (float)sourceId,
                        sourceId != 0 ? 1.0F : 0.0F,
                        0.0F,
                        (float)i,
                        0.0F
                     )
                  ),
                  pos.getX(),
                  pos.getY() + i,
                  pos.getZ(),
                  0.0,
                  0.0,
                  0.0
               );
            }
         }
      }
   }
}
