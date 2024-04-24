package com.mypack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/test")
	String test() {
		System.out.println("test triggered");
		return "Hello test";
	}

	@GetMapping("/test1")
	String test1() {
		System.out.println("test1 triggered");
		return "Hello test1";
	}

}
