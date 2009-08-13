package org.unbunt.ella.lang;

import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.engine.corelang.ProtoRegistry;
import org.unbunt.ella.engine.corelang.AbstractObj;

public class PlainObj extends AbstractObj {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public PlainObj() {
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    @SuppressWarnings({"UnusedDeclaration"})
    public static void registerInContext(Context ctx) {
        // NOTE: Nothing to do here registration is done from Base.registerInContext to avoid circular dependency
    }

    @Override
    public String toString() {
        return "Obj[" + super.toString() + "]";
    }
}
