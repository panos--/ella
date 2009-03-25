package org.unbunt.sqlscript.lang;

import java.util.HashMap;
import java.util.Map;

public class Str extends Obj {
    protected String value;

    protected static Map<String, Str> pool = new HashMap<String, Str>();

    public Str(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Str str = (Str) o;

        return !(value != null ? !value.equals(str.value) : str.value != null);
    }

    public int hashCode() {
        return (value != null ? value.hashCode() : 0);
    }

    public String toString() {
        return value;
    }

    public synchronized Str intern() {
        if (pool == null) {
            return this;
        }
        Str interned = pool.get(value);
        if (interned != null) {
            return interned;
        }

        pool.put(value, this);
        return this;
    }
}
