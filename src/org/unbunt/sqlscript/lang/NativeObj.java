package org.unbunt.sqlscript.lang;

public interface NativeObj extends Obj {
    Call getNativeConstructor();
}
