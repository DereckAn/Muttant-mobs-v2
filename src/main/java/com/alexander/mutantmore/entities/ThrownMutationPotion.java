package com.alexander.mutantmore.entities;

import com.alexander.mutantmore.init.EntityTypeInit;
import com.alexander.mutantmore.init.ItemInit;
import com.alexander.mutantmore.init.SoundEventInit;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;

/** Thrown Formula Y / Compound Z: releases a Mutation Cloud; an unfinished (unstable) brew just explodes. */
public class ThrownMutationPotion extends ThrowableItemProjectile {
   public ThrownMutationPotion(EntityType<? extends ThrownMutationPotion> type, Level level) {
      super(type, level);
   }

   public ThrownMutationPotion(Level level, LivingEntity owner, ItemStack stack) {
      super(EntityTypeInit.THROWN_MUTATION_POTION, owner, level, stack);
   }

   public ThrownMutationPotion(Level level, double x, double y, double z, ItemStack stack) {
      super(EntityTypeInit.THROWN_MUTATION_POTION, x, y, z, level, stack);
   }

   @Override
   protected Item getDefaultItem() {
      return ItemInit.INCOMPLETE_FORMULA_Y;
   }

   @Override
   protected double getDefaultGravity() {
      return 0.05;
   }

   @Override
   public void handleEntityEvent(byte id) {
      if (id == 3) {
         for (int i = 0; i < 8; i++) {
            this.level().addParticle(new ItemParticleOption(ParticleTypes.ITEM, this.getItem().getItem()), this.getX(), this.getY(), this.getZ(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void onHit(HitResult result) {
      super.onHit(result);
      if (!(this.level() instanceof ServerLevel level)) {
         return;
      }

      ItemStack stack = this.getItem();
      if (stack.is(ItemInit.INCOMPLETE_FORMULA_Y)) {
         level.explode(null, this.getX(), this.getY(), this.getZ(), 1.5F, Level.ExplosionInteraction.BLOCK);
      } else if (stack.is(ItemInit.INCOMPLETE_COMPOUND_Z)) {
         level.explode(null, this.getX(), this.getY(), this.getZ(), 3.0F, Level.ExplosionInteraction.BLOCK);
      } else {
         MutationCloud.PotionType type = MutationCloud.PotionType.byItem(stack.getItem());
         if (type != null) {
            MutationCloud cloud = new MutationCloud(level, this.getOwner(), type);
            cloud.snapTo(this.blockPosition(), 0.0F, 0.0F);
            level.addFreshEntity(cloud);
         }

         level.broadcastEntityEvent(this, (byte)3);
         level.levelEvent(2007, this.blockPosition(), 3673433);
         this.playSound(SoundEvents.SPLASH_POTION_BREAK, 1.0F, 0.75F);
         this.playSound(stack.is(ItemInit.COMPOUND_Z) ? SoundEventInit.COMPOUND_Z_LAND : SoundEventInit.FORMULA_Y_LAND, 1.0F, 1.0F);
      }

      this.discard();
   }
}
