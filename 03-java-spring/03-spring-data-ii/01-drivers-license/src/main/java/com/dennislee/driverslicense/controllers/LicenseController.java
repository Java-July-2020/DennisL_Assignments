package com.dennislee.driverslicense.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LicenseController {

	@RequestMapping("/licenses/new")
	public String newLicense() {
		return "newLicense.jsp";
	}
}
