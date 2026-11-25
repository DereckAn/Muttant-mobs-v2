package com.alexander.mutantmore.advanced_animation_utils.animation_utils.animation_trackers;

import com.alexander.mutantmore.advanced_animation_utils.animation_utils.AdvancedAnimationUtils;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.util.Mth;

public abstract class AbstractAdvancedAnimation implements AdvancedAnimation {
   protected float animationTime;
   protected float loopTime;
   protected float animationLength;
   protected int transitionTicks;
   protected float amount = 0.0F;
   protected float amountO = 0.0F;
   protected boolean looping;
   public int tickCount = 0;
   protected float temporaryLock = 0.0F;
   protected boolean lock;
   protected AdvancedAnimationTracker tracker;
   protected String name;
   protected Runnable onFinish;
   protected float progressO = 0.0F;
   protected boolean holdOnLastFrame = false;
   protected Map<String, Float> modifiers = new HashMap<>();

   public AbstractAdvancedAnimation(boolean holdOnLastFrame) {
      this.holdOnLastFrame = holdOnLastFrame;
   }

   public boolean isProgressAt(float progress) {
      return Mth.abs(progress - this.progress()) < 0.025F;
   }

   public float progress() {
      return this.looping ? this.loopTime : this.animationLength - this.animationTime;
   }

   public void start(float animationLength, int transitionTicks) {
      if (this.serverSide() && !this.isPlaying() && !this.isLocked()) {
         this.animationLength = animationLength;
         this.animationTime = animationLength;
         this.transitionTicks = transitionTicks;
         this.onFinish = null;
         if (transitionTicks <= 0) {
            this.amount = 1.0F;
            this.amountO = this.amount;
         }

         this.syncToClient();
      }
   }

   public void start(float animationLength, int transitionTicks, Runnable onFinish) {
      if (this.serverSide() && !this.isPlaying() && !this.isLocked()) {
         this.animationLength = animationLength;
         this.animationTime = animationLength;
         this.transitionTicks = transitionTicks;
         this.onFinish = onFinish;
         if (transitionTicks <= 0) {
            this.amount = 1.0F;
            this.amountO = this.amount;
         }

         this.syncToClient();
      }
   }

   public void startLooping(int transitionTicks) {
      if (this.serverSide() && !this.isPlaying() && !this.isLocked()) {
         this.looping = true;
         this.loopTime = 0.0F;
         this.transitionTicks = transitionTicks;
         this.onFinish = null;
         if (transitionTicks <= 0) {
            this.amount = 1.0F;
            this.amountO = this.amount;
         }

         this.syncToClient();
      }
   }

   public void stop(int transitionTicks) {
      if (this.serverSide() && this.isPlaying() && !this.isLocked()) {
         this.animationLength = 0.0F;
         this.animationTime = 0.0F;
         this.transitionTicks = transitionTicks;
         this.looping = false;
         this.onFinish = null;
         if (transitionTicks <= 0) {
            this.amount = 0.0F;
            this.amountO = this.amount;
         }

         this.syncToClient();
      }
   }

   public boolean holdOnLastFrame() {
      return this.holdOnLastFrame;
   }

   public void setHoldOnLastFrame(boolean value) {
      this.holdOnLastFrame = value;
      this.syncToClient();
   }

   public void lockTemporarily(float lockFor) {
      this.temporaryLock = lockFor;
      this.syncToClient();
   }

   public void lock() {
      this.lock = true;
      this.syncToClient();
   }

   public void unlock() {
      this.temporaryLock = 0.0F;
      this.lock = false;
      this.syncToClient();
   }

   public boolean isLocked() {
      return this.temporaryLock > 0.0F || this.lock;
   }

   public boolean isPlaying() {
      return this.isLooping() || this.animationTime > 0.0F;
   }

   public boolean isLooping() {
      return this.looping;
   }

   public float getLength() {
      return this.animationLength;
   }

   public float getTransitionTicks() {
      return this.transitionTicks;
   }

   public void setLength(float value) {
      this.animationLength = value;
      this.animationTime = value;
      this.looping = false;
      this.syncToClient();
   }

   public void setTransitionTicks(int value) {
      this.transitionTicks = value;
      this.syncToClient();
   }

   @Override
   public void tick() {
      this.tickCount++;
      this.amountO = this.amount;
      this.progressO = this.progress();
      if (this.temporaryLock > 0.0F) {
         this.temporaryLock -= 0.05F;
      }

      if (!this.looping && !(this.animationTime > 0.0F) && !(this.amount > 0.0F)) {
         this.animationTime = 0.0F;
      } else {
         this.animationTime -= 0.05F;
         this.loopTime++;
         if (!this.isLooping() && this.isProgressAt(this.animationLength)) {
            this.finish();
         }

         if (!this.looping && !(this.animationTime > 0.0F)) {
            if (this.transitionTicks <= 0) {
               this.amount = 0.0F;
               this.amountO = this.amount;
            } else {
               this.amount = Mth.clamp(this.amount - 1.0F / this.transitionTicks, 0.0F, 1.0F);
            }
         } else if (this.transitionTicks <= 0) {
            this.amount = 1.0F;
            this.amountO = this.amount;
         } else {
            this.amount = Mth.clamp(this.amount + 1.0F / this.transitionTicks, 0.0F, 1.0F);
         }
      }
   }

   protected void finish() {
      if (this.onFinish != null) {
         this.onFinish.run();
      }
   }

   // ponytail: only the modifiers the ported animations read (life_time, anim_time); add actor_count/time_of_day/moon_phase if a new animation needs them
   @Override
   public void clientUpdate() {
      this.modifiers.put("life_time", AdvancedAnimationUtils.getTick(this.tickCount));
      this.modifiers.put("anim_time", AdvancedAnimationUtils.getTick(this.progress()));
   }

   @Override
   public Map<String, Float> getModifiers() {
      return this.modifiers;
   }

   public float lerpAmount() {
      return Mth.lerp(AdvancedAnimationUtils.partialTick(), this.amountO, this.amount);
   }

   public float lerpProgress() {
      return Mth.lerp(AdvancedAnimationUtils.partialTick(), this.progressO, this.progress());
   }

   @Override
   public AdvancedAnimationTracker getTracker() {
      return this.tracker;
   }

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public void setTracker(AdvancedAnimationTracker tracker) {
      this.tracker = tracker;
   }

   @Override
   public void setName(String name) {
      this.name = name;
   }

   @Override
   public void write(FriendlyByteBuf buf) {
      buf.writeFloat(this.animationTime);
      buf.writeFloat(this.animationLength);
      buf.writeInt(this.transitionTicks);
      buf.writeFloat(this.amount);
      buf.writeFloat(this.amountO);
      buf.writeBoolean(this.looping);
      buf.writeFloat(this.temporaryLock);
      buf.writeBoolean(this.lock);
      buf.writeBoolean(this.holdOnLastFrame);
   }

   @Override
   public void read(FriendlyByteBuf buf) {
      this.animationTime = buf.readFloat();
      this.animationLength = buf.readFloat();
      this.transitionTicks = buf.readInt();
      this.amount = buf.readFloat();
      this.amountO = buf.readFloat();
      this.looping = buf.readBoolean();
      this.temporaryLock = buf.readFloat();
      this.lock = buf.readBoolean();
      this.holdOnLastFrame = buf.readBoolean();
   }

   public abstract boolean serverSide();
}
