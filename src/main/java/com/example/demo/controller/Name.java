package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {

	private String name="IamNeo";
	@GetMapping("/")
	public String getName()
	{
		return "Welcome "+name+"!";
	}
}
