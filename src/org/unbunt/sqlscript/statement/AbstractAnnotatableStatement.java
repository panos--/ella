package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.annotations.Annotatable;
import org.unbunt.sqlscript.annotations.Annotation;

import java.util.Map;
import java.util.HashMap;

public abstract class AbstractAnnotatableStatement extends AbstractStatement implements Annotatable {
    protected Map<Class<? extends Annotation>, Annotation> annotations =
            new HashMap<Class<? extends Annotation>, Annotation>();

    public void addAnnotation(Annotation annotation) {
        annotations.put(annotation.getClass(), annotation);
    }

    @SuppressWarnings({"unchecked"})
    public <A extends Annotation> A getAnnotation(Class<A> annotationClass) {
        return (A) annotations.get(annotationClass);
    }

    public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {
        return annotations.containsKey(annotationClass);
    }
}
