package org.unbunt.ella.engine.corelang;

/**
 * Interface for primitive operations.
 * <p>
 * Defines operation codes for all operations which have to be supported by EllaScript execution engines.
 */
public interface Primitive extends Obj, Call {
    public static final int CODE_ID = 1;
    public static final int CODE_NI = 2;
    public static final int CODE_LOOP = 3;
    public static final int CODE_LOOP_BREAK = 4;
    public static final int CODE_LOOP_CONTINUE = 5;
    public static final int CODE_EXIT = 6;

    /**
     * Returns the type code.
     *
     * @return the type code.
     */
    public int getCode();
}
