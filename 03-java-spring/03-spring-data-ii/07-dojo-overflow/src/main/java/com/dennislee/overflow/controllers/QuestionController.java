package com.dennislee.overflow.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dennislee.overflow.models.Question;
import com.dennislee.overflow.models.Tag;
import com.dennislee.overflow.services.QuestionService;
import com.dennislee.overflow.services.TagService;
import com.dennislee.overflow.validators.QuestionValidator;

@Controller
@RequestMapping("questions")
public class QuestionController {

	@Autowired
	private QuestionService qService;
	
	@Autowired
	private TagService tService;
	
	@Autowired
	private QuestionValidator validator;
	
	@RequestMapping("")
	public String questions(Model viewModel) {
		List<Question> questions = this.qService.getAllQuestions();
		List<Tag> tags = this.tService.getAllTags();
		viewModel.addAttribute("questions", questions);
		viewModel.addAttribute("tags", tags);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/new")
	public String newQuestion(@ModelAttribute("questions") Question question) {
		return "newQuestion.jsp";
	}
	
	@PostMapping("/add")
	public String addQuestion(@Valid @ModelAttribute("questions") Question question, BindingResult result) {
		validator.validate(question, result);
		if (result.hasErrors()) {
			// if there are any validation errors
			// we want to return them to the index page
			return "newQuestion.jsp";
		}
		else {
			Question newQuestion = this.qService.createQuestion(question);
			return "redirect:/questions";
		}
	}
}
