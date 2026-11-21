package com.alexander.mutantmore.client;

import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.AnimationState;

public class MutantHoglinRenderState extends LivingEntityRenderState {
   public final AnimationState noveltyAnimationState = new AnimationState();
   public final AnimationState attackAnimationState = new AnimationState();
   public final AnimationState stompAnimationState = new AnimationState();
   public final AnimationState kickAnimationState = new AnimationState();
   public final AnimationState prepareChargeAnimationState = new AnimationState();
   public final AnimationState introAnimationState = new AnimationState();
   public final AnimationState deathAnimationState = new AnimationState();
   public final AnimationState danceAnimationState = new AnimationState();
   public int noveltyAnimationTick;
   public int attackAnimationTick;
   public int stompAnimationTick;
   public int kickAnimationTick;
   public int prepareChargeAnimationTick;
   public int introAnimationTick;
   public int deathTime;
   public boolean notCurrentlyPlayingKeyframeAnimation;
   public boolean charging;
   public boolean movingOnLand;
   public float groundSpeed;
   public float walkSpeed;
   public float enragedAmount;
}
