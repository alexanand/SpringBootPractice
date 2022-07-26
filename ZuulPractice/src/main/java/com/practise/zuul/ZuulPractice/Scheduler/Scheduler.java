package com.practise.zuul.ZuulPractice.Scheduler;

import org.springframework.scheduling.annotation.Scheduled;

//[Spirint-101][AnandSingh][Make a scheduler][Start]


public class Scheduler {

	
	@Scheduled(fixedRate = 1000)
	public void Index() {
		
	System.out.println("Scheduler is running");
	
	}
}
