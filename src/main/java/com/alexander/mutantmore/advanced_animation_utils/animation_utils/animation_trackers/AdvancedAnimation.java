package com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers;

import java.util.Map;
import net.minecraft.network.FriendlyByteBuf;

public interface AdvancedAnimation {
   AdvancedAnimationTracker getTracker();

   void setTracker(AdvancedAnimationTracker tracker);

   String getName();

   void setName(String name);

   void tick();

   void write(FriendlyByteBuf buf);

   void read(FriendlyByteBuf buf);

   void syncToClient();

   Map<String, Float> getModifiers();

   void clientUpdate();
}
