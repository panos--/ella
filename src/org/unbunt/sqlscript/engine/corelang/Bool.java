package org.unbunt.sqlscript.engine.corelang;

import org.unbunt.sqlscript.engine.corelang.Obj;

public interface Bool extends Obj {
    boolean isTrue();

    boolean isFalse();

    boolean getValue();
}
