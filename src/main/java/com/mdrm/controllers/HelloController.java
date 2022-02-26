package com.mdrm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/v1/hello")
	public String helloWorldController() {
		
		return "Hello world";
	}
}
