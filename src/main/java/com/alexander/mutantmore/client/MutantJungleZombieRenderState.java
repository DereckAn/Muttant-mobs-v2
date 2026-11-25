package com.alexander.mutantmore.client;

import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.AnimationState;

public class MutantJungleZombieRenderState extends LivingEntityRenderState {
   public final AnimationState noveltyAnimationState = new AnimationState();
   public final AnimationState downAnimationState = new AnimationState();
   public final AnimationState introAnimationState = new AnimationState();
   public final AnimationState punchAnimationState = new AnimationState();
   public final AnimationState tryChokeAnimationState = new AnimationState();
   public final AnimationState chokeAnimationState = new AnimationState();
   public final AnimationState lowAttackAnimationState = new AnimationState();
   public final AnimationState highAttackAnimationState = new AnimationState();
   public final AnimationState jumpAnimationState = new AnimationState();
   public final AnimationState trySlamAnimationState = new AnimationState();
   public final AnimationState slamAnimationState = new AnimationState();
   public final AnimationState stopRestingAnimationState = new AnimationState();
   public int noveltyAnimationTick;
   public int downAnimationTick;
   public int introAnimationTick;
   public int punchAnimationTick;
   public int tryChokeAnimationTick;
   public int chokeAnimationTick;
   public int lowAttackAnimationTick;
   public int highAttackAnimationTick;
   public int jumpAnimationTick;
   public int trySlamAnimationTick;
   public int slamAnimationTick;
   public int stopRestingAnimationTick;
   public int restTick;
   public float grabArmXRot;
   public boolean notCurrentlyPlayingKeyframeAnimation;
   public boolean movingOnLand;
   public float walkSpeed;
}
