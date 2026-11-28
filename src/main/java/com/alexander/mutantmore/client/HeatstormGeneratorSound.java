package com.alexander.mutantmore.client;

import com.alexander.mutantmore.blockentities.HeatstormGeneratorBlockEntity;
import com.alexander.mutantmore.init.SoundEventInit;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.sounds.SoundSource;

/** Heatstorm Generator hum: fades in while powered, fades out when not, ends with the block. */
public class HeatstormGeneratorSound extends AbstractTickableSoundInstance {
   private final HeatstormGeneratorBlockEntity generator;

   public HeatstormGeneratorSound(HeatstormGeneratorBlockEntity generator) {
      super(SoundEventInit.MUTANT_BLAZE_LOOP, SoundSource.BLOCKS, SoundInstance.createUnseededRandom());
      this.generator = generator;
      this.x = generator.getBlockPos().getX();
      this.y = generator.getBlockPos().getY();
      this.z = generator.getBlockPos().getZ();
      this.looping = true;
      this.delay = 0;
      this.volume = 0.0F;
      this.pitch = 0.0F;
   }

   @Override
   public boolean canStartSilent() {
      return true;
   }

   @Override
   public void tick() {
      if (this.generator.isRemoved()) {
         this.stop();
         return;
      }

      if (this.generator.shouldHeat()) {
         this.pitch = Math.min(1.0F, this.pitch + 0.025F);
         this.volume = Math.min(2.0F, this.pitch + 0.05F);
      } else {
         this.pitch = Math.max(0.0F, this.pitch - 0.025F);
         this.volume = Math.max(0.0F, this.volume - 0.05F);
      }
   }
}
