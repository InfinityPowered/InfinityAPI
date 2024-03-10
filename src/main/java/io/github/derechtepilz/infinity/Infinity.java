package io.github.derechtepilz.infinity;

import io.github.derechtepilz.infinity.annotation.InfinityPlugin;
import org.jetbrains.annotations.ApiStatus;
import org.slf4j.Logger;

/**
 * The Infinity singleton. Used to manage most Infinity-related stuff.
 */
public class Infinity {

    private static InfinityAdapter adapter;

    /**
     * Utility class. Cannot be initialized.
     */
    private Infinity() {
    }

    /**
     * Sets the {@link io.github.derechtepilz.infinity.InfinityAdapter} singleton instance.
     * <p>
     * This is impossible if the adapter already was set.
     *
     * @param adapter The {@link io.github.derechtepilz.infinity.InfinityAdapter} used as the instance
     */
    @ApiStatus.Internal
    public static void setInstance(InfinityAdapter adapter) {
        if (Infinity.adapter != null) {
            throw new IllegalStateException("Singleton already initialized!");
        }
        Infinity.adapter = adapter;
    }

    /**
     * Returns the {@link io.github.derechtepilz.infinity.InfinityAdapter} instance
     *
     * @return the {@link io.github.derechtepilz.infinity.InfinityAdapter} instance
     */
    public static InfinityAdapter getAdapter() {
        return adapter;
    }

    /**
     * Returns Infinity's {@link org.slf4j.Logger} object
     *
     * @return Infinity's logger
     */
    public static Logger getInfinityLogger() {
        return adapter.getInfinityLogger();
    }

    /**
     * Registers a plugin made with the Infinity API
     *
     * @param pluginClass The main class of your plugin
     * @throws java.lang.IllegalArgumentException if the class isn't annotated with the {@link InfinityPlugin} annotation
     */
    public static void registerPlugin(Class<?> pluginClass) {
        adapter.registerPlugin(pluginClass);
    }

}
