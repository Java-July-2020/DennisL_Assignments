package com.dennislee.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCodeController {

	@RequestMapping()
	public String index(@ModelAttribute("errors") String errors, Model model) {
		if (errors.isEmpty()) {
//			System.out.println("Error is empty");
			return "index.jsp";
		}
		else {
//			System.out.println("Errors is here!");
			model.addAttribute("errors", errors);
			return "index.jsp";
		}
	}
	
	@RequestMapping(path="/code", method=RequestMethod.POST)
	public String code(@RequestParam("code") String value, RedirectAttributes redirectAttributes) {
//		System.out.println(value);
		if (value.equals("bushido")) {
//			System.out.println("Correct!");
			return "code.jsp";
		}
		else {
//			System.out.println("Not Correct!");
			redirectAttributes.addFlashAttribute("errors", "You must train harder!");
			return "redirect:/";
		}
	}
}
