package com.renuka.springbootfirst.model;


public class PersonModel {

	private final int id;
	private final String name;
	
	public PersonModel(int id, String name) {
		 this.id=id;
		 this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
 