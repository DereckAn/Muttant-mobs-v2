# Mutant More: unofficial 26.3 Fabric port

The original is a Forge 1.20.1 mod by Alexander's Fun and Games (custom license). This port is for personal use only.

## Build

```bash
JAVA_HOME=/usr/lib/jvm/java-27-openjdk ./gradlew build
```

Players need **Fabric API** and **Forge Config API Port** (`forgeconfigapiport`), which keeps the original `config/mutantmore/*.toml` files.

## Status

Pass 1 (done): Mutant Hoglin end to end.
- Entity, AI goals, keyframe and sine-wave animations, enraged glow, death quake, camera shake, battle music.
- Spawn egg, tusk and disc fragment drops, damage types, Jumping Fatigue effect, shockwave particle, sounds, and the Hoglin's configs.

Pass 2 (done): Mutant Jungle Zombie.
- Entity with its 5 attacks (punch, strangle, slam, vine sweep, poison jump), get-up lives, configs, spawn egg, Mutant More creative tab.
- Shared `AreaDamage` entity (ground and poison-cloud types) and the poison cloud particle.
- Rewards: vine seed (drop) and vine crop, Sentry Vine (placeable turret), Mutant Jungle Zombie Arm (grab/strangle, 3D item via a special model renderer, arm-raise pose), arm recipe.
- Not yet: Sentry Vine recipe (needs the mutation potions), the advancement tree (the "flew" check is in code and lights up once it exists), armour/held-item render layers.

Pass 3 (done): Mutant Husk.
- Entity with punch, sand-boulder throw, geyser, roar (summons zombies out of the ground and spreads quicksand) and get-up lives; configs; spawn egg.
- Quicksand and red quicksand blocks (scheduled tick replaces the original's timer block entity), sand / sand geyser particles, sand geyser area damage, Aegis disc fragment and vocal cords drops.
- Rewards: Husk Hammer (shockwave line + geyser), Desert Horn (roar + quicksand ring), Sand Cannon (charged sand boulder), with recipes.

Pass 4 (done): Mutant Frozen Zombie (icicle spikes, thrown icicles, giant snowball, ice cube, roar snowstorm, freezing effect, frost walking). Rewards not yet.

Pass 5 (done): Hoglin rewards (Hog Helm with rage, Hoglance, Hogfist Gauntlet), music discs (jukebox songs + fragment recipes).

Pass 6 (done): Mutant Shulker (bullets, traps, turret, custom explosion, math animations), trap and turret items. Shield not yet.

Pass 7 (done): Mutant Blaze (breakable orbiting shields as hitboxes, fireballs, rod projectiles that hatch Rodlings, stun, heat system and heat overlay), Rodling mob. The charge-shot "absorb" sparkles are vanilla flames for now.

Not ported on purpose: Mutant Phantom (unfinished in the original: no spawn egg, no attacks).

Deferred to later passes:
- Wither Skeleton: needs the `advanced_animation_utils` system.
- Blaze extras: Rodling Checker GUI, Rodling equipment editing, Mutant Blaze Shields reward item, heat hearts.
- Mutation system: the `mutation_type` data registry, natural spawns, Formula Y, Compound Z, the mutation cloud and Concoction W.
- Advancements: the tree is rooted in mutation advancements.
- Custom "mutant" boss-bar textures. The bar is a vanilla one for now, and it's off by default in the config anyway.
- Structures, blocks, GUIs, the remaining mixins, and the `forge:` → `c:` tag data.

## How the port was made

The jar was decompiled with Vineflower. SRG names were then mapped to Mojang names by combining MCPConfig `joined.tsrg` with the Mojang 1.20.1 client mappings. The original sources are not in this repo.
