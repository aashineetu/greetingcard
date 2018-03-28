package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class ControllerExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<List<Object>> handleException(HttpServletRequest req, Exception e)
    {
        return new ResponseEntity<>(Arrays.asList(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(GreetingCardException.class)
    public ResponseEntity<List<Object>> handleCustomerOrderException(HttpServletRequest req, GreetingCardException e)
    {
        return new ResponseEntity<>(Arrays.asList(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
