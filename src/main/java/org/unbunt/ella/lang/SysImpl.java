package org.unbunt.ella.lang;

import org.unbunt.ella.compiler.ParserHelper;
import org.unbunt.ella.compiler.support.Scope;
import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.engine.*;
import org.unbunt.ella.engine.corelang.*;
import org.unbunt.ella.engine.environment.*;
import org.unbunt.ella.exception.*;
import org.unbunt.ella.compiler.statement.Block;
import static org.unbunt.ella.utils.StringUtils.join;
import org.unbunt.ella.utils.BackgroundStreamCopy;
import org.unbunt.ella.resource.SimpleResource;
import org.unbunt.ella.engine.context.Context;

import java.io.IOException;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

/**
 * Represents a default implementation of the EllaScript core object <code>Sys</code>.
 */
public class SysImpl extends AbstractObj implements Sys {
    protected static final NativeCall nativePrint = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
            System.out.println(join(" ", (Object[]) args));
            return engine.getObjNull();
        }
    };

    protected static final NativeCall nativePut = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
            System.out.print(join(" ", (Object[]) args));
            return engine.getObjNull();
        }
    };

    protected static final NativeCall nativeIncludeFile = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            Context ctx = engine.getContext();
            String filename = args[0].toString();
            String includingScriptName = ctx.getScriptFilename();
            SimpleResource includingScript = ctx.getScriptResource();
            SimpleResource includedScript;
            try {
                includedScript = includingScript.createRelative(filename);
            } catch (IOException e) {
                throw new EllaRuntimeException("Failed to read sql script: " + filename + ": " +
                                                    e.getMessage(), e);
            }

            Env savedEnv = engine.getEnv();
            Scope scope = savedEnv.toScope();
            Scope parseScope = new Scope(scope);
            Block block;
            try {
                block = ParserHelper.parseScript(parseScope, includedScript);
            } catch (GenericParseException e) {
                throw new EllaRuntimeException(e);
            }

            // TODO: Remember replaced env and only restore if unchanged
            // TODO: (to account for already handled Closure returns)
            StaticSearchableEnv installedEnv = null;
            try {
                ctx.setScriptFilename(includedScript.getFilename());
                ctx.setScriptResource(includedScript);

                installedEnv = new StaticSearchableEnv(savedEnv);

                engine.setEnv(installedEnv);
                return engine.invokeBlock(block);
            } catch (ClosureTerminatedException e) {
                // on closure return currently the environment will already have been restored
                // therefore we must not alter this restored environment. we indicate this
                // by making the include file's environment unavailable.
                // XXX: What about other ControlFlowExceptions (Loop{Break,Continue}Exception)?
                installedEnv = null;
                throw e;
            } finally {
                // Restore script information
                ctx.setScriptFilename(includingScriptName);
                ctx.setScriptResource(includingScript);

                if (installedEnv != null) {
                    Env dynamicEnv;
                    Env newEnv = engine.getEnv();
                    final StaticSearchableEnv searchEnv = installedEnv;
                    if (newEnv != installedEnv) {
                        // a dynamic env must have been installed, which we have to search
                        final Env lookupEnv = newEnv;
                        dynamicEnv = new DynamicEnv(savedEnv, new WritableVariableResolver() {
                            public Obj resolve(Variable var) {
                                searchEnv.setStopHere(true);
                                try {
                                    Obj value = lookupEnv.get(var);
                                    if (value != null) {
                                        return value;
                                    }
                                    return searchEnv.findLocal(var.name);
                                } finally {
                                    searchEnv.setStopHere(false);
                                }
                            }

                            public void update(Variable var, Obj value) {
                                searchEnv.putLocal(var.name, value);
                            }
                        });
                    }
                    else {
                        dynamicEnv = new DynamicEnv(savedEnv, new WritableVariableResolver() {
                            public Obj resolve(Variable var) {
                                return searchEnv.findLocal(var.name);
                            }

                            public void update(Variable var, Obj value) {
                                searchEnv.putLocal(var.name, value);
                            }
                        });
                    }

                    engine.setEnv(dynamicEnv);
                }

            }
        }
    };

    protected static final NativeCall nativeImportPackage = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
            final String pkgPrefix = args[0].toString() + ".";
            final ClassLoader loader = engine.getClass().getClassLoader();
            DynamicEnv newEnv = new DynamicEnv(engine.getEnv(), new CachingVariableResolver(
                    new DynamicVariableResolver() {
                        public Obj resolve(Variable var) {
                            Class cls;
                            try {
                                cls = loader.loadClass(pkgPrefix + var.name);
                            } catch (ClassNotFoundException e) {
                                return null;
                            }
                            return new JClass(cls);
                        }
                    }));
            engine.setEnv(newEnv);
            return engine.getObjNull();
        }
    };

    protected static final NativeCall nativeIfThen = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            // FIXME: has to be replaced by more sane scheme
            //        (i.e. send isTrue or smthg like that to the condition value)
            if (engine.toBoolean(args[0])) {
                engine.trigger(args[1], context);
            }
            else if (args.length > 2) {
                engine.trigger(args[2], context);
            }
            return null;
        }
    };

    protected static final NativeCall nativeLoop = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            while (true) {
                try {
                    engine.invokeInLoop(args[0], engine.getObjNull());
                } catch (LoopContinueException e) {
                    continue;
                } catch (LoopBreakException e) {
                    break;
                }
            }
            return null;
        }
    };

    protected static final NativeCall nativeThrow = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            throw new EllaClientException(args[0]);
        }
    };

    protected static final NativeCall nativeTryCatch = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            EngineState state = engine.getState();
            try {
                engine.invoke(args[0], engine.getObjNull());
            } catch (EllaClientException e) {
                engine.invoke(args[1], engine.getObjNull(), e.getException());
            } catch (EllaRuntimeException e) {
                engine.invoke(args[1], engine.getObjNull(), new JObject(e));
            }
            engine.setState(state);
            return null;
        }
    };

    protected static final NativeCall nativeTryFinally = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            EngineState state = engine.getState();
            try {
                engine.invoke(args[0], engine.getObjNull());
            } finally {
                Obj savedVal = null;
                try {
                    if (engine.isClosureReturnInProgress()) {
                        savedVal = engine.getVal();
                    }
                    engine.invoke(args[1], engine.getObjNull());
                } finally {
                    if (savedVal != null) {
                        engine.setVal(savedVal);
                    }
                }
            }
            engine.setState(state);
            return null;
        }
    };

    protected static final NativeCall nativeTryCatchFinally = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            EngineState state = engine.getState();
            try {
                engine.invoke(args[0], engine.getObjNull());
            } catch (EllaClientException e) {
                engine.invoke(args[1], engine.getObjNull(), e.getException());
            } catch (EllaRuntimeException e) {
                engine.invoke(args[1], engine.getObjNull(), new JObject(e));
            } finally {
                Obj savedVal = null;
                try {
                    if (engine.isClosureReturnInProgress()) {
                        savedVal = engine.getVal();
                    }
                    engine.invoke(args[2], engine.getObjNull());
                } finally {
                    if (savedVal != null) {
                        engine.setVal(savedVal);
                    }
                }
            }
            engine.setState(state);
            return null;
        }
    };

    protected static final NativeCall nativeScriptName = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return new Str(engine.getContext().getScriptFilename());
        }
    };

    protected static final NativeCall nativeScriptResource = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return new JObject(engine.getContext().getScriptResource());
        }
    };

    protected static final NativeCall nativeExplicitSlot = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            Obj obj = args[0];
            Obj slot = args[1];
            Obj value = obj.getSlot(engine.getContext(), slot);
            return value != null ? value : engine.getObjNull();
        }
    };

    protected static final NativeCall nativeNoop = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return engine.getObjNull();
        }
    };

    protected static final NativeCall nativeExec = new NativeCall() {
        public Obj call(Engine engine, Obj context, Obj... args) {
            Object command = args[0].toJavaObject();
            String[] envp = null;
            File dir = null;

            if (args.length > 1) {
                envp = toStringArray(args[1].toJavaObject());
                if (envp == null) {
                    throw new IllegalArgumentException("Invalid argument");
                }

                if (args.length > 2) {
                    Object odir = args[2].toJavaObject();
                    if (odir instanceof String) {
                        dir = new File((String) odir);
                    }
                    else if (odir instanceof File) {
                        dir = (File) odir;
                    }
                    else if (odir != null) {
                        throw new IllegalArgumentException("Invalid argument");
                    }
                }
            }

            String[] cmdarr = toStringArray(command);
            Runtime r = Runtime.getRuntime();
            Process p;
            try {
                if (cmdarr == null) {
                    String cmdstr = command == null ? null : command.toString();
                    if (envp != null && dir != null) {
                        p = r.exec(cmdstr, envp, dir);
                    }
                    else if (envp != null && dir == null) {
                        p = r.exec(cmdstr, envp);
                    }
                    else {
                        p = r.exec(cmdstr);
                    }
                }
                else {
                    if (envp != null && dir != null) {
                        p = r.exec(cmdarr, envp, dir);
                    }
                    else if (envp != null && dir == null) {
                        p = r.exec(cmdarr, envp);
                    }
                    else {
                        p = r.exec(cmdarr);
                    }
                }
            } catch (IOException e) {
                throw new EllaRuntimeException(e.getMessage(), e);
            }

            BackgroundStreamCopy stdoutCopy = new BackgroundStreamCopy(p.getInputStream(), System.out);
            BackgroundStreamCopy stderrCopy = new BackgroundStreamCopy(p.getErrorStream(), System.err);
            stdoutCopy.start();
            stderrCopy.start();

            Integer exitValue = null;
            while (exitValue == null) {
                try {
                    exitValue = p.waitFor();
                } catch (InterruptedException ignored) {
                }
            }

            while (!(stdoutCopy.isFinished() && stderrCopy.isFinished())) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
            }

            return new NNum(exitValue);
        }

        protected String[] toStringArray(Object object) {
            String[] result = null;

            if (object instanceof String[]) {
                result = (String[]) object;
            }
            else if (object instanceof Object[]) {
                Object[] oarr = (Object[]) object;
                result = new String[oarr.length];
                for (int i = 0; i < oarr.length; i++) {
                    Object o = oarr[i];
                    result[i] = o == null ? null : o.toString();
                }
            }
            else if (object instanceof Collection) {
                Collection ocoll = (Collection) object;
                List<String> scoll = new ArrayList<String>(ocoll.size());
                for (Object o : ocoll) {
                    scoll.add(o == null ? null : o.toString());
                }
                result = scoll.toArray(new String[scoll.size()]);
            }

            return result;
        }
    };

    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public int getObjectID() {
        return OBJECT_ID;
    }

    /**
     * Registers this EllaScript object within the given execution context.
     *
     * @param ctx the execution context to register this object in.
     */
    public static void registerInContext(Context ctx) {
        ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
        if (!ctx.hasObject(OBJECT_ID)) {
            ctx.registerObject(new SysImpl());
        }
    }

    public SysImpl() {
        slots.put(Str.SYM_print, nativePrint);
        slots.put(Str.SYM_put, nativePut);
        slots.put(Str.SYM_includeFile, nativeIncludeFile);
        slots.put(Str.SYM_importPackage, nativeImportPackage);
        slots.put(Str.SYM_loop, nativeLoop);
        slots.put(Str.SYM__break, Primitives.LOOP_BREAK);
        slots.put(Str.SYM__continue, Primitives.LOOP_CONTINUE);
        slots.put(Str.SYM__exit, Primitives.EXIT);
        slots.put(Str.SYM_ifThen, nativeIfThen);
        slots.put(Str.SYM_throw, nativeThrow);
        slots.put(Str.SYM_raise, nativeThrow);
        slots.put(Str.SYM_tryCatch, nativeTryCatch);
        slots.put(Str.SYM_tryCatchFinally, nativeTryCatchFinally);
        slots.put(Str.SYM_tryFinally, nativeTryFinally);
        slots.put(Str.SYM_scriptName, nativeScriptName);
        slots.put(Str.SYM_scriptResource, nativeScriptResource);
        slots.put(Str.SYM_explicitSlot, nativeExplicitSlot);
        slots.put(Str.SYM_noop, nativeNoop);
        slots.put(Str.SYM_exec, nativeExec);
    }
}
