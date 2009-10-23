package org.unbunt.ella.engine.corelang;

/**
 * Generator for object IDs which are unique in a JVM instance.
 */
public class ProtoRegistry {
    protected static int id = 0;

    /**
     * Returns a new, previously unused object ID.
     *
     * @return the new object ID.
     */
    public static synchronized int generateObjectID() {
        return ++id;
    }
}
