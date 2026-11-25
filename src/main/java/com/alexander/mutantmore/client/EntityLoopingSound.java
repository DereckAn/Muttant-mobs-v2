package com.alexander.mutantmore.client;

import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;

/** Loops a sound on an entity until it's removed (the original EntityLoopingSoundInstance, minus the unused speed/fade options). */
public class EntityLoopingSound extends AbstractTickableSoundInstance {
   private final Entity entity;

   public EntityLoopingSound(Entity entity, SoundEvent sound, float volume) {
      super(sound, entity.getSoundSource(), SoundInstance.createUnseededRandom());
      this.entity = entity;
      this.looping = true;
      this.delay = 0;
      this.volume = volume;
      this.x = entity.getX();
      this.y = entity.getY();
      this.z = entity.getZ();
   }

   @Override
   public void tick() {
      if (this.entity.isRemoved()) {
         this.stop();
         return;
      }

      this.x = this.entity.getX();
      this.y = this.entity.getY();
      this.z = this.entity.getZ();
   }
}
