package org.unbunt.utils;

public class InvalidFileNameException extends GenericException {
    private String fileName;

    public InvalidFileNameException(String fileName) {
        super();
        this.fileName = fileName;
    }

    public InvalidFileNameException(String fileName, String message) {
        super(message);
        this.fileName = fileName;
    }

    public InvalidFileNameException(String fileName, String message, Throwable cause) {
        super(message, cause);
        this.fileName = fileName;
    }

    public InvalidFileNameException(String fileName, Throwable cause) {
        super(cause);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public String getMessage() {
        StringBuilder msg = new StringBuilder("Invalid file name: ");
        String fn = getFileName();
        if (fn != null && fn.length() > 0) {
            msg.append(fn);
            msg.append(": ");
        }
        msg.append(super.getMessage());
        return msg.toString();
    }
}
