package com.mypack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/test")
	String test() {
		return "Hello test";
	}

	@GetMapping("/test1")
	String test1() {
		return "Hello test1";
	}

}
