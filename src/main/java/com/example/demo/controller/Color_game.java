package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color_game {
	
	private String yourFavColor="Green";
	@GetMapping("/color")
	public String getMyFav()
	{
		return "My favorite color is "+yourFavColor;
	}
	
}
