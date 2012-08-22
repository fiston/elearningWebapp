package com.elearning.webapp.service.dao;

import java.util.List;

import com.elearning.webapp.Departement;

public interface DepartementServiceDAO {
	public void saveDepartement(Departement Departement);

	public List<Departement> getAllDepartements();

	public Departement getDepartement(int departementId);
	
	public void removeDepartement(Departement Departement);

}
