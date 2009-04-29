package org.unbunt.sqlscript.lang;

import java.util.Map;

public interface Obj {
    Obj getImplicitParent();

    Obj getParent();

    Obj addSlot(Obj key, Obj value);

    Obj setSlot(Obj key, Obj value);

    Obj getSlot(Obj key);

    Map<Obj, Obj> getSlots();

    void setSlots(Map<Obj, Obj> slots);

    Object toJavaObject();
}
