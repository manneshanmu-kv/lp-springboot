package com.helloworld.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTestController {
	@GetMapping("/hello")
	public String testMessage() {
		return "Hello";
	}
	

}
