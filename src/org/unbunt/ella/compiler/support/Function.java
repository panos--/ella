package org.unbunt.ella.compiler.support;

/**
 * Represents the compiled form of functions of the EllaScript language.
 */
public class Function extends AbstractCallable implements Callable {
    protected String name = null;

    public Function() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name == null ? "FUN<anon>" : "FUN[" + name + "]";
    }
}
