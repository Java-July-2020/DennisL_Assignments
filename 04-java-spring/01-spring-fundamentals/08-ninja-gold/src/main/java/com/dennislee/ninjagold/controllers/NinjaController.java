package com.dennislee.ninjagold.controllers;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dennislee.ninjagold.models.Building;

@Controller
public class NinjaController {

	@RequestMapping("/Gold")
	public String gold(HttpSession session, Model model) {
		if(session.getAttribute("totalGold") == null) {
			session.setAttribute("totalGold", 0);
		}
		
		Building farm = new Building("farm", 10, 20, false);
		Building cave = new Building("cave", 5, 10, false);
		Building house = new Building("house", 2, 5, false);
		Building casino = new Building("casino", 0, 50, true);
		
		Building[] myBuildings = new Building[] {farm, cave, house, casino};
		
//		for(Building build: myBuildings) {
//			System.out.println(build.getName());
//		}
		model.addAttribute("myBuildings", myBuildings);
		model.addAttribute("totalGold", session.getAttribute("totalGold"));
		return "index.jsp";
	}
	
	@RequestMapping(path="/getGold", method=RequestMethod.POST)
	public String getGold(@RequestParam(value="building") String value, HttpSession session) {
		Random r = new Random();
		int gold = (int)session.getAttribute("totalGold");
		int goldThisTurn = 0;
		if (value.equals("farm")) {
			goldThisTurn = r.nextInt(20 - 10) + 10;
		}
		else if (value.equals("cave")) {
			goldThisTurn = r.nextInt(10 - 5) + 5;
		}
		else if (value.equals("house")) {
			goldThisTurn = r.nextInt(5 - 2) + 2;
		}
		else if (value.equals("casino")) {
			goldThisTurn = r.nextInt(50 - 1) + 1;
			if(r.nextBoolean()) {
				goldThisTurn = goldThisTurn * -1;
			}
		}
		session.setAttribute("totalGold", gold+=goldThisTurn);
		return "redirect:/Gold";
	}
}
