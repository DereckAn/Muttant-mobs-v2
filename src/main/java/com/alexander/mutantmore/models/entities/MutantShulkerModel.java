package com.alexander.mutantmore.models.entities;

import com.alexander.mutantmore.animation.math_animation.definition.MutantShulkerMathAnimations1;
import com.alexander.mutantmore.animation.math_animation.definition.MutantShulkerMathAnimations2;
import com.alexander.mutantmore.animation.math_animation.definition.MutantShulkerMathAnimations3;
import com.alexander.mutantmore.renderers.entities.MutantShulkerRenderer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class MutantShulkerModel extends MMBaseEntityModel<MutantShulkerRenderer.State> {
   private final ModelPart head;

   public MutantShulkerModel(ModelPart root) {
      super(root);

      this.head = root.getChild("everything").getChild("box").getChild("head");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.getRoot();
      PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 0.0F));
      PartDefinition box = everything.addOrReplaceChild("box", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 0.0F));
      box.addOrReplaceChild(
         "head",
         CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.1F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -15.0F, 0.0F)
      );
      PartDefinition uppershell = box.addOrReplaceChild(
         "uppershell",
         CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -15.175F, -12.0F, 24.0F, 12.0F, 24.0F, new CubeDeformation(-0.01F)),
         PartPose.offset(0.0F, -22.0F, 0.0F)
      );
      PartDefinition shoulders2 = uppershell.addOrReplaceChild("shoulders2", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, 0.0F));
      shoulders2.addOrReplaceChild(
         "shoulderleft3",
         CubeListBuilder.create().texOffs(72, 36).mirror().addBox(7.0F, -8.1F, 7.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(-0.01F)).mirror(false),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      shoulders2.addOrReplaceChild(
         "shoulderright2",
         CubeListBuilder.create().texOffs(72, 36).addBox(-14.0F, -8.1F, -14.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(-0.01F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      shoulders2.addOrReplaceChild(
         "shoulderright3",
         CubeListBuilder.create().texOffs(72, 36).addBox(-14.0F, -8.1F, 7.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(-0.01F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      shoulders2.addOrReplaceChild(
         "shoulderleft2",
         CubeListBuilder.create()
            .texOffs(72, 36)
            .mirror()
            .addBox(7.0F, -8.1F, -14.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(-0.01F))
            .mirror(false),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      uppershell.addOrReplaceChild(
         "upperteeth",
         CubeListBuilder.create().texOffs(0, 98).addBox(-12.0F, -20.2F, -12.0F, 24.0F, 8.0F, 24.0F, new CubeDeformation(-0.01F)),
         PartPose.offset(0.0F, 17.0F, 0.0F)
      );
      PartDefinition horns = uppershell.addOrReplaceChild("horns", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 0.0F));
      PartDefinition horn1 = horns.addOrReplaceChild(
         "horn1",
         CubeListBuilder.create().texOffs(109, 70).addBox(-1.9357F, -2.0766F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.01F)),
         PartPose.offsetAndRotation(-10.5F, -36.0F, -10.5F, 0.5713F, -0.5724F, -0.8706F)
      );
      PartDefinition horn2 = horn1.addOrReplaceChild(
         "horn2",
         CubeListBuilder.create().texOffs(109, 70).addBox(-0.4699F, -4.0954F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.01F)),
         PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.3927F)
      );
      horn2.addOrReplaceChild(
         "horn3",
         CubeListBuilder.create().texOffs(109, 70).addBox(-1.0301F, -4.0954F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)),
         PartPose.offsetAndRotation(1.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.6109F)
      );
      PartDefinition horn4 = horns.addOrReplaceChild(
         "horn4",
         CubeListBuilder.create()
            .texOffs(109, 70)
            .mirror()
            .addBox(-2.0643F, -2.0766F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.01F))
            .mirror(false),
         PartPose.offsetAndRotation(10.5F, -36.0F, -10.5F, 0.5713F, 0.5724F, 0.8706F)
      );
      PartDefinition horn5 = horn4.addOrReplaceChild(
         "horn5",
         CubeListBuilder.create()
            .texOffs(109, 70)
            .mirror()
            .addBox(-2.5301F, -4.0954F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.01F))
            .mirror(false),
         PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.3927F)
      );
      horn5.addOrReplaceChild(
         "horn6",
         CubeListBuilder.create()
            .texOffs(109, 70)
            .mirror()
            .addBox(-0.9699F, -4.0954F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F))
            .mirror(false),
         PartPose.offsetAndRotation(-1.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.6109F)
      );
      PartDefinition horn7 = horns.addOrReplaceChild(
         "horn7",
         CubeListBuilder.create()
            .texOffs(109, 70)
            .mirror()
            .addBox(-2.0643F, -2.0766F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.01F))
            .mirror(false),
         PartPose.offsetAndRotation(10.5F, -36.0F, 10.5F, -0.5713F, -0.5724F, 0.8706F)
      );
      PartDefinition horn8 = horn7.addOrReplaceChild(
         "horn8",
         CubeListBuilder.create()
            .texOffs(109, 70)
            .mirror()
            .addBox(-2.5301F, -4.0954F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.01F))
            .mirror(false),
         PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.3927F)
      );
      horn8.addOrReplaceChild(
         "horn9",
         CubeListBuilder.create()
            .texOffs(109, 70)
            .mirror()
            .addBox(-0.9699F, -4.0954F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F))
            .mirror(false),
         PartPose.offsetAndRotation(-1.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.6109F)
      );
      PartDefinition horn10 = horns.addOrReplaceChild(
         "horn10",
         CubeListBuilder.create().texOffs(109, 70).addBox(-1.9357F, -2.0766F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.01F)),
         PartPose.offsetAndRotation(-10.5F, -36.0F, 10.5F, -0.5713F, 0.5724F, -0.8706F)
      );
      PartDefinition horn11 = horn10.addOrReplaceChild(
         "horn11",
         CubeListBuilder.create().texOffs(109, 70).addBox(-0.4699F, -4.0954F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(-0.01F)),
         PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.3927F)
      );
      horn11.addOrReplaceChild(
         "horn12",
         CubeListBuilder.create().texOffs(109, 70).addBox(-1.0301F, -4.0954F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)),
         PartPose.offsetAndRotation(1.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.6109F)
      );
      PartDefinition lowershell = box.addOrReplaceChild("lowershell", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 0.0F));
      lowershell.addOrReplaceChild(
         "shelllower",
         CubeListBuilder.create().texOffs(0, 36).addBox(-12.0F, -2.0F, -12.0F, 24.0F, 6.0F, 24.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -1.0F, 0.0F)
      );
      PartDefinition lowerteeth = lowershell.addOrReplaceChild(
         "lowerteeth",
         CubeListBuilder.create().texOffs(32, 67).addBox(-12.0F, -3.0F, -12.0F, 24.0F, 7.0F, 24.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -7.0F, 0.0F)
      );
      PartDefinition shoulders3 = lowerteeth.addOrReplaceChild("shoulders3", CubeListBuilder.create(), PartPose.offset(0.0F, 9.0F, 0.0F));
      shoulders3.addOrReplaceChild(
         "shoulderleft4",
         CubeListBuilder.create().texOffs(72, 36).mirror().addBox(7.0F, -8.0F, 7.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offset(0.0F, 4.0F, 0.0F)
      );
      shoulders3.addOrReplaceChild(
         "shoulderright4",
         CubeListBuilder.create().texOffs(72, 36).addBox(-14.0F, -8.0F, -14.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 4.0F, 0.0F)
      );
      shoulders3.addOrReplaceChild(
         "shoulderright5",
         CubeListBuilder.create().texOffs(72, 36).addBox(-14.0F, -8.0F, 7.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 4.0F, 0.0F)
      );
      shoulders3.addOrReplaceChild(
         "shoulderleft5",
         CubeListBuilder.create().texOffs(72, 36).mirror().addBox(7.0F, -8.0F, -14.0F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
         PartPose.offset(0.0F, 4.0F, 0.0F)
      );
      PartDefinition tendons = box.addOrReplaceChild("tendons", CubeListBuilder.create(), PartPose.offset(0.0F, -7.5F, 0.0F));
      tendons.addOrReplaceChild(
         "cube_r1",
         CubeListBuilder.create()
            .texOffs(16, 74)
            .addBox(8.0F, -3.5F, 0.0F, 6.0F, 19.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(12, 36)
            .addBox(-14.0F, -3.5F, 0.0F, 6.0F, 19.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -14.1F, 0.0F, 0.0F, -0.7854F, 0.0F)
      );
      tendons.addOrReplaceChild(
         "cube_r2",
         CubeListBuilder.create()
            .texOffs(16, 74)
            .addBox(8.0F, -3.5F, 0.0F, 6.0F, 19.0F, 0.0F, new CubeDeformation(0.0F))
            .texOffs(12, 36)
            .addBox(-14.0F, -3.5F, 0.0F, 6.0F, 19.0F, 0.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -14.1F, 0.0F, 0.0F, 0.7854F, 0.0F)
      );
      PartDefinition legs = everything.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 0.0F));
      PartDefinition legright1Rotator = legs.addOrReplaceChild("legright1Rotator", CubeListBuilder.create(), PartPose.offset(-11.0F, -8.0F, -11.0F));
      PartDefinition legright1 = legright1Rotator.addOrReplaceChild(
         "legright1",
         CubeListBuilder.create().texOffs(0, 74).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition legright1joint1 = legright1.addOrReplaceChild(
         "legright1joint1",
         CubeListBuilder.create().texOffs(28, 74).addBox(-2.0F, -11.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, 1.5708F, 0.0F)
      );
      legright1joint1.addOrReplaceChild(
         "legright1joint2",
         CubeListBuilder.create().texOffs(0, 36).addBox(-1.5F, -18.0F, -2.5F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -11.0F, 1.0F)
      );
      PartDefinition legright2Rotator = legs.addOrReplaceChild("legright2Rotator", CubeListBuilder.create(), PartPose.offset(-11.0F, -8.0F, 11.0F));
      PartDefinition legright2 = legright2Rotator.addOrReplaceChild(
         "legright2",
         CubeListBuilder.create().texOffs(0, 74).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition legright2joint1 = legright2.addOrReplaceChild(
         "legright2joint1",
         CubeListBuilder.create().texOffs(28, 74).addBox(-2.0F, -11.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
         PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, 1.5708F, 0.0F)
      );
      legright2joint1.addOrReplaceChild(
         "legright2joint2",
         CubeListBuilder.create().texOffs(0, 36).addBox(-1.5F, -18.0F, -2.5F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F)),
         PartPose.offset(0.0F, -11.0F, 1.0F)
      );
      PartDefinition legleft1Rotator = legs.addOrReplaceChild("legleft1Rotator", CubeListBuilder.create(), PartPose.offset(11.0F, -8.0F, -11.0F));
      PartDefinition legleft1 = legleft1Rotator.addOrReplaceChild(
         "legleft1",
         CubeListBuilder.create()
            .texOffs(0, 74)
            .mirror()
            .addBox(-2.0F, -10.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition legleft1joint1 = legleft1.addOrReplaceChild(
         "legleft1joint1",
         CubeListBuilder.create()
            .texOffs(28, 74)
            .mirror()
            .addBox(-2.0F, -11.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, -1.5708F, 0.0F)
      );
      legleft1joint1.addOrReplaceChild(
         "legleft1joint2",
         CubeListBuilder.create()
            .texOffs(0, 36)
            .mirror()
            .addBox(-1.5F, -18.0F, -2.5F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(0.0F, -11.0F, 1.0F)
      );
      PartDefinition legleft2Rotator = legs.addOrReplaceChild("legleft2Rotator", CubeListBuilder.create(), PartPose.offset(11.0F, -8.0F, 11.0F));
      PartDefinition legleft2 = legleft2Rotator.addOrReplaceChild(
         "legleft2",
         CubeListBuilder.create()
            .texOffs(0, 74)
            .mirror()
            .addBox(-2.0F, -10.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(0.0F, 0.0F, 0.0F)
      );
      PartDefinition legleft2joint1 = legleft2.addOrReplaceChild(
         "legleft2joint1",
         CubeListBuilder.create()
            .texOffs(28, 74)
            .mirror()
            .addBox(-2.0F, -11.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, -1.5708F, 0.0F)
      );
      legleft2joint1.addOrReplaceChild(
         "legleft2joint2",
         CubeListBuilder.create()
            .texOffs(0, 36)
            .mirror()
            .addBox(-1.5F, -18.0F, -2.5F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F))
            .mirror(false),
         PartPose.offset(0.0F, -11.0F, 1.0F)
      );
      return LayerDefinition.create(meshdefinition, 128, 130);
   }

   @Override
   public void setupAnim(MutantShulkerRenderer.State state) {
      super.setupAnim(state);
      this.mathAnimateState(state, state.idleAnimation, MutantShulkerMathAnimations1.IDLE, 1.0F, 1.0F);
      this.mathAnimateState(state, state.idleRareAnimation, MutantShulkerMathAnimations1.IDLE_RARE, 1.0F, 1.0F);
      this.mathAnimateState(state, state.spinningAnimation, MutantShulkerMathAnimations1.SPINNING, 1.0F, 1.0F);
      this.mathAnimateState(state, state.shulkerWalkAnimation, MutantShulkerMathAnimations1.WALK, 1.0F, state.walkScale);
      this.mathAnimateState(state, state.shootAnimation, MutantShulkerMathAnimations2.SHOOT, 1.0F, 1.0F);
      this.mathAnimateState(state, state.biteAnimation, MutantShulkerMathAnimations2.BITE, 1.0F, 1.0F);
      this.mathAnimateState(state, state.enterSpinAnimation, MutantShulkerMathAnimations2.ENTER_SPIN, 1.0F, 1.0F);
      this.mathAnimateState(state, state.deathAnimation, MutantShulkerMathAnimations3.DEATH, 1.0F, 1.0F);
      this.mathAnimateState(state, state.idleInShellAnimation, MutantShulkerMathAnimations3.IDLE_IN_SHELL, 1.0F, 1.0F);
      this.mathAnimateState(state, state.idleRareInShellAnimation, MutantShulkerMathAnimations3.IDLE_RARE_IN_SHELL, 1.0F, 1.0F);
      this.mathAnimateState(state, state.shootInShellAnimation, MutantShulkerMathAnimations3.SHOOT_IN_SHELL, 1.0F, 1.0F);
      this.mathAnimateState(state, state.anvilCrushAnimation, MutantShulkerMathAnimations3.ANVIL_CRUSH, 1.0F, 1.0F);
      this.mathAnimateState(state, state.summonTrapsAnimation, MutantShulkerMathAnimations3.SUMMON_TRAPS, 1.0F, 1.0F);
      this.mathAnimateState(state, state.summonTrapsInShellAnimation, MutantShulkerMathAnimations3.SUMMON_TRAPS_IN_SHELL, 1.0F, 1.0F);
      this.head.xRot += (float)Math.toRadians(state.xRot);
      this.head.yRot += (float)Math.toRadians(state.yRot);
   }
}
