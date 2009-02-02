package org.unbunt.sqlscript.annotations;

public interface Annotatable {
    public void addAnnotation(Annotation annotation);
    public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass);
    public <A extends Annotation> A getAnnotation(Class<A> annotationClass);
}
