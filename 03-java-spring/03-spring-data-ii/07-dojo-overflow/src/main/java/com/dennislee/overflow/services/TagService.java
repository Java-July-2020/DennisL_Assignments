package com.dennislee.overflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dennislee.overflow.models.Tag;
import com.dennislee.overflow.repositories.QuestionRepository;
import com.dennislee.overflow.repositories.TagRepository;

@Service
public class TagService {

	@Autowired
	private TagRepository tRepo;
	
	@Autowired
	private QuestionRepository qRepo;
	
	public Tag getTag(Long id) {
		Tag tag = this.tRepo.findById(id).orElse(null);
		return tag;
	}
	
	public List<Tag> getAllTags(){
		return this.tRepo.findAll();
	}
	
	public Tag addTag(Tag tag) {
		return this.tRepo.save(tag);
	}
}
