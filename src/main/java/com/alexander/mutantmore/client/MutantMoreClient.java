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
import net.minecraft.client.Minecraft;
import com.alexander.mutantmore.entities.SandBoulder;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.models.entities.MutantHuskModel;
import com.alexander.mutantmore.models.entities.SandBoulderModel;
import com.alexander.mutantmore.models.entities.ZombieResurrectionModel;
import com.alexander.mutantmore.particles.SandParticle;
import com.alexander.mutantmore.renderers.entities.MutantHuskRenderer;
import com.alexander.mutantmore.renderers.entities.SandBoulderRenderer;
import com.alexander.mutantmore.renderers.entities.ZombieResurrectionRenderer;
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
      ModelLayerRegistry.registerModelLayer(ModelLayerInit.MUTANT_HUSK, MutantHuskModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.MUTANT_HUSK, MutantHuskRenderer::new);
      ModelLayerRegistry.registerModelLayer(ModelLayerInit.SAND_BOULDER, SandBoulderModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.SAND_BOULDER, SandBoulderRenderer::new);
      ModelLayerRegistry.registerModelLayer(ModelLayerInit.ZOMBIE_RESURRECTION, ZombieResurrectionModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.ZOMBIE_RESURRECTION, ZombieResurrectionRenderer::new);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.SAND, sprites -> new SandParticle.Provider(sprites, false));
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.SAND_GEYSER, sprites -> new SandParticle.Provider(sprites, true));
      com.alexander.mutantmore.util.MiscUtils.loopingSoundHook = (entity, sound) -> Minecraft.getInstance().getSoundManager().queueTickingSound(new EntityLoopingSound(entity, sound, 1.0F));
      SandBoulder.rollingSoundHook = boulder -> Minecraft.getInstance().getSoundManager().queueTickingSound(new EntityLoopingSound(boulder, SoundEventInit.MUTANT_HUSK_SAND_BOULDER_LOOP, 3.0F));
      ModelLayerRegistry.registerModelLayer(ModelLayerInit.MUTANT_FROZEN_ZOMBIE, com.alexander.mutantmore.models.entities.MutantFrozenZombieModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.MUTANT_FROZEN_ZOMBIE, com.alexander.mutantmore.renderers.entities.MutantFrozenZombieRenderer::new);
      ModelLayerRegistry.registerModelLayer(ModelLayerInit.ICICLE_SPIKE, com.alexander.mutantmore.models.entities.IcicleSpikeModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.ICICLE_SPIKE, com.alexander.mutantmore.renderers.entities.IcicleSpikeRenderer::new);
      ModelLayerRegistry.registerModelLayer(ModelLayerInit.THROWN_ICICLE, com.alexander.mutantmore.models.entities.ThrownIcicleModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.THROWN_ICICLE, com.alexander.mutantmore.renderers.entities.ThrownIcicleRenderer::new);
      ModelLayerRegistry.registerModelLayer(ModelLayerInit.GIANT_SNOWBALL, com.alexander.mutantmore.models.entities.GiantSnowballModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.GIANT_SNOWBALL, com.alexander.mutantmore.renderers.entities.GiantSnowballRenderer::new);
      EntityRendererRegistry.register(EntityTypeInit.ICE_CUBE, com.alexander.mutantmore.renderers.entities.IceCubeRenderer::new);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.SNOWSTORM, com.alexander.mutantmore.particles.SnowstormParticle.Provider::new);
      ModelLayerRegistry.registerModelLayer(ModelLayerInit.HOG_HELM, com.alexander.mutantmore.models.armour.HogHelmModel::createBodyLayer);
      HogHelmClient.register();
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.DASH, com.alexander.mutantmore.particles.DashParticle.Provider::new);
      ModelLayerRegistry.registerModelLayer(com.alexander.mutantmore.renderers.entities.MutantShulkerRenderer.LAYER, com.alexander.mutantmore.models.entities.MutantShulkerModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.MUTANT_SHULKER, com.alexander.mutantmore.renderers.entities.MutantShulkerRenderer::new);
      ModelLayerRegistry.registerModelLayer(com.alexander.mutantmore.renderers.entities.MutantShulkerTurretRenderer.LAYER, com.alexander.mutantmore.models.entities.MutantShulkerTurretModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.MUTANT_SHULKER_TURRET, com.alexander.mutantmore.renderers.entities.MutantShulkerTurretRenderer::new);
      ModelLayerRegistry.registerModelLayer(com.alexander.mutantmore.renderers.entities.MutantShulkerTrapRenderer.LAYER, com.alexander.mutantmore.models.entities.MutantShulkerTrapModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.MUTANT_SHULKER_TRAP, com.alexander.mutantmore.renderers.entities.MutantShulkerTrapRenderer::new);
      ModelLayerRegistry.registerModelLayer(com.alexander.mutantmore.renderers.entities.MutantShulkerBulletRenderer.LAYER, com.alexander.mutantmore.models.entities.MutantShulkerBulletModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.MUTANT_SHULKER_BULLET, com.alexander.mutantmore.renderers.entities.MutantShulkerBulletRenderer::new);
      EntityRendererRegistry.register(EntityTypeInit.CUSTOM_SHULKER_BULLET, com.alexander.mutantmore.renderers.entities.CustomShulkerBulletRenderer::new);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.MUTANT_SHULKER_BULLET, com.alexander.mutantmore.particles.MutantShulkerBulletParticle.Provider::new);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.MUTANT_SHULKER_HEAL, sprites -> new com.alexander.mutantmore.particles.MutantShulkerBulletParticle.Provider(sprites, true));
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
      // Mutant Blaze
      ModelLayerRegistry.registerModelLayer(com.alexander.mutantmore.renderers.entities.MutantBlazeRenderer.LAYER, com.alexander.mutantmore.models.entities.MutantBlazeModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.MUTANT_BLAZE, com.alexander.mutantmore.renderers.entities.MutantBlazeRenderer::new);
      ModelLayerRegistry.registerModelLayer(com.alexander.mutantmore.renderers.entities.RodlingRenderer.LAYER, com.alexander.mutantmore.models.entities.RodlingModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.RODLING, com.alexander.mutantmore.renderers.entities.RodlingRenderer::new);
      EntityRendererRegistry.register(EntityTypeInit.MUTANT_BLAZE_ROD_PROJECTILE, com.alexander.mutantmore.renderers.entities.MutantBlazeRodProjectileRenderer::new);
      EntityRendererRegistry.register(EntityTypeInit.MUTANT_BLAZE_FIREBALL, context -> new net.minecraft.client.renderer.entity.ThrownItemRenderer<>(context, 3.0F, true));
      EntityRendererRegistry.register(EntityTypeInit.RODLING_FIREBALL, context -> new net.minecraft.client.renderer.entity.ThrownItemRenderer<>(context, 0.75F, true));
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.MUTANT_BLAZE_HEAL, sprites -> new com.alexander.mutantmore.particles.MutantShulkerBulletParticle.Provider(sprites, true));
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.BROKEN_MUTANT_BLAZE_SHIELD, com.alexander.mutantmore.particles.MutantBlazeParticles.Shard.Provider::new);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.FIRE_TRAIL, com.alexander.mutantmore.particles.MutantBlazeParticles.FireTrail.Provider::new);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.MUTANT_BLAZE_CHARGE_SHOT, sprites -> new com.alexander.mutantmore.particles.MutantBlazeParticles.ChargeShot.Provider(sprites, false));
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.RODLING_CHARGE_SHOT, sprites -> new com.alexander.mutantmore.particles.MutantBlazeParticles.ChargeShot.Provider(sprites, true));
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.HEAT, sprites -> new com.alexander.mutantmore.particles.SnowstormParticle.Provider(sprites, true));
      com.alexander.mutantmore.heat.HeatClient.register();
      // Mutant Wither Skeleton
      MutantWitherSkeletonArmourClient.register();
      // Shulker Shield and Leafblower
      RewardItemsClient.register();
      ClientTickEvents.END_CLIENT_TICK.register(RewardItemsClient::tick);
      ModelLayerRegistry.registerModelLayer(com.alexander.mutantmore.models.items.MutantShulkerShieldModel.LAYER, com.alexander.mutantmore.models.items.MutantShulkerShieldModel::createBodyLayer);
      ModelLayerRegistry.registerModelLayer(com.alexander.mutantmore.models.items.LeafblowerModel.LAYER, com.alexander.mutantmore.models.items.LeafblowerModel::createBodyLayer);
      SpecialModelRenderers.ID_MAPPER.put(com.alexander.mutantmore.renderers.items.RewardItemSpecialRenderers.SHIELD_ID, com.alexander.mutantmore.renderers.items.RewardItemSpecialRenderers.Shield.Unbaked.MAP_CODEC);
      SpecialModelRenderers.ID_MAPPER.put(com.alexander.mutantmore.renderers.items.RewardItemSpecialRenderers.LEAFBLOWER_ID, com.alexander.mutantmore.renderers.items.RewardItemSpecialRenderers.Leafblower.Unbaked.MAP_CODEC);
      ModelLayerRegistry.registerModelLayer(com.alexander.mutantmore.renderers.entities.MutantBlazeShieldsRenderer.LAYER, com.alexander.mutantmore.models.entities.MutantBlazeShieldsModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.MUTANT_BLAZE_SHIELDS, com.alexander.mutantmore.renderers.entities.MutantBlazeShieldsRenderer::new);
      net.minecraft.client.gui.screens.MenuScreens.register(com.alexander.mutantmore.gui.RodlingCheckerMenu.TYPE, com.alexander.mutantmore.gui.RodlingCheckerScreen::new);
      // Mutation
      EntityRendererRegistry.register(EntityTypeInit.MUTATION_CLOUD, com.alexander.mutantmore.renderers.entities.MutationCloudRenderer::new);
      EntityRendererRegistry.register(EntityTypeInit.THROWN_MUTATION_POTION, net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.MUTATION, com.alexander.mutantmore.particles.MutationParticles.Spark.Provider::new);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.MUTATION_SWIRL, com.alexander.mutantmore.particles.MutationParticles.Swirl.Provider::new);
      com.alexander.mutantmore.entities.MutationCloud.loopSoundHook = cloud -> Minecraft.getInstance().getSoundManager().queueTickingSound(new EntityLoopingSound(cloud, SoundEventInit.MUTATION_LOOP, 1.0F));
      net.minecraft.client.renderer.item.properties.numeric.RangeSelectItemModelProperties.ID_MAPPER.put(
         net.minecraft.resources.Identifier.fromNamespaceAndPath("mutantmore", "brewing_progress"), BrewingProgressProperty.MAP_CODEC
      );
      // Reward blocks
      ModelLayerRegistry.registerModelLayer(com.alexander.mutantmore.models.blockentities.SnowstormGeneratorModel.LAYER, com.alexander.mutantmore.models.blockentities.SnowstormGeneratorModel::createBodyLayer);
      ModelLayerRegistry.registerModelLayer(com.alexander.mutantmore.models.blockentities.HeatstormGeneratorModel.LAYER, com.alexander.mutantmore.models.blockentities.HeatstormGeneratorModel::createBodyLayer);
      net.minecraft.client.renderer.blockentity.BlockEntityRenderers.register(com.alexander.mutantmore.init.BlockEntityTypeInit.SNOWSTORM_GENERATOR, com.alexander.mutantmore.renderers.blockentities.SnowstormGeneratorBlockRenderer::new);
      net.minecraft.client.renderer.blockentity.BlockEntityRenderers.register(com.alexander.mutantmore.init.BlockEntityTypeInit.HEATSTORM_GENERATOR, com.alexander.mutantmore.renderers.blockentities.HeatstormGeneratorBlockRenderer::new);
      SpecialModelRenderers.ID_MAPPER.put(com.alexander.mutantmore.renderers.items.BlockModelSpecialRenderer.ID, com.alexander.mutantmore.renderers.items.BlockModelSpecialRenderer.Unbaked.MAP_CODEC);
      com.alexander.mutantmore.blockentities.HeatstormGeneratorBlockEntity.loopSoundHook = generator -> Minecraft.getInstance().getSoundManager().queueTickingSound(new HeatstormGeneratorSound(generator));
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.MOTION_SNOWSTORM, com.alexander.mutantmore.particles.MotionSnowstormParticle.Provider::new);
      ModelLayerRegistry.registerModelLayer(com.alexander.mutantmore.renderers.entities.WitherBombRenderer.LAYER, com.alexander.mutantmore.models.entities.WitherBombModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.WITHER_BOMB, com.alexander.mutantmore.renderers.entities.WitherBombRenderer::new);
      SpecialModelRenderers.ID_MAPPER.put(com.alexander.mutantmore.renderers.items.WitherBombSpecialRenderer.ID, com.alexander.mutantmore.renderers.items.WitherBombSpecialRenderer.Unbaked.MAP_CODEC);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.WITHER_BOMB, com.alexander.mutantmore.particles.WitherParticles.BombSmoke.Provider::new);
      ModelLayerRegistry.registerModelLayer(com.alexander.mutantmore.renderers.entities.MutantWitherSkeletonRenderer.LAYER, com.alexander.mutantmore.models.entities.MutantWitherSkeletonModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.MUTANT_WITHER_SKELETON, com.alexander.mutantmore.renderers.entities.MutantWitherSkeletonRenderer::new);
      ModelLayerRegistry.registerModelLayer(com.alexander.mutantmore.renderers.entities.MutantWitherSkeletonBodyPartRenderer.LAYER, com.alexander.mutantmore.models.entities.MutantWitherSkeletonBodyPartModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.MUTANT_WITHER_SKELETON_BODY_PART, com.alexander.mutantmore.renderers.entities.MutantWitherSkeletonBodyPartRenderer::new);
      ModelLayerRegistry.registerModelLayer(com.alexander.mutantmore.renderers.entities.WitherSlashRenderer.LAYER, com.alexander.mutantmore.models.entities.WitherSlashModel::createBodyLayer);
      EntityRendererRegistry.register(EntityTypeInit.WITHER_SLASH, com.alexander.mutantmore.renderers.entities.WitherSlashRenderer::new);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.ABSORB, com.alexander.mutantmore.particles.WitherParticles.Absorb.Provider::new);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.GROUND_TRAIL, com.alexander.mutantmore.particles.WitherParticles.GroundTrail.Provider::new);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.MUTANT_WITHER_SKELETON_LEECH, com.alexander.mutantmore.particles.WitherParticles.Leech.Provider::new);
      ParticleProviderRegistry.getInstance().register(ParticleTypeInit.WITHER_GAS, com.alexander.mutantmore.particles.WitherParticles.Gas.Provider::new);
      net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.registerGlobalReceiver(
         com.alexander.mutantmore.network.SyncAdvancedAnimationPayload.TYPE, (payload, context) -> {
            if (context.client().level != null) {
               payload.apply(context.client().level);
            }
         }
      );
   }
}
