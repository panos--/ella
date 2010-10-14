package org.unbunt.ella.utils;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * User: tweiss
 * Date: Oct 14, 2010
 * Time: 3:11:41 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class BackgroundStreamCopy extends Thread {
    protected final InputStream input;
    protected final OutputStream output;

    protected volatile boolean finished = false;
    protected volatile boolean success = false;
    protected volatile IOException exception = null;

    public BackgroundStreamCopy(InputStream input, OutputStream output) {
        this.input = input;
        this.output = output;
    }

    public void run() {
        try {
            IOUtils.unbufferedStreamCopy(input, output);
            success = true;
        } catch (IOException e) {
            exception = e;
        }
        finished = true;
    }

    public synchronized boolean isFinished() {
        return finished;
    }

    public synchronized boolean isSuccess() {
        return success;
    }

    public synchronized IOException getException() {
        return exception;
    }
}
