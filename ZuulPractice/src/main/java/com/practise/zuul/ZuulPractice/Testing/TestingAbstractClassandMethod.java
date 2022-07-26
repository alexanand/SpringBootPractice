package com.practise.zuul.ZuulPractice.Testing;

import org.springframework.beans.factory.annotation.Autowired;

import com.practise.zuul.ZuulPractice.AbstractPractice.AbstractImpl;
import com.practise.zuul.ZuulPractice.AbstractPractice.AbstractPractice;


public class TestingAbstractClassandMethod {

//	@Autowired
//	AbstractImpl obj1;
//	
//	@Autowired
//	AbstractPractice obj;
	
	public static void main(String[] args) {

	//	AbstractPractice obj= new AbstractPractice(); This is not Possible because class is defined as abstract
	AbstractImpl obj1=new AbstractImpl();
	 obj1.method1();
	 obj1.method2();
		
	}

}
