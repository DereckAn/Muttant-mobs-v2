package com.alexander.mutantmore.init;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.Identifier;

public class ModelLayerInit {
   public static final ModelLayerLocation MUTANT_HOGLIN = register("mutant_hoglin");
   public static final ModelLayerLocation MUTANT_JUNGLE_ZOMBIE = register("mutant_jungle_zombie");
   public static final ModelLayerLocation MUTANT_HUSK = register("mutant_husk");
   public static final ModelLayerLocation SAND_BOULDER = register("sand_boulder");
   public static final ModelLayerLocation ZOMBIE_RESURRECTION = register("zombie_resurrection");
   public static final ModelLayerLocation SENTRY_VINE = register("sentry_vine");
   public static final ModelLayerLocation MUTANT_JUNGLE_ZOMBIE_ARM = register("mutant_jungle_zombie_arm");

   private static ModelLayerLocation register(String name) {
      return new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", name), "main");
   }
}
