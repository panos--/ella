package org.unbunt.sqlscript.statement;

import org.unbunt.sqlscript.support.Variable;
import org.unbunt.sqlscript.support.StringLiteral;
import org.unbunt.sqlscript.support.Env;
import org.unbunt.sqlscript.support.ExpressionVisitor;
import org.unbunt.sqlscript.ScriptProcessor;

import java.util.List;
import java.util.LinkedList;

public class SQLStatement extends AbstractAnnotatableStatement {
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

    public String toSQLString() {
        StringBuilder buf = new StringBuilder();
        for (Object part : parts) {
            if (part instanceof Variable) {
                buf.append(((Variable)part).getValue());
            }
            else if (part instanceof StringLiteral) {
                buf.append(((StringLiteral)part).toLiteralStringEscaped());
            }
            else {
                buf.append(part.toString());
            }
        }
        return buf.toString();
    }

    public void accept(ScriptProcessor processor, Env env) {
        processor.process(env, this);
    }

    public void accept(ExpressionVisitor visitor) {
        visitor.processExpression(this);
    }
}
