package com.employeemanager.manager.error;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String message){
        super(message);
    }
}
