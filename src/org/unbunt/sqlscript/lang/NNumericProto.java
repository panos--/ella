package org.unbunt.sqlscript.lang;

import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.support.Context;
import org.unbunt.sqlscript.support.ProtoRegistry;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;

public class NNumericProto extends AbstractObj {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected static final NativeCall nativeNumValue = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            return new NNum(thiz.longValue());
        }
    };

    protected static final NativeCall nativeBigNumValue = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            return new NBigNum(thiz.bigIntegerValue());
        }
    };

    protected static final NativeCall nativeRealValue = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            return new NReal(thiz.doubleValue());
        }
    };

    protected static final NativeCall nativeBigRealValue = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            return new NBigReal(thiz.bigDecimalValue());
        }
    };

    protected static final NativeCall nativeToByte = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric num = ensureType(NNumeric.class, context);
            return new JObject(num.byteValue());
        }
    };

    protected static final NativeCall nativeToShort = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric num = ensureType(NNumeric.class, context);
            return new JObject(num.shortValue());
        }
    };

    protected static final NativeCall nativeToInteger = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric num = ensureType(NNumeric.class, context);
            return new JObject(num.intValue());
        }
    };

    protected static final NativeCall nativeToLong = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric num = ensureType(NNumeric.class, context);
            return new JObject(num.longValue());
        }
    };

    protected static final NativeCall nativeToFloat = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric num = ensureType(NNumeric.class, context);
            return new JObject(num.floatValue());
        }
    };

    protected static final NativeCall nativeToDouble = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric num = ensureType(NNumeric.class, context);
            return new JObject(num.doubleValue());
        }
    };

    protected static final NativeCall nativeGreaterThan = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            return thiz.compareTo(arg) > 0 ? engine.getObjTrue() : engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeGreaterOrEqual = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            return thiz.compareTo(arg) >= 0 ? engine.getObjTrue() : engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeLessThan = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            return thiz.compareTo(arg) < 0 ? engine.getObjTrue() : engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeLessOrEqual = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            return thiz.compareTo(arg) <= 0 ? engine.getObjTrue() : engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeEqual = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            return thiz.compareTo(arg) == 0 ? engine.getObjTrue() : engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeNotEqual = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            return thiz.compareTo(arg) != 0 ? engine.getObjTrue() : engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeIdentical = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            return thiz.getType() == arg.getType() && thiz.compareTo(arg) == 0
                   ? engine.getObjTrue()
                   : engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeNotIdentical = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            return thiz.getType() != arg.getType() || thiz.compareTo(arg) != 0
                   ? engine.getObjTrue()
                   : engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeIsNaN = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeIsInfinity = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeIsPositiveInfinity = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeIsNegativeInfinity = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return engine.getObjFalse();
        }
    };

    private NNumericProto() {
        slots.put(Str.SYM__gt, nativeGreaterThan);
        slots.put(Str.SYM__ge, nativeGreaterOrEqual);
        slots.put(Str.SYM__lt, nativeLessThan);
        slots.put(Str.SYM__le, nativeLessOrEqual);
        slots.put(Str.SYM__eq, nativeEqual);
        slots.put(Str.SYM__ne, nativeNotEqual);
        slots.put(Str.SYM__id, nativeIdentical);
        slots.put(Str.SYM__ni, nativeNotIdentical);
        slots.put(Str.SYM_numValue, nativeNumValue);
        slots.put(Str.SYM_bigNumValue, nativeBigNumValue);
        slots.put(Str.SYM_realValue, nativeRealValue);
        slots.put(Str.SYM_bigRealValue, nativeBigRealValue);
        slots.put(Str.SYM_toByte, nativeToByte);
        slots.put(Str.SYM_toShort, nativeToShort);
        slots.put(Str.SYM_toInteger, nativeToInteger);
        slots.put(Str.SYM_toLong, nativeToLong);
        slots.put(Str.SYM_toFloat, nativeToFloat);
        slots.put(Str.SYM_toDouble, nativeToDouble);
        slots.put(Str.SYM_isNaN, nativeIsNaN);
        slots.put(Str.SYM_isInfinity, nativeIsInfinity);
        slots.put(Str.SYM_isPositiveInfinity, nativeIsPositiveInfinity);
        slots.put(Str.SYM_isNegativeInfinity, nativeIsNegativeInfinity);
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        Base.registerInContext(ctx);
        if (!ctx.hasObject(OBJECT_ID)) {
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new NNumericProto());
        }
    }
}
