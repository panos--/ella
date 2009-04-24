package org.unbunt.sqlscript.lang;

public class Args extends Obj {
    public final Obj[] args;

    public static final Args emptyArgs = new Args(new Obj[0]);

    public Args(Obj[] args) {
        this.args = args;
//        slots.put(Str.Sym.parent.str, Base.instance);
    }
}
