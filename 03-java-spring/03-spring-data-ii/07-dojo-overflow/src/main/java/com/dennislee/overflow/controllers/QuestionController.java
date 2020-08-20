package com.dennislee.overflow.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dennislee.overflow.models.Answer;
import com.dennislee.overflow.models.NewQuestion;
import com.dennislee.overflow.models.Question;
import com.dennislee.overflow.models.Tag;
import com.dennislee.overflow.services.AnswerService;
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
	private AnswerService aService;
	
	@Autowired
	private QuestionValidator validator;
	
	@RequestMapping("")
	public String questions(Model viewModel) {
		List<Question> questions = this.qService.getAllQuestions();
		viewModel.addAttribute("questions", questions);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/new")
	public String newQuestion(@ModelAttribute("questions") NewQuestion newQuestion) {
		return "newQuestion.jsp";
	}
	
	@GetMapping("/{id}")
	public String Show(@PathVariable("id") Long id, @ModelAttribute("answers") Answer answer, Model model) {
		model.addAttribute("question", this.qService.getQuestion(id));
		return "show.jsp";
	}
	
	@PostMapping("/add")
	public String addQuestion(@Valid @ModelAttribute("questions") NewQuestion newQuestion, BindingResult result) {
		if(result.hasErrors()) {
			return "newQuestion.jsp";
		}
		
		this.qService.createQuestion(newQuestion);
		return "redirect:/questions";
	}
	
	@PostMapping("/answers")
	public String CreateAnswer(@Valid @ModelAttribute("answers") Answer answer, BindingResult result) {
		if(result.hasErrors())
			return "show.jsp";
		Answer newAnswer = this.aService.createAnswer(answer);
		return "redirect:/questions/" + newAnswer.getQuestion().getId();
	}
}
