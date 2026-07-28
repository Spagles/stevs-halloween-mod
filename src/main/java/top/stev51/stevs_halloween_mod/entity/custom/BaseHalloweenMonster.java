package top.stev51.stevs_halloween_mod.entity.custom;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.loot.LootTable;

public class BaseHalloweenMonster extends Monster {

    boolean burnsInSunlight = false;

    public BaseHalloweenMonster(EntityType<? extends Monster> entityType, Level level,
                                boolean burnsInSunlight, boolean avoidsSunlight) {

        super(entityType, level);

        this.burnsInSunlight = burnsInSunlight;

        if (avoidsSunlight) {
            this.goalSelector.addGoal(2, new RestrictSunGoal(this));
            this.goalSelector.addGoal(3, new FleeSunGoal(this, 1.0d));
        }

    }

    @Override
    protected void registerGoals() {

        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0f, false));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 8.0f));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));

        this.targetSelector.addGoal(1, new HurtByTargetGoal(this, new Class[0]));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, IronGolem.class, true));

    }

    public void aiStep() {

        if (burnsInSunlight && this.isSunBurnTick()) {
            this.igniteForSeconds(8.0f);
        }

        super.aiStep();

    }

}
