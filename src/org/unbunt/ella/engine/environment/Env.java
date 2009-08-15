package org.unbunt.ella.engine.environment;

import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.engine.continuations.Continuation;
import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.compiler.support.Scope;

/**
 * Represents an environment holding bindings of names to their respective values.
 */
public interface Env {
    /**
     * Installs the given object as the activation context.
     *
     * @param context the object to install as activation context.
     */
    void setContext(Obj context);

    /**
     * Returns the current activation context.
     *
     * @return the current activation context.
     */
    Obj getContext();

    /**
     * Instals the given object as the <code>super</code> context.
     *
     * @param context the object to install as <code>super</code> context.
     */
    void setReceiver(Obj context);

    /**
     * Returns the current <code>super</code> context.
     *
     * @return the current <code>super</code> context. May return <code>null</code> to indicate no <code>super</code>
     *         context was explicitly set so far.
     */
    Obj getReceiver();

    /**
     * Extends this environment with the given variable.
     *
     * @param var the variable.
     */
    void extend(Variable var);

    /**
     * Returns the value associated with the given variable.
     *
     * @param var the variable.
     * @return the variable's associated value.
     */
    Obj get(Variable var);

    /**
     * Returns the value associated with the given variable. Uses the given lexical address during lookup
     * of the variable.
     *
     * @param var the variable.
     * @param addr the variable's lexical address.
     * @return the variable's associated value.
     */
    Obj get(Variable var, int addr);

    /**
     * Associates the given value with the specified variable.
     *
     * @param var the variable.
     * @param value the value.
     */
    void set(Variable var, Obj value);

    /**
     * Associates the given value with the specified variable. Uses the given lexical address during the lookup
     * of the variable.
     *
     * @param var the variable.
     * @param addr the variable's lexical address.
     * @param value the value.
     */
    void set(Variable var, int addr, Obj value);

    /**
     * Extends this environment with the given variable and associates the given value with it.
     *
     * @param var the variable.
     * @param value the value.
     */
    void add(Variable var, Obj value);

    /**
     * Returns the highest address of a variable currently known to this environment.
     *
     * @return the address.
     */
    int getMaxAddress();

    /**
     * Installs the given continuation as the currently active home continuation of the block closure referencing
     * this environment.
     *
     * @param offset the home continuation's offset in the continuation stack.
     * @param cont the home continuation
     */
    void setClosureHome(int offset, Continuation cont);

    /**
     * Returns the offset of the home continuation in the continuation stack.
     *
     * @return the offset or <code>-1</code> if there is no home continuation is registered with this environment.
     */
    int getClosureHomeOffset();

    /**
     * Returns the home continuation registered in this environment.
     *
     * @return the home continuation.
     */
    Continuation getClosureHomeCont();

    /**
     * Returns this environment converted into an equivalent scope object.
     *
     * @return the scope.
     */
    Scope toScope();
}
