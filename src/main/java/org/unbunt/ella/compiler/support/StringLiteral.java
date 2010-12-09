/* StringLiteral.java
   Copyright (C) 2009, 2010 Thomas Weiß <panos@unbunt.org>

This file is part of the Ella scripting language interpreter.

Ella is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

Ella is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with Ella; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package org.unbunt.ella.compiler.support;

import java.util.List;
import java.util.ArrayList;

/**
 * Represents the compiled form of string literal of the EllaScript language.
 */
public class StringLiteral {
    protected String startDelim;
    protected String endDelim;
    protected List<StringLiteralComponent> parts;

    public StringLiteral() {
        this(null, null);
    }

    public StringLiteral(String startDelim, String endDelim) {
        this(startDelim, endDelim, new ArrayList<StringLiteralComponent>());
    }

    public StringLiteral(String startDelim, String endDelim, List<StringLiteralComponent> parts) {
        this.startDelim = startDelim;
        this.endDelim = endDelim;
        this.parts = parts;
    }

    public void add(StringLiteralComponent component) {
        parts.add(component);
    }

    public void add(String str) {
        parts.add(new StringText(str));
    }

    public void add(Variable var) {
        parts.add(new StringEmbeddedVariable(var));
    }

    public List<StringLiteralComponent> getParts() {
        return parts;
    }

    public String getDelim() {
        return startDelim;
    }

    public String getStartDelim() {
        return startDelim;
    }

    public void setStartDelim(String startDelim) {
        this.startDelim = startDelim;
    }

    public String getEndDelim() {
        return endDelim;
    }

    public void setEndDelim(String endDelim) {
        this.endDelim = endDelim;
    }

    public String toSource() {
        StringBuilder buf = new StringBuilder();
        buf.append(startDelim);
        for (StringLiteralComponent part : parts) {
            buf.append(part.toSource());
        }
        buf.append(endDelim);
        return buf.toString();
    }

    public String toSource(StringVariableInterpolator interpolator) {
        StringBuilder buf = new StringBuilder();
        buf.append(startDelim);
        for (StringLiteralComponent part : parts) {
            buf.append(part.toSource(interpolator));
        }
        buf.append(endDelim);
        return buf.toString();
    }

    public String toString(StringVariableInterpolator interpolator) {
        StringBuilder buf = new StringBuilder();
        for (StringLiteralComponent part : parts) {
            buf.append(part.toString(interpolator));
        }
        return buf.toString();
    }
}
