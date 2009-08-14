package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.engine.corelang.Call;
import org.unbunt.ella.compiler.support.BlockClosure;

public interface Clos extends Obj, Call {
    BlockClosure getClosure();
}
