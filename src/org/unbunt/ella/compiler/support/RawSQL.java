package org.unbunt.ella.compiler.support;

public interface RawSQL {
    String getStatement();

    SQLParseMode getParseMode();
}
