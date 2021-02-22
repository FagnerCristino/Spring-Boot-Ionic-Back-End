package com.fagnerdev.cursomc.services.exceptions;

public class DataIntegrityException extends RuntimeException{
    private static final long serialVersionUID = 2354886712480974113L;

    public DataIntegrityException(String msg){
        super(msg);
    }

    public DataIntegrityException(String msg, Throwable cause){
        super(msg, cause);
    }
}
