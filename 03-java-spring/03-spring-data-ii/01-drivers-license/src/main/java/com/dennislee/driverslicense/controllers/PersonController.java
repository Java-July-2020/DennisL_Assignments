package com.dennislee.driverslicense.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

	@RequestMapping("/persons/new")
	public String newPerson() {
		return "newPerson.jsp";
	}
}
