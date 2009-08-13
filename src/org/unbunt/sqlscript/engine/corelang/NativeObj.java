package org.unbunt.sqlscript.engine.corelang;

import org.unbunt.sqlscript.engine.corelang.Obj;

public interface NativeObj extends Obj {
    Call getNativeConstructor();
}
