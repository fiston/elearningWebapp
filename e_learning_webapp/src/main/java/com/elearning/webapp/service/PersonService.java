package com.elearning.webapp.service;

import java.util.List;

import com.elearning.webapp.Person;

public interface PersonService {
	public void savePerson(Person person);

	public List<Person> getAllPersons();

	public Person getPerson(int PersonId);
	
	public void removePerson(Person person);

}
