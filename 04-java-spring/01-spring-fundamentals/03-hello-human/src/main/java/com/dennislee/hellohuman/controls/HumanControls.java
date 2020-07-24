package com.dennislee.hellohuman.controls;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HumanControls {

//    @RequestMapping("/")
//    public String index(Model model) {
//    	model.addAttribute("userName", "Human");
//        return "index.jsp";
//    }
    
    @RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String uname, @RequestParam(value="last_name", required=false) String lname, Model model) {
    	if (uname != null && lname != null) {
    		model.addAttribute("userName", uname);
    		model.addAttribute("lastName", lname);
    	}
    	else if (uname != null && lname == null) {
    		model.addAttribute("userName", uname);
    	}
    	else if (uname == null && lname != null) {
    		model.addAttribute("lastName", lname);
    	}
    	else {
    		model.addAttribute("userName", "Human");
    	}
    	
        return "index.jsp";
    }
}
