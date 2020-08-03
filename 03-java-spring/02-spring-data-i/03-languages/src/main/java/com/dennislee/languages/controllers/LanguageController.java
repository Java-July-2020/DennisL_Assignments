package com.dennislee.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dennislee.languages.models.Language;
import com.dennislee.languages.services.LanguageService;

@Controller
public class LanguageController {
	
	private LanguageService lService;
	
	public LanguageController(LanguageService service) {
		this.lService = service;
	}
	
	@RequestMapping("/languages")
	public String index(Model viewModel) {
		List<Language> languages = this.lService.getAllLanguage();
		viewModel.addAttribute("languages", languages);
		return "index.jsp";
	}
	
//	The new way of error and input validation using Models - JSTL
	@RequestMapping("/languages/new")
	public String create(@ModelAttribute("language") Language language) {
		return "new.jsp";
	}
	
	// The new way of error and input validation using Models - JSTL
	@RequestMapping(value="/languages", method=RequestMethod.POST)
	public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()) {
			// Invalid input was received
			return "new.jsp";
		}
		else {
			// everything is all good, we can create the pet class
			this.lService.createLanguage(language);
		}
		return "redirect:/languages";
	}
	
	   @RequestMapping(value="/languages/delete/{id}")
	   public String deleteBook(@PathVariable("id") Long id) {
	       lService.deleteLanguage(id);
	       return "redirect:/languages";
	   }
	   
	   @RequestMapping("/languages/{index}")
	   public String findLanguageByIndex(Model model, @PathVariable("index") Long index) {
	       Language newLanguage = lService.getLanguage(index);
	       model.addAttribute("language", newLanguage);
	       return "showLanguage.jsp";
	   }
	   
	   @RequestMapping("/languages/edit/{id}")
	   public String editLanguage(@PathVariable("id") Long id, Model model) {
	       Language updateLanguage = lService.getLanguage(id);
	       if (updateLanguage != null){
	           model.addAttribute("language", updateLanguage);
	           return "/editLanguage.jsp";
	       }else{
	           return "redirect:/languages";
	       }
	   }
	   
	   @PostMapping("/languages/edit/{id}")
	   public String updateLanguage(@PathVariable("id") Long id, @Valid @ModelAttribute("language") Language language, BindingResult result) {
	       if (result.hasErrors()) {
	           return "/editLanguage.jsp";
	       }
	       else{
	           lService.updateLanguage(id, language);
	           return "redirect:/languages";
	       }
	   }

}
