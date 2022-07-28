package com.practise.zuul.ZuulPractice.Testing;

import com.practise.zuul.ZuulPractice.MultiThreading.MultiusingExtend;
import com.practise.zuul.ZuulPractice.MultiThreading.Multiusingrunnable;

public class ThreadTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		for(int i=0;i<10;i++) {
			
			MultiusingExtend th=new MultiusingExtend();
			Thread th1=new Thread(new Multiusingrunnable());
			th.run();
			Thread.sleep(1000);
			th1.run();
			Thread.sleep(1000);
			
		}
		
		
		
		
	}

}
