package org.unbunt.sqlscript.lang;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.unbunt.sqlscript.SQLScriptEngine;
import org.unbunt.sqlscript.SQLScriptLexer;
import org.unbunt.sqlscript.SQLScriptParser;
import org.unbunt.sqlscript.SQLScriptWalker;
import org.unbunt.sqlscript.antlr.LazyInputStream;
import org.unbunt.sqlscript.antlr.LazyTokenStream;
import org.unbunt.sqlscript.exception.*;
import org.unbunt.sqlscript.statement.Block;
import org.unbunt.sqlscript.support.*;
import org.unbunt.utils.StringUtils;
import org.unbunt.utils.res.SimpleResource;

import java.io.IOException;

public class Sys extends PlainObj {
    protected static final NativeCall nativePrint = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
            System.out.println(StringUtils.join(" ", (Object[]) args));
            return engine.getObjNull();
        }
    };

    protected static final NativeCall nativeIncludeFile = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            Context ctx = engine.getContext();
            String filename = args[0].toString();
            String includingScriptName = ctx.getScriptFilename();
            SimpleResource includingScript = ctx.getScriptResource();
            SimpleResource includedScript;
            try {
                includedScript = includingScript.createRelative(filename);
            } catch (IOException e) {
                throw new SQLScriptRuntimeException("Failed to read sql script: " + filename + ": " +
                                                    e.getMessage(), e);
            }

            Block block;
            try {
                LazyInputStream input;
                try {
                    input = new LazyInputStream(includedScript.getInputStream());
                } catch (Exception e) {
                    throw new SQLScriptIOException("Failed to read sql script: " + filename + ": " +
                                                        e.getMessage(), e);
                }

                SQLScriptLexer lexer = new SQLScriptLexer(input);
                TokenStream tokens = new LazyTokenStream(lexer);

                SQLScriptParser parser;
                try {
                    parser = new SQLScriptParser(tokens);
                } catch (RuntimeRecognitionException re) {
                    RecognitionException e = (RecognitionException) re.getCause();
                    throw new SQLScriptParseException("Failed to parse sql script: " + filename + ": " +
                                                        lexer.getErrorHeader(e) + " " +
                                                        lexer.getErrorMessage(e, lexer.getTokenNames()),
                                                        e);
                }

                SQLScriptParser.script_return r;
                try {
                    r = parser.script();
                } catch (RecognitionException e) {
                    throw new SQLScriptParseException("Failed to parse sql script: " + filename + ": " +
                                                      parser.getErrorHeader(e) + " " +
                                                      parser.getErrorMessage(e, parser.getTokenNames()),
                                                      e);
                } catch (RuntimeRecognitionException re) {
                    RecognitionException e = (RecognitionException) re.getCause();
                    throw new SQLScriptParseException("Failed to parse sql script: " + filename + ": " +
                                                        lexer.getErrorHeader(e) + " " +
                                                        lexer.getErrorMessage(e, lexer.getTokenNames()),
                                                        e);
                }

                CommonTree tree = (CommonTree) r.getTree();

                CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
                nodes.setTokenStream(tokens);

                SQLScriptWalker walker = new SQLScriptWalker(nodes);
                try {
                    Scope currentScope = ctx.getEnv().toScope();
                    block = walker.parseIncremental(new Scope(currentScope));
                    TailCallOptimizer.process(block);
                } catch (RecognitionException e) {
                    throw new SQLScriptParseException("Failed to parse sql script: " + filename + ": " +
                                                      walker.getErrorHeader(e) + " " +
                                                      walker.getErrorMessage(e, walker.getTokenNames()),
                                                      e);
                } catch (RuntimeException e) {
                    throw new SQLScriptRuntimeException(e.getMessage(), e);
                }
            } catch (SQLScriptIOException e) {
                throw new SQLScriptRuntimeException(e);
            } catch (SQLScriptParseException e) {
                throw new SQLScriptRuntimeException(e);
            }

            // TODO: Remember replaced env and only restore if unchanged
            // TODO: (to account for already handled Closure returns)
            Env savedEnv = null;
            StaticSearchableEnv installedEnv = null;
            try {
                ctx.setScriptFilename(includedScript.getFilename());
                ctx.setScriptResource(includedScript);

                savedEnv = engine.getEnv();
                installedEnv = new StaticSearchableEnv(savedEnv);

                engine.setEnv(installedEnv);
                return engine.invokeBlock(block);
            } finally {
                // Restore script information
                ctx.setScriptFilename(includingScriptName);
                ctx.setScriptResource(includingScript);

                Env newEnv = engine.getEnv();

                if (installedEnv != null) {
                    final StaticSearchableEnv searchEnv = installedEnv;
                    Env dynamicEnv;
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
        public Obj call(SQLScriptEngine engine, Obj context, Obj[] args) throws ClosureTerminatedException {
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
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            Obj condVal = engine.invoke(args[0], engine.getObjNull());
            boolean condSatisfied = engine.toBoolean(condVal);
            if (condSatisfied) {
                engine.trigger(args[1], context);
            }
            return null;
        }
    };

    protected static final NativeCall nativeLoop = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            engine.invoke(PrimitiveCall.Type.LOOP.primitive, engine.getObjNull());
            while (true) {
                try {
                    engine.invoke(args[0], engine.getObjNull());
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
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            throw new ScriptClientException(args[0]);
        }
    };

    protected static final NativeCall nativeTryCatch = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            SQLScriptEngine.EngineState state = engine.getState();
            try {
                engine.invoke(args[0], engine.getObjNull());
            } catch (ScriptClientException e) {
                engine.invoke(args[1], engine.getObjNull(), e.getException());
            }
            engine.setState(state);
            return null;
        }
    };

    protected static final NativeCall nativeTryFinally = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            SQLScriptEngine.EngineState state = engine.getState();
            try {
                engine.invoke(args[0], engine.getObjNull());
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

    protected static final NativeCall nativeTryCatchFinally = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            SQLScriptEngine.EngineState state = engine.getState();
            try {
                engine.invoke(args[0], engine.getObjNull());
            } catch (ScriptClientException e) {
                engine.invoke(args[1], engine.getObjNull(), e.getException());
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

    protected static final NativeCall nativeNoop = new NativeCall() {
        public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
            return engine.getObjNull();
        }
    };

    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void registerInContext(Context ctx) {
        ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
        if (!ctx.hasObject(OBJECT_ID)) {
            ctx.registerObject(new Sys());
        }
    }

    public Sys() {
        slots.put(Str.SYM_print, nativePrint);
        slots.put(Str.SYM_includeFile, nativeIncludeFile);
        slots.put(Str.SYM_importPackage, nativeImportPackage);
        slots.put(Str.SYM_loop, nativeLoop);
        slots.put(Str.SYM_break, PrimitiveCall.Type.LOOP_BREAK.primitive);
        slots.put(Str.SYM_continue, PrimitiveCall.Type.LOOP_CONTINUE.primitive);
        slots.put(Str.SYM_ifThen, nativeIfThen);
        slots.put(Str.SYM_throw, nativeThrow);
        slots.put(Str.SYM_raise, nativeThrow);
        slots.put(Str.SYM_tryCatch, nativeTryCatch);
        slots.put(Str.SYM_tryCatchFinally, nativeTryCatchFinally);
        slots.put(Str.SYM_tryFinally, nativeTryFinally);
        slots.put(Str.SYM_noop, nativeNoop);
    }
}
