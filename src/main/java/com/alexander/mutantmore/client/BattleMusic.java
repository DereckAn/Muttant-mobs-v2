package com.alexander.mutantmore.client;

import com.alexander.mutantmore.audio.music.MutantMoreMusicManager;
import com.alexander.mutantmore.audio.soundinstances.AbstractCustomMusicSoundInstance;
import com.alexander.mutantmore.config.MutantMoreMiscClientConfig;
import com.alexander.mutantmore.entities.AbstractMutant;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

/** Client half of AbstractMutant's battle music (was @OnlyIn(CLIENT) methods on the entity). */
public class BattleMusic {
   public static void tick(AbstractMutant mutant) {
      if (shouldPlay(mutant)) {
         List<AbstractTickableSoundInstance> music = new ArrayList<>();
         for (SoundEvent sound : mutant.getBattleMusicSounds()) {
            music.add(new AbstractCustomMusicSoundInstance(
               0.02F, Float.MIN_VALUE, ((Number)MutantMoreMiscClientConfig.battle_music_volume.get()).floatValue(), true, sound, SoundSource.MASTER,
               () -> shouldPlay(mutant), mutant::shouldPauseBattleMusic
            ));
         }
         MutantMoreMusicManager.startPlayingMusic(music, 2, 0, 0, true);
      }
   }

   public static boolean shouldPlay(AbstractMutant mutant) {
      Player player = Minecraft.getInstance().player;
      Entity target = mutant.level().getEntity(mutant.getTargetedEntityID());
      return player != null
         && !MutantMoreMusicManager.isOverridingMusicBeingPlayed()
         && !mutant.isRemoved()
         && target instanceof Player
         && target.isAlive()
         && (target == player || mutant.distanceTo(player) <= 30.0F);
   }
}
