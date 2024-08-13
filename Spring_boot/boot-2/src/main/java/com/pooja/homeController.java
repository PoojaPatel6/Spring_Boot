package com.pooja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {
	
@GetMapping("/")
public  String home() {
	
//	return "my first spring boot rest response";
	return "index";
}

@GetMapping("/about")

public String about() {
	
	return "about response...";
}
}
