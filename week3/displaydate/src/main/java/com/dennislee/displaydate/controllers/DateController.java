package com.dennislee.displaydate.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class DateController {

	@RequestMapping()
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date() {
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time() {
		return "time.jsp";
	}
}
