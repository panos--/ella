package org.unbunt.sqlscript.lang;

/**
 * User: tweiss
 * Date: 23.04.2009
 * Time: 08:36:57
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class JClass extends Obj {
    public final Class cls;

    public JClass(Class cls) {
        this.cls = cls;
        slots.put(Str.Sym.parent.str, JClassProto.instance);
    }

    public String toString() {
        return "[JClass " + cls.toString() + "]";
    }
}
