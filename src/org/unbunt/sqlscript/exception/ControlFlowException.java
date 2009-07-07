package org.unbunt.sqlscript.exception;

/**
 * There are a few cases in the script engine where exceptions are used for modeling control flow.
 * We try hard to minimize their usage but there are situations where they are required because of
 * the lack of working alternatives (i.e. no stack manipulation, longjmp, etc.).
 */
public class ControlFlowException extends RuntimeException {
}
