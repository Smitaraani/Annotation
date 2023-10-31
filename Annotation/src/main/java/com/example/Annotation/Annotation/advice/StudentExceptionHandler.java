package com.example.Annotation.Annotation.advice;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.Annotation.Annotation.AppError;
import com.example.Annotation.Annotation.exception.StudentNotFoundException;

@RestControllerAdvice
	public class StudentExceptionHandler {

	    @ExceptionHandler(StudentNotFoundException.class)
	    public ResponseEntity<AppError> handleException(StudentNotFoundException exception) {
	        AppError error=new AppError(UUID.randomUUID().toString(),
	                exception.getMessage(),
	                HttpStatus.INTERNAL_SERVER_ERROR);
	        return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	    }
}
