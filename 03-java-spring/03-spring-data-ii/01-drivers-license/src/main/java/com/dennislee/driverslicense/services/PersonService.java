package com.dennislee.driverslicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dennislee.driverslicense.models.Person;
import com.dennislee.driverslicense.repositories.PersonRepository;

@Service
public class PersonService {

	private final PersonRepository pRepo;
	
	public PersonService(PersonRepository repo) {
		this.pRepo = repo;
	}
	
	 // returns all the person
	 public List<Person> allPersons() {
	     return pRepo.findAll();
	 }
	 
	 // creates a person
	 public Person createPerson(Person person) {
	     return pRepo.save(person);
	 }
}
