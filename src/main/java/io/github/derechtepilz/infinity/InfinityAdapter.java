package io.github.derechtepilz.infinity;

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

}
