package org.unbunt.ella.lang;

import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.lang.NativeWrapper;
import org.unbunt.ella.engine.corelang.Null;
import org.unbunt.ella.engine.corelang.Obj;
import org.unbunt.ella.exception.CheckedClassCastException;
import org.unbunt.ella.exception.EllaRuntimeException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReflectionUtils {
    public static Pattern CLASS_NAME_PATTERN = Pattern.compile("(?:.*\\.)?(.*?);?$");

    /**
     * Returns all methods from the given array whose argument types match
     * the given type names.
     * A <b>null</b> type name acts as wildcard. Names of primitives may be
     * prefixed with a dollar sign to avoid ambiguities.
     * Ordinary class names may be given in their abreviated form (i.e. without
     * the package name).
     * Otherwise the type name has to match the value returned by the getName()
     * method of the respective arguemnt's class.
     * @param methods the methods to search
     * @param typeNames the type names to match
     * @return the methods matching the given type names
     * @see java.lang.Class#getName()
     */
    public static Method[] selectMethods(Method[] methods, String[] typeNames) {
        ArrayList<Method> matchedMethods = new ArrayList<Method>();
        for (Method method : methods) {
            Class[] methArgs = method.getParameterTypes();

            if (methArgs.length != typeNames.length) {
                continue;
            }

            boolean matched = true;
            for (int i = 0; i < methArgs.length; i++) {
                Class methArg = methArgs[i];
                String actualType = methArg.getName();
                String desiredType = typeNames[i];

                if (actualType.equals(desiredType) || ("$" + actualType).equals(desiredType)) {
                    continue;
                }

                Matcher matcher = CLASS_NAME_PATTERN.matcher(actualType);
                assert matcher.matches();

                String className = matcher.group(1);
                if (className.equals(desiredType)) {
                    continue;
                }

                matched = false;
            }

            if (matched) {
                matchedMethods.add(method);
            }
        }
        return matchedMethods.toArray(new Method[matchedMethods.size()]);
    }

    public static Object[] adaptTypes(Method method, Object[] args) throws CheckedClassCastException {
        return adaptTypes(method.getParameterTypes(), args);
    }

    public static Object[] adaptTypes(Class<?>[] parameterTypes, Object[] args) throws CheckedClassCastException {
        assert parameterTypes.length == args.length;

        Object[] result = new Object[args.length];

        try {
            for (int i = 0; i < parameterTypes.length; i++) {
                Class<?> parameterType = parameterTypes[i];
                Object arg = args[i];
                if (arg == null) {
                    result[i] = null;
                    continue;
                }
                if (parameterType.isPrimitive()) {
                    if (arg instanceof Number) {
                        Number num = (Number) arg;
                        if (parameterType.equals(int.class)) {
                            result[i] = num.intValue();
                            continue;
                        }
                        else if (parameterType.equals(long.class)) {
                            result[i] = num.longValue();
                            continue;
                        }
                        else if (parameterType.equals(float.class)) {
                            result[i] = num.floatValue();
                            continue;
                        }
                        else if (parameterType.equals(double.class)) {
                            result[i] = num.doubleValue();
                            continue;
                        }
                        else if (parameterType.equals(byte.class)) {
                            result[i] = num.byteValue();
                            continue;
                        }
                        else if (parameterType.equals(short.class)) {
                            result[i] = num.shortValue();
                            continue;
                        }
                    }
                    else {
                        result[i] = arg; // leave untouched, auto-boxing mechanism will take care of this
                    }
                }
                result[i] = parameterType.cast(arg);
            }
        } catch (ClassCastException e) {
            throw new CheckedClassCastException(e);
        }

        return result;
    }

    public static Method findMatchingMethod(Method[] methods, String name, Class[] args, Object[] values) {
        List<Method> nameMatches = new ArrayList<Method>();
        for (Method method : methods) {
            if (method.getName().equals(name)) {
                nameMatches.add(method);
            }
        }
        return findMatchingMethod(nameMatches.toArray(new Method[nameMatches.size()]), args, values);
    }

    public static Method findMatchingMethod(Method[] methods, Class[] args, Object[] values) {
        assert args.length == values.length;

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
                Object value = values[i];

                if (arg != null && !isAssignableFrom(methArg, arg, value)) {
                    match = false;
                    break;
                }
            }

            if (!match) {
                continue;
            }

            if (matchedMethod != null) {
                Method bestMatch = getBestMatchingMethod(method, matchedMethod, args, values);
                if (bestMatch == null) {
                    throw new EllaRuntimeException("Ambiguous method call");
                }
                matchedMethod = bestMatch;
            }
            else {
                matchedMethod = method;
            }
        }
        return matchedMethod;
    }

    public static Constructor findMatchingConstructor(Constructor[] Constructors, Class[] args, Object[] values) {
        assert args.length == values.length;

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
                Object value = values[i];

                if (arg != null && !isAssignableFrom(methArg, arg, value)) {
                    match = false;
                    break;
                }
            }

            if (!match) {
                continue;
            }

            if (matchedConstructor != null) {
                Constructor bestMatch = getBestMatchingConstructor(ctor, matchedConstructor, args, values);
                if (bestMatch == null) {
                    throw new EllaRuntimeException("Ambiguous constructor call");
                }
                matchedConstructor = bestMatch;
            }
            else {
                matchedConstructor = ctor;
            }
        }
        return matchedConstructor;
    }

    protected static Method getBestMatchingMethod(Method method1, Method method2, Class[] args, Object[] values) {
        int weight = getBestMatchingArgs(method1.getParameterTypes(), method2.getParameterTypes(), args, values);
        return weight < 0 ? method1 : weight > 0 ? method2 : null;
    }

    protected static Constructor getBestMatchingConstructor(Constructor ctor1, Constructor ctor2,
                                                            Class[] args, Object[] values) {
        int weight = getBestMatchingArgs(ctor1.getParameterTypes(), ctor2.getParameterTypes(), args, values);
        return weight < 0 ? ctor1 : weight > 0 ? ctor2 : null;
    }

    protected static int getBestMatchingArgs(Class[] meth1Args, Class[] meth2Args, Class[] args, Object[] values) {
        // NOTE: asserts all arrays are of same size

        int weight = 0; // weight < 0 => favour method1; weight > 0 => favour method2
        for (int i = 0; i < args.length; i++) {
            Class arg = args[i];
            Class meth1Arg = meth1Args[i];
            Class meth2Arg = meth2Args[i];
            Object value = values[i];

            if (arg == null) {
                continue;
            }

            // 2 possibly more specific than 1 -> favour 2
            if (isAssignableFrom(meth1Arg, meth2Arg, value)) {
                weight++;
            }

            // 1 possibly more specific than 2 -> favour 1
            // if condition above was met also, then both arg classes must be equals and neither 1 nor 2 are favoured
            if (isAssignableFrom(meth2Arg, meth1Arg, value)) {
                weight--;
            }
        }

        return weight;
    }

    public static boolean isAssignableFrom(Class<?> class1, Class<?> class2, Object value) {
        if (class1.isAssignableFrom(class2)) {
            return true;
        }

        // check for possible conversions between primitives and possibly their corrensponding boxed classes.
        // the canConvert-calls are intended to check is if narrowing conversions can be done non-destructively
        // but are disabled for now since the calling method has to be modified before they can be used.
        // the intention is that for example a call to foo(int) should succeed when called with a long parameter
        // if and only if the long value can be converted to int without information loss.
        // in its current form, when additionally a method foo(short) exists, both foo(short) and foo(int) would
        // be returned if the long value fits both but in this case only the narrower version should be returned
        // i.e. foo(int)
        if (class1.isPrimitive()) {
            if (class1.equals(boolean.class)
                && class2.equals(Boolean.class)) {
                return true;
            }
            if (class1.equals(byte.class)
                && (class2.equals(Byte.class)
                    || canConvertToByte(value))) {
                return true;
            }
            else if (class1.equals(short.class)
                    && (class2.equals(Short.class)
                        || class2.equals(Byte.class)
                        || class2.equals(byte.class)
                        || canConvertToShort(value))) {
                return true;
            }
            else if (class1.equals(int.class)
                     && (class2.equals(Integer.class)
                         || class2.equals(Short.class)
                         || class2.equals(short.class)
                         || class2.equals(Byte.class)
                         || class2.equals(byte.class)
                         || canConvertToInt(value))) {
                return true;
            }
            else if (class1.equals(long.class)
                     && (class2.equals(Long.class)
                         || class2.equals(Integer.class)
                         || class2.equals(int.class)
                         || class2.equals(Short.class)
                         || class2.equals(short.class)
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
                else if (Short.class.equals(class1) && short.class.equals(class2)) {
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

    @SuppressWarnings({"UnusedDeclaration"})
    private static boolean canConvertToByte(Object value) {
        /*
        boolean validType = value instanceof Long || value instanceof Integer || value instanceof Short;
        if (!validType) {
            return false;
        }
        try {

            Number num = (Number)value;
            long longValue = num.longValue();
            byte byteValue = num.byteValue();
            return byteValue == longValue;
        } catch (NullPointerException e) {
            return true;
        } catch (ClassCastException e) {
            return false;
        }
        */
        return false;
    }

    @SuppressWarnings({"UnusedDeclaration"})
    private static boolean canConvertToShort(Object value) {
        /*
        boolean validType = value instanceof Long || value instanceof Integer;
        if (!validType) {
            return false;
        }
        try {

            Number num = (Number)value;
            long longValue = num.longValue();
            short shortValue = num.shortValue();
            return shortValue == longValue;
        } catch (NullPointerException e) {
            return true;
        } catch (ClassCastException e) {
            return false;
        }
        */
        return false;
    }

    @SuppressWarnings({"UnusedDeclaration"})
    private static boolean canConvertToInt(Object value) {
        /*
        try {
            Long l = (Long)value;
            return l.intValue() == l;
        } catch (NullPointerException e) {
            return true;
        } catch (ClassCastException e) {
            return false;
        }
        */
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

    public static Class[] getArgTypes(Object[] args, Obj[] wrappedArgs) {
        Class[] result = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            Object arg = args[i];
            if (arg == null) {
                Obj wrappedArg = wrappedArgs[i];
                if (wrappedArg instanceof Null) {
                    result[i] = ((Null) wrappedArg).getTypeHint();
                }
            }
            else {
                result[i] = arg.getClass();
            }
        }
        return result;
    }

    public static Obj invokeMethod(Context ctx, Method method, Object obj, Object... args)
            throws InvocationTargetException, IllegalAccessException {
        Object result = method.invoke(obj, args);
        if (result == null) {
            Class<?> returnType = method.getReturnType();
            if (!returnType.equals(void.class)) {
                return new NullImpl(returnType);
            }
            else {
                return ctx.getObjNull();
            }
        }
        return NativeWrapper.wrap(ctx, result);
    }
}
