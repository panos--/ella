package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;

public interface Env {
    void setContext(Obj context);

    Obj getContext();

    void setReceiver(Obj context);

    Obj getReceiver();

    void extend();

    Obj get(Variable var);

    Obj get(Variable var, int addr);

    void set(Variable var, Obj value);

    void set(Variable var, int addr, Obj value);

    void add(Obj value);

    int getMaxAddress();
}
