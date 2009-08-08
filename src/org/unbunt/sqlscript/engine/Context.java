package org.unbunt.sqlscript.engine;

import org.unbunt.sqlscript.lang.Bool;
import org.unbunt.sqlscript.lang.Null;
import org.unbunt.sqlscript.lang.Sys;
import org.unbunt.sqlscript.engine.natives.ConnMgr;
import org.unbunt.sqlscript.engine.natives.Obj;
import org.unbunt.sqlscript.engine.environment.Env;
import org.unbunt.sqlscript.utils.res.SimpleResource;

public interface Context {
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
