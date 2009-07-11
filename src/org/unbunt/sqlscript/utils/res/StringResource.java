package org.unbunt.sqlscript.utils.res;

import java.io.ByteArrayInputStream;

public class StringResource extends StreamResource {
    public StringResource(String input) {
        super(new ByteArrayInputStream(input.getBytes()));
    }
}
