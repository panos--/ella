/* ForwardOnlyResultSetPrinter.java
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

import java.io.PrintStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.Reader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.sql.Types;
import java.math.BigDecimal;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class ForwardOnlyResultSetPrinter {
    protected final PrintStream out;

    public ForwardOnlyResultSetPrinter(OutputStream out) {
        this.out = new PrintStream(out);
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
        List<String[]> result = new LinkedList<String[]>();
        String[] row;

        ResultSetMetaData meta = rs.getMetaData();
        int cols = meta.getColumnCount();
        int[] colWidths = new int[cols + 1];
        row = new String[cols + 1];
        for (int i = 1; i <= cols; i++) {
            String label = meta.getColumnLabel(i);
            row[i] = label;
            colWidths[i] = label.length();
        }
        result.add(row);

        Boolean leftAligned[] = new Boolean[cols + 1];
        Arrays.fill(leftAligned, null);

        int nrows = 0;
        while (rs.next()) {
            nrows++;
            row = new String[cols + 1];
            PRINT_LOOP:
            for (int i = 1; i <= cols; i++) {
                int colType = meta.getColumnType(i);

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
                                row[i] = "0";
                                updateColWidth(colWidths, row, i);
                                leftAligned[i] = false;
                                continue PRINT_LOOP;
                            }
                        default:
                            throw e;
                    }
                }
                if (o == null) {
                    row[i] = "<NULL>";
                    updateColWidth(colWidths, row, i);
                    continue;
                }

                switch (colType) {
                    case Types.BIT:         // boolean
                    case Types.BOOLEAN: {   // boolean
                        boolean val = rs.getBoolean(i);
                        row[i] = val ? "<TRUE>" : "<FALSE>";
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    }
                    case Types.TINYINT:     // long
                    case Types.SMALLINT:    // long
                    case Types.INTEGER:     // long
                    case Types.BIGINT: {    // long
                        row[i] = String.valueOf(rs.getLong(i));
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = false;
                        break;
                    }
                    case Types.FLOAT:       // double
                    case Types.REAL:        // double
                    case Types.DOUBLE: {    // double
                        double val = rs.getDouble(i);
                        row[i] = String.format("%g", val);
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = false;
                        break;
                    }
                    case Types.NUMERIC:     // BigDecimal
                    case Types.DECIMAL: {   // BigDecimal
                        BigDecimal val = rs.getBigDecimal(i);
                        int scale = val.scale();
                        if (scale <= 0) {
                            row[i] = String.format("%d", val.toBigIntegerExact());
                        }
                        else {
                            row[i] = String.format("%g", val);
                        }
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = false;
                        break;
                    }
                    case Types.CHAR:        // String
                    case Types.VARCHAR: {   // String
                        row[i] = rs.getString(i);
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    }
                    case Types.DATE:      // Date
                        row[i] = rs.getDate(i).toString();
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = false;
                        break;
                    case Types.TIME:        // Time
                        row[i] = rs.getTime(i).toString();
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = false;
                        break;
                    case Types.TIMESTAMP:   // Timestamp
                        row[i] = rs.getTimestamp(i).toString();
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = false;
                        break;
                    case Types.BINARY:      // Bytes
                        row[i] = "<BINARY>";
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.VARBINARY:   // Bytes
                        row[i] = "<VARBINARY>";
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.LONGVARBINARY: // BinaryStream
                        row[i] = "<LONGVARBINARY>";
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.NULL:        // null
                        row[i] = "<NULL>";
                        updateColWidth(colWidths, row, i);
                        break;
                    case Types.OTHER:       // ?
                        // Work around PostgreSQL-specific behaviour (see above).
                        Object other = rs.getObject(i);
                        if (other != null && other instanceof String) {
                            row[i] = (String) other;
                        }
                        else {
                            row[i] = "<UNKNOWN>";
                        }
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.JAVA_OBJECT: // Object
                        row[i] = rs.getObject(i).toString();
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.DISTINCT:    // ?
                        row[i] = "<DISTINCT>";
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.STRUCT:      // Object
                        row[i] = rs.getObject(i).toString();
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.ARRAY:       // Array
                        row[i] = "<ARRAY>";
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.BLOB:        // Blob
                        row[i] = "<BLOB>";
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.CLOB:        // Clob
                        row[i] = "<CLOB>";
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.REF:         // Ref
                        row[i] = "<REF>";
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.LONGVARCHAR: {// CharacterStream
                        char[] buf = new char[256];
                        Reader reader = rs.getCharacterStream(i);
                        int read = reader.read(buf, 0, buf.length);
                        row[i] = read == -1 ? "" : String.copyValueOf(buf, 0, read);
                        reader.close();
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    }
                    case Types.DATALINK:    // ?
                        row[i] = "<DATALINK>";
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.ROWID:       // ?
                        row[i] = "<ROWID>";
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.NCHAR:       // ?
                    case Types.NVARCHAR:    // ?
                        row[i] = rs.getNString(i);
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.LONGNVARCHAR: // ?
                        row[i] = "<LONGNVARCHAR>";
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.NCLOB:       // ?
                        row[i] = "<NCLOB>";
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    case Types.SQLXML:      // ?
                        row[i] = "<SQLXML>";
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                        break;
                    default:
                        row[i] = String.valueOf(rs.getObject(i));
                        updateColWidth(colWidths, row, i);
                        leftAligned[i] = true;
                }
            }

            result.add(row);
        }

        for (String[] values : result) {
            out.print("|");
            for (int i = 1; i <= cols; i++) {
                int colWidth = colWidths[i];
                String value = values[i];
                Boolean leftAlign = leftAligned[i];
                String align = leftAlign == null || leftAlign ? "-" : "";
                out.printf(" %" + align + colWidth + "s |", value);
            }
            out.println();
        }

        out.println(nrows + " rows.");

        return nrows;
    }

    protected void updateColWidth(int[] colWidths, String[] row, int index) {
        colWidths[index] = Math.max(colWidths[index], row[index].length());
    }
}
