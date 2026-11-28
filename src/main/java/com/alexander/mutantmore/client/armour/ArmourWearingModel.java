package com.alexander.mutantmore.client.armour;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.HeadedModel;
import net.minecraft.client.model.geom.ModelPart;

/** A mutant model that can position vanilla armour pieces on its own bones. */
public interface ArmourWearingModel extends HeadedModel {
   enum Part { HEAD, BODY, LEFT_ARM, RIGHT_ARM, LEFT_LEG, RIGHT_LEG }

   void translateArmour(Part part, PoseStack stack, boolean innerModel);

   @Override
   default void translateToHead(PoseStack poseStack) {
      this.translateArmour(Part.HEAD, poseStack, false);
   }

   /** Applies the transforms of each named bone in turn (the original's allParts + translateAndRotateForAllParts). */
   static void through(ModelPart root, PoseStack stack, String... names) {
      for (String name : names) {
         ModelPart part = find(root, name);
         if (part != root) {
            part.translateAndRotate(stack);
         }
      }
   }

   /** First descendant with this name, or {@code root} when there is none. */
   static ModelPart find(ModelPart root, String name) {
      for (ModelPart part : root.getAllParts()) {
         if (part.hasChild(name)) {
            return part.getChild(name);
         }
      }
      return root;
   }
}
