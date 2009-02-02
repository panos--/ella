package org.unbunt.sqlscript.annotations;

import org.unbunt.sqlscript.support.Parameters;
import org.unbunt.sqlscript.exception.AnnotationInitializationException;

public interface Annotation {
    public void initialize(Parameters parameters) throws AnnotationInitializationException;
}
