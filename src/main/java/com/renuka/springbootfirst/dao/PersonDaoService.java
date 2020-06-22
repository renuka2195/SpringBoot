package com.renuka.springbootfirst.dao;



import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.renuka.springbootfirst.model.PersonModel;


@Repository("fakeDao")
public class PersonDaoService implements PersonDao{
	
	public  List<PersonModel> db = new ArrayList<PersonModel>();

	@Override
	public int insertPerson(UUID id,PersonModel  person) {
		db.add(new PersonModel(id,person.getName()));
		return 1;
	}

	@Override
	public List<PersonModel> seletAllPerson() {
		return db;
	}
	
	
	
}
