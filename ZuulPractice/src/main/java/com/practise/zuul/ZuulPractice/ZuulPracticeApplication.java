package com.practise.zuul.ZuulPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

//import de.codecentric.boot.admin.server.config.EnableAdminServer;


/*@EnableZuulProxy  
@EnableDiscoveryClient  */

@SpringBootApplication
@EnableScheduling
//@EnableAdminServer
public class ZuulPracticeApplication {


	public static void main(String[] args) {
		SpringApplication.run(ZuulPracticeApplication.class, args);
		
		System.out.println("Hello World");
		
	}

}
