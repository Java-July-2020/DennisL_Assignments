package com.dennislee.loginreg.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dennislee.loginreg.models.User;
import com.dennislee.loginreg.services.UserService;

@Controller
public class UserController {

	@Autowired
    private UserService userService;
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registration.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        // if result has errors, return the registration page (don't worry about validations just now)
    	if (result.hasErrors()) {
    		return "registration.jsp";
    	}
        // else, save the user in the database, save the user id in session, and redirect them to the /home route
    	else {
    		User newUser = this.userService.registerUser(user);
    		Long userId = newUser.getId();
    		session.setAttribute("user_id", userId);
    		return "redirect:/home";
    	}
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        // if the user is authenticated, save their user id in session
    	boolean authenticated = this.userService.authenticateUser(email, password);
    	
        // else, add error messages and return the login page
    	if(authenticated) {
    		User newUser = this.userService.findByEmail(email);
    		Long userId = newUser.getId();
    		session.setAttribute("user_id", userId);
    		return "redirect:/home";
    	}
    	else {
    		model.addAttribute("error", "Invalid Credentials. Please try again.");
    		return "registration.jsp";
    	}
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        // get user from session, save them in the model and return the home page
    	Long userId = (Long) session.getAttribute("user_id");
    	User user = this.userService.findAUser(userId);
    	model.addAttribute("user", user);
    	return "homePage.jsp";
    }
    
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
    	session.invalidate();
    	
        // redirect to login page
    	return "redirect:/login";
    }
}
