package com.alexander.mutantmore.items;

import com.alexander.mutantmore.init.DataComponentInit;
import java.util.function.Consumer;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.Nullable;

/** Self-recharging magazine for the Adaptive Crossbow: refills one shot every getChargeInterval() seconds while carried. */
public abstract class AbstractAmmoChargeItem extends Item {
   private static final int BAR_COLOUR = net.minecraft.util.ARGB.colorFromFloat(1.0F, 0.4F, 0.4F, 1.0F);

   public AbstractAmmoChargeItem(Item.Properties properties) {
      super(properties);
   }

   public abstract String getAmmoChargeDescription();

   public abstract int getMaxAmmo();

   /** seconds per refilled shot */
   public abstract int getChargeInterval();

   public abstract Projectile getProjectile(Level level, LivingEntity owner);

   public abstract void playLoadSound(Level level, Vec3 pos, SoundSource source);

   public abstract void playShootSound(Level level, Vec3 pos, SoundSource source);

   public abstract float getShootPower();

   /** ticks */
   public abstract int getLoadDuration();

   public abstract int getDurabilityConsumption();

   public static int getAmmo(ItemStack stack) {
      return stack.getOrDefault(DataComponentInit.AMMO, 0);
   }

   public static void setAmmo(ItemStack stack, int value) {
      stack.set(DataComponentInit.AMMO, Mth.clamp(value, 0, ((AbstractAmmoChargeItem)stack.getItem()).getMaxAmmo()));
   }

   public static int getChargeTime(ItemStack stack) {
      return stack.getOrDefault(DataComponentInit.CHARGE_TIME, 0);
   }

   @Override
   public boolean isBarVisible(ItemStack stack) {
      return getAmmo(stack) < this.getMaxAmmo();
   }

   @Override
   public int getBarColor(ItemStack stack) {
      return BAR_COLOUR;
   }

   @Override
   public int getBarWidth(ItemStack stack) {
      return Mth.floor((float)getAmmo(stack) / this.getMaxAmmo() * 13.0F);
   }

   @Override
   public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable(this.getAmmoChargeDescription()).withStyle(ChatFormatting.BLUE));
      tooltip.accept(Component.translatable("mutantmore.ammo_charge.ammo", getAmmo(stack), this.getMaxAmmo()).withStyle(ChatFormatting.GRAY));
      if (getAmmo(stack) < this.getMaxAmmo()) {
         tooltip.accept(Component.translatable("mutantmore.ammo_charge.charge_time", getChargeTime(stack)).withStyle(ChatFormatting.GRAY));
      }
   }

   @Override
   public void inventoryTick(ItemStack stack, ServerLevel level, Entity owner, @Nullable EquipmentSlot slot) {
      if (owner.tickCount % 20 == 0 && getAmmo(stack) < this.getMaxAmmo()) {
         int time = getChargeTime(stack) - 1;
         if (time <= 0) {
            time = this.getChargeInterval();
            setAmmo(stack, getAmmo(stack) + 1);
         }

         stack.set(DataComponentInit.CHARGE_TIME, time);
      }
   }
}
