package org.unbunt.sqlscript.lang;

import java.lang.reflect.Constructor;

public class JConstructor extends Obj {
    public final Constructor[] ctors;

    public JConstructor(Constructor[] ctors) {
        this.ctors = ctors;
        slots.put(Str.Sym.parent.str, JConstructorProto.instance);
    }
}
