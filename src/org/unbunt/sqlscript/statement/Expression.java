package org.unbunt.sqlscript.statement;

public interface Expression extends Statement {
    public static byte CALL_FLAG_SUPER = 0x1;
    public static byte CALL_FLAG_TAIL  = 0x2;
}
