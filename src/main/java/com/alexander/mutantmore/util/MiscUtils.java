package com.alexander.mutantmore.util;

import org.jspecify.annotations.Nullable;
import net.minecraft.core.particles.ExplosionParticleInfo;
import net.minecraft.util.random.WeightedList;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import com.alexander.mutantmore.interfaces.IHasCustomExplosion;
import net.minecraft.world.entity.EntityTypes;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.BlockInit;
import com.alexander.mutantmore.init.TagInit;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.gamerules.GameRules;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ExplosionDamageCalculator;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion.BlockInteraction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class MiscUtils {
   public static Random random = new Random();
   public static final Predicate<Entity> ALIVE = Entity::isAlive;

   public static <T extends Entity> List<T> getNearbyNonLivingEntities(Class<T> entityClass, Level level, Entity entityNear, AABB boundingBox) {
      return level.getEntitiesOfClass(entityClass, boundingBox, p_186450_ -> true);
   }


   public static boolean isHolding(LivingEntity livingEntity, Item item) {
      return livingEntity.getMainHandItem().getItem() == item || livingEntity.getOffhandItem().getItem() == item;
   }

   public static void disableShield(LivingEntity livingEntity, int ticks) {
      if (livingEntity instanceof Player && livingEntity.isBlocking()) {
         ((Player)livingEntity).getCooldowns().addCooldown(livingEntity.getItemInHand(livingEntity.getUsedItemHand()), ticks);
         livingEntity.stopUsingItem();
         livingEntity.level().broadcastEntityEvent(livingEntity, (byte)30);
      }
   }

   public static boolean isHalloween() {
      LocalDate localdate = LocalDate.now();
      return localdate.get(ChronoField.MONTH_OF_YEAR) == 10 && localdate.get(ChronoField.DAY_OF_MONTH) == 31;
   }

   public static boolean isAprilFools() {
      LocalDate localdate = LocalDate.now();
      return localdate.get(ChronoField.MONTH_OF_YEAR) == 4 && localdate.get(ChronoField.DAY_OF_MONTH) == 1;
   }

   public static boolean isChristmas() {
      LocalDate localdate = LocalDate.now();
      return localdate.get(ChronoField.MONTH_OF_YEAR) == 12 && localdate.get(ChronoField.DAY_OF_MONTH) >= 24 && localdate.get(ChronoField.DAY_OF_MONTH) <= 26;
   }

   public static void spawnWithPumpkinOnHalloween(Mob entity, RandomSource randomsource) {
      if (entity.getItemBySlot(EquipmentSlot.HEAD).isEmpty() && isHalloween() && randomsource.nextFloat() < 0.25F) {
         entity.setItemSlot(EquipmentSlot.HEAD, new ItemStack(randomsource.nextFloat() < 0.1F ? Blocks.JACK_O_LANTERN : Blocks.CARVED_PUMPKIN));
         entity.setDropChance(EquipmentSlot.HEAD, 0.0F);
      }
   }

   public static boolean randomPercent(int chance) {
      int randomInt = random.nextInt(100);
      return randomInt < chance;
   }

   public static float distanceToBlockPos(Entity mob, BlockPos pos) {
      float f = (float)(mob.getX() - pos.getX());
      float f1 = (float)(mob.getY() - pos.getY());
      float f2 = (float)(mob.getZ() - pos.getZ());
      return Mth.sqrt(f * f + f1 * f1 + f2 * f2);
   }

   public static float radToDeg(float rad) {
      return rad * (180.0F / (float)Math.PI);
   }

   public static float degToRad(float deg) {
      return deg * (float) (Math.PI / 180.0);
   }

   public static void awardMutantMoreAdvancement(ServerPlayer player, String location, String criteriaName) {
      AdvancementHolder adv = player.level().getServer().getAdvancements().get(Identifier.fromNamespaceAndPath("mutantmore", location));
      if (adv != null) {
         player.getAdvancements().award(adv, criteriaName);
      }
   }

   public static boolean hasAdvancement(ServerPlayer player, Identifier location) {
      return player.getAdvancements().getOrStartProgress(player.level().getServer().getAdvancements().get(location)).isDone();
   }

   public static boolean canHarmBasedOnTeamAndTag(TagKey<EntityType<?>> tag, Entity entity, Entity target, Entity owner, Predicate<Entity> ownerPredicate) {
      Entity entityForTeam = owner != null ? owner : entity;
      if (owner == null) {
         return true;
      } else if (owner instanceof Mob mob && mob.getTargetUnchecked() != null && mob.getTargetUnchecked() == target) {
         // getTargetUnchecked: since 26.x Mob.getTarget() calls canAttack(), which calls back here (StackOverflowError)
         return true;
      } else if (tag != null && target.is(tag) && entityForTeam.getTeam() == null && target.getTeam() == null) {
         return false;
      } else {
         return entityForTeam.getTeam() != null && target.getTeam() != null && entityForTeam.getTeam().isAlliedTo(target.getTeam())
            ? false
            : owner != null && (ownerPredicate != null && ownerPredicate.test(owner) || ownerPredicate == null);
      }
   }


   public static float randomSoundPitch() {
      return (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F;
   }




   // Sand type strings: "_red_sand" or "" (the original compared them with ==, which only worked thanks to string interning)
   public static int sandColourForSandType(String sandType) {
      return "_red_sand".equals(sandType) ? 12543777 : 16777215;
   }

   public static String sandStringForPos(Level level, BlockPos pos) {
      return level.getBlockState(pos).is(TagInit.Blocks.RED_SAND) ? "_red_sand" : "";
   }

   public static Block quicksandBlockForSandType(String sandType) {
      return "_red_sand".equals(sandType) ? BlockInit.RED_QUICKSAND : BlockInit.QUICKSAND;
   }

   /**
    * The mod's explosion: vanilla blast and block damage, but every entity in range takes a flat entityDamage
    * (only those the exploder may harm, unless friendlyFire). Was a ~330-line Explosion subclass (CustomExplosion);
    * 26.x customises explosions through an ExplosionDamageCalculator instead. Server side only, like the original.
    * ponytail: damageCalculator and damageRelativeToDistance were unused by the original's entity damage; soundSource is now the default.
    */
   public static void customExplosion(
      Level level,
      @Nullable Entity explodingEntity,
      DamageSource damageSource,
      @Nullable ExplosionDamageCalculator damageCalculator,
      double x,
      double y,
      double z,
      float explosionSize,
      boolean createsFire,
      Explosion.BlockInteraction blockInteraction,
      @Nullable SoundEvent explosionSound,
      SoundSource explosionSoundSource,
      ParticleOptions explosionParticle,
      ParticleOptions secondaryExplosionParticle,
      float entityDamage,
      boolean damageRelativeToDistance,
      boolean friendlyFire
   ) {
      if (!(level instanceof ServerLevel serverLevel)) {
         return;
      }

      ExplosionDamageCalculator calculator = new ExplosionDamageCalculator() {
         @Override
         public boolean shouldDamageEntity(Explosion explosion, Entity entity) {
            return entityDamage > 0.0F
               && (friendlyFire || !(explodingEntity instanceof IHasCustomExplosion custom) || custom.canHarmWithExplosion(entity));
         }

         @Override
         public float getEntityDamageAmount(Explosion explosion, Entity entity, float exposure) {
            return entityDamage;
         }
      };
      Level.ExplosionInteraction interaction = blockInteraction == Explosion.BlockInteraction.KEEP ? Level.ExplosionInteraction.NONE : Level.ExplosionInteraction.BLOCK;
      serverLevel.explode(
         explodingEntity,
         damageSource,
         calculator,
         x,
         y,
         z,
         explosionSize,
         createsFire,
         interaction,
         explosionParticle,
         secondaryExplosionParticle,
         EXPLOSION_BLOCK_PARTICLES,
         explosionSound != null ? BuiltInRegistries.SOUND_EVENT.wrapAsHolder(explosionSound) : SoundEvents.GENERIC_EXPLODE
      );
   }

   private static final WeightedList<ExplosionParticleInfo> EXPLOSION_BLOCK_PARTICLES = WeightedList.<ExplosionParticleInfo>builder()
      .add(new ExplosionParticleInfo(ParticleTypes.POOF, 0.5F, 1.0F))
      .add(new ExplosionParticleInfo(ParticleTypes.SMOKE, 1.0F, 1.0F))
      .build();

   /** Client sets this to start a looping sound that follows an entity (was HandleLoopingSoundInstances, client-only). */
   public static java.util.function.BiConsumer<Entity, SoundEvent> loopingSoundHook = (entity, sound) -> {};

   /** Entity type named in a config value; unknown or malformed ids fall back to a zombie. */
   public static EntityType<?> entityTypeOrZombie(String id) {
      Identifier parsed = Identifier.tryParse(id);
      return parsed == null ? EntityTypes.ZOMBIE : BuiltInRegistries.ENTITY_TYPE.getOptional(parsed).orElse(EntityTypes.ZOMBIE);
   }

   /** The old Entity.hurt(): damages on the server, does nothing (returns false) on the client. Safe from code that ticks on both sides. */
   public static boolean hurt(Entity target, DamageSource source, float amount) {
      return target.level() instanceof ServerLevel level && target.hurtServer(level, source, amount);
   }

   public static boolean isMovingOnLand(Entity entity) {
      return entity.onGround() && entity.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6 && !entity.isInWater();
   }



   public static void markBoundingBox(Level level, AABB boundingBox, Block block) {
      for (BlockPos blockpos : BlockPos.betweenClosed(
         Mth.floor(boundingBox.minX),
         Mth.floor(boundingBox.minY),
         Mth.floor(boundingBox.minZ),
         Mth.floor(boundingBox.maxX),
         Mth.floor(boundingBox.maxY),
         Mth.floor(boundingBox.maxZ)
      )) {
         level.setBlockAndUpdate(blockpos, block.defaultBlockState());
      }
   }

   public static float linearTransition(float speed, float startValue, float targetValue) {
      if (startValue == targetValue) {
         return startValue;
      } else if (startValue < targetValue) {
         return startValue + speed > targetValue ? targetValue : startValue + speed;
      } else if (startValue > targetValue) {
         return startValue - speed < targetValue ? targetValue : startValue - speed;
      } else {
         return startValue;
      }
   }

   public static boolean soundMatchesTag(Identifier soundLocation, TagKey<SoundEvent> tag) {
      return BuiltInRegistries.SOUND_EVENT.get(soundLocation).map(holder -> holder.is(tag)).orElse(false);
   }


   public static boolean isEntityAttackable(LivingEntity attacker, LivingEntity target, double distance) {
      return attacker.hasLineOfSight(target) && attacker.distanceTo(target) <= getTargetDistance(attacker, target, distance);
   }

   public static boolean isEntityAttackable(LivingEntity attacker, LivingEntity target, double minDistance, double maxDistance) {
      return attacker.hasLineOfSight(target)
         && attacker.distanceTo(target) <= getTargetDistance(attacker, target, maxDistance)
         && attacker.distanceTo(target) >= getTargetDistance(attacker, target, minDistance);
   }

   public static boolean isEntityAttackableMin(LivingEntity attacker, LivingEntity target, double distance) {
      return attacker.hasLineOfSight(target) && attacker.distanceTo(target) >= getTargetDistance(attacker, target, distance);
   }

   public static double getTargetDistance(LivingEntity attacker, LivingEntity target, double distance) {
      return attacker.getBbWidth() / 2.0F + target.getBbWidth() / 2.0F + distance;
   }

   public static boolean isEntityValid(LivingEntity target) {
      return target != null && !target.isRemoved() && !target.isDeadOrDying();
   }

   public static int randomIntBetween(int min, int max) {
      return max - min <= min ? min : min + random.nextInt(max - min);
   }


   public static boolean isBlockCollidable(Level level, BlockPos pos) {
      return !level.getBlockState(pos).isAir() && !level.getBlockState(pos).getCollisionShape(level, pos).isEmpty();
   }

   public static boolean shouldGrief(LivingEntity entity, int config) {
      if (config == 0) {
         return false;
      } else {
         return config == 1 ? (entity.level() instanceof ServerLevel serverLevel && serverLevel.getGameRules().get(GameRules.MOB_GRIEFING)) : true;
      }
   }

   public static boolean shouldGriefingDropBlocks(boolean config) {
      return config || (Boolean)MutantMoreGroupedOptionsCommonConfig.griefing_drops_blocks_on.get();
   }
}
