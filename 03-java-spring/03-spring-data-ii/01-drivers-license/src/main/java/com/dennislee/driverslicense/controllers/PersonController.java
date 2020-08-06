package com.dennislee.driverslicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dennislee.driverslicense.models.Person;
import com.dennislee.driverslicense.services.PersonService;

@Controller
public class PersonController {
	
	private final PersonService pService;
	
	public PersonController(PersonService service) {
		this.pService = service;
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
}
