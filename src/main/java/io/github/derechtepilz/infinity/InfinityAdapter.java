package io.github.derechtepilz.infinity;

import io.github.derechtepilz.infinity.annotation.InfinityPlugin;
import org.slf4j.Logger;

/**
 * Provides interface access to the Infinity API.
 */
public interface InfinityAdapter {

    /**
     * Returns Infinity's {@link org.slf4j.Logger} object
     *
     * @return Infinity's logger
     */
    Logger getInfinityLogger();

    /**
     * Registers a plugin made with the Infinity API
     *
     * @param pluginClass The main class of your plugin
     * @throws java.lang.IllegalArgumentException if the class isn't annotated with the {@link InfinityPlugin} annotation
     */
    void registerPlugin(Class<?> pluginClass);

}
