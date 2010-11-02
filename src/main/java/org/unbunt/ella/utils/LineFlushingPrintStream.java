package org.unbunt.ella.utils;

import java.io.*;

public class LineFlushingPrintStream extends PrintStream {
    public LineFlushingPrintStream(OutputStream out) {
        super(out);
    }

    public LineFlushingPrintStream(OutputStream out, boolean autoFlush) {
        super(out, autoFlush);
    }

    public LineFlushingPrintStream(OutputStream out, boolean autoFlush, String encoding)
            throws UnsupportedEncodingException {
        super(out, autoFlush, encoding);
    }

    public LineFlushingPrintStream(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    public LineFlushingPrintStream(String fileName, String csn)
            throws FileNotFoundException, UnsupportedEncodingException {
        super(fileName, csn);
    }

    public LineFlushingPrintStream(File file) throws FileNotFoundException {
        super(file);
    }

    public LineFlushingPrintStream(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException {
        super(file, csn);
    }

    @Override
    public void write(int b) {
        super.write(b);
        if (b == '\n') {
            super.flush();
        }
    }

    @Override
    public void println(Object x) {
        super.println(x);
        super.flush();
    }

    @Override
    public void println(String x) {
        super.println(x);
        super.flush();
    }

    @Override
    public void println(char x[]) {
        super.println(x);
        super.flush();
    }

    @Override
    public void println(double x) {
        super.println(x);
        super.flush();
    }

    @Override
    public void println(float x) {
        super.println(x);
        super.flush();
    }

    @Override
    public void println(long x) {
        super.println(x);
        super.flush();
    }

    @Override
    public void println(int x) {
        super.println(x);
        super.flush();
    }

    @Override
    public void println(char x) {
        super.println(x);
        super.flush();
    }

    @Override
    public void println(boolean x) {
        super.println(x);
        super.flush();
    }

    @Override
    public void println() {
        super.println();
        super.flush();
    }
}
