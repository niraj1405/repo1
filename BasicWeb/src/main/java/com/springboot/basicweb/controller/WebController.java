package com.springboot.basicweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webapp")
public class WebController {
	
	
    @GetMapping("/greet")
	public String greetings()
	{
		return "Hello Docker";
	}
}
