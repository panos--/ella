package org.unbunt.ella.lang;

import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.engine.corelang.ProtoRegistry;
import org.unbunt.ella.engine.corelang.AbstractObj;

/**
 * Represents empty objects in the EllaScript language.
 */
public class PlainObj extends AbstractObj {
    protected static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    /**
     * Creates a new empty PlainObj.
     */
    public PlainObj() {
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
    @SuppressWarnings({"UnusedDeclaration"})
    public static void registerInContext(Context ctx) {
        // NOTE: Nothing to do here registration is done from Base.registerInContext to avoid circular dependency
    }

    @Override
    public String toString() {
        return "Obj[" + super.toString() + "]";
    }
}
