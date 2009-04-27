package org.unbunt.sqlscript.lang;

public class JArray extends Obj {
    public final Object array;

    public JArray(Object array) {
        this.array = array;
    }

    @Override
    public Object toJavaObject() {
        return array;
    }
}
