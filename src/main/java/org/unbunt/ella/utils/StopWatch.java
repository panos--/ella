/* StopWatch.java
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package org.unbunt.ella.utils;

import java.util.Date;

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
