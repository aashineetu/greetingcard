package com.exception;

/**
 * Created by ashis on 3/28/2018.
 */
public class GreetingCardException extends Exception {
    public GreetingCardException(){

    }
    public GreetingCardException(String message) {
        super (message);
    }

    public GreetingCardException(Throwable cause) {
        super (cause);
    }

    public GreetingCardException(String message, Throwable cause) {
        super (message, cause);
    }
}
