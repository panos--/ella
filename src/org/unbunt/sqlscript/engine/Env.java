package org.unbunt.sqlscript.engine;

import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.continuations.Continuation;
import org.unbunt.sqlscript.support.Variable;
import org.unbunt.sqlscript.support.Scope;

public interface Env {
    void setContext(Obj context);

    Obj getContext();

    void setReceiver(Obj context);

    Obj getReceiver();

    void extend(Variable var);

    Obj get(Variable var);

    Obj get(Variable var, int addr);

    void set(Variable var, Obj value);

    void set(Variable var, int addr, Obj value);

    void add(Variable var, Obj value);

    int getMaxAddress();

    void setClosureHome(int offset, Continuation cont);

    int getClosureHomeOffset();

    Continuation getClosureHomeCont();

    Scope toScope();
}
