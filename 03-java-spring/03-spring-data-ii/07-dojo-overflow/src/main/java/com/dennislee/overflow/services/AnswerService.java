package com.dennislee.overflow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dennislee.overflow.models.Answer;
import com.dennislee.overflow.repositories.AnswerRepository;

@Service
public class AnswerService {

	@Autowired
	private AnswerRepository aRepo;
	
	public Answer createAnswer(Answer answer) {
		return this.aRepo.save(answer);
	}
}
