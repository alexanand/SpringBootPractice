package com.practise.zuul.ZuulPractice.Testing;

import com.practise.zuul.ZuulPractice.Exception.CustomException;

public class TestCustomException {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub

		int a=-1;
		int b=5;
	
		if(a<0)
		{
			throw new CustomException("Bhai TestCustomException Class me code Fatt Gaya Hai");
		}
		
		
	}
	
	

}
