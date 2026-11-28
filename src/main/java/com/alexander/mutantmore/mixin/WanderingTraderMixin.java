package com.alexander.mutantmore.mixin;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.npc.villager.AbstractVillager;
import net.minecraft.world.entity.npc.wanderingtrader.WanderingTrader;
import net.minecraft.world.item.trading.TradeSet;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/** Wandering traders always also offer a Derelict Laboratory map, if one is near (the trade drops itself otherwise). */
@Mixin(WanderingTrader.class)
public abstract class WanderingTraderMixin extends AbstractVillager {
   private static final ResourceKey<TradeSet> MUTANTMORE$LAB_MAP = ResourceKey.create(
      Registries.TRADE_SET, Identifier.fromNamespaceAndPath("mutantmore", "wandering_trader/derelict_laboratory_map")
   );

   protected WanderingTraderMixin(EntityType<? extends AbstractVillager> type, Level level) {
      super(type, level);
   }

   @Inject(method = "updateTrades", at = @At("TAIL"))
   private void mutantmore$addLabMap(ServerLevel level, CallbackInfo ci) {
      this.addOffersFromTradeSet(level, this.getOffers(), MUTANTMORE$LAB_MAP);
   }
}
