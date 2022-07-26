package com.practise.zuul.ZuulPractice.Exception;

public class CustomException extends Exception{
	
	private String message;
	
	public CustomException(String str) {

	  this.message=str;
	}
	
	public String toString() {
		
		return "Exception Kaha Hua Bhai =>"+message;
	}

}
