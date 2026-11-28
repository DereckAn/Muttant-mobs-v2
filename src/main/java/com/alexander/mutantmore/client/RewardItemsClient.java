package com.alexander.mutantmore.client;

import com.alexander.mutantmore.items.LeafblowerItem;
import com.alexander.mutantmore.items.MutantShulkerShieldItem;
import com.alexander.mutantmore.models.items.LeafblowerModel;
import com.alexander.mutantmore.network.RewardActionPayload;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

/** Attack-key actions of the Mutant Shulker Shield and Leafblower, and the per-player animation timers their item renderers read. */
public final class RewardItemsClient {
   private static final int CYCLE = 7200;
   /** ticks since each player's shield last fired */
   private static final Map<UUID, Integer> SHIELD_SHOTS = new HashMap<>();
   private static final Map<UUID, int[]> LEAFBLOWER_SWITCHES = new HashMap<>();

   private RewardItemsClient() {
   }

   public static void register() {
      LeafblowerItem.foliageColour = (level, pos) -> level instanceof net.minecraft.client.multiplayer.ClientLevel client ? BiomeColors.getAverageFoliageColor(client, pos) : 0x48B518;
   }

   public static void tick(Minecraft mc) {
      SHIELD_SHOTS.replaceAll((id, t) -> t + 1);
      SHIELD_SHOTS.values().removeIf(t -> t > MutantShulkerShieldItem.SHOOT_ANIMATION_LENGTH);
      LEAFBLOWER_SWITCHES.values().forEach(s -> s[1]++);
      LEAFBLOWER_SWITCHES.values().removeIf(s -> s[1] > 6);
      Player player = mc.player;
      if (player == null || mc.gui.screen() != null || !mc.options.keyAttack.isDown()) {
         return;
      }

      ItemStack using = player.getUseItem();
      if (player.isUsingItem() && using.getItem() instanceof MutantShulkerShieldItem && !player.getCooldowns().isOnCooldown(using) && !SHIELD_SHOTS.containsKey(player.getUUID())) {
         SHIELD_SHOTS.put(player.getUUID(), 0);
         ClientPlayNetworking.send(new RewardActionPayload(RewardActionPayload.Action.SHIELD_SHOOT));
      }

      ItemStack held = player.getMainHandItem();
      if (!player.isUsingItem() && held.getItem() instanceof LeafblowerItem && !LEAFBLOWER_SWITCHES.containsKey(player.getUUID())) {
         // switching to suck (1) when currently blowing, else to blow (2); the server flips the item's mode
         LEAFBLOWER_SWITCHES.put(player.getUUID(), new int[]{LeafblowerItem.isBlowing(held) ? 1 : 2, 0});
         ClientPlayNetworking.send(new RewardActionPayload(RewardActionPayload.Action.LEAFBLOWER_SWAP));
      }
   }

   /** Rendered stacks are the holder's own stack objects, so find who holds it. */
   private static Player holder(ItemStack stack) {
      Minecraft mc = Minecraft.getInstance();
      if (mc.level != null) {
         for (Player player : mc.level.players()) {
            if (player.getMainHandItem() == stack || player.getOffhandItem() == stack) {
               return player;
            }
         }
      }

      return null;
   }

   public static int shieldShootTick(ItemStack stack) {
      Player player = holder(stack);
      return player == null ? -1 : SHIELD_SHOTS.getOrDefault(player.getUUID(), -1);
   }

   public static LeafblowerModel.State leafblowerState(ItemStack stack) {
      Player player = holder(stack);
      if (player == null) {
         return LeafblowerModel.State.STILL;
      }

      int[] switching = LEAFBLOWER_SWITCHES.get(player.getUUID());
      return new LeafblowerModel.State(
         !LeafblowerItem.isBlowing(stack),
         player.isUsingItem() && player.getUseItem() == stack,
         switching == null ? 0 : switching[0],
         switching == null ? 0 : switching[1],
         player.tickCount % CYCLE
      );
   }
}
