package org.unbunt.utils;

//import fr.umlv.jmmf.reflect.MultiMethod;
//import fr.umlv.jmmf.reflect.MultipleMethodsException;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Array;

import org.unbunt.sqlscript.utils.ReflectionUtils;

public class Test {
    public void test(long l) {
        System.out.println("long: " + l);
    }
    public void test(Long l) {
        System.out.println("Long: " + l);
    }
    public void test(int i) {
        System.out.println("int: " + i);
    }
    public void test(Integer i) {
        System.out.println("Integer: " + i);
    }

    public void arrtest(int[] intarr) {
        for (int i1 : intarr) {
            System.out.println(i1);
        }
    }

    public void arrtest(int[][] intarr) {
        for (int[] ints : intarr) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }

    static long l = 42l;
    static int i = 23;
    static Long ll = new Long(43l);
    static Integer ii = new Integer(24);
    static Test t = new Test();

    public static int tryFinally() {
        try {
            return 42;
        } finally {
            return 23;
        }
    }

    public static class Gen {
        public static int id = 0;
        public synchronized static int gen() {
            return ++id;
        }
    }

    public static abstract class Abs {
        public static int id = Gen.gen();

        public int getID() {
            return id;
        }

        public static int getIDStatic() {
            System.out.println();
            return id;
        }
    }

    public static class A extends Abs {

    }

    public static class B extends A {
        public static int id = Gen.gen();
    }

    public static void main(String[] args) {
        System.out.println("Abs.id: " + Abs.getIDStatic());
        System.out.println("A.id: " + A.getIDStatic());
        System.out.println("B.id: " + B.getIDStatic());
        System.exit(0);

        System.out.println(tryFinally());

        System.out.println(Integer.TYPE);
        System.out.println(int.class);
        System.out.println(Boolean.TYPE);
        System.out.println(boolean.class);
        System.exit(0);

        Class<Integer> ic = Integer.class;
        Class<? extends Class> icc = ic.getClass();
        Class<? extends Class> iccc = icc.getClass();
        System.out.println("ic: " + ic);
        System.out.println("icc: " + icc);
        System.out.println("iccc: " + iccc);
        System.exit(0);

        int[] intArray = new int[23];
        Object intArrayObj = intArray;

        if (intArrayObj.getClass().isArray()) {
            System.out.println("is array: " + intArrayObj.getClass().getComponentType());
        }
        else {
            System.out.println("is not array");
        }
        System.exit(0);

        Integer integer = 12;
        Number num = Number.class.cast(integer);
        System.out.println("integer: " + integer + "; num: " + num);
        Method[] methods = t.getClass().getMethods();
//        for (Method method : methods) {
//            if ("testLong".equals(method.getName())) {
//                invokeTest(method);
//            }
//        }

        byte b = 12;
        Method m = ReflectionUtils.findMatchingMethod(methods, "test", ReflectionUtils.getArgTypes(new Object[] {l}));
        if (m == null) {
            System.out.println("no meth found or meths ambiguous");
            return;
        }
        System.out.println("found method: " + m);
        invokeTest(m);

        /*
        MultiMethod mm = MultiMethod.create(Test.class, "test", 1);
        Method m;
        try {
            m = mm.getMethod(t.getClass(), new Class[] { null });
            try {
                m.invoke(t, ii);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (MultipleMethodsException e) {
            e.printStackTrace();
        }
        */
    }

    private static void invokeTest(Method method) {
        try {
            try {
                System.out.print("calling with long arg: "); method.invoke(t, l);
            } catch (IllegalArgumentException e) {
                System.out.println("illegal argument");
            }
            try {
                System.out.print("calling with Long arg: "); method.invoke(t, ll);
            } catch (IllegalArgumentException e) {
                System.out.println("illegal argument");
            }
            try {
                System.out.print("calling with int arg: "); method.invoke(t, i);
            } catch (IllegalArgumentException e) {
                System.out.println("illegal argument");
            }
            try {
                System.out.print("calling with Integer arg: "); method.invoke(t, ii);
            } catch (IllegalArgumentException e) {
                System.out.println("illegal argument");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
