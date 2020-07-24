package com.dennislee.routing.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@RequestMapping(path="/dojo")
	public String dojo() {
		return "The dojo is awesome";
	}
	
	@RequestMapping(path="/dojo/burbank")
	public String burbank() {
		return "Burbank Dojo is located in Southern California";
	}
	
	@RequestMapping(path="/dojo/san-jose")
	public String sanjose() {
		return "SJ dojo is the headquarters";
	}
}
