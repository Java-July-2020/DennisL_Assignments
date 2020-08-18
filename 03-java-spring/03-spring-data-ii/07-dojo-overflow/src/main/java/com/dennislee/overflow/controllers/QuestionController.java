package com.dennislee.overflow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dennislee.overflow.models.Question;
import com.dennislee.overflow.models.Tag;
import com.dennislee.overflow.repositories.AnswerRepository;
import com.dennislee.overflow.repositories.QuestionRepository;
import com.dennislee.overflow.repositories.TagRepository;

@Controller
@RequestMapping("questions")
public class QuestionController {

	@Autowired
	private QuestionRepository qRepo;
	
	@Autowired
	private AnswerRepository aRepo;
	
	@Autowired
	private TagRepository tRepo;
	
	@RequestMapping("")
	public String questions(Model viewModel) {
		List<Question> questions = this.qRepo.findAll();
		List<Tag> tags = this.tRepo.findAll();
		viewModel.addAttribute("questions", questions);
		viewModel.addAttribute("tags", tags);
		return "dashboard.jsp";
	}
}
