package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;

import java.util.ArrayList;

public class StaticEnv extends AbstractEnv {
    protected ArrayList<Obj> vars = new ArrayList<Obj>();

    protected Obj thisRef = null;
    protected Obj superRef = null;

    public StaticEnv() {
        super(new TopEnv());
    }

    public StaticEnv(Env parent) {
        super(parent);
    }

    public void setThis(Obj thisRef) {
        this.thisRef = thisRef;
    }

    public Obj getThis() {
        return thisRef;
    }

    public Obj getSuper() {
        return superRef;
    }

    public void setSuper(Obj superRef) {
        this.superRef = superRef;
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
