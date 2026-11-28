package com.alexander.mutantmore.client;

import net.minecraft.world.item.ItemStack;
import com.alexander.mutantmore.client.armour.ArmourRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.world.entity.AnimationState;

public class MutantHuskRenderState extends LivingEntityRenderState implements ArmourRenderState {
   public final ItemStack[] armour = {ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY, ItemStack.EMPTY};

   @Override
   public ItemStack[] armour() {
      return this.armour;
   }

   public final AnimationState noveltyAnimationState = new AnimationState();
   public final AnimationState throwSandAnimationState = new AnimationState();
   public final AnimationState attackAnimationState = new AnimationState();
   public final AnimationState trapAnimationState = new AnimationState();
   public final AnimationState roarAnimationState = new AnimationState();
   public final AnimationState introAnimationState = new AnimationState();
   public final AnimationState geyserAnimationState = new AnimationState();
   public final AnimationState jumpAnimationState = new AnimationState();
   public final AnimationState slamAnimationState = new AnimationState();
   public final AnimationState downAnimationState = new AnimationState();
   public int noveltyAnimationTick;
   public int throwSandAnimationTick;
   public int attackAnimationTick;
   public int trapAnimationTick;
   public int roarAnimationTick;
   public int introAnimationTick;
   public int geyserAnimationTick;
   public int jumpAnimationTick;
   public int slamAnimationTick;
   public int downAnimationTick;
   public String sandType = "";
   public boolean jumping;
   public boolean notCurrentlyPlayingKeyframeAnimation;
   public boolean movingOnLand;
   public float walkSpeed;
}
