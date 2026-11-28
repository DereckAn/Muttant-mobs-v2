package com.alexander.mutantmore.client.armour;

import com.alexander.mutantmore.client.armour.ArmourWearingModel.Part;
import com.mojang.blaze3d.vertex.PoseStack;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.client.renderer.entity.layers.EquipmentLayerRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.component.DataComponents;
import net.minecraft.util.Unit;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.Equippable;

/**
 * Port of the original AdvancedArmourLayer: draws each vanilla armour piece as a single humanoid part,
 * moved onto the mutant's bones by {@link ArmourWearingModel#translateArmour}.
 * Each piece has its own baked model because 26.x renders models later, so per-call visibility toggling would not work.
 */
public class MutantArmourLayer<S extends LivingEntityRenderState & ArmourRenderState, M extends EntityModel<S> & ArmourWearingModel>
   extends RenderLayer<S, M> {
   private record Piece(Part part, boolean inner, EquipmentSlot slot, Model.Simple model) {}

   private final EquipmentLayerRenderer equipmentRenderer;
   private final List<Piece> pieces = List.of(
      piece(Part.BODY, true, EquipmentSlot.LEGS, "body"),
      piece(Part.RIGHT_LEG, true, EquipmentSlot.LEGS, "right_leg"),
      piece(Part.LEFT_LEG, true, EquipmentSlot.LEGS, "left_leg"),
      piece(Part.HEAD, false, EquipmentSlot.HEAD, "head"),
      piece(Part.BODY, false, EquipmentSlot.CHEST, "body"),
      piece(Part.RIGHT_ARM, false, EquipmentSlot.CHEST, "right_arm"),
      piece(Part.LEFT_ARM, false, EquipmentSlot.CHEST, "left_arm"),
      piece(Part.RIGHT_LEG, false, EquipmentSlot.FEET, "right_leg"),
      piece(Part.LEFT_LEG, false, EquipmentSlot.FEET, "left_leg")
   );

   public MutantArmourLayer(RenderLayerParent<S, M> renderer, EquipmentLayerRenderer equipmentRenderer) {
      super(renderer);
      this.equipmentRenderer = equipmentRenderer;
   }

   private static Piece piece(Part part, boolean inner, EquipmentSlot slot, String humanoidPart) {
      MeshDefinition mesh = HumanoidModel.createMesh(new CubeDeformation(inner ? 0.5F : 1.0F), 0.0F);
      if (part == Part.HEAD) {
         mesh.getRoot().retainPartsAndChildren(Set.of(humanoidPart));
      } else {
         mesh.getRoot().retainExactParts(Set.of(humanoidPart));
      }
      return new Piece(part, inner, slot, new Model.Simple(LayerDefinition.create(mesh, 64, 32).bakeRoot(), RenderTypes::armorCutoutNoCull));
   }

   /** Adds the armour layer plus vanilla's head-item layer (skulls, pumpkins, banners...) to a mutant renderer. */
   public static <S extends LivingEntityRenderState & ArmourRenderState, M extends EntityModel<S> & ArmourWearingModel> void addTo(
      LivingEntityRenderer<?, S, M> renderer, EntityRendererProvider.Context context, Consumer<RenderLayer<S, M>> addLayer
   ) {
      addLayer.accept(new MutantArmourLayer<>(renderer, context.getEquipmentRenderer()));
      addLayer.accept(new CustomHeadLayer<>(renderer, context.getModelSet(), context.getPlayerSkinRenderCache()));
   }

   public static void extract(LivingEntity entity, ArmourRenderState state) {
      for (EquipmentSlot slot : new EquipmentSlot[]{EquipmentSlot.FEET, EquipmentSlot.LEGS, EquipmentSlot.CHEST, EquipmentSlot.HEAD}) {
         ItemStack stack = entity.getItemBySlot(slot);
         state.armour()[slot.getIndex()] = HumanoidArmorLayer.shouldRender(stack, slot) ? stack.copy() : ItemStack.EMPTY;
      }
   }

   @Override
   public void submit(PoseStack poseStack, SubmitNodeCollector collector, int lightCoords, S state, float yRot, float xRot) {
      for (Piece piece : this.pieces) {
         ItemStack stack = state.armour()[piece.slot.getIndex()];
         Equippable equippable = stack == null ? null : stack.get(DataComponents.EQUIPPABLE);
         if (equippable == null || equippable.assetId().isEmpty()) {
            continue;
         }
         poseStack.pushPose();
         this.getParentModel().translateArmour(piece.part, poseStack, piece.inner);
         this.equipmentRenderer.renderLayers(
            piece.inner ? EquipmentClientInfo.LayerType.HUMANOID_LEGGINGS : EquipmentClientInfo.LayerType.HUMANOID,
            equippable.assetId().get(), piece.model, Unit.INSTANCE, stack, poseStack, collector, lightCoords, state.outlineColor
         );
         poseStack.popPose();
      }
   }
}
