package com.example.Annotation.Annotation;

import org.springframework.http.HttpStatus;

	public class AppError {
	    private String errorCode;
	    private String message;
	    private HttpStatus httpStatus;
		public String getErrorCode() {
			return errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public HttpStatus getHttpStatus() {
			return httpStatus;
		}
		public void setHttpStatus(HttpStatus httpStatus) {
			this.httpStatus = httpStatus;
		}
		public AppError() {
			super();
			// TODO Auto-generated constructor stub
		}
		public AppError(String errorCode, String message, HttpStatus httpStatus) {
			super();
			this.errorCode = errorCode;
			this.message = message;
			this.httpStatus = httpStatus;
		}
		@Override
		public String toString() {
			return "AppError [errorCode=" + errorCode + ", message=" + message + ", httpStatus=" + httpStatus + "]";
		}
	    
	    
	    
	}


