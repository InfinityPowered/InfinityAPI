package io.github.derechtepilz.infinity.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to determine the plugin main class for a plugin made with the Infinity API.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface InfinityPlugin {

    /**
     * This sets the name for a plugin developed by the Infinity API.
     * <p>
     * This normally is only used internally but can be used by other plugins too.
     *
     * @return the id of the plugin
     */
    String name();

}
