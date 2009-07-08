package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.continuations.Continuation;

public class NullEnv implements Env {
    public void setContext(Obj context) {
    }

    public Obj getContext() {
        return null;
    }

    public void setReceiver(Obj context) {
    }

    public Obj getReceiver() {
        return null;
    }

    public void extend(Variable var) {
    }

    public Obj get(Variable var) {
        return null;
    }

    public Obj get(Variable var, int addr) {
        return null;
    }

    public void set(Variable var, Obj value) {
    }

    public void set(Variable var, int addr, Obj value) {
    }

    public void add(Variable var, Obj value) {
    }

    public int getMaxAddress() {
        return 0;
    }

    public void setClosureHome(int offset, Continuation cont) {
    }

    public int getClosureHomeOffset() {
        return 0;
    }

    public Continuation getClosureHomeCont() {
        return null;
    }

    public Scope toScope() {
        return null;
    }
}
