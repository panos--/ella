import java.io.ByteArrayOutputStream;
import org.unbunt.ella.utils.ResultSetPrinter;
var rsOut := new ByteArrayOutputStream();
var rsPrinter := new ResultSetPrinter(rsOut);

var stmt := sql select * from tmp_test;
for each (row : stmt) {
    -- do nothing
}

.stmt.exec().withResult { rs =>
    rsPrinter.print(rs);
};

.print(rsOut.toString('UTF-8'));
