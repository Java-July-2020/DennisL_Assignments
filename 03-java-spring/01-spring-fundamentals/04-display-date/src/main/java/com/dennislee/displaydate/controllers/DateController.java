package com.dennislee.displaydate.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

@Controller
public class DateController {

	@RequestMapping()
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		DateFormat month = new SimpleDateFormat("MMMM");
		DateFormat day = new SimpleDateFormat("dd");
		DateFormat dayOfWeek = new SimpleDateFormat("EEEE");
		DateFormat year = new SimpleDateFormat("yyyy");
		String monthFT = month.format(date).toString();
		String dayFT = day.format(date).toString();
		String dayOfWeekFT = dayOfWeek.format(date).toString();
		String yearFT = year.format(date).toString();
		String returnString = dayOfWeekFT + ", the " + dayFT + " of " + monthFT + ", " + yearFT;
		model.addAttribute("dateDate", returnString);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date time = new Date();
		DateFormat dtf = new SimpleDateFormat("hh:mm aa");
		String timeFT = (dtf.format(time)).toString();
		model.addAttribute("timeTime", timeFT);
		return "time.jsp";
	}
}
