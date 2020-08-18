package com.dennislee.overflow.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.dennislee.overflow.models.Question;
import com.dennislee.overflow.repositories.QuestionRepository;

@Component
public class QuestionValidator {

	@Autowired
	private QuestionRepository qRepo;
	
	public boolean supports(Class<?> clazz) {
		return Question.class.equals(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		Question question = (Question) target;
		
		//if(!user.getPassword().equals(user.getConfirmPassword())) {
		//	errors.rejectValue("password", "Match", "Passwords do not match!");
		//}
		
		// Make sure email is unique in the DB
		if(this.qRepo.existsByQuestion(question.getQuestion())) {
			errors.rejectValue("question", "Unique", "Question already exist!");
		}
		
		// Additional validator example
		//if(user.getFirstName().equals("Matt")) {
		//	errors.rejectValue("firstName", "NoMattsAllowed", "Sorry, were full on matts now. Try again later!");
		//}

	}
	
}
