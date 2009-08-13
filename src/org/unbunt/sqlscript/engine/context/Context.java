package org.unbunt.sqlscript.engine.context;

import org.unbunt.sqlscript.engine.environment.Env;
import org.unbunt.sqlscript.engine.corelang.ConnMgr;
import org.unbunt.sqlscript.engine.corelang.Null;
import org.unbunt.sqlscript.engine.corelang.Obj;
import org.unbunt.sqlscript.engine.corelang.Bool;
import org.unbunt.sqlscript.engine.corelang.Sys;
import org.unbunt.sqlscript.utils.res.SimpleResource;

public interface Context extends SQLResultProvider {
    void registerProto(int objectID, int protoID);

    void registerObject(Obj object);

    Obj getObjectProto(Obj obj);

    boolean hasObject(int objectID);

    Env getEnv();

    void setEnv(Env env);

    String getScriptFilename();

    void setScriptFilename(String scriptFilename);

    SimpleResource getScriptResource();

    void setScriptResource(SimpleResource scriptResource);

    Sys getObjSys();

    ConnMgr getObjConnMgr();

    Null getObjNull();

    Bool getObjTrue();

    Bool getObjFalse();
}
