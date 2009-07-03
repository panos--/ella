package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.ExpressionVisitor;

import java.util.LinkedList;
import java.util.List;

public class SQLLiteralExpression extends AbstractExpression {
    protected List<Object> parts = new LinkedList<Object>();

    public List<Object> getParts() {
        return parts;
    }

    public void setParts(List<Object> parts) {
        this.parts = parts;
    }

    public void addPart(Object part) {
        this.parts.add(part);
    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        for (Object part : parts) {
            buf.append(part);
        }
        return buf.toString();
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}