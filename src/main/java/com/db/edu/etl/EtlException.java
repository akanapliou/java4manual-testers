package com.db.edu.etl;

public class EtlException extends RuntimeException {
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
}
