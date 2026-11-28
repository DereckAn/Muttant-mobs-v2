package com.alexander.mutantmore.items;

import com.alexander.mutantmore.config.MutationCommonConfig;
import com.alexander.mutantmore.entities.ThrownMutationPotion;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;

/** Finished Formula Y / Compound Z: throw it to release a Mutation Cloud. Compound Z is heavier (lower, slower throw). */
public class MutationPotionItem extends Item implements ProjectileItem {
   private final IntSupplier mutateChance;
   private final float pitch;
   private final float upAngle;
   private final float power;

   public MutationPotionItem(Item.Properties properties, IntSupplier mutateChance, float pitch, float upAngle, float power) {
      super(properties);
      this.mutateChance = mutateChance;
      this.pitch = pitch;
      this.upAngle = upAngle;
      this.power = power;
   }

   public static MutationPotionItem formulaY(Item.Properties properties) {
      return new MutationPotionItem(properties, MutationCommonConfig.formula_y_mutate_chance::get, 0.4F, -10.0F, 1.0F);
   }

   public static MutationPotionItem compoundZ(Item.Properties properties) {
      return new MutationPotionItem(properties, MutationCommonConfig.compound_z_mutate_chance::get, 0.2F, -15.0F, 0.75F);
   }

   @Override
   public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
      tooltip.accept(Component.translatable("mutantmore.mutation_potion_complete").withStyle(ChatFormatting.GRAY));
      tooltip.accept(Component.translatable("mutantmore.mutation_potion_mutate_chance", this.mutateChance.getAsInt() + "%").withStyle(ChatFormatting.BLUE));
   }

   /** Shared throw of finished and unstable brews. */
   static InteractionResult throwPotion(Level level, Player player, InteractionHand hand, float pitch, float upAngle, float power) {
      ItemStack stack = player.getItemInHand(hand);
      level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.SPLASH_POTION_THROW, SoundSource.PLAYERS, 0.5F, pitch / (player.getRandom().nextFloat() * 0.4F + 0.8F));
      if (!level.isClientSide()) {
         ThrownMutationPotion potion = new ThrownMutationPotion(level, player, stack.copyWithCount(1));
         potion.shootFromRotation(player, player.getXRot(), player.getYRot(), upAngle, power, 1.0F);
         level.addFreshEntity(potion);
      }

      player.awardStat(Stats.ITEM_USED.get(stack.getItem()));
      stack.consume(1, player);
      return InteractionResult.SUCCESS;
   }

   @Override
   public InteractionResult use(Level level, Player player, InteractionHand hand) {
      return throwPotion(level, player, hand, this.pitch, this.upAngle, this.power);
   }

   @Override
   public Projectile asProjectile(Level level, Position position, ItemStack stack, Direction direction) {
      return new ThrownMutationPotion(level, position.x(), position.y(), position.z(), stack.copyWithCount(1));
   }

   @Override
   public ProjectileItem.DispenseConfig createDispenseConfig() {
      // Formula Y: 0.75x spread, Compound Z: 0.75x power (from the original's dispenser behaviours)
      return this.power < 1.0F
         ? ProjectileItem.DispenseConfig.builder().power(1.1F * 0.75F).build()
         : ProjectileItem.DispenseConfig.builder().uncertainty(6.0F * 0.75F).build();
   }
}
