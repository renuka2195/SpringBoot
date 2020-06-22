package com.renuka.springbootfirst.dao;

import com.renuka.springbootfirst.model.PersonModel;

public interface PersonDao {
 
	 int insertPerson(int id, PersonModel Name);
	 
	 //UUID : immutable Universally Unique Identifier (UUID). => Id generator
	 
	 default int insertPerson(PersonModel Name) {
		 int id = (int) Math.random();
		 return insertPerson(id,Name); 
	 }
	 
	 
}
