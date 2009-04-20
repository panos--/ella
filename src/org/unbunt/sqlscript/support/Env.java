package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;

import java.util.ArrayList;

public class Env {
    protected Env parent;
    protected ArrayList<Obj> vars = new ArrayList<Obj>();

    protected Obj thisRef = null;

    public Env() {
        this.parent = null;
    }

    public Env(Env parent) {
        this.parent = parent;
    }

    public void setThis(Obj thisRef) {
        this.thisRef = thisRef;
    }

    public Obj getThis() {
        return thisRef;
    }

    public void extend() {
            vars.add(null);
    }

    public Obj get(int addr) {
        if (addr > 0xFFFF) {
            return parent.get(addr - 0x10000);
        }
        return vars.get(addr);
    }

    public void set(int addr, Obj value) {
        if (addr > 0xFFFF) {
            parent.set(addr - 0x10000, value);
        }
        else {
            vars.set(addr, value);
        }
    }

    public void add(Obj value) {
        vars.add(value);
    }
}
