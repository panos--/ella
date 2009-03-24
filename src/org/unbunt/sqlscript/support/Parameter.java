package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;

public class Parameter {
    protected String name = null;
    protected Obj value = null;

    public Parameter() {
    }

    public Parameter(String name) {
        this(name, null);
    }

    public Parameter(String name, Obj value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Obj getValue() {
        return value;
    }

    public void setValue(Obj value) {
        this.value = value;
    }

    public String getValueAsString() {
        return value == null ? "" : value.toString();
    }

    public String toString() {
        return name + (value == null ? "" : "=" + value);
    }
}
