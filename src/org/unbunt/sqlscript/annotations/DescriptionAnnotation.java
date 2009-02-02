package org.unbunt.sqlscript.annotations;

public class DescriptionAnnotation extends AbstractAnnotation {
    public String getTitle() {
        return parameters.getValue("title");
    }

    public String getDescription() {
        return parameters.getValue("description");
    }
}
