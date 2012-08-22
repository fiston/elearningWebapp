package com.elearning.webapp.service.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.elearning.webapp.Users;
import com.elearning.webapp.service.dao.UsersServiceDAO;

public class UsersServiceDAOImpl implements UsersServiceDAO {

	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {

		this.hibernateTemplate = new HibernateTemplate(sessionFactory);

	}

	public void saveUsers(Users users) {
		hibernateTemplate.save(users);

	}

	public List<Users> getAllUserss() {
		// TODO Auto-generated method stub
		return null;
	}

	public Users getUsers(int usersId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeUsers(Users users) {
		// TODO Auto-generated method stub

	}

}
