package com.elearning.webapp.service.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.elearning.webapp.Departement;
import com.elearning.webapp.service.dao.DepartementServiceDAO;

public class DepartementServiceDAOImpl implements DepartementServiceDAO {
	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {

		this.hibernateTemplate = new HibernateTemplate(sessionFactory);

	}

	public void saveDepartement(Departement departement) {
		hibernateTemplate.save(departement);

	}

	public List<Departement> getAllDepartements() {
		// TODO Auto-generated method stub
		return null;
	}

	public Departement getDepartement(int departementId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeDepartement(Departement Departement) {
		// TODO Auto-generated method stub

	}
}
