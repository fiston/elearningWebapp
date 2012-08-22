package com.elearning.webapp.service.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.elearning.webapp.Material;
import com.elearning.webapp.service.dao.MaterialServiceDAO;

public class MaterialServiceDAOImpl implements MaterialServiceDAO {
	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {

		this.hibernateTemplate = new HibernateTemplate(sessionFactory);

	}

	public void saveMaterial(Material material) {
		hibernateTemplate.save(material);

	}

	public List<Material> getAllMaterials() {
		// TODO Auto-generated method stub
		return null;
	}

	public Material getMaterial(int materialId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeMaterial(Material Material) {
		// TODO Auto-generated method stub

	}
}
