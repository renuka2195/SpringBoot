package com.renuka.springbootfirst.dao;



import java.util.ArrayList;
import java.util.List;
import com.renuka.springbootfirst.model.PersonModel;

public class PersonDaoService implements PersonDao{
	
	public  List<PersonModel> db = new ArrayList<PersonModel>();



	@Override
	public int insertPerson(int id,PersonModel  person) {
		// TODO Auto-generated method stub
		db.add(new PersonModel(id,person.getName()));
		return 1;
	}
}
