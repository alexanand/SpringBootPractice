package com.practise.zuul.ZuulPractice.MultiThreading;

public class MultiusingExtend extends Thread{
	
	public void run() {
		
		System.out.println("In Extend Thread "+Thread.currentThread().getId());
	}

}
