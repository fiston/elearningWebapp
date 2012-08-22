package com.elearning.webapp.service.dao;

import java.util.List;

import com.elearning.webapp.Person;

public interface PersonServiceDAO {
	public void savePerson(Person person);

	public List<Person> getAllPersons();

	public Person getPerson(int PersonId);

	public void removePerson(Person person);

}
