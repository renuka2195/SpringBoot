package com.renuka.springbootfirst.dao;

import java.util.List;
import java.util.UUID;

import com.renuka.springbootfirst.model.PersonModel;

public interface PersonDao {
 
	 int insertPerson(UUID id, PersonModel Name);
	 
	 //UUID : immutable Universally Unique Identifier (UUID). => Id generator
	 
	 default int insertPerson(PersonModel Name) {
		 UUID id =  UUID.randomUUID();
		 return insertPerson(id,Name); 
	 }
	 
	 List<PersonModel> seletAllPerson();
	 
	 
}
