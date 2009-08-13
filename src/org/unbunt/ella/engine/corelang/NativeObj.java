package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.engine.corelang.Obj;

public interface NativeObj extends Obj {
    Call getNativeConstructor();
}
