package org.unbunt.ella.exception;

/**
 * User: tweiss
 * Date: 17.04.2008
 * Time: 06:42:24
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class ExceptionUtils {
    public static boolean isCausedBy(Throwable t, Class... classes) {
        Throwable cause = t;
        while (cause != null) {
            for (Class aClass : classes) {
                if (aClass == null) {
                    continue;
                }
                if (aClass.isInstance(cause)) {
                    return true;
                }
            }
            cause = cause.getCause();
        }
        return false;
    }

    @SuppressWarnings({"unchecked"})
    public static <T extends Throwable> T getCause(Throwable t, Class<T> cls) {
        if (cls == null) {
            return null;
        }

        Throwable cause = t;
        while (cause != null) {
            if (cls.isInstance(cause)) {
                return (T) cause;
            }
            cause = cause.getCause();
        }

        return null;
    }
}
