/* Context.java
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package org.unbunt.ella.engine.context;

import org.unbunt.ella.engine.corelang.*;
import org.unbunt.ella.engine.environment.Env;
import org.unbunt.ella.resource.SimpleResource;

import java.io.InputStream;
import java.io.PrintStream;

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

    InputStream getInputStream();

    void setInputStream(InputStream inputStream);

    PrintStream getOutputStream();

    void setOutputStream(PrintStream outputStream);

    PrintStream getErrorStream();

    void setErrorStream(PrintStream errorStream);

    public enum LogLevel {
        trace,
        debug,
        info,
        warn,
        error
    }

    void trace(String msg, Object... args);
    void debug(String msg, Object... args);
    void info(String msg, Object... args);
    void warn(String msg, Object... args);
    void error(String msg, Object... args);

    boolean isTraceEnabled();
    boolean isDebugEnabled();
    boolean isInfoEnabled();
    boolean isWarnEnabled();
    boolean isErrorEnabled();

    void setLogLevel(LogLevel logLevel);
    LogLevel getLogLevel();

    void setLogger(ContextLogger logger);
}
