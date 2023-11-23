package io.papermc.paper.registry.keys;

import static net.kyori.adventure.key.Key.key;

import io.papermc.paper.generated.GeneratedFrom;
import io.papermc.paper.registry.RegistryKey;
import io.papermc.paper.registry.TypedKey;
import net.kyori.adventure.key.Key;
import org.bukkit.inventory.meta.trim.TrimMaterial;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Vanilla keys for {@link RegistryKey#TRIM_MATERIAL}.
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
public final class TrimMaterialKeys {
    /**
     * {@code minecraft:amethyst}
     */
    public static final TypedKey<TrimMaterial> AMETHYST = create(key("amethyst"));

    /**
     * {@code minecraft:copper}
     */
    public static final TypedKey<TrimMaterial> COPPER = create(key("copper"));

    /**
     * {@code minecraft:diamond}
     */
    public static final TypedKey<TrimMaterial> DIAMOND = create(key("diamond"));

    /**
     * {@code minecraft:emerald}
     */
    public static final TypedKey<TrimMaterial> EMERALD = create(key("emerald"));

    /**
     * {@code minecraft:gold}
     */
    public static final TypedKey<TrimMaterial> GOLD = create(key("gold"));

    /**
     * {@code minecraft:iron}
     */
    public static final TypedKey<TrimMaterial> IRON = create(key("iron"));

    /**
     * {@code minecraft:lapis}
     */
    public static final TypedKey<TrimMaterial> LAPIS = create(key("lapis"));

    /**
     * {@code minecraft:netherite}
     */
    public static final TypedKey<TrimMaterial> NETHERITE = create(key("netherite"));

    /**
     * {@code minecraft:quartz}
     */
    public static final TypedKey<TrimMaterial> QUARTZ = create(key("quartz"));

    /**
     * {@code minecraft:redstone}
     */
    public static final TypedKey<TrimMaterial> REDSTONE = create(key("redstone"));

    private TrimMaterialKeys() {
    }

    /**
     * Creates a key for {@link TrimMaterial} in a registry.
     *
     * @param key the value's key in the registry
     * @return a new typed key
     */
    @ApiStatus.Experimental
    public static @NotNull TypedKey<TrimMaterial> create(final @NotNull Key key) {
        return TypedKey.create(RegistryKey.TRIM_MATERIAL, key);
    }
}
