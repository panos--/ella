package org.unbunt.sqlscript.lang;

public class Base extends Obj {
    public static final Base instance = new Base();

    private Base() {
    }

    /**
     * Helper for deferred initialization.
     *
     * There is a circular dependancy between Base and Str classes, where Base requires Str to setup slots
     * and Str depends on Base as it's parent. Therefore the default ctor of Base does nothing. The actual
     * initialization is then triggerd by Str class as soon as it is ready.  
     */
    protected static void initialize() {
        instance.slots.put(Str.Sym._id.str, Primitive.Type.ID.primitive);
        instance.slots.put(Str.Sym._ni.str, Primitive.Type.NI.primitive);
    }
}
