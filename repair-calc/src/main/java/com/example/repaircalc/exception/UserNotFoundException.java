//Класс с ошибкой

package com.example.repaircalc.exception;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String message) {
        super(message);
    }
}
