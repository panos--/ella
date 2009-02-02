package org.unbunt.sqlscript.annotations;

import org.unbunt.sqlscript.support.Parameters;
import org.unbunt.sqlscript.exception.AnnotationInitializationException;

public class PrepareAnnotation extends AbstractAnnotation {
    protected String alias;

    @Override
    public void initialize(Parameters parameters) throws AnnotationInitializationException {
        super.initialize(parameters);
        alias = parameters.getValue("alias");
        if (alias == null) {
            throw new AnnotationInitializationException("Missing required parameter: alias");
        }
    }

    public String getAlias() {
        return alias;
    }
}
