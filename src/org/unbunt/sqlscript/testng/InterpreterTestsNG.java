package org.unbunt.sqlscript.testng;

import org.unbunt.sqlscript.SQLScript;
import org.unbunt.sqlscript.utils.TestUtils;
import static org.unbunt.sqlscript.utils.TestUtils.ensureType;
import static org.unbunt.sqlscript.SQLScript.eval;
import org.unbunt.sqlscript.exception.SQLScriptIOException;
import org.unbunt.sqlscript.exception.SQLScriptParseException;
import org.unbunt.sqlscript.exception.SQLScriptRuntimeException;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import static org.testng.Assert.*;

import java.util.Date;

@Test(groups = { "interpreter" }, dependsOnGroups = { "parser" })
public class InterpreterTestsNG extends AbstractTest {
    protected SQLScript interp;

    @BeforeTest
    public void init() {
        // nothing to do, yet
    }

    @Test
    public void blockScope() throws SQLScriptIOException, SQLScriptParseException {
        Object result;

        result = eval("{ var i := 23; } .i;");
        assertNull(result, "Variable defined after scope left");

        result = eval("var i := 23; { .i; }");
        assertNotNull(result, "Variable undefined in child scope");
        assertTrue(Integer.class.equals(result.getClass()), "Variable not of type integer");
        assertTrue((Integer)result == 23, "Variable not of assigned value");
    }

    @Test
    public void javaIntegration() throws SQLScriptIOException, SQLScriptParseException {
        Object result;

        Date before = new Date();

        result = eval("var Date := new JClass('java.util.Date'); .new Date();");
        assertNotNull(result, "Null on java object creation after class import via new JClass()");
        assertTrue(Date.class.equals(result.getClass()), "Date constructor returned not a Date object");
        assertTrue(before.compareTo((Date) result) <= 0, "Date created, but no-arg constructor misbehaved");

        result = eval(".Sys.importPackage('java.util'); .new Date();");
        assertNotNull(result, "Null on java object creation after package import via Sys.importPackage()");

        result = eval("import java.util.*; .new Date();");
        assertNotNull(result, "Null on java object creation after pacakge import via import statement");

        result = eval("import java.util.Date; .new Date();");
        assertNotNull(result, "Null on java object creation after class import via import statement");

        result = eval("import java.util.Date as MyDate; .new MyDate();");
        assertNotNull(result, "Null on java object creation after class import via import statement with alias");

        result = eval("{ import java.util.*; } .new Date();");
        assertNull(result, "Dynamic environment from package loader not destroyed after leaving scope");

        long time = 928439284;
        Date refDate = new Date(time);
        long refTime = refDate.getTime();

        result = eval("import java.util.Date; .new Date(" + time +");");
        assertNotNull(result, "Null on java object creation with on-arg constructor");
        assertTrue(Date.class.equals(result.getClass()), "One-arg Date constructor didn't return a date");
        assertTrue(
                refDate.compareTo((Date) result) == 0,
                "Date created from one-arg constructor doesn't match reference"
        );

        result = eval("import java.util.Date; var d := new Date(" + time + "); .d.getTime();");
        assertNotNull(result, "Method inocation on java object returned null");
        assertTrue(result instanceof Number, "Date.getTime() did not return a number");
        assertTrue(
                ((Number)result).longValue() == refTime,
                "Value returned from Date.getTime() does not match reference time"
        );

        result = eval("import java.util.Date; var d := new Date(" + time + "); .d.time;");
        assertNotNull(result, "Method invocation via bean property returned null");
        assertTrue(result instanceof Number, "Date.getTime() via bean property did not return a number");
        assertTrue(
                ((Number)result).longValue() == refTime,
                "Value returned from Date.getTime() via bean property does not match reference time"
        );
    }

    @Test
    public void inheritance() throws SQLScriptIOException, SQLScriptParseException {
        Object result;

        result = eval("{"
                      + "var A := { value: 'A' }; "
                      + "var B := { parent: A, value: 'B', getValue: fun() { super.value; } }; "
                      + "var b := new B(); b.getValue();"
                      + "}");
        assertNotNull(result, "Getter on instanciated object returned null");
        assertTrue(String.class.equals(result.getClass()), "Getter on instanciated object did not return string");
        assertTrue("A".equals(result), "Super on property returned unexpected value");

        result = eval(
                "{"
                + "var A := { getValue: fun() { return 'A'; } }; "
                + "var B := { parent: A, getValue: fun() { return super.getValue(); } }; "
                + "var b := new B(); b.getValue(); "
                + "}"
        );
        assertNotNull(result, "Getter on instanciated object returned null");
        assertTrue(String.class.equals(result.getClass()), "Getter on instanciated object did not return string");
        assertTrue("A".equals(result), "Super-call returned unexpected value");

        result = eval(
                "{"
                + "var A := { a: fun() { this.b(); }, b: fun() { 23; } }; "
                + "var B := { parent: A, a: fun() { super.a(); }, b: fun() { 42; } }; "
                + "var b := new B(); b.a(); "
                + "}"
        );
        assertNotNull(result, "Object method invocation returned null");
        assertTrue(result instanceof Number, "Object method invocation did not returned a number");
        assertTrue(((Number)result).intValue() == 42, "This invoked from super did not execute correct method");
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
        assertNotNull(result, "Function invocation returned null");
        assertTrue(result instanceof Number, "Function invocation did not return a number");
        assertTrue(((Number)result).intValue() == 42, "Block closure did not return correctly");

        try {
            eval(
                    "{\n"
                    + "var block := {=> return 23; };\n"
                    + "block();\n"
                    + "}"
            );
            assertTrue(false,
                       "Failed to catch non-local return in top-level block invocation (didn't throw exception)");
        } catch (SQLScriptRuntimeException e) {
            assertTrue("Non-local return".equals(e.getMessage()),
                       "Incorrect exception thrown on non-local return in top-level block invocation");
        }

        try {
            eval(
                    "{\n"
                    + "fun returnBlock() { return {=> return 23; }; }"
                    + "var block := returnBlock();\n"
                    + "block();\n"
                    + "}"
            );
            assertTrue(false, "Failed to catch non-local return in block invocation (didn't throw exception)");
        } catch (SQLScriptRuntimeException e) {
            assertTrue("Non-local return".equals(e.getMessage()),
                       "Incorrect exception thrown on non-local return in block invocation");
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
            assertTrue(false, "Failed to catch non-local return in block invocation from foreign function "
                              + "(didn't throw exception)");
        } catch (SQLScriptRuntimeException e) {
            assertTrue("Non-local return".equals(e.getMessage()),
                       "Incorrect exception thrown on non-local return in block invocation from foreign function");
        }

        result = eval(
                "{\n"
                + "\n"
                + "fun ifFunc (cond, trueBody) {\n"
                + "    if (cond()) {\n"
                + "        trueBody();\n"
                + "    }\n"
                + "    return 13;\n"
                + "}\n"
                + "\n"
                + "fun test() {\n"
                + "    ifFunc({=> 1 == 1; }, {=> ifFunc({=> 2 == 2; }, {=> return 42; }); });\n"
                + "    return 23;\n"
                + "}\n"
                + "\n"
                + "test();\n"
                + "\n"
                + "}"
        );
        assertNotNull(result);
        assertTrue(result instanceof Number);
        assertTrue(((Number)result).intValue() == 42,
                   "Nested block closure returns to wrong home function");
    }

    @Test
    public void loops() throws SQLScriptIOException, SQLScriptParseException {
        Object result;

        result = eval(
                "var i := 0;\n" +
                "var j := 0;\n" +
                ".loop {=>\n" +
                "    if (i == 3) {\n" +
                "        break();\n" +
                "    }\n" +
                "    if (i == 42) {\n" +
                "        exit;\n" +
                "    }\n" +
                "\n" +
                "    i = i + 1;\n" +
                "    continue();\n" +
                "    j = j + 1;\n" +
                "};\n" +
                ".j;"
        );
        assertNotNull(result, "Loop does not honour break statement");
        assertTrue(result instanceof Number);
        assertTrue(((Number)result).intValue() == 0,
                   "Loop does not honour continue statement");
    }

    @Test
    public void args() throws SQLScriptIOException, SQLScriptParseException {
        int arg = 42;
        Object result = eval(".ARGV[0];", arg);
        Number num = ensureType(Number.class, result);
        assertTrue(num.intValue() == arg, "Passing argument to script failed");
    }

    @Test
    public void evalFile() throws SQLScriptIOException, SQLScriptParseException {
        int arg = 42;
        Object result = eval(file("eval-file"), arg);
        Number num = ensureType(Number.class, result);
        assertTrue(num.intValue() == arg, "Passing argument to script failed");
    }

    @Test
    public void includeFile() throws SQLScriptIOException, SQLScriptParseException {
        eval(file("include-file"));
    }

    @Test
    public void includeFileClosureUpdate() throws SQLScriptIOException, SQLScriptParseException {
        eval(file("include-file-closure-update"));
    }

    @Test
    public void includeFileClosureAfterDynamic() throws SQLScriptIOException, SQLScriptParseException {
        eval(file("include-file-closure-after-dynamic"));
    }

    @Test
    public void includeFileDynenv() throws SQLScriptIOException, SQLScriptParseException {
        eval(file("include-file-dynenv"));
    }
}