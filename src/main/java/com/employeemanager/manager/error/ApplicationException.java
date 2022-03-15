package com.employeemanager.manager.error;

public class ApplicationException extends Exception{
    public ApplicationException(){
        super();
    }
    public ApplicationException(String message){
        super(message);
    }
    public ApplicationException(String message,Throwable cause){
        super(message, cause);
    }
}
