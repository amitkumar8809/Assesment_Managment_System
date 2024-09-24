package com.capstone.assesment_management_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@GetMapping("/register")
	public String registrationForm() {
		return "Registration_form";
		
	}
	@GetMapping("/login")
	public String loginForm() {
		return "login_form";
		
	}

}
