package com.dennislee.overflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dennislee.overflow.models.Answer;
import com.dennislee.overflow.models.NewQuestion;
import com.dennislee.overflow.models.Question;
import com.dennislee.overflow.models.Tag;
import com.dennislee.overflow.repositories.AnswerRepository;
import com.dennislee.overflow.repositories.QuestionRepository;
import com.dennislee.overflow.repositories.TagRepository;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository qRepo;
	
	@Autowired
	private TagRepository tRepo;
	
	public Question getQuestion(Long id) {
		Question question = this.qRepo.findById(id).orElse(null);
		return question;
	}
	
	public List<Question> getAllQuestions(){
		return this.qRepo.findAll();
	}
	
	public void createQuestion(NewQuestion question) {
		// TODO: make a real question here
		List<Tag> questionsTags = new ArrayList<Tag>();
		for(String subject: question.splitTags()) {
			Tag tag = this.tRepo.findBySubject(subject).orElse(null);
			if(tag == null) {
				tag = new Tag(subject);
				this.tRepo.save(tag);
			}
			// prevent duplicate tags
			if(!questionsTags.contains(tag))
				questionsTags.add(tag);
		}
		Question newQuestion = new Question(question.getQuestion(), questionsTags);
		this.qRepo.save(newQuestion);
	}
	
	public void deleteQuestion(Long id) {
		this.qRepo.deleteById(id);
	}
	
	public Question updateQuestion(Question question) {
		return this.qRepo.save(question);
	}
	
	//Add Tag to Question
	public void addTags(Tag tag,  Question question) {
		// get all the current tags from the question
		List<Tag> tags = question.getTags();
		
		// Add the like
		tags.add(tag);
		
		// Update Database
		this.qRepo.save(question);
	}
	
	//Add Answer to Question
	public void addAnswer(Answer answer,  Question question) {
		// get all the current answers from the question
		List<Answer> answers = question.getAnswers();
		
		// Add the like
		answers.add(answer);
		
		// Update Database
		this.qRepo.save(question);
	}
	
}
