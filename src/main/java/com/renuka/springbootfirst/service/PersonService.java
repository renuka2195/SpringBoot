package com.renuka.springbootfirst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.renuka.springbootfirst.dao.PersonDao;
import com.renuka.springbootfirst.model.PersonModel;


@Service
public class PersonService {
	
	private final PersonDao persondao;

	@Autowired
	public PersonService(@Qualifier("fakeDao") PersonDao persondao) {
		this.persondao = persondao;
	}
	
	public int addPerson(PersonModel person) {
		return persondao.insertPerson(person);
	}
	
	
	
	
	
	
}
