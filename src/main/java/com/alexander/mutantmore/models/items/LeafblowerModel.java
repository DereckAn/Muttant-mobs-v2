package com.alexander.mutantmore.models.items;

import com.alexander.mutantmore.animation.keyframe_animations.definition.LeafblowerKeyframeAnimations;
import com.alexander.mutantmore.animation.sine_wave_animations.SineWaveAnimationUtils;
import com.alexander.mutantmore.animation.sine_wave_animations.definition.LeafblowerSineWaveAnimations;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.AnimationState;

/** Leafblower: idles/works differently in suck and blow mode; flipping the mode plays a short switch animation. */
public class LeafblowerModel extends Model<LeafblowerModel.State> {
   public static final ModelLayerLocation LAYER = new ModelLayerLocation(Identifier.fromNamespaceAndPath("mutantmore", "leafblower"), "main");
   public final ModelPart everything;
   public final ModelPart flowerNozzle;
   public final ModelPart petals;
   public final ModelPart petal1;
   public final ModelPart petal2;
   public final ModelPart petal3;
   public final ModelPart petal4;
   public final ModelPart lever;
   private final KeyframeAnimation switchSuck;
   private final KeyframeAnimation switchBlow;
   private final AnimationState scratch = new AnimationState();

   public LeafblowerModel(ModelPart root) {
      super(root, RenderTypes::entityCutout);
      this.everything = root.getChild("everything");
      this.flowerNozzle = this.everything.getChild("flowerNozzle");
      this.petals = this.everything.getChild("petals");
      this.petal1 = this.petals.getChild("petal1");
      this.petal2 = this.petals.getChild("petal2");
      this.petal3 = this.petals.getChild("petal3");
      this.petal4 = this.petals.getChild("petal4");
      this.lever = this.everything.getChild("lever");
      this.switchSuck = com.alexander.mutantmore.animation.LenientBake.bake(LeafblowerKeyframeAnimations.LEAFBLOWER_SWITCH_SUCK, root);
      this.switchBlow = com.alexander.mutantmore.animation.LenientBake.bake(LeafblowerKeyframeAnimations.LEAFBLOWER_SWITCH_BLOW, root);
   }

   /** switching: 0 none, 1 to suck, 2 to blow; switchTick = ticks into it; tick = the holder's (bounded) tick count */
   public record State(boolean sucking, boolean using, int switching, int switchTick, int tick) {
      public static final State STILL = new State(true, false, 0, 0, -1);
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild(
         "everything",
         CubeListBuilder.create()
            .texOffs(0, 0)
            .addBox(-2.0F, -10.0F, -5.0F, 6.0F, 10.0F, 12.0F, new CubeDeformation(0.0F))
            .texOffs(0, 22)
            .addBox(-2.1F, -8.0F, -3.0F, 6.0F, 6.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(26, 22)
            .addBox(-2.0F, -8.0F, -3.0F, 6.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
            .texOffs(36, 0)
            .addBox(0.0F, -13.0F, 4.1F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
            .texOffs(24, 0)
            .addBox(0.0F, -11.0F, 6.1F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
            .texOffs(0, 35)
            .addBox(-1.0F, -9.0F, -15.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 24.0F, 0.0F)
      );
      PartDefinition flowerNozzle = everything.addOrReplaceChild(
         "flowerNozzle",
         CubeListBuilder.create().texOffs(0, 49).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.01F)),
         PartPose.offset(1.0F, -7.0F, -15.0F)
      );
      PartDefinition petals = everything.addOrReplaceChild("petals", CubeListBuilder.create(), PartPose.offset(1.0F, -7.0F, -14.0F));
      PartDefinition petal1 = petals.addOrReplaceChild(
         "petal1",
         CubeListBuilder.create().texOffs(44, 48).addBox(-5.0F, 0.0F, 0.0F, 10.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 2.0F, 0.0F)
      );
      PartDefinition petal2 = petals.addOrReplaceChild(
         "petal2",
         CubeListBuilder.create().texOffs(44, 48).addBox(-5.0F, 0.0F, 0.0F, 10.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F)
      );
      PartDefinition petal3 = petals.addOrReplaceChild(
         "petal3",
         CubeListBuilder.create().texOffs(44, 48).addBox(-5.0F, 0.0F, 0.0F, 10.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -3.1416F)
      );
      PartDefinition petal4 = petals.addOrReplaceChild(
         "petal4",
         CubeListBuilder.create().texOffs(44, 48).addBox(-5.0F, 0.0F, 0.0F, 10.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F)
      );
      PartDefinition lever = everything.addOrReplaceChild(
         "lever",
         CubeListBuilder.create().texOffs(40, 32).addBox(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.01F)),
         PartPose.offset(4.0F, -8.0F, 1.0F)
      );
      return LayerDefinition.create(meshdefinition, 64, 64);
   }

   @Override
   public void setupAnim(State state) {
      super.setupAnim(state);
      if (state.tick() < 0) {
         return;
      }

      float tick = SineWaveAnimationUtils.getTick(state.tick(), true);
      if (state.switching() != 0) {
         this.scratch.start(0);
         (state.switching() == 1 ? this.switchSuck : this.switchBlow).apply(this.scratch, state.switchTick());
      } else if (state.using()) {
         if (state.sucking()) {
            LeafblowerSineWaveAnimations.leafblowerSuckAnimation(this, tick, 1.0F, 1.0F);
         } else {
            LeafblowerSineWaveAnimations.leafblowerBlowAnimation(this, tick, 1.0F, 1.0F);
         }
      } else if (state.sucking()) {
         LeafblowerSineWaveAnimations.leafblowerSuckIdleAnimation(this, tick, 1.0F, 1.0F);
      } else {
         LeafblowerSineWaveAnimations.leafblowerBlowIdleAnimation(this, tick, 1.0F, 1.0F);
      }
   }
}
