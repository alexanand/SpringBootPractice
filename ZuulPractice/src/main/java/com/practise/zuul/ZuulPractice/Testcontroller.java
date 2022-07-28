package com.practise.zuul.ZuulPractice;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class Testcontroller {
	
//	@RequestMapping("/")
//	public String index() {
//		
//		return "index";
//	}
	
	

	@RequestMapping("/Api")
	public String home() {
		
		return "Registration";
	}
	
	@RequestMapping("/regform")
	public String register(Model m, String data, HttpServletRequest req) {
		
		m.addAttribute("email", req.getParameter("email"));
		
		return "home";
	}
	
//	@RequestMapping("/error")
//	public String error() {
//		
//		return "error";
//	}

}
