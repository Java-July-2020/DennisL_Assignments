package com.dennislee.dojos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dennislee.dojos.models.Dojo;
import com.dennislee.dojos.models.Ninja;
import com.dennislee.dojos.services.DojoService;
import com.dennislee.dojos.services.NinjaService;

@Controller
@RequestMapping("/dojos")
public class DojoController {
	
	@Autowired
	private DojoService dService;
	
	@Autowired
	private NinjaService nService;

	@RequestMapping("/new")
	public String dojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "newDojo.jsp";
		}
		else {
			this.dService.createDojo(dojo);
			return "newDojo.jsp";
		}
	}
	
	@RequestMapping("/{id}")
	public String viewPet(@PathVariable("id") Long id, Model model, @ModelAttribute("ninjas") Ninja Ninja) {
		List<Ninja> ninjas = this.nService.listAllNinja();
		model.addAttribute("ninjas", ninjas);
		Dojo dojo = this.dService.getDojo(id);
		model.addAttribute("dojo", dojo);
		return "showDojo.jsp";
	}
	
}
