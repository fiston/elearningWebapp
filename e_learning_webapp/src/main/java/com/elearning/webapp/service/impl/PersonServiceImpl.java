package com.elearning.webapp.service.impl;

import java.util.List;

import com.elearning.webapp.Person;
import com.elearning.webapp.service.PersonService;
import com.elearning.webapp.service.dao.PersonServiceDAO;

public class PersonServiceImpl implements PersonService {
	protected PersonServiceDAO PersonServiceDao;

	public void savePerson(Person person) {
		PersonServiceDao.savePerson(person);

	}

	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return PersonServiceDao.getAllPersons();
	}

	public Person getPerson(int PersonId) {
		// TODO Auto-generated method stub
		return PersonServiceDao.getPerson(PersonId);
	}

	public void removePerson(Person person) {
		PersonServiceDao.removePerson(person);

	}

}
