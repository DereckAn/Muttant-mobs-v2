package com.alexander.mutantmore.items;

import com.alexander.mutantmore.config.mutant_frozen_zombie.MutantFrozenZombieRewardsCommonConfig;
import com.alexander.mutantmore.entities.ThrownIcicle;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class IcicleAmmoChargeItem extends AbstractAmmoChargeItem {
   public IcicleAmmoChargeItem(Properties properties) {
      super(properties);
   }

   @Override
   public String getAmmoChargeDescription() {
      return "mutantmore.icicle_ammo_charge.desc";
   }

   @Override
   public int getMaxAmmo() {
      return MutantFrozenZombieRewardsCommonConfig.charge_max_ammo.get();
   }

   @Override
   public int getChargeInterval() {
      return MutantFrozenZombieRewardsCommonConfig.charge_charge_interval.get();
   }

   @Override
   public Projectile getProjectile(Level level, LivingEntity owner) {
      ThrownIcicle icicle = new ThrownIcicle(level, owner);
      icicle.damage = MutantFrozenZombieRewardsCommonConfig.charge_icicle_damage.get().floatValue();
      icicle.disableShieldLength = MutantFrozenZombieRewardsCommonConfig.charge_icicle_disable_shield_length.get();
      icicle.freezingLength = MutantFrozenZombieRewardsCommonConfig.charge_icicle_freezing_length.get();
      icicle.freezingLevel = MutantFrozenZombieRewardsCommonConfig.charge_icicle_freezing_level.get();
      return icicle;
   }

   @Override
   public float getShootPower() {
      return 3.5F;
   }

   @Override
   public void playLoadSound(Level level, Vec3 pos, SoundSource source) {
      level.playSound(null, pos.x, pos.y, pos.z, SoundEvents.AMETHYST_BLOCK_BREAK, source, 1.0F, 1.0F);
   }

   @Override
   public void playShootSound(Level level, Vec3 pos, SoundSource source) {
      level.playSound(null, pos.x, pos.y, pos.z, SoundEvents.CROSSBOW_SHOOT, source, 1.0F, 1.0F);
   }

   @Override
   public int getLoadDuration() {
      return MutantFrozenZombieRewardsCommonConfig.charge_load_duration.get();
   }

   @Override
   public int getDurabilityConsumption() {
      return MutantFrozenZombieRewardsCommonConfig.charge_durability_consumption.get();
   }
}
