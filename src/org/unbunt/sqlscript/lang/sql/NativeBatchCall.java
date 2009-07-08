package org.unbunt.sqlscript.lang.sql;

import org.unbunt.sqlscript.lang.NativeCall;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.lang.Int;
import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.utils.ObjUtils;
import static org.unbunt.sqlscript.utils.ObjUtils.ensureType;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;

abstract class NativeBatchCall extends NativeCall {
    public static final int DEFAULT_BATCH_SIZE = 1000;

    public final Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
        Obj closure;
        int batchSize;
        if (args.length > 1) {
            closure = args[1];
            Int bs = ensureType(args[0]);
            batchSize = bs.value;
        }
        else {
            closure = args[0];
            batchSize = DEFAULT_BATCH_SIZE;
        }
        return batchCall(engine, context, closure, batchSize);
    }

    protected abstract Obj batchCall(SQLScriptEngine engine, Obj context, Obj closure, int batchSize);
}
