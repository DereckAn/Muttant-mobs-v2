package com.alexander.mutantmore.mixin.client;

import com.alexander.mutantmore.client.JungleZombieArmClient;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HumanoidModel.class)
public abstract class HumanoidModelMixin {
   @Shadow
   @Final
   public ModelPart head;
   @Shadow
   @Final
   public ModelPart rightArm;
   @Shadow
   @Final
   public ModelPart leftArm;

   @Inject(method = "poseRightArm(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", at = @At("RETURN"))
   private void mutantmore$poseRightArm(HumanoidRenderState state, CallbackInfo ci) {
      if (state instanceof AvatarRenderState avatar && JungleZombieArmClient.raisesArm(avatar.id, state.rightHandItemStack)) {
         this.rightArm.yRot = -0.1F + this.head.yRot;
         this.rightArm.xRot = (float) (-Math.PI / 2) + this.head.xRot;
      }
   }

   @Inject(method = "poseLeftArm(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", at = @At("RETURN"))
   private void mutantmore$poseLeftArm(HumanoidRenderState state, CallbackInfo ci) {
      if (state instanceof AvatarRenderState avatar && JungleZombieArmClient.raisesArm(avatar.id, state.leftHandItemStack)) {
         this.leftArm.yRot = 0.1F + this.head.yRot;
         this.leftArm.xRot = (float) (-Math.PI / 2) + this.head.xRot;
      }
   }
}
