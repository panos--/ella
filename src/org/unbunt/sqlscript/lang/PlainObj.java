package org.unbunt.sqlscript.lang;

import java.util.HashMap;
import java.util.Map;

public class PlainObj extends AbstractObj {
    private static final Str STR_PARENT = Str.STR_PARENT;

    public PlainObj() {
    }

    @Override
    public Obj getImplicitParent() {
        return Base.instance;
    }

    public Obj getParent() {
        return slots.get(STR_PARENT);
    }
}
