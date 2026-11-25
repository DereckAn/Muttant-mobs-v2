package com.alexander.mutantmore.client;

import com.alexander.mutantmore.events.ShakeCameraEvent;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.ModelLayerInit;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.models.entities.MutantHoglinModel;
import com.alexander.mutantmore.network.ShakeCameraPayload;
import com.alexander.mutantmore.particles.ShockwaveParticle;
import com.alexander.mutantmore.renderers.entities.MutantHoglinRenderer;
import com.alexander.mutantmore.models.entities.MutantJungleZombieModel;
import com.alexander.mutantmore.particles.PoisonCloudParticle;
import com.alexander.mutantmore.renderers.entities.MutantJungleZombieRenderer;
import net.minecraft.client.renderer.entity.NoopRenderer;
import net.minecraft.client.renderer.special.SpecialModelRenderers;
import com.alexander.mutantmore.models.entities.SentryVineModel;
import com.alexander.mutantmore.models.items.MutantJungleZombieArmModel;
import com.alexander.mutantmore.renderers.entities.SentryVineRenderer;
import com.alexander.mutantmore.renderers.items.MutantJungleZombieArmSpecialRenderer;
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
      ModelLayerRegistry.registerModelLayer(ModelLayerInit.MUTANT_JUNGLE_ZOMBIE, MutantJungleZombieModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.MUTANT_JUNGLE_ZOMBIE, MutantJungleZombieRenderer::new);
      EntityRendererRegistry.register(EntityTypeInit.AREA_DAMAGE, NoopRenderer::new);
      ModelLayerRegistry.registerModelLayer(ModelLayerInit.SENTRY_VINE, SentryVineModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.SENTRY_VINE, SentryVineRenderer::new);
      ModelLayerRegistry.registerModelLayer(ModelLayerInit.MUTANT_JUNGLE_ZOMBIE_ARM, MutantJungleZombieArmModel::createBodyLayer);
      SpecialModelRenderers.ID_MAPPER.put(MutantJungleZombieArmSpecialRenderer.ID, MutantJungleZombieArmSpecialRenderer.Unbaked.MAP_CODEC);
      ClientTickEvents.END_CLIENT_TICK.register(JungleZombieArmClient::tick);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.SHOCKWAVE, ShockwaveParticle.Provider::new);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.POISON_CLOUD, PoisonCloudParticle.Provider::new);
      ClientPlayNetworking.registerGlobalReceiver(ShakeCameraPayload.TYPE, (payload, context) ->
         ShakeCameraEvent.shake(null, payload.duration(), payload.amount(), payload.causePos(), payload.range()));
      ClientTickEvents.END_CLIENT_TICK.register(CameraShake::tick);
      ClientTickEvents.END_CLIENT_TICK.register(MutantMoreMusicManager::tick);
      AbstractMutant.battleMusicHook = BattleMusic::tick;
   }
}
