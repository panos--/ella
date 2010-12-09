/* SLF4JOutputStream.java
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

/*
 * This is a modified version of LoggingOutputStream, developed by Jim Moore.
 * The original was taken from the Log4j contrib section and can be found at
 * http://svn.apache.org/viewvc/logging/log4j/trunk/contribs/JimMoore/LoggingOutputStream.java
 *
 * The file was distributed under the following license.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import org.slf4j.Logger;

import java.io.IOException;
import java.io.OutputStream;


/**
 * An OutputStream that flushes out to a Category.<p>
 * <p/>
 * Note that no data is written out to the Category until the stream is
 * flushed or closed.<p>
 * <p/>
 * Example:<pre>
 * // make sure everything sent to System.err is logged
 * System.setErr(new PrintStream(new LoggingOutputStream(Category.getRoot(), Priority.WARN), true));
 * <p/>
 * // make sure everything sent to System.out is also logged
 * System.setOut(new PrintStream(new LoggingOutputStream(Category.getRoot(), Priority.INFO), true));
 * </pre>
 *
 * @author <a href="mailto://Jim.Moore@rocketmail.com">Jim Moore</a>
 */
public class SLF4JOutputStream extends OutputStream {
    protected static final String LINE_SEPERATOR = System.getProperty("line.separator");


    /**
     * Used to maintain the contract of {@link #close()}.
     */
    protected boolean hasBeenClosed = false;

    /**
     * The internal buffer where data is stored.
     */
    protected byte[] buf;

    /**
     * The number of valid bytes in the buffer. This value is always
     * in the range <tt>0</tt> through <tt>buf.length</tt>; elements
     * <tt>buf[0]</tt> through <tt>buf[count-1]</tt> contain valid
     * byte data.
     */
    protected int count;


    /**
     * Remembers the size of the buffer for speed.
     */
    private int bufLength;

    /**
     * The default number of bytes in the buffer. =2048
     */
    public static final int DEFAULT_BUFFER_LENGTH = 2048;


    /**
     * The category to write to.
     */
    protected PriorityLogger logger;


    /**
     * Creates the LoggingOutputStream to flush to the given Category.
     *
     * @param logger   the Category to write to
     * @param priority the Priority to use when writing to the Category
     * @throws IllegalArgumentException if cat == null or priority == null
     */
    public SLF4JOutputStream(Logger logger, Priority priority)
            throws IllegalArgumentException {
        if (logger == null) {
            throw new IllegalArgumentException("logger == null");
        }
        if (priority == null) {
            throw new IllegalArgumentException("priority == null");
        }

        this.logger = priority.createLogger(logger);
        bufLength = DEFAULT_BUFFER_LENGTH;
        buf = new byte[DEFAULT_BUFFER_LENGTH];
        count = 0;
    }


    /**
     * Closes this output stream and releases any system resources
     * associated with this stream. The general contract of <code>close</code>
     * is that it closes the output stream. A closed stream cannot perform
     * output operations and cannot be reopened.
     */
    public void close() {
        flush();
        hasBeenClosed = true;
    }


    /**
     * Writes the specified byte to this output stream. The general
     * contract for <code>write</code> is that one byte is written
     * to the output stream. The byte to be written is the eight
     * low-order bits of the argument <code>b</code>. The 24
     * high-order bits of <code>b</code> are ignored.
     *
     * @param b the <code>byte</code> to write
     * @throws IOException if an I/O error occurs. In particular,
     *                     an <code>IOException</code> may be thrown if the
     *                     output stream has been closed.
     */
    public void write(final int b) throws IOException {
        if (hasBeenClosed) {
            throw new IOException("The stream has been closed.");
        }

        // don't log nulls
        if (b == 0) {
            return;
        }

        if ((byte) b == '\n') {
            writeOut();
            return;
        }

        // would this be writing past the buffer?
        if (count == bufLength) {
            // grow the buffer
            final int newBufLength = bufLength + DEFAULT_BUFFER_LENGTH;
            final byte[] newBuf = new byte[newBufLength];

            System.arraycopy(buf, 0, newBuf, 0, bufLength);

            buf = newBuf;
            bufLength = newBufLength;
        }

        buf[count] = (byte) b;
        count++;
    }


    /**
     * Flushes this output stream and forces any buffered output bytes
     * to be written out. The general contract of <code>flush</code> is
     * that calling it is an indication that, if any bytes previously
     * written have been buffered by the implementation of the output
     * stream, such bytes should immediately be written to their
     * intended destination.
     */
    public void flush() {
    }

    protected void writeOut() {
        if (count == 0) {
            return;
        }

        // don't print out blank lines; flushing from PrintStream puts out these
        if (count == LINE_SEPERATOR.length()) {
            if (((char) buf[0]) == LINE_SEPERATOR.charAt(0) &&
                ((count == 1) ||  // <- Unix & Mac, -> Windows
                 ((count == 2) && ((char) buf[1]) == LINE_SEPERATOR.charAt(1)))) {
                reset();
                return;
            }
        }

        final byte[] theBytes = new byte[count];

        System.arraycopy(buf, 0, theBytes, 0, count);

        logger.log(new String(theBytes));

        reset();
    }


    private void reset() {
        // not resetting the buffer -- assuming that if it grew that it
        //   will likely grow similarly again
        count = 0;
    }

    public enum Priority {
        trace {
            PriorityLogger createLogger(final Logger logger) {
                return new PriorityLogger() {
                    public void log(String msg) {
                        logger.trace(msg);
                    }
                };
            }
        },
        debug {
            PriorityLogger createLogger(final Logger logger) {
                return new PriorityLogger() {
                    public void log(String msg) {
                        logger.debug(msg);
                    }
                };
            }
        },
        info {
            PriorityLogger createLogger(final Logger logger) {
                return new PriorityLogger() {
                    public void log(String msg) {
                        logger.info(msg);
                    }
                };
            }
        },
        warn {
            PriorityLogger createLogger(final Logger logger) {
                return new PriorityLogger() {
                    public void log(String msg) {
                        logger.warn(msg);
                    }
                };
            }
        },
        error {
            PriorityLogger createLogger(final Logger logger) {
                return new PriorityLogger() {
                    public void log(String msg) {
                        logger.error(msg);
                    }
                };
            }
        };

        abstract PriorityLogger createLogger(final Logger logger);
    }

    public static abstract class PriorityLogger {
        public abstract void log(String msg);
    }
}

