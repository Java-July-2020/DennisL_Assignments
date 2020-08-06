package com.dennislee.driverslicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dennislee.driverslicense.models.License;
import com.dennislee.driverslicense.models.Person;
import com.dennislee.driverslicense.services.LicenseService;
import com.dennislee.driverslicense.services.PersonService;

@Controller
public class LicenseController {
	
	private LicenseService lService;
	private PersonService pService;
	
	public LicenseController(LicenseService service, PersonService pService) {
		this.lService = service;
		this.pService = pService;
	}

	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute("license") License license, Model model) {
		List<Person> person = this.pService.allPersons();
		model.addAttribute("persons", person);
		return "newLicense.jsp";
	}
	
	 @RequestMapping("/licenses") 
	 public String index(Model model) { 
		 List<License> license = lService.allLicense(); 
		 model.addAttribute("license", license); 
		 return "License.jsp"; 
	 }
	 
  @RequestMapping(value="/licenses", method=RequestMethod.POST)
  public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
      if (result.hasErrors()) {
          return "newLicense.jsp";
      } else {
          lService.createLicense(license);
          return "redirect:/licenses";
      }
  }
}
