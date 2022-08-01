package com.practise.zuul.ZuulPractice;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

//import de.codecentric.boot.admin.server.config.EnableAdminServer;


/*@EnableZuulProxy  
@EnableDiscoveryClient  */

@SpringBootApplication
@EnableScheduling
@EnableAdminServer
@ComponentScan("com.practise.zuul.ZuulPractice.*")
public class ZuulPracticeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		//SpringApplication.run(ZuulPracticeApplication.class, args);
		SpringApplication app=new SpringApplication(ZuulPracticeApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8085"));//Second way to configure port or property
		app.run(args);
		
		System.out.println("Hello World");
		
	}
	
   @Override
	public void run(String... args)throws Exception{
		
		
		System.out.println("Hello You are in Run Method");
	}

}
