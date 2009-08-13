package org.unbunt.sqlscript.lang.sql;

import org.unbunt.sqlscript.engine.Engine;
import org.unbunt.sqlscript.engine.corelang.Obj;
import org.unbunt.sqlscript.engine.corelang.NativeCall;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.lang.NNumeric;
import static org.unbunt.sqlscript.engine.corelang.ObjUtils.ensureType;

abstract class NativeBatchCall extends NativeCall {
    public static final int DEFAULT_BATCH_SIZE = 1000;

    public final Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
        Obj closure;
        int batchSize;
        if (args.length > 1) {
            closure = args[1];
            NNumeric bs = ensureType(NNumeric.class, args[0]);
            batchSize = bs.intValue();
        }
        else {
            closure = args[0];
            batchSize = DEFAULT_BATCH_SIZE;
        }
        return batchCall(engine, context, closure, batchSize);
    }

    protected abstract Obj batchCall(Engine engine, Obj context, Obj closure, int batchSize);
}
