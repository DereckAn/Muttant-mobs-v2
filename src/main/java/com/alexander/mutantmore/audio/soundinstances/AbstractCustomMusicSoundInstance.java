package com.alexander.mutantmore.audio.soundinstances;

import com.alexander.mutantmore.util.MiscUtils;
import java.util.function.BooleanSupplier;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;

public class AbstractCustomMusicSoundInstance extends AbstractTickableSoundInstance {
   public float fadeSpeed;
   public float targetVolume;
   public BooleanSupplier shouldPlay;
   public BooleanSupplier shouldPause;
   public static final float MIN_VOLUME = Float.MIN_VALUE;

   public AbstractCustomMusicSoundInstance(
      float fadeSpeed,
      float startVolume,
      float targetVolume,
      boolean looping,
      SoundEvent sound,
      SoundSource source,
      BooleanSupplier shouldPlay,
      BooleanSupplier shouldPause
   ) {
      super(sound, source, RandomSource.create());
      this.fadeSpeed = fadeSpeed;
      this.looping = looping;
      this.targetVolume = targetVolume;
      this.volume = startVolume;
      this.shouldPlay = shouldPlay;
      this.shouldPause = shouldPause;
   }

   public boolean shouldPlay() {
      return this.shouldPlay.getAsBoolean();
   }

   public boolean shouldPause() {
      return this.shouldPause.getAsBoolean();
   }

   public void tick() {
      if (!this.shouldPlay()) {
         this.volume = MiscUtils.linearTransition(this.fadeSpeed, this.volume, 0.0F);
         if (this.volume <= 0.0F) {
            this.stop();
         }
      } else if (this.shouldPause()) {
         this.volume = MiscUtils.linearTransition(this.fadeSpeed, this.volume, Float.MIN_VALUE);
      } else {
         this.volume = MiscUtils.linearTransition(this.fadeSpeed, this.volume, this.targetVolume);
      }
   }
}
