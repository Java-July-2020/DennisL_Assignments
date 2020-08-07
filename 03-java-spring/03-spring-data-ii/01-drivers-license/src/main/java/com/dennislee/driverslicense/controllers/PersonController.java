package com.dennislee.driverslicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dennislee.driverslicense.models.Person;
import com.dennislee.driverslicense.services.LicenseService;
import com.dennislee.driverslicense.services.PersonService;

@Controller
public class PersonController {
	
	private final PersonService pService;
	private final LicenseService lService;
	
	public PersonController(PersonService service, LicenseService lService) {
		this.pService = service;
		this.lService = lService;
	}

	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "newPerson.jsp";
	}
	
	 @RequestMapping("/persons") 
	 public String index(Model model) { 
		 List<Person> person = pService.allPersons(); 
		 model.addAttribute("persons", person); 
		 return "Person.jsp"; 
	 }
	 
  @RequestMapping(value="/persons", method=RequestMethod.POST)
  public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
      if (result.hasErrors()) {
          return "newPerson.jsp";
      } else {
          pService.createPerson(person);
          return "redirect:/persons";
      }
  }
  
	@RequestMapping("persons/{id}")
	public String viewPerson(@PathVariable("id") Long id, Model model) {
		Person person = pService.getOnePerson(id);
		model.addAttribute("person", person);
		return "show.jsp";
	}
}
