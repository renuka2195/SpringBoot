package com.renuka.springbootfirst.service;

import com.renuka.springbootfirst.dao.PersonDao;
import com.renuka.springbootfirst.model.PersonModel;

public class PersonService {
	
	private final PersonDao persondao;

	public PersonService(PersonDao persondao) {
		this.persondao = persondao;
	}
	
	public int addPerson(PersonModel person) {
		return persondao.insertPerson(person);
	}
	
	
	
	
	
	
}
