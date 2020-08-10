package com.dennislee.dojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dennislee.dojos.models.Ninja;
import com.dennislee.dojos.repositories.DojoRepository;
import com.dennislee.dojos.repositories.NinjaRepository;

@Service
public class NinjaService {

	@Autowired
	private NinjaRepository nRepo;
	
	@Autowired
	private DojoRepository dRepo;
	
	public Ninja getNinja(Long id) {
		Ninja set = this.nRepo.findById(id).orElse(null);
		return set;
	}
	
	public List<Ninja> listAllNinja(){
		return this.nRepo.findAll();
	}
	
	public Ninja createNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
	
	public void deleteNinja(Long id) {
		this.nRepo.deleteById(id);
	}
	
	public Ninja updateNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
	
}
