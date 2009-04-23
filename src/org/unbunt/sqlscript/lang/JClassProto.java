package org.unbunt.sqlscript.lang;

/**
 * User: tweiss
 * Date: 23.04.2009
 * Time: 08:41:45
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class JClassProto extends Obj {
    public static final JClassProto instance = new JClassProto();

    public JClassProto() {
        slots.put(Str.Sym.parent.str, Base.instance);
    }
}
