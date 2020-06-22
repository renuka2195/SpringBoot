package com.renuka.springbootfirst.api;

import org.springframework.web.bind.annotation.RestController;

import com.renuka.springbootfirst.model.PersonModel;
import com.renuka.springbootfirst.service.PersonService;

@RestController
public class PersonController {

	public final PersonService personService;

	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}
	
	public void addPerson(PersonModel person) {
		personService.addPerson(person);
	}
	
	
}
