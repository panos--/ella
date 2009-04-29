//package org.unbunt.sqlscript.lang;
//
//import java.lang.reflect.Constructor;
//
//public class JConstructor extends PlainObj {
//    public final Constructor[] ctors;
//
//    public JConstructor(Constructor[] ctors) {
//        this.ctors = ctors;
//        slots.put(Str.Sym.parent.str, JConstructorProto.instance);
//    }
//
//    @Override
//    public Object toJavaObject() {
//        return ctors;
//    }
//}
