package org.unbunt.ella.utils;

import java.util.Date;

/**
 * User: tweiss
 * Date: Oct 19, 2010
 * Time: 3:06:32 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class StopWatch {
    protected final Date t1;
    protected Date t2 = null;
    protected long timeInMillis;
    protected double timeInSeconds;
    protected int precision;

    public StopWatch() {
        this(-1);
    }

    public StopWatch(int precision) {
        this.precision = precision;
        t1 = new Date();
    }

    public double stop() {
        t2 = new Date();
        timeInMillis = t2.getTime() - t1.getTime();
        timeInSeconds = 1d * timeInMillis / 1000;
        return getTimeInSeconds();
    }

    public Date getStartTime() {
        return t1;
    }

    public Date getStopTime() {
        checkStopped();
        return t2;
    }

    public long getTimeInMillis() {
        checkStopped();
        return timeInMillis;
    }

    public double getTimeInSeconds() {
        checkStopped();
        if (precision < 0) {
            return timeInSeconds;
        }
        double factor = Math.pow(10, precision);
        return Math.round(timeInSeconds * factor) / factor;
    }

    protected void checkStopped() {
        if (t2 == null) {
            throw new IllegalStateException("Stop watch still running.");
        }
    }
}
