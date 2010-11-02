package org.unbunt.ella.utils;

import java.io.PrintStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.Reader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.sql.Types;
import java.math.BigDecimal;

/**
 * User: tweiss
 * Date: Oct 19, 2010
 * Time: 6:01:43 PM
 * <p/>
 * Copyright: (c) 2007 marketoolz GmbH
 */
public class ScrollableResultSetPrinter {
    protected final PrintStream out;

    public ScrollableResultSetPrinter(OutputStream out) {
        this.out = out instanceof PrintStream ? (PrintStream) out : new PrintStream(out);
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
            throw new UnsupportedOperationException("Cannot display FORWARD_ONLY result set");
        }

        rs.beforeFirst();
        ResultSetMetaData meta = rs.getMetaData();
        int cols = meta.getColumnCount();
        int[] colWidths = new int[cols + 1];
        for (int i = 1; i <= cols; i++) {
            String label = meta.getColumnLabel(i);
            colWidths[i] = label.length();
        }
        while (rs.next()) {
            WIDTH_CALC:
            for (int i = 1; i <= cols; i++) {
                int lastWidth = colWidths[i];
                int currWidth;
                int colType = meta.getColumnType(i);

                Object o;
                try {
                    o = rs.getObject(i);
                } catch (SQLException e) {
                    // Gracefully handle incompatibility between JDBC and MySQL
                    // MySQL supports zero dates, JDBC chokes on them
                    switch (colType) {
                        case Types.DATE:
                        case Types.TIME:
                        case Types.TIMESTAMP: {
                            long val = rs.getLong(i);
                            if (val == 0) {
                                // yes, above mentioned incompatibility caused the exception
                                // we show "0" in this case
                                currWidth = 1;
                                colWidths[i] = Math.max(lastWidth, currWidth);
                                continue WIDTH_CALC;
                            }
                            // fall through, rethrowing the original exception in case the bug was not its cause
                        }
                        default:
                            throw e;
                    }
                }
                if (o == null) {
                    currWidth = 6;
                    colWidths[i] = Math.max(lastWidth, currWidth);
                    continue;
                }

                switch (colType) {
                    case Types.BIT:         // boolean
                    case Types.BOOLEAN: {   // boolean
                        boolean val = rs.getBoolean(i);
                        currWidth = val ? 6 : 7;
                        break;
                    }
                    case Types.TINYINT:     // long
                    case Types.SMALLINT:    // long
                    case Types.INTEGER:     // long
                    case Types.BIGINT: {    // long
                        long val = rs.getLong(i);
                        currWidth = String.format("%d", val).length();
                        break;
                    }
                    case Types.FLOAT:       // double
                    case Types.REAL:        // double
                    case Types.DOUBLE: {    // double
                        double val = rs.getDouble(i);
                        currWidth = String.format("%g", val).length();
                        break;
                    }
                    case Types.NUMERIC:     // BigDecimal
                    case Types.DECIMAL: {   // BigDecimal
                        BigDecimal val = rs.getBigDecimal(i);
                        int scale = val.scale();
                        if (scale <= 0) {
                            currWidth = String.format("%d", val.toBigIntegerExact()).length();
                        }
                        else {
                            currWidth = String.format("%g", val).length();
                        }
                        break;
                    }
                    case Types.CHAR:        // String
                    case Types.VARCHAR: {   // String
                        String val = rs.getString(i);
                        currWidth = val.length();
                        break;
                    }
                    case Types.DATE:      // Date
                        currWidth = rs.getDate(i).toString().length();
                        break;
                    case Types.TIME:        // Time
                        currWidth = rs.getTime(i).toString().length();
                        break;
                    case Types.TIMESTAMP:   // Timestamp
                        currWidth = rs.getTimestamp(i).toString().length();
                        break;
                    case Types.BINARY:      // Bytes
                        currWidth = "<BINARY>".length();
                        break;
                    case Types.VARBINARY:   // Bytes
                        currWidth = "<VARBINARY>".length();
                        break;
                    case Types.LONGVARBINARY: // BinaryStream
                        currWidth = "<LONGVARBINARY>".length();
                        break;
                    case Types.NULL:        // null
                        currWidth = 6;
                        break;
                    case Types.OTHER:       // ?
                        // PostgreSQL JDBC driver returns type OTHER for raw string literals.
                        // In this cases the returned object is of type String, so we try and
                        // check this, overriding the OTHER type in this case.
                        Object other = rs.getObject(i);
                        if (other != null && other instanceof String) {
                            currWidth = ((String)other).length();
                        }
                        else {
                            currWidth = "<UNKNOWN>".length();
                        }
                        break;
                    case Types.JAVA_OBJECT: // Object
                        currWidth = rs.getObject(i).toString().length();
                        break;
                    case Types.DISTINCT:    // ?
                        currWidth = "<DISTINCT>".length();
                        break;
                    case Types.STRUCT:      // Object
                        currWidth = rs.getObject(i).toString().length();
                        break;
                    case Types.ARRAY:       // Array
                        currWidth = "<ARRAY>".length();
                        break;
                    case Types.BLOB:        // Blob
                        currWidth = "<BLOB>".length();
                        break;
                    case Types.CLOB:        // Clob
                        currWidth = "<CLOB>".length();
                        break;
                    case Types.REF:         // Ref
                        currWidth = "<REF>".length();
                        break;
                    case Types.LONGVARCHAR: { // CharacterStream
                        // at least mysql returns value this type in the "type" column of the "desc" statement
                        // JDBC suggests to use getCharacterStream() on the result set for this type of data
                        // so we just do it
                        char[] buf = new char[256];
                        Reader reader = rs.getCharacterStream(i);
                        currWidth = reader.read(buf, 0, buf.length);
                        reader.close();
                        break;
                    }
                    case Types.DATALINK:    // ?
                        currWidth = "<DATALINK>".length();
                        break;
                    case Types.ROWID:       // ?
                        currWidth = "<ROWID>".length();
                        break;
                    case Types.NCHAR:       // ?
                    case Types.NVARCHAR:    // ?
                        currWidth = rs.getNString(i).length();
                        break;
                    case Types.LONGNVARCHAR: // ?
                        currWidth = "<LONGNVARCHAR>".length();
                        break;
                    case Types.NCLOB:       // ?
                        currWidth = "<NCLOB>".length();
                        break;
                    case Types.SQLXML:      // ?
                        currWidth = "<SQLXML>".length();
                        break;
                    default:
                        currWidth = ("" + rs.getObject(i)).length();
                }
                colWidths[i] = Math.max(lastWidth, currWidth);
            }
        }
        for (int i = 0; i < colWidths.length; i++) {
            int colWidth = colWidths[i];
            if (colWidth == 0) {
                colWidths[i] = 1;
            }
        }

        rs.beforeFirst();

        out.print("|");
        for (int i = 1; i <= cols; i++) {
            int colWidth = colWidths[i];
            out.printf(" %-" + colWidth + "s |", meta.getColumnLabel(i));
        }
        out.println();
        int nrows = 0;
        while (rs.next()) {
            nrows++;
            out.print("|");
            PRINT_LOOP:
            for (int i = 1; i <= cols; i++) {
                int colWidth = colWidths[i];
                int colType = meta.getColumnType(i);

                String stringVal = null;

                Object o;
                try {
                    o = rs.getObject(i);
                } catch (SQLException e) {
                    // handle the mysql incompatibility mentioned above
                    switch (colType) {
                        case Types.DATE:
                        case Types.TIME:
                        case Types.TIMESTAMP:
                            if (rs.getLong(i) == 0) {
                                out.printf(" %" + colWidth + "d |", 0);
                                continue PRINT_LOOP;
                            }
                        default:
                            throw e;
                    }
                }
                if (o == null) {
                    stringVal = "<NULL>";
                    out.printf(" %-" + colWidth + "s |", stringVal);
                    continue;
                }

                switch (colType) {
                    case Types.BIT:         // boolean
                    case Types.BOOLEAN: {   // boolean
                        boolean val = rs.getBoolean(i);
                        stringVal = val ? "<TRUE>" : "<FALSE>";
                        break;
                    }
                    case Types.TINYINT:     // long
                    case Types.SMALLINT:    // long
                    case Types.INTEGER:     // long
                    case Types.BIGINT: {    // long
                        long val = rs.getLong(i);
                        out.printf(" %" + colWidth + "d |", val);
                        break;
                    }
                    case Types.FLOAT:       // double
                    case Types.REAL:        // double
                    case Types.DOUBLE: {    // double
                        double val = rs.getDouble(i);
                        out.printf(" %" + colWidth + "g |", val);
                        break;
                    }
                    case Types.NUMERIC:     // BigDecimal
                    case Types.DECIMAL: {   // BigDecimal
                        BigDecimal val = rs.getBigDecimal(i);
                        int scale = val.scale();
                        if (scale <= 0) {
                            out.printf(" %" + colWidth + "d |", val.toBigIntegerExact());
                        }
                        else {
                            out.printf(" %" + colWidth + "g |", val);
                        }
                        break;
                    }
                    case Types.CHAR:        // String
                    case Types.VARCHAR: {   // String
                        stringVal = rs.getString(i);
                        break;
                    }
                    case Types.DATE:      // Date
                        stringVal = rs.getDate(i).toString();
                        break;
                    case Types.TIME:        // Time
                        stringVal = rs.getTime(i).toString();
                        break;
                    case Types.TIMESTAMP:   // Timestamp
                        stringVal = rs.getTimestamp(i).toString();
                        break;
                    case Types.BINARY:      // Bytes
                        stringVal = "<BINARY>";
                        break;
                    case Types.VARBINARY:   // Bytes
                        stringVal = "<VARBINARY>";
                        break;
                    case Types.LONGVARBINARY: // BinaryStream
                        stringVal = "<LONGVARBINARY>";
                        break;
                    case Types.NULL:        // null
                        stringVal = "<NULL>";
                        break;
                    case Types.OTHER:       // ?
                        // Work around PostgreSQL-specific behaviour (see above).
                        Object other = rs.getObject(i);
                        if (other != null && other instanceof String) {
                            stringVal = (String) other;
                        }
                        else {
                            stringVal = "<UNKNOWN>";
                        }
                        break;
                    case Types.JAVA_OBJECT: // Object
                        stringVal = rs.getObject(i).toString();
                        break;
                    case Types.DISTINCT:    // ?
                        stringVal = "<DISTINCT>";
                        break;
                    case Types.STRUCT:      // Object
                        stringVal = rs.getObject(i).toString();
                        break;
                    case Types.ARRAY:       // Array
                        stringVal = "<ARRAY>";
                        break;
                    case Types.BLOB:        // Blob
                        stringVal = "<BLOB>";
                        break;
                    case Types.CLOB:        // Clob
                        stringVal = "<CLOB>";
                        break;
                    case Types.REF:         // Ref
                        stringVal = "<REF>";
                        break;
                    case Types.LONGVARCHAR: {// CharacterStream
                        char[] buf = new char[256];
                        Reader reader = rs.getCharacterStream(i);
                        int read = reader.read(buf, 0, buf.length);
                        stringVal = read == -1 ? "" : String.copyValueOf(buf, 0, read);
                        reader.close();
                        break;
                    }
                    case Types.DATALINK:    // ?
                        stringVal = "<DATALINK>";
                        break;
                    case Types.ROWID:       // ?
                        stringVal = "<ROWID>";
                        break;
                    case Types.NCHAR:       // ?
                    case Types.NVARCHAR:    // ?
                        stringVal = rs.getNString(i);
                        break;
                    case Types.LONGNVARCHAR: // ?
                        stringVal = "<LONGNVARCHAR>";
                        break;
                    case Types.NCLOB:       // ?
                        stringVal = "<NCLOB>";
                        break;
                    case Types.SQLXML:      // ?
                        stringVal = "<SQLXML>";
                        break;
                    default:
                        stringVal = ("" + rs.getObject(i));
                }

                if (stringVal != null) {
                    out.printf(" %-" + colWidth + "s |", stringVal);
                }
            }
            out.println();
        }

        out.println(nrows + " rows.");

        return nrows;
    }
}
