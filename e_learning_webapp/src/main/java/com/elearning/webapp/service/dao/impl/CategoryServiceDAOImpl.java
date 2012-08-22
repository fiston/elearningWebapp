package com.elearning.webapp.service.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.elearning.webapp.Category;
import com.elearning.webapp.service.dao.CategoryServiceDAO;

public class CategoryServiceDAOImpl implements CategoryServiceDAO {
	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {

		this.hibernateTemplate = new HibernateTemplate(sessionFactory);

	}

	public void saveCategory(Category category) {
		hibernateTemplate.save(category);

	}

	public List<Category> getAllCategorys() {
		// TODO Auto-generated method stub
		return null;
	}

	public Category getCategory(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeCategory(Category Category) {
		// TODO Auto-generated method stub

	}

}
