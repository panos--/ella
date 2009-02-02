package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.lang.Obj;

public interface Expression extends Statement {
    public Obj getValue();
}
