package com.ssafy.pcgg.domain.part.exception;

import javax.naming.NamingException;

public class NoSuchPartTypeException extends IllegalArgumentException {
    public NoSuchPartTypeException() {}

    public NoSuchPartTypeException(String message) {super(message);}

    public NoSuchPartTypeException(String message, Throwable cause) {super(message, cause);}

    public NoSuchPartTypeException(Throwable cause) {super(cause);}
}
