package org.unbunt.ella.engine.context;

import org.unbunt.ella.engine.environment.Env;
import org.unbunt.ella.engine.corelang.ConnMgr;
import org.unbunt.ella.engine.corelang.Null;
import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.engine.corelang.Bool;
import org.unbunt.ella.engine.corelang.Sys;
import org.unbunt.ella.utils.res.SimpleResource;

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
