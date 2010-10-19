package org.unbunt.ella.utils;

import java.io.OutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Simple JDBC ResultSet printer. Prints a tabular representation of ResultSets on a given output stream.
 *
 * User: tweiss
 * Date: 05.10.2010
 * Time: 13:32:09
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
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
