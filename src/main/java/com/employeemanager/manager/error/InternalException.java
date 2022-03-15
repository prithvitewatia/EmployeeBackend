package com.employeemanager.manager.error;

public class InternalException extends Exception{
    public InternalException() {
        super();
    }
    public InternalException(String message){
        super(message);
    }
    public InternalException(String message,Throwable cause){
        super(message,cause);
    }
}
