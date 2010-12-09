/* StmtBatch.java
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

package org.unbunt.ella.lang.sql;

import org.unbunt.ella.engine.context.Context;
import org.unbunt.ella.utils.StopWatch;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * TODO: Observer notification on batch execution
 */
public class StmtBatch {
    protected final Context context;
    protected final Statement statement;
    protected final int batchSize;
    protected int currentBatchSize = 0;

    public StmtBatch(Context context, Connection connection, int batchSize) throws SQLException {
        this(context, connection.createStatement(), batchSize);
    }

    public StmtBatch(Context context, Statement statement, int batchSize) {
        this.context = context;
        this.statement = statement;
        this.batchSize = batchSize;
    }

    public void add(String query) throws SQLException {
        context.info("Batch: %s", query);

        statement.addBatch(query);
        if (++currentBatchSize % batchSize == 0) {
            execute();
            currentBatchSize = 0;
        }
    }

    public void finish() throws SQLException {
        if (currentBatchSize == 0) {
            return;
        }

        execute();
    }

    public void close() throws SQLException {
        statement.close();
    }

    protected void execute() throws SQLException {
        if (context.isInfoEnabled()) {
            context.info("Executing batch with %d statements", currentBatchSize);
            StopWatch timer = new StopWatch(3);
            statement.executeBatch();
            double dt = timer.stop();
            double dts = dt / currentBatchSize;
            dts = (double) Math.round(dts * 1000) / 1000;
            context.info("Batch execution of %d statements took %.3f seconds (%.3f seconds per statement)",
                         currentBatchSize, dt, dts);
        }
        else {
            statement.executeBatch();
        }
    }
}
