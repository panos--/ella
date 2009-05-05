package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.continuations.Continuation;

import java.util.ArrayList;

public class StaticEnv extends AbstractEnv {
    protected ArrayList<Obj> vars = new ArrayList<Obj>();

    protected Obj context = null;
    protected Obj receiver = null;

    protected int closureHomeOffset = -1;
    protected Continuation closureHomeCont = null;

    protected StaticEnv() {
        super(new TopEnv());
    }

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

    public void extend() {
            vars.add(null);
    }

    public Obj get(Variable var, int addr) {
        if (addr > 0xFFFF) {
            return parent.get(var, addr - 0x10000);
        }
        return vars.get(addr);
    }

    public void set(Variable var, int addr, Obj value) {
        if (addr > 0xFFFF) {
            parent.set(var, addr - 0x10000, value);
        }
        else {
            vars.set(addr, value);
        }
    }

    public void add(Obj value) {
        vars.add(value);
    }

    public int getMaxAddress() {
        return vars.size() - 1;
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
}
