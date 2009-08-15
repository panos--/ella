package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.exception.ClosureTerminatedException;

/**
 * Represents activatable EllaScript objects.
 */
public interface Call extends Obj {
    /**
     * Invokes this object.
     *
     * @param engine the executing engine.
     * @param context the activation context the object is to be invoked with. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     * @return a value to be used as the result of the evaluation. May be <code>null</code>, to indicate the value
     *         of last evaluation should be preserved.
     * @throws ClosureTerminatedException indicates the invocation has to end abruptly because of a return operation
     *                                    triggered from inside a block closure.
     */
    Obj call(Engine engine, Obj context, Obj... args);

    /**
     * Invokes this object.
     *
     * @param engine the executing engine.
     * @param context the activation context the object is to be invoked with. May be <code>null</code>.
     * @param receiver the object where this object was looked up in. Available within the function via the
     *                 <code>super</code> keyword. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     * @return a value to be used as the result of the evaluation. May be <code>null</code>, to indicate the value
     *         of last evaluation should be preserved.
     * @throws ClosureTerminatedException indicates the invocation has to end abruptly because of a return operation
     *                                    triggered from inside a block closure.
     */
    Obj call(Engine engine, Obj context, Obj receiver, Obj... args);

    /**
     * Triggers activation of this object.
     * The activation is started when control returns to the evaluating engine.
     *
     * @param engine the executing engine.
     * @param context the activation context the object is to be invoked with. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     */
    void trigger(Engine engine, Obj context, Obj... args);
}
