package org.unbunt.sqlscript.engine.environment;

import org.unbunt.sqlscript.engine.natives.Obj;
import org.unbunt.sqlscript.engine.continuations.Continuation;
import org.unbunt.sqlscript.compiler.support.Variable;
import org.unbunt.sqlscript.compiler.support.Scope;

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
