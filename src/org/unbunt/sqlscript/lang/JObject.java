package org.unbunt.sqlscript.lang;

public class JObject extends Obj {
    public final Object value;

    public JObject(Object value) {
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }
}
