package com.dennislee.lookify.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LookifyController {

	@RequestMapping()
	public String index() {
		return "index.jsp";
	}
}
