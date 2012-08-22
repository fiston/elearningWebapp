package com.elearning.webapp.service.impl;

import java.util.List;

import com.elearning.webapp.Departement;
import com.elearning.webapp.service.DepartementService;
import com.elearning.webapp.service.dao.DepartementServiceDAO;

public class DepartementServiceImpl implements DepartementService {
	protected DepartementServiceDAO DepartementServiceDao;

	public void saveDepartement(Departement Departement) {
		DepartementServiceDao.saveDepartement(Departement);

	}

	public List<Departement> getAllDepartements() {
		// TODO Auto-generated method stub
		return DepartementServiceDao.getAllDepartements();
	}

	public Departement getDepartement(int DepartementId) {
		// TODO Auto-generated method stub
		return DepartementServiceDao.getDepartement(DepartementId);
	}

	public void removeDepartement(Departement Departement) {
		DepartementServiceDao.removeDepartement(Departement);

	}
}
