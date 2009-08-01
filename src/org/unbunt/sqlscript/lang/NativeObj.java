package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.engine.Obj;

public interface NativeObj extends Obj {
    Call getNativeConstructor();
}
