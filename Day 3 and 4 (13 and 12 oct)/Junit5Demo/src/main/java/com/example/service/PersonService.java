package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Person;
import com.example.repository.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo personRepo;
	
	public List<Person> getAllPerson(){
		return this.personRepo.findAll();
	}

	public PersonService(PersonRepo personRepo) {
		super();
		this.personRepo = personRepo;
	}

	

}
