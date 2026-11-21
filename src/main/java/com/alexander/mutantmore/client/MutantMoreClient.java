package com.alexander.mutantmore.client;

import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.ModelLayerInit;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.models.entities.MutantHoglinModel;
import com.alexander.mutantmore.network.ShakeCameraPayload;
import com.alexander.mutantmore.particles.ShockwaveParticle;
import com.alexander.mutantmore.renderers.entities.MutantHoglinRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import com.alexander.mutantmore.audio.music.MutantMoreMusicManager;
import com.alexander.mutantmore.entities.AbstractMutant;

public class MutantMoreClient implements ClientModInitializer {
   @Override
   public void onInitializeClient() {
      ModelLayerRegistry.registerModelLayer(ModelLayerInit.MUTANT_HOGLIN, MutantHoglinModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.MUTANT_HOGLIN, MutantHoglinRenderer::new);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.SHOCKWAVE, ShockwaveParticle.Provider::new);
      ClientPlayNetworking.registerGlobalReceiver(ShakeCameraPayload.TYPE, (payload, context) ->
         ShakeCameraEvent.shake(null, payload.duration(), payload.amount(), payload.causePos(), payload.range()));
      ClientTickEvents.END_CLIENT_TICK.register(CameraShake::tick);
      ClientTickEvents.END_CLIENT_TICK.register(MutantMoreMusicManager::tick);
      AbstractMutant.battleMusicHook = BattleMusic::tick;
   }
}
