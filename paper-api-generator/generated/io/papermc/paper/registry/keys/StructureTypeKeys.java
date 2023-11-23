package io.papermc.paper.registry.keys;

import static net.kyori.adventure.key.Key.key;

import io.papermc.paper.generated.GeneratedFrom;
import io.papermc.paper.registry.RegistryKey;
import io.papermc.paper.registry.TypedKey;
import net.kyori.adventure.key.Key;
import org.bukkit.generator.structure.StructureType;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Vanilla keys for {@link RegistryKey#STRUCTURE_TYPE}.
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
public final class StructureTypeKeys {
    /**
     * {@code minecraft:buried_treasure}
     */
    public static final TypedKey<StructureType> BURIED_TREASURE = create(key("buried_treasure"));

    /**
     * {@code minecraft:desert_pyramid}
     */
    public static final TypedKey<StructureType> DESERT_PYRAMID = create(key("desert_pyramid"));

    /**
     * {@code minecraft:end_city}
     */
    public static final TypedKey<StructureType> END_CITY = create(key("end_city"));

    /**
     * {@code minecraft:fortress}
     */
    public static final TypedKey<StructureType> FORTRESS = create(key("fortress"));

    /**
     * {@code minecraft:igloo}
     */
    public static final TypedKey<StructureType> IGLOO = create(key("igloo"));

    /**
     * {@code minecraft:jigsaw}
     */
    public static final TypedKey<StructureType> JIGSAW = create(key("jigsaw"));

    /**
     * {@code minecraft:jungle_temple}
     */
    public static final TypedKey<StructureType> JUNGLE_TEMPLE = create(key("jungle_temple"));

    /**
     * {@code minecraft:mineshaft}
     */
    public static final TypedKey<StructureType> MINESHAFT = create(key("mineshaft"));

    /**
     * {@code minecraft:nether_fossil}
     */
    public static final TypedKey<StructureType> NETHER_FOSSIL = create(key("nether_fossil"));

    /**
     * {@code minecraft:ocean_monument}
     */
    public static final TypedKey<StructureType> OCEAN_MONUMENT = create(key("ocean_monument"));

    /**
     * {@code minecraft:ocean_ruin}
     */
    public static final TypedKey<StructureType> OCEAN_RUIN = create(key("ocean_ruin"));

    /**
     * {@code minecraft:ruined_portal}
     */
    public static final TypedKey<StructureType> RUINED_PORTAL = create(key("ruined_portal"));

    /**
     * {@code minecraft:shipwreck}
     */
    public static final TypedKey<StructureType> SHIPWRECK = create(key("shipwreck"));

    /**
     * {@code minecraft:stronghold}
     */
    public static final TypedKey<StructureType> STRONGHOLD = create(key("stronghold"));

    /**
     * {@code minecraft:swamp_hut}
     */
    public static final TypedKey<StructureType> SWAMP_HUT = create(key("swamp_hut"));

    /**
     * {@code minecraft:woodland_mansion}
     */
    public static final TypedKey<StructureType> WOODLAND_MANSION = create(key("woodland_mansion"));

    private StructureTypeKeys() {
    }

    @ApiStatus.Experimental
    private static @NotNull TypedKey<StructureType> create(final @NotNull Key key) {
        return TypedKey.create(RegistryKey.STRUCTURE_TYPE, key);
    }
}
