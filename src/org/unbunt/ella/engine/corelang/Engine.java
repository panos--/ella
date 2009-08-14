package org.unbunt.ella.engine.corelang;

import org.unbunt.ella.compiler.statement.Block;
import org.unbunt.ella.engine.EngineState;
import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.engine.context.SQLResultProvider;
import org.unbunt.ella.engine.environment.Env;
import org.unbunt.ella.exception.ClosureTerminatedException;
import org.unbunt.ella.exception.LoopBreakException;
import org.unbunt.ella.exception.LoopContinueException;

/**
 * Represents the native interface to be implemented by a virtual machine for the ella language.
 * <p>
 * The native interface is the API element used by native objects to interact with the execution engine.
 */
public interface Engine extends SQLResultProvider {
    boolean isClosureReturnInProgress();

    boolean toBoolean(Obj value);

    void trigger(Obj obj, Obj context, Obj... args);

    void trigger(PrimitiveCall prim, Obj context, Obj... args);

    void trigger(NativeCall nat, Obj context, Obj... args);

    void trigger(Clos clos, Obj... args);

    void trigger(Func func, Obj context, Obj receiver, Obj... args);

    Obj invokeOnReceiver(Obj call, Obj context, Obj receiver, Obj... args);

    /**
     * Invokes the given object.
     *
     * @param call the activatable object to be invoked.
     * @param context the activation context the object is to be invoked with. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     * @return a value to be used a the result of the evaluation. May by <code>null</code>, to indicate the value
     *         of last evaluation should be preserved.
     * @throws ClosureTerminatedException indicates the invocation has to end abruptly because of a return operation
     *                                    triggered from inside a block closure.
     */
    Obj invoke(Obj call, Obj context, Obj... args) throws ClosureTerminatedException;

    Obj invoke(PrimitiveCall prim, Obj context, Obj... args);

    Obj invoke(NativeCall nat, Obj context, Obj... args);

    Obj invoke(Clos clos, Obj... args) throws ClosureTerminatedException;

    Obj invoke(Func func, Obj context, Obj receiver, Obj... args) throws ClosureTerminatedException;

    Obj invokeSlot(Obj obj, Obj slot, Obj... args) throws ClosureTerminatedException;

    Obj invokeSlotIfPresent(Obj obj, Obj slot, Obj... args);

    Obj invokeBlock(Block block) throws ClosureTerminatedException;

    Obj invokeInLoop(Obj obj, Obj context, Obj... args)
            throws ClosureTerminatedException, LoopBreakException, LoopContinueException;

    Obj getVal();

    void setVal(Obj val);

    EngineState getState();

    void setState(EngineState state);

    Env getEnv();

    void setEnv(Env env);

    Context getContext();

    Sys getObjSys();

    ConnMgr getObjConnMgr();

    Null getObjNull();

    Bool getObjTrue();

    Bool getObjFalse();

}
