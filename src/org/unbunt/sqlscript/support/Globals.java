package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.Obj;

public enum Globals {
    Null (org.unbunt.sqlscript.lang.Null.instance),
    Sys (org.unbunt.sqlscript.lang.Sys.instance),
    Base (org.unbunt.sqlscript.lang.Base.instance),
    Bool (org.unbunt.sqlscript.lang.Bool.PROTOTYPE),
    Clos (org.unbunt.sqlscript.lang.Clos.PROTOTYPE),
    Func (org.unbunt.sqlscript.lang.Func.PROTOTYPE),
    Int (org.unbunt.sqlscript.lang.Int.PROTOTYPE),
    Str (org.unbunt.sqlscript.lang.Str.PROTOTYPE),
    JArray (org.unbunt.sqlscript.lang.JArray.PROTOTYPE),
    JClass (org.unbunt.sqlscript.lang.JClass.PROTOTYPE);

    protected final String identifier;
    protected final Obj value;

    Globals(Obj value) {
        this.value = value;
        this.identifier = this.name();
    }

    Globals(String identifier, Obj value) {
        this.value = value;
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Obj getValue() {
        return value;
    }
}
