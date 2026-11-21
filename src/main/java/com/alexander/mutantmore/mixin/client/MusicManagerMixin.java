package com.alexander.mutantmore.mixin.client;

import com.alexander.mutantmore.audio.music.MutantMoreMusicManager;
import com.alexander.mutantmore.init.TagInit;
import net.minecraft.client.sounds.MusicManager;
import net.minecraft.sounds.Music;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MusicManager.class)
public abstract class MusicManagerMixin {
   // Vanilla music waits while a mutant's battle music plays (unless the track is tagged to override it).
   @Inject(method = "startPlaying", at = @At("HEAD"), cancellable = true)
   private void mutantmore$waitForBattleMusic(Music music, CallbackInfo ci) {
      if (!MutantMoreMusicManager.currentMusic.isEmpty() && !music.sound().is(TagInit.SoundEvents.OVERRIDES_BATTLE_MUSIC)) {
         ci.cancel();
      }
   }
}
