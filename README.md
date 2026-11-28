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

Pass 3 (done): Mutant Husk.
- Entity with punch, sand-boulder throw, geyser, roar (summons zombies out of the ground and spreads quicksand) and get-up lives; configs; spawn egg.
- Quicksand and red quicksand blocks (scheduled tick replaces the original's timer block entity), sand / sand geyser particles, sand geyser area damage, Aegis disc fragment and vocal cords drops.
- Rewards: Husk Hammer (shockwave line + geyser), Desert Horn (roar + quicksand ring), Sand Cannon (charged sand boulder), with recipes.

Pass 4 (done): Mutant Frozen Zombie (icicle spikes, thrown icicles, giant snowball, ice cube, roar snowstorm, freezing effect, frost walking). Rewards not yet.

Pass 5 (done): Hoglin rewards (Hog Helm with rage, Hoglance, Hogfist Gauntlet), music discs (jukebox songs + fragment recipes).

Pass 6 (done): Mutant Shulker (bullets, traps, turret, custom explosion, math animations), trap and turret items. Shield not yet.

Pass 7 (done): Mutant Blaze (breakable orbiting shields as hitboxes, fireballs, rod projectiles that hatch Rodlings, stun, heat system and heat overlay), Rodling mob. The charge-shot "absorb" sparkles are vanilla flames for now.

Pass 8 (done): Mutant Wither Skeleton (the server-synced `advanced_animation_utils` animation system, lunge, wither slash, wither breath gas cloud, rib crush, blocking, life leech, falls apart into collectable bones), Withered Scimitar, bone drops. Also ported the shared absorb and ground-trail particles; the Blaze charge shots now use the real absorb sparkles.

Pass 9 (done): Mutant Wither Skeleton rewards: bone armour set (the skull is wearable and placeable on floors/walls, +attack speed; chestplate +attack damage), Wither Bomb (thrown, placed or dispensed), and their recipes.

Pass 10 (done): the remaining boss rewards. Frozen Zombie: Snowstorm Generator, Freezing Fan, Icicle Ammo Charge + Adaptive Crossbow. Blaze: Heatstorm Generator, Mutant Blaze Shields, Rodling Checker (single-Rodling version: slots, name, health, settings). Shulker: Mutant Shulker Shield (block, attack to fire a bullet). Jungle Zombie: Leafblower (attack toggles suck/blow).

Pass 11 (done): mutation system. Formula Y and Compound Z (fill the bottle with water, brew in the config's ingredient list in order; brewing-stand mixins, since 26.x data brewing can't track a step), Mutation Cloud (pink = success, purple = failed roll, red = no mutation, blue = wrong conditions), data-driven `mutation_type` files (Mutant Monsters / Dungeons Mobs ones only load with those mods), optional natural mutant spawns, Derelict Laboratory structure with its loot, and the wandering trader's laboratory map.

Not ported on purpose: Mutant Phantom (unfinished in the original: no spawn egg, no attacks), Concoction W (a pet only for the author's Patreon supporters).

Advancements: all 24 tab advancements (root = entering a Derelict Laboratory) and every recipe-unlock advancement, converted to the 26.x format. The three code-awarded ones (mutate a mob, enrage a Mutant Hoglin, fly with the Jungle Zombie Arm) are hooked. The Sentry Vine recipe is ported too.

Armour layer: the Husk, Frozen Zombie, Jungle Zombie and Wither Skeleton show worn armour and head items (skulls, pumpkins), each piece placed on the mutant's own bones (`client/armour/MutantArmourLayer`).

Deferred to later passes:
- Blaze extras: the heat hearts HUD, and the Rodling Checker's list for switching between and bulk-editing nearby Rodlings.
- Mutation extras: the glowing overlay drawn on a mob while it mutates, and Mutant Shulkers at End City sentry spots (that one only happens if a datapack turns natural spawns on).
- Custom "mutant" boss-bar textures. The bar is a vanilla one for now, and it's off by default in the config anyway.

## How the port was made

The jar was decompiled with Vineflower. SRG names were then mapped to Mojang names by combining MCPConfig `joined.tsrg` with the Mojang 1.20.1 client mappings. The original sources are not in this repo.
