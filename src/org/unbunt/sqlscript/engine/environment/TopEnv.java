package org.unbunt.sqlscript.engine.environment;

import org.unbunt.sqlscript.engine.continuations.Continuation;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.engine.corelang.Obj;
import org.unbunt.sqlscript.engine.environment.Env;
import org.unbunt.sqlscript.compiler.support.Variable;
import org.unbunt.sqlscript.compiler.support.Scope;

import java.util.ArrayList;

/**
 * Acts as global environment. Any variable reference not resolved by the compiler will be passed to this environment,
 * except if caught ealier by a dynamic environment.
 */
public class TopEnv implements Env {
    protected ArrayList<Obj> vars = new ArrayList<Obj>();

    protected Obj undefValue;

    protected TopEnv(Obj undefValue) {
        this.undefValue = undefValue;
    }

    public Obj get(Variable var) {
        return get(var, var.address);
    }

    public Obj get(Variable var, int addr) {
        addr &= 0xFFFF;
        resizeFor(addr);
        Obj value = vars.get(addr);
        if (value == null) {
            warn(var);
            value = undefValue;
            vars.set(addr, value);
        }
        return value;
    }

    public void set(Variable var, Obj value) {
        set(var, var.address, value);
    }

    public void set(Variable var, int addr, Obj value) {
        addr &= 0xFFFF;
        resizeFor(addr);
        if (vars.get(addr) == null) {
            warn(var);
        }
        vars.set(addr, value);
    }

    protected void resizeFor(int addr) {
        vars.ensureCapacity(addr + 1);
        int size = vars.size();
        while (size++ <= addr) {
            vars.add(null);
        }
    }

    public void add(Variable var, Obj value) {
        throw new RuntimeException("TopEnv.add() not implemented");
    }

    protected void warn(Variable var) {
        System.err.println("Undefined variable: " + var.name);
    }

    public void extend(Variable var) {
        throw new RuntimeException("TopEnv.extend() should not be called");
    }

    public int getMaxAddress() {
        return -1;
    }

    public Obj getContext() {
        throw new RuntimeException("TopEnv.getContext() should not be called");
    }

    public void setContext(Obj context) {
        throw new RuntimeException("TopEnv.setContext() should not be called");
    }

    public Obj getReceiver() {
        throw new RuntimeException("TopEnv.getReceiver() should not be called");
    }

    public void setReceiver(Obj context) {
        throw new RuntimeException("TopEnv.setReceiver() should not be called");
    }

    public void setClosureHome(int offset, Continuation cont) {
        throw new SQLScriptRuntimeException("TopEnv.setClosureHome() should not be called");
    }

    public int getClosureHomeOffset() {
        return -1;
    }

    public Continuation getClosureHomeCont() {
        return null;
    }

    public Scope toScope() {
        return null;
    }
}
