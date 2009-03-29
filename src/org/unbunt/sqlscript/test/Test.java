package org.unbunt.sqlscript.test;

import org.unbunt.sqlscript.continuations.Continuation;
import org.unbunt.sqlscript.continuations.PrimitiveCont;
import org.unbunt.sqlscript.lang.Obj;
import org.unbunt.sqlscript.statement.Expression;
import org.unbunt.sqlscript.statement.PrimIntEqExpression;
import org.unbunt.sqlscript.statement.PrimitiveExpression;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static Obj o;
    public static PrimitiveExpression p;

    public static Continuation obj() {
        PrimitiveExpression prim = new PrimIntEqExpression();
        Obj obj = new Obj();
        List<Expression> list = new ArrayList<Expression>();
        PrimitiveCont[] c = new PrimitiveCont[16];
        PrimitiveExpression prim2 = null;
        Obj oo = null;
        for (int i = 0; i < 100000000; i++) {
            c[15] = new PrimitiveCont(prim, obj, list);
            prim2 = c[15].getPrimitiveExpression();
            oo = c[15].getArgument1();
        }
        p = prim2;
        o = oo;
        return c[15];
    }

    public static Object[] arr() {
        PrimitiveExpression prim = new PrimIntEqExpression();
        Obj obj = new Obj();
        List<Expression> list = new ArrayList<Expression>();
        Object[][] c = new Object[16][6];
        PrimitiveExpression prim2 = null;
        Obj oo = null;
        for (int i = 0; i < 100000000; i++) {
            Object[] cc = c[15];
            cc[0] = 1; // type
            cc[1] = prim;
            cc[2] = obj;
            cc[3] = list;
            cc[4] = 1; // curr list index
            prim2 = (PrimitiveExpression) cc[1];
            oo = (Obj) cc[2];
        }
        p = prim2;
        o = oo;
        return c[15];
    }

    public static Object[] arr2() {
        PrimitiveExpression prim = new PrimIntEqExpression();
        Obj obj = new Obj();
        List<Expression> list = new ArrayList<Expression>();
        Object[][] c = new Object[16][6];
        PrimitiveExpression prim2 = null;
        Obj oo = null;
        for (int i = 0; i < 100000000; i++) {
            Object[] cc = c[15];
            carr2(cc, prim, obj, list);
            prim2 = (PrimitiveExpression) cc[1];
            oo = (Obj) cc[2];
        }
        p = prim2;
        o = oo;
        return c[15];
    }

    public static void carr2(Object[] c, PrimitiveExpression prim, Obj obj, List<Expression> list) {
        c[0] = 1; // type
        c[1] = prim;
        c[2] = obj;
        c[3] = list;
        c[4] = 1; // curr list index
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            obj();
        }
        else if (args.length == 1) {
            arr();
        }
        else {
            arr2();
        }

        Object[] oo = new Object[10];
        Integer[] ii = new Integer[10];
        ii[1] = 42;
        oo[1] = ii;
        Integer i = ((Integer[])oo[1])[1];
        System.out.println("i: " + i);
    }
}
