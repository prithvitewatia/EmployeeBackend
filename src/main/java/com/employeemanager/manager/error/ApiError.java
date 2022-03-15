package com.employeemanager.manager.error;

public class ApiError extends Exception{
    public ApiError(){
        super();
    }
    public ApiError(String message){
        super(message);
    }
    public ApiError(String message, Throwable cause){
        super(message, cause);
    }
}
