/* ResultSetPrinter.java
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

import java.io.OutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Simple JDBC ResultSet printer. Prints a tabular representation of ResultSets on a given output stream.
 */
public class ResultSetPrinter {
    protected final ForwardOnlyResultSetPrinter forwardOnlyResultSetPrinter;
    protected final ScrollableResultSetPrinter scrollableResultSetPrinter;

    public ResultSetPrinter(OutputStream out) {
        forwardOnlyResultSetPrinter = new ForwardOnlyResultSetPrinter(out);
        scrollableResultSetPrinter = new ScrollableResultSetPrinter(out);
    }

    /**
     * Prints the given ResultSet on the output stream associated with this object.
     *
     * @param rs the ResultSet to print
     * @return the number of rows in the ResultSet
     * @throws java.sql.SQLException if a database access error occurs
     * @throws java.io.IOException if an I/O error occurs
     */
    public int print(ResultSet rs) throws SQLException, IOException {
        if (rs.getType() == ResultSet.TYPE_FORWARD_ONLY) {
            return forwardOnlyResultSetPrinter.print(rs);
        }
        else {
            return scrollableResultSetPrinter.print(rs);
        }
    }
}
