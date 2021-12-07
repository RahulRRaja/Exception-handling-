package com.Sample.Global.execption.handling.demo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class Exception {

    @ExceptionHandler
    public ResponseEntity<Object> handleException(IllegalArgumentException e) {

        return new ResponseEntity<Object>("illegal arg exception in global", HttpStatus.BAD_REQUEST);
    }
}