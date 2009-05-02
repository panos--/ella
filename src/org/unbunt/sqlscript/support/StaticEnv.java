package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;

import java.util.ArrayList;

public class StaticEnv extends AbstractEnv {
    protected ArrayList<Obj> vars = new ArrayList<Obj>();

    protected Obj context = null;
    protected Obj receiver = null;

    public StaticEnv() {
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
}
