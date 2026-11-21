package com.alexander.mutantmore.enums;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

public enum CustomBossBarTypes {
   MUTANT(
      "mutant",
      "CustomBossBarTag:mutant_more_mutant",
      Identifier.fromNamespaceAndPath("mutantmore", "textures/gui/mutant_boss_bar_background.png"),
      Identifier.fromNamespaceAndPath("mutantmore", "textures/gui/mutant_boss_bar_progress.png"),
      182,
      11,
      -1
   );

   public String name;
   public String tag;
   public Identifier backgroundTexture;
   public Identifier progressTexture;
   public int textureWidth;
   public int textureHeight;
   public int heightOffset;

   CustomBossBarTypes(
      String name, String tag, Identifier backgroundTexture, Identifier progressTexture, int textureWidth, int textureHeight, int heightOffset
   ) {
      this.name = name;
      this.tag = tag;
      this.backgroundTexture = backgroundTexture;
      this.progressTexture = progressTexture;
      this.textureWidth = textureWidth;
      this.textureHeight = textureHeight;
      this.heightOffset = heightOffset;
   }

   public static CustomBossBarTypes getTypeForComponent(Component component) {
      for (CustomBossBarTypes type : values()) {
         if (component.getString().contains(type.tag)) {
            return type;
         }
      }

      return null;
   }

   public static CustomBossBarTypes byName(String name) {
      for (CustomBossBarTypes type : values()) {
         if (name.matches(type.name)) {
            return type;
         }
      }

      return null;
   }
}
