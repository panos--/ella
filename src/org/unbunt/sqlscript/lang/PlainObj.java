package org.unbunt.sqlscript.lang;

public class PlainObj extends AbstractObj {
    public PlainObj() {
    }

    @Override
    public Obj getImplicitParent() {
        return Base.instance;
    }

    public Obj getParent() {
        return slots.get(Str.SYM_parent);
    }
}
