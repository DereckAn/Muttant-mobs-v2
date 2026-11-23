package com.alexander.mutantmore;

import com.alexander.mutantmore.config.MutantMoreGroupedOptionsClientConfig;
import com.alexander.mutantmore.config.MutantMoreGroupedOptionsCommonConfig;
import com.alexander.mutantmore.config.MutantMoreMiscClientConfig;
import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinClientConfig;
import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinCommonConfig;
import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinRewardsClientConfig;
import com.alexander.mutantmore.config.mutant_hoglin.MutantHoglinRewardsCommonConfig;
import com.alexander.mutantmore.entities.MutantHoglin;
import com.alexander.mutantmore.init.CreativeModeTabInit;
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
      ItemInit.init();
      CreativeModeTabInit.init();
      // ponytail: attributes read the common config once at startup, so health/armour edits need a restart (same as the original)
      FabricDefaultAttributeRegistry.register(EntityTypeInit.MUTANT_HOGLIN, MutantHoglin.createConfiguredAttributes());
      PayloadTypeRegistry.clientboundPlay().register(ShakeCameraPayload.TYPE, ShakeCameraPayload.CODEC);
      CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.SPAWN_EGGS).register(output -> output.accept(ItemInit.MUTANT_HOGLIN_SPAWN_EGG));
      CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
         output.accept(ItemInit.MUTANT_HOGLIN_TUSK);
         output.accept(ItemInit.DISC_FRAGMENT_ADRENALINE_RUSH);
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
      config(Type.COMMON, MutantMoreGroupedOptionsCommonConfig.SPEC, "grouped_options-common.toml");
      config(Type.CLIENT, MutantMoreGroupedOptionsClientConfig.SPEC, "grouped_options-client.toml");
      config(Type.CLIENT, MutantMoreMiscClientConfig.SPEC, "misc-client.toml");
   }
}
