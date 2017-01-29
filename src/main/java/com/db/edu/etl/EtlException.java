package com.db.edu.etl;

public class EtlException extends Exception {
    private int usersCount;

    public EtlException() {
        super();
    }

    public EtlException(String message) {
        super(message);
    }

    public EtlException(String message, Throwable cause) {
        super(message, cause);
    }

    public EtlException(Throwable cause) {
        super(cause);
    }

    protected EtlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public EtlException(String message, Exception cause, int usersCount) {
        super(message, cause);
        this.usersCount = usersCount;
    }

    public int getUsersCount() {
        return usersCount;
    }
}
