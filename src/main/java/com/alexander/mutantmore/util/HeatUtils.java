package com.alexander.mutantmore.util;

import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.interfaces.ISnowstormSource;
import com.alexander.mutantmore.particles.AdvancedParticleOption;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

/**
 * Snowstorms: swirling snow particles plus freezing for mobs in range.
 * ponytail: only the mob half for now; the heat half (Mutant Blaze) and the Snowstorm Generator's slowness/weakness come with those ports.
 */
public final class HeatUtils {
   private static final RandomSource random = RandomSource.create();

   private HeatUtils() {
   }

   public static void performSnowstorm(ISnowstormSource source, BlockPos pos, Level level, int freezeSpeed, int maxFreezing, boolean generator) {
      if (source.snowstormRange() > 0.0) {
         createSnowstormParticles(source, pos, level);
         freezeNearbyMobs(source, pos, level, freezeSpeed, maxFreezing);
         if (generator && !level.isClientSide()) {
            // Snowstorm Generator: whoever is (nearly) fully frozen also gets slowed and weakened
            for (Entity entity : level.getEntities((Entity)null, createSnowstormRange(source, pos))) {
               if (entity instanceof LivingEntity living && source.canFreeze(living) && living.getTicksFrozen() >= maxFreezing - 10
                  && level.getEntitiesOfClass(com.alexander.mutantmore.entities.IceCube.class, living.getBoundingBox()).isEmpty()) {
                  int slowness = com.alexander.mutantmore.config.mutant_frozen_zombie.MutantFrozenZombieRewardsCommonConfig.generator_slowness_length.get();
                  living.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                     net.minecraft.world.effect.MobEffects.SLOWNESS, slowness, com.alexander.mutantmore.config.mutant_frozen_zombie.MutantFrozenZombieRewardsCommonConfig.generator_slowness_level.get()
                  ));
                  living.addEffect(new net.minecraft.world.effect.MobEffectInstance(com.alexander.mutantmore.init.EffectInit.JUMPING_FATIGUE, slowness, 0));
                  living.addEffect(new net.minecraft.world.effect.MobEffectInstance(
                     net.minecraft.world.effect.MobEffects.WEAKNESS,
                     com.alexander.mutantmore.config.mutant_frozen_zombie.MutantFrozenZombieRewardsCommonConfig.generator_weakness_length.get(),
                     com.alexander.mutantmore.config.mutant_frozen_zombie.MutantFrozenZombieRewardsCommonConfig.generator_weakness_level.get()
                  ));
               }
            }
         }
      }
   }

   public static void createSnowstormParticles(ISnowstormSource source, BlockPos pos, Level level) {
      if (!level.isClientSide()) {
         return;
      }

      float heightIncrease = source instanceof Entity entity ? entity.getBbHeight() : 0.0F;
      int sourceId = source instanceof Entity entity ? entity.getId() : 0;
      for (int j = 0; j < 8; j++) {
         for (int i = (int)(-source.snowstormRangeY()); i < source.snowstormRangeY() + heightIncrease; i++) {
            // denser near the source's height, thinning out above and below
            boolean create = i == 0 || random.nextInt(1 + Math.abs(i) / 2) == 0;
            if (create && random.nextBoolean()) {
               level.addAlwaysVisibleParticle(
                  new AdvancedParticleOption(
                     ParticleTypeInit.SNOWSTORM,
                     List.of(
                        (float)source.snowstormRange(),
                        MiscUtils.degToRad(random.nextFloat() * 360.0F),
                        0.001F + random.nextFloat() * 0.05F,
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

   public static void freezeNearbyMobs(ISnowstormSource source, BlockPos pos, Level level, int freezeSpeed, int maxFreezing) {
      if (level.isClientSide()) {
         return;
      }

      for (Entity entity : level.getEntities(source instanceof Entity e ? e : null, createSnowstormRange(source, pos))) {
         if (entity instanceof LivingEntity living && source.canFreeze(living)) {
            living.setIsInPowderSnow(true);
            if (living.getTicksFrozen() <= maxFreezing) {
               living.setTicksFrozen(Mth.clamp(living.getTicksFrozen() + 2 + freezeSpeed, 0, maxFreezing));
            }
         }
      }
   }

   public static AABB createSnowstormRange(ISnowstormSource source, BlockPos pos) {
      return source instanceof Entity entity
         ? entity.getBoundingBox().inflate(source.snowstormRange(), source.snowstormRangeY(), source.snowstormRange())
         : new AABB(pos).inflate(source.snowstormRange(), source.snowstormRangeY(), source.snowstormRange());
   }
}
