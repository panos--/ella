package org.unbunt.sqlscript.lang;

public class PlainObj extends AbstractObj {
    public PlainObj() {
    }

    public Obj getParent() {
        return slots.get(Str.SYM_parent);
    }
}
