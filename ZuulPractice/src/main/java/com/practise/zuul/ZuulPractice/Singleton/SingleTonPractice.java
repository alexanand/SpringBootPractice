package com.practise.zuul.ZuulPractice.Singleton;

//Make an Object Immutable
public class SingleTonPractice {
	
	static SingleTonPractice obj;
	
	private SingleTonPractice() {
	   System.out.println("Singleton Ka ek Object Create Hua Hai Bhai");
		
	}
	
	public static SingleTonPractice get() {
		
		
		if(obj==null) {
			obj=new SingleTonPractice();
		}
		return obj;
	}

}
