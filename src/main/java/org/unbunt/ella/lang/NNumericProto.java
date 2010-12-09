/* NNumericProto.java
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package org.unbunt.ella.lang;

import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.exception.NumberNotComparableException;
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.engine.context.Context;

/**
 * Represents an EllaScript object acting as implicit parent object for every numeric EllaScript object.
 */
public class NNumericProto extends AbstractObj {
    protected static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected static final NativeCall nativeNumValue = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            return new NNum(thiz.longValue());
        }
    };

    protected static final NativeCall nativeBigNumValue = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            return new NBigNum(thiz.bigIntegerValue());
        }
    };

    protected static final NativeCall nativeRealValue = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            return new NReal(thiz.doubleValue());
        }
    };

    protected static final NativeCall nativeBigRealValue = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            return new NBigReal(thiz.bigDecimalValue());
        }
    };

    protected static final NativeCall nativeToByte = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric num = ensureType(NNumeric.class, context);
            return new JObject(num.byteValue());
        }
    };

    protected static final NativeCall nativeToShort = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric num = ensureType(NNumeric.class, context);
            return new JObject(num.shortValue());
        }
    };

    protected static final NativeCall nativeToInteger = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric num = ensureType(NNumeric.class, context);
            return new JObject(num.intValue());
        }
    };

    protected static final NativeCall nativeToLong = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric num = ensureType(NNumeric.class, context);
            return new JObject(num.longValue());
        }
    };

    protected static final NativeCall nativeToFloat = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric num = ensureType(NNumeric.class, context);
            return new JObject(num.floatValue());
        }
    };

    protected static final NativeCall nativeToDouble = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric num = ensureType(NNumeric.class, context);
            return new JObject(num.doubleValue());
        }
    };

    protected static final NativeCall nativeGreaterThan = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            try {
                return thiz.compareTo(arg) > 0 ? engine.getObjTrue() : engine.getObjFalse();
            } catch (NumberNotComparableException e) {
                return engine.getObjFalse();
            }
        }
    };

    protected static final NativeCall nativeGreaterOrEqual = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            try {
                return thiz.compareTo(arg) >= 0 ? engine.getObjTrue() : engine.getObjFalse();
            } catch (NumberNotComparableException e) {
                return engine.getObjFalse();
            }
        }
    };

    protected static final NativeCall nativeLessThan = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            try {
                return thiz.compareTo(arg) < 0 ? engine.getObjTrue() : engine.getObjFalse();
            } catch (NumberNotComparableException e) {
                return engine.getObjFalse();
            }
        }
    };

    protected static final NativeCall nativeLessOrEqual = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            try {
                return thiz.compareTo(arg) <= 0 ? engine.getObjTrue() : engine.getObjFalse();
            } catch (NumberNotComparableException e) {
                return engine.getObjFalse();
            }
        }
    };

    protected static final NativeCall nativeEqual = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            try {
                return thiz.compareTo(arg) == 0 ? engine.getObjTrue() : engine.getObjFalse();
            } catch (NumberNotComparableException e) {
                return engine.getObjFalse();
            }
        }
    };

    protected static final NativeCall nativeNotEqual = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            try {
                return thiz.compareTo(arg) != 0 ? engine.getObjTrue() : engine.getObjFalse();
            } catch (NumberNotComparableException e) {
                return engine.getObjTrue();
            }
        }
    };

    protected static final NativeCall nativeIdentical = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            try {
                return thiz.getType() == arg.getType() && thiz.compareTo(arg) == 0
                       ? engine.getObjTrue()
                       : engine.getObjFalse();
            } catch (NumberNotComparableException e) {
                return engine.getObjFalse();
            }
        }
    };

    protected static final NativeCall nativeNotIdentical = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            NNumeric thiz = ensureType(NNumeric.class, context);
            NNumeric arg = ensureType(NNumeric.class, args[0]);
            try {
                return thiz.getType() != arg.getType() || thiz.compareTo(arg) != 0
                       ? engine.getObjTrue()
                       : engine.getObjFalse();
            } catch (NumberNotComparableException e) {
                return engine.getObjTrue();
            }
        }
    };

    protected static final NativeCall nativeIsNaN = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeIsInfinity = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeIsPositiveInfinity = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return engine.getObjFalse();
        }
    };

    protected static final NativeCall nativeIsNegativeInfinity = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
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

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
    public static void registerInContext(Context ctx) {
        Base.registerInContext(ctx);
        if (!ctx.hasObject(OBJECT_ID)) {
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new NNumericProto());
        }
    }
}
