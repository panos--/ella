package org.unbunt.sqlscript.engine.corelang;

public class ProtoRegistry {
    public static int id = 0;
    public static synchronized int generateObjectID() {
        return ++id;
    }
}
