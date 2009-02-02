package org.unbunt.sqlscript.support;

public class Parameter {
    protected String name = null;
    protected Variable value = null;

    public Parameter() {
    }

    public Parameter(String name) {
        this(name, null);
    }

    public Parameter(String name, Variable value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Variable getValue() {
        return value;
    }

    public void setValue(Variable value) {
        this.value = value;
    }

    public String getValueAsString() {
        return value == null || value.getValue() == null ? "" : value.getValue().toString();
    }

    public String toString() {
        return name + (value == null ? "" : "=" + value);
    }
}
