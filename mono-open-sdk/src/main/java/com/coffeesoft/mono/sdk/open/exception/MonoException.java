package com.coffeesoft.mono.sdk.open.exception;

public class MonoException extends Exception {
    private Integer status;

    public MonoException(String message, Integer status) {
        super(message);
        this.status = status;
    }

    public MonoException(String message, Throwable cause) {
        super(message, cause);
    }

    public MonoException(Throwable cause) {
        super(cause);
    }

    public Integer getStatus() {
        return status;
    }
}
