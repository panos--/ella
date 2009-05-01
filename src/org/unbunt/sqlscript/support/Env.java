package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;

public interface Env {
    void setThis(Obj thisRef);

    Obj getThis();

    void setSuper(Obj superRef);

    Obj getSuper();

    void extend();

    Obj get(Variable var);

    Obj get(Variable var, int addr);

    void set(Variable var, Obj value);

    void set(Variable var, int addr, Obj value);

    void add(Obj value);

    int getMaxAddress();
}
