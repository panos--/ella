package org.unbunt.sqlscript.annotations;

import org.unbunt.sqlscript.support.Parameters;
import org.unbunt.sqlscript.exception.AnnotationInitializationException;

public class AbstractAnnotation implements Annotation {
    protected Parameters parameters;

    public AbstractAnnotation() {
    }

    public void initialize(Parameters parameters) throws AnnotationInitializationException {
        this.parameters = parameters;
    }
}
