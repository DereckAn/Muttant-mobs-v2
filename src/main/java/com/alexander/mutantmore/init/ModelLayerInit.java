package com.alexander.mutantmore.init;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.Identifier;

public class ModelLayerInit {
   public static final ModelLayerLocation MUTANT_HOGLIN = register("mutant_hoglin");

   private static ModelLayerLocation register(String name) {
      return new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", name), "main");
   }
}
