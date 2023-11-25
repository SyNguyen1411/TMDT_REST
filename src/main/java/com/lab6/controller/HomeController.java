package com.lab6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	@GetMapping("/login")
	public String name() {
		return "html/login";
	}
	
	@GetMapping("/home")
	public String home() {
		return "html/home";
	}
	
//	@GetMapping("/logout")
//	public String logout() {
//		return "html/login";
//	}
}
