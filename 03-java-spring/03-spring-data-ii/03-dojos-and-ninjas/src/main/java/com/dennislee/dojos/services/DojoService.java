package com.dennislee.dojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dennislee.dojos.models.Dojo;
import com.dennislee.dojos.repositories.DojoRepository;
import com.dennislee.dojos.repositories.NinjaRepository;

@Service
public class DojoService {

	@Autowired
	private DojoRepository dRepo;
	
	@Autowired
	private NinjaRepository nRepo;
	
	public Dojo getDojo(Long id) {
		Dojo set = this.dRepo.findById(id).orElse(null);
		return set;
	}
	
	public List<Dojo> listAllDojo(){
		return this.dRepo.findAll();
	}
	
	public Dojo createDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	public void deleteDojo(Long id) {
		this.dRepo.deleteById(id);
	}
	
	public Dojo updateDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
}
