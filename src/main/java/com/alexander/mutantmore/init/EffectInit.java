package com.alexander.mutantmore.init;

import com.alexander.mutantmore.effects.SimpleEffect;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class EffectInit {
   // Was a LivingJumpEvent handler scaling jump velocity by 0.3; a JUMP_STRENGTH modifier does the same.
   public static final Holder<MobEffect> JUMPING_FATIGUE = register(
      "jumping_fatigue",
      new SimpleEffect(MobEffectCategory.HARMFUL, 5926017)
         .addAttributeModifier(Attributes.JUMP_STRENGTH, Identifier.fromNamespaceAndPath("mutantmore", "effect.jumping_fatigue"), -0.7, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
   );

   private static Holder<MobEffect> register(String name, MobEffect effect) {
      return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath("mutantmore", name), effect);
   }

   public static void init() {
   }
}
