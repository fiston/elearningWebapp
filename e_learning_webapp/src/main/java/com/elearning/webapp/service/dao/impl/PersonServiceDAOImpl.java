package com.elearning.webapp.service.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.elearning.webapp.Person;
import com.elearning.webapp.service.dao.PersonServiceDAO;

public class PersonServiceDAOImpl implements PersonServiceDAO {
	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {

		this.hibernateTemplate = new HibernateTemplate(sessionFactory);

	}

	public void savePerson(Person person) {
		hibernateTemplate.save(person);

	}

	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	public Person getPerson(int PersonId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removePerson(Person person) {
		// TODO Auto-generated method stub

	}

}
