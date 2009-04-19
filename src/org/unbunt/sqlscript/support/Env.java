package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;

import java.util.ArrayList;

public class Env /*implements Cloneable*/ {
    protected Env parent;
    protected ArrayList<Obj> vars = new ArrayList<Obj>();
//    protected int size = 0;
//    protected int top = -1;

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
//        if (++top == size) {
            vars.add(null);
//            size++;
//        }
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

    /*
    public int save() {
        return top;
    }

    public void restore(int id) {
        this.top = id;
    }
    */

    /*
    @Override
    @SuppressWarnings({"unchecked", "CloneDoesntDeclareCloneNotSupportedException"})
    public Env clone() {
        Env copy;
        try {
            copy = (Env) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new SQLScriptRuntimeException(e.getMessage(), e);
        }
        copy.vars = (ArrayList<Obj>) vars.clone();
        return copy;
    }
    */
}
