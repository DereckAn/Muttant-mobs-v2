package com.alexander.mutantmore.mutations;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;

/**
 * One data-driven mutation (data/<ns>/mutation_type/*.json): which mob turns into which mutant, and under what conditions.
 * Tag fields ("requiredBiomes" etc.) are tag ids without the '#'. -456 = no Y limit.
 */
public record MutationType(
   EntityType<?> entityType,
   EntityType<?> resultEntityType,
   SoundEvent mutatedSoundEvent,
   CameraShake screenShake,
   boolean breakBlocksWhenMutated,
   boolean breakBlocksWhenMutatedIfGriefingDisabled,
   String requiredBiomes,
   String requiredStructures,
   int minYLevel,
   int maxYLevel,
   String requiredEffects,
   List<String> requiredMods,
   List<String> modsThatPreventMutation,
   CompoundTag mutatedMobTags,
   boolean spawnsNaturally,
   int naturalSpawnChance
) {
   public record CameraShake(float amount, int duration, int range) {
      public static final Codec<CameraShake> CODEC = RecordCodecBuilder.create(
         i -> i.group(
               Codec.FLOAT.optionalFieldOf("amount", 0.0F).forGetter(CameraShake::amount),
               Codec.INT.optionalFieldOf("duration", 0).forGetter(CameraShake::duration),
               Codec.INT.optionalFieldOf("range", 0).forGetter(CameraShake::range)
            )
            .apply(i, CameraShake::new)
      );
   }

   public static final Codec<MutationType> CODEC = RecordCodecBuilder.create(
      i -> i.group(
            BuiltInRegistries.ENTITY_TYPE.byNameCodec().fieldOf("entityType").forGetter(MutationType::entityType),
            BuiltInRegistries.ENTITY_TYPE.byNameCodec().fieldOf("resultEntityType").forGetter(MutationType::resultEntityType),
            BuiltInRegistries.SOUND_EVENT.byNameCodec().optionalFieldOf("mutatedSoundEvent", SoundEvents.PLAYER_HURT).forGetter(MutationType::mutatedSoundEvent),
            CameraShake.CODEC.optionalFieldOf("screenShake", new CameraShake(0.0F, 0, 0)).forGetter(MutationType::screenShake),
            Codec.BOOL.optionalFieldOf("breakBlocksWhenMutated", true).forGetter(MutationType::breakBlocksWhenMutated),
            Codec.BOOL.optionalFieldOf("breakBlocksWhenMutatedIfGriefingDisabled", false).forGetter(MutationType::breakBlocksWhenMutatedIfGriefingDisabled),
            Codec.STRING.optionalFieldOf("requiredBiomes", "").forGetter(MutationType::requiredBiomes),
            Codec.STRING.optionalFieldOf("requiredStructures", "").forGetter(MutationType::requiredStructures),
            Codec.INT.optionalFieldOf("minYLevel", -456).forGetter(MutationType::minYLevel),
            Codec.INT.optionalFieldOf("maxYLevel", -456).forGetter(MutationType::maxYLevel),
            Codec.STRING.optionalFieldOf("requiredEffects", "").forGetter(MutationType::requiredEffects),
            Codec.STRING.listOf().optionalFieldOf("requiredMods", List.of()).forGetter(MutationType::requiredMods),
            Codec.STRING.listOf().optionalFieldOf("modsThatPreventMutation", List.of()).forGetter(MutationType::modsThatPreventMutation)
         )
         .and(
            i.group(
               CompoundTag.CODEC.optionalFieldOf("mutatedMobTags", new CompoundTag()).forGetter(MutationType::mutatedMobTags),
               Codec.BOOL.optionalFieldOf("spawnsNaturally", false).forGetter(MutationType::spawnsNaturally),
               Codec.INT.optionalFieldOf("naturalSpawnChance", 100).forGetter(MutationType::naturalSpawnChance)
            )
         )
         .apply(i, MutationType::new)
   );
}
