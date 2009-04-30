package org.unbunt.sqlscript.lang;

import java.util.HashMap;
import java.util.Map;

public class PlainObj extends AbstractObj {
    public PlainObj() {
    }

    @Override
    public Obj getImplicitParent() {
        return Base.instance;
    }

    public Obj getParent() {
        return slots.get(Str.STR_PARENT);
    }
}
