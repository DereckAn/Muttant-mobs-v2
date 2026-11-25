package com.alexander.mutantmore;

import com.alexander.mutantmore.config.MutantMoreGroupedOptionsClientConfig;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.MutantMoreMiscClientConfig;
import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinClientConfig;
import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinCommonConfig;
import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinRewardsClientConfig;
import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinRewardsCommonConfig;
import com.alexander.mutantmore.entities.MutantHoglin;
import com.alexander.mutantmore.entities.MutantHusk;
import com.alexander.mutantmore.entities.MutantShulker;
import com.alexander.mutantmore.entities.MutantShulkerTrap;
import com.alexander.mutantmore.entities.MutantShulkerTurret;
import com.alexander.mutantmore.entities.MutantFrozenZombie;
import com.alexander.mutantmore.config.mutant_frozen_zombie.MutantFrozenZombieClientConfig;
import com.alexander.mutantmore.config.mutant_frozen_zombie.MutantFrozenZombieCommonConfig;
import com.alexander.mutantmore.config.QuicksandCommonConfig;
import com.alexander.mutantmore.config.mutant_husk.MutantHuskClientConfig;
import com.alexander.mutantmore.config.mutant_husk.MutantHuskRewardsCommonConfig;
import com.alexander.mutantmore.config.mutant_husk.MutantHuskCommonConfig;
import com.alexander.mutantmore.entities.MutantJungleZombie;
import com.alexander.mutantmore.config.mutant_jungle_zombie.MutantJungleZombieClientConfig;
import com.alexander.mutantmore.config.mutant_jungle_zombie.MutantJungleZombieCommonConfig;
import com.alexander.mutantmore.init.BlockInit;
import com.alexander.mutantmore.init.CreativeModeTabInit;
import com.alexander.mutantmore.entities.SentryVine;
import com.alexander.mutantmore.items.JungleZombieArmState;
import com.alexander.mutantmore.network.ArmStranglePayload;
import com.alexander.mutantmore.config.mutant_jungle_zombie.MutantJungleZombieRewardsCommonConfig;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import com.alexander.mutantmore.init.EffectInit;
import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.ItemInit;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.SoundEventInit;
import com.alexander.mutantmore.network.ShakeCameraPayload;
import com.mojang.logging.LogUtils;
import fuzs.forgeconfigapiport.fabric.api.v5.ConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.ForgeConfigSpec;
import net.neoforged.fml.config.ModConfig.Type;
import org.slf4j.Logger;

public class MutantMore implements ModInitializer {
   public static final String MODID = "mutantmore";
   public static final Logger LOGGER = LogUtils.getLogger();

   @Override
   public void onInitialize() {
      registerConfigFiles();
      SoundEventInit.init();
      EffectInit.init();
      ParticleTypeInit.init();
      EntityTypeInit.init();
      BlockInit.init();
      ItemInit.init();
      CreativeModeTabInit.init();
      // ponytail: attributes read the common config once at startup, so health/armour edits need a restart (same as the original)
      FabricDefaultAttributeRegistry.register(EntityTypeInit.MUTANT_HOGLIN, MutantHoglin.createConfiguredAttributes());
      FabricDefaultAttributeRegistry.register(EntityTypeInit.MUTANT_JUNGLE_ZOMBIE, MutantJungleZombie.createConfiguredAttributes());
      FabricDefaultAttributeRegistry.register(EntityTypeInit.MUTANT_HUSK, MutantHusk.createConfiguredAttributes());
      FabricDefaultAttributeRegistry.register(EntityTypeInit.MUTANT_FROZEN_ZOMBIE, MutantFrozenZombie.createConfiguredAttributes());
      FabricDefaultAttributeRegistry.register(EntityTypeInit.MUTANT_SHULKER, MutantShulker.createConfiguredAttributes());
      FabricDefaultAttributeRegistry.register(EntityTypeInit.MUTANT_SHULKER_TURRET, MutantShulkerTurret.createConfiguredAttributes());
      FabricDefaultAttributeRegistry.register(EntityTypeInit.MUTANT_SHULKER_TRAP, MutantShulkerTrap.createConfiguredAttributes());
      FabricDefaultAttributeRegistry.register(EntityTypeInit.MUTANT_BLAZE, com.alexander.mutantmore.entities.MutantBlaze.createConfiguredAttributes());
      FabricDefaultAttributeRegistry.register(EntityTypeInit.RODLING, com.alexander.mutantmore.entities.Rodling.createConfiguredAttributes());
      com.alexander.mutantmore.heat.Heat.init();
      FabricDefaultAttributeRegistry.register(EntityTypeInit.SENTRY_VINE, SentryVine.createConfiguredAttributes());
      PayloadTypeRegistry.serverboundPlay().register(ArmStranglePayload.TYPE, ArmStranglePayload.CODEC);
      ServerPlayNetworking.registerGlobalReceiver(ArmStranglePayload.TYPE, (payload, context) -> JungleZombieArmState.of(context.player()).strangleTicks = 3);
      // Wandering traders run from the zombie-type mutants (was ModifyAIEvent)
      net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.ENTITY_LOAD.register((entity, level) -> {
         if (entity instanceof net.minecraft.world.entity.npc.wanderingtrader.WanderingTrader trader) {
            trader.goalSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.AvoidEntityGoal<>(trader, MutantHusk.class, 20.0F, 0.5, 0.5));
            trader.goalSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.AvoidEntityGoal<>(trader, MutantFrozenZombie.class, 30.0F, 0.5, 0.5));
            trader.goalSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.AvoidEntityGoal<>(trader, MutantJungleZombie.class, 25.0F, 0.5, 0.5));
         }
      });
      PayloadTypeRegistry.clientboundPlay().register(ShakeCameraPayload.TYPE, ShakeCameraPayload.CODEC);
      CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.SPAWN_EGGS).register(output -> {
         output.accept(ItemInit.MUTANT_HUSK_SPAWN_EGG);
         output.accept(ItemInit.MUTANT_FROZEN_ZOMBIE_SPAWN_EGG);
         output.accept(ItemInit.MUTANT_SHULKER_SPAWN_EGG);
         output.accept(ItemInit.MUTANT_BLAZE_SPAWN_EGG);
         output.accept(ItemInit.RODLING_SPAWN_EGG);
         output.accept(ItemInit.MUTANT_HOGLIN_SPAWN_EGG);
         output.accept(ItemInit.MUTANT_JUNGLE_ZOMBIE_SPAWN_EGG);
      });
      CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(output -> {
         output.accept(ItemInit.MUSIC_DISC_ADRENALINE_RUSH);
         output.accept(ItemInit.MUSIC_DISC_AEGIS);
         output.accept(ItemInit.MUSIC_DISC_FORCES_UNKNOWN);
      });
      CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
         output.accept(ItemInit.MUTANT_HUSK_VOCAL_CORDS);
         output.accept(ItemInit.MUTANT_HOGLIN_TUSK);
         output.accept(ItemInit.DISC_FRAGMENT_ADRENALINE_RUSH);
         output.accept(ItemInit.DISC_FRAGMENT_AEGIS);
         output.accept(ItemInit.DISC_FRAGMENT_FORCES_UNKNOWN);
         output.accept(ItemInit.MUTANT_FROZEN_ZOMBIE_SPIKES);
         output.accept(ItemInit.MUTANT_JUNGLE_ZOMBIE_VINE);
      });
   }

   private static void config(Type type, ForgeConfigSpec spec, String file) {
      ConfigRegistry.INSTANCE.register(MODID, type, spec, "mutantmore/" + file);
   }

   private static void registerConfigFiles() {
      config(Type.COMMON, MutantHoglinCommonConfig.SPEC, "mutant_hoglin/mutant_hoglin-common.toml");
      config(Type.CLIENT, MutantHoglinClientConfig.SPEC, "mutant_hoglin/mutant_hoglin-client.toml");
      config(Type.COMMON, MutantHoglinRewardsCommonConfig.SPEC, "mutant_hoglin/mutant_hoglin_rewards-common.toml");
      config(Type.CLIENT, MutantHoglinRewardsClientConfig.SPEC, "mutant_hoglin/mutant_hoglin_rewards-client.toml");
      config(Type.COMMON, MutantHuskCommonConfig.SPEC, "mutant_husk/mutant_husk-common.toml");
      config(Type.CLIENT, MutantHuskClientConfig.SPEC, "mutant_husk/mutant_husk-client.toml");
      config(Type.COMMON, MutantHuskRewardsCommonConfig.SPEC, "mutant_husk/mutant_husk_rewards-common.toml");
      config(Type.COMMON, com.alexander.mutantmore.config.FreezingEffectCommonConfig.SPEC, "freezing_effect-common.toml");
      config(Type.COMMON, QuicksandCommonConfig.SPEC, "quicksand-common.toml");
      config(Type.COMMON, MutantFrozenZombieCommonConfig.SPEC, "mutant_frozen_zombie/mutant_frozen_zombie-common.toml");
      config(Type.CLIENT, MutantFrozenZombieClientConfig.SPEC, "mutant_frozen_zombie/mutant_frozen_zombie-client.toml");
      config(Type.COMMON, com.alexander.mutantmore.config.mutant_shulker.MutantShulkerCommonConfig.SPEC, "mutant_shulker/mutant_shulker-common.toml");
      config(Type.CLIENT, com.alexander.mutantmore.config.mutant_shulker.MutantShulkerClientConfig.SPEC, "mutant_shulker/mutant_shulker-client.toml");
      config(Type.COMMON, com.alexander.mutantmore.config.mutant_shulker.MutantShulkerRewardsCommonConfig.SPEC, "mutant_shulker/mutant_shulker_rewards-common.toml");
      config(Type.COMMON, com.alexander.mutantmore.config.mutant_blaze.MutantBlazeCommonConfig.SPEC, "mutant_blaze/mutant_blaze-common.toml");
      config(Type.CLIENT, com.alexander.mutantmore.config.mutant_blaze.MutantBlazeClientConfig.SPEC, "mutant_blaze/mutant_blaze-client.toml");
      config(Type.COMMON, com.alexander.mutantmore.config.mutant_blaze.MutantBlazeRewardsCommonConfig.SPEC, "mutant_blaze/mutant_blaze_rewards-common.toml");
      config(Type.CLIENT, com.alexander.mutantmore.config.mutant_blaze.MutantBlazeRewardsClientConfig.SPEC, "mutant_blaze/mutant_blaze_rewards-client.toml");
      config(Type.COMMON, com.alexander.mutantmore.config.mutant_blaze.RodlingCommonConfig.SPEC, "mutant_blaze/rodling-common.toml");
      config(Type.COMMON, com.alexander.mutantmore.config.mutant_blaze.HeatCommonConfig.SPEC, "mutant_blaze/heat-common.toml");
      config(Type.CLIENT, com.alexander.mutantmore.config.mutant_blaze.HeatClientConfig.SPEC, "mutant_blaze/heat-client.toml");
      config(Type.COMMON, MutantJungleZombieCommonConfig.SPEC, "mutant_jungle_zombie/mutant_jungle_zombie-common.toml");
      config(Type.COMMON, MutantJungleZombieRewardsCommonConfig.SPEC, "mutant_jungle_zombie/mutant_jungle_zombie_rewards-common.toml");
      config(Type.CLIENT, MutantJungleZombieClientConfig.SPEC, "mutant_jungle_zombie/mutant_jungle_zombie-client.toml");
      config(Type.COMMON, MutantMoreGroupedOptionsCommonConfig.SPEC, "grouped_options-common.toml");
      config(Type.CLIENT, MutantMoreGroupedOptionsClientConfig.SPEC, "grouped_options-client.toml");
      config(Type.CLIENT, MutantMoreMiscClientConfig.SPEC, "misc-client.toml");
   }
}
