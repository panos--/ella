package org.unbunt.ella.engine.context;

import org.unbunt.ella.engine.environment.Env;
import org.unbunt.ella.engine.corelang.ConnMgr;
import org.unbunt.ella.engine.corelang.Null;
import org.unbunt.ella.engine.corelang. Obj;
import org.unbunt.ella.engine.corelang.Bool;
import org.unbunt.ella.engine.corelang.Sys;
import org.unbunt.ella.resource.SimpleResource;

/**
 * Represents the execution context of EllaScript programs.
 * <p>
 * The execution context holds the global environment, information about the executed program, such as filename,
 * the associated resource object, associations of native EllaScript objects to their implicit parent objects as well
 * as references to various core objects.
 */
public interface Context extends SQLResultProvider {
    /**
     * Associates a native EllaScript object with it's implicit parent object.
     *
     * @param objectID the object id referencing the native EllaScript object the implicit parent object
     *                 should be associated with.
     * @param protoID the object id referencing the implicit parent object
     */
    void registerProto(int objectID, int protoID);

    /**
     * Registers a native EllaScript object with this context. After registration this object may then be referenced
     * by it's object id.
     *
     * @param object the native EllaScript object to register.
     */
    void registerObject(Obj object);

    /**
     * Returns the implicit parent object associated with the given native object.
     *
     * @param obj the native EllaScript object for which the implicit parent object should be returned.
     * @return the implicit parent object or <code>null</code> if no implicit parent object is associated
     *         with the given object.
     */
    Obj getObjectProto(Obj obj);

    /**
     * Returns <code>true</code> if a native EllaScript object specified by the given object id is registered within
     * this context.
     *
     * @param objectID the object id to look for.
     * @return <code>true</code> if such an object if registered within this context.
     */
    boolean hasObject(int objectID);

    /**
     * Returns the global environment associated with this context.
     *
     * @return the environment object.
     */
    Env getEnv();

    /**
     * Set the given environment as global environment in this context.
     *
     * @param env the environment to use as global environment.
     */
    void setEnv(Env env);

    /**
     * Returns the filename of the EllaScript program this context represents the execution context for.
     *
     * @return the program's filename
     */
    String getScriptFilename();

    /**
     * Sets the given filename as the filename of the EllaScript program this context represents
     * the execution context for.
     *
     * @param scriptFilename the program's filename
     */
    void setScriptFilename(String scriptFilename);

    /**
     * Returns the resource representing the EllaScript program this context
     * represents the execution context for.
     *
     * @return the resource.
     */
    SimpleResource getScriptResource();

    /**
     * Sets the given resource as the resource representing the EllaScript program this context
     * serves as execution context for.
     *
     * @param scriptResource the resource.
     */
    void setScriptResource(SimpleResource scriptResource);

    /**
     * Returns the <code>Sys</code> core object associated with this context.
     * @return the <code>Sys</code> object.
     */
    Sys getObjSys();

    /**
     * Returns the <code>ConnMgr</code> core object associated with this context.
     *
     * @return the <code>ConnMgr</code> object.
     */
    ConnMgr getObjConnMgr();

    /**
     * Returns the <code>Null</code> core object associated with this context.
     *
     * @return the <code>Null</code> object.
     */
    Null getObjNull();

    /**
     * Returns an instance of the <code>Bool</code> core object representing the boolean <code>true</code> value in
     * this context.
     *
     * @return a <code>Bool</code> instance representing <code>true</code>.
     */
    Bool getObjTrue();

    /**
     * Returns an instance of the <code>Bool</code> core object representing the boolean <code>false</code> value in
     * this context.
     *
     * @return a <code>Bool</code> instance representing <code>false</code>.
     */
    Bool getObjFalse();
}
