package org.unbunt.sqlscript.support;

import org.unbunt.sqlscript.lang.*;
import org.unbunt.sqlscript.utils.ObjUtils;

import java.util.Arrays;

public class Context {
    protected Env env;

    protected Obj objNull;
    protected Obj objSys;
    protected Obj objTrue;
    protected Obj objFalse;

    /**
     * Maps objects to their prototypes.
     * Keys are the respective object id's.
     * Values are the associated prototype objects.
     */
//    protected Map<Integer, Obj> objectProtos = new HashMap<Integer, Obj>();
    protected Obj[] objectProtos = new Obj[32];

    /**
     * Maps object id's to instances. Used as object registry.
     */
//    protected Map<Integer, Obj> objects = new HashMap<Integer, Obj>();
    protected Obj[] objects = new Obj[32];

    public Context() {
        Arrays.fill(objectProtos, null);
        Arrays.fill(objects, null);
        initProtos();
        initEnv();
    }

    protected void initProtos() {
        Str.registerInContext(this);
        Null.registerInContext(this);
        Int.registerInContext(this);
        Sys.registerInContext(this);
        Bool.registerInContext(this);
        Clos.registerInContext(this);
        Func.registerInContext(this);
        JArray.registerInContext(this);
        JClass.registerInContext(this);

//        objNull = objects.get(Null.OBJECT_ID);
//        assert objNull != null;
//        objSys = objects.get(Sys.OBJECT_ID);
//        assert objSys != null;

        objNull = ensureObject(Null.OBJECT_ID);
        objSys = ensureObject(Sys.OBJECT_ID);

        objTrue = new Bool(true);
        objFalse = new Bool(false);
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
        mainEnv.add("Base", ensureObject(Base.OBJECT_ID));
        mainEnv.add("Str", ensureObject(Str.StrProto.OBJECT_ID));
        mainEnv.add("Int", ensureObject(Int.IntProto.OBJECT_ID));
        mainEnv.add("Bool", ensureObject(Bool.BoolProto.OBJECT_ID));
        mainEnv.add("true", objTrue);
        mainEnv.add("false", objFalse);
        mainEnv.add("Clos", ensureObject(Clos.ClosProto.OBJECT_ID));
        mainEnv.add("Func", ensureObject(Func.FuncProto.OBJECT_ID));
        mainEnv.add("JArray", ensureObject(JArray.JArrayProto.OBJECT_ID));
        mainEnv.add("JClass", ensureObject(JClass.JClassProto.OBJECT_ID));

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

//        objectProtos.put(objectID, objects.get(protoID));
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
//        // No existance check. Returns null if key not found which would also be returned to indicate there is no proto.
//        return objectProtos.get(obj.getObjectID());
        try {
            return objectProtos[obj.getObjectID()];
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
//        return objects.containsKey(objectID);
        return getObject(objectID) != null;
    }

    public Env getEnv() {
        return env;
    }

    public Obj getObjNull() {
        return objNull;
    }

    public Obj getObjSys() {
        return objSys;
    }

    public Obj getObjTrue() {
        return objTrue;
    }

    public Obj getObjFalse() {
        return objFalse;
    }
}
