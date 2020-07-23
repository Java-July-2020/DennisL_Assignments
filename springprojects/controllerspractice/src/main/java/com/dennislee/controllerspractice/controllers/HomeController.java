package com.dennislee.controllerspractice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

//@RestController
//@RequestMapping("/hello")
@Controller
public class HomeController {

//		@RequestMapping("")
//		public String hello() {
//			return "Hello World, everyone!";
//		}
//		
//		@RequestMapping("world")
//		public String world() {
//			return "Class level annotations are cool too!";
//		}

//	    @RequestMapping("/")
//	    public String index() {
//	        return "index.jsp";
//	    }
	
//	    @RequestMapping("/")
//	    public String index(@RequestParam(value="q") String searchQuery) {
//	    	System.out.println(searchQuery);
//	        return "index.jsp";
//	    }
	    
		@RequestMapping("/")
	    public String index(@RequestParam(value="q", required=false) String searchQuery, Model model) {
	    	model.addAttribute("search", searchQuery);
	        return "index.jsp";
	    }
		
//		@RequestMapping("/users/{name}")
//	    public String showName(@PathVariable("name") String userName) {
//	    	System.out.println(userName);
//	        return "index.jsp";
//	    }
		
		@RequestMapping("/users/{name}")
	    public String showName(@PathVariable("name") String userName, Model model) {
			model.addAttribute("userName", userName);
	        return "index.jsp";
	    }
}
