package com.alexander.mutantmore.models.items;

import com.alexander.mutantmore.animation.keyframe_animations.definition.MutantJungleZombieArmKeyframeAnimations;
import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import com.alexander.mutantmore.animation.sine_wave_animations.definition.MutantJungleZombieArmSineWaveAnimations;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.world.entity.AnimationState;

public class MutantJungleZombieArmModel extends Model<MutantJungleZombieArmModel.State> {
   public final ModelPart everything;
   public final ModelPart vine1;
   public final ModelPart vine2;
   public final ModelPart vine3;
   public final ModelPart vine4;
   public final ModelPart vine5;
   private final KeyframeAnimation grab;
   private final KeyframeAnimation release;
   private final AnimationState scratch = new AnimationState();

   public MutantJungleZombieArmModel(ModelPart root) {
      super(root, RenderTypes::entityCutout);
      this.everything = root.getChild("everything");
      this.vine1 = this.everything.getChild("vine1");
      this.vine2 = this.vine1.getChild("vine2");
      this.vine3 = this.vine2.getChild("vine3");
      this.vine4 = this.vine3.getChild("vine4");
      this.vine5 = this.vine4.getChild("vine5");
      this.grab = MutantJungleZombieArmKeyframeAnimations.MUTANT_JUNGLE_ZOMBIE_ARM_GRAB.bake(root);
      this.release = MutantJungleZombieArmKeyframeAnimations.MUTANT_JUNGLE_ZOMBIE_ARM_RELEASE.bake(root);
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
      PartDefinition vine1 = everything.addOrReplaceChild(
         "vine1",
         CubeListBuilder.create().texOffs(2, 32).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.01F)),
         PartPose.offset(0.0F, -9.0F, 0.0F)
      );
      PartDefinition vine2 = vine1.addOrReplaceChild(
         "vine2",
         CubeListBuilder.create().texOffs(5, 18).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.01F)),
         PartPose.offset(0.0F, 8.0F, 0.0F)
      );
      PartDefinition vine3 = vine2.addOrReplaceChild(
         "vine3",
         CubeListBuilder.create().texOffs(38, 1).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.01F)),
         PartPose.offset(0.0F, 7.0F, 0.0F)
      );
      PartDefinition vine4 = vine3.addOrReplaceChild(
         "vine4",
         CubeListBuilder.create().texOffs(38, 17).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 14.0F, 3.0F, new CubeDeformation(0.01F)),
         PartPose.offset(0.0F, 10.0F, 0.0F)
      );
      PartDefinition vine5 = vine4.addOrReplaceChild(
         "vine5",
         CubeListBuilder.create().texOffs(55, 1).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.01F)),
         PartPose.offset(0.0F, 13.0F, 0.0F)
      );
      return LayerDefinition.create(meshdefinition, 64, 64);
   }

   @Override
   public void setupAnim(State state) {
      super.setupAnim(state);
      float tick = SineWaveAnimationUtils.getTick(state.tickCount() + state.partialTick(), true);
      switch (state.mode()) {
         case INVENTORY -> MutantJungleZombieArmSineWaveAnimations.mutantJungleZombieArmInventoryAnimation(this, tick, 1.0F, 1.0F);
         case IDLE -> MutantJungleZombieArmSineWaveAnimations.mutantJungleZombieArmIdleAnimation(this, tick, 1.0F, 1.0F);
         case HELD -> {
            float age = state.tickCount() + state.partialTick();
            if (state.releaseAnimationTick() > 0) {
               this.scratch.start(state.releaseStartTick());
               this.release.apply(this.scratch, age);
            } else if (state.grabAnimationTick() > 0) {
               this.scratch.start(state.grabStartTick());
               this.grab.apply(this.scratch, age);
            } else if (state.strangleTicks() > 0) {
               MutantJungleZombieArmSineWaveAnimations.mutantJungleZombieArmStrangleAnimation(this, tick, 1.0F, 1.0F);
            } else if (state.grabbing()) {
               MutantJungleZombieArmSineWaveAnimations.mutantJungleZombieArmGrabbingAnimation(this, tick, 1.0F, 1.0F);
            } else if (state.standby()) {
               MutantJungleZombieArmSineWaveAnimations.mutantJungleZombieArmStandbyAnimation(this, tick, 1.0F, 1.0F);
            } else {
               MutantJungleZombieArmSineWaveAnimations.mutantJungleZombieArmIdleAnimation(this, tick, 1.0F, 1.0F);
            }
         }
      }
   }

   public enum Mode {
      INVENTORY,
      IDLE,
      HELD
   }

   /**
    * Snapshot taken when the item is extracted for rendering; the model poses itself from it at draw time.
    * Must be a value type: 26.x keys the GUI item atlas by it, and a fresh identity every frame fills the atlas until the item stops drawing.
    */
   public record State(
      Mode mode,
      int tickCount,
      float partialTick,
      int grabStartTick,
      int grabAnimationTick,
      int releaseStartTick,
      int releaseAnimationTick,
      int strangleTicks,
      boolean grabbing,
      boolean standby
   ) {
      public static State still(Mode mode, int tickCount) {
         return new State(mode, tickCount, 0.0F, 0, 0, 0, 0, 0, false, false);
      }
   }
}
