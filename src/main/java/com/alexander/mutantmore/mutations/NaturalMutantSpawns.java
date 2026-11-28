package com.alexander.mutantmore.mutations;

import com.alexander.mutantmore.entities.MutationCloud;
import java.util.Map;
import java.util.WeakHashMap;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Mob;

/** Mutation types with "spawnsNaturally" replace 1 in naturalSpawnChance freshly spawned mobs with their mutant (off for every built-in type). */
public final class NaturalMutantSpawns {
   private static final Map<Mob, EntitySpawnReason> FRESH = new WeakHashMap<>();

   private NaturalMutantSpawns() {
   }

   public static void markFreshSpawn(Mob mob, EntitySpawnReason reason) {
      if (!mob.level().isClientSide() && reason != EntitySpawnReason.CONVERSION) {
         FRESH.put(mob, reason);
      }
   }

   public static void register() {
      ServerEntityEvents.ENTITY_LOAD.register((entity, level) -> {
         if (entity instanceof Mob mob && FRESH.remove(mob) instanceof EntitySpawnReason reason) {
            MutationType type = MutationTypes.forMob(mob);
            if (type != null && type.spawnsNaturally() && mob.getRandom().nextInt(Math.max(1, type.naturalSpawnChance())) == 0) {
               // convert next tick: the level is still adding the original
               level.getServer().execute(() -> {
                  if (!mob.isRemoved()) {
                     MutationCloud.convert(level, mob, type, reason);
                  }
               });
            }
         }
      });
   }
}
