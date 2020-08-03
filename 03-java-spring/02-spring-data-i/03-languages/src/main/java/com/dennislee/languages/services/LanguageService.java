package com.dennislee.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dennislee.languages.models.Language;
import com.dennislee.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	private LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository repository) {
		this.lRepo = repository;
	}

	public Language getLanguage(Long id) {
		Language set = this.lRepo.findById(id).orElse(null);
		return set;
	}
	
	public List<Language> getAllLanguage(){
		return lRepo.findAll();
	}
	
	public Language createLanguage(Language newLanguage) {
		return this.lRepo.save(newLanguage);
	}

	public Language createLanguage(String name, String creator, double version) {
		Language newLanguage = new Language(name, creator, version);
		return this.lRepo.save(newLanguage);
	}
	
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
	
	public Language updateLanguage(Long id, Language updateLanguage) {
		return this.lRepo.save(updateLanguage);
	}
	
}
