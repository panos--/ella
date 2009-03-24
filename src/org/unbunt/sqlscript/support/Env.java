package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.unbunt.sqlscript.lang.Obj;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Env implements Cloneable {
    protected ArrayList<Obj> vars = new ArrayList<Obj>();
    protected int size = 0;
    protected int top = -1;

    protected Obj thisRef = null;

    public Env() {
    }

    public void setThis(Obj thisRef) {
        this.thisRef = thisRef;
    }

    public Obj getThis() {
        return thisRef;
    }

    public void extend() {
        if (++top == size) {
            vars.add(null);
            size++;
        }
    }

    public Obj get(int index) {
        return vars.get(top - index);
    }

    public void set(int index, Obj value) {
        vars.set(top - index, value);
    }

    public int save() {
        return top;
    }

    public void restore(int id) {
        this.top = id;
    }

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
}
