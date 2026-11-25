package com.alexander.mutantmore.client;

import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.AnimationState;

public class SentryVineRenderState extends LivingEntityRenderState {
   public final AnimationState deployAnimationState = new AnimationState();
   public final AnimationState attackAnimationState = new AnimationState();
   public final AnimationState trySlamAnimationState = new AnimationState();
   public final AnimationState slamAnimationState = new AnimationState();
   public int deployAnimationTick;
   public int attackAnimationTick;
   public int trySlamAnimationTick;
   public int slamAnimationTick;
}
