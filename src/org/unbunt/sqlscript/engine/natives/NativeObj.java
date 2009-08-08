package org.unbunt.sqlscript.engine.natives;

import org.unbunt.sqlscript.engine.natives.Obj;

public interface NativeObj extends Obj {
    Call getNativeConstructor();
}
