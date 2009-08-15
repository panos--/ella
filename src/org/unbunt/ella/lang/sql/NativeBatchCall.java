package org.unbunt.ella.lang.sql;

import org.unbunt.ella.engine.corelang.Engine;
import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.engine.corelang.NativeCall;
import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.lang.NNumeric;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;

/**
 * Base class for the various statement batch calls.
 */
abstract class NativeBatchCall extends NativeCall {
    protected static final int DEFAULT_BATCH_SIZE = 1000;

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
