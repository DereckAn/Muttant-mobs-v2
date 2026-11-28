package com.alexander.mutantmore.items;

import com.alexander.mutantmore.entities.WitherBomb;
import com.alexander.mutantmore.init.SoundEventInit;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileItem;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

/** Use on a block to place a primed Wither Bomb (triggers when something comes close); use at the air to throw one that opens on landing. */
public class WitherBombItem extends Item implements ProjectileItem {
   public WitherBombItem(Item.Properties properties) {
      super(properties);
   }

   @Override
   public InteractionResult use(Level level, Player player, InteractionHand hand) {
      ItemStack stack = player.getItemInHand(hand);
      HitResult hit = getPlayerPOVHitResult(level, player, ClipContext.Fluid.ANY);
      if (hit.getType() == HitResult.Type.MISS) {
         level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEventInit.WITHER_BOMB_THROW, SoundSource.PLAYERS, 0.5F, 1.0F);
         if (!level.isClientSide()) {
            WitherBomb bomb = new WitherBomb(level, player);
            bomb.setThrown(true);
            bomb.shootFromRotation(player, player.getXRot(), player.getYRot(), -10.0F, 0.5F, 1.0F);
            level.addFreshEntity(bomb);
         }

         player.awardStat(Stats.ITEM_USED.get(this));
         stack.consume(1, player);
         return InteractionResult.SUCCESS;
      }

      // Don't place when looking at an entity right in front of you (like a boat)
      Vec3 view = player.getViewVector(1.0F);
      Vec3 eye = player.getEyePosition();
      for (Entity entity : level.getEntities(player, player.getBoundingBox().expandTowards(view.scale(5.0)).inflate(1.0), EntitySelector.NO_SPECTATORS.and(Entity::isPickable))) {
         if (entity.getBoundingBox().inflate(entity.getPickRadius()).contains(eye)) {
            return InteractionResult.PASS;
         }
      }

      if (hit.getType() != HitResult.Type.BLOCK) {
         return InteractionResult.PASS;
      }

      WitherBomb bomb = new WitherBomb(level, player);
      bomb.setThrown(false);
      bomb.setYRot(player.getRandom().nextInt(360));
      bomb.snapTo(hit.getLocation());
      if (!level.noCollision(bomb, bomb.getBoundingBox())) {
         return InteractionResult.FAIL;
      }

      if (!level.isClientSide()) {
         level.addFreshEntity(bomb);
         level.gameEvent(player, GameEvent.ENTITY_PLACE, hit.getLocation());
         stack.consume(1, player);
      }

      player.awardStat(Stats.ITEM_USED.get(this));
      return InteractionResult.SUCCESS;
   }

   @Override
   public Projectile asProjectile(Level level, Position position, ItemStack stack, Direction direction) {
      WitherBomb bomb = new WitherBomb(level, position.x(), position.y(), position.z());
      bomb.setThrown(true);
      return bomb;
   }

   @Override
   public ProjectileItem.DispenseConfig createDispenseConfig() {
      return ProjectileItem.DispenseConfig.builder().uncertainty(6.0F * 0.75F).power(1.1F * 0.5F).build();
   }
}
