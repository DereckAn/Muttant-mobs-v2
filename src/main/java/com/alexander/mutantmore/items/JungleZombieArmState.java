package com.alexander.mutantmore.items;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import net.minecraft.world.entity.Entity;

/**
 * Per-player Mutant Jungle Zombie Arm state. Replaces the original's "AnimationID" NBT index into a global list.
 * Client and server players are different objects, so one map serves both sides.
 */
public class JungleZombieArmState {
   private static final Map<Entity, JungleZombieArmState> STATES = Collections.synchronizedMap(new WeakHashMap<>());
   // server
   public Entity grabbedEntity;
   public int notUsingFor;
   // both sides
   public int strangleTicks;
   // client visuals
   public int tickCount;
   public int grabStartTick;
   public int grabAnimationTick;
   public int releaseStartTick;
   public int releaseAnimationTick;
   public boolean grabbing;
   public boolean standby;

   public static JungleZombieArmState of(Entity holder) {
      return STATES.computeIfAbsent(holder, h -> new JungleZombieArmState());
   }
}
