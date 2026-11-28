package com.alexander.mutantmore.client.armour;

import net.minecraft.world.item.ItemStack;

/** Render state that carries the worn armour, indexed by {@code EquipmentSlot.getIndex()} (feet 0 .. head 3). */
public interface ArmourRenderState {
   ItemStack[] armour();
}
