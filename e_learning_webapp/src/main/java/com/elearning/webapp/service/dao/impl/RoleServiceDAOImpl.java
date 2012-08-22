package com.elearning.webapp.service.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.elearning.webapp.Role;
import com.elearning.webapp.service.dao.RoleServiceDAO;

public class RoleServiceDAOImpl implements RoleServiceDAO {
	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {

		this.hibernateTemplate = new HibernateTemplate(sessionFactory);

	}

	public void saveRole(Role role) {
		hibernateTemplate.save(role);

	}

	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	public Role getRole(int roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeRole(Role role) {
		// TODO Auto-generated method stub

	}
}
