package com.dock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	@GetMapping("/message")
	public String getMesssge() {
		return "Hello_World";
	}

}
