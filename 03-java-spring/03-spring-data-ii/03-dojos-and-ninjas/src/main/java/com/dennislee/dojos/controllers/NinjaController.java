package com.dennislee.dojos.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dennislee.dojos.models.Ninja;
import com.dennislee.dojos.services.DojoService;
import com.dennislee.dojos.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	
	@Autowired
	private DojoService dService;
	
	@Autowired
	private NinjaService nService;

	@RequestMapping("/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", this.dService.listAllDojo());
		return "newNinja.jsp";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("dojos", this.dService.listAllDojo());
			return "newNinja.jsp";
		}
		else {
			this.nService.createNinja(ninja);
			return "redirect:/ninjas/new";
		}
	}
}
