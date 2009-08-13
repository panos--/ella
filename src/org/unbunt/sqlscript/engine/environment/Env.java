package org.unbunt.ella.engine.environment;

import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.engine.continuations.Continuation;
import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.compiler.support.Scope;

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
