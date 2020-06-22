package com.renuka.springbootfirst.dao;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.renuka.springbootfirst.model.PersonModel;


@Repository("fakeDao")
public class PersonDaoService implements PersonDao{
	
	public  List<PersonModel> db = new ArrayList<PersonModel>();



	@Override
	public int insertPerson(int id,PersonModel  person) {
		db.add(new PersonModel(id,person.getName()));
		return 1;
	}
}
