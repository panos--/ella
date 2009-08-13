package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.engine.corelang.Obj;

public interface Bool extends Obj {
    boolean isTrue();

    boolean isFalse();

    boolean getValue();
}
