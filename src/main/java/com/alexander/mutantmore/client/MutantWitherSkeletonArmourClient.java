package com.alexander.mutantmore.client;

import com.alexander.mutantmore.init.BlockEntityTypeInit;
import com.alexander.mutantmore.init.ItemInit;
import com.alexander.mutantmore.models.armour.MutantWitherSkeletonArmourModel;
import com.alexander.mutantmore.models.blockentities.CustomSkullModel;
import com.alexander.mutantmore.renderers.blockentities.CustomSkullBlockRenderer;
import com.alexander.mutantmore.renderers.items.CustomSkullSpecialRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.special.SpecialModelRenderers;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;

/** Mutant Wither Skeleton armour on players (was IClientItemExtensions), the placed skull and the skull item. */
public final class MutantWitherSkeletonArmourClient {
   public static final ModelLayerLocation ARMOUR_LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "mutant_wither_skeleton_armour"), "main");
   private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/armour/mutant_wither_skeleton_armour.png");

   private MutantWitherSkeletonArmourClient() {
   }

   public static void register() {
      ModelLayerRegistry.registerModelLayer(ARMOUR_LAYER, MutantWitherSkeletonArmourModel::createBodyLayer);
      ModelLayerRegistry.registerModelLayer(CustomSkullModel.LAYER, CustomSkullModel::createBodyLayer);
      armour(ItemInit.MUTANT_WITHER_SKELETON_SKULL, EquipmentSlot.HEAD);
      armour(ItemInit.MUTANT_WITHER_SKELETON_CHESTPLATE, EquipmentSlot.CHEST);
      armour(ItemInit.MUTANT_WITHER_SKELETON_LEGGINGS, EquipmentSlot.LEGS);
      armour(ItemInit.MUTANT_WITHER_SKELETON_BOOTS, EquipmentSlot.FEET);
      BlockEntityRenderers.register(BlockEntityTypeInit.CUSTOM_SKULL, CustomSkullBlockRenderer::new);
      SpecialModelRenderers.ID_MAPPER.put(CustomSkullSpecialRenderer.ID, CustomSkullSpecialRenderer.Unbaked.MAP_CODEC);
   }

   private static void armour(Item item, EquipmentSlot slot) {
      ArmorRenderer.register(context -> {
         MutantWitherSkeletonArmourModel model = new MutantWitherSkeletonArmourModel(context.bakeLayer(ARMOUR_LAYER), slot);
         return (poseStack, collector, stack, state, equipmentSlot, light, wearerModel) -> ArmorRenderer.submitTransformCopyingModel(
            wearerModel, state, model, state, false, collector, poseStack, RenderTypes.armorCutoutNoCull(TEXTURE), light, OverlayTexture.NO_OVERLAY, state.outlineColor
         );
      }, item);
   }
}
