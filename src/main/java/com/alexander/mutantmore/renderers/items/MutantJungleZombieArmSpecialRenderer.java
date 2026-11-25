package com.alexander.mutantmore.renderers.items;

import com.alexander.mutantmore.init.ModelLayerInit;
import com.alexander.mutantmore.items.JungleZombieArmState;
import com.alexander.mutantmore.models.items.MutantJungleZombieArmModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.special.SpecialModelRenderer;
import net.minecraft.resources.Identifier;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

/** Replaces the original BEWLR branch: animated 3D vine arm. "mode" in the item definition picks inventory / idle / held animations. */
public class MutantJungleZombieArmSpecialRenderer implements SpecialModelRenderer<MutantJungleZombieArmModel.State> {
   public static final Identifier ID = Identifier.fromNamespaceAndPath("mutantmore", "mutant_jungle_zombie_arm");
   private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("mutantmore", "textures/item/mutant_jungle_zombie_arm.png");
   private final MutantJungleZombieArmModel model;
   private final MutantJungleZombieArmModel.Mode mode;

   public MutantJungleZombieArmSpecialRenderer(MutantJungleZombieArmModel model, MutantJungleZombieArmModel.Mode mode) {
      this.model = model;
      this.mode = mode;
   }

   @Override
   public MutantJungleZombieArmModel.@Nullable State extractArgument(ItemStack stack) {
      Minecraft mc = Minecraft.getInstance();
      MutantJungleZombieArmModel.State state = new MutantJungleZombieArmModel.State();
      state.mode = this.mode;
      state.partialTick = mc.getDeltaTracker().getGameTimeDeltaPartialTick(false);
      Player holder = null;
      if (mc.level != null) {
         // The rendered stack is the holder's own stack object, so find who holds it
         for (Player player : mc.level.players()) {
            if (player.getMainHandItem() == stack || player.getOffhandItem() == stack) {
               holder = player;
               break;
            }
         }
      }

      if (holder == null) {
         state.tickCount = mc.player != null ? mc.player.tickCount : 0;
         return state;
      }

      JungleZombieArmState arm = JungleZombieArmState.of(holder);
      state.tickCount = arm.tickCount;
      state.grabAnimationState.copyFrom(arm.grabAnimationState);
      state.grabAnimationTick = arm.grabAnimationTick;
      state.releaseAnimationState.copyFrom(arm.releaseAnimationState);
      state.releaseAnimationTick = arm.releaseAnimationTick;
      state.strangleTicks = arm.strangleTicks;
      state.grabbing = arm.grabbing;
      state.standby = arm.standby;
      return state;
   }

   @Override
   public void submit(
      MutantJungleZombieArmModel.@Nullable State state,
      PoseStack poseStack,
      SubmitNodeCollector collector,
      int light,
      int overlay,
      boolean hasFoil,
      int outlineColor
   ) {
      collector.submitModel(this.model, state != null ? state : new MutantJungleZombieArmModel.State(), poseStack, TEXTURE, light, overlay, outlineColor);
   }

   @Override
   public void getExtents(Consumer<Vector3fc> output) {
      this.model.root().getExtentsForGui(new PoseStack(), output);
   }

   public enum ModeName implements StringRepresentable {
      INVENTORY,
      IDLE,
      HELD;

      public static final Codec<ModeName> CODEC = StringRepresentable.fromEnum(ModeName::values);

      @Override
      public String getSerializedName() {
         return this.name().toLowerCase();
      }
   }

   public record Unbaked(ModeName mode) implements SpecialModelRenderer.Unbaked<MutantJungleZombieArmModel.State> {
      public static final MapCodec<Unbaked> MAP_CODEC = ModeName.CODEC.optionalFieldOf("mode", ModeName.HELD).xmap(Unbaked::new, Unbaked::mode);

      @Override
      public MapCodec<Unbaked> type() {
         return MAP_CODEC;
      }

      @Override
      public SpecialModelRenderer<MutantJungleZombieArmModel.State> bake(SpecialModelRenderer.BakingContext context) {
         return new MutantJungleZombieArmSpecialRenderer(
            new MutantJungleZombieArmModel(context.entityModelSet().bakeLayer(ModelLayerInit.MUTANT_JUNGLE_ZOMBIE_ARM)),
            MutantJungleZombieArmModel.Mode.valueOf(this.mode.name())
         );
      }
   }
}
