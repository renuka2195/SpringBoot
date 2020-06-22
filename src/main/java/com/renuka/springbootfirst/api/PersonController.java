package com.renuka.springbootfirst.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renuka.springbootfirst.model.PersonModel;
import com.renuka.springbootfirst.service.PersonService;


@RequestMapping("api/v1/person")
@RestController
public class PersonController {

	public final PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@PostMapping
	public void addPerson(@RequestBody PersonModel person) {
		personService.addPerson(person);
	}
	
	@GetMapping
	public List<PersonModel> getAllPerson(){
		return personService.getALlAPerson();	
	}
	
	
}
