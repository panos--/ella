package org.unbunt.sqlscript.compiler.support;

public interface RawSQL {
    String getStatement();

    SQLParseMode getParseMode();
}
