package org.unbunt.ella.engine;

import org.unbunt.ella.compiler.statement.Block;
import org.unbunt.ella.exception.EllaException;
import org.unbunt.ella.exception.EllaRuntimeException;
import org.unbunt.ella.engine.context.Context;

public interface EllaEngine {
    Object eval(Block block) throws EllaException;

    void finish() throws EllaRuntimeException;

    boolean isFinished();

    Context getContext();
}
