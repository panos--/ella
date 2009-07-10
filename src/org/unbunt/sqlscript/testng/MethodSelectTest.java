package org.unbunt.sqlscript.testng;

public class MethodSelectTest {
    public String foo(byte foo) {
        return "foo(byte)";
    }

    public String foo(long foo) {
        return "foo(long)";
    }

    public String foo(String foo) {
        return "foo(String)";
    }

    public String qux(short foo) {
        return "qux(short)";
    }

    public String qux(int foo) {
        return "qux(int)";
    }

    public String baz(java.util.Date date) {
        return "baz(java.util.Date)";
    }

    public String baz(java.sql.Date date) {
        return "baz(java.sql.Date)";
    }

    public String bar(java.util.Calendar calendar) {
        return "bar(Calendar)";
    }

    public String bar(java.util.Date date) {
        return "bar(Date)";
    }
}
