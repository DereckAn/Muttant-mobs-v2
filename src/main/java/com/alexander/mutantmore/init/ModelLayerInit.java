package com.alexander.mutantmore.init;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.Identifier;

public class ModelLayerInit {
   public static final ModelLayerLocation MUTANT_HOGLIN = register("mutant_hoglin");
   public static final ModelLayerLocation MUTANT_JUNGLE_ZOMBIE = register("mutant_jungle_zombie");
   public static final ModelLayerLocation MUTANT_HUSK = register("mutant_husk");
   public static final ModelLayerLocation HOG_HELM = register("hog_helm");
   public static final ModelLayerLocation MUTANT_FROZEN_ZOMBIE = register("mutant_frozen_zombie");
   public static final ModelLayerLocation ICICLE_SPIKE = register("icicle_spike");
   public static final ModelLayerLocation THROWN_ICICLE = register("thrown_icicle");
   public static final ModelLayerLocation GIANT_SNOWBALL = register("giant_snowball");
   public static final ModelLayerLocation SAND_BOULDER = register("sand_boulder");
   public static final ModelLayerLocation ZOMBIE_RESURRECTION = register("zombie_resurrection");
   public static final ModelLayerLocation SENTRY_VINE = register("sentry_vine");
   public static final ModelLayerLocation MUTANT_JUNGLE_ZOMBIE_ARM = register("mutant_jungle_zombie_arm");

   private static ModelLayerLocation register(String name) {
      return new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", name), "main");
   }
}
