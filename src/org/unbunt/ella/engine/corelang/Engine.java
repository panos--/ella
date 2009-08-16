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

    /**
     * Returns the boolean value corresponding to the given EllaScript object.
     * <p>
     * The boolean value is false, if the object is equal to either the <code>false</code> or the <code>null</code>
     * core object. Otherwise the value is true.
     * <p>
     * TODO: This method exists for performance reasons only and should be removed eventually.
     *
     * @param value the EllaScript object to convert to a boolean.
     * @return the corresponding boolean value.
     */
    boolean toBoolean(Obj value);

    /**
     * Triggers activation of the given EllaScript object, which should be an activatable object.
     * The activation is started when control returns to the evaluating engine.
     *
     * @param obj the EllaScript object to trigger activation for.
     * @param context the activation context the object is to be invoked with. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     */
    void trigger(Obj obj, Obj context, Obj... args);

    /**
     * Triggers activation of the given primitive call.
     * The activation is started when control returns to the evaluating engine.
     *
     * @param prim the primitive call to trigger activation for.
     * @param context the activation context the primitive call is to be invoked with. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     */
    void trigger(Primitive prim, Obj context, Obj... args);

    /**
     * Triggers activation of the given native call.
     * The activation is started when control returns to the evaluating engine.
     *
     * @param nat the native call to trigger activation for.
     * @param context the activation context the native call is to be invoked with. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     */
    void trigger(Native nat, Obj context, Obj... args);

    /**
     * Triggers activation of the given block closure.
     * The activation is started when control returns to the evaluating engine.
     *
     * @param clos the block closure to trigger activation for.
     * @param args the arguments passed as part of the invocation.
     */
    void trigger(Clos clos, Obj... args);

    /**
     * Triggers activation of the given EllaScript function.
     * The activation is started when control returns to the evaluating engine.
     *
     * @param func the function to trigger activation for.
     * @param context the activation context the primitive call is to be invoked with. May be <code>null</code>.
     * @param receiver the object where the function was looked up in. Available within the function as via the
     *                 <code>super</code> keyword. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     */
    void trigger(Func func, Obj context, Obj receiver, Obj... args);

    /**
     * Invokes the given object, which should be activatable.
     *
     * @param call the activatable object to be invoked.
     * @param context the activation context the object is to be invoked with. May be <code>null</code>.
     * @param receiver the object where the function was looked up in. Available withing the function via the
     *                 <code>super</code> keyword. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     * @return a value to be used as the result of the evaluation. May be <code>null</code>, to indicate the value
     *         of last evaluation should be preserved.
     * @throws ClosureTerminatedException indicates the invocation has to end abruptly because of a return operation
     *                                    triggered from inside a block closure.
     */
    Obj invokeOnReceiver(Obj call, Obj context, Obj receiver, Obj... args);

    /**
     * Invokes the given object.
     *
     * @param call the activatable object to be invoked.
     * @param context the activation context the object is to be invoked with. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     * @return a value to be used as the result of the evaluation. May be <code>null</code>, to indicate the value
     *         of last evaluation should be preserved.
     * @throws ClosureTerminatedException indicates the invocation has to end abruptly because of a return operation
     *                                    triggered from inside a block closure.
     */
    Obj invoke(Obj call, Obj context, Obj... args);

    /**
     * Invokes the given primitive call.
     *
     * @param prim the primitive call to be invoked.
     * @param context the activation context the primitive call is to be invoked with. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     * @return a value to be used as the result of the evaluation. May be <code>null</code>, to indicate the value
     *         of last evaluation should be preserved.
     */
    Obj invoke(Primitive prim, Obj context, Obj... args);

    /**
     * Invokes the given native call.
     *
     * @param nat the native call to be invoked.
     * @param context the activation context the native call is to be invoked with. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     * @return a value to be used as the result of the evaluation. May be <code>null</code>, to indicate the value
     *         of last evaluation should be preserved.
     * @throws ClosureTerminatedException indicates the invocation has to end abruptly because of a return operation
     *                                    triggered from inside a block closure.
     */
    Obj invoke(Native nat, Obj context, Obj... args);

    /**
     * Invokes the given block closure.
     *
     * @param clos the block closure to be invoked.
     * @param args the arguments passed as part of the invocation.
     * @return a value to be used as the result of the evaluation. May be <code>null</code>, to indicate the value
     *         of last evaluation should be preserved.
     * @throws ClosureTerminatedException indicates the invocation has to end abruptly because of a return operation
     *                                    triggered from inside a block closure.
     */
    Obj invoke(Clos clos, Obj... args);

    /**
     * Invokes the given EllaScript function.
     *
     * @param func the EllaScript function to be invoked.
     * @param context the activation context the function is to be invoked with. May be <code>null</code>.
     * @param receiver the object where the function was looked up in. Available within the function via the
     *                 <code>super</code> keyword. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     * @return a value to be used as the result of the evaluation. May be <code>null</code>, to indicate the value
     *         of last evaluation should be preserved.
     * @throws ClosureTerminatedException indicates the invocation has to end abruptly because of a return operation
     *                                    triggered from inside a block closure.
     */
    Obj invoke(Func func, Obj context, Obj receiver, Obj... args);

    /**
     * Invokes the given slot of the given EllaScript object.
     *
     * @param obj the EllaScript object where the given slot should be looked up.
     * @param slot the slot to look up.
     * @param args the arguments passed as part of the invocation.
     * @return a value to be used as the result of the evaluation. May be <code>null</code>, to indicate the value
     *         of last evaluation should be preserved.
     * @throws ClosureTerminatedException indicates the invocation has to end abruptly because of a return operation
     *                                    triggered from inside a block closure.
     */
    Obj invokeSlot(Obj obj, Obj slot, Obj... args);

    /**
     * Conditionally invokes the given slot of the given EllaScript object if it exists.
     *
     * @param obj the EllaScript object where the given slot should be looked up.
     * @param slot the slot to look up.
     * @param args the arguments passed as part of the invocation.
     * @return a value to be used as the result of the evaluation. May be <code>null</code>, to indicate the value
     *         of last evaluation should be preserved.
     * @throws ClosureTerminatedException indicates the invocation has to end abruptly because of a return operation
     *                                    triggered from inside a block closure.
     */
    Obj invokeSlotIfPresent(Obj obj, Obj slot, Obj... args);

    /**
     * Evaluates the given EllaScript program fragment.
     *
     * @param block the program fragment to evaluate.
     * @return a value to be used as the result of the evaluation. May be <code>null</code>, to indicate the value
     *         of last evaluation should be preserved.
     * @throws ClosureTerminatedException indicates the invocation has to end abruptly because of a return operation
     *                                    triggered from inside a block closure.
     */
    Obj invokeBlock(Block block);

    /**
     * Installs a looping construct and invokes the given EllaScript object, which should be activatable.
     * Any calls to the language's looping control facilities from within the invocation will result in
     * a <code>LoopBreakException</code> or <code>LoopContinueException</code> to be thrown to indicate the
     * loop should be terminated or restarted immediatly.
     *
     * @param obj the activatable object to be invoked.
     * @param context the activation context the object is to be invoked with. May be <code>null</code>.
     * @param args the arguments passed as part of the invocation.
     * @return a value to be used as the result of the evaluation. May be <code>null</code>, to indicate the value
     *         of last evaluation should be preserved.
     * @throws ClosureTerminatedException indicates the invocation has to end abruptly because of a return operation
     *                                    triggered from inside a block closure.
     * @throws LoopBreakException indicates the loop should be terminated.
     * @throws LoopContinueException indicates the loop should be restarted immediatly.
     */
    Obj invokeInLoop(Obj obj, Obj context, Obj... args)
            throws ClosureTerminatedException, LoopBreakException, LoopContinueException;

    /**
     * Returns current result of the evaluation so far.
     *
     * @return the EllaScript object representing the current result of the evaluation.
     */
    Obj getVal();

    /**
     * Sets the given EllaScript object as the current result of the evaluation.
     *
     * @param val the object to set as the result of the evaluation.
     */
    void setVal(Obj val);

    /**
     * Returns the engine's current state.
     *
     * @return the engine's current state.
     */
    EngineState getState();

    /**
     * Sets the engine's state to the state given.
     *
     * @param state the new state.
     */
    void setState(EngineState state);

    /**
     * Returns the current environment.
     *
     * @return the current environment.
     */
    Env getEnv();

    /**
     * Installs the given environment.
     *
     * @param env the environment to install.
     */
    void setEnv(Env env);

    /**
     * Returns the execution context associated with the evaluated EllaScript program.
     * @return
     */
    Context getContext();

    /**
     * Returns the <code>Sys</code> core object associated with the current execution context.
     * @return the <code>Sys</code> object.
     */
    Sys getObjSys();

    /**
     * Returns the <code>ConnMgr</code> core object associated with the current execution context.
     *
     * @return the <code>ConnMgr</code> object.
     */
    ConnMgr getObjConnMgr();

    /**
     * Returns the <code>Null</code> core object associated with the current execution context.
     *
     * @return the <code>Null</code> object.
     */
    Null getObjNull();

    /**
     * Returns an instance of the <code>Bool</code> core object representing the boolean <code>true</code> value in
     * the current execution context.
     *
     * @return a <code>Bool</code> instance representing <code>true</code>.
     */
    Bool getObjTrue();

    /**
     * Returns an instance of the <code>Bool</code> core object representing the boolean <code>false</code> value in
     * the current execution context.
     *
     * @return a <code>Bool</code> instance representing <code>false</code>.
     */
    Bool getObjFalse();

}
