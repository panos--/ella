package org.unbunt.ella.lang;

import org.unbunt.ella.engine.corelang.*;
import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.engine.context.Context;

import java.util.HashMap;
import java.util.Map;
import java.util.Locale;

/**
 * Represents an EllaScript object wrapping <code>String</code> values.
 */
public class Str extends AbstractObj {
    protected static Map<String, Str> pool = new HashMap<String, Str>();

    public static final Str SYM__plus = toSym("+");
    public static final Str SYM__minus = toSym("-");
    public static final Str SYM__star = toSym("*");
    public static final Str SYM__slash = toSym("/");
    public static final Str SYM__percent = toSym("%");
    public static final Str SYM__gt = toSym(">");
    public static final Str SYM__ge = toSym(">=");
    public static final Str SYM__lt = toSym("<");
    public static final Str SYM__le = toSym("<=");
    public static final Str SYM__eq = toSym("==");
    public static final Str SYM__ne = toSym("!=");
    public static final Str SYM__id = toSym("===");
    public static final Str SYM__ni = toSym("!==");
    public static final Str SYM__dotdot = toSym("..");
    public static final Str SYM__break = toSym("_break");
    public static final Str SYM__continue = toSym("_continue");
    public static final Str SYM__exit = toSym("_exit");
    public static final Str SYM__logic_and = toSym("&&");
    public static final Str SYM__logic_or = toSym("||");
    public static final Str SYM__logic_not = toSym("!");
    public static final Str SYM_add = toSym("add");
    public static final Str SYM_addAll = toSym("addAll");
    public static final Str SYM_addParams = toSym("addParams");
    public static final Str SYM_activate = toSym("activate");
    public static final Str SYM_active = toSym("active");
    public static final Str SYM_associateConnection = toSym("associateConnection");
    public static final Str SYM_batch = toSym("batch");
    public static final Str SYM_batchNamed = toSym("batchNamed");
    public static final Str SYM_begin = toSym("begin");
    public static final Str SYM_bigNumValue = toSym("bigNumValue");
    public static final Str SYM_bigRealValue = toSym("bigRealValue");
    public static final Str SYM_call = toSym("call");
    public static final Str SYM_charAt = toSym("charAt");
    public static final Str SYM_clone = toSym("clone");
    public static final Str SYM_cloneInit = toSym("cloneInit");
    public static final Str SYM_close = toSym("close");
    public static final Str SYM_commit = toSym("commit");
    public static final Str SYM_cr = toSym("cr");
    public static final Str SYM_create = toSym("create");
    public static final Str SYM_createFromProps = toSym("createFromProps");
    public static final Str SYM_createStmt = toSym("createStmt");
    public static final Str SYM_do = toSym("do");
    public static final Str SYM_each = toSym("each");
    public static final Str SYM_eachKey = toSym("eachKey");
    public static final Str SYM_eachRow = toSym("eachRow");
    public static final Str SYM_eachSlot = toSym("eachSlot");
    public static final Str SYM_exec = toSym("exec");
    public static final Str SYM_execStmt = toSym("execStmt");
    public static final Str SYM_explicitSlot = toSym("explicitSlot");
    public static final Str SYM_filter = toSym("filter");
    public static final Str SYM_finish = toSym("finish");
    public static final Str SYM_first = toSym("first");
    public static final Str SYM_fromCharCode = toSym("fromCharCode");
    public static final Str SYM_get = toSym("get");
    public static final Str SYM_getQueryString = toSym("getQueryString");
    public static final Str SYM_has = toSym("has");
    public static final Str SYM_hasSlot = toSym("hasSlot");
    public static final Str SYM_importPackage = toSym("importPackage");
    public static final Str SYM_if = toSym("if");
    public static final Str SYM_ifThen = toSym("ifThen");
    public static final Str SYM_includeFile = toSym("includeFile");
    public static final Str SYM_init = toSym("init");
    public static final Str SYM_insert = toSym("insert");
    public static final Str SYM_isNaN = toSym("isNaN");
    public static final Str SYM_isInfinity = toSym("isInfinity");
    public static final Str SYM_isPositiveInfinity = toSym("isPositiveInfinity");
    public static final Str SYM_isNegativeInfinity = toSym("isNegativeInfinity");
    public static final Str SYM_join = toSym("join");
    public static final Str SYM_key = toSym("key");
    public static final Str SYM_length = toSym("length");
    public static final Str SYM_lf = toSym("lf");
    public static final Str SYM_loop = toSym("loop");
    public static final Str SYM_map = toSym("map");
    public static final Str SYM_neg = toSym("neg");
    public static final Str SYM_new = toSym("new");
    public static final Str SYM_nl = toSym("nl");
    public static final Str SYM_crlf = toSym("crlf");
    public static final Str SYM_noop = toSym("noop");
    public static final Str SYM_not = toSym("not");
    public static final Str SYM_numValue = toSym("numValue");
    public static final Str SYM_onAfterExecute = toSym("onAfterExecute");
    public static final Str SYM_parent = toSym("parent");
    public static final Str SYM_print = toSym("print");
    public static final Str SYM_put = toSym("put");
    public static final Str SYM_raise = toSym("raise");
    public static final Str SYM_realValue = toSym("realValue");
    public static final Str SYM_remove = toSym("remove");
    public static final Str SYM_removeSlot = toSym("removeSlot");
    public static final Str SYM_resultSet = toSym("resultSet");
    public static final Str SYM_rollback = toSym("rollback");
    public static final Str SYM_scriptName = toSym("scriptName");
    public static final Str SYM_scriptResource = toSym("scriptResource");
    public static final Str SYM_select = toSym("select");
    public static final Str SYM_set = toSym("set");
    public static final Str SYM_size = toSym("size");
    public static final Str SYM_start = toSym("start");
    public static final Str SYM_stop = toSym("stop");
    public static final Str SYM_throw = toSym("throw");
    public static final Str SYM_to = toSym("to");
    public static final Str SYM_toByte = toSym("toByte");
    public static final Str SYM_toDouble = toSym("toDouble");
    public static final Str SYM_toDict = toSym("toDict");
    public static final Str SYM_toFloat = toSym("toFloat");
    public static final Str SYM_toInteger = toSym("toInteger");
    public static final Str SYM_toLong = toSym("toLong");
    public static final Str SYM_toLower = toSym("toLower");
    public static final Str SYM_toShort = toSym("toShort");
    public static final Str SYM_toUpper = toSym("toUpper");
    public static final Str SYM_tryCatch = toSym("tryCatch");
    public static final Str SYM_tryCatchFinally = toSym("tryCatchFinally");
    public static final Str SYM_tryFinally = toSym("tryFinally");
    public static final Str SYM_tx = toSym("tx");
    public static final Str SYM_type = toSym("type");
    public static final Str SYM_update = toSym("update");
    public static final Str SYM_valueOf = toSym("valueOf");
    public static final Str SYM_values = toSym("values");
    public static final Str SYM_whileTrue = toSym("whileTrue");
    public static final Str SYM_with = toSym("with");
    public static final Str SYM_withNamed = toSym("withNamed");
    public static final Str SYM_withParams = toSym("withParams");
    public static final Str SYM_withPrepared = toSym("withPrepared");
    public static final Str SYM_withResult = toSym("withResult");

    /**
     * The wrapped value.
     */
    public final String value;

    /**
     * Creates a new Str wrapping the given value.
     *
     * @param value the value to wrap.
     */
    public Str(String value) {
        this.value = value;
    }

    protected static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public int getObjectID() {
        return OBJECT_ID;
    }

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
    public static void registerInContext(Context ctx) {
        // NOTE: Nothing to do here registration is done from Base.registerInContext to avoid circular dependency
    }

    /**
     * Returns the wrapped String value.
     *
     * @return the wrapped value.
     */
    public String getValue() {
        return value;
    }

    @SuppressWarnings({"CastToConcreteClass"})
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Str str = (Str) o;

        return !(value != null ? !value.equals(str.value) : str.value != null);
    }

    public int hashCode() {
        return (value != null ? value.hashCode() : 0);
    }

    @Override
    public Object toJavaObject() {
        return value;
    }

    public String toString() {
        return value;
    }

    /**
     * Does semantically the same as {@link String#intern()} just for EllaScript string objects.
     *
     * @return the canonical Str object matching this Str object.
     */
    public synchronized Str intern() {
        Str interned = pool.get(value);
        if (interned != null) {
            return interned;
        }

        pool.put(value, this);
        return this;
    }

    /**
     * Creates a symbol from the given String.
     *
     * @param name the String.
     * @return the symbol.
     * @see #intern()
     */
    public static Str toSym(String name) {
        return new Str(name).intern();
    }

    /**
     * Represents the implicit parent object for Str objects.
     */
    public static class StrProto extends AbstractObj implements NativeObj {
        protected static final String NEWLINE = System.getProperty("line.separator");

        protected static final Call NATIVE_CONSTRUCTOR = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                return new Str(args[0].toString());
            }
        };

        protected static final NativeCall nativeAdd = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
                Str thiz = ObjUtils.ensureType(Str.class, context);
                return new Str(thiz.value + args[0].toString());
            }
        };

        protected static final NativeCall nativeLength = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                Str thiz = ObjUtils.ensureType(Str.class, context);
                return new NNum(thiz.value.length());
            }
        };

        protected static final NativeCall nativeCharAt = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                Str thiz = ObjUtils.ensureType(Str.class, context);
                NNumeric index = ObjUtils.ensureType(NNumeric.class, args[0]);
                return new Str("" + thiz.value.charAt(index.intValue()));
            }
        };

        protected static final NativeCall nativeToUpper = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                Str thiz = ObjUtils.ensureType(Str.class, context);
                return new Str(thiz.value.toUpperCase());
            }
        };

        protected static final NativeCall nativeToLower = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                Str thiz = ObjUtils.ensureType(Str.class, context);
                return new Str(thiz.value.toLowerCase());
            }
        };

        protected static final NativeCall nativeFromCharCode = new NativeCall() {
            public Obj call(Engine engine, Obj context, Obj... args) {
                NNumeric codeObj = ObjUtils.ensureType(NNumeric.class, args[0]);
                int code = codeObj.intValue();
                return new Str(Character.toString((char) code));
            }
        };

        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        public int getObjectID() {
            return OBJECT_ID;
        }

        protected StrProto() {
            slots.put(SYM_lf, Str.toSym("\n"));
            slots.put(SYM_cr, Str.toSym("\r"));
            slots.put(SYM_crlf, Str.toSym("\r\n"));
            slots.put(SYM_nl, Str.toSym(NEWLINE));
            slots.put(SYM__plus, nativeAdd);
            slots.put(SYM_length, nativeLength);
            slots.put(SYM_charAt, nativeCharAt);
            slots.put(SYM_toUpper, nativeToUpper);
            slots.put(SYM_toLower, nativeToLower);
            slots.put(SYM_fromCharCode, nativeFromCharCode);
        }

        /**
         * Registers this EllaScript object within the given execution context.
         *
         * @param ctx the execution context to register this object in.
         */
        @SuppressWarnings({"UnusedDeclaration"})
        public static void registerInContext(Context ctx) {
            // NOTE: Nothing to do here registration is done from Base.registerInContext to avoid circular dependency
        }

        public Call getNativeConstructor() {
            return NATIVE_CONSTRUCTOR;
        }
    }
}
