package com.alexander.mutantmore.items;

import com.alexander.mutantmore.config.mutant_jungle_zombie.MutantJungleZombieRewardsCommonConfig;
import com.alexander.mutantmore.init.DataComponentInit;
import com.alexander.mutantmore.init.MMDamageTypes;
import com.alexander.mutantmore.init.ParticleTypeInit;
import com.alexander.mutantmore.init.TagInit;
import com.alexander.mutantmore.particles.AdvancedParticleOption;
import com.alexander.mutantmore.util.MiscUtils;
import com.alexander.mutantmore.util.PositionUtils;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

/** Hold use to suck mobs/items in (and break leaves), or, in blow mode, spray poison; attack toggles the mode. */
public class LeafblowerItem extends Item {
   /** Client sets this to the biome foliage colour at a position (for the suction particles). */
   public static java.util.function.BiFunction<Level, BlockPos, Integer> foliageColour = (level, pos) -> 0x48B518;

   public LeafblowerItem(Item.Properties properties) {
      super(properties);
   }

   public static boolean isBlowing(ItemStack stack) {
      return stack.getOrDefault(DataComponentInit.LEAFBLOWER_BLOWING, false);
   }

   @Override
   public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.desc.abilities").withStyle(ChatFormatting.GRAY));
      tooltip.accept(Component.translatable("mutantmore.leafblower.desc", Component.keybind("key.attack"), Component.keybind("key.use")).withStyle(ChatFormatting.BLUE));
   }

   @Override
   public InteractionResult use(Level level, Player player, InteractionHand hand) {
      player.startUsingItem(hand);
      player.getItemInHand(hand).hurtAndBreak(MutantJungleZombieRewardsCommonConfig.leafblower_use_durability_consumption.get(), player, hand);
      return InteractionResult.CONSUME;
   }

   @Override
   public int getUseDuration(ItemStack stack, LivingEntity user) {
      return MutantJungleZombieRewardsCommonConfig.leafblower_max_use_duration.get();
   }

   @Override
   public ItemUseAnimation getUseAnimation(ItemStack stack) {
      return ItemUseAnimation.NONE;
   }

   // Cooldown starts once you stop (or run out of) using it
   @Override
   public boolean releaseUsing(ItemStack stack, Level level, LivingEntity user, int remainingTime) {
      this.startCooldown(stack, user);
      return true;
   }

   @Override
   public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity user) {
      this.startCooldown(stack, user);
      return stack;
   }

   private void startCooldown(ItemStack stack, LivingEntity user) {
      if (user instanceof Player player) {
         player.getCooldowns().addCooldown(
            stack,
            isBlowing(stack) ? MutantJungleZombieRewardsCommonConfig.leafblower_blow_cooldown.get() : MutantJungleZombieRewardsCommonConfig.leafblower_suck_cooldown.get()
         );
      }
   }

   private static boolean canAffect(Entity target, Entity owner) {
      return MiscUtils.canHarmBasedOnTeamAndTag(TagInit.EntityTypes.LEAFBLOWER_CANT_AFFECT, owner, target, owner, entity -> entity instanceof Player);
   }

   @Override
   public void onUseTick(Level level, LivingEntity user, ItemStack stack, int ticksRemaining) {
      if (ticksRemaining >= this.getUseDuration(stack, user) - 1) {
         return;
      }

      int range = MutantJungleZombieRewardsCommonConfig.leafblower_shoot_range.get();
      for (int i = 2; i < 2 + range; i++) {
         Vec3 centre = PositionUtils.getOffsetPos(user, 0.0, user.getEyeHeight() - 0.5, i, user.getXRot(), user.yHeadRot);
         AABB box = new AABB(centre.add(-1.0, -1.0, -1.0), centre.add(1.0, 1.0, 1.0));
         if (isBlowing(stack)) {
            blow(level, user, box, i == 2, range);
         } else {
            suck(level, user, centre, box);
         }
      }
   }

   private static void blow(Level level, LivingEntity user, AABB box, boolean firstBox, int range) {
      if (level.isClientSide()) {
         if (firstBox) {
            Vec3 pos = PositionUtils.getOffsetPos(user, user.getUsedItemHand() == InteractionHand.MAIN_HAND ? 0.4 : -0.4, user.getEyeHeight() - 0.7, 0.5, user.getXRot(), user.yHeadRot);
            Vec3 motion = PositionUtils.getOffsetMotion(
               user, user.getRandom().nextGaussian() * 0.1, user.getRandom().nextGaussian() * 0.1, (2 + range) / 10, user.getXRot(), user.yHeadRot
            );
            level.addParticle(ParticleTypeInit.POISON_CLOUD, pos.x, pos.y, pos.z, motion.x, motion.y, motion.z);
         }

         return;
      }

      float damage = MutantJungleZombieRewardsCommonConfig.leafblower_poison_damage.get().floatValue();
      for (LivingEntity target : level.getEntitiesOfClass(LivingEntity.class, box)) {
         float amount = Mth.clamp(damage, 0.0F, target.getHealth() - 1.0F);
         if (target != user && canAffect(target, user) && user.hasLineOfSight(target) && target.canBeAffected(new MobEffectInstance(MobEffects.POISON)) && amount > 0.0F) {
            target.hurtServer((ServerLevel)level, MMDamageTypes.poisonCloud(user.damageSources()), amount);
         }
      }
   }

   private static void suck(Level level, LivingEntity user, Vec3 centre, AABB box) {
      for (Entity target : level.getEntities(user, box)) {
         if (canAffect(target, user) && user.hasLineOfSight(target)) {
            double x = user.getEyePosition().x - target.getX();
            double y = user.getEyePosition().y - 0.5 - target.getY();
            double z = user.getEyePosition().z - target.getZ();
            double d = Math.sqrt(x * x + y * y + z * z);
            target.setDeltaMovement(
               target.getDeltaMovement()
                  .add(new Vec3(x / d, y / d, z / d).multiply(0.025, 0.035, 0.025).scale(target instanceof ItemEntity ? 1.75 : Mth.clamp(1.0F - target.getBbWidth(), 0.0F, 1.0F)))
            );
         }
      }

      if (level.isClientSide() && user.getRandom().nextInt(10) == 0) {
         Vec3 mouth = PositionUtils.getOffsetPos(user.getEyePosition(), 0.25, -0.4, 1.25, user.getXRot(), user.yHeadRot);
         IntUnaryOperator darken = c -> net.minecraft.util.ARGB.colorFromFloat(
            1.0F, net.minecraft.util.ARGB.redFloat(c) * 0.75F, net.minecraft.util.ARGB.greenFloat(c) * 0.75F, net.minecraft.util.ARGB.blueFloat(c) * 0.75F
         );
         // ponytail: was 1 in 5 biome fog colour; a pale sky grey stands in for it
         int colour = darken.applyAsInt(user.getRandom().nextInt(5) == 0 ? 0xC0D8FF : foliageColour.apply(level, user.blockPosition()));
         Vec3 from = new Vec3(
            centre.x + user.getRandom().nextGaussian() * box.getXsize(), centre.y + user.getRandom().nextGaussian() * box.getYsize(), centre.z + user.getRandom().nextGaussian() * box.getZsize()
         );
         level.addParticle(
            new AdvancedParticleOption(ParticleTypeInit.ABSORB, List.of(0.0F, (float)colour, 0.1F, 10.0F, (float)from.x, (float)from.y, (float)from.z)),
            mouth.x, mouth.y, mouth.z, 0.0, 0.0, 0.0
         );
      }

      if (!level.isClientSide()) {
         for (BlockPos pos : BlockPos.betweenClosed(
            Mth.floor(box.minX), Mth.floor(box.minY), Mth.floor(box.minZ), Mth.floor(box.maxX), Mth.floor(box.maxY), Mth.floor(box.maxZ)
         )) {
            if (level.getBlockState(pos).is(TagInit.Blocks.REMOVED_BY_LEAFBLOWER) && user.getRandom().nextInt(20) == 0) {
               level.destroyBlock(pos, true);
            }
         }
      }
   }
}
