package io.papermc.paper.registry.keys;

import static net.kyori.adventure.key.Key.key;

import io.papermc.paper.generated.GeneratedFrom;
import io.papermc.paper.registry.RegistryKey;
import io.papermc.paper.registry.TypedKey;
import net.kyori.adventure.key.Key;
import org.bukkit.GameEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Vanilla keys for {@link RegistryKey#GAME_EVENT}.
 *
 * @apiNote The fields provided here are a direct representation of
 * what is available from the vanilla game source. They may be
 * changed (including removals) on any Minecraft version
 * bump, so cross-version compatibility is not provided on the
 * same level as it is on most of the other API.
 */
@SuppressWarnings({
        "unused",
        "SpellCheckingInspection"
})
@GeneratedFrom("1.20.2")
@ApiStatus.Experimental
public final class GameEventKeys {
    /**
     * {@code minecraft:block_activate}
     */
    public static final TypedKey<GameEvent> BLOCK_ACTIVATE = create(key("block_activate"));

    /**
     * {@code minecraft:block_attach}
     */
    public static final TypedKey<GameEvent> BLOCK_ATTACH = create(key("block_attach"));

    /**
     * {@code minecraft:block_change}
     */
    public static final TypedKey<GameEvent> BLOCK_CHANGE = create(key("block_change"));

    /**
     * {@code minecraft:block_close}
     */
    public static final TypedKey<GameEvent> BLOCK_CLOSE = create(key("block_close"));

    /**
     * {@code minecraft:block_deactivate}
     */
    public static final TypedKey<GameEvent> BLOCK_DEACTIVATE = create(key("block_deactivate"));

    /**
     * {@code minecraft:block_destroy}
     */
    public static final TypedKey<GameEvent> BLOCK_DESTROY = create(key("block_destroy"));

    /**
     * {@code minecraft:block_detach}
     */
    public static final TypedKey<GameEvent> BLOCK_DETACH = create(key("block_detach"));

    /**
     * {@code minecraft:block_open}
     */
    public static final TypedKey<GameEvent> BLOCK_OPEN = create(key("block_open"));

    /**
     * {@code minecraft:block_place}
     */
    public static final TypedKey<GameEvent> BLOCK_PLACE = create(key("block_place"));

    /**
     * {@code minecraft:container_close}
     */
    public static final TypedKey<GameEvent> CONTAINER_CLOSE = create(key("container_close"));

    /**
     * {@code minecraft:container_open}
     */
    public static final TypedKey<GameEvent> CONTAINER_OPEN = create(key("container_open"));

    /**
     * {@code minecraft:drink}
     */
    public static final TypedKey<GameEvent> DRINK = create(key("drink"));

    /**
     * {@code minecraft:eat}
     */
    public static final TypedKey<GameEvent> EAT = create(key("eat"));

    /**
     * {@code minecraft:elytra_glide}
     */
    public static final TypedKey<GameEvent> ELYTRA_GLIDE = create(key("elytra_glide"));

    /**
     * {@code minecraft:entity_damage}
     */
    public static final TypedKey<GameEvent> ENTITY_DAMAGE = create(key("entity_damage"));

    /**
     * {@code minecraft:entity_die}
     */
    public static final TypedKey<GameEvent> ENTITY_DIE = create(key("entity_die"));

    /**
     * {@code minecraft:entity_dismount}
     */
    public static final TypedKey<GameEvent> ENTITY_DISMOUNT = create(key("entity_dismount"));

    /**
     * {@code minecraft:entity_interact}
     */
    public static final TypedKey<GameEvent> ENTITY_INTERACT = create(key("entity_interact"));

    /**
     * {@code minecraft:entity_mount}
     */
    public static final TypedKey<GameEvent> ENTITY_MOUNT = create(key("entity_mount"));

    /**
     * {@code minecraft:entity_place}
     */
    public static final TypedKey<GameEvent> ENTITY_PLACE = create(key("entity_place"));

    /**
     * {@code minecraft:entity_action}
     */
    public static final TypedKey<GameEvent> ENTITY_ACTION = create(key("entity_action"));

    /**
     * {@code minecraft:equip}
     */
    public static final TypedKey<GameEvent> EQUIP = create(key("equip"));

    /**
     * {@code minecraft:explode}
     */
    public static final TypedKey<GameEvent> EXPLODE = create(key("explode"));

    /**
     * {@code minecraft:flap}
     */
    public static final TypedKey<GameEvent> FLAP = create(key("flap"));

    /**
     * {@code minecraft:fluid_pickup}
     */
    public static final TypedKey<GameEvent> FLUID_PICKUP = create(key("fluid_pickup"));

    /**
     * {@code minecraft:fluid_place}
     */
    public static final TypedKey<GameEvent> FLUID_PLACE = create(key("fluid_place"));

    /**
     * {@code minecraft:hit_ground}
     */
    public static final TypedKey<GameEvent> HIT_GROUND = create(key("hit_ground"));

    /**
     * {@code minecraft:instrument_play}
     */
    public static final TypedKey<GameEvent> INSTRUMENT_PLAY = create(key("instrument_play"));

    /**
     * {@code minecraft:item_interact_finish}
     */
    public static final TypedKey<GameEvent> ITEM_INTERACT_FINISH = create(key("item_interact_finish"));

    /**
     * {@code minecraft:item_interact_start}
     */
    public static final TypedKey<GameEvent> ITEM_INTERACT_START = create(key("item_interact_start"));

    /**
     * {@code minecraft:jukebox_play}
     */
    public static final TypedKey<GameEvent> JUKEBOX_PLAY = create(key("jukebox_play"));

    /**
     * {@code minecraft:jukebox_stop_play}
     */
    public static final TypedKey<GameEvent> JUKEBOX_STOP_PLAY = create(key("jukebox_stop_play"));

    /**
     * {@code minecraft:lightning_strike}
     */
    public static final TypedKey<GameEvent> LIGHTNING_STRIKE = create(key("lightning_strike"));

    /**
     * {@code minecraft:note_block_play}
     */
    public static final TypedKey<GameEvent> NOTE_BLOCK_PLAY = create(key("note_block_play"));

    /**
     * {@code minecraft:prime_fuse}
     */
    public static final TypedKey<GameEvent> PRIME_FUSE = create(key("prime_fuse"));

    /**
     * {@code minecraft:projectile_land}
     */
    public static final TypedKey<GameEvent> PROJECTILE_LAND = create(key("projectile_land"));

    /**
     * {@code minecraft:projectile_shoot}
     */
    public static final TypedKey<GameEvent> PROJECTILE_SHOOT = create(key("projectile_shoot"));

    /**
     * {@code minecraft:sculk_sensor_tendrils_clicking}
     */
    public static final TypedKey<GameEvent> SCULK_SENSOR_TENDRILS_CLICKING = create(key("sculk_sensor_tendrils_clicking"));

    /**
     * {@code minecraft:shear}
     */
    public static final TypedKey<GameEvent> SHEAR = create(key("shear"));

    /**
     * {@code minecraft:shriek}
     */
    public static final TypedKey<GameEvent> SHRIEK = create(key("shriek"));

    /**
     * {@code minecraft:splash}
     */
    public static final TypedKey<GameEvent> SPLASH = create(key("splash"));

    /**
     * {@code minecraft:step}
     */
    public static final TypedKey<GameEvent> STEP = create(key("step"));

    /**
     * {@code minecraft:swim}
     */
    public static final TypedKey<GameEvent> SWIM = create(key("swim"));

    /**
     * {@code minecraft:teleport}
     */
    public static final TypedKey<GameEvent> TELEPORT = create(key("teleport"));

    /**
     * {@code minecraft:unequip}
     */
    public static final TypedKey<GameEvent> UNEQUIP = create(key("unequip"));

    /**
     * {@code minecraft:resonate_1}
     */
    public static final TypedKey<GameEvent> RESONATE_1 = create(key("resonate_1"));

    /**
     * {@code minecraft:resonate_2}
     */
    public static final TypedKey<GameEvent> RESONATE_2 = create(key("resonate_2"));

    /**
     * {@code minecraft:resonate_3}
     */
    public static final TypedKey<GameEvent> RESONATE_3 = create(key("resonate_3"));

    /**
     * {@code minecraft:resonate_4}
     */
    public static final TypedKey<GameEvent> RESONATE_4 = create(key("resonate_4"));

    /**
     * {@code minecraft:resonate_5}
     */
    public static final TypedKey<GameEvent> RESONATE_5 = create(key("resonate_5"));

    /**
     * {@code minecraft:resonate_6}
     */
    public static final TypedKey<GameEvent> RESONATE_6 = create(key("resonate_6"));

    /**
     * {@code minecraft:resonate_7}
     */
    public static final TypedKey<GameEvent> RESONATE_7 = create(key("resonate_7"));

    /**
     * {@code minecraft:resonate_8}
     */
    public static final TypedKey<GameEvent> RESONATE_8 = create(key("resonate_8"));

    /**
     * {@code minecraft:resonate_9}
     */
    public static final TypedKey<GameEvent> RESONATE_9 = create(key("resonate_9"));

    /**
     * {@code minecraft:resonate_10}
     */
    public static final TypedKey<GameEvent> RESONATE_10 = create(key("resonate_10"));

    /**
     * {@code minecraft:resonate_11}
     */
    public static final TypedKey<GameEvent> RESONATE_11 = create(key("resonate_11"));

    /**
     * {@code minecraft:resonate_12}
     */
    public static final TypedKey<GameEvent> RESONATE_12 = create(key("resonate_12"));

    /**
     * {@code minecraft:resonate_13}
     */
    public static final TypedKey<GameEvent> RESONATE_13 = create(key("resonate_13"));

    /**
     * {@code minecraft:resonate_14}
     */
    public static final TypedKey<GameEvent> RESONATE_14 = create(key("resonate_14"));

    /**
     * {@code minecraft:resonate_15}
     */
    public static final TypedKey<GameEvent> RESONATE_15 = create(key("resonate_15"));

    private GameEventKeys() {
    }

    /**
     * Creates a key for {@link GameEvent} in a registry.
     *
     * @param key the value's key in the registry
     * @return a new typed key
     */
    @ApiStatus.Experimental
    public static @NotNull TypedKey<GameEvent> create(final @NotNull Key key) {
        return TypedKey.create(RegistryKey.GAME_EVENT, key);
    }
}
