package com.alexander.mutantmore.client;

import net.minecraft.world.item.ItemStack;
import com.alexander.mutantmore.client.armour.ArmourRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.AnimationState;

public class MutantFrozenZombieRenderState extends LivingEntityRenderState implements ArmourRenderState {
   public final ItemStack[] armour = {ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY};

   @Override
   public ItemStack[] armour() {
      return this.armour;
   }

   public final AnimationState downAnimationState = new AnimationState();
   public final AnimationState roarAnimationState = new AnimationState();
   public final AnimationState snowThrowAnimationState = new AnimationState();
   public final AnimationState slamAnimationState = new AnimationState();
   public final AnimationState jumpAnimationState = new AnimationState();
   public final AnimationState iciclesAnimationState = new AnimationState();
   public final AnimationState throwAnimationState = new AnimationState();
   public final AnimationState attackAnimationState = new AnimationState();
   public final AnimationState introAnimationState = new AnimationState();
   public final AnimationState noveltyAnimationState = new AnimationState();
   public int downAnimationTick;
   public int roarAnimationTick;
   public int snowThrowAnimationTick;
   public int slamAnimationTick;
   public int jumpAnimationTick;
   public int iciclesAnimationTick;
   public int throwAnimationTick;
   public int attackAnimationTick;
   public int introAnimationTick;
   public int noveltyAnimationTick;
   public boolean jumping;
   public boolean notCurrentlyPlayingKeyframeAnimation;
   public boolean movingOnLand;
   public float walkSpeed;
}
