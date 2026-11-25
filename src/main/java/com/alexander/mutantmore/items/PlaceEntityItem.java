package com.alexander.mutantmore.items;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

/**
 * Right-click the ground to place an entity there (Sentry Vine, Mutant Shulker Turret, Mutant Shulker Trap).
 * Replaces three near-identical original items; ponytail: the trap no longer converts spawners or floats on water like a spawn egg did.
 */
public class PlaceEntityItem extends Item {
   private final Supplier<? extends EntityType<?>> type;
   private final String tooltipKey;
   private final BiConsumer<Entity, Player> onPlaced;

   public PlaceEntityItem(Properties properties, Supplier<? extends EntityType<?>> type, String tooltipKey, BiConsumer<Entity, Player> onPlaced) {
      super(properties);
      this.type = type;
      this.tooltipKey = tooltipKey;
      this.onPlaced = onPlaced;
   }

   @Override
   @SuppressWarnings("deprecation")
   public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.desc.abilities").withStyle(ChatFormatting.GRAY));
      tooltip.accept(Component.translatable("mutantmore." + this.tooltipKey + ".desc", Component.keybind("key.use")).withStyle(ChatFormatting.BLUE));
      tooltip.accept(Component.translatable("mutantmore.desc.interactions").withStyle(ChatFormatting.GRAY));
      String interactions = Component.translatable("mutantmore." + this.tooltipKey + ".interactions", Component.keybind("key.use"), Component.keybind("key.sneak")).getString();
      for (String line : interactions.split("\n")) {
         tooltip.accept(Component.literal(line).withStyle(ChatFormatting.BLUE));
      }
   }

   @Override
   public InteractionResult use(Level level, Player player, InteractionHand hand) {
      ItemStack stack = player.getItemInHand(hand);
      HitResult hit = getPlayerPOVHitResult(level, player, ClipContext.Fluid.ANY);
      if (hit.getType() != HitResult.Type.BLOCK) {
         return InteractionResult.PASS;
      }

      // Don't place while standing inside another entity's hitbox in front of you
      Vec3 view = player.getViewVector(1.0F);
      Vec3 eye = player.getEyePosition();
      List<Entity> near = level.getEntities(player, player.getBoundingBox().expandTowards(view.scale(5.0)).inflate(1.0), EntitySelector.NO_SPECTATORS.and(Entity::isPickable));
      for (Entity entity : near) {
         if (entity.getBoundingBox().inflate(entity.getPickRadius()).contains(eye)) {
            return InteractionResult.PASS;
         }
      }

      Entity entity = this.type.get().create(level, EntitySpawnReason.SPAWN_ITEM_USE);
      if (entity == null) {
         return InteractionResult.FAIL;
      }

      entity.snapTo(BlockPos.containing(hit.getLocation()), 0.0F, 0.0F);
      if (!level.noCollision(entity, entity.getBoundingBox())) {
         return InteractionResult.FAIL;
      }

      if (!level.isClientSide()) {
         this.onPlaced.accept(entity, player);
         level.addFreshEntity(entity);
         level.gameEvent(player, GameEvent.ENTITY_PLACE, hit.getLocation());
         stack.consume(1, player);
      }

      player.awardStat(Stats.ITEM_USED.get(this));
      return InteractionResult.SUCCESS;
   }
}
