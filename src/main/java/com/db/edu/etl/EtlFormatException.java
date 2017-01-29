package com.db.edu.etl;

/**
 * Created by Андрей on 27.01.2017.
 */
public class EtlFormatException extends Exception {
    public EtlFormatException() {
        super();
    }

    public EtlFormatException(String message) {
        super(message);
    }

    public EtlFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public EtlFormatException(Throwable cause) {
        super(cause);
    }

    protected EtlFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
