package org.unbunt.sqlscript.testng;

import org.testng.Assert;

public class TestUtils {
    @SuppressWarnings({"unchecked"})
    public static <T> T ensureType(Class<T> clazz, Object o) {
        try {
            return (T) o;
        } catch (ClassCastException e) {
            Assert.assertTrue(false, "Unexpected type: " + o.getClass() + ": Expected: " + clazz);
            return null;
        }
    }
}
