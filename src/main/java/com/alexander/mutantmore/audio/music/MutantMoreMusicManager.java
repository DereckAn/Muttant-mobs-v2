package com.alexander.mutantmore.audio.music;

import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.util.MiscUtils;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.util.RandomSource;

public class MutantMoreMusicManager {
   public static RandomSource random = RandomSource.create();
   public static List<AbstractTickableSoundInstance> currentMusic = Lists.newArrayList();
   public static int currentPriority = 0;
   public static int currentCooldown = 0;
   public static int timeUntilNext = 0;

   public static void tick(Minecraft minecraft) {
      if (!minecraft.isPaused()) {
         if (timeUntilNext > 0) {
            timeUntilNext--;
         }

         boolean shouldStopPlayingMusic = true;

         for (AbstractTickableSoundInstance sound : currentMusic) {
            if (!sound.isStopped() && Minecraft.getInstance().getSoundManager().isActive(sound)) {
               shouldStopPlayingMusic = false;
               break;
            }
         }

         if (shouldStopPlayingMusic) {
            stopPlayingMusic();
         }
      }
   }

   public static void stopPlayingMusic() {
      timeUntilNext = currentCooldown;
      currentPriority = 0;
      currentCooldown = 0;

      for (AbstractTickableSoundInstance sound : currentMusic) {
         Minecraft.getInstance().getSoundManager().stop(sound);
      }

      currentMusic.clear();
   }

   public static void startPlayingMusic(List<AbstractTickableSoundInstance> music, int priority, int minCooldown, int maxCooldown, boolean ignoreCooldown) {
      if (priority > currentPriority
         && (currentCooldown <= 0 || ignoreCooldown)
         && music != currentMusic
         && !isOverridingMusicBeingPlayed()
         && !isNonOverridableBeingPlayed()) {
         Minecraft.getInstance().getMusicManager().stopPlaying();
         currentMusic = music;
         currentPriority = priority;
         int randomInt = maxCooldown - minCooldown <= 0 ? 0 : random.nextInt(maxCooldown - minCooldown);
         currentCooldown = minCooldown + randomInt;

         for (AbstractTickableSoundInstance sound : currentMusic) {
            Minecraft.getInstance().getSoundManager().play(sound);
         }
      }
   }

   public static boolean isOverridingMusicBeingPlayed() {
      boolean overridingMusicBeingPlayed = false;

      for (SoundInstance sound : Lists.newArrayList(Minecraft.getInstance().getSoundManager().soundEngine.instanceToChannel.keySet())) {
         if (MiscUtils.soundMatchesTag(sound.getIdentifier(), TagInit.SoundEvents.OVERRIDES_BATTLE_MUSIC)) {
            overridingMusicBeingPlayed = true;
            break;
         }
      }

      return overridingMusicBeingPlayed;
   }

   public static boolean isNonOverridableBeingPlayed() {
      boolean nonOverridableMusicBeingPlayed = false;

      for (SoundInstance sound : Lists.newArrayList(Minecraft.getInstance().getSoundManager().soundEngine.instanceToChannel.keySet())) {
         if (MiscUtils.soundMatchesTag(sound.getIdentifier(), TagInit.SoundEvents.BATTLE_MUSIC_CANT_OVERRIDE)) {
            nonOverridableMusicBeingPlayed = true;
            break;
         }
      }

      return nonOverridableMusicBeingPlayed;
   }
}
