package org.unbunt.sqlscript.lang.sql;

import org.unbunt.sqlscript.lang.*;
import org.unbunt.sqlscript.support.*;
import org.unbunt.sqlscript.*;
import org.unbunt.sqlscript.antlr.LazyInputStream;
import org.unbunt.sqlscript.antlr.LazyTokenStream;
import org.unbunt.sqlscript.utils.ObjUtils;
import org.unbunt.sqlscript.exception.ClosureTerminatedException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import java.sql.Connection;
import java.io.ByteArrayInputStream;

public class Stmt extends PlainObj {
    public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

    protected RawSQL rawStatement;
    protected Connection connection;

    /**
     * Indicates if this Stmt object should manage it's resources itself.
     */
    protected boolean manageResources;

    public Stmt(RawSQL rawStatement, Connection connection, boolean manageResources) {
        this.rawStatement = rawStatement;
        this.connection = connection;
        this.manageResources = manageResources;
    }

    @Override
    public int getObjectID() {
        return OBJECT_ID;
    }

    public static void regiserInContext(Context ctx) {
        StmtProto.registerInContext(ctx);
        ctx.registerProto(OBJECT_ID, StmtProto.OBJECT_ID);
    }

    public static class StmtProto extends PlainObj {
        public static final int OBJECT_ID = ProtoRegistry.generateObjectID();

        protected static final NativeCall nativeWithNamed = new NativeCall() {
            public Obj call(SQLScriptEngine engine, Obj context, Obj... args) throws ClosureTerminatedException {
                Stmt thiz = ObjUtils.ensureType(Stmt.class, context);

                RawParamedSQL paramedStmt;
                try {
                    paramedStmt = SQLParamParser.parse(thiz.rawStatement);
                } catch (RecognitionException e) {
                    throw new SQLScriptRuntimeException("Failed to parse SQL statement: " +
                                                        thiz.rawStatement.getStatement(), e);
                }

                System.out.println("paramedStmt: " + paramedStmt);

                return null;
            }
        };

        public StmtProto() {
            slots.put(Str.SYM_withNamed, nativeWithNamed);
        }

        @Override
        public int getObjectID() {
            return OBJECT_ID;
        }

        public static void registerInContext(Context ctx) {
            Base.registerInContext(ctx);
            ctx.registerProto(OBJECT_ID, Base.OBJECT_ID);
            ctx.registerObject(new StmtProto());
        }
    }
}
