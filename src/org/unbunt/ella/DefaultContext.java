package org.unbunt.ella;

import org.unbunt.ella.compiler.support.Variable;
import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.engine.context.SQLResultListener;
import org.unbunt.ella.engine.corelang.*;
import static org.unbunt.ella.engine.corelang.ObjUtils.ensureType;
import org.unbunt.ella.engine.environment.DynamicVariableResolver;
import org.unbunt.ella.engine.environment.Env;
import org.unbunt.ella.engine.environment.MainEnv;
import org.unbunt.ella.lang.*;
import org.unbunt.ella.lang.sql.Conn;
import org.unbunt.ella.lang.sql.ConnMgrImpl;
import org.unbunt.ella.lang.sql.ResSet;
import org.unbunt.ella.lang.sql.Stmt;
import org.unbunt.ella.resource.SimpleResource;

import java.sql.ResultSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Default implementation of the <code>Context</context> interface.
 * <p>
 * On creation, it initializes the available native objects and a global environment where the objects are exposed in.
 * <p>
 * The following table gives an overview of the native objects and their names in the environment.
 * <table>
 * <thead>
 *      <tr>
 *          <th align="left">Name</th>
 *          <th align="left">Native Object</th>
 *      </tr>
 * </thead>
 * <tbody>
 *      <tr>
 *          <td>Null</td>
 *          <td>{@link org.unbunt.ella.lang.NullImpl}</td>
 *      </tr>
 *      <tr>
 *          <td>null</td>
 *          <td>{@link org.unbunt.ella.lang.NullImpl}</td>
 *      </tr>
 *      <tr>
 *          <td>Sys</td>
 *          <td>{@link org.unbunt.ella.lang.SysImpl}</td>
 *      </tr>
 *      <tr>
 *          <td>Obj</td>
 *          <td>{@link org.unbunt.ella.lang.Base}</td>
 *      </tr>
 *      <tr>
 *          <td>Lst</td>
 *          <td>{@link org.unbunt.ella.lang.Lst.LstProto}</td>
 *      </tr>
 *      <tr>
 *          <td>Dict</td>
 *          <td>{@link org.unbunt.ella.lang.Dict.DictProto}</td>
 *      </tr>
 *      <tr>
 *          <td>Str</td>
 *          <td>{@link org.unbunt.ella.lang.Str}</td>
 *      </tr>
 *      <tr>
 *          <td>Num</td>
 *          <td>{@link org.unbunt.ella.lang.NNum.NNumProto}</td>
 *      </tr>
 *      <tr>
 *          <td>BigNum</td>
 *          <td>{@link org.unbunt.ella.lang.NBigNum.NBigNumProto}</td>
 *      </tr>
 *      <tr>
 *          <td>Real</td>
 *          <td>{@link org.unbunt.ella.lang.NReal.NRealProto}</td>
 *      </tr>
 *      <tr>
 *          <td>BigReal</td>
 *          <td>{@link org.unbunt.ella.lang.NBigReal.NBigRealProto}</td>
 *      </tr>
 *      <tr>
 *          <td>Range</td>
 *          <td>{@link org.unbunt.ella.lang.NRange.NRangeProto}</td>
 *      </tr>
 *      <tr>
 *          <td>Bool</td>
 *          <td>{@link org.unbunt.ella.lang.BoolImpl.BoolProto}</td>
 *      </tr>
 *      <tr>
 *          <td>true</td>
 *          <td>{@link org.unbunt.ella.lang.BoolImpl}</td>
 *      </tr>
 *      <tr>
 *          <td>false</td>
 *          <td>{@link org.unbunt.ella.lang.BoolImpl}</td>
 *      </tr>
 *      <tr>
 *          <td>Clos</td>
 *          <td>{@link org.unbunt.ella.lang.ClosImpl.ClosProto}</td>
 *      </tr>
 *      <tr>
 *          <td>Func</td>
 *          <td>{@link org.unbunt.ella.lang.FuncImpl.FuncProto}</td>
 *      </tr>
 *      <tr>
 *          <td>JArray</td>
 *          <td>{@link org.unbunt.ella.lang.JArray.JArrayProto}</td>
 *      </tr>
 *      <tr>
 *          <td>JClass</td>
 *          <td>{@link org.unbunt.ella.lang.JClass.JClassProto}</td>
 *      </tr>
 *      <tr>
 *          <td>ConnMgr</td>
 *          <td>{@link org.unbunt.ella.lang.sql.ConnMgrImpl}</td>
 *      </tr>
 *      <tr>
 *          <td>Conn</td>
 *          <td>{@link org.unbunt.ella.lang.sql.Conn.ConnProto}</td>
 *      </tr>
 *      <tr>
 *          <td>Stmt</td>
 *          <td>{@link org.unbunt.ella.lang.sql.Stmt.StmtProto}</td>
 *      </tr>
 * </tbody>
 * </table>
 *
 * @see org.unbunt.ella.engine.context.Context
 */
public class DefaultContext implements Context {
    protected String scriptFilename = "<unknown>";
    protected SimpleResource scriptResource = null;

    protected Env env;

    protected Sys objSys;
    protected ConnMgr objConnMgr;
    protected Null objNull;
    protected Bool objTrue;
    protected Bool objFalse;

    /**
     * Maps objects to their prototypes.
     * Keys are the respective object id's.
     * Values are the associated prototype objects.
     */
    protected Obj[] objectProtos = new Obj[64];

    /**
     * Maps object id's to instances. Used as object registry.
     */
    protected Obj[] objects = new Obj[64];

    protected Object[] args;

    /**
     * Creates a DefaultContext with an empty set of program arguments exposed in the environment.
     * <p>
     * The program arguments are made available to the programs executed within this context under the
     * <code>ARGV</code> name as an object of type <code>Lst</code>.
     *
     * @see org.unbunt.ella.lang.Lst
     */
    public DefaultContext() {
        this(new Object[0]);
    }

    /**
     * Creates a DefaultContext with the given program arguments exposed in the environment.
     * <p>
     * The program arguments are made available to the programs executed within this context under the
     * <code>ARGV</code> name as an object of type <code>Lst</code>.
     *
     * @param args the objects to be used as program arguments
     * @see org.unbunt.ella.lang.Lst
     */
    public DefaultContext(Object[] args) {
        this.args = args;
        Arrays.fill(objectProtos, null);
        Arrays.fill(objects, null);
        initProtos();
        initEnv();
    }

    protected void initProtos() {
        Str.registerInContext(this);
        NullImpl.registerInContext(this);

        // init null as early as possible so that it can be used
        // during initialization of other objects
        objNull = ensureType(NullImpl.class, ensureObject(NullImpl.OBJECT_ID));

        Base.registerInContext(this);
        PlainObj.registerInContext(this);
        Args.registerInContext(this);
        NNum.registerInContext(this);
        NBigNum.registerInContext(this);
        NReal.registerInContext(this);
        NBigReal.registerInContext(this);
        NRange.registerInContext(this);
        Lst.registerInContext(this);
        Dict.registerInContext(this);
        SysImpl.registerInContext(this);
        BoolImpl.registerInContext(this);
        ClosImpl.registerInContext(this);
        FuncImpl.registerInContext(this);
        JMethod.registerInContext(this);
        JArray.registerInContext(this);
        JClass.registerInContext(this);
        JObject.registerInContext(this);
        ConnMgrImpl.registerInContext(this);
        Conn.registerInContext(this);
        Stmt.regiserInContext(this);
        ResSet.registerInContext(this);

        objSys = ensureType(SysImpl.class, ensureObject(SysImpl.OBJECT_ID));
        objConnMgr = ensureType(ConnMgrImpl.class, ensureObject(ConnMgrImpl.OBJECT_ID));

        objTrue = new BoolImpl(true);
        objFalse = new BoolImpl(false);
    }

    protected void initEnv() {
        // sets up environment in which all undefined variables are looked up in the slots of the Sys object
        final Context ctx = this;
        final Obj receiver = objSys;
        DynamicVariableResolver globalResolver = new DynamicVariableResolver() {
            public Obj resolve(Variable var) {
                return ObjUtils.getSlot(ctx, receiver, var.nameStr);
            }
        };
        MainEnv mainEnv = new MainEnv(objNull, globalResolver);

        // Expose global objects in the environment
        mainEnv.add("Null", objNull);
        mainEnv.add("null", objNull);
        mainEnv.add("Sys", objSys);
        mainEnv.add("Obj", ensureObject(Base.OBJECT_ID));
        mainEnv.add("Lst", ensureObject(Lst.LstProto.OBJECT_ID));
        mainEnv.add("Dict", ensureObject(Dict.DictProto.OBJECT_ID));
        mainEnv.add("Str", ensureObject(Str.StrProto.OBJECT_ID));
        mainEnv.add("Num", ensureObject(NNum.NNumProto.OBJECT_ID));
        mainEnv.add("BigNum", ensureObject(NBigNum.NBigNumProto.OBJECT_ID));
        mainEnv.add("Real", ensureObject(NReal.NRealProto.OBJECT_ID));
        mainEnv.add("BigReal", ensureObject(NBigReal.NBigRealProto.OBJECT_ID));
        mainEnv.add("Range", ensureObject(NRange.NRangeProto.OBJECT_ID));
        mainEnv.add("Bool", ensureObject(BoolImpl.BoolProto.OBJECT_ID));
        mainEnv.add("true", objTrue);
        mainEnv.add("false", objFalse);
        mainEnv.add("Clos", ensureObject(ClosImpl.ClosProto.OBJECT_ID));
        mainEnv.add("Func", ensureObject(FuncImpl.FuncProto.OBJECT_ID));
        mainEnv.add("JArray", ensureObject(JArray.JArrayProto.OBJECT_ID));
        mainEnv.add("JClass", ensureObject(JClass.JClassProto.OBJECT_ID));
        mainEnv.add("ConnMgr", ensureObject(ConnMgrImpl.OBJECT_ID));
        mainEnv.add("Conn", ensureObject(Conn.ConnProto.OBJECT_ID));
        mainEnv.add("Stmt", ensureObject(Stmt.StmtProto.OBJECT_ID));

        // init arguments
        Obj[] args = new Obj[this.args.length];
        for (int i = 0; i < args.length; i++) {
            args[i] = NativeWrapper.wrap(this, this.args[i]);
        }
        mainEnv.add("ARGV", new Args(args));

        this.env = mainEnv;
    }

    public void registerProto(int objectID, int protoID) {
        if (hasObjectProto(objectID)) {
            throw new RuntimeException("Invalid prototype association for object: " + objectID + ": " +
                                       "Prototype already registered: " + getObjectProto(objectID).getObjectID());
        }

        if (!hasObject(protoID)) {
            throw new RuntimeException("Invalid prototype assiciation for object: " + objectID + " " +
                                       "Unknown prototype object: " + protoID);
        }

        putObjectProto(objectID, protoID);
    }

    public void registerObject(Obj object) {
        if (hasObject(object.getObjectID())) {
            throw new RuntimeException("Invalid attempt to register object: " + object.getObjectID() + ": " +
                                       "Already registered");
        }

        putObject(object.getObjectID(), object);
    }

    public Obj getObjectProto(Obj obj) {
        // No existance check. Returns null if key not found which would also be returned to indicate there is no proto.
        int id = obj.getObjectID();
        try {
            return objectProtos[id];
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    protected Obj getObjectProto(int objectID) {
        try {
            return objectProtos[objectID];
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    protected void putObjectProto(int objectID, int protoID) {
        try {
            objectProtos[objectID] = objects[protoID];
        } catch (IndexOutOfBoundsException e) {
            // FIXME: handle gracefully
            e.printStackTrace();
        }
    }

    protected boolean hasObjectProto(int objectID) {
        return getObjectProto(objectID) != null;
    }

    protected Obj getObject(int objectID) {
        try {
            return objects[objectID];
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    protected Obj ensureObject(int objectID) {
        Obj obj = getObject(objectID);
        if (obj == null) {
            throw new RuntimeException("Failed to load object: " + objectID + ": No such object");
        }
        return obj;
    }

    protected void putObject(int objectID, Obj object) {
        try {
            objects[objectID] = object;
        } catch (IndexOutOfBoundsException e) {
            // FIXME: dynamically resize objects array
            e.printStackTrace();
        }
    }

    public boolean hasObject(int objectID) {
        return getObject(objectID) != null;
    }

    public Env getEnv() {
        return env;
    }

    public void setEnv(Env env) {
        this.env = env;
    }

    public Sys getObjSys() {
        return objSys;
    }

    public ConnMgr getObjConnMgr() {
        return objConnMgr;
    }

    public Null getObjNull() {
        return objNull;
    }

    public Bool getObjTrue() {
        return objTrue;
    }

    public Bool getObjFalse() {
        return objFalse;
    }

    public String getScriptFilename() {
        return scriptFilename;
    }

    public void setScriptFilename(String scriptFilename) {
        this.scriptFilename = scriptFilename;
    }

    public SimpleResource getScriptResource() {
        return scriptResource;
    }

    public void setScriptResource(SimpleResource scriptResource) {
        this.scriptResource = scriptResource;
    }

    /*
     * SQL Result listener support
     */

    protected Set<SQLResultListener> sqlResultListeners = new HashSet<SQLResultListener>();

    public void addSQLResultListener(SQLResultListener listener) {
        sqlResultListeners.add(listener);
    }

    public void removeSQLResultListener(SQLResultListener listener) {
        sqlResultListeners.remove(listener);
    }

    public void notifyResultSet(ResultSet resultSet) {
        for (SQLResultListener listener : sqlResultListeners) {
            listener.resultSet(resultSet);
        }
    }

    public void notifyUpdateCount(int updateCount) {
        for (SQLResultListener listener : sqlResultListeners) {
            listener.updateCount(updateCount);
        }
    }
}
