package com.alexander.mutantmore.client;

import com.alexander.mutantmore.init.ItemInit;
import com.alexander.mutantmore.items.JungleZombieArmState;
import com.alexander.mutantmore.items.MutantJungleZombieArmItem;
import com.alexander.mutantmore.network.ArmStranglePayload;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

/** Client half of the original MutantJungleZombieArmItem.inventoryTick + MutantJungleZombieArmActivateStrangleEvent (local player only, like the original). */
public final class JungleZombieArmClient {
   private JungleZombieArmClient() {
   }

   public static void tick(Minecraft mc) {
      LocalPlayer player = mc.player;
      if (player == null || mc.level == null) {
         return;
      }

      JungleZombieArmState state = JungleZombieArmState.of(player);
      ItemStack held = player.getMainHandItem().is(ItemInit.MUTANT_JUNGLE_ZOMBIE_ARM) ? player.getMainHandItem() : player.getOffhandItem();
      if (!held.is(ItemInit.MUTANT_JUNGLE_ZOMBIE_ARM) && !state.grabbing) {
         return;
      }

      state.tickCount++;
      state.strangleTicks--;
      boolean using = player.isUsingItem() && player.getUseItem().is(ItemInit.MUTANT_JUNGLE_ZOMBIE_ARM);
      if (using && mc.options.keyAttack.isDown()) {
         ClientPlayNetworking.send(new ArmStranglePayload());
         state.strangleTicks = 3;
      }

      if (using && !state.grabbing) {
         state.grabStartTick = state.tickCount;
         state.grabAnimationTick = MutantJungleZombieArmItem.GRAB_ANIMATION_LENGTH;
      } else if (!using && state.grabbing) {
         state.releaseStartTick = state.tickCount;
         state.releaseAnimationTick = MutantJungleZombieArmItem.RELEASE_ANIMATION_LENGTH;
      }

      state.grabbing = using;
      double reach = player.getAttributeValue(Attributes.ENTITY_INTERACTION_RANGE);
      Vec3 eye = player.getEyePosition(1.0F);
      Vec3 look = player.getViewVector(1.0F);
      AABB box = player.getBoundingBox().expandTowards(look.scale(reach)).inflate(1.0);
      boolean lookingAtMob = ProjectileUtil.getEntityHitResult(
            player, eye, eye.add(look.scale(reach)), box, e -> e instanceof LivingEntity && !e.isSpectator() && e.isPickable(), reach * reach
         )
         != null;
      state.standby = lookingAtMob && held.is(ItemInit.MUTANT_JUNGLE_ZOMBIE_ARM) && !player.getCooldowns().isOnCooldown(held);
      if (state.grabAnimationTick > 0) {
         state.grabAnimationTick--;
      }

      if (state.releaseAnimationTick > 0) {
         state.releaseAnimationTick--;
      }
   }

   /** Third-person arm raise (was HumanoidModelMixin): straight out, following the head, while aiming or grabbing. */
   public static boolean raisesArm(int entityId, ItemStack stackInArm) {
      if (!stackInArm.is(ItemInit.MUTANT_JUNGLE_ZOMBIE_ARM) || Minecraft.getInstance().level == null) {
         return false;
      }

      Entity entity = Minecraft.getInstance().level.getEntity(entityId);
      if (entity == null) {
         return false;
      }

      JungleZombieArmState state = JungleZombieArmState.of(entity);
      return state.standby || state.grabbing || entity instanceof LivingEntity living && living.isUsingItem() && living.getUseItem().is(ItemInit.MUTANT_JUNGLE_ZOMBIE_ARM);
   }
}
