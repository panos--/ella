package org.unbunt.ella;

import org.unbunt.ella.engine.context.SQLResultListener;
import org.unbunt.ella.utils.ResultSetPrinter;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Default implementation of the <code>SQLResultListener</code> interface.
 * Writes formatted SQL results to an arbitrary <code>OutputStream</code>.
 */
public class SimpleSQLResultListener implements SQLResultListener {
    protected final PrintStream out;
    protected final ResultSetPrinter resultSetPrinter;

    /**
     * Creates a new SimpleSQLResultListener writing SQL results to the standard system output stream.
     */
    public SimpleSQLResultListener() {
        this(System.out);
    }

    /**
     * Creates a new SimpleSQLResultListener writing SQL results to the given output stream.
     *
     * @param out the output stream to write SQL results to.
     */
    public SimpleSQLResultListener(OutputStream out) {
        this.out = out instanceof PrintStream ? (PrintStream) out : new PrintStream(out);
        this.resultSetPrinter = new ResultSetPrinter(this.out);
    }

    public void resultSet(ResultSet resultSet) {
        try {
            resultSetInternal(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * TODO: Break up into multiple methods. Especially factor out result type handling.
     *
     * @param rs
     * @throws SQLException
     * @throws IOException
     */
    protected void resultSetInternal(ResultSet rs) throws SQLException, IOException {
        resultSetPrinter.print(rs);
    }

    public void updateCount(int updateCount) {
        out.println(updateCount + " rows affected.");
    }
}
