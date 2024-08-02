package com.keith.exceptions;

public class ClienteNaoEncontrado2Exception extends Exception{
    private Exception exception;

    public ClienteNaoEncontrado2Exception(String message, Throwable exception) {
        super(message, exception);
    }
}
