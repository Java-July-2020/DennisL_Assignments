package com.dennislee.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dennislee.lookify.models.Lookify;
import com.dennislee.lookify.services.LookifyService;

@Controller
public class LookifyController {
	
	 private final LookifyService lService;
	 
	 public LookifyController(LookifyService service) {
	     this.lService = service;
	 }

	@RequestMapping()
	public String index() {
		return "index.jsp";
	}
	
	 @RequestMapping("/dashboard") 
	 public String dashBoard(Model model) { 
		 List<Lookify> songs = lService.getAllSong(); model.addAttribute("songs", songs); 
		 return "dashboard.jsp"; 
	 }
	 
	 
	  @RequestMapping("/songs/new")
	  public String newSong(@ModelAttribute("song") Lookify song) {
	      return "new.jsp";
	  }
		 
	  @RequestMapping(value="/dashboard", method=RequestMethod.POST)
	  public String create(@Valid @ModelAttribute("song") Lookify song, BindingResult result) {
	      if (result.hasErrors()) {
	          return "new.jsp";
	      } else {
	          lService.createSong(song);
	          return "redirect:/dashboard";
	      }
	  }
	  
	  @RequestMapping(value="/songs/{id}")
	  public String findSongByIndex(@PathVariable(value="id") Long id, Model model) {
		  Lookify song = lService.getSong(id);
		  model.addAttribute("song", song);
		  return "showSong.jsp";
	  }
	  
	   @RequestMapping(value="/songs/delete/{id}")
	   public String deleteSong(@PathVariable("id") Long id) {
	       lService.deleteSong(id);
	       return "redirect:/dashboard";
	   }
}
