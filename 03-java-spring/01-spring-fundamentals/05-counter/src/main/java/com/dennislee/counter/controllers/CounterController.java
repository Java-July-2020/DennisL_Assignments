package com.dennislee.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {

	@RequestMapping()
    public String index(HttpSession session){
        if(session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
            count(session);
        }
        else {
        	count(session);
        }
        System.out.println("Session count is:" + session.getAttribute("count"));
        return "index.jsp";
    }
	
    public void count(HttpSession session){
        Integer currentCount = (Integer) session.getAttribute("count");
        currentCount++;
        session.setAttribute("count", currentCount);
//        return session.getAttribute("count").toString();
    }
    
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
        if(session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
        }
        
		String count = session.getAttribute("count").toString();
		model.addAttribute("counts", count);
		return "counter.jsp";
	}
}
