package org.unbunt.sqlscript.tests;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.unbunt.sqlscript.SQLScript;
import org.unbunt.sqlscript.DefaultSQLScriptContext;
import static org.unbunt.sqlscript.SQLScript.eval;
import org.unbunt.sqlscript.exception.SQLScriptIOException;
import org.unbunt.sqlscript.exception.SQLScriptParseException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;

import java.util.Date;

public class InterpreterTests {
    protected SQLScript interp;

    @Before
    public void init() {
        // nothing to do, yet
    }

    @Test
    public void blockScope() throws SQLScriptIOException, SQLScriptParseException {
        Object result;

        result = eval("{ var i := 23; } .i;");
        assertNull("Variable defined after scope left", result);

        result = eval("var i := 23; { .i; }");
        assertNotNull("Variable undefined in child scope", result);
        assertTrue("Variable not of type integer", Integer.class.equals(result.getClass()));
        assertTrue("Variable not of assigned value", (Integer)result == 23);
    }

    @Test
    public void javaIntegration() throws SQLScriptIOException, SQLScriptParseException {
        Object result;

        Date before = new Date();

        result = eval("var Date := new JClass('java.util.Date'); .new Date();");
        assertNotNull("Null on java object creation after class import via new JClass()", result);
        assertTrue("Date constructor returned not a Date object", Date.class.equals(result.getClass()));
        assertTrue("Date created, but no-arg constructor misbehaved", before.compareTo((Date) result) <= 0);

        result = eval(".Sys.importPackage('java.util'); .new Date();");
        assertNotNull("Null on java object creation after package import via Sys.importPackage()", result);

        result = eval("import java.util.*; .new Date();");
        assertNotNull("Null on java object creation after pacakge import via import statement", result);

        result = eval("import java.util.Date; .new Date();");
        assertNotNull("Null on java object creation after class import via import statement", result);

        result = eval("import java.util.Date as MyDate; .new MyDate();");
        assertNotNull("Null on java object creation after class import via import statement with alias", result);

        result = eval("{ import java.util.*; } .new Date();");
        assertNull("Dynamic environment from package loader not destroyed after leaving scope", result);

        long time = 928439284;
        Date refDate = new Date(time);
        long refTime = refDate.getTime();

        result = eval("import java.util.Date; .new Date(" + time +");");
        assertNotNull("Null on java object creation with on-arg constructor", result);
        assertTrue("One-arg Date constructor didn't return a date", Date.class.equals(result.getClass()));
        assertTrue("Date created from one-arg constructor doesn't match reference",
                   refDate.compareTo((Date) result) == 0);

        result = eval("import java.util.Date; var d := new Date(" + time + "); .d.getTime();");
        assertNotNull("Method inocation on java object returned null", result);
        assertTrue("Date.getTime() did not return a number", result instanceof Number);
        assertTrue("Value returned from Date.getTime() does not match reference time",
                   ((Number)result).longValue() == refTime);

        result = eval("import java.util.Date; var d := new Date(" + time + "); .d.time;");
        assertNotNull("Method invocation via bean property returned null", result);
        assertTrue("Date.getTime() via bean property did not return a number", result instanceof Number);
        assertTrue("Value returned from Date.getTime() via bean property does not match reference time",
                   ((Number)result).longValue() == refTime);
    }

    @Test
    public void inheritance() throws SQLScriptIOException, SQLScriptParseException {
        Object result;

        result = eval("{"
                      + "var A := { value = 'A' }; "
                      + "var B := { parent = A, value = 'B', getValue = fun() { super.value; } }; "
                      + "var b := new B(); b.getValue();"
                      + "}");
        assertNotNull("Getter on instanciated object returned null", result);
        assertTrue("Getter on instanciated object did not return string", String.class.equals(result.getClass()));
        assertTrue("Super on property returned unexpected value", "A".equals(result));

        result = eval(
                "{"
                + "var A := { getValue = fun() { return 'A'; } }; "
                + "var B := { parent = A, getValue = fun() { return super.getValue(); } }; "
                + "var b := new B(); b.getValue(); "
                + "}"
        );
        assertNotNull("Getter on instanciated object returned null", result);
        assertTrue("Getter on instanciated object did not return string", String.class.equals(result.getClass()));
        assertTrue("Super-call returned unexpected value", "A".equals(result));

        result = eval(
                "{"
                + "var A := { a = fun() { this.b(); }, b = fun() { 23; } }; "
                + "var B := { parent = A, a = fun() { super.a(); }, b = fun() { 42; } }; "
                + "var b := new B(); b.a(); "
                + "}"
        );
        assertNotNull("Object method invocation returned null", result);
        assertTrue("Object method invocation did not returned a number", result instanceof Number);
        assertTrue("This invoked from super did not execute correct method", ((Number)result).intValue() == 42);
    }

    @Test
    public void blockClosures() throws SQLScriptIOException, SQLScriptParseException {
        Object result;

        result = eval(
                "{\n"
                + "fun invokeBlock() {\n"
                + "    fun foo(block) { block(42); return 23; }\n"
                + "    foo { val => return val; };\n"
                + "}\n"
                + "invokeBlock();"
                + "}\n"
        );
        assertNotNull("Function invocation returned null", result);
        assertTrue("Function invocation did not return a number", result instanceof Number);
        assertTrue("Block closure did not return correctly", ((Number)result).intValue() == 42);

        try {
            eval(
                    "{\n"
                    + "var block := {=> return 23; };\n"
                    + "block();\n"
                    + "}"
            );
            assertTrue("Failed to catch non-local return in top-level block invocation (didn't throw exception)",
                       false);
        } catch (SQLScriptRuntimeException e) {
            assertTrue("Incorrect exception thrown on non-local return in top-level block invocation",
                       "Non-local return".equals(e.getMessage()));
        }

        try {
            eval(
                    "{\n"
                    + "fun returnBlock() { return {=> return 23; }; }"
                    + "var block := returnBlock();\n"
                    + "block();\n"
                    + "}"
            );
            assertTrue("Failed to catch non-local return in block invocation (didn't throw exception)", false);
        } catch (SQLScriptRuntimeException e) {
            assertTrue("Incorrect exception thrown on non-local return in block invocation",
                       "Non-local return".equals(e.getMessage()));
        }

        try {
            eval(
                    "{\n"
                    + "fun test() {\n"
                    + "    fun returnBlock() { return {=> return 23; }; }"
                    + "    var block := returnBlock();\n"
                    + "    block();\n"
                    + "}\n"
                    + "test();\n"
                    + "}"
            );
            assertTrue("Failed to catch non-local return in block invocation from foreign function "
                       + "(didn't throw exception)", false);
        } catch (SQLScriptRuntimeException e) {
            assertTrue("Incorrect exception thrown on non-local return in block invocation from foreign function",
                       "Non-local return".equals(e.getMessage()));
        }
    }
}
