package org.unbunt.ella.compiler.support;

/**
 * Represents an SQL statement.
 */
public interface RawSQL {
    String getStatement();

    SQLParseMode getParseMode();
}
