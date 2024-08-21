package com.pooja.thymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pooja.thymleaf.model.User;

@Controller
public class UserController {
	
	@GetMapping("var-exp")
	public String varExp(Model model) {
	
		User user = new User("Pooja", "pooja@gmail.com",  "ADMIN", "Female");
		
	
		model.addAttribute("user", user);
		
	
		return "var-exp";
	}
}
