package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.engine.Obj;
import org.unbunt.sqlscript.engine.Env;
import org.unbunt.sqlscript.continuations.Continuation;

import java.util.ArrayList;

public class StaticEnv extends AbstractEnv {
    protected ArrayList<Obj> values = new ArrayList<Obj>();
    protected ArrayList<Variable> vars = new ArrayList<Variable>();

    protected Obj context = null;
    protected Obj receiver = null;

    protected int closureHomeOffset = -1;
    protected Continuation closureHomeCont = null;

    public StaticEnv(Env parent) {
        super(parent);
    }

    public void setContext(Obj context) {
        this.context = context;
    }

    public Obj getContext() {
        return context;
    }

    public Obj getReceiver() {
        return receiver;
    }

    public void setReceiver(Obj receiver) {
        this.receiver = receiver;
    }

    public void extend(Variable var) {
        vars.add(var);
        values.add(null);
    }

    public Obj get(Variable var, int addr) {
        if (addr > 0xFFFF) {
            return parent.get(var, addr - 0x10000);
        }
        return values.get(addr);
    }

    public void set(Variable var, int addr, Obj value) {
        if (addr > 0xFFFF) {
            parent.set(var, addr - 0x10000, value);
        }
        else {
            values.set(addr, value);
        }
    }

    public void add(Variable var, Obj value) {
        vars.add(var);
        values.add(value);
    }

    public int getMaxAddress() {
        return values.size() - 1;
    }

    public void setClosureHome(int offset, Continuation cont) {
        this.closureHomeOffset = offset;
        this.closureHomeCont = cont;
    }

    // TODO: maybe subclass as FuncEnv, so we don't have to do the check all the time (since for function environments
    //       closureHomeOffset will always be set which it doesn't for any other environment
    public int getClosureHomeOffset() {
        return closureHomeOffset == -1 ? parent.getClosureHomeOffset() : closureHomeOffset;
    }

    public Continuation getClosureHomeCont() {
        return closureHomeCont == null ? parent.getClosureHomeCont() : closureHomeCont;
    }

    public Scope toScope() {
        Scope scope = parent == null ? new Scope() : new Scope(parent.toScope());
        for (Variable var : vars) {
            scope.addVariable(var.name);
        }
        return scope;
    }
}
