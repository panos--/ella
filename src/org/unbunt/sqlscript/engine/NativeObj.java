package org.unbunt.sqlscript.engine;

import org.unbunt.sqlscript.engine.Obj;

public interface NativeObj extends Obj {
    Call getNativeConstructor();
}
