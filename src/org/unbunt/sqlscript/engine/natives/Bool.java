package org.unbunt.sqlscript.engine.natives;

import org.unbunt.sqlscript.engine.natives.Obj;

public interface Bool extends Obj {
    boolean isTrue();

    boolean isFalse();

    boolean getValue();
}
