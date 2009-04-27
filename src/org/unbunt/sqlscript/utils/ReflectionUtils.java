package org.unbunt.sqlscript.utils;

import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class ReflectionUtils {
    public static Method findMatchingMethod(Method[] methods, String name, Class[] args) {
        List<Method> nameMatches = new ArrayList<Method>();
        for (Method method : methods) {
            if (method.getName().equals(name)) {
                nameMatches.add(method);
            }
        }
        return findMatchingMethod(nameMatches.toArray(new Method[nameMatches.size()]), args);
    }

    public static Method findMatchingMethod(Method[] methods, Class[] args) {
        Method matchedMethod = null;
        for (Method method : methods) {
            if (!isAccessible(method)) {
                continue;
            }

            Class[] methArgs = method.getParameterTypes();

            if (args.length != methArgs.length) {
                continue;
            }

            boolean match = true;
            for (int i = 0; i < methArgs.length; i++) {
                Class methArg = methArgs[i];
                Class arg = args[i];

                if (arg != null && !isAssignableFrom(methArg, arg)) {
                    match = false;
                    break;
                }
            }

            if (!match) {
                continue;
            }

            if (matchedMethod != null) {
                Method bestMatch = getBestMatchingMethod(method, matchedMethod, args);
                if (bestMatch == null) {
                    throw new SQLScriptRuntimeException("Ambiguous method call");
                }
                matchedMethod = bestMatch;
            }
            else {
                matchedMethod = method;
            }
        }
        return matchedMethod;
    }

    public static Constructor findMatchingConstructor(Constructor[] Constructors, Class[] args) {
        Constructor matchedConstructor = null;
        for (Constructor ctor : Constructors) {
            if (!isAccessible(ctor)) {
                continue;
            }

            Class[] methArgs = ctor.getParameterTypes();

            if (args.length != methArgs.length) {
                continue;
            }

            boolean match = true;
            for (int i = 0; i < methArgs.length; i++) {
                Class methArg = methArgs[i];
                Class arg = args[i];

                if (arg != null && !isAssignableFrom(methArg, arg)) {
                    match = false;
                    break;
                }
            }

            if (!match) {
                continue;
            }

            if (matchedConstructor != null) {
                Constructor bestMatch = getBestMatchingConstructor(ctor, matchedConstructor, args);
                if (bestMatch == null) {
                    throw new SQLScriptRuntimeException("Ambiguous constructor call");
                }
                matchedConstructor = bestMatch;
            }
            else {
                matchedConstructor = ctor;
            }
        }
        return matchedConstructor;
    }

    protected static Method getBestMatchingMethod(Method method1, Method method2, Class[] args) {
        int weight = getBestMatchingArgs(method1.getParameterTypes(), method2.getParameterTypes(), args);
        return weight < 0 ? method1 : weight > 0 ? method2 : null;
    }

    protected static Constructor getBestMatchingConstructor(Constructor ctor1, Constructor ctor2, Class[] args) {
        int weight = getBestMatchingArgs(ctor1.getParameterTypes(), ctor2.getParameterTypes(), args);
        return weight < 0 ? ctor1 : weight > 0 ? ctor2 : null;
    }

    protected static int getBestMatchingArgs(Class[] meth1Args, Class[] meth2Args, Class[] args) {
        // NOTE: asserts all arrays are of same size

        int weight = 0; // weight < 0 => favour method1; weight > 0 => favour method2
        for (int i = 0; i < args.length; i++) {
            Class arg = args[i];
            Class meth1Arg = meth1Args[i];
            Class meth2Arg = meth2Args[i];

            if (arg == null) {
                continue;
            }

            // 2 possibly more specific than 1 -> favour 2
            if (isAssignableFrom(meth1Arg, meth2Arg)) {
                weight++;
            }

            // 1 possibly more specific than 2 -> favour 1
            // if condition above was met also, then both arg classes must be equals and neither 1 nor 2 are favoured
            if (isAssignableFrom(meth2Arg, meth1Arg)) {
                weight--;
            }
        }

        return weight;
    }

    public static boolean isAssignableFrom(Class class1, Class class2) {
        if (class1.isAssignableFrom(class2)) {
            return true;
        }

        if (class1.isPrimitive()) {
            if (class1.equals(boolean.class)
                && class2.equals(Boolean.class)) {
                return true;
            }
            if (class1.equals(byte.class)
                && class2.equals(Byte.class)) {
                return true;
            }
            else if (class1.equals(int.class)
                     && (class2.equals(Integer.class)
                         || class2.equals(Byte.class)
                         || class2.equals(byte.class))) {
                return true;
            }
            else if (class1.equals(long.class)
                     && (class2.equals(Long.class)
                         || class2.equals(Integer.class)
                         || class2.equals(int.class)
                         || class2.equals(Byte.class)
                         || class2.equals(byte.class))) {
                return true;
            }
            else if (class1.equals(float.class)
                     && class2.equals(Float.class)) {
                return true;
            }
            else if (class1.equals(double.class)
                     && (class2.equals(Double.class)
                         || class2.equals(Float.class)
                         || class2.equals(float.class))) {
                return true;
            }
        }
        else if (class2.isPrimitive()) {
            if (Boolean.class.equals(class1) && boolean.class.equals(class2)) {
                return true;
            }
            else if (Number.class.isAssignableFrom(class1)) {
                if (Byte.class.equals(class1) && byte.class.equals(class2)) {
                    return true;
                }
                else if (Integer.class.equals(class1) && int.class.equals(class2)) {
                    return true;
                }
                else if (Long.class.equals(class1) && long.class.equals(class2)) {
                    return true;
                }
                else if (Float.class.equals(class1) && float.class.equals(class2)) {
                    return true;
                }
                else if (Double.class.equals(class1) && double.class.equals(class2)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isAccessible(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    public static boolean isAccessible(Constructor ctor) {
        return Modifier.isPublic(ctor.getModifiers());
    }

    public static String getterFromProperty(String getter) {
        return methodFromProperty(getter, true);
    }

    public static String setterFromProperty(String setter) {
        return methodFromProperty(setter, false);
    }

    protected static String methodFromProperty(String methodName, boolean isGetter) {
        String prefix = isGetter ? "get" : "set";
        if (methodName.length() == 0) {
            return prefix;
        }
        StringBuilder buf = new StringBuilder(prefix);
        buf.append(Character.toUpperCase(methodName.charAt(0))).append(methodName.substring(1));
        return buf.toString();
    }

    public static String propertyFromGetter(String getter) {
        return propertyFromMethod(getter, true);
    }

    public static String propertyFromSetter(String setter) {
        return propertyFromMethod(setter, false);
    }

    protected static String propertyFromMethod(String methodName, boolean isGetter ) {
        int getterLength = methodName.length();

        if (getterLength < 4 || !methodName.startsWith(isGetter ? "get" : "set")) {
            return methodName;
        }

        if (!Character.isUpperCase(methodName.charAt(4))) {
            return methodName;
        }

        char[] buf = new char[getterLength - 3];
        methodName.getChars(3, getterLength - 1, buf, 0);
        buf[0] = Character.toLowerCase(buf[0]);
        return new String(buf);
    }

    public static List<Method> getMethods(Class cls, String name) {
        List<Method> result = new ArrayList<Method>();
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            if (method.getName().equals(name)) {
                result.add(method);
            }
        }
        return result;
    }

    public static List<Method> getStaticMethods(Class cls, String name) {
        List<Method> result = new ArrayList<Method>();
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            if (Modifier.isStatic(method.getModifiers()) && method.getName().equals(name)) {
                result.add(method);
            }
        }
        return result;
    }

    public static Class[] getArgTypes(Object[] args) {
        Class[] result = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            Object arg = args[i];
            result[i] = arg == null ? null : arg.getClass();
        }
        return result;
    }

}
